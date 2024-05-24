// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.VpcEndpointServiceArgs;
import com.pulumi.aws.ec2.inputs.VpcEndpointServiceState;
import com.pulumi.aws.ec2.outputs.VpcEndpointServicePrivateDnsNameConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a VPC Endpoint Service resource.
 * Service consumers can create an _Interface_ VPC Endpoint to connect to the service.
 * 
 * &gt; **NOTE on VPC Endpoint Services and VPC Endpoint Service Allowed Principals:** This provider provides
 * both a standalone VPC Endpoint Service Allowed Principal resource
 * and a VPC Endpoint Service resource with an `allowed_principals` attribute. Do not use the same principal ARN in both
 * a VPC Endpoint Service resource and a VPC Endpoint Service Allowed Principal resource. Doing so will cause a conflict
 * and will overwrite the association.
 * 
 * ## Example Usage
 * 
 * ### Network Load Balancers
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.VpcEndpointService;
 * import com.pulumi.aws.ec2.VpcEndpointServiceArgs;
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
 *         var example = new VpcEndpointService("example", VpcEndpointServiceArgs.builder()
 *             .acceptanceRequired(false)
 *             .networkLoadBalancerArns(exampleAwsLb.arn())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Gateway Load Balancers
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.VpcEndpointService;
 * import com.pulumi.aws.ec2.VpcEndpointServiceArgs;
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
 *         var example = new VpcEndpointService("example", VpcEndpointServiceArgs.builder()
 *             .acceptanceRequired(false)
 *             .gatewayLoadBalancerArns(exampleAwsLb.arn())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import VPC Endpoint Services using the VPC endpoint service `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:ec2/vpcEndpointService:VpcEndpointService foo vpce-svc-0f97a19d3fa8220bc
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcEndpointService:VpcEndpointService")
public class VpcEndpointService extends com.pulumi.resources.CustomResource {
    /**
     * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
     * 
     */
    @Export(name="acceptanceRequired", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> acceptanceRequired;

    /**
     * @return Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
     * 
     */
    public Output<Boolean> acceptanceRequired() {
        return this.acceptanceRequired;
    }
    /**
     * The ARNs of one or more principals allowed to discover the endpoint service.
     * 
     */
    @Export(name="allowedPrincipals", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> allowedPrincipals;

    /**
     * @return The ARNs of one or more principals allowed to discover the endpoint service.
     * 
     */
    public Output<List<String>> allowedPrincipals() {
        return this.allowedPrincipals;
    }
    /**
     * The Amazon Resource Name (ARN) of the VPC endpoint service.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the VPC endpoint service.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A set of Availability Zones in which the service is available.
     * 
     */
    @Export(name="availabilityZones", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> availabilityZones;

    /**
     * @return A set of Availability Zones in which the service is available.
     * 
     */
    public Output<List<String>> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * A set of DNS names for the service.
     * 
     */
    @Export(name="baseEndpointDnsNames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> baseEndpointDnsNames;

    /**
     * @return A set of DNS names for the service.
     * 
     */
    public Output<List<String>> baseEndpointDnsNames() {
        return this.baseEndpointDnsNames;
    }
    /**
     * Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
     * 
     */
    @Export(name="gatewayLoadBalancerArns", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> gatewayLoadBalancerArns;

    /**
     * @return Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
     * 
     */
    public Output<Optional<List<String>>> gatewayLoadBalancerArns() {
        return Codegen.optional(this.gatewayLoadBalancerArns);
    }
    /**
     * Whether or not the service manages its VPC endpoints - `true` or `false`.
     * 
     */
    @Export(name="managesVpcEndpoints", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> managesVpcEndpoints;

    /**
     * @return Whether or not the service manages its VPC endpoints - `true` or `false`.
     * 
     */
    public Output<Boolean> managesVpcEndpoints() {
        return this.managesVpcEndpoints;
    }
    /**
     * Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
     * 
     */
    @Export(name="networkLoadBalancerArns", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> networkLoadBalancerArns;

    /**
     * @return Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
     * 
     */
    public Output<Optional<List<String>>> networkLoadBalancerArns() {
        return Codegen.optional(this.networkLoadBalancerArns);
    }
    /**
     * The private DNS name for the service.
     * 
     */
    @Export(name="privateDnsName", refs={String.class}, tree="[0]")
    private Output<String> privateDnsName;

    /**
     * @return The private DNS name for the service.
     * 
     */
    public Output<String> privateDnsName() {
        return this.privateDnsName;
    }
    /**
     * List of objects containing information about the endpoint service private DNS name configuration.
     * 
     */
    @Export(name="privateDnsNameConfigurations", refs={List.class,VpcEndpointServicePrivateDnsNameConfiguration.class}, tree="[0,1]")
    private Output<List<VpcEndpointServicePrivateDnsNameConfiguration>> privateDnsNameConfigurations;

    /**
     * @return List of objects containing information about the endpoint service private DNS name configuration.
     * 
     */
    public Output<List<VpcEndpointServicePrivateDnsNameConfiguration>> privateDnsNameConfigurations() {
        return this.privateDnsNameConfigurations;
    }
    /**
     * The service name.
     * 
     */
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output<String> serviceName;

    /**
     * @return The service name.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * The service type, `Gateway` or `Interface`.
     * 
     */
    @Export(name="serviceType", refs={String.class}, tree="[0]")
    private Output<String> serviceType;

    /**
     * @return The service type, `Gateway` or `Interface`.
     * 
     */
    public Output<String> serviceType() {
        return this.serviceType;
    }
    /**
     * Verification state of the VPC endpoint service. Consumers of the endpoint service can use the private name only when the state is `verified`.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Verification state of the VPC endpoint service. Consumers of the endpoint service can use the private name only when the state is `verified`.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The supported IP address types. The possible values are `ipv4` and `ipv6`.
     * 
     */
    @Export(name="supportedIpAddressTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> supportedIpAddressTypes;

    /**
     * @return The supported IP address types. The possible values are `ipv4` and `ipv6`.
     * 
     */
    public Output<List<String>> supportedIpAddressTypes() {
        return this.supportedIpAddressTypes;
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
    public VpcEndpointService(String name) {
        this(name, VpcEndpointServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcEndpointService(String name, VpcEndpointServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcEndpointService(String name, VpcEndpointServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcEndpointService:VpcEndpointService", name, args == null ? VpcEndpointServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcEndpointService(String name, Output<String> id, @Nullable VpcEndpointServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcEndpointService:VpcEndpointService", name, state, makeResourceOptions(options, id));
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
    public static VpcEndpointService get(String name, Output<String> id, @Nullable VpcEndpointServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcEndpointService(name, id, state, options);
    }
}
