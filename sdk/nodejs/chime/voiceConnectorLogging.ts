// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Adds a logging configuration for the specified Amazon Chime Voice Connector. The logging configuration specifies whether SIP message logs are enabled for sending to Amazon CloudWatch Logs.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const defaultVoiceConnector = new aws.chime.VoiceConnector("defaultVoiceConnector", {requireEncryption: true});
 * const defaultVoiceConnectorLogging = new aws.chime.VoiceConnectorLogging("defaultVoiceConnectorLogging", {
 *     enableSipLogs: true,
 *     enableMediaMetricLogs: true,
 *     voiceConnectorId: defaultVoiceConnector.id,
 * });
 * ```
 *
 * ## Import
 *
 * Chime Voice Connector Logging can be imported using the `voice_connector_id`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:chime/voiceConnectorLogging:VoiceConnectorLogging default abcdef1ghij2klmno3pqr4
 * ```
 */
export class VoiceConnectorLogging extends pulumi.CustomResource {
    /**
     * Get an existing VoiceConnectorLogging resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VoiceConnectorLoggingState, opts?: pulumi.CustomResourceOptions): VoiceConnectorLogging {
        return new VoiceConnectorLogging(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:chime/voiceConnectorLogging:VoiceConnectorLogging';

    /**
     * Returns true if the given object is an instance of VoiceConnectorLogging.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VoiceConnectorLogging {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VoiceConnectorLogging.__pulumiType;
    }

    /**
     * When true, enables logging of detailed media metrics for Voice Connectors to Amazon CloudWatch logs.
     */
    public readonly enableMediaMetricLogs!: pulumi.Output<boolean | undefined>;
    /**
     * When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
     */
    public readonly enableSipLogs!: pulumi.Output<boolean | undefined>;
    /**
     * The Amazon Chime Voice Connector ID.
     */
    public readonly voiceConnectorId!: pulumi.Output<string>;

    /**
     * Create a VoiceConnectorLogging resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VoiceConnectorLoggingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VoiceConnectorLoggingArgs | VoiceConnectorLoggingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VoiceConnectorLoggingState | undefined;
            resourceInputs["enableMediaMetricLogs"] = state ? state.enableMediaMetricLogs : undefined;
            resourceInputs["enableSipLogs"] = state ? state.enableSipLogs : undefined;
            resourceInputs["voiceConnectorId"] = state ? state.voiceConnectorId : undefined;
        } else {
            const args = argsOrState as VoiceConnectorLoggingArgs | undefined;
            if ((!args || args.voiceConnectorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'voiceConnectorId'");
            }
            resourceInputs["enableMediaMetricLogs"] = args ? args.enableMediaMetricLogs : undefined;
            resourceInputs["enableSipLogs"] = args ? args.enableSipLogs : undefined;
            resourceInputs["voiceConnectorId"] = args ? args.voiceConnectorId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VoiceConnectorLogging.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VoiceConnectorLogging resources.
 */
export interface VoiceConnectorLoggingState {
    /**
     * When true, enables logging of detailed media metrics for Voice Connectors to Amazon CloudWatch logs.
     */
    enableMediaMetricLogs?: pulumi.Input<boolean>;
    /**
     * When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
     */
    enableSipLogs?: pulumi.Input<boolean>;
    /**
     * The Amazon Chime Voice Connector ID.
     */
    voiceConnectorId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VoiceConnectorLogging resource.
 */
export interface VoiceConnectorLoggingArgs {
    /**
     * When true, enables logging of detailed media metrics for Voice Connectors to Amazon CloudWatch logs.
     */
    enableMediaMetricLogs?: pulumi.Input<boolean>;
    /**
     * When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
     */
    enableSipLogs?: pulumi.Input<boolean>;
    /**
     * The Amazon Chime Voice Connector ID.
     */
    voiceConnectorId: pulumi.Input<string>;
}
