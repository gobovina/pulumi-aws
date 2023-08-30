// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.networkmanager.CoreNetworkArgs;
import com.pulumi.aws.networkmanager.inputs.CoreNetworkState;
import com.pulumi.aws.networkmanager.outputs.CoreNetworkEdge;
import com.pulumi.aws.networkmanager.outputs.CoreNetworkSegment;
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
 * Provides a core network resource.
 * 
 * ## Example Usage
 * ### Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkmanager.CoreNetwork;
 * import com.pulumi.aws.networkmanager.CoreNetworkArgs;
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
 *         var example = new CoreNetwork(&#34;example&#34;, CoreNetworkArgs.builder()        
 *             .globalNetworkId(aws_networkmanager_global_network.example().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With description
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkmanager.CoreNetwork;
 * import com.pulumi.aws.networkmanager.CoreNetworkArgs;
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
 *         var example = new CoreNetwork(&#34;example&#34;, CoreNetworkArgs.builder()        
 *             .globalNetworkId(aws_networkmanager_global_network.example().id())
 *             .description(&#34;example&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With tags
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkmanager.CoreNetwork;
 * import com.pulumi.aws.networkmanager.CoreNetworkArgs;
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
 *         var example = new CoreNetwork(&#34;example&#34;, CoreNetworkArgs.builder()        
 *             .globalNetworkId(aws_networkmanager_global_network.example().id())
 *             .tags(Map.of(&#34;hello&#34;, &#34;world&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With VPC Attachment (Single Region)
 * 
 * The example below illustrates the scenario where your policy document has static routes pointing to VPC attachments and you want to attach your VPCs to the core network before applying the desired policy document. Set the `create_base_policy` argument to `true` if your core network does not currently have any `LIVE` policies (e.g. this is the first `pulumi up` with the core network resource), since a `LIVE` policy is required before VPCs can be attached to the core network. Otherwise, if your core network already has a `LIVE` policy, you may exclude the `create_base_policy` argument.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkmanager.GlobalNetwork;
 * import com.pulumi.aws.networkmanager.CoreNetwork;
 * import com.pulumi.aws.networkmanager.CoreNetworkArgs;
 * import com.pulumi.aws.networkmanager.VpcAttachment;
 * import com.pulumi.aws.networkmanager.VpcAttachmentArgs;
 * import com.pulumi.aws.networkmanager.NetworkmanagerFunctions;
 * import com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs;
 * import com.pulumi.aws.networkmanager.CoreNetworkPolicyAttachment;
 * import com.pulumi.aws.networkmanager.CoreNetworkPolicyAttachmentArgs;
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
 *         var exampleGlobalNetwork = new GlobalNetwork(&#34;exampleGlobalNetwork&#34;);
 * 
 *         var exampleCoreNetwork = new CoreNetwork(&#34;exampleCoreNetwork&#34;, CoreNetworkArgs.builder()        
 *             .globalNetworkId(exampleGlobalNetwork.id())
 *             .createBasePolicy(true)
 *             .build());
 * 
 *         var exampleVpcAttachment = new VpcAttachment(&#34;exampleVpcAttachment&#34;, VpcAttachmentArgs.builder()        
 *             .coreNetworkId(exampleCoreNetwork.id())
 *             .subnetArns(aws_subnet.example().stream().map(element -&gt; element.arn()).collect(toList()))
 *             .vpcArn(aws_vpc.example().arn())
 *             .build());
 * 
 *         final var exampleCoreNetworkPolicyDocument = NetworkmanagerFunctions.getCoreNetworkPolicyDocument(GetCoreNetworkPolicyDocumentArgs.builder()
 *             .coreNetworkConfigurations(GetCoreNetworkPolicyDocumentCoreNetworkConfigurationArgs.builder()
 *                 .asnRanges(&#34;65022-65534&#34;)
 *                 .edgeLocations(GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs.builder()
 *                     .location(&#34;us-west-2&#34;)
 *                     .build())
 *                 .build())
 *             .segments(GetCoreNetworkPolicyDocumentSegmentArgs.builder()
 *                 .name(&#34;segment&#34;)
 *                 .build())
 *             .segmentActions(GetCoreNetworkPolicyDocumentSegmentActionArgs.builder()
 *                 .action(&#34;create-route&#34;)
 *                 .segment(&#34;segment&#34;)
 *                 .destinationCidrBlocks(&#34;0.0.0.0/0&#34;)
 *                 .destinations(exampleVpcAttachment.id())
 *                 .build())
 *             .build());
 * 
 *         var exampleCoreNetworkPolicyAttachment = new CoreNetworkPolicyAttachment(&#34;exampleCoreNetworkPolicyAttachment&#34;, CoreNetworkPolicyAttachmentArgs.builder()        
 *             .coreNetworkId(exampleCoreNetwork.id())
 *             .policyDocument(exampleCoreNetworkPolicyDocument.applyValue(getCoreNetworkPolicyDocumentResult -&gt; getCoreNetworkPolicyDocumentResult).applyValue(exampleCoreNetworkPolicyDocument -&gt; exampleCoreNetworkPolicyDocument.applyValue(getCoreNetworkPolicyDocumentResult -&gt; getCoreNetworkPolicyDocumentResult.json())))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With VPC Attachment (Multi-Region)
 * 
 * The example below illustrates the scenario where your policy document has static routes pointing to VPC attachments and you want to attach your VPCs to the core network before applying the desired policy document. Set the `create_base_policy` argument of the `aws.networkmanager.CoreNetwork` resource to `true` if your core network does not currently have any `LIVE` policies (e.g. this is the first `pulumi up` with the core network resource), since a `LIVE` policy is required before VPCs can be attached to the core network. Otherwise, if your core network already has a `LIVE` policy, you may exclude the `create_base_policy` argument. For multi-region in a core network that does not yet have a `LIVE` policy, pass a list of regions to the `aws.networkmanager.CoreNetwork` `base_policy_regions` argument. In the example below, `us-west-2` and `us-east-1` are specified in the base policy.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkmanager.GlobalNetwork;
 * import com.pulumi.aws.networkmanager.CoreNetwork;
 * import com.pulumi.aws.networkmanager.CoreNetworkArgs;
 * import com.pulumi.aws.networkmanager.VpcAttachment;
 * import com.pulumi.aws.networkmanager.VpcAttachmentArgs;
 * import com.pulumi.aws.networkmanager.NetworkmanagerFunctions;
 * import com.pulumi.aws.networkmanager.inputs.GetCoreNetworkPolicyDocumentArgs;
 * import com.pulumi.aws.networkmanager.CoreNetworkPolicyAttachment;
 * import com.pulumi.aws.networkmanager.CoreNetworkPolicyAttachmentArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var exampleGlobalNetwork = new GlobalNetwork(&#34;exampleGlobalNetwork&#34;);
 * 
 *         var exampleCoreNetwork = new CoreNetwork(&#34;exampleCoreNetwork&#34;, CoreNetworkArgs.builder()        
 *             .globalNetworkId(exampleGlobalNetwork.id())
 *             .basePolicyRegions(            
 *                 &#34;us-west-2&#34;,
 *                 &#34;us-east-1&#34;)
 *             .createBasePolicy(true)
 *             .build());
 * 
 *         var exampleUsWest2 = new VpcAttachment(&#34;exampleUsWest2&#34;, VpcAttachmentArgs.builder()        
 *             .coreNetworkId(exampleCoreNetwork.id())
 *             .subnetArns(aws_subnet.example_us_west_2().stream().map(element -&gt; element.arn()).collect(toList()))
 *             .vpcArn(aws_vpc.example_us_west_2().arn())
 *             .build());
 * 
 *         var exampleUsEast1 = new VpcAttachment(&#34;exampleUsEast1&#34;, VpcAttachmentArgs.builder()        
 *             .coreNetworkId(exampleCoreNetwork.id())
 *             .subnetArns(aws_subnet.example_us_east_1().stream().map(element -&gt; element.arn()).collect(toList()))
 *             .vpcArn(aws_vpc.example_us_east_1().arn())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(&#34;alternate&#34;)
 *                 .build());
 * 
 *         final var exampleCoreNetworkPolicyDocument = NetworkmanagerFunctions.getCoreNetworkPolicyDocument(GetCoreNetworkPolicyDocumentArgs.builder()
 *             .coreNetworkConfigurations(GetCoreNetworkPolicyDocumentCoreNetworkConfigurationArgs.builder()
 *                 .asnRanges(&#34;65022-65534&#34;)
 *                 .edgeLocations(                
 *                     GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs.builder()
 *                         .location(&#34;us-west-2&#34;)
 *                         .build(),
 *                     GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs.builder()
 *                         .location(&#34;us-east-1&#34;)
 *                         .build())
 *                 .build())
 *             .segments(            
 *                 GetCoreNetworkPolicyDocumentSegmentArgs.builder()
 *                     .name(&#34;segment&#34;)
 *                     .build(),
 *                 GetCoreNetworkPolicyDocumentSegmentArgs.builder()
 *                     .name(&#34;segment2&#34;)
 *                     .build())
 *             .segmentActions(            
 *                 GetCoreNetworkPolicyDocumentSegmentActionArgs.builder()
 *                     .action(&#34;create-route&#34;)
 *                     .segment(&#34;segment&#34;)
 *                     .destinationCidrBlocks(&#34;10.0.0.0/16&#34;)
 *                     .destinations(exampleUsWest2.id())
 *                     .build(),
 *                 GetCoreNetworkPolicyDocumentSegmentActionArgs.builder()
 *                     .action(&#34;create-route&#34;)
 *                     .segment(&#34;segment&#34;)
 *                     .destinationCidrBlocks(&#34;10.1.0.0/16&#34;)
 *                     .destinations(exampleUsEast1.id())
 *                     .build())
 *             .build());
 * 
 *         var exampleCoreNetworkPolicyAttachment = new CoreNetworkPolicyAttachment(&#34;exampleCoreNetworkPolicyAttachment&#34;, CoreNetworkPolicyAttachmentArgs.builder()        
 *             .coreNetworkId(exampleCoreNetwork.id())
 *             .policyDocument(exampleCoreNetworkPolicyDocument.applyValue(getCoreNetworkPolicyDocumentResult -&gt; getCoreNetworkPolicyDocumentResult).applyValue(exampleCoreNetworkPolicyDocument -&gt; exampleCoreNetworkPolicyDocument.applyValue(getCoreNetworkPolicyDocumentResult -&gt; getCoreNetworkPolicyDocumentResult.json())))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_networkmanager_core_network` using the core network ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:networkmanager/coreNetwork:CoreNetwork example core-network-0d47f6t230mz46dy4
 * ```
 * 
 */
@ResourceType(type="aws:networkmanager/coreNetwork:CoreNetwork")
public class CoreNetwork extends com.pulumi.resources.CustomResource {
    /**
     * Core Network Amazon Resource Name (ARN).
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Core Network Amazon Resource Name (ARN).
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The base policy created by setting the `create_base_policy` argument to `true` requires a region to be set in the `edge-locations`, `location` key. If `base_policy_region` is not specified, the region used in the base policy defaults to the region specified in the `provider` block.
     * 
     * @deprecated
     * Use the base_policy_regions argument instead. This argument will be removed in the next major version of the provider.
     * 
     */
    @Deprecated /* Use the base_policy_regions argument instead. This argument will be removed in the next major version of the provider. */
    @Export(name="basePolicyRegion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> basePolicyRegion;

    /**
     * @return The base policy created by setting the `create_base_policy` argument to `true` requires a region to be set in the `edge-locations`, `location` key. If `base_policy_region` is not specified, the region used in the base policy defaults to the region specified in the `provider` block.
     * 
     */
    public Output<Optional<String>> basePolicyRegion() {
        return Codegen.optional(this.basePolicyRegion);
    }
    /**
     * A list of regions to add to the base policy. The base policy created by setting the `create_base_policy` argument to `true` requires one or more regions to be set in the `edge-locations`, `location` key. If `base_policy_regions` is not specified, the region used in the base policy defaults to the region specified in the `provider` block.
     * 
     */
    @Export(name="basePolicyRegions", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> basePolicyRegions;

    /**
     * @return A list of regions to add to the base policy. The base policy created by setting the `create_base_policy` argument to `true` requires one or more regions to be set in the `edge-locations`, `location` key. If `base_policy_regions` is not specified, the region used in the base policy defaults to the region specified in the `provider` block.
     * 
     */
    public Output<Optional<List<String>>> basePolicyRegions() {
        return Codegen.optional(this.basePolicyRegions);
    }
    /**
     * Specifies whether to create a base policy when a core network is created or updated. A base policy is created and set to `LIVE` to allow attachments to the core network (e.g. VPC Attachments) before applying a policy document provided using the `aws.networkmanager.CoreNetworkPolicyAttachment` resource. This base policy is needed if your core network does not have any `LIVE` policies and your policy document has static routes pointing to VPC attachments and you want to attach your VPCs to the core network before applying the desired policy document. Valid values are `true` or `false`. An example of this Pulumi snippet can be found above for VPC Attachment in a single region and for VPC Attachment multi-region. An example base policy is shown below. This base policy is overridden with the policy that you specify in the `aws.networkmanager.CoreNetworkPolicyAttachment` resource.
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
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
     *     }
     * }
     * ```
     * 
     */
    @Export(name="createBasePolicy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> createBasePolicy;

    /**
     * @return Specifies whether to create a base policy when a core network is created or updated. A base policy is created and set to `LIVE` to allow attachments to the core network (e.g. VPC Attachments) before applying a policy document provided using the `aws.networkmanager.CoreNetworkPolicyAttachment` resource. This base policy is needed if your core network does not have any `LIVE` policies and your policy document has static routes pointing to VPC attachments and you want to attach your VPCs to the core network before applying the desired policy document. Valid values are `true` or `false`. An example of this Pulumi snippet can be found above for VPC Attachment in a single region and for VPC Attachment multi-region. An example base policy is shown below. This base policy is overridden with the policy that you specify in the `aws.networkmanager.CoreNetworkPolicyAttachment` resource.
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
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
     *     }
     * }
     * ```
     * 
     */
    public Output<Optional<Boolean>> createBasePolicy() {
        return Codegen.optional(this.createBasePolicy);
    }
    /**
     * Timestamp when a core network was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Timestamp when a core network was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Description of the Core Network.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the Core Network.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * One or more blocks detailing the edges within a core network. Detailed below.
     * 
     */
    @Export(name="edges", refs={List.class,CoreNetworkEdge.class}, tree="[0,1]")
    private Output<List<CoreNetworkEdge>> edges;

    /**
     * @return One or more blocks detailing the edges within a core network. Detailed below.
     * 
     */
    public Output<List<CoreNetworkEdge>> edges() {
        return this.edges;
    }
    /**
     * The ID of the global network that a core network will be a part of.
     * 
     */
    @Export(name="globalNetworkId", refs={String.class}, tree="[0]")
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the global network that a core network will be a part of.
     * 
     */
    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }
    /**
     * One or more blocks detailing the segments within a core network. Detailed below.
     * 
     */
    @Export(name="segments", refs={List.class,CoreNetworkSegment.class}, tree="[0,1]")
    private Output<List<CoreNetworkSegment>> segments;

    /**
     * @return One or more blocks detailing the segments within a core network. Detailed below.
     * 
     */
    public Output<List<CoreNetworkSegment>> segments() {
        return this.segments;
    }
    /**
     * Current state of a core network.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Current state of a core network.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Key-value tags for the Core Network. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value tags for the Core Network. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CoreNetwork(String name) {
        this(name, CoreNetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CoreNetwork(String name, CoreNetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CoreNetwork(String name, CoreNetworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/coreNetwork:CoreNetwork", name, args == null ? CoreNetworkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CoreNetwork(String name, Output<String> id, @Nullable CoreNetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/coreNetwork:CoreNetwork", name, state, makeResourceOptions(options, id));
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
    public static CoreNetwork get(String name, Output<String> id, @Nullable CoreNetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CoreNetwork(name, id, state, options);
    }
}
