// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS Network Manager ConnectAttachment.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.networkmanager.VpcAttachment("example", {
 *     subnetArns: exampleAwsSubnet.map(__item => __item.arn),
 *     coreNetworkId: exampleAwsccNetworkmanagerCoreNetwork.id,
 *     vpcArn: exampleAwsVpc.arn,
 * });
 * const exampleConnectAttachment = new aws.networkmanager.ConnectAttachment("example", {
 *     coreNetworkId: exampleAwsccNetworkmanagerCoreNetwork.id,
 *     transportAttachmentId: example.id,
 *     edgeLocation: example.edgeLocation,
 *     options: {
 *         protocol: "GRE",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Usage with attachment accepter
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.networkmanager.VpcAttachment("example", {
 *     subnetArns: exampleAwsSubnet.map(__item => __item.arn),
 *     coreNetworkId: exampleAwsccNetworkmanagerCoreNetwork.id,
 *     vpcArn: exampleAwsVpc.arn,
 * });
 * const exampleAttachmentAccepter = new aws.networkmanager.AttachmentAccepter("example", {
 *     attachmentId: example.id,
 *     attachmentType: example.attachmentType,
 * });
 * const exampleConnectAttachment = new aws.networkmanager.ConnectAttachment("example", {
 *     coreNetworkId: exampleAwsccNetworkmanagerCoreNetwork.id,
 *     transportAttachmentId: example.id,
 *     edgeLocation: example.edgeLocation,
 *     options: {
 *         protocol: "GRE",
 *     },
 * });
 * const example2 = new aws.networkmanager.AttachmentAccepter("example2", {
 *     attachmentId: exampleConnectAttachment.id,
 *     attachmentType: exampleConnectAttachment.attachmentType,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_networkmanager_connect_attachment` using the attachment ID. For example:
 *
 * ```sh
 * $ pulumi import aws:networkmanager/connectAttachment:ConnectAttachment example attachment-0f8fa60d2238d1bd8
 * ```
 */
export class ConnectAttachment extends pulumi.CustomResource {
    /**
     * Get an existing ConnectAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectAttachmentState, opts?: pulumi.CustomResourceOptions): ConnectAttachment {
        return new ConnectAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:networkmanager/connectAttachment:ConnectAttachment';

    /**
     * Returns true if the given object is an instance of ConnectAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConnectAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConnectAttachment.__pulumiType;
    }

    /**
     * The ARN of the attachment.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    public /*out*/ readonly attachmentId!: pulumi.Output<string>;
    /**
     * The policy rule number associated with the attachment.
     */
    public /*out*/ readonly attachmentPolicyRuleNumber!: pulumi.Output<number>;
    /**
     * The type of attachment.
     */
    public /*out*/ readonly attachmentType!: pulumi.Output<string>;
    /**
     * The ARN of a core network.
     */
    public /*out*/ readonly coreNetworkArn!: pulumi.Output<string>;
    /**
     * The ID of a core network where you want to create the attachment.
     */
    public readonly coreNetworkId!: pulumi.Output<string>;
    /**
     * The Region where the edge is located.
     */
    public readonly edgeLocation!: pulumi.Output<string>;
    /**
     * Options block. See options for more information.
     *
     * The following arguments are optional:
     */
    public readonly options!: pulumi.Output<outputs.networkmanager.ConnectAttachmentOptions>;
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
     * Key-value tags for the attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The ID of the attachment between the two connections.
     */
    public readonly transportAttachmentId!: pulumi.Output<string>;

    /**
     * Create a ConnectAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectAttachmentArgs | ConnectAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectAttachmentState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["attachmentId"] = state ? state.attachmentId : undefined;
            resourceInputs["attachmentPolicyRuleNumber"] = state ? state.attachmentPolicyRuleNumber : undefined;
            resourceInputs["attachmentType"] = state ? state.attachmentType : undefined;
            resourceInputs["coreNetworkArn"] = state ? state.coreNetworkArn : undefined;
            resourceInputs["coreNetworkId"] = state ? state.coreNetworkId : undefined;
            resourceInputs["edgeLocation"] = state ? state.edgeLocation : undefined;
            resourceInputs["options"] = state ? state.options : undefined;
            resourceInputs["ownerAccountId"] = state ? state.ownerAccountId : undefined;
            resourceInputs["resourceArn"] = state ? state.resourceArn : undefined;
            resourceInputs["segmentName"] = state ? state.segmentName : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["transportAttachmentId"] = state ? state.transportAttachmentId : undefined;
        } else {
            const args = argsOrState as ConnectAttachmentArgs | undefined;
            if ((!args || args.coreNetworkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'coreNetworkId'");
            }
            if ((!args || args.edgeLocation === undefined) && !opts.urn) {
                throw new Error("Missing required property 'edgeLocation'");
            }
            if ((!args || args.options === undefined) && !opts.urn) {
                throw new Error("Missing required property 'options'");
            }
            if ((!args || args.transportAttachmentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transportAttachmentId'");
            }
            resourceInputs["coreNetworkId"] = args ? args.coreNetworkId : undefined;
            resourceInputs["edgeLocation"] = args ? args.edgeLocation : undefined;
            resourceInputs["options"] = args ? args.options : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["transportAttachmentId"] = args ? args.transportAttachmentId : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["attachmentId"] = undefined /*out*/;
            resourceInputs["attachmentPolicyRuleNumber"] = undefined /*out*/;
            resourceInputs["attachmentType"] = undefined /*out*/;
            resourceInputs["coreNetworkArn"] = undefined /*out*/;
            resourceInputs["ownerAccountId"] = undefined /*out*/;
            resourceInputs["resourceArn"] = undefined /*out*/;
            resourceInputs["segmentName"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ConnectAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ConnectAttachment resources.
 */
export interface ConnectAttachmentState {
    /**
     * The ARN of the attachment.
     */
    arn?: pulumi.Input<string>;
    attachmentId?: pulumi.Input<string>;
    /**
     * The policy rule number associated with the attachment.
     */
    attachmentPolicyRuleNumber?: pulumi.Input<number>;
    /**
     * The type of attachment.
     */
    attachmentType?: pulumi.Input<string>;
    /**
     * The ARN of a core network.
     */
    coreNetworkArn?: pulumi.Input<string>;
    /**
     * The ID of a core network where you want to create the attachment.
     */
    coreNetworkId?: pulumi.Input<string>;
    /**
     * The Region where the edge is located.
     */
    edgeLocation?: pulumi.Input<string>;
    /**
     * Options block. See options for more information.
     *
     * The following arguments are optional:
     */
    options?: pulumi.Input<inputs.networkmanager.ConnectAttachmentOptions>;
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
    /**
     * Key-value tags for the attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the attachment between the two connections.
     */
    transportAttachmentId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ConnectAttachment resource.
 */
export interface ConnectAttachmentArgs {
    /**
     * The ID of a core network where you want to create the attachment.
     */
    coreNetworkId: pulumi.Input<string>;
    /**
     * The Region where the edge is located.
     */
    edgeLocation: pulumi.Input<string>;
    /**
     * Options block. See options for more information.
     *
     * The following arguments are optional:
     */
    options: pulumi.Input<inputs.networkmanager.ConnectAttachmentOptions>;
    /**
     * Key-value tags for the attachment. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the attachment between the two connections.
     */
    transportAttachmentId: pulumi.Input<string>;
}
