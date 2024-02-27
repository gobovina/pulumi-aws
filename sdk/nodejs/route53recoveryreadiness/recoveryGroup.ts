// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an AWS Route 53 Recovery Readiness Recovery Group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.route53recoveryreadiness.RecoveryGroup("example", {recoveryGroupName: "my-high-availability-app"});
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Route53 Recovery Readiness recovery groups using the recovery group name. For example:
 *
 * ```sh
 *  $ pulumi import aws:route53recoveryreadiness/recoveryGroup:RecoveryGroup my-high-availability-app my-high-availability-app
 * ```
 */
export class RecoveryGroup extends pulumi.CustomResource {
    /**
     * Get an existing RecoveryGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RecoveryGroupState, opts?: pulumi.CustomResourceOptions): RecoveryGroup {
        return new RecoveryGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:route53recoveryreadiness/recoveryGroup:RecoveryGroup';

    /**
     * Returns true if the given object is an instance of RecoveryGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RecoveryGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RecoveryGroup.__pulumiType;
    }

    /**
     * ARN of the recovery group
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * List of cell arns to add as nested fault domains within this recovery group
     */
    public readonly cells!: pulumi.Output<string[] | undefined>;
    /**
     * A unique name describing the recovery group.
     *
     * The following argument are optional:
     */
    public readonly recoveryGroupName!: pulumi.Output<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a RecoveryGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RecoveryGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RecoveryGroupArgs | RecoveryGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RecoveryGroupState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["cells"] = state ? state.cells : undefined;
            resourceInputs["recoveryGroupName"] = state ? state.recoveryGroupName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as RecoveryGroupArgs | undefined;
            if ((!args || args.recoveryGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'recoveryGroupName'");
            }
            resourceInputs["cells"] = args ? args.cells : undefined;
            resourceInputs["recoveryGroupName"] = args ? args.recoveryGroupName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RecoveryGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RecoveryGroup resources.
 */
export interface RecoveryGroupState {
    /**
     * ARN of the recovery group
     */
    arn?: pulumi.Input<string>;
    /**
     * List of cell arns to add as nested fault domains within this recovery group
     */
    cells?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A unique name describing the recovery group.
     *
     * The following argument are optional:
     */
    recoveryGroupName?: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
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
 * The set of arguments for constructing a RecoveryGroup resource.
 */
export interface RecoveryGroupArgs {
    /**
     * List of cell arns to add as nested fault domains within this recovery group
     */
    cells?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A unique name describing the recovery group.
     *
     * The following argument are optional:
     */
    recoveryGroupName: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
