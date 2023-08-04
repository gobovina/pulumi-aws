// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.opensearch.ServerlessVpcEndpointArgs;
import com.pulumi.aws.opensearch.inputs.ServerlessVpcEndpointState;
import com.pulumi.aws.opensearch.outputs.ServerlessVpcEndpointTimeouts;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS OpenSearchServerless VPC Endpoint.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.opensearch.ServerlessVpcEndpoint;
 * import com.pulumi.aws.opensearch.ServerlessVpcEndpointArgs;
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
 *         var example = new ServerlessVpcEndpoint(&#34;example&#34;, ServerlessVpcEndpointArgs.builder()        
 *             .subnetIds(aws_subnet.example().id())
 *             .vpcId(aws_vpc.example().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * terraform import {
 * 
 *  to = aws_opensearchserverless_vpc_endpoint.example
 * 
 *  id = &#34;vpce-8012925589&#34; } Using `pulumi import`, import OpenSearchServerless Vpc Endpointa using the `id`. For exampleconsole % pulumi import aws_opensearchserverless_vpc_endpoint.example vpce-8012925589
 * 
 */
@ResourceType(type="aws:opensearch/serverlessVpcEndpoint:ServerlessVpcEndpoint")
public class ServerlessVpcEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * Name of the interface endpoint.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the interface endpoint.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * One or more security groups that define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint. Up to 5 security groups can be provided.
     * 
     */
    @Export(name="securityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityGroupIds;

    /**
     * @return One or more security groups that define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint. Up to 5 security groups can be provided.
     * 
     */
    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * One or more subnet IDs from which you&#39;ll access OpenSearch Serverless. Up to 6 subnets can be provided.
     * 
     */
    @Export(name="subnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subnetIds;

    /**
     * @return One or more subnet IDs from which you&#39;ll access OpenSearch Serverless. Up to 6 subnets can be provided.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    @Export(name="timeouts", refs={ServerlessVpcEndpointTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ ServerlessVpcEndpointTimeouts> timeouts;

    public Output<Optional<ServerlessVpcEndpointTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }
    /**
     * ID of the VPC from which you&#39;ll access OpenSearch Serverless.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return ID of the VPC from which you&#39;ll access OpenSearch Serverless.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerlessVpcEndpoint(String name) {
        this(name, ServerlessVpcEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerlessVpcEndpoint(String name, ServerlessVpcEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerlessVpcEndpoint(String name, ServerlessVpcEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearch/serverlessVpcEndpoint:ServerlessVpcEndpoint", name, args == null ? ServerlessVpcEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerlessVpcEndpoint(String name, Output<String> id, @Nullable ServerlessVpcEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearch/serverlessVpcEndpoint:ServerlessVpcEndpoint", name, state, makeResourceOptions(options, id));
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
    public static ServerlessVpcEndpoint get(String name, Output<String> id, @Nullable ServerlessVpcEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerlessVpcEndpoint(name, id, state, options);
    }
}
