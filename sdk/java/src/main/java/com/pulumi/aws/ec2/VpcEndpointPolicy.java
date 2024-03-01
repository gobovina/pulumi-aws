// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.VpcEndpointPolicyArgs;
import com.pulumi.aws.ec2.inputs.VpcEndpointPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a VPC Endpoint Policy resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.Ec2Functions;
 * import com.pulumi.aws.ec2.inputs.GetVpcEndpointServiceArgs;
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.ec2.VpcEndpoint;
 * import com.pulumi.aws.ec2.VpcEndpointArgs;
 * import com.pulumi.aws.ec2.VpcEndpointPolicy;
 * import com.pulumi.aws.ec2.VpcEndpointPolicyArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         final var example = Ec2Functions.getVpcEndpointService(GetVpcEndpointServiceArgs.builder()
 *             .service(&#34;dynamodb&#34;)
 *             .build());
 * 
 *         var exampleVpc = new Vpc(&#34;exampleVpc&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var exampleVpcEndpoint = new VpcEndpoint(&#34;exampleVpcEndpoint&#34;, VpcEndpointArgs.builder()        
 *             .serviceName(example.applyValue(getVpcEndpointServiceResult -&gt; getVpcEndpointServiceResult.serviceName()))
 *             .vpcId(exampleVpc.id())
 *             .build());
 * 
 *         var exampleVpcEndpointPolicy = new VpcEndpointPolicy(&#34;exampleVpcEndpointPolicy&#34;, VpcEndpointPolicyArgs.builder()        
 *             .vpcEndpointId(exampleVpcEndpoint.id())
 *             .policy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Version&#34;, &#34;2012-10-17&#34;),
 *                     jsonProperty(&#34;Statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Sid&#34;, &#34;AllowAll&#34;),
 *                         jsonProperty(&#34;Effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;Principal&#34;, jsonObject(
 *                             jsonProperty(&#34;AWS&#34;, &#34;*&#34;)
 *                         )),
 *                         jsonProperty(&#34;Action&#34;, jsonArray(&#34;dynamodb:*&#34;)),
 *                         jsonProperty(&#34;Resource&#34;, &#34;*&#34;)
 *                     )))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import VPC Endpoint Policies using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcEndpointPolicy:VpcEndpointPolicy example vpce-3ecf2a57
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcEndpointPolicy:VpcEndpointPolicy")
public class VpcEndpointPolicy extends com.pulumi.resources.CustomResource {
    /**
     * A policy to attach to the endpoint that controls access to the service. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return A policy to attach to the endpoint that controls access to the service. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * The VPC Endpoint ID.
     * 
     */
    @Export(name="vpcEndpointId", refs={String.class}, tree="[0]")
    private Output<String> vpcEndpointId;

    /**
     * @return The VPC Endpoint ID.
     * 
     */
    public Output<String> vpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcEndpointPolicy(String name) {
        this(name, VpcEndpointPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcEndpointPolicy(String name, VpcEndpointPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcEndpointPolicy(String name, VpcEndpointPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcEndpointPolicy:VpcEndpointPolicy", name, args == null ? VpcEndpointPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcEndpointPolicy(String name, Output<String> id, @Nullable VpcEndpointPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcEndpointPolicy:VpcEndpointPolicy", name, state, makeResourceOptions(options, id));
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
    public static VpcEndpointPolicy get(String name, Output<String> id, @Nullable VpcEndpointPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcEndpointPolicy(name, id, state, options);
    }
}
