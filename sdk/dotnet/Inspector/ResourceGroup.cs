// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Inspector
{
    /// <summary>
    /// Provides an Amazon Inspector Classic Resource Group.
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
    ///     var example = new Aws.Inspector.ResourceGroup("example", new()
    ///     {
    ///         Tags = 
    ///         {
    ///             { "Name", "foo" },
    ///             { "Env", "bar" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [AwsResourceType("aws:inspector/resourceGroup:ResourceGroup")]
    public partial class ResourceGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The resource group ARN.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Key-value map of tags that are used to select the EC2 instances to be included in an Amazon Inspector assessment target.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a ResourceGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResourceGroup(string name, ResourceGroupArgs args, CustomResourceOptions? options = null)
            : base("aws:inspector/resourceGroup:ResourceGroup", name, args ?? new ResourceGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResourceGroup(string name, Input<string> id, ResourceGroupState? state = null, CustomResourceOptions? options = null)
            : base("aws:inspector/resourceGroup:ResourceGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ResourceGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResourceGroup Get(string name, Input<string> id, ResourceGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new ResourceGroup(name, id, state, options);
        }
    }

    public sealed class ResourceGroupArgs : global::Pulumi.ResourceArgs
    {
        [Input("tags", required: true)]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of tags that are used to select the EC2 instances to be included in an Amazon Inspector assessment target.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ResourceGroupArgs()
        {
        }
        public static new ResourceGroupArgs Empty => new ResourceGroupArgs();
    }

    public sealed class ResourceGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource group ARN.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of tags that are used to select the EC2 instances to be included in an Amazon Inspector assessment target.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ResourceGroupState()
        {
        }
        public static new ResourceGroupState Empty => new ResourceGroupState();
    }
}
