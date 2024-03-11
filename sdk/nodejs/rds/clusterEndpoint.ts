// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an RDS Aurora Cluster Endpoint.
 * You can refer to the [User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Overview.Endpoints.html#Aurora.Endpoints.Cluster).
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const _default = new aws.rds.Cluster("default", {
 *     clusterIdentifier: "aurora-cluster-demo",
 *     availabilityZones: [
 *         "us-west-2a",
 *         "us-west-2b",
 *         "us-west-2c",
 *     ],
 *     databaseName: "mydb",
 *     masterUsername: "foo",
 *     masterPassword: "bar",
 *     backupRetentionPeriod: 5,
 *     preferredBackupWindow: "07:00-09:00",
 * });
 * const test1 = new aws.rds.ClusterInstance("test1", {
 *     applyImmediately: true,
 *     clusterIdentifier: _default.id,
 *     identifier: "test1",
 *     instanceClass: "db.t2.small",
 *     engine: _default.engine,
 *     engineVersion: _default.engineVersion,
 * });
 * const test2 = new aws.rds.ClusterInstance("test2", {
 *     applyImmediately: true,
 *     clusterIdentifier: _default.id,
 *     identifier: "test2",
 *     instanceClass: "db.t2.small",
 *     engine: _default.engine,
 *     engineVersion: _default.engineVersion,
 * });
 * const test3 = new aws.rds.ClusterInstance("test3", {
 *     applyImmediately: true,
 *     clusterIdentifier: _default.id,
 *     identifier: "test3",
 *     instanceClass: "db.t2.small",
 *     engine: _default.engine,
 *     engineVersion: _default.engineVersion,
 * });
 * const eligible = new aws.rds.ClusterEndpoint("eligible", {
 *     clusterIdentifier: _default.id,
 *     clusterEndpointIdentifier: "reader",
 *     customEndpointType: "READER",
 *     excludedMembers: [
 *         test1.id,
 *         test2.id,
 *     ],
 * });
 * const static = new aws.rds.ClusterEndpoint("static", {
 *     clusterIdentifier: _default.id,
 *     clusterEndpointIdentifier: "static",
 *     customEndpointType: "READER",
 *     staticMembers: [
 *         test1.id,
 *         test3.id,
 *     ],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import RDS Clusters Endpoint using the `cluster_endpoint_identifier`. For example:
 *
 * ```sh
 * $ pulumi import aws:rds/clusterEndpoint:ClusterEndpoint custom_reader aurora-prod-cluster-custom-reader
 * ```
 */
export class ClusterEndpoint extends pulumi.CustomResource {
    /**
     * Get an existing ClusterEndpoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterEndpointState, opts?: pulumi.CustomResourceOptions): ClusterEndpoint {
        return new ClusterEndpoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:rds/clusterEndpoint:ClusterEndpoint';

    /**
     * Returns true if the given object is an instance of ClusterEndpoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterEndpoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterEndpoint.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) of cluster
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
     */
    public readonly clusterEndpointIdentifier!: pulumi.Output<string>;
    /**
     * The cluster identifier.
     */
    public readonly clusterIdentifier!: pulumi.Output<string>;
    /**
     * The type of the endpoint. One of: READER , ANY .
     */
    public readonly customEndpointType!: pulumi.Output<string>;
    /**
     * A custom endpoint for the Aurora cluster
     */
    public /*out*/ readonly endpoint!: pulumi.Output<string>;
    /**
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `staticMembers`.
     */
    public readonly excludedMembers!: pulumi.Output<string[] | undefined>;
    /**
     * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excludedMembers`.
     */
    public readonly staticMembers!: pulumi.Output<string[] | undefined>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a ClusterEndpoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterEndpointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterEndpointArgs | ClusterEndpointState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterEndpointState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["clusterEndpointIdentifier"] = state ? state.clusterEndpointIdentifier : undefined;
            resourceInputs["clusterIdentifier"] = state ? state.clusterIdentifier : undefined;
            resourceInputs["customEndpointType"] = state ? state.customEndpointType : undefined;
            resourceInputs["endpoint"] = state ? state.endpoint : undefined;
            resourceInputs["excludedMembers"] = state ? state.excludedMembers : undefined;
            resourceInputs["staticMembers"] = state ? state.staticMembers : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ClusterEndpointArgs | undefined;
            if ((!args || args.clusterEndpointIdentifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterEndpointIdentifier'");
            }
            if ((!args || args.clusterIdentifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterIdentifier'");
            }
            if ((!args || args.customEndpointType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'customEndpointType'");
            }
            resourceInputs["clusterEndpointIdentifier"] = args ? args.clusterEndpointIdentifier : undefined;
            resourceInputs["clusterIdentifier"] = args ? args.clusterIdentifier : undefined;
            resourceInputs["customEndpointType"] = args ? args.customEndpointType : undefined;
            resourceInputs["excludedMembers"] = args ? args.excludedMembers : undefined;
            resourceInputs["staticMembers"] = args ? args.staticMembers : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["endpoint"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ClusterEndpoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterEndpoint resources.
 */
export interface ClusterEndpointState {
    /**
     * Amazon Resource Name (ARN) of cluster
     */
    arn?: pulumi.Input<string>;
    /**
     * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
     */
    clusterEndpointIdentifier?: pulumi.Input<string>;
    /**
     * The cluster identifier.
     */
    clusterIdentifier?: pulumi.Input<string>;
    /**
     * The type of the endpoint. One of: READER , ANY .
     */
    customEndpointType?: pulumi.Input<string>;
    /**
     * A custom endpoint for the Aurora cluster
     */
    endpoint?: pulumi.Input<string>;
    /**
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `staticMembers`.
     */
    excludedMembers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excludedMembers`.
     */
    staticMembers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
 * The set of arguments for constructing a ClusterEndpoint resource.
 */
export interface ClusterEndpointArgs {
    /**
     * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
     */
    clusterEndpointIdentifier: pulumi.Input<string>;
    /**
     * The cluster identifier.
     */
    clusterIdentifier: pulumi.Input<string>;
    /**
     * The type of the endpoint. One of: READER , ANY .
     */
    customEndpointType: pulumi.Input<string>;
    /**
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `staticMembers`.
     */
    excludedMembers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excludedMembers`.
     */
    staticMembers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
