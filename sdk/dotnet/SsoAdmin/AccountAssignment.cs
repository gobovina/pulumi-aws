// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SsoAdmin
{
    /// <summary>
    /// Provides a Single Sign-On (SSO) Account Assignment resource
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import SSO Account Assignments using the `principal_id`, `principal_type`, `target_id`, `target_type`, `permission_set_arn`, `instance_arn` separated by commas (`,`). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ssoadmin/accountAssignment:AccountAssignment example f81d4fae-7dec-11d0-a765-00a0c91e6bf6,GROUP,1234567890,AWS_ACCOUNT,arn:aws:sso:::permissionSet/ssoins-0123456789abcdef/ps-0123456789abcdef,arn:aws:sso:::instance/ssoins-0123456789abcdef
    /// ```
    /// </summary>
    [AwsResourceType("aws:ssoadmin/accountAssignment:AccountAssignment")]
    public partial class AccountAssignment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the SSO Instance.
        /// </summary>
        [Output("instanceArn")]
        public Output<string> InstanceArn { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the Permission Set that the admin wants to grant the principal access to.
        /// </summary>
        [Output("permissionSetArn")]
        public Output<string> PermissionSetArn { get; private set; } = null!;

        /// <summary>
        /// An identifier for an object in SSO, such as a user or group. PrincipalIds are GUIDs (For example, `f81d4fae-7dec-11d0-a765-00a0c91e6bf6`).
        /// </summary>
        [Output("principalId")]
        public Output<string> PrincipalId { get; private set; } = null!;

        /// <summary>
        /// The entity type for which the assignment will be created. Valid values: `USER`, `GROUP`.
        /// </summary>
        [Output("principalType")]
        public Output<string> PrincipalType { get; private set; } = null!;

        /// <summary>
        /// An AWS account identifier, typically a 10-12 digit string.
        /// </summary>
        [Output("targetId")]
        public Output<string> TargetId { get; private set; } = null!;

        /// <summary>
        /// The entity type for which the assignment will be created. Valid values: `AWS_ACCOUNT`.
        /// </summary>
        [Output("targetType")]
        public Output<string?> TargetType { get; private set; } = null!;


        /// <summary>
        /// Create a AccountAssignment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccountAssignment(string name, AccountAssignmentArgs args, CustomResourceOptions? options = null)
            : base("aws:ssoadmin/accountAssignment:AccountAssignment", name, args ?? new AccountAssignmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccountAssignment(string name, Input<string> id, AccountAssignmentState? state = null, CustomResourceOptions? options = null)
            : base("aws:ssoadmin/accountAssignment:AccountAssignment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccountAssignment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccountAssignment Get(string name, Input<string> id, AccountAssignmentState? state = null, CustomResourceOptions? options = null)
        {
            return new AccountAssignment(name, id, state, options);
        }
    }

    public sealed class AccountAssignmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the SSO Instance.
        /// </summary>
        [Input("instanceArn", required: true)]
        public Input<string> InstanceArn { get; set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the Permission Set that the admin wants to grant the principal access to.
        /// </summary>
        [Input("permissionSetArn", required: true)]
        public Input<string> PermissionSetArn { get; set; } = null!;

        /// <summary>
        /// An identifier for an object in SSO, such as a user or group. PrincipalIds are GUIDs (For example, `f81d4fae-7dec-11d0-a765-00a0c91e6bf6`).
        /// </summary>
        [Input("principalId", required: true)]
        public Input<string> PrincipalId { get; set; } = null!;

        /// <summary>
        /// The entity type for which the assignment will be created. Valid values: `USER`, `GROUP`.
        /// </summary>
        [Input("principalType", required: true)]
        public Input<string> PrincipalType { get; set; } = null!;

        /// <summary>
        /// An AWS account identifier, typically a 10-12 digit string.
        /// </summary>
        [Input("targetId", required: true)]
        public Input<string> TargetId { get; set; } = null!;

        /// <summary>
        /// The entity type for which the assignment will be created. Valid values: `AWS_ACCOUNT`.
        /// </summary>
        [Input("targetType")]
        public Input<string>? TargetType { get; set; }

        public AccountAssignmentArgs()
        {
        }
        public static new AccountAssignmentArgs Empty => new AccountAssignmentArgs();
    }

    public sealed class AccountAssignmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the SSO Instance.
        /// </summary>
        [Input("instanceArn")]
        public Input<string>? InstanceArn { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the Permission Set that the admin wants to grant the principal access to.
        /// </summary>
        [Input("permissionSetArn")]
        public Input<string>? PermissionSetArn { get; set; }

        /// <summary>
        /// An identifier for an object in SSO, such as a user or group. PrincipalIds are GUIDs (For example, `f81d4fae-7dec-11d0-a765-00a0c91e6bf6`).
        /// </summary>
        [Input("principalId")]
        public Input<string>? PrincipalId { get; set; }

        /// <summary>
        /// The entity type for which the assignment will be created. Valid values: `USER`, `GROUP`.
        /// </summary>
        [Input("principalType")]
        public Input<string>? PrincipalType { get; set; }

        /// <summary>
        /// An AWS account identifier, typically a 10-12 digit string.
        /// </summary>
        [Input("targetId")]
        public Input<string>? TargetId { get; set; }

        /// <summary>
        /// The entity type for which the assignment will be created. Valid values: `AWS_ACCOUNT`.
        /// </summary>
        [Input("targetType")]
        public Input<string>? TargetType { get; set; }

        public AccountAssignmentState()
        {
        }
        public static new AccountAssignmentState Empty => new AccountAssignmentState();
    }
}
