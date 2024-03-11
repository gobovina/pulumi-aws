// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iam.UserArgs;
import com.pulumi.aws.iam.inputs.UserState;
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
 * Provides an IAM user.
 * 
 * &gt; *NOTE:* If policies are attached to the user via the `aws.iam.PolicyAttachment` resource and you are modifying the user `name` or `path`, the `force_destroy` argument must be set to `true` and applied before attempting the operation otherwise you will encounter a `DeleteConflict` error. The `aws.iam.UserPolicyAttachment` resource (recommended) does not have this requirement.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.User;
 * import com.pulumi.aws.iam.UserArgs;
 * import com.pulumi.aws.iam.AccessKey;
 * import com.pulumi.aws.iam.AccessKeyArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.UserPolicy;
 * import com.pulumi.aws.iam.UserPolicyArgs;
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
 *         var lb = new User(&#34;lb&#34;, UserArgs.builder()        
 *             .name(&#34;loadbalancer&#34;)
 *             .path(&#34;/system/&#34;)
 *             .tags(Map.of(&#34;tag-key&#34;, &#34;tag-value&#34;))
 *             .build());
 * 
 *         var lbAccessKey = new AccessKey(&#34;lbAccessKey&#34;, AccessKeyArgs.builder()        
 *             .user(lb.name())
 *             .build());
 * 
 *         final var lbRo = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(&#34;ec2:Describe*&#34;)
 *                 .resources(&#34;*&#34;)
 *                 .build())
 *             .build());
 * 
 *         var lbRoUserPolicy = new UserPolicy(&#34;lbRoUserPolicy&#34;, UserPolicyArgs.builder()        
 *             .name(&#34;test&#34;)
 *             .user(lb.name())
 *             .policy(lbRo.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import IAM Users using the `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:iam/user:User lb loadbalancer
 * ```
 * 
 */
@ResourceType(type="aws:iam/user:User")
public class User extends com.pulumi.resources.CustomResource {
    /**
     * The ARN assigned by AWS for this user.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN assigned by AWS for this user.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * When destroying this user, destroy even if it
     * has non-provider-managed IAM access keys, login profile or MFA devices. Without `force_destroy`
     * a user with non-provider-managed access keys and login profile will fail to be destroyed.
     * 
     */
    @Export(name="forceDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return When destroying this user, destroy even if it
     * has non-provider-managed IAM access keys, login profile or MFA devices. Without `force_destroy`
     * a user with non-provider-managed access keys and login profile will fail to be destroyed.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * The user&#39;s name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. User names are not distinguished by case. For example, you cannot create users named both &#34;TESTUSER&#34; and &#34;testuser&#34;.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The user&#39;s name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. User names are not distinguished by case. For example, you cannot create users named both &#34;TESTUSER&#34; and &#34;testuser&#34;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Path in which to create the user.
     * 
     */
    @Export(name="path", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> path;

    /**
     * @return Path in which to create the user.
     * 
     */
    public Output<Optional<String>> path() {
        return Codegen.optional(this.path);
    }
    /**
     * The ARN of the policy that is used to set the permissions boundary for the user.
     * 
     */
    @Export(name="permissionsBoundary", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> permissionsBoundary;

    /**
     * @return The ARN of the policy that is used to set the permissions boundary for the user.
     * 
     */
    public Output<Optional<String>> permissionsBoundary() {
        return Codegen.optional(this.permissionsBoundary);
    }
    /**
     * Key-value mapping of tags for the IAM user. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of tags for the IAM user. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The [unique ID][1] assigned by AWS.
     * 
     */
    @Export(name="uniqueId", refs={String.class}, tree="[0]")
    private Output<String> uniqueId;

    /**
     * @return The [unique ID][1] assigned by AWS.
     * 
     */
    public Output<String> uniqueId() {
        return this.uniqueId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(String name, @Nullable UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, @Nullable UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/user:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private User(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/user:User", name, state, makeResourceOptions(options, id));
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
    public static User get(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}
