// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ecr.LifecyclePolicyArgs;
import com.pulumi.aws.ecr.inputs.LifecyclePolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an ECR repository lifecycle policy.
 * 
 * &gt; **NOTE:** Only one `aws.ecr.LifecyclePolicy` resource can be used with the same ECR repository. To apply multiple rules, they must be combined in the `policy` JSON.
 * 
 * &gt; **NOTE:** The AWS ECR API seems to reorder rules based on `rulePriority`. If you define multiple rules that are not sorted in ascending `rulePriority` order in the this provider code, the resource will be flagged for recreation every deployment.
 * 
 * ## Example Usage
 * 
 * ### Policy on untagged image
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecr.Repository;
 * import com.pulumi.aws.ecr.RepositoryArgs;
 * import com.pulumi.aws.ecr.LifecyclePolicy;
 * import com.pulumi.aws.ecr.LifecyclePolicyArgs;
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
 *         var example = new Repository("example", RepositoryArgs.builder()
 *             .name("example-repo")
 *             .build());
 * 
 *         var exampleLifecyclePolicy = new LifecyclePolicy("exampleLifecyclePolicy", LifecyclePolicyArgs.builder()
 *             .repository(example.name())
 *             .policy("""
 * {
 *     "rules": [
 *         {
 *             "rulePriority": 1,
 *             "description": "Expire images older than 14 days",
 *             "selection": {
 *                 "tagStatus": "untagged",
 *                 "countType": "sinceImagePushed",
 *                 "countUnit": "days",
 *                 "countNumber": 14
 *             },
 *             "action": {
 *                 "type": "expire"
 *             }
 *         }
 *     ]
 * }
 *             """)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Policy on tagged image
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecr.Repository;
 * import com.pulumi.aws.ecr.RepositoryArgs;
 * import com.pulumi.aws.ecr.LifecyclePolicy;
 * import com.pulumi.aws.ecr.LifecyclePolicyArgs;
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
 *         var example = new Repository("example", RepositoryArgs.builder()
 *             .name("example-repo")
 *             .build());
 * 
 *         var exampleLifecyclePolicy = new LifecyclePolicy("exampleLifecyclePolicy", LifecyclePolicyArgs.builder()
 *             .repository(example.name())
 *             .policy("""
 * {
 *     "rules": [
 *         {
 *             "rulePriority": 1,
 *             "description": "Keep last 30 images",
 *             "selection": {
 *                 "tagStatus": "tagged",
 *                 "tagPrefixList": ["v"],
 *                 "countType": "imageCountMoreThan",
 *                 "countNumber": 30
 *             },
 *             "action": {
 *                 "type": "expire"
 *             }
 *         }
 *     ]
 * }
 *             """)
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
 * Using `pulumi import`, import ECR Lifecycle Policy using the name of the repository. For example:
 * 
 * ```sh
 * $ pulumi import aws:ecr/lifecyclePolicy:LifecyclePolicy example tf-example
 * ```
 * 
 */
@ResourceType(type="aws:ecr/lifecyclePolicy:LifecyclePolicy")
public class LifecyclePolicy extends com.pulumi.resources.CustomResource {
    /**
     * The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs. Consider using the `aws.ecr.getLifecyclePolicyDocument` data_source to generate/manage the JSON document used for the `policy` argument.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs. Consider using the `aws.ecr.getLifecyclePolicyDocument` data_source to generate/manage the JSON document used for the `policy` argument.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * The registry ID where the repository was created.
     * 
     */
    @Export(name="registryId", refs={String.class}, tree="[0]")
    private Output<String> registryId;

    /**
     * @return The registry ID where the repository was created.
     * 
     */
    public Output<String> registryId() {
        return this.registryId;
    }
    /**
     * Name of the repository to apply the policy.
     * 
     */
    @Export(name="repository", refs={String.class}, tree="[0]")
    private Output<String> repository;

    /**
     * @return Name of the repository to apply the policy.
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LifecyclePolicy(String name) {
        this(name, LifecyclePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LifecyclePolicy(String name, LifecyclePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LifecyclePolicy(String name, LifecyclePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecr/lifecyclePolicy:LifecyclePolicy", name, args == null ? LifecyclePolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LifecyclePolicy(String name, Output<String> id, @Nullable LifecyclePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecr/lifecyclePolicy:LifecyclePolicy", name, state, makeResourceOptions(options, id));
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
    public static LifecyclePolicy get(String name, Output<String> id, @Nullable LifecyclePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LifecyclePolicy(name, id, state, options);
    }
}
