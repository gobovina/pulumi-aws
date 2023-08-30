// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

import {ARN} from "..";
import {User} from "./index";

/**
 * Attaches a Managed IAM Policy to an IAM user
 *
 * > **NOTE:** The usage of this resource conflicts with the `aws.iam.PolicyAttachment` resource and will permanently show a difference if both are defined.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const user = new aws.iam.User("user", {});
 * const policy = new aws.iam.Policy("policy", {
 *     description: "A test policy",
 *     policy: "{ ... policy JSON ... }",
 * });
 * const test_attach = new aws.iam.UserPolicyAttachment("test-attach", {
 *     user: user.name,
 *     policyArn: policy.arn,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import IAM user policy attachments using the user name and policy arn separated by `/`. For example:
 *
 * ```sh
 *  $ pulumi import aws:iam/userPolicyAttachment:UserPolicyAttachment test-attach test-user/arn:aws:iam::xxxxxxxxxxxx:policy/test-policy
 * ```
 */
export class UserPolicyAttachment extends pulumi.CustomResource {
    /**
     * Get an existing UserPolicyAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserPolicyAttachmentState, opts?: pulumi.CustomResourceOptions): UserPolicyAttachment {
        return new UserPolicyAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:iam/userPolicyAttachment:UserPolicyAttachment';

    /**
     * Returns true if the given object is an instance of UserPolicyAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserPolicyAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserPolicyAttachment.__pulumiType;
    }

    /**
     * The ARN of the policy you want to apply
     */
    public readonly policyArn!: pulumi.Output<ARN>;
    /**
     * The user the policy should be applied to
     */
    public readonly user!: pulumi.Output<string>;

    /**
     * Create a UserPolicyAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserPolicyAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserPolicyAttachmentArgs | UserPolicyAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserPolicyAttachmentState | undefined;
            resourceInputs["policyArn"] = state ? state.policyArn : undefined;
            resourceInputs["user"] = state ? state.user : undefined;
        } else {
            const args = argsOrState as UserPolicyAttachmentArgs | undefined;
            if ((!args || args.policyArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyArn'");
            }
            if ((!args || args.user === undefined) && !opts.urn) {
                throw new Error("Missing required property 'user'");
            }
            resourceInputs["policyArn"] = args ? args.policyArn : undefined;
            resourceInputs["user"] = args ? args.user : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UserPolicyAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserPolicyAttachment resources.
 */
export interface UserPolicyAttachmentState {
    /**
     * The ARN of the policy you want to apply
     */
    policyArn?: pulumi.Input<ARN>;
    /**
     * The user the policy should be applied to
     */
    user?: pulumi.Input<string | User>;
}

/**
 * The set of arguments for constructing a UserPolicyAttachment resource.
 */
export interface UserPolicyAttachmentArgs {
    /**
     * The ARN of the policy you want to apply
     */
    policyArn: pulumi.Input<ARN>;
    /**
     * The user the policy should be applied to
     */
    user: pulumi.Input<string | User>;
}
