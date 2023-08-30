// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a VPC Endpoint Service resource.
 * Service consumers can create an _Interface_ VPC Endpoint to connect to the service.
 *
 * > **NOTE on VPC Endpoint Services and VPC Endpoint Service Allowed Principals:** This provider provides
 * both a standalone VPC Endpoint Service Allowed Principal resource
 * and a VPC Endpoint Service resource with an `allowedPrincipals` attribute. Do not use the same principal ARN in both
 * a VPC Endpoint Service resource and a VPC Endpoint Service Allowed Principal resource. Doing so will cause a conflict
 * and will overwrite the association.
 *
 * ## Example Usage
 * ### Network Load Balancers
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ec2.VpcEndpointService("example", {
 *     acceptanceRequired: false,
 *     networkLoadBalancerArns: [aws_lb.example.arn],
 * });
 * ```
 * ### Gateway Load Balancers
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ec2.VpcEndpointService("example", {
 *     acceptanceRequired: false,
 *     gatewayLoadBalancerArns: [aws_lb.example.arn],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import VPC Endpoint Services using the VPC endpoint service `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:ec2/vpcEndpointService:VpcEndpointService foo vpce-svc-0f97a19d3fa8220bc
 * ```
 */
export class VpcEndpointService extends pulumi.CustomResource {
    /**
     * Get an existing VpcEndpointService resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VpcEndpointServiceState, opts?: pulumi.CustomResourceOptions): VpcEndpointService {
        return new VpcEndpointService(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/vpcEndpointService:VpcEndpointService';

    /**
     * Returns true if the given object is an instance of VpcEndpointService.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VpcEndpointService {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VpcEndpointService.__pulumiType;
    }

    /**
     * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
     */
    public readonly acceptanceRequired!: pulumi.Output<boolean>;
    /**
     * The ARNs of one or more principals allowed to discover the endpoint service.
     */
    public readonly allowedPrincipals!: pulumi.Output<string[]>;
    /**
     * The Amazon Resource Name (ARN) of the VPC endpoint service.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A set of Availability Zones in which the service is available.
     */
    public /*out*/ readonly availabilityZones!: pulumi.Output<string[]>;
    /**
     * A set of DNS names for the service.
     */
    public /*out*/ readonly baseEndpointDnsNames!: pulumi.Output<string[]>;
    /**
     * Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
     */
    public readonly gatewayLoadBalancerArns!: pulumi.Output<string[] | undefined>;
    /**
     * Whether or not the service manages its VPC endpoints - `true` or `false`.
     */
    public /*out*/ readonly managesVpcEndpoints!: pulumi.Output<boolean>;
    /**
     * Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
     */
    public readonly networkLoadBalancerArns!: pulumi.Output<string[] | undefined>;
    /**
     * The private DNS name for the service.
     */
    public readonly privateDnsName!: pulumi.Output<string>;
    /**
     * List of objects containing information about the endpoint service private DNS name configuration.
     */
    public /*out*/ readonly privateDnsNameConfigurations!: pulumi.Output<outputs.ec2.VpcEndpointServicePrivateDnsNameConfiguration[]>;
    /**
     * The service name.
     */
    public /*out*/ readonly serviceName!: pulumi.Output<string>;
    /**
     * The service type, `Gateway` or `Interface`.
     */
    public /*out*/ readonly serviceType!: pulumi.Output<string>;
    /**
     * Verification state of the VPC endpoint service. Consumers of the endpoint service can use the private name only when the state is `verified`.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The supported IP address types. The possible values are `ipv4` and `ipv6`.
     */
    public readonly supportedIpAddressTypes!: pulumi.Output<string[]>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a VpcEndpointService resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VpcEndpointServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VpcEndpointServiceArgs | VpcEndpointServiceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VpcEndpointServiceState | undefined;
            resourceInputs["acceptanceRequired"] = state ? state.acceptanceRequired : undefined;
            resourceInputs["allowedPrincipals"] = state ? state.allowedPrincipals : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["availabilityZones"] = state ? state.availabilityZones : undefined;
            resourceInputs["baseEndpointDnsNames"] = state ? state.baseEndpointDnsNames : undefined;
            resourceInputs["gatewayLoadBalancerArns"] = state ? state.gatewayLoadBalancerArns : undefined;
            resourceInputs["managesVpcEndpoints"] = state ? state.managesVpcEndpoints : undefined;
            resourceInputs["networkLoadBalancerArns"] = state ? state.networkLoadBalancerArns : undefined;
            resourceInputs["privateDnsName"] = state ? state.privateDnsName : undefined;
            resourceInputs["privateDnsNameConfigurations"] = state ? state.privateDnsNameConfigurations : undefined;
            resourceInputs["serviceName"] = state ? state.serviceName : undefined;
            resourceInputs["serviceType"] = state ? state.serviceType : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["supportedIpAddressTypes"] = state ? state.supportedIpAddressTypes : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as VpcEndpointServiceArgs | undefined;
            if ((!args || args.acceptanceRequired === undefined) && !opts.urn) {
                throw new Error("Missing required property 'acceptanceRequired'");
            }
            resourceInputs["acceptanceRequired"] = args ? args.acceptanceRequired : undefined;
            resourceInputs["allowedPrincipals"] = args ? args.allowedPrincipals : undefined;
            resourceInputs["gatewayLoadBalancerArns"] = args ? args.gatewayLoadBalancerArns : undefined;
            resourceInputs["networkLoadBalancerArns"] = args ? args.networkLoadBalancerArns : undefined;
            resourceInputs["privateDnsName"] = args ? args.privateDnsName : undefined;
            resourceInputs["supportedIpAddressTypes"] = args ? args.supportedIpAddressTypes : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["availabilityZones"] = undefined /*out*/;
            resourceInputs["baseEndpointDnsNames"] = undefined /*out*/;
            resourceInputs["managesVpcEndpoints"] = undefined /*out*/;
            resourceInputs["privateDnsNameConfigurations"] = undefined /*out*/;
            resourceInputs["serviceName"] = undefined /*out*/;
            resourceInputs["serviceType"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VpcEndpointService.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VpcEndpointService resources.
 */
export interface VpcEndpointServiceState {
    /**
     * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
     */
    acceptanceRequired?: pulumi.Input<boolean>;
    /**
     * The ARNs of one or more principals allowed to discover the endpoint service.
     */
    allowedPrincipals?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Amazon Resource Name (ARN) of the VPC endpoint service.
     */
    arn?: pulumi.Input<string>;
    /**
     * A set of Availability Zones in which the service is available.
     */
    availabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A set of DNS names for the service.
     */
    baseEndpointDnsNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
     */
    gatewayLoadBalancerArns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether or not the service manages its VPC endpoints - `true` or `false`.
     */
    managesVpcEndpoints?: pulumi.Input<boolean>;
    /**
     * Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
     */
    networkLoadBalancerArns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The private DNS name for the service.
     */
    privateDnsName?: pulumi.Input<string>;
    /**
     * List of objects containing information about the endpoint service private DNS name configuration.
     */
    privateDnsNameConfigurations?: pulumi.Input<pulumi.Input<inputs.ec2.VpcEndpointServicePrivateDnsNameConfiguration>[]>;
    /**
     * The service name.
     */
    serviceName?: pulumi.Input<string>;
    /**
     * The service type, `Gateway` or `Interface`.
     */
    serviceType?: pulumi.Input<string>;
    /**
     * Verification state of the VPC endpoint service. Consumers of the endpoint service can use the private name only when the state is `verified`.
     */
    state?: pulumi.Input<string>;
    /**
     * The supported IP address types. The possible values are `ipv4` and `ipv6`.
     */
    supportedIpAddressTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a VpcEndpointService resource.
 */
export interface VpcEndpointServiceArgs {
    /**
     * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
     */
    acceptanceRequired: pulumi.Input<boolean>;
    /**
     * The ARNs of one or more principals allowed to discover the endpoint service.
     */
    allowedPrincipals?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
     */
    gatewayLoadBalancerArns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
     */
    networkLoadBalancerArns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The private DNS name for the service.
     */
    privateDnsName?: pulumi.Input<string>;
    /**
     * The supported IP address types. The possible values are `ipv4` and `ipv6`.
     */
    supportedIpAddressTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
