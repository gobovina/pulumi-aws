// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an AWS Network Firewall Resource Policy Resource for a rule group or firewall policy.
 *
 * ## Example Usage
 *
 * ### For a Firewall Policy resource
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.networkfirewall.ResourcePolicy("example", {
 *     resourceArn: exampleAwsNetworkfirewallFirewallPolicy.arn,
 *     policy: JSON.stringify({
 *         statement: [{
 *             action: [
 *                 "network-firewall:ListFirewallPolicies",
 *                 "network-firewall:CreateFirewall",
 *                 "network-firewall:UpdateFirewall",
 *                 "network-firewall:AssociateFirewallPolicy",
 *             ],
 *             effect: "Allow",
 *             resource: exampleAwsNetworkfirewallFirewallPolicy.arn,
 *             principal: {
 *                 AWS: "arn:aws:iam::123456789012:root",
 *             },
 *         }],
 *         version: "2012-10-17",
 *     }),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### For a Rule Group resource
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.networkfirewall.ResourcePolicy("example", {
 *     resourceArn: exampleAwsNetworkfirewallRuleGroup.arn,
 *     policy: JSON.stringify({
 *         statement: [{
 *             action: [
 *                 "network-firewall:ListRuleGroups",
 *                 "network-firewall:CreateFirewallPolicy",
 *                 "network-firewall:UpdateFirewallPolicy",
 *             ],
 *             effect: "Allow",
 *             resource: exampleAwsNetworkfirewallRuleGroup.arn,
 *             principal: {
 *                 AWS: "arn:aws:iam::123456789012:root",
 *             },
 *         }],
 *         version: "2012-10-17",
 *     }),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Network Firewall Resource Policies using the `resource_arn`. For example:
 *
 * <break>```sh<break>
 * $ pulumi import aws:networkfirewall/resourcePolicy:ResourcePolicy example arn:aws:network-firewall:us-west-1:123456789012:stateful-rulegroup/example
 * <break>```<break>
 */
export class ResourcePolicy extends pulumi.CustomResource {
    /**
     * Get an existing ResourcePolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ResourcePolicyState, opts?: pulumi.CustomResourceOptions): ResourcePolicy {
        return new ResourcePolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:networkfirewall/resourcePolicy:ResourcePolicy';

    /**
     * Returns true if the given object is an instance of ResourcePolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ResourcePolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ResourcePolicy.__pulumiType;
    }

    /**
     * JSON formatted policy document that controls access to the Network Firewall resource. The policy must be provided **without whitespaces**.  We recommend using jsonencode for formatting as seen in the examples above. For more details, including available policy statement Actions, see the [Policy](https://docs.aws.amazon.com/network-firewall/latest/APIReference/API_PutResourcePolicy.html#API_PutResourcePolicy_RequestSyntax) parameter in the AWS API documentation.
     */
    public readonly policy!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) of the rule group or firewall policy.
     */
    public readonly resourceArn!: pulumi.Output<string>;

    /**
     * Create a ResourcePolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ResourcePolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ResourcePolicyArgs | ResourcePolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ResourcePolicyState | undefined;
            resourceInputs["policy"] = state ? state.policy : undefined;
            resourceInputs["resourceArn"] = state ? state.resourceArn : undefined;
        } else {
            const args = argsOrState as ResourcePolicyArgs | undefined;
            if ((!args || args.policy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policy'");
            }
            if ((!args || args.resourceArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceArn'");
            }
            resourceInputs["policy"] = args ? args.policy : undefined;
            resourceInputs["resourceArn"] = args ? args.resourceArn : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ResourcePolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ResourcePolicy resources.
 */
export interface ResourcePolicyState {
    /**
     * JSON formatted policy document that controls access to the Network Firewall resource. The policy must be provided **without whitespaces**.  We recommend using jsonencode for formatting as seen in the examples above. For more details, including available policy statement Actions, see the [Policy](https://docs.aws.amazon.com/network-firewall/latest/APIReference/API_PutResourcePolicy.html#API_PutResourcePolicy_RequestSyntax) parameter in the AWS API documentation.
     */
    policy?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the rule group or firewall policy.
     */
    resourceArn?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ResourcePolicy resource.
 */
export interface ResourcePolicyArgs {
    /**
     * JSON formatted policy document that controls access to the Network Firewall resource. The policy must be provided **without whitespaces**.  We recommend using jsonencode for formatting as seen in the examples above. For more details, including available policy statement Actions, see the [Policy](https://docs.aws.amazon.com/network-firewall/latest/APIReference/API_PutResourcePolicy.html#API_PutResourcePolicy_RequestSyntax) parameter in the AWS API documentation.
     */
    policy: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the rule group or firewall policy.
     */
    resourceArn: pulumi.Input<string>;
}
