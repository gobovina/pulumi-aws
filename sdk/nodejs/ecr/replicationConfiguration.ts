// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Elastic Container Registry Replication Configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getCallerIdentity({});
 * const example = aws.getRegions({});
 * const exampleReplicationConfiguration = new aws.ecr.ReplicationConfiguration("example", {replicationConfiguration: {
 *     rules: [{
 *         destinations: [{
 *             region: example.then(example => example.names?.[0]),
 *             registryId: current.then(current => current.accountId),
 *         }],
 *     }],
 * }});
 * ```
 * ## Multiple Region Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getCallerIdentity({});
 * const example = aws.getRegions({});
 * const exampleReplicationConfiguration = new aws.ecr.ReplicationConfiguration("example", {replicationConfiguration: {
 *     rules: [{
 *         destinations: [
 *             {
 *                 region: example.then(example => example.names?.[0]),
 *                 registryId: current.then(current => current.accountId),
 *             },
 *             {
 *                 region: example.then(example => example.names?.[1]),
 *                 registryId: current.then(current => current.accountId),
 *             },
 *         ],
 *     }],
 * }});
 * ```
 *
 * ## Repository Filter Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getCallerIdentity({});
 * const example = aws.getRegions({});
 * const exampleReplicationConfiguration = new aws.ecr.ReplicationConfiguration("example", {replicationConfiguration: {
 *     rules: [{
 *         destinations: [{
 *             region: example.then(example => example.names?.[0]),
 *             registryId: current.then(current => current.accountId),
 *         }],
 *         repositoryFilters: [{
 *             filter: "prod-microservice",
 *             filterType: "PREFIX_MATCH",
 *         }],
 *     }],
 * }});
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import ECR Replication Configuration using the `registry_id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:ecr/replicationConfiguration:ReplicationConfiguration service 012345678912
 * ```
 */
export class ReplicationConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing ReplicationConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ReplicationConfigurationState, opts?: pulumi.CustomResourceOptions): ReplicationConfiguration {
        return new ReplicationConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ecr/replicationConfiguration:ReplicationConfiguration';

    /**
     * Returns true if the given object is an instance of ReplicationConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ReplicationConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ReplicationConfiguration.__pulumiType;
    }

    /**
     * The account ID of the destination registry to replicate to.
     */
    public /*out*/ readonly registryId!: pulumi.Output<string>;
    /**
     * Replication configuration for a registry. See Replication Configuration.
     */
    public readonly replicationConfiguration!: pulumi.Output<outputs.ecr.ReplicationConfigurationReplicationConfiguration | undefined>;

    /**
     * Create a ReplicationConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ReplicationConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ReplicationConfigurationArgs | ReplicationConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ReplicationConfigurationState | undefined;
            resourceInputs["registryId"] = state ? state.registryId : undefined;
            resourceInputs["replicationConfiguration"] = state ? state.replicationConfiguration : undefined;
        } else {
            const args = argsOrState as ReplicationConfigurationArgs | undefined;
            resourceInputs["replicationConfiguration"] = args ? args.replicationConfiguration : undefined;
            resourceInputs["registryId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ReplicationConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ReplicationConfiguration resources.
 */
export interface ReplicationConfigurationState {
    /**
     * The account ID of the destination registry to replicate to.
     */
    registryId?: pulumi.Input<string>;
    /**
     * Replication configuration for a registry. See Replication Configuration.
     */
    replicationConfiguration?: pulumi.Input<inputs.ecr.ReplicationConfigurationReplicationConfiguration>;
}

/**
 * The set of arguments for constructing a ReplicationConfiguration resource.
 */
export interface ReplicationConfigurationArgs {
    /**
     * Replication configuration for a registry. See Replication Configuration.
     */
    replicationConfiguration?: pulumi.Input<inputs.ecr.ReplicationConfigurationReplicationConfiguration>;
}
