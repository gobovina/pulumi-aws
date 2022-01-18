// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a customer gateway inside a VPC. These objects can be connected to VPN gateways via VPN connections, and allow you to establish tunnels between your network and the VPC.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const main = new aws.ec2.CustomerGateway("main", {
 *     bgpAsn: "65000",
 *     ipAddress: "172.83.124.10",
 *     tags: {
 *         Name: "main-customer-gateway",
 *     },
 *     type: "ipsec.1",
 * });
 * ```
 *
 * ## Import
 *
 * Customer Gateways can be imported using the `id`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:ec2/customerGateway:CustomerGateway main cgw-b4dc3961
 * ```
 */
export class CustomerGateway extends pulumi.CustomResource {
    /**
     * Get an existing CustomerGateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomerGatewayState, opts?: pulumi.CustomResourceOptions): CustomerGateway {
        return new CustomerGateway(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/customerGateway:CustomerGateway';

    /**
     * Returns true if the given object is an instance of CustomerGateway.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomerGateway {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomerGateway.__pulumiType;
    }

    /**
     * The ARN of the customer gateway.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     */
    public readonly bgpAsn!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     */
    public readonly certificateArn!: pulumi.Output<string | undefined>;
    /**
     * A name for the customer gateway device.
     */
    public readonly deviceName!: pulumi.Output<string | undefined>;
    /**
     * The IP address of the gateway's Internet-routable external interface.
     */
    public readonly ipAddress!: pulumi.Output<string>;
    /**
     * Tags to apply to the gateway. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The type of customer gateway. The only type AWS
     * supports at this time is "ipsec.1".
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a CustomerGateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomerGatewayArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomerGatewayArgs | CustomerGatewayState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomerGatewayState | undefined;
            inputs["arn"] = state ? state.arn : undefined;
            inputs["bgpAsn"] = state ? state.bgpAsn : undefined;
            inputs["certificateArn"] = state ? state.certificateArn : undefined;
            inputs["deviceName"] = state ? state.deviceName : undefined;
            inputs["ipAddress"] = state ? state.ipAddress : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["tagsAll"] = state ? state.tagsAll : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as CustomerGatewayArgs | undefined;
            if ((!args || args.bgpAsn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bgpAsn'");
            }
            if ((!args || args.ipAddress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipAddress'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            inputs["bgpAsn"] = args ? args.bgpAsn : undefined;
            inputs["certificateArn"] = args ? args.certificateArn : undefined;
            inputs["deviceName"] = args ? args.deviceName : undefined;
            inputs["ipAddress"] = args ? args.ipAddress : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["arn"] = undefined /*out*/;
            inputs["tagsAll"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(CustomerGateway.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomerGateway resources.
 */
export interface CustomerGatewayState {
    /**
     * The ARN of the customer gateway.
     */
    arn?: pulumi.Input<string>;
    /**
     * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     */
    bgpAsn?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     */
    certificateArn?: pulumi.Input<string>;
    /**
     * A name for the customer gateway device.
     */
    deviceName?: pulumi.Input<string>;
    /**
     * The IP address of the gateway's Internet-routable external interface.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * Tags to apply to the gateway. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The type of customer gateway. The only type AWS
     * supports at this time is "ipsec.1".
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CustomerGateway resource.
 */
export interface CustomerGatewayArgs {
    /**
     * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     */
    bgpAsn: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     */
    certificateArn?: pulumi.Input<string>;
    /**
     * A name for the customer gateway device.
     */
    deviceName?: pulumi.Input<string>;
    /**
     * The IP address of the gateway's Internet-routable external interface.
     */
    ipAddress: pulumi.Input<string>;
    /**
     * Tags to apply to the gateway. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The type of customer gateway. The only type AWS
     * supports at this time is "ipsec.1".
     */
    type: pulumi.Input<string>;
}
