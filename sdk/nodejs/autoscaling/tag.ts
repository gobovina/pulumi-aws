// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages an individual Autoscaling Group (ASG) tag. This resource should only be used in cases where ASGs are created outside the provider (e.g., ASGs implicitly created by EKS Node Groups).
 *
 * > **NOTE:** This tagging resource should not be combined with the resource for managing the parent resource. For example, using `aws.autoscaling.Group` and `aws.autoscaling.Tag` to manage tags of the same ASG will cause a perpetual difference where the `aws.autoscaling.Group` resource will try to remove the tag being added by the `aws.autoscaling.Tag` resource.
 *
 * > **NOTE:** This tagging resource does not use the provider `ignoreTags` configuration.
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_autoscaling_group_tag` using the ASG name and key, separated by a comma (`,`). For example:
 *
 * ```sh
 * $ pulumi import aws:autoscaling/tag:Tag example asg-example,k8s.io/cluster-autoscaler/node-template/label/eks.amazonaws.com/capacityType
 * ```
 */
export class Tag extends pulumi.CustomResource {
    /**
     * Get an existing Tag resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TagState, opts?: pulumi.CustomResourceOptions): Tag {
        return new Tag(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:autoscaling/tag:Tag';

    /**
     * Returns true if the given object is an instance of Tag.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Tag {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Tag.__pulumiType;
    }

    /**
     * Name of the Autoscaling Group to apply the tag to.
     */
    public readonly autoscalingGroupName!: pulumi.Output<string>;
    /**
     * Tag to create. The `tag` block is documented below.
     */
    public readonly tag!: pulumi.Output<outputs.autoscaling.TagTag>;

    /**
     * Create a Tag resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TagArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TagArgs | TagState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TagState | undefined;
            resourceInputs["autoscalingGroupName"] = state ? state.autoscalingGroupName : undefined;
            resourceInputs["tag"] = state ? state.tag : undefined;
        } else {
            const args = argsOrState as TagArgs | undefined;
            if ((!args || args.autoscalingGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'autoscalingGroupName'");
            }
            if ((!args || args.tag === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tag'");
            }
            resourceInputs["autoscalingGroupName"] = args ? args.autoscalingGroupName : undefined;
            resourceInputs["tag"] = args ? args.tag : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Tag.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Tag resources.
 */
export interface TagState {
    /**
     * Name of the Autoscaling Group to apply the tag to.
     */
    autoscalingGroupName?: pulumi.Input<string>;
    /**
     * Tag to create. The `tag` block is documented below.
     */
    tag?: pulumi.Input<inputs.autoscaling.TagTag>;
}

/**
 * The set of arguments for constructing a Tag resource.
 */
export interface TagArgs {
    /**
     * Name of the Autoscaling Group to apply the tag to.
     */
    autoscalingGroupName: pulumi.Input<string>;
    /**
     * Tag to create. The `tag` block is documented below.
     */
    tag: pulumi.Input<inputs.autoscaling.TagTag>;
}
