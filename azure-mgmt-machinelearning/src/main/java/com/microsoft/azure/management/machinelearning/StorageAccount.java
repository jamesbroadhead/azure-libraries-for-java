/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearning;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Access information for a storage account.
 */
public class StorageAccount {
    /**
     * Specifies the name of the storage account.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Specifies the key used to access the storage account.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the StorageAccount object itself.
     */
    public StorageAccount withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the key value.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key value.
     *
     * @param key the key value to set
     * @return the StorageAccount object itself.
     */
    public StorageAccount withKey(String key) {
        this.key = key;
        return this;
    }

}
