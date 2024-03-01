// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an EC2 Spot Fleet Request resource. This allows a fleet of Spot
 * instances to be requested on the Spot market.
 *
 * > **NOTE [AWS strongly discourages](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-best-practices.html#which-spot-request-method-to-use) the use of the legacy APIs called by this resource.
 * We recommend using the EC2 Fleet or Auto Scaling Group resources instead.
 *
 * ## Example Usage
 * ### Using launch specifications
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * // Request a Spot fleet
 * const cheapCompute = new aws.ec2.SpotFleetRequest("cheap_compute", {
 *     iamFleetRole: "arn:aws:iam::12345678:role/spot-fleet",
 *     spotPrice: "0.03",
 *     allocationStrategy: "diversified",
 *     targetCapacity: 6,
 *     validUntil: "2019-11-04T20:44:20Z",
 *     launchSpecifications: [
 *         {
 *             instanceType: "m4.10xlarge",
 *             ami: "ami-1234",
 *             spotPrice: "2.793",
 *             placementTenancy: "dedicated",
 *             iamInstanceProfileArn: example.arn,
 *         },
 *         {
 *             instanceType: "m4.4xlarge",
 *             ami: "ami-5678",
 *             keyName: "my-key",
 *             spotPrice: "1.117",
 *             iamInstanceProfileArn: example.arn,
 *             availabilityZone: "us-west-1a",
 *             subnetId: "subnet-1234",
 *             weightedCapacity: "35",
 *             rootBlockDevices: [{
 *                 volumeSize: 300,
 *                 volumeType: "gp2",
 *             }],
 *             tags: {
 *                 Name: "spot-fleet-example",
 *             },
 *         },
 *     ],
 * });
 * ```
 * ### Using launch templates
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const foo = new aws.ec2.LaunchTemplate("foo", {
 *     name: "launch-template",
 *     imageId: "ami-516b9131",
 *     instanceType: "m1.small",
 *     keyName: "some-key",
 * });
 * const fooSpotFleetRequest = new aws.ec2.SpotFleetRequest("foo", {
 *     iamFleetRole: "arn:aws:iam::12345678:role/spot-fleet",
 *     spotPrice: "0.005",
 *     targetCapacity: 2,
 *     validUntil: "2019-11-04T20:44:20Z",
 *     launchTemplateConfigs: [{
 *         launchTemplateSpecification: {
 *             id: foo.id,
 *             version: foo.latestVersion,
 *         },
 *     }],
 * });
 * ```
 *
 * > **NOTE:** This provider does not support the functionality where multiple `subnetId` or `availabilityZone` parameters can be specified in the same
 * launch configuration block. If you want to specify multiple values, then separate launch configuration blocks should be used or launch template overrides should be configured, one per subnet:
 * ### Using multiple launch specifications
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const foo = new aws.ec2.SpotFleetRequest("foo", {
 *     iamFleetRole: "arn:aws:iam::12345678:role/spot-fleet",
 *     spotPrice: "0.005",
 *     targetCapacity: 2,
 *     validUntil: "2019-11-04T20:44:20Z",
 *     launchSpecifications: [
 *         {
 *             instanceType: "m1.small",
 *             ami: "ami-d06a90b0",
 *             keyName: "my-key",
 *             availabilityZone: "us-west-2a",
 *         },
 *         {
 *             instanceType: "m5.large",
 *             ami: "ami-d06a90b0",
 *             keyName: "my-key",
 *             availabilityZone: "us-west-2a",
 *         },
 *     ],
 * });
 * ```
 *
 * > In this example, we use a `dynamic` block to define zero or more `launchSpecification` blocks, producing one for each element in the list of subnet ids.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const config = new pulumi.Config();
 * const subnets = config.requireObject("subnets");
 * const example = new aws.ec2.SpotFleetRequest("example", {
 *     launchSpecifications: .map(s => ({
 *         subnetId: s[1],
 *     })).map((v, k) => ({key: k, value: v})).map(entry => ({
 *         ami: "ami-1234",
 *         instanceType: "m4.4xlarge",
 *         subnetId: entry.value.subnetId,
 *         vpcSecurityGroupIds: "sg-123456",
 *         rootBlockDevices: [{
 *             volumeSize: 8,
 *             volumeType: "gp2",
 *             deleteOnTermination: true,
 *         }],
 *         tags: {
 *             Name: "Spot Node",
 *             tag_builder: "builder",
 *         },
 *     })),
 *     iamFleetRole: "arn:aws:iam::12345678:role/spot-fleet",
 *     targetCapacity: 3,
 *     validUntil: "2019-11-04T20:44:20Z",
 *     allocationStrategy: "lowestPrice",
 *     fleetType: "request",
 *     waitForFulfillment: true,
 *     terminateInstancesWithExpiration: true,
 * });
 * ```
 * ### Using multiple launch configurations
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ec2.getSubnets({
 *     filters: [{
 *         name: "vpc-id",
 *         values: [vpcId],
 *     }],
 * });
 * const foo = new aws.ec2.LaunchTemplate("foo", {
 *     name: "launch-template",
 *     imageId: "ami-516b9131",
 *     instanceType: "m1.small",
 *     keyName: "some-key",
 * });
 * const fooSpotFleetRequest = new aws.ec2.SpotFleetRequest("foo", {
 *     iamFleetRole: "arn:aws:iam::12345678:role/spot-fleet",
 *     spotPrice: "0.005",
 *     targetCapacity: 2,
 *     validUntil: "2019-11-04T20:44:20Z",
 *     launchTemplateConfigs: [{
 *         launchTemplateSpecification: {
 *             id: foo.id,
 *             version: foo.latestVersion,
 *         },
 *         overrides: [
 *             {
 *                 subnetId: example.then(example => example.ids?.[0]),
 *             },
 *             {
 *                 subnetId: example.then(example => example.ids?.[1]),
 *             },
 *             {
 *                 subnetId: example.then(example => example.ids?.[2]),
 *             },
 *         ],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Spot Fleet Requests using `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:ec2/spotFleetRequest:SpotFleetRequest fleet sfr-005e9ec8-5546-4c31-b317-31a62325411e
 * ```
 */
export class SpotFleetRequest extends pulumi.CustomResource {
    /**
     * Get an existing SpotFleetRequest resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SpotFleetRequestState, opts?: pulumi.CustomResourceOptions): SpotFleetRequest {
        return new SpotFleetRequest(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/spotFleetRequest:SpotFleetRequest';

    /**
     * Returns true if the given object is an instance of SpotFleetRequest.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SpotFleetRequest {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SpotFleetRequest.__pulumiType;
    }

    /**
     * Indicates how to allocate the target capacity across
     * the Spot pools specified by the Spot fleet request. Valid values: `lowestPrice`, `diversified`, `capacityOptimized`, `capacityOptimizedPrioritized`, and `priceCapacityOptimized`. The default is
     * `lowestPrice`.
     */
    public readonly allocationStrategy!: pulumi.Output<string | undefined>;
    public /*out*/ readonly clientToken!: pulumi.Output<string>;
    /**
     * Reserved.
     */
    public readonly context!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether running Spot
     * instances should be terminated if the target capacity of the Spot fleet
     * request is decreased below the current size of the Spot fleet.
     */
    public readonly excessCapacityTerminationPolicy!: pulumi.Output<string | undefined>;
    /**
     * The type of fleet request. Indicates whether the Spot Fleet only requests the target
     * capacity or also attempts to maintain it. Default is `maintain`.
     */
    public readonly fleetType!: pulumi.Output<string | undefined>;
    /**
     * Grants the Spot fleet permission to terminate
     * Spot instances on your behalf when you cancel its Spot fleet request using
     * CancelSpotFleetRequests or when the Spot fleet request expires, if you set
     * terminateInstancesWithExpiration.
     */
    public readonly iamFleetRole!: pulumi.Output<string>;
    /**
     * Indicates whether a Spot
     * instance stops or terminates when it is interrupted. Default is
     * `terminate`.
     */
    public readonly instanceInterruptionBehaviour!: pulumi.Output<string | undefined>;
    /**
     * The number of Spot pools across which to allocate your target Spot capacity.
     * Valid only when `allocationStrategy` is set to `lowestPrice`. Spot Fleet selects
     * the cheapest Spot pools and evenly allocates your target Spot capacity across
     * the number of Spot pools that you specify.
     */
    public readonly instancePoolsToUseCount!: pulumi.Output<number | undefined>;
    /**
     * Used to define the launch configuration of the
     * spot-fleet request. Can be specified multiple times to define different bids
     * across different markets and instance types. Conflicts with `launchTemplateConfig`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
     *
     * **Note**: This takes in similar but not
     * identical inputs as `aws.ec2.Instance`.  There are limitations on
     * what you can specify. See the list of officially supported inputs in the
     * [reference documentation](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetLaunchSpecification.html). Any normal `aws.ec2.Instance` parameter that corresponds to those inputs may be used and it have
     * a additional parameter `iamInstanceProfileArn` takes `aws.iam.InstanceProfile` attribute `arn` as input.
     */
    public readonly launchSpecifications!: pulumi.Output<outputs.ec2.SpotFleetRequestLaunchSpecification[] | undefined>;
    /**
     * Launch template configuration block. See Launch Template Configs below for more details. Conflicts with `launchSpecification`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
     */
    public readonly launchTemplateConfigs!: pulumi.Output<outputs.ec2.SpotFleetRequestLaunchTemplateConfig[] | undefined>;
    /**
     * A list of elastic load balancer names to add to the Spot fleet.
     */
    public readonly loadBalancers!: pulumi.Output<string[]>;
    /**
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. the possible values are: `lowestPrice` and `prioritized`. the default is `lowestPrice`.
     */
    public readonly onDemandAllocationStrategy!: pulumi.Output<string | undefined>;
    /**
     * The maximum amount per hour for On-Demand Instances that you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
     */
    public readonly onDemandMaxTotalPrice!: pulumi.Output<string | undefined>;
    /**
     * The number of On-Demand units to request. If the request type is `maintain`, you can specify a target capacity of 0 and add capacity later.
     */
    public readonly onDemandTargetCapacity!: pulumi.Output<number | undefined>;
    /**
     * Indicates whether Spot fleet should replace unhealthy instances. Default `false`.
     */
    public readonly replaceUnhealthyInstances!: pulumi.Output<boolean | undefined>;
    /**
     * Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     */
    public readonly spotMaintenanceStrategies!: pulumi.Output<outputs.ec2.SpotFleetRequestSpotMaintenanceStrategies | undefined>;
    /**
     * The maximum bid price per unit hour.
     */
    public readonly spotPrice!: pulumi.Output<string | undefined>;
    /**
     * The state of the Spot fleet request.
     */
    public /*out*/ readonly spotRequestState!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The number of units to request. You can choose to set the
     * target capacity in terms of instances or a performance characteristic that is
     * important to your application workload, such as vCPUs, memory, or I/O.
     */
    public readonly targetCapacity!: pulumi.Output<number>;
    /**
     * The unit for the target capacity. This can only be done with `instanceRequirements` defined
     */
    public readonly targetCapacityUnitType!: pulumi.Output<string | undefined>;
    /**
     * A list of `aws.alb.TargetGroup` ARNs, for use with Application Load Balancing.
     */
    public readonly targetGroupArns!: pulumi.Output<string[]>;
    /**
     * Indicates whether running Spot
     * instances should be terminated when the resource is deleted (and the Spot fleet request cancelled).
     * If no value is specified, the value of the `terminateInstancesWithExpiration` argument is used.
     */
    public readonly terminateInstancesOnDelete!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether running Spot
     * instances should be terminated when the Spot fleet request expires.
     */
    public readonly terminateInstancesWithExpiration!: pulumi.Output<boolean | undefined>;
    /**
     * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
     */
    public readonly validFrom!: pulumi.Output<string | undefined>;
    /**
     * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request.
     */
    public readonly validUntil!: pulumi.Output<string | undefined>;
    /**
     * If set, this provider will
     * wait for the Spot Request to be fulfilled, and will throw an error if the
     * timeout of 10m is reached.
     */
    public readonly waitForFulfillment!: pulumi.Output<boolean | undefined>;

    /**
     * Create a SpotFleetRequest resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SpotFleetRequestArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SpotFleetRequestArgs | SpotFleetRequestState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SpotFleetRequestState | undefined;
            resourceInputs["allocationStrategy"] = state ? state.allocationStrategy : undefined;
            resourceInputs["clientToken"] = state ? state.clientToken : undefined;
            resourceInputs["context"] = state ? state.context : undefined;
            resourceInputs["excessCapacityTerminationPolicy"] = state ? state.excessCapacityTerminationPolicy : undefined;
            resourceInputs["fleetType"] = state ? state.fleetType : undefined;
            resourceInputs["iamFleetRole"] = state ? state.iamFleetRole : undefined;
            resourceInputs["instanceInterruptionBehaviour"] = state ? state.instanceInterruptionBehaviour : undefined;
            resourceInputs["instancePoolsToUseCount"] = state ? state.instancePoolsToUseCount : undefined;
            resourceInputs["launchSpecifications"] = state ? state.launchSpecifications : undefined;
            resourceInputs["launchTemplateConfigs"] = state ? state.launchTemplateConfigs : undefined;
            resourceInputs["loadBalancers"] = state ? state.loadBalancers : undefined;
            resourceInputs["onDemandAllocationStrategy"] = state ? state.onDemandAllocationStrategy : undefined;
            resourceInputs["onDemandMaxTotalPrice"] = state ? state.onDemandMaxTotalPrice : undefined;
            resourceInputs["onDemandTargetCapacity"] = state ? state.onDemandTargetCapacity : undefined;
            resourceInputs["replaceUnhealthyInstances"] = state ? state.replaceUnhealthyInstances : undefined;
            resourceInputs["spotMaintenanceStrategies"] = state ? state.spotMaintenanceStrategies : undefined;
            resourceInputs["spotPrice"] = state ? state.spotPrice : undefined;
            resourceInputs["spotRequestState"] = state ? state.spotRequestState : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["targetCapacity"] = state ? state.targetCapacity : undefined;
            resourceInputs["targetCapacityUnitType"] = state ? state.targetCapacityUnitType : undefined;
            resourceInputs["targetGroupArns"] = state ? state.targetGroupArns : undefined;
            resourceInputs["terminateInstancesOnDelete"] = state ? state.terminateInstancesOnDelete : undefined;
            resourceInputs["terminateInstancesWithExpiration"] = state ? state.terminateInstancesWithExpiration : undefined;
            resourceInputs["validFrom"] = state ? state.validFrom : undefined;
            resourceInputs["validUntil"] = state ? state.validUntil : undefined;
            resourceInputs["waitForFulfillment"] = state ? state.waitForFulfillment : undefined;
        } else {
            const args = argsOrState as SpotFleetRequestArgs | undefined;
            if ((!args || args.iamFleetRole === undefined) && !opts.urn) {
                throw new Error("Missing required property 'iamFleetRole'");
            }
            if ((!args || args.targetCapacity === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetCapacity'");
            }
            resourceInputs["allocationStrategy"] = args ? args.allocationStrategy : undefined;
            resourceInputs["context"] = args ? args.context : undefined;
            resourceInputs["excessCapacityTerminationPolicy"] = args ? args.excessCapacityTerminationPolicy : undefined;
            resourceInputs["fleetType"] = args ? args.fleetType : undefined;
            resourceInputs["iamFleetRole"] = args ? args.iamFleetRole : undefined;
            resourceInputs["instanceInterruptionBehaviour"] = args ? args.instanceInterruptionBehaviour : undefined;
            resourceInputs["instancePoolsToUseCount"] = args ? args.instancePoolsToUseCount : undefined;
            resourceInputs["launchSpecifications"] = args ? args.launchSpecifications : undefined;
            resourceInputs["launchTemplateConfigs"] = args ? args.launchTemplateConfigs : undefined;
            resourceInputs["loadBalancers"] = args ? args.loadBalancers : undefined;
            resourceInputs["onDemandAllocationStrategy"] = args ? args.onDemandAllocationStrategy : undefined;
            resourceInputs["onDemandMaxTotalPrice"] = args ? args.onDemandMaxTotalPrice : undefined;
            resourceInputs["onDemandTargetCapacity"] = args ? args.onDemandTargetCapacity : undefined;
            resourceInputs["replaceUnhealthyInstances"] = args ? args.replaceUnhealthyInstances : undefined;
            resourceInputs["spotMaintenanceStrategies"] = args ? args.spotMaintenanceStrategies : undefined;
            resourceInputs["spotPrice"] = args ? args.spotPrice : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["targetCapacity"] = args ? args.targetCapacity : undefined;
            resourceInputs["targetCapacityUnitType"] = args ? args.targetCapacityUnitType : undefined;
            resourceInputs["targetGroupArns"] = args ? args.targetGroupArns : undefined;
            resourceInputs["terminateInstancesOnDelete"] = args ? args.terminateInstancesOnDelete : undefined;
            resourceInputs["terminateInstancesWithExpiration"] = args ? args.terminateInstancesWithExpiration : undefined;
            resourceInputs["validFrom"] = args ? args.validFrom : undefined;
            resourceInputs["validUntil"] = args ? args.validUntil : undefined;
            resourceInputs["waitForFulfillment"] = args ? args.waitForFulfillment : undefined;
            resourceInputs["clientToken"] = undefined /*out*/;
            resourceInputs["spotRequestState"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SpotFleetRequest.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SpotFleetRequest resources.
 */
export interface SpotFleetRequestState {
    /**
     * Indicates how to allocate the target capacity across
     * the Spot pools specified by the Spot fleet request. Valid values: `lowestPrice`, `diversified`, `capacityOptimized`, `capacityOptimizedPrioritized`, and `priceCapacityOptimized`. The default is
     * `lowestPrice`.
     */
    allocationStrategy?: pulumi.Input<string>;
    clientToken?: pulumi.Input<string>;
    /**
     * Reserved.
     */
    context?: pulumi.Input<string>;
    /**
     * Indicates whether running Spot
     * instances should be terminated if the target capacity of the Spot fleet
     * request is decreased below the current size of the Spot fleet.
     */
    excessCapacityTerminationPolicy?: pulumi.Input<string>;
    /**
     * The type of fleet request. Indicates whether the Spot Fleet only requests the target
     * capacity or also attempts to maintain it. Default is `maintain`.
     */
    fleetType?: pulumi.Input<string>;
    /**
     * Grants the Spot fleet permission to terminate
     * Spot instances on your behalf when you cancel its Spot fleet request using
     * CancelSpotFleetRequests or when the Spot fleet request expires, if you set
     * terminateInstancesWithExpiration.
     */
    iamFleetRole?: pulumi.Input<string>;
    /**
     * Indicates whether a Spot
     * instance stops or terminates when it is interrupted. Default is
     * `terminate`.
     */
    instanceInterruptionBehaviour?: pulumi.Input<string>;
    /**
     * The number of Spot pools across which to allocate your target Spot capacity.
     * Valid only when `allocationStrategy` is set to `lowestPrice`. Spot Fleet selects
     * the cheapest Spot pools and evenly allocates your target Spot capacity across
     * the number of Spot pools that you specify.
     */
    instancePoolsToUseCount?: pulumi.Input<number>;
    /**
     * Used to define the launch configuration of the
     * spot-fleet request. Can be specified multiple times to define different bids
     * across different markets and instance types. Conflicts with `launchTemplateConfig`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
     *
     * **Note**: This takes in similar but not
     * identical inputs as `aws.ec2.Instance`.  There are limitations on
     * what you can specify. See the list of officially supported inputs in the
     * [reference documentation](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetLaunchSpecification.html). Any normal `aws.ec2.Instance` parameter that corresponds to those inputs may be used and it have
     * a additional parameter `iamInstanceProfileArn` takes `aws.iam.InstanceProfile` attribute `arn` as input.
     */
    launchSpecifications?: pulumi.Input<pulumi.Input<inputs.ec2.SpotFleetRequestLaunchSpecification>[]>;
    /**
     * Launch template configuration block. See Launch Template Configs below for more details. Conflicts with `launchSpecification`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
     */
    launchTemplateConfigs?: pulumi.Input<pulumi.Input<inputs.ec2.SpotFleetRequestLaunchTemplateConfig>[]>;
    /**
     * A list of elastic load balancer names to add to the Spot fleet.
     */
    loadBalancers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. the possible values are: `lowestPrice` and `prioritized`. the default is `lowestPrice`.
     */
    onDemandAllocationStrategy?: pulumi.Input<string>;
    /**
     * The maximum amount per hour for On-Demand Instances that you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
     */
    onDemandMaxTotalPrice?: pulumi.Input<string>;
    /**
     * The number of On-Demand units to request. If the request type is `maintain`, you can specify a target capacity of 0 and add capacity later.
     */
    onDemandTargetCapacity?: pulumi.Input<number>;
    /**
     * Indicates whether Spot fleet should replace unhealthy instances. Default `false`.
     */
    replaceUnhealthyInstances?: pulumi.Input<boolean>;
    /**
     * Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     */
    spotMaintenanceStrategies?: pulumi.Input<inputs.ec2.SpotFleetRequestSpotMaintenanceStrategies>;
    /**
     * The maximum bid price per unit hour.
     */
    spotPrice?: pulumi.Input<string>;
    /**
     * The state of the Spot fleet request.
     */
    spotRequestState?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The number of units to request. You can choose to set the
     * target capacity in terms of instances or a performance characteristic that is
     * important to your application workload, such as vCPUs, memory, or I/O.
     */
    targetCapacity?: pulumi.Input<number>;
    /**
     * The unit for the target capacity. This can only be done with `instanceRequirements` defined
     */
    targetCapacityUnitType?: pulumi.Input<string>;
    /**
     * A list of `aws.alb.TargetGroup` ARNs, for use with Application Load Balancing.
     */
    targetGroupArns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether running Spot
     * instances should be terminated when the resource is deleted (and the Spot fleet request cancelled).
     * If no value is specified, the value of the `terminateInstancesWithExpiration` argument is used.
     */
    terminateInstancesOnDelete?: pulumi.Input<string>;
    /**
     * Indicates whether running Spot
     * instances should be terminated when the Spot fleet request expires.
     */
    terminateInstancesWithExpiration?: pulumi.Input<boolean>;
    /**
     * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
     */
    validFrom?: pulumi.Input<string>;
    /**
     * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request.
     */
    validUntil?: pulumi.Input<string>;
    /**
     * If set, this provider will
     * wait for the Spot Request to be fulfilled, and will throw an error if the
     * timeout of 10m is reached.
     */
    waitForFulfillment?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a SpotFleetRequest resource.
 */
export interface SpotFleetRequestArgs {
    /**
     * Indicates how to allocate the target capacity across
     * the Spot pools specified by the Spot fleet request. Valid values: `lowestPrice`, `diversified`, `capacityOptimized`, `capacityOptimizedPrioritized`, and `priceCapacityOptimized`. The default is
     * `lowestPrice`.
     */
    allocationStrategy?: pulumi.Input<string>;
    /**
     * Reserved.
     */
    context?: pulumi.Input<string>;
    /**
     * Indicates whether running Spot
     * instances should be terminated if the target capacity of the Spot fleet
     * request is decreased below the current size of the Spot fleet.
     */
    excessCapacityTerminationPolicy?: pulumi.Input<string>;
    /**
     * The type of fleet request. Indicates whether the Spot Fleet only requests the target
     * capacity or also attempts to maintain it. Default is `maintain`.
     */
    fleetType?: pulumi.Input<string>;
    /**
     * Grants the Spot fleet permission to terminate
     * Spot instances on your behalf when you cancel its Spot fleet request using
     * CancelSpotFleetRequests or when the Spot fleet request expires, if you set
     * terminateInstancesWithExpiration.
     */
    iamFleetRole: pulumi.Input<string>;
    /**
     * Indicates whether a Spot
     * instance stops or terminates when it is interrupted. Default is
     * `terminate`.
     */
    instanceInterruptionBehaviour?: pulumi.Input<string>;
    /**
     * The number of Spot pools across which to allocate your target Spot capacity.
     * Valid only when `allocationStrategy` is set to `lowestPrice`. Spot Fleet selects
     * the cheapest Spot pools and evenly allocates your target Spot capacity across
     * the number of Spot pools that you specify.
     */
    instancePoolsToUseCount?: pulumi.Input<number>;
    /**
     * Used to define the launch configuration of the
     * spot-fleet request. Can be specified multiple times to define different bids
     * across different markets and instance types. Conflicts with `launchTemplateConfig`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
     *
     * **Note**: This takes in similar but not
     * identical inputs as `aws.ec2.Instance`.  There are limitations on
     * what you can specify. See the list of officially supported inputs in the
     * [reference documentation](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotFleetLaunchSpecification.html). Any normal `aws.ec2.Instance` parameter that corresponds to those inputs may be used and it have
     * a additional parameter `iamInstanceProfileArn` takes `aws.iam.InstanceProfile` attribute `arn` as input.
     */
    launchSpecifications?: pulumi.Input<pulumi.Input<inputs.ec2.SpotFleetRequestLaunchSpecification>[]>;
    /**
     * Launch template configuration block. See Launch Template Configs below for more details. Conflicts with `launchSpecification`. At least one of `launchSpecification` or `launchTemplateConfig` is required.
     */
    launchTemplateConfigs?: pulumi.Input<pulumi.Input<inputs.ec2.SpotFleetRequestLaunchTemplateConfig>[]>;
    /**
     * A list of elastic load balancer names to add to the Spot fleet.
     */
    loadBalancers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The order of the launch template overrides to use in fulfilling On-Demand capacity. the possible values are: `lowestPrice` and `prioritized`. the default is `lowestPrice`.
     */
    onDemandAllocationStrategy?: pulumi.Input<string>;
    /**
     * The maximum amount per hour for On-Demand Instances that you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
     */
    onDemandMaxTotalPrice?: pulumi.Input<string>;
    /**
     * The number of On-Demand units to request. If the request type is `maintain`, you can specify a target capacity of 0 and add capacity later.
     */
    onDemandTargetCapacity?: pulumi.Input<number>;
    /**
     * Indicates whether Spot fleet should replace unhealthy instances. Default `false`.
     */
    replaceUnhealthyInstances?: pulumi.Input<boolean>;
    /**
     * Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     */
    spotMaintenanceStrategies?: pulumi.Input<inputs.ec2.SpotFleetRequestSpotMaintenanceStrategies>;
    /**
     * The maximum bid price per unit hour.
     */
    spotPrice?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The number of units to request. You can choose to set the
     * target capacity in terms of instances or a performance characteristic that is
     * important to your application workload, such as vCPUs, memory, or I/O.
     */
    targetCapacity: pulumi.Input<number>;
    /**
     * The unit for the target capacity. This can only be done with `instanceRequirements` defined
     */
    targetCapacityUnitType?: pulumi.Input<string>;
    /**
     * A list of `aws.alb.TargetGroup` ARNs, for use with Application Load Balancing.
     */
    targetGroupArns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether running Spot
     * instances should be terminated when the resource is deleted (and the Spot fleet request cancelled).
     * If no value is specified, the value of the `terminateInstancesWithExpiration` argument is used.
     */
    terminateInstancesOnDelete?: pulumi.Input<string>;
    /**
     * Indicates whether running Spot
     * instances should be terminated when the Spot fleet request expires.
     */
    terminateInstancesWithExpiration?: pulumi.Input<boolean>;
    /**
     * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
     */
    validFrom?: pulumi.Input<string>;
    /**
     * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request.
     */
    validUntil?: pulumi.Input<string>;
    /**
     * If set, this provider will
     * wait for the Spot Request to be fulfilled, and will throw an error if the
     * timeout of 10m is reached.
     */
    waitForFulfillment?: pulumi.Input<boolean>;
}
