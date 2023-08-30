// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SecretsManager
{
    /// <summary>
    /// Provides a resource to manage AWS Secrets Manager secret version including its secret value. To manage secret metadata, see the `aws.secretsmanager.Secret` resource.
    /// 
    /// &gt; **NOTE:** If the `AWSCURRENT` staging label is present on this version during resource deletion, that label cannot be removed and will be skipped to prevent errors when fully deleting the secret. That label will leave this secret version active even after the resource is deleted from this provider unless the secret itself is deleted. Move the `AWSCURRENT` staging label before or after deleting this resource from this provider to fully trigger version deprecation if necessary.
    /// 
    /// ## Example Usage
    /// ### Simple String Value
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.SecretsManager.SecretVersion("example", new()
    ///     {
    ///         SecretId = aws_secretsmanager_secret.Example.Id,
    ///         SecretString = "example-string-to-protect",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_secretsmanager_secret_version` using the secret ID and version ID. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:secretsmanager/secretVersion:SecretVersion example 'arn:aws:secretsmanager:us-east-1:123456789012:secret:example-123456|xxxxx-xxxxxxx-xxxxxxx-xxxxx'
    /// ```
    /// </summary>
    [AwsResourceType("aws:secretsmanager/secretVersion:SecretVersion")]
    public partial class SecretVersion : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the secret.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
        /// </summary>
        [Output("secretBinary")]
        public Output<string?> SecretBinary { get; private set; } = null!;

        /// <summary>
        /// Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
        /// </summary>
        [Output("secretId")]
        public Output<string> SecretId { get; private set; } = null!;

        /// <summary>
        /// Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
        /// </summary>
        [Output("secretString")]
        public Output<string?> SecretString { get; private set; } = null!;

        /// <summary>
        /// The unique identifier of the version of the secret.
        /// </summary>
        [Output("versionId")]
        public Output<string> VersionId { get; private set; } = null!;

        /// <summary>
        /// Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
        /// 
        /// &gt; **NOTE:** If `version_stages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
        /// </summary>
        [Output("versionStages")]
        public Output<ImmutableArray<string>> VersionStages { get; private set; } = null!;


        /// <summary>
        /// Create a SecretVersion resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecretVersion(string name, SecretVersionArgs args, CustomResourceOptions? options = null)
            : base("aws:secretsmanager/secretVersion:SecretVersion", name, args ?? new SecretVersionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecretVersion(string name, Input<string> id, SecretVersionState? state = null, CustomResourceOptions? options = null)
            : base("aws:secretsmanager/secretVersion:SecretVersion", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "secretBinary",
                    "secretString",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SecretVersion resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecretVersion Get(string name, Input<string> id, SecretVersionState? state = null, CustomResourceOptions? options = null)
        {
            return new SecretVersion(name, id, state, options);
        }
    }

    public sealed class SecretVersionArgs : global::Pulumi.ResourceArgs
    {
        [Input("secretBinary")]
        private Input<string>? _secretBinary;

        /// <summary>
        /// Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
        /// </summary>
        public Input<string>? SecretBinary
        {
            get => _secretBinary;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretBinary = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
        /// </summary>
        [Input("secretId", required: true)]
        public Input<string> SecretId { get; set; } = null!;

        [Input("secretString")]
        private Input<string>? _secretString;

        /// <summary>
        /// Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
        /// </summary>
        public Input<string>? SecretString
        {
            get => _secretString;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretString = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("versionStages")]
        private InputList<string>? _versionStages;

        /// <summary>
        /// Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
        /// 
        /// &gt; **NOTE:** If `version_stages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
        /// </summary>
        public InputList<string> VersionStages
        {
            get => _versionStages ?? (_versionStages = new InputList<string>());
            set => _versionStages = value;
        }

        public SecretVersionArgs()
        {
        }
        public static new SecretVersionArgs Empty => new SecretVersionArgs();
    }

    public sealed class SecretVersionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the secret.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("secretBinary")]
        private Input<string>? _secretBinary;

        /// <summary>
        /// Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
        /// </summary>
        public Input<string>? SecretBinary
        {
            get => _secretBinary;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretBinary = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
        /// </summary>
        [Input("secretId")]
        public Input<string>? SecretId { get; set; }

        [Input("secretString")]
        private Input<string>? _secretString;

        /// <summary>
        /// Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
        /// </summary>
        public Input<string>? SecretString
        {
            get => _secretString;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretString = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The unique identifier of the version of the secret.
        /// </summary>
        [Input("versionId")]
        public Input<string>? VersionId { get; set; }

        [Input("versionStages")]
        private InputList<string>? _versionStages;

        /// <summary>
        /// Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
        /// 
        /// &gt; **NOTE:** If `version_stages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
        /// </summary>
        public InputList<string> VersionStages
        {
            get => _versionStages ?? (_versionStages = new InputList<string>());
            set => _versionStages = value;
        }

        public SecretVersionState()
        {
        }
        public static new SecretVersionState Empty => new SecretVersionState();
    }
}
