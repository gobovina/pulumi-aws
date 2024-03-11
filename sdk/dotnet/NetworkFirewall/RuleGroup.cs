// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkFirewall
{
    /// <summary>
    /// Provides an AWS Network Firewall Rule Group Resource
    /// 
    /// ## Example Usage
    /// 
    /// ### Stateful Inspection for denying access to a domain
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
    ///     var example = new Aws.NetworkFirewall.RuleGroup("example", new()
    ///     {
    ///         Capacity = 100,
    ///         Name = "example",
    ///         Type = "STATEFUL",
    ///         RuleGroupConfiguration = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupArgs
    ///         {
    ///             RulesSource = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceArgs
    ///             {
    ///                 RulesSourceList = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceRulesSourceListArgs
    ///                 {
    ///                     GeneratedRulesType = "DENYLIST",
    ///                     TargetTypes = new[]
    ///                     {
    ///                         "HTTP_HOST",
    ///                     },
    ///                     Targets = new[]
    ///                     {
    ///                         "test.example.com",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Tag1", "Value1" },
    ///             { "Tag2", "Value2" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Stateful Inspection for permitting packets from a source IP address
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
    ///     var ips = new[]
    ///     {
    ///         "1.1.1.1/32",
    ///         "1.0.0.1/32",
    ///     };
    /// 
    ///     var example = new Aws.NetworkFirewall.RuleGroup("example", new()
    ///     {
    ///         Capacity = 50,
    ///         Description = "Permits http traffic from source",
    ///         Name = "example",
    ///         Type = "STATEFUL",
    ///         RuleGroupConfiguration = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupArgs
    ///         {
    ///             RulesSource = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceArgs
    ///             {
    ///                 StatefulRules = ips.Select((v, k) =&gt; new { Key = k, Value = v }).Select(entry =&gt; 
    ///                 {
    ///                     return new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatefulRuleArgs
    ///                     {
    ///                         Action = "PASS",
    ///                         Header = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatefulRuleHeaderArgs
    ///                         {
    ///                             Destination = "ANY",
    ///                             DestinationPort = "ANY",
    ///                             Protocol = "HTTP",
    ///                             Direction = "ANY",
    ///                             SourcePort = "ANY",
    ///                             Source = entry.Value,
    ///                         },
    ///                         RuleOptions = new[]
    ///                         {
    ///                             new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionArgs
    ///                             {
    ///                                 Keyword = "sid",
    ///                                 Settings = new[]
    ///                                 {
    ///                                     "1",
    ///                                 },
    ///                             },
    ///                         },
    ///                     };
    ///                 }).ToList(),
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Name", "permit HTTP from source" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Stateful Inspection for blocking packets from going to an intended destination
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
    ///     var example = new Aws.NetworkFirewall.RuleGroup("example", new()
    ///     {
    ///         Capacity = 100,
    ///         Name = "example",
    ///         Type = "STATEFUL",
    ///         RuleGroupConfiguration = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupArgs
    ///         {
    ///             RulesSource = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceArgs
    ///             {
    ///                 StatefulRules = new[]
    ///                 {
    ///                     new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatefulRuleArgs
    ///                     {
    ///                         Action = "DROP",
    ///                         Header = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatefulRuleHeaderArgs
    ///                         {
    ///                             Destination = "124.1.1.24/32",
    ///                             DestinationPort = "53",
    ///                             Direction = "ANY",
    ///                             Protocol = "TCP",
    ///                             Source = "1.2.3.4/32",
    ///                             SourcePort = "53",
    ///                         },
    ///                         RuleOptions = new[]
    ///                         {
    ///                             new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionArgs
    ///                             {
    ///                                 Keyword = "sid",
    ///                                 Settings = new[]
    ///                                 {
    ///                                     "1",
    ///                                 },
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Tag1", "Value1" },
    ///             { "Tag2", "Value2" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Stateful Inspection from rules specifications defined in Suricata flat format
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.NetworkFirewall.RuleGroup("example", new()
    ///     {
    ///         Capacity = 100,
    ///         Name = "example",
    ///         Type = "STATEFUL",
    ///         Rules = Std.File.Invoke(new()
    ///         {
    ///             Input = "example.rules",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///         Tags = 
    ///         {
    ///             { "Tag1", "Value1" },
    ///             { "Tag2", "Value2" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Stateful Inspection from rule group specifications using rule variables and Suricata format rules
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.NetworkFirewall.RuleGroup("example", new()
    ///     {
    ///         Capacity = 100,
    ///         Name = "example",
    ///         Type = "STATEFUL",
    ///         RuleGroupConfiguration = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupArgs
    ///         {
    ///             RuleVariables = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRuleVariablesArgs
    ///             {
    ///                 IpSets = new[]
    ///                 {
    ///                     new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRuleVariablesIpSetArgs
    ///                     {
    ///                         Key = "WEBSERVERS_HOSTS",
    ///                         IpSet = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs
    ///                         {
    ///                             Definitions = new[]
    ///                             {
    ///                                 "10.0.0.0/16",
    ///                                 "10.0.1.0/24",
    ///                                 "192.168.0.0/16",
    ///                             },
    ///                         },
    ///                     },
    ///                     new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRuleVariablesIpSetArgs
    ///                     {
    ///                         Key = "EXTERNAL_HOST",
    ///                         IpSet = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs
    ///                         {
    ///                             Definitions = new[]
    ///                             {
    ///                                 "1.2.3.4/32",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///                 PortSets = new[]
    ///                 {
    ///                     new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRuleVariablesPortSetArgs
    ///                     {
    ///                         Key = "HTTP_PORTS",
    ///                         PortSet = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs
    ///                         {
    ///                             Definitions = new[]
    ///                             {
    ///                                 "443",
    ///                                 "80",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///             RulesSource = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceArgs
    ///             {
    ///                 RulesString = Std.File.Invoke(new()
    ///                 {
    ///                     Input = "suricata_rules_file",
    ///                 }).Apply(invoke =&gt; invoke.Result),
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Tag1", "Value1" },
    ///             { "Tag2", "Value2" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Stateless Inspection with a Custom Action
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
    ///     var example = new Aws.NetworkFirewall.RuleGroup("example", new()
    ///     {
    ///         Description = "Stateless Rate Limiting Rule",
    ///         Capacity = 100,
    ///         Name = "example",
    ///         Type = "STATELESS",
    ///         RuleGroupConfiguration = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupArgs
    ///         {
    ///             RulesSource = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceArgs
    ///             {
    ///                 StatelessRulesAndCustomActions = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsArgs
    ///                 {
    ///                     CustomActions = new[]
    ///                     {
    ///                         new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionArgs
    ///                         {
    ///                             ActionDefinition = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs
    ///                             {
    ///                                 PublishMetricAction = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionArgs
    ///                                 {
    ///                                     Dimensions = new[]
    ///                                     {
    ///                                         new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionDimensionArgs
    ///                                         {
    ///                                             Value = "2",
    ///                                         },
    ///                                     },
    ///                                 },
    ///                             },
    ///                             ActionName = "ExampleMetricsAction",
    ///                         },
    ///                     },
    ///                     StatelessRules = new[]
    ///                     {
    ///                         new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleArgs
    ///                         {
    ///                             Priority = 1,
    ///                             RuleDefinition = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs
    ///                             {
    ///                                 Actions = new[]
    ///                                 {
    ///                                     "aws:pass",
    ///                                     "ExampleMetricsAction",
    ///                                 },
    ///                                 MatchAttributes = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs
    ///                                 {
    ///                                     Sources = new[]
    ///                                     {
    ///                                         new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs
    ///                                         {
    ///                                             AddressDefinition = "1.2.3.4/32",
    ///                                         },
    ///                                     },
    ///                                     SourcePorts = new[]
    ///                                     {
    ///                                         new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortArgs
    ///                                         {
    ///                                             FromPort = 443,
    ///                                             ToPort = 443,
    ///                                         },
    ///                                     },
    ///                                     Destinations = new[]
    ///                                     {
    ///                                         new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationArgs
    ///                                         {
    ///                                             AddressDefinition = "124.1.1.5/32",
    ///                                         },
    ///                                     },
    ///                                     DestinationPorts = new[]
    ///                                     {
    ///                                         new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs
    ///                                         {
    ///                                             FromPort = 443,
    ///                                             ToPort = 443,
    ///                                         },
    ///                                     },
    ///                                     Protocols = new[]
    ///                                     {
    ///                                         6,
    ///                                     },
    ///                                     TcpFlags = new[]
    ///                                     {
    ///                                         new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs
    ///                                         {
    ///                                             Flags = new[]
    ///                                             {
    ///                                                 "SYN",
    ///                                             },
    ///                                             Masks = new[]
    ///                                             {
    ///                                                 "SYN",
    ///                                                 "ACK",
    ///                                             },
    ///                                         },
    ///                                     },
    ///                                 },
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Tag1", "Value1" },
    ///             { "Tag2", "Value2" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### IP Set References to the Rule Group
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
    ///     var example = new Aws.NetworkFirewall.RuleGroup("example", new()
    ///     {
    ///         Capacity = 100,
    ///         Name = "example",
    ///         Type = "STATEFUL",
    ///         RuleGroupConfiguration = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupArgs
    ///         {
    ///             RulesSource = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceArgs
    ///             {
    ///                 RulesSourceList = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupRulesSourceRulesSourceListArgs
    ///                 {
    ///                     GeneratedRulesType = "DENYLIST",
    ///                     TargetTypes = new[]
    ///                     {
    ///                         "HTTP_HOST",
    ///                     },
    ///                     Targets = new[]
    ///                     {
    ///                         "test.example.com",
    ///                     },
    ///                 },
    ///             },
    ///             ReferenceSets = new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupReferenceSetsArgs
    ///             {
    ///                 IpSetReferences = new[]
    ///                 {
    ///                     new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupReferenceSetsIpSetReferenceArgs
    ///                     {
    ///                         Key = "example",
    ///                         IpSetReferences = new[]
    ///                         {
    ///                             new Aws.NetworkFirewall.Inputs.RuleGroupRuleGroupReferenceSetsIpSetReferenceIpSetReferenceArgs
    ///                             {
    ///                                 ReferenceArn = @this.Arn,
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Tag1", "Value1" },
    ///             { "Tag2", "Value2" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Network Firewall Rule Groups using their `arn`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:networkfirewall/ruleGroup:RuleGroup example arn:aws:network-firewall:us-west-1:123456789012:stateful-rulegroup/example
    /// ```
    /// </summary>
    [AwsResourceType("aws:networkfirewall/ruleGroup:RuleGroup")]
    public partial class RuleGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) that identifies the rule group.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
        /// </summary>
        [Output("capacity")]
        public Output<int> Capacity { get; private set; } = null!;

        /// <summary>
        /// A friendly description of the rule group.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// KMS encryption configuration settings. See Encryption Configuration below for details.
        /// </summary>
        [Output("encryptionConfiguration")]
        public Output<Outputs.RuleGroupEncryptionConfiguration?> EncryptionConfiguration { get; private set; } = null!;

        /// <summary>
        /// A friendly name of the rule group.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
        /// </summary>
        [Output("ruleGroup")]
        public Output<Outputs.RuleGroupRuleGroup> RuleGroupConfiguration { get; private set; } = null!;

        /// <summary>
        /// The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `rule_group` is specified.
        /// </summary>
        [Output("rules")]
        public Output<string?> Rules { get; private set; } = null!;

        /// <summary>
        /// A map of key:value pairs to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// A string token used when updating the rule group.
        /// </summary>
        [Output("updateToken")]
        public Output<string> UpdateToken { get; private set; } = null!;


        /// <summary>
        /// Create a RuleGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RuleGroup(string name, RuleGroupArgs args, CustomResourceOptions? options = null)
            : base("aws:networkfirewall/ruleGroup:RuleGroup", name, args ?? new RuleGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RuleGroup(string name, Input<string> id, RuleGroupState? state = null, CustomResourceOptions? options = null)
            : base("aws:networkfirewall/ruleGroup:RuleGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RuleGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RuleGroup Get(string name, Input<string> id, RuleGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new RuleGroup(name, id, state, options);
        }
    }

    public sealed class RuleGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
        /// </summary>
        [Input("capacity", required: true)]
        public Input<int> Capacity { get; set; } = null!;

        /// <summary>
        /// A friendly description of the rule group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// KMS encryption configuration settings. See Encryption Configuration below for details.
        /// </summary>
        [Input("encryptionConfiguration")]
        public Input<Inputs.RuleGroupEncryptionConfigurationArgs>? EncryptionConfiguration { get; set; }

        /// <summary>
        /// A friendly name of the rule group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
        /// </summary>
        [Input("ruleGroup")]
        public Input<Inputs.RuleGroupRuleGroupArgs>? RuleGroupConfiguration { get; set; }

        /// <summary>
        /// The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `rule_group` is specified.
        /// </summary>
        [Input("rules")]
        public Input<string>? Rules { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of key:value pairs to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public RuleGroupArgs()
        {
        }
        public static new RuleGroupArgs Empty => new RuleGroupArgs();
    }

    public sealed class RuleGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) that identifies the rule group.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
        /// </summary>
        [Input("capacity")]
        public Input<int>? Capacity { get; set; }

        /// <summary>
        /// A friendly description of the rule group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// KMS encryption configuration settings. See Encryption Configuration below for details.
        /// </summary>
        [Input("encryptionConfiguration")]
        public Input<Inputs.RuleGroupEncryptionConfigurationGetArgs>? EncryptionConfiguration { get; set; }

        /// <summary>
        /// A friendly name of the rule group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
        /// </summary>
        [Input("ruleGroup")]
        public Input<Inputs.RuleGroupRuleGroupGetArgs>? RuleGroupConfiguration { get; set; }

        /// <summary>
        /// The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `rule_group` is specified.
        /// </summary>
        [Input("rules")]
        public Input<string>? Rules { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of key:value pairs to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        /// Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// A string token used when updating the rule group.
        /// </summary>
        [Input("updateToken")]
        public Input<string>? UpdateToken { get; set; }

        public RuleGroupState()
        {
        }
        public static new RuleGroupState Empty => new RuleGroupState();
    }
}
