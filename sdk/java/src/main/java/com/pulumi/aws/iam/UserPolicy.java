// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iam.UserPolicyArgs;
import com.pulumi.aws.iam.inputs.UserPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an IAM policy attached to a user.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.User;
 * import com.pulumi.aws.iam.UserArgs;
 * import com.pulumi.aws.iam.UserPolicy;
 * import com.pulumi.aws.iam.UserPolicyArgs;
 * import com.pulumi.aws.iam.AccessKey;
 * import com.pulumi.aws.iam.AccessKeyArgs;
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
 *         var lb = new User(&#34;lb&#34;, UserArgs.builder()        
 *             .name(&#34;loadbalancer&#34;)
 *             .path(&#34;/system/&#34;)
 *             .build());
 * 
 *         var lbRo = new UserPolicy(&#34;lbRo&#34;, UserPolicyArgs.builder()        
 *             .name(&#34;test&#34;)
 *             .user(lb.name())
 *             .policy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;version&#34;, &#34;2012-10-17&#34;),
 *                     jsonProperty(&#34;statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;action&#34;, jsonArray(&#34;ec2:Describe*&#34;)),
 *                         jsonProperty(&#34;effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;resource&#34;, &#34;*&#34;)
 *                     )))
 *                 )))
 *             .build());
 * 
 *         var lbAccessKey = new AccessKey(&#34;lbAccessKey&#34;, AccessKeyArgs.builder()        
 *             .user(lb.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import IAM User Policies using the `user_name:user_policy_name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:iam/userPolicy:UserPolicy mypolicy user_of_mypolicy_name:mypolicy_name
 * ```
 * 
 */
@ResourceType(type="aws:iam/userPolicy:UserPolicy")
public class UserPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The name of the policy. If omitted, the provider will assign a random, unique name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the policy. If omitted, the provider will assign a random, unique name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", refs={String.class}, tree="[0]")
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * The policy document. This is a JSON formatted string.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return The policy document. This is a JSON formatted string.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * IAM user to which to attach this policy.
     * 
     */
    @Export(name="user", refs={String.class}, tree="[0]")
    private Output<String> user;

    /**
     * @return IAM user to which to attach this policy.
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserPolicy(String name) {
        this(name, UserPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserPolicy(String name, UserPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserPolicy(String name, UserPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/userPolicy:UserPolicy", name, args == null ? UserPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserPolicy(String name, Output<String> id, @Nullable UserPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/userPolicy:UserPolicy", name, state, makeResourceOptions(options, id));
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
    public static UserPolicy get(String name, Output<String> id, @Nullable UserPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserPolicy(name, id, state, options);
    }
}
