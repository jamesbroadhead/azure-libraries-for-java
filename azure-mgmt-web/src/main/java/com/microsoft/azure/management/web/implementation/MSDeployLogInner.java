/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web.implementation;

import java.util.List;
import com.microsoft.azure.management.web.MSDeployLogEntry;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.web.ProxyOnlyResource;

/**
 * MSDeploy log.
 */
@JsonFlatten
public class MSDeployLogInner extends ProxyOnlyResource {
    /**
     * List of log entry messages.
     */
    @JsonProperty(value = "properties.entries", access = JsonProperty.Access.WRITE_ONLY)
    private List<MSDeployLogEntry> entries;

    /**
     * Get the entries value.
     *
     * @return the entries value
     */
    public List<MSDeployLogEntry> entries() {
        return this.entries;
    }

}
