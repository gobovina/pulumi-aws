// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sesv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sesv2.DedicatedIpPoolArgs;
import com.pulumi.aws.sesv2.inputs.DedicatedIpPoolState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS SESv2 (Simple Email V2) Dedicated IP Pool.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sesv2.DedicatedIpPool;
 * import com.pulumi.aws.sesv2.DedicatedIpPoolArgs;
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
 *         var example = new DedicatedIpPool(&#34;example&#34;, DedicatedIpPoolArgs.builder()        
 *             .poolName(&#34;my-pool&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Managed Pool
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sesv2.DedicatedIpPool;
 * import com.pulumi.aws.sesv2.DedicatedIpPoolArgs;
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
 *         var example = new DedicatedIpPool(&#34;example&#34;, DedicatedIpPoolArgs.builder()        
 *             .poolName(&#34;my-managed-pool&#34;)
 *             .scalingMode(&#34;MANAGED&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SESv2 (Simple Email V2) Dedicated IP Pool using the `pool_name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:sesv2/dedicatedIpPool:DedicatedIpPool example my-pool
 * ```
 * 
 */
@ResourceType(type="aws:sesv2/dedicatedIpPool:DedicatedIpPool")
public class DedicatedIpPool extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the Dedicated IP Pool.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the Dedicated IP Pool.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Name of the dedicated IP pool.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="poolName", refs={String.class}, tree="[0]")
    private Output<String> poolName;

    /**
     * @return Name of the dedicated IP pool.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> poolName() {
        return this.poolName;
    }
    /**
     * IP pool scaling mode. Valid values: `STANDARD`, `MANAGED`. If omitted, the AWS API will default to a standard pool.
     * 
     */
    @Export(name="scalingMode", refs={String.class}, tree="[0]")
    private Output<String> scalingMode;

    /**
     * @return IP pool scaling mode. Valid values: `STANDARD`, `MANAGED`. If omitted, the AWS API will default to a standard pool.
     * 
     */
    public Output<String> scalingMode() {
        return this.scalingMode;
    }
    /**
     * A map of tags to assign to the pool. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the pool. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DedicatedIpPool(String name) {
        this(name, DedicatedIpPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DedicatedIpPool(String name, DedicatedIpPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DedicatedIpPool(String name, DedicatedIpPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sesv2/dedicatedIpPool:DedicatedIpPool", name, args == null ? DedicatedIpPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DedicatedIpPool(String name, Output<String> id, @Nullable DedicatedIpPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sesv2/dedicatedIpPool:DedicatedIpPool", name, state, makeResourceOptions(options, id));
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
    public static DedicatedIpPool get(String name, Output<String> id, @Nullable DedicatedIpPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DedicatedIpPool(name, id, state, options);
    }
}
