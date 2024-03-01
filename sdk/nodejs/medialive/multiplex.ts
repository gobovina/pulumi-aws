// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS MediaLive Multiplex.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const available = aws.getAvailabilityZones({
 *     state: "available",
 * });
 * const example = new aws.medialive.Multiplex("example", {
 *     name: "example-multiplex-changed",
 *     availabilityZones: [
 *         available.then(available => available.names?.[0]),
 *         available.then(available => available.names?.[1]),
 *     ],
 *     multiplexSettings: {
 *         transportStreamBitrate: 1000000,
 *         transportStreamId: 1,
 *         transportStreamReservedBitrate: 1,
 *         maximumVideoBufferDelayMilliseconds: 1000,
 *     },
 *     startMultiplex: true,
 *     tags: {
 *         tag1: "value1",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import MediaLive Multiplex using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:medialive/multiplex:Multiplex example 12345678
 * ```
 */
export class Multiplex extends pulumi.CustomResource {
    /**
     * Get an existing Multiplex resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MultiplexState, opts?: pulumi.CustomResourceOptions): Multiplex {
        return new Multiplex(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:medialive/multiplex:Multiplex';

    /**
     * Returns true if the given object is an instance of Multiplex.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Multiplex {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Multiplex.__pulumiType;
    }

    /**
     * ARN of the Multiplex.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A list of availability zones. You must specify exactly two.
     */
    public readonly availabilityZones!: pulumi.Output<string[]>;
    /**
     * Multiplex settings. See Multiplex Settings for more details.
     */
    public readonly multiplexSettings!: pulumi.Output<outputs.medialive.MultiplexMultiplexSettings | undefined>;
    /**
     * name of Multiplex.
     *
     * The following arguments are optional:
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Whether to start the Multiplex. Defaults to `false`.
     */
    public readonly startMultiplex!: pulumi.Output<boolean | undefined>;
    /**
     * A map of tags to assign to the Multiplex. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Multiplex resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MultiplexArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MultiplexArgs | MultiplexState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MultiplexState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["availabilityZones"] = state ? state.availabilityZones : undefined;
            resourceInputs["multiplexSettings"] = state ? state.multiplexSettings : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["startMultiplex"] = state ? state.startMultiplex : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as MultiplexArgs | undefined;
            if ((!args || args.availabilityZones === undefined) && !opts.urn) {
                throw new Error("Missing required property 'availabilityZones'");
            }
            resourceInputs["availabilityZones"] = args ? args.availabilityZones : undefined;
            resourceInputs["multiplexSettings"] = args ? args.multiplexSettings : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["startMultiplex"] = args ? args.startMultiplex : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Multiplex.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Multiplex resources.
 */
export interface MultiplexState {
    /**
     * ARN of the Multiplex.
     */
    arn?: pulumi.Input<string>;
    /**
     * A list of availability zones. You must specify exactly two.
     */
    availabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Multiplex settings. See Multiplex Settings for more details.
     */
    multiplexSettings?: pulumi.Input<inputs.medialive.MultiplexMultiplexSettings>;
    /**
     * name of Multiplex.
     *
     * The following arguments are optional:
     */
    name?: pulumi.Input<string>;
    /**
     * Whether to start the Multiplex. Defaults to `false`.
     */
    startMultiplex?: pulumi.Input<boolean>;
    /**
     * A map of tags to assign to the Multiplex. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Multiplex resource.
 */
export interface MultiplexArgs {
    /**
     * A list of availability zones. You must specify exactly two.
     */
    availabilityZones: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Multiplex settings. See Multiplex Settings for more details.
     */
    multiplexSettings?: pulumi.Input<inputs.medialive.MultiplexMultiplexSettings>;
    /**
     * name of Multiplex.
     *
     * The following arguments are optional:
     */
    name?: pulumi.Input<string>;
    /**
     * Whether to start the Multiplex. Defaults to `false`.
     */
    startMultiplex?: pulumi.Input<boolean>;
    /**
     * A map of tags to assign to the Multiplex. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
