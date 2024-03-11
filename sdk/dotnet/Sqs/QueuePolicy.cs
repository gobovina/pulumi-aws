// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sqs
{
    /// <summary>
    /// Allows you to set a policy of an SQS Queue
    /// while referencing ARN of the queue within the policy.
    /// 
    /// ## Example Usage
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
    ///     var q = new Aws.Sqs.Queue("q", new()
    ///     {
    ///         Name = "examplequeue",
    ///     });
    /// 
    ///     var test = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Sid = "First",
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "*",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "*",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "sqs:SendMessage",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     q.Arn,
    ///                 },
    ///                 Conditions = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementConditionInputArgs
    ///                     {
    ///                         Test = "ArnEquals",
    ///                         Variable = "aws:SourceArn",
    ///                         Values = new[]
    ///                         {
    ///                             example.Arn,
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var testQueuePolicy = new Aws.Sqs.QueuePolicy("test", new()
    ///     {
    ///         QueueUrl = q.Id,
    ///         Policy = test.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import SQS Queue Policies using the queue URL. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:sqs/queuePolicy:QueuePolicy test https://queue.amazonaws.com/0123456789012/myqueue
    /// ```
    /// </summary>
    [AwsResourceType("aws:sqs/queuePolicy:QueuePolicy")]
    public partial class QueuePolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The JSON policy for the SQS queue.
        /// </summary>
        [Output("policy")]
        public Output<string> Policy { get; private set; } = null!;

        /// <summary>
        /// The URL of the SQS Queue to which to attach the policy
        /// </summary>
        [Output("queueUrl")]
        public Output<string> QueueUrl { get; private set; } = null!;


        /// <summary>
        /// Create a QueuePolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public QueuePolicy(string name, QueuePolicyArgs args, CustomResourceOptions? options = null)
            : base("aws:sqs/queuePolicy:QueuePolicy", name, args ?? new QueuePolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private QueuePolicy(string name, Input<string> id, QueuePolicyState? state = null, CustomResourceOptions? options = null)
            : base("aws:sqs/queuePolicy:QueuePolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing QueuePolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static QueuePolicy Get(string name, Input<string> id, QueuePolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new QueuePolicy(name, id, state, options);
        }
    }

    public sealed class QueuePolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The JSON policy for the SQS queue.
        /// </summary>
        [Input("policy", required: true)]
        public Input<string> Policy { get; set; } = null!;

        /// <summary>
        /// The URL of the SQS Queue to which to attach the policy
        /// </summary>
        [Input("queueUrl", required: true)]
        public Input<string> QueueUrl { get; set; } = null!;

        public QueuePolicyArgs()
        {
        }
        public static new QueuePolicyArgs Empty => new QueuePolicyArgs();
    }

    public sealed class QueuePolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The JSON policy for the SQS queue.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// The URL of the SQS Queue to which to attach the policy
        /// </summary>
        [Input("queueUrl")]
        public Input<string>? QueueUrl { get; set; }

        public QueuePolicyState()
        {
        }
        public static new QueuePolicyState Empty => new QueuePolicyState();
    }
}
