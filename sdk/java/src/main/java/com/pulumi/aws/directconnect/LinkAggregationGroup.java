// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.directconnect.LinkAggregationGroupArgs;
import com.pulumi.aws.directconnect.inputs.LinkAggregationGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Direct Connect LAG. Connections can be added to the LAG via the `aws.directconnect.Connection` and `aws.directconnect.ConnectionAssociation` resources.
 * 
 * &gt; *NOTE:* When creating a LAG, if no existing connection is specified, Direct Connect will create a connection and this provider will remove this unmanaged connection during resource creation.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.directconnect.LinkAggregationGroup;
 * import com.pulumi.aws.directconnect.LinkAggregationGroupArgs;
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
 *         var hoge = new LinkAggregationGroup("hoge", LinkAggregationGroupArgs.builder()
 *             .name("tf-dx-lag")
 *             .connectionsBandwidth("1Gbps")
 *             .location("EqDC2")
 *             .forceDestroy(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Direct Connect LAGs using the LAG `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:directconnect/linkAggregationGroup:LinkAggregationGroup test_lag dxlag-fgnsp5rq
 * ```
 * 
 */
@ResourceType(type="aws:directconnect/linkAggregationGroup:LinkAggregationGroup")
public class LinkAggregationGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the LAG.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the LAG.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ID of an existing dedicated connection to migrate to the LAG.
     * 
     */
    @Export(name="connectionId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> connectionId;

    /**
     * @return The ID of an existing dedicated connection to migrate to the LAG.
     * 
     */
    public Output<Optional<String>> connectionId() {
        return Codegen.optional(this.connectionId);
    }
    /**
     * The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps and 100Gbps. Case sensitive.
     * 
     */
    @Export(name="connectionsBandwidth", refs={String.class}, tree="[0]")
    private Output<String> connectionsBandwidth;

    /**
     * @return The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, 10Gbps and 100Gbps. Case sensitive.
     * 
     */
    public Output<String> connectionsBandwidth() {
        return this.connectionsBandwidth;
    }
    /**
     * A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
     * 
     */
    @Export(name="forceDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * 
     */
    @Export(name="hasLogicalRedundancy", refs={String.class}, tree="[0]")
    private Output<String> hasLogicalRedundancy;

    /**
     * @return Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * 
     */
    public Output<String> hasLogicalRedundancy() {
        return this.hasLogicalRedundancy;
    }
    /**
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * 
     */
    @Export(name="jumboFrameCapable", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> jumboFrameCapable;

    /**
     * @return Indicates whether jumbo frames (9001 MTU) are supported.
     * 
     */
    public Output<Boolean> jumboFrameCapable() {
        return this.jumboFrameCapable;
    }
    /**
     * The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the LAG.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the LAG.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the AWS account that owns the LAG.
     * 
     */
    @Export(name="ownerAccountId", refs={String.class}, tree="[0]")
    private Output<String> ownerAccountId;

    /**
     * @return The ID of the AWS account that owns the LAG.
     * 
     */
    public Output<String> ownerAccountId() {
        return this.ownerAccountId;
    }
    /**
     * The name of the service provider associated with the LAG.
     * 
     */
    @Export(name="providerName", refs={String.class}, tree="[0]")
    private Output<String> providerName;

    /**
     * @return The name of the service provider associated with the LAG.
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public LinkAggregationGroup(String name) {
        this(name, LinkAggregationGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkAggregationGroup(String name, LinkAggregationGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkAggregationGroup(String name, LinkAggregationGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/linkAggregationGroup:LinkAggregationGroup", name, args == null ? LinkAggregationGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LinkAggregationGroup(String name, Output<String> id, @Nullable LinkAggregationGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/linkAggregationGroup:LinkAggregationGroup", name, state, makeResourceOptions(options, id));
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
    public static LinkAggregationGroup get(String name, Output<String> id, @Nullable LinkAggregationGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LinkAggregationGroup(name, id, state, options);
    }
}
