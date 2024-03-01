// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Waf
{
    /// <summary>
    /// Provides a WAF Rule Resource
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
    ///     var ipset = new Aws.Waf.IpSet("ipset", new()
    ///     {
    ///         Name = "tfIPSet",
    ///         IpSetDescriptors = new[]
    ///         {
    ///             new Aws.Waf.Inputs.IpSetIpSetDescriptorArgs
    ///             {
    ///                 Type = "IPV4",
    ///                 Value = "192.0.7.0/24",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var wafrule = new Aws.Waf.Rule("wafrule", new()
    ///     {
    ///         Name = "tfWAFRule",
    ///         MetricName = "tfWAFRule",
    ///         Predicates = new[]
    ///         {
    ///             new Aws.Waf.Inputs.RulePredicateArgs
    ///             {
    ///                 DataId = ipset.Id,
    ///                 Negated = false,
    ///                 Type = "IPMatch",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import WAF rules using the id. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:waf/rule:Rule example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
    /// ```
    /// </summary>
    [AwsResourceType("aws:waf/rule:Rule")]
    public partial class Rule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the WAF rule.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The name or description for the Amazon CloudWatch metric of this rule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace.
        /// </summary>
        [Output("metricName")]
        public Output<string> MetricName { get; private set; } = null!;

        /// <summary>
        /// The name or description of the rule.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The objects to include in a rule (documented below).
        /// </summary>
        [Output("predicates")]
        public Output<ImmutableArray<Outputs.RulePredicate>> Predicates { get; private set; } = null!;

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
        /// Create a Rule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Rule(string name, RuleArgs args, CustomResourceOptions? options = null)
            : base("aws:waf/rule:Rule", name, args ?? new RuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Rule(string name, Input<string> id, RuleState? state = null, CustomResourceOptions? options = null)
            : base("aws:waf/rule:Rule", name, state, MakeResourceOptions(options, id))
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
        /// The name or description for the Amazon CloudWatch metric of this rule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace.
        /// </summary>
        [Input("metricName", required: true)]
        public Input<string> MetricName { get; set; } = null!;

        /// <summary>
        /// The name or description of the rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("predicates")]
        private InputList<Inputs.RulePredicateArgs>? _predicates;

        /// <summary>
        /// The objects to include in a rule (documented below).
        /// </summary>
        public InputList<Inputs.RulePredicateArgs> Predicates
        {
            get => _predicates ?? (_predicates = new InputList<Inputs.RulePredicateArgs>());
            set => _predicates = value;
        }

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

        public RuleArgs()
        {
        }
        public static new RuleArgs Empty => new RuleArgs();
    }

    public sealed class RuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the WAF rule.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The name or description for the Amazon CloudWatch metric of this rule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace.
        /// </summary>
        [Input("metricName")]
        public Input<string>? MetricName { get; set; }

        /// <summary>
        /// The name or description of the rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("predicates")]
        private InputList<Inputs.RulePredicateGetArgs>? _predicates;

        /// <summary>
        /// The objects to include in a rule (documented below).
        /// </summary>
        public InputList<Inputs.RulePredicateGetArgs> Predicates
        {
            get => _predicates ?? (_predicates = new InputList<Inputs.RulePredicateGetArgs>());
            set => _predicates = value;
        }

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

        public RuleState()
        {
        }
        public static new RuleState Empty => new RuleState();
    }
}
