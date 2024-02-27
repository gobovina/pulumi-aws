// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.NetworkInsightsAnalysisArgs;
import com.pulumi.aws.ec2.inputs.NetworkInsightsAnalysisState;
import com.pulumi.aws.ec2.outputs.NetworkInsightsAnalysisAlternatePathHint;
import com.pulumi.aws.ec2.outputs.NetworkInsightsAnalysisExplanation;
import com.pulumi.aws.ec2.outputs.NetworkInsightsAnalysisForwardPathComponent;
import com.pulumi.aws.ec2.outputs.NetworkInsightsAnalysisReturnPathComponent;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Network Insights Analysis resource. Part of the &#34;Reachability Analyzer&#34; service in the AWS VPC console.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.NetworkInsightsPath;
 * import com.pulumi.aws.ec2.NetworkInsightsPathArgs;
 * import com.pulumi.aws.ec2.NetworkInsightsAnalysis;
 * import com.pulumi.aws.ec2.NetworkInsightsAnalysisArgs;
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
 *         var path = new NetworkInsightsPath(&#34;path&#34;, NetworkInsightsPathArgs.builder()        
 *             .source(aws_network_interface.source().id())
 *             .destination(aws_network_interface.destination().id())
 *             .protocol(&#34;tcp&#34;)
 *             .build());
 * 
 *         var analysis = new NetworkInsightsAnalysis(&#34;analysis&#34;, NetworkInsightsAnalysisArgs.builder()        
 *             .networkInsightsPathId(path.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Network Insights Analyses using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ec2/networkInsightsAnalysis:NetworkInsightsAnalysis test nia-0462085c957f11a55
 * ```
 * 
 */
@ResourceType(type="aws:ec2/networkInsightsAnalysis:NetworkInsightsAnalysis")
public class NetworkInsightsAnalysis extends com.pulumi.resources.CustomResource {
    /**
     * Potential intermediate components of a feasible path. Described below.
     * 
     */
    @Export(name="alternatePathHints", refs={List.class,NetworkInsightsAnalysisAlternatePathHint.class}, tree="[0,1]")
    private Output<List<NetworkInsightsAnalysisAlternatePathHint>> alternatePathHints;

    /**
     * @return Potential intermediate components of a feasible path. Described below.
     * 
     */
    public Output<List<NetworkInsightsAnalysisAlternatePathHint>> alternatePathHints() {
        return this.alternatePathHints;
    }
    /**
     * ARN of the Network Insights Analysis.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the Network Insights Analysis.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Explanation codes for an unreachable path. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Explanation.html) for details.
     * 
     */
    @Export(name="explanations", refs={List.class,NetworkInsightsAnalysisExplanation.class}, tree="[0,1]")
    private Output<List<NetworkInsightsAnalysisExplanation>> explanations;

    /**
     * @return Explanation codes for an unreachable path. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Explanation.html) for details.
     * 
     */
    public Output<List<NetworkInsightsAnalysisExplanation>> explanations() {
        return this.explanations;
    }
    /**
     * A list of ARNs for resources the path must traverse.
     * 
     */
    @Export(name="filterInArns", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> filterInArns;

    /**
     * @return A list of ARNs for resources the path must traverse.
     * 
     */
    public Output<Optional<List<String>>> filterInArns() {
        return Codegen.optional(this.filterInArns);
    }
    /**
     * The components in the path from source to destination. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PathComponent.html) for details.
     * 
     */
    @Export(name="forwardPathComponents", refs={List.class,NetworkInsightsAnalysisForwardPathComponent.class}, tree="[0,1]")
    private Output<List<NetworkInsightsAnalysisForwardPathComponent>> forwardPathComponents;

    /**
     * @return The components in the path from source to destination. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PathComponent.html) for details.
     * 
     */
    public Output<List<NetworkInsightsAnalysisForwardPathComponent>> forwardPathComponents() {
        return this.forwardPathComponents;
    }
    /**
     * ID of the Network Insights Path to run an analysis on.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="networkInsightsPathId", refs={String.class}, tree="[0]")
    private Output<String> networkInsightsPathId;

    /**
     * @return ID of the Network Insights Path to run an analysis on.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> networkInsightsPathId() {
        return this.networkInsightsPathId;
    }
    /**
     * Set to `true` if the destination was reachable.
     * 
     */
    @Export(name="pathFound", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> pathFound;

    /**
     * @return Set to `true` if the destination was reachable.
     * 
     */
    public Output<Boolean> pathFound() {
        return this.pathFound;
    }
    /**
     * The components in the path from destination to source. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PathComponent.html) for details.
     * 
     */
    @Export(name="returnPathComponents", refs={List.class,NetworkInsightsAnalysisReturnPathComponent.class}, tree="[0,1]")
    private Output<List<NetworkInsightsAnalysisReturnPathComponent>> returnPathComponents;

    /**
     * @return The components in the path from destination to source. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PathComponent.html) for details.
     * 
     */
    public Output<List<NetworkInsightsAnalysisReturnPathComponent>> returnPathComponents() {
        return this.returnPathComponents;
    }
    /**
     * The date/time the analysis was started.
     * 
     */
    @Export(name="startDate", refs={String.class}, tree="[0]")
    private Output<String> startDate;

    /**
     * @return The date/time the analysis was started.
     * 
     */
    public Output<String> startDate() {
        return this.startDate;
    }
    /**
     * The status of the analysis. `succeeded` means the analysis was completed, not that a path was found, for that see `path_found`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the analysis. `succeeded` means the analysis was completed, not that a path was found, for that see `path_found`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A message to provide more context when the `status` is `failed`.
     * 
     */
    @Export(name="statusMessage", refs={String.class}, tree="[0]")
    private Output<String> statusMessage;

    /**
     * @return A message to provide more context when the `status` is `failed`.
     * 
     */
    public Output<String> statusMessage() {
        return this.statusMessage;
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * If enabled, the resource will wait for the Network Insights Analysis status to change to `succeeded` or `failed`. Setting this to `false` will skip the process. Default: `true`.
     * 
     */
    @Export(name="waitForCompletion", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> waitForCompletion;

    /**
     * @return If enabled, the resource will wait for the Network Insights Analysis status to change to `succeeded` or `failed`. Setting this to `false` will skip the process. Default: `true`.
     * 
     */
    public Output<Optional<Boolean>> waitForCompletion() {
        return Codegen.optional(this.waitForCompletion);
    }
    /**
     * The warning message.
     * 
     */
    @Export(name="warningMessage", refs={String.class}, tree="[0]")
    private Output<String> warningMessage;

    /**
     * @return The warning message.
     * 
     */
    public Output<String> warningMessage() {
        return this.warningMessage;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkInsightsAnalysis(String name) {
        this(name, NetworkInsightsAnalysisArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkInsightsAnalysis(String name, NetworkInsightsAnalysisArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkInsightsAnalysis(String name, NetworkInsightsAnalysisArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/networkInsightsAnalysis:NetworkInsightsAnalysis", name, args == null ? NetworkInsightsAnalysisArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkInsightsAnalysis(String name, Output<String> id, @Nullable NetworkInsightsAnalysisState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/networkInsightsAnalysis:NetworkInsightsAnalysis", name, state, makeResourceOptions(options, id));
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
    public static NetworkInsightsAnalysis get(String name, Output<String> id, @Nullable NetworkInsightsAnalysisState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkInsightsAnalysis(name, id, state, options);
    }
}
