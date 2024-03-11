// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static class GetManagedPrefixLists
    {
        /// <summary>
        /// This resource can be useful for getting back a list of managed prefix list ids to be referenced elsewhere.
        /// </summary>
        public static Task<GetManagedPrefixListsResult> InvokeAsync(GetManagedPrefixListsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetManagedPrefixListsResult>("aws:ec2/getManagedPrefixLists:getManagedPrefixLists", args ?? new GetManagedPrefixListsArgs(), options.WithDefaults());

        /// <summary>
        /// This resource can be useful for getting back a list of managed prefix list ids to be referenced elsewhere.
        /// </summary>
        public static Output<GetManagedPrefixListsResult> Invoke(GetManagedPrefixListsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetManagedPrefixListsResult>("aws:ec2/getManagedPrefixLists:getManagedPrefixLists", args ?? new GetManagedPrefixListsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetManagedPrefixListsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetManagedPrefixListsFilterArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public List<Inputs.GetManagedPrefixListsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetManagedPrefixListsFilterArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Map of tags, each pair of which must exactly match
        /// a pair on the desired .
        /// 
        /// More complex filters can be expressed using one or more `filter` sub-blocks,
        /// which take the following arguments:
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetManagedPrefixListsArgs()
        {
        }
        public static new GetManagedPrefixListsArgs Empty => new GetManagedPrefixListsArgs();
    }

    public sealed class GetManagedPrefixListsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetManagedPrefixListsFilterInputArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public InputList<Inputs.GetManagedPrefixListsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetManagedPrefixListsFilterInputArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags, each pair of which must exactly match
        /// a pair on the desired .
        /// 
        /// More complex filters can be expressed using one or more `filter` sub-blocks,
        /// which take the following arguments:
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetManagedPrefixListsInvokeArgs()
        {
        }
        public static new GetManagedPrefixListsInvokeArgs Empty => new GetManagedPrefixListsInvokeArgs();
    }


    [OutputType]
    public sealed class GetManagedPrefixListsResult
    {
        public readonly ImmutableArray<Outputs.GetManagedPrefixListsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of all the managed prefix list ids found.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetManagedPrefixListsResult(
            ImmutableArray<Outputs.GetManagedPrefixListsFilterResult> filters,

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
