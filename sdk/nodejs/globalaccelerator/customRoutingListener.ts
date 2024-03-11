// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a Global Accelerator custom routing listener.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.globalaccelerator.CustomRoutingAccelerator("example", {
 *     name: "Example",
 *     ipAddressType: "IPV4",
 *     enabled: true,
 *     attributes: {
 *         flowLogsEnabled: true,
 *         flowLogsS3Bucket: "example-bucket",
 *         flowLogsS3Prefix: "flow-logs/",
 *     },
 * });
 * const exampleCustomRoutingListener = new aws.globalaccelerator.CustomRoutingListener("example", {
 *     acceleratorArn: example.id,
 *     portRanges: [{
 *         fromPort: 80,
 *         toPort: 80,
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Global Accelerator custom routing listeners using the `id`. For example:
 *
 * ```sh
 * $ pulumi import aws:globalaccelerator/customRoutingListener:CustomRoutingListener example arn:aws:globalaccelerator::111111111111:accelerator/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/listener/xxxxxxxx
 * ```
 */
export class CustomRoutingListener extends pulumi.CustomResource {
    /**
     * Get an existing CustomRoutingListener resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomRoutingListenerState, opts?: pulumi.CustomResourceOptions): CustomRoutingListener {
        return new CustomRoutingListener(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:globalaccelerator/customRoutingListener:CustomRoutingListener';

    /**
     * Returns true if the given object is an instance of CustomRoutingListener.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomRoutingListener {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomRoutingListener.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of a custom routing accelerator.
     */
    public readonly acceleratorArn!: pulumi.Output<string>;
    /**
     * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     */
    public readonly portRanges!: pulumi.Output<outputs.globalaccelerator.CustomRoutingListenerPortRange[]>;

    /**
     * Create a CustomRoutingListener resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomRoutingListenerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomRoutingListenerArgs | CustomRoutingListenerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomRoutingListenerState | undefined;
            resourceInputs["acceleratorArn"] = state ? state.acceleratorArn : undefined;
            resourceInputs["portRanges"] = state ? state.portRanges : undefined;
        } else {
            const args = argsOrState as CustomRoutingListenerArgs | undefined;
            if ((!args || args.acceleratorArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'acceleratorArn'");
            }
            if ((!args || args.portRanges === undefined) && !opts.urn) {
                throw new Error("Missing required property 'portRanges'");
            }
            resourceInputs["acceleratorArn"] = args ? args.acceleratorArn : undefined;
            resourceInputs["portRanges"] = args ? args.portRanges : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CustomRoutingListener.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomRoutingListener resources.
 */
export interface CustomRoutingListenerState {
    /**
     * The Amazon Resource Name (ARN) of a custom routing accelerator.
     */
    acceleratorArn?: pulumi.Input<string>;
    /**
     * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     */
    portRanges?: pulumi.Input<pulumi.Input<inputs.globalaccelerator.CustomRoutingListenerPortRange>[]>;
}

/**
 * The set of arguments for constructing a CustomRoutingListener resource.
 */
export interface CustomRoutingListenerArgs {
    /**
     * The Amazon Resource Name (ARN) of a custom routing accelerator.
     */
    acceleratorArn: pulumi.Input<string>;
    /**
     * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     */
    portRanges: pulumi.Input<pulumi.Input<inputs.globalaccelerator.CustomRoutingListenerPortRange>[]>;
}
