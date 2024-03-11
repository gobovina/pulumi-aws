// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a SageMaker Space resource.
 *
 * ## Example Usage
 *
 * ### Basic usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.sagemaker.Space("example", {
 *     domainId: test.id,
 *     spaceName: "example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import SageMaker Spaces using the `id`. For example:
 *
 * ```sh
 * $ pulumi import aws:sagemaker/space:Space test_space arn:aws:sagemaker:us-west-2:123456789012:space/domain-id/space-name
 * ```
 */
export class Space extends pulumi.CustomResource {
    /**
     * Get an existing Space resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SpaceState, opts?: pulumi.CustomResourceOptions): Space {
        return new Space(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:sagemaker/space:Space';

    /**
     * Returns true if the given object is an instance of Space.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Space {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Space.__pulumiType;
    }

    /**
     * The space's Amazon Resource Name (ARN).
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The ID of the associated Domain.
     */
    public readonly domainId!: pulumi.Output<string>;
    /**
     * The ID of the space's profile in the Amazon Elastic File System volume.
     */
    public /*out*/ readonly homeEfsFileSystemUid!: pulumi.Output<string>;
    /**
     * A collection of ownership settings. See Ownership Settings below.
     */
    public readonly ownershipSettings!: pulumi.Output<outputs.sagemaker.SpaceOwnershipSettings | undefined>;
    /**
     * The name of the space that appears in the SageMaker Studio UI.
     */
    public readonly spaceDisplayName!: pulumi.Output<string | undefined>;
    /**
     * The name of the space.
     */
    public readonly spaceName!: pulumi.Output<string>;
    /**
     * A collection of space settings. See Space Settings below.
     */
    public readonly spaceSettings!: pulumi.Output<outputs.sagemaker.SpaceSpaceSettings | undefined>;
    /**
     * A collection of space sharing settings. See Space Sharing Settings below.
     */
    public readonly spaceSharingSettings!: pulumi.Output<outputs.sagemaker.SpaceSpaceSharingSettings | undefined>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Returns the URL of the space. If the space is created with Amazon Web Services IAM Identity Center (Successor to Amazon Web Services Single Sign-On) authentication, users can navigate to the URL after appending the respective redirect parameter for the application type to be federated through Amazon Web Services IAM Identity Center.
     */
    public /*out*/ readonly url!: pulumi.Output<string>;

    /**
     * Create a Space resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SpaceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SpaceArgs | SpaceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SpaceState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["domainId"] = state ? state.domainId : undefined;
            resourceInputs["homeEfsFileSystemUid"] = state ? state.homeEfsFileSystemUid : undefined;
            resourceInputs["ownershipSettings"] = state ? state.ownershipSettings : undefined;
            resourceInputs["spaceDisplayName"] = state ? state.spaceDisplayName : undefined;
            resourceInputs["spaceName"] = state ? state.spaceName : undefined;
            resourceInputs["spaceSettings"] = state ? state.spaceSettings : undefined;
            resourceInputs["spaceSharingSettings"] = state ? state.spaceSharingSettings : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as SpaceArgs | undefined;
            if ((!args || args.domainId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domainId'");
            }
            if ((!args || args.spaceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'spaceName'");
            }
            resourceInputs["domainId"] = args ? args.domainId : undefined;
            resourceInputs["ownershipSettings"] = args ? args.ownershipSettings : undefined;
            resourceInputs["spaceDisplayName"] = args ? args.spaceDisplayName : undefined;
            resourceInputs["spaceName"] = args ? args.spaceName : undefined;
            resourceInputs["spaceSettings"] = args ? args.spaceSettings : undefined;
            resourceInputs["spaceSharingSettings"] = args ? args.spaceSharingSettings : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["homeEfsFileSystemUid"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["url"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Space.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Space resources.
 */
export interface SpaceState {
    /**
     * The space's Amazon Resource Name (ARN).
     */
    arn?: pulumi.Input<string>;
    /**
     * The ID of the associated Domain.
     */
    domainId?: pulumi.Input<string>;
    /**
     * The ID of the space's profile in the Amazon Elastic File System volume.
     */
    homeEfsFileSystemUid?: pulumi.Input<string>;
    /**
     * A collection of ownership settings. See Ownership Settings below.
     */
    ownershipSettings?: pulumi.Input<inputs.sagemaker.SpaceOwnershipSettings>;
    /**
     * The name of the space that appears in the SageMaker Studio UI.
     */
    spaceDisplayName?: pulumi.Input<string>;
    /**
     * The name of the space.
     */
    spaceName?: pulumi.Input<string>;
    /**
     * A collection of space settings. See Space Settings below.
     */
    spaceSettings?: pulumi.Input<inputs.sagemaker.SpaceSpaceSettings>;
    /**
     * A collection of space sharing settings. See Space Sharing Settings below.
     */
    spaceSharingSettings?: pulumi.Input<inputs.sagemaker.SpaceSpaceSharingSettings>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Returns the URL of the space. If the space is created with Amazon Web Services IAM Identity Center (Successor to Amazon Web Services Single Sign-On) authentication, users can navigate to the URL after appending the respective redirect parameter for the application type to be federated through Amazon Web Services IAM Identity Center.
     */
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Space resource.
 */
export interface SpaceArgs {
    /**
     * The ID of the associated Domain.
     */
    domainId: pulumi.Input<string>;
    /**
     * A collection of ownership settings. See Ownership Settings below.
     */
    ownershipSettings?: pulumi.Input<inputs.sagemaker.SpaceOwnershipSettings>;
    /**
     * The name of the space that appears in the SageMaker Studio UI.
     */
    spaceDisplayName?: pulumi.Input<string>;
    /**
     * The name of the space.
     */
    spaceName: pulumi.Input<string>;
    /**
     * A collection of space settings. See Space Settings below.
     */
    spaceSettings?: pulumi.Input<inputs.sagemaker.SpaceSpaceSettings>;
    /**
     * A collection of space sharing settings. See Space Sharing Settings below.
     */
    spaceSharingSettings?: pulumi.Input<inputs.sagemaker.SpaceSpaceSharingSettings>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
