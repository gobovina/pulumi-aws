// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.networkmanager.TransitGatewayPeeringArgs;
import com.pulumi.aws.networkmanager.inputs.TransitGatewayPeeringState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a peering connection between an AWS Cloud WAN core network and an AWS Transit Gateway.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkmanager.TransitGatewayPeering;
 * import com.pulumi.aws.networkmanager.TransitGatewayPeeringArgs;
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
 *         var example = new TransitGatewayPeering(&#34;example&#34;, TransitGatewayPeeringArgs.builder()        
 *             .coreNetworkId(awscc_networkmanager_core_network.example().id())
 *             .transitGatewayArn(aws_ec2_transit_gateway.example().arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_networkmanager_transit_gateway_peering` using the peering ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:networkmanager/transitGatewayPeering:TransitGatewayPeering example peering-444555aaabbb11223
 * ```
 * 
 */
@ResourceType(type="aws:networkmanager/transitGatewayPeering:TransitGatewayPeering")
public class TransitGatewayPeering extends com.pulumi.resources.CustomResource {
    /**
     * Peering Amazon Resource Name (ARN).
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Peering Amazon Resource Name (ARN).
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ARN of the core network.
     * 
     */
    @Export(name="coreNetworkArn", refs={String.class}, tree="[0]")
    private Output<String> coreNetworkArn;

    /**
     * @return The ARN of the core network.
     * 
     */
    public Output<String> coreNetworkArn() {
        return this.coreNetworkArn;
    }
    /**
     * The ID of a core network.
     * 
     */
    @Export(name="coreNetworkId", refs={String.class}, tree="[0]")
    private Output<String> coreNetworkId;

    /**
     * @return The ID of a core network.
     * 
     */
    public Output<String> coreNetworkId() {
        return this.coreNetworkId;
    }
    /**
     * The edge location for the peer.
     * 
     */
    @Export(name="edgeLocation", refs={String.class}, tree="[0]")
    private Output<String> edgeLocation;

    /**
     * @return The edge location for the peer.
     * 
     */
    public Output<String> edgeLocation() {
        return this.edgeLocation;
    }
    /**
     * The ID of the account owner.
     * 
     */
    @Export(name="ownerAccountId", refs={String.class}, tree="[0]")
    private Output<String> ownerAccountId;

    /**
     * @return The ID of the account owner.
     * 
     */
    public Output<String> ownerAccountId() {
        return this.ownerAccountId;
    }
    /**
     * The type of peering. This will be `TRANSIT_GATEWAY`.
     * 
     */
    @Export(name="peeringType", refs={String.class}, tree="[0]")
    private Output<String> peeringType;

    /**
     * @return The type of peering. This will be `TRANSIT_GATEWAY`.
     * 
     */
    public Output<String> peeringType() {
        return this.peeringType;
    }
    /**
     * The resource ARN of the peer.
     * 
     */
    @Export(name="resourceArn", refs={String.class}, tree="[0]")
    private Output<String> resourceArn;

    /**
     * @return The resource ARN of the peer.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }
    /**
     * Key-value tags for the peering. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value tags for the peering. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The ARN of the transit gateway for the peering request.
     * 
     */
    @Export(name="transitGatewayArn", refs={String.class}, tree="[0]")
    private Output<String> transitGatewayArn;

    /**
     * @return The ARN of the transit gateway for the peering request.
     * 
     */
    public Output<String> transitGatewayArn() {
        return this.transitGatewayArn;
    }
    /**
     * The ID of the transit gateway peering attachment.
     * 
     */
    @Export(name="transitGatewayPeeringAttachmentId", refs={String.class}, tree="[0]")
    private Output<String> transitGatewayPeeringAttachmentId;

    /**
     * @return The ID of the transit gateway peering attachment.
     * 
     */
    public Output<String> transitGatewayPeeringAttachmentId() {
        return this.transitGatewayPeeringAttachmentId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitGatewayPeering(String name) {
        this(name, TransitGatewayPeeringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitGatewayPeering(String name, TransitGatewayPeeringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitGatewayPeering(String name, TransitGatewayPeeringArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/transitGatewayPeering:TransitGatewayPeering", name, args == null ? TransitGatewayPeeringArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitGatewayPeering(String name, Output<String> id, @Nullable TransitGatewayPeeringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/transitGatewayPeering:TransitGatewayPeering", name, state, makeResourceOptions(options, id));
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
    public static TransitGatewayPeering get(String name, Output<String> id, @Nullable TransitGatewayPeeringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitGatewayPeering(name, id, state, options);
    }
}
