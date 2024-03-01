// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppSync
{
    /// <summary>
    /// Provides an AppSync Domain Name.
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
    ///     var example = new Aws.AppSync.DomainName("example", new()
    ///     {
    ///         Name = "api.example.com",
    ///         CertificateArn = exampleAwsAcmCertificate.Arn,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_appsync_domain_name` using the AppSync domain name. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:appsync/domainName:DomainName example example.com
    /// ```
    /// </summary>
    [AwsResourceType("aws:appsync/domainName:DomainName")]
    public partial class DomainName : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Domain name that AppSync provides.
        /// </summary>
        [Output("appsyncDomainName")]
        public Output<string> AppsyncDomainName { get; private set; } = null!;

        /// <summary>
        /// ARN of the certificate. This can be an Certificate Manager (ACM) certificate or an Identity and Access Management (IAM) server certificate. The certifiacte must reside in us-east-1.
        /// </summary>
        [Output("certificateArn")]
        public Output<string> CertificateArn { get; private set; } = null!;

        /// <summary>
        /// A description of the Domain Name.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Domain name.
        /// </summary>
        [Output("domainName")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// ID of your Amazon Route 53 hosted zone.
        /// </summary>
        [Output("hostedZoneId")]
        public Output<string> HostedZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a DomainName resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DomainName(string name, DomainNameArgs args, CustomResourceOptions? options = null)
            : base("aws:appsync/domainName:DomainName", name, args ?? new DomainNameArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DomainName(string name, Input<string> id, DomainNameState? state = null, CustomResourceOptions? options = null)
            : base("aws:appsync/domainName:DomainName", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DomainName resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DomainName Get(string name, Input<string> id, DomainNameState? state = null, CustomResourceOptions? options = null)
        {
            return new DomainName(name, id, state, options);
        }
    }

    public sealed class DomainNameArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the certificate. This can be an Certificate Manager (ACM) certificate or an Identity and Access Management (IAM) server certificate. The certifiacte must reside in us-east-1.
        /// </summary>
        [Input("certificateArn", required: true)]
        public Input<string> CertificateArn { get; set; } = null!;

        /// <summary>
        /// A description of the Domain Name.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Domain name.
        /// </summary>
        [Input("domainName", required: true)]
        public Input<string> Name { get; set; } = null!;

        public DomainNameArgs()
        {
        }
        public static new DomainNameArgs Empty => new DomainNameArgs();
    }

    public sealed class DomainNameState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Domain name that AppSync provides.
        /// </summary>
        [Input("appsyncDomainName")]
        public Input<string>? AppsyncDomainName { get; set; }

        /// <summary>
        /// ARN of the certificate. This can be an Certificate Manager (ACM) certificate or an Identity and Access Management (IAM) server certificate. The certifiacte must reside in us-east-1.
        /// </summary>
        [Input("certificateArn")]
        public Input<string>? CertificateArn { get; set; }

        /// <summary>
        /// A description of the Domain Name.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Domain name.
        /// </summary>
        [Input("domainName")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of your Amazon Route 53 hosted zone.
        /// </summary>
        [Input("hostedZoneId")]
        public Input<string>? HostedZoneId { get; set; }

        public DomainNameState()
        {
        }
        public static new DomainNameState Empty => new DomainNameState();
    }
}
