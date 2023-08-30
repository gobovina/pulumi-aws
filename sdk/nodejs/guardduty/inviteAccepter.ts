// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a resource to accept a pending GuardDuty invite on creation, ensure the detector has the correct primary account on read, and disassociate with the primary account upon removal.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const primary = new aws.Provider("primary", {});
 * const member = new aws.Provider("member", {});
 * const primaryDetector = new aws.guardduty.Detector("primaryDetector", {}, {
 *     provider: aws.primary,
 * });
 * const memberDetector = new aws.guardduty.Detector("memberDetector", {}, {
 *     provider: aws.member,
 * });
 * const memberMember = new aws.guardduty.Member("memberMember", {
 *     accountId: memberDetector.accountId,
 *     detectorId: primaryDetector.id,
 *     email: "required@example.com",
 *     invite: true,
 * }, {
 *     provider: aws.primary,
 * });
 * const memberInviteAccepter = new aws.guardduty.InviteAccepter("memberInviteAccepter", {
 *     detectorId: memberDetector.id,
 *     masterAccountId: primaryDetector.accountId,
 * }, {
 *     provider: aws.member,
 *     dependsOn: [memberMember],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_guardduty_invite_accepter` using the member GuardDuty detector ID. For example:
 *
 * ```sh
 *  $ pulumi import aws:guardduty/inviteAccepter:InviteAccepter member 00b00fd5aecc0ab60a708659477e9617
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
    public static readonly __pulumiType = 'aws:guardduty/inviteAccepter:InviteAccepter';

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
     * The detector ID of the member GuardDuty account.
     */
    public readonly detectorId!: pulumi.Output<string>;
    /**
     * AWS account ID for primary account.
     */
    public readonly masterAccountId!: pulumi.Output<string>;

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
            resourceInputs["detectorId"] = state ? state.detectorId : undefined;
            resourceInputs["masterAccountId"] = state ? state.masterAccountId : undefined;
        } else {
            const args = argsOrState as InviteAccepterArgs | undefined;
            if ((!args || args.detectorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'detectorId'");
            }
            if ((!args || args.masterAccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'masterAccountId'");
            }
            resourceInputs["detectorId"] = args ? args.detectorId : undefined;
            resourceInputs["masterAccountId"] = args ? args.masterAccountId : undefined;
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
     * The detector ID of the member GuardDuty account.
     */
    detectorId?: pulumi.Input<string>;
    /**
     * AWS account ID for primary account.
     */
    masterAccountId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InviteAccepter resource.
 */
export interface InviteAccepterArgs {
    /**
     * The detector ID of the member GuardDuty account.
     */
    detectorId: pulumi.Input<string>;
    /**
     * AWS account ID for primary account.
     */
    masterAccountId: pulumi.Input<string>;
}
