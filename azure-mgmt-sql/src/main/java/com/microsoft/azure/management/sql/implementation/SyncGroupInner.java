/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.sql.SyncConflictResolutionPolicy;
import com.microsoft.azure.management.sql.SyncGroupState;
import com.microsoft.azure.management.sql.SyncGroupSchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * An Azure SQL Database sync group.
 */
@JsonFlatten
public class SyncGroupInner extends ProxyResourceInner {
    /**
     * Sync interval of the sync group.
     */
    @JsonProperty(value = "properties.interval")
    private Integer interval;

    /**
     * Last sync time of the sync group.
     */
    @JsonProperty(value = "properties.lastSyncTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastSyncTime;

    /**
     * Conflict resolution policy of the sync group. Possible values include:
     * 'HubWin', 'MemberWin'.
     */
    @JsonProperty(value = "properties.conflictResolutionPolicy")
    private SyncConflictResolutionPolicy conflictResolutionPolicy;

    /**
     * ARM resource id of the sync database in the sync group.
     */
    @JsonProperty(value = "properties.syncDatabaseId")
    private String syncDatabaseId;

    /**
     * User name for the sync group hub database credential.
     */
    @JsonProperty(value = "properties.hubDatabaseUserName")
    private String hubDatabaseUserName;

    /**
     * Password for the sync group hub database credential.
     */
    @JsonProperty(value = "properties.hubDatabasePassword")
    private String hubDatabasePassword;

    /**
     * Sync state of the sync group. Possible values include: 'NotReady',
     * 'Error', 'Warning', 'Progressing', 'Good'.
     */
    @JsonProperty(value = "properties.syncState", access = JsonProperty.Access.WRITE_ONLY)
    private SyncGroupState syncState;

    /**
     * Sync schema of the sync group.
     */
    @JsonProperty(value = "properties.schema")
    private SyncGroupSchema schema;

    /**
     * Get the interval value.
     *
     * @return the interval value
     */
    public Integer interval() {
        return this.interval;
    }

    /**
     * Set the interval value.
     *
     * @param interval the interval value to set
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the lastSyncTime value.
     *
     * @return the lastSyncTime value
     */
    public DateTime lastSyncTime() {
        return this.lastSyncTime;
    }

    /**
     * Get the conflictResolutionPolicy value.
     *
     * @return the conflictResolutionPolicy value
     */
    public SyncConflictResolutionPolicy conflictResolutionPolicy() {
        return this.conflictResolutionPolicy;
    }

    /**
     * Set the conflictResolutionPolicy value.
     *
     * @param conflictResolutionPolicy the conflictResolutionPolicy value to set
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withConflictResolutionPolicy(SyncConflictResolutionPolicy conflictResolutionPolicy) {
        this.conflictResolutionPolicy = conflictResolutionPolicy;
        return this;
    }

    /**
     * Get the syncDatabaseId value.
     *
     * @return the syncDatabaseId value
     */
    public String syncDatabaseId() {
        return this.syncDatabaseId;
    }

    /**
     * Set the syncDatabaseId value.
     *
     * @param syncDatabaseId the syncDatabaseId value to set
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withSyncDatabaseId(String syncDatabaseId) {
        this.syncDatabaseId = syncDatabaseId;
        return this;
    }

    /**
     * Get the hubDatabaseUserName value.
     *
     * @return the hubDatabaseUserName value
     */
    public String hubDatabaseUserName() {
        return this.hubDatabaseUserName;
    }

    /**
     * Set the hubDatabaseUserName value.
     *
     * @param hubDatabaseUserName the hubDatabaseUserName value to set
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withHubDatabaseUserName(String hubDatabaseUserName) {
        this.hubDatabaseUserName = hubDatabaseUserName;
        return this;
    }

    /**
     * Get the hubDatabasePassword value.
     *
     * @return the hubDatabasePassword value
     */
    public String hubDatabasePassword() {
        return this.hubDatabasePassword;
    }

    /**
     * Set the hubDatabasePassword value.
     *
     * @param hubDatabasePassword the hubDatabasePassword value to set
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withHubDatabasePassword(String hubDatabasePassword) {
        this.hubDatabasePassword = hubDatabasePassword;
        return this;
    }

    /**
     * Get the syncState value.
     *
     * @return the syncState value
     */
    public SyncGroupState syncState() {
        return this.syncState;
    }

    /**
     * Get the schema value.
     *
     * @return the schema value
     */
    public SyncGroupSchema schema() {
        return this.schema;
    }

    /**
     * Set the schema value.
     *
     * @param schema the schema value to set
     * @return the SyncGroupInner object itself.
     */
    public SyncGroupInner withSchema(SyncGroupSchema schema) {
        this.schema = schema;
        return this;
    }

}
