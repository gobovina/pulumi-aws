// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFormation
{
    /// <summary>
    /// Manages a CloudFormation StackSet Instance. Instances are managed in the account and region of the StackSet after the target account permissions have been configured. Additional information about StackSets can be found in the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/what-is-cfnstacksets.html).
    /// 
    /// &gt; **NOTE:** All target accounts must have an IAM Role created that matches the name of the execution role configured in the StackSet (the `execution_role_name` argument in the `aws.cloudformation.StackSet` resource) in a trust relationship with the administrative account or administration IAM Role. The execution role must have appropriate permissions to manage resources defined in the template along with those required for StackSets to operate. See the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html) for more details.
    /// 
    /// &gt; **NOTE:** To retain the Stack during resource destroy, ensure `retain_stack` has been set to `true` in the state first. This must be completed _before_ a deployment that would destroy the resource.
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
    ///     var example = new Aws.CloudFormation.StackSetInstance("example", new()
    ///     {
    ///         AccountId = "123456789012",
    ///         Region = "us-east-1",
    ///         StackSetName = exampleAwsCloudformationStackSet.Name,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example IAM Setup in Target Account
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var aWSCloudFormationStackSetExecutionRoleAssumeRolePolicy = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Actions = new[]
    ///                 {
    ///                     "sts:AssumeRole",
    ///                 },
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Identifiers = new[]
    ///                         {
    ///                             aWSCloudFormationStackSetAdministrationRole.Arn,
    ///                         },
    ///                         Type = "AWS",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var aWSCloudFormationStackSetExecutionRole = new Aws.Iam.Role("AWSCloudFormationStackSetExecutionRole", new()
    ///     {
    ///         AssumeRolePolicy = aWSCloudFormationStackSetExecutionRoleAssumeRolePolicy.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///         Name = "AWSCloudFormationStackSetExecutionRole",
    ///     });
    /// 
    ///     // Documentation: https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html
    ///     // Additional IAM permissions necessary depend on the resources defined in the StackSet template
    ///     var aWSCloudFormationStackSetExecutionRoleMinimumExecutionPolicy = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Actions = new[]
    ///                 {
    ///                     "cloudformation:*",
    ///                     "s3:*",
    ///                     "sns:*",
    ///                 },
    ///                 Effect = "Allow",
    ///                 Resources = new[]
    ///                 {
    ///                     "*",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var aWSCloudFormationStackSetExecutionRoleMinimumExecutionPolicyRolePolicy = new Aws.Iam.RolePolicy("AWSCloudFormationStackSetExecutionRole_MinimumExecutionPolicy", new()
    ///     {
    ///         Name = "MinimumExecutionPolicy",
    ///         Policy = aWSCloudFormationStackSetExecutionRoleMinimumExecutionPolicy.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///         Role = aWSCloudFormationStackSetExecutionRole.Name,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example Deployment across Organizations account
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.CloudFormation.StackSetInstance("example", new()
    ///     {
    ///         DeploymentTargets = new Aws.CloudFormation.Inputs.StackSetInstanceDeploymentTargetsArgs
    ///         {
    ///             OrganizationalUnitIds = new[]
    ///             {
    ///                 exampleAwsOrganizationsOrganization.Roots[0].Id,
    ///             },
    ///         },
    ///         Region = "us-east-1",
    ///         StackSetName = exampleAwsCloudformationStackSet.Name,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Import CloudFormation StackSet Instances that target AWS Organizational Units using the StackSet name, a slash (`/`) separated list of organizational unit IDs, and target AWS Region separated by commas (`,`). For example:
    /// 
    /// Import CloudFormation StackSet Instances when acting a delegated administrator in a member account using the StackSet name, target AWS account ID or slash (`/`) separated list of organizational unit IDs, target AWS Region and `call_as` value separated by commas (`,`). For example:
    /// 
    /// Using `pulumi import`, import CloudFormation StackSet Instances that target an AWS Account ID using the StackSet name, target AWS account ID, and target AWS Region separated by commas (`,`). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:cloudformation/stackSetInstance:StackSetInstance example example,123456789012,us-east-1
    /// ```
    ///  Using `pulumi import`, import CloudFormation StackSet Instances that target AWS Organizational Units using the StackSet name, a slash (`/`) separated list of organizational unit IDs, and target AWS Region separated by commas (`,`). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:cloudformation/stackSetInstance:StackSetInstance example example,ou-sdas-123123123/ou-sdas-789789789,us-east-1
    /// ```
    ///  Using `pulumi import`, import CloudFormation StackSet Instances when acting a delegated administrator in a member account using the StackSet name, target AWS account ID or slash (`/`) separated list of organizational unit IDs, target AWS Region and `call_as` value separated by commas (`,`). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:cloudformation/stackSetInstance:StackSetInstance example example,ou-sdas-123123123/ou-sdas-789789789,us-east-1,DELEGATED_ADMIN
    /// ```
    /// </summary>
    [AwsResourceType("aws:cloudformation/stackSetInstance:StackSetInstance")]
    public partial class StackSetInstance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
        /// </summary>
        [Output("callAs")]
        public Output<string?> CallAs { get; private set; } = null!;

        /// <summary>
        /// The AWS Organizations accounts to which StackSets deploys. StackSets doesn't deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deployment_targets below.
        /// </summary>
        [Output("deploymentTargets")]
        public Output<Outputs.StackSetInstanceDeploymentTargets?> DeploymentTargets { get; private set; } = null!;

        /// <summary>
        /// Preferences for how AWS CloudFormation performs a stack set operation.
        /// </summary>
        [Output("operationPreferences")]
        public Output<Outputs.StackSetInstanceOperationPreferences?> OperationPreferences { get; private set; } = null!;

        /// <summary>
        /// Organizational unit ID in which the stack is deployed.
        /// </summary>
        [Output("organizationalUnitId")]
        public Output<string> OrganizationalUnitId { get; private set; } = null!;

        /// <summary>
        /// Key-value map of input parameters to override from the StackSet for this Instance.
        /// </summary>
        [Output("parameterOverrides")]
        public Output<ImmutableDictionary<string, string>?> ParameterOverrides { get; private set; } = null!;

        /// <summary>
        /// Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
        /// </summary>
        [Output("retainStack")]
        public Output<bool?> RetainStack { get; private set; } = null!;

        /// <summary>
        /// Stack identifier.
        /// </summary>
        [Output("stackId")]
        public Output<string> StackId { get; private set; } = null!;

        /// <summary>
        /// List of stack instances created from an organizational unit deployment target. This will only be populated when `deployment_targets` is set. See `stack_instance_summaries`.
        /// </summary>
        [Output("stackInstanceSummaries")]
        public Output<ImmutableArray<Outputs.StackSetInstanceStackInstanceSummary>> StackInstanceSummaries { get; private set; } = null!;

        /// <summary>
        /// Name of the StackSet.
        /// </summary>
        [Output("stackSetName")]
        public Output<string> StackSetName { get; private set; } = null!;


        /// <summary>
        /// Create a StackSetInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StackSetInstance(string name, StackSetInstanceArgs args, CustomResourceOptions? options = null)
            : base("aws:cloudformation/stackSetInstance:StackSetInstance", name, args ?? new StackSetInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StackSetInstance(string name, Input<string> id, StackSetInstanceState? state = null, CustomResourceOptions? options = null)
            : base("aws:cloudformation/stackSetInstance:StackSetInstance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StackSetInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StackSetInstance Get(string name, Input<string> id, StackSetInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new StackSetInstance(name, id, state, options);
        }
    }

    public sealed class StackSetInstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
        /// </summary>
        [Input("callAs")]
        public Input<string>? CallAs { get; set; }

        /// <summary>
        /// The AWS Organizations accounts to which StackSets deploys. StackSets doesn't deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deployment_targets below.
        /// </summary>
        [Input("deploymentTargets")]
        public Input<Inputs.StackSetInstanceDeploymentTargetsArgs>? DeploymentTargets { get; set; }

        /// <summary>
        /// Preferences for how AWS CloudFormation performs a stack set operation.
        /// </summary>
        [Input("operationPreferences")]
        public Input<Inputs.StackSetInstanceOperationPreferencesArgs>? OperationPreferences { get; set; }

        [Input("parameterOverrides")]
        private InputMap<string>? _parameterOverrides;

        /// <summary>
        /// Key-value map of input parameters to override from the StackSet for this Instance.
        /// </summary>
        public InputMap<string> ParameterOverrides
        {
            get => _parameterOverrides ?? (_parameterOverrides = new InputMap<string>());
            set => _parameterOverrides = value;
        }

        /// <summary>
        /// Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
        /// </summary>
        [Input("retainStack")]
        public Input<bool>? RetainStack { get; set; }

        /// <summary>
        /// Name of the StackSet.
        /// </summary>
        [Input("stackSetName", required: true)]
        public Input<string> StackSetName { get; set; } = null!;

        public StackSetInstanceArgs()
        {
        }
        public static new StackSetInstanceArgs Empty => new StackSetInstanceArgs();
    }

    public sealed class StackSetInstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
        /// </summary>
        [Input("callAs")]
        public Input<string>? CallAs { get; set; }

        /// <summary>
        /// The AWS Organizations accounts to which StackSets deploys. StackSets doesn't deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deployment_targets below.
        /// </summary>
        [Input("deploymentTargets")]
        public Input<Inputs.StackSetInstanceDeploymentTargetsGetArgs>? DeploymentTargets { get; set; }

        /// <summary>
        /// Preferences for how AWS CloudFormation performs a stack set operation.
        /// </summary>
        [Input("operationPreferences")]
        public Input<Inputs.StackSetInstanceOperationPreferencesGetArgs>? OperationPreferences { get; set; }

        /// <summary>
        /// Organizational unit ID in which the stack is deployed.
        /// </summary>
        [Input("organizationalUnitId")]
        public Input<string>? OrganizationalUnitId { get; set; }

        [Input("parameterOverrides")]
        private InputMap<string>? _parameterOverrides;

        /// <summary>
        /// Key-value map of input parameters to override from the StackSet for this Instance.
        /// </summary>
        public InputMap<string> ParameterOverrides
        {
            get => _parameterOverrides ?? (_parameterOverrides = new InputMap<string>());
            set => _parameterOverrides = value;
        }

        /// <summary>
        /// Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
        /// </summary>
        [Input("retainStack")]
        public Input<bool>? RetainStack { get; set; }

        /// <summary>
        /// Stack identifier.
        /// </summary>
        [Input("stackId")]
        public Input<string>? StackId { get; set; }

        [Input("stackInstanceSummaries")]
        private InputList<Inputs.StackSetInstanceStackInstanceSummaryGetArgs>? _stackInstanceSummaries;

        /// <summary>
        /// List of stack instances created from an organizational unit deployment target. This will only be populated when `deployment_targets` is set. See `stack_instance_summaries`.
        /// </summary>
        public InputList<Inputs.StackSetInstanceStackInstanceSummaryGetArgs> StackInstanceSummaries
        {
            get => _stackInstanceSummaries ?? (_stackInstanceSummaries = new InputList<Inputs.StackSetInstanceStackInstanceSummaryGetArgs>());
            set => _stackInstanceSummaries = value;
        }

        /// <summary>
        /// Name of the StackSet.
        /// </summary>
        [Input("stackSetName")]
        public Input<string>? StackSetName { get; set; }

        public StackSetInstanceState()
        {
        }
        public static new StackSetInstanceState Empty => new StackSetInstanceState();
    }
}
