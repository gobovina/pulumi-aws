// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an individual ECS resource tag. This resource should only be used in cases where ECS resources are created outside the provider (e.g., ECS Clusters implicitly created by Batch Compute Environments).
 *
 * > **NOTE:** This tagging resource should not be combined with the resource for managing the parent resource. For example, using `aws.ecs.Cluster` and `aws.ecs.Tag` to manage tags of the same ECS Cluster will cause a perpetual difference where the `aws.ecs.Cluster` resource will try to remove the tag being added by the `aws.ecs.Tag` resource.
 *
 * > **NOTE:** This tagging resource does not use the provider `ignoreTags` configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleComputeEnvironment = new aws.batch.ComputeEnvironment("exampleComputeEnvironment", {
 *     computeEnvironmentName: "example",
 *     serviceRole: aws_iam_role.example.arn,
 *     type: "UNMANAGED",
 * });
 * const exampleTag = new aws.ecs.Tag("exampleTag", {
 *     resourceArn: exampleComputeEnvironment.ecsClusterArn,
 *     key: "Name",
 *     value: "Hello World",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_ecs_tag` using the ECS resource identifier and key, separated by a comma (`,`). For example:
 *
 * ```sh
 *  $ pulumi import aws:ecs/tag:Tag example arn:aws:ecs:us-east-1:123456789012:cluster/example,Name
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
    public static readonly __pulumiType = 'aws:ecs/tag:Tag';

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
     * Tag name.
     */
    public readonly key!: pulumi.Output<string>;
    /**
     * Amazon Resource Name (ARN) of the ECS resource to tag.
     */
    public readonly resourceArn!: pulumi.Output<string>;
    /**
     * Tag value.
     */
    public readonly value!: pulumi.Output<string>;

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
            resourceInputs["key"] = state ? state.key : undefined;
            resourceInputs["resourceArn"] = state ? state.resourceArn : undefined;
            resourceInputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as TagArgs | undefined;
            if ((!args || args.key === undefined) && !opts.urn) {
                throw new Error("Missing required property 'key'");
            }
            if ((!args || args.resourceArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceArn'");
            }
            if ((!args || args.value === undefined) && !opts.urn) {
                throw new Error("Missing required property 'value'");
            }
            resourceInputs["key"] = args ? args.key : undefined;
            resourceInputs["resourceArn"] = args ? args.resourceArn : undefined;
            resourceInputs["value"] = args ? args.value : undefined;
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
     * Tag name.
     */
    key?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the ECS resource to tag.
     */
    resourceArn?: pulumi.Input<string>;
    /**
     * Tag value.
     */
    value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Tag resource.
 */
export interface TagArgs {
    /**
     * Tag name.
     */
    key: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the ECS resource to tag.
     */
    resourceArn: pulumi.Input<string>;
    /**
     * Tag value.
     */
    value: pulumi.Input<string>;
}
