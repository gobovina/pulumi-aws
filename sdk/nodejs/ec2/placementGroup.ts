// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an EC2 placement group. Read more about placement groups
 * in [AWS Docs](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const web = new aws.ec2.PlacementGroup("web", {
 *     name: "hunky-dory-pg",
 *     strategy: "cluster",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import placement groups using the `name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:ec2/placementGroup:PlacementGroup prod_pg production-placement-group
 * ```
 */
export class PlacementGroup extends pulumi.CustomResource {
    /**
     * Get an existing PlacementGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PlacementGroupState, opts?: pulumi.CustomResourceOptions): PlacementGroup {
        return new PlacementGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/placementGroup:PlacementGroup';

    /**
     * Returns true if the given object is an instance of PlacementGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PlacementGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PlacementGroup.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) of the placement group.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The name of the placement group.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The number of partitions to create in the
     * placement group.  Can only be specified when the `strategy` is set to
     * `partition`.  Valid values are 1 - 7 (default is `2`).
     */
    public readonly partitionCount!: pulumi.Output<number>;
    /**
     * The ID of the placement group.
     */
    public /*out*/ readonly placementGroupId!: pulumi.Output<string>;
    /**
     * Determines how placement groups spread instances. Can only be used
     * when the `strategy` is set to `spread`. Can be `host` or `rack`. `host` can only be used for Outpost placement groups. Defaults to `rack`.
     */
    public readonly spreadLevel!: pulumi.Output<string>;
    /**
     * The placement strategy. Can be `cluster`, `partition` or `spread`.
     */
    public readonly strategy!: pulumi.Output<string>;
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
     * Create a PlacementGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PlacementGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PlacementGroupArgs | PlacementGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PlacementGroupState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["partitionCount"] = state ? state.partitionCount : undefined;
            resourceInputs["placementGroupId"] = state ? state.placementGroupId : undefined;
            resourceInputs["spreadLevel"] = state ? state.spreadLevel : undefined;
            resourceInputs["strategy"] = state ? state.strategy : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as PlacementGroupArgs | undefined;
            if ((!args || args.strategy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'strategy'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["partitionCount"] = args ? args.partitionCount : undefined;
            resourceInputs["spreadLevel"] = args ? args.spreadLevel : undefined;
            resourceInputs["strategy"] = args ? args.strategy : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["placementGroupId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PlacementGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PlacementGroup resources.
 */
export interface PlacementGroupState {
    /**
     * Amazon Resource Name (ARN) of the placement group.
     */
    arn?: pulumi.Input<string>;
    /**
     * The name of the placement group.
     */
    name?: pulumi.Input<string>;
    /**
     * The number of partitions to create in the
     * placement group.  Can only be specified when the `strategy` is set to
     * `partition`.  Valid values are 1 - 7 (default is `2`).
     */
    partitionCount?: pulumi.Input<number>;
    /**
     * The ID of the placement group.
     */
    placementGroupId?: pulumi.Input<string>;
    /**
     * Determines how placement groups spread instances. Can only be used
     * when the `strategy` is set to `spread`. Can be `host` or `rack`. `host` can only be used for Outpost placement groups. Defaults to `rack`.
     */
    spreadLevel?: pulumi.Input<string>;
    /**
     * The placement strategy. Can be `cluster`, `partition` or `spread`.
     */
    strategy?: pulumi.Input<string | enums.ec2.PlacementStrategy>;
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
 * The set of arguments for constructing a PlacementGroup resource.
 */
export interface PlacementGroupArgs {
    /**
     * The name of the placement group.
     */
    name?: pulumi.Input<string>;
    /**
     * The number of partitions to create in the
     * placement group.  Can only be specified when the `strategy` is set to
     * `partition`.  Valid values are 1 - 7 (default is `2`).
     */
    partitionCount?: pulumi.Input<number>;
    /**
     * Determines how placement groups spread instances. Can only be used
     * when the `strategy` is set to `spread`. Can be `host` or `rack`. `host` can only be used for Outpost placement groups. Defaults to `rack`.
     */
    spreadLevel?: pulumi.Input<string>;
    /**
     * The placement strategy. Can be `cluster`, `partition` or `spread`.
     */
    strategy: pulumi.Input<string | enums.ec2.PlacementStrategy>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
