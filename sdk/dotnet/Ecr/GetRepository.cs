// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ecr
{
    public static class GetRepository
    {
        /// <summary>
        /// The ECR Repository data source allows the ARN, Repository URI and Registry ID to be retrieved for an ECR repository.
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
        ///     var service = Aws.Ecr.GetRepository.Invoke(new()
        ///     {
        ///         Name = "ecr-repository",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetRepositoryResult> InvokeAsync(GetRepositoryArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRepositoryResult>("aws:ecr/getRepository:getRepository", args ?? new GetRepositoryArgs(), options.WithDefaults());

        /// <summary>
        /// The ECR Repository data source allows the ARN, Repository URI and Registry ID to be retrieved for an ECR repository.
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
        ///     var service = Aws.Ecr.GetRepository.Invoke(new()
        ///     {
        ///         Name = "ecr-repository",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetRepositoryResult> Invoke(GetRepositoryInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRepositoryResult>("aws:ecr/getRepository:getRepository", args ?? new GetRepositoryInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRepositoryArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the ECR Repository.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Registry ID where the repository was created.
        /// </summary>
        [Input("registryId")]
        public string? RegistryId { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Map of tags assigned to the resource.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetRepositoryArgs()
        {
        }
        public static new GetRepositoryArgs Empty => new GetRepositoryArgs();
    }

    public sealed class GetRepositoryInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the ECR Repository.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Registry ID where the repository was created.
        /// </summary>
        [Input("registryId")]
        public Input<string>? RegistryId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags assigned to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetRepositoryInvokeArgs()
        {
        }
        public static new GetRepositoryInvokeArgs Empty => new GetRepositoryInvokeArgs();
    }


    [OutputType]
    public sealed class GetRepositoryResult
    {
        /// <summary>
        /// Full ARN of the repository.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// Encryption configuration for the repository. See Encryption Configuration below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRepositoryEncryptionConfigurationResult> EncryptionConfigurations;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Configuration block that defines image scanning configuration for the repository. See Image Scanning Configuration below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRepositoryImageScanningConfigurationResult> ImageScanningConfigurations;
        /// <summary>
        /// The tag mutability setting for the repository.
        /// </summary>
        public readonly string ImageTagMutability;
        /// <summary>
        /// List of image tags associated with the most recently pushed image in the repository.
        /// </summary>
        public readonly ImmutableArray<string> MostRecentImageTags;
        public readonly string Name;
        public readonly string RegistryId;
        /// <summary>
        /// URL of the repository (in the form `aws_account_id.dkr.ecr.region.amazonaws.com/repositoryName`).
        /// </summary>
        public readonly string RepositoryUrl;
        /// <summary>
        /// Map of tags assigned to the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetRepositoryResult(
            string arn,

            ImmutableArray<Outputs.GetRepositoryEncryptionConfigurationResult> encryptionConfigurations,

            string id,

            ImmutableArray<Outputs.GetRepositoryImageScanningConfigurationResult> imageScanningConfigurations,

            string imageTagMutability,

            ImmutableArray<string> mostRecentImageTags,

            string name,

            string registryId,

            string repositoryUrl,

            ImmutableDictionary<string, string> tags)
        {
            Arn = arn;
            EncryptionConfigurations = encryptionConfigurations;
            Id = id;
            ImageScanningConfigurations = imageScanningConfigurations;
            ImageTagMutability = imageTagMutability;
            MostRecentImageTags = mostRecentImageTags;
            Name = name;
            RegistryId = registryId;
            RepositoryUrl = repositoryUrl;
            Tags = tags;
        }
    }
}
