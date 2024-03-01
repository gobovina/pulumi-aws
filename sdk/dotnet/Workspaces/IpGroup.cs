// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Workspaces
{
    /// <summary>
    /// Provides an IP access control group in AWS WorkSpaces Service
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
    ///     var contractors = new Aws.Workspaces.IpGroup("contractors", new()
    ///     {
    ///         Name = "Contractors",
    ///         Description = "Contractors IP access control group",
    ///         Rules = new[]
    ///         {
    ///             new Aws.Workspaces.Inputs.IpGroupRuleArgs
    ///             {
    ///                 Source = "150.24.14.0/24",
    ///                 Description = "NY",
    ///             },
    ///             new Aws.Workspaces.Inputs.IpGroupRuleArgs
    ///             {
    ///                 Source = "125.191.14.85/32",
    ///                 Description = "LA",
    ///             },
    ///             new Aws.Workspaces.Inputs.IpGroupRuleArgs
    ///             {
    ///                 Source = "44.98.100.0/24",
    ///                 Description = "STL",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import WorkSpaces IP groups using their GroupID. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:workspaces/ipGroup:IpGroup example wsipg-488lrtl3k
    /// ```
    /// </summary>
    [AwsResourceType("aws:workspaces/ipGroup:IpGroup")]
    public partial class IpGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the IP group.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the IP group.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.IpGroupRule>> Rules { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the WorkSpaces directory. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a IpGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IpGroup(string name, IpGroupArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:workspaces/ipGroup:IpGroup", name, args ?? new IpGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IpGroup(string name, Input<string> id, IpGroupState? state = null, CustomResourceOptions? options = null)
            : base("aws:workspaces/ipGroup:IpGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IpGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IpGroup Get(string name, Input<string> id, IpGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new IpGroup(name, id, state, options);
        }
    }

    public sealed class IpGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the IP group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the IP group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("rules")]
        private InputList<Inputs.IpGroupRuleArgs>? _rules;

        /// <summary>
        /// One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
        /// </summary>
        public InputList<Inputs.IpGroupRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.IpGroupRuleArgs>());
            set => _rules = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags assigned to the WorkSpaces directory. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public IpGroupArgs()
        {
        }
        public static new IpGroupArgs Empty => new IpGroupArgs();
    }

    public sealed class IpGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the IP group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the IP group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("rules")]
        private InputList<Inputs.IpGroupRuleGetArgs>? _rules;

        /// <summary>
        /// One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
        /// </summary>
        public InputList<Inputs.IpGroupRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.IpGroupRuleGetArgs>());
            set => _rules = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags assigned to the WorkSpaces directory. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public IpGroupState()
        {
        }
        public static new IpGroupState Empty => new IpGroupState();
    }
}
