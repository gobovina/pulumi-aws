// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a resource to attach an AWS Organizations policy to an organization account, root, or unit.
 *
 * ## Example Usage
 * ### Organization Account
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const account = new aws.organizations.PolicyAttachment("account", {
 *     policyId: example.id,
 *     targetId: "123456789012",
 * });
 * ```
 * ### Organization Root
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const root = new aws.organizations.PolicyAttachment("root", {
 *     policyId: example.id,
 *     targetId: exampleAwsOrganizationsOrganization.roots[0].id,
 * });
 * ```
 * ### Organization Unit
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const unit = new aws.organizations.PolicyAttachment("unit", {
 *     policyId: example.id,
 *     targetId: exampleAwsOrganizationsOrganizationalUnit.id,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_organizations_policy_attachment` using the target ID and policy ID. For example:
 *
 * With an account target:
 *
 * ```sh
 *  $ pulumi import aws:organizations/policyAttachment:PolicyAttachment account 123456789012:p-12345678
 * ```
 */
export class PolicyAttachment extends pulumi.CustomResource {
    /**
     * Get an existing PolicyAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PolicyAttachmentState, opts?: pulumi.CustomResourceOptions): PolicyAttachment {
        return new PolicyAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:organizations/policyAttachment:PolicyAttachment';

    /**
     * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PolicyAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PolicyAttachment.__pulumiType;
    }

    /**
     * The unique identifier (ID) of the policy that you want to attach to the target.
     */
    public readonly policyId!: pulumi.Output<string>;
    /**
     * If set to `true`, destroy will **not** detach the policy and instead just remove the resource from state. This can be useful in situations where the attachment must be preserved to meet the AWS minimum requirement of 1 attached policy.
     */
    public readonly skipDestroy!: pulumi.Output<boolean | undefined>;
    /**
     * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
     */
    public readonly targetId!: pulumi.Output<string>;

    /**
     * Create a PolicyAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PolicyAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PolicyAttachmentArgs | PolicyAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PolicyAttachmentState | undefined;
            resourceInputs["policyId"] = state ? state.policyId : undefined;
            resourceInputs["skipDestroy"] = state ? state.skipDestroy : undefined;
            resourceInputs["targetId"] = state ? state.targetId : undefined;
        } else {
            const args = argsOrState as PolicyAttachmentArgs | undefined;
            if ((!args || args.policyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyId'");
            }
            if ((!args || args.targetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetId'");
            }
            resourceInputs["policyId"] = args ? args.policyId : undefined;
            resourceInputs["skipDestroy"] = args ? args.skipDestroy : undefined;
            resourceInputs["targetId"] = args ? args.targetId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PolicyAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PolicyAttachment resources.
 */
export interface PolicyAttachmentState {
    /**
     * The unique identifier (ID) of the policy that you want to attach to the target.
     */
    policyId?: pulumi.Input<string>;
    /**
     * If set to `true`, destroy will **not** detach the policy and instead just remove the resource from state. This can be useful in situations where the attachment must be preserved to meet the AWS minimum requirement of 1 attached policy.
     */
    skipDestroy?: pulumi.Input<boolean>;
    /**
     * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
     */
    targetId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PolicyAttachment resource.
 */
export interface PolicyAttachmentArgs {
    /**
     * The unique identifier (ID) of the policy that you want to attach to the target.
     */
    policyId: pulumi.Input<string>;
    /**
     * If set to `true`, destroy will **not** detach the policy and instead just remove the resource from state. This can be useful in situations where the attachment must be preserved to meet the AWS minimum requirement of 1 attached policy.
     */
    skipDestroy?: pulumi.Input<boolean>;
    /**
     * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
     */
    targetId: pulumi.Input<string>;
}
