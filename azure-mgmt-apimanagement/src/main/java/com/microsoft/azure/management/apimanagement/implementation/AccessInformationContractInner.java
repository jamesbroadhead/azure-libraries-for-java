/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tenant access information contract of the API Management service.
 */
public class AccessInformationContractInner {
    /**
     * Identifier.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Primary access key.
     */
    @JsonProperty(value = "primaryKey")
    private String primaryKey;

    /**
     * Secondary access key.
     */
    @JsonProperty(value = "secondaryKey")
    private String secondaryKey;

    /**
     * Tenant access information of the API Management service.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the AccessInformationContractInner object itself.
     */
    public AccessInformationContractInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the primaryKey value.
     *
     * @return the primaryKey value
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the primaryKey value.
     *
     * @param primaryKey the primaryKey value to set
     * @return the AccessInformationContractInner object itself.
     */
    public AccessInformationContractInner withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get the secondaryKey value.
     *
     * @return the secondaryKey value
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Set the secondaryKey value.
     *
     * @param secondaryKey the secondaryKey value to set
     * @return the AccessInformationContractInner object itself.
     */
    public AccessInformationContractInner withSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
        return this;
    }

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the AccessInformationContractInner object itself.
     */
    public AccessInformationContractInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}