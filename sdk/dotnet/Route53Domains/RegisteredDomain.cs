// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Route53Domains
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Aws.Route53Domains.RegisteredDomain("example", new Aws.Route53Domains.RegisteredDomainArgs
    ///         {
    ///             DomainName = "example.com",
    ///             NameServers = 
    ///             {
    ///                 new Aws.Route53Domains.Inputs.RegisteredDomainNameServerArgs
    ///                 {
    ///                     Name = "ns-195.awsdns-24.com",
    ///                 },
    ///                 new Aws.Route53Domains.Inputs.RegisteredDomainNameServerArgs
    ///                 {
    ///                     Name = "ns-874.awsdns-45.net",
    ///                 },
    ///             },
    ///             Tags = 
    ///             {
    ///                 { "Environment", "test" },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [AwsResourceType("aws:route53domains/registeredDomain:RegisteredDomain")]
    public partial class RegisteredDomain : Pulumi.CustomResource
    {
        /// <summary>
        /// Email address to contact to report incorrect contact information for a domain, to report that the domain is being used to send spam, to report that someone is cybersquatting on a domain name, or report some other type of abuse.
        /// </summary>
        [Output("abuseContactEmail")]
        public Output<string> AbuseContactEmail { get; private set; } = null!;

        /// <summary>
        /// Phone number for reporting abuse.
        /// </summary>
        [Output("abuseContactPhone")]
        public Output<string> AbuseContactPhone { get; private set; } = null!;

        /// <summary>
        /// Details about the domain administrative contact.
        /// </summary>
        [Output("adminContact")]
        public Output<Outputs.RegisteredDomainAdminContact> AdminContact { get; private set; } = null!;

        /// <summary>
        /// Whether domain administrative contact information is concealed from WHOIS queries. Default: `true`.
        /// </summary>
        [Output("adminPrivacy")]
        public Output<bool?> AdminPrivacy { get; private set; } = null!;

        /// <summary>
        /// Whether the domain registration is set to renew automatically. Default: `true`.
        /// </summary>
        [Output("autoRenew")]
        public Output<bool?> AutoRenew { get; private set; } = null!;

        /// <summary>
        /// The date when the domain was created as found in the response to a WHOIS query.
        /// </summary>
        [Output("creationDate")]
        public Output<string> CreationDate { get; private set; } = null!;

        /// <summary>
        /// The name of the registered domain.
        /// </summary>
        [Output("domainName")]
        public Output<string> DomainName { get; private set; } = null!;

        /// <summary>
        /// The date when the registration for the domain is set to expire.
        /// </summary>
        [Output("expirationDate")]
        public Output<string> ExpirationDate { get; private set; } = null!;

        /// <summary>
        /// The list of nameservers for the domain.
        /// </summary>
        [Output("nameServers")]
        public Output<ImmutableArray<Outputs.RegisteredDomainNameServer>> NameServers { get; private set; } = null!;

        /// <summary>
        /// Details about the domain registrant.
        /// </summary>
        [Output("registrantContact")]
        public Output<Outputs.RegisteredDomainRegistrantContact> RegistrantContact { get; private set; } = null!;

        /// <summary>
        /// Whether domain registrant contact information is concealed from WHOIS queries. Default: `true`.
        /// </summary>
        [Output("registrantPrivacy")]
        public Output<bool?> RegistrantPrivacy { get; private set; } = null!;

        /// <summary>
        /// Name of the registrar of the domain as identified in the registry.
        /// </summary>
        [Output("registrarName")]
        public Output<string> RegistrarName { get; private set; } = null!;

        /// <summary>
        /// Web address of the registrar.
        /// </summary>
        [Output("registrarUrl")]
        public Output<string> RegistrarUrl { get; private set; } = null!;

        /// <summary>
        /// Reseller of the domain.
        /// </summary>
        [Output("reseller")]
        public Output<string> Reseller { get; private set; } = null!;

        /// <summary>
        /// List of [domain name status codes](https://www.icann.org/resources/pages/epp-status-codes-2014-06-16-en).
        /// </summary>
        [Output("statusLists")]
        public Output<ImmutableArray<string>> StatusLists { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Details about the domain technical contact.
        /// </summary>
        [Output("techContact")]
        public Output<Outputs.RegisteredDomainTechContact> TechContact { get; private set; } = null!;

        /// <summary>
        /// Whether domain technical contact information is concealed from WHOIS queries. Default: `true`.
        /// </summary>
        [Output("techPrivacy")]
        public Output<bool?> TechPrivacy { get; private set; } = null!;

        /// <summary>
        /// Whether the domain is locked for transfer. Default: `true`.
        /// </summary>
        [Output("transferLock")]
        public Output<bool?> TransferLock { get; private set; } = null!;

        /// <summary>
        /// The last updated date of the domain as found in the response to a WHOIS query.
        /// </summary>
        [Output("updatedDate")]
        public Output<string> UpdatedDate { get; private set; } = null!;

        /// <summary>
        /// The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.
        /// </summary>
        [Output("whoisServer")]
        public Output<string> WhoisServer { get; private set; } = null!;


        /// <summary>
        /// Create a RegisteredDomain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RegisteredDomain(string name, RegisteredDomainArgs args, CustomResourceOptions? options = null)
            : base("aws:route53domains/registeredDomain:RegisteredDomain", name, args ?? new RegisteredDomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RegisteredDomain(string name, Input<string> id, RegisteredDomainState? state = null, CustomResourceOptions? options = null)
            : base("aws:route53domains/registeredDomain:RegisteredDomain", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RegisteredDomain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RegisteredDomain Get(string name, Input<string> id, RegisteredDomainState? state = null, CustomResourceOptions? options = null)
        {
            return new RegisteredDomain(name, id, state, options);
        }
    }

    public sealed class RegisteredDomainArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Details about the domain administrative contact.
        /// </summary>
        [Input("adminContact")]
        public Input<Inputs.RegisteredDomainAdminContactArgs>? AdminContact { get; set; }

        /// <summary>
        /// Whether domain administrative contact information is concealed from WHOIS queries. Default: `true`.
        /// </summary>
        [Input("adminPrivacy")]
        public Input<bool>? AdminPrivacy { get; set; }

        /// <summary>
        /// Whether the domain registration is set to renew automatically. Default: `true`.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        /// <summary>
        /// The name of the registered domain.
        /// </summary>
        [Input("domainName", required: true)]
        public Input<string> DomainName { get; set; } = null!;

        [Input("nameServers")]
        private InputList<Inputs.RegisteredDomainNameServerArgs>? _nameServers;

        /// <summary>
        /// The list of nameservers for the domain.
        /// </summary>
        public InputList<Inputs.RegisteredDomainNameServerArgs> NameServers
        {
            get => _nameServers ?? (_nameServers = new InputList<Inputs.RegisteredDomainNameServerArgs>());
            set => _nameServers = value;
        }

        /// <summary>
        /// Details about the domain registrant.
        /// </summary>
        [Input("registrantContact")]
        public Input<Inputs.RegisteredDomainRegistrantContactArgs>? RegistrantContact { get; set; }

        /// <summary>
        /// Whether domain registrant contact information is concealed from WHOIS queries. Default: `true`.
        /// </summary>
        [Input("registrantPrivacy")]
        public Input<bool>? RegistrantPrivacy { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Details about the domain technical contact.
        /// </summary>
        [Input("techContact")]
        public Input<Inputs.RegisteredDomainTechContactArgs>? TechContact { get; set; }

        /// <summary>
        /// Whether domain technical contact information is concealed from WHOIS queries. Default: `true`.
        /// </summary>
        [Input("techPrivacy")]
        public Input<bool>? TechPrivacy { get; set; }

        /// <summary>
        /// Whether the domain is locked for transfer. Default: `true`.
        /// </summary>
        [Input("transferLock")]
        public Input<bool>? TransferLock { get; set; }

        public RegisteredDomainArgs()
        {
        }
    }

    public sealed class RegisteredDomainState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Email address to contact to report incorrect contact information for a domain, to report that the domain is being used to send spam, to report that someone is cybersquatting on a domain name, or report some other type of abuse.
        /// </summary>
        [Input("abuseContactEmail")]
        public Input<string>? AbuseContactEmail { get; set; }

        /// <summary>
        /// Phone number for reporting abuse.
        /// </summary>
        [Input("abuseContactPhone")]
        public Input<string>? AbuseContactPhone { get; set; }

        /// <summary>
        /// Details about the domain administrative contact.
        /// </summary>
        [Input("adminContact")]
        public Input<Inputs.RegisteredDomainAdminContactGetArgs>? AdminContact { get; set; }

        /// <summary>
        /// Whether domain administrative contact information is concealed from WHOIS queries. Default: `true`.
        /// </summary>
        [Input("adminPrivacy")]
        public Input<bool>? AdminPrivacy { get; set; }

        /// <summary>
        /// Whether the domain registration is set to renew automatically. Default: `true`.
        /// </summary>
        [Input("autoRenew")]
        public Input<bool>? AutoRenew { get; set; }

        /// <summary>
        /// The date when the domain was created as found in the response to a WHOIS query.
        /// </summary>
        [Input("creationDate")]
        public Input<string>? CreationDate { get; set; }

        /// <summary>
        /// The name of the registered domain.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        /// <summary>
        /// The date when the registration for the domain is set to expire.
        /// </summary>
        [Input("expirationDate")]
        public Input<string>? ExpirationDate { get; set; }

        [Input("nameServers")]
        private InputList<Inputs.RegisteredDomainNameServerGetArgs>? _nameServers;

        /// <summary>
        /// The list of nameservers for the domain.
        /// </summary>
        public InputList<Inputs.RegisteredDomainNameServerGetArgs> NameServers
        {
            get => _nameServers ?? (_nameServers = new InputList<Inputs.RegisteredDomainNameServerGetArgs>());
            set => _nameServers = value;
        }

        /// <summary>
        /// Details about the domain registrant.
        /// </summary>
        [Input("registrantContact")]
        public Input<Inputs.RegisteredDomainRegistrantContactGetArgs>? RegistrantContact { get; set; }

        /// <summary>
        /// Whether domain registrant contact information is concealed from WHOIS queries. Default: `true`.
        /// </summary>
        [Input("registrantPrivacy")]
        public Input<bool>? RegistrantPrivacy { get; set; }

        /// <summary>
        /// Name of the registrar of the domain as identified in the registry.
        /// </summary>
        [Input("registrarName")]
        public Input<string>? RegistrarName { get; set; }

        /// <summary>
        /// Web address of the registrar.
        /// </summary>
        [Input("registrarUrl")]
        public Input<string>? RegistrarUrl { get; set; }

        /// <summary>
        /// Reseller of the domain.
        /// </summary>
        [Input("reseller")]
        public Input<string>? Reseller { get; set; }

        [Input("statusLists")]
        private InputList<string>? _statusLists;

        /// <summary>
        /// List of [domain name status codes](https://www.icann.org/resources/pages/epp-status-codes-2014-06-16-en).
        /// </summary>
        public InputList<string> StatusLists
        {
            get => _statusLists ?? (_statusLists = new InputList<string>());
            set => _statusLists = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Details about the domain technical contact.
        /// </summary>
        [Input("techContact")]
        public Input<Inputs.RegisteredDomainTechContactGetArgs>? TechContact { get; set; }

        /// <summary>
        /// Whether domain technical contact information is concealed from WHOIS queries. Default: `true`.
        /// </summary>
        [Input("techPrivacy")]
        public Input<bool>? TechPrivacy { get; set; }

        /// <summary>
        /// Whether the domain is locked for transfer. Default: `true`.
        /// </summary>
        [Input("transferLock")]
        public Input<bool>? TransferLock { get; set; }

        /// <summary>
        /// The last updated date of the domain as found in the response to a WHOIS query.
        /// </summary>
        [Input("updatedDate")]
        public Input<string>? UpdatedDate { get; set; }

        /// <summary>
        /// The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.
        /// </summary>
        [Input("whoisServer")]
        public Input<string>? WhoisServer { get; set; }

        public RegisteredDomainState()
        {
        }
    }
}
