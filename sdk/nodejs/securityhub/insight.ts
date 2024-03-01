// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a Security Hub custom insight resource. See the [Managing custom insights section](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-custom-insights.html) of the AWS User Guide for more information.
 *
 * ## Example Usage
 * ### Filter by AWS account ID
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.securityhub.Account("example", {});
 * const exampleInsight = new aws.securityhub.Insight("example", {
 *     filters: {
 *         awsAccountIds: [
 *             {
 *                 comparison: "EQUALS",
 *                 value: "1234567890",
 *             },
 *             {
 *                 comparison: "EQUALS",
 *                 value: "09876543210",
 *             },
 *         ],
 *     },
 *     groupByAttribute: "AwsAccountId",
 *     name: "example-insight",
 * });
 * ```
 * ### Filter by date range
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.securityhub.Account("example", {});
 * const exampleInsight = new aws.securityhub.Insight("example", {
 *     filters: {
 *         createdAts: [{
 *             dateRange: {
 *                 unit: "DAYS",
 *                 value: 5,
 *             },
 *         }],
 *     },
 *     groupByAttribute: "CreatedAt",
 *     name: "example-insight",
 * });
 * ```
 * ### Filter by destination IPv4 address
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.securityhub.Account("example", {});
 * const exampleInsight = new aws.securityhub.Insight("example", {
 *     filters: {
 *         networkDestinationIpv4s: [{
 *             cidr: "10.0.0.0/16",
 *         }],
 *     },
 *     groupByAttribute: "NetworkDestinationIpV4",
 *     name: "example-insight",
 * });
 * ```
 * ### Filter by finding's confidence
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.securityhub.Account("example", {});
 * const exampleInsight = new aws.securityhub.Insight("example", {
 *     filters: {
 *         confidences: [{
 *             gte: "80",
 *         }],
 *     },
 *     groupByAttribute: "Confidence",
 *     name: "example-insight",
 * });
 * ```
 * ### Filter by resource tags
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.securityhub.Account("example", {});
 * const exampleInsight = new aws.securityhub.Insight("example", {
 *     filters: {
 *         resourceTags: [{
 *             comparison: "EQUALS",
 *             key: "Environment",
 *             value: "Production",
 *         }],
 *     },
 *     groupByAttribute: "ResourceTags",
 *     name: "example-insight",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Security Hub insights using the ARN. For example:
 *
 * ```sh
 *  $ pulumi import aws:securityhub/insight:Insight example arn:aws:securityhub:us-west-2:1234567890:insight/1234567890/custom/91299ed7-abd0-4e44-a858-d0b15e37141a
 * ```
 */
export class Insight extends pulumi.CustomResource {
    /**
     * Get an existing Insight resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InsightState, opts?: pulumi.CustomResourceOptions): Insight {
        return new Insight(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:securityhub/insight:Insight';

    /**
     * Returns true if the given object is an instance of Insight.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Insight {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Insight.__pulumiType;
    }

    /**
     * ARN of the insight.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A configuration block including one or more (up to 10 distinct) attributes used to filter the findings included in the insight. The insight only includes findings that match criteria defined in the filters. See filters below for more details.
     */
    public readonly filters!: pulumi.Output<outputs.securityhub.InsightFilters>;
    /**
     * The attribute used to group the findings for the insight e.g., if an insight is grouped by `ResourceId`, then the insight produces a list of resource identifiers.
     */
    public readonly groupByAttribute!: pulumi.Output<string>;
    /**
     * The name of the custom insight.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a Insight resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InsightArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InsightArgs | InsightState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InsightState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["filters"] = state ? state.filters : undefined;
            resourceInputs["groupByAttribute"] = state ? state.groupByAttribute : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as InsightArgs | undefined;
            if ((!args || args.filters === undefined) && !opts.urn) {
                throw new Error("Missing required property 'filters'");
            }
            if ((!args || args.groupByAttribute === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupByAttribute'");
            }
            resourceInputs["filters"] = args ? args.filters : undefined;
            resourceInputs["groupByAttribute"] = args ? args.groupByAttribute : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["arn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Insight.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Insight resources.
 */
export interface InsightState {
    /**
     * ARN of the insight.
     */
    arn?: pulumi.Input<string>;
    /**
     * A configuration block including one or more (up to 10 distinct) attributes used to filter the findings included in the insight. The insight only includes findings that match criteria defined in the filters. See filters below for more details.
     */
    filters?: pulumi.Input<inputs.securityhub.InsightFilters>;
    /**
     * The attribute used to group the findings for the insight e.g., if an insight is grouped by `ResourceId`, then the insight produces a list of resource identifiers.
     */
    groupByAttribute?: pulumi.Input<string>;
    /**
     * The name of the custom insight.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Insight resource.
 */
export interface InsightArgs {
    /**
     * A configuration block including one or more (up to 10 distinct) attributes used to filter the findings included in the insight. The insight only includes findings that match criteria defined in the filters. See filters below for more details.
     */
    filters: pulumi.Input<inputs.securityhub.InsightFilters>;
    /**
     * The attribute used to group the findings for the insight e.g., if an insight is grouped by `ResourceId`, then the insight produces a list of resource identifiers.
     */
    groupByAttribute: pulumi.Input<string>;
    /**
     * The name of the custom insight.
     */
    name?: pulumi.Input<string>;
}
