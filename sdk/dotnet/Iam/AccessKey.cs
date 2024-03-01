// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Iam
{
    /// <summary>
    /// Provides an IAM access key. This is a set of credentials that allow API requests to be made as an IAM user.
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
    ///     var lbUser = new Aws.Iam.User("lb", new()
    ///     {
    ///         Name = "loadbalancer",
    ///         Path = "/system/",
    ///     });
    /// 
    ///     var lb = new Aws.Iam.AccessKey("lb", new()
    ///     {
    ///         User = lbUser.Name,
    ///         PgpKey = "keybase:some_person_that_exists",
    ///     });
    /// 
    ///     var lbRo = Aws.Iam.GetPolicyDocument.Invoke(new()
    ///     {
    ///         Statements = new[]
    ///         {
    ///             new Aws.Iam.Inputs.GetPolicyDocumentStatementInputArgs
    ///             {
    ///                 Effect = "Allow",
    ///                 Actions = new[]
    ///                 {
    ///                     "ec2:Describe*",
    ///                 },
    ///                 Resources = new[]
    ///                 {
    ///                     "*",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var lbRoUserPolicy = new Aws.Iam.UserPolicy("lb_ro", new()
    ///     {
    ///         Name = "test",
    ///         User = lbUser.Name,
    ///         Policy = lbRo.Apply(getPolicyDocumentResult =&gt; getPolicyDocumentResult.Json),
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["secret"] = lb.EncryptedSecret,
    ///     };
    /// });
    /// ```
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Aws.Iam.User("test", new()
    ///     {
    ///         Name = "test",
    ///         Path = "/test/",
    ///     });
    /// 
    ///     var testAccessKey = new Aws.Iam.AccessKey("test", new()
    ///     {
    ///         User = test.Name,
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["awsIamSmtpPasswordV4"] = testAccessKey.SesSmtpPasswordV4,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import IAM Access Keys using the identifier. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:iam/accessKey:AccessKey example AKIA1234567890
    /// ```
    ///  Resource attributes such as `encrypted_secret`, `key_fingerprint`, `pgp_key`, `secret`, `ses_smtp_password_v4`, and `encrypted_ses_smtp_password_v4` are not available for imported resources as this information cannot be read from the IAM API.
    /// </summary>
    [AwsResourceType("aws:iam/accessKey:AccessKey")]
    public partial class AccessKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the access key was created.
        /// </summary>
        [Output("createDate")]
        public Output<string> CreateDate { get; private set; } = null!;

        /// <summary>
        /// Encrypted secret, base64 encoded, if `pgp_key` was specified. This attribute is not available for imported resources. The encrypted secret may be decrypted using the command line.
        /// </summary>
        [Output("encryptedSecret")]
        public Output<string> EncryptedSecret { get; private set; } = null!;

        /// <summary>
        /// Encrypted SES SMTP password, base64 encoded, if `pgp_key` was specified. This attribute is not available for imported resources. The encrypted password may be decrypted using the command line.
        /// </summary>
        [Output("encryptedSesSmtpPasswordV4")]
        public Output<string> EncryptedSesSmtpPasswordV4 { get; private set; } = null!;

        /// <summary>
        /// Fingerprint of the PGP key used to encrypt the secret. This attribute is not available for imported resources.
        /// </summary>
        [Output("keyFingerprint")]
        public Output<string> KeyFingerprint { get; private set; } = null!;

        /// <summary>
        /// Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:some_person_that_exists`, for use in the `encrypted_secret` output attribute. If providing a base-64 encoded PGP public key, make sure to provide the "raw" version and not the "armored" one (e.g. avoid passing the `-a` option to `gpg --export`).
        /// </summary>
        [Output("pgpKey")]
        public Output<string?> PgpKey { get; private set; } = null!;

        /// <summary>
        /// Secret access key. This attribute is not available for imported resources. Note that this will be written to the state file. If you use this, please protect your backend state file judiciously. Alternatively, you may supply a `pgp_key` instead, which will prevent the secret from being stored in plaintext, at the cost of preventing the use of the secret key in automation.
        /// </summary>
        [Output("secret")]
        public Output<string> Secret { get; private set; } = null!;

        /// <summary>
        /// Secret access key converted into an SES SMTP password by applying [AWS's documented Sigv4 conversion algorithm](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/smtp-credentials.html#smtp-credentials-convert). This attribute is not available for imported resources. As SigV4 is region specific, valid Provider regions are `ap-south-1`, `ap-southeast-2`, `eu-central-1`, `eu-west-1`, `us-east-1` and `us-west-2`. See current [AWS SES regions](https://docs.aws.amazon.com/general/latest/gr/rande.html#ses_region).
        /// </summary>
        [Output("sesSmtpPasswordV4")]
        public Output<string> SesSmtpPasswordV4 { get; private set; } = null!;

        /// <summary>
        /// Access key status to apply. Defaults to `Active`. Valid values are `Active` and `Inactive`.
        /// </summary>
        [Output("status")]
        public Output<string?> Status { get; private set; } = null!;

        /// <summary>
        /// IAM user to associate with this access key.
        /// </summary>
        [Output("user")]
        public Output<string> User { get; private set; } = null!;


        /// <summary>
        /// Create a AccessKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessKey(string name, AccessKeyArgs args, CustomResourceOptions? options = null)
            : base("aws:iam/accessKey:AccessKey", name, args ?? new AccessKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessKey(string name, Input<string> id, AccessKeyState? state = null, CustomResourceOptions? options = null)
            : base("aws:iam/accessKey:AccessKey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "secret",
                    "sesSmtpPasswordV4",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AccessKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessKey Get(string name, Input<string> id, AccessKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessKey(name, id, state, options);
        }
    }

    public sealed class AccessKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:some_person_that_exists`, for use in the `encrypted_secret` output attribute. If providing a base-64 encoded PGP public key, make sure to provide the "raw" version and not the "armored" one (e.g. avoid passing the `-a` option to `gpg --export`).
        /// </summary>
        [Input("pgpKey")]
        public Input<string>? PgpKey { get; set; }

        /// <summary>
        /// Access key status to apply. Defaults to `Active`. Valid values are `Active` and `Inactive`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// IAM user to associate with this access key.
        /// </summary>
        [Input("user", required: true)]
        public Input<string> User { get; set; } = null!;

        public AccessKeyArgs()
        {
        }
        public static new AccessKeyArgs Empty => new AccessKeyArgs();
    }

    public sealed class AccessKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the access key was created.
        /// </summary>
        [Input("createDate")]
        public Input<string>? CreateDate { get; set; }

        /// <summary>
        /// Encrypted secret, base64 encoded, if `pgp_key` was specified. This attribute is not available for imported resources. The encrypted secret may be decrypted using the command line.
        /// </summary>
        [Input("encryptedSecret")]
        public Input<string>? EncryptedSecret { get; set; }

        /// <summary>
        /// Encrypted SES SMTP password, base64 encoded, if `pgp_key` was specified. This attribute is not available for imported resources. The encrypted password may be decrypted using the command line.
        /// </summary>
        [Input("encryptedSesSmtpPasswordV4")]
        public Input<string>? EncryptedSesSmtpPasswordV4 { get; set; }

        /// <summary>
        /// Fingerprint of the PGP key used to encrypt the secret. This attribute is not available for imported resources.
        /// </summary>
        [Input("keyFingerprint")]
        public Input<string>? KeyFingerprint { get; set; }

        /// <summary>
        /// Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:some_person_that_exists`, for use in the `encrypted_secret` output attribute. If providing a base-64 encoded PGP public key, make sure to provide the "raw" version and not the "armored" one (e.g. avoid passing the `-a` option to `gpg --export`).
        /// </summary>
        [Input("pgpKey")]
        public Input<string>? PgpKey { get; set; }

        [Input("secret")]
        private Input<string>? _secret;

        /// <summary>
        /// Secret access key. This attribute is not available for imported resources. Note that this will be written to the state file. If you use this, please protect your backend state file judiciously. Alternatively, you may supply a `pgp_key` instead, which will prevent the secret from being stored in plaintext, at the cost of preventing the use of the secret key in automation.
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("sesSmtpPasswordV4")]
        private Input<string>? _sesSmtpPasswordV4;

        /// <summary>
        /// Secret access key converted into an SES SMTP password by applying [AWS's documented Sigv4 conversion algorithm](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/smtp-credentials.html#smtp-credentials-convert). This attribute is not available for imported resources. As SigV4 is region specific, valid Provider regions are `ap-south-1`, `ap-southeast-2`, `eu-central-1`, `eu-west-1`, `us-east-1` and `us-west-2`. See current [AWS SES regions](https://docs.aws.amazon.com/general/latest/gr/rande.html#ses_region).
        /// </summary>
        public Input<string>? SesSmtpPasswordV4
        {
            get => _sesSmtpPasswordV4;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sesSmtpPasswordV4 = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Access key status to apply. Defaults to `Active`. Valid values are `Active` and `Inactive`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// IAM user to associate with this access key.
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        public AccessKeyState()
        {
        }
        public static new AccessKeyState Empty => new AccessKeyState();
    }
}
