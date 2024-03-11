// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Location
{
    public static class GetTrackerAssociations
    {
        /// <summary>
        /// Retrieve information about Location Service Tracker Associations.
        /// 
        /// ## Example Usage
        /// 
        /// ### Basic Usage
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
        ///     var example = Aws.Location.GetTrackerAssociations.Invoke(new()
        ///     {
        ///         TrackerName = "example",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetTrackerAssociationsResult> InvokeAsync(GetTrackerAssociationsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTrackerAssociationsResult>("aws:location/getTrackerAssociations:getTrackerAssociations", args ?? new GetTrackerAssociationsArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve information about Location Service Tracker Associations.
        /// 
        /// ## Example Usage
        /// 
        /// ### Basic Usage
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
        ///     var example = Aws.Location.GetTrackerAssociations.Invoke(new()
        ///     {
        ///         TrackerName = "example",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetTrackerAssociationsResult> Invoke(GetTrackerAssociationsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTrackerAssociationsResult>("aws:location/getTrackerAssociations:getTrackerAssociations", args ?? new GetTrackerAssociationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTrackerAssociationsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the tracker resource associated with a geofence collection.
        /// </summary>
        [Input("trackerName", required: true)]
        public string TrackerName { get; set; } = null!;

        public GetTrackerAssociationsArgs()
        {
        }
        public static new GetTrackerAssociationsArgs Empty => new GetTrackerAssociationsArgs();
    }

    public sealed class GetTrackerAssociationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the tracker resource associated with a geofence collection.
        /// </summary>
        [Input("trackerName", required: true)]
        public Input<string> TrackerName { get; set; } = null!;

        public GetTrackerAssociationsInvokeArgs()
        {
        }
        public static new GetTrackerAssociationsInvokeArgs Empty => new GetTrackerAssociationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetTrackerAssociationsResult
    {
        /// <summary>
        /// List of geofence collection ARNs associated to the tracker resource.
        /// </summary>
        public readonly ImmutableArray<string> ConsumerArns;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string TrackerName;

        [OutputConstructor]
        private GetTrackerAssociationsResult(
            ImmutableArray<string> consumerArns,

            string id,

            string trackerName)
        {
            ConsumerArns = consumerArns;
            Id = id;
            TrackerName = trackerName;
        }
    }
}
