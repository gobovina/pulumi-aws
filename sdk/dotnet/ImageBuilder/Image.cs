// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ImageBuilder
{
    /// <summary>
    /// Manages an Image Builder Image.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.ImageBuilder.Image("example", new()
    ///     {
    ///         DistributionConfigurationArn = exampleAwsImagebuilderDistributionConfiguration.Arn,
    ///         ImageRecipeArn = exampleAwsImagebuilderImageRecipe.Arn,
    ///         InfrastructureConfigurationArn = exampleAwsImagebuilderInfrastructureConfiguration.Arn,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_imagebuilder_image` resources using the Amazon Resource Name (ARN). For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:imagebuilder/image:Image example arn:aws:imagebuilder:us-east-1:123456789012:image/example/1.0.0/1
    /// ```
    /// </summary>
    [AwsResourceType("aws:imagebuilder/image:Image")]
    public partial class Image : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the image.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) of the container recipe.
        /// </summary>
        [Output("containerRecipeArn")]
        public Output<string?> ContainerRecipeArn { get; private set; } = null!;

        /// <summary>
        /// Date the image was created.
        /// </summary>
        [Output("dateCreated")]
        public Output<string> DateCreated { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
        /// </summary>
        [Output("distributionConfigurationArn")]
        public Output<string?> DistributionConfigurationArn { get; private set; } = null!;

        /// <summary>
        /// Whether additional information about the image being created is collected. Defaults to `true`.
        /// </summary>
        [Output("enhancedImageMetadataEnabled")]
        public Output<bool?> EnhancedImageMetadataEnabled { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) of the image recipe.
        /// </summary>
        [Output("imageRecipeArn")]
        public Output<string?> ImageRecipeArn { get; private set; } = null!;

        /// <summary>
        /// Configuration block with image scanning configuration. Detailed below.
        /// </summary>
        [Output("imageScanningConfiguration")]
        public Output<Outputs.ImageImageScanningConfiguration> ImageScanningConfiguration { get; private set; } = null!;

        /// <summary>
        /// Configuration block with image tests configuration. Detailed below.
        /// </summary>
        [Output("imageTestsConfiguration")]
        public Output<Outputs.ImageImageTestsConfiguration> ImageTestsConfiguration { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("infrastructureConfigurationArn")]
        public Output<string> InfrastructureConfigurationArn { get; private set; } = null!;

        /// <summary>
        /// Name of the AMI.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Operating System version of the image.
        /// </summary>
        [Output("osVersion")]
        public Output<string> OsVersion { get; private set; } = null!;

        /// <summary>
        /// List of objects with resources created by the image.
        /// </summary>
        [Output("outputResources")]
        public Output<ImmutableArray<Outputs.ImageOutputResource>> OutputResources { get; private set; } = null!;

        /// <summary>
        /// Platform of the image.
        /// </summary>
        [Output("platform")]
        public Output<string> Platform { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags for the Image Builder Image. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Version of the image.
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;


        /// <summary>
        /// Create a Image resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Image(string name, ImageArgs args, CustomResourceOptions? options = null)
            : base("aws:imagebuilder/image:Image", name, args ?? new ImageArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Image(string name, Input<string> id, ImageState? state = null, CustomResourceOptions? options = null)
            : base("aws:imagebuilder/image:Image", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Image resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Image Get(string name, Input<string> id, ImageState? state = null, CustomResourceOptions? options = null)
        {
            return new Image(name, id, state, options);
        }
    }

    public sealed class ImageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the container recipe.
        /// </summary>
        [Input("containerRecipeArn")]
        public Input<string>? ContainerRecipeArn { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
        /// </summary>
        [Input("distributionConfigurationArn")]
        public Input<string>? DistributionConfigurationArn { get; set; }

        /// <summary>
        /// Whether additional information about the image being created is collected. Defaults to `true`.
        /// </summary>
        [Input("enhancedImageMetadataEnabled")]
        public Input<bool>? EnhancedImageMetadataEnabled { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the image recipe.
        /// </summary>
        [Input("imageRecipeArn")]
        public Input<string>? ImageRecipeArn { get; set; }

        /// <summary>
        /// Configuration block with image scanning configuration. Detailed below.
        /// </summary>
        [Input("imageScanningConfiguration")]
        public Input<Inputs.ImageImageScanningConfigurationArgs>? ImageScanningConfiguration { get; set; }

        /// <summary>
        /// Configuration block with image tests configuration. Detailed below.
        /// </summary>
        [Input("imageTestsConfiguration")]
        public Input<Inputs.ImageImageTestsConfigurationArgs>? ImageTestsConfiguration { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("infrastructureConfigurationArn", required: true)]
        public Input<string> InfrastructureConfigurationArn { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags for the Image Builder Image. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ImageArgs()
        {
        }
        public static new ImageArgs Empty => new ImageArgs();
    }

    public sealed class ImageState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the image.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the container recipe.
        /// </summary>
        [Input("containerRecipeArn")]
        public Input<string>? ContainerRecipeArn { get; set; }

        /// <summary>
        /// Date the image was created.
        /// </summary>
        [Input("dateCreated")]
        public Input<string>? DateCreated { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
        /// </summary>
        [Input("distributionConfigurationArn")]
        public Input<string>? DistributionConfigurationArn { get; set; }

        /// <summary>
        /// Whether additional information about the image being created is collected. Defaults to `true`.
        /// </summary>
        [Input("enhancedImageMetadataEnabled")]
        public Input<bool>? EnhancedImageMetadataEnabled { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the image recipe.
        /// </summary>
        [Input("imageRecipeArn")]
        public Input<string>? ImageRecipeArn { get; set; }

        /// <summary>
        /// Configuration block with image scanning configuration. Detailed below.
        /// </summary>
        [Input("imageScanningConfiguration")]
        public Input<Inputs.ImageImageScanningConfigurationGetArgs>? ImageScanningConfiguration { get; set; }

        /// <summary>
        /// Configuration block with image tests configuration. Detailed below.
        /// </summary>
        [Input("imageTestsConfiguration")]
        public Input<Inputs.ImageImageTestsConfigurationGetArgs>? ImageTestsConfiguration { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("infrastructureConfigurationArn")]
        public Input<string>? InfrastructureConfigurationArn { get; set; }

        /// <summary>
        /// Name of the AMI.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Operating System version of the image.
        /// </summary>
        [Input("osVersion")]
        public Input<string>? OsVersion { get; set; }

        [Input("outputResources")]
        private InputList<Inputs.ImageOutputResourceGetArgs>? _outputResources;

        /// <summary>
        /// List of objects with resources created by the image.
        /// </summary>
        public InputList<Inputs.ImageOutputResourceGetArgs> OutputResources
        {
            get => _outputResources ?? (_outputResources = new InputList<Inputs.ImageOutputResourceGetArgs>());
            set => _outputResources = value;
        }

        /// <summary>
        /// Platform of the image.
        /// </summary>
        [Input("platform")]
        public Input<string>? Platform { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags for the Image Builder Image. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Version of the image.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public ImageState()
        {
        }
        public static new ImageState Empty => new ImageState();
    }
}
