// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Cfg
{
    /// <summary>
    /// Manages a Config Organization Custom Policy Rule. More information about these rules can be found in the [Enabling AWS Config Rules Across all Accounts in Your Organization](https://docs.aws.amazon.com/config/latest/developerguide/config-rule-multi-account-deployment.html) and [AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html) documentation. For working with Organization Managed Rules (those invoking an AWS managed rule), see the `aws_config_organization_managed__rule` resource.
    /// 
    /// &gt; **NOTE:** This resource must be created in the Organization master account and rules will include the master account unless its ID is added to the `excluded_accounts` argument.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Cfg.OrganizationCustomPolicyRule("example", new()
    ///     {
    ///         PolicyRuntime = "guard-2.x.x",
    ///         PolicyText = @"  let status = ['ACTIVE']
    /// 
    ///   rule tableisactive when
    ///       resourceType == ""AWS::DynamoDB::Table"" {
    ///       configuration.tableStatus == %status
    ///   }
    /// 
    ///   rule checkcompliance when
    ///       resourceType == ""AWS::DynamoDB::Table""
    ///       tableisactive {
    ///           let pitr = supplementaryConfiguration.ContinuousBackupsDescription.pointInTimeRecoveryDescription.pointInTimeRecoveryStatus
    ///           %pitr == ""ENABLED""
    ///       }
    /// 
    /// ",
    ///         ResourceTypesScopes = new[]
    ///         {
    ///             "AWS::DynamoDB::Table",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import a Config Organization Custom Policy Rule using the `name` argument. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:cfg/organizationCustomPolicyRule:OrganizationCustomPolicyRule example example_rule_name
    /// ```
    /// </summary>
    [AwsResourceType("aws:cfg/organizationCustomPolicyRule:OrganizationCustomPolicyRule")]
    public partial class OrganizationCustomPolicyRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the rule
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// List of AWS account identifiers to exclude from the rule
        /// </summary>
        [Output("debugLogDeliveryAccounts")]
        public Output<ImmutableArray<string>> DebugLogDeliveryAccounts { get; private set; } = null!;

        /// <summary>
        /// Description of the rule
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// List of AWS account identifiers to exclude from the rule
        /// </summary>
        [Output("excludedAccounts")]
        public Output<ImmutableArray<string>> ExcludedAccounts { get; private set; } = null!;

        /// <summary>
        /// A string in JSON format that is passed to the AWS Config Rule Lambda Function
        /// </summary>
        [Output("inputParameters")]
        public Output<string?> InputParameters { get; private set; } = null!;

        /// <summary>
        /// Maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
        /// </summary>
        [Output("maximumExecutionFrequency")]
        public Output<string?> MaximumExecutionFrequency { get; private set; } = null!;

        /// <summary>
        /// name of the rule
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// runtime system for your organization AWS Config Custom Policy rules
        /// </summary>
        [Output("policyRuntime")]
        public Output<string> PolicyRuntime { get; private set; } = null!;

        /// <summary>
        /// policy definition containing the logic for your organization AWS Config Custom Policy rule
        /// </summary>
        [Output("policyText")]
        public Output<string> PolicyText { get; private set; } = null!;

        /// <summary>
        /// Identifier of the AWS resource to evaluate
        /// </summary>
        [Output("resourceIdScope")]
        public Output<string?> ResourceIdScope { get; private set; } = null!;

        /// <summary>
        /// List of types of AWS resources to evaluate
        /// </summary>
        [Output("resourceTypesScopes")]
        public Output<ImmutableArray<string>> ResourceTypesScopes { get; private set; } = null!;

        /// <summary>
        /// Tag key of AWS resources to evaluate
        /// </summary>
        [Output("tagKeyScope")]
        public Output<string?> TagKeyScope { get; private set; } = null!;

        /// <summary>
        /// Tag value of AWS resources to evaluate
        /// </summary>
        [Output("tagValueScope")]
        public Output<string?> TagValueScope { get; private set; } = null!;

        /// <summary>
        /// List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("triggerTypes")]
        public Output<ImmutableArray<string>> TriggerTypes { get; private set; } = null!;


        /// <summary>
        /// Create a OrganizationCustomPolicyRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OrganizationCustomPolicyRule(string name, OrganizationCustomPolicyRuleArgs args, CustomResourceOptions? options = null)
            : base("aws:cfg/organizationCustomPolicyRule:OrganizationCustomPolicyRule", name, args ?? new OrganizationCustomPolicyRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OrganizationCustomPolicyRule(string name, Input<string> id, OrganizationCustomPolicyRuleState? state = null, CustomResourceOptions? options = null)
            : base("aws:cfg/organizationCustomPolicyRule:OrganizationCustomPolicyRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OrganizationCustomPolicyRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OrganizationCustomPolicyRule Get(string name, Input<string> id, OrganizationCustomPolicyRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new OrganizationCustomPolicyRule(name, id, state, options);
        }
    }

    public sealed class OrganizationCustomPolicyRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("debugLogDeliveryAccounts")]
        private InputList<string>? _debugLogDeliveryAccounts;

        /// <summary>
        /// List of AWS account identifiers to exclude from the rule
        /// </summary>
        public InputList<string> DebugLogDeliveryAccounts
        {
            get => _debugLogDeliveryAccounts ?? (_debugLogDeliveryAccounts = new InputList<string>());
            set => _debugLogDeliveryAccounts = value;
        }

        /// <summary>
        /// Description of the rule
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("excludedAccounts")]
        private InputList<string>? _excludedAccounts;

        /// <summary>
        /// List of AWS account identifiers to exclude from the rule
        /// </summary>
        public InputList<string> ExcludedAccounts
        {
            get => _excludedAccounts ?? (_excludedAccounts = new InputList<string>());
            set => _excludedAccounts = value;
        }

        /// <summary>
        /// A string in JSON format that is passed to the AWS Config Rule Lambda Function
        /// </summary>
        [Input("inputParameters")]
        public Input<string>? InputParameters { get; set; }

        /// <summary>
        /// Maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
        /// </summary>
        [Input("maximumExecutionFrequency")]
        public Input<string>? MaximumExecutionFrequency { get; set; }

        /// <summary>
        /// name of the rule
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// runtime system for your organization AWS Config Custom Policy rules
        /// </summary>
        [Input("policyRuntime", required: true)]
        public Input<string> PolicyRuntime { get; set; } = null!;

        /// <summary>
        /// policy definition containing the logic for your organization AWS Config Custom Policy rule
        /// </summary>
        [Input("policyText", required: true)]
        public Input<string> PolicyText { get; set; } = null!;

        /// <summary>
        /// Identifier of the AWS resource to evaluate
        /// </summary>
        [Input("resourceIdScope")]
        public Input<string>? ResourceIdScope { get; set; }

        [Input("resourceTypesScopes")]
        private InputList<string>? _resourceTypesScopes;

        /// <summary>
        /// List of types of AWS resources to evaluate
        /// </summary>
        public InputList<string> ResourceTypesScopes
        {
            get => _resourceTypesScopes ?? (_resourceTypesScopes = new InputList<string>());
            set => _resourceTypesScopes = value;
        }

        /// <summary>
        /// Tag key of AWS resources to evaluate
        /// </summary>
        [Input("tagKeyScope")]
        public Input<string>? TagKeyScope { get; set; }

        /// <summary>
        /// Tag value of AWS resources to evaluate
        /// </summary>
        [Input("tagValueScope")]
        public Input<string>? TagValueScope { get; set; }

        [Input("triggerTypes", required: true)]
        private InputList<string>? _triggerTypes;

        /// <summary>
        /// List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`
        /// 
        /// The following arguments are optional:
        /// </summary>
        public InputList<string> TriggerTypes
        {
            get => _triggerTypes ?? (_triggerTypes = new InputList<string>());
            set => _triggerTypes = value;
        }

        public OrganizationCustomPolicyRuleArgs()
        {
        }
        public static new OrganizationCustomPolicyRuleArgs Empty => new OrganizationCustomPolicyRuleArgs();
    }

    public sealed class OrganizationCustomPolicyRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the rule
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("debugLogDeliveryAccounts")]
        private InputList<string>? _debugLogDeliveryAccounts;

        /// <summary>
        /// List of AWS account identifiers to exclude from the rule
        /// </summary>
        public InputList<string> DebugLogDeliveryAccounts
        {
            get => _debugLogDeliveryAccounts ?? (_debugLogDeliveryAccounts = new InputList<string>());
            set => _debugLogDeliveryAccounts = value;
        }

        /// <summary>
        /// Description of the rule
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("excludedAccounts")]
        private InputList<string>? _excludedAccounts;

        /// <summary>
        /// List of AWS account identifiers to exclude from the rule
        /// </summary>
        public InputList<string> ExcludedAccounts
        {
            get => _excludedAccounts ?? (_excludedAccounts = new InputList<string>());
            set => _excludedAccounts = value;
        }

        /// <summary>
        /// A string in JSON format that is passed to the AWS Config Rule Lambda Function
        /// </summary>
        [Input("inputParameters")]
        public Input<string>? InputParameters { get; set; }

        /// <summary>
        /// Maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
        /// </summary>
        [Input("maximumExecutionFrequency")]
        public Input<string>? MaximumExecutionFrequency { get; set; }

        /// <summary>
        /// name of the rule
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// runtime system for your organization AWS Config Custom Policy rules
        /// </summary>
        [Input("policyRuntime")]
        public Input<string>? PolicyRuntime { get; set; }

        /// <summary>
        /// policy definition containing the logic for your organization AWS Config Custom Policy rule
        /// </summary>
        [Input("policyText")]
        public Input<string>? PolicyText { get; set; }

        /// <summary>
        /// Identifier of the AWS resource to evaluate
        /// </summary>
        [Input("resourceIdScope")]
        public Input<string>? ResourceIdScope { get; set; }

        [Input("resourceTypesScopes")]
        private InputList<string>? _resourceTypesScopes;

        /// <summary>
        /// List of types of AWS resources to evaluate
        /// </summary>
        public InputList<string> ResourceTypesScopes
        {
            get => _resourceTypesScopes ?? (_resourceTypesScopes = new InputList<string>());
            set => _resourceTypesScopes = value;
        }

        /// <summary>
        /// Tag key of AWS resources to evaluate
        /// </summary>
        [Input("tagKeyScope")]
        public Input<string>? TagKeyScope { get; set; }

        /// <summary>
        /// Tag value of AWS resources to evaluate
        /// </summary>
        [Input("tagValueScope")]
        public Input<string>? TagValueScope { get; set; }

        [Input("triggerTypes")]
        private InputList<string>? _triggerTypes;

        /// <summary>
        /// List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`
        /// 
        /// The following arguments are optional:
        /// </summary>
        public InputList<string> TriggerTypes
        {
            get => _triggerTypes ?? (_triggerTypes = new InputList<string>());
            set => _triggerTypes = value;
        }

        public OrganizationCustomPolicyRuleState()
        {
        }
        public static new OrganizationCustomPolicyRuleState Empty => new OrganizationCustomPolicyRuleState();
    }
}
