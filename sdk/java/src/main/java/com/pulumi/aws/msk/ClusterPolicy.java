// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.msk.ClusterPolicyArgs;
import com.pulumi.aws.msk.inputs.ClusterPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS Managed Streaming for Kafka Cluster Policy.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetCallerIdentityArgs;
 * import com.pulumi.aws.inputs.GetPartitionArgs;
 * import com.pulumi.aws.msk.ClusterPolicy;
 * import com.pulumi.aws.msk.ClusterPolicyArgs;
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
 *         var example = new ClusterPolicy("example", ClusterPolicyArgs.builder()
 *             .clusterArn(exampleAwsMskCluster.arn())
 *             .policy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty("Version", "2012-10-17"),
 *                     jsonProperty("Statement", jsonArray(jsonObject(
 *                         jsonProperty("Sid", "ExampleMskClusterPolicy"),
 *                         jsonProperty("Effect", "Allow"),
 *                         jsonProperty("Principal", jsonObject(
 *                             jsonProperty("AWS", String.format("arn:%s:iam::%s:root", currentGetPartition.applyValue(getPartitionResult -> getPartitionResult.partition()),current.applyValue(getCallerIdentityResult -> getCallerIdentityResult.accountId())))
 *                         )),
 *                         jsonProperty("Action", jsonArray(
 *                             "kafka:Describe*", 
 *                             "kafka:Get*", 
 *                             "kafka:CreateVpcConnection", 
 *                             "kafka:GetBootstrapBrokers"
 *                         )),
 *                         jsonProperty("Resource", exampleAwsMskCluster.arn())
 *                     )))
 *                 )))
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
 * Using `pulumi import`, import Managed Streaming for Kafka Cluster Policy using the `cluster_arn`. For example:
 * 
 * ```sh
 * $ pulumi import aws:msk/clusterPolicy:ClusterPolicy example arn:aws:kafka:us-west-2:123456789012:cluster/example/279c0212-d057-4dba-9aa9-1c4e5a25bfc7-3
 * ```
 * 
 */
@ResourceType(type="aws:msk/clusterPolicy:ClusterPolicy")
public class ClusterPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * 
     */
    @Export(name="clusterArn", refs={String.class}, tree="[0]")
    private Output<String> clusterArn;

    /**
     * @return The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * 
     */
    public Output<String> clusterArn() {
        return this.clusterArn;
    }
    @Export(name="currentVersion", refs={String.class}, tree="[0]")
    private Output<String> currentVersion;

    public Output<String> currentVersion() {
        return this.currentVersion;
    }
    /**
     * Resource policy for cluster.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return Resource policy for cluster.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterPolicy(String name) {
        this(name, ClusterPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterPolicy(String name, ClusterPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterPolicy(String name, ClusterPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/clusterPolicy:ClusterPolicy", name, args == null ? ClusterPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterPolicy(String name, Output<String> id, @Nullable ClusterPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/clusterPolicy:ClusterPolicy", name, state, makeResourceOptions(options, id));
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
    public static ClusterPolicy get(String name, Output<String> id, @Nullable ClusterPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterPolicy(name, id, state, options);
    }
}
