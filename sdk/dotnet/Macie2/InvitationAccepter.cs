// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Macie2
{
    /// <summary>
    /// Provides a resource to manage an [Amazon Macie Invitation Accepter](https://docs.aws.amazon.com/macie/latest/APIReference/invitations-accept.html).
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
    ///     var primaryAccount = new Aws.Macie2.Account("primaryAccount", new()
    ///     {
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = "awsalternate",
    ///     });
    /// 
    ///     var memberAccount = new Aws.Macie2.Account("memberAccount");
    /// 
    ///     var primaryMember = new Aws.Macie2.Member("primaryMember", new()
    ///     {
    ///         AccountId = "ACCOUNT ID",
    ///         Email = "EMAIL",
    ///         Invite = true,
    ///         InvitationMessage = "Message of the invite",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = "awsalternate",
    ///         DependsOn = new[]
    ///         {
    ///             primaryAccount,
    ///         },
    ///     });
    /// 
    ///     var memberInvitationAccepter = new Aws.Macie2.InvitationAccepter("memberInvitationAccepter", new()
    ///     {
    ///         AdministratorAccountId = "ADMINISTRATOR ACCOUNT ID",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             primaryMember,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_macie2_invitation_accepter` using the admin account ID. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:macie2/invitationAccepter:InvitationAccepter example 123456789012
    /// ```
    /// </summary>
    [AwsResourceType("aws:macie2/invitationAccepter:InvitationAccepter")]
    public partial class InvitationAccepter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The AWS account ID for the account that sent the invitation.
        /// </summary>
        [Output("administratorAccountId")]
        public Output<string> AdministratorAccountId { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the invitation.
        /// </summary>
        [Output("invitationId")]
        public Output<string> InvitationId { get; private set; } = null!;


        /// <summary>
        /// Create a InvitationAccepter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InvitationAccepter(string name, InvitationAccepterArgs args, CustomResourceOptions? options = null)
            : base("aws:macie2/invitationAccepter:InvitationAccepter", name, args ?? new InvitationAccepterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InvitationAccepter(string name, Input<string> id, InvitationAccepterState? state = null, CustomResourceOptions? options = null)
            : base("aws:macie2/invitationAccepter:InvitationAccepter", name, state, MakeResourceOptions(options, id))
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

    public sealed class InvitationAccepterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AWS account ID for the account that sent the invitation.
        /// </summary>
        [Input("administratorAccountId", required: true)]
        public Input<string> AdministratorAccountId { get; set; } = null!;

        public InvitationAccepterArgs()
        {
        }
        public static new InvitationAccepterArgs Empty => new InvitationAccepterArgs();
    }

    public sealed class InvitationAccepterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AWS account ID for the account that sent the invitation.
        /// </summary>
        [Input("administratorAccountId")]
        public Input<string>? AdministratorAccountId { get; set; }

        /// <summary>
        /// The unique identifier for the invitation.
        /// </summary>
        [Input("invitationId")]
        public Input<string>? InvitationId { get; set; }

        public InvitationAccepterState()
        {
        }
        public static new InvitationAccepterState Empty => new InvitationAccepterState();
    }
}
