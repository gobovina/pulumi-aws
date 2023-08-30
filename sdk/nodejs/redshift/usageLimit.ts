// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Creates a new Amazon Redshift Usage Limit.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.redshift.UsageLimit("example", {
 *     clusterIdentifier: aws_redshift_cluster.example.id,
 *     featureType: "concurrency-scaling",
 *     limitType: "time",
 *     amount: 60,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Redshift usage limits using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:redshift/usageLimit:UsageLimit example example-id
 * ```
 */
export class UsageLimit extends pulumi.CustomResource {
    /**
     * Get an existing UsageLimit resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UsageLimitState, opts?: pulumi.CustomResourceOptions): UsageLimit {
        return new UsageLimit(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:redshift/usageLimit:UsageLimit';

    /**
     * Returns true if the given object is an instance of UsageLimit.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UsageLimit {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UsageLimit.__pulumiType;
    }

    /**
     * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB). The value must be a positive number.
     */
    public readonly amount!: pulumi.Output<number>;
    /**
     * Amazon Resource Name (ARN) of the Redshift Usage Limit.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The action that Amazon Redshift takes when the limit is reached. The default is `log`. Valid values are `log`, `emit-metric`, and `disable`.
     */
    public readonly breachAction!: pulumi.Output<string | undefined>;
    /**
     * The identifier of the cluster that you want to limit usage.
     */
    public readonly clusterIdentifier!: pulumi.Output<string>;
    /**
     * The Amazon Redshift feature that you want to limit. Valid values are `spectrum`, `concurrency-scaling`, and `cross-region-datasharing`.
     */
    public readonly featureType!: pulumi.Output<string>;
    /**
     * The type of limit. Depending on the feature type, this can be based on a time duration or data size. If FeatureType is `spectrum`, then LimitType must be `data-scanned`. If FeatureType is `concurrency-scaling`, then LimitType must be `time`. If FeatureType is `cross-region-datasharing`, then LimitType must be `data-scanned`. Valid values are `data-scanned`, and `time`.
     */
    public readonly limitType!: pulumi.Output<string>;
    /**
     * The time period that the amount applies to. A weekly period begins on Sunday. The default is `monthly`. Valid values are `daily`, `weekly`, and `monthly`.
     */
    public readonly period!: pulumi.Output<string | undefined>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a UsageLimit resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UsageLimitArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UsageLimitArgs | UsageLimitState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UsageLimitState | undefined;
            resourceInputs["amount"] = state ? state.amount : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["breachAction"] = state ? state.breachAction : undefined;
            resourceInputs["clusterIdentifier"] = state ? state.clusterIdentifier : undefined;
            resourceInputs["featureType"] = state ? state.featureType : undefined;
            resourceInputs["limitType"] = state ? state.limitType : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as UsageLimitArgs | undefined;
            if ((!args || args.amount === undefined) && !opts.urn) {
                throw new Error("Missing required property 'amount'");
            }
            if ((!args || args.clusterIdentifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterIdentifier'");
            }
            if ((!args || args.featureType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'featureType'");
            }
            if ((!args || args.limitType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'limitType'");
            }
            resourceInputs["amount"] = args ? args.amount : undefined;
            resourceInputs["breachAction"] = args ? args.breachAction : undefined;
            resourceInputs["clusterIdentifier"] = args ? args.clusterIdentifier : undefined;
            resourceInputs["featureType"] = args ? args.featureType : undefined;
            resourceInputs["limitType"] = args ? args.limitType : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UsageLimit.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UsageLimit resources.
 */
export interface UsageLimitState {
    /**
     * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB). The value must be a positive number.
     */
    amount?: pulumi.Input<number>;
    /**
     * Amazon Resource Name (ARN) of the Redshift Usage Limit.
     */
    arn?: pulumi.Input<string>;
    /**
     * The action that Amazon Redshift takes when the limit is reached. The default is `log`. Valid values are `log`, `emit-metric`, and `disable`.
     */
    breachAction?: pulumi.Input<string>;
    /**
     * The identifier of the cluster that you want to limit usage.
     */
    clusterIdentifier?: pulumi.Input<string>;
    /**
     * The Amazon Redshift feature that you want to limit. Valid values are `spectrum`, `concurrency-scaling`, and `cross-region-datasharing`.
     */
    featureType?: pulumi.Input<string>;
    /**
     * The type of limit. Depending on the feature type, this can be based on a time duration or data size. If FeatureType is `spectrum`, then LimitType must be `data-scanned`. If FeatureType is `concurrency-scaling`, then LimitType must be `time`. If FeatureType is `cross-region-datasharing`, then LimitType must be `data-scanned`. Valid values are `data-scanned`, and `time`.
     */
    limitType?: pulumi.Input<string>;
    /**
     * The time period that the amount applies to. A weekly period begins on Sunday. The default is `monthly`. Valid values are `daily`, `weekly`, and `monthly`.
     */
    period?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a UsageLimit resource.
 */
export interface UsageLimitArgs {
    /**
     * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB). The value must be a positive number.
     */
    amount: pulumi.Input<number>;
    /**
     * The action that Amazon Redshift takes when the limit is reached. The default is `log`. Valid values are `log`, `emit-metric`, and `disable`.
     */
    breachAction?: pulumi.Input<string>;
    /**
     * The identifier of the cluster that you want to limit usage.
     */
    clusterIdentifier: pulumi.Input<string>;
    /**
     * The Amazon Redshift feature that you want to limit. Valid values are `spectrum`, `concurrency-scaling`, and `cross-region-datasharing`.
     */
    featureType: pulumi.Input<string>;
    /**
     * The type of limit. Depending on the feature type, this can be based on a time duration or data size. If FeatureType is `spectrum`, then LimitType must be `data-scanned`. If FeatureType is `concurrency-scaling`, then LimitType must be `time`. If FeatureType is `cross-region-datasharing`, then LimitType must be `data-scanned`. Valid values are `data-scanned`, and `time`.
     */
    limitType: pulumi.Input<string>;
    /**
     * The time period that the amount applies to. A weekly period begins on Sunday. The default is `monthly`. Valid values are `daily`, `weekly`, and `monthly`.
     */
    period?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
