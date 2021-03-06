/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.management.network.VirtualNetworkConnectionGatewayReference;
import com.microsoft.azure.management.network.VirtualNetworkGatewayConnectionType;
import com.microsoft.azure.management.network.VirtualNetworkGatewayConnectionStatus;
import java.util.List;
import com.microsoft.azure.management.network.TunnelConnectionHealth;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.IpsecPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A common class for general resource information.
 */
@JsonFlatten
public class VirtualNetworkGatewayConnectionListEntityInner extends Resource {
    /**
     * The authorizationKey.
     */
    @JsonProperty(value = "properties.authorizationKey")
    private String authorizationKey;

    /**
     * The reference to virtual network gateway resource.
     */
    @JsonProperty(value = "properties.virtualNetworkGateway1", required = true)
    private VirtualNetworkConnectionGatewayReference virtualNetworkGateway1;

    /**
     * The reference to virtual network gateway resource.
     */
    @JsonProperty(value = "properties.virtualNetworkGateway2")
    private VirtualNetworkConnectionGatewayReference virtualNetworkGateway2;

    /**
     * The reference to local network gateway resource.
     */
    @JsonProperty(value = "properties.localNetworkGateway2")
    private VirtualNetworkConnectionGatewayReference localNetworkGateway2;

    /**
     * Gateway connection type. Possible values are:
     * 'Ipsec','Vnet2Vnet','ExpressRoute', and 'VPNClient. Possible values
     * include: 'IPsec', 'Vnet2Vnet', 'ExpressRoute', 'VPNClient'.
     */
    @JsonProperty(value = "properties.connectionType", required = true)
    private VirtualNetworkGatewayConnectionType connectionType;

    /**
     * The routing weight.
     */
    @JsonProperty(value = "properties.routingWeight")
    private Integer routingWeight;

    /**
     * The IPSec shared key.
     */
    @JsonProperty(value = "properties.sharedKey")
    private String sharedKey;

