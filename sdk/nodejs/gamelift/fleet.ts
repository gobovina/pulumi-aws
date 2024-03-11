// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a GameLift Fleet resource.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.gamelift.Fleet("example", {
 *     buildId: exampleAwsGameliftBuild.id,
 *     ec2InstanceType: "t2.micro",
 *     fleetType: "ON_DEMAND",
 *     name: "example-fleet-name",
 *     runtimeConfiguration: {
 *         serverProcesses: [{
 *             concurrentExecutions: 1,
 *             launchPath: "C:\\game\\GomokuServer.exe",
 *         }],
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import GameLift Fleets using the ID. For example:
 *
 * ```sh
 * $ pulumi import aws:gamelift/fleet:Fleet example <fleet-id>
 * ```
 */
export class Fleet extends pulumi.CustomResource {
    /**
     * Get an existing Fleet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FleetState, opts?: pulumi.CustomResourceOptions): Fleet {
        return new Fleet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:gamelift/fleet:Fleet';

    /**
     * Returns true if the given object is an instance of Fleet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Fleet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Fleet.__pulumiType;
    }

    /**
     * Fleet ARN.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Build ARN.
     */
    public /*out*/ readonly buildArn!: pulumi.Output<string>;
    /**
     * ID of the GameLift Build to be deployed on the fleet.
     */
    public readonly buildId!: pulumi.Output<string | undefined>;
    /**
     * Prompts GameLift to generate a TLS/SSL certificate for the fleet. See certificate_configuration.
     */
    public readonly certificateConfiguration!: pulumi.Output<outputs.gamelift.FleetCertificateConfiguration>;
    /**
     * Human-readable description of the fleet.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
     */
    public readonly ec2InboundPermissions!: pulumi.Output<outputs.gamelift.FleetEc2InboundPermission[]>;
    /**
     * Name of an EC2 instance typeE.g., `t2.micro`
     */
    public readonly ec2InstanceType!: pulumi.Output<string>;
    /**
     * Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
     */
    public readonly fleetType!: pulumi.Output<string | undefined>;
    /**
     * ARN of an IAM role that instances in the fleet can assume.
     */
    public readonly instanceRoleArn!: pulumi.Output<string | undefined>;
    public /*out*/ readonly logPaths!: pulumi.Output<string[]>;
    /**
     * List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
     */
    public readonly metricGroups!: pulumi.Output<string[]>;
    /**
     * The name of the fleet.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Game session protection policy to apply to all instances in this fleetE.g., `FullProtection`. Defaults to `NoProtection`.
     */
    public readonly newGameSessionProtectionPolicy!: pulumi.Output<string | undefined>;
    /**
     * Operating system of the fleet's computing resources.
     */
    public /*out*/ readonly operatingSystem!: pulumi.Output<string>;
    /**
     * Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
     */
    public readonly resourceCreationLimitPolicy!: pulumi.Output<outputs.gamelift.FleetResourceCreationLimitPolicy | undefined>;
    /**
     * Instructions for launching server processes on each instance in the fleet. See below.
     */
    public readonly runtimeConfiguration!: pulumi.Output<outputs.gamelift.FleetRuntimeConfiguration | undefined>;
    /**
     * Script ARN.
     */
    public /*out*/ readonly scriptArn!: pulumi.Output<string>;
    /**
     * ID of the GameLift Script to be deployed on the fleet.
     */
    public readonly scriptId!: pulumi.Output<string | undefined>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Fleet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FleetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FleetArgs | FleetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FleetState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["buildArn"] = state ? state.buildArn : undefined;
            resourceInputs["buildId"] = state ? state.buildId : undefined;
            resourceInputs["certificateConfiguration"] = state ? state.certificateConfiguration : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["ec2InboundPermissions"] = state ? state.ec2InboundPermissions : undefined;
            resourceInputs["ec2InstanceType"] = state ? state.ec2InstanceType : undefined;
            resourceInputs["fleetType"] = state ? state.fleetType : undefined;
            resourceInputs["instanceRoleArn"] = state ? state.instanceRoleArn : undefined;
            resourceInputs["logPaths"] = state ? state.logPaths : undefined;
            resourceInputs["metricGroups"] = state ? state.metricGroups : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["newGameSessionProtectionPolicy"] = state ? state.newGameSessionProtectionPolicy : undefined;
            resourceInputs["operatingSystem"] = state ? state.operatingSystem : undefined;
            resourceInputs["resourceCreationLimitPolicy"] = state ? state.resourceCreationLimitPolicy : undefined;
            resourceInputs["runtimeConfiguration"] = state ? state.runtimeConfiguration : undefined;
            resourceInputs["scriptArn"] = state ? state.scriptArn : undefined;
            resourceInputs["scriptId"] = state ? state.scriptId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as FleetArgs | undefined;
            if ((!args || args.ec2InstanceType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ec2InstanceType'");
            }
            resourceInputs["buildId"] = args ? args.buildId : undefined;
            resourceInputs["certificateConfiguration"] = args ? args.certificateConfiguration : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["ec2InboundPermissions"] = args ? args.ec2InboundPermissions : undefined;
            resourceInputs["ec2InstanceType"] = args ? args.ec2InstanceType : undefined;
            resourceInputs["fleetType"] = args ? args.fleetType : undefined;
            resourceInputs["instanceRoleArn"] = args ? args.instanceRoleArn : undefined;
            resourceInputs["metricGroups"] = args ? args.metricGroups : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["newGameSessionProtectionPolicy"] = args ? args.newGameSessionProtectionPolicy : undefined;
            resourceInputs["resourceCreationLimitPolicy"] = args ? args.resourceCreationLimitPolicy : undefined;
            resourceInputs["runtimeConfiguration"] = args ? args.runtimeConfiguration : undefined;
            resourceInputs["scriptId"] = args ? args.scriptId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["buildArn"] = undefined /*out*/;
            resourceInputs["logPaths"] = undefined /*out*/;
            resourceInputs["operatingSystem"] = undefined /*out*/;
            resourceInputs["scriptArn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Fleet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Fleet resources.
 */
export interface FleetState {
    /**
     * Fleet ARN.
     */
    arn?: pulumi.Input<string>;
    /**
     * Build ARN.
     */
    buildArn?: pulumi.Input<string>;
    /**
     * ID of the GameLift Build to be deployed on the fleet.
     */
    buildId?: pulumi.Input<string>;
    /**
     * Prompts GameLift to generate a TLS/SSL certificate for the fleet. See certificate_configuration.
     */
    certificateConfiguration?: pulumi.Input<inputs.gamelift.FleetCertificateConfiguration>;
    /**
     * Human-readable description of the fleet.
     */
    description?: pulumi.Input<string>;
    /**
     * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
     */
    ec2InboundPermissions?: pulumi.Input<pulumi.Input<inputs.gamelift.FleetEc2InboundPermission>[]>;
    /**
     * Name of an EC2 instance typeE.g., `t2.micro`
     */
    ec2InstanceType?: pulumi.Input<string>;
    /**
     * Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
     */
    fleetType?: pulumi.Input<string>;
    /**
     * ARN of an IAM role that instances in the fleet can assume.
     */
    instanceRoleArn?: pulumi.Input<string>;
    logPaths?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
     */
    metricGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the fleet.
     */
    name?: pulumi.Input<string>;
    /**
     * Game session protection policy to apply to all instances in this fleetE.g., `FullProtection`. Defaults to `NoProtection`.
     */
    newGameSessionProtectionPolicy?: pulumi.Input<string>;
    /**
     * Operating system of the fleet's computing resources.
     */
    operatingSystem?: pulumi.Input<string>;
    /**
     * Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
     */
    resourceCreationLimitPolicy?: pulumi.Input<inputs.gamelift.FleetResourceCreationLimitPolicy>;
    /**
     * Instructions for launching server processes on each instance in the fleet. See below.
     */
    runtimeConfiguration?: pulumi.Input<inputs.gamelift.FleetRuntimeConfiguration>;
    /**
     * Script ARN.
     */
    scriptArn?: pulumi.Input<string>;
    /**
     * ID of the GameLift Script to be deployed on the fleet.
     */
    scriptId?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Fleet resource.
 */
export interface FleetArgs {
    /**
     * ID of the GameLift Build to be deployed on the fleet.
     */
    buildId?: pulumi.Input<string>;
    /**
     * Prompts GameLift to generate a TLS/SSL certificate for the fleet. See certificate_configuration.
     */
    certificateConfiguration?: pulumi.Input<inputs.gamelift.FleetCertificateConfiguration>;
    /**
     * Human-readable description of the fleet.
     */
    description?: pulumi.Input<string>;
    /**
     * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
     */
    ec2InboundPermissions?: pulumi.Input<pulumi.Input<inputs.gamelift.FleetEc2InboundPermission>[]>;
    /**
     * Name of an EC2 instance typeE.g., `t2.micro`
     */
    ec2InstanceType: pulumi.Input<string>;
    /**
     * Type of fleet. This value must be `ON_DEMAND` or `SPOT`. Defaults to `ON_DEMAND`.
     */
    fleetType?: pulumi.Input<string>;
    /**
     * ARN of an IAM role that instances in the fleet can assume.
     */
    instanceRoleArn?: pulumi.Input<string>;
    /**
     * List of names of metric groups to add this fleet to. A metric group tracks metrics across all fleets in the group. Defaults to `default`.
     */
    metricGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the fleet.
     */
    name?: pulumi.Input<string>;
    /**
     * Game session protection policy to apply to all instances in this fleetE.g., `FullProtection`. Defaults to `NoProtection`.
     */
    newGameSessionProtectionPolicy?: pulumi.Input<string>;
    /**
     * Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
     */
    resourceCreationLimitPolicy?: pulumi.Input<inputs.gamelift.FleetResourceCreationLimitPolicy>;
    /**
     * Instructions for launching server processes on each instance in the fleet. See below.
     */
    runtimeConfiguration?: pulumi.Input<inputs.gamelift.FleetRuntimeConfiguration>;
    /**
     * ID of the GameLift Script to be deployed on the fleet.
     */
    scriptId?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
