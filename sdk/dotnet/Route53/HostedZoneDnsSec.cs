// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Route53
{
    /// <summary>
    /// Manages Route 53 Hosted Zone Domain Name System Security Extensions (DNSSEC). For more information about managing DNSSEC in Route 53, see the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec.html).
    /// 
    /// !&gt; **WARNING:** If you disable DNSSEC signing for your hosted zone before the DNS changes have propagated, your domain could become unavailable on the internet. When you remove the DS records, you must wait until the longest TTL for the DS records that you remove has expired before you complete the step to disable DNSSEC signing. Please refer to the [Route 53 Developer Guide - Disable DNSSEC](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-disable.html) for a detailed breakdown on the steps required to disable DNSSEC safely for a hosted zone.
    /// 
    /// &gt; **Note:** Route53 hosted zones are global resources, and as such any `aws.kms.Key` that you use as part of a signing key needs to be located in the `us-east-1` region. In the example below, the main AWS provider declaration is for `us-east-1`, however if you are provisioning your AWS resources in a different region, you will need to specify a provider alias and use that attached to the `aws.kms.Key` resource as described in the provider alias documentation.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var current = Aws.GetCallerIdentity.Invoke();
    /// 
    ///     var example = new Aws.Kms.Key("example", new()
    ///     {
    ///         CustomerMasterKeySpec = "ECC_NIST_P256",
    ///         DeletionWindowInDays = 7,
    ///         KeyUsage = "SIGN_VERIFY",
    ///         Policy = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["statement"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["action"] = new[]
    ///                     {
    ///                         "kms:DescribeKey",
    ///                         "kms:GetPublicKey",
    ///                         "kms:Sign",
    ///                         "kms:Verify",
    ///                     },
    ///                     ["effect"] = "Allow",
    ///                     ["principal"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["service"] = "dnssec-route53.amazonaws.com",
    ///                     },
    ///                     ["resource"] = "*",
    ///                     ["sid"] = "Allow Route 53 DNSSEC Service",
    ///                 },
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["action"] = "kms:*",
    ///                     ["effect"] = "Allow",
    ///                     ["principal"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["AWS"] = $"arn:aws:iam::{current.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.AccountId)}:root",
    ///                     },
    ///                     ["resource"] = "*",
    ///                     ["sid"] = "Enable IAM User Permissions",
    ///                 },
    ///             },
    ///             ["version"] = "2012-10-17",
    ///         }),
    ///     });
    /// 
    ///     var exampleZone = new Aws.Route53.Zone("example", new()
    ///     {
    ///         Name = "example.com",
    ///     });
    /// 
    ///     var exampleKeySigningKey = new Aws.Route53.KeySigningKey("example", new()
    ///     {
    ///         HostedZoneId = exampleZone.Id,
    ///         KeyManagementServiceArn = example.Arn,
    ///         Name = "example",
    ///     });
    /// 
    ///     var exampleHostedZoneDnsSec = new Aws.Route53.HostedZoneDnsSec("example", new()
    ///     {
    ///         HostedZoneId = exampleKeySigningKey.HostedZoneId,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_route53_hosted_zone_dnssec` resources using the Route 53 Hosted Zone identifier. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:route53/hostedZoneDnsSec:HostedZoneDnsSec example Z1D633PJN98FT9
    /// ```
    /// </summary>
    [AwsResourceType("aws:route53/hostedZoneDnsSec:HostedZoneDnsSec")]
    public partial class HostedZoneDnsSec : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Identifier of the Route 53 Hosted Zone.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("hostedZoneId")]
        public Output<string> HostedZoneId { get; private set; } = null!;

        /// <summary>
        /// Hosted Zone signing status. Valid values: `SIGNING`, `NOT_SIGNING`. Defaults to `SIGNING`.
        /// </summary>
        [Output("signingStatus")]
        public Output<string?> SigningStatus { get; private set; } = null!;


        /// <summary>
        /// Create a HostedZoneDnsSec resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HostedZoneDnsSec(string name, HostedZoneDnsSecArgs args, CustomResourceOptions? options = null)
            : base("aws:route53/hostedZoneDnsSec:HostedZoneDnsSec", name, args ?? new HostedZoneDnsSecArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HostedZoneDnsSec(string name, Input<string> id, HostedZoneDnsSecState? state = null, CustomResourceOptions? options = null)
            : base("aws:route53/hostedZoneDnsSec:HostedZoneDnsSec", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing HostedZoneDnsSec resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HostedZoneDnsSec Get(string name, Input<string> id, HostedZoneDnsSecState? state = null, CustomResourceOptions? options = null)
        {
            return new HostedZoneDnsSec(name, id, state, options);
        }
    }

    public sealed class HostedZoneDnsSecArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier of the Route 53 Hosted Zone.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("hostedZoneId", required: true)]
        public Input<string> HostedZoneId { get; set; } = null!;

        /// <summary>
        /// Hosted Zone signing status. Valid values: `SIGNING`, `NOT_SIGNING`. Defaults to `SIGNING`.
        /// </summary>
        [Input("signingStatus")]
        public Input<string>? SigningStatus { get; set; }

        public HostedZoneDnsSecArgs()
        {
        }
        public static new HostedZoneDnsSecArgs Empty => new HostedZoneDnsSecArgs();
    }

    public sealed class HostedZoneDnsSecState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier of the Route 53 Hosted Zone.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("hostedZoneId")]
        public Input<string>? HostedZoneId { get; set; }

        /// <summary>
        /// Hosted Zone signing status. Valid values: `SIGNING`, `NOT_SIGNING`. Defaults to `SIGNING`.
        /// </summary>
        [Input("signingStatus")]
        public Input<string>? SigningStatus { get; set; }

        public HostedZoneDnsSecState()
        {
        }
        public static new HostedZoneDnsSecState Empty => new HostedZoneDnsSecState();
    }
}
