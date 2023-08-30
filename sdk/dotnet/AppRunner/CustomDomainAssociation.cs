// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppRunner
{
    /// <summary>
    /// Manages an App Runner Custom Domain association.
    /// 
    /// &gt; **NOTE:** After creation, you must use the information in the `certification_validation_records` attribute to add CNAME records to your Domain Name System (DNS). For each mapped domain name, add a mapping to the target App Runner subdomain (found in the `dns_target` attribute) and one or more certificate validation records. App Runner then performs DNS validation to verify that you own or control the domain name you associated. App Runner tracks domain validity in a certificate stored in AWS Certificate Manager (ACM).
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
    ///     var example = new Aws.AppRunner.CustomDomainAssociation("example", new()
    ///     {
    ///         DomainName = "example.com",
    ///         ServiceArn = aws_apprunner_service.Example.Arn,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import App Runner Custom Domain Associations using the `domain_name` and `service_arn` separated by a comma (`,`). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:apprunner/customDomainAssociation:CustomDomainAssociation example example.com,arn:aws:apprunner:us-east-1:123456789012:service/example-app/8fe1e10304f84fd2b0df550fe98a71fa
    /// ```
    /// </summary>
    [AwsResourceType("aws:apprunner/customDomainAssociation:CustomDomainAssociation")]
    public partial class CustomDomainAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A set of certificate CNAME records used for this domain name. See Certificate Validation Records below for more details.
        /// </summary>
        [Output("certificateValidationRecords")]
        public Output<ImmutableArray<Outputs.CustomDomainAssociationCertificateValidationRecord>> CertificateValidationRecords { get; private set; } = null!;

        /// <summary>
        /// App Runner subdomain of the App Runner service. The custom domain name is mapped to this target name. Attribute only available if resource created (not imported) with this provider.
        /// </summary>
        [Output("dnsTarget")]
        public Output<string> DnsTarget { get; private set; } = null!;

        /// <summary>
        /// Custom domain endpoint to association. Specify a base domain e.g., `example.com` or a subdomain e.g., `subdomain.example.com`.
        /// </summary>
        [Output("domainName")]
        public Output<string> DomainName { get; private set; } = null!;

        /// <summary>
        /// Whether to associate the subdomain with the App Runner service in addition to the base domain. Defaults to `true`.
        /// </summary>
        [Output("enableWwwSubdomain")]
        public Output<bool?> EnableWwwSubdomain { get; private set; } = null!;

        /// <summary>
        /// ARN of the App Runner service.
        /// </summary>
        [Output("serviceArn")]
        public Output<string> ServiceArn { get; private set; } = null!;

        /// <summary>
        /// Current state of the certificate CNAME record validation. It should change to `SUCCESS` after App Runner completes validation with your DNS.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a CustomDomainAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomDomainAssociation(string name, CustomDomainAssociationArgs args, CustomResourceOptions? options = null)
            : base("aws:apprunner/customDomainAssociation:CustomDomainAssociation", name, args ?? new CustomDomainAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomDomainAssociation(string name, Input<string> id, CustomDomainAssociationState? state = null, CustomResourceOptions? options = null)
            : base("aws:apprunner/customDomainAssociation:CustomDomainAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomDomainAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomDomainAssociation Get(string name, Input<string> id, CustomDomainAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomDomainAssociation(name, id, state, options);
        }
    }

    public sealed class CustomDomainAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Custom domain endpoint to association. Specify a base domain e.g., `example.com` or a subdomain e.g., `subdomain.example.com`.
        /// </summary>
        [Input("domainName", required: true)]
        public Input<string> DomainName { get; set; } = null!;

        /// <summary>
        /// Whether to associate the subdomain with the App Runner service in addition to the base domain. Defaults to `true`.
        /// </summary>
        [Input("enableWwwSubdomain")]
        public Input<bool>? EnableWwwSubdomain { get; set; }

        /// <summary>
        /// ARN of the App Runner service.
        /// </summary>
        [Input("serviceArn", required: true)]
        public Input<string> ServiceArn { get; set; } = null!;

        public CustomDomainAssociationArgs()
        {
        }
        public static new CustomDomainAssociationArgs Empty => new CustomDomainAssociationArgs();
    }

    public sealed class CustomDomainAssociationState : global::Pulumi.ResourceArgs
    {
        [Input("certificateValidationRecords")]
        private InputList<Inputs.CustomDomainAssociationCertificateValidationRecordGetArgs>? _certificateValidationRecords;

        /// <summary>
        /// A set of certificate CNAME records used for this domain name. See Certificate Validation Records below for more details.
        /// </summary>
        public InputList<Inputs.CustomDomainAssociationCertificateValidationRecordGetArgs> CertificateValidationRecords
        {
            get => _certificateValidationRecords ?? (_certificateValidationRecords = new InputList<Inputs.CustomDomainAssociationCertificateValidationRecordGetArgs>());
            set => _certificateValidationRecords = value;
        }

        /// <summary>
        /// App Runner subdomain of the App Runner service. The custom domain name is mapped to this target name. Attribute only available if resource created (not imported) with this provider.
        /// </summary>
        [Input("dnsTarget")]
        public Input<string>? DnsTarget { get; set; }

        /// <summary>
        /// Custom domain endpoint to association. Specify a base domain e.g., `example.com` or a subdomain e.g., `subdomain.example.com`.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        /// <summary>
        /// Whether to associate the subdomain with the App Runner service in addition to the base domain. Defaults to `true`.
        /// </summary>
        [Input("enableWwwSubdomain")]
        public Input<bool>? EnableWwwSubdomain { get; set; }

        /// <summary>
        /// ARN of the App Runner service.
        /// </summary>
        [Input("serviceArn")]
        public Input<string>? ServiceArn { get; set; }

        /// <summary>
        /// Current state of the certificate CNAME record validation. It should change to `SUCCESS` after App Runner completes validation with your DNS.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public CustomDomainAssociationState()
        {
        }
        public static new CustomDomainAssociationState Empty => new CustomDomainAssociationState();
    }
}
