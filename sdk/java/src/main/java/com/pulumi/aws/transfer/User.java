// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.transfer.UserArgs;
import com.pulumi.aws.transfer.inputs.UserState;
import com.pulumi.aws.transfer.outputs.UserHomeDirectoryMapping;
import com.pulumi.aws.transfer.outputs.UserPosixProfile;
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
 * Provides a AWS Transfer User resource. Managing SSH keys can be accomplished with the `aws.transfer.SshKey` resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.transfer.Server;
 * import com.pulumi.aws.transfer.ServerArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.iam.RolePolicy;
 * import com.pulumi.aws.iam.RolePolicyArgs;
 * import com.pulumi.aws.transfer.User;
 * import com.pulumi.aws.transfer.UserArgs;
 * import com.pulumi.aws.transfer.inputs.UserHomeDirectoryMappingArgs;
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
 *         var fooServer = new Server(&#34;fooServer&#34;, ServerArgs.builder()        
 *             .identityProviderType(&#34;SERVICE_MANAGED&#34;)
 *             .tags(Map.of(&#34;NAME&#34;, &#34;tf-acc-test-transfer-server&#34;))
 *             .build());
 * 
 *         final var assumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;transfer.amazonaws.com&#34;)
 *                     .build())
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .build())
 *             .build());
 * 
 *         var fooRole = new Role(&#34;fooRole&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(assumeRole.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         final var fooPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .sid(&#34;AllowFullAccesstoS3&#34;)
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(&#34;s3:*&#34;)
 *                 .resources(&#34;*&#34;)
 *                 .build())
 *             .build());
 * 
 *         var fooRolePolicy = new RolePolicy(&#34;fooRolePolicy&#34;, RolePolicyArgs.builder()        
 *             .role(fooRole.id())
 *             .policy(fooPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var fooUser = new User(&#34;fooUser&#34;, UserArgs.builder()        
 *             .serverId(fooServer.id())
 *             .userName(&#34;tftestuser&#34;)
 *             .role(fooRole.arn())
 *             .homeDirectoryType(&#34;LOGICAL&#34;)
 *             .homeDirectoryMappings(UserHomeDirectoryMappingArgs.builder()
 *                 .entry(&#34;/test.pdf&#34;)
 *                 .target(&#34;/bucket3/test-path/tftestuser.pdf&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Transfer Users using the `server_id` and `user_name` separated by `/`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:transfer/user:User bar s-12345678/test-username
 * ```
 * 
 */
@ResourceType(type="aws:transfer/user:User")
public class User extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of Transfer User
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of Transfer User
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
     * 
     */
    @Export(name="homeDirectory", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> homeDirectory;

    /**
     * @return The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
     * 
     */
    public Output<Optional<String>> homeDirectory() {
        return Codegen.optional(this.homeDirectory);
    }
    /**
     * Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
     * 
     */
    @Export(name="homeDirectoryMappings", refs={List.class,UserHomeDirectoryMapping.class}, tree="[0,1]")
    private Output</* @Nullable */ List<UserHomeDirectoryMapping>> homeDirectoryMappings;

    /**
     * @return Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
     * 
     */
    public Output<Optional<List<UserHomeDirectoryMapping>>> homeDirectoryMappings() {
        return Codegen.optional(this.homeDirectoryMappings);
    }
    /**
     * The type of landing directory (folder) you mapped for your users&#39; home directory. Valid values are `PATH` and `LOGICAL`.
     * 
     */
    @Export(name="homeDirectoryType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> homeDirectoryType;

    /**
     * @return The type of landing directory (folder) you mapped for your users&#39; home directory. Valid values are `PATH` and `LOGICAL`.
     * 
     */
    public Output<Optional<String>> homeDirectoryType() {
        return Codegen.optional(this.homeDirectoryType);
    }
    /**
     * An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> policy;

    /**
     * @return An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
     * 
     */
    public Output<Optional<String>> policy() {
        return Codegen.optional(this.policy);
    }
    /**
     * Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users&#39; access to your Amazon EFS file systems. See Posix Profile below.
     * 
     */
    @Export(name="posixProfile", refs={UserPosixProfile.class}, tree="[0]")
    private Output</* @Nullable */ UserPosixProfile> posixProfile;

    /**
     * @return Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users&#39; access to your Amazon EFS file systems. See Posix Profile below.
     * 
     */
    public Output<Optional<UserPosixProfile>> posixProfile() {
        return Codegen.optional(this.posixProfile);
    }
    /**
     * Amazon Resource Name (ARN) of an IAM role that allows the service to control your user’s access to your Amazon S3 bucket.
     * 
     */
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output<String> role;

    /**
     * @return Amazon Resource Name (ARN) of an IAM role that allows the service to control your user’s access to your Amazon S3 bucket.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * The Server ID of the Transfer Server (e.g., `s-12345678`)
     * 
     */
    @Export(name="serverId", refs={String.class}, tree="[0]")
    private Output<String> serverId;

    /**
     * @return The Server ID of the Transfer Server (e.g., `s-12345678`)
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
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
     * The name used for log in to your SFTP server.
     * 
     */
    @Export(name="userName", refs={String.class}, tree="[0]")
    private Output<String> userName;

    /**
     * @return The name used for log in to your SFTP server.
     * 
     */
    public Output<String> userName() {
        return this.userName;
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
    public User(String name, UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:transfer/user:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private User(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:transfer/user:User", name, state, makeResourceOptions(options, id));
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
