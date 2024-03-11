// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an ECS cluster.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const foo = new aws.ecs.Cluster("foo", {
 *     name: "white-hart",
 *     settings: [{
 *         name: "containerInsights",
 *         value: "enabled",
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Example with Log Configuration
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kms.Key("example", {
 *     description: "example",
 *     deletionWindowInDays: 7,
 * });
 * const exampleLogGroup = new aws.cloudwatch.LogGroup("example", {name: "example"});
 * const test = new aws.ecs.Cluster("test", {
 *     name: "example",
 *     configuration: {
 *         executeCommandConfiguration: {
 *             kmsKeyId: example.arn,
 *             logging: "OVERRIDE",
 *             logConfiguration: {
 *                 cloudWatchEncryptionEnabled: true,
 *                 cloudWatchLogGroupName: exampleLogGroup.name,
 *             },
 *         },
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import ECS clusters using the `name`. For example:
 *
 * ```sh
 * $ pulumi import aws:ecs/cluster:Cluster stateless stateless-app
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
    public static readonly __pulumiType = 'aws:ecs/cluster:Cluster';

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
     * ARN that identifies the cluster.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The execute command configuration for the cluster. Detailed below.
     */
    public readonly configuration!: pulumi.Output<outputs.ecs.ClusterConfiguration | undefined>;
    /**
     * Name of the cluster (up to 255 letters, numbers, hyphens, and underscores)
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Configures a default Service Connect namespace. Detailed below.
     */
    public readonly serviceConnectDefaults!: pulumi.Output<outputs.ecs.ClusterServiceConnectDefaults | undefined>;
    /**
     * Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Detailed below.
     */
    public readonly settings!: pulumi.Output<outputs.ecs.ClusterSetting[]>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

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
            resourceInputs["configuration"] = state ? state.configuration : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["serviceConnectDefaults"] = state ? state.serviceConnectDefaults : undefined;
            resourceInputs["settings"] = state ? state.settings : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ClusterArgs | undefined;
            resourceInputs["configuration"] = args ? args.configuration : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["serviceConnectDefaults"] = args ? args.serviceConnectDefaults : undefined;
            resourceInputs["settings"] = args ? args.settings : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
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
     * ARN that identifies the cluster.
     */
    arn?: pulumi.Input<string>;
    /**
     * The execute command configuration for the cluster. Detailed below.
     */
    configuration?: pulumi.Input<inputs.ecs.ClusterConfiguration>;
    /**
     * Name of the cluster (up to 255 letters, numbers, hyphens, and underscores)
     */
    name?: pulumi.Input<string>;
    /**
     * Configures a default Service Connect namespace. Detailed below.
     */
    serviceConnectDefaults?: pulumi.Input<inputs.ecs.ClusterServiceConnectDefaults>;
    /**
     * Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Detailed below.
     */
    settings?: pulumi.Input<pulumi.Input<inputs.ecs.ClusterSetting>[]>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    /**
     * The execute command configuration for the cluster. Detailed below.
     */
    configuration?: pulumi.Input<inputs.ecs.ClusterConfiguration>;
    /**
     * Name of the cluster (up to 255 letters, numbers, hyphens, and underscores)
     */
    name?: pulumi.Input<string>;
    /**
     * Configures a default Service Connect namespace. Detailed below.
     */
    serviceConnectDefaults?: pulumi.Input<inputs.ecs.ClusterServiceConnectDefaults>;
    /**
     * Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Detailed below.
     */
    settings?: pulumi.Input<pulumi.Input<inputs.ecs.ClusterSetting>[]>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
