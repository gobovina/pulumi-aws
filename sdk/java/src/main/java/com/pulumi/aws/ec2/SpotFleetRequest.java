// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.SpotFleetRequestArgs;
import com.pulumi.aws.ec2.inputs.SpotFleetRequestState;
import com.pulumi.aws.ec2.outputs.SpotFleetRequestLaunchSpecification;
import com.pulumi.aws.ec2.outputs.SpotFleetRequestLaunchTemplateConfig;
import com.pulumi.aws.ec2.outputs.SpotFleetRequestSpotMaintenanceStrategies;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an EC2 Spot Fleet Request resource. This allows a fleet of Spot
 * instances to be requested on the Spot market.
 * 
 * &gt; **NOTE [AWS strongly discourages](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-best-practices.html#which-spot-request-method-to-use) the use of the legacy APIs called by this resource.
 * We recommend using the EC2 Fleet or Auto Scaling Group resources instead.
 * 
 * ## Example Usage
 * ### Using launch specifications
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.SpotFleetRequest;
 * import com.pulumi.aws.ec2.SpotFleetRequestArgs;
 * import com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs;
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
 *         var cheapCompute = new SpotFleetRequest(&#34;cheapCompute&#34;, SpotFleetRequestArgs.builder()        
 *             .iamFleetRole(&#34;arn:aws:iam::12345678:role/spot-fleet&#34;)
 *             .spotPrice(&#34;0.03&#34;)
 *             .allocationStrategy(&#34;diversified&#34;)
 *             .targetCapacity(6)
 *             .validUntil(&#34;2019-11-04T20:44:20Z&#34;)
 *             .launchSpecifications(            
 *                 SpotFleetRequestLaunchSpecificationArgs.builder()
 *                     .instanceType(&#34;m4.10xlarge&#34;)
 *                     .ami(&#34;ami-1234&#34;)
 *                     .spotPrice(&#34;2.793&#34;)
 *                     .placementTenancy(&#34;dedicated&#34;)
 *                     .iamInstanceProfileArn(example.arn())
 *                     .build(),
 *                 SpotFleetRequestLaunchSpecificationArgs.builder()
 *                     .instanceType(&#34;m4.4xlarge&#34;)
 *                     .ami(&#34;ami-5678&#34;)
 *                     .keyName(&#34;my-key&#34;)
 *                     .spotPrice(&#34;1.117&#34;)
 *                     .iamInstanceProfileArn(example.arn())
 *                     .availabilityZone(&#34;us-west-1a&#34;)
 *                     .subnetId(&#34;subnet-1234&#34;)
 *                     .weightedCapacity(35)
 *                     .rootBlockDevices(SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs.builder()
 *                         .volumeSize(&#34;300&#34;)
 *                         .volumeType(&#34;gp2&#34;)
 *                         .build())
 *                     .tags(Map.of(&#34;Name&#34;, &#34;spot-fleet-example&#34;))
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Using launch templates
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.LaunchTemplate;
 * import com.pulumi.aws.ec2.LaunchTemplateArgs;
 * import com.pulumi.aws.ec2.SpotFleetRequest;
 * import com.pulumi.aws.ec2.SpotFleetRequestArgs;
 * import com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigArgs;
 * import com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs;
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
 *         var foo = new LaunchTemplate(&#34;foo&#34;, LaunchTemplateArgs.builder()        
 *             .name(&#34;launch-template&#34;)
 *             .imageId(&#34;ami-516b9131&#34;)
 *             .instanceType(&#34;m1.small&#34;)
 *             .keyName(&#34;some-key&#34;)
 *             .build());
 * 
 *         var fooSpotFleetRequest = new SpotFleetRequest(&#34;fooSpotFleetRequest&#34;, SpotFleetRequestArgs.builder()        
 *             .iamFleetRole(&#34;arn:aws:iam::12345678:role/spot-fleet&#34;)
 *             .spotPrice(&#34;0.005&#34;)
 *             .targetCapacity(2)
 *             .validUntil(&#34;2019-11-04T20:44:20Z&#34;)
 *             .launchTemplateConfigs(SpotFleetRequestLaunchTemplateConfigArgs.builder()
 *                 .launchTemplateSpecification(SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs.builder()
 *                     .id(foo.id())
 *                     .version(foo.latestVersion())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * &gt; **NOTE:** This provider does not support the functionality where multiple `subnet_id` or `availability_zone` parameters can be specified in the same
 * launch configuration block. If you want to specify multiple values, then separate launch configuration blocks should be used or launch template overrides should be configured, one per subnet:
 * ### Using multiple launch specifications
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.SpotFleetRequest;
 * import com.pulumi.aws.ec2.SpotFleetRequestArgs;
 * import com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationArgs;
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
 *         var foo = new SpotFleetRequest(&#34;foo&#34;, SpotFleetRequestArgs.builder()        
 *             .iamFleetRole(&#34;arn:aws:iam::12345678:role/spot-fleet&#34;)
 *             .spotPrice(&#34;0.005&#34;)
 *             .targetCapacity(2)
 *             .validUntil(&#34;2019-11-04T20:44:20Z&#34;)
 *             .launchSpecifications(            
 *                 SpotFleetRequestLaunchSpecificationArgs.builder()
 *                     .instanceType(&#34;m1.small&#34;)
 *                     .ami(&#34;ami-d06a90b0&#34;)
 *                     .keyName(&#34;my-key&#34;)
 *                     .availabilityZone(&#34;us-west-2a&#34;)
 *                     .build(),
 *                 SpotFleetRequestLaunchSpecificationArgs.builder()
 *                     .instanceType(&#34;m5.large&#34;)
 *                     .ami(&#34;ami-d06a90b0&#34;)
 *                     .keyName(&#34;my-key&#34;)
 *                     .availabilityZone(&#34;us-west-2a&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * &gt; In this example, we use a `dynamic` block to define zero or more `launch_specification` blocks, producing one for each element in the list of subnet ids.
 * ### Using multiple launch configurations
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.Ec2Functions;
 * import com.pulumi.aws.ec2.inputs.GetSubnetsArgs;
 * import com.pulumi.aws.ec2.LaunchTemplate;
 * import com.pulumi.aws.ec2.LaunchTemplateArgs;
 * import com.pulumi.aws.ec2.SpotFleetRequest;
 * import com.pulumi.aws.ec2.SpotFleetRequestArgs;
 * import com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigArgs;
 * import com.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs;
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
 *         final var example = Ec2Functions.getSubnets(GetSubnetsArgs.builder()
 *             .filters(GetSubnetsFilterArgs.builder()
 *                 .name(&#34;vpc-id&#34;)
 *                 .values(vpcId)
 *                 .build())
 *             .build());
 * 
 *         var foo = new LaunchTemplate(&#34;foo&#34;, LaunchTemplateArgs.builder()        
 *             .name(&#34;launch-template&#34;)
 *             .imageId(&#34;ami-516b9131&#34;)
 *             .instanceType(&#34;m1.small&#34;)
 *             .keyName(&#34;some-key&#34;)
 *             .build());
 * 
 *         var fooSpotFleetRequest = new SpotFleetRequest(&#34;fooSpotFleetRequest&#34;, SpotFleetRequestArgs.builder()        
 *             .iamFleetRole(&#34;arn:aws:iam::12345678:role/spot-fleet&#34;)
 *             .spotPrice(&#34;0.005&#34;)
 *             .targetCapacity(2)
 *             .validUntil(&#34;2019-11-04T20:44:20Z&#34;)
 *             .launchTemplateConfigs(SpotFleetRequestLaunchTemplateConfigArgs.builder()
 *                 .launchTemplateSpecification(SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs.builder()
 *                     .id(foo.id())
 *                     .version(foo.latestVersion())
 *                     .build())
 *                 .overrides(                
 *                     SpotFleetRequestLaunchTemplateConfigOverrideArgs.builder()
 *                         .subnetId(example.applyValue(getSubnetsResult -&gt; getSubnetsResult.ids()[0]))
 *                         .build(),
 *                     SpotFleetRequestLaunchTemplateConfigOverrideArgs.builder()
 *                         .subnetId(example.applyValue(getSubnetsResult -&gt; getSubnetsResult.ids()[1]))
 *                         .build(),
 *                     SpotFleetRequestLaunchTemplateConfigOverrideArgs.builder()
 *                         .subnetId(example.applyValue(getSubnetsResult -&gt; getSubnetsResult.ids()[2]))
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Spot Fleet Requests using `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ec2/spotFleetRequest:SpotFleetRequest fleet sfr-005e9ec8-5546-4c31-b317-31a62325411e
 * ```
 * 
 */
@ResourceType(type="aws:ec2/spotFleetRequest:SpotFleetRequest")
public class SpotFleetRequest extends com.pulumi.resources.CustomResource {
    /**
     * Indicates how to allocate the target capacity across
     * the Spot pools specified by the Spot fleet request. Valid values: `lowestPrice`, `diversified`, `capacityOptimized`, `capacityOptimizedPrioritized`, and `priceCapacityOptimized`. The default is
     * `lowestPrice`.
     * 
     */
    @Export(name="allocationStrategy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> allocationStrategy;

    /**
     * @return Indicates how to allocate the target capacity across
     * the Spot pools specified by the Spot fleet request. Valid values: `lowestPrice`, `diversified`, `capacityOptimized`, `capacityOptimizedPrioritized`, and `priceCapacityOptimized`. The default is
     * `lowestPrice`.
     * 
     */
    public Output<Optional<String>> allocationStrategy() {
        return Codegen.optional(this.allocationStrategy);
    }
    @Export(name="clientToken", refs={String.class}, tree="[0]")
    private Output<String> clientToken;

    public Output<String> clientToken() {
        return this.clientToken;
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
     * Indicates whether running Spot
     * instances should be terminated if the target capacity of the Spot fleet
     * request is decreased below the current size of the Spot fleet.
     * 
     */
    @Export(name="excessCapacityTerminationPolicy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> excessCapacityTerminationPolicy;

    /**
     * @return Indicates whether running Spot
     * instances should be terminated if the target capacity of the Spot fleet
     * request is decreased below the current size of the Spot fleet.
     * 
     */
    public Output<Optional<String>> excessCapacityTerminationPolicy() {
        return Codegen.optional(this.excessCapacityTerminationPolicy);
    }
    /**
     * The type of fleet request. Indicates whether the Spot Fleet only requests the target
     * capacity or also attempts to maintain it. Default is `maintain`.
     * 
     */
    @Export(name="fleetType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> fleetType;

    /**
     * @return The type of fleet request. Indicates whether the Spot Fleet only requests the target
     * capacity or also attempts to maintain it. Default is `maintain`.
     * 
     */
    public Output<Optional<String>> fleetType() {
        return Codegen.optional(this.fleetType);
    }
    /**
     * Grants the Spot fleet permission to terminate
     * Spot instances on your behalf when you cancel its Spot fleet request using
     * CancelSpotFleetRequests or when the Spot fleet request expires, if you set
     * terminateInstancesWithExpiration.
     * 
     */
    @Export(name="iamFleetRole", refs={String.class}, tree="[0]")
    private Output<String> iamFleetRole;

    /**
     * @return Grants the Spot fleet permission to terminate
     * Spot instances on your behalf when you cancel its Spot fleet request using
     * CancelSpotFleetRequests or when the Spot fleet request expires, if you set
     * terminateInstancesWithExpiration.
     * 
     */
    public Output<String> iamFleetRole() {
        return this.iamFleetRole;
    }
    /**
     * Indicates whether a Spot
     * instance stops or terminates when it is interrupted. Default is
     * `terminate`.
     * 
     */
    @Export(name="instanceInterruptionBehaviour", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceInterruptionBehaviour;

    /**
     * @return Indicates whether a Spot
     * instance stops or terminates when it is interrupted. Default is
     * `terminate`.
     * 
     */
    public Output<Optional<String>> instanceInterruptionBehaviour() {
        return Codegen.optional(this.instanceInterruptionBehaviour);
    }
    /**
     * The number of Spot pools across which to allocate your target Spot capacity.
     * Valid only when `allocation_strategy` is set to `lowestPrice`. Spot Fleet selects
     * the cheapest Spot pools and evenly allocates your target Spot capacity across
     * the number of Spot pools that you specify.
     * 
     */
    @Export(name="instancePoolsToUseCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> instancePoolsToUseCount;

    /**
     * @return The number of Spot pools across which to allocate your target Spot capacity.
     * Valid only when `allocation_strategy` is set to `lowestPrice`. Spot Fleet selects
     * the cheapest Spot pools and evenly allocates your target Spot capacity across
     * the number of Spot pools that you specify.
     * 
     */
    public Output<Optional<Integer>> instancePoolsToUseCount() {
        return Codegen.optional(this.instancePoolsToUseCount);
    }
    /**
     * Used to define the launch configuration of the
     * spot-fleet request. Can be specified multiple times to define different bids
     * across different markets and instance types. Conflicts with `launch_template_config`. At least one of `launch_specification` or `launch_template_config` is required.
     * 
     * **Note**: This takes in similar but not
     * identical inputs as `aws.ec2.Instance`.  There are limitations on
     * what you can specify. See the list of officially supported inputs in the
     * [reference documentation](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetLaunchSpecification.html). Any normal `aws.ec2.Instance` parameter that corresponds to those inputs may be used and it have
     * a additional parameter `iam_instance_profile_arn` takes `aws.iam.InstanceProfile` attribute `arn` as input.
     * 
     */
    @Export(name="launchSpecifications", refs={List.class,SpotFleetRequestLaunchSpecification.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SpotFleetRequestLaunchSpecification>> launchSpecifications;

    /**
     * @return Used to define the launch configuration of the
     * spot-fleet request. Can be specified multiple times to define different bids
     * across different markets and instance types. Conflicts with `launch_template_config`. At least one of `launch_specification` or `launch_template_config` is required.
     * 
     * **Note**: This takes in similar but not
     * identical inputs as `aws.ec2.Instance`.  There are limitations on
     * what you can specify. See the list of officially supported inputs in the
     * [reference documentation](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetLaunchSpecification.html). Any normal `aws.ec2.Instance` parameter that corresponds to those inputs may be used and it have
     * a additional parameter `iam_instance_profile_arn` takes `aws.iam.InstanceProfile` attribute `arn` as input.
     * 
     */
    public Output<Optional<List<SpotFleetRequestLaunchSpecification>>> launchSpecifications() {
        return Codegen.optional(this.launchSpecifications);
    }
    /**
     * Launch template configuration block. See Launch Template Configs below for more details. Conflicts with `launch_specification`. At least one of `launch_specification` or `launch_template_config` is required.
     * 
     */
    @Export(name="launchTemplateConfigs", refs={List.class,SpotFleetRequestLaunchTemplateConfig.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SpotFleetRequestLaunchTemplateConfig>> launchTemplateConfigs;

    /**
     * @return Launch template configuration block. See Launch Template Configs below for more details. Conflicts with `launch_specification`. At least one of `launch_specification` or `launch_template_config` is required.
     * 
     */
    public Output<Optional<List<SpotFleetRequestLaunchTemplateConfig>>> launchTemplateConfigs() {
        return Codegen.optional(this.launchTemplateConfigs);
    }
    /**
     * A list of elastic load balancer names to add to the Spot fleet.
     * 
     */
    @Export(name="loadBalancers", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> loadBalancers;

    /**
     * @return A list of elastic load balancer names to add to the Spot fleet.
     * 
     */
    public Output<List<String>> loadBalancers() {
        return this.loadBalancers;
    }
    /**
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. the possible values are: `lowestPrice` and `prioritized`. the default is `lowestPrice`.
     * 
     */
    @Export(name="onDemandAllocationStrategy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> onDemandAllocationStrategy;

    /**
     * @return The order of the launch template overrides to use in fulfilling On-Demand capacity. the possible values are: `lowestPrice` and `prioritized`. the default is `lowestPrice`.
     * 
     */
    public Output<Optional<String>> onDemandAllocationStrategy() {
        return Codegen.optional(this.onDemandAllocationStrategy);
    }
    /**
     * The maximum amount per hour for On-Demand Instances that you&#39;re willing to pay. When the maximum amount you&#39;re willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
     * 
     */
    @Export(name="onDemandMaxTotalPrice", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> onDemandMaxTotalPrice;

    /**
     * @return The maximum amount per hour for On-Demand Instances that you&#39;re willing to pay. When the maximum amount you&#39;re willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
     * 
     */
    public Output<Optional<String>> onDemandMaxTotalPrice() {
        return Codegen.optional(this.onDemandMaxTotalPrice);
    }
    /**
     * The number of On-Demand units to request. If the request type is `maintain`, you can specify a target capacity of 0 and add capacity later.
     * 
     */
    @Export(name="onDemandTargetCapacity", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> onDemandTargetCapacity;

    /**
     * @return The number of On-Demand units to request. If the request type is `maintain`, you can specify a target capacity of 0 and add capacity later.
     * 
     */
    public Output<Optional<Integer>> onDemandTargetCapacity() {
        return Codegen.optional(this.onDemandTargetCapacity);
    }
    /**
     * Indicates whether Spot fleet should replace unhealthy instances. Default `false`.
     * 
     */
    @Export(name="replaceUnhealthyInstances", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> replaceUnhealthyInstances;

    /**
     * @return Indicates whether Spot fleet should replace unhealthy instances. Default `false`.
     * 
     */
    public Output<Optional<Boolean>> replaceUnhealthyInstances() {
        return Codegen.optional(this.replaceUnhealthyInstances);
    }
    /**
     * Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     * 
     */
    @Export(name="spotMaintenanceStrategies", refs={SpotFleetRequestSpotMaintenanceStrategies.class}, tree="[0]")
    private Output</* @Nullable */ SpotFleetRequestSpotMaintenanceStrategies> spotMaintenanceStrategies;

    /**
     * @return Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     * 
     */
    public Output<Optional<SpotFleetRequestSpotMaintenanceStrategies>> spotMaintenanceStrategies() {
        return Codegen.optional(this.spotMaintenanceStrategies);
    }
    /**
     * The maximum bid price per unit hour.
     * 
     */
    @Export(name="spotPrice", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> spotPrice;

    /**
     * @return The maximum bid price per unit hour.
     * 
     */
    public Output<Optional<String>> spotPrice() {
        return Codegen.optional(this.spotPrice);
    }
    /**
     * The state of the Spot fleet request.
     * 
     */
    @Export(name="spotRequestState", refs={String.class}, tree="[0]")
    private Output<String> spotRequestState;

    /**
     * @return The state of the Spot fleet request.
     * 
     */
    public Output<String> spotRequestState() {
        return this.spotRequestState;
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
     * The number of units to request. You can choose to set the
     * target capacity in terms of instances or a performance characteristic that is
     * important to your application workload, such as vCPUs, memory, or I/O.
     * 
     */
    @Export(name="targetCapacity", refs={Integer.class}, tree="[0]")
    private Output<Integer> targetCapacity;

    /**
     * @return The number of units to request. You can choose to set the
     * target capacity in terms of instances or a performance characteristic that is
     * important to your application workload, such as vCPUs, memory, or I/O.
     * 
     */
    public Output<Integer> targetCapacity() {
        return this.targetCapacity;
    }
    /**
     * The unit for the target capacity. This can only be done with `instance_requirements` defined
     * 
     */
    @Export(name="targetCapacityUnitType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> targetCapacityUnitType;

    /**
     * @return The unit for the target capacity. This can only be done with `instance_requirements` defined
     * 
     */
    public Output<Optional<String>> targetCapacityUnitType() {
        return Codegen.optional(this.targetCapacityUnitType);
    }
    /**
     * A list of `aws.alb.TargetGroup` ARNs, for use with Application Load Balancing.
     * 
     */
    @Export(name="targetGroupArns", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> targetGroupArns;

    /**
     * @return A list of `aws.alb.TargetGroup` ARNs, for use with Application Load Balancing.
     * 
     */
    public Output<List<String>> targetGroupArns() {
        return this.targetGroupArns;
    }
    /**
     * Indicates whether running Spot
     * instances should be terminated when the resource is deleted (and the Spot fleet request cancelled).
     * If no value is specified, the value of the `terminate_instances_with_expiration` argument is used.
     * 
     */
    @Export(name="terminateInstancesOnDelete", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> terminateInstancesOnDelete;

    /**
     * @return Indicates whether running Spot
     * instances should be terminated when the resource is deleted (and the Spot fleet request cancelled).
     * If no value is specified, the value of the `terminate_instances_with_expiration` argument is used.
     * 
     */
    public Output<Optional<String>> terminateInstancesOnDelete() {
        return Codegen.optional(this.terminateInstancesOnDelete);
    }
    /**
     * Indicates whether running Spot
     * instances should be terminated when the Spot fleet request expires.
     * 
     */
    @Export(name="terminateInstancesWithExpiration", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> terminateInstancesWithExpiration;

    /**
     * @return Indicates whether running Spot
     * instances should be terminated when the Spot fleet request expires.
     * 
     */
    public Output<Optional<Boolean>> terminateInstancesWithExpiration() {
        return Codegen.optional(this.terminateInstancesWithExpiration);
    }
    /**
     * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
     * 
     */
    @Export(name="validFrom", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> validFrom;

    /**
     * @return The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
     * 
     */
    public Output<Optional<String>> validFrom() {
        return Codegen.optional(this.validFrom);
    }
    /**
     * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request.
     * 
     */
    @Export(name="validUntil", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> validUntil;

    /**
     * @return The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request.
     * 
     */
    public Output<Optional<String>> validUntil() {
        return Codegen.optional(this.validUntil);
    }
    /**
     * If set, this provider will
     * wait for the Spot Request to be fulfilled, and will throw an error if the
     * timeout of 10m is reached.
     * 
     */
    @Export(name="waitForFulfillment", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> waitForFulfillment;

    /**
     * @return If set, this provider will
     * wait for the Spot Request to be fulfilled, and will throw an error if the
     * timeout of 10m is reached.
     * 
     */
    public Output<Optional<Boolean>> waitForFulfillment() {
        return Codegen.optional(this.waitForFulfillment);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpotFleetRequest(String name) {
        this(name, SpotFleetRequestArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpotFleetRequest(String name, SpotFleetRequestArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpotFleetRequest(String name, SpotFleetRequestArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/spotFleetRequest:SpotFleetRequest", name, args == null ? SpotFleetRequestArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SpotFleetRequest(String name, Output<String> id, @Nullable SpotFleetRequestState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/spotFleetRequest:SpotFleetRequest", name, state, makeResourceOptions(options, id));
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
    public static SpotFleetRequest get(String name, Output<String> id, @Nullable SpotFleetRequestState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SpotFleetRequest(name, id, state, options);
    }
}
