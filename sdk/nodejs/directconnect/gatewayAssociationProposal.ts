// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Direct Connect Gateway Association Proposal, typically for enabling cross-account associations. For single account associations, see the `aws.directconnect.GatewayAssociation` resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.directconnect.GatewayAssociationProposal("example", {
 *     associatedGatewayId: aws_vpn_gateway_example.id,
 *     dxGatewayId: aws_dx_gateway_example.id,
 *     dxGatewayOwnerAccountId: aws_dx_gateway_example.ownerAccountId,
 * });
 * ```
 *
 * A full example of how to create a VPN Gateway in one AWS account, create a Direct Connect Gateway in a second AWS account, and associate the VPN Gateway with the Direct Connect Gateway via the `aws.directconnect.GatewayAssociationProposal` and `aws.directconnect.GatewayAssociation` resources can be found in [the `./examples/dx-gateway-cross-account-vgw-association` directory within the Github Repository](https://github.com/providers/provider-aws/tree/master/examples/dx-gateway-cross-account-vgw-association).
 */
export class GatewayAssociationProposal extends pulumi.CustomResource {
    /**
     * Get an existing GatewayAssociationProposal resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GatewayAssociationProposalState, opts?: pulumi.CustomResourceOptions): GatewayAssociationProposal {
        return new GatewayAssociationProposal(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:directconnect/gatewayAssociationProposal:GatewayAssociationProposal';

    /**
     * Returns true if the given object is an instance of GatewayAssociationProposal.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GatewayAssociationProposal {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GatewayAssociationProposal.__pulumiType;
    }

    /**
     * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
     */
    public readonly allowedPrefixes!: pulumi.Output<string[]>;
    /**
     * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
     */
    public readonly associatedGatewayId!: pulumi.Output<string | undefined>;
    /**
     * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
     */
    public /*out*/ readonly associatedGatewayOwnerAccountId!: pulumi.Output<string>;
    /**
     * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
     */
    public /*out*/ readonly associatedGatewayType!: pulumi.Output<string>;
    /**
     * Direct Connect Gateway identifier.
     */
    public readonly dxGatewayId!: pulumi.Output<string>;
    /**
     * AWS Account identifier of the Direct Connect Gateway's owner.
     */
    public readonly dxGatewayOwnerAccountId!: pulumi.Output<string>;
    /**
     * *Deprecated:* Use `associatedGatewayId` instead. Virtual Gateway identifier to associate with the Direct Connect Gateway.
     *
     * @deprecated use 'associated_gateway_id' argument instead
     */
    public readonly vpnGatewayId!: pulumi.Output<string | undefined>;

    /**
     * Create a GatewayAssociationProposal resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GatewayAssociationProposalArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GatewayAssociationProposalArgs | GatewayAssociationProposalState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as GatewayAssociationProposalState | undefined;
            inputs["allowedPrefixes"] = state ? state.allowedPrefixes : undefined;
            inputs["associatedGatewayId"] = state ? state.associatedGatewayId : undefined;
            inputs["associatedGatewayOwnerAccountId"] = state ? state.associatedGatewayOwnerAccountId : undefined;
            inputs["associatedGatewayType"] = state ? state.associatedGatewayType : undefined;
            inputs["dxGatewayId"] = state ? state.dxGatewayId : undefined;
            inputs["dxGatewayOwnerAccountId"] = state ? state.dxGatewayOwnerAccountId : undefined;
            inputs["vpnGatewayId"] = state ? state.vpnGatewayId : undefined;
        } else {
            const args = argsOrState as GatewayAssociationProposalArgs | undefined;
            if (!args || args.dxGatewayId === undefined) {
                throw new Error("Missing required property 'dxGatewayId'");
            }
            if (!args || args.dxGatewayOwnerAccountId === undefined) {
                throw new Error("Missing required property 'dxGatewayOwnerAccountId'");
            }
            inputs["allowedPrefixes"] = args ? args.allowedPrefixes : undefined;
            inputs["associatedGatewayId"] = args ? args.associatedGatewayId : undefined;
            inputs["dxGatewayId"] = args ? args.dxGatewayId : undefined;
            inputs["dxGatewayOwnerAccountId"] = args ? args.dxGatewayOwnerAccountId : undefined;
            inputs["vpnGatewayId"] = args ? args.vpnGatewayId : undefined;
            inputs["associatedGatewayOwnerAccountId"] = undefined /*out*/;
            inputs["associatedGatewayType"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(GatewayAssociationProposal.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GatewayAssociationProposal resources.
 */
export interface GatewayAssociationProposalState {
    /**
     * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
     */
    readonly allowedPrefixes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
     */
    readonly associatedGatewayId?: pulumi.Input<string>;
    /**
     * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
     */
    readonly associatedGatewayOwnerAccountId?: pulumi.Input<string>;
    /**
     * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
     */
    readonly associatedGatewayType?: pulumi.Input<string>;
    /**
     * Direct Connect Gateway identifier.
     */
    readonly dxGatewayId?: pulumi.Input<string>;
    /**
     * AWS Account identifier of the Direct Connect Gateway's owner.
     */
    readonly dxGatewayOwnerAccountId?: pulumi.Input<string>;
    /**
     * *Deprecated:* Use `associatedGatewayId` instead. Virtual Gateway identifier to associate with the Direct Connect Gateway.
     *
     * @deprecated use 'associated_gateway_id' argument instead
     */
    readonly vpnGatewayId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GatewayAssociationProposal resource.
 */
export interface GatewayAssociationProposalArgs {
    /**
     * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
     */
    readonly allowedPrefixes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
     */
    readonly associatedGatewayId?: pulumi.Input<string>;
    /**
     * Direct Connect Gateway identifier.
     */
    readonly dxGatewayId: pulumi.Input<string>;
    /**
     * AWS Account identifier of the Direct Connect Gateway's owner.
     */
    readonly dxGatewayOwnerAccountId: pulumi.Input<string>;
    /**
     * *Deprecated:* Use `associatedGatewayId` instead. Virtual Gateway identifier to associate with the Direct Connect Gateway.
     *
     * @deprecated use 'associated_gateway_id' argument instead
     */
    readonly vpnGatewayId?: pulumi.Input<string>;
}
