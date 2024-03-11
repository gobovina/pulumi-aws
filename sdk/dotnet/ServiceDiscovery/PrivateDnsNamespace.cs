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
    /// Provides a Service Discovery Private DNS Namespace resource.
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
    ///     var example = new Aws.Ec2.Vpc("example", new()
    ///     {
    ///         CidrBlock = "10.0.0.0/16",
    ///     });
    /// 
    ///     var examplePrivateDnsNamespace = new Aws.ServiceDiscovery.PrivateDnsNamespace("example", new()
    ///     {
    ///         Name = "hoge.example.local",
    ///         Description = "example",
    ///         Vpc = example.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Service Discovery Private DNS Namespace using the namespace ID and VPC ID. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:servicediscovery/privateDnsNamespace:PrivateDnsNamespace example 0123456789:vpc-123345
    /// ```
    /// </summary>
    [AwsResourceType("aws:servicediscovery/privateDnsNamespace:PrivateDnsNamespace")]
    public partial class PrivateDnsNamespace : global::Pulumi.CustomResource
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
        /// The ID of VPC that you want to associate the namespace with.
        /// </summary>
        [Output("vpc")]
        public Output<string> Vpc { get; private set; } = null!;


        /// <summary>
        /// Create a PrivateDnsNamespace resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PrivateDnsNamespace(string name, PrivateDnsNamespaceArgs args, CustomResourceOptions? options = null)
            : base("aws:servicediscovery/privateDnsNamespace:PrivateDnsNamespace", name, args ?? new PrivateDnsNamespaceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PrivateDnsNamespace(string name, Input<string> id, PrivateDnsNamespaceState? state = null, CustomResourceOptions? options = null)
            : base("aws:servicediscovery/privateDnsNamespace:PrivateDnsNamespace", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PrivateDnsNamespace resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PrivateDnsNamespace Get(string name, Input<string> id, PrivateDnsNamespaceState? state = null, CustomResourceOptions? options = null)
        {
            return new PrivateDnsNamespace(name, id, state, options);
        }
    }

    public sealed class PrivateDnsNamespaceArgs : global::Pulumi.ResourceArgs
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

        /// <summary>
        /// The ID of VPC that you want to associate the namespace with.
        /// </summary>
        [Input("vpc", required: true)]
        public Input<string> Vpc { get; set; } = null!;

        public PrivateDnsNamespaceArgs()
        {
        }
        public static new PrivateDnsNamespaceArgs Empty => new PrivateDnsNamespaceArgs();
    }

    public sealed class PrivateDnsNamespaceState : global::Pulumi.ResourceArgs
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

        /// <summary>
        /// The ID of VPC that you want to associate the namespace with.
        /// </summary>
        [Input("vpc")]
        public Input<string>? Vpc { get; set; }

        public PrivateDnsNamespaceState()
        {
        }
        public static new PrivateDnsNamespaceState Empty => new PrivateDnsNamespaceState();
    }
}
