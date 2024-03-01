// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.LightSail
{
    /// <summary>
    /// Provides a Lightsail Key Pair, for use with Lightsail Instances. These key pairs
    /// are separate from EC2 Key Pairs, and must be created or imported for use with
    /// Lightsail.
    /// 
    /// &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see ["Regions and Availability Zones in Amazon Lightsail"](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details
    /// 
    /// ## Example Usage
    /// ### Create New Key Pair
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new Lightsail Key Pair
    ///     var lgKeyPair = new Aws.LightSail.KeyPair("lg_key_pair", new()
    ///     {
    ///         Name = "lg_key_pair",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create New Key Pair with PGP Encrypted Private Key
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var lgKeyPair = new Aws.LightSail.KeyPair("lg_key_pair", new()
    ///     {
    ///         Name = "lg_key_pair",
    ///         PgpKey = "keybase:keybaseusername",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Existing Public Key Import
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var lgKeyPair = new Aws.LightSail.KeyPair("lg_key_pair", new()
    ///     {
    ///         Name = "importing",
    ///         PublicKey = Std.File.Invoke(new()
    ///         {
    ///             Input = "~/.ssh/id_rsa.pub",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// You cannot import Lightsail Key Pairs because the private and public key are only available on initial creation.
    /// </summary>
    [AwsResourceType("aws:lightsail/keyPair:KeyPair")]
    public partial class KeyPair : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the Lightsail key pair.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The MD5 public key fingerprint for the encrypted private key.
        /// </summary>
        [Output("encryptedFingerprint")]
        public Output<string> EncryptedFingerprint { get; private set; } = null!;

        /// <summary>
        /// the private key material, base 64 encoded and encrypted with the given `pgp_key`. This is only populated when creating a new key and `pgp_key` is supplied.
        /// </summary>
        [Output("encryptedPrivateKey")]
        public Output<string> EncryptedPrivateKey { get; private set; } = null!;

        /// <summary>
        /// The MD5 public key fingerprint as specified in section 4 of RFC 4716.
        /// </summary>
        [Output("fingerprint")]
        public Output<string> Fingerprint { get; private set; } = null!;

        /// <summary>
        /// The name of the Lightsail Key Pair. If omitted, a unique name will be generated by this provider
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("namePrefix")]
        public Output<string> NamePrefix { get; private set; } = null!;

        /// <summary>
        /// An optional PGP key to encrypt the resulting private key material. Only used when creating a new key pair
        /// </summary>
        [Output("pgpKey")]
        public Output<string?> PgpKey { get; private set; } = null!;

        /// <summary>
        /// the private key, base64 encoded. This is only populated when creating a new key, and when no `pgp_key` is provided.
        /// </summary>
        [Output("privateKey")]
        public Output<string> PrivateKey { get; private set; } = null!;

        /// <summary>
        /// The public key material. This public key will be imported into Lightsail
        /// </summary>
        [Output("publicKey")]
        public Output<string> PublicKey { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// 
        /// &gt; **NOTE:** a PGP key is not required, however it is strongly encouraged. Without a PGP key, the private key material will be stored in state unencrypted.`pgp_key` is ignored if `public_key` is supplied.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a KeyPair resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KeyPair(string name, KeyPairArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:lightsail/keyPair:KeyPair", name, args ?? new KeyPairArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KeyPair(string name, Input<string> id, KeyPairState? state = null, CustomResourceOptions? options = null)
            : base("aws:lightsail/keyPair:KeyPair", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing KeyPair resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KeyPair Get(string name, Input<string> id, KeyPairState? state = null, CustomResourceOptions? options = null)
        {
            return new KeyPair(name, id, state, options);
        }
    }

    public sealed class KeyPairArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Lightsail Key Pair. If omitted, a unique name will be generated by this provider
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// An optional PGP key to encrypt the resulting private key material. Only used when creating a new key pair
        /// </summary>
        [Input("pgpKey")]
        public Input<string>? PgpKey { get; set; }

        /// <summary>
        /// The public key material. This public key will be imported into Lightsail
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// 
        /// &gt; **NOTE:** a PGP key is not required, however it is strongly encouraged. Without a PGP key, the private key material will be stored in state unencrypted.`pgp_key` is ignored if `public_key` is supplied.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public KeyPairArgs()
        {
        }
        public static new KeyPairArgs Empty => new KeyPairArgs();
    }

    public sealed class KeyPairState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the Lightsail key pair.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The MD5 public key fingerprint for the encrypted private key.
        /// </summary>
        [Input("encryptedFingerprint")]
        public Input<string>? EncryptedFingerprint { get; set; }

        /// <summary>
        /// the private key material, base 64 encoded and encrypted with the given `pgp_key`. This is only populated when creating a new key and `pgp_key` is supplied.
        /// </summary>
        [Input("encryptedPrivateKey")]
        public Input<string>? EncryptedPrivateKey { get; set; }

        /// <summary>
        /// The MD5 public key fingerprint as specified in section 4 of RFC 4716.
        /// </summary>
        [Input("fingerprint")]
        public Input<string>? Fingerprint { get; set; }

        /// <summary>
        /// The name of the Lightsail Key Pair. If omitted, a unique name will be generated by this provider
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// An optional PGP key to encrypt the resulting private key material. Only used when creating a new key pair
        /// </summary>
        [Input("pgpKey")]
        public Input<string>? PgpKey { get; set; }

        /// <summary>
        /// the private key, base64 encoded. This is only populated when creating a new key, and when no `pgp_key` is provided.
        /// </summary>
        [Input("privateKey")]
        public Input<string>? PrivateKey { get; set; }

        /// <summary>
        /// The public key material. This public key will be imported into Lightsail
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// 
        /// &gt; **NOTE:** a PGP key is not required, however it is strongly encouraged. Without a PGP key, the private key material will be stored in state unencrypted.`pgp_key` is ignored if `public_key` is supplied.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public KeyPairState()
        {
        }
        public static new KeyPairState Empty => new KeyPairState();
    }
}
