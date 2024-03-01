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
    /// Manages an Image Builder Component.
    /// 
    /// ## Example Usage
    /// ### Inline Data Document
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// 	
    /// object NotImplemented(string errorMessage) 
    /// {
    ///     throw new System.NotImplementedException(errorMessage);
    /// }
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.ImageBuilder.Component("example", new()
    ///     {
    ///         Data = NotImplemented(@"yamlencode({
    /// phases=[{
    /// name=""build""
    /// steps=[{
    /// action=""ExecuteBash""
    /// inputs={
    /// commands=[""echo 'hello world'""]
    /// }
    /// name=""example""
    /// onFailure=""Continue""
    /// }]
    /// }]
    /// schemaVersion=1.0
    /// })"),
    ///         Name = "example",
    ///         Platform = "Linux",
    ///         Version = "1.0.0",
    ///     });
    /// 
    /// });
    /// ```
    /// ### URI Document
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.ImageBuilder.Component("example", new()
    ///     {
    ///         Name = "example",
    ///         Platform = "Linux",
    ///         Uri = $"s3://{exampleAwsS3Object.Bucket}/{exampleAwsS3Object.Key}",
    ///         Version = "1.0.0",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_imagebuilder_components` resources using the Amazon Resource Name (ARN). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:imagebuilder/component:Component example arn:aws:imagebuilder:us-east-1:123456789012:component/example/1.0.0/1
    /// ```
    ///  Certain resource arguments, such as `uri`, cannot be read via the API and imported into the provider. The provider will display a difference for these arguments the first run after import if declared in the the provider configuration for an imported resource.
    /// </summary>
    [AwsResourceType("aws:imagebuilder/component:Component")]
    public partial class Component : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Required) Amazon Resource Name (ARN) of the component.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Change description of the component.
        /// </summary>
        [Output("changeDescription")]
        public Output<string?> ChangeDescription { get; private set; } = null!;

        /// <summary>
        /// Inline YAML string with data of the component. Exactly one of `data` and `uri` can be specified. the provider will only perform drift detection of its value when present in a configuration.
        /// </summary>
        [Output("data")]
        public Output<string> Data { get; private set; } = null!;

        /// <summary>
        /// Date the component was created.
        /// </summary>
        [Output("dateCreated")]
        public Output<string> DateCreated { get; private set; } = null!;

        /// <summary>
        /// Description of the component.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Encryption status of the component.
        /// </summary>
        [Output("encrypted")]
        public Output<bool> Encrypted { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
        /// </summary>
        [Output("kmsKeyId")]
        public Output<string?> KmsKeyId { get; private set; } = null!;

        /// <summary>
        /// Name of the component.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Owner of the component.
        /// </summary>
        [Output("owner")]
        public Output<string> Owner { get; private set; } = null!;

        /// <summary>
        /// Platform of the component.
        /// </summary>
        [Output("platform")]
        public Output<string> Platform { get; private set; } = null!;

        /// <summary>
        /// Whether to retain the old version when the resource is destroyed or replacement is necessary. Defaults to `false`.
        /// </summary>
        [Output("skipDestroy")]
        public Output<bool?> SkipDestroy { get; private set; } = null!;

        /// <summary>
        /// Set of Operating Systems (OS) supported by the component.
        /// </summary>
        [Output("supportedOsVersions")]
        public Output<ImmutableArray<string>> SupportedOsVersions { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags for the component. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Type of the component.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.
        /// 
        /// &gt; **NOTE:** Updating `data` or `uri` requires specifying a new `version`. This causes replacement of the resource. The `skip_destroy` argument can be used to retain the old version.
        /// </summary>
        [Output("uri")]
        public Output<string?> Uri { get; private set; } = null!;

        /// <summary>
        /// Version of the component.
        /// 
        /// The following attributes are optional:
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;


        /// <summary>
        /// Create a Component resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Component(string name, ComponentArgs args, CustomResourceOptions? options = null)
            : base("aws:imagebuilder/component:Component", name, args ?? new ComponentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Component(string name, Input<string> id, ComponentState? state = null, CustomResourceOptions? options = null)
            : base("aws:imagebuilder/component:Component", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Component resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Component Get(string name, Input<string> id, ComponentState? state = null, CustomResourceOptions? options = null)
        {
            return new Component(name, id, state, options);
        }
    }

    public sealed class ComponentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Change description of the component.
        /// </summary>
        [Input("changeDescription")]
        public Input<string>? ChangeDescription { get; set; }

        /// <summary>
        /// Inline YAML string with data of the component. Exactly one of `data` and `uri` can be specified. the provider will only perform drift detection of its value when present in a configuration.
        /// </summary>
        [Input("data")]
        public Input<string>? Data { get; set; }

        /// <summary>
        /// Description of the component.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// Name of the component.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Platform of the component.
        /// </summary>
        [Input("platform", required: true)]
        public Input<string> Platform { get; set; } = null!;

        /// <summary>
        /// Whether to retain the old version when the resource is destroyed or replacement is necessary. Defaults to `false`.
        /// </summary>
        [Input("skipDestroy")]
        public Input<bool>? SkipDestroy { get; set; }

        [Input("supportedOsVersions")]
        private InputList<string>? _supportedOsVersions;

        /// <summary>
        /// Set of Operating Systems (OS) supported by the component.
        /// </summary>
        public InputList<string> SupportedOsVersions
        {
            get => _supportedOsVersions ?? (_supportedOsVersions = new InputList<string>());
            set => _supportedOsVersions = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags for the component. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.
        /// 
        /// &gt; **NOTE:** Updating `data` or `uri` requires specifying a new `version`. This causes replacement of the resource. The `skip_destroy` argument can be used to retain the old version.
        /// </summary>
        [Input("uri")]
        public Input<string>? Uri { get; set; }

        /// <summary>
        /// Version of the component.
        /// 
        /// The following attributes are optional:
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public ComponentArgs()
        {
        }
        public static new ComponentArgs Empty => new ComponentArgs();
    }

    public sealed class ComponentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required) Amazon Resource Name (ARN) of the component.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Change description of the component.
        /// </summary>
        [Input("changeDescription")]
        public Input<string>? ChangeDescription { get; set; }

        /// <summary>
        /// Inline YAML string with data of the component. Exactly one of `data` and `uri` can be specified. the provider will only perform drift detection of its value when present in a configuration.
        /// </summary>
        [Input("data")]
        public Input<string>? Data { get; set; }

        /// <summary>
        /// Date the component was created.
        /// </summary>
        [Input("dateCreated")]
        public Input<string>? DateCreated { get; set; }

        /// <summary>
        /// Description of the component.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Encryption status of the component.
        /// </summary>
        [Input("encrypted")]
        public Input<bool>? Encrypted { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// Name of the component.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Owner of the component.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        /// <summary>
        /// Platform of the component.
        /// </summary>
        [Input("platform")]
        public Input<string>? Platform { get; set; }

        /// <summary>
        /// Whether to retain the old version when the resource is destroyed or replacement is necessary. Defaults to `false`.
        /// </summary>
        [Input("skipDestroy")]
        public Input<bool>? SkipDestroy { get; set; }

        [Input("supportedOsVersions")]
        private InputList<string>? _supportedOsVersions;

        /// <summary>
        /// Set of Operating Systems (OS) supported by the component.
        /// </summary>
        public InputList<string> SupportedOsVersions
        {
            get => _supportedOsVersions ?? (_supportedOsVersions = new InputList<string>());
            set => _supportedOsVersions = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags for the component. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        /// Type of the component.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.
        /// 
        /// &gt; **NOTE:** Updating `data` or `uri` requires specifying a new `version`. This causes replacement of the resource. The `skip_destroy` argument can be used to retain the old version.
        /// </summary>
        [Input("uri")]
        public Input<string>? Uri { get; set; }

        /// <summary>
        /// Version of the component.
        /// 
        /// The following attributes are optional:
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public ComponentState()
        {
        }
        public static new ComponentState Empty => new ComponentState();
    }
}
