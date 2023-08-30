// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Transfer
{
    /// <summary>
    /// Provides a AWS Transfer User SSH Key resource.
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
    ///     var exampleServer = new Aws.Transfer.Server("exampleServer", new()
    ///     {
    ///         IdentityProviderType = "SERVICE_MANAGED",
    ///         Tags = 
    ///         {
    ///             { "NAME", "tf-acc-test-transfer-server" },
    ///         },
    ///     });
    /// 
    ///     var assumeRole = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Effect = "Allow",
    ///                 Principals = new[]
    ///                 {
    ///                     new Aws.Iam.Inputs.GetPolicyDocumentStatementPrincipalInputArgs
    ///                     {
    ///                         Type = "Service",
    ///                         Identifiers = new[]
    ///                         {
    ///                             "transfer.amazonaws.com",
    ///                         },
    ///                     },
    ///                 },
    ///                 Actions = new[]
    ///                 {
    ///                     "sts:AssumeRole",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleRole = new Aws.Iam.Role("exampleRole", new()
    ///     {
    ///         AssumeRolePolicy = assumeRole.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     var exampleUser = new Aws.Transfer.User("exampleUser", new()
    ///     {
    ///         ServerId = exampleServer.Id,
    ///         UserName = "tftestuser",
    ///         Role = exampleRole.Arn,
    ///         Tags = 
    ///         {
    ///             { "NAME", "tftestuser" },
    ///         },
    ///     });
    /// 
    ///     var exampleSshKey = new Aws.Transfer.SshKey("exampleSshKey", new()
    ///     {
    ///         ServerId = exampleServer.Id,
    ///         UserName = exampleUser.UserName,
    ///         Body = "... SSH key ...",
    ///     });
    /// 
    ///     var examplePolicyDocument = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Sid = "AllowFullAccesstoS3",
    ///                 Effect = "Allow",
    ///                 Actions = new[]
    ///                 {
    ///                     "s3:*",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "*",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleRolePolicy = new Aws.Iam.RolePolicy("exampleRolePolicy", new()
    ///     {
    ///         Role = exampleRole.Id,
    ///         Policy = examplePolicyDocument.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Transfer SSH Public Key using the `server_id` and `user_name` and `ssh_public_key_id` separated by `/`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:transfer/sshKey:SshKey bar s-12345678/test-username/key-12345
    /// ```
    /// </summary>
    [AwsResourceType("aws:transfer/sshKey:SshKey")]
    public partial class SshKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The public key portion of an SSH key pair.
        /// </summary>
        [Output("body")]
        public Output<string> Body { get; private set; } = null!;

        /// <summary>
        /// The Server ID of the Transfer Server (e.g., `s-12345678`)
        /// </summary>
        [Output("serverId")]
        public Output<string> ServerId { get; private set; } = null!;

        /// <summary>
        /// The name of the user account that is assigned to one or more servers.
        /// </summary>
        [Output("userName")]
        public Output<string> UserName { get; private set; } = null!;


        /// <summary>
        /// Create a SshKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SshKey(string name, SshKeyArgs args, CustomResourceOptions? options = null)
            : base("aws:transfer/sshKey:SshKey", name, args ?? new SshKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SshKey(string name, Input<string> id, SshKeyState? state = null, CustomResourceOptions? options = null)
            : base("aws:transfer/sshKey:SshKey", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SshKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SshKey Get(string name, Input<string> id, SshKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new SshKey(name, id, state, options);
        }
    }

    public sealed class SshKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The public key portion of an SSH key pair.
        /// </summary>
        [Input("body", required: true)]
        public Input<string> Body { get; set; } = null!;

        /// <summary>
        /// The Server ID of the Transfer Server (e.g., `s-12345678`)
        /// </summary>
        [Input("serverId", required: true)]
        public Input<string> ServerId { get; set; } = null!;

        /// <summary>
        /// The name of the user account that is assigned to one or more servers.
        /// </summary>
        [Input("userName", required: true)]
        public Input<string> UserName { get; set; } = null!;

        public SshKeyArgs()
        {
        }
        public static new SshKeyArgs Empty => new SshKeyArgs();
    }

    public sealed class SshKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The public key portion of an SSH key pair.
        /// </summary>
        [Input("body")]
        public Input<string>? Body { get; set; }

        /// <summary>
        /// The Server ID of the Transfer Server (e.g., `s-12345678`)
        /// </summary>
        [Input("serverId")]
        public Input<string>? ServerId { get; set; }

        /// <summary>
        /// The name of the user account that is assigned to one or more servers.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public SshKeyState()
        {
        }
        public static new SshKeyState Empty => new SshKeyState();
    }
}
