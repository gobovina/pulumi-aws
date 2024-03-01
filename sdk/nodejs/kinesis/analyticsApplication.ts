// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

import {ARN} from "..";

/**
 * Provides a Kinesis Analytics Application resource. Kinesis Analytics is a managed service that
 * allows processing and analyzing streaming data using standard SQL.
 *
 * For more details, see the [Amazon Kinesis Analytics Documentation](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/what-is.html).
 *
 * > **Note:** To manage Amazon Kinesis Data Analytics for Apache Flink applications, use the `aws.kinesisanalyticsv2.Application` resource.
 *
 * ## Example Usage
 * ### Kinesis Stream Input
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const testStream = new aws.kinesis.Stream("test_stream", {
 *     name: "kinesis-test",
 *     shardCount: 1,
 * });
 * const testApplication = new aws.kinesis.AnalyticsApplication("test_application", {
 *     name: "kinesis-analytics-application-test",
 *     inputs: {
 *         namePrefix: "test_prefix",
 *         kinesisStream: {
 *             resourceArn: testStream.arn,
 *             roleArn: test.arn,
 *         },
 *         parallelism: {
 *             count: 1,
 *         },
 *         schema: {
 *             recordColumns: [{
 *                 mapping: "$.test",
 *                 name: "test",
 *                 sqlType: "VARCHAR(8)",
 *             }],
 *             recordEncoding: "UTF-8",
 *             recordFormat: {
 *                 mappingParameters: {
 *                     json: {
 *                         recordRowPath: "$",
 *                     },
 *                 },
 *             },
 *         },
 *     },
 * });
 * ```
 * ### Starting An Application
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.cloudwatch.LogGroup("example", {name: "analytics"});
 * const exampleLogStream = new aws.cloudwatch.LogStream("example", {
 *     name: "example-kinesis-application",
 *     logGroupName: example.name,
 * });
 * const exampleStream = new aws.kinesis.Stream("example", {
 *     name: "example-kinesis-stream",
 *     shardCount: 1,
 * });
 * const exampleFirehoseDeliveryStream = new aws.kinesis.FirehoseDeliveryStream("example", {
 *     name: "example-kinesis-delivery-stream",
 *     destination: "extended_s3",
 *     extendedS3Configuration: {
 *         bucketArn: exampleAwsS3Bucket.arn,
 *         roleArn: exampleAwsIamRole.arn,
 *     },
 * });
 * const test = new aws.kinesis.AnalyticsApplication("test", {
 *     name: "example-application",
 *     cloudwatchLoggingOptions: {
 *         logStreamArn: exampleLogStream.arn,
 *         roleArn: exampleAwsIamRole.arn,
 *     },
 *     inputs: {
 *         namePrefix: "example_prefix",
 *         schema: {
 *             recordColumns: [{
 *                 name: "COLUMN_1",
 *                 sqlType: "INTEGER",
 *             }],
 *             recordFormat: {
 *                 mappingParameters: {
 *                     csv: {
 *                         recordColumnDelimiter: ",",
 *                         recordRowDelimiter: "|",
 *                     },
 *                 },
 *             },
 *         },
 *         kinesisStream: {
 *             resourceArn: exampleStream.arn,
 *             roleArn: exampleAwsIamRole.arn,
 *         },
 *         startingPositionConfigurations: [{
 *             startingPosition: "NOW",
 *         }],
 *     },
 *     outputs: [{
 *         name: "OUTPUT_1",
 *         schema: {
 *             recordFormatType: "CSV",
 *         },
 *         kinesisFirehose: {
 *             resourceArn: exampleFirehoseDeliveryStream.arn,
 *             roleArn: exampleAwsIamRole.arn,
 *         },
 *     }],
 *     startApplication: true,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Kinesis Analytics Application using ARN. For example:
 *
 * ```sh
 *  $ pulumi import aws:kinesis/analyticsApplication:AnalyticsApplication example arn:aws:kinesisanalytics:us-west-2:1234567890:application/example
 * ```
 */
