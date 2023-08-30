// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * > **Note:** AWS accounts can only be associated with a single Security Hub master account. Destroying this resource will disassociate the member account from the master account.
 *
 * Accepts a Security Hub invitation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleAccount = new aws.securityhub.Account("exampleAccount", {});
 * const exampleMember = new aws.securityhub.Member("exampleMember", {
 *     accountId: "123456789012",
 *     email: "example@example.com",
 *     invite: true,
 * });
 * const inviteeAccount = new aws.securityhub.Account("inviteeAccount", {}, {
 *     provider: "aws.invitee",
 * });
 * const inviteeInviteAccepter = new aws.securityhub.InviteAccepter("inviteeInviteAccepter", {masterId: exampleMember.masterId}, {
 *     provider: "aws.invitee",
 *     dependsOn: [inviteeAccount],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Security Hub invite acceptance using the account ID. For example:
 *
 * ```sh
 *  $ pulumi import aws:securityhub/inviteAccepter:InviteAccepter example 123456789012
 * ```
 */
export class InviteAccepter extends pulumi.CustomResource {
    /**
     * Get an existing InviteAccepter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InviteAccepterState, opts?: pulumi.CustomResourceOptions): InviteAccepter {
        return new InviteAccepter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:securityhub/inviteAccepter:InviteAccepter';

    /**
     * Returns true if the given object is an instance of InviteAccepter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InviteAccepter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InviteAccepter.__pulumiType;
    }

    /**
     * The ID of the invitation.
     */
    public /*out*/ readonly invitationId!: pulumi.Output<string>;
    /**
     * The account ID of the master Security Hub account whose invitation you're accepting.
     */
    public readonly masterId!: pulumi.Output<string>;

    /**
     * Create a InviteAccepter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InviteAccepterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InviteAccepterArgs | InviteAccepterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InviteAccepterState | undefined;
            resourceInputs["invitationId"] = state ? state.invitationId : undefined;
            resourceInputs["masterId"] = state ? state.masterId : undefined;
        } else {
            const args = argsOrState as InviteAccepterArgs | undefined;
            if ((!args || args.masterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'masterId'");
            }
            resourceInputs["masterId"] = args ? args.masterId : undefined;
            resourceInputs["invitationId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InviteAccepter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InviteAccepter resources.
 */
export interface InviteAccepterState {
    /**
     * The ID of the invitation.
     */
    invitationId?: pulumi.Input<string>;
    /**
     * The account ID of the master Security Hub account whose invitation you're accepting.
     */
    masterId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InviteAccepter resource.
 */
export interface InviteAccepterArgs {
    /**
     * The account ID of the master Security Hub account whose invitation you're accepting.
     */
    masterId: pulumi.Input<string>;
}
