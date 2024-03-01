// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a VPC DHCP Options Association resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const dnsResolver = new aws.ec2.VpcDhcpOptionsAssociation("dns_resolver", {
 *     vpcId: fooAwsVpc.id,
 *     dhcpOptionsId: foo.id,
 * });
 * ```
 * ## Remarks
 *
 * * You can only associate one DHCP Options Set to a given VPC ID.
 * * Removing the DHCP Options Association automatically sets AWS's `default` DHCP Options Set to the VPC.
 *
 * ## Import
 *
 * Using `pulumi import`, import DHCP associations using the VPC ID associated with the options. For example:
 *
 * ```sh
 *  $ pulumi import aws:ec2/vpcDhcpOptionsAssociation:VpcDhcpOptionsAssociation imported vpc-0f001273ec18911b1
 * ```
 */
export class VpcDhcpOptionsAssociation extends pulumi.CustomResource {
    /**
     * Get an existing VpcDhcpOptionsAssociation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VpcDhcpOptionsAssociationState, opts?: pulumi.CustomResourceOptions): VpcDhcpOptionsAssociation {
        return new VpcDhcpOptionsAssociation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/vpcDhcpOptionsAssociation:VpcDhcpOptionsAssociation';

    /**
     * Returns true if the given object is an instance of VpcDhcpOptionsAssociation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VpcDhcpOptionsAssociation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VpcDhcpOptionsAssociation.__pulumiType;
    }

    /**
     * The ID of the DHCP Options Set to associate to the VPC.
     */
    public readonly dhcpOptionsId!: pulumi.Output<string>;
    /**
     * The ID of the VPC to which we would like to associate a DHCP Options Set.
     */
    public readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a VpcDhcpOptionsAssociation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VpcDhcpOptionsAssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VpcDhcpOptionsAssociationArgs | VpcDhcpOptionsAssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VpcDhcpOptionsAssociationState | undefined;
            resourceInputs["dhcpOptionsId"] = state ? state.dhcpOptionsId : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as VpcDhcpOptionsAssociationArgs | undefined;
            if ((!args || args.dhcpOptionsId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dhcpOptionsId'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["dhcpOptionsId"] = args ? args.dhcpOptionsId : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VpcDhcpOptionsAssociation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VpcDhcpOptionsAssociation resources.
 */
export interface VpcDhcpOptionsAssociationState {
    /**
     * The ID of the DHCP Options Set to associate to the VPC.
     */
    dhcpOptionsId?: pulumi.Input<string>;
    /**
     * The ID of the VPC to which we would like to associate a DHCP Options Set.
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VpcDhcpOptionsAssociation resource.
 */
export interface VpcDhcpOptionsAssociationArgs {
    /**
     * The ID of the DHCP Options Set to associate to the VPC.
     */
    dhcpOptionsId: pulumi.Input<string>;
    /**
     * The ID of the VPC to which we would like to associate a DHCP Options Set.
     */
    vpcId: pulumi.Input<string>;
}
