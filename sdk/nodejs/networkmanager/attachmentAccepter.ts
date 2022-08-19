// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.networkmanager.AttachmentAccepter("test", {
 *     attachmentId: aws_networkmanager_vpc_attachment.vpc.id,
 *     attachmentType: aws_networkmanager_vpc_attachment.vpc.attachment_type,
 * });
 * ```
 */
export class AttachmentAccepter extends pulumi.CustomResource {
    /**
     * Get an existing AttachmentAccepter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AttachmentAccepterState, opts?: pulumi.CustomResourceOptions): AttachmentAccepter {
        return new AttachmentAccepter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:networkmanager/attachmentAccepter:AttachmentAccepter';

    /**
     * Returns true if the given object is an instance of AttachmentAccepter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AttachmentAccepter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AttachmentAccepter.__pulumiType;
    }

    /**
     * The ID of the attachment.
     */
    public readonly attachmentId!: pulumi.Output<string>;
    /**
     * The policy rule number associated with the attachment.
     */
    public /*out*/ readonly attachmentPolicyRuleNumber!: pulumi.Output<number>;
    /**
     * The type of attachment. Valid values can be found in the [AWS Documentation](https://docs.aws.amazon.com/networkmanager/latest/APIReference/API_ListAttachments.html#API_ListAttachments_RequestSyntax)
     */
    public readonly attachmentType!: pulumi.Output<string>;
    /**
     * The ARN of a core network.
     */
    public /*out*/ readonly coreNetworkArn!: pulumi.Output<string>;
    /**
     * The id of a core network.
     */
    public /*out*/ readonly coreNetworkId!: pulumi.Output<string>;
    /**
     * The Region where the edge is located.
     */
    public /*out*/ readonly edgeLocation!: pulumi.Output<string>;
    /**
     * The ID of the attachment account owner.
     */
    public /*out*/ readonly ownerAccountId!: pulumi.Output<string>;
    /**
     * The attachment resource ARN.
     */
    public /*out*/ readonly resourceArn!: pulumi.Output<string>;
    /**
     * The name of the segment attachment.
     */
    public /*out*/ readonly segmentName!: pulumi.Output<string>;
    /**
     * The state of the attachment.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;

    /**
     * Create a AttachmentAccepter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AttachmentAccepterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AttachmentAccepterArgs | AttachmentAccepterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AttachmentAccepterState | undefined;
            resourceInputs["attachmentId"] = state ? state.attachmentId : undefined;
            resourceInputs["attachmentPolicyRuleNumber"] = state ? state.attachmentPolicyRuleNumber : undefined;
            resourceInputs["attachmentType"] = state ? state.attachmentType : undefined;
            resourceInputs["coreNetworkArn"] = state ? state.coreNetworkArn : undefined;
            resourceInputs["coreNetworkId"] = state ? state.coreNetworkId : undefined;
            resourceInputs["edgeLocation"] = state ? state.edgeLocation : undefined;
            resourceInputs["ownerAccountId"] = state ? state.ownerAccountId : undefined;
            resourceInputs["resourceArn"] = state ? state.resourceArn : undefined;
            resourceInputs["segmentName"] = state ? state.segmentName : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
        } else {
            const args = argsOrState as AttachmentAccepterArgs | undefined;
            if ((!args || args.attachmentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'attachmentId'");
            }
            if ((!args || args.attachmentType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'attachmentType'");
            }
            resourceInputs["attachmentId"] = args ? args.attachmentId : undefined;
            resourceInputs["attachmentType"] = args ? args.attachmentType : undefined;
            resourceInputs["attachmentPolicyRuleNumber"] = undefined /*out*/;
            resourceInputs["coreNetworkArn"] = undefined /*out*/;
            resourceInputs["coreNetworkId"] = undefined /*out*/;
            resourceInputs["edgeLocation"] = undefined /*out*/;
            resourceInputs["ownerAccountId"] = undefined /*out*/;
            resourceInputs["resourceArn"] = undefined /*out*/;
            resourceInputs["segmentName"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AttachmentAccepter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AttachmentAccepter resources.
 */
export interface AttachmentAccepterState {
    /**
     * The ID of the attachment.
     */
    attachmentId?: pulumi.Input<string>;
    /**
     * The policy rule number associated with the attachment.
     */
    attachmentPolicyRuleNumber?: pulumi.Input<number>;
    /**
     * The type of attachment. Valid values can be found in the [AWS Documentation](https://docs.aws.amazon.com/networkmanager/latest/APIReference/API_ListAttachments.html#API_ListAttachments_RequestSyntax)
     */
    attachmentType?: pulumi.Input<string>;
    /**
     * The ARN of a core network.
     */
    coreNetworkArn?: pulumi.Input<string>;
    /**
     * The id of a core network.
     */
    coreNetworkId?: pulumi.Input<string>;
    /**
     * The Region where the edge is located.
     */
    edgeLocation?: pulumi.Input<string>;
    /**
     * The ID of the attachment account owner.
     */
    ownerAccountId?: pulumi.Input<string>;
    /**
     * The attachment resource ARN.
     */
    resourceArn?: pulumi.Input<string>;
    /**
     * The name of the segment attachment.
     */
    segmentName?: pulumi.Input<string>;
    /**
     * The state of the attachment.
     */
    state?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AttachmentAccepter resource.
 */
export interface AttachmentAccepterArgs {
    /**
     * The ID of the attachment.
     */
    attachmentId: pulumi.Input<string>;
    /**
     * The type of attachment. Valid values can be found in the [AWS Documentation](https://docs.aws.amazon.com/networkmanager/latest/APIReference/API_ListAttachments.html#API_ListAttachments_RequestSyntax)
     */
    attachmentType: pulumi.Input<string>;
}
