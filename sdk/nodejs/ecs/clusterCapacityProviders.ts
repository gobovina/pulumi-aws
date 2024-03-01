// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages the capacity providers of an ECS Cluster.
 *
 * More information about capacity providers can be found in the [ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-capacity-providers.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ecs.Cluster("example", {name: "my-cluster"});
 * const exampleClusterCapacityProviders = new aws.ecs.ClusterCapacityProviders("example", {
 *     clusterName: example.name,
 *     capacityProviders: ["FARGATE"],
 *     defaultCapacityProviderStrategies: [{
 *         base: 1,
 *         weight: 100,
 *         capacityProvider: "FARGATE",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import ECS cluster capacity providers using the `cluster_name` attribute. For example:
 *
 * ```sh
 *  $ pulumi import aws:ecs/clusterCapacityProviders:ClusterCapacityProviders example my-cluster
 * ```
 */
export class ClusterCapacityProviders extends pulumi.CustomResource {
    /**
     * Get an existing ClusterCapacityProviders resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterCapacityProvidersState, opts?: pulumi.CustomResourceOptions): ClusterCapacityProviders {
        return new ClusterCapacityProviders(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ecs/clusterCapacityProviders:ClusterCapacityProviders';

    /**
     * Returns true if the given object is an instance of ClusterCapacityProviders.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterCapacityProviders {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterCapacityProviders.__pulumiType;
    }

    /**
     * Set of names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
     */
    public readonly capacityProviders!: pulumi.Output<string[] | undefined>;
    /**
     * Name of the ECS cluster to manage capacity providers for.
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * Set of capacity provider strategies to use by default for the cluster. Detailed below.
     */
    public readonly defaultCapacityProviderStrategies!: pulumi.Output<outputs.ecs.ClusterCapacityProvidersDefaultCapacityProviderStrategy[] | undefined>;

    /**
     * Create a ClusterCapacityProviders resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterCapacityProvidersArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterCapacityProvidersArgs | ClusterCapacityProvidersState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterCapacityProvidersState | undefined;
            resourceInputs["capacityProviders"] = state ? state.capacityProviders : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["defaultCapacityProviderStrategies"] = state ? state.defaultCapacityProviderStrategies : undefined;
        } else {
            const args = argsOrState as ClusterCapacityProvidersArgs | undefined;
            if ((!args || args.clusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterName'");
            }
            resourceInputs["capacityProviders"] = args ? args.capacityProviders : undefined;
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["defaultCapacityProviderStrategies"] = args ? args.defaultCapacityProviderStrategies : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ClusterCapacityProviders.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterCapacityProviders resources.
 */
export interface ClusterCapacityProvidersState {
    /**
     * Set of names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
     */
    capacityProviders?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the ECS cluster to manage capacity providers for.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * Set of capacity provider strategies to use by default for the cluster. Detailed below.
     */
    defaultCapacityProviderStrategies?: pulumi.Input<pulumi.Input<inputs.ecs.ClusterCapacityProvidersDefaultCapacityProviderStrategy>[]>;
}

/**
 * The set of arguments for constructing a ClusterCapacityProviders resource.
 */
export interface ClusterCapacityProvidersArgs {
    /**
     * Set of names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
     */
    capacityProviders?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the ECS cluster to manage capacity providers for.
     */
    clusterName: pulumi.Input<string>;
    /**
     * Set of capacity provider strategies to use by default for the cluster. Detailed below.
     */
    defaultCapacityProviderStrategies?: pulumi.Input<pulumi.Input<inputs.ecs.ClusterCapacityProvidersDefaultCapacityProviderStrategy>[]>;
}
