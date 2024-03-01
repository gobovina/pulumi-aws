// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS MediaLive MultiplexProgram.
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
 * const exampleMultiplexProgram = new aws.medialive.MultiplexProgram("example", {
 *     programName: "example_program",
 *     multiplexId: example.id,
 *     multiplexProgramSettings: {
 *         programNumber: 1,
 *         preferredChannelPipeline: "CURRENTLY_ACTIVE",
 *         videoSettings: {
 *             constantBitrate: 100000,
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import MediaLive MultiplexProgram using the `id`, or a combination of "`program_name`/`multiplex_id`". For example:
 *
 * ```sh
 *  $ pulumi import aws:medialive/multiplexProgram:MultiplexProgram example example_program/1234567
 * ```
 */
export class MultiplexProgram extends pulumi.CustomResource {
    /**
     * Get an existing MultiplexProgram resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MultiplexProgramState, opts?: pulumi.CustomResourceOptions): MultiplexProgram {
        return new MultiplexProgram(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:medialive/multiplexProgram:MultiplexProgram';

    /**
     * Returns true if the given object is an instance of MultiplexProgram.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MultiplexProgram {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MultiplexProgram.__pulumiType;
    }

    /**
     * Multiplex ID.
     */
    public readonly multiplexId!: pulumi.Output<string>;
    /**
     * MultiplexProgram settings. See Multiplex Program Settings for more details.
     *
     * The following arguments are optional:
     */
    public readonly multiplexProgramSettings!: pulumi.Output<outputs.medialive.MultiplexProgramMultiplexProgramSettings | undefined>;
    /**
     * Unique program name.
     */
    public readonly programName!: pulumi.Output<string>;

    /**
     * Create a MultiplexProgram resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MultiplexProgramArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MultiplexProgramArgs | MultiplexProgramState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MultiplexProgramState | undefined;
            resourceInputs["multiplexId"] = state ? state.multiplexId : undefined;
            resourceInputs["multiplexProgramSettings"] = state ? state.multiplexProgramSettings : undefined;
            resourceInputs["programName"] = state ? state.programName : undefined;
        } else {
            const args = argsOrState as MultiplexProgramArgs | undefined;
            if ((!args || args.multiplexId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'multiplexId'");
            }
            if ((!args || args.programName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'programName'");
            }
            resourceInputs["multiplexId"] = args ? args.multiplexId : undefined;
            resourceInputs["multiplexProgramSettings"] = args ? args.multiplexProgramSettings : undefined;
            resourceInputs["programName"] = args ? args.programName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MultiplexProgram.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MultiplexProgram resources.
 */
export interface MultiplexProgramState {
    /**
     * Multiplex ID.
     */
    multiplexId?: pulumi.Input<string>;
    /**
     * MultiplexProgram settings. See Multiplex Program Settings for more details.
     *
     * The following arguments are optional:
     */
    multiplexProgramSettings?: pulumi.Input<inputs.medialive.MultiplexProgramMultiplexProgramSettings>;
    /**
     * Unique program name.
     */
    programName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MultiplexProgram resource.
 */
export interface MultiplexProgramArgs {
    /**
     * Multiplex ID.
     */
    multiplexId: pulumi.Input<string>;
    /**
     * MultiplexProgram settings. See Multiplex Program Settings for more details.
     *
     * The following arguments are optional:
     */
    multiplexProgramSettings?: pulumi.Input<inputs.medialive.MultiplexProgramMultiplexProgramSettings>;
    /**
     * Unique program name.
     */
    programName: pulumi.Input<string>;
}
