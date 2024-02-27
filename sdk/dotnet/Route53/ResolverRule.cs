// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Route53
{
    /// <summary>
    /// Provides a Route53 Resolver rule.
    /// 
    /// ## Example Usage
    /// ### System rule
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var sys = new Aws.Route53.ResolverRule("sys", new()
    ///     {
    ///         DomainName = "subdomain.example.com",
    ///         RuleType = "SYSTEM",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Forward rule
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var fwd = new Aws.Route53.ResolverRule("fwd", new()
    ///     {
    ///         DomainName = "example.com",
    ///         RuleType = "FORWARD",
    ///         ResolverEndpointId = aws_route53_resolver_endpoint.Foo.Id,
    ///         TargetIps = new[]
    ///         {
    ///             new Aws.Route53.Inputs.ResolverRuleTargetIpArgs
    ///             {
    ///                 Ip = "123.45.67.89",
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Environment", "Prod" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Route53 Resolver rules using the `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:route53/resolverRule:ResolverRule sys rslvr-rr-0123456789abcdef0
    /// ```
    /// </summary>
    [AwsResourceType("aws:route53/resolverRule:ResolverRule")]
    public partial class ResolverRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN (Amazon Resource Name) for the resolver rule.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
        /// </summary>
        [Output("domainName")]
        public Output<string> DomainName { get; private set; } = null!;

        /// <summary>
        /// A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
        /// </summary>
        [Output("ownerId")]
        public Output<string> OwnerId { get; private set; } = null!;

        /// <summary>
        /// The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
        /// This argument should only be specified for `FORWARD` type rules.
        /// </summary>
        [Output("resolverEndpointId")]
        public Output<string?> ResolverEndpointId { get; private set; } = null!;

        /// <summary>
        /// The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
        /// </summary>
        [Output("ruleType")]
        public Output<string> RuleType { get; private set; } = null!;

        /// <summary>
        /// Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
        /// Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
        /// </summary>
        [Output("shareStatus")]
        public Output<string> ShareStatus { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
        /// This argument should only be specified for `FORWARD` type rules.
        /// </summary>
        [Output("targetIps")]
        public Output<ImmutableArray<Outputs.ResolverRuleTargetIp>> TargetIps { get; private set; } = null!;


        /// <summary>
        /// Create a ResolverRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResolverRule(string name, ResolverRuleArgs args, CustomResourceOptions? options = null)
            : base("aws:route53/resolverRule:ResolverRule", name, args ?? new ResolverRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResolverRule(string name, Input<string> id, ResolverRuleState? state = null, CustomResourceOptions? options = null)
            : base("aws:route53/resolverRule:ResolverRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ResolverRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResolverRule Get(string name, Input<string> id, ResolverRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new ResolverRule(name, id, state, options);
        }
    }

    public sealed class ResolverRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
        /// </summary>
        [Input("domainName", required: true)]
        public Input<string> DomainName { get; set; } = null!;

        /// <summary>
        /// A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
        /// This argument should only be specified for `FORWARD` type rules.
        /// </summary>
        [Input("resolverEndpointId")]
        public Input<string>? ResolverEndpointId { get; set; }

        /// <summary>
        /// The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
        /// </summary>
        [Input("ruleType", required: true)]
        public Input<string> RuleType { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("targetIps")]
        private InputList<Inputs.ResolverRuleTargetIpArgs>? _targetIps;

        /// <summary>
        /// Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
        /// This argument should only be specified for `FORWARD` type rules.
        /// </summary>
        public InputList<Inputs.ResolverRuleTargetIpArgs> TargetIps
        {
            get => _targetIps ?? (_targetIps = new InputList<Inputs.ResolverRuleTargetIpArgs>());
            set => _targetIps = value;
        }

        public ResolverRuleArgs()
        {
        }
        public static new ResolverRuleArgs Empty => new ResolverRuleArgs();
    }

    public sealed class ResolverRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN (Amazon Resource Name) for the resolver rule.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        /// <summary>
        /// A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
        /// </summary>
        [Input("ownerId")]
        public Input<string>? OwnerId { get; set; }

        /// <summary>
        /// The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
        /// This argument should only be specified for `FORWARD` type rules.
        /// </summary>
        [Input("resolverEndpointId")]
        public Input<string>? ResolverEndpointId { get; set; }

        /// <summary>
        /// The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
        /// </summary>
        [Input("ruleType")]
        public Input<string>? RuleType { get; set; }

        /// <summary>
        /// Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
        /// Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
        /// </summary>
        [Input("shareStatus")]
        public Input<string>? ShareStatus { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        [Input("targetIps")]
        private InputList<Inputs.ResolverRuleTargetIpGetArgs>? _targetIps;

        /// <summary>
        /// Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
        /// This argument should only be specified for `FORWARD` type rules.
        /// </summary>
        public InputList<Inputs.ResolverRuleTargetIpGetArgs> TargetIps
        {
            get => _targetIps ?? (_targetIps = new InputList<Inputs.ResolverRuleTargetIpGetArgs>());
            set => _targetIps = value;
        }

        public ResolverRuleState()
        {
        }
        public static new ResolverRuleState Empty => new ResolverRuleState();
    }
}
