// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2transitgateway.RouteArgs;
import com.pulumi.aws.ec2transitgateway.inputs.RouteState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an EC2 Transit Gateway Route.
 * 
 * ## Example Usage
 * 
 * ### Standard usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2transitgateway.Route;
 * import com.pulumi.aws.ec2transitgateway.RouteArgs;
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
 *         var example = new Route(&#34;example&#34;, RouteArgs.builder()        
 *             .destinationCidrBlock(&#34;0.0.0.0/0&#34;)
 *             .transitGatewayAttachmentId(exampleAwsEc2TransitGatewayVpcAttachment.id())
 *             .transitGatewayRouteTableId(exampleAwsEc2TransitGateway.associationDefaultRouteTableId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Blackhole route
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2transitgateway.Route;
 * import com.pulumi.aws.ec2transitgateway.RouteArgs;
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
 *         var example = new Route(&#34;example&#34;, RouteArgs.builder()        
 *             .destinationCidrBlock(&#34;0.0.0.0/0&#34;)
 *             .blackhole(true)
 *             .transitGatewayRouteTableId(exampleAwsEc2TransitGateway.associationDefaultRouteTableId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_ec2_transit_gateway_route` using the EC2 Transit Gateway Route Table, an underscore, and the destination. For example:
 * 
 * ```sh
 * $ pulumi import aws:ec2transitgateway/route:Route example tgw-rtb-12345678_0.0.0.0/0
 * ```
 * 
 */
@ResourceType(type="aws:ec2transitgateway/route:Route")
public class Route extends com.pulumi.resources.CustomResource {
    /**
     * Indicates whether to drop traffic that matches this route (default to `false`).
     * 
     */
    @Export(name="blackhole", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> blackhole;

    /**
     * @return Indicates whether to drop traffic that matches this route (default to `false`).
     * 
     */
    public Output<Optional<Boolean>> blackhole() {
        return Codegen.optional(this.blackhole);
    }
    /**
     * IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
     * 
     */
    @Export(name="destinationCidrBlock", refs={String.class}, tree="[0]")
    private Output<String> destinationCidrBlock;

    /**
     * @return IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
     * 
     */
    public Output<String> destinationCidrBlock() {
        return this.destinationCidrBlock;
    }
    /**
     * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
     * 
     */
    @Export(name="transitGatewayAttachmentId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> transitGatewayAttachmentId;

    /**
     * @return Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
     * 
     */
    public Output<Optional<String>> transitGatewayAttachmentId() {
        return Codegen.optional(this.transitGatewayAttachmentId);
    }
    /**
     * Identifier of EC2 Transit Gateway Route Table.
     * 
     */
    @Export(name="transitGatewayRouteTableId", refs={String.class}, tree="[0]")
    private Output<String> transitGatewayRouteTableId;

    /**
     * @return Identifier of EC2 Transit Gateway Route Table.
     * 
     */
    public Output<String> transitGatewayRouteTableId() {
        return this.transitGatewayRouteTableId;
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
        super("aws:ec2transitgateway/route:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Route(String name, Output<String> id, @Nullable RouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/route:Route", name, state, makeResourceOptions(options, id));
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
