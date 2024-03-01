// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS FinSpace Kx Scaling Group.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.finspace.KxScalingGroup("example", {
 *     name: "my-tf-kx-scalinggroup",
 *     environmentId: exampleAwsFinspaceKxEnvironment.id,
 *     availabilityZoneId: "use1-az2",
 *     hostType: "kx.sg.4xlarge",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import an AWS FinSpace Kx Scaling Group using the `id` (environment ID and scaling group name, comma-delimited). For example:
 *
 * ```sh
 *  $ pulumi import aws:finspace/kxScalingGroup:KxScalingGroup example n3ceo7wqxoxcti5tujqwzs,my-tf-kx-scalinggroup
 * ```
 */
export class KxScalingGroup extends pulumi.CustomResource {
    /**
     * Get an existing KxScalingGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KxScalingGroupState, opts?: pulumi.CustomResourceOptions): KxScalingGroup {
        return new KxScalingGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:finspace/kxScalingGroup:KxScalingGroup';

    /**
     * Returns true if the given object is an instance of KxScalingGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KxScalingGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KxScalingGroup.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) identifier of the KX Scaling Group.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The availability zone identifiers for the requested regions.
     */
    public readonly availabilityZoneId!: pulumi.Output<string>;
    /**
     * The list of Managed kdb clusters that are currently active in the given scaling group.
     */
    public /*out*/ readonly clusters!: pulumi.Output<string[]>;
    /**
     * The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */
    public /*out*/ readonly createdTimestamp!: pulumi.Output<string>;
    /**
     * A unique identifier for the kdb environment, where you want to create the scaling group.
     */
    public readonly environmentId!: pulumi.Output<string>;
    /**
     * The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
     *
     * The following arguments are optional:
     */
    public readonly hostType!: pulumi.Output<string>;
    /**
     * Last timestamp at which the scaling group was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
     */
    public /*out*/ readonly lastModifiedTimestamp!: pulumi.Output<string>;
    /**
     * Unique name for the scaling group that you want to create.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The status of scaling group.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The error message when a failed state occurs.
     */
    public /*out*/ readonly statusReason!: pulumi.Output<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. You can add up to 50 tags to a scaling group.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a KxScalingGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KxScalingGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KxScalingGroupArgs | KxScalingGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KxScalingGroupState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["availabilityZoneId"] = state ? state.availabilityZoneId : undefined;
            resourceInputs["clusters"] = state ? state.clusters : undefined;
            resourceInputs["createdTimestamp"] = state ? state.createdTimestamp : undefined;
            resourceInputs["environmentId"] = state ? state.environmentId : undefined;
            resourceInputs["hostType"] = state ? state.hostType : undefined;
            resourceInputs["lastModifiedTimestamp"] = state ? state.lastModifiedTimestamp : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["statusReason"] = state ? state.statusReason : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as KxScalingGroupArgs | undefined;
            if ((!args || args.availabilityZoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'availabilityZoneId'");
            }
            if ((!args || args.environmentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environmentId'");
            }
            if ((!args || args.hostType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostType'");
            }
            resourceInputs["availabilityZoneId"] = args ? args.availabilityZoneId : undefined;
            resourceInputs["environmentId"] = args ? args.environmentId : undefined;
            resourceInputs["hostType"] = args ? args.hostType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["clusters"] = undefined /*out*/;
            resourceInputs["createdTimestamp"] = undefined /*out*/;
            resourceInputs["lastModifiedTimestamp"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["statusReason"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(KxScalingGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KxScalingGroup resources.
 */
export interface KxScalingGroupState {
    /**
     * Amazon Resource Name (ARN) identifier of the KX Scaling Group.
     */
    arn?: pulumi.Input<string>;
    /**
     * The availability zone identifiers for the requested regions.
     */
    availabilityZoneId?: pulumi.Input<string>;
    /**
     * The list of Managed kdb clusters that are currently active in the given scaling group.
     */
    clusters?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */
    createdTimestamp?: pulumi.Input<string>;
    /**
     * A unique identifier for the kdb environment, where you want to create the scaling group.
     */
    environmentId?: pulumi.Input<string>;
    /**
     * The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
     *
     * The following arguments are optional:
     */
    hostType?: pulumi.Input<string>;
    /**
     * Last timestamp at which the scaling group was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
     */
    lastModifiedTimestamp?: pulumi.Input<string>;
    /**
     * Unique name for the scaling group that you want to create.
     */
    name?: pulumi.Input<string>;
    /**
     * The status of scaling group.
     */
    status?: pulumi.Input<string>;
    /**
     * The error message when a failed state occurs.
     */
    statusReason?: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. You can add up to 50 tags to a scaling group.
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
 * The set of arguments for constructing a KxScalingGroup resource.
 */
export interface KxScalingGroupArgs {
    /**
     * The availability zone identifiers for the requested regions.
     */
    availabilityZoneId: pulumi.Input<string>;
    /**
     * A unique identifier for the kdb environment, where you want to create the scaling group.
     */
    environmentId: pulumi.Input<string>;
    /**
     * The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
     *
     * The following arguments are optional:
     */
    hostType: pulumi.Input<string>;
    /**
     * Unique name for the scaling group that you want to create.
     */
    name?: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. You can add up to 50 tags to a scaling group.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
