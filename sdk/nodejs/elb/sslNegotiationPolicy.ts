// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a load balancer SSL negotiation policy, which allows an ELB to control the ciphers and protocols that are supported during SSL negotiations between a client and a load balancer.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const lb = new aws.elb.LoadBalancer("lb", {
 *     name: "test-lb",
 *     availabilityZones: ["us-east-1a"],
 *     listeners: [{
 *         instancePort: 8000,
 *         instanceProtocol: "https",
 *         lbPort: 443,
 *         lbProtocol: "https",
 *         sslCertificateId: "arn:aws:iam::123456789012:server-certificate/certName",
 *     }],
 * });
 * const foo = new aws.elb.SslNegotiationPolicy("foo", {
 *     name: "foo-policy",
 *     loadBalancer: lb.id,
 *     lbPort: 443,
 *     attributes: [
 *         {
 *             name: "Protocol-TLSv1",
 *             value: "false",
 *         },
 *         {
 *             name: "Protocol-TLSv1.1",
 *             value: "false",
 *         },
 *         {
 *             name: "Protocol-TLSv1.2",
 *             value: "true",
 *         },
 *         {
 *             name: "Server-Defined-Cipher-Order",
 *             value: "true",
 *         },
 *         {
 *             name: "ECDHE-RSA-AES128-GCM-SHA256",
 *             value: "true",
 *         },
 *         {
 *             name: "AES128-GCM-SHA256",
 *             value: "true",
 *         },
 *         {
 *             name: "EDH-RSA-DES-CBC3-SHA",
 *             value: "false",
 *         },
 *     ],
 * });
 * ```
 */
export class SslNegotiationPolicy extends pulumi.CustomResource {
    /**
     * Get an existing SslNegotiationPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SslNegotiationPolicyState, opts?: pulumi.CustomResourceOptions): SslNegotiationPolicy {
        return new SslNegotiationPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:elb/sslNegotiationPolicy:SslNegotiationPolicy';

    /**
     * Returns true if the given object is an instance of SslNegotiationPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SslNegotiationPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SslNegotiationPolicy.__pulumiType;
    }

    /**
     * An SSL Negotiation policy attribute. Each has two properties:
     */
    public readonly attributes!: pulumi.Output<outputs.elb.SslNegotiationPolicyAttribute[] | undefined>;
    /**
     * The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     */
    public readonly lbPort!: pulumi.Output<number>;
    /**
     * The load balancer to which the policy
     * should be attached.
     */
    public readonly loadBalancer!: pulumi.Output<string>;
    /**
     * The name of the attribute
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Map of arbitrary keys and values that, when changed, will trigger a redeployment.
     *
     * To set your attributes, please see the [AWS Elastic Load Balancing Developer Guide](http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-security-policy-table.html) for a listing of the supported SSL protocols, SSL options, and SSL ciphers.
     *
     * > **NOTE:** The AWS documentation references Server Order Preference, which the AWS Elastic Load Balancing API refers to as `Server-Defined-Cipher-Order`. If you wish to set Server Order Preference, use this value instead.
     */
    public readonly triggers!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a SslNegotiationPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SslNegotiationPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SslNegotiationPolicyArgs | SslNegotiationPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SslNegotiationPolicyState | undefined;
            resourceInputs["attributes"] = state ? state.attributes : undefined;
            resourceInputs["lbPort"] = state ? state.lbPort : undefined;
            resourceInputs["loadBalancer"] = state ? state.loadBalancer : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["triggers"] = state ? state.triggers : undefined;
        } else {
            const args = argsOrState as SslNegotiationPolicyArgs | undefined;
            if ((!args || args.lbPort === undefined) && !opts.urn) {
                throw new Error("Missing required property 'lbPort'");
            }
            if ((!args || args.loadBalancer === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loadBalancer'");
            }
            resourceInputs["attributes"] = args ? args.attributes : undefined;
            resourceInputs["lbPort"] = args ? args.lbPort : undefined;
            resourceInputs["loadBalancer"] = args ? args.loadBalancer : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["triggers"] = args ? args.triggers : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "aws:elasticloadbalancing/sslNegotiationPolicy:SslNegotiationPolicy" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(SslNegotiationPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SslNegotiationPolicy resources.
 */
export interface SslNegotiationPolicyState {
    /**
     * An SSL Negotiation policy attribute. Each has two properties:
     */
    attributes?: pulumi.Input<pulumi.Input<inputs.elb.SslNegotiationPolicyAttribute>[]>;
    /**
     * The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     */
    lbPort?: pulumi.Input<number>;
    /**
     * The load balancer to which the policy
     * should be attached.
     */
    loadBalancer?: pulumi.Input<string>;
    /**
     * The name of the attribute
     */
    name?: pulumi.Input<string>;
    /**
     * Map of arbitrary keys and values that, when changed, will trigger a redeployment.
     *
     * To set your attributes, please see the [AWS Elastic Load Balancing Developer Guide](http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-security-policy-table.html) for a listing of the supported SSL protocols, SSL options, and SSL ciphers.
     *
     * > **NOTE:** The AWS documentation references Server Order Preference, which the AWS Elastic Load Balancing API refers to as `Server-Defined-Cipher-Order`. If you wish to set Server Order Preference, use this value instead.
     */
    triggers?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a SslNegotiationPolicy resource.
 */
export interface SslNegotiationPolicyArgs {
    /**
     * An SSL Negotiation policy attribute. Each has two properties:
     */
    attributes?: pulumi.Input<pulumi.Input<inputs.elb.SslNegotiationPolicyAttribute>[]>;
    /**
     * The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     */
    lbPort: pulumi.Input<number>;
    /**
     * The load balancer to which the policy
     * should be attached.
     */
    loadBalancer: pulumi.Input<string>;
    /**
     * The name of the attribute
     */
    name?: pulumi.Input<string>;
    /**
     * Map of arbitrary keys and values that, when changed, will trigger a redeployment.
     *
     * To set your attributes, please see the [AWS Elastic Load Balancing Developer Guide](http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-security-policy-table.html) for a listing of the supported SSL protocols, SSL options, and SSL ciphers.
     *
     * > **NOTE:** The AWS documentation references Server Order Preference, which the AWS Elastic Load Balancing API refers to as `Server-Defined-Cipher-Order`. If you wish to set Server Order Preference, use this value instead.
     */
    triggers?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
