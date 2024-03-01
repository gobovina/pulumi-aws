// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Organizations
{
    public static class GetOrganization
    {
        /// <summary>
        /// Get information about the organization that the user's account belongs to
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### List all account IDs for the organization
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Organizations.GetOrganization.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["accountIds"] = example.Apply(getOrganizationResult =&gt; getOrganizationResult.Accounts).Select(__item =&gt; __item.Id).ToList(),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### SNS topic that can be interacted by the organization only
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Organizations.GetOrganization.Invoke();
        /// 
        ///     var snsTopic = new Aws.Sns.Topic("sns_topic", new()
        ///     {
        ///         Name = "my-sns-topic",
        ///     });
        /// 
        ///     var snsTopicPolicy = Aws.Iam.GetPolicyDocument.Invoke(new()
        ///     {
        ///         Statements = new[]
        ///         {
        ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
        ///             {
        ///                 Effect = "Allow",
        ///                 Actions = new[]
        ///                 {
        ///                     "SNS:Subscribe",
        ///                     "SNS:Publish",
        ///                 },
        ///                 Conditions = new[]
        ///                 {
        ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementConditionInputArgs
        ///                     {
        ///                         Test = "StringEquals",
        ///                         Variable = "aws:PrincipalOrgID",
        ///                         Values = new[]
        ///                         {
        ///                             example.Apply(getOrganizationResult =&gt; getOrganizationResult.Id),
        ///                         },
        ///                     },
        ///                 },
        ///                 Principals = new[]
        ///                 {
        ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
        ///                     {
        ///                         Type = "AWS",
        ///                         Identifiers = new[]
        ///                         {
        ///                             "*",
        ///                         },
        ///                     },
        ///                 },
        ///                 Resources = new[]
        ///                 {
        ///                     snsTopic.Arn,
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var snsTopicPolicyTopicPolicy = new Aws.Sns.TopicPolicy("sns_topic_policy", new()
        ///     {
        ///         Arn = snsTopic.Arn,
        ///         Policy = snsTopicPolicy.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetOrganizationResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOrganizationResult>("aws:organizations/getOrganization:getOrganization", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Get information about the organization that the user's account belongs to
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### List all account IDs for the organization
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Organizations.GetOrganization.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["accountIds"] = example.Apply(getOrganizationResult =&gt; getOrganizationResult.Accounts).Select(__item =&gt; __item.Id).ToList(),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### SNS topic that can be interacted by the organization only
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Organizations.GetOrganization.Invoke();
        /// 
        ///     var snsTopic = new Aws.Sns.Topic("sns_topic", new()
        ///     {
        ///         Name = "my-sns-topic",
        ///     });
        /// 
        ///     var snsTopicPolicy = Aws.Iam.GetPolicyDocument.Invoke(new()
        ///     {
        ///         Statements = new[]
        ///         {
        ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
        ///             {
        ///                 Effect = "Allow",
        ///                 Actions = new[]
        ///                 {
        ///                     "SNS:Subscribe",
        ///                     "SNS:Publish",
        ///                 },
        ///                 Conditions = new[]
        ///                 {
        ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementConditionInputArgs
        ///                     {
        ///                         Test = "StringEquals",
        ///                         Variable = "aws:PrincipalOrgID",
        ///                         Values = new[]
        ///                         {
        ///                             example.Apply(getOrganizationResult =&gt; getOrganizationResult.Id),
        ///                         },
        ///                     },
        ///                 },
        ///                 Principals = new[]
        ///                 {
        ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
        ///                     {
        ///                         Type = "AWS",
        ///                         Identifiers = new[]
        ///                         {
        ///                             "*",
        ///                         },
        ///                     },
        ///                 },
        ///                 Resources = new[]
        ///                 {
        ///                     snsTopic.Arn,
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var snsTopicPolicyTopicPolicy = new Aws.Sns.TopicPolicy("sns_topic_policy", new()
        ///     {
        ///         Arn = snsTopic.Arn,
        ///         Policy = snsTopicPolicy.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetOrganizationResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOrganizationResult>("aws:organizations/getOrganization:getOrganization", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetOrganizationResult
    {
        /// <summary>
        /// List of organization accounts including the master account. For a list excluding the master account, see the `non_master_accounts` attribute. All elements have these attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetOrganizationAccountResult> Accounts;
        /// <summary>
        /// ARN of the root
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// A list of AWS service principal names that have integration enabled with your organization. Organization must have `feature_set` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
        /// </summary>
        public readonly ImmutableArray<string> AwsServiceAccessPrincipals;
        /// <summary>
        /// A list of Organizations policy types that are enabled in the Organization Root. Organization must have `feature_set` set to `ALL`. For additional information about valid policy types (e.g., `SERVICE_CONTROL_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
        /// </summary>
        public readonly ImmutableArray<string> EnabledPolicyTypes;
        /// <summary>
        /// FeatureSet of the organization.
        /// </summary>
        public readonly string FeatureSet;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// ARN of the account that is designated as the master account for the organization.
        /// </summary>
        public readonly string MasterAccountArn;
        /// <summary>
        /// The email address that is associated with the AWS account that is designated as the master account for the organization.
        /// </summary>
        public readonly string MasterAccountEmail;
        /// <summary>
        /// Unique identifier (ID) of the master account of an organization.
        /// </summary>
        public readonly string MasterAccountId;
        /// <summary>
        /// List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetOrganizationNonMasterAccountResult> NonMasterAccounts;
        /// <summary>
        /// List of organization roots. All elements have these attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetOrganizationRootResult> Roots;

        [OutputConstructor]
        private GetOrganizationResult(
            ImmutableArray<Outputs.GetOrganizationAccountResult> accounts,

            string arn,

            ImmutableArray<string> awsServiceAccessPrincipals,

            ImmutableArray<string> enabledPolicyTypes,

            string featureSet,

            string id,

            string masterAccountArn,

            string masterAccountEmail,

            string masterAccountId,

            ImmutableArray<Outputs.GetOrganizationNonMasterAccountResult> nonMasterAccounts,

            ImmutableArray<Outputs.GetOrganizationRootResult> roots)
        {
            Accounts = accounts;
            Arn = arn;
            AwsServiceAccessPrincipals = awsServiceAccessPrincipals;
            EnabledPolicyTypes = enabledPolicyTypes;
            FeatureSet = featureSet;
            Id = id;
            MasterAccountArn = masterAccountArn;
            MasterAccountEmail = masterAccountEmail;
            MasterAccountId = masterAccountId;
            NonMasterAccounts = nonMasterAccounts;
            Roots = roots;
        }
    }
}
