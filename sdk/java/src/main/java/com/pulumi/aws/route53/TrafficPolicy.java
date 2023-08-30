// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53.TrafficPolicyArgs;
import com.pulumi.aws.route53.inputs.TrafficPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Route53 Traffic Policy.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.route53.TrafficPolicy;
 * import com.pulumi.aws.route53.TrafficPolicyArgs;
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
 *         var example = new TrafficPolicy(&#34;example&#34;, TrafficPolicyArgs.builder()        
 *             .comment(&#34;example comment&#34;)
 *             .document(&#34;&#34;&#34;
 * {
 *   &#34;AWSPolicyFormatVersion&#34;: &#34;2015-10-01&#34;,
 *   &#34;RecordType&#34;: &#34;A&#34;,
 *   &#34;Endpoints&#34;: {
 *     &#34;endpoint-start-NkPh&#34;: {
 *       &#34;Type&#34;: &#34;value&#34;,
 *       &#34;Value&#34;: &#34;10.0.0.2&#34;
 *     }
 *   },
 *   &#34;StartEndpoint&#34;: &#34;endpoint-start-NkPh&#34;
 * }
 * 
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Route53 Traffic Policy using the `id` and `version`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:route53/trafficPolicy:TrafficPolicy example 01a52019-d16f-422a-ae72-c306d2b6df7e/1
 * ```
 * 
 */
@ResourceType(type="aws:route53/trafficPolicy:TrafficPolicy")
public class TrafficPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Comment for the traffic policy.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Comment for the traffic policy.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Policy document. This is a JSON formatted string. For more information about building Route53 traffic policy documents, see the [AWS Route53 Traffic Policy document format](https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html)
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="document", refs={String.class}, tree="[0]")
    private Output<String> document;

    /**
     * @return Policy document. This is a JSON formatted string. For more information about building Route53 traffic policy documents, see the [AWS Route53 Traffic Policy document format](https://docs.aws.amazon.com/Route53/latest/APIReference/api-policies-traffic-policy-document-format.html)
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> document() {
        return this.document;
    }
    /**
     * Name of the traffic policy.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the traffic policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Version number of the traffic policy. This value is automatically incremented by AWS after each update of this resource.
     * 
     */
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    /**
     * @return Version number of the traffic policy. This value is automatically incremented by AWS after each update of this resource.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrafficPolicy(String name) {
        this(name, TrafficPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrafficPolicy(String name, TrafficPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrafficPolicy(String name, TrafficPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/trafficPolicy:TrafficPolicy", name, args == null ? TrafficPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TrafficPolicy(String name, Output<String> id, @Nullable TrafficPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/trafficPolicy:TrafficPolicy", name, state, makeResourceOptions(options, id));
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
    public static TrafficPolicy get(String name, Output<String> id, @Nullable TrafficPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TrafficPolicy(name, id, state, options);
    }
}
