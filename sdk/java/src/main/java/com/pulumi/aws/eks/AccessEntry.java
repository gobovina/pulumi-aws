// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.eks.AccessEntryArgs;
import com.pulumi.aws.eks.inputs.AccessEntryState;
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
 * Access Entry Configurations for an EKS Cluster.
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
 * import com.pulumi.aws.eks.AccessEntry;
 * import com.pulumi.aws.eks.AccessEntryArgs;
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
 *         var example = new AccessEntry("example", AccessEntryArgs.builder()
 *             .clusterName(exampleAwsEksCluster.name())
 *             .principalArn(exampleAwsIamRole.arn())
 *             .kubernetesGroups(            
 *                 "group-1",
 *                 "group-2")
 *             .type("STANDARD")
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
 * Using `pulumi import`, import EKS access entry using the `cluster_name` and `principal_arn` separated by a colon (`:`). For example:
 * 
 * ```sh
 * $ pulumi import aws:eks/accessEntry:AccessEntry my_eks_access_entry my_cluster_name:my_principal_arn
 * ```
 * 
 */
@ResourceType(type="aws:eks/accessEntry:AccessEntry")
public class AccessEntry extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the Access Entry.
     * 
     */
    @Export(name="accessEntryArn", refs={String.class}, tree="[0]")
    private Output<String> accessEntryArn;

    /**
     * @return Amazon Resource Name (ARN) of the Access Entry.
     * 
     */
    public Output<String> accessEntryArn() {
        return this.accessEntryArn;
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
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * List of string which can optionally specify the Kubernetes groups the user would belong to when creating an access entry.
     * 
     */
    @Export(name="kubernetesGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> kubernetesGroups;

    /**
     * @return List of string which can optionally specify the Kubernetes groups the user would belong to when creating an access entry.
     * 
     */
    public Output<List<String>> kubernetesGroups() {
        return this.kubernetesGroups;
    }
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
     * 
     */
    @Export(name="modifiedAt", refs={String.class}, tree="[0]")
    private Output<String> modifiedAt;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
     * 
     */
    public Output<String> modifiedAt() {
        return this.modifiedAt;
    }
    /**
     * The IAM Principal ARN which requires Authentication access to the EKS cluster.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="principalArn", refs={String.class}, tree="[0]")
    private Output<String> principalArn;

    /**
     * @return The IAM Principal ARN which requires Authentication access to the EKS cluster.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> principalArn() {
        return this.principalArn;
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
     * (Optional) Key-value map of resource tags, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return (Optional) Key-value map of resource tags, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Defaults to STANDARD which provides the standard workflow. EC2_LINUX, EC2_WINDOWS, FARGATE_LINUX types disallow users to input a username or groups, and prevent associations.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return Defaults to STANDARD which provides the standard workflow. EC2_LINUX, EC2_WINDOWS, FARGATE_LINUX types disallow users to input a username or groups, and prevent associations.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * Defaults to principal ARN if user is principal else defaults to assume-role/session-name is role is used.
     * 
     */
    @Export(name="userName", refs={String.class}, tree="[0]")
    private Output<String> userName;

    /**
     * @return Defaults to principal ARN if user is principal else defaults to assume-role/session-name is role is used.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessEntry(String name) {
        this(name, AccessEntryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessEntry(String name, AccessEntryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessEntry(String name, AccessEntryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:eks/accessEntry:AccessEntry", name, args == null ? AccessEntryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessEntry(String name, Output<String> id, @Nullable AccessEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:eks/accessEntry:AccessEntry", name, state, makeResourceOptions(options, id));
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
    public static AccessEntry get(String name, Output<String> id, @Nullable AccessEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessEntry(name, id, state, options);
    }
}
