// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Route53 query logging configuration resource.
 *
 * > **NOTE:** There are restrictions on the configuration of query logging. Notably,
 * the CloudWatch log group must be in the `us-east-1` region,
 * a permissive CloudWatch log resource policy must be in place, and
 * the Route53 hosted zone must be public.
 * See [Configuring Logging for DNS Queries](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html?console_help=true#query-logs-configuring) for additional details.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * // Example CloudWatch log group in us-east-1
 * const us_east_1 = new aws.Provider("us-east-1", {region: "us-east-1"});
 * const awsRoute53ExampleCom = new aws.cloudwatch.LogGroup("awsRoute53ExampleCom", {retentionInDays: 30}, {
 *     provider: aws["us-east-1"],
 * });
 * // Example CloudWatch log resource policy to allow Route53 to write logs
 * // to any log group under /aws/route53/*
 * const route53-query-logging-policyPolicyDocument = aws.iam.getPolicyDocument({
 *     statements: [{
 *         actions: [
 *             "logs:CreateLogStream",
 *             "logs:PutLogEvents",
 *         ],
 *         resources: ["arn:aws:logs:*:*:log-group:/aws/route53/*"],
 *         principals: [{
 *             identifiers: ["route53.amazonaws.com"],
 *             type: "Service",
 *         }],
 *     }],
 * });
 * const route53_query_logging_policyLogResourcePolicy = new aws.cloudwatch.LogResourcePolicy("route53-query-logging-policyLogResourcePolicy", {
 *     policyDocument: route53_query_logging_policyPolicyDocument.then(route53_query_logging_policyPolicyDocument => route53_query_logging_policyPolicyDocument.json),
 *     policyName: "route53-query-logging-policy",
 * }, {
 *     provider: aws["us-east-1"],
 * });
 * // Example Route53 zone with query logging
 * const exampleComZone = new aws.route53.Zone("exampleComZone", {});
 * const exampleComQueryLog = new aws.route53.QueryLog("exampleComQueryLog", {
 *     cloudwatchLogGroupArn: awsRoute53ExampleCom.arn,
 *     zoneId: exampleComZone.zoneId,
 * }, {
 *     dependsOn: [route53_query_logging_policyLogResourcePolicy],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Route53 query logging configurations using their ID. For example:
 *
 * ```sh
 *  $ pulumi import aws:route53/queryLog:QueryLog example_com xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
 * ```
 */
export class QueryLog extends pulumi.CustomResource {
    /**
     * Get an existing QueryLog resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: QueryLogState, opts?: pulumi.CustomResourceOptions): QueryLog {
        return new QueryLog(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:route53/queryLog:QueryLog';

    /**
     * Returns true if the given object is an instance of QueryLog.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is QueryLog {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === QueryLog.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the Query Logging Config.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * CloudWatch log group ARN to send query logs.
     */
    public readonly cloudwatchLogGroupArn!: pulumi.Output<string>;
    /**
     * Route53 hosted zone ID to enable query logs.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a QueryLog resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: QueryLogArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: QueryLogArgs | QueryLogState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as QueryLogState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["cloudwatchLogGroupArn"] = state ? state.cloudwatchLogGroupArn : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as QueryLogArgs | undefined;
            if ((!args || args.cloudwatchLogGroupArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cloudwatchLogGroupArn'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["cloudwatchLogGroupArn"] = args ? args.cloudwatchLogGroupArn : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["arn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(QueryLog.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering QueryLog resources.
 */
export interface QueryLogState {
    /**
     * The Amazon Resource Name (ARN) of the Query Logging Config.
     */
    arn?: pulumi.Input<string>;
    /**
     * CloudWatch log group ARN to send query logs.
     */
    cloudwatchLogGroupArn?: pulumi.Input<string>;
    /**
     * Route53 hosted zone ID to enable query logs.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a QueryLog resource.
 */
export interface QueryLogArgs {
    /**
     * CloudWatch log group ARN to send query logs.
     */
    cloudwatchLogGroupArn: pulumi.Input<string>;
    /**
     * Route53 hosted zone ID to enable query logs.
     */
    zoneId: pulumi.Input<string>;
}
