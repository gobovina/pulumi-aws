// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Detective
{
    /// <summary>
    /// Provides a resource to manage an [Amazon Detective Invitation Accepter](https://docs.aws.amazon.com/detective/latest/APIReference/API_AcceptInvitation.html). Ensure that the accepter is configured to use the AWS account you wish to _accept_ the invitation from the primary graph owner account.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var primaryGraph = new Aws.Detective.Graph("primaryGraph", new Aws.Detective.GraphArgs
    ///         {
    ///         });
    ///         var primaryMember = new Aws.Detective.Member("primaryMember", new Aws.Detective.MemberArgs
    ///         {
    ///             AccountId = "ACCOUNT ID",
    ///             EmailAddress = "EMAIL",
    ///             GraphArn = primaryGraph.Id,
    ///             Message = "Message of the invite",
    ///         });
    ///         var member = new Aws.Detective.InvitationAccepter("member", new Aws.Detective.InvitationAccepterArgs
    ///         {
    ///             GraphArn = primaryGraph.GraphArn,
    ///         }, new CustomResourceOptions
    ///         {
    ///             Provider = "awsalternate",
    ///             DependsOn = 
    ///             {
    ///                 primaryMember,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// `aws_detective_invitation_accepter` can be imported using the graph ARN, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import aws:detective/invitationAccepter:InvitationAccepter example arn:aws:detective:us-east-1:123456789101:graph:231684d34gh74g4bae1dbc7bd807d02d
    /// ```
    /// </summary>
    [AwsResourceType("aws:detective/invitationAccepter:InvitationAccepter")]
    public partial class InvitationAccepter : Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the behavior graph that the member account is accepting the invitation for.
        /// </summary>
        [Output("graphArn")]
        public Output<string> GraphArn { get; private set; } = null!;


        /// <summary>
        /// Create a InvitationAccepter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InvitationAccepter(string name, InvitationAccepterArgs args, CustomResourceOptions? options = null)
            : base("aws:detective/invitationAccepter:InvitationAccepter", name, args ?? new InvitationAccepterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InvitationAccepter(string name, Input<string> id, InvitationAccepterState? state = null, CustomResourceOptions? options = null)
            : base("aws:detective/invitationAccepter:InvitationAccepter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InvitationAccepter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InvitationAccepter Get(string name, Input<string> id, InvitationAccepterState? state = null, CustomResourceOptions? options = null)
        {
            return new InvitationAccepter(name, id, state, options);
        }
    }

    public sealed class InvitationAccepterArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the behavior graph that the member account is accepting the invitation for.
        /// </summary>
        [Input("graphArn", required: true)]
        public Input<string> GraphArn { get; set; } = null!;

        public InvitationAccepterArgs()
        {
        }
    }

    public sealed class InvitationAccepterState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the behavior graph that the member account is accepting the invitation for.
        /// </summary>
        [Input("graphArn")]
        public Input<string>? GraphArn { get; set; }

        public InvitationAccepterState()
        {
        }
    }
}
