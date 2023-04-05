// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Rbin
{
    /// <summary>
    /// Resource for managing an AWS RBin Rule.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Rbin.Rule("example", new()
    ///     {
    ///         Description = "example_rule",
    ///         ResourceType = "EBS_SNAPSHOT",
    ///         ResourceTags = new[]
    ///         {
    ///             new Aws.Rbin.Inputs.RuleResourceTagArgs
    ///             {
    ///                 ResourceTagKey = tag_key,
    ///                 ResourceTagValue = "tag_value",
    ///             },
    ///         },
    ///         RetentionPeriod = new Aws.Rbin.Inputs.RuleRetentionPeriodArgs
    ///         {
    ///             RetentionPeriodValue = 10,
    ///             RetentionPeriodUnit = "DAYS",
    ///         },
    ///         Tags = 
    ///         {
    ///             { "test_tag_key", "test_tag_value" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// RBin Rule can be imported using the `id`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:rbin/rule:Rule example examplerule
    /// ```
    /// </summary>
    [AwsResourceType("aws:rbin/rule:Rule")]
    public partial class Rule : global::Pulumi.CustomResource
    {
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The retention rule description.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Information about the retention rule lock configuration. See `lock_configuration` below.
        /// </summary>
        [Output("lockConfiguration")]
        public Output<Outputs.RuleLockConfiguration?> LockConfiguration { get; private set; } = null!;

        /// <summary>
        /// (Timestamp) The date and time at which the unlock delay is set to expire. Only returned for retention rules that have been unlocked and that are still within the unlock delay period.
        /// </summary>
        [Output("lockEndTime")]
        public Output<string> LockEndTime { get; private set; } = null!;

        /// <summary>
        /// (Optional) The lock state of the retention rules to list. Only retention rules with the specified lock state are returned. Valid values are `locked`, `pending_unlock`, `unlocked`.
        /// </summary>
        [Output("lockState")]
        public Output<string> LockState { get; private set; } = null!;

        /// <summary>
        /// Specifies the resource tags to use to identify resources that are to be retained by a tag-level retention rule. See `resource_tags` below.
        /// </summary>
        [Output("resourceTags")]
        public Output<ImmutableArray<Outputs.RuleResourceTag>> ResourceTags { get; private set; } = null!;

        /// <summary>
        /// The resource type to be retained by the retention rule. Valid values are `EBS_SNAPSHOT` and `EC2_IMAGE`.
        /// </summary>
        [Output("resourceType")]
        public Output<string> ResourceType { get; private set; } = null!;

        /// <summary>
        /// Information about the retention period for which the retention rule is to retain resources. See `retention_period` below.
        /// </summary>
        [Output("retentionPeriod")]
        public Output<Outputs.RuleRetentionPeriod> RetentionPeriod { get; private set; } = null!;

        /// <summary>
        /// (String) The state of the retention rule. Only retention rules that are in the `available` state retain resources. Valid values include `pending` and `available`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a Rule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Rule(string name, RuleArgs args, CustomResourceOptions? options = null)
            : base("aws:rbin/rule:Rule", name, args ?? new RuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Rule(string name, Input<string> id, RuleState? state = null, CustomResourceOptions? options = null)
            : base("aws:rbin/rule:Rule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Rule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Rule Get(string name, Input<string> id, RuleState? state = null, CustomResourceOptions? options = null)
        {
            return new Rule(name, id, state, options);
        }
    }

    public sealed class RuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The retention rule description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Information about the retention rule lock configuration. See `lock_configuration` below.
        /// </summary>
        [Input("lockConfiguration")]
        public Input<Inputs.RuleLockConfigurationArgs>? LockConfiguration { get; set; }

        [Input("resourceTags")]
        private InputList<Inputs.RuleResourceTagArgs>? _resourceTags;

        /// <summary>
        /// Specifies the resource tags to use to identify resources that are to be retained by a tag-level retention rule. See `resource_tags` below.
        /// </summary>
        public InputList<Inputs.RuleResourceTagArgs> ResourceTags
        {
            get => _resourceTags ?? (_resourceTags = new InputList<Inputs.RuleResourceTagArgs>());
            set => _resourceTags = value;
        }

        /// <summary>
        /// The resource type to be retained by the retention rule. Valid values are `EBS_SNAPSHOT` and `EC2_IMAGE`.
        /// </summary>
        [Input("resourceType", required: true)]
        public Input<string> ResourceType { get; set; } = null!;

        /// <summary>
        /// Information about the retention period for which the retention rule is to retain resources. See `retention_period` below.
        /// </summary>
        [Input("retentionPeriod", required: true)]
        public Input<Inputs.RuleRetentionPeriodArgs> RetentionPeriod { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public RuleArgs()
        {
        }
        public static new RuleArgs Empty => new RuleArgs();
    }

    public sealed class RuleState : global::Pulumi.ResourceArgs
    {
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The retention rule description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Information about the retention rule lock configuration. See `lock_configuration` below.
        /// </summary>
        [Input("lockConfiguration")]
        public Input<Inputs.RuleLockConfigurationGetArgs>? LockConfiguration { get; set; }

        /// <summary>
        /// (Timestamp) The date and time at which the unlock delay is set to expire. Only returned for retention rules that have been unlocked and that are still within the unlock delay period.
        /// </summary>
        [Input("lockEndTime")]
        public Input<string>? LockEndTime { get; set; }

        /// <summary>
        /// (Optional) The lock state of the retention rules to list. Only retention rules with the specified lock state are returned. Valid values are `locked`, `pending_unlock`, `unlocked`.
        /// </summary>
        [Input("lockState")]
        public Input<string>? LockState { get; set; }

        [Input("resourceTags")]
        private InputList<Inputs.RuleResourceTagGetArgs>? _resourceTags;

        /// <summary>
        /// Specifies the resource tags to use to identify resources that are to be retained by a tag-level retention rule. See `resource_tags` below.
        /// </summary>
        public InputList<Inputs.RuleResourceTagGetArgs> ResourceTags
        {
            get => _resourceTags ?? (_resourceTags = new InputList<Inputs.RuleResourceTagGetArgs>());
            set => _resourceTags = value;
        }

        /// <summary>
        /// The resource type to be retained by the retention rule. Valid values are `EBS_SNAPSHOT` and `EC2_IMAGE`.
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        /// <summary>
        /// Information about the retention period for which the retention rule is to retain resources. See `retention_period` below.
        /// </summary>
        [Input("retentionPeriod")]
        public Input<Inputs.RuleRetentionPeriodGetArgs>? RetentionPeriod { get; set; }

        /// <summary>
        /// (String) The state of the retention rule. Only retention rules that are in the `available` state retain resources. Valid values include `pending` and `available`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public RuleState()
        {
        }
        public static new RuleState Empty => new RuleState();
    }
}
