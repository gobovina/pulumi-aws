// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.RouteTableArgs;
import com.pulumi.aws.ec2.inputs.RouteTableState;
import com.pulumi.aws.ec2.outputs.RouteTableRoute;
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
 * Provides a resource to create a VPC routing table.
 * 
 * &gt; **NOTE on Route Tables and Routes:** This provider currently
 * provides both a standalone Route resource and a Route Table resource with routes
 * defined in-line. At this time you cannot use a Route Table with in-line routes
 * in conjunction with any Route resources. Doing so will cause
 * a conflict of rule settings and will overwrite rules.
 * 
 * &gt; **NOTE on `gateway_id` and `nat_gateway_id`:** The AWS API is very forgiving with these two
 * attributes and the `aws.ec2.RouteTable` resource can be created with a NAT ID specified as a Gateway ID attribute.
 * This _will_ lead to a permanent diff between your configuration and statefile, as the API returns the correct
 * parameters in the returned route table. If you&#39;re experiencing constant diffs in your `aws.ec2.RouteTable` resources,
 * the first thing to check is whether or not you&#39;re specifying a NAT ID instead of a Gateway ID, or vice-versa.
 * 
 * &gt; **NOTE on `propagating_vgws` and the `aws.ec2.VpnGatewayRoutePropagation` resource:**
 * If the `propagating_vgws` argument is present, it&#39;s not supported to _also_
 * define route propagations using `aws.ec2.VpnGatewayRoutePropagation`, since
 * this resource will delete any propagating gateways not explicitly listed in
 * `propagating_vgws`. Omit this argument when defining route propagation using
 * the separate resource.
 * 
 * ## Example Usage
 * ### Basic example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.RouteTable;
 * import com.pulumi.aws.ec2.RouteTableArgs;
 * import com.pulumi.aws.ec2.inputs.RouteTableRouteArgs;
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
 *         var example = new RouteTable(&#34;example&#34;, RouteTableArgs.builder()        
 *             .vpcId(aws_vpc.example().id())
 *             .routes(            
 *                 RouteTableRouteArgs.builder()
 *                     .cidrBlock(&#34;10.0.1.0/24&#34;)
 *                     .gatewayId(aws_internet_gateway.example().id())
 *                     .build(),
 *                 RouteTableRouteArgs.builder()
 *                     .ipv6CidrBlock(&#34;::/0&#34;)
 *                     .egressOnlyGatewayId(aws_egress_only_internet_gateway.example().id())
 *                     .build())
 *             .tags(Map.of(&#34;Name&#34;, &#34;example&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * To subsequently remove all managed routes:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.RouteTable;
 * import com.pulumi.aws.ec2.RouteTableArgs;
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
 *         var example = new RouteTable(&#34;example&#34;, RouteTableArgs.builder()        
 *             .vpcId(aws_vpc.example().id())
 *             .routes()
 *             .tags(Map.of(&#34;Name&#34;, &#34;example&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Adopting an existing local route
 * 
 * AWS creates certain routes that the AWS provider mostly ignores. You can manage them by importing or adopting them. See Import below for information on importing. This example shows adopting a route and then updating its target.
 * 
 * First, adopt an existing AWS-created route:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.ec2.RouteTable;
 * import com.pulumi.aws.ec2.RouteTableArgs;
 * import com.pulumi.aws.ec2.inputs.RouteTableRouteArgs;
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
 *         var testVpc = new Vpc(&#34;testVpc&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.1.0.0/16&#34;)
 *             .build());
 * 
 *         var testRouteTable = new RouteTable(&#34;testRouteTable&#34;, RouteTableArgs.builder()        
 *             .vpcId(testVpc.id())
 *             .routes(RouteTableRouteArgs.builder()
 *                 .cidrBlock(&#34;10.1.0.0/16&#34;)
 *                 .gatewayId(&#34;local&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Next, update the target of the route:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.ec2.Subnet;
 * import com.pulumi.aws.ec2.SubnetArgs;
 * import com.pulumi.aws.ec2.NetworkInterface;
 * import com.pulumi.aws.ec2.NetworkInterfaceArgs;
 * import com.pulumi.aws.ec2.RouteTable;
 * import com.pulumi.aws.ec2.RouteTableArgs;
 * import com.pulumi.aws.ec2.inputs.RouteTableRouteArgs;
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
 *         var testVpc = new Vpc(&#34;testVpc&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.1.0.0/16&#34;)
 *             .build());
 * 
 *         var testSubnet = new Subnet(&#34;testSubnet&#34;, SubnetArgs.builder()        
 *             .cidrBlock(&#34;10.1.1.0/24&#34;)
 *             .vpcId(testVpc.id())
 *             .build());
 * 
 *         var testNetworkInterface = new NetworkInterface(&#34;testNetworkInterface&#34;, NetworkInterfaceArgs.builder()        
 *             .subnetId(testSubnet.id())
 *             .build());
 * 
 *         var testRouteTable = new RouteTable(&#34;testRouteTable&#34;, RouteTableArgs.builder()        
 *             .vpcId(testVpc.id())
 *             .routes(RouteTableRouteArgs.builder()
 *                 .cidrBlock(testVpc.cidrBlock())
 *                 .networkInterfaceId(testNetworkInterface.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * The target could then be updated again back to `local`.
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Route Tables using the route table `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ec2/routeTable:RouteTable public_rt rtb-4e616f6d69
 * ```
 * 
 */
@ResourceType(type="aws:ec2/routeTable:RouteTable")
public class RouteTable extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the route table.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the route table.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ID of the AWS account that owns the route table.
     * 
     */
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    /**
     * @return The ID of the AWS account that owns the route table.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * A list of virtual gateways for propagation.
     * 
     */
    @Export(name="propagatingVgws", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> propagatingVgws;

    /**
     * @return A list of virtual gateways for propagation.
     * 
     */
    public Output<List<String>> propagatingVgws() {
        return this.propagatingVgws;
    }
    /**
     * A list of route objects. Their keys are documented below.
     * This means that omitting this argument is interpreted as ignoring any existing routes. To remove all managed routes an empty list should be specified. See the example above.
     * 
     */
    @Export(name="routes", refs={List.class,RouteTableRoute.class}, tree="[0,1]")
    private Output<List<RouteTableRoute>> routes;

    /**
     * @return A list of route objects. Their keys are documented below.
     * This means that omitting this argument is interpreted as ignoring any existing routes. To remove all managed routes an empty list should be specified. See the example above.
     * 
     */
    public Output<List<RouteTableRoute>> routes() {
        return this.routes;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
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
     * The VPC ID.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The VPC ID.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouteTable(String name) {
        this(name, RouteTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouteTable(String name, RouteTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouteTable(String name, RouteTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/routeTable:RouteTable", name, args == null ? RouteTableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RouteTable(String name, Output<String> id, @Nullable RouteTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/routeTable:RouteTable", name, state, makeResourceOptions(options, id));
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
    public static RouteTable get(String name, Output<String> id, @Nullable RouteTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouteTable(name, id, state, options);
    }
}
