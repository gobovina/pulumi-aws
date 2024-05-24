// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.eks.FargateProfileArgs;
import com.pulumi.aws.eks.inputs.FargateProfileState;
import com.pulumi.aws.eks.outputs.FargateProfileSelector;
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
 * Manages an EKS Fargate Profile.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.eks.FargateProfile;
 * import com.pulumi.aws.eks.FargateProfileArgs;
 * import com.pulumi.aws.eks.inputs.FargateProfileSelectorArgs;
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
 *         var example = new FargateProfile("example", FargateProfileArgs.builder()
 *             .clusterName(exampleAwsEksCluster.name())
 *             .fargateProfileName("example")
 *             .podExecutionRoleArn(exampleAwsIamRole.arn())
 *             .subnetIds(exampleAwsSubnet.stream().map(element -> element.id()).collect(toList()))
 *             .selectors(FargateProfileSelectorArgs.builder()
 *                 .namespace("example")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example IAM Role for EKS Fargate Profile
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.iam.RolePolicyAttachment;
 * import com.pulumi.aws.iam.RolePolicyAttachmentArgs;
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
 *         var example = new Role("example", RoleArgs.builder()
 *             .name("eks-fargate-profile-example")
 *             .assumeRolePolicy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty("Statement", jsonArray(jsonObject(
 *                         jsonProperty("Action", "sts:AssumeRole"),
 *                         jsonProperty("Effect", "Allow"),
 *                         jsonProperty("Principal", jsonObject(
 *                             jsonProperty("Service", "eks-fargate-pods.amazonaws.com")
 *                         ))
 *                     ))),
 *                     jsonProperty("Version", "2012-10-17")
 *                 )))
 *             .build());
 * 
 *         var example_AmazonEKSFargatePodExecutionRolePolicy = new RolePolicyAttachment("example-AmazonEKSFargatePodExecutionRolePolicy", RolePolicyAttachmentArgs.builder()
 *             .policyArn("arn:aws:iam::aws:policy/AmazonEKSFargatePodExecutionRolePolicy")
 *             .role(example.name())
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
 * Using `pulumi import`, import EKS Fargate Profiles using the `cluster_name` and `fargate_profile_name` separated by a colon (`:`). For example:
 * 
 * ```sh
 * $ pulumi import aws:eks/fargateProfile:FargateProfile my_fargate_profile my_cluster:my_fargate_profile
 * ```
 * 
 */
@ResourceType(type="aws:eks/fargateProfile:FargateProfile")
public class FargateProfile extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the EKS Fargate Profile.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the EKS Fargate Profile.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Name of the EKS Cluster.
     * 
     */
    @Export(name="clusterName", refs={String.class}, tree="[0]")
    private Output<String> clusterName;

    /**
     * @return Name of the EKS Cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * Name of the EKS Fargate Profile.
     * 
     */
    @Export(name="fargateProfileName", refs={String.class}, tree="[0]")
    private Output<String> fargateProfileName;

    /**
     * @return Name of the EKS Fargate Profile.
     * 
     */
    public Output<String> fargateProfileName() {
        return this.fargateProfileName;
    }
    /**
     * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
     * 
     */
    @Export(name="podExecutionRoleArn", refs={String.class}, tree="[0]")
    private Output<String> podExecutionRoleArn;

    /**
     * @return Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
     * 
     */
    public Output<String> podExecutionRoleArn() {
        return this.podExecutionRoleArn;
    }
    /**
     * Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
     * 
     */
    @Export(name="selectors", refs={List.class,FargateProfileSelector.class}, tree="[0,1]")
    private Output<List<FargateProfileSelector>> selectors;

    /**
     * @return Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
     * 
     */
    public Output<List<FargateProfileSelector>> selectors() {
        return this.selectors;
    }
    /**
     * Status of the EKS Fargate Profile.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the EKS Fargate Profile.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="subnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> subnetIds;

    /**
     * @return Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
     * 
     * The following arguments are optional:
     * 
     */
    public Output<Optional<List<String>>> subnetIds() {
        return Codegen.optional(this.subnetIds);
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public FargateProfile(String name) {
        this(name, FargateProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FargateProfile(String name, FargateProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FargateProfile(String name, FargateProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:eks/fargateProfile:FargateProfile", name, args == null ? FargateProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FargateProfile(String name, Output<String> id, @Nullable FargateProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:eks/fargateProfile:FargateProfile", name, state, makeResourceOptions(options, id));
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
    public static FargateProfile get(String name, Output<String> id, @Nullable FargateProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FargateProfile(name, id, state, options);
    }
}
