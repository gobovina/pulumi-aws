// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2transitgateway.PeeringAttachmentAccepterArgs;
import com.pulumi.aws.ec2transitgateway.inputs.PeeringAttachmentAccepterState;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages the accepter&#39;s side of an EC2 Transit Gateway Peering Attachment.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2transitgateway.PeeringAttachmentAccepter;
 * import com.pulumi.aws.ec2transitgateway.PeeringAttachmentAccepterArgs;
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
 *         var example = new PeeringAttachmentAccepter(&#34;example&#34;, PeeringAttachmentAccepterArgs.builder()        
 *             .transitGatewayAttachmentId(exampleAwsEc2TransitGatewayPeeringAttachment.id())
 *             .tags(Map.of(&#34;Name&#34;, &#34;Example cross-account attachment&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_ec2_transit_gateway_peering_attachment_accepter` using the EC2 Transit Gateway Attachment identifier. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ec2transitgateway/peeringAttachmentAccepter:PeeringAttachmentAccepter example tgw-attach-12345678
 * ```
 * 
 */
@ResourceType(type="aws:ec2transitgateway/peeringAttachmentAccepter:PeeringAttachmentAccepter")
public class PeeringAttachmentAccepter extends com.pulumi.resources.CustomResource {
    /**
     * Identifier of the AWS account that owns the EC2 TGW peering.
     * 
     */
    @Export(name="peerAccountId", refs={String.class}, tree="[0]")
    private Output<String> peerAccountId;

    /**
     * @return Identifier of the AWS account that owns the EC2 TGW peering.
     * 
     */
    public Output<String> peerAccountId() {
        return this.peerAccountId;
    }
    @Export(name="peerRegion", refs={String.class}, tree="[0]")
    private Output<String> peerRegion;

    public Output<String> peerRegion() {
        return this.peerRegion;
    }
    /**
     * Identifier of EC2 Transit Gateway to peer with.
     * 
     */
    @Export(name="peerTransitGatewayId", refs={String.class}, tree="[0]")
    private Output<String> peerTransitGatewayId;

    /**
     * @return Identifier of EC2 Transit Gateway to peer with.
     * 
     */
    public Output<String> peerTransitGatewayId() {
        return this.peerTransitGatewayId;
    }
    /**
     * Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The ID of the EC2 Transit Gateway Peering Attachment to manage.
     * 
     */
    @Export(name="transitGatewayAttachmentId", refs={String.class}, tree="[0]")
    private Output<String> transitGatewayAttachmentId;

    /**
     * @return The ID of the EC2 Transit Gateway Peering Attachment to manage.
     * 
     */
    public Output<String> transitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }
    /**
     * Identifier of EC2 Transit Gateway.
     * 
     */
    @Export(name="transitGatewayId", refs={String.class}, tree="[0]")
    private Output<String> transitGatewayId;

    /**
     * @return Identifier of EC2 Transit Gateway.
     * 
     */
    public Output<String> transitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PeeringAttachmentAccepter(String name) {
        this(name, PeeringAttachmentAccepterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PeeringAttachmentAccepter(String name, PeeringAttachmentAccepterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PeeringAttachmentAccepter(String name, PeeringAttachmentAccepterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/peeringAttachmentAccepter:PeeringAttachmentAccepter", name, args == null ? PeeringAttachmentAccepterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PeeringAttachmentAccepter(String name, Output<String> id, @Nullable PeeringAttachmentAccepterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/peeringAttachmentAccepter:PeeringAttachmentAccepter", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:ec2/transitGatewayPeeringAttachmentAccepter:TransitGatewayPeeringAttachmentAccepter").build())
            ))
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
    public static PeeringAttachmentAccepter get(String name, Output<String> id, @Nullable PeeringAttachmentAccepterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PeeringAttachmentAccepter(name, id, state, options);
    }
}
