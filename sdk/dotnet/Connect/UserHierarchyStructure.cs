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
    /// Provides an Amazon Connect User Hierarchy Structure resource. For more information see
    /// [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
    /// 
    /// ## Example Usage
    /// ### Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Connect.UserHierarchyStructure("example", new()
    ///     {
    ///         InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
    ///         HierarchyStructure = new Aws.Connect.Inputs.UserHierarchyStructureHierarchyStructureArgs
    ///         {
    ///             LevelOne = new Aws.Connect.Inputs.UserHierarchyStructureHierarchyStructureLevelOneArgs
    ///             {
    ///                 Name = "levelone",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### With Five Levels
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Connect.UserHierarchyStructure("example", new()
    ///     {
    ///         InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
    ///         HierarchyStructure = new Aws.Connect.Inputs.UserHierarchyStructureHierarchyStructureArgs
    ///         {
    ///             LevelOne = new Aws.Connect.Inputs.UserHierarchyStructureHierarchyStructureLevelOneArgs
    ///             {
    ///                 Name = "levelone",
    ///             },
    ///             LevelTwo = new Aws.Connect.Inputs.UserHierarchyStructureHierarchyStructureLevelTwoArgs
    ///             {
    ///                 Name = "leveltwo",
    ///             },
    ///             LevelThree = new Aws.Connect.Inputs.UserHierarchyStructureHierarchyStructureLevelThreeArgs
    ///             {
    ///                 Name = "levelthree",
    ///             },
    ///             LevelFour = new Aws.Connect.Inputs.UserHierarchyStructureHierarchyStructureLevelFourArgs
    ///             {
    ///                 Name = "levelfour",
    ///             },
    ///             LevelFive = new Aws.Connect.Inputs.UserHierarchyStructureHierarchyStructureLevelFiveArgs
    ///             {
    ///                 Name = "levelfive",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Amazon Connect User Hierarchy Structures using the `instance_id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:connect/userHierarchyStructure:UserHierarchyStructure example f1288a1f-6193-445a-b47e-af739b2
    /// ```
    /// </summary>
    [AwsResourceType("aws:connect/userHierarchyStructure:UserHierarchyStructure")]
    public partial class UserHierarchyStructure : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A block that defines the hierarchy structure's levels. The `hierarchy_structure` block is documented below.
        /// </summary>
        [Output("hierarchyStructure")]
        public Output<Outputs.UserHierarchyStructureHierarchyStructure> HierarchyStructure { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier of the hosting Amazon Connect Instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;


        /// <summary>
        /// Create a UserHierarchyStructure resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserHierarchyStructure(string name, UserHierarchyStructureArgs args, CustomResourceOptions? options = null)
            : base("aws:connect/userHierarchyStructure:UserHierarchyStructure", name, args ?? new UserHierarchyStructureArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserHierarchyStructure(string name, Input<string> id, UserHierarchyStructureState? state = null, CustomResourceOptions? options = null)
            : base("aws:connect/userHierarchyStructure:UserHierarchyStructure", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserHierarchyStructure resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserHierarchyStructure Get(string name, Input<string> id, UserHierarchyStructureState? state = null, CustomResourceOptions? options = null)
        {
            return new UserHierarchyStructure(name, id, state, options);
        }
    }

    public sealed class UserHierarchyStructureArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A block that defines the hierarchy structure's levels. The `hierarchy_structure` block is documented below.
        /// </summary>
        [Input("hierarchyStructure", required: true)]
        public Input<Inputs.UserHierarchyStructureHierarchyStructureArgs> HierarchyStructure { get; set; } = null!;

        /// <summary>
        /// Specifies the identifier of the hosting Amazon Connect Instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        public UserHierarchyStructureArgs()
        {
        }
        public static new UserHierarchyStructureArgs Empty => new UserHierarchyStructureArgs();
    }

    public sealed class UserHierarchyStructureState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A block that defines the hierarchy structure's levels. The `hierarchy_structure` block is documented below.
        /// </summary>
        [Input("hierarchyStructure")]
        public Input<Inputs.UserHierarchyStructureHierarchyStructureGetArgs>? HierarchyStructure { get; set; }

        /// <summary>
        /// Specifies the identifier of the hosting Amazon Connect Instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        public UserHierarchyStructureState()
        {
        }
        public static new UserHierarchyStructureState Empty => new UserHierarchyStructureState();
    }
}
