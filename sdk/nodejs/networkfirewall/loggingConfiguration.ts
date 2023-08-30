// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an AWS Network Firewall Logging Configuration Resource
 *
 * ## Example Usage
 * ### Logging to S3
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.networkfirewall.LoggingConfiguration("example", {
 *     firewallArn: aws_networkfirewall_firewall.example.arn,
 *     loggingConfiguration: {
 *         logDestinationConfigs: [{
 *             logDestination: {
 *                 bucketName: aws_s3_bucket.example.bucket,
 *                 prefix: "/example",
 *             },
 *             logDestinationType: "S3",
 *             logType: "FLOW",
 *         }],
 *     },
 * });
 * ```
 * ### Logging to CloudWatch
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.networkfirewall.LoggingConfiguration("example", {
 *     firewallArn: aws_networkfirewall_firewall.example.arn,
 *     loggingConfiguration: {
 *         logDestinationConfigs: [{
 *             logDestination: {
 *                 logGroup: aws_cloudwatch_log_group.example.name,
 *             },
 *             logDestinationType: "CloudWatchLogs",
 *             logType: "ALERT",
 *         }],
 *     },
 * });
 * ```
 * ### Logging to Kinesis Data Firehose
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.networkfirewall.LoggingConfiguration("example", {
 *     firewallArn: aws_networkfirewall_firewall.example.arn,
 *     loggingConfiguration: {
 *         logDestinationConfigs: [{
 *             logDestination: {
 *                 deliveryStream: aws_kinesis_firehose_delivery_stream.example.name,
 *             },
 *             logDestinationType: "KinesisDataFirehose",
 *             logType: "ALERT",
 *         }],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Network Firewall Logging Configurations using the `firewall_arn`. For example:
 *
 * ```sh
 *  $ pulumi import aws:networkfirewall/loggingConfiguration:LoggingConfiguration example arn:aws:network-firewall:us-west-1:123456789012:firewall/example
 * ```
 */
export class LoggingConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing LoggingConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoggingConfigurationState, opts?: pulumi.CustomResourceOptions): LoggingConfiguration {
        return new LoggingConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:networkfirewall/loggingConfiguration:LoggingConfiguration';

    /**
     * Returns true if the given object is an instance of LoggingConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoggingConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoggingConfiguration.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the Network Firewall firewall.
     */
    public readonly firewallArn!: pulumi.Output<string>;
    /**
     * A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
     */
    public readonly loggingConfiguration!: pulumi.Output<outputs.networkfirewall.LoggingConfigurationLoggingConfiguration>;

    /**
     * Create a LoggingConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoggingConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoggingConfigurationArgs | LoggingConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoggingConfigurationState | undefined;
            resourceInputs["firewallArn"] = state ? state.firewallArn : undefined;
            resourceInputs["loggingConfiguration"] = state ? state.loggingConfiguration : undefined;
        } else {
            const args = argsOrState as LoggingConfigurationArgs | undefined;
            if ((!args || args.firewallArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'firewallArn'");
            }
            if ((!args || args.loggingConfiguration === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loggingConfiguration'");
            }
            resourceInputs["firewallArn"] = args ? args.firewallArn : undefined;
            resourceInputs["loggingConfiguration"] = args ? args.loggingConfiguration : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LoggingConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoggingConfiguration resources.
 */
export interface LoggingConfigurationState {
    /**
     * The Amazon Resource Name (ARN) of the Network Firewall firewall.
     */
    firewallArn?: pulumi.Input<string>;
    /**
     * A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
     */
    loggingConfiguration?: pulumi.Input<inputs.networkfirewall.LoggingConfigurationLoggingConfiguration>;
}

/**
 * The set of arguments for constructing a LoggingConfiguration resource.
 */
export interface LoggingConfigurationArgs {
    /**
     * The Amazon Resource Name (ARN) of the Network Firewall firewall.
     */
    firewallArn: pulumi.Input<string>;
    /**
     * A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
     */
    loggingConfiguration: pulumi.Input<inputs.networkfirewall.LoggingConfigurationLoggingConfiguration>;
}
