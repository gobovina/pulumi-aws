// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * [IPv6 only] Creates an egress-only Internet gateway for your VPC.
 * An egress-only Internet gateway is used to enable outbound communication
 * over IPv6 from instances in your VPC to the Internet, and prevents hosts
 * outside of your VPC from initiating an IPv6 connection with your instance.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ec2.Vpc("example", {
 *     cidrBlock: "10.1.0.0/16",
 *     assignGeneratedIpv6CidrBlock: true,
 * });
 * const exampleEgressOnlyInternetGateway = new aws.ec2.EgressOnlyInternetGateway("example", {
 *     vpcId: example.id,
 *     tags: {
 *         Name: "main",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Egress-only Internet gateways using the `id`. For example:
 *
 * ```sh
 * $ pulumi import aws:ec2/egressOnlyInternetGateway:EgressOnlyInternetGateway example eigw-015e0e244e24dfe8a
 * ```
 */
export class EgressOnlyInternetGateway extends pulumi.CustomResource {
    /**
     * Get an existing EgressOnlyInternetGateway resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EgressOnlyInternetGatewayState, opts?: pulumi.CustomResourceOptions): EgressOnlyInternetGateway {
        return new EgressOnlyInternetGateway(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/egressOnlyInternetGateway:EgressOnlyInternetGateway';

    /**
     * Returns true if the given object is an instance of EgressOnlyInternetGateway.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EgressOnlyInternetGateway {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EgressOnlyInternetGateway.__pulumiType;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The VPC ID to create in.
     */
    public readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a EgressOnlyInternetGateway resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EgressOnlyInternetGatewayArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EgressOnlyInternetGatewayArgs | EgressOnlyInternetGatewayState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EgressOnlyInternetGatewayState | undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as EgressOnlyInternetGatewayArgs | undefined;
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EgressOnlyInternetGateway.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EgressOnlyInternetGateway resources.
 */
export interface EgressOnlyInternetGatewayState {
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The VPC ID to create in.
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EgressOnlyInternetGateway resource.
 */
export interface EgressOnlyInternetGatewayArgs {
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The VPC ID to create in.
     */
    vpcId: pulumi.Input<string>;
}
