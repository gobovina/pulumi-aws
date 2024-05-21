// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloud9;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloud9.EnvironmentMembershipArgs;
import com.pulumi.aws.cloud9.inputs.EnvironmentMembershipState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an environment member to an AWS Cloud9 development environment.
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
 * import com.pulumi.aws.cloud9.EnvironmentEC2;
 * import com.pulumi.aws.cloud9.EnvironmentEC2Args;
 * import com.pulumi.aws.iam.User;
 * import com.pulumi.aws.iam.UserArgs;
 * import com.pulumi.aws.cloud9.EnvironmentMembership;
 * import com.pulumi.aws.cloud9.EnvironmentMembershipArgs;
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
 *         var test = new EnvironmentEC2("test", EnvironmentEC2Args.builder()        
 *             .instanceType("t2.micro")
 *             .name("some-env")
 *             .build());
 * 
 *         var testUser = new User("testUser", UserArgs.builder()        
 *             .name("some-user")
 *             .build());
 * 
 *         var testEnvironmentMembership = new EnvironmentMembership("testEnvironmentMembership", EnvironmentMembershipArgs.builder()        
 *             .environmentId(test.id())
 *             .permissions("read-only")
 *             .userArn(testUser.arn())
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
 * Using `pulumi import`, import Cloud9 environment membership using the `environment-id#user-arn`. For example:
 * 
 * ```sh
 * $ pulumi import aws:cloud9/environmentMembership:EnvironmentMembership test environment-id#user-arn
 * ```
 * 
 */
@ResourceType(type="aws:cloud9/environmentMembership:EnvironmentMembership")
public class EnvironmentMembership extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the environment that contains the environment member you want to add.
     * 
     */
    @Export(name="environmentId", refs={String.class}, tree="[0]")
    private Output<String> environmentId;

    /**
     * @return The ID of the environment that contains the environment member you want to add.
     * 
     */
    public Output<String> environmentId() {
        return this.environmentId;
    }
    /**
     * The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
     * 
     */
    @Export(name="permissions", refs={String.class}, tree="[0]")
    private Output<String> permissions;

    /**
     * @return The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
     * 
     */
    public Output<String> permissions() {
        return this.permissions;
    }
    /**
     * The Amazon Resource Name (ARN) of the environment member you want to add.
     * 
     */
    @Export(name="userArn", refs={String.class}, tree="[0]")
    private Output<String> userArn;

    /**
     * @return The Amazon Resource Name (ARN) of the environment member you want to add.
     * 
     */
    public Output<String> userArn() {
        return this.userArn;
    }
    /**
     * The user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return The user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnvironmentMembership(String name) {
        this(name, EnvironmentMembershipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnvironmentMembership(String name, EnvironmentMembershipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnvironmentMembership(String name, EnvironmentMembershipArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloud9/environmentMembership:EnvironmentMembership", name, args == null ? EnvironmentMembershipArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EnvironmentMembership(String name, Output<String> id, @Nullable EnvironmentMembershipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloud9/environmentMembership:EnvironmentMembership", name, state, makeResourceOptions(options, id));
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
    public static EnvironmentMembership get(String name, Output<String> id, @Nullable EnvironmentMembershipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EnvironmentMembership(name, id, state, options);
    }
}
