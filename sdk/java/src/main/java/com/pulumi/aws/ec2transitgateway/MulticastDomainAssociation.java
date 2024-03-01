// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2transitgateway.MulticastDomainAssociationArgs;
import com.pulumi.aws.ec2transitgateway.inputs.MulticastDomainAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Associates the specified subnet and transit gateway attachment with the specified transit gateway multicast domain.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2transitgateway.TransitGateway;
 * import com.pulumi.aws.ec2transitgateway.TransitGatewayArgs;
 * import com.pulumi.aws.ec2transitgateway.VpcAttachment;
 * import com.pulumi.aws.ec2transitgateway.VpcAttachmentArgs;
 * import com.pulumi.aws.ec2transitgateway.MulticastDomain;
 * import com.pulumi.aws.ec2transitgateway.MulticastDomainArgs;
 * import com.pulumi.aws.ec2transitgateway.MulticastDomainAssociation;
 * import com.pulumi.aws.ec2transitgateway.MulticastDomainAssociationArgs;
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
 *         var example = new TransitGateway(&#34;example&#34;, TransitGatewayArgs.builder()        
 *             .multicastSupport(&#34;enable&#34;)
 *             .build());
 * 
 *         var exampleVpcAttachment = new VpcAttachment(&#34;exampleVpcAttachment&#34;, VpcAttachmentArgs.builder()        
 *             .subnetIds(exampleAwsSubnet.id())
 *             .transitGatewayId(example.id())
 *             .vpcId(exampleAwsVpc.id())
 *             .build());
 * 
 *         var exampleMulticastDomain = new MulticastDomain(&#34;exampleMulticastDomain&#34;, MulticastDomainArgs.builder()        
 *             .transitGatewayId(example.id())
 *             .build());
 * 
 *         var exampleMulticastDomainAssociation = new MulticastDomainAssociation(&#34;exampleMulticastDomainAssociation&#34;, MulticastDomainAssociationArgs.builder()        
 *             .subnetId(exampleAwsSubnet.id())
 *             .transitGatewayAttachmentId(exampleVpcAttachment.id())
 *             .transitGatewayMulticastDomainId(exampleMulticastDomain.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:ec2transitgateway/multicastDomainAssociation:MulticastDomainAssociation")
public class MulticastDomainAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the subnet to associate with the transit gateway multicast domain.
     * 
     */
    @Export(name="subnetId", refs={String.class}, tree="[0]")
    private Output<String> subnetId;

    /**
     * @return The ID of the subnet to associate with the transit gateway multicast domain.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }
    /**
     * The ID of the transit gateway attachment.
     * 
     */
    @Export(name="transitGatewayAttachmentId", refs={String.class}, tree="[0]")
    private Output<String> transitGatewayAttachmentId;

    /**
     * @return The ID of the transit gateway attachment.
     * 
     */
    public Output<String> transitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }
    /**
     * The ID of the transit gateway multicast domain.
     * 
     */
    @Export(name="transitGatewayMulticastDomainId", refs={String.class}, tree="[0]")
    private Output<String> transitGatewayMulticastDomainId;

    /**
     * @return The ID of the transit gateway multicast domain.
     * 
     */
    public Output<String> transitGatewayMulticastDomainId() {
        return this.transitGatewayMulticastDomainId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MulticastDomainAssociation(String name) {
        this(name, MulticastDomainAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MulticastDomainAssociation(String name, MulticastDomainAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MulticastDomainAssociation(String name, MulticastDomainAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/multicastDomainAssociation:MulticastDomainAssociation", name, args == null ? MulticastDomainAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MulticastDomainAssociation(String name, Output<String> id, @Nullable MulticastDomainAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/multicastDomainAssociation:MulticastDomainAssociation", name, state, makeResourceOptions(options, id));
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
    public static MulticastDomainAssociation get(String name, Output<String> id, @Nullable MulticastDomainAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MulticastDomainAssociation(name, id, state, options);
    }
}
