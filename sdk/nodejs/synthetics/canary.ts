// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a Synthetics Canary resource.
 *
 * > **NOTE:** When you create a canary, AWS creates supporting implicit resources. See the Amazon CloudWatch Synthetics documentation on [DeleteCanary](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DeleteCanary.html) for a full list. Neither AWS nor this provider deletes these implicit resources automatically when the canary is deleted. Before deleting a canary, ensure you have all the information about the canary that you need to delete the implicit resources using the AWS Console, or AWS CLI.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const some = new aws.synthetics.Canary("some", {
 *     name: "some-canary",
 *     artifactS3Location: "s3://some-bucket/",
 *     executionRoleArn: "some-role",
 *     handler: "exports.handler",
 *     zipFile: "test-fixtures/lambdatest.zip",
 *     runtimeVersion: "syn-1.0",
 *     schedule: {
 *         expression: "rate(0 minute)",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Synthetics Canaries using the `name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:synthetics/canary:Canary some some-canary
 * ```
 */
export class Canary extends pulumi.CustomResource {
    /**
     * Get an existing Canary resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CanaryState, opts?: pulumi.CustomResourceOptions): Canary {
        return new Canary(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:synthetics/canary:Canary';

    /**
     * Returns true if the given object is an instance of Canary.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Canary {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Canary.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) of the Canary.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See Artifact Config.
     */
    public readonly artifactConfig!: pulumi.Output<outputs.synthetics.CanaryArtifactConfig | undefined>;
    /**
     * Location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary.
     */
    public readonly artifactS3Location!: pulumi.Output<string>;
    /**
     * Specifies whether to also delete the Lambda functions and layers used by this canary. The default is `false`.
     */
    public readonly deleteLambda!: pulumi.Output<boolean | undefined>;
    /**
     * ARN of the Lambda function that is used as your canary's engine.
     */
    public /*out*/ readonly engineArn!: pulumi.Output<string>;
    /**
     * ARN of the IAM role to be used to run the canary. see [AWS Docs](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CreateCanary.html#API_CreateCanary_RequestSyntax) for permissions needs for IAM Role.
     */
    public readonly executionRoleArn!: pulumi.Output<string>;
    /**
     * Number of days to retain data about failed runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     */
    public readonly failureRetentionPeriod!: pulumi.Output<number | undefined>;
    /**
     * Entry point to use for the source code when running the canary. This value must end with the string `.handler` .
     */
    public readonly handler!: pulumi.Output<string>;
    /**
     * Name for this canary. Has a maximum length of 21 characters. Valid characters are lowercase alphanumeric, hyphen, or underscore.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Configuration block for individual canary runs. Detailed below.
     */
    public readonly runConfig!: pulumi.Output<outputs.synthetics.CanaryRunConfig>;
    /**
     * Runtime version to use for the canary. Versions change often so consult the [Amazon CloudWatch documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html) for the latest valid versions. Values include `syn-python-selenium-1.0`, `syn-nodejs-puppeteer-3.0`, `syn-nodejs-2.2`, `syn-nodejs-2.1`, `syn-nodejs-2.0`, and `syn-1.0`.
     */
    public readonly runtimeVersion!: pulumi.Output<string>;
    /**
     * Full bucket name which is used if your canary script is located in S3. The bucket must already exist. **Conflicts with `zipFile`.**
     */
    public readonly s3Bucket!: pulumi.Output<string | undefined>;
    /**
     * S3 key of your script. **Conflicts with `zipFile`.**
     */
    public readonly s3Key!: pulumi.Output<string | undefined>;
    /**
     * S3 version ID of your script. **Conflicts with `zipFile`.**
     */
    public readonly s3Version!: pulumi.Output<string | undefined>;
    /**
     * Configuration block providing how often the canary is to run and when these test runs are to stop. Detailed below.
     *
     * The following arguments are optional:
     */
    public readonly schedule!: pulumi.Output<outputs.synthetics.CanarySchedule>;
    /**
     * ARN of the Lambda layer where Synthetics stores the canary script code.
     */
    public /*out*/ readonly sourceLocationArn!: pulumi.Output<string>;
    /**
     * Whether to run or stop the canary.
     */
    public readonly startCanary!: pulumi.Output<boolean | undefined>;
    /**
     * Canary status.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Number of days to retain data about successful runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     */
    public readonly successRetentionPeriod!: pulumi.Output<number | undefined>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Structure that contains information about when the canary was created, modified, and most recently run. see Timeline.
     */
    public /*out*/ readonly timelines!: pulumi.Output<outputs.synthetics.CanaryTimeline[]>;
    /**
     * Configuration block. Detailed below.
     */
    public readonly vpcConfig!: pulumi.Output<outputs.synthetics.CanaryVpcConfig | undefined>;
    /**
     * ZIP file that contains the script, if you input your canary script directly into the canary instead of referring to an S3 location. It can be up to 225KB. **Conflicts with `s3Bucket`, `s3Key`, and `s3Version`.**
     */
    public readonly zipFile!: pulumi.Output<string | undefined>;

    /**
     * Create a Canary resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CanaryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CanaryArgs | CanaryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CanaryState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["artifactConfig"] = state ? state.artifactConfig : undefined;
            resourceInputs["artifactS3Location"] = state ? state.artifactS3Location : undefined;
            resourceInputs["deleteLambda"] = state ? state.deleteLambda : undefined;
            resourceInputs["engineArn"] = state ? state.engineArn : undefined;
            resourceInputs["executionRoleArn"] = state ? state.executionRoleArn : undefined;
            resourceInputs["failureRetentionPeriod"] = state ? state.failureRetentionPeriod : undefined;
            resourceInputs["handler"] = state ? state.handler : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["runConfig"] = state ? state.runConfig : undefined;
            resourceInputs["runtimeVersion"] = state ? state.runtimeVersion : undefined;
            resourceInputs["s3Bucket"] = state ? state.s3Bucket : undefined;
            resourceInputs["s3Key"] = state ? state.s3Key : undefined;
            resourceInputs["s3Version"] = state ? state.s3Version : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["sourceLocationArn"] = state ? state.sourceLocationArn : undefined;
            resourceInputs["startCanary"] = state ? state.startCanary : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["successRetentionPeriod"] = state ? state.successRetentionPeriod : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["timelines"] = state ? state.timelines : undefined;
            resourceInputs["vpcConfig"] = state ? state.vpcConfig : undefined;
            resourceInputs["zipFile"] = state ? state.zipFile : undefined;
        } else {
            const args = argsOrState as CanaryArgs | undefined;
            if ((!args || args.artifactS3Location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'artifactS3Location'");
            }
            if ((!args || args.executionRoleArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'executionRoleArn'");
            }
            if ((!args || args.handler === undefined) && !opts.urn) {
                throw new Error("Missing required property 'handler'");
            }
            if ((!args || args.runtimeVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'runtimeVersion'");
            }
            if ((!args || args.schedule === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schedule'");
            }
            resourceInputs["artifactConfig"] = args ? args.artifactConfig : undefined;
            resourceInputs["artifactS3Location"] = args ? args.artifactS3Location : undefined;
            resourceInputs["deleteLambda"] = args ? args.deleteLambda : undefined;
            resourceInputs["executionRoleArn"] = args ? args.executionRoleArn : undefined;
            resourceInputs["failureRetentionPeriod"] = args ? args.failureRetentionPeriod : undefined;
            resourceInputs["handler"] = args ? args.handler : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["runConfig"] = args ? args.runConfig : undefined;
            resourceInputs["runtimeVersion"] = args ? args.runtimeVersion : undefined;
            resourceInputs["s3Bucket"] = args ? args.s3Bucket : undefined;
            resourceInputs["s3Key"] = args ? args.s3Key : undefined;
            resourceInputs["s3Version"] = args ? args.s3Version : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
            resourceInputs["startCanary"] = args ? args.startCanary : undefined;
            resourceInputs["successRetentionPeriod"] = args ? args.successRetentionPeriod : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcConfig"] = args ? args.vpcConfig : undefined;
            resourceInputs["zipFile"] = args ? args.zipFile : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["engineArn"] = undefined /*out*/;
            resourceInputs["sourceLocationArn"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["timelines"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Canary.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Canary resources.
 */
export interface CanaryState {
    /**
     * Amazon Resource Name (ARN) of the Canary.
     */
    arn?: pulumi.Input<string>;
    /**
     * configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See Artifact Config.
     */
    artifactConfig?: pulumi.Input<inputs.synthetics.CanaryArtifactConfig>;
    /**
     * Location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary.
     */
    artifactS3Location?: pulumi.Input<string>;
    /**
     * Specifies whether to also delete the Lambda functions and layers used by this canary. The default is `false`.
     */
    deleteLambda?: pulumi.Input<boolean>;
    /**
     * ARN of the Lambda function that is used as your canary's engine.
     */
    engineArn?: pulumi.Input<string>;
    /**
     * ARN of the IAM role to be used to run the canary. see [AWS Docs](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CreateCanary.html#API_CreateCanary_RequestSyntax) for permissions needs for IAM Role.
     */
    executionRoleArn?: pulumi.Input<string>;
    /**
     * Number of days to retain data about failed runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     */
    failureRetentionPeriod?: pulumi.Input<number>;
    /**
     * Entry point to use for the source code when running the canary. This value must end with the string `.handler` .
     */
    handler?: pulumi.Input<string>;
    /**
     * Name for this canary. Has a maximum length of 21 characters. Valid characters are lowercase alphanumeric, hyphen, or underscore.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration block for individual canary runs. Detailed below.
     */
    runConfig?: pulumi.Input<inputs.synthetics.CanaryRunConfig>;
    /**
     * Runtime version to use for the canary. Versions change often so consult the [Amazon CloudWatch documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html) for the latest valid versions. Values include `syn-python-selenium-1.0`, `syn-nodejs-puppeteer-3.0`, `syn-nodejs-2.2`, `syn-nodejs-2.1`, `syn-nodejs-2.0`, and `syn-1.0`.
     */
    runtimeVersion?: pulumi.Input<string>;
    /**
     * Full bucket name which is used if your canary script is located in S3. The bucket must already exist. **Conflicts with `zipFile`.**
     */
    s3Bucket?: pulumi.Input<string>;
    /**
     * S3 key of your script. **Conflicts with `zipFile`.**
     */
    s3Key?: pulumi.Input<string>;
    /**
     * S3 version ID of your script. **Conflicts with `zipFile`.**
     */
    s3Version?: pulumi.Input<string>;
    /**
     * Configuration block providing how often the canary is to run and when these test runs are to stop. Detailed below.
     *
     * The following arguments are optional:
     */
    schedule?: pulumi.Input<inputs.synthetics.CanarySchedule>;
    /**
     * ARN of the Lambda layer where Synthetics stores the canary script code.
     */
    sourceLocationArn?: pulumi.Input<string>;
    /**
     * Whether to run or stop the canary.
     */
    startCanary?: pulumi.Input<boolean>;
    /**
     * Canary status.
     */
    status?: pulumi.Input<string>;
    /**
     * Number of days to retain data about successful runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     */
    successRetentionPeriod?: pulumi.Input<number>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Structure that contains information about when the canary was created, modified, and most recently run. see Timeline.
     */
    timelines?: pulumi.Input<pulumi.Input<inputs.synthetics.CanaryTimeline>[]>;
    /**
     * Configuration block. Detailed below.
     */
    vpcConfig?: pulumi.Input<inputs.synthetics.CanaryVpcConfig>;
    /**
     * ZIP file that contains the script, if you input your canary script directly into the canary instead of referring to an S3 location. It can be up to 225KB. **Conflicts with `s3Bucket`, `s3Key`, and `s3Version`.**
     */
    zipFile?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Canary resource.
 */
export interface CanaryArgs {
    /**
     * configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See Artifact Config.
     */
    artifactConfig?: pulumi.Input<inputs.synthetics.CanaryArtifactConfig>;
    /**
     * Location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary.
     */
    artifactS3Location: pulumi.Input<string>;
    /**
     * Specifies whether to also delete the Lambda functions and layers used by this canary. The default is `false`.
     */
    deleteLambda?: pulumi.Input<boolean>;
    /**
     * ARN of the IAM role to be used to run the canary. see [AWS Docs](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CreateCanary.html#API_CreateCanary_RequestSyntax) for permissions needs for IAM Role.
     */
    executionRoleArn: pulumi.Input<string>;
    /**
     * Number of days to retain data about failed runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     */
    failureRetentionPeriod?: pulumi.Input<number>;
    /**
     * Entry point to use for the source code when running the canary. This value must end with the string `.handler` .
     */
    handler: pulumi.Input<string>;
    /**
     * Name for this canary. Has a maximum length of 21 characters. Valid characters are lowercase alphanumeric, hyphen, or underscore.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration block for individual canary runs. Detailed below.
     */
    runConfig?: pulumi.Input<inputs.synthetics.CanaryRunConfig>;
    /**
     * Runtime version to use for the canary. Versions change often so consult the [Amazon CloudWatch documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html) for the latest valid versions. Values include `syn-python-selenium-1.0`, `syn-nodejs-puppeteer-3.0`, `syn-nodejs-2.2`, `syn-nodejs-2.1`, `syn-nodejs-2.0`, and `syn-1.0`.
     */
    runtimeVersion: pulumi.Input<string>;
    /**
     * Full bucket name which is used if your canary script is located in S3. The bucket must already exist. **Conflicts with `zipFile`.**
     */
    s3Bucket?: pulumi.Input<string>;
    /**
     * S3 key of your script. **Conflicts with `zipFile`.**
     */
    s3Key?: pulumi.Input<string>;
    /**
     * S3 version ID of your script. **Conflicts with `zipFile`.**
     */
    s3Version?: pulumi.Input<string>;
    /**
     * Configuration block providing how often the canary is to run and when these test runs are to stop. Detailed below.
     *
     * The following arguments are optional:
     */
    schedule: pulumi.Input<inputs.synthetics.CanarySchedule>;
    /**
     * Whether to run or stop the canary.
     */
    startCanary?: pulumi.Input<boolean>;
    /**
     * Number of days to retain data about successful runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     */
    successRetentionPeriod?: pulumi.Input<number>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configuration block. Detailed below.
     */
    vpcConfig?: pulumi.Input<inputs.synthetics.CanaryVpcConfig>;
    /**
     * ZIP file that contains the script, if you input your canary script directly into the canary instead of referring to an S3 location. It can be up to 225KB. **Conflicts with `s3Bucket`, `s3Key`, and `s3Version`.**
     */
    zipFile?: pulumi.Input<string>;
}
