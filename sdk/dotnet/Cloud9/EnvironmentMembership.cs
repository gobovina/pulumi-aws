// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Cloud9
{
    /// <summary>
    /// Provides an environment member to an AWS Cloud9 development environment.
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
    ///     var testEnvironmentEC2 = new Aws.Cloud9.EnvironmentEC2("testEnvironmentEC2", new()
    ///     {
    ///         InstanceType = "t2.micro",
    ///     });
    /// 
    ///     var testUser = new Aws.Iam.User("testUser");
    /// 
    ///     var testEnvironmentMembership = new Aws.Cloud9.EnvironmentMembership("testEnvironmentMembership", new()
    ///     {
    ///         EnvironmentId = testEnvironmentEC2.Id,
    ///         Permissions = "read-only",
    ///         UserArn = testUser.Arn,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// In TODO v1.5.0 and later, use an `import` block to import Cloud9 environment membership using the `environment-id#user-arn`. For exampleterraform import {
    /// 
    ///  to = aws_cloud9_environment_membership.test
    /// 
    ///  id = "environment-id#user-arn" } Using `TODO import`, import Cloud9 environment membership using the `environment-id#user-arn`. For exampleconsole % TODO import aws_cloud9_environment_membership.test environment-id#user-arn
    /// </summary>
    [AwsResourceType("aws:cloud9/environmentMembership:EnvironmentMembership")]
    public partial class EnvironmentMembership : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the environment that contains the environment member you want to add.
        /// </summary>
        [Output("environmentId")]
        public Output<string> EnvironmentId { get; private set; } = null!;

        /// <summary>
        /// The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
        /// </summary>
        [Output("permissions")]
        public Output<string> Permissions { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the environment member you want to add.
        /// </summary>
        [Output("userArn")]
        public Output<string> UserArn { get; private set; } = null!;

        /// <summary>
        /// he user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a EnvironmentMembership resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EnvironmentMembership(string name, EnvironmentMembershipArgs args, CustomResourceOptions? options = null)
            : base("aws:cloud9/environmentMembership:EnvironmentMembership", name, args ?? new EnvironmentMembershipArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EnvironmentMembership(string name, Input<string> id, EnvironmentMembershipState? state = null, CustomResourceOptions? options = null)
            : base("aws:cloud9/environmentMembership:EnvironmentMembership", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EnvironmentMembership resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EnvironmentMembership Get(string name, Input<string> id, EnvironmentMembershipState? state = null, CustomResourceOptions? options = null)
        {
            return new EnvironmentMembership(name, id, state, options);
        }
    }

    public sealed class EnvironmentMembershipArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the environment that contains the environment member you want to add.
        /// </summary>
        [Input("environmentId", required: true)]
        public Input<string> EnvironmentId { get; set; } = null!;

        /// <summary>
        /// The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
        /// </summary>
        [Input("permissions", required: true)]
        public Input<string> Permissions { get; set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the environment member you want to add.
        /// </summary>
        [Input("userArn", required: true)]
        public Input<string> UserArn { get; set; } = null!;

        public EnvironmentMembershipArgs()
        {
        }
        public static new EnvironmentMembershipArgs Empty => new EnvironmentMembershipArgs();
    }

    public sealed class EnvironmentMembershipState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the environment that contains the environment member you want to add.
        /// </summary>
        [Input("environmentId")]
        public Input<string>? EnvironmentId { get; set; }

        /// <summary>
        /// The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
        /// </summary>
        [Input("permissions")]
        public Input<string>? Permissions { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the environment member you want to add.
        /// </summary>
        [Input("userArn")]
        public Input<string>? UserArn { get; set; }

        /// <summary>
        /// he user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public EnvironmentMembershipState()
        {
        }
        public static new EnvironmentMembershipState Empty => new EnvironmentMembershipState();
    }
}
