// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a Global Accelerator listener.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.globalaccelerator.Accelerator("example", {
 *     name: "Example",
 *     ipAddressType: "IPV4",
 *     enabled: true,
 *     attributes: {
 *         flowLogsEnabled: true,
 *         flowLogsS3Bucket: "example-bucket",
 *         flowLogsS3Prefix: "flow-logs/",
 *     },
 * });
 * const exampleListener = new aws.globalaccelerator.Listener("example", {
 *     acceleratorArn: example.id,
 *     clientAffinity: "SOURCE_IP",
 *     protocol: "TCP",
 *     portRanges: [{
 *         fromPort: 80,
 *         toPort: 80,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Global Accelerator listeners using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:globalaccelerator/listener:Listener example arn:aws:globalaccelerator::111111111111:accelerator/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/listener/xxxxxxxx
 * ```
 */
export class Listener extends pulumi.CustomResource {
    /**
     * Get an existing Listener resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ListenerState, opts?: pulumi.CustomResourceOptions): Listener {
        return new Listener(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:globalaccelerator/listener:Listener';

    /**
     * Returns true if the given object is an instance of Listener.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Listener {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Listener.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of your accelerator.
     */
    public readonly acceleratorArn!: pulumi.Output<string>;
    /**
     * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the "five-tuple" properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the "two-tuple" properties of source (client) IP address and destination IP address to select the hash value.
     */
    public readonly clientAffinity!: pulumi.Output<string | undefined>;
    /**
     * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     */
    public readonly portRanges!: pulumi.Output<outputs.globalaccelerator.ListenerPortRange[]>;
    /**
     * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
     */
    public readonly protocol!: pulumi.Output<string>;

    /**
     * Create a Listener resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ListenerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ListenerArgs | ListenerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ListenerState | undefined;
            resourceInputs["acceleratorArn"] = state ? state.acceleratorArn : undefined;
            resourceInputs["clientAffinity"] = state ? state.clientAffinity : undefined;
            resourceInputs["portRanges"] = state ? state.portRanges : undefined;
            resourceInputs["protocol"] = state ? state.protocol : undefined;
        } else {
            const args = argsOrState as ListenerArgs | undefined;
            if ((!args || args.acceleratorArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'acceleratorArn'");
            }
            if ((!args || args.portRanges === undefined) && !opts.urn) {
                throw new Error("Missing required property 'portRanges'");
            }
            if ((!args || args.protocol === undefined) && !opts.urn) {
                throw new Error("Missing required property 'protocol'");
            }
            resourceInputs["acceleratorArn"] = args ? args.acceleratorArn : undefined;
            resourceInputs["clientAffinity"] = args ? args.clientAffinity : undefined;
            resourceInputs["portRanges"] = args ? args.portRanges : undefined;
            resourceInputs["protocol"] = args ? args.protocol : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Listener.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Listener resources.
 */
export interface ListenerState {
    /**
     * The Amazon Resource Name (ARN) of your accelerator.
     */
    acceleratorArn?: pulumi.Input<string>;
    /**
     * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the "five-tuple" properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the "two-tuple" properties of source (client) IP address and destination IP address to select the hash value.
     */
    clientAffinity?: pulumi.Input<string>;
    /**
     * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     */
    portRanges?: pulumi.Input<pulumi.Input<inputs.globalaccelerator.ListenerPortRange>[]>;
    /**
     * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
     */
    protocol?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Listener resource.
 */
export interface ListenerArgs {
    /**
     * The Amazon Resource Name (ARN) of your accelerator.
     */
    acceleratorArn: pulumi.Input<string>;
    /**
     * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the "five-tuple" properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the "two-tuple" properties of source (client) IP address and destination IP address to select the hash value.
     */
    clientAffinity?: pulumi.Input<string>;
    /**
     * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     */
    portRanges: pulumi.Input<pulumi.Input<inputs.globalaccelerator.ListenerPortRange>[]>;
    /**
     * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
     */
    protocol: pulumi.Input<string>;
}
