// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2clientvpn;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2clientvpn.RouteArgs;
import com.pulumi.aws.ec2clientvpn.inputs.RouteState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides additional routes for AWS Client VPN endpoints. For more information on usage, please see the
 * [AWS Client VPN Administrator&#39;s Guide](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/what-is.html).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2clientvpn.Endpoint;
 * import com.pulumi.aws.ec2clientvpn.EndpointArgs;
 * import com.pulumi.aws.ec2clientvpn.inputs.EndpointAuthenticationOptionArgs;
 * import com.pulumi.aws.ec2clientvpn.inputs.EndpointConnectionLogOptionsArgs;
 * import com.pulumi.aws.ec2clientvpn.NetworkAssociation;
 * import com.pulumi.aws.ec2clientvpn.NetworkAssociationArgs;
 * import com.pulumi.aws.ec2clientvpn.Route;
 * import com.pulumi.aws.ec2clientvpn.RouteArgs;
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
 *         var exampleEndpoint = new Endpoint(&#34;exampleEndpoint&#34;, EndpointArgs.builder()        
 *             .description(&#34;Example Client VPN endpoint&#34;)
 *             .serverCertificateArn(aws_acm_certificate.example().arn())
 *             .clientCidrBlock(&#34;10.0.0.0/16&#34;)
 *             .authenticationOptions(EndpointAuthenticationOptionArgs.builder()
 *                 .type(&#34;certificate-authentication&#34;)
 *                 .rootCertificateChainArn(aws_acm_certificate.example().arn())
 *                 .build())
 *             .connectionLogOptions(EndpointConnectionLogOptionsArgs.builder()
 *                 .enabled(false)
 *                 .build())
 *             .build());
 * 
 *         var exampleNetworkAssociation = new NetworkAssociation(&#34;exampleNetworkAssociation&#34;, NetworkAssociationArgs.builder()        
 *             .clientVpnEndpointId(exampleEndpoint.id())
 *             .subnetId(aws_subnet.example().id())
 *             .build());
 * 
 *         var exampleRoute = new Route(&#34;exampleRoute&#34;, RouteArgs.builder()        
 *             .clientVpnEndpointId(exampleEndpoint.id())
 *             .destinationCidrBlock(&#34;0.0.0.0/0&#34;)
 *             .targetVpcSubnetId(exampleNetworkAssociation.subnetId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import AWS Client VPN routes using the endpoint ID, target subnet ID, and destination CIDR block. All values are separated by a `,`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ec2clientvpn/route:Route example cvpn-endpoint-1234567890abcdef,subnet-9876543210fedcba,10.1.0.0/24
 * ```
 * 
 */
@ResourceType(type="aws:ec2clientvpn/route:Route")
public class Route extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Client VPN endpoint.
     * 
     */
    @Export(name="clientVpnEndpointId", refs={String.class}, tree="[0]")
    private Output<String> clientVpnEndpointId;

    /**
     * @return The ID of the Client VPN endpoint.
     * 
     */
    public Output<String> clientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }
    /**
     * A brief description of the route.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A brief description of the route.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The IPv4 address range, in CIDR notation, of the route destination.
     * 
     */
    @Export(name="destinationCidrBlock", refs={String.class}, tree="[0]")
    private Output<String> destinationCidrBlock;

    /**
     * @return The IPv4 address range, in CIDR notation, of the route destination.
     * 
     */
    public Output<String> destinationCidrBlock() {
        return this.destinationCidrBlock;
    }
    /**
     * Indicates how the Client VPN route was added. Will be `add-route` for routes created by this resource.
     * 
     */
    @Export(name="origin", refs={String.class}, tree="[0]")
    private Output<String> origin;

    /**
     * @return Indicates how the Client VPN route was added. Will be `add-route` for routes created by this resource.
     * 
     */
    public Output<String> origin() {
        return this.origin;
    }
    /**
     * The ID of the Subnet to route the traffic through. It must already be attached to the Client VPN.
     * 
     */
    @Export(name="targetVpcSubnetId", refs={String.class}, tree="[0]")
    private Output<String> targetVpcSubnetId;

    /**
     * @return The ID of the Subnet to route the traffic through. It must already be attached to the Client VPN.
     * 
     */
    public Output<String> targetVpcSubnetId() {
        return this.targetVpcSubnetId;
    }
    /**
     * The type of the route.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of the route.
     * 
     */
    public Output<String> type() {
        return this.type;
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
        super("aws:ec2clientvpn/route:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Route(String name, Output<String> id, @Nullable RouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2clientvpn/route:Route", name, state, makeResourceOptions(options, id));
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
