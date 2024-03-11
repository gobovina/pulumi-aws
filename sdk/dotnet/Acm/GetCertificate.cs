// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Acm
{
    public static class GetCertificate
    {
        /// <summary>
        /// Use this data source to get the ARN of a certificate in AWS Certificate
        /// Manager (ACM), you can reference
        /// it by domain without having to hard code the ARNs as input.
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
        ///     // Find a certificate that is issued
        ///     var issued = Aws.Acm.GetCertificate.Invoke(new()
        ///     {
        ///         Domain = "tf.example.com",
        ///         Statuses = new[]
        ///         {
        ///             "ISSUED",
        ///         },
        ///     });
        /// 
        ///     // Find a certificate issued by (not imported into) ACM
        ///     var amazonIssued = Aws.Acm.GetCertificate.Invoke(new()
        ///     {
        ///         Domain = "tf.example.com",
        ///         Types = new[]
        ///         {
        ///             "AMAZON_ISSUED",
        ///         },
        ///         MostRecent = true,
        ///     });
        /// 
        ///     // Find a RSA 4096 bit certificate
        ///     var rsa4096 = Aws.Acm.GetCertificate.Invoke(new()
        ///     {
        ///         Domain = "tf.example.com",
        ///         KeyTypes = new[]
        ///         {
        ///             "RSA_4096",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetCertificateResult> InvokeAsync(GetCertificateArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCertificateResult>("aws:acm/getCertificate:getCertificate", args ?? new GetCertificateArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get the ARN of a certificate in AWS Certificate
        /// Manager (ACM), you can reference
        /// it by domain without having to hard code the ARNs as input.
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
        ///     // Find a certificate that is issued
        ///     var issued = Aws.Acm.GetCertificate.Invoke(new()
        ///     {
        ///         Domain = "tf.example.com",
        ///         Statuses = new[]
        ///         {
        ///             "ISSUED",
        ///         },
        ///     });
        /// 
        ///     // Find a certificate issued by (not imported into) ACM
        ///     var amazonIssued = Aws.Acm.GetCertificate.Invoke(new()
        ///     {
        ///         Domain = "tf.example.com",
        ///         Types = new[]
        ///         {
        ///             "AMAZON_ISSUED",
        ///         },
        ///         MostRecent = true,
        ///     });
        /// 
        ///     // Find a RSA 4096 bit certificate
        ///     var rsa4096 = Aws.Acm.GetCertificate.Invoke(new()
        ///     {
        ///         Domain = "tf.example.com",
        ///         KeyTypes = new[]
        ///         {
        ///             "RSA_4096",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetCertificateResult> Invoke(GetCertificateInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCertificateResult>("aws:acm/getCertificate:getCertificate", args ?? new GetCertificateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCertificateArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Domain of the certificate to look up. If no certificate is found with this name, an error will be returned.
        /// </summary>
        [Input("domain", required: true)]
        public string Domain { get; set; } = null!;

        [Input("keyTypes")]
        private List<string>? _keyTypes;

        /// <summary>
        /// List of key algorithms to filter certificates. By default, ACM does not return all certificate types when searching. See the [ACM API Reference](https://docs.aws.amazon.com/acm/latest/APIReference/API_CertificateDetail.html#ACM-Type-CertificateDetail-KeyAlgorithm) for supported key algorithms.
        /// </summary>
        public List<string> KeyTypes
        {
            get => _keyTypes ?? (_keyTypes = new List<string>());
            set => _keyTypes = value;
        }

        /// <summary>
        /// If set to true, it sorts the certificates matched by previous criteria by the NotBefore field, returning only the most recent one. If set to false, it returns an error if more than one certificate is found. Defaults to false.
        /// </summary>
        [Input("mostRecent")]
        public bool? MostRecent { get; set; }

        [Input("statuses")]
        private List<string>? _statuses;

        /// <summary>
        /// List of statuses on which to filter the returned list. Valid values are `PENDING_VALIDATION`, `ISSUED`,
        /// `INACTIVE`, `EXPIRED`, `VALIDATION_TIMED_OUT`, `REVOKED` and `FAILED`. If no value is specified, only certificates in the `ISSUED` state
        /// are returned.
        /// </summary>
        public List<string> Statuses
        {
            get => _statuses ?? (_statuses = new List<string>());
            set => _statuses = value;
        }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Mapping of tags for the resource.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        [Input("types")]
        private List<string>? _types;

        /// <summary>
        /// List of types on which to filter the returned list. Valid values are `AMAZON_ISSUED`, `PRIVATE`, and `IMPORTED`.
        /// </summary>
        public List<string> Types
        {
            get => _types ?? (_types = new List<string>());
            set => _types = value;
        }

        public GetCertificateArgs()
        {
        }
        public static new GetCertificateArgs Empty => new GetCertificateArgs();
    }

    public sealed class GetCertificateInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Domain of the certificate to look up. If no certificate is found with this name, an error will be returned.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        [Input("keyTypes")]
        private InputList<string>? _keyTypes;

        /// <summary>
        /// List of key algorithms to filter certificates. By default, ACM does not return all certificate types when searching. See the [ACM API Reference](https://docs.aws.amazon.com/acm/latest/APIReference/API_CertificateDetail.html#ACM-Type-CertificateDetail-KeyAlgorithm) for supported key algorithms.
        /// </summary>
        public InputList<string> KeyTypes
        {
            get => _keyTypes ?? (_keyTypes = new InputList<string>());
            set => _keyTypes = value;
        }

        /// <summary>
        /// If set to true, it sorts the certificates matched by previous criteria by the NotBefore field, returning only the most recent one. If set to false, it returns an error if more than one certificate is found. Defaults to false.
        /// </summary>
        [Input("mostRecent")]
        public Input<bool>? MostRecent { get; set; }

        [Input("statuses")]
        private InputList<string>? _statuses;

        /// <summary>
        /// List of statuses on which to filter the returned list. Valid values are `PENDING_VALIDATION`, `ISSUED`,
        /// `INACTIVE`, `EXPIRED`, `VALIDATION_TIMED_OUT`, `REVOKED` and `FAILED`. If no value is specified, only certificates in the `ISSUED` state
        /// are returned.
        /// </summary>
        public InputList<string> Statuses
        {
            get => _statuses ?? (_statuses = new InputList<string>());
            set => _statuses = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Mapping of tags for the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("types")]
        private InputList<string>? _types;

        /// <summary>
        /// List of types on which to filter the returned list. Valid values are `AMAZON_ISSUED`, `PRIVATE`, and `IMPORTED`.
        /// </summary>
        public InputList<string> Types
        {
            get => _types ?? (_types = new InputList<string>());
            set => _types = value;
        }

        public GetCertificateInvokeArgs()
        {
        }
        public static new GetCertificateInvokeArgs Empty => new GetCertificateInvokeArgs();
    }


    [OutputType]
    public sealed class GetCertificateResult
    {
        /// <summary>
        /// ARN of the found certificate, suitable for referencing in other resources that support ACM certificates.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// ACM-issued certificate.
        /// </summary>
        public readonly string Certificate;
        /// <summary>
        /// Certificates forming the requested ACM-issued certificate's chain of trust. The chain consists of the certificate of the issuing CA and the intermediate certificates of any other subordinate CAs.
        /// </summary>
        public readonly string CertificateChain;
        public readonly string Domain;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> KeyTypes;
        public readonly bool? MostRecent;
        /// <summary>
        /// Status of the found certificate.
        /// </summary>
        public readonly string Status;
        public readonly ImmutableArray<string> Statuses;
        /// <summary>
        /// Mapping of tags for the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        public readonly ImmutableArray<string> Types;

        [OutputConstructor]
        private GetCertificateResult(
            string arn,

            string certificate,

            string certificateChain,

            string domain,

            string id,

            ImmutableArray<string> keyTypes,

            bool? mostRecent,

            string status,

            ImmutableArray<string> statuses,

            ImmutableDictionary<string, string> tags,

            ImmutableArray<string> types)
        {
            Arn = arn;
            Certificate = certificate;
            CertificateChain = certificateChain;
            Domain = domain;
            Id = id;
            KeyTypes = keyTypes;
            MostRecent = mostRecent;
            Status = status;
            Statuses = statuses;
            Tags = tags;
            Types = types;
        }
    }
}
