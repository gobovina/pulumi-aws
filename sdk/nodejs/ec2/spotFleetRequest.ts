// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * Spot Fleet Requests can be imported using `id`, e.g.,
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
     * the Spot pools specified by the Spot fleet request. The default is
     * `lowestPrice`.
     */
    public readonly allocationStrategy!: pulumi.Output<string | undefined>;
    public /*out*/ readonly clientToken!: pulumi.Output<string>;
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
     * The maximum spot bid for this override request.
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
     * A map of tags assigned to the resource, including those inherited from the provider .
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The number of units to request. You can choose to set the
     * target capacity in terms of instances or a performance characteristic that is
     * important to your application workload, such as vCPUs, memory, or I/O.
     */
    public readonly targetCapacity!: pulumi.Output<number>;
    /**
     * A list of `aws.alb.TargetGroup` ARNs, for use with Application Load Balancing.
     */
    public readonly targetGroupArns!: pulumi.Output<string[]>;
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
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SpotFleetRequestState | undefined;
            inputs["allocationStrategy"] = state ? state.allocationStrategy : undefined;
            inputs["clientToken"] = state ? state.clientToken : undefined;
            inputs["excessCapacityTerminationPolicy"] = state ? state.excessCapacityTerminationPolicy : undefined;
            inputs["fleetType"] = state ? state.fleetType : undefined;
            inputs["iamFleetRole"] = state ? state.iamFleetRole : undefined;
            inputs["instanceInterruptionBehaviour"] = state ? state.instanceInterruptionBehaviour : undefined;
            inputs["instancePoolsToUseCount"] = state ? state.instancePoolsToUseCount : undefined;
            inputs["launchSpecifications"] = state ? state.launchSpecifications : undefined;
            inputs["launchTemplateConfigs"] = state ? state.launchTemplateConfigs : undefined;
            inputs["loadBalancers"] = state ? state.loadBalancers : undefined;
            inputs["onDemandAllocationStrategy"] = state ? state.onDemandAllocationStrategy : undefined;
            inputs["onDemandMaxTotalPrice"] = state ? state.onDemandMaxTotalPrice : undefined;
            inputs["onDemandTargetCapacity"] = state ? state.onDemandTargetCapacity : undefined;
            inputs["replaceUnhealthyInstances"] = state ? state.replaceUnhealthyInstances : undefined;
            inputs["spotMaintenanceStrategies"] = state ? state.spotMaintenanceStrategies : undefined;
            inputs["spotPrice"] = state ? state.spotPrice : undefined;
            inputs["spotRequestState"] = state ? state.spotRequestState : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["tagsAll"] = state ? state.tagsAll : undefined;
            inputs["targetCapacity"] = state ? state.targetCapacity : undefined;
            inputs["targetGroupArns"] = state ? state.targetGroupArns : undefined;
            inputs["terminateInstancesWithExpiration"] = state ? state.terminateInstancesWithExpiration : undefined;
            inputs["validFrom"] = state ? state.validFrom : undefined;
            inputs["validUntil"] = state ? state.validUntil : undefined;
            inputs["waitForFulfillment"] = state ? state.waitForFulfillment : undefined;
        } else {
            const args = argsOrState as SpotFleetRequestArgs | undefined;
            if ((!args || args.iamFleetRole === undefined) && !opts.urn) {
                throw new Error("Missing required property 'iamFleetRole'");
            }
            if ((!args || args.targetCapacity === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetCapacity'");
            }
            inputs["allocationStrategy"] = args ? args.allocationStrategy : undefined;
            inputs["excessCapacityTerminationPolicy"] = args ? args.excessCapacityTerminationPolicy : undefined;
            inputs["fleetType"] = args ? args.fleetType : undefined;
            inputs["iamFleetRole"] = args ? args.iamFleetRole : undefined;
            inputs["instanceInterruptionBehaviour"] = args ? args.instanceInterruptionBehaviour : undefined;
            inputs["instancePoolsToUseCount"] = args ? args.instancePoolsToUseCount : undefined;
            inputs["launchSpecifications"] = args ? args.launchSpecifications : undefined;
            inputs["launchTemplateConfigs"] = args ? args.launchTemplateConfigs : undefined;
            inputs["loadBalancers"] = args ? args.loadBalancers : undefined;
            inputs["onDemandAllocationStrategy"] = args ? args.onDemandAllocationStrategy : undefined;
            inputs["onDemandMaxTotalPrice"] = args ? args.onDemandMaxTotalPrice : undefined;
            inputs["onDemandTargetCapacity"] = args ? args.onDemandTargetCapacity : undefined;
            inputs["replaceUnhealthyInstances"] = args ? args.replaceUnhealthyInstances : undefined;
            inputs["spotMaintenanceStrategies"] = args ? args.spotMaintenanceStrategies : undefined;
            inputs["spotPrice"] = args ? args.spotPrice : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["targetCapacity"] = args ? args.targetCapacity : undefined;
            inputs["targetGroupArns"] = args ? args.targetGroupArns : undefined;
            inputs["terminateInstancesWithExpiration"] = args ? args.terminateInstancesWithExpiration : undefined;
            inputs["validFrom"] = args ? args.validFrom : undefined;
            inputs["validUntil"] = args ? args.validUntil : undefined;
            inputs["waitForFulfillment"] = args ? args.waitForFulfillment : undefined;
            inputs["clientToken"] = undefined /*out*/;
            inputs["spotRequestState"] = undefined /*out*/;
            inputs["tagsAll"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(SpotFleetRequest.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SpotFleetRequest resources.
 */
export interface SpotFleetRequestState {
    /**
     * Indicates how to allocate the target capacity across
     * the Spot pools specified by the Spot fleet request. The default is
     * `lowestPrice`.
     */
    allocationStrategy?: pulumi.Input<string>;
    clientToken?: pulumi.Input<string>;
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
     * The maximum spot bid for this override request.
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
     * A map of tags assigned to the resource, including those inherited from the provider .
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The number of units to request. You can choose to set the
     * target capacity in terms of instances or a performance characteristic that is
     * important to your application workload, such as vCPUs, memory, or I/O.
     */
    targetCapacity?: pulumi.Input<number>;
    /**
     * A list of `aws.alb.TargetGroup` ARNs, for use with Application Load Balancing.
     */
    targetGroupArns?: pulumi.Input<pulumi.Input<string>[]>;
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
     * the Spot pools specified by the Spot fleet request. The default is
     * `lowestPrice`.
     */
    allocationStrategy?: pulumi.Input<string>;
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
     * The maximum spot bid for this override request.
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
     * A list of `aws.alb.TargetGroup` ARNs, for use with Application Load Balancing.
     */
    targetGroupArns?: pulumi.Input<pulumi.Input<string>[]>;
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
