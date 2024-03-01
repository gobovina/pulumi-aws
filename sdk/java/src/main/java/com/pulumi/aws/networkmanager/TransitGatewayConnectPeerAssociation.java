// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.networkmanager.TransitGatewayConnectPeerAssociationArgs;
import com.pulumi.aws.networkmanager.inputs.TransitGatewayConnectPeerAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Associates a transit gateway Connect peer with a device, and optionally, with a link.
 * If you specify a link, it must be associated with the specified device.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkmanager.TransitGatewayConnectPeerAssociation;
 * import com.pulumi.aws.networkmanager.TransitGatewayConnectPeerAssociationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new TransitGatewayConnectPeerAssociation(&#34;example&#34;, TransitGatewayConnectPeerAssociationArgs.builder()        
 *             .globalNetworkId(exampleAwsNetworkmanagerGlobalNetwork.id())
 *             .deviceId(exampleAwsNetworkmanagerDevice.id())
 *             .transitGatewayConnectPeerArn(exampleAwsEc2TransitGatewayConnectPeer.arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_networkmanager_transit_gateway_connect_peer_association` using the global network ID and customer gateway ARN. For example:
 * 
 * ```sh
 *  $ pulumi import aws:networkmanager/transitGatewayConnectPeerAssociation:TransitGatewayConnectPeerAssociation example global-network-0d47f6t230mz46dy4,arn:aws:ec2:us-west-2:123456789012:transit-gateway-connect-peer/tgw-connect-peer-12345678
 * ```
 * 
 */
@ResourceType(type="aws:networkmanager/transitGatewayConnectPeerAssociation:TransitGatewayConnectPeerAssociation")
public class TransitGatewayConnectPeerAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the device.
     * 
     */
    @Export(name="deviceId", refs={String.class}, tree="[0]")
    private Output<String> deviceId;

    /**
     * @return The ID of the device.
     * 
     */
    public Output<String> deviceId() {
        return this.deviceId;
    }
    /**
     * The ID of the global network.
     * 
     */
    @Export(name="globalNetworkId", refs={String.class}, tree="[0]")
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the global network.
     * 
     */
    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }
    /**
     * The ID of the link.
     * 
     */
    @Export(name="linkId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> linkId;

    /**
     * @return The ID of the link.
     * 
     */
    public Output<Optional<String>> linkId() {
        return Codegen.optional(this.linkId);
    }
    /**
     * The Amazon Resource Name (ARN) of the Connect peer.
     * 
     */
    @Export(name="transitGatewayConnectPeerArn", refs={String.class}, tree="[0]")
    private Output<String> transitGatewayConnectPeerArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Connect peer.
     * 
     */
    public Output<String> transitGatewayConnectPeerArn() {
        return this.transitGatewayConnectPeerArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitGatewayConnectPeerAssociation(String name) {
        this(name, TransitGatewayConnectPeerAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitGatewayConnectPeerAssociation(String name, TransitGatewayConnectPeerAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitGatewayConnectPeerAssociation(String name, TransitGatewayConnectPeerAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/transitGatewayConnectPeerAssociation:TransitGatewayConnectPeerAssociation", name, args == null ? TransitGatewayConnectPeerAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitGatewayConnectPeerAssociation(String name, Output<String> id, @Nullable TransitGatewayConnectPeerAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/transitGatewayConnectPeerAssociation:TransitGatewayConnectPeerAssociation", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TransitGatewayConnectPeerAssociation get(String name, Output<String> id, @Nullable TransitGatewayConnectPeerAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitGatewayConnectPeerAssociation(name, id, state, options);
    }
}
