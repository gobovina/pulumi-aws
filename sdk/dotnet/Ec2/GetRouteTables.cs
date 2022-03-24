// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static class GetRouteTables
    {
        /// <summary>
        /// This resource can be useful for getting back a list of route table ids to be referenced elsewhere.
        /// </summary>
        public static Task<GetRouteTablesResult> InvokeAsync(GetRouteTablesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetRouteTablesResult>("aws:ec2/getRouteTables:getRouteTables", args ?? new GetRouteTablesArgs(), options.WithDefaults());

        /// <summary>
        /// This resource can be useful for getting back a list of route table ids to be referenced elsewhere.
        /// </summary>
        public static Output<GetRouteTablesResult> Invoke(GetRouteTablesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetRouteTablesResult>("aws:ec2/getRouteTables:getRouteTables", args ?? new GetRouteTablesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRouteTablesArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetRouteTablesFilterArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public List<Inputs.GetRouteTablesFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetRouteTablesFilterArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// A map of tags, each pair of which must exactly match
        /// a pair on the desired route tables.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        /// <summary>
        /// The VPC ID that you want to filter from.
        /// </summary>
        [Input("vpcId")]
        public string? VpcId { get; set; }

        public GetRouteTablesArgs()
        {
        }
    }

    public sealed class GetRouteTablesInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetRouteTablesFilterInputArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public InputList<Inputs.GetRouteTablesFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetRouteTablesFilterInputArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags, each pair of which must exactly match
        /// a pair on the desired route tables.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The VPC ID that you want to filter from.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public GetRouteTablesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetRouteTablesResult
    {
        public readonly ImmutableArray<Outputs.GetRouteTablesFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of all the route table ids found.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableDictionary<string, string> Tags;
        public readonly string? VpcId;

        [OutputConstructor]
        private GetRouteTablesResult(
            ImmutableArray<Outputs.GetRouteTablesFilterResult> filters,

            string id,

            ImmutableArray<string> ids,

            ImmutableDictionary<string, string> tags,

            string? vpcId)
        {
            Filters = filters;
            Id = id;
            Ids = ids;
            Tags = tags;
            VpcId = vpcId;
        }
    }
}
