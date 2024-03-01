// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static class GetSecurityGroups
    {
        /// <summary>
        /// Use this data source to get IDs and VPC membership of Security Groups that are created outside this provider.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Aws.Ec2.GetSecurityGroups.Invoke(new()
        ///     {
        ///         Tags = 
        ///         {
        ///             { "Application", "k8s" },
        ///             { "Environment", "dev" },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Aws.Ec2.GetSecurityGroups.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2.Inputs.GetSecurityGroupsFilterInputArgs
        ///             {
        ///                 Name = "group-name",
        ///                 Values = new[]
        ///                 {
        ///                     "*nodes*",
        ///                 },
        ///             },
        ///             new Aws.Ec2.Inputs.GetSecurityGroupsFilterInputArgs
        ///             {
        ///                 Name = "vpc-id",
        ///                 Values = new[]
        ///                 {
        ///                     vpcId,
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSecurityGroupsResult> InvokeAsync(GetSecurityGroupsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSecurityGroupsResult>("aws:ec2/getSecurityGroups:getSecurityGroups", args ?? new GetSecurityGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get IDs and VPC membership of Security Groups that are created outside this provider.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Aws.Ec2.GetSecurityGroups.Invoke(new()
        ///     {
        ///         Tags = 
        ///         {
        ///             { "Application", "k8s" },
        ///             { "Environment", "dev" },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Aws.Ec2.GetSecurityGroups.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2.Inputs.GetSecurityGroupsFilterInputArgs
        ///             {
        ///                 Name = "group-name",
        ///                 Values = new[]
        ///                 {
        ///                     "*nodes*",
        ///                 },
        ///             },
        ///             new Aws.Ec2.Inputs.GetSecurityGroupsFilterInputArgs
        ///             {
        ///                 Name = "vpc-id",
        ///                 Values = new[]
        ///                 {
        ///                     vpcId,
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSecurityGroupsResult> Invoke(GetSecurityGroupsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSecurityGroupsResult>("aws:ec2/getSecurityGroups:getSecurityGroups", args ?? new GetSecurityGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSecurityGroupsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetSecurityGroupsFilterArgs>? _filters;

        /// <summary>
        /// One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out [describe-security-groups in the AWS CLI reference][1].
        /// </summary>
        public List<Inputs.GetSecurityGroupsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetSecurityGroupsFilterArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Map of tags, each pair of which must exactly match for desired security groups.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetSecurityGroupsArgs()
        {
        }
        public static new GetSecurityGroupsArgs Empty => new GetSecurityGroupsArgs();
    }

    public sealed class GetSecurityGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetSecurityGroupsFilterInputArgs>? _filters;

        /// <summary>
        /// One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out [describe-security-groups in the AWS CLI reference][1].
        /// </summary>
        public InputList<Inputs.GetSecurityGroupsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetSecurityGroupsFilterInputArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags, each pair of which must exactly match for desired security groups.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetSecurityGroupsInvokeArgs()
        {
        }
        public static new GetSecurityGroupsInvokeArgs Empty => new GetSecurityGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSecurityGroupsResult
    {
        /// <summary>
        /// ARNs of the matched security groups.
        /// </summary>
        public readonly ImmutableArray<string> Arns;
        public readonly ImmutableArray<Outputs.GetSecurityGroupsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// IDs of the matches security groups.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// VPC IDs of the matched security groups. The data source's tag or filter *will span VPCs* unless the `vpc-id` filter is also used.
        /// </summary>
        public readonly ImmutableArray<string> VpcIds;

        [OutputConstructor]
        private GetSecurityGroupsResult(
            ImmutableArray<string> arns,

            ImmutableArray<Outputs.GetSecurityGroupsFilterResult> filters,

            string id,

            ImmutableArray<string> ids,

            ImmutableDictionary<string, string> tags,

            ImmutableArray<string> vpcIds)
        {
            Arns = arns;
            Filters = filters;
            Id = id;
            Ids = ids;
            Tags = tags;
            VpcIds = vpcIds;
        }
    }
}
