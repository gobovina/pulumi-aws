// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.RouteArgs;
import com.pulumi.aws.ec2.inputs.RouteState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to create a routing table entry (a route) in a VPC routing table.
 * 
 * &gt; **NOTE on Route Tables and Routes:** This provider currently provides both a standalone Route resource and a Route Table resource with routes defined in-line. At this time you cannot use a Route Table with in-line routes in conjunction with any Route resources. Doing so will cause a conflict of rule settings and will overwrite rules.
 * 
 * &gt; **NOTE on `gateway_id` attribute:** The AWS API is very forgiving with the resource ID passed in the `gateway_id` attribute. For example an `aws.ec2.Route` resource can be created with an `aws.ec2.NatGateway` or `aws.ec2.EgressOnlyInternetGateway` ID specified for the `gateway_id` attribute. Specifying anything other than an `aws.ec2.InternetGateway` or `aws.ec2.VpnGateway` ID will lead to this provider reporting a permanent diff between your configuration and recorded state, as the AWS API returns the more-specific attribute. If you are experiencing constant diffs with an `aws.ec2.Route` resource, the first thing to check is that the correct attribute is being specified.
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
 * import com.pulumi.aws.ec2.Route;
 * import com.pulumi.aws.ec2.RouteArgs;
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
 *         var r = new Route(&#34;r&#34;, RouteArgs.builder()        
 *             .routeTableId(testing.id())
 *             .destinationCidrBlock(&#34;10.0.1.0/22&#34;)
 *             .vpcPeeringConnectionId(&#34;pcx-45ff3dc1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Example IPv6 Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.ec2.EgressOnlyInternetGateway;
 * import com.pulumi.aws.ec2.EgressOnlyInternetGatewayArgs;
 * import com.pulumi.aws.ec2.Route;
 * import com.pulumi.aws.ec2.RouteArgs;
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
 *         var vpc = new Vpc(&#34;vpc&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.1.0.0/16&#34;)
 *             .assignGeneratedIpv6CidrBlock(true)
 *             .build());
 * 
 *         var egress = new EgressOnlyInternetGateway(&#34;egress&#34;, EgressOnlyInternetGatewayArgs.builder()        
 *             .vpcId(vpc.id())
 *             .build());
 * 
 *         var r = new Route(&#34;r&#34;, RouteArgs.builder()        
 *             .routeTableId(&#34;rtb-4fbb3ac4&#34;)
 *             .destinationIpv6CidrBlock(&#34;::/0&#34;)
 *             .egressOnlyGatewayId(egress.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Import a route in route table `rtb-656C65616E6F72` with an IPv6 destination CIDR of `2620:0:2d0:200::8/125`:
 * 
 * Import a route in route table `rtb-656C65616E6F72` with a managed prefix list destination of `pl-0570a1d2d725c16be`:
 * 
 * __Using `pulumi import` to import__ individual routes using `ROUTETABLEID_DESTINATION`. Import [local routes](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html#RouteTables) using the VPC&#39;s IPv4 or IPv6 CIDR blocks. For example:
 * 
 * Import a route in route table `rtb-656C65616E6F72` with an IPv4 destination CIDR of `10.42.0.0/16`:
 * 
 * ```sh
 * $ pulumi import aws:ec2/route:Route my_route rtb-656C65616E6F72_10.42.0.0/16
 * ```
 * Import a route in route table `rtb-656C65616E6F72` with an IPv6 destination CIDR of `2620:0:2d0:200::8/125`:
 * 
 * ```sh
 * $ pulumi import aws:ec2/route:Route my_route rtb-656C65616E6F72_2620:0:2d0:200::8/125
 * ```
 * Import a route in route table `rtb-656C65616E6F72` with a managed prefix list destination of `pl-0570a1d2d725c16be`:
 * 
 * ```sh
 * $ pulumi import aws:ec2/route:Route my_route rtb-656C65616E6F72_pl-0570a1d2d725c16be
 * ```
 * 
 */
@ResourceType(type="aws:ec2/route:Route")
public class Route extends com.pulumi.resources.CustomResource {
    /**
     * Identifier of a carrier gateway. This attribute can only be used when the VPC contains a subnet which is associated with a Wavelength Zone.
     * 
     */
    @Export(name="carrierGatewayId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> carrierGatewayId;

    /**
     * @return Identifier of a carrier gateway. This attribute can only be used when the VPC contains a subnet which is associated with a Wavelength Zone.
     * 
     */
    public Output<Optional<String>> carrierGatewayId() {
        return Codegen.optional(this.carrierGatewayId);
    }
    /**
     * The Amazon Resource Name (ARN) of a core network.
     * 
     */
    @Export(name="coreNetworkArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> coreNetworkArn;

    /**
     * @return The Amazon Resource Name (ARN) of a core network.
     * 
     */
    public Output<Optional<String>> coreNetworkArn() {
        return Codegen.optional(this.coreNetworkArn);
    }
    /**
     * The destination CIDR block.
     * 
     */
    @Export(name="destinationCidrBlock", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> destinationCidrBlock;

    /**
     * @return The destination CIDR block.
     * 
     */
    public Output<Optional<String>> destinationCidrBlock() {
        return Codegen.optional(this.destinationCidrBlock);
    }
    /**
     * The destination IPv6 CIDR block.
     * 
     */
    @Export(name="destinationIpv6CidrBlock", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> destinationIpv6CidrBlock;

    /**
     * @return The destination IPv6 CIDR block.
     * 
     */
    public Output<Optional<String>> destinationIpv6CidrBlock() {
        return Codegen.optional(this.destinationIpv6CidrBlock);
    }
    /**
     * The ID of a managed prefix list destination.
     * 
     * One of the following target arguments must be supplied:
     * 
     */
    @Export(name="destinationPrefixListId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> destinationPrefixListId;

    /**
     * @return The ID of a managed prefix list destination.
     * 
     * One of the following target arguments must be supplied:
     * 
     */
    public Output<Optional<String>> destinationPrefixListId() {
        return Codegen.optional(this.destinationPrefixListId);
    }
    /**
     * Identifier of a VPC Egress Only Internet Gateway.
     * 
     */
    @Export(name="egressOnlyGatewayId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> egressOnlyGatewayId;

    /**
     * @return Identifier of a VPC Egress Only Internet Gateway.
     * 
     */
    public Output<Optional<String>> egressOnlyGatewayId() {
        return Codegen.optional(this.egressOnlyGatewayId);
    }
    /**
     * Identifier of a VPC internet gateway or a virtual private gateway. Specify `local` when updating a previously imported local route.
     * 
     */
    @Export(name="gatewayId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> gatewayId;

    /**
     * @return Identifier of a VPC internet gateway or a virtual private gateway. Specify `local` when updating a previously imported local route.
     * 
     */
    public Output<Optional<String>> gatewayId() {
        return Codegen.optional(this.gatewayId);
    }
    /**
     * Identifier of an EC2 instance.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return Identifier of an EC2 instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The AWS account ID of the owner of the EC2 instance.
     * 
     */
    @Export(name="instanceOwnerId", refs={String.class}, tree="[0]")
    private Output<String> instanceOwnerId;

    /**
     * @return The AWS account ID of the owner of the EC2 instance.
     * 
     */
    public Output<String> instanceOwnerId() {
        return this.instanceOwnerId;
    }
    /**
     * Identifier of a Outpost local gateway.
     * 
     */
    @Export(name="localGatewayId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> localGatewayId;

    /**
     * @return Identifier of a Outpost local gateway.
     * 
     */
    public Output<Optional<String>> localGatewayId() {
        return Codegen.optional(this.localGatewayId);
    }
    /**
     * Identifier of a VPC NAT gateway.
     * 
     */
    @Export(name="natGatewayId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> natGatewayId;

    /**
     * @return Identifier of a VPC NAT gateway.
     * 
     */
    public Output<Optional<String>> natGatewayId() {
        return Codegen.optional(this.natGatewayId);
    }
    /**
     * Identifier of an EC2 network interface.
     * 
     */
    @Export(name="networkInterfaceId", refs={String.class}, tree="[0]")
    private Output<String> networkInterfaceId;

    /**
     * @return Identifier of an EC2 network interface.
     * 
     */
    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * How the route was created - `CreateRouteTable`, `CreateRoute` or `EnableVgwRoutePropagation`.
     * 
     */
    @Export(name="origin", refs={String.class}, tree="[0]")
    private Output<String> origin;

    /**
     * @return How the route was created - `CreateRouteTable`, `CreateRoute` or `EnableVgwRoutePropagation`.
     * 
     */
    public Output<String> origin() {
        return this.origin;
    }
    /**
     * The ID of the routing table.
     * 
     * One of the following destination arguments must be supplied:
     * 
     */
    @Export(name="routeTableId", refs={String.class}, tree="[0]")
    private Output<String> routeTableId;

    /**
     * @return The ID of the routing table.
     * 
     * One of the following destination arguments must be supplied:
     * 
     */
    public Output<String> routeTableId() {
        return this.routeTableId;
    }
    /**
     * The state of the route - `active` or `blackhole`.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of the route - `active` or `blackhole`.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Identifier of an EC2 Transit Gateway.
     * 
     */
    @Export(name="transitGatewayId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> transitGatewayId;

    /**
     * @return Identifier of an EC2 Transit Gateway.
     * 
     */
    public Output<Optional<String>> transitGatewayId() {
        return Codegen.optional(this.transitGatewayId);
    }
    /**
     * Identifier of a VPC Endpoint.
     * 
     */
    @Export(name="vpcEndpointId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vpcEndpointId;

    /**
     * @return Identifier of a VPC Endpoint.
     * 
     */
    public Output<Optional<String>> vpcEndpointId() {
        return Codegen.optional(this.vpcEndpointId);
    }
    /**
     * Identifier of a VPC peering connection.
     * 
     * Note that the default route, mapping the VPC&#39;s CIDR block to &#34;local&#34;, is created implicitly and cannot be specified.
     * 
     */
    @Export(name="vpcPeeringConnectionId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vpcPeeringConnectionId;

    /**
     * @return Identifier of a VPC peering connection.
     * 
     * Note that the default route, mapping the VPC&#39;s CIDR block to &#34;local&#34;, is created implicitly and cannot be specified.
     * 
     */
    public Output<Optional<String>> vpcPeeringConnectionId() {
        return Codegen.optional(this.vpcPeeringConnectionId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Route(String name) {
        this(name, RouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Route(String name, RouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Route(String name, RouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/route:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Route(String name, Output<String> id, @Nullable RouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/route:Route", name, state, makeResourceOptions(options, id));
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
    public static Route get(String name, Output<String> id, @Nullable RouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Route(name, id, state, options);
    }
}
