// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Creates a Lightsail load balancer resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.lightsail.Lb("test", {
 *     healthCheckPath: "/",
 *     instancePort: 80,
 *     tags: {
 *         foo: "bar",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_lightsail_lb` using the name attribute. For example:
 *
 * ```sh
 *  $ pulumi import aws:lightsail/lb:Lb test example-load-balancer
 * ```
 */
export class Lb extends pulumi.CustomResource {
    /**
     * Get an existing Lb resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LbState, opts?: pulumi.CustomResourceOptions): Lb {
        return new Lb(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:lightsail/lb:Lb';

    /**
     * Returns true if the given object is an instance of Lb.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Lb {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Lb.__pulumiType;
    }

    /**
     * The ARN of the Lightsail load balancer.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The timestamp when the load balancer was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The DNS name of the load balancer.
     */
    public /*out*/ readonly dnsName!: pulumi.Output<string>;
    /**
     * The health check path of the load balancer. Default value "/".
     */
    public readonly healthCheckPath!: pulumi.Output<string | undefined>;
    /**
     * The instance port the load balancer will connect.
     */
    public readonly instancePort!: pulumi.Output<number>;
    public readonly ipAddressType!: pulumi.Output<string | undefined>;
    /**
     * The name of the Lightsail load balancer.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The protocol of the load balancer.
     */
    public /*out*/ readonly protocol!: pulumi.Output<string>;
    /**
     * The public ports of the load balancer.
     */
    public /*out*/ readonly publicPorts!: pulumi.Output<number[]>;
    /**
     * The support code for the database. Include this code in your email to support when you have questions about a database in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     */
    public /*out*/ readonly supportCode!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Lb resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LbArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LbArgs | LbState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LbState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["dnsName"] = state ? state.dnsName : undefined;
            resourceInputs["healthCheckPath"] = state ? state.healthCheckPath : undefined;
            resourceInputs["instancePort"] = state ? state.instancePort : undefined;
            resourceInputs["ipAddressType"] = state ? state.ipAddressType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["protocol"] = state ? state.protocol : undefined;
            resourceInputs["publicPorts"] = state ? state.publicPorts : undefined;
            resourceInputs["supportCode"] = state ? state.supportCode : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as LbArgs | undefined;
            if ((!args || args.instancePort === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instancePort'");
            }
            resourceInputs["healthCheckPath"] = args ? args.healthCheckPath : undefined;
            resourceInputs["instancePort"] = args ? args.instancePort : undefined;
            resourceInputs["ipAddressType"] = args ? args.ipAddressType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["dnsName"] = undefined /*out*/;
            resourceInputs["protocol"] = undefined /*out*/;
            resourceInputs["publicPorts"] = undefined /*out*/;
            resourceInputs["supportCode"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Lb.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Lb resources.
 */
export interface LbState {
    /**
     * The ARN of the Lightsail load balancer.
     */
    arn?: pulumi.Input<string>;
    /**
     * The timestamp when the load balancer was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * The DNS name of the load balancer.
     */
    dnsName?: pulumi.Input<string>;
    /**
     * The health check path of the load balancer. Default value "/".
     */
    healthCheckPath?: pulumi.Input<string>;
    /**
     * The instance port the load balancer will connect.
     */
    instancePort?: pulumi.Input<number>;
    ipAddressType?: pulumi.Input<string>;
    /**
     * The name of the Lightsail load balancer.
     */
    name?: pulumi.Input<string>;
    /**
     * The protocol of the load balancer.
     */
    protocol?: pulumi.Input<string>;
    /**
     * The public ports of the load balancer.
     */
    publicPorts?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The support code for the database. Include this code in your email to support when you have questions about a database in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     */
    supportCode?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Lb resource.
 */
export interface LbArgs {
    /**
     * The health check path of the load balancer. Default value "/".
     */
    healthCheckPath?: pulumi.Input<string>;
    /**
     * The instance port the load balancer will connect.
     */
    instancePort: pulumi.Input<number>;
    ipAddressType?: pulumi.Input<string>;
    /**
     * The name of the Lightsail load balancer.
     */
    name?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
