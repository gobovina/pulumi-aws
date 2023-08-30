// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a customer managed policy attachment for a Single Sign-On (SSO) Permission Set resource
 *
 * > **NOTE:** Creating this resource will automatically [Provision the Permission Set](https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ProvisionPermissionSet.html) to apply the corresponding updates to all assigned accounts.
 *
 * ## Import
 *
 * Using `pulumi import`, import SSO Managed Policy Attachments using the `name`, `path`, `permission_set_arn`, and `instance_arn` separated by a comma (`,`). For example:
 *
 * ```sh
 *  $ pulumi import aws:ssoadmin/customerManagedPolicyAttachment:CustomerManagedPolicyAttachment example TestPolicy,/,arn:aws:sso:::permissionSet/ssoins-2938j0x8920sbj72/ps-80383020jr9302rk,arn:aws:sso:::instance/ssoins-2938j0x8920sbj72
 * ```
 */
export class CustomerManagedPolicyAttachment extends pulumi.CustomResource {
    /**
     * Get an existing CustomerManagedPolicyAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomerManagedPolicyAttachmentState, opts?: pulumi.CustomResourceOptions): CustomerManagedPolicyAttachment {
        return new CustomerManagedPolicyAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ssoadmin/customerManagedPolicyAttachment:CustomerManagedPolicyAttachment';

    /**
     * Returns true if the given object is an instance of CustomerManagedPolicyAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomerManagedPolicyAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomerManagedPolicyAttachment.__pulumiType;
    }

    /**
     * Specifies the name and path of a customer managed policy. See below.
     */
    public readonly customerManagedPolicyReference!: pulumi.Output<outputs.ssoadmin.CustomerManagedPolicyAttachmentCustomerManagedPolicyReference>;
    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     */
    public readonly instanceArn!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     */
    public readonly permissionSetArn!: pulumi.Output<string>;

    /**
     * Create a CustomerManagedPolicyAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomerManagedPolicyAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomerManagedPolicyAttachmentArgs | CustomerManagedPolicyAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomerManagedPolicyAttachmentState | undefined;
            resourceInputs["customerManagedPolicyReference"] = state ? state.customerManagedPolicyReference : undefined;
            resourceInputs["instanceArn"] = state ? state.instanceArn : undefined;
            resourceInputs["permissionSetArn"] = state ? state.permissionSetArn : undefined;
        } else {
            const args = argsOrState as CustomerManagedPolicyAttachmentArgs | undefined;
            if ((!args || args.customerManagedPolicyReference === undefined) && !opts.urn) {
                throw new Error("Missing required property 'customerManagedPolicyReference'");
            }
            if ((!args || args.instanceArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceArn'");
            }
            if ((!args || args.permissionSetArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'permissionSetArn'");
            }
            resourceInputs["customerManagedPolicyReference"] = args ? args.customerManagedPolicyReference : undefined;
            resourceInputs["instanceArn"] = args ? args.instanceArn : undefined;
            resourceInputs["permissionSetArn"] = args ? args.permissionSetArn : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CustomerManagedPolicyAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomerManagedPolicyAttachment resources.
 */
export interface CustomerManagedPolicyAttachmentState {
    /**
     * Specifies the name and path of a customer managed policy. See below.
     */
    customerManagedPolicyReference?: pulumi.Input<inputs.ssoadmin.CustomerManagedPolicyAttachmentCustomerManagedPolicyReference>;
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
 * The set of arguments for constructing a CustomerManagedPolicyAttachment resource.
 */
export interface CustomerManagedPolicyAttachmentArgs {
    /**
     * Specifies the name and path of a customer managed policy. See below.
     */
    customerManagedPolicyReference: pulumi.Input<inputs.ssoadmin.CustomerManagedPolicyAttachmentCustomerManagedPolicyReference>;
    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     */
    instanceArn: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     */
    permissionSetArn: pulumi.Input<string>;
}
