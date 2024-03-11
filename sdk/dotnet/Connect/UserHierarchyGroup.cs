// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Connect
{
    /// <summary>
    /// Provides an Amazon Connect User Hierarchy Group resource. For more information see
    /// [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
    /// 
    /// &gt; **NOTE:** The User Hierarchy Structure must be created before creating a User Hierarchy Group.
    /// 
    /// ## Example Usage
    /// 
    /// ### Basic
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
    ///     var example = new Aws.Connect.UserHierarchyGroup("example", new()
    ///     {
    ///         InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
    ///         Name = "example",
    ///         Tags = 
    ///         {
    ///             { "Name", "Example User Hierarchy Group" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### With a parent group
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
    ///     var parent = new Aws.Connect.UserHierarchyGroup("parent", new()
    ///     {
    ///         InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
    ///         Name = "parent",
    ///         Tags = 
    ///         {
    ///             { "Name", "Example User Hierarchy Group Parent" },
    ///         },
    ///     });
    /// 
    ///     var child = new Aws.Connect.UserHierarchyGroup("child", new()
    ///     {
    ///         InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
    ///         Name = "child",
    ///         ParentGroupId = parent.HierarchyGroupId,
    ///         Tags = 
    ///         {
    ///             { "Name", "Example User Hierarchy Group Child" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Amazon Connect User Hierarchy Groups using the `instance_id` and `hierarchy_group_id` separated by a colon (`:`). For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:connect/userHierarchyGroup:UserHierarchyGroup example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
    /// ```
    /// </summary>
    [AwsResourceType("aws:connect/userHierarchyGroup:UserHierarchyGroup")]
    public partial class UserHierarchyGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the hierarchy group.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The identifier for the hierarchy group.
        /// </summary>
        [Output("hierarchyGroupId")]
        public Output<string> HierarchyGroupId { get; private set; } = null!;

        /// <summary>
        /// A block that contains information about the levels in the hierarchy group. The `hierarchy_path` block is documented below.
        /// </summary>
        [Output("hierarchyPaths")]
        public Output<ImmutableArray<Outputs.UserHierarchyGroupHierarchyPath>> HierarchyPaths { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier of the hosting Amazon Connect Instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// The identifier of the level in the hierarchy group.
        /// </summary>
        [Output("levelId")]
        public Output<string> LevelId { get; private set; } = null!;

        /// <summary>
        /// The name of the user hierarchy group. Must not be more than 100 characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
        /// </summary>
        [Output("parentGroupId")]
        public Output<string?> ParentGroupId { get; private set; } = null!;

        /// <summary>
        /// Tags to apply to the hierarchy group. If configured with a provider
        /// `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a UserHierarchyGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserHierarchyGroup(string name, UserHierarchyGroupArgs args, CustomResourceOptions? options = null)
            : base("aws:connect/userHierarchyGroup:UserHierarchyGroup", name, args ?? new UserHierarchyGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserHierarchyGroup(string name, Input<string> id, UserHierarchyGroupState? state = null, CustomResourceOptions? options = null)
            : base("aws:connect/userHierarchyGroup:UserHierarchyGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserHierarchyGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserHierarchyGroup Get(string name, Input<string> id, UserHierarchyGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new UserHierarchyGroup(name, id, state, options);
        }
    }

    public sealed class UserHierarchyGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the identifier of the hosting Amazon Connect Instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// The name of the user hierarchy group. Must not be more than 100 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
        /// </summary>
        [Input("parentGroupId")]
        public Input<string>? ParentGroupId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Tags to apply to the hierarchy group. If configured with a provider
        /// `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public UserHierarchyGroupArgs()
        {
        }
        public static new UserHierarchyGroupArgs Empty => new UserHierarchyGroupArgs();
    }

    public sealed class UserHierarchyGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the hierarchy group.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The identifier for the hierarchy group.
        /// </summary>
        [Input("hierarchyGroupId")]
        public Input<string>? HierarchyGroupId { get; set; }

        [Input("hierarchyPaths")]
        private InputList<Inputs.UserHierarchyGroupHierarchyPathGetArgs>? _hierarchyPaths;

        /// <summary>
        /// A block that contains information about the levels in the hierarchy group. The `hierarchy_path` block is documented below.
        /// </summary>
        public InputList<Inputs.UserHierarchyGroupHierarchyPathGetArgs> HierarchyPaths
        {
            get => _hierarchyPaths ?? (_hierarchyPaths = new InputList<Inputs.UserHierarchyGroupHierarchyPathGetArgs>());
            set => _hierarchyPaths = value;
        }

        /// <summary>
        /// Specifies the identifier of the hosting Amazon Connect Instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The identifier of the level in the hierarchy group.
        /// </summary>
        [Input("levelId")]
        public Input<string>? LevelId { get; set; }

        /// <summary>
        /// The name of the user hierarchy group. Must not be more than 100 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
        /// </summary>
        [Input("parentGroupId")]
        public Input<string>? ParentGroupId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Tags to apply to the hierarchy group. If configured with a provider
        /// `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public UserHierarchyGroupState()
        {
        }
        public static new UserHierarchyGroupState Empty => new UserHierarchyGroupState();
    }
}
