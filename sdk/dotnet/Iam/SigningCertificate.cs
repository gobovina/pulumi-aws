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
    /// Provides an IAM Signing Certificate resource to upload Signing Certificates.
    /// 
    /// &gt; **Note:** All arguments including the certificate body will be stored in the raw state as plain-text.
    /// ## Example Usage
    /// 
    /// **Using certs on file:**
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.IO;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testCert = new Aws.Iam.SigningCertificate("testCert", new()
    ///     {
    ///         Username = "some_test_cert",
    ///         CertificateBody = File.ReadAllText("self-ca-cert.pem"),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// **Example with cert in-line:**
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testCertAlt = new Aws.Iam.SigningCertificate("testCertAlt", new()
    ///     {
    ///         CertificateBody = @"-----BEGIN CERTIFICATE-----
    /// [......] # cert contents
    /// -----END CERTIFICATE-----
    /// 
    /// ",
    ///         Username = "some_test_cert",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import IAM Signing Certificates using the `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:iam/signingCertificate:SigningCertificate certificate IDIDIDIDID:user-name
    /// ```
    /// </summary>
    [AwsResourceType("aws:iam/signingCertificate:SigningCertificate")]
    public partial class SigningCertificate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The contents of the signing certificate in PEM-encoded format.
        /// </summary>
        [Output("certificateBody")]
        public Output<string> CertificateBody { get; private set; } = null!;

        /// <summary>
        /// The ID for the signing certificate.
        /// </summary>
        [Output("certificateId")]
        public Output<string> CertificateId { get; private set; } = null!;

        /// <summary>
        /// The status you want to assign to the certificate. `Active` means that the certificate can be used for programmatic calls to Amazon Web Services `Inactive` means that the certificate cannot be used.
        /// </summary>
        [Output("status")]
        public Output<string?> Status { get; private set; } = null!;

        /// <summary>
        /// The name of the user the signing certificate is for.
        /// </summary>
        [Output("userName")]
        public Output<string> UserName { get; private set; } = null!;


        /// <summary>
        /// Create a SigningCertificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SigningCertificate(string name, SigningCertificateArgs args, CustomResourceOptions? options = null)
            : base("aws:iam/signingCertificate:SigningCertificate", name, args ?? new SigningCertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SigningCertificate(string name, Input<string> id, SigningCertificateState? state = null, CustomResourceOptions? options = null)
            : base("aws:iam/signingCertificate:SigningCertificate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SigningCertificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SigningCertificate Get(string name, Input<string> id, SigningCertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new SigningCertificate(name, id, state, options);
        }
    }

    public sealed class SigningCertificateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The contents of the signing certificate in PEM-encoded format.
        /// </summary>
        [Input("certificateBody", required: true)]
        public Input<string> CertificateBody { get; set; } = null!;

        /// <summary>
        /// The status you want to assign to the certificate. `Active` means that the certificate can be used for programmatic calls to Amazon Web Services `Inactive` means that the certificate cannot be used.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The name of the user the signing certificate is for.
        /// </summary>
        [Input("userName", required: true)]
        public Input<string> UserName { get; set; } = null!;

        public SigningCertificateArgs()
        {
        }
        public static new SigningCertificateArgs Empty => new SigningCertificateArgs();
    }

    public sealed class SigningCertificateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The contents of the signing certificate in PEM-encoded format.
        /// </summary>
        [Input("certificateBody")]
        public Input<string>? CertificateBody { get; set; }

        /// <summary>
        /// The ID for the signing certificate.
        /// </summary>
        [Input("certificateId")]
        public Input<string>? CertificateId { get; set; }

        /// <summary>
        /// The status you want to assign to the certificate. `Active` means that the certificate can be used for programmatic calls to Amazon Web Services `Inactive` means that the certificate cannot be used.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The name of the user the signing certificate is for.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public SigningCertificateState()
        {
        }
        public static new SigningCertificateState Empty => new SigningCertificateState();
    }
}
