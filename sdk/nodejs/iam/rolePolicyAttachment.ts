// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

import {ARN} from "..";
import {Role} from "./index";

/**
 * Attaches a Managed IAM Policy to an IAM role
 *
 * > **NOTE:** The usage of this resource conflicts with the `aws.iam.PolicyAttachment` resource and will permanently show a difference if both are defined.
 *
 * > **NOTE:** For a given role, this resource is incompatible with using the `aws.iam.Role` resource `managedPolicyArns` argument. When using that argument and this resource, both will attempt to manage the role's managed policy attachments and Pulumi will show a permanent difference.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const assumeRole = aws.iam.getPolicyDocument({
 *     statements: [{
 *         effect: "Allow",
 *         principals: [{
 *             type: "Service",
 *             identifiers: ["ec2.amazonaws.com"],
 *         }],
 *         actions: ["sts:AssumeRole"],
 *     }],
 * });
 * const role = new aws.iam.Role("role", {
 *     name: "test-role",
 *     assumeRolePolicy: assumeRole.then(assumeRole => assumeRole.json),
 * });
 * const policy = aws.iam.getPolicyDocument({
 *     statements: [{
 *         effect: "Allow",
 *         actions: ["ec2:Describe*"],
 *         resources: ["*"],
 *     }],
 * });
 * const policyPolicy = new aws.iam.Policy("policy", {
 *     name: "test-policy",
 *     description: "A test policy",
 *     policy: policy.then(policy => policy.json),
 * });
 * const test_attach = new aws.iam.RolePolicyAttachment("test-attach", {
 *     role: role.name,
 *     policyArn: policyPolicy.arn,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import IAM role policy attachments using the role name and policy arn separated by `/`. For example:
 *
 * ```sh
 * $ pulumi import aws:iam/rolePolicyAttachment:RolePolicyAttachment test-attach test-role/arn:aws:iam::xxxxxxxxxxxx:policy/test-policy
 * ```
 */
export class RolePolicyAttachment extends pulumi.CustomResource {
    /**
     * Get an existing RolePolicyAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RolePolicyAttachmentState, opts?: pulumi.CustomResourceOptions): RolePolicyAttachment {
        return new RolePolicyAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:iam/rolePolicyAttachment:RolePolicyAttachment';

    /**
     * Returns true if the given object is an instance of RolePolicyAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RolePolicyAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RolePolicyAttachment.__pulumiType;
    }

    /**
     * The ARN of the policy you want to apply
     */
    public readonly policyArn!: pulumi.Output<ARN>;
    /**
     * The name of the IAM role to which the policy should be applied
     */
    public readonly role!: pulumi.Output<string>;

    /**
     * Create a RolePolicyAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RolePolicyAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RolePolicyAttachmentArgs | RolePolicyAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RolePolicyAttachmentState | undefined;
            resourceInputs["policyArn"] = state ? state.policyArn : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
        } else {
            const args = argsOrState as RolePolicyAttachmentArgs | undefined;
            if ((!args || args.policyArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyArn'");
            }
            if ((!args || args.role === undefined) && !opts.urn) {
                throw new Error("Missing required property 'role'");
            }
            resourceInputs["policyArn"] = args ? args.policyArn : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RolePolicyAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RolePolicyAttachment resources.
 */
export interface RolePolicyAttachmentState {
    /**
     * The ARN of the policy you want to apply
     */
    policyArn?: pulumi.Input<ARN>;
    /**
     * The name of the IAM role to which the policy should be applied
     */
    role?: pulumi.Input<string | Role>;
}

/**
 * The set of arguments for constructing a RolePolicyAttachment resource.
 */
export interface RolePolicyAttachmentArgs {
    /**
     * The ARN of the policy you want to apply
     */
    policyArn: pulumi.Input<ARN>;
    /**
     * The name of the IAM role to which the policy should be applied
     */
    role: pulumi.Input<string | Role>;
}
