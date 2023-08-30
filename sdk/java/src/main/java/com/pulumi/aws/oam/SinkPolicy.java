// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.oam;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.oam.SinkPolicyArgs;
import com.pulumi.aws.oam.inputs.SinkPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS CloudWatch Observability Access Manager Sink Policy.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.oam.Sink;
 * import com.pulumi.aws.oam.SinkPolicy;
 * import com.pulumi.aws.oam.SinkPolicyArgs;
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
 *         var exampleSink = new Sink(&#34;exampleSink&#34;);
 * 
 *         var exampleSinkPolicy = new SinkPolicy(&#34;exampleSinkPolicy&#34;, SinkPolicyArgs.builder()        
 *             .sinkIdentifier(exampleSink.id())
 *             .policy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Version&#34;, &#34;2012-10-17&#34;),
 *                     jsonProperty(&#34;Statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Action&#34;, jsonArray(
 *                             &#34;oam:CreateLink&#34;, 
 *                             &#34;oam:UpdateLink&#34;
 *                         )),
 *                         jsonProperty(&#34;Effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;Resource&#34;, &#34;*&#34;),
 *                         jsonProperty(&#34;Principal&#34;, jsonObject(
 *                             jsonProperty(&#34;AWS&#34;, jsonArray(
 *                                 &#34;1111111111111&#34;, 
 *                                 &#34;222222222222&#34;
 *                             ))
 *                         )),
 *                         jsonProperty(&#34;Condition&#34;, jsonObject(
 *                             jsonProperty(&#34;ForAllValues:StringEquals&#34;, jsonObject(
 *                                 jsonProperty(&#34;oam:ResourceTypes&#34;, jsonArray(
 *                                     &#34;AWS::CloudWatch::Metric&#34;, 
 *                                     &#34;AWS::Logs::LogGroup&#34;
 *                                 ))
 *                             ))
 *                         ))
 *                     )))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import CloudWatch Observability Access Manager Sink Policy using the `sink_identifier`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:oam/sinkPolicy:SinkPolicy example arn:aws:oam:us-west-2:123456789012:sink/sink-id
 * ```
 * 
 */
@ResourceType(type="aws:oam/sinkPolicy:SinkPolicy")
public class SinkPolicy extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the Sink.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the Sink.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by what you specify here.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by what you specify here.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * ID string that AWS generated as part of the sink ARN.
     * 
     */
    @Export(name="sinkId", refs={String.class}, tree="[0]")
    private Output<String> sinkId;

    /**
     * @return ID string that AWS generated as part of the sink ARN.
     * 
     */
    public Output<String> sinkId() {
        return this.sinkId;
    }
    /**
     * ARN of the sink to attach this policy to.
     * 
     */
    @Export(name="sinkIdentifier", refs={String.class}, tree="[0]")
    private Output<String> sinkIdentifier;

    /**
     * @return ARN of the sink to attach this policy to.
     * 
     */
    public Output<String> sinkIdentifier() {
        return this.sinkIdentifier;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SinkPolicy(String name) {
        this(name, SinkPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SinkPolicy(String name, SinkPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SinkPolicy(String name, SinkPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:oam/sinkPolicy:SinkPolicy", name, args == null ? SinkPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SinkPolicy(String name, Output<String> id, @Nullable SinkPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:oam/sinkPolicy:SinkPolicy", name, state, makeResourceOptions(options, id));
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
    public static SinkPolicy get(String name, Output<String> id, @Nullable SinkPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SinkPolicy(name, id, state, options);
    }
}
