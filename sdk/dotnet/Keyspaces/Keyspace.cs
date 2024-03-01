// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Keyspaces
{
    /// <summary>
    /// Provides a Keyspaces Keyspace.
    /// 
    /// More information about keyspaces can be found in the [Keyspaces User Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/what-is-keyspaces.html).
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
    ///     var example = new Aws.Keyspaces.Keyspace("example", new()
    ///     {
    ///         Name = "my_keyspace",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import a keyspace using the `name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:keyspaces/keyspace:Keyspace example my_keyspace
    /// ```
    /// </summary>
    [AwsResourceType("aws:keyspaces/keyspace:Keyspace")]
    public partial class Keyspace : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the keyspace.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The name of the keyspace to be created.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a Keyspace resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Keyspace(string name, KeyspaceArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:keyspaces/keyspace:Keyspace", name, args ?? new KeyspaceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Keyspace(string name, Input<string> id, KeyspaceState? state = null, CustomResourceOptions? options = null)
            : base("aws:keyspaces/keyspace:Keyspace", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Keyspace resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Keyspace Get(string name, Input<string> id, KeyspaceState? state = null, CustomResourceOptions? options = null)
        {
            return new Keyspace(name, id, state, options);
        }
    }

    public sealed class KeyspaceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the keyspace to be created.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public KeyspaceArgs()
        {
        }
        public static new KeyspaceArgs Empty => new KeyspaceArgs();
    }

    public sealed class KeyspaceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the keyspace.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The name of the keyspace to be created.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public KeyspaceState()
        {
        }
        public static new KeyspaceState Empty => new KeyspaceState();
    }
}
