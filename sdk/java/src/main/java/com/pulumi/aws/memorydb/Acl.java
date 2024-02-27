// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.memorydb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.memorydb.AclArgs;
import com.pulumi.aws.memorydb.inputs.AclState;
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
 * Provides a MemoryDB ACL.
 * 
 * More information about users and ACL-s can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/clusters.acls.html).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.memorydb.Acl;
 * import com.pulumi.aws.memorydb.AclArgs;
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
 *         var example = new Acl(&#34;example&#34;, AclArgs.builder()        
 *             .userNames(            
 *                 &#34;my-user-1&#34;,
 *                 &#34;my-user-2&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import an ACL using the `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:memorydb/acl:Acl example my-acl
 * ```
 * 
 */
@ResourceType(type="aws:memorydb/acl:Acl")
public class Acl extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the ACL.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the ACL.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The minimum engine version supported by the ACL.
     * 
     */
    @Export(name="minimumEngineVersion", refs={String.class}, tree="[0]")
    private Output<String> minimumEngineVersion;

    /**
     * @return The minimum engine version supported by the ACL.
     * 
     */
    public Output<String> minimumEngineVersion() {
        return this.minimumEngineVersion;
    }
    /**
     * Name of the ACL. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the ACL. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
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
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Set of MemoryDB user names to be included in this ACL.
     * 
     */
    @Export(name="userNames", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> userNames;

    /**
     * @return Set of MemoryDB user names to be included in this ACL.
     * 
     */
    public Output<Optional<List<String>>> userNames() {
        return Codegen.optional(this.userNames);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Acl(String name) {
        this(name, AclArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Acl(String name, @Nullable AclArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Acl(String name, @Nullable AclArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:memorydb/acl:Acl", name, args == null ? AclArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Acl(String name, Output<String> id, @Nullable AclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:memorydb/acl:Acl", name, state, makeResourceOptions(options, id));
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
    public static Acl get(String name, Output<String> id, @Nullable AclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Acl(name, id, state, options);
    }
}
