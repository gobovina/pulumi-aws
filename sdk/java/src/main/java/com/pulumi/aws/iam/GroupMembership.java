// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iam.GroupMembershipArgs;
import com.pulumi.aws.iam.inputs.GroupMembershipState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * &gt; **WARNING:** Multiple aws.iam.GroupMembership resources with the same group name will produce inconsistent behavior!
 * 
 * Provides a top level resource to manage IAM Group membership for IAM Users. For
 * more information on managing IAM Groups or IAM Users, see IAM Groups or
 * IAM Users
 * 
 * &gt; **Note:** `aws.iam.GroupMembership` will conflict with itself if used more than once with the same group. To non-exclusively manage the users in a group, see the
 * `aws.iam.UserGroupMembership` resource.
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
 * import com.pulumi.aws.iam.Group;
 * import com.pulumi.aws.iam.GroupArgs;
 * import com.pulumi.aws.iam.User;
 * import com.pulumi.aws.iam.UserArgs;
 * import com.pulumi.aws.iam.GroupMembership;
 * import com.pulumi.aws.iam.GroupMembershipArgs;
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
 *         var group = new Group("group", GroupArgs.builder()
 *             .name("test-group")
 *             .build());
 * 
 *         var userOne = new User("userOne", UserArgs.builder()
 *             .name("test-user")
 *             .build());
 * 
 *         var userTwo = new User("userTwo", UserArgs.builder()
 *             .name("test-user-two")
 *             .build());
 * 
 *         var team = new GroupMembership("team", GroupMembershipArgs.builder()
 *             .name("tf-testing-group-membership")
 *             .users(            
 *                 userOne.name(),
 *                 userTwo.name())
 *             .group(group.name())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="aws:iam/groupMembership:GroupMembership")
public class GroupMembership extends com.pulumi.resources.CustomResource {
    /**
     * The IAM Group name to attach the list of `users` to
     * 
     */
    @Export(name="group", refs={String.class}, tree="[0]")
    private Output<String> group;

    /**
     * @return The IAM Group name to attach the list of `users` to
     * 
     */
    public Output<String> group() {
        return this.group;
    }
    /**
     * The name to identify the Group Membership
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name to identify the Group Membership
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of IAM User names to associate with the Group
     * 
     */
    @Export(name="users", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> users;

    /**
     * @return A list of IAM User names to associate with the Group
     * 
     */
    public Output<List<String>> users() {
        return this.users;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GroupMembership(String name) {
        this(name, GroupMembershipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GroupMembership(String name, GroupMembershipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupMembership(String name, GroupMembershipArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/groupMembership:GroupMembership", name, args == null ? GroupMembershipArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GroupMembership(String name, Output<String> id, @Nullable GroupMembershipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/groupMembership:GroupMembership", name, state, makeResourceOptions(options, id));
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
    public static GroupMembership get(String name, Output<String> id, @Nullable GroupMembershipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GroupMembership(name, id, state, options);
    }
}
