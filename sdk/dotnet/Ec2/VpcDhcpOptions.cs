// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    /// <summary>
    /// Provides a VPC DHCP Options resource.
    /// 
    /// ## Example Usage
    /// 
    /// Basic usage:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var dnsResolver = new Aws.Ec2.VpcDhcpOptions("dns_resolver", new()
    ///     {
    ///         DomainNameServers = new[]
    ///         {
    ///             "8.8.8.8",
    ///             "8.8.4.4",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Full usage:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new Aws.Ec2.VpcDhcpOptions("foo", new()
    ///     {
    ///         DomainName = "service.consul",
    ///         DomainNameServers = new[]
    ///         {
    ///             "127.0.0.1",
    ///             "10.0.0.2",
    ///         },
    ///         NtpServers = new[]
    ///         {
    ///             "127.0.0.1",
    ///         },
    ///         NetbiosNameServers = new[]
    ///         {
    ///             "127.0.0.1",
    ///         },
    ///         NetbiosNodeType = "2",
    ///         Tags = 
    ///         {
    ///             { "Name", "foo-name" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## Remarks
    /// 
    /// * Notice that all arguments are optional but you have to specify at least one argument.
    /// * `domain_name_servers`, `netbios_name_servers`, `ntp_servers` are limited by AWS to maximum four servers only.
    /// * To actually use the DHCP Options Set you need to associate it to a VPC using `aws.ec2.VpcDhcpOptionsAssociation`.
    /// * If you delete a DHCP Options Set, all VPCs using it will be associated to AWS's `default` DHCP Option Set.
    /// * In most cases unless you're configuring your own DNS you'll want to set `domain_name_servers` to `AmazonProvidedDNS`.
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import VPC DHCP Options using the DHCP Options `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ec2/vpcDhcpOptions:VpcDhcpOptions my_options dopt-d9070ebb
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2/vpcDhcpOptions:VpcDhcpOptions")]
    public partial class VpcDhcpOptions : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the DHCP Options Set.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
        /// </summary>
        [Output("domainName")]
        public Output<string?> DomainName { get; private set; } = null!;

        /// <summary>
        /// List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
        /// </summary>
        [Output("domainNameServers")]
        public Output<ImmutableArray<string>> DomainNameServers { get; private set; } = null!;

        /// <summary>
        /// List of NETBIOS name servers.
        /// </summary>
        [Output("netbiosNameServers")]
        public Output<ImmutableArray<string>> NetbiosNameServers { get; private set; } = null!;

        /// <summary>
        /// The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
        /// </summary>
        [Output("netbiosNodeType")]
        public Output<string?> NetbiosNodeType { get; private set; } = null!;

        /// <summary>
        /// List of NTP servers to configure.
        /// </summary>
        [Output("ntpServers")]
        public Output<ImmutableArray<string>> NtpServers { get; private set; } = null!;

        /// <summary>
        /// The ID of the AWS account that owns the DHCP options set.
        /// </summary>
        [Output("ownerId")]
        public Output<string> OwnerId { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a VpcDhcpOptions resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcDhcpOptions(string name, VpcDhcpOptionsArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcDhcpOptions:VpcDhcpOptions", name, args ?? new VpcDhcpOptionsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcDhcpOptions(string name, Input<string> id, VpcDhcpOptionsState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcDhcpOptions:VpcDhcpOptions", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpcDhcpOptions resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcDhcpOptions Get(string name, Input<string> id, VpcDhcpOptionsState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcDhcpOptions(name, id, state, options);
        }
    }

    public sealed class VpcDhcpOptionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        [Input("domainNameServers")]
        private InputList<string>? _domainNameServers;

        /// <summary>
        /// List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
        /// </summary>
        public InputList<string> DomainNameServers
        {
            get => _domainNameServers ?? (_domainNameServers = new InputList<string>());
            set => _domainNameServers = value;
        }

        [Input("netbiosNameServers")]
        private InputList<string>? _netbiosNameServers;

        /// <summary>
        /// List of NETBIOS name servers.
        /// </summary>
        public InputList<string> NetbiosNameServers
        {
            get => _netbiosNameServers ?? (_netbiosNameServers = new InputList<string>());
            set => _netbiosNameServers = value;
        }

        /// <summary>
        /// The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
        /// </summary>
        [Input("netbiosNodeType")]
        public Input<string>? NetbiosNodeType { get; set; }

        [Input("ntpServers")]
        private InputList<string>? _ntpServers;

        /// <summary>
        /// List of NTP servers to configure.
        /// </summary>
        public InputList<string> NtpServers
        {
            get => _ntpServers ?? (_ntpServers = new InputList<string>());
            set => _ntpServers = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public VpcDhcpOptionsArgs()
        {
        }
        public static new VpcDhcpOptionsArgs Empty => new VpcDhcpOptionsArgs();
    }

    public sealed class VpcDhcpOptionsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the DHCP Options Set.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        [Input("domainNameServers")]
        private InputList<string>? _domainNameServers;

        /// <summary>
        /// List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
        /// </summary>
        public InputList<string> DomainNameServers
        {
            get => _domainNameServers ?? (_domainNameServers = new InputList<string>());
            set => _domainNameServers = value;
        }

        [Input("netbiosNameServers")]
        private InputList<string>? _netbiosNameServers;

        /// <summary>
        /// List of NETBIOS name servers.
        /// </summary>
        public InputList<string> NetbiosNameServers
        {
            get => _netbiosNameServers ?? (_netbiosNameServers = new InputList<string>());
            set => _netbiosNameServers = value;
        }

        /// <summary>
        /// The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
        /// </summary>
        [Input("netbiosNodeType")]
        public Input<string>? NetbiosNodeType { get; set; }

        [Input("ntpServers")]
        private InputList<string>? _ntpServers;

        /// <summary>
        /// List of NTP servers to configure.
        /// </summary>
        public InputList<string> NtpServers
        {
            get => _ntpServers ?? (_ntpServers = new InputList<string>());
            set => _ntpServers = value;
        }

        /// <summary>
        /// The ID of the AWS account that owns the DHCP options set.
        /// </summary>
        [Input("ownerId")]
        public Input<string>? OwnerId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public VpcDhcpOptionsState()
        {
        }
        public static new VpcDhcpOptionsState Empty => new VpcDhcpOptionsState();
    }
}
