// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Enable Termination settings to control outbound calling from your SIP infrastructure.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const defaultVoiceConnector = new aws.chime.VoiceConnector("defaultVoiceConnector", {requireEncryption: true});
 * const defaultVoiceConnectorTermination = new aws.chime.VoiceConnectorTermination("defaultVoiceConnectorTermination", {
 *     disabled: false,
 *     cpsLimit: 1,
 *     cidrAllowLists: ["50.35.78.96/31"],
 *     callingRegions: [
 *         "US",
 *         "CA",
 *     ],
 *     voiceConnectorId: defaultVoiceConnector.id,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Chime Voice Connector Termination using the `voice_connector_id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:chime/voiceConnectorTermination:VoiceConnectorTermination default abcdef1ghij2klmno3pqr4
 * ```
 */
export class VoiceConnectorTermination extends pulumi.CustomResource {
    /**
     * Get an existing VoiceConnectorTermination resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VoiceConnectorTerminationState, opts?: pulumi.CustomResourceOptions): VoiceConnectorTermination {
        return new VoiceConnectorTermination(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:chime/voiceConnectorTermination:VoiceConnectorTermination';

    /**
     * Returns true if the given object is an instance of VoiceConnectorTermination.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VoiceConnectorTermination {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VoiceConnectorTermination.__pulumiType;
    }

    /**
     * The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
     */
    public readonly callingRegions!: pulumi.Output<string[]>;
    /**
     * The IP addresses allowed to make calls, in CIDR format.
     */
    public readonly cidrAllowLists!: pulumi.Output<string[]>;
    /**
     * The limit on calls per second. Max value based on account service quota. Default value of `1`.
     */
    public readonly cpsLimit!: pulumi.Output<number | undefined>;
    /**
     * The default caller ID phone number.
     */
    public readonly defaultPhoneNumber!: pulumi.Output<string | undefined>;
    /**
     * When termination settings are disabled, outbound calls can not be made.
     */
    public readonly disabled!: pulumi.Output<boolean | undefined>;
    /**
     * The Amazon Chime Voice Connector ID.
     */
    public readonly voiceConnectorId!: pulumi.Output<string>;

    /**
     * Create a VoiceConnectorTermination resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VoiceConnectorTerminationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VoiceConnectorTerminationArgs | VoiceConnectorTerminationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VoiceConnectorTerminationState | undefined;
            resourceInputs["callingRegions"] = state ? state.callingRegions : undefined;
            resourceInputs["cidrAllowLists"] = state ? state.cidrAllowLists : undefined;
            resourceInputs["cpsLimit"] = state ? state.cpsLimit : undefined;
            resourceInputs["defaultPhoneNumber"] = state ? state.defaultPhoneNumber : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["voiceConnectorId"] = state ? state.voiceConnectorId : undefined;
        } else {
            const args = argsOrState as VoiceConnectorTerminationArgs | undefined;
            if ((!args || args.callingRegions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'callingRegions'");
            }
            if ((!args || args.cidrAllowLists === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cidrAllowLists'");
            }
            if ((!args || args.voiceConnectorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'voiceConnectorId'");
            }
            resourceInputs["callingRegions"] = args ? args.callingRegions : undefined;
            resourceInputs["cidrAllowLists"] = args ? args.cidrAllowLists : undefined;
            resourceInputs["cpsLimit"] = args ? args.cpsLimit : undefined;
            resourceInputs["defaultPhoneNumber"] = args ? args.defaultPhoneNumber : undefined;
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["voiceConnectorId"] = args ? args.voiceConnectorId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VoiceConnectorTermination.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VoiceConnectorTermination resources.
 */
export interface VoiceConnectorTerminationState {
    /**
     * The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
     */
    callingRegions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The IP addresses allowed to make calls, in CIDR format.
     */
    cidrAllowLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The limit on calls per second. Max value based on account service quota. Default value of `1`.
     */
    cpsLimit?: pulumi.Input<number>;
    /**
     * The default caller ID phone number.
     */
    defaultPhoneNumber?: pulumi.Input<string>;
    /**
     * When termination settings are disabled, outbound calls can not be made.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The Amazon Chime Voice Connector ID.
     */
    voiceConnectorId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VoiceConnectorTermination resource.
 */
export interface VoiceConnectorTerminationArgs {
    /**
     * The countries to which calls are allowed, in ISO 3166-1 alpha-2 format.
     */
    callingRegions: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The IP addresses allowed to make calls, in CIDR format.
     */
    cidrAllowLists: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The limit on calls per second. Max value based on account service quota. Default value of `1`.
     */
    cpsLimit?: pulumi.Input<number>;
    /**
     * The default caller ID phone number.
     */
    defaultPhoneNumber?: pulumi.Input<string>;
    /**
     * When termination settings are disabled, outbound calls can not be made.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The Amazon Chime Voice Connector ID.
     */
    voiceConnectorId: pulumi.Input<string>;
}
