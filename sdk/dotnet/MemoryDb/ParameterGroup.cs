// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MemoryDb
{
    /// <summary>
    /// Provides a MemoryDB Parameter Group.
    /// 
    /// More information about parameter groups can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/parametergroups.html).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Aws.MemoryDb.ParameterGroup("example", new Aws.MemoryDb.ParameterGroupArgs
    ///         {
    ///             Family = "memorydb_redis6",
    ///             Parameters = 
    ///             {
    ///                 new Aws.MemoryDb.Inputs.ParameterGroupParameterArgs
    ///                 {
    ///                     Name = "activedefrag",
    ///                     Value = "yes",
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Use the `name` to import a parameter group. For example
    /// 
    /// ```sh
    ///  $ pulumi import aws:memorydb/parameterGroup:ParameterGroup example my-parameter-group
    /// ```
    /// </summary>
    [AwsResourceType("aws:memorydb/parameterGroup:ParameterGroup")]
    public partial class ParameterGroup : Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the parameter group.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The engine version that the parameter group can be used with.
        /// </summary>
        [Output("family")]
        public Output<string> Family { get; private set; } = null!;

        /// <summary>
        /// The name of the parameter.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        /// </summary>
        [Output("namePrefix")]
        public Output<string> NamePrefix { get; private set; } = null!;

        /// <summary>
        /// Set of MemoryDB parameters to apply. Any parameters not specified will fall back to their family defaults. Detailed below.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableArray<Outputs.ParameterGroupParameter>> Parameters { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a ParameterGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ParameterGroup(string name, ParameterGroupArgs args, CustomResourceOptions? options = null)
            : base("aws:memorydb/parameterGroup:ParameterGroup", name, args ?? new ParameterGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ParameterGroup(string name, Input<string> id, ParameterGroupState? state = null, CustomResourceOptions? options = null)
            : base("aws:memorydb/parameterGroup:ParameterGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ParameterGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ParameterGroup Get(string name, Input<string> id, ParameterGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new ParameterGroup(name, id, state, options);
        }
    }

    public sealed class ParameterGroupArgs : Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The engine version that the parameter group can be used with.
        /// </summary>
        [Input("family", required: true)]
        public Input<string> Family { get; set; } = null!;

        /// <summary>
        /// The name of the parameter.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        [Input("parameters")]
        private InputList<Inputs.ParameterGroupParameterArgs>? _parameters;

        /// <summary>
        /// Set of MemoryDB parameters to apply. Any parameters not specified will fall back to their family defaults. Detailed below.
        /// </summary>
        public InputList<Inputs.ParameterGroupParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.ParameterGroupParameterArgs>());
            set => _parameters = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ParameterGroupArgs()
        {
        }
    }

    public sealed class ParameterGroupState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the parameter group.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The engine version that the parameter group can be used with.
        /// </summary>
        [Input("family")]
        public Input<string>? Family { get; set; }

        /// <summary>
        /// The name of the parameter.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        [Input("parameters")]
        private InputList<Inputs.ParameterGroupParameterGetArgs>? _parameters;

        /// <summary>
        /// Set of MemoryDB parameters to apply. Any parameters not specified will fall back to their family defaults. Detailed below.
        /// </summary>
        public InputList<Inputs.ParameterGroupParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.ParameterGroupParameterGetArgs>());
            set => _parameters = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public ParameterGroupState()
        {
        }
    }
}
