/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Database connection string information.
 */
public class ConnStringInfo {
    /**
     * Name of connection string.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Connection string value.
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /**
     * Type of database. Possible values include: 'MySql', 'SQLServer',
     * 'SQLAzure', 'Custom', 'NotificationHub', 'ServiceBus', 'EventHub',
     * 'ApiHub', 'DocDb', 'RedisCache', 'PostgreSQL'.
     */
    @JsonProperty(value = "type")
    private ConnectionStringType type;

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
     * @return the ConnStringInfo object itself.
     */
    public ConnStringInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the connectionString value.
     *
     * @return the connectionString value
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString value.
     *
     * @param connectionString the connectionString value to set
     * @return the ConnStringInfo object itself.
     */
    public ConnStringInfo withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public ConnectionStringType type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the ConnStringInfo object itself.
     */
    public ConnStringInfo withType(ConnectionStringType type) {
        this.type = type;
        return this;
    }

}
