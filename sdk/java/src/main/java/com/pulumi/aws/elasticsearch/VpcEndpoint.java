// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elasticsearch.VpcEndpointArgs;
import com.pulumi.aws.elasticsearch.inputs.VpcEndpointState;
import com.pulumi.aws.elasticsearch.outputs.VpcEndpointVpcOptions;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an [AWS Elasticsearch VPC Endpoint](https://docs.aws.amazon.com/elasticsearch-service/latest/APIReference/API_CreateVpcEndpoint.html). Creates an Amazon elasticsearch Service-managed VPC endpoint.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.elasticsearch.VpcEndpoint;
 * import com.pulumi.aws.elasticsearch.VpcEndpointArgs;
 * import com.pulumi.aws.elasticsearch.inputs.VpcEndpointVpcOptionsArgs;
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
 *         var foo = new VpcEndpoint(&#34;foo&#34;, VpcEndpointArgs.builder()        
 *             .domainArn(domain1.arn())
 *             .vpcOptions(VpcEndpointVpcOptionsArgs.builder()
 *                 .securityGroupIds(                
 *                     test.id(),
 *                     test2.id())
 *                 .subnetIds(                
 *                     testAwsSubnet.id(),
 *                     test2AwsSubnet.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import elasticsearch VPC endpoint connections using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:elasticsearch/vpcEndpoint:VpcEndpoint example endpoint-id
 * ```
 * 
 */
@ResourceType(type="aws:elasticsearch/vpcEndpoint:VpcEndpoint")
public class VpcEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the Amazon Resource Name (ARN) of the domain to create the endpoint for
     * 
     */
    @Export(name="domainArn", refs={String.class}, tree="[0]")
    private Output<String> domainArn;

    /**
     * @return Specifies the Amazon Resource Name (ARN) of the domain to create the endpoint for
     * 
     */
    public Output<String> domainArn() {
        return this.domainArn;
    }
    /**
     * The connection endpoint ID for connecting to the domain.
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output<String> endpoint;

    /**
     * @return The connection endpoint ID for connecting to the domain.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * Options to specify the subnets and security groups for the endpoint.
     * 
     */
    @Export(name="vpcOptions", refs={VpcEndpointVpcOptions.class}, tree="[0]")
    private Output<VpcEndpointVpcOptions> vpcOptions;

    /**
     * @return Options to specify the subnets and security groups for the endpoint.
     * 
     */
    public Output<VpcEndpointVpcOptions> vpcOptions() {
        return this.vpcOptions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcEndpoint(String name) {
        this(name, VpcEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcEndpoint(String name, VpcEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcEndpoint(String name, VpcEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticsearch/vpcEndpoint:VpcEndpoint", name, args == null ? VpcEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcEndpoint(String name, Output<String> id, @Nullable VpcEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticsearch/vpcEndpoint:VpcEndpoint", name, state, makeResourceOptions(options, id));
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
    public static VpcEndpoint get(String name, Output<String> id, @Nullable VpcEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcEndpoint(name, id, state, options);
    }
}
