// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Generates an Route53 traffic policy document in JSON format for use with resources that expect policy documents such as `aws.route53.TrafficPolicy`.
 *
 * ## Example Usage
 * ### Basic Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getRegion({});
 * const exampleTrafficPolicyDocument = Promise.all([current, current]).then(([current, current1]) => aws.route53.getTrafficPolicyDocument({
 *     recordType: "A",
 *     startRule: "site_switch",
 *     endpoints: [
 *         {
 *             id: "my_elb",
 *             type: "elastic-load-balancer",
 *             value: `elb-111111.${current.name}.elb.amazonaws.com`,
 *         },
 *         {
 *             id: "site_down_banner",
 *             type: "s3-website",
 *             region: current1.name,
 *             value: "www.example.com",
 *         },
 *     ],
 *     rules: [{
 *         id: "site_switch",
 *         type: "failover",
 *         primary: {
 *             endpointReference: "my_elb",
 *         },
 *         secondary: {
 *             endpointReference: "site_down_banner",
 *         },
 *     }],
 * }));
 * const exampleTrafficPolicy = new aws.route53.TrafficPolicy("exampleTrafficPolicy", {
 *     comment: "example comment",
 *     document: exampleTrafficPolicyDocument.then(exampleTrafficPolicyDocument => exampleTrafficPolicyDocument.json),
 * });
 * ```
 * ### Complex Example
 *
 * The following example showcases the use of nested rules within the traffic policy document and introduces the `geoproximity` rule type.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleTrafficPolicyDocument = aws.route53.getTrafficPolicyDocument({
 *     recordType: "A",
 *     startRule: "geoproximity_rule",
 *     endpoints: [
 *         {
 *             id: "na_endpoint_a",
 *             type: "elastic-load-balancer",
 *             value: "elb-111111.us-west-1.elb.amazonaws.com",
 *         },
 *         {
 *             id: "na_endpoint_b",
 *             type: "elastic-load-balancer",
 *             value: "elb-222222.us-west-1.elb.amazonaws.com",
 *         },
 *         {
 *             id: "eu_endpoint",
 *             type: "elastic-load-balancer",
 *             value: "elb-333333.eu-west-1.elb.amazonaws.com",
 *         },
 *         {
 *             id: "ap_endpoint",
 *             type: "elastic-load-balancer",
 *             value: "elb-444444.ap-northeast-2.elb.amazonaws.com",
 *         },
 *     ],
 *     rules: [
 *         {
 *             id: "na_rule",
 *             type: "failover",
 *             primary: {
 *                 endpointReference: "na_endpoint_a",
 *             },
 *             secondary: {
 *                 endpointReference: "na_endpoint_b",
 *             },
 *         },
 *         {
 *             id: "geoproximity_rule",
 *             type: "geoproximity",
 *             geoProximityLocations: [
 *                 {
 *                     region: "aws:route53:us-west-1",
 *                     bias: "10",
 *                     evaluateTargetHealth: true,
 *                     ruleReference: "na_rule",
 *                 },
 *                 {
 *                     region: "aws:route53:eu-west-1",
 *                     bias: "10",
 *                     evaluateTargetHealth: true,
 *                     endpointReference: "eu_endpoint",
 *                 },
 *                 {
 *                     region: "aws:route53:ap-northeast-2",
 *                     bias: "0",
 *                     evaluateTargetHealth: true,
 *                     endpointReference: "ap_endpoint",
 *                 },
 *             ],
 *         },
 *     ],
 * });
 * const exampleTrafficPolicy = new aws.route53.TrafficPolicy("exampleTrafficPolicy", {
 *     comment: "example comment",
 *     document: exampleTrafficPolicyDocument.then(exampleTrafficPolicyDocument => exampleTrafficPolicyDocument.json),
 * });
 * ```
 */
export function getTrafficPolicyDocument(args?: GetTrafficPolicyDocumentArgs, opts?: pulumi.InvokeOptions): Promise<GetTrafficPolicyDocumentResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:route53/getTrafficPolicyDocument:getTrafficPolicyDocument", {
        "endpoints": args.endpoints,
        "recordType": args.recordType,
        "rules": args.rules,
        "startEndpoint": args.startEndpoint,
        "startRule": args.startRule,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getTrafficPolicyDocument.
 */
export interface GetTrafficPolicyDocumentArgs {
    /**
     * Configuration block for the definitions of the endpoints that you want to use in this traffic policy. See below
     */
    endpoints?: inputs.route53.GetTrafficPolicyDocumentEndpoint[];
    /**
     * DNS type of all of the resource record sets that Amazon Route 53 will create based on this traffic policy.
     */
    recordType?: string;
    /**
     * Configuration block for definitions of the rules that you want to use in this traffic policy. See below
     */
    rules?: inputs.route53.GetTrafficPolicyDocumentRule[];
    /**
     * An endpoint to be as the starting point for the traffic policy.
     */
    startEndpoint?: string;
    /**
     * A rule to be as the starting point for the traffic policy.
     */
    startRule?: string;
    /**
     * Version of the traffic policy format.
     */
    version?: string;
}

/**
 * A collection of values returned by getTrafficPolicyDocument.
 */
