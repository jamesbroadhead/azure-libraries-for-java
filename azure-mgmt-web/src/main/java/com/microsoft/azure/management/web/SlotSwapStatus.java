/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The status of the last successfull slot swap operation.
 */
public class SlotSwapStatus {
    /**
     * The time the last successful slot swap completed.
     */
    @JsonProperty(value = "timestampUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timestampUtc;

    /**
     * The source slot of the last swap operation.
     */
    @JsonProperty(value = "sourceSlotName", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceSlotName;

    /**
     * The destination slot of the last swap operation.
     */
    @JsonProperty(value = "destinationSlotName", access = JsonProperty.Access.WRITE_ONLY)
    private String destinationSlotName;

    /**
     * Get the timestampUtc value.
     *
     * @return the timestampUtc value
     */
    public DateTime timestampUtc() {
        return this.timestampUtc;
    }

    /**
     * Get the sourceSlotName value.
     *
     * @return the sourceSlotName value
     */
    public String sourceSlotName() {
        return this.sourceSlotName;
    }

    /**
     * Get the destinationSlotName value.
     *
     * @return the destinationSlotName value
     */
    public String destinationSlotName() {
        return this.destinationSlotName;
    }

}
