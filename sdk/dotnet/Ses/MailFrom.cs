// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ses
{
    /// <summary>
    /// Provides an SES domain MAIL FROM resource.
    /// 
    /// &gt; **NOTE:** For the MAIL FROM domain to be fully usable, this resource should be paired with the aws.ses.DomainIdentity resource. To validate the MAIL FROM domain, a DNS MX record is required. To pass SPF checks, a DNS TXT record may also be required. See the [Amazon SES MAIL FROM documentation](https://docs.aws.amazon.com/ses/latest/dg/mail-from.html) for more information.
    /// 
    /// ## Example Usage
    /// ### Domain Identity MAIL FROM
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Example SES Domain Identity
    ///     var exampleDomainIdentity = new Aws.Ses.DomainIdentity("example", new()
    ///     {
    ///         Domain = "example.com",
    ///     });
    /// 
    ///     var example = new Aws.Ses.MailFrom("example", new()
    ///     {
    ///         Domain = exampleDomainIdentity.Domain,
    ///         MailFromDomain = exampleDomainIdentity.Domain.Apply(domain =&gt; $"bounce.{domain}"),
    ///     });
    /// 
    ///     // Example Route53 MX record
    ///     var exampleSesDomainMailFromMx = new Aws.Route53.Record("example_ses_domain_mail_from_mx", new()
    ///     {
    ///         ZoneId = exampleAwsRoute53Zone.Id,
    ///         Name = example.MailFromDomain,
    ///         Type = "MX",
    ///         Ttl = 600,
    ///         Records = new[]
    ///         {
    ///             "10 feedback-smtp.us-east-1.amazonses.com",
    ///         },
    ///     });
    /// 
    ///     // Example Route53 TXT record for SPF
    ///     var exampleSesDomainMailFromTxt = new Aws.Route53.Record("example_ses_domain_mail_from_txt", new()
    ///     {
    ///         ZoneId = exampleAwsRoute53Zone.Id,
    ///         Name = example.MailFromDomain,
    ///         Type = "TXT",
    ///         Ttl = 600,
    ///         Records = new[]
    ///         {
    ///             "v=spf1 include:amazonses.com -all",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Email Identity MAIL FROM
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Example SES Email Identity
    ///     var example = new Aws.Ses.EmailIdentity("example", new()
    ///     {
    ///         Email = "user@example.com",
    ///     });
    /// 
    ///     var exampleMailFrom = new Aws.Ses.MailFrom("example", new()
    ///     {
    ///         Domain = example.Email,
    ///         MailFromDomain = "mail.example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import MAIL FROM domain using the `domain` attribute. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ses/mailFrom:MailFrom example example.com
    /// ```
    /// </summary>
    [AwsResourceType("aws:ses/mailFrom:MailFrom")]
    public partial class MailFrom : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
        /// </summary>
        [Output("behaviorOnMxFailure")]
        public Output<string?> BehaviorOnMxFailure { get; private set; } = null!;

        /// <summary>
        /// Verified domain name or email identity to generate DKIM tokens for.
        /// </summary>
        [Output("domain")]
        public Output<string> Domain { get; private set; } = null!;

        /// <summary>
        /// Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("mailFromDomain")]
        public Output<string> MailFromDomain { get; private set; } = null!;


        /// <summary>
        /// Create a MailFrom resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MailFrom(string name, MailFromArgs args, CustomResourceOptions? options = null)
            : base("aws:ses/mailFrom:MailFrom", name, args ?? new MailFromArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MailFrom(string name, Input<string> id, MailFromState? state = null, CustomResourceOptions? options = null)
            : base("aws:ses/mailFrom:MailFrom", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MailFrom resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MailFrom Get(string name, Input<string> id, MailFromState? state = null, CustomResourceOptions? options = null)
        {
            return new MailFrom(name, id, state, options);
        }
    }

    public sealed class MailFromArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
        /// </summary>
        [Input("behaviorOnMxFailure")]
        public Input<string>? BehaviorOnMxFailure { get; set; }

        /// <summary>
        /// Verified domain name or email identity to generate DKIM tokens for.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        /// <summary>
        /// Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("mailFromDomain", required: true)]
        public Input<string> MailFromDomain { get; set; } = null!;

        public MailFromArgs()
        {
        }
        public static new MailFromArgs Empty => new MailFromArgs();
    }

    public sealed class MailFromState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
        /// </summary>
        [Input("behaviorOnMxFailure")]
        public Input<string>? BehaviorOnMxFailure { get; set; }

        /// <summary>
        /// Verified domain name or email identity to generate DKIM tokens for.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("mailFromDomain")]
        public Input<string>? MailFromDomain { get; set; }

        public MailFromState()
        {
        }
        public static new MailFromState Empty => new MailFromState();
    }
}
