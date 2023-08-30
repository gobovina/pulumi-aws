// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticache;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elasticache.UserGroupArgs;
import com.pulumi.aws.elasticache.inputs.UserGroupState;
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
 * Provides an ElastiCache user group resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.elasticache.User;
 * import com.pulumi.aws.elasticache.UserArgs;
 * import com.pulumi.aws.elasticache.UserGroup;
 * import com.pulumi.aws.elasticache.UserGroupArgs;
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
 *         var testUser = new User(&#34;testUser&#34;, UserArgs.builder()        
 *             .userId(&#34;testUserId&#34;)
 *             .userName(&#34;default&#34;)
 *             .accessString(&#34;on ~app::* -@all +@read +@hash +@bitmap +@geo -setbit -bitfield -hset -hsetnx -hmset -hincrby -hincrbyfloat -hdel -bitop -geoadd -georadius -georadiusbymember&#34;)
 *             .engine(&#34;REDIS&#34;)
 *             .passwords(&#34;password123456789&#34;)
 *             .build());
 * 
 *         var testUserGroup = new UserGroup(&#34;testUserGroup&#34;, UserGroupArgs.builder()        
 *             .engine(&#34;REDIS&#34;)
 *             .userGroupId(&#34;userGroupId&#34;)
 *             .userIds(testUser.userId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import ElastiCache user groups using the `user_group_id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:elasticache/userGroup:UserGroup my_user_group userGoupId1
 * ```
 * 
 */
@ResourceType(type="aws:elasticache/userGroup:UserGroup")
public class UserGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ARN that identifies the user group.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN that identifies the user group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The current supported value is `REDIS`.
     * 
     */
    @Export(name="engine", refs={String.class}, tree="[0]")
    private Output<String> engine;

    /**
     * @return The current supported value is `REDIS`.
     * 
     */
    public Output<String> engine() {
        return this.engine;
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
     * The ID of the user group.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="userGroupId", refs={String.class}, tree="[0]")
    private Output<String> userGroupId;

    /**
     * @return The ID of the user group.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> userGroupId() {
        return this.userGroupId;
    }
    /**
     * The list of user IDs that belong to the user group.
     * 
     */
    @Export(name="userIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> userIds;

    /**
     * @return The list of user IDs that belong to the user group.
     * 
     */
    public Output<Optional<List<String>>> userIds() {
        return Codegen.optional(this.userIds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserGroup(String name) {
        this(name, UserGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserGroup(String name, UserGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserGroup(String name, UserGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticache/userGroup:UserGroup", name, args == null ? UserGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserGroup(String name, Output<String> id, @Nullable UserGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticache/userGroup:UserGroup", name, state, makeResourceOptions(options, id));
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
    public static UserGroup get(String name, Output<String> id, @Nullable UserGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserGroup(name, id, state, options);
    }
}
