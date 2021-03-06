/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.streamanalytics.implementation.FunctionRetrieveDefaultDefinitionParametersInner;

/**
 * The parameters needed to retrieve the default function definition for an
 * Azure Machine Learning web service function.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "bindingType")
@JsonTypeName("Microsoft.MachineLearning/WebService")
@JsonFlatten
public class AzureMachineLearningWebServiceFunctionRetrieveDefaultDefinitionParameters extends FunctionRetrieveDefaultDefinitionParametersInner {
    /**
     * The Request-Response execute endpoint of the Azure Machine Learning web
     * service. Find out more here:
     * https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-service-rrs.
     */
    @JsonProperty(value = "bindingRetrievalProperties.executeEndpoint")
    private String executeEndpoint;

    /**
     * The function type. Possible values include: 'Scalar'.
     */
    @JsonProperty(value = "bindingRetrievalProperties.udfType")
    private UdfType udfType;

    /**
     * Get the executeEndpoint value.
     *
     * @return the executeEndpoint value
     */
    public String executeEndpoint() {
        return this.executeEndpoint;
    }

    /**
     * Set the executeEndpoint value.
     *
     * @param executeEndpoint the executeEndpoint value to set
     * @return the AzureMachineLearningWebServiceFunctionRetrieveDefaultDefinitionParameters object itself.
     */
    public AzureMachineLearningWebServiceFunctionRetrieveDefaultDefinitionParameters withExecuteEndpoint(String executeEndpoint) {
        this.executeEndpoint = executeEndpoint;
        return this;
    }

    /**
     * Get the udfType value.
     *
     * @return the udfType value
     */
    public UdfType udfType() {
        return this.udfType;
    }

    /**
     * Set the udfType value.
     *
     * @param udfType the udfType value to set
     * @return the AzureMachineLearningWebServiceFunctionRetrieveDefaultDefinitionParameters object itself.
     */
    public AzureMachineLearningWebServiceFunctionRetrieveDefaultDefinitionParameters withUdfType(UdfType udfType) {
        this.udfType = udfType;
        return this;
    }

}
