// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static class GetLocalGateways
    {
        /// <summary>
        /// Provides information for multiple EC2 Local Gateways, such as their identifiers.
        /// 
        /// ## Example Usage
        /// 
        /// The following example retrieves Local Gateways with a resource tag of `service` set to `production`.
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
        ///     var foo = Aws.Ec2.GetLocalGateways.Invoke(new()
        ///     {
        ///         Tags = 
        ///         {
        ///             { "service", "production" },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["foo"] = foo.Apply(getLocalGatewaysResult =&gt; getLocalGatewaysResult.Ids),
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetLocalGatewaysResult> InvokeAsync(GetLocalGatewaysArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLocalGatewaysResult>("aws:ec2/getLocalGateways:getLocalGateways", args ?? new GetLocalGatewaysArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information for multiple EC2 Local Gateways, such as their identifiers.
        /// 
        /// ## Example Usage
        /// 
        /// The following example retrieves Local Gateways with a resource tag of `service` set to `production`.
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
        ///     var foo = Aws.Ec2.GetLocalGateways.Invoke(new()
        ///     {
        ///         Tags = 
        ///         {
        ///             { "service", "production" },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["foo"] = foo.Apply(getLocalGatewaysResult =&gt; getLocalGatewaysResult.Ids),
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetLocalGatewaysResult> Invoke(GetLocalGatewaysInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLocalGatewaysResult>("aws:ec2/getLocalGateways:getLocalGateways", args ?? new GetLocalGatewaysInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLocalGatewaysArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetLocalGatewaysFilterArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// 
        /// More complex filters can be expressed using one or more `filter` sub-blocks,
        /// which take the following arguments:
        /// </summary>
        public List<Inputs.GetLocalGatewaysFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetLocalGatewaysFilterArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Mapping of tags, each pair of which must exactly match
        /// a pair on the desired local_gateways.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetLocalGatewaysArgs()
        {
        }
        public static new GetLocalGatewaysArgs Empty => new GetLocalGatewaysArgs();
    }

    public sealed class GetLocalGatewaysInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetLocalGatewaysFilterInputArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// 
        /// More complex filters can be expressed using one or more `filter` sub-blocks,
        /// which take the following arguments:
        /// </summary>
        public InputList<Inputs.GetLocalGatewaysFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetLocalGatewaysFilterInputArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Mapping of tags, each pair of which must exactly match
        /// a pair on the desired local_gateways.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetLocalGatewaysInvokeArgs()
        {
        }
        public static new GetLocalGatewaysInvokeArgs Empty => new GetLocalGatewaysInvokeArgs();
    }


    [OutputType]
    public sealed class GetLocalGatewaysResult
    {
        public readonly ImmutableArray<Outputs.GetLocalGatewaysFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Set of all the Local Gateway identifiers
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetLocalGatewaysResult(
            ImmutableArray<Outputs.GetLocalGatewaysFilterResult> filters,

            string id,

            ImmutableArray<string> ids,

            ImmutableDictionary<string, string> tags)
        {
            Filters = filters;
            Id = id;
            Ids = ids;
            Tags = tags;
        }
    }
}
