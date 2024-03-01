// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    /// <summary>
    /// Provides an EC2 placement group. Read more about placement groups
    /// in [AWS Docs](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html).
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
    ///     var web = new Aws.Ec2.PlacementGroup("web", new()
    ///     {
    ///         Name = "hunky-dory-pg",
    ///         Strategy = "cluster",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import placement groups using the `name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ec2/placementGroup:PlacementGroup prod_pg production-placement-group
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2/placementGroup:PlacementGroup")]
    public partial class PlacementGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the placement group.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The name of the placement group.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The number of partitions to create in the
        /// placement group.  Can only be specified when the `strategy` is set to
        /// `partition`.  Valid values are 1 - 7 (default is `2`).
        /// </summary>
        [Output("partitionCount")]
        public Output<int> PartitionCount { get; private set; } = null!;

        /// <summary>
        /// The ID of the placement group.
        /// </summary>
        [Output("placementGroupId")]
        public Output<string> PlacementGroupId { get; private set; } = null!;

        /// <summary>
        /// Determines how placement groups spread instances. Can only be used
        /// when the `strategy` is set to `spread`. Can be `host` or `rack`. `host` can only be used for Outpost placement groups. Defaults to `rack`.
        /// </summary>
        [Output("spreadLevel")]
        public Output<string> SpreadLevel { get; private set; } = null!;

        /// <summary>
        /// The placement strategy. Can be `cluster`, `partition` or `spread`.
        /// </summary>
        [Output("strategy")]
        public Output<string> Strategy { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a PlacementGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PlacementGroup(string name, PlacementGroupArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2/placementGroup:PlacementGroup", name, args ?? new PlacementGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PlacementGroup(string name, Input<string> id, PlacementGroupState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/placementGroup:PlacementGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PlacementGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PlacementGroup Get(string name, Input<string> id, PlacementGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new PlacementGroup(name, id, state, options);
        }
    }

    public sealed class PlacementGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the placement group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The number of partitions to create in the
        /// placement group.  Can only be specified when the `strategy` is set to
        /// `partition`.  Valid values are 1 - 7 (default is `2`).
        /// </summary>
        [Input("partitionCount")]
        public Input<int>? PartitionCount { get; set; }

        /// <summary>
        /// Determines how placement groups spread instances. Can only be used
        /// when the `strategy` is set to `spread`. Can be `host` or `rack`. `host` can only be used for Outpost placement groups. Defaults to `rack`.
        /// </summary>
        [Input("spreadLevel")]
        public Input<string>? SpreadLevel { get; set; }

        /// <summary>
        /// The placement strategy. Can be `cluster`, `partition` or `spread`.
        /// </summary>
        [Input("strategy", required: true)]
        public InputUnion<string, Pulumi.Aws.Ec2.PlacementStrategy> Strategy { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public PlacementGroupArgs()
        {
        }
        public static new PlacementGroupArgs Empty => new PlacementGroupArgs();
    }

    public sealed class PlacementGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the placement group.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The name of the placement group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The number of partitions to create in the
        /// placement group.  Can only be specified when the `strategy` is set to
        /// `partition`.  Valid values are 1 - 7 (default is `2`).
        /// </summary>
        [Input("partitionCount")]
        public Input<int>? PartitionCount { get; set; }

        /// <summary>
        /// The ID of the placement group.
        /// </summary>
        [Input("placementGroupId")]
        public Input<string>? PlacementGroupId { get; set; }

        /// <summary>
        /// Determines how placement groups spread instances. Can only be used
        /// when the `strategy` is set to `spread`. Can be `host` or `rack`. `host` can only be used for Outpost placement groups. Defaults to `rack`.
        /// </summary>
        [Input("spreadLevel")]
        public Input<string>? SpreadLevel { get; set; }

        /// <summary>
        /// The placement strategy. Can be `cluster`, `partition` or `spread`.
        /// </summary>
        [Input("strategy")]
        public InputUnion<string, Pulumi.Aws.Ec2.PlacementStrategy>? Strategy { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public PlacementGroupState()
        {
        }
        public static new PlacementGroupState Empty => new PlacementGroupState();
    }
}
