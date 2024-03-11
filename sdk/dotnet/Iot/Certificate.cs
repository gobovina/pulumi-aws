// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Iot
{
    /// <summary>
    /// Creates and manages an AWS IoT certificate.
    /// 
    /// ## Example Usage
    /// 
    /// ### With CSR
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var cert = new Aws.Iot.Certificate("cert", new()
    ///     {
    ///         Csr = Std.File.Invoke(new()
    ///         {
    ///             Input = "/my/csr.pem",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///         Active = true,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Without CSR
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
    ///     var cert = new Aws.Iot.Certificate("cert", new()
    ///     {
    ///         Active = true,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### From existing certificate without a CA
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var cert = new Aws.Iot.Certificate("cert", new()
    ///     {
    ///         CertificatePem = Std.File.Invoke(new()
    ///         {
    ///             Input = "/my/cert.pem",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///         Active = true,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [AwsResourceType("aws:iot/certificate:Certificate")]
    public partial class Certificate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Boolean flag to indicate if the certificate should be active
        /// </summary>
        [Output("active")]
        public Output<bool> Active { get; private set; } = null!;

        /// <summary>
        /// The ARN of the created certificate.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The certificate ID of the CA certificate used to sign the certificate.
        /// </summary>
        [Output("caCertificateId")]
        public Output<string> CaCertificateId { get; private set; } = null!;

        /// <summary>
        /// The CA certificate for the certificate to be registered. If this is set, the CA needs to be registered with AWS IoT beforehand.
        /// </summary>
        [Output("caPem")]
        public Output<string?> CaPem { get; private set; } = null!;

        /// <summary>
        /// The certificate to be registered. If `ca_pem` is unspecified, review
        /// [RegisterCertificateWithoutCA](https://docs.aws.amazon.com/iot/latest/apireference/API_RegisterCertificateWithoutCA.html).
        /// If `ca_pem` is specified, review
        /// [RegisterCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_RegisterCertificate.html)
        /// for more information on registering a certificate.
        /// </summary>
        [Output("certificatePem")]
        public Output<string> CertificatePem { get; private set; } = null!;

        /// <summary>
        /// The certificate signing request. Review
        /// [CreateCertificateFromCsr](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
        /// for more information on generating a certificate from a certificate signing request (CSR).
        /// If none is specified both the certificate and keys will be generated, review [CreateKeysAndCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html)
        /// for more information on generating keys and a certificate.
        /// </summary>
        [Output("csr")]
        public Output<string?> Csr { get; private set; } = null!;

        /// <summary>
        /// When neither CSR nor certificate is provided, the private key.
        /// </summary>
        [Output("privateKey")]
        public Output<string> PrivateKey { get; private set; } = null!;

        /// <summary>
        /// When neither CSR nor certificate is provided, the public key.
        /// </summary>
        [Output("publicKey")]
        public Output<string> PublicKey { get; private set; } = null!;


        /// <summary>
        /// Create a Certificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Certificate(string name, CertificateArgs args, CustomResourceOptions? options = null)
            : base("aws:iot/certificate:Certificate", name, args ?? new CertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Certificate(string name, Input<string> id, CertificateState? state = null, CustomResourceOptions? options = null)
            : base("aws:iot/certificate:Certificate", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "caPem",
                    "certificatePem",
                    "privateKey",
                    "publicKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Certificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Certificate Get(string name, Input<string> id, CertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new Certificate(name, id, state, options);
        }
    }

    public sealed class CertificateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean flag to indicate if the certificate should be active
        /// </summary>
        [Input("active", required: true)]
        public Input<bool> Active { get; set; } = null!;

        [Input("caPem")]
        private Input<string>? _caPem;

        /// <summary>
        /// The CA certificate for the certificate to be registered. If this is set, the CA needs to be registered with AWS IoT beforehand.
        /// </summary>
        public Input<string>? CaPem
        {
            get => _caPem;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _caPem = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("certificatePem")]
        private Input<string>? _certificatePem;

        /// <summary>
        /// The certificate to be registered. If `ca_pem` is unspecified, review
        /// [RegisterCertificateWithoutCA](https://docs.aws.amazon.com/iot/latest/apireference/API_RegisterCertificateWithoutCA.html).
        /// If `ca_pem` is specified, review
        /// [RegisterCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_RegisterCertificate.html)
        /// for more information on registering a certificate.
        /// </summary>
        public Input<string>? CertificatePem
        {
            get => _certificatePem;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _certificatePem = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The certificate signing request. Review
        /// [CreateCertificateFromCsr](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
        /// for more information on generating a certificate from a certificate signing request (CSR).
        /// If none is specified both the certificate and keys will be generated, review [CreateKeysAndCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html)
        /// for more information on generating keys and a certificate.
        /// </summary>
        [Input("csr")]
        public Input<string>? Csr { get; set; }

        public CertificateArgs()
        {
        }
        public static new CertificateArgs Empty => new CertificateArgs();
    }

    public sealed class CertificateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean flag to indicate if the certificate should be active
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// The ARN of the created certificate.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The certificate ID of the CA certificate used to sign the certificate.
        /// </summary>
        [Input("caCertificateId")]
        public Input<string>? CaCertificateId { get; set; }

        [Input("caPem")]
        private Input<string>? _caPem;

        /// <summary>
        /// The CA certificate for the certificate to be registered. If this is set, the CA needs to be registered with AWS IoT beforehand.
        /// </summary>
        public Input<string>? CaPem
        {
            get => _caPem;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _caPem = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("certificatePem")]
        private Input<string>? _certificatePem;

        /// <summary>
        /// The certificate to be registered. If `ca_pem` is unspecified, review
        /// [RegisterCertificateWithoutCA](https://docs.aws.amazon.com/iot/latest/apireference/API_RegisterCertificateWithoutCA.html).
        /// If `ca_pem` is specified, review
        /// [RegisterCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_RegisterCertificate.html)
        /// for more information on registering a certificate.
        /// </summary>
        public Input<string>? CertificatePem
        {
            get => _certificatePem;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _certificatePem = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The certificate signing request. Review
        /// [CreateCertificateFromCsr](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
        /// for more information on generating a certificate from a certificate signing request (CSR).
        /// If none is specified both the certificate and keys will be generated, review [CreateKeysAndCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html)
        /// for more information on generating keys and a certificate.
        /// </summary>
        [Input("csr")]
        public Input<string>? Csr { get; set; }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// When neither CSR nor certificate is provided, the private key.
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("publicKey")]
        private Input<string>? _publicKey;

        /// <summary>
        /// When neither CSR nor certificate is provided, the public key.
        /// </summary>
        public Input<string>? PublicKey
        {
            get => _publicKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _publicKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public CertificateState()
        {
        }
        public static new CertificateState Empty => new CertificateState();
    }
}
