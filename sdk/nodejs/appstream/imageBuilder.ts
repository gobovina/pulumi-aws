// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an AppStream image builder.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const testFleet = new aws.appstream.ImageBuilder("testFleet", {
 *     description: "Description of a ImageBuilder",
 *     displayName: "Display name of a ImageBuilder",
 *     enableDefaultInternetAccess: false,
 *     imageName: "AppStream-WinServer2019-10-05-2022",
 *     instanceType: "stream.standard.large",
 *     vpcConfig: {
 *         subnetIds: [aws_subnet.example.id],
 *     },
 *     tags: {
 *         Name: "Example Image Builder",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_appstream_image_builder` using the `name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:appstream/imageBuilder:ImageBuilder example imageBuilderExample
 * ```
 */
export class ImageBuilder extends pulumi.CustomResource {
    /**
     * Get an existing ImageBuilder resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ImageBuilderState, opts?: pulumi.CustomResourceOptions): ImageBuilder {
        return new ImageBuilder(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:appstream/imageBuilder:ImageBuilder';

    /**
     * Returns true if the given object is an instance of ImageBuilder.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ImageBuilder {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ImageBuilder.__pulumiType;
    }

    /**
     * Set of interface VPC endpoint (interface endpoint) objects. Maximum of 4. See below.
     */
    public readonly accessEndpoints!: pulumi.Output<outputs.appstream.ImageBuilderAccessEndpoint[] | undefined>;
    /**
     * Version of the AppStream 2.0 agent to use for this image builder.
     */
    public readonly appstreamAgentVersion!: pulumi.Output<string>;
    /**
     * ARN of the appstream image builder.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Date and time, in UTC and extended RFC 3339 format, when the image builder was created.
     */
    public /*out*/ readonly createdTime!: pulumi.Output<string>;
    /**
     * Description to display.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Human-readable friendly name for the AppStream image builder.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Configuration block for the name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. See below.
     */
    public readonly domainJoinInfo!: pulumi.Output<outputs.appstream.ImageBuilderDomainJoinInfo>;
    /**
     * Enables or disables default internet access for the image builder.
     */
    public readonly enableDefaultInternetAccess!: pulumi.Output<boolean>;
    /**
     * ARN of the IAM role to apply to the image builder.
     */
    public readonly iamRoleArn!: pulumi.Output<string>;
    /**
     * ARN of the public, private, or shared image to use.
     */
    public readonly imageArn!: pulumi.Output<string>;
    /**
     * Name of the image used to create the image builder.
     */
    public readonly imageName!: pulumi.Output<string>;
    /**
     * Instance type to use when launching the image builder.
     */
    public readonly instanceType!: pulumi.Output<string>;
    /**
     * Unique name for the image builder.
     *
     * The following arguments are optional:
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * State of the image builder. Can be: `PENDING`, `UPDATING_AGENT`, `RUNNING`, `STOPPING`, `STOPPED`, `REBOOTING`, `SNAPSHOTTING`, `DELETING`, `FAILED`, `UPDATING`, `PENDING_QUALIFICATION`
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Map of tags to assign to the instance. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Configuration block for the VPC configuration for the image builder. See below.
     */
    public readonly vpcConfig!: pulumi.Output<outputs.appstream.ImageBuilderVpcConfig>;

    /**
     * Create a ImageBuilder resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ImageBuilderArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ImageBuilderArgs | ImageBuilderState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ImageBuilderState | undefined;
            resourceInputs["accessEndpoints"] = state ? state.accessEndpoints : undefined;
            resourceInputs["appstreamAgentVersion"] = state ? state.appstreamAgentVersion : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["createdTime"] = state ? state.createdTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["domainJoinInfo"] = state ? state.domainJoinInfo : undefined;
            resourceInputs["enableDefaultInternetAccess"] = state ? state.enableDefaultInternetAccess : undefined;
            resourceInputs["iamRoleArn"] = state ? state.iamRoleArn : undefined;
            resourceInputs["imageArn"] = state ? state.imageArn : undefined;
            resourceInputs["imageName"] = state ? state.imageName : undefined;
            resourceInputs["instanceType"] = state ? state.instanceType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["vpcConfig"] = state ? state.vpcConfig : undefined;
        } else {
            const args = argsOrState as ImageBuilderArgs | undefined;
            if ((!args || args.instanceType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceType'");
            }
            resourceInputs["accessEndpoints"] = args ? args.accessEndpoints : undefined;
            resourceInputs["appstreamAgentVersion"] = args ? args.appstreamAgentVersion : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["domainJoinInfo"] = args ? args.domainJoinInfo : undefined;
            resourceInputs["enableDefaultInternetAccess"] = args ? args.enableDefaultInternetAccess : undefined;
            resourceInputs["iamRoleArn"] = args ? args.iamRoleArn : undefined;
            resourceInputs["imageArn"] = args ? args.imageArn : undefined;
            resourceInputs["imageName"] = args ? args.imageName : undefined;
            resourceInputs["instanceType"] = args ? args.instanceType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcConfig"] = args ? args.vpcConfig : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdTime"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ImageBuilder.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ImageBuilder resources.
 */
export interface ImageBuilderState {
    /**
     * Set of interface VPC endpoint (interface endpoint) objects. Maximum of 4. See below.
     */
    accessEndpoints?: pulumi.Input<pulumi.Input<inputs.appstream.ImageBuilderAccessEndpoint>[]>;
    /**
     * Version of the AppStream 2.0 agent to use for this image builder.
     */
    appstreamAgentVersion?: pulumi.Input<string>;
    /**
     * ARN of the appstream image builder.
     */
    arn?: pulumi.Input<string>;
    /**
     * Date and time, in UTC and extended RFC 3339 format, when the image builder was created.
     */
    createdTime?: pulumi.Input<string>;
    /**
     * Description to display.
     */
    description?: pulumi.Input<string>;
    /**
     * Human-readable friendly name for the AppStream image builder.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Configuration block for the name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. See below.
     */
    domainJoinInfo?: pulumi.Input<inputs.appstream.ImageBuilderDomainJoinInfo>;
    /**
     * Enables or disables default internet access for the image builder.
     */
    enableDefaultInternetAccess?: pulumi.Input<boolean>;
    /**
     * ARN of the IAM role to apply to the image builder.
     */
    iamRoleArn?: pulumi.Input<string>;
    /**
     * ARN of the public, private, or shared image to use.
     */
    imageArn?: pulumi.Input<string>;
    /**
     * Name of the image used to create the image builder.
     */
    imageName?: pulumi.Input<string>;
    /**
     * Instance type to use when launching the image builder.
     */
    instanceType?: pulumi.Input<string>;
    /**
     * Unique name for the image builder.
     *
     * The following arguments are optional:
     */
    name?: pulumi.Input<string>;
    /**
     * State of the image builder. Can be: `PENDING`, `UPDATING_AGENT`, `RUNNING`, `STOPPING`, `STOPPED`, `REBOOTING`, `SNAPSHOTTING`, `DELETING`, `FAILED`, `UPDATING`, `PENDING_QUALIFICATION`
     */
    state?: pulumi.Input<string>;
    /**
     * Map of tags to assign to the instance. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configuration block for the VPC configuration for the image builder. See below.
     */
    vpcConfig?: pulumi.Input<inputs.appstream.ImageBuilderVpcConfig>;
}

/**
 * The set of arguments for constructing a ImageBuilder resource.
 */
export interface ImageBuilderArgs {
    /**
     * Set of interface VPC endpoint (interface endpoint) objects. Maximum of 4. See below.
     */
    accessEndpoints?: pulumi.Input<pulumi.Input<inputs.appstream.ImageBuilderAccessEndpoint>[]>;
    /**
     * Version of the AppStream 2.0 agent to use for this image builder.
     */
    appstreamAgentVersion?: pulumi.Input<string>;
    /**
     * Description to display.
     */
    description?: pulumi.Input<string>;
    /**
     * Human-readable friendly name for the AppStream image builder.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Configuration block for the name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. See below.
     */
    domainJoinInfo?: pulumi.Input<inputs.appstream.ImageBuilderDomainJoinInfo>;
    /**
     * Enables or disables default internet access for the image builder.
     */
    enableDefaultInternetAccess?: pulumi.Input<boolean>;
    /**
     * ARN of the IAM role to apply to the image builder.
     */
    iamRoleArn?: pulumi.Input<string>;
    /**
     * ARN of the public, private, or shared image to use.
     */
    imageArn?: pulumi.Input<string>;
    /**
     * Name of the image used to create the image builder.
     */
    imageName?: pulumi.Input<string>;
    /**
     * Instance type to use when launching the image builder.
     */
    instanceType: pulumi.Input<string>;
    /**
     * Unique name for the image builder.
     *
     * The following arguments are optional:
     */
    name?: pulumi.Input<string>;
    /**
     * Map of tags to assign to the instance. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configuration block for the VPC configuration for the image builder. See below.
     */
    vpcConfig?: pulumi.Input<inputs.appstream.ImageBuilderVpcConfig>;
}