export interface GetTrafficPolicyDocumentResult {
    readonly endpoints?: outputs.route53.GetTrafficPolicyDocumentEndpoint[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Standard JSON policy document rendered based on the arguments above.
     */
    readonly json: string;
    readonly recordType?: string;
    readonly rules?: outputs.route53.GetTrafficPolicyDocumentRule[];
    readonly startEndpoint?: string;
    readonly startRule?: string;
    readonly version?: string;
}
/**
 * Generates an Route53 traffic policy document in JSON format for use with resources that expect policy documents such as `aws.route53.TrafficPolicy`.
 *
 * ## Example Usage
 * ### Basic Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getRegion({});
 * const exampleTrafficPolicyDocument = Promise.all([current, current]).then(([current, current1]) => aws.route53.getTrafficPolicyDocument({
 *     recordType: "A",
 *     startRule: "site_switch",
 *     endpoints: [
 *         {
 *             id: "my_elb",
 *             type: "elastic-load-balancer",
 *             value: `elb-111111.${current.name}.elb.amazonaws.com`,
 *         },
 *         {
 *             id: "site_down_banner",
 *             type: "s3-website",
 *             region: current1.name,
 *             value: "www.example.com",
 *         },
 *     ],
 *     rules: [{
 *         id: "site_switch",
 *         type: "failover",
 *         primary: {
 *             endpointReference: "my_elb",
 *         },
 *         secondary: {
 *             endpointReference: "site_down_banner",
 *         },
 *     }],
 * }));
 * const exampleTrafficPolicy = new aws.route53.TrafficPolicy("exampleTrafficPolicy", {
 *     comment: "example comment",
 *     document: exampleTrafficPolicyDocument.then(exampleTrafficPolicyDocument => exampleTrafficPolicyDocument.json),
 * });
 * ```
 * ### Complex Example
 *
 * The following example showcases the use of nested rules within the traffic policy document and introduces the `geoproximity` rule type.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleTrafficPolicyDocument = aws.route53.getTrafficPolicyDocument({
 *     recordType: "A",
 *     startRule: "geoproximity_rule",
 *     endpoints: [
 *         {
 *             id: "na_endpoint_a",
 *             type: "elastic-load-balancer",
 *             value: "elb-111111.us-west-1.elb.amazonaws.com",
 *         },
 *         {
 *             id: "na_endpoint_b",
 *             type: "elastic-load-balancer",
 *             value: "elb-222222.us-west-1.elb.amazonaws.com",
 *         },
 *         {
 *             id: "eu_endpoint",
 *             type: "elastic-load-balancer",
 *             value: "elb-333333.eu-west-1.elb.amazonaws.com",
 *         },
 *         {
 *             id: "ap_endpoint",
 *             type: "elastic-load-balancer",
 *             value: "elb-444444.ap-northeast-2.elb.amazonaws.com",
 *         },
 *     ],
 *     rules: [
 *         {
 *             id: "na_rule",
 *             type: "failover",
 *             primary: {
 *                 endpointReference: "na_endpoint_a",
 *             },
 *             secondary: {
 *                 endpointReference: "na_endpoint_b",
 *             },
 *         },
 *         {
 *             id: "geoproximity_rule",
 *             type: "geoproximity",
 *             geoProximityLocations: [
 *                 {
 *                     region: "aws:route53:us-west-1",
 *                     bias: "10",
 *                     evaluateTargetHealth: true,
 *                     ruleReference: "na_rule",
 *                 },
 *                 {
 *                     region: "aws:route53:eu-west-1",
 *                     bias: "10",
 *                     evaluateTargetHealth: true,
 *                     endpointReference: "eu_endpoint",
 *                 },
 *                 {
 *                     region: "aws:route53:ap-northeast-2",
 *                     bias: "0",
 *                     evaluateTargetHealth: true,
 *                     endpointReference: "ap_endpoint",
 *                 },
 *             ],
 *         },
 *     ],
 * });
 * const exampleTrafficPolicy = new aws.route53.TrafficPolicy("exampleTrafficPolicy", {
 *     comment: "example comment",
 *     document: exampleTrafficPolicyDocument.then(exampleTrafficPolicyDocument => exampleTrafficPolicyDocument.json),
 * });
 * ```
 */
export function getTrafficPolicyDocumentOutput(args?: GetTrafficPolicyDocumentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTrafficPolicyDocumentResult> {
    return pulumi.output(args).apply((a: any) => getTrafficPolicyDocument(a, opts))
}

/**
 * A collection of arguments for invoking getTrafficPolicyDocument.
 */
export interface GetTrafficPolicyDocumentOutputArgs {
    /**
     * Configuration block for the definitions of the endpoints that you want to use in this traffic policy. See below
     */
    endpoints?: pulumi.Input<pulumi.Input<inputs.route53.GetTrafficPolicyDocumentEndpointArgs>[]>;
    /**
     * DNS type of all of the resource record sets that Amazon Route 53 will create based on this traffic policy.
     */
    recordType?: pulumi.Input<string>;
    /**
     * Configuration block for definitions of the rules that you want to use in this traffic policy. See below
     */
    rules?: pulumi.Input<pulumi.Input<inputs.route53.GetTrafficPolicyDocumentRuleArgs>[]>;
    /**
     * An endpoint to be as the starting point for the traffic policy.
     */
    startEndpoint?: pulumi.Input<string>;
    /**
     * A rule to be as the starting point for the traffic policy.
     */
    startRule?: pulumi.Input<string>;
    /**
     * Version of the traffic policy format.
     */
    version?: pulumi.Input<string>;
}
