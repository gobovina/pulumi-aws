// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ServiceDiscovery
{
    public static class GetService
    {
        /// <summary>
        /// Retrieves information about a Service Discovery Service.
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
        ///     var test = Aws.ServiceDiscovery.GetService.Invoke(new()
        ///     {
        ///         Name = "example",
        ///         NamespaceId = "NAMESPACE_ID_VALUE",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetServiceResult> InvokeAsync(GetServiceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceResult>("aws:servicediscovery/getService:getService", args ?? new GetServiceArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves information about a Service Discovery Service.
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
        ///     var test = Aws.ServiceDiscovery.GetService.Invoke(new()
        ///     {
        ///         Name = "example",
        ///         NamespaceId = "NAMESPACE_ID_VALUE",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetServiceResult> Invoke(GetServiceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceResult>("aws:servicediscovery/getService:getService", args ?? new GetServiceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the service.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// ID of the namespace that the service belongs to.
        /// </summary>
        [Input("namespaceId", required: true)]
        public string NamespaceId { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private Dictionary<string, string>? _tagsAll;

        /// <summary>
        /// (**Deprecated**) Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"this attribute has been deprecated")]
        public Dictionary<string, string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new Dictionary<string, string>());
            set => _tagsAll = value;
        }

        public GetServiceArgs()
        {
        }
        public static new GetServiceArgs Empty => new GetServiceArgs();
    }

    public sealed class GetServiceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the service.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// ID of the namespace that the service belongs to.
        /// </summary>
        [Input("namespaceId", required: true)]
        public Input<string> NamespaceId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// (**Deprecated**) Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"this attribute has been deprecated")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public GetServiceInvokeArgs()
        {
        }
        public static new GetServiceInvokeArgs Empty => new GetServiceInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceResult
    {
        /// <summary>
        /// ARN of the service.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// Description of the service.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceDnsConfigResult> DnsConfigs;
        /// <summary>
        /// Complex type that contains settings for an optional health check. Only for Public DNS namespaces.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceHealthCheckConfigResult> HealthCheckConfigs;
        /// <summary>
        /// A complex type that contains settings for ECS managed health checks.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceHealthCheckCustomConfigResult> HealthCheckCustomConfigs;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// ID of the namespace to use for DNS configuration.
        /// </summary>
        public readonly string NamespaceId;
        /// <summary>
        /// Map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Tags;
        /// <summary>
        /// (**Deprecated**) Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        public readonly ImmutableDictionary<string, string> TagsAll;

        [OutputConstructor]
        private GetServiceResult(
            string arn,

            string description,

            ImmutableArray<Outputs.GetServiceDnsConfigResult> dnsConfigs,

            ImmutableArray<Outputs.GetServiceHealthCheckConfigResult> healthCheckConfigs,

            ImmutableArray<Outputs.GetServiceHealthCheckCustomConfigResult> healthCheckCustomConfigs,

            string id,

            string name,

            string namespaceId,

            ImmutableDictionary<string, string>? tags,

            ImmutableDictionary<string, string> tagsAll)
        {
            Arn = arn;
            Description = description;
            DnsConfigs = dnsConfigs;
            HealthCheckConfigs = healthCheckConfigs;
            HealthCheckCustomConfigs = healthCheckCustomConfigs;
            Id = id;
            Name = name;
            NamespaceId = namespaceId;
            Tags = tags;
            TagsAll = tagsAll;
        }
    }
}
