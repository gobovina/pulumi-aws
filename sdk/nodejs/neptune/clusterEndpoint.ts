// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an Neptune Cluster Endpoint Resource.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.neptune.ClusterEndpoint("example", {
 *     clusterIdentifier: test.clusterIdentifier,
 *     clusterEndpointIdentifier: "example",
 *     endpointType: "READER",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_neptune_cluster_endpoint` using the `cluster-identifier:endpoint-identfier`. For example:
 *
 * ```sh
 * $ pulumi import aws:neptune/clusterEndpoint:ClusterEndpoint example my-cluster:my-endpoint
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
    public static readonly __pulumiType = 'aws:neptune/clusterEndpoint:ClusterEndpoint';

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
     * The Neptune Cluster Endpoint Amazon Resource Name (ARN).
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The identifier of the endpoint.
     */
    public readonly clusterEndpointIdentifier!: pulumi.Output<string>;
    /**
     * The DB cluster identifier of the DB cluster associated with the endpoint.
     */
    public readonly clusterIdentifier!: pulumi.Output<string>;
    /**
     * The DNS address of the endpoint.
     */
    public /*out*/ readonly endpoint!: pulumi.Output<string>;
    /**
     * The type of the endpoint. One of: `READER`, `WRITER`, `ANY`.
     */
    public readonly endpointType!: pulumi.Output<string>;
    /**
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
     */
    public readonly excludedMembers!: pulumi.Output<string[] | undefined>;
    /**
     * List of DB instance identifiers that are part of the custom endpoint group.
     */
    public readonly staticMembers!: pulumi.Output<string[] | undefined>;
    /**
     * A map of tags to assign to the Neptune cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
            resourceInputs["endpoint"] = state ? state.endpoint : undefined;
            resourceInputs["endpointType"] = state ? state.endpointType : undefined;
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
            if ((!args || args.endpointType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'endpointType'");
            }
            resourceInputs["clusterEndpointIdentifier"] = args ? args.clusterEndpointIdentifier : undefined;
            resourceInputs["clusterIdentifier"] = args ? args.clusterIdentifier : undefined;
            resourceInputs["endpointType"] = args ? args.endpointType : undefined;
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
     * The Neptune Cluster Endpoint Amazon Resource Name (ARN).
     */
    arn?: pulumi.Input<string>;
    /**
     * The identifier of the endpoint.
     */
    clusterEndpointIdentifier?: pulumi.Input<string>;
    /**
     * The DB cluster identifier of the DB cluster associated with the endpoint.
     */
    clusterIdentifier?: pulumi.Input<string>;
    /**
     * The DNS address of the endpoint.
     */
    endpoint?: pulumi.Input<string>;
    /**
     * The type of the endpoint. One of: `READER`, `WRITER`, `ANY`.
     */
    endpointType?: pulumi.Input<string>;
    /**
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
     */
    excludedMembers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of DB instance identifiers that are part of the custom endpoint group.
     */
    staticMembers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A map of tags to assign to the Neptune cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The identifier of the endpoint.
     */
    clusterEndpointIdentifier: pulumi.Input<string>;
    /**
     * The DB cluster identifier of the DB cluster associated with the endpoint.
     */
    clusterIdentifier: pulumi.Input<string>;
    /**
     * The type of the endpoint. One of: `READER`, `WRITER`, `ANY`.
     */
    endpointType: pulumi.Input<string>;
    /**
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
     */
    excludedMembers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of DB instance identifiers that are part of the custom endpoint group.
     */
    staticMembers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A map of tags to assign to the Neptune cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
