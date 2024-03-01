// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an SES receipt filter resource
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const filter = new aws.ses.ReceiptFilter("filter", {
 *     name: "block-spammer",
 *     cidr: "10.10.10.10",
 *     policy: "Block",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import SES Receipt Filter using their `name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:ses/receiptFilter:ReceiptFilter test some-filter
 * ```
 */
export class ReceiptFilter extends pulumi.CustomResource {
    /**
     * Get an existing ReceiptFilter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ReceiptFilterState, opts?: pulumi.CustomResourceOptions): ReceiptFilter {
        return new ReceiptFilter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ses/receiptFilter:ReceiptFilter';

    /**
     * Returns true if the given object is an instance of ReceiptFilter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ReceiptFilter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ReceiptFilter.__pulumiType;
    }

    /**
     * The SES receipt filter ARN.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The IP address or address range to filter, in CIDR notation
     */
    public readonly cidr!: pulumi.Output<string>;
    /**
     * The name of the filter
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Block or Allow
     */
    public readonly policy!: pulumi.Output<string>;

    /**
     * Create a ReceiptFilter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ReceiptFilterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ReceiptFilterArgs | ReceiptFilterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ReceiptFilterState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["cidr"] = state ? state.cidr : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policy"] = state ? state.policy : undefined;
        } else {
            const args = argsOrState as ReceiptFilterArgs | undefined;
            if ((!args || args.cidr === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cidr'");
            }
            if ((!args || args.policy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policy'");
            }
            resourceInputs["cidr"] = args ? args.cidr : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["policy"] = args ? args.policy : undefined;
            resourceInputs["arn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ReceiptFilter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ReceiptFilter resources.
 */
export interface ReceiptFilterState {
    /**
     * The SES receipt filter ARN.
     */
    arn?: pulumi.Input<string>;
    /**
     * The IP address or address range to filter, in CIDR notation
     */
    cidr?: pulumi.Input<string>;
    /**
     * The name of the filter
     */
    name?: pulumi.Input<string>;
    /**
     * Block or Allow
     */
    policy?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ReceiptFilter resource.
 */
export interface ReceiptFilterArgs {
    /**
     * The IP address or address range to filter, in CIDR notation
     */
    cidr: pulumi.Input<string>;
    /**
     * The name of the filter
     */
    name?: pulumi.Input<string>;
    /**
     * Block or Allow
     */
    policy: pulumi.Input<string>;
}
