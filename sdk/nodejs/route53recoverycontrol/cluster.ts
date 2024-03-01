// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an AWS Route 53 Recovery Control Config Cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.route53recoverycontrol.Cluster("example", {name: "georgefitzgerald"});
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Route53 Recovery Control Config cluster using the cluster ARN. For example:
 *
 * ```sh
 *  $ pulumi import aws:route53recoverycontrol/cluster:Cluster mycluster arn:aws:route53-recovery-control::313517334327:cluster/f9ae13be-a11e-4ec7-8522-94a70468e6ea
 * ```
 */
export class Cluster extends pulumi.CustomResource {
    /**
     * Get an existing Cluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterState, opts?: pulumi.CustomResourceOptions): Cluster {
        return new Cluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:route53recoverycontrol/cluster:Cluster';

    /**
     * Returns true if the given object is an instance of Cluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Cluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Cluster.__pulumiType;
    }

    /**
     * ARN of the cluster
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * List of 5 endpoints in 5 regions that can be used to talk to the cluster. See below.
     */
    public /*out*/ readonly clusterEndpoints!: pulumi.Output<outputs.route53recoverycontrol.ClusterClusterEndpoint[]>;
    /**
     * Unique name describing the cluster.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Status of cluster. `PENDING` when it is being created, `PENDING_DELETION` when it is being deleted and `DEPLOYED` otherwise.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a Cluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterArgs | ClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["clusterEndpoints"] = state ? state.clusterEndpoints : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as ClusterArgs | undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["clusterEndpoints"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Cluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Cluster resources.
 */
export interface ClusterState {
    /**
     * ARN of the cluster
     */
    arn?: pulumi.Input<string>;
    /**
     * List of 5 endpoints in 5 regions that can be used to talk to the cluster. See below.
     */
    clusterEndpoints?: pulumi.Input<pulumi.Input<inputs.route53recoverycontrol.ClusterClusterEndpoint>[]>;
    /**
     * Unique name describing the cluster.
     */
    name?: pulumi.Input<string>;
    /**
     * Status of cluster. `PENDING` when it is being created, `PENDING_DELETION` when it is being deleted and `DEPLOYED` otherwise.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    /**
     * Unique name describing the cluster.
     */
    name?: pulumi.Input<string>;
}
