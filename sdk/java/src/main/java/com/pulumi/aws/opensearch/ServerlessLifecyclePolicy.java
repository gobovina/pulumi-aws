// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.opensearch.ServerlessLifecyclePolicyArgs;
import com.pulumi.aws.opensearch.inputs.ServerlessLifecyclePolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS OpenSearch Serverless Lifecycle Policy. See AWS documentation for [lifecycle policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-lifecycle.html).
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.opensearch.ServerlessLifecyclePolicy;
 * import com.pulumi.aws.opensearch.ServerlessLifecyclePolicyArgs;
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
 *         var example = new ServerlessLifecyclePolicy(&#34;example&#34;, ServerlessLifecyclePolicyArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .type(&#34;retention&#34;)
 *             .policy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Rules&#34;, jsonArray(
 *                         jsonObject(
 *                             jsonProperty(&#34;ResourceType&#34;, &#34;index&#34;),
 *                             jsonProperty(&#34;Resource&#34;, jsonArray(&#34;index/autoparts-inventory/*&#34;)),
 *                             jsonProperty(&#34;MinIndexRetention&#34;, &#34;81d&#34;)
 *                         ), 
 *                         jsonObject(
 *                             jsonProperty(&#34;ResourceType&#34;, &#34;index&#34;),
 *                             jsonProperty(&#34;Resource&#34;, jsonArray(&#34;index/sales/orders*&#34;)),
 *                             jsonProperty(&#34;NoMinIndexRetention&#34;, true)
 *                         )
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
 * Using `pulumi import`, import OpenSearch Serverless Lifecycle Policy using the `name` and `type` arguments separated by a slash (`/`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:opensearch/serverlessLifecyclePolicy:ServerlessLifecyclePolicy example example/retention
 * ```
 * 
 */
@ResourceType(type="aws:opensearch/serverlessLifecyclePolicy:ServerlessLifecyclePolicy")
public class ServerlessLifecyclePolicy extends com.pulumi.resources.CustomResource {
    /**
     * Description of the policy.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the policy.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the policy.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * JSON policy document to use as the content for the new policy.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return JSON policy document to use as the content for the new policy.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * Version of the policy.
     * 
     */
    @Export(name="policyVersion", refs={String.class}, tree="[0]")
    private Output<String> policyVersion;

    /**
     * @return Version of the policy.
     * 
     */
    public Output<String> policyVersion() {
        return this.policyVersion;
    }
    /**
     * Type of lifecycle policy. Must be `retention`.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of lifecycle policy. Must be `retention`.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerlessLifecyclePolicy(String name) {
        this(name, ServerlessLifecyclePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerlessLifecyclePolicy(String name, ServerlessLifecyclePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerlessLifecyclePolicy(String name, ServerlessLifecyclePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearch/serverlessLifecyclePolicy:ServerlessLifecyclePolicy", name, args == null ? ServerlessLifecyclePolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerlessLifecyclePolicy(String name, Output<String> id, @Nullable ServerlessLifecyclePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearch/serverlessLifecyclePolicy:ServerlessLifecyclePolicy", name, state, makeResourceOptions(options, id));
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
    public static ServerlessLifecyclePolicy get(String name, Output<String> id, @Nullable ServerlessLifecyclePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerlessLifecyclePolicy(name, id, state, options);
    }
}
