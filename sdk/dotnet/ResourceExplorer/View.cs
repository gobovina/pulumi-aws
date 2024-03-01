// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ResourceExplorer
{
    /// <summary>
    /// Provides a resource to manage a Resource Explorer view.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.ResourceExplorer.Index("example", new()
    ///     {
    ///         Type = "LOCAL",
    ///     });
    /// 
    ///     var exampleView = new Aws.ResourceExplorer.View("example", new()
    ///     {
    ///         Name = "exampleview",
    ///         Filters = new Aws.ResourceExplorer.Inputs.ViewFiltersArgs
    ///         {
    ///             FilterString = "resourcetype:ec2:instance",
    ///         },
    ///         IncludedProperties = new[]
    ///         {
    ///             new Aws.ResourceExplorer.Inputs.ViewIncludedPropertyArgs
    ///             {
    ///                 Name = "tags",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Resource Explorer views using the `arn`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:resourceexplorer/view:View example arn:aws:resource-explorer-2:us-west-2:123456789012:view/exampleview/e0914f6c-6c27-4b47-b5d4-6b28381a2421
    /// ```
    /// </summary>
    [AwsResourceType("aws:resourceexplorer/view:View")]
    public partial class View : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Resource Explorer view.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the view is the [_default view_](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-views-about.html#manage-views-about-default) for the AWS Region. Default: `false`.
        /// </summary>
        [Output("defaultView")]
        public Output<bool> DefaultView { get; private set; } = null!;

        /// <summary>
        /// Specifies which resources are included in the results of queries made using this view. See Filters below for more details.
        /// </summary>
        [Output("filters")]
        public Output<Outputs.ViewFilters?> Filters { get; private set; } = null!;

        /// <summary>
        /// Optional fields to be included in search results from this view. See Included Properties below for more details.
        /// </summary>
        [Output("includedProperties")]
        public Output<ImmutableArray<Outputs.ViewIncludedProperty>> IncludedProperties { get; private set; } = null!;

        /// <summary>
        /// The name of the view. The name must be no more than 64 characters long, and can include letters, digits, and the dash (-) character. The name must be unique within its AWS Region.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a View resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public View(string name, ViewArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:resourceexplorer/view:View", name, args ?? new ViewArgs(), MakeResourceOptions(options, ""))
        {
        }

        private View(string name, Input<string> id, ViewState? state = null, CustomResourceOptions? options = null)
            : base("aws:resourceexplorer/view:View", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing View resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static View Get(string name, Input<string> id, ViewState? state = null, CustomResourceOptions? options = null)
        {
            return new View(name, id, state, options);
        }
    }

    public sealed class ViewArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether the view is the [_default view_](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-views-about.html#manage-views-about-default) for the AWS Region. Default: `false`.
        /// </summary>
        [Input("defaultView")]
        public Input<bool>? DefaultView { get; set; }

        /// <summary>
        /// Specifies which resources are included in the results of queries made using this view. See Filters below for more details.
        /// </summary>
        [Input("filters")]
        public Input<Inputs.ViewFiltersArgs>? Filters { get; set; }

        [Input("includedProperties")]
        private InputList<Inputs.ViewIncludedPropertyArgs>? _includedProperties;

        /// <summary>
        /// Optional fields to be included in search results from this view. See Included Properties below for more details.
        /// </summary>
        public InputList<Inputs.ViewIncludedPropertyArgs> IncludedProperties
        {
            get => _includedProperties ?? (_includedProperties = new InputList<Inputs.ViewIncludedPropertyArgs>());
            set => _includedProperties = value;
        }

        /// <summary>
        /// The name of the view. The name must be no more than 64 characters long, and can include letters, digits, and the dash (-) character. The name must be unique within its AWS Region.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ViewArgs()
        {
        }
        public static new ViewArgs Empty => new ViewArgs();
    }

    public sealed class ViewState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Resource Explorer view.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Specifies whether the view is the [_default view_](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-views-about.html#manage-views-about-default) for the AWS Region. Default: `false`.
        /// </summary>
        [Input("defaultView")]
        public Input<bool>? DefaultView { get; set; }

        /// <summary>
        /// Specifies which resources are included in the results of queries made using this view. See Filters below for more details.
        /// </summary>
        [Input("filters")]
        public Input<Inputs.ViewFiltersGetArgs>? Filters { get; set; }

        [Input("includedProperties")]
        private InputList<Inputs.ViewIncludedPropertyGetArgs>? _includedProperties;

        /// <summary>
        /// Optional fields to be included in search results from this view. See Included Properties below for more details.
        /// </summary>
        public InputList<Inputs.ViewIncludedPropertyGetArgs> IncludedProperties
        {
            get => _includedProperties ?? (_includedProperties = new InputList<Inputs.ViewIncludedPropertyGetArgs>());
            set => _includedProperties = value;
        }

        /// <summary>
        /// The name of the view. The name must be no more than 64 characters long, and can include letters, digits, and the dash (-) character. The name must be unique within its AWS Region.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public ViewState()
        {
        }
        public static new ViewState Empty => new ViewState();
    }
}
