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
    /// Provides a Route53 record resource.
    /// 
    /// ## Example Usage
    /// 
    /// ### Simple routing policy
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
    ///     var www = new Aws.Route53.Record("www", new()
    ///     {
    ///         ZoneId = primary.ZoneId,
    ///         Name = "www.example.com",
    ///         Type = "A",
    ///         Ttl = 300,
    ///         Records = new[]
    ///         {
    ///             lb.PublicIp,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Weighted routing policy
    /// 
    /// Other routing policies are configured similarly. See [Amazon Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html) for details.
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
    ///     var www_dev = new Aws.Route53.Record("www-dev", new()
    ///     {
    ///         ZoneId = primary.ZoneId,
    ///         Name = "www",
    ///         Type = "CNAME",
    ///         Ttl = 5,
    ///         WeightedRoutingPolicies = new[]
    ///         {
    ///             new Aws.Route53.Inputs.RecordWeightedRoutingPolicyArgs
    ///             {
    ///                 Weight = 10,
    ///             },
    ///         },
    ///         SetIdentifier = "dev",
    ///         Records = new[]
    ///         {
    ///             "dev.example.com",
    ///         },
    ///     });
    /// 
    ///     var www_live = new Aws.Route53.Record("www-live", new()
    ///     {
    ///         ZoneId = primary.ZoneId,
    ///         Name = "www",
    ///         Type = "CNAME",
    ///         Ttl = 5,
    ///         WeightedRoutingPolicies = new[]
    ///         {
    ///             new Aws.Route53.Inputs.RecordWeightedRoutingPolicyArgs
    ///             {
    ///                 Weight = 90,
    ///             },
    ///         },
    ///         SetIdentifier = "live",
    ///         Records = new[]
    ///         {
    ///             "live.example.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Geoproximity routing policy
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
    ///     var www = new Aws.Route53.Record("www", new()
    ///     {
    ///         ZoneId = primary.ZoneId,
    ///         Name = "www.example.com",
    ///         Type = "CNAME",
    ///         Ttl = 300,
    ///         GeoproximityRoutingPolicy = new Aws.Route53.Inputs.RecordGeoproximityRoutingPolicyArgs
    ///         {
    ///             Coordinates = new[]
    ///             {
    ///                 new Aws.Route53.Inputs.RecordGeoproximityRoutingPolicyCoordinateArgs
    ///                 {
    ///                     Latitude = "49.22",
    ///                     Longitude = "-74.01",
    ///                 },
    ///             },
    ///         },
    ///         SetIdentifier = "dev",
    ///         Records = new[]
    ///         {
    ///             "dev.example.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Alias record
    /// 
    /// See [related part of Amazon Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resource-record-sets-choosing-alias-non-alias.html)
    /// to understand differences between alias and non-alias records.
    /// 
    /// TTL for all alias records is [60 seconds](https://aws.amazon.com/route53/faqs/#dns_failover_do_i_need_to_adjust),
    /// you cannot change this, therefore `ttl` has to be omitted in alias records.
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
    ///     var main = new Aws.Elb.LoadBalancer("main", new()
    ///     {
    ///         Name = "foobar-elb",
    ///         AvailabilityZones = new[]
    ///         {
    ///             "us-east-1c",
    ///         },
    ///         Listeners = new[]
    ///         {
    ///             new Aws.Elb.Inputs.LoadBalancerListenerArgs
    ///             {
    ///                 InstancePort = 80,
    ///                 InstanceProtocol = "http",
    ///                 LbPort = 80,
    ///                 LbProtocol = "http",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var www = new Aws.Route53.Record("www", new()
    ///     {
    ///         ZoneId = primary.ZoneId,
    ///         Name = "example.com",
    ///         Type = "A",
    ///         Aliases = new[]
    ///         {
    ///             new Aws.Route53.Inputs.RecordAliasArgs
    ///             {
    ///                 Name = main.DnsName,
    ///                 ZoneId = main.ZoneId,
    ///                 EvaluateTargetHealth = true,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### NS and SOA Record Management
    /// 
    /// When creating Route 53 zones, the `NS` and `SOA` records for the zone are automatically created. Enabling the `allow_overwrite` argument will allow managing these records in a single deployment without the requirement for `import`.
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
    ///     var example = new Aws.Route53.Zone("example", new()
    ///     {
    ///         Name = "test.example.com",
    ///     });
    /// 
    ///     var exampleRecord = new Aws.Route53.Record("example", new()
    ///     {
    ///         AllowOverwrite = true,
    ///         Name = "test.example.com",
    ///         Ttl = 172800,
    ///         Type = "NS",
    ///         ZoneId = example.ZoneId,
    ///         Records = new[]
    ///         {
    ///             example.NameServers.Apply(nameServers =&gt; nameServers[0]),
    ///             example.NameServers.Apply(nameServers =&gt; nameServers[1]),
    ///             example.NameServers.Apply(nameServers =&gt; nameServers[2]),
    ///             example.NameServers.Apply(nameServers =&gt; nameServers[3]),
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// If the record also contains a set identifier, append it:
    /// 
    /// If the record name is the empty string, it can be omitted:
    /// 
    /// __Using `pulumi import` to import__ Route53 Records using the ID of the record, record name, record type, and set identifier. For example:
    /// 
    /// Using the ID of the record, which is the zone identifier, record name, and record type, separated by underscores (`_`):
    /// 
    /// ```sh
    /// $ pulumi import aws:route53/record:Record myrecord Z4KAPRWWNC7JR_dev.example.com_NS
    /// ```
    /// If the record also contains a set identifier, append it:
    /// 
    /// ```sh
    /// $ pulumi import aws:route53/record:Record myrecord Z4KAPRWWNC7JR_dev.example.com_NS_dev
    /// ```
    /// </summary>
    [AwsResourceType("aws:route53/record:Record")]
    public partial class Record : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An alias block. Conflicts with `ttl` &amp; `records`.
        /// Documented below.
        /// </summary>
        [Output("aliases")]
        public Output<ImmutableArray<Outputs.RecordAlias>> Aliases { get; private set; } = null!;

        /// <summary>
        /// Allow creation of this record to overwrite an existing record, if any. This does not affect the ability to update the record using this provider and does not prevent other resources within this provider or manual Route 53 changes outside this provider from overwriting this record. `false` by default. This configuration is not recommended for most environments.
        /// 
        /// Exactly one of `records` or `alias` must be specified: this determines whether it's an alias record.
        /// </summary>
        [Output("allowOverwrite")]
        public Output<bool> AllowOverwrite { get; private set; } = null!;

        /// <summary>
        /// A block indicating a routing policy based on the IP network ranges of requestors. Conflicts with any other routing policy. Documented below.
        /// </summary>
        [Output("cidrRoutingPolicy")]
        public Output<Outputs.RecordCidrRoutingPolicy?> CidrRoutingPolicy { get; private set; } = null!;

        /// <summary>
        /// A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
        /// </summary>
        [Output("failoverRoutingPolicies")]
        public Output<ImmutableArray<Outputs.RecordFailoverRoutingPolicy>> FailoverRoutingPolicies { get; private set; } = null!;

        /// <summary>
        /// [FQDN](https://en.wikipedia.org/wiki/Fully_qualified_domain_name) built using the zone domain and `name`.
        /// </summary>
        [Output("fqdn")]
        public Output<string> Fqdn { get; private set; } = null!;

        /// <summary>
        /// A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
        /// </summary>
        [Output("geolocationRoutingPolicies")]
        public Output<ImmutableArray<Outputs.RecordGeolocationRoutingPolicy>> GeolocationRoutingPolicies { get; private set; } = null!;

        /// <summary>
        /// A block indicating a routing policy based on the geoproximity of the requestor. Conflicts with any other routing policy. Documented below.
        /// </summary>
        [Output("geoproximityRoutingPolicy")]
        public Output<Outputs.RecordGeoproximityRoutingPolicy?> GeoproximityRoutingPolicy { get; private set; } = null!;

        /// <summary>
        /// The health check the record should be associated with.
        /// </summary>
        [Output("healthCheckId")]
        public Output<string?> HealthCheckId { get; private set; } = null!;

        /// <summary>
        /// A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
        /// </summary>
        [Output("latencyRoutingPolicies")]
        public Output<ImmutableArray<Outputs.RecordLatencyRoutingPolicy>> LatencyRoutingPolicies { get; private set; } = null!;

        /// <summary>
        /// Set to `true` to indicate a multivalue answer routing policy. Conflicts with any other routing policy.
        /// </summary>
        [Output("multivalueAnswerRoutingPolicy")]
        public Output<bool?> MultivalueAnswerRoutingPolicy { get; private set; } = null!;

        /// <summary>
        /// The name of the record.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A string list of records. To specify a single record value longer than 255 characters such as a TXT record for DKIM, add `\"\"` inside the provider configuration string (e.g., `"first255characters\"\"morecharacters"`).
        /// </summary>
        [Output("records")]
        public Output<ImmutableArray<string>> Records { get; private set; } = null!;

        /// <summary>
        /// Unique identifier to differentiate records with routing policies from one another. Required if using `cidr_routing_policy`, `failover_routing_policy`, `geolocation_routing_policy`,`geoproximity_routing_policy`, `latency_routing_policy`, `multivalue_answer_routing_policy`, or `weighted_routing_policy`.
        /// </summary>
        [Output("setIdentifier")]
        public Output<string?> SetIdentifier { get; private set; } = null!;

        /// <summary>
        /// The TTL of the record.
        /// </summary>
        [Output("ttl")]
        public Output<int?> Ttl { get; private set; } = null!;

        /// <summary>
        /// The record type. Valid values are `A`, `AAAA`, `CAA`, `CNAME`, `DS`, `MX`, `NAPTR`, `NS`, `PTR`, `SOA`, `SPF`, `SRV` and `TXT`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
        /// </summary>
        [Output("weightedRoutingPolicies")]
        public Output<ImmutableArray<Outputs.RecordWeightedRoutingPolicy>> WeightedRoutingPolicies { get; private set; } = null!;

        /// <summary>
        /// The ID of the hosted zone to contain this record.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a Record resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Record(string name, RecordArgs args, CustomResourceOptions? options = null)
            : base("aws:route53/record:Record", name, args ?? new RecordArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Record(string name, Input<string> id, RecordState? state = null, CustomResourceOptions? options = null)
            : base("aws:route53/record:Record", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Record resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Record Get(string name, Input<string> id, RecordState? state = null, CustomResourceOptions? options = null)
        {
            return new Record(name, id, state, options);
        }
    }

    public sealed class RecordArgs : global::Pulumi.ResourceArgs
    {
        [Input("aliases")]
        private InputList<Inputs.RecordAliasArgs>? _aliases;

        /// <summary>
        /// An alias block. Conflicts with `ttl` &amp; `records`.
        /// Documented below.
        /// </summary>
        public InputList<Inputs.RecordAliasArgs> Aliases
        {
            get => _aliases ?? (_aliases = new InputList<Inputs.RecordAliasArgs>());
            set => _aliases = value;
        }

        /// <summary>
        /// Allow creation of this record to overwrite an existing record, if any. This does not affect the ability to update the record using this provider and does not prevent other resources within this provider or manual Route 53 changes outside this provider from overwriting this record. `false` by default. This configuration is not recommended for most environments.
        /// 
        /// Exactly one of `records` or `alias` must be specified: this determines whether it's an alias record.
        /// </summary>
        [Input("allowOverwrite")]
        public Input<bool>? AllowOverwrite { get; set; }

        /// <summary>
        /// A block indicating a routing policy based on the IP network ranges of requestors. Conflicts with any other routing policy. Documented below.
        /// </summary>
        [Input("cidrRoutingPolicy")]
        public Input<Inputs.RecordCidrRoutingPolicyArgs>? CidrRoutingPolicy { get; set; }

        [Input("failoverRoutingPolicies")]
        private InputList<Inputs.RecordFailoverRoutingPolicyArgs>? _failoverRoutingPolicies;

        /// <summary>
        /// A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
        /// </summary>
        public InputList<Inputs.RecordFailoverRoutingPolicyArgs> FailoverRoutingPolicies
        {
            get => _failoverRoutingPolicies ?? (_failoverRoutingPolicies = new InputList<Inputs.RecordFailoverRoutingPolicyArgs>());
            set => _failoverRoutingPolicies = value;
        }

        [Input("geolocationRoutingPolicies")]
        private InputList<Inputs.RecordGeolocationRoutingPolicyArgs>? _geolocationRoutingPolicies;

        /// <summary>
        /// A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
        /// </summary>
        public InputList<Inputs.RecordGeolocationRoutingPolicyArgs> GeolocationRoutingPolicies
        {
            get => _geolocationRoutingPolicies ?? (_geolocationRoutingPolicies = new InputList<Inputs.RecordGeolocationRoutingPolicyArgs>());
            set => _geolocationRoutingPolicies = value;
        }

        /// <summary>
        /// A block indicating a routing policy based on the geoproximity of the requestor. Conflicts with any other routing policy. Documented below.
        /// </summary>
        [Input("geoproximityRoutingPolicy")]
        public Input<Inputs.RecordGeoproximityRoutingPolicyArgs>? GeoproximityRoutingPolicy { get; set; }

        /// <summary>
        /// The health check the record should be associated with.
        /// </summary>
        [Input("healthCheckId")]
        public Input<string>? HealthCheckId { get; set; }

        [Input("latencyRoutingPolicies")]
        private InputList<Inputs.RecordLatencyRoutingPolicyArgs>? _latencyRoutingPolicies;

        /// <summary>
        /// A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
        /// </summary>
        public InputList<Inputs.RecordLatencyRoutingPolicyArgs> LatencyRoutingPolicies
        {
            get => _latencyRoutingPolicies ?? (_latencyRoutingPolicies = new InputList<Inputs.RecordLatencyRoutingPolicyArgs>());
            set => _latencyRoutingPolicies = value;
        }

        /// <summary>
        /// Set to `true` to indicate a multivalue answer routing policy. Conflicts with any other routing policy.
        /// </summary>
        [Input("multivalueAnswerRoutingPolicy")]
        public Input<bool>? MultivalueAnswerRoutingPolicy { get; set; }

        /// <summary>
        /// The name of the record.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("records")]
        private InputList<string>? _records;

        /// <summary>
        /// A string list of records. To specify a single record value longer than 255 characters such as a TXT record for DKIM, add `\"\"` inside the provider configuration string (e.g., `"first255characters\"\"morecharacters"`).
        /// </summary>
        public InputList<string> Records
        {
            get => _records ?? (_records = new InputList<string>());
            set => _records = value;
        }

        /// <summary>
        /// Unique identifier to differentiate records with routing policies from one another. Required if using `cidr_routing_policy`, `failover_routing_policy`, `geolocation_routing_policy`,`geoproximity_routing_policy`, `latency_routing_policy`, `multivalue_answer_routing_policy`, or `weighted_routing_policy`.
        /// </summary>
        [Input("setIdentifier")]
        public Input<string>? SetIdentifier { get; set; }

        /// <summary>
        /// The TTL of the record.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        /// <summary>
        /// The record type. Valid values are `A`, `AAAA`, `CAA`, `CNAME`, `DS`, `MX`, `NAPTR`, `NS`, `PTR`, `SOA`, `SPF`, `SRV` and `TXT`.
        /// </summary>
        [Input("type", required: true)]
        public InputUnion<string, Pulumi.Aws.Route53.RecordType> Type { get; set; } = null!;

        [Input("weightedRoutingPolicies")]
        private InputList<Inputs.RecordWeightedRoutingPolicyArgs>? _weightedRoutingPolicies;

        /// <summary>
        /// A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
        /// </summary>
        public InputList<Inputs.RecordWeightedRoutingPolicyArgs> WeightedRoutingPolicies
        {
            get => _weightedRoutingPolicies ?? (_weightedRoutingPolicies = new InputList<Inputs.RecordWeightedRoutingPolicyArgs>());
            set => _weightedRoutingPolicies = value;
        }

        /// <summary>
        /// The ID of the hosted zone to contain this record.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public RecordArgs()
        {
        }
        public static new RecordArgs Empty => new RecordArgs();
    }

    public sealed class RecordState : global::Pulumi.ResourceArgs
    {
        [Input("aliases")]
        private InputList<Inputs.RecordAliasGetArgs>? _aliases;

        /// <summary>
        /// An alias block. Conflicts with `ttl` &amp; `records`.
        /// Documented below.
        /// </summary>
        public InputList<Inputs.RecordAliasGetArgs> Aliases
        {
            get => _aliases ?? (_aliases = new InputList<Inputs.RecordAliasGetArgs>());
            set => _aliases = value;
        }

        /// <summary>
        /// Allow creation of this record to overwrite an existing record, if any. This does not affect the ability to update the record using this provider and does not prevent other resources within this provider or manual Route 53 changes outside this provider from overwriting this record. `false` by default. This configuration is not recommended for most environments.
        /// 
        /// Exactly one of `records` or `alias` must be specified: this determines whether it's an alias record.
        /// </summary>
        [Input("allowOverwrite")]
        public Input<bool>? AllowOverwrite { get; set; }

        /// <summary>
        /// A block indicating a routing policy based on the IP network ranges of requestors. Conflicts with any other routing policy. Documented below.
        /// </summary>
        [Input("cidrRoutingPolicy")]
        public Input<Inputs.RecordCidrRoutingPolicyGetArgs>? CidrRoutingPolicy { get; set; }

        [Input("failoverRoutingPolicies")]
        private InputList<Inputs.RecordFailoverRoutingPolicyGetArgs>? _failoverRoutingPolicies;

        /// <summary>
        /// A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
        /// </summary>
        public InputList<Inputs.RecordFailoverRoutingPolicyGetArgs> FailoverRoutingPolicies
        {
            get => _failoverRoutingPolicies ?? (_failoverRoutingPolicies = new InputList<Inputs.RecordFailoverRoutingPolicyGetArgs>());
            set => _failoverRoutingPolicies = value;
        }

        /// <summary>
        /// [FQDN](https://en.wikipedia.org/wiki/Fully_qualified_domain_name) built using the zone domain and `name`.
        /// </summary>
        [Input("fqdn")]
        public Input<string>? Fqdn { get; set; }

        [Input("geolocationRoutingPolicies")]
        private InputList<Inputs.RecordGeolocationRoutingPolicyGetArgs>? _geolocationRoutingPolicies;

        /// <summary>
        /// A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
        /// </summary>
        public InputList<Inputs.RecordGeolocationRoutingPolicyGetArgs> GeolocationRoutingPolicies
        {
            get => _geolocationRoutingPolicies ?? (_geolocationRoutingPolicies = new InputList<Inputs.RecordGeolocationRoutingPolicyGetArgs>());
            set => _geolocationRoutingPolicies = value;
        }

        /// <summary>
        /// A block indicating a routing policy based on the geoproximity of the requestor. Conflicts with any other routing policy. Documented below.
        /// </summary>
        [Input("geoproximityRoutingPolicy")]
        public Input<Inputs.RecordGeoproximityRoutingPolicyGetArgs>? GeoproximityRoutingPolicy { get; set; }

        /// <summary>
        /// The health check the record should be associated with.
        /// </summary>
        [Input("healthCheckId")]
        public Input<string>? HealthCheckId { get; set; }

        [Input("latencyRoutingPolicies")]
        private InputList<Inputs.RecordLatencyRoutingPolicyGetArgs>? _latencyRoutingPolicies;

        /// <summary>
        /// A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
        /// </summary>
        public InputList<Inputs.RecordLatencyRoutingPolicyGetArgs> LatencyRoutingPolicies
        {
            get => _latencyRoutingPolicies ?? (_latencyRoutingPolicies = new InputList<Inputs.RecordLatencyRoutingPolicyGetArgs>());
            set => _latencyRoutingPolicies = value;
        }

        /// <summary>
        /// Set to `true` to indicate a multivalue answer routing policy. Conflicts with any other routing policy.
        /// </summary>
        [Input("multivalueAnswerRoutingPolicy")]
        public Input<bool>? MultivalueAnswerRoutingPolicy { get; set; }

        /// <summary>
        /// The name of the record.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("records")]
        private InputList<string>? _records;

        /// <summary>
        /// A string list of records. To specify a single record value longer than 255 characters such as a TXT record for DKIM, add `\"\"` inside the provider configuration string (e.g., `"first255characters\"\"morecharacters"`).
        /// </summary>
        public InputList<string> Records
        {
            get => _records ?? (_records = new InputList<string>());
            set => _records = value;
        }

        /// <summary>
        /// Unique identifier to differentiate records with routing policies from one another. Required if using `cidr_routing_policy`, `failover_routing_policy`, `geolocation_routing_policy`,`geoproximity_routing_policy`, `latency_routing_policy`, `multivalue_answer_routing_policy`, or `weighted_routing_policy`.
        /// </summary>
        [Input("setIdentifier")]
        public Input<string>? SetIdentifier { get; set; }

        /// <summary>
        /// The TTL of the record.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        /// <summary>
        /// The record type. Valid values are `A`, `AAAA`, `CAA`, `CNAME`, `DS`, `MX`, `NAPTR`, `NS`, `PTR`, `SOA`, `SPF`, `SRV` and `TXT`.
        /// </summary>
        [Input("type")]
        public InputUnion<string, Pulumi.Aws.Route53.RecordType>? Type { get; set; }

        [Input("weightedRoutingPolicies")]
        private InputList<Inputs.RecordWeightedRoutingPolicyGetArgs>? _weightedRoutingPolicies;

        /// <summary>
        /// A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
        /// </summary>
        public InputList<Inputs.RecordWeightedRoutingPolicyGetArgs> WeightedRoutingPolicies
        {
            get => _weightedRoutingPolicies ?? (_weightedRoutingPolicies = new InputList<Inputs.RecordWeightedRoutingPolicyGetArgs>());
            set => _weightedRoutingPolicies = value;
        }

        /// <summary>
        /// The ID of the hosted zone to contain this record.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public RecordState()
        {
        }
        public static new RecordState Empty => new RecordState();
    }
}
