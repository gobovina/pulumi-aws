// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a resource for managing a replication set in AWS Systems Manager Incident Manager.
 *
 * > **NOTE:** Deleting a replication set also deletes all Incident Manager related data including response plans, incident records, contacts and escalation plans.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * Create a replication set.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const replicationSetName = new aws.ssmincidents.ReplicationSet("replicationSetName", {
 *     regions: [{
 *         name: "us-west-2",
 *     }],
 *     tags: {
 *         exampleTag: "exampleValue",
 *     },
 * });
 * ```
 *
 * Add a Region to a replication set. (You can add only one Region at a time.)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const replicationSetName = new aws.ssmincidents.ReplicationSet("replicationSetName", {regions: [
 *     {
 *         name: "us-west-2",
 *     },
 *     {
 *         name: "ap-southeast-2",
 *     },
 * ]});
 * ```
 *
 * Delete a Region from a replication set. (You can delete only one Region at a time.)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const replicationSetName = new aws.ssmincidents.ReplicationSet("replicationSetName", {regions: [{
 *     name: "us-west-2",
 * }]});
 * ```
 * ## Basic Usage with an AWS Customer Managed Key
 *
 * Create a replication set with an AWS Key Management Service (AWS KMS) customer manager key:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleKey = new aws.kms.Key("example_key", {});
 * const replicationSetName = new aws.ssmincidents.ReplicationSet("replicationSetName", {
 *     regions: [{
 *         name: "us-west-2",
 *         kmsKeyArn: exampleKey.arn,
 *     }],
 *     tags: {
 *         exampleTag: "exampleValue",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import an Incident Manager replication. For example:
 *
 * ```sh
 *  $ pulumi import aws:ssmincidents/replicationSet:ReplicationSet replicationSetName import
 * ```
 */
export class ReplicationSet extends pulumi.CustomResource {
    /**
     * Get an existing ReplicationSet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ReplicationSetState, opts?: pulumi.CustomResourceOptions): ReplicationSet {
        return new ReplicationSet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ssmincidents/replicationSet:ReplicationSet';

    /**
     * Returns true if the given object is an instance of ReplicationSet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ReplicationSet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ReplicationSet.__pulumiType;
    }

    /**
     * The ARN of the replication set.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The ARN of the user who created the replication set.
     */
    public /*out*/ readonly createdBy!: pulumi.Output<string>;
    /**
     * If `true`, the last region in a replication set cannot be deleted.
     */
    public /*out*/ readonly deletionProtected!: pulumi.Output<boolean>;
    /**
     * A timestamp showing when the replication set was last modified.
     */
    public /*out*/ readonly lastModifiedBy!: pulumi.Output<string>;
    public readonly regions!: pulumi.Output<outputs.ssmincidents.ReplicationSetRegion[]>;
    /**
     * The current status of the Region.
     * * Valid Values: `ACTIVE` | `CREATING` | `UPDATING` | `DELETING` | `FAILED`
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Tags applied to the replication set.
     *
     * For information about the maximum allowed number of Regions and tag value constraints, see [CreateReplicationSet in the *AWS Systems Manager Incident Manager API Reference*](https://docs.aws.amazon.com/incident-manager/latest/APIReference/API_CreateReplicationSet.html).
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a ReplicationSet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ReplicationSetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ReplicationSetArgs | ReplicationSetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ReplicationSetState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["createdBy"] = state ? state.createdBy : undefined;
            resourceInputs["deletionProtected"] = state ? state.deletionProtected : undefined;
            resourceInputs["lastModifiedBy"] = state ? state.lastModifiedBy : undefined;
            resourceInputs["regions"] = state ? state.regions : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ReplicationSetArgs | undefined;
            if ((!args || args.regions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'regions'");
            }
            resourceInputs["regions"] = args ? args.regions : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdBy"] = undefined /*out*/;
            resourceInputs["deletionProtected"] = undefined /*out*/;
            resourceInputs["lastModifiedBy"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ReplicationSet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ReplicationSet resources.
 */
export interface ReplicationSetState {
    /**
     * The ARN of the replication set.
     */
    arn?: pulumi.Input<string>;
    /**
     * The ARN of the user who created the replication set.
     */
    createdBy?: pulumi.Input<string>;
    /**
     * If `true`, the last region in a replication set cannot be deleted.
     */
    deletionProtected?: pulumi.Input<boolean>;
    /**
     * A timestamp showing when the replication set was last modified.
     */
    lastModifiedBy?: pulumi.Input<string>;
    regions?: pulumi.Input<pulumi.Input<inputs.ssmincidents.ReplicationSetRegion>[]>;
    /**
     * The current status of the Region.
     * * Valid Values: `ACTIVE` | `CREATING` | `UPDATING` | `DELETING` | `FAILED`
     */
    status?: pulumi.Input<string>;
    /**
     * Tags applied to the replication set.
     *
     * For information about the maximum allowed number of Regions and tag value constraints, see [CreateReplicationSet in the *AWS Systems Manager Incident Manager API Reference*](https://docs.aws.amazon.com/incident-manager/latest/APIReference/API_CreateReplicationSet.html).
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
 * The set of arguments for constructing a ReplicationSet resource.
 */
export interface ReplicationSetArgs {
    regions: pulumi.Input<pulumi.Input<inputs.ssmincidents.ReplicationSetRegion>[]>;
    /**
     * Tags applied to the replication set.
     *
     * For information about the maximum allowed number of Regions and tag value constraints, see [CreateReplicationSet in the *AWS Systems Manager Incident Manager API Reference*](https://docs.aws.amazon.com/incident-manager/latest/APIReference/API_CreateReplicationSet.html).
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
