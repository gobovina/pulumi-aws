// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a Batch Scheduling Policy resource.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.batch.SchedulingPolicy("example", {
 *     name: "example",
 *     fairSharePolicy: {
 *         computeReservation: 1,
 *         shareDecaySeconds: 3600,
 *         shareDistributions: [
 *             {
 *                 shareIdentifier: "A1*",
 *                 weightFactor: 0.1,
 *             },
 *             {
 *                 shareIdentifier: "A2",
 *                 weightFactor: 0.2,
 *             },
 *         ],
 *     },
 *     tags: {
 *         Name: "Example Batch Scheduling Policy",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Batch Scheduling Policy using the `arn`. For example:
 *
 * ```sh
 * $ pulumi import aws:batch/schedulingPolicy:SchedulingPolicy test_policy arn:aws:batch:us-east-1:123456789012:scheduling-policy/sample
 * ```
 */
export class SchedulingPolicy extends pulumi.CustomResource {
    /**
     * Get an existing SchedulingPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SchedulingPolicyState, opts?: pulumi.CustomResourceOptions): SchedulingPolicy {
        return new SchedulingPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:batch/schedulingPolicy:SchedulingPolicy';

    /**
     * Returns true if the given object is an instance of SchedulingPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SchedulingPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SchedulingPolicy.__pulumiType;
    }

    /**
     * The Amazon Resource Name of the scheduling policy.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    public readonly fairSharePolicy!: pulumi.Output<outputs.batch.SchedulingPolicyFairSharePolicy | undefined>;
    /**
     * Specifies the name of the scheduling policy.
     */
    public readonly name!: pulumi.Output<string>;
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
     * Create a SchedulingPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SchedulingPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SchedulingPolicyArgs | SchedulingPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SchedulingPolicyState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["fairSharePolicy"] = state ? state.fairSharePolicy : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as SchedulingPolicyArgs | undefined;
            resourceInputs["fairSharePolicy"] = args ? args.fairSharePolicy : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SchedulingPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SchedulingPolicy resources.
 */
export interface SchedulingPolicyState {
    /**
     * The Amazon Resource Name of the scheduling policy.
     */
    arn?: pulumi.Input<string>;
    fairSharePolicy?: pulumi.Input<inputs.batch.SchedulingPolicyFairSharePolicy>;
    /**
     * Specifies the name of the scheduling policy.
     */
    name?: pulumi.Input<string>;
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
 * The set of arguments for constructing a SchedulingPolicy resource.
 */
export interface SchedulingPolicyArgs {
    fairSharePolicy?: pulumi.Input<inputs.batch.SchedulingPolicyFairSharePolicy>;
    /**
     * Specifies the name of the scheduling policy.
     */
    name?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
