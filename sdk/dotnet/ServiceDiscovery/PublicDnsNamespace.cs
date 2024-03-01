// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ServiceDiscovery
{
    /// <summary>
    /// Provides a Service Discovery Public DNS Namespace resource.
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
    ///     var example = new Aws.ServiceDiscovery.PublicDnsNamespace("example", new()
    ///     {
    ///         Name = "hoge.example.com",
    ///         Description = "example",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Service Discovery Public DNS Namespace using the namespace ID. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:servicediscovery/publicDnsNamespace:PublicDnsNamespace example 0123456789
    /// ```
    /// </summary>
    [AwsResourceType("aws:servicediscovery/publicDnsNamespace:PublicDnsNamespace")]
    public partial class PublicDnsNamespace : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN that Amazon Route 53 assigns to the namespace when you create it.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The description that you specify for the namespace when you create it.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
        /// </summary>
        [Output("hostedZone")]
        public Output<string> HostedZone { get; private set; } = null!;

        /// <summary>
        /// The name of the namespace.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the namespace. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a PublicDnsNamespace resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PublicDnsNamespace(string name, PublicDnsNamespaceArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:servicediscovery/publicDnsNamespace:PublicDnsNamespace", name, args ?? new PublicDnsNamespaceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PublicDnsNamespace(string name, Input<string> id, PublicDnsNamespaceState? state = null, CustomResourceOptions? options = null)
            : base("aws:servicediscovery/publicDnsNamespace:PublicDnsNamespace", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PublicDnsNamespace resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PublicDnsNamespace Get(string name, Input<string> id, PublicDnsNamespaceState? state = null, CustomResourceOptions? options = null)
        {
            return new PublicDnsNamespace(name, id, state, options);
        }
    }

    public sealed class PublicDnsNamespaceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description that you specify for the namespace when you create it.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the namespace.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the namespace. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public PublicDnsNamespaceArgs()
        {
        }
        public static new PublicDnsNamespaceArgs Empty => new PublicDnsNamespaceArgs();
    }

    public sealed class PublicDnsNamespaceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN that Amazon Route 53 assigns to the namespace when you create it.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The description that you specify for the namespace when you create it.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
        /// </summary>
        [Input("hostedZone")]
        public Input<string>? HostedZone { get; set; }

        /// <summary>
        /// The name of the namespace.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the namespace. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public PublicDnsNamespaceState()
        {
        }
        public static new PublicDnsNamespaceState Empty => new PublicDnsNamespaceState();
    }
}
