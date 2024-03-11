// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static class GetInstanceTypeOfferings
    {
        /// <summary>
        /// Information about EC2 Instance Type Offerings.
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
        ///     var example = Aws.Ec2.GetInstanceTypeOfferings.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2.Inputs.GetInstanceTypeOfferingsFilterInputArgs
        ///             {
        ///                 Name = "instance-type",
        ///                 Values = new[]
        ///                 {
        ///                     "t2.micro",
        ///                     "t3.micro",
        ///                 },
        ///             },
        ///             new Aws.Ec2.Inputs.GetInstanceTypeOfferingsFilterInputArgs
        ///             {
        ///                 Name = "location",
        ///                 Values = new[]
        ///                 {
        ///                     "usw2-az4",
        ///                 },
        ///             },
        ///         },
        ///         LocationType = "availability-zone-id",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetInstanceTypeOfferingsResult> InvokeAsync(GetInstanceTypeOfferingsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceTypeOfferingsResult>("aws:ec2/getInstanceTypeOfferings:getInstanceTypeOfferings", args ?? new GetInstanceTypeOfferingsArgs(), options.WithDefaults());

        /// <summary>
        /// Information about EC2 Instance Type Offerings.
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
        ///     var example = Aws.Ec2.GetInstanceTypeOfferings.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2.Inputs.GetInstanceTypeOfferingsFilterInputArgs
        ///             {
        ///                 Name = "instance-type",
        ///                 Values = new[]
        ///                 {
        ///                     "t2.micro",
        ///                     "t3.micro",
        ///                 },
        ///             },
        ///             new Aws.Ec2.Inputs.GetInstanceTypeOfferingsFilterInputArgs
        ///             {
        ///                 Name = "location",
        ///                 Values = new[]
        ///                 {
        ///                     "usw2-az4",
        ///                 },
        ///             },
        ///         },
        ///         LocationType = "availability-zone-id",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetInstanceTypeOfferingsResult> Invoke(GetInstanceTypeOfferingsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceTypeOfferingsResult>("aws:ec2/getInstanceTypeOfferings:getInstanceTypeOfferings", args ?? new GetInstanceTypeOfferingsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceTypeOfferingsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetInstanceTypeOfferingsFilterArgs>? _filters;

        /// <summary>
        /// One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypeOfferings.html) for supported filters. Detailed below.
        /// </summary>
        public List<Inputs.GetInstanceTypeOfferingsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetInstanceTypeOfferingsFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// Location type. Defaults to `region`. Valid values: `availability-zone`, `availability-zone-id`, and `region`.
        /// </summary>
        [Input("locationType")]
        public string? LocationType { get; set; }

        public GetInstanceTypeOfferingsArgs()
        {
        }
        public static new GetInstanceTypeOfferingsArgs Empty => new GetInstanceTypeOfferingsArgs();
    }

    public sealed class GetInstanceTypeOfferingsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetInstanceTypeOfferingsFilterInputArgs>? _filters;

        /// <summary>
        /// One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypeOfferings.html) for supported filters. Detailed below.
        /// </summary>
        public InputList<Inputs.GetInstanceTypeOfferingsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetInstanceTypeOfferingsFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// Location type. Defaults to `region`. Valid values: `availability-zone`, `availability-zone-id`, and `region`.
        /// </summary>
        [Input("locationType")]
        public Input<string>? LocationType { get; set; }

        public GetInstanceTypeOfferingsInvokeArgs()
        {
        }
        public static new GetInstanceTypeOfferingsInvokeArgs Empty => new GetInstanceTypeOfferingsInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceTypeOfferingsResult
    {
        public readonly ImmutableArray<Outputs.GetInstanceTypeOfferingsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of EC2 Instance Types.
        /// </summary>
        public readonly ImmutableArray<string> InstanceTypes;
        public readonly string? LocationType;
        /// <summary>
        /// List of location types.
        /// </summary>
        public readonly ImmutableArray<string> LocationTypes;
        /// <summary>
        /// List of locations.
        /// </summary>
        public readonly ImmutableArray<string> Locations;

        [OutputConstructor]
        private GetInstanceTypeOfferingsResult(
            ImmutableArray<Outputs.GetInstanceTypeOfferingsFilterResult> filters,

            string id,

            ImmutableArray<string> instanceTypes,

            string? locationType,

            ImmutableArray<string> locationTypes,

            ImmutableArray<string> locations)
        {
            Filters = filters;
            Id = id;
            InstanceTypes = instanceTypes;
            LocationType = locationType;
            LocationTypes = locationTypes;
            Locations = locations;
        }
    }
}
