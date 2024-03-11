// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an IAM inline policy for a Single Sign-On (SSO) Permission Set resource
 *
 * > **NOTE:** AWS Single Sign-On (SSO) only supports one IAM inline policy per `aws.ssoadmin.PermissionSet` resource.
 * Creating or updating this resource will automatically [Provision the Permission Set](https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ProvisionPermissionSet.html) to apply the corresponding updates to all assigned accounts.
 *
 * ## Import
 *
 * Using `pulumi import`, import SSO Permission Set Inline Policies using the `permission_set_arn` and `instance_arn` separated by a comma (`,`). For example:
 *
 * ```sh
 * $ pulumi import aws:ssoadmin/permissionSetInlinePolicy:PermissionSetInlinePolicy example arn:aws:sso:::permissionSet/ssoins-2938j0x8920sbj72/ps-80383020jr9302rk,arn:aws:sso:::instance/ssoins-2938j0x8920sbj72
 * ```
 */
export class PermissionSetInlinePolicy extends pulumi.CustomResource {
    /**
     * Get an existing PermissionSetInlinePolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PermissionSetInlinePolicyState, opts?: pulumi.CustomResourceOptions): PermissionSetInlinePolicy {
        return new PermissionSetInlinePolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ssoadmin/permissionSetInlinePolicy:PermissionSetInlinePolicy';

    /**
     * Returns true if the given object is an instance of PermissionSetInlinePolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PermissionSetInlinePolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PermissionSetInlinePolicy.__pulumiType;
    }

    /**
     * The IAM inline policy to attach to a Permission Set.
     */
    public readonly inlinePolicy!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     */
    public readonly instanceArn!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     */
    public readonly permissionSetArn!: pulumi.Output<string>;

    /**
     * Create a PermissionSetInlinePolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PermissionSetInlinePolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PermissionSetInlinePolicyArgs | PermissionSetInlinePolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PermissionSetInlinePolicyState | undefined;
            resourceInputs["inlinePolicy"] = state ? state.inlinePolicy : undefined;
            resourceInputs["instanceArn"] = state ? state.instanceArn : undefined;
            resourceInputs["permissionSetArn"] = state ? state.permissionSetArn : undefined;
        } else {
            const args = argsOrState as PermissionSetInlinePolicyArgs | undefined;
            if ((!args || args.inlinePolicy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'inlinePolicy'");
            }
            if ((!args || args.instanceArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceArn'");
            }
            if ((!args || args.permissionSetArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'permissionSetArn'");
            }
            resourceInputs["inlinePolicy"] = args ? args.inlinePolicy : undefined;
            resourceInputs["instanceArn"] = args ? args.instanceArn : undefined;
            resourceInputs["permissionSetArn"] = args ? args.permissionSetArn : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PermissionSetInlinePolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PermissionSetInlinePolicy resources.
 */
export interface PermissionSetInlinePolicyState {
    /**
     * The IAM inline policy to attach to a Permission Set.
     */
    inlinePolicy?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     */
    instanceArn?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     */
    permissionSetArn?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PermissionSetInlinePolicy resource.
 */
export interface PermissionSetInlinePolicyArgs {
    /**
     * The IAM inline policy to attach to a Permission Set.
     */
    inlinePolicy: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     */
    instanceArn: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     */
    permissionSetArn: pulumi.Input<string>;
}
