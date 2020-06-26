// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Glacier
{
    /// <summary>
    /// Provides a Glacier Vault Resource. You can refer to the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-vaults.html) for a full explanation of the Glacier Vault functionality
    /// 
    /// &gt; **NOTE:** When removing a Glacier Vault, the Vault must be empty.
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
    ///         var awsSnsTopic = new Aws.Sns.Topic("awsSnsTopic", new Aws.Sns.TopicArgs
    ///         {
    ///         });
    ///         var myArchive = new Aws.Glacier.Vault("myArchive", new Aws.Glacier.VaultArgs
    ///         {
    ///             AccessPolicy = @"{
    ///     ""Version"":""2012-10-17"",
    ///     ""Statement"":[
    ///        {
    ///           ""Sid"": ""add-read-only-perm"",
    ///           ""Principal"": ""*"",
    ///           ""Effect"": ""Allow"",
    ///           ""Action"": [
    ///              ""glacier:InitiateJob"",
    ///              ""glacier:GetJobOutput""
    ///           ],
    ///           ""Resource"": ""arn:aws:glacier:eu-west-1:432981146916:vaults/MyArchive""
    ///        }
    ///     ]
    /// }
    /// 
    /// ",
    ///             Notifications = 
    ///             {
    ///                 new Aws.Glacier.Inputs.VaultNotificationArgs
    ///                 {
    ///                     Events = 
    ///                     {
    ///                         "ArchiveRetrievalCompleted",
    ///                         "InventoryRetrievalCompleted",
    ///                     },
    ///                     SnsTopic = awsSnsTopic.Arn,
    ///                 },
    ///             },
    ///             Tags = 
    ///             {
    ///                 { "Test", "MyArchive" },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class Vault : Pulumi.CustomResource
    {
        /// <summary>
        /// The policy document. This is a JSON formatted string.
        /// The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
        /// </summary>
        [Output("accessPolicy")]
        public Output<string?> AccessPolicy { get; private set; } = null!;

        /// <summary>
        /// The ARN of the vault.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The URI of the vault that was created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The notifications for the Vault. Fields documented below.
        /// </summary>
        [Output("notifications")]
        public Output<ImmutableArray<Outputs.VaultNotification>> Notifications { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Vault resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Vault(string name, VaultArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:glacier/vault:Vault", name, args ?? new VaultArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Vault(string name, Input<string> id, VaultState? state = null, CustomResourceOptions? options = null)
            : base("aws:glacier/vault:Vault", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Vault resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Vault Get(string name, Input<string> id, VaultState? state = null, CustomResourceOptions? options = null)
        {
            return new Vault(name, id, state, options);
        }
    }

    public sealed class VaultArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The policy document. This is a JSON formatted string.
        /// The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
        /// </summary>
        [Input("accessPolicy")]
        public Input<string>? AccessPolicy { get; set; }

        /// <summary>
        /// The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notifications")]
        private InputList<Inputs.VaultNotificationArgs>? _notifications;

        /// <summary>
        /// The notifications for the Vault. Fields documented below.
        /// </summary>
        public InputList<Inputs.VaultNotificationArgs> Notifications
        {
            get => _notifications ?? (_notifications = new InputList<Inputs.VaultNotificationArgs>());
            set => _notifications = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public VaultArgs()
        {
        }
    }

    public sealed class VaultState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The policy document. This is a JSON formatted string.
        /// The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
        /// </summary>
        [Input("accessPolicy")]
        public Input<string>? AccessPolicy { get; set; }

        /// <summary>
        /// The ARN of the vault.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The URI of the vault that was created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notifications")]
        private InputList<Inputs.VaultNotificationGetArgs>? _notifications;

        /// <summary>
        /// The notifications for the Vault. Fields documented below.
        /// </summary>
        public InputList<Inputs.VaultNotificationGetArgs> Notifications
        {
            get => _notifications ?? (_notifications = new InputList<Inputs.VaultNotificationGetArgs>());
            set => _notifications = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public VaultState()
        {
        }
    }
}
