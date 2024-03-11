// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Synthetics Group Association resource.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.synthetics.GroupAssociation("example", {
 *     groupName: exampleAwsSyntheticsGroup.name,
 *     canaryArn: exampleAwsSyntheticsCanary.arn,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import CloudWatch Synthetics Group Association using the `canary_arn,group_name`. For example:
 *
 * ```sh
 * $ pulumi import aws:synthetics/groupAssociation:GroupAssociation example arn:aws:synthetics:us-west-2:123456789012:canary:tf-acc-test-abcd1234,examplename
 * ```
 */
export class GroupAssociation extends pulumi.CustomResource {
    /**
     * Get an existing GroupAssociation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupAssociationState, opts?: pulumi.CustomResourceOptions): GroupAssociation {
        return new GroupAssociation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:synthetics/groupAssociation:GroupAssociation';

    /**
     * Returns true if the given object is an instance of GroupAssociation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GroupAssociation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GroupAssociation.__pulumiType;
    }

    /**
     * ARN of the canary.
     */
    public readonly canaryArn!: pulumi.Output<string>;
    public /*out*/ readonly groupArn!: pulumi.Output<string>;
    /**
     * ID of the Group.
     */
    public /*out*/ readonly groupId!: pulumi.Output<string>;
    /**
     * Name of the group that the canary will be associated with.
     */
    public readonly groupName!: pulumi.Output<string>;

    /**
     * Create a GroupAssociation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GroupAssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GroupAssociationArgs | GroupAssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GroupAssociationState | undefined;
            resourceInputs["canaryArn"] = state ? state.canaryArn : undefined;
            resourceInputs["groupArn"] = state ? state.groupArn : undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["groupName"] = state ? state.groupName : undefined;
        } else {
            const args = argsOrState as GroupAssociationArgs | undefined;
            if ((!args || args.canaryArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'canaryArn'");
            }
            if ((!args || args.groupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupName'");
            }
            resourceInputs["canaryArn"] = args ? args.canaryArn : undefined;
            resourceInputs["groupName"] = args ? args.groupName : undefined;
            resourceInputs["groupArn"] = undefined /*out*/;
            resourceInputs["groupId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GroupAssociation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GroupAssociation resources.
 */
export interface GroupAssociationState {
    /**
     * ARN of the canary.
     */
    canaryArn?: pulumi.Input<string>;
    groupArn?: pulumi.Input<string>;
    /**
     * ID of the Group.
     */
    groupId?: pulumi.Input<string>;
    /**
     * Name of the group that the canary will be associated with.
     */
    groupName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GroupAssociation resource.
 */
export interface GroupAssociationArgs {
    /**
     * ARN of the canary.
     */
    canaryArn: pulumi.Input<string>;
    /**
     * Name of the group that the canary will be associated with.
     */
    groupName: pulumi.Input<string>;
}
