// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages an Image Builder Image Recipe.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.imagebuilder.ImageRecipe("example", {
 *     blockDeviceMappings: [{
 *         deviceName: "/dev/xvdb",
 *         ebs: {
 *             deleteOnTermination: "true",
 *             volumeSize: 100,
 *             volumeType: "gp2",
 *         },
 *     }],
 *     components: [{
 *         componentArn: aws_imagebuilder_component.example.arn,
 *         parameters: [
 *             {
 *                 name: "Parameter1",
 *                 value: "Value1",
 *             },
 *             {
 *                 name: "Parameter2",
 *                 value: "Value2",
 *             },
 *         ],
 *     }],
 *     parentImage: `arn:${data.aws_partition.current.partition}:imagebuilder:${data.aws_region.current.name}:aws:image/amazon-linux-2-x86/x.x.x`,
 *     version: "1.0.0",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_imagebuilder_image_recipe` resources using the Amazon Resource Name (ARN). For example:
 *
 * ```sh
 *  $ pulumi import aws:imagebuilder/imageRecipe:ImageRecipe example arn:aws:imagebuilder:us-east-1:123456789012:image-recipe/example/1.0.0
 * ```
 */
export class ImageRecipe extends pulumi.CustomResource {
    /**
     * Get an existing ImageRecipe resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ImageRecipeState, opts?: pulumi.CustomResourceOptions): ImageRecipe {
        return new ImageRecipe(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:imagebuilder/imageRecipe:ImageRecipe';

    /**
     * Returns true if the given object is an instance of ImageRecipe.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ImageRecipe {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ImageRecipe.__pulumiType;
    }

    /**
     * (Required) Amazon Resource Name (ARN) of the image recipe.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Configuration block(s) with block device mappings for the image recipe. Detailed below.
     */
    public readonly blockDeviceMappings!: pulumi.Output<outputs.imagebuilder.ImageRecipeBlockDeviceMapping[] | undefined>;
    /**
     * Ordered configuration block(s) with components for the image recipe. Detailed below.
     */
    public readonly components!: pulumi.Output<outputs.imagebuilder.ImageRecipeComponent[]>;
    /**
     * Date the image recipe was created.
     */
    public /*out*/ readonly dateCreated!: pulumi.Output<string>;
    /**
     * Description of the image recipe.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of the image recipe.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Owner of the image recipe.
     */
    public /*out*/ readonly owner!: pulumi.Output<string>;
    /**
     * The image recipe uses this image as a base from which to build your customized image. The value can be the base image ARN or an AMI ID.
     */
    public readonly parentImage!: pulumi.Output<string>;
    /**
     * Platform of the image recipe.
     */
    public /*out*/ readonly platform!: pulumi.Output<string>;
    /**
     * Configuration block for the Systems Manager Agent installed by default by Image Builder. Detailed below.
     */
    public readonly systemsManagerAgent!: pulumi.Output<outputs.imagebuilder.ImageRecipeSystemsManagerAgent>;
    /**
     * Key-value map of resource tags for the image recipe. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Base64 encoded user data. Use this to provide commands or a command script to run when you launch your build instance.
     */
    public readonly userDataBase64!: pulumi.Output<string>;
    /**
     * The semantic version of the image recipe, which specifies the version in the following format, with numeric values in each position to indicate a specific version: major.minor.patch. For example: 1.0.0.
     *
     * The following attributes are optional:
     */
    public readonly version!: pulumi.Output<string>;
    /**
     * The working directory to be used during build and test workflows.
     */
    public readonly workingDirectory!: pulumi.Output<string | undefined>;

    /**
     * Create a ImageRecipe resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ImageRecipeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ImageRecipeArgs | ImageRecipeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ImageRecipeState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["blockDeviceMappings"] = state ? state.blockDeviceMappings : undefined;
            resourceInputs["components"] = state ? state.components : undefined;
            resourceInputs["dateCreated"] = state ? state.dateCreated : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["owner"] = state ? state.owner : undefined;
            resourceInputs["parentImage"] = state ? state.parentImage : undefined;
            resourceInputs["platform"] = state ? state.platform : undefined;
            resourceInputs["systemsManagerAgent"] = state ? state.systemsManagerAgent : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["userDataBase64"] = state ? state.userDataBase64 : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
            resourceInputs["workingDirectory"] = state ? state.workingDirectory : undefined;
        } else {
            const args = argsOrState as ImageRecipeArgs | undefined;
            if ((!args || args.components === undefined) && !opts.urn) {
                throw new Error("Missing required property 'components'");
            }
            if ((!args || args.parentImage === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parentImage'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            resourceInputs["blockDeviceMappings"] = args ? args.blockDeviceMappings : undefined;
            resourceInputs["components"] = args ? args.components : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parentImage"] = args ? args.parentImage : undefined;
            resourceInputs["systemsManagerAgent"] = args ? args.systemsManagerAgent : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["userDataBase64"] = args ? args.userDataBase64 : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
            resourceInputs["workingDirectory"] = args ? args.workingDirectory : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["dateCreated"] = undefined /*out*/;
            resourceInputs["owner"] = undefined /*out*/;
            resourceInputs["platform"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ImageRecipe.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ImageRecipe resources.
 */
export interface ImageRecipeState {
    /**
     * (Required) Amazon Resource Name (ARN) of the image recipe.
     */
    arn?: pulumi.Input<string>;
    /**
     * Configuration block(s) with block device mappings for the image recipe. Detailed below.
     */
    blockDeviceMappings?: pulumi.Input<pulumi.Input<inputs.imagebuilder.ImageRecipeBlockDeviceMapping>[]>;
    /**
     * Ordered configuration block(s) with components for the image recipe. Detailed below.
     */
    components?: pulumi.Input<pulumi.Input<inputs.imagebuilder.ImageRecipeComponent>[]>;
    /**
     * Date the image recipe was created.
     */
    dateCreated?: pulumi.Input<string>;
    /**
     * Description of the image recipe.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the image recipe.
     */
    name?: pulumi.Input<string>;
    /**
     * Owner of the image recipe.
     */
    owner?: pulumi.Input<string>;
    /**
     * The image recipe uses this image as a base from which to build your customized image. The value can be the base image ARN or an AMI ID.
     */
    parentImage?: pulumi.Input<string>;
    /**
     * Platform of the image recipe.
     */
    platform?: pulumi.Input<string>;
    /**
     * Configuration block for the Systems Manager Agent installed by default by Image Builder. Detailed below.
     */
    systemsManagerAgent?: pulumi.Input<inputs.imagebuilder.ImageRecipeSystemsManagerAgent>;
    /**
     * Key-value map of resource tags for the image recipe. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Base64 encoded user data. Use this to provide commands or a command script to run when you launch your build instance.
     */
    userDataBase64?: pulumi.Input<string>;
    /**
     * The semantic version of the image recipe, which specifies the version in the following format, with numeric values in each position to indicate a specific version: major.minor.patch. For example: 1.0.0.
     *
     * The following attributes are optional:
     */
    version?: pulumi.Input<string>;
    /**
     * The working directory to be used during build and test workflows.
     */
    workingDirectory?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ImageRecipe resource.
 */
export interface ImageRecipeArgs {
    /**
     * Configuration block(s) with block device mappings for the image recipe. Detailed below.
     */
    blockDeviceMappings?: pulumi.Input<pulumi.Input<inputs.imagebuilder.ImageRecipeBlockDeviceMapping>[]>;
    /**
     * Ordered configuration block(s) with components for the image recipe. Detailed below.
     */
    components: pulumi.Input<pulumi.Input<inputs.imagebuilder.ImageRecipeComponent>[]>;
    /**
     * Description of the image recipe.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the image recipe.
     */
    name?: pulumi.Input<string>;
    /**
     * The image recipe uses this image as a base from which to build your customized image. The value can be the base image ARN or an AMI ID.
     */
    parentImage: pulumi.Input<string>;
    /**
     * Configuration block for the Systems Manager Agent installed by default by Image Builder. Detailed below.
     */
    systemsManagerAgent?: pulumi.Input<inputs.imagebuilder.ImageRecipeSystemsManagerAgent>;
    /**
     * Key-value map of resource tags for the image recipe. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Base64 encoded user data. Use this to provide commands or a command script to run when you launch your build instance.
     */
    userDataBase64?: pulumi.Input<string>;
    /**
     * The semantic version of the image recipe, which specifies the version in the following format, with numeric values in each position to indicate a specific version: major.minor.patch. For example: 1.0.0.
     *
     * The following attributes are optional:
     */
    version: pulumi.Input<string>;
    /**
     * The working directory to be used during build and test workflows.
     */
    workingDirectory?: pulumi.Input<string>;
}
