// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an RDS DB cluster parameter group resource. Documentation of the available parameters for various Aurora engines can be found at:
 *
 * * [Aurora MySQL Parameters](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Reference.html)
 * * [Aurora PostgreSQL Parameters](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraPostgreSQL.Reference.html)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const _default = new aws.rds.ClusterParameterGroup("default", {
 *     description: "RDS default cluster parameter group",
 *     family: "aurora5.6",
 *     parameters: [
 *         {
 *             name: "character_set_server",
 *             value: "utf8",
 *         },
 *         {
 *             name: "character_set_client",
 *             value: "utf8",
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * In TODO v1.5.0 and later, use an `import` block to import RDS Cluster Parameter Groups using the `name`. For exampleterraform import {
 *
 *  to = aws_rds_cluster_parameter_group.cluster_pg
 *
 *  id = "production-pg-1" } Using `TODO import`, import RDS Cluster Parameter Groups using the `name`. For exampleconsole % TODO import aws_rds_cluster_parameter_group.cluster_pg production-pg-1
 */
export class ClusterParameterGroup extends pulumi.CustomResource {
    /**
     * Get an existing ClusterParameterGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterParameterGroupState, opts?: pulumi.CustomResourceOptions): ClusterParameterGroup {
        return new ClusterParameterGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:rds/clusterParameterGroup:ClusterParameterGroup';

    /**
     * Returns true if the given object is an instance of ClusterParameterGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterParameterGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterParameterGroup.__pulumiType;
    }

    /**
     * The ARN of the db cluster parameter group.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The description of the DB cluster parameter group. Defaults to "Managed by TODO".
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The family of the DB cluster parameter group.
     */
    public readonly family!: pulumi.Output<string>;
    /**
     * The name of the DB parameter.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     */
    public readonly namePrefix!: pulumi.Output<string>;
    /**
     * A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-cluster-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-cluster-parameters.html) after initial creation of the group.
     */
    public readonly parameters!: pulumi.Output<outputs.rds.ClusterParameterGroupParameter[] | undefined>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a ClusterParameterGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterParameterGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterParameterGroupArgs | ClusterParameterGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterParameterGroupState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["family"] = state ? state.family : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namePrefix"] = state ? state.namePrefix : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ClusterParameterGroupArgs | undefined;
            if ((!args || args.family === undefined) && !opts.urn) {
                throw new Error("Missing required property 'family'");
            }
            resourceInputs["description"] = (args ? args.description : undefined) ?? "Managed by Pulumi";
            resourceInputs["family"] = args ? args.family : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namePrefix"] = args ? args.namePrefix : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ClusterParameterGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterParameterGroup resources.
 */
export interface ClusterParameterGroupState {
    /**
     * The ARN of the db cluster parameter group.
     */
    arn?: pulumi.Input<string>;
    /**
     * The description of the DB cluster parameter group. Defaults to "Managed by TODO".
     */
    description?: pulumi.Input<string>;
    /**
     * The family of the DB cluster parameter group.
     */
    family?: pulumi.Input<string>;
    /**
     * The name of the DB parameter.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-cluster-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-cluster-parameters.html) after initial creation of the group.
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.rds.ClusterParameterGroupParameter>[]>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a ClusterParameterGroup resource.
 */
export interface ClusterParameterGroupArgs {
    /**
     * The description of the DB cluster parameter group. Defaults to "Managed by TODO".
     */
    description?: pulumi.Input<string>;
    /**
     * The family of the DB cluster parameter group.
     */
    family: pulumi.Input<string>;
    /**
     * The name of the DB parameter.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-cluster-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-cluster-parameters.html) after initial creation of the group.
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.rds.ClusterParameterGroupParameter>[]>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
