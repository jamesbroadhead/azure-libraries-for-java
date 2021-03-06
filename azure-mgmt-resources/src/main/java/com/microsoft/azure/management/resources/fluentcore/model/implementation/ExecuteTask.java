/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.model.implementation;

import com.microsoft.azure.management.resources.fluentcore.dag.TaskGroup;
import com.microsoft.azure.management.resources.fluentcore.dag.TaskItem;
import com.microsoft.azure.management.resources.fluentcore.model.Indexable;
import com.microsoft.azure.management.resources.fluentcore.utils.SdkContext;
import rx.Completable;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * A {@link TaskItem} type, when invoked it execute a work using the {@link Executor}
 * it composes.
 *
 * @param <ResultT> the type of the result that this task produces upon execution
 */
public class ExecuteTask<ResultT extends Indexable> implements TaskItem {
    /**
     * the underlying instance that can execute the task.
     */
    private Executor<ResultT> executor;
    /**
     * result of execution.
     */
    private ResultT result;

    /**
     * Creates ExecuteTask.
     *
     * @param executor executor used by this TaskItem to execute the work when invoked.
     */
    public ExecuteTask(Executor<ResultT> executor) {
        this.executor = executor;
    }

    @Override
    public ResultT result() {
        return this.result;
    }

    @Override
    public void beforeGroupInvoke() {
        executor.beforeGroupExecute();
    }

    @Override
    public boolean isHot() {
        return executor.isHot();
    }

    @Override
    public Observable<Indexable> invokeAsync(TaskGroup.InvocationContext context) {
        return this.executor.executeWorkAsync()
                .subscribeOn(SdkContext.getRxScheduler())
                .doOnNext(new Action1<ResultT>() {
                    @Override
                    public void call(ResultT resultT) {
                        result = resultT;
                    }
                }).map(new Func1<ResultT, Indexable>() {
                    @Override
                    public Indexable call(ResultT resourceT) {
                        return resourceT;
                    }
                });
    }

    @Override
    public Completable invokeAfterPostRunAsync(boolean isGroupFaulted) {
        return this.executor.afterPostRunAsync(isGroupFaulted);
    }

    /**
     * Represents a type that know how to execute a work that produces result of type {@link T}.
     * <p>
     * An instance of {@link ExecuteTask} wraps this type and invokes appropriate methods when
     * ExecuteTask methods get called during TaskGroup invocation.
     *
     * @param <T> the type of the produced value.
     */
    public interface Executor<T extends Indexable> {
        /**
         * The method that gets called before invoking all the tasks in the {@link TaskGroup}
         * that the parent {@link ExecuteTask} belongs to.
         */
        void beforeGroupExecute();

        /**
         * @return true if the observable returned by {@link this#executeWorkAsync()} is hot, false if it is
         * cold observable.
         */
        boolean isHot();

        /**
         * Execute the work asynchronously.
         *
         * @return the observable reference
         */
        Observable<T> executeWorkAsync();

        /**
         * Perform any action followed by the processing of work scheduled to be invoked
         * (i.e. "post run") after {@link this#executeWorkAsync()}.
         *
         * @param isGroupFaulted true if one or more tasks in the group this work belongs
         *                       to are in faulted state.
         *
         * @return a completable represents the asynchronous action
         */
        Completable afterPostRunAsync(boolean isGroupFaulted);
    }
}