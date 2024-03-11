// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53.ResolverEndpointArgs;
import com.pulumi.aws.route53.inputs.ResolverEndpointState;
import com.pulumi.aws.route53.outputs.ResolverEndpointIpAddress;
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
 * Provides a Route 53 Resolver endpoint resource.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.route53.ResolverEndpoint;
 * import com.pulumi.aws.route53.ResolverEndpointArgs;
 * import com.pulumi.aws.route53.inputs.ResolverEndpointIpAddressArgs;
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
 *         var foo = new ResolverEndpoint(&#34;foo&#34;, ResolverEndpointArgs.builder()        
 *             .name(&#34;foo&#34;)
 *             .direction(&#34;INBOUND&#34;)
 *             .securityGroupIds(            
 *                 sg1.id(),
 *                 sg2.id())
 *             .ipAddresses(            
 *                 ResolverEndpointIpAddressArgs.builder()
 *                     .subnetId(sn1.id())
 *                     .build(),
 *                 ResolverEndpointIpAddressArgs.builder()
 *                     .subnetId(sn2.id())
 *                     .ip(&#34;10.0.64.4&#34;)
 *                     .build())
 *             .protocols(            
 *                 &#34;Do53&#34;,
 *                 &#34;DoH&#34;)
 *             .tags(Map.of(&#34;Environment&#34;, &#34;Prod&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import  Route 53 Resolver endpoints using the Route 53 Resolver endpoint ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:route53/resolverEndpoint:ResolverEndpoint foo rslvr-in-abcdef01234567890
 * ```
 * 
 */
@ResourceType(type="aws:route53/resolverEndpoint:ResolverEndpoint")
public class ResolverEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the Route 53 Resolver endpoint.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the Route 53 Resolver endpoint.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The direction of DNS queries to or from the Route 53 Resolver endpoint.
     * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
     * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
     * 
     */
    @Export(name="direction", refs={String.class}, tree="[0]")
    private Output<String> direction;

    /**
     * @return The direction of DNS queries to or from the Route 53 Resolver endpoint.
     * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
     * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
     * 
     */
    public Output<String> direction() {
        return this.direction;
    }
    /**
     * The ID of the VPC that you want to create the resolver endpoint in.
     * 
     */
    @Export(name="hostVpcId", refs={String.class}, tree="[0]")
    private Output<String> hostVpcId;

    /**
     * @return The ID of the VPC that you want to create the resolver endpoint in.
     * 
     */
    public Output<String> hostVpcId() {
        return this.hostVpcId;
    }
    /**
     * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
     * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
     * 
     */
    @Export(name="ipAddresses", refs={List.class,ResolverEndpointIpAddress.class}, tree="[0,1]")
    private Output<List<ResolverEndpointIpAddress>> ipAddresses;

    /**
     * @return The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
     * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
     * 
     */
    public Output<List<ResolverEndpointIpAddress>> ipAddresses() {
        return this.ipAddresses;
    }
    /**
     * The friendly name of the Route 53 Resolver endpoint.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The friendly name of the Route 53 Resolver endpoint.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The protocols you want to use for the Route 53 Resolver endpoint. Valid values: `DoH`, `Do53`, `DoH-FIPS`.
     * 
     */
    @Export(name="protocols", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> protocols;

    /**
     * @return The protocols you want to use for the Route 53 Resolver endpoint. Valid values: `DoH`, `Do53`, `DoH-FIPS`.
     * 
     */
    public Output<List<String>> protocols() {
        return this.protocols;
    }
    /**
     * The Route 53 Resolver endpoint IP address type. Valid values: `IPV4`, `IPV6`, `DUALSTACK`.
     * 
     */
    @Export(name="resolverEndpointType", refs={String.class}, tree="[0]")
    private Output<String> resolverEndpointType;

    /**
     * @return The Route 53 Resolver endpoint IP address type. Valid values: `IPV4`, `IPV6`, `DUALSTACK`.
     * 
     */
    public Output<String> resolverEndpointType() {
        return this.resolverEndpointType;
    }
    /**
     * The ID of one or more security groups that you want to use to control access to this VPC.
     * 
     */
    @Export(name="securityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityGroupIds;

    /**
     * @return The ID of one or more security groups that you want to use to control access to this VPC.
     * 
     */
    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverEndpoint(String name) {
        this(name, ResolverEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverEndpoint(String name, ResolverEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverEndpoint(String name, ResolverEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverEndpoint:ResolverEndpoint", name, args == null ? ResolverEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResolverEndpoint(String name, Output<String> id, @Nullable ResolverEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverEndpoint:ResolverEndpoint", name, state, makeResourceOptions(options, id));
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
    public static ResolverEndpoint get(String name, Output<String> id, @Nullable ResolverEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResolverEndpoint(name, id, state, options);
    }
}
