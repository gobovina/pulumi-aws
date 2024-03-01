// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SecurityLake
{
    /// <summary>
    /// Resource for managing an AWS Security Lake Custom Log Source.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.SecurityLake.CustomLogSource("example", new()
    ///     {
    ///         SourceName = "example-name",
    ///         SourceVersion = "1.0",
    ///         EventClasses = new[]
    ///         {
    ///             "FILE_ACTIVITY",
    ///         },
    ///         Configuration = new Aws.SecurityLake.Inputs.CustomLogSourceConfigurationArgs
    ///         {
    ///             CrawlerConfiguration = new Aws.SecurityLake.Inputs.CustomLogSourceConfigurationCrawlerConfigurationArgs
    ///             {
    ///                 RoleArn = customLog.Arn,
    ///             },
    ///             ProviderIdentity = new Aws.SecurityLake.Inputs.CustomLogSourceConfigurationProviderIdentityArgs
    ///             {
    ///                 ExternalId = "example-id",
    ///                 Principal = "123456789012",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Custom log sources using the source name. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:securitylake/customLogSource:CustomLogSource example example-name
    /// ```
    /// </summary>
    [AwsResourceType("aws:securitylake/customLogSource:CustomLogSource")]
    public partial class CustomLogSource : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The attributes of a third-party custom source.
        /// </summary>
        [Output("attributes")]
        public Output<ImmutableArray<Outputs.CustomLogSourceAttribute>> Attributes { get; private set; } = null!;

        /// <summary>
        /// The configuration for the third-party custom source.
        /// </summary>
        [Output("configuration")]
        public Output<Outputs.CustomLogSourceConfiguration?> Configuration { get; private set; } = null!;

        /// <summary>
        /// The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the custom source will send to Security Lake.
        /// </summary>
        [Output("eventClasses")]
        public Output<ImmutableArray<string>> EventClasses { get; private set; } = null!;

        /// <summary>
        /// The details of the log provider for a third-party custom source.
        /// </summary>
        [Output("providerDetails")]
        public Output<ImmutableArray<Outputs.CustomLogSourceProviderDetail>> ProviderDetails { get; private set; } = null!;

        /// <summary>
        /// Specify the name for a third-party custom source. This must be a Regionally unique value.
        /// </summary>
        [Output("sourceName")]
        public Output<string> SourceName { get; private set; } = null!;

        /// <summary>
        /// Specify the source version for the third-party custom source, to limit log collection to a specific version of custom data source.
        /// </summary>
        [Output("sourceVersion")]
        public Output<string> SourceVersion { get; private set; } = null!;


        /// <summary>
        /// Create a CustomLogSource resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomLogSource(string name, CustomLogSourceArgs args, CustomResourceOptions? options = null)
            : base("aws:securitylake/customLogSource:CustomLogSource", name, args ?? new CustomLogSourceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomLogSource(string name, Input<string> id, CustomLogSourceState? state = null, CustomResourceOptions? options = null)
            : base("aws:securitylake/customLogSource:CustomLogSource", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomLogSource resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomLogSource Get(string name, Input<string> id, CustomLogSourceState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomLogSource(name, id, state, options);
        }
    }

    public sealed class CustomLogSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The configuration for the third-party custom source.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.CustomLogSourceConfigurationArgs>? Configuration { get; set; }

        [Input("eventClasses")]
        private InputList<string>? _eventClasses;

        /// <summary>
        /// The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the custom source will send to Security Lake.
        /// </summary>
        public InputList<string> EventClasses
        {
            get => _eventClasses ?? (_eventClasses = new InputList<string>());
            set => _eventClasses = value;
        }

        /// <summary>
        /// Specify the name for a third-party custom source. This must be a Regionally unique value.
        /// </summary>
        [Input("sourceName", required: true)]
        public Input<string> SourceName { get; set; } = null!;

        /// <summary>
        /// Specify the source version for the third-party custom source, to limit log collection to a specific version of custom data source.
        /// </summary>
        [Input("sourceVersion")]
        public Input<string>? SourceVersion { get; set; }

        public CustomLogSourceArgs()
        {
        }
        public static new CustomLogSourceArgs Empty => new CustomLogSourceArgs();
    }

    public sealed class CustomLogSourceState : global::Pulumi.ResourceArgs
    {
        [Input("attributes")]
        private InputList<Inputs.CustomLogSourceAttributeGetArgs>? _attributes;

        /// <summary>
        /// The attributes of a third-party custom source.
        /// </summary>
        public InputList<Inputs.CustomLogSourceAttributeGetArgs> Attributes
        {
            get => _attributes ?? (_attributes = new InputList<Inputs.CustomLogSourceAttributeGetArgs>());
            set => _attributes = value;
        }

        /// <summary>
        /// The configuration for the third-party custom source.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.CustomLogSourceConfigurationGetArgs>? Configuration { get; set; }

        [Input("eventClasses")]
        private InputList<string>? _eventClasses;

        /// <summary>
        /// The Open Cybersecurity Schema Framework (OCSF) event classes which describes the type of data that the custom source will send to Security Lake.
        /// </summary>
        public InputList<string> EventClasses
        {
            get => _eventClasses ?? (_eventClasses = new InputList<string>());
            set => _eventClasses = value;
        }

        [Input("providerDetails")]
        private InputList<Inputs.CustomLogSourceProviderDetailGetArgs>? _providerDetails;

        /// <summary>
        /// The details of the log provider for a third-party custom source.
        /// </summary>
        public InputList<Inputs.CustomLogSourceProviderDetailGetArgs> ProviderDetails
        {
            get => _providerDetails ?? (_providerDetails = new InputList<Inputs.CustomLogSourceProviderDetailGetArgs>());
            set => _providerDetails = value;
        }

        /// <summary>
        /// Specify the name for a third-party custom source. This must be a Regionally unique value.
        /// </summary>
        [Input("sourceName")]
        public Input<string>? SourceName { get; set; }

        /// <summary>
        /// Specify the source version for the third-party custom source, to limit log collection to a specific version of custom data source.
        /// </summary>
        [Input("sourceVersion")]
        public Input<string>? SourceVersion { get; set; }

        public CustomLogSourceState()
        {
        }
        public static new CustomLogSourceState Empty => new CustomLogSourceState();
    }
}
