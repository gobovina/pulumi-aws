// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cfg.AggregateAuthorizationArgs;
import com.pulumi.aws.cfg.inputs.AggregateAuthorizationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an AWS Config Aggregate Authorization
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cfg.AggregateAuthorization;
 * import com.pulumi.aws.cfg.AggregateAuthorizationArgs;
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
 *         var example = new AggregateAuthorization(&#34;example&#34;, AggregateAuthorizationArgs.builder()        
 *             .accountId(&#34;123456789012&#34;)
 *             .region(&#34;eu-west-2&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Config aggregate authorizations using `account_id:region`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:cfg/aggregateAuthorization:AggregateAuthorization example 123456789012:us-east-1
 * ```
 * 
 */
@ResourceType(type="aws:cfg/aggregateAuthorization:AggregateAuthorization")
public class AggregateAuthorization extends com.pulumi.resources.CustomResource {
    /**
     * Account ID
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account ID
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The ARN of the authorization
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the authorization
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Region
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return Region
     * 
     */
    public Output<String> region() {
        return this.region;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AggregateAuthorization(String name) {
        this(name, AggregateAuthorizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AggregateAuthorization(String name, AggregateAuthorizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AggregateAuthorization(String name, AggregateAuthorizationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/aggregateAuthorization:AggregateAuthorization", name, args == null ? AggregateAuthorizationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AggregateAuthorization(String name, Output<String> id, @Nullable AggregateAuthorizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/aggregateAuthorization:AggregateAuthorization", name, state, makeResourceOptions(options, id));
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
    public static AggregateAuthorization get(String name, Output<String> id, @Nullable AggregateAuthorizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AggregateAuthorization(name, id, state, options);
    }
}
