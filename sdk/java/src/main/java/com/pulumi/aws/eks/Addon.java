// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.eks.AddonArgs;
import com.pulumi.aws.eks.inputs.AddonState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an EKS add-on.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.eks.Addon;
 * import com.pulumi.aws.eks.AddonArgs;
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
 *         var example = new Addon(&#34;example&#34;, AddonArgs.builder()        
 *             .clusterName(aws_eks_cluster.example().name())
 *             .addonName(&#34;vpc-cni&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Example Update add-on usage with resolve_conflicts_on_update and PRESERVE
 * 
 * `resolve_conflicts_on_update` with `PRESERVE` can be used to retain the config changes applied to the add-on with kubectl while upgrading to a newer version of the add-on.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.eks.Addon;
 * import com.pulumi.aws.eks.AddonArgs;
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
 *         var example = new Addon(&#34;example&#34;, AddonArgs.builder()        
 *             .clusterName(aws_eks_cluster.example().name())
 *             .addonName(&#34;coredns&#34;)
 *             .addonVersion(&#34;v1.10.1-eksbuild.1&#34;)
 *             .resolveConflictsOnUpdate(&#34;PRESERVE&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Example add-on usage with custom configuration_values
 * 
 * Custom add-on configuration can be passed using `configuration_values` as a single JSON string while creating or updating the add-on.
 * 
 * &gt; **Note:** `configuration_values` is a single JSON string should match the valid JSON schema for each add-on with specific version.
 * 
 * To find the correct JSON schema for each add-on can be extracted using [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html) call.
 * This below is an example for extracting the `configuration_values` schema for `coredns`.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
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
 *     }
 * }
 * ```
 * 
 * Example to create a `coredns` managed addon with custom `configuration_values`.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.eks.Addon;
 * import com.pulumi.aws.eks.AddonArgs;
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
 *         var example = new Addon(&#34;example&#34;, AddonArgs.builder()        
 *             .clusterName(&#34;mycluster&#34;)
 *             .addonName(&#34;coredns&#34;)
 *             .addonVersion(&#34;v1.10.1-eksbuild.1&#34;)
 *             .resolveConflictsOnCreate(&#34;OVERWRITE&#34;)
 *             .configurationValues(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;replicaCount&#34;, 4),
 *                     jsonProperty(&#34;resources&#34;, jsonObject(
 *                         jsonProperty(&#34;limits&#34;, jsonObject(
 *                             jsonProperty(&#34;cpu&#34;, &#34;100m&#34;),
 *                             jsonProperty(&#34;memory&#34;, &#34;150Mi&#34;)
 *                         )),
 *                         jsonProperty(&#34;requests&#34;, jsonObject(
 *                             jsonProperty(&#34;cpu&#34;, &#34;100m&#34;),
 *                             jsonProperty(&#34;memory&#34;, &#34;150Mi&#34;)
 *                         ))
 *                     ))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import EKS add-on using the `cluster_name` and `addon_name` separated by a colon (`:`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:eks/addon:Addon my_eks_addon my_cluster_name:my_addon_name
 * ```
 * 
 */
@ResourceType(type="aws:eks/addon:Addon")
public class Addon extends com.pulumi.resources.CustomResource {
    /**
     * Name of the EKS add-on. The name must match one of
     * the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     * 
     */
    @Export(name="addonName", refs={String.class}, tree="[0]")
    private Output<String> addonName;

    /**
     * @return Name of the EKS add-on. The name must match one of
     * the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     * 
     */
    public Output<String> addonName() {
        return this.addonName;
    }
    /**
     * The version of the EKS add-on. The version must
     * match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     * 
     */
    @Export(name="addonVersion", refs={String.class}, tree="[0]")
    private Output<String> addonVersion;

    /**
     * @return The version of the EKS add-on. The version must
     * match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     * 
     */
    public Output<String> addonVersion() {
        return this.addonVersion;
    }
    /**
     * Amazon Resource Name (ARN) of the EKS add-on.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the EKS add-on.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="clusterName", refs={String.class}, tree="[0]")
    private Output<String> clusterName;

    /**
     * @return Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * custom configuration values for addons with single JSON string. This JSON string value must match the JSON schema derived from [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html).
     * 
     */
    @Export(name="configurationValues", refs={String.class}, tree="[0]")
    private Output<String> configurationValues;

    /**
     * @return custom configuration values for addons with single JSON string. This JSON string value must match the JSON schema derived from [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html).
     * 
     */
    public Output<String> configurationValues() {
        return this.configurationValues;
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
     * Indicates if you want to preserve the created resources when deleting the EKS add-on.
     * 
     */
    @Export(name="preserve", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> preserve;

    /**
     * @return Indicates if you want to preserve the created resources when deleting the EKS add-on.
     * 
     */
    public Output<Optional<Boolean>> preserve() {
        return Codegen.optional(this.preserve);
    }
    /**
     * Define how to resolve parameter value conflicts when migrating an existing add-on to an Amazon EKS add-on or when applying version updates to the add-on. Valid values are `NONE`, `OVERWRITE` and `PRESERVE`. Note that `PRESERVE` is only valid on addon update, not for initial addon creation. If you need to set this to `PRESERVE`, use the `resolve_conflicts_on_create` and `resolve_conflicts_on_update` attributes instead. For more details check [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
     * 
     * @deprecated
     * The &#34;resolve_conflicts&#34; attribute can&#39;t be set to &#34;PRESERVE&#34; on initial resource creation. Use &#34;resolve_conflicts_on_create&#34; and/or &#34;resolve_conflicts_on_update&#34; instead
     * 
     */
    @Deprecated /* The ""resolve_conflicts"" attribute can't be set to ""PRESERVE"" on initial resource creation. Use ""resolve_conflicts_on_create"" and/or ""resolve_conflicts_on_update"" instead */
    @Export(name="resolveConflicts", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> resolveConflicts;

    /**
     * @return Define how to resolve parameter value conflicts when migrating an existing add-on to an Amazon EKS add-on or when applying version updates to the add-on. Valid values are `NONE`, `OVERWRITE` and `PRESERVE`. Note that `PRESERVE` is only valid on addon update, not for initial addon creation. If you need to set this to `PRESERVE`, use the `resolve_conflicts_on_create` and `resolve_conflicts_on_update` attributes instead. For more details check [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
     * 
     */
    public Output<Optional<String>> resolveConflicts() {
        return Codegen.optional(this.resolveConflicts);
    }
    /**
     * How to resolve field value conflicts when migrating a self-managed add-on to an Amazon EKS add-on. Valid values are `NONE` and `OVERWRITE`. For more details see the [CreateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_CreateAddon.html) API Docs.
     * 
     */
    @Export(name="resolveConflictsOnCreate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> resolveConflictsOnCreate;

    /**
     * @return How to resolve field value conflicts when migrating a self-managed add-on to an Amazon EKS add-on. Valid values are `NONE` and `OVERWRITE`. For more details see the [CreateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_CreateAddon.html) API Docs.
     * 
     */
    public Output<Optional<String>> resolveConflictsOnCreate() {
        return Codegen.optional(this.resolveConflictsOnCreate);
    }
    /**
     * How to resolve field value conflicts for an Amazon EKS add-on if you&#39;ve changed a value from the Amazon EKS default value. Valid values are `NONE`, `OVERWRITE`, and `PRESERVE`. For more details see the [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
     * 
     */
    @Export(name="resolveConflictsOnUpdate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> resolveConflictsOnUpdate;

    /**
     * @return How to resolve field value conflicts for an Amazon EKS add-on if you&#39;ve changed a value from the Amazon EKS default value. Valid values are `NONE`, `OVERWRITE`, and `PRESERVE`. For more details see the [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
     * 
     */
    public Output<Optional<String>> resolveConflictsOnUpdate() {
        return Codegen.optional(this.resolveConflictsOnUpdate);
    }
    /**
     * The Amazon Resource Name (ARN) of an
     * existing IAM role to bind to the add-on&#39;s service account. The role must be
     * assigned the IAM permissions required by the add-on. If you don&#39;t specify
     * an existing IAM role, then the add-on uses the permissions assigned to the node
     * IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
     * in the Amazon EKS User Guide.
     * 
     * &gt; **Note:** To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC)
     * provider created for your cluster. For more information, [see Enabling IAM roles
     * for service accounts on your cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
     * in the Amazon EKS User Guide.
     * 
     */
    @Export(name="serviceAccountRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serviceAccountRoleArn;

    /**
     * @return The Amazon Resource Name (ARN) of an
     * existing IAM role to bind to the add-on&#39;s service account. The role must be
     * assigned the IAM permissions required by the add-on. If you don&#39;t specify
     * an existing IAM role, then the add-on uses the permissions assigned to the node
     * IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
     * in the Amazon EKS User Guide.
     * 
     * &gt; **Note:** To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC)
     * provider created for your cluster. For more information, [see Enabling IAM roles
     * for service accounts on your cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
     * in the Amazon EKS User Guide.
     * 
     */
    public Output<Optional<String>> serviceAccountRoleArn() {
        return Codegen.optional(this.serviceAccountRoleArn);
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Addon(String name) {
        this(name, AddonArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Addon(String name, AddonArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Addon(String name, AddonArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:eks/addon:Addon", name, args == null ? AddonArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Addon(String name, Output<String> id, @Nullable AddonState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:eks/addon:Addon", name, state, makeResourceOptions(options, id));
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
    public static Addon get(String name, Output<String> id, @Nullable AddonState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Addon(name, id, state, options);
    }
}