    /**
     * Virtual network Gateway connection status. Possible values are
     * 'Unknown', 'Connecting', 'Connected' and 'NotConnected'. Possible values
     * include: 'Unknown', 'Connecting', 'Connected', 'NotConnected'.
     */
    @JsonProperty(value = "properties.connectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworkGatewayConnectionStatus connectionStatus;

    /**
     * Collection of all tunnels' connection health status.
     */
    @JsonProperty(value = "properties.tunnelConnectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private List<TunnelConnectionHealth> tunnelConnectionStatus;

    /**
     * The egress bytes transferred in this connection.
     */
    @JsonProperty(value = "properties.egressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long egressBytesTransferred;

    /**
     * The ingress bytes transferred in this connection.
     */
    @JsonProperty(value = "properties.ingressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long ingressBytesTransferred;

    /**
     * The reference to peerings resource.
     */
    @JsonProperty(value = "properties.peer")
    private SubResource peer;

    /**
     * EnableBgp flag.
     */
    @JsonProperty(value = "properties.enableBgp")
    private Boolean enableBgp;

    /**
     * Enable policy-based traffic selectors.
     */
    @JsonProperty(value = "properties.usePolicyBasedTrafficSelectors")
    private Boolean usePolicyBasedTrafficSelectors;

    /**
     * The IPSec Policies to be considered by this connection.
     */
    @JsonProperty(value = "properties.ipsecPolicies")
    private List<IpsecPolicy> ipsecPolicies;

    /**
     * The resource GUID property of the VirtualNetworkGatewayConnection
     * resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * The provisioning state of the VirtualNetworkGatewayConnection resource.
     * Possible values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the authorizationKey value.
     *
     * @return the authorizationKey value
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey value.
     *
     * @param authorizationKey the authorizationKey value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get the virtualNetworkGateway1 value.
     *
     * @return the virtualNetworkGateway1 value
     */
    public VirtualNetworkConnectionGatewayReference virtualNetworkGateway1() {
        return this.virtualNetworkGateway1;
    }

    /**
     * Set the virtualNetworkGateway1 value.
     *
     * @param virtualNetworkGateway1 the virtualNetworkGateway1 value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withVirtualNetworkGateway1(VirtualNetworkConnectionGatewayReference virtualNetworkGateway1) {
        this.virtualNetworkGateway1 = virtualNetworkGateway1;
        return this;
    }

    /**
     * Get the virtualNetworkGateway2 value.
     *
     * @return the virtualNetworkGateway2 value
     */
    public VirtualNetworkConnectionGatewayReference virtualNetworkGateway2() {
        return this.virtualNetworkGateway2;
    }

    /**
     * Set the virtualNetworkGateway2 value.
     *
     * @param virtualNetworkGateway2 the virtualNetworkGateway2 value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withVirtualNetworkGateway2(VirtualNetworkConnectionGatewayReference virtualNetworkGateway2) {
        this.virtualNetworkGateway2 = virtualNetworkGateway2;
        return this;
    }

    /**
     * Get the localNetworkGateway2 value.
     *
     * @return the localNetworkGateway2 value
     */
    public VirtualNetworkConnectionGatewayReference localNetworkGateway2() {
        return this.localNetworkGateway2;
    }

    /**
     * Set the localNetworkGateway2 value.
     *
     * @param localNetworkGateway2 the localNetworkGateway2 value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withLocalNetworkGateway2(VirtualNetworkConnectionGatewayReference localNetworkGateway2) {
        this.localNetworkGateway2 = localNetworkGateway2;
        return this;
    }

    /**
     * Get the connectionType value.
     *
     * @return the connectionType value
     */
    public VirtualNetworkGatewayConnectionType connectionType() {
        return this.connectionType;
    }

    /**
     * Set the connectionType value.
     *
     * @param connectionType the connectionType value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withConnectionType(VirtualNetworkGatewayConnectionType connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * Get the routingWeight value.
     *
     * @return the routingWeight value
     */
    public Integer routingWeight() {
        return this.routingWeight;
    }

    /**
     * Set the routingWeight value.
     *
     * @param routingWeight the routingWeight value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withRoutingWeight(Integer routingWeight) {
        this.routingWeight = routingWeight;
        return this;
    }

    /**
     * Get the sharedKey value.
     *
     * @return the sharedKey value
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the sharedKey value.
     *
     * @param sharedKey the sharedKey value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    /**
     * Get the connectionStatus value.
     *
     * @return the connectionStatus value
     */
    public VirtualNetworkGatewayConnectionStatus connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Get the tunnelConnectionStatus value.
     *
     * @return the tunnelConnectionStatus value
     */
    public List<TunnelConnectionHealth> tunnelConnectionStatus() {
        return this.tunnelConnectionStatus;
    }

    /**
     * Get the egressBytesTransferred value.
     *
     * @return the egressBytesTransferred value
     */
    public Long egressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * Get the ingressBytesTransferred value.
     *
     * @return the ingressBytesTransferred value
     */
    public Long ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * Get the peer value.
     *
     * @return the peer value
     */
    public SubResource peer() {
        return this.peer;
    }

    /**
     * Set the peer value.
     *
     * @param peer the peer value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withPeer(SubResource peer) {
        this.peer = peer;
        return this;
    }

    /**
     * Get the enableBgp value.
     *
     * @return the enableBgp value
     */
    public Boolean enableBgp() {
        return this.enableBgp;
    }

    /**
     * Set the enableBgp value.
     *
     * @param enableBgp the enableBgp value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }

    /**
     * Get the usePolicyBasedTrafficSelectors value.
     *
     * @return the usePolicyBasedTrafficSelectors value
     */
    public Boolean usePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors;
    }

    /**
     * Set the usePolicyBasedTrafficSelectors value.
     *
     * @param usePolicyBasedTrafficSelectors the usePolicyBasedTrafficSelectors value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withUsePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors) {
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        return this;
    }

    /**
     * Get the ipsecPolicies value.
     *
     * @return the ipsecPolicies value
     */
    public List<IpsecPolicy> ipsecPolicies() {
        return this.ipsecPolicies;
    }

    /**
     * Set the ipsecPolicies value.
     *
     * @param ipsecPolicies the ipsecPolicies value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        this.ipsecPolicies = ipsecPolicies;
        return this;
    }

    /**
     * Get the resourceGuid value.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid value.
     *
     * @param resourceGuid the resourceGuid value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
