// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an SNS data protection topic policy resource
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleTopic = new aws.sns.Topic("exampleTopic", {});
 * const exampleDataProtectionPolicy = new aws.sns.DataProtectionPolicy("exampleDataProtectionPolicy", {
 *     arn: exampleTopic.arn,
 *     policy: JSON.stringify({
 *         Description: "Example data protection policy",
 *         Name: "__example_data_protection_policy",
 *         Statement: [{
 *             DataDirection: "Inbound",
 *             DataIdentifier: ["arn:aws:dataprotection::aws:data-identifier/EmailAddress"],
 *             Operation: {
 *                 Deny: {},
 *             },
 *             Principal: ["*"],
 *             Sid: "__deny_statement_11ba9d96",
 *         }],
 *         Version: "2021-06-01",
 *     }),
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import SNS Data Protection Topic Policy using the topic ARN. For example:
 *
 * ```sh
 *  $ pulumi import aws:sns/dataProtectionPolicy:DataProtectionPolicy example arn:aws:sns:us-west-2:0123456789012:example
 * ```
 */
export class DataProtectionPolicy extends pulumi.CustomResource {
    /**
     * Get an existing DataProtectionPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DataProtectionPolicyState, opts?: pulumi.CustomResourceOptions): DataProtectionPolicy {
        return new DataProtectionPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:sns/dataProtectionPolicy:DataProtectionPolicy';

    /**
     * Returns true if the given object is an instance of DataProtectionPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DataProtectionPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DataProtectionPolicy.__pulumiType;
    }

    /**
     * The ARN of the SNS topic
     */
    public readonly arn!: pulumi.Output<string>;
    /**
     * The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
     */
    public readonly policy!: pulumi.Output<string>;

    /**
     * Create a DataProtectionPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DataProtectionPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DataProtectionPolicyArgs | DataProtectionPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DataProtectionPolicyState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["policy"] = state ? state.policy : undefined;
        } else {
            const args = argsOrState as DataProtectionPolicyArgs | undefined;
            if ((!args || args.arn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'arn'");
            }
            if ((!args || args.policy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policy'");
            }
            resourceInputs["arn"] = args ? args.arn : undefined;
            resourceInputs["policy"] = args ? args.policy : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DataProtectionPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DataProtectionPolicy resources.
 */
export interface DataProtectionPolicyState {
    /**
     * The ARN of the SNS topic
     */
    arn?: pulumi.Input<string>;
    /**
     * The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
     */
    policy?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DataProtectionPolicy resource.
 */
export interface DataProtectionPolicyArgs {
    /**
     * The ARN of the SNS topic
     */
    arn: pulumi.Input<string>;
    /**
     * The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
     */
    policy: pulumi.Input<string>;
}
