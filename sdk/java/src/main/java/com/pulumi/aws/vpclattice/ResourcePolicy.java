// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.vpclattice;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.vpclattice.ResourcePolicyArgs;
import com.pulumi.aws.vpclattice.inputs.ResourcePolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS VPC Lattice Resource Policy.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetCallerIdentityArgs;
 * import com.pulumi.aws.inputs.GetPartitionArgs;
 * import com.pulumi.aws.vpclattice.ServiceNetwork;
 * import com.pulumi.aws.vpclattice.ServiceNetworkArgs;
 * import com.pulumi.aws.vpclattice.ResourcePolicy;
 * import com.pulumi.aws.vpclattice.ResourcePolicyArgs;
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
 *         final var current = AwsFunctions.getCallerIdentity();
 * 
 *         final var currentGetPartition = AwsFunctions.getPartition();
 * 
 *         var example = new ServiceNetwork(&#34;example&#34;, ServiceNetworkArgs.builder()        
 *             .name(&#34;example-vpclattice-service-network&#34;)
 *             .build());
 * 
 *         var exampleResourcePolicy = new ResourcePolicy(&#34;exampleResourcePolicy&#34;, ResourcePolicyArgs.builder()        
 *             .resourceArn(example.arn())
 *             .policy(example.arn().applyValue(arn -&gt; serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;version&#34;, &#34;2012-10-17&#34;),
 *                     jsonProperty(&#34;statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;sid&#34;, &#34;test-pol-principals-6&#34;),
 *                         jsonProperty(&#34;effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;principal&#34;, jsonObject(
 *                             jsonProperty(&#34;AWS&#34;, String.format(&#34;arn:%s:iam::%s:root&#34;, currentGetPartition.applyValue(getPartitionResult -&gt; getPartitionResult.partition()),current.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId())))
 *                         )),
 *                         jsonProperty(&#34;action&#34;, jsonArray(
 *                             &#34;vpc-lattice:CreateServiceNetworkVpcAssociation&#34;, 
 *                             &#34;vpc-lattice:CreateServiceNetworkServiceAssociation&#34;, 
 *                             &#34;vpc-lattice:GetServiceNetwork&#34;
 *                         )),
 *                         jsonProperty(&#34;resource&#34;, arn)
 *                     )))
 *                 ))))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import VPC Lattice Resource Policy using the `resource_arn`. For example:
 * 
 * ```sh
 * $ pulumi import aws:vpclattice/resourcePolicy:ResourcePolicy example rft-8012925589
 * ```
 * 
 */
@ResourceType(type="aws:vpclattice/resourcePolicy:ResourcePolicy")
public class ResourcePolicy extends com.pulumi.resources.CustomResource {
    /**
     * An IAM policy. The policy string in JSON must not contain newlines or blank lines.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return An IAM policy. The policy string in JSON must not contain newlines or blank lines.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
     * 
     */
    @Export(name="resourceArn", refs={String.class}, tree="[0]")
    private Output<String> resourceArn;

    /**
     * @return The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourcePolicy(String name) {
        this(name, ResourcePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourcePolicy(String name, ResourcePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourcePolicy(String name, ResourcePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:vpclattice/resourcePolicy:ResourcePolicy", name, args == null ? ResourcePolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourcePolicy(String name, Output<String> id, @Nullable ResourcePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:vpclattice/resourcePolicy:ResourcePolicy", name, state, makeResourceOptions(options, id));
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
    public static ResourcePolicy get(String name, Output<String> id, @Nullable ResourcePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourcePolicy(name, id, state, options);
    }
}
