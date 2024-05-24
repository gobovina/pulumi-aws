// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.FleetArgs;
import com.pulumi.aws.ec2.inputs.FleetState;
import com.pulumi.aws.ec2.outputs.FleetFleetInstanceSet;
import com.pulumi.aws.ec2.outputs.FleetLaunchTemplateConfig;
import com.pulumi.aws.ec2.outputs.FleetOnDemandOptions;
import com.pulumi.aws.ec2.outputs.FleetSpotOptions;
import com.pulumi.aws.ec2.outputs.FleetTargetCapacitySpecification;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage EC2 Fleets.
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
 * import com.pulumi.aws.ec2.Fleet;
 * import com.pulumi.aws.ec2.FleetArgs;
 * import com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigArgs;
 * import com.pulumi.aws.ec2.inputs.FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs;
 * import com.pulumi.aws.ec2.inputs.FleetTargetCapacitySpecificationArgs;
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
 *         var example = new Fleet("example", FleetArgs.builder()
 *             .launchTemplateConfigs(FleetLaunchTemplateConfigArgs.builder()
 *                 .launchTemplateSpecification(FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs.builder()
 *                     .launchTemplateId(exampleAwsLaunchTemplate.id())
 *                     .version(exampleAwsLaunchTemplate.latestVersion())
 *                     .build())
 *                 .build())
 *             .targetCapacitySpecification(FleetTargetCapacitySpecificationArgs.builder()
 *                 .defaultTargetCapacityType("spot")
 *                 .totalTargetCapacity(5)
 *                 .build())
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
 * Using `pulumi import`, import `aws_ec2_fleet` using the Fleet identifier. For example:
 * 
 * ```sh
 * $ pulumi import aws:ec2/fleet:Fleet example fleet-b9b55d27-c5fc-41ac-a6f3-48fcc91f080c
 * ```
 * 
 */
@ResourceType(type="aws:ec2/fleet:Fleet")
public class Fleet extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the fleet
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the fleet
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Reserved.
     * 
     */
    @Export(name="context", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> context;

    /**
     * @return Reserved.
     * 
     */
    public Output<Optional<String>> context() {
        return Codegen.optional(this.context);
    }
    /**
     * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`. Supported only for fleets of type `maintain`.
     * 
     */
    @Export(name="excessCapacityTerminationPolicy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> excessCapacityTerminationPolicy;

    /**
     * @return Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`. Supported only for fleets of type `maintain`.
     * 
     */
    public Output<Optional<String>> excessCapacityTerminationPolicy() {
        return Codegen.optional(this.excessCapacityTerminationPolicy);
    }
    /**
     * Information about the instances that were launched by the fleet. Available only when `type` is set to `instant`.
     * 
     */
    @Export(name="fleetInstanceSets", refs={List.class,FleetFleetInstanceSet.class}, tree="[0,1]")
    private Output<List<FleetFleetInstanceSet>> fleetInstanceSets;

    /**
     * @return Information about the instances that were launched by the fleet. Available only when `type` is set to `instant`.
     * 
     */
    public Output<List<FleetFleetInstanceSet>> fleetInstanceSets() {
        return this.fleetInstanceSets;
    }
    /**
     * The state of the EC2 Fleet.
     * 
     */
    @Export(name="fleetState", refs={String.class}, tree="[0]")
    private Output<String> fleetState;

    /**
     * @return The state of the EC2 Fleet.
     * 
     */
    public Output<String> fleetState() {
        return this.fleetState;
    }
    /**
     * The number of units fulfilled by this request compared to the set target capacity.
     * 
     */
    @Export(name="fulfilledCapacity", refs={Double.class}, tree="[0]")
    private Output<Double> fulfilledCapacity;

    /**
     * @return The number of units fulfilled by this request compared to the set target capacity.
     * 
     */
    public Output<Double> fulfilledCapacity() {
        return this.fulfilledCapacity;
    }
    /**
     * The number of units fulfilled by this request compared to the set target On-Demand capacity.
     * 
     */
    @Export(name="fulfilledOnDemandCapacity", refs={Double.class}, tree="[0]")
    private Output<Double> fulfilledOnDemandCapacity;

    /**
     * @return The number of units fulfilled by this request compared to the set target On-Demand capacity.
     * 
     */
    public Output<Double> fulfilledOnDemandCapacity() {
        return this.fulfilledOnDemandCapacity;
    }
    /**
     * Nested argument containing EC2 Launch Template configurations. Defined below.
     * 
     */
    @Export(name="launchTemplateConfigs", refs={List.class,FleetLaunchTemplateConfig.class}, tree="[0,1]")
    private Output<List<FleetLaunchTemplateConfig>> launchTemplateConfigs;

    /**
     * @return Nested argument containing EC2 Launch Template configurations. Defined below.
     * 
     */
    public Output<List<FleetLaunchTemplateConfig>> launchTemplateConfigs() {
        return this.launchTemplateConfigs;
    }
    /**
     * Nested argument containing On-Demand configurations. Defined below.
     * 
     */
    @Export(name="onDemandOptions", refs={FleetOnDemandOptions.class}, tree="[0]")
    private Output</* @Nullable */ FleetOnDemandOptions> onDemandOptions;

    /**
     * @return Nested argument containing On-Demand configurations. Defined below.
     * 
     */
    public Output<Optional<FleetOnDemandOptions>> onDemandOptions() {
        return Codegen.optional(this.onDemandOptions);
    }
    /**
     * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`. Supported only for fleets of type `maintain`.
     * 
     */
    @Export(name="replaceUnhealthyInstances", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> replaceUnhealthyInstances;

    /**
     * @return Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`. Supported only for fleets of type `maintain`.
     * 
     */
    public Output<Optional<Boolean>> replaceUnhealthyInstances() {
        return Codegen.optional(this.replaceUnhealthyInstances);
    }
    /**
     * Nested argument containing Spot configurations. Defined below.
     * 
     */
    @Export(name="spotOptions", refs={FleetSpotOptions.class}, tree="[0]")
    private Output</* @Nullable */ FleetSpotOptions> spotOptions;

    /**
     * @return Nested argument containing Spot configurations. Defined below.
     * 
     */
    public Output<Optional<FleetSpotOptions>> spotOptions() {
        return Codegen.optional(this.spotOptions);
    }
    /**
     * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Nested argument containing target capacity configurations. Defined below.
     * 
     */
    @Export(name="targetCapacitySpecification", refs={FleetTargetCapacitySpecification.class}, tree="[0]")
    private Output<FleetTargetCapacitySpecification> targetCapacitySpecification;

    /**
     * @return Nested argument containing target capacity configurations. Defined below.
     * 
     */
    public Output<FleetTargetCapacitySpecification> targetCapacitySpecification() {
        return this.targetCapacitySpecification;
    }
    /**
     * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
     * 
     */
    @Export(name="terminateInstances", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> terminateInstances;

    /**
     * @return Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> terminateInstances() {
        return Codegen.optional(this.terminateInstances);
    }
    /**
     * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
     * 
     */
    @Export(name="terminateInstancesWithExpiration", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> terminateInstancesWithExpiration;

    /**
     * @return Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> terminateInstancesWithExpiration() {
        return Codegen.optional(this.terminateInstancesWithExpiration);
    }
    /**
     * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`, `instant`. Defaults to `maintain`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`, `instant`. Defaults to `maintain`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * The start date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
     * 
     */
    @Export(name="validFrom", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> validFrom;

    /**
     * @return The start date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
     * 
     */
    public Output<Optional<String>> validFrom() {
        return Codegen.optional(this.validFrom);
    }
    /**
     * The end date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new EC2 Fleet requests are placed or able to fulfill the request. If no value is specified, the request remains until you cancel it.
     * 
     */
    @Export(name="validUntil", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> validUntil;

    /**
     * @return The end date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new EC2 Fleet requests are placed or able to fulfill the request. If no value is specified, the request remains until you cancel it.
     * 
     */
    public Output<Optional<String>> validUntil() {
        return Codegen.optional(this.validUntil);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Fleet(String name) {
        this(name, FleetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Fleet(String name, FleetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Fleet(String name, FleetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/fleet:Fleet", name, args == null ? FleetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Fleet(String name, Output<String> id, @Nullable FleetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/fleet:Fleet", name, state, makeResourceOptions(options, id));
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
    public static Fleet get(String name, Output<String> id, @Nullable FleetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Fleet(name, id, state, options);
    }
}
