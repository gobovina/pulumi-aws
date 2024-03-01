// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an EC2 Transit Gateway Route.
 *
 * ## Example Usage
 * ### Standard usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ec2transitgateway.Route("example", {
 *     destinationCidrBlock: "0.0.0.0/0",
 *     transitGatewayAttachmentId: exampleAwsEc2TransitGatewayVpcAttachment.id,
 *     transitGatewayRouteTableId: exampleAwsEc2TransitGateway.associationDefaultRouteTableId,
 * });
 * ```
 * ### Blackhole route
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ec2transitgateway.Route("example", {
 *     destinationCidrBlock: "0.0.0.0/0",
 *     blackhole: true,
 *     transitGatewayRouteTableId: exampleAwsEc2TransitGateway.associationDefaultRouteTableId,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_ec2_transit_gateway_route` using the EC2 Transit Gateway Route Table, an underscore, and the destination. For example:
 *
 * ```sh
 *  $ pulumi import aws:ec2transitgateway/route:Route example tgw-rtb-12345678_0.0.0.0/0
 * ```
 */
export class Route extends pulumi.CustomResource {
    /**
     * Get an existing Route resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouteState, opts?: pulumi.CustomResourceOptions): Route {
        return new Route(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2transitgateway/route:Route';

    /**
     * Returns true if the given object is an instance of Route.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Route {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Route.__pulumiType;
    }

    /**
     * Indicates whether to drop traffic that matches this route (default to `false`).
     */
    public readonly blackhole!: pulumi.Output<boolean | undefined>;
    /**
     * IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
     */
    public readonly destinationCidrBlock!: pulumi.Output<string>;
    /**
     * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
     */
    public readonly transitGatewayAttachmentId!: pulumi.Output<string | undefined>;
    /**
     * Identifier of EC2 Transit Gateway Route Table.
     */
    public readonly transitGatewayRouteTableId!: pulumi.Output<string>;

    /**
     * Create a Route resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouteArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RouteArgs | RouteState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RouteState | undefined;
            resourceInputs["blackhole"] = state ? state.blackhole : undefined;
            resourceInputs["destinationCidrBlock"] = state ? state.destinationCidrBlock : undefined;
            resourceInputs["transitGatewayAttachmentId"] = state ? state.transitGatewayAttachmentId : undefined;
            resourceInputs["transitGatewayRouteTableId"] = state ? state.transitGatewayRouteTableId : undefined;
        } else {
            const args = argsOrState as RouteArgs | undefined;
            if ((!args || args.destinationCidrBlock === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destinationCidrBlock'");
            }
            if ((!args || args.transitGatewayRouteTableId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'transitGatewayRouteTableId'");
            }
            resourceInputs["blackhole"] = args ? args.blackhole : undefined;
            resourceInputs["destinationCidrBlock"] = args ? args.destinationCidrBlock : undefined;
            resourceInputs["transitGatewayAttachmentId"] = args ? args.transitGatewayAttachmentId : undefined;
            resourceInputs["transitGatewayRouteTableId"] = args ? args.transitGatewayRouteTableId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Route.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Route resources.
 */
export interface RouteState {
    /**
     * Indicates whether to drop traffic that matches this route (default to `false`).
     */
    blackhole?: pulumi.Input<boolean>;
    /**
     * IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
     */
    destinationCidrBlock?: pulumi.Input<string>;
    /**
     * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
     */
    transitGatewayAttachmentId?: pulumi.Input<string>;
    /**
     * Identifier of EC2 Transit Gateway Route Table.
     */
    transitGatewayRouteTableId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Route resource.
 */
export interface RouteArgs {
    /**
     * Indicates whether to drop traffic that matches this route (default to `false`).
     */
    blackhole?: pulumi.Input<boolean>;
    /**
     * IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
     */
    destinationCidrBlock: pulumi.Input<string>;
    /**
     * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
     */
    transitGatewayAttachmentId?: pulumi.Input<string>;
    /**
     * Identifier of EC2 Transit Gateway Route Table.
     */
    transitGatewayRouteTableId: pulumi.Input<string>;
}
