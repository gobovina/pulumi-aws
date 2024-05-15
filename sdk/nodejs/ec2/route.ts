// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a resource to create a routing table entry (a route) in a VPC routing table.
 *
 * > **NOTE on Route Tables and Routes:** This provider currently provides both a standalone Route resource and a Route Table resource with routes defined in-line. At this time you cannot use a Route Table with in-line routes in conjunction with any Route resources. Doing so will cause a conflict of rule settings and will overwrite rules.
 *
 * > **NOTE on `gatewayId` attribute:** The AWS API is very forgiving with the resource ID passed in the `gatewayId` attribute. For example an `aws.ec2.Route` resource can be created with an `aws.ec2.NatGateway` or `aws.ec2.EgressOnlyInternetGateway` ID specified for the `gatewayId` attribute. Specifying anything other than an `aws.ec2.InternetGateway` or `aws.ec2.VpnGateway` ID will lead to this provider reporting a permanent diff between your configuration and recorded state, as the AWS API returns the more-specific attribute. If you are experiencing constant diffs with an `aws.ec2.Route` resource, the first thing to check is that the correct attribute is being specified.
 *
 * > **NOTE on combining `vpcEndpointId` and `destinationPrefixListId` attributes:** To associate a Gateway VPC Endpoint (such as S3) with destination prefix list, use the `aws.ec2.VpcEndpointRouteTableAssociation` resource instead.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const r = new aws.ec2.Route("r", {
 *     routeTableId: testing.id,
 *     destinationCidrBlock: "10.0.1.0/22",
 *     vpcPeeringConnectionId: "pcx-45ff3dc1",
 * });
 * ```
 *
 * ## Example IPv6 Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const vpc = new aws.ec2.Vpc("vpc", {
 *     cidrBlock: "10.1.0.0/16",
 *     assignGeneratedIpv6CidrBlock: true,
 * });
 * const egress = new aws.ec2.EgressOnlyInternetGateway("egress", {vpcId: vpc.id});
 * const r = new aws.ec2.Route("r", {
 *     routeTableId: "rtb-4fbb3ac4",
 *     destinationIpv6CidrBlock: "::/0",
 *     egressOnlyGatewayId: egress.id,
 * });
 * ```
 *
 * ## Import
 *
 * Import a route in route table `rtb-656C65616E6F72` with an IPv6 destination CIDR of `2620:0:2d0:200::8/125`:
 *
 * Import a route in route table `rtb-656C65616E6F72` with a managed prefix list destination of `pl-0570a1d2d725c16be`:
 *
 * __Using `pulumi import` to import__ individual routes using `ROUTETABLEID_DESTINATION`. Import [local routes](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html#RouteTables) using the VPC's IPv4 or IPv6 CIDR blocks. For example:
 *
 * Import a route in route table `rtb-656C65616E6F72` with an IPv4 destination CIDR of `10.42.0.0/16`:
 *
 * ```sh
 * $ pulumi import aws:ec2/route:Route my_route rtb-656C65616E6F72_10.42.0.0/16
 * ```
 * Import a route in route table `rtb-656C65616E6F72` with an IPv6 destination CIDR of `2620:0:2d0:200::8/125`:
 *
 * ```sh
 * $ pulumi import aws:ec2/route:Route my_route rtb-656C65616E6F72_2620:0:2d0:200::8/125
 * ```
 * Import a route in route table `rtb-656C65616E6F72` with a managed prefix list destination of `pl-0570a1d2d725c16be`:
 *
 * ```sh
 * $ pulumi import aws:ec2/route:Route my_route rtb-656C65616E6F72_pl-0570a1d2d725c16be
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
    public static readonly __pulumiType = 'aws:ec2/route:Route';

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
     * Identifier of a carrier gateway. This attribute can only be used when the VPC contains a subnet which is associated with a Wavelength Zone.
     */
    public readonly carrierGatewayId!: pulumi.Output<string | undefined>;
    /**
     * The Amazon Resource Name (ARN) of a core network.
     */
    public readonly coreNetworkArn!: pulumi.Output<string | undefined>;
    /**
     * The destination CIDR block.
     */
    public readonly destinationCidrBlock!: pulumi.Output<string | undefined>;
    /**
     * The destination IPv6 CIDR block.
     */
    public readonly destinationIpv6CidrBlock!: pulumi.Output<string | undefined>;
    /**
     * The ID of a managed prefix list destination.
     *
     * One of the following target arguments must be supplied:
     */
    public readonly destinationPrefixListId!: pulumi.Output<string | undefined>;
    /**
     * Identifier of a VPC Egress Only Internet Gateway.
     */
    public readonly egressOnlyGatewayId!: pulumi.Output<string | undefined>;
    /**
     * Identifier of a VPC internet gateway or a virtual private gateway. Specify `local` when updating a previously imported local route.
     */
    public readonly gatewayId!: pulumi.Output<string | undefined>;
    /**
     * Identifier of an EC2 instance.
     */
    public /*out*/ readonly instanceId!: pulumi.Output<string>;
    /**
     * The AWS account ID of the owner of the EC2 instance.
     */
    public /*out*/ readonly instanceOwnerId!: pulumi.Output<string>;
    /**
     * Identifier of a Outpost local gateway.
     */
    public readonly localGatewayId!: pulumi.Output<string | undefined>;
    /**
     * Identifier of a VPC NAT gateway.
     */
    public readonly natGatewayId!: pulumi.Output<string | undefined>;
    /**
     * Identifier of an EC2 network interface.
     */
    public readonly networkInterfaceId!: pulumi.Output<string>;
    /**
     * How the route was created - `CreateRouteTable`, `CreateRoute` or `EnableVgwRoutePropagation`.
     */
    public /*out*/ readonly origin!: pulumi.Output<string>;
    /**
     * The ID of the routing table.
     *
     * One of the following destination arguments must be supplied:
     */
    public readonly routeTableId!: pulumi.Output<string>;
    /**
     * The state of the route - `active` or `blackhole`.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Identifier of an EC2 Transit Gateway.
     */
    public readonly transitGatewayId!: pulumi.Output<string | undefined>;
    /**
     * Identifier of a VPC Endpoint.
     */
    public readonly vpcEndpointId!: pulumi.Output<string | undefined>;
    /**
     * Identifier of a VPC peering connection.
     *
     * Note that the default route, mapping the VPC's CIDR block to "local", is created implicitly and cannot be specified.
     */
    public readonly vpcPeeringConnectionId!: pulumi.Output<string | undefined>;

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
            resourceInputs["carrierGatewayId"] = state ? state.carrierGatewayId : undefined;
            resourceInputs["coreNetworkArn"] = state ? state.coreNetworkArn : undefined;
            resourceInputs["destinationCidrBlock"] = state ? state.destinationCidrBlock : undefined;
            resourceInputs["destinationIpv6CidrBlock"] = state ? state.destinationIpv6CidrBlock : undefined;
            resourceInputs["destinationPrefixListId"] = state ? state.destinationPrefixListId : undefined;
            resourceInputs["egressOnlyGatewayId"] = state ? state.egressOnlyGatewayId : undefined;
            resourceInputs["gatewayId"] = state ? state.gatewayId : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["instanceOwnerId"] = state ? state.instanceOwnerId : undefined;
            resourceInputs["localGatewayId"] = state ? state.localGatewayId : undefined;
            resourceInputs["natGatewayId"] = state ? state.natGatewayId : undefined;
            resourceInputs["networkInterfaceId"] = state ? state.networkInterfaceId : undefined;
            resourceInputs["origin"] = state ? state.origin : undefined;
            resourceInputs["routeTableId"] = state ? state.routeTableId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["transitGatewayId"] = state ? state.transitGatewayId : undefined;
            resourceInputs["vpcEndpointId"] = state ? state.vpcEndpointId : undefined;
            resourceInputs["vpcPeeringConnectionId"] = state ? state.vpcPeeringConnectionId : undefined;
        } else {
            const args = argsOrState as RouteArgs | undefined;
            if ((!args || args.routeTableId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'routeTableId'");
            }
            resourceInputs["carrierGatewayId"] = args ? args.carrierGatewayId : undefined;
            resourceInputs["coreNetworkArn"] = args ? args.coreNetworkArn : undefined;
            resourceInputs["destinationCidrBlock"] = args ? args.destinationCidrBlock : undefined;
            resourceInputs["destinationIpv6CidrBlock"] = args ? args.destinationIpv6CidrBlock : undefined;
            resourceInputs["destinationPrefixListId"] = args ? args.destinationPrefixListId : undefined;
            resourceInputs["egressOnlyGatewayId"] = args ? args.egressOnlyGatewayId : undefined;
            resourceInputs["gatewayId"] = args ? args.gatewayId : undefined;
            resourceInputs["localGatewayId"] = args ? args.localGatewayId : undefined;
            resourceInputs["natGatewayId"] = args ? args.natGatewayId : undefined;
            resourceInputs["networkInterfaceId"] = args ? args.networkInterfaceId : undefined;
            resourceInputs["routeTableId"] = args ? args.routeTableId : undefined;
            resourceInputs["transitGatewayId"] = args ? args.transitGatewayId : undefined;
            resourceInputs["vpcEndpointId"] = args ? args.vpcEndpointId : undefined;
            resourceInputs["vpcPeeringConnectionId"] = args ? args.vpcPeeringConnectionId : undefined;
            resourceInputs["instanceId"] = undefined /*out*/;
            resourceInputs["instanceOwnerId"] = undefined /*out*/;
            resourceInputs["origin"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
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
     * Identifier of a carrier gateway. This attribute can only be used when the VPC contains a subnet which is associated with a Wavelength Zone.
     */
    carrierGatewayId?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of a core network.
     */
    coreNetworkArn?: pulumi.Input<string>;
    /**
     * The destination CIDR block.
     */
    destinationCidrBlock?: pulumi.Input<string>;
    /**
     * The destination IPv6 CIDR block.
     */
    destinationIpv6CidrBlock?: pulumi.Input<string>;
    /**
     * The ID of a managed prefix list destination.
     *
     * One of the following target arguments must be supplied:
     */
    destinationPrefixListId?: pulumi.Input<string>;
    /**
     * Identifier of a VPC Egress Only Internet Gateway.
     */
    egressOnlyGatewayId?: pulumi.Input<string>;
    /**
     * Identifier of a VPC internet gateway or a virtual private gateway. Specify `local` when updating a previously imported local route.
     */
    gatewayId?: pulumi.Input<string>;
    /**
     * Identifier of an EC2 instance.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The AWS account ID of the owner of the EC2 instance.
     */
    instanceOwnerId?: pulumi.Input<string>;
    /**
     * Identifier of a Outpost local gateway.
     */
    localGatewayId?: pulumi.Input<string>;
    /**
     * Identifier of a VPC NAT gateway.
     */
    natGatewayId?: pulumi.Input<string>;
    /**
     * Identifier of an EC2 network interface.
     */
    networkInterfaceId?: pulumi.Input<string>;
    /**
     * How the route was created - `CreateRouteTable`, `CreateRoute` or `EnableVgwRoutePropagation`.
     */
    origin?: pulumi.Input<string>;
    /**
     * The ID of the routing table.
     *
     * One of the following destination arguments must be supplied:
     */
    routeTableId?: pulumi.Input<string>;
    /**
     * The state of the route - `active` or `blackhole`.
     */
    state?: pulumi.Input<string>;
    /**
     * Identifier of an EC2 Transit Gateway.
     */
    transitGatewayId?: pulumi.Input<string>;
    /**
     * Identifier of a VPC Endpoint.
     */
    vpcEndpointId?: pulumi.Input<string>;
    /**
     * Identifier of a VPC peering connection.
     *
     * Note that the default route, mapping the VPC's CIDR block to "local", is created implicitly and cannot be specified.
     */
    vpcPeeringConnectionId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Route resource.
 */
export interface RouteArgs {
    /**
     * Identifier of a carrier gateway. This attribute can only be used when the VPC contains a subnet which is associated with a Wavelength Zone.
     */
    carrierGatewayId?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of a core network.
     */
    coreNetworkArn?: pulumi.Input<string>;
    /**
     * The destination CIDR block.
     */
    destinationCidrBlock?: pulumi.Input<string>;
    /**
     * The destination IPv6 CIDR block.
     */
    destinationIpv6CidrBlock?: pulumi.Input<string>;
    /**
     * The ID of a managed prefix list destination.
     *
     * One of the following target arguments must be supplied:
     */
    destinationPrefixListId?: pulumi.Input<string>;
    /**
     * Identifier of a VPC Egress Only Internet Gateway.
     */
    egressOnlyGatewayId?: pulumi.Input<string>;
    /**
     * Identifier of a VPC internet gateway or a virtual private gateway. Specify `local` when updating a previously imported local route.
     */
    gatewayId?: pulumi.Input<string>;
    /**
     * Identifier of a Outpost local gateway.
     */
    localGatewayId?: pulumi.Input<string>;
    /**
     * Identifier of a VPC NAT gateway.
     */
    natGatewayId?: pulumi.Input<string>;
    /**
     * Identifier of an EC2 network interface.
     */
    networkInterfaceId?: pulumi.Input<string>;
    /**
     * The ID of the routing table.
     *
     * One of the following destination arguments must be supplied:
     */
    routeTableId: pulumi.Input<string>;
    /**
     * Identifier of an EC2 Transit Gateway.
     */
    transitGatewayId?: pulumi.Input<string>;
    /**
     * Identifier of a VPC Endpoint.
     */
    vpcEndpointId?: pulumi.Input<string>;
    /**
     * Identifier of a VPC peering connection.
     *
     * Note that the default route, mapping the VPC's CIDR block to "local", is created implicitly and cannot be specified.
     */
    vpcPeeringConnectionId?: pulumi.Input<string>;
}
