// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages the specified alternate contact attached to an AWS Account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const operations = new aws.account.AlternativeContact("operations", {
 *     alternateContactType: "OPERATIONS",
 *     emailAddress: "test@example.com",
 *     phoneNumber: "+1234567890",
 *     title: "Example",
 * });
 * ```
 *
 * ## Import
 *
 * The Alternate Contact for the current account can be imported using the `alternate_contact_type`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:account/alternativeContact:AlternativeContact operations OPERATIONS
 * ```
 *
 *  If you provide an account ID, the Alternate Contact can be imported using the `account_id` and `alternate_contact_type` separated by a forward slash (`/`) e.g.,
 *
 * ```sh
 *  $ pulumi import aws:account/alternativeContact:AlternativeContact operations 1234567890/OPERATIONS
 * ```
 */
export class AlternativeContact extends pulumi.CustomResource {
    /**
     * Get an existing AlternativeContact resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlternativeContactState, opts?: pulumi.CustomResourceOptions): AlternativeContact {
        return new AlternativeContact(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:account/alternativeContact:AlternativeContact';

    /**
     * Returns true if the given object is an instance of AlternativeContact.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AlternativeContact {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AlternativeContact.__pulumiType;
    }

    /**
     * The ID of the target account when managing member accounts. Will manage current user's account by default if omitted.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * The type of the alternate contact. Allowed values are: `BILLING`, `OPERATIONS`, `SECURITY`.
     */
    public readonly alternateContactType!: pulumi.Output<string>;
    /**
     * An email address for the alternate contact.
     */
    public readonly emailAddress!: pulumi.Output<string>;
    /**
     * The name of the alternate contact.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A phone number for the alternate contact.
     */
    public readonly phoneNumber!: pulumi.Output<string>;
    /**
     * A title for the alternate contact.
     */
    public readonly title!: pulumi.Output<string>;

    /**
     * Create a AlternativeContact resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlternativeContactArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlternativeContactArgs | AlternativeContactState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AlternativeContactState | undefined;
            inputs["accountId"] = state ? state.accountId : undefined;
            inputs["alternateContactType"] = state ? state.alternateContactType : undefined;
            inputs["emailAddress"] = state ? state.emailAddress : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["phoneNumber"] = state ? state.phoneNumber : undefined;
            inputs["title"] = state ? state.title : undefined;
        } else {
            const args = argsOrState as AlternativeContactArgs | undefined;
            if ((!args || args.alternateContactType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'alternateContactType'");
            }
            if ((!args || args.emailAddress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'emailAddress'");
            }
            if ((!args || args.phoneNumber === undefined) && !opts.urn) {
                throw new Error("Missing required property 'phoneNumber'");
            }
            if ((!args || args.title === undefined) && !opts.urn) {
                throw new Error("Missing required property 'title'");
            }
            inputs["accountId"] = args ? args.accountId : undefined;
            inputs["alternateContactType"] = args ? args.alternateContactType : undefined;
            inputs["emailAddress"] = args ? args.emailAddress : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["phoneNumber"] = args ? args.phoneNumber : undefined;
            inputs["title"] = args ? args.title : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AlternativeContact.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlternativeContact resources.
 */
export interface AlternativeContactState {
    /**
     * The ID of the target account when managing member accounts. Will manage current user's account by default if omitted.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The type of the alternate contact. Allowed values are: `BILLING`, `OPERATIONS`, `SECURITY`.
     */
    alternateContactType?: pulumi.Input<string>;
    /**
     * An email address for the alternate contact.
     */
    emailAddress?: pulumi.Input<string>;
    /**
     * The name of the alternate contact.
     */
    name?: pulumi.Input<string>;
    /**
     * A phone number for the alternate contact.
     */
    phoneNumber?: pulumi.Input<string>;
    /**
     * A title for the alternate contact.
     */
    title?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AlternativeContact resource.
 */
export interface AlternativeContactArgs {
    /**
     * The ID of the target account when managing member accounts. Will manage current user's account by default if omitted.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The type of the alternate contact. Allowed values are: `BILLING`, `OPERATIONS`, `SECURITY`.
     */
    alternateContactType: pulumi.Input<string>;
    /**
     * An email address for the alternate contact.
     */
    emailAddress: pulumi.Input<string>;
    /**
     * The name of the alternate contact.
     */
    name?: pulumi.Input<string>;
    /**
     * A phone number for the alternate contact.
     */
    phoneNumber: pulumi.Input<string>;
    /**
     * A title for the alternate contact.
     */
    title: pulumi.Input<string>;
}
