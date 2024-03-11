// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kms
{
    /// <summary>
    /// Manages a KMS multi-Region replica key that uses external key material.
    /// See the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-import.html) for more information on importing key material into multi-Region keys.
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
    ///     var primary = new Aws.Kms.ExternalKey("primary", new()
    ///     {
    ///         Description = "Multi-Region primary key",
    ///         DeletionWindowInDays = 30,
    ///         MultiRegion = true,
    ///         Enabled = true,
    ///         KeyMaterialBase64 = "...",
    ///     });
    /// 
    ///     var replica = new Aws.Kms.ReplicaExternalKey("replica", new()
    ///     {
    ///         Description = "Multi-Region replica key",
    ///         DeletionWindowInDays = 7,
    ///         PrimaryKeyArn = primaryAwsKmsExternal.Arn,
    ///         KeyMaterialBase64 = "...",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import KMS multi-Region replica keys using the `id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:kms/replicaExternalKey:ReplicaExternalKey example 1234abcd-12ab-34cd-56ef-1234567890ab
    /// ```
    /// </summary>
    [AwsResourceType("aws:kms/replicaExternalKey:ReplicaExternalKey")]
    public partial class ReplicaExternalKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the replica key. The key ARNs of related multi-Region keys differ only in the Region value.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// A flag to indicate whether to bypass the key policy lockout safety check.
        /// Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
        /// For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
        /// The default value is `false`.
        /// </summary>
        [Output("bypassPolicyLockoutSafetyCheck")]
        public Output<bool?> BypassPolicyLockoutSafetyCheck { get; private set; } = null!;

        /// <summary>
        /// The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
        /// If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
        /// </summary>
        [Output("deletionWindowInDays")]
        public Output<int?> DeletionWindowInDays { get; private set; } = null!;

        /// <summary>
        /// A description of the KMS key.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the replica key is enabled. Disabled KMS keys cannot be used in cryptographic operations. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
        /// </summary>
        [Output("expirationModel")]
        public Output<string> ExpirationModel { get; private set; } = null!;

        /// <summary>
        /// The key ID of the replica key. Related multi-Region keys have the same key ID.
        /// </summary>
        [Output("keyId")]
        public Output<string> KeyId { get; private set; } = null!;

        /// <summary>
        /// Base64 encoded 256-bit symmetric encryption key material to import. The KMS key is permanently associated with this key material. The same key material can be [reimported](https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#reimport-key-material), but you cannot import different key material.
        /// </summary>
        [Output("keyMaterialBase64")]
        public Output<string?> KeyMaterialBase64 { get; private set; } = null!;

        /// <summary>
        /// The state of the replica key.
        /// </summary>
        [Output("keyState")]
        public Output<string> KeyState { get; private set; } = null!;

        /// <summary>
        /// The [cryptographic operations](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations) for which you can use the KMS key. This is a shared property of multi-Region keys.
        /// </summary>
        [Output("keyUsage")]
        public Output<string> KeyUsage { get; private set; } = null!;

        /// <summary>
        /// The key policy to attach to the KMS key. If you do not specify a key policy, AWS KMS attaches the [default key policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default) to the KMS key.
        /// </summary>
        [Output("policy")]
        public Output<string> Policy { get; private set; } = null!;

        /// <summary>
        /// The ARN of the multi-Region primary key to replicate. The primary key must be in a different AWS Region of the same AWS Partition. You can create only one replica of a given primary key in each AWS Region.
        /// </summary>
        [Output("primaryKeyArn")]
        public Output<string> PrimaryKeyArn { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the replica key. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the key becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        /// </summary>
        [Output("validTo")]
        public Output<string?> ValidTo { get; private set; } = null!;


        /// <summary>
        /// Create a ReplicaExternalKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ReplicaExternalKey(string name, ReplicaExternalKeyArgs args, CustomResourceOptions? options = null)
            : base("aws:kms/replicaExternalKey:ReplicaExternalKey", name, args ?? new ReplicaExternalKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ReplicaExternalKey(string name, Input<string> id, ReplicaExternalKeyState? state = null, CustomResourceOptions? options = null)
            : base("aws:kms/replicaExternalKey:ReplicaExternalKey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "keyMaterialBase64",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ReplicaExternalKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ReplicaExternalKey Get(string name, Input<string> id, ReplicaExternalKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new ReplicaExternalKey(name, id, state, options);
        }
    }

    public sealed class ReplicaExternalKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A flag to indicate whether to bypass the key policy lockout safety check.
        /// Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
        /// For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
        /// The default value is `false`.
        /// </summary>
        [Input("bypassPolicyLockoutSafetyCheck")]
        public Input<bool>? BypassPolicyLockoutSafetyCheck { get; set; }

        /// <summary>
        /// The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
        /// If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
        /// </summary>
        [Input("deletionWindowInDays")]
        public Input<int>? DeletionWindowInDays { get; set; }

        /// <summary>
        /// A description of the KMS key.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Specifies whether the replica key is enabled. Disabled KMS keys cannot be used in cryptographic operations. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("keyMaterialBase64")]
        private Input<string>? _keyMaterialBase64;

        /// <summary>
        /// Base64 encoded 256-bit symmetric encryption key material to import. The KMS key is permanently associated with this key material. The same key material can be [reimported](https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#reimport-key-material), but you cannot import different key material.
        /// </summary>
        public Input<string>? KeyMaterialBase64
        {
            get => _keyMaterialBase64;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _keyMaterialBase64 = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The key policy to attach to the KMS key. If you do not specify a key policy, AWS KMS attaches the [default key policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default) to the KMS key.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// The ARN of the multi-Region primary key to replicate. The primary key must be in a different AWS Region of the same AWS Partition. You can create only one replica of a given primary key in each AWS Region.
        /// </summary>
        [Input("primaryKeyArn", required: true)]
        public Input<string> PrimaryKeyArn { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the replica key. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the key becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        /// </summary>
        [Input("validTo")]
        public Input<string>? ValidTo { get; set; }

        public ReplicaExternalKeyArgs()
        {
        }
        public static new ReplicaExternalKeyArgs Empty => new ReplicaExternalKeyArgs();
    }

    public sealed class ReplicaExternalKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the replica key. The key ARNs of related multi-Region keys differ only in the Region value.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// A flag to indicate whether to bypass the key policy lockout safety check.
        /// Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
        /// For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
        /// The default value is `false`.
        /// </summary>
        [Input("bypassPolicyLockoutSafetyCheck")]
        public Input<bool>? BypassPolicyLockoutSafetyCheck { get; set; }

        /// <summary>
        /// The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
        /// If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
        /// </summary>
        [Input("deletionWindowInDays")]
        public Input<int>? DeletionWindowInDays { get; set; }

        /// <summary>
        /// A description of the KMS key.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Specifies whether the replica key is enabled. Disabled KMS keys cannot be used in cryptographic operations. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
        /// </summary>
        [Input("expirationModel")]
        public Input<string>? ExpirationModel { get; set; }

        /// <summary>
        /// The key ID of the replica key. Related multi-Region keys have the same key ID.
        /// </summary>
        [Input("keyId")]
        public Input<string>? KeyId { get; set; }

        [Input("keyMaterialBase64")]
        private Input<string>? _keyMaterialBase64;

        /// <summary>
        /// Base64 encoded 256-bit symmetric encryption key material to import. The KMS key is permanently associated with this key material. The same key material can be [reimported](https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#reimport-key-material), but you cannot import different key material.
        /// </summary>
        public Input<string>? KeyMaterialBase64
        {
            get => _keyMaterialBase64;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _keyMaterialBase64 = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The state of the replica key.
        /// </summary>
        [Input("keyState")]
        public Input<string>? KeyState { get; set; }

        /// <summary>
        /// The [cryptographic operations](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations) for which you can use the KMS key. This is a shared property of multi-Region keys.
        /// </summary>
        [Input("keyUsage")]
        public Input<string>? KeyUsage { get; set; }

        /// <summary>
        /// The key policy to attach to the KMS key. If you do not specify a key policy, AWS KMS attaches the [default key policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default) to the KMS key.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// The ARN of the multi-Region primary key to replicate. The primary key must be in a different AWS Region of the same AWS Partition. You can create only one replica of a given primary key in each AWS Region.
        /// </summary>
        [Input("primaryKeyArn")]
        public Input<string>? PrimaryKeyArn { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the replica key. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the key becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        /// </summary>
        [Input("validTo")]
        public Input<string>? ValidTo { get; set; }

        public ReplicaExternalKeyState()
        {
        }
        public static new ReplicaExternalKeyState Empty => new ReplicaExternalKeyState();
    }
}
