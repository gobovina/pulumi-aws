// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ImageBuilder
{
    public static class GetImage
    {
        /// <summary>
        /// Provides details about an Image Builder Image.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Latest
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.ImageBuilder.GetImage.InvokeAsync(new Aws.ImageBuilder.GetImageArgs
        ///         {
        ///             Arn = "arn:aws:imagebuilder:us-west-2:aws:image/amazon-linux-2-x86/x.x.x",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetImageResult> InvokeAsync(GetImageArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetImageResult>("aws:imagebuilder/getImage:getImage", args ?? new GetImageArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about an Image Builder Image.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Latest
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.ImageBuilder.GetImage.InvokeAsync(new Aws.ImageBuilder.GetImageArgs
        ///         {
        ///             Arn = "arn:aws:imagebuilder:us-west-2:aws:image/amazon-linux-2-x86/x.x.x",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetImageResult> Invoke(GetImageInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetImageResult>("aws:imagebuilder/getImage:getImage", args ?? new GetImageInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetImageArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the image. The suffix can either be specified with wildcards (`x.x.x`) to fetch the latest build version or a full build version (e.g., `2020.11.26/1`) to fetch an exact version.
        /// </summary>
        [Input("arn", required: true)]
        public string Arn { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Key-value map of resource tags for the image.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetImageArgs()
        {
        }
    }

    public sealed class GetImageInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the image. The suffix can either be specified with wildcards (`x.x.x`) to fetch the latest build version or a full build version (e.g., `2020.11.26/1`) to fetch an exact version.
        /// </summary>
        [Input("arn", required: true)]
        public Input<string> Arn { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags for the image.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetImageInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetImageResult
    {
        public readonly string Arn;
        /// <summary>
        /// Build version Amazon Resource Name (ARN) of the image. This will always have the `#.#.#/#` suffix.
        /// </summary>
        public readonly string BuildVersionArn;
        /// <summary>
        /// Amazon Resource Name (ARN) of the container recipe.
        /// </summary>
        public readonly string ContainerRecipeArn;
        /// <summary>
        /// Date the image was created.
        /// </summary>
        public readonly string DateCreated;
        /// <summary>
        /// Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
        /// </summary>
        public readonly string DistributionConfigurationArn;
        /// <summary>
        /// Whether additional information about the image being created is collected.
        /// </summary>
        public readonly bool EnhancedImageMetadataEnabled;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Amazon Resource Name (ARN) of the image recipe.
        /// </summary>
        public readonly string ImageRecipeArn;
        /// <summary>
        /// List of an object with image tests configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetImageImageTestsConfigurationResult> ImageTestsConfigurations;
        /// <summary>
        /// Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
        /// </summary>
        public readonly string InfrastructureConfigurationArn;
        /// <summary>
        /// Name of the AMI.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Operating System version of the image.
        /// </summary>
        public readonly string OsVersion;
        /// <summary>
        /// List of objects with resources created by the image.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetImageOutputResourceResult> OutputResources;
        /// <summary>
        /// Platform of the image.
        /// </summary>
        public readonly string Platform;
        /// <summary>
        /// Key-value map of resource tags for the image.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Version of the image.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private GetImageResult(
            string arn,

            string buildVersionArn,

            string containerRecipeArn,

            string dateCreated,

            string distributionConfigurationArn,

            bool enhancedImageMetadataEnabled,

            string id,

            string imageRecipeArn,

            ImmutableArray<Outputs.GetImageImageTestsConfigurationResult> imageTestsConfigurations,

            string infrastructureConfigurationArn,

            string name,

            string osVersion,

            ImmutableArray<Outputs.GetImageOutputResourceResult> outputResources,

            string platform,

            ImmutableDictionary<string, string> tags,

            string version)
        {
            Arn = arn;
            BuildVersionArn = buildVersionArn;
            ContainerRecipeArn = containerRecipeArn;
            DateCreated = dateCreated;
            DistributionConfigurationArn = distributionConfigurationArn;
            EnhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
            Id = id;
            ImageRecipeArn = imageRecipeArn;
            ImageTestsConfigurations = imageTestsConfigurations;
            InfrastructureConfigurationArn = infrastructureConfigurationArn;
            Name = name;
            OsVersion = osVersion;
            OutputResources = outputResources;
            Platform = platform;
            Tags = tags;
            Version = version;
        }
    }
}
