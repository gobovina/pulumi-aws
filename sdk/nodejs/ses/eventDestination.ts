// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an SES event destination
 *
 * ## Example Usage
 * ### CloudWatch Destination
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const cloudwatch = new aws.ses.EventDestination("cloudwatch", {
 *     name: "event-destination-cloudwatch",
 *     configurationSetName: example.name,
 *     enabled: true,
 *     matchingTypes: [
 *         "bounce",
 *         "send",
 *     ],
 *     cloudwatchDestinations: [{
 *         defaultValue: "default",
 *         dimensionName: "dimension",
 *         valueSource: "emailHeader",
 *     }],
 * });
 * ```
 * ### Kinesis Destination
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const kinesis = new aws.ses.EventDestination("kinesis", {
 *     name: "event-destination-kinesis",
 *     configurationSetName: exampleAwsSesConfigurationSet.name,
 *     enabled: true,
 *     matchingTypes: [
 *         "bounce",
 *         "send",
 *     ],
 *     kinesisDestination: {
 *         streamArn: exampleAwsKinesisFirehoseDeliveryStream.arn,
 *         roleArn: example.arn,
 *     },
 * });
 * ```
 * ### SNS Destination
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const sns = new aws.ses.EventDestination("sns", {
 *     name: "event-destination-sns",
 *     configurationSetName: exampleAwsSesConfigurationSet.name,
 *     enabled: true,
 *     matchingTypes: [
 *         "bounce",
 *         "send",
 *     ],
 *     snsDestination: {
 *         topicArn: example.arn,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import SES event destinations using `configuration_set_name` together with the event destination's `name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:ses/eventDestination:EventDestination sns some-configuration-set-test/event-destination-sns
 * ```
 */
export class EventDestination extends pulumi.CustomResource {
    /**
     * Get an existing EventDestination resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EventDestinationState, opts?: pulumi.CustomResourceOptions): EventDestination {
        return new EventDestination(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ses/eventDestination:EventDestination';

    /**
     * Returns true if the given object is an instance of EventDestination.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EventDestination {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EventDestination.__pulumiType;
    }

    /**
     * The SES event destination ARN.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * CloudWatch destination for the events
     */
    public readonly cloudwatchDestinations!: pulumi.Output<outputs.ses.EventDestinationCloudwatchDestination[] | undefined>;
    /**
     * The name of the configuration set
     */
    public readonly configurationSetName!: pulumi.Output<string>;
    /**
     * If true, the event destination will be enabled
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Send the events to a kinesis firehose destination
     */
    public readonly kinesisDestination!: pulumi.Output<outputs.ses.EventDestinationKinesisDestination | undefined>;
    /**
     * A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
     */
    public readonly matchingTypes!: pulumi.Output<string[]>;
    /**
     * The name of the event destination
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Send the events to an SNS Topic destination
     *
     * > **NOTE:** You can specify `"cloudwatchDestination"` or `"kinesisDestination"` but not both
     */
    public readonly snsDestination!: pulumi.Output<outputs.ses.EventDestinationSnsDestination | undefined>;

    /**
     * Create a EventDestination resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EventDestinationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EventDestinationArgs | EventDestinationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EventDestinationState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["cloudwatchDestinations"] = state ? state.cloudwatchDestinations : undefined;
            resourceInputs["configurationSetName"] = state ? state.configurationSetName : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["kinesisDestination"] = state ? state.kinesisDestination : undefined;
            resourceInputs["matchingTypes"] = state ? state.matchingTypes : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["snsDestination"] = state ? state.snsDestination : undefined;
        } else {
            const args = argsOrState as EventDestinationArgs | undefined;
            if ((!args || args.configurationSetName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configurationSetName'");
            }
            if ((!args || args.matchingTypes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'matchingTypes'");
            }
            resourceInputs["cloudwatchDestinations"] = args ? args.cloudwatchDestinations : undefined;
            resourceInputs["configurationSetName"] = args ? args.configurationSetName : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["kinesisDestination"] = args ? args.kinesisDestination : undefined;
            resourceInputs["matchingTypes"] = args ? args.matchingTypes : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["snsDestination"] = args ? args.snsDestination : undefined;
            resourceInputs["arn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EventDestination.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EventDestination resources.
 */
export interface EventDestinationState {
    /**
     * The SES event destination ARN.
     */
    arn?: pulumi.Input<string>;
    /**
     * CloudWatch destination for the events
     */
    cloudwatchDestinations?: pulumi.Input<pulumi.Input<inputs.ses.EventDestinationCloudwatchDestination>[]>;
    /**
     * The name of the configuration set
     */
    configurationSetName?: pulumi.Input<string>;
    /**
     * If true, the event destination will be enabled
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Send the events to a kinesis firehose destination
     */
    kinesisDestination?: pulumi.Input<inputs.ses.EventDestinationKinesisDestination>;
    /**
     * A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
     */
    matchingTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the event destination
     */
    name?: pulumi.Input<string>;
    /**
     * Send the events to an SNS Topic destination
     *
     * > **NOTE:** You can specify `"cloudwatchDestination"` or `"kinesisDestination"` but not both
     */
    snsDestination?: pulumi.Input<inputs.ses.EventDestinationSnsDestination>;
}

/**
 * The set of arguments for constructing a EventDestination resource.
 */
export interface EventDestinationArgs {
    /**
     * CloudWatch destination for the events
     */
    cloudwatchDestinations?: pulumi.Input<pulumi.Input<inputs.ses.EventDestinationCloudwatchDestination>[]>;
    /**
     * The name of the configuration set
     */
    configurationSetName: pulumi.Input<string>;
    /**
     * If true, the event destination will be enabled
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Send the events to a kinesis firehose destination
     */
    kinesisDestination?: pulumi.Input<inputs.ses.EventDestinationKinesisDestination>;
    /**
     * A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
     */
    matchingTypes: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the event destination
     */
    name?: pulumi.Input<string>;
    /**
     * Send the events to an SNS Topic destination
     *
     * > **NOTE:** You can specify `"cloudwatchDestination"` or `"kinesisDestination"` but not both
     */
    snsDestination?: pulumi.Input<inputs.ses.EventDestinationSnsDestination>;
}
