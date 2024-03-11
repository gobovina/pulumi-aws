// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an AppConfig Deployment Strategy resource.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.appconfig.DeploymentStrategy("example", {
 *     name: "example-deployment-strategy-tf",
 *     description: "Example Deployment Strategy",
 *     deploymentDurationInMinutes: 3,
 *     finalBakeTimeInMinutes: 4,
 *     growthFactor: 10,
 *     growthType: "LINEAR",
 *     replicateTo: "NONE",
 *     tags: {
 *         Type: "AppConfig Deployment Strategy",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import AppConfig Deployment Strategies using their deployment strategy ID. For example:
 *
 * ```sh
 * $ pulumi import aws:appconfig/deploymentStrategy:DeploymentStrategy example 11xxxxx
 * ```
 */
export class DeploymentStrategy extends pulumi.CustomResource {
    /**
     * Get an existing DeploymentStrategy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DeploymentStrategyState, opts?: pulumi.CustomResourceOptions): DeploymentStrategy {
        return new DeploymentStrategy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:appconfig/deploymentStrategy:DeploymentStrategy';

    /**
     * Returns true if the given object is an instance of DeploymentStrategy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DeploymentStrategy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DeploymentStrategy.__pulumiType;
    }

    /**
     * ARN of the AppConfig Deployment Strategy.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Total amount of time for a deployment to last. Minimum value of 0, maximum value of 1440.
     */
    public readonly deploymentDurationInMinutes!: pulumi.Output<number>;
    /**
     * Description of the deployment strategy. Can be at most 1024 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Amount of time AWS AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back. Minimum value of 0, maximum value of 1440.
     */
    public readonly finalBakeTimeInMinutes!: pulumi.Output<number | undefined>;
    /**
     * Percentage of targets to receive a deployed configuration during each interval. Minimum value of 1.0, maximum value of 100.0.
     */
    public readonly growthFactor!: pulumi.Output<number>;
    /**
     * Algorithm used to define how percentage grows over time. Valid value: `LINEAR` and `EXPONENTIAL`. Defaults to `LINEAR`.
     */
    public readonly growthType!: pulumi.Output<string | undefined>;
    /**
     * Name for the deployment strategy. Must be between 1 and 64 characters in length.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Where to save the deployment strategy. Valid values: `NONE` and `SSM_DOCUMENT`.
     */
    public readonly replicateTo!: pulumi.Output<string>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a DeploymentStrategy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DeploymentStrategyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DeploymentStrategyArgs | DeploymentStrategyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DeploymentStrategyState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["deploymentDurationInMinutes"] = state ? state.deploymentDurationInMinutes : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["finalBakeTimeInMinutes"] = state ? state.finalBakeTimeInMinutes : undefined;
            resourceInputs["growthFactor"] = state ? state.growthFactor : undefined;
            resourceInputs["growthType"] = state ? state.growthType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["replicateTo"] = state ? state.replicateTo : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as DeploymentStrategyArgs | undefined;
            if ((!args || args.deploymentDurationInMinutes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deploymentDurationInMinutes'");
            }
            if ((!args || args.growthFactor === undefined) && !opts.urn) {
                throw new Error("Missing required property 'growthFactor'");
            }
            if ((!args || args.replicateTo === undefined) && !opts.urn) {
                throw new Error("Missing required property 'replicateTo'");
            }
            resourceInputs["deploymentDurationInMinutes"] = args ? args.deploymentDurationInMinutes : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["finalBakeTimeInMinutes"] = args ? args.finalBakeTimeInMinutes : undefined;
            resourceInputs["growthFactor"] = args ? args.growthFactor : undefined;
            resourceInputs["growthType"] = args ? args.growthType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["replicateTo"] = args ? args.replicateTo : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DeploymentStrategy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DeploymentStrategy resources.
 */
export interface DeploymentStrategyState {
    /**
     * ARN of the AppConfig Deployment Strategy.
     */
    arn?: pulumi.Input<string>;
    /**
     * Total amount of time for a deployment to last. Minimum value of 0, maximum value of 1440.
     */
    deploymentDurationInMinutes?: pulumi.Input<number>;
    /**
     * Description of the deployment strategy. Can be at most 1024 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * Amount of time AWS AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back. Minimum value of 0, maximum value of 1440.
     */
    finalBakeTimeInMinutes?: pulumi.Input<number>;
    /**
     * Percentage of targets to receive a deployed configuration during each interval. Minimum value of 1.0, maximum value of 100.0.
     */
    growthFactor?: pulumi.Input<number>;
    /**
     * Algorithm used to define how percentage grows over time. Valid value: `LINEAR` and `EXPONENTIAL`. Defaults to `LINEAR`.
     */
    growthType?: pulumi.Input<string>;
    /**
     * Name for the deployment strategy. Must be between 1 and 64 characters in length.
     */
    name?: pulumi.Input<string>;
    /**
     * Where to save the deployment strategy. Valid values: `NONE` and `SSM_DOCUMENT`.
     */
    replicateTo?: pulumi.Input<string>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a DeploymentStrategy resource.
 */
export interface DeploymentStrategyArgs {
    /**
     * Total amount of time for a deployment to last. Minimum value of 0, maximum value of 1440.
     */
    deploymentDurationInMinutes: pulumi.Input<number>;
    /**
     * Description of the deployment strategy. Can be at most 1024 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * Amount of time AWS AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back. Minimum value of 0, maximum value of 1440.
     */
    finalBakeTimeInMinutes?: pulumi.Input<number>;
    /**
     * Percentage of targets to receive a deployed configuration during each interval. Minimum value of 1.0, maximum value of 100.0.
     */
    growthFactor: pulumi.Input<number>;
    /**
     * Algorithm used to define how percentage grows over time. Valid value: `LINEAR` and `EXPONENTIAL`. Defaults to `LINEAR`.
     */
    growthType?: pulumi.Input<string>;
    /**
     * Name for the deployment strategy. Must be between 1 and 64 characters in length.
     */
    name?: pulumi.Input<string>;
    /**
     * Where to save the deployment strategy. Valid values: `NONE` and `SSM_DOCUMENT`.
     */
    replicateTo: pulumi.Input<string>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
