// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS SESv2 (Simple Email V2) Dedicated IP Pool.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.sesv2.DedicatedIpPool("example", {poolName: "my-pool"});
 * ```
 * ### Managed Pool
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.sesv2.DedicatedIpPool("example", {
 *     poolName: "my-managed-pool",
 *     scalingMode: "MANAGED",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import SESv2 (Simple Email V2) Dedicated IP Pool using the `pool_name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:sesv2/dedicatedIpPool:DedicatedIpPool example my-pool
 * ```
 */
export class DedicatedIpPool extends pulumi.CustomResource {
    /**
     * Get an existing DedicatedIpPool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DedicatedIpPoolState, opts?: pulumi.CustomResourceOptions): DedicatedIpPool {
        return new DedicatedIpPool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:sesv2/dedicatedIpPool:DedicatedIpPool';

    /**
     * Returns true if the given object is an instance of DedicatedIpPool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DedicatedIpPool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DedicatedIpPool.__pulumiType;
    }

    /**
     * ARN of the Dedicated IP Pool.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Name of the dedicated IP pool.
     *
     * The following arguments are optional:
     */
    public readonly poolName!: pulumi.Output<string>;
    /**
     * IP pool scaling mode. Valid values: `STANDARD`, `MANAGED`. If omitted, the AWS API will default to a standard pool.
     */
    public readonly scalingMode!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the pool. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a DedicatedIpPool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DedicatedIpPoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DedicatedIpPoolArgs | DedicatedIpPoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DedicatedIpPoolState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["poolName"] = state ? state.poolName : undefined;
            resourceInputs["scalingMode"] = state ? state.scalingMode : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as DedicatedIpPoolArgs | undefined;
            if ((!args || args.poolName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'poolName'");
            }
            resourceInputs["poolName"] = args ? args.poolName : undefined;
            resourceInputs["scalingMode"] = args ? args.scalingMode : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DedicatedIpPool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DedicatedIpPool resources.
 */
export interface DedicatedIpPoolState {
    /**
     * ARN of the Dedicated IP Pool.
     */
    arn?: pulumi.Input<string>;
    /**
     * Name of the dedicated IP pool.
     *
     * The following arguments are optional:
     */
    poolName?: pulumi.Input<string>;
    /**
     * IP pool scaling mode. Valid values: `STANDARD`, `MANAGED`. If omitted, the AWS API will default to a standard pool.
     */
    scalingMode?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the pool. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a DedicatedIpPool resource.
 */
export interface DedicatedIpPoolArgs {
    /**
     * Name of the dedicated IP pool.
     *
     * The following arguments are optional:
     */
    poolName: pulumi.Input<string>;
    /**
     * IP pool scaling mode. Valid values: `STANDARD`, `MANAGED`. If omitted, the AWS API will default to a standard pool.
     */
    scalingMode?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the pool. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
