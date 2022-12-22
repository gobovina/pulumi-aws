// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a VPC Endpoint resource.
 *
 * > **NOTE on VPC Endpoints and VPC Endpoint Associations:** The provider provides both standalone VPC Endpoint Associations for
 * Route Tables - (an association between a VPC endpoint and a single `routeTableId`),
 * Security Groups - (an association between a VPC endpoint and a single `securityGroupId`),
 * and Subnets - (an association between a VPC endpoint and a single `subnetId`) and
 * a VPC Endpoint resource with `routeTableIds` and `subnetIds` attributes.
 * Do not use the same resource ID in both a VPC Endpoint resource and a VPC Endpoint Association resource.
 * Doing so will cause a conflict of associations and will overwrite the association.
 *
 * ## Example Usage
 * ### Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const s3 = new aws.ec2.VpcEndpoint("s3", {
 *     vpcId: aws_vpc.main.id,
 *     serviceName: "com.amazonaws.us-west-2.s3",
 * });
 * ```
 * ### Basic w/ Tags
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const s3 = new aws.ec2.VpcEndpoint("s3", {
 *     vpcId: aws_vpc.main.id,
 *     serviceName: "com.amazonaws.us-west-2.s3",
 *     tags: {
 *         Environment: "test",
 *     },
 * });
 * ```
 * ### Interface Endpoint Type
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const ec2 = new aws.ec2.VpcEndpoint("ec2", {
 *     vpcId: aws_vpc.main.id,
 *     serviceName: "com.amazonaws.us-west-2.ec2",
 *     vpcEndpointType: "Interface",
 *     securityGroupIds: [aws_security_group.sg1.id],
 *     privateDnsEnabled: true,
 * });
 * ```
 * ### Gateway Load Balancer Endpoint Type
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getCallerIdentity({});
 * const exampleVpcEndpointService = new aws.ec2.VpcEndpointService("exampleVpcEndpointService", {
 *     acceptanceRequired: false,
 *     allowedPrincipals: [current.then(current => current.arn)],
 *     gatewayLoadBalancerArns: [aws_lb.example.arn],
 * });
 * const exampleVpcEndpoint = new aws.ec2.VpcEndpoint("exampleVpcEndpoint", {
 *     serviceName: exampleVpcEndpointService.serviceName,
 *     subnetIds: [aws_subnet.example.id],
 *     vpcEndpointType: exampleVpcEndpointService.serviceType,
 *     vpcId: aws_vpc.example.id,
 * });
 * ```
 *
 * ## Import
 *
 * VPC Endpoints can be imported using the `vpc endpoint id`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:ec2/vpcEndpoint:VpcEndpoint endpoint1 vpce-3ecf2a57
 * ```
 */
export class VpcEndpoint extends pulumi.CustomResource {
    /**
     * Get an existing VpcEndpoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VpcEndpointState, opts?: pulumi.CustomResourceOptions): VpcEndpoint {
        return new VpcEndpoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/vpcEndpoint:VpcEndpoint';

    /**
     * Returns true if the given object is an instance of VpcEndpoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VpcEndpoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VpcEndpoint.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the VPC endpoint.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
     */
    public readonly autoAccept!: pulumi.Output<boolean | undefined>;
    /**
     * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
     */
    public /*out*/ readonly cidrBlocks!: pulumi.Output<string[]>;
    /**
     * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
     */
    public /*out*/ readonly dnsEntries!: pulumi.Output<outputs.ec2.VpcEndpointDnsEntry[]>;
    /**
     * The DNS options for the endpoint. See dnsOptions below.
     */
    public readonly dnsOptions!: pulumi.Output<outputs.ec2.VpcEndpointDnsOptions>;
    /**
     * The IP address type for the endpoint. Valid values are `ipv4`, `dualstack`, and `ipv6`.
     */
    public readonly ipAddressType!: pulumi.Output<string>;
    /**
     * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
     */
    public /*out*/ readonly networkInterfaceIds!: pulumi.Output<string[]>;
    /**
     * The ID of the AWS account that owns the VPC endpoint.
     */
    public /*out*/ readonly ownerId!: pulumi.Output<string>;
    /**
     * A policy to attach to the endpoint that controls access to the service. This is a JSON formatted string. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
     */
    public readonly policy!: pulumi.Output<string>;
    /**
     * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
     */
    public /*out*/ readonly prefixListId!: pulumi.Output<string>;
    /**
     * Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
     * Defaults to `false`.
     */
    public readonly privateDnsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
     */
    public /*out*/ readonly requesterManaged!: pulumi.Output<boolean>;
    /**
     * One or more route table IDs. Applicable for endpoints of type `Gateway`.
     */
    public readonly routeTableIds!: pulumi.Output<string[]>;
    /**
     * The ID of one or more security groups to associate with the network interface. Applicable for endpoints of type `Interface`.
     * If no security groups are specified, the VPC's [default security group](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#DefaultSecurityGroup) is associated with the endpoint.
     */
    public readonly securityGroupIds!: pulumi.Output<string[]>;
    /**
     * The service name. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
     */
    public readonly serviceName!: pulumi.Output<string>;
    /**
     * The state of the VPC endpoint.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
     */
    public readonly subnetIds!: pulumi.Output<string[]>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
     */
    public readonly vpcEndpointType!: pulumi.Output<string | undefined>;
    /**
     * The ID of the VPC in which the endpoint will be used.
     */
    public readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a VpcEndpoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VpcEndpointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VpcEndpointArgs | VpcEndpointState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VpcEndpointState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["autoAccept"] = state ? state.autoAccept : undefined;
            resourceInputs["cidrBlocks"] = state ? state.cidrBlocks : undefined;
            resourceInputs["dnsEntries"] = state ? state.dnsEntries : undefined;
            resourceInputs["dnsOptions"] = state ? state.dnsOptions : undefined;
            resourceInputs["ipAddressType"] = state ? state.ipAddressType : undefined;
            resourceInputs["networkInterfaceIds"] = state ? state.networkInterfaceIds : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["policy"] = state ? state.policy : undefined;
            resourceInputs["prefixListId"] = state ? state.prefixListId : undefined;
            resourceInputs["privateDnsEnabled"] = state ? state.privateDnsEnabled : undefined;
            resourceInputs["requesterManaged"] = state ? state.requesterManaged : undefined;
            resourceInputs["routeTableIds"] = state ? state.routeTableIds : undefined;
            resourceInputs["securityGroupIds"] = state ? state.securityGroupIds : undefined;
            resourceInputs["serviceName"] = state ? state.serviceName : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["subnetIds"] = state ? state.subnetIds : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["vpcEndpointType"] = state ? state.vpcEndpointType : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as VpcEndpointArgs | undefined;
            if ((!args || args.serviceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceName'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["autoAccept"] = args ? args.autoAccept : undefined;
            resourceInputs["dnsOptions"] = args ? args.dnsOptions : undefined;
            resourceInputs["ipAddressType"] = args ? args.ipAddressType : undefined;
            resourceInputs["policy"] = args ? args.policy : undefined;
            resourceInputs["privateDnsEnabled"] = args ? args.privateDnsEnabled : undefined;
            resourceInputs["routeTableIds"] = args ? args.routeTableIds : undefined;
            resourceInputs["securityGroupIds"] = args ? args.securityGroupIds : undefined;
            resourceInputs["serviceName"] = args ? args.serviceName : undefined;
            resourceInputs["subnetIds"] = args ? args.subnetIds : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcEndpointType"] = args ? args.vpcEndpointType : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["cidrBlocks"] = undefined /*out*/;
            resourceInputs["dnsEntries"] = undefined /*out*/;
            resourceInputs["networkInterfaceIds"] = undefined /*out*/;
            resourceInputs["ownerId"] = undefined /*out*/;
            resourceInputs["prefixListId"] = undefined /*out*/;
            resourceInputs["requesterManaged"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VpcEndpoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VpcEndpoint resources.
 */
export interface VpcEndpointState {
    /**
     * The Amazon Resource Name (ARN) of the VPC endpoint.
     */
    arn?: pulumi.Input<string>;
    /**
     * Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
     */
    autoAccept?: pulumi.Input<boolean>;
    /**
     * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
     */
    cidrBlocks?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
     */
    dnsEntries?: pulumi.Input<pulumi.Input<inputs.ec2.VpcEndpointDnsEntry>[]>;
    /**
     * The DNS options for the endpoint. See dnsOptions below.
     */
    dnsOptions?: pulumi.Input<inputs.ec2.VpcEndpointDnsOptions>;
    /**
     * The IP address type for the endpoint. Valid values are `ipv4`, `dualstack`, and `ipv6`.
     */
    ipAddressType?: pulumi.Input<string>;
    /**
     * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
     */
    networkInterfaceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the AWS account that owns the VPC endpoint.
     */
    ownerId?: pulumi.Input<string>;
    /**
     * A policy to attach to the endpoint that controls access to the service. This is a JSON formatted string. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
     */
    policy?: pulumi.Input<string>;
    /**
     * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
     */
    prefixListId?: pulumi.Input<string>;
    /**
     * Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
     * Defaults to `false`.
     */
    privateDnsEnabled?: pulumi.Input<boolean>;
    /**
     * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
     */
    requesterManaged?: pulumi.Input<boolean>;
    /**
     * One or more route table IDs. Applicable for endpoints of type `Gateway`.
     */
    routeTableIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of one or more security groups to associate with the network interface. Applicable for endpoints of type `Interface`.
     * If no security groups are specified, the VPC's [default security group](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#DefaultSecurityGroup) is associated with the endpoint.
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The service name. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
     */
    serviceName?: pulumi.Input<string>;
    /**
     * The state of the VPC endpoint.
     */
    state?: pulumi.Input<string>;
    /**
     * The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
     */
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
     */
    vpcEndpointType?: pulumi.Input<string>;
    /**
     * The ID of the VPC in which the endpoint will be used.
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VpcEndpoint resource.
 */
export interface VpcEndpointArgs {
    /**
     * Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
     */
    autoAccept?: pulumi.Input<boolean>;
    /**
     * The DNS options for the endpoint. See dnsOptions below.
     */
    dnsOptions?: pulumi.Input<inputs.ec2.VpcEndpointDnsOptions>;
    /**
     * The IP address type for the endpoint. Valid values are `ipv4`, `dualstack`, and `ipv6`.
     */
    ipAddressType?: pulumi.Input<string>;
    /**
     * A policy to attach to the endpoint that controls access to the service. This is a JSON formatted string. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
     */
    policy?: pulumi.Input<string>;
    /**
     * Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
     * Defaults to `false`.
     */
    privateDnsEnabled?: pulumi.Input<boolean>;
    /**
     * One or more route table IDs. Applicable for endpoints of type `Gateway`.
     */
    routeTableIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of one or more security groups to associate with the network interface. Applicable for endpoints of type `Interface`.
     * If no security groups are specified, the VPC's [default security group](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#DefaultSecurityGroup) is associated with the endpoint.
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The service name. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
     */
    serviceName: pulumi.Input<string>;
    /**
     * The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
     */
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
     */
    vpcEndpointType?: pulumi.Input<string>;
    /**
     * The ID of the VPC in which the endpoint will be used.
     */
    vpcId: pulumi.Input<string>;
}
