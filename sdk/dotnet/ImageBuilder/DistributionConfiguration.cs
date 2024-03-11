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
    /// Manages an Image Builder Distribution Configuration.
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
    ///     var example = new Aws.ImageBuilder.DistributionConfiguration("example", new()
    ///     {
    ///         Name = "example",
    ///         Distributions = new[]
    ///         {
    ///             new Aws.ImageBuilder.Inputs.DistributionConfigurationDistributionArgs
    ///             {
    ///                 AmiDistributionConfiguration = new Aws.ImageBuilder.Inputs.DistributionConfigurationDistributionAmiDistributionConfigurationArgs
    ///                 {
    ///                     AmiTags = 
    ///                     {
    ///                         { "CostCenter", "IT" },
    ///                     },
    ///                     Name = "example-{{ imagebuilder:buildDate }}",
    ///                     LaunchPermission = new Aws.ImageBuilder.Inputs.DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionArgs
    ///                     {
    ///                         UserIds = new[]
    ///                         {
    ///                             "123456789012",
    ///                         },
    ///                     },
    ///                 },
    ///                 LaunchTemplateConfigurations = new[]
    ///                 {
    ///                     new Aws.ImageBuilder.Inputs.DistributionConfigurationDistributionLaunchTemplateConfigurationArgs
    ///                     {
    ///                         LaunchTemplateId = "lt-0aaa1bcde2ff3456",
    ///                     },
    ///                 },
    ///                 Region = "us-east-1",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_imagebuilder_distribution_configurations` resources using the Amazon Resource Name (ARN). For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:imagebuilder/distributionConfiguration:DistributionConfiguration example arn:aws:imagebuilder:us-east-1:123456789012:distribution-configuration/example
    /// ```
    /// </summary>
    [AwsResourceType("aws:imagebuilder/distributionConfiguration:DistributionConfiguration")]
    public partial class DistributionConfiguration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Required) Amazon Resource Name (ARN) of the distribution configuration.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Date the distribution configuration was created.
        /// </summary>
        [Output("dateCreated")]
        public Output<string> DateCreated { get; private set; } = null!;

        /// <summary>
        /// Date the distribution configuration was updated.
        /// </summary>
        [Output("dateUpdated")]
        public Output<string> DateUpdated { get; private set; } = null!;

        /// <summary>
        /// Description of the distribution configuration.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// One or more configuration blocks with distribution settings. Detailed below.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("distributions")]
        public Output<ImmutableArray<Outputs.DistributionConfigurationDistribution>> Distributions { get; private set; } = null!;

        /// <summary>
        /// Name of the distribution configuration.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags for the distribution configuration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a DistributionConfiguration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DistributionConfiguration(string name, DistributionConfigurationArgs args, CustomResourceOptions? options = null)
            : base("aws:imagebuilder/distributionConfiguration:DistributionConfiguration", name, args ?? new DistributionConfigurationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DistributionConfiguration(string name, Input<string> id, DistributionConfigurationState? state = null, CustomResourceOptions? options = null)
            : base("aws:imagebuilder/distributionConfiguration:DistributionConfiguration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DistributionConfiguration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DistributionConfiguration Get(string name, Input<string> id, DistributionConfigurationState? state = null, CustomResourceOptions? options = null)
        {
            return new DistributionConfiguration(name, id, state, options);
        }
    }

    public sealed class DistributionConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the distribution configuration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("distributions", required: true)]
        private InputList<Inputs.DistributionConfigurationDistributionArgs>? _distributions;

        /// <summary>
        /// One or more configuration blocks with distribution settings. Detailed below.
        /// 
        /// The following arguments are optional:
        /// </summary>
        public InputList<Inputs.DistributionConfigurationDistributionArgs> Distributions
        {
            get => _distributions ?? (_distributions = new InputList<Inputs.DistributionConfigurationDistributionArgs>());
            set => _distributions = value;
        }

        /// <summary>
        /// Name of the distribution configuration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags for the distribution configuration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public DistributionConfigurationArgs()
        {
        }
        public static new DistributionConfigurationArgs Empty => new DistributionConfigurationArgs();
    }

    public sealed class DistributionConfigurationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required) Amazon Resource Name (ARN) of the distribution configuration.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Date the distribution configuration was created.
        /// </summary>
        [Input("dateCreated")]
        public Input<string>? DateCreated { get; set; }

        /// <summary>
        /// Date the distribution configuration was updated.
        /// </summary>
        [Input("dateUpdated")]
        public Input<string>? DateUpdated { get; set; }

        /// <summary>
        /// Description of the distribution configuration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("distributions")]
        private InputList<Inputs.DistributionConfigurationDistributionGetArgs>? _distributions;

        /// <summary>
        /// One or more configuration blocks with distribution settings. Detailed below.
        /// 
        /// The following arguments are optional:
        /// </summary>
        public InputList<Inputs.DistributionConfigurationDistributionGetArgs> Distributions
        {
            get => _distributions ?? (_distributions = new InputList<Inputs.DistributionConfigurationDistributionGetArgs>());
            set => _distributions = value;
        }

        /// <summary>
        /// Name of the distribution configuration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags for the distribution configuration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public DistributionConfigurationState()
        {
        }
        public static new DistributionConfigurationState Empty => new DistributionConfigurationState();
    }
}
