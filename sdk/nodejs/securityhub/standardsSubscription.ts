// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Subscribes to a Security Hub standard.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.securityhub.Account("example", {});
 * const current = aws.getRegion({});
 * const cis = new aws.securityhub.StandardsSubscription("cis", {standardsArn: "arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0"}, {
 *     dependsOn: [example],
 * });
 * const pci321 = new aws.securityhub.StandardsSubscription("pci321", {standardsArn: current.then(current => `arn:aws:securityhub:${current.name}::standards/pci-dss/v/3.2.1`)}, {
 *     dependsOn: [example],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Security Hub standards subscriptions using the standards subscription ARN. For example:
 *
 * ```sh
 *  $ pulumi import aws:securityhub/standardsSubscription:StandardsSubscription cis arn:aws:securityhub:eu-west-1:123456789012:subscription/cis-aws-foundations-benchmark/v/1.2.0
 * ```
 * ```sh
 * $ pulumi import aws:securityhub/standardsSubscription:StandardsSubscription pci_321 arn:aws:securityhub:eu-west-1:123456789012:subscription/pci-dss/v/3.2.1
 * ```
 * ```sh
 * $ pulumi import aws:securityhub/standardsSubscription:StandardsSubscription nist_800_53_rev_5 arn:aws:securityhub:eu-west-1:123456789012:subscription/nist-800-53/v/5.0.0
 * ```
 */
export class StandardsSubscription extends pulumi.CustomResource {
    /**
     * Get an existing StandardsSubscription resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StandardsSubscriptionState, opts?: pulumi.CustomResourceOptions): StandardsSubscription {
        return new StandardsSubscription(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:securityhub/standardsSubscription:StandardsSubscription';

    /**
     * Returns true if the given object is an instance of StandardsSubscription.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StandardsSubscription {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StandardsSubscription.__pulumiType;
    }

    /**
     * The ARN of a standard - see below.
     *
     * Currently available standards (remember to replace `${var.region}` as appropriate):
     *
     * | Name                                     | ARN                                                                                             |
     * |------------------------------------------|-------------------------------------------------------------------------------------------------|
     * | AWS Foundational Security Best Practices | `arn:aws:securityhub:${var.region}::standards/aws-foundational-security-best-practices/v/1.0.0` |
     * | CIS AWS Foundations Benchmark v1.2.0     | `arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0`                           |
     * | CIS AWS Foundations Benchmark v1.4.0     | `arn:aws:securityhub:${var.region}::standards/cis-aws-foundations-benchmark/v/1.4.0`            |
     * | NIST SP 800-53 Rev. 5                    | `arn:aws:securityhub:${var.region}::standards/nist-800-53/v/5.0.0`                              |
     * | PCI DSS                                  | `arn:aws:securityhub:${var.region}::standards/pci-dss/v/3.2.1`                                  |
     */
    public readonly standardsArn!: pulumi.Output<string>;

    /**
     * Create a StandardsSubscription resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StandardsSubscriptionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StandardsSubscriptionArgs | StandardsSubscriptionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StandardsSubscriptionState | undefined;
            resourceInputs["standardsArn"] = state ? state.standardsArn : undefined;
        } else {
            const args = argsOrState as StandardsSubscriptionArgs | undefined;
            if ((!args || args.standardsArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'standardsArn'");
            }
            resourceInputs["standardsArn"] = args ? args.standardsArn : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StandardsSubscription.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StandardsSubscription resources.
 */
export interface StandardsSubscriptionState {
    /**
     * The ARN of a standard - see below.
     *
     * Currently available standards (remember to replace `${var.region}` as appropriate):
     *
     * | Name                                     | ARN                                                                                             |
     * |------------------------------------------|-------------------------------------------------------------------------------------------------|
     * | AWS Foundational Security Best Practices | `arn:aws:securityhub:${var.region}::standards/aws-foundational-security-best-practices/v/1.0.0` |
     * | CIS AWS Foundations Benchmark v1.2.0     | `arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0`                           |
     * | CIS AWS Foundations Benchmark v1.4.0     | `arn:aws:securityhub:${var.region}::standards/cis-aws-foundations-benchmark/v/1.4.0`            |
     * | NIST SP 800-53 Rev. 5                    | `arn:aws:securityhub:${var.region}::standards/nist-800-53/v/5.0.0`                              |
     * | PCI DSS                                  | `arn:aws:securityhub:${var.region}::standards/pci-dss/v/3.2.1`                                  |
     */
    standardsArn?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StandardsSubscription resource.
 */
export interface StandardsSubscriptionArgs {
    /**
     * The ARN of a standard - see below.
     *
     * Currently available standards (remember to replace `${var.region}` as appropriate):
     *
     * | Name                                     | ARN                                                                                             |
     * |------------------------------------------|-------------------------------------------------------------------------------------------------|
     * | AWS Foundational Security Best Practices | `arn:aws:securityhub:${var.region}::standards/aws-foundational-security-best-practices/v/1.0.0` |
     * | CIS AWS Foundations Benchmark v1.2.0     | `arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0`                           |
     * | CIS AWS Foundations Benchmark v1.4.0     | `arn:aws:securityhub:${var.region}::standards/cis-aws-foundations-benchmark/v/1.4.0`            |
     * | NIST SP 800-53 Rev. 5                    | `arn:aws:securityhub:${var.region}::standards/nist-800-53/v/5.0.0`                              |
     * | PCI DSS                                  | `arn:aws:securityhub:${var.region}::standards/pci-dss/v/3.2.1`                                  |
     */
    standardsArn: pulumi.Input<string>;
}
