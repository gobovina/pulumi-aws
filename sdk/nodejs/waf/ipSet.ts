// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a WAF IPSet Resource
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const ipset = new aws.waf.IpSet("ipset", {ipSetDescriptors: [
 *     {
 *         type: "IPV4",
 *         value: "192.0.7.0/24",
 *     },
 *     {
 *         type: "IPV4",
 *         value: "10.16.16.0/16",
 *     },
 * ]});
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import WAF IPSets using their ID. For example:
 *
 * ```sh
 *  $ pulumi import aws:waf/ipSet:IpSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 */
export class IpSet extends pulumi.CustomResource {
    /**
     * Get an existing IpSet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IpSetState, opts?: pulumi.CustomResourceOptions): IpSet {
        return new IpSet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:waf/ipSet:IpSet';

    /**
     * Returns true if the given object is an instance of IpSet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IpSet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IpSet.__pulumiType;
    }

    /**
     * The ARN of the WAF IPSet.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
     */
    public readonly ipSetDescriptors!: pulumi.Output<outputs.waf.IpSetIpSetDescriptor[] | undefined>;
    /**
     * The name or description of the IPSet.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a IpSet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: IpSetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IpSetArgs | IpSetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IpSetState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["ipSetDescriptors"] = state ? state.ipSetDescriptors : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as IpSetArgs | undefined;
            resourceInputs["ipSetDescriptors"] = args ? args.ipSetDescriptors : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["arn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IpSet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IpSet resources.
 */
export interface IpSetState {
    /**
     * The ARN of the WAF IPSet.
     */
    arn?: pulumi.Input<string>;
    /**
     * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
     */
    ipSetDescriptors?: pulumi.Input<pulumi.Input<inputs.waf.IpSetIpSetDescriptor>[]>;
    /**
     * The name or description of the IPSet.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IpSet resource.
 */
export interface IpSetArgs {
    /**
     * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
     */
    ipSetDescriptors?: pulumi.Input<pulumi.Input<inputs.waf.IpSetIpSetDescriptor>[]>;
    /**
     * The name or description of the IPSet.
     */
    name?: pulumi.Input<string>;
}
