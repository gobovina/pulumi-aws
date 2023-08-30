// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an EC2 Transit Gateway Prefix List Reference.
 *
 * ## Example Usage
 * ### Attachment Routing
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ec2transitgateway.PrefixListReference("example", {
 *     prefixListId: aws_ec2_managed_prefix_list.example.id,
 *     transitGatewayAttachmentId: aws_ec2_transit_gateway_vpc_attachment.example.id,
 *     transitGatewayRouteTableId: aws_ec2_transit_gateway.example.association_default_route_table_id,
 * });
 * ```
 * ### Blackhole Routing
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ec2transitgateway.PrefixListReference("example", {
 *     blackhole: true,
 *     prefixListId: aws_ec2_managed_prefix_list.example.id,
 *     transitGatewayRouteTableId: aws_ec2_transit_gateway.example.association_default_route_table_id,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_ec2_transit_gateway_prefix_list_reference` using the EC2 Transit Gateway Route Table identifier and EC2 Prefix List identifier, separated by an underscore (`_`). For example:
 *
 * ```sh
 *  $ pulumi import aws:ec2transitgateway/prefixListReference:PrefixListReference example tgw-rtb-12345678_pl-12345678
 * ```
 */
export class PrefixListReference extends pulumi.CustomResource {
    /**
     * Get an existing PrefixListReference resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PrefixListReferenceState, opts?: pulumi.CustomResourceOptions): PrefixListReference {
        return new PrefixListReference(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2transitgateway/prefixListReference:PrefixListReference';

    /**
     * Returns true if the given object is an instance of PrefixListReference.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PrefixListReference {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PrefixListReference.__pulumiType;
    }

    /**
     * Indicates whether to drop traffic that matches the Prefix List. Defaults to `false`.
     */
    public readonly blackhole!: pulumi.Output<boolean | undefined>;
    /**
     * Identifier of EC2 Prefix List.
     */
    public readonly prefixListId!: pulumi.Output<string>;
    public /*out*/ readonly prefixListOwnerId!: pulumi.Output<string>;
    /**
     * Identifier of EC2 Transit Gateway Attachment.
     */
    public readonly transitGatewayAttachmentId!: pulumi.Output<string | undefined>;
    /**
     * Identifier of EC2 Transit Gateway Route Table.
     *
     * The following arguments are optional:
     */
    public readonly transitGatewayRouteTableId!: pulumi.Output<string>;

    /**
     * Create a PrefixListReference resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PrefixListReferenceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PrefixListReferenceArgs | PrefixListReferenceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PrefixListReferenceState | undefined;
            resourceInputs["blackhole"] = state ? state.blackhole : undefined;
            resourceInputs["prefixListId"] = state ? state.prefixListId : undefined;
            resourceInputs["prefixListOwnerId"] = state ? state.prefixListOwnerId : undefined;
            resourceInputs["transitGatewayAttachmentId"] = state ? state.transitGatewayAttachmentId : undefined;
            resourceInputs["transitGatewayRouteTableId"] = state ? state.transitGatewayRouteTableId : undefined;
        } else {
            const args = argsOrState as PrefixListReferenceArgs | undefined;
            if ((!args || args.prefixListId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'prefixListId'");
            }
            if ((!args || args.transitGatewayRouteTableId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitGatewayRouteTableId'");
            }
            resourceInputs["blackhole"] = args ? args.blackhole : undefined;
            resourceInputs["prefixListId"] = args ? args.prefixListId : undefined;
            resourceInputs["transitGatewayAttachmentId"] = args ? args.transitGatewayAttachmentId : undefined;
            resourceInputs["transitGatewayRouteTableId"] = args ? args.transitGatewayRouteTableId : undefined;
            resourceInputs["prefixListOwnerId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PrefixListReference.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PrefixListReference resources.
 */
export interface PrefixListReferenceState {
    /**
     * Indicates whether to drop traffic that matches the Prefix List. Defaults to `false`.
     */
    blackhole?: pulumi.Input<boolean>;
    /**
     * Identifier of EC2 Prefix List.
     */
    prefixListId?: pulumi.Input<string>;
    prefixListOwnerId?: pulumi.Input<string>;
    /**
     * Identifier of EC2 Transit Gateway Attachment.
     */
    transitGatewayAttachmentId?: pulumi.Input<string>;
    /**
     * Identifier of EC2 Transit Gateway Route Table.
     *
     * The following arguments are optional:
     */
    transitGatewayRouteTableId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PrefixListReference resource.
 */
export interface PrefixListReferenceArgs {
    /**
     * Indicates whether to drop traffic that matches the Prefix List. Defaults to `false`.
     */
    blackhole?: pulumi.Input<boolean>;
    /**
     * Identifier of EC2 Prefix List.
     */
    prefixListId: pulumi.Input<string>;
    /**
     * Identifier of EC2 Transit Gateway Attachment.
     */
    transitGatewayAttachmentId?: pulumi.Input<string>;
    /**
     * Identifier of EC2 Transit Gateway Route Table.
     *
     * The following arguments are optional:
     */
    transitGatewayRouteTableId: pulumi.Input<string>;
}
