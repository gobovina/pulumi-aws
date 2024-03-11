// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Attaches a load balancer policy to an ELB backend server.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * const wu_tang = new aws.elb.LoadBalancer("wu-tang", {
 *     name: "wu-tang",
 *     availabilityZones: ["us-east-1a"],
 *     listeners: [{
 *         instancePort: 443,
 *         instanceProtocol: "http",
 *         lbPort: 443,
 *         lbProtocol: "https",
 *         sslCertificateId: "arn:aws:iam::000000000000:server-certificate/wu-tang.net",
 *     }],
 *     tags: {
 *         Name: "wu-tang",
 *     },
 * });
 * const wu_tang_ca_pubkey_policy = new aws.elb.LoadBalancerPolicy("wu-tang-ca-pubkey-policy", {
 *     loadBalancerName: wu_tang.name,
 *     policyName: "wu-tang-ca-pubkey-policy",
 *     policyTypeName: "PublicKeyPolicyType",
 *     policyAttributes: [{
 *         name: "PublicKey",
 *         value: std.file({
 *             input: "wu-tang-pubkey",
 *         }).then(invoke => invoke.result),
 *     }],
 * });
 * const wu_tang_root_ca_backend_auth_policy = new aws.elb.LoadBalancerPolicy("wu-tang-root-ca-backend-auth-policy", {
 *     loadBalancerName: wu_tang.name,
 *     policyName: "wu-tang-root-ca-backend-auth-policy",
 *     policyTypeName: "BackendServerAuthenticationPolicyType",
 *     policyAttributes: [{
 *         name: "PublicKeyPolicyName",
 *         value: wu_tang_root_ca_pubkey_policy.policyName,
 *     }],
 * });
 * const wu_tang_backend_auth_policies_443 = new aws.elb.LoadBalancerBackendServerPolicy("wu-tang-backend-auth-policies-443", {
 *     loadBalancerName: wu_tang.name,
 *     instancePort: 443,
 *     policyNames: [wu_tang_root_ca_backend_auth_policy.policyName],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export class LoadBalancerBackendServerPolicy extends pulumi.CustomResource {
    /**
     * Get an existing LoadBalancerBackendServerPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadBalancerBackendServerPolicyState, opts?: pulumi.CustomResourceOptions): LoadBalancerBackendServerPolicy {
        return new LoadBalancerBackendServerPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:elb/loadBalancerBackendServerPolicy:LoadBalancerBackendServerPolicy';

    /**
     * Returns true if the given object is an instance of LoadBalancerBackendServerPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadBalancerBackendServerPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadBalancerBackendServerPolicy.__pulumiType;
    }

    /**
     * The instance port to apply the policy to.
     */
    public readonly instancePort!: pulumi.Output<number>;
    /**
     * The load balancer to attach the policy to.
     */
    public readonly loadBalancerName!: pulumi.Output<string>;
    /**
     * List of Policy Names to apply to the backend server.
     */
    public readonly policyNames!: pulumi.Output<string[] | undefined>;

    /**
     * Create a LoadBalancerBackendServerPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadBalancerBackendServerPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadBalancerBackendServerPolicyArgs | LoadBalancerBackendServerPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadBalancerBackendServerPolicyState | undefined;
            resourceInputs["instancePort"] = state ? state.instancePort : undefined;
            resourceInputs["loadBalancerName"] = state ? state.loadBalancerName : undefined;
            resourceInputs["policyNames"] = state ? state.policyNames : undefined;
        } else {
            const args = argsOrState as LoadBalancerBackendServerPolicyArgs | undefined;
            if ((!args || args.instancePort === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instancePort'");
            }
            if ((!args || args.loadBalancerName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loadBalancerName'");
            }
            resourceInputs["instancePort"] = args ? args.instancePort : undefined;
            resourceInputs["loadBalancerName"] = args ? args.loadBalancerName : undefined;
            resourceInputs["policyNames"] = args ? args.policyNames : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "aws:elasticloadbalancing/loadBalancerBackendServerPolicy:LoadBalancerBackendServerPolicy" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(LoadBalancerBackendServerPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadBalancerBackendServerPolicy resources.
 */
export interface LoadBalancerBackendServerPolicyState {
    /**
     * The instance port to apply the policy to.
     */
    instancePort?: pulumi.Input<number>;
    /**
     * The load balancer to attach the policy to.
     */
    loadBalancerName?: pulumi.Input<string>;
    /**
     * List of Policy Names to apply to the backend server.
     */
    policyNames?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a LoadBalancerBackendServerPolicy resource.
 */
export interface LoadBalancerBackendServerPolicyArgs {
    /**
     * The instance port to apply the policy to.
     */
    instancePort: pulumi.Input<number>;
    /**
     * The load balancer to attach the policy to.
     */
    loadBalancerName: pulumi.Input<string>;
    /**
     * List of Policy Names to apply to the backend server.
     */
    policyNames?: pulumi.Input<pulumi.Input<string>[]>;
}