export class AnalyticsApplication extends pulumi.CustomResource {
    /**
     * Get an existing AnalyticsApplication resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AnalyticsApplicationState, opts?: pulumi.CustomResourceOptions): AnalyticsApplication {
        return new AnalyticsApplication(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:kinesis/analyticsApplication:AnalyticsApplication';

    /**
     * Returns true if the given object is an instance of AnalyticsApplication.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AnalyticsApplication {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AnalyticsApplication.__pulumiType;
    }

    /**
     * The ARN of the Kinesis Analytics Appliation.
     */
    public /*out*/ readonly arn!: pulumi.Output<ARN>;
    /**
     * The CloudWatch log stream options to monitor application errors.
     * See CloudWatch Logging Options below for more details.
     */
    public readonly cloudwatchLoggingOptions!: pulumi.Output<outputs.kinesis.AnalyticsApplicationCloudwatchLoggingOptions | undefined>;
    /**
     * SQL Code to transform input data, and generate output.
     */
    public readonly code!: pulumi.Output<string | undefined>;
    /**
     * The Timestamp when the application version was created.
     */
    public /*out*/ readonly createTimestamp!: pulumi.Output<string>;
    /**
     * Description of the application.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Input configuration of the application. See Inputs below for more details.
     */
    public readonly inputs!: pulumi.Output<outputs.kinesis.AnalyticsApplicationInputs | undefined>;
    /**
     * The Timestamp when the application was last updated.
     */
    public /*out*/ readonly lastUpdateTimestamp!: pulumi.Output<string>;
    /**
     * Name of the Kinesis Analytics Application.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Output destination configuration of the application. See Outputs below for more details.
     */
    public readonly outputs!: pulumi.Output<outputs.kinesis.AnalyticsApplicationOutput[] | undefined>;
    /**
     * An S3 Reference Data Source for the application.
     * See Reference Data Sources below for more details.
     */
    public readonly referenceDataSources!: pulumi.Output<outputs.kinesis.AnalyticsApplicationReferenceDataSources | undefined>;
    /**
     * Whether to start or stop the Kinesis Analytics Application. To start an application, an input with a defined `startingPosition` must be configured.
     * To modify an application's starting position, first stop the application by setting `startApplication = false`, then update `startingPosition` and set `startApplication = true`.
     */
    public readonly startApplication!: pulumi.Output<boolean | undefined>;
    /**
     * The Status of the application.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Key-value map of tags for the Kinesis Analytics Application. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The Version of the application.
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a AnalyticsApplication resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AnalyticsApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AnalyticsApplicationArgs | AnalyticsApplicationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AnalyticsApplicationState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["cloudwatchLoggingOptions"] = state ? state.cloudwatchLoggingOptions : undefined;
            resourceInputs["code"] = state ? state.code : undefined;
            resourceInputs["createTimestamp"] = state ? state.createTimestamp : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["inputs"] = state ? state.inputs : undefined;
            resourceInputs["lastUpdateTimestamp"] = state ? state.lastUpdateTimestamp : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["outputs"] = state ? state.outputs : undefined;
            resourceInputs["referenceDataSources"] = state ? state.referenceDataSources : undefined;
            resourceInputs["startApplication"] = state ? state.startApplication : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as AnalyticsApplicationArgs | undefined;
            resourceInputs["cloudwatchLoggingOptions"] = args ? args.cloudwatchLoggingOptions : undefined;
            resourceInputs["code"] = args ? args.code : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["inputs"] = args ? args.inputs : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["outputs"] = args ? args.outputs : undefined;
            resourceInputs["referenceDataSources"] = args ? args.referenceDataSources : undefined;
            resourceInputs["startApplication"] = args ? args.startApplication : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createTimestamp"] = undefined /*out*/;
            resourceInputs["lastUpdateTimestamp"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AnalyticsApplication.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AnalyticsApplication resources.
 */
export interface AnalyticsApplicationState {
    /**
     * The ARN of the Kinesis Analytics Appliation.
     */
    arn?: pulumi.Input<ARN>;
    /**
     * The CloudWatch log stream options to monitor application errors.
     * See CloudWatch Logging Options below for more details.
     */
    cloudwatchLoggingOptions?: pulumi.Input<inputs.kinesis.AnalyticsApplicationCloudwatchLoggingOptions>;
    /**
     * SQL Code to transform input data, and generate output.
     */
    code?: pulumi.Input<string>;
    /**
     * The Timestamp when the application version was created.
     */
    createTimestamp?: pulumi.Input<string>;
    /**
     * Description of the application.
     */
    description?: pulumi.Input<string>;
    /**
     * Input configuration of the application. See Inputs below for more details.
     */
    inputs?: pulumi.Input<inputs.kinesis.AnalyticsApplicationInputs>;
    /**
     * The Timestamp when the application was last updated.
     */
    lastUpdateTimestamp?: pulumi.Input<string>;
    /**
     * Name of the Kinesis Analytics Application.
     */
    name?: pulumi.Input<string>;
    /**
     * Output destination configuration of the application. See Outputs below for more details.
     */
    outputs?: pulumi.Input<pulumi.Input<inputs.kinesis.AnalyticsApplicationOutput>[]>;
    /**
     * An S3 Reference Data Source for the application.
     * See Reference Data Sources below for more details.
     */
    referenceDataSources?: pulumi.Input<inputs.kinesis.AnalyticsApplicationReferenceDataSources>;
    /**
     * Whether to start or stop the Kinesis Analytics Application. To start an application, an input with a defined `startingPosition` must be configured.
     * To modify an application's starting position, first stop the application by setting `startApplication = false`, then update `startingPosition` and set `startApplication = true`.
     */
    startApplication?: pulumi.Input<boolean>;
    /**
     * The Status of the application.
     */
    status?: pulumi.Input<string>;
    /**
     * Key-value map of tags for the Kinesis Analytics Application. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Version of the application.
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a AnalyticsApplication resource.
 */
export interface AnalyticsApplicationArgs {
    /**
     * The CloudWatch log stream options to monitor application errors.
     * See CloudWatch Logging Options below for more details.
     */
    cloudwatchLoggingOptions?: pulumi.Input<inputs.kinesis.AnalyticsApplicationCloudwatchLoggingOptions>;
    /**
     * SQL Code to transform input data, and generate output.
     */
    code?: pulumi.Input<string>;
    /**
     * Description of the application.
     */
    description?: pulumi.Input<string>;
    /**
     * Input configuration of the application. See Inputs below for more details.
     */
    inputs?: pulumi.Input<inputs.kinesis.AnalyticsApplicationInputs>;
    /**
     * Name of the Kinesis Analytics Application.
     */
    name?: pulumi.Input<string>;
    /**
     * Output destination configuration of the application. See Outputs below for more details.
     */
    outputs?: pulumi.Input<pulumi.Input<inputs.kinesis.AnalyticsApplicationOutput>[]>;
    /**
     * An S3 Reference Data Source for the application.
     * See Reference Data Sources below for more details.
     */
    referenceDataSources?: pulumi.Input<inputs.kinesis.AnalyticsApplicationReferenceDataSources>;
    /**
     * Whether to start or stop the Kinesis Analytics Application. To start an application, an input with a defined `startingPosition` must be configured.
     * To modify an application's starting position, first stop the application by setting `startApplication = false`, then update `startingPosition` and set `startApplication = true`.
     */
    startApplication?: pulumi.Input<boolean>;
    /**
     * Key-value map of tags for the Kinesis Analytics Application. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
