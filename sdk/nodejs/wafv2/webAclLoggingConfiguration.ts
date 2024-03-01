// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * This resource creates a WAFv2 Web ACL Logging Configuration.
 *
 * !> **WARNING:** When logging from a WAFv2 Web ACL to a CloudWatch Log Group, the WAFv2 service tries to create or update a generic Log Resource Policy named `AWSWAF-LOGS`. However, if there are a large number of Web ACLs or if the account frequently creates and deletes Web ACLs, this policy may exceed the maximum policy size. As a result, this resource type will fail to be created. More details about this issue can be found in this issue. To prevent this issue, you can manage a specific resource policy. Please refer to the example below for managing a CloudWatch Log Group with a managed CloudWatch Log Resource Policy.
 *
 * ## Example Usage
 * ### With Redacted Fields
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.wafv2.WebAclLoggingConfiguration("example", {
 *     logDestinationConfigs: [exampleAwsKinesisFirehoseDeliveryStream.arn],
 *     resourceArn: exampleAwsWafv2WebAcl.arn,
 *     redactedFields: [{
 *         singleHeader: {
 *             name: "user-agent",
 *         },
 *     }],
 * });
 * ```
 * ### With Logging Filter
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.wafv2.WebAclLoggingConfiguration("example", {
 *     logDestinationConfigs: [exampleAwsKinesisFirehoseDeliveryStream.arn],
 *     resourceArn: exampleAwsWafv2WebAcl.arn,
 *     loggingFilter: {
 *         defaultBehavior: "KEEP",
 *         filters: [
 *             {
 *                 behavior: "DROP",
 *                 conditions: [
 *                     {
 *                         actionCondition: {
 *                             action: "COUNT",
 *                         },
 *                     },
 *                     {
 *                         labelNameCondition: {
 *                             labelName: "awswaf:111122223333:rulegroup:testRules:LabelNameZ",
 *                         },
 *                     },
 *                 ],
 *                 requirement: "MEETS_ALL",
 *             },
 *             {
 *                 behavior: "KEEP",
 *                 conditions: [{
 *                     actionCondition: {
 *                         action: "ALLOW",
 *                     },
 *                 }],
 *                 requirement: "MEETS_ANY",
 *             },
 *         ],
 *     },
 * });
 * ```
 * ### With CloudWatch Log Group and managed CloudWatch Log Resource Policy
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * function notImplemented(message: string) {
 *     throw new Error(message);
 * }
 *
 * const exampleLogGroup = new aws.cloudwatch.LogGroup("example", {name: "aws-waf-logs-some-uniq-suffix"});
 * const exampleWebAclLoggingConfiguration = new aws.wafv2.WebAclLoggingConfiguration("example", {
 *     logDestinationConfigs: [exampleLogGroup.arn],
 *     resourceArn: exampleAwsWafv2WebAcl.arn,
 * });
 * const current = aws.getRegion({});
 * const currentGetCallerIdentity = aws.getCallerIdentity({});
 * const example = pulumi.all([exampleLogGroup.arn, current, currentGetCallerIdentity]).apply(([arn, current, currentGetCallerIdentity]) => aws.iam.getPolicyDocumentOutput({
 *     version: "2012-10-17",
 *     statements: [{
 *         effect: "Allow",
 *         principals: [{
 *             identifiers: ["delivery.logs.amazonaws.com"],
 *             type: "Service",
 *         }],
 *         actions: [
 *             "logs:CreateLogStream",
 *             "logs:PutLogEvents",
 *         ],
 *         resources: [`${arn}:*`],
 *         conditions: [
 *             {
 *                 test: "ArnLike",
 *                 values: [`arn:aws:logs:${current.name}:${currentGetCallerIdentity.accountId}:*`],
 *                 variable: "aws:SourceArn",
 *             },
 *             {
 *                 test: "StringEquals",
 *                 values: [notImplemented("tostring(data.aws_caller_identity.current.account_id)")],
 *                 variable: "aws:SourceAccount",
 *             },
 *         ],
 *     }],
 * }));
 * const exampleLogResourcePolicy = new aws.cloudwatch.LogResourcePolicy("example", {
 *     policyDocument: example.apply(example => example.json),
 *     policyName: "webacl-policy-uniq-name",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import WAFv2 Web ACL Logging Configurations using the ARN of the WAFv2 Web ACL. For example:
 *
 * ```sh
 *  $ pulumi import aws:wafv2/webAclLoggingConfiguration:WebAclLoggingConfiguration example arn:aws:wafv2:us-west-2:123456789012:regional/webacl/test-logs/a1b2c3d4-5678-90ab-cdef
 * ```
 */
export class WebAclLoggingConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing WebAclLoggingConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WebAclLoggingConfigurationState, opts?: pulumi.CustomResourceOptions): WebAclLoggingConfiguration {
        return new WebAclLoggingConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:wafv2/webAclLoggingConfiguration:WebAclLoggingConfiguration';

    /**
     * Returns true if the given object is an instance of WebAclLoggingConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WebAclLoggingConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WebAclLoggingConfiguration.__pulumiType;
    }

    /**
     * Configuration block that allows you to associate Amazon Kinesis Data Firehose, Cloudwatch Log log group, or S3 bucket Amazon Resource Names (ARNs) with the web ACL. **Note:** data firehose, log group, or bucket name **must** be prefixed with `aws-waf-logs-`, e.g. `aws-waf-logs-example-firehose`, `aws-waf-logs-example-log-group`, or `aws-waf-logs-example-bucket`.
     */
    public readonly logDestinationConfigs!: pulumi.Output<string[]>;
    /**
     * Configuration block that specifies which web requests are kept in the logs and which are dropped. It allows filtering based on the rule action and the web request labels applied by matching rules during web ACL evaluation. For more details, refer to the Logging Filter section below.
     */
    public readonly loggingFilter!: pulumi.Output<outputs.wafv2.WebAclLoggingConfigurationLoggingFilter | undefined>;
    /**
     * Configuration for parts of the request that you want to keep out of the logs. Up to 100 `redactedFields` blocks are supported. See Redacted Fields below for more details.
     */
    public readonly redactedFields!: pulumi.Output<outputs.wafv2.WebAclLoggingConfigurationRedactedField[] | undefined>;
    /**
     * Amazon Resource Name (ARN) of the web ACL that you want to associate with `logDestinationConfigs`.
     */
    public readonly resourceArn!: pulumi.Output<string>;

    /**
     * Create a WebAclLoggingConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WebAclLoggingConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WebAclLoggingConfigurationArgs | WebAclLoggingConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WebAclLoggingConfigurationState | undefined;
            resourceInputs["logDestinationConfigs"] = state ? state.logDestinationConfigs : undefined;
            resourceInputs["loggingFilter"] = state ? state.loggingFilter : undefined;
            resourceInputs["redactedFields"] = state ? state.redactedFields : undefined;
            resourceInputs["resourceArn"] = state ? state.resourceArn : undefined;
        } else {
            const args = argsOrState as WebAclLoggingConfigurationArgs | undefined;
            if ((!args || args.logDestinationConfigs === undefined) && !opts.urn) {
                throw new Error("Missing required property 'logDestinationConfigs'");
            }
            if ((!args || args.resourceArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceArn'");
            }
            resourceInputs["logDestinationConfigs"] = args ? args.logDestinationConfigs : undefined;
            resourceInputs["loggingFilter"] = args ? args.loggingFilter : undefined;
            resourceInputs["redactedFields"] = args ? args.redactedFields : undefined;
            resourceInputs["resourceArn"] = args ? args.resourceArn : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WebAclLoggingConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WebAclLoggingConfiguration resources.
 */
export interface WebAclLoggingConfigurationState {
    /**
     * Configuration block that allows you to associate Amazon Kinesis Data Firehose, Cloudwatch Log log group, or S3 bucket Amazon Resource Names (ARNs) with the web ACL. **Note:** data firehose, log group, or bucket name **must** be prefixed with `aws-waf-logs-`, e.g. `aws-waf-logs-example-firehose`, `aws-waf-logs-example-log-group`, or `aws-waf-logs-example-bucket`.
     */
    logDestinationConfigs?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configuration block that specifies which web requests are kept in the logs and which are dropped. It allows filtering based on the rule action and the web request labels applied by matching rules during web ACL evaluation. For more details, refer to the Logging Filter section below.
     */
    loggingFilter?: pulumi.Input<inputs.wafv2.WebAclLoggingConfigurationLoggingFilter>;
    /**
     * Configuration for parts of the request that you want to keep out of the logs. Up to 100 `redactedFields` blocks are supported. See Redacted Fields below for more details.
     */
    redactedFields?: pulumi.Input<pulumi.Input<inputs.wafv2.WebAclLoggingConfigurationRedactedField>[]>;
    /**
     * Amazon Resource Name (ARN) of the web ACL that you want to associate with `logDestinationConfigs`.
     */
    resourceArn?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WebAclLoggingConfiguration resource.
 */
export interface WebAclLoggingConfigurationArgs {
    /**
     * Configuration block that allows you to associate Amazon Kinesis Data Firehose, Cloudwatch Log log group, or S3 bucket Amazon Resource Names (ARNs) with the web ACL. **Note:** data firehose, log group, or bucket name **must** be prefixed with `aws-waf-logs-`, e.g. `aws-waf-logs-example-firehose`, `aws-waf-logs-example-log-group`, or `aws-waf-logs-example-bucket`.
     */
    logDestinationConfigs: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configuration block that specifies which web requests are kept in the logs and which are dropped. It allows filtering based on the rule action and the web request labels applied by matching rules during web ACL evaluation. For more details, refer to the Logging Filter section below.
     */
    loggingFilter?: pulumi.Input<inputs.wafv2.WebAclLoggingConfigurationLoggingFilter>;
    /**
     * Configuration for parts of the request that you want to keep out of the logs. Up to 100 `redactedFields` blocks are supported. See Redacted Fields below for more details.
     */
    redactedFields?: pulumi.Input<pulumi.Input<inputs.wafv2.WebAclLoggingConfigurationRedactedField>[]>;
    /**
     * Amazon Resource Name (ARN) of the web ACL that you want to associate with `logDestinationConfigs`.
     */
    resourceArn: pulumi.Input<string>;
}
