// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Connect
{
    public static class GetQueue
    {
        /// <summary>
        /// Provides details about a specific Amazon Connect Queue.
        /// 
        /// ## Example Usage
        /// 
        /// By `name`
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
        ///     var example = Aws.Connect.GetQueue.Invoke(new()
        ///     {
        ///         InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
        ///         Name = "Example",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// By `queue_id`
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
        ///     var example = Aws.Connect.GetQueue.Invoke(new()
        ///     {
        ///         InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
        ///         QueueId = "cccccccc-bbbb-cccc-dddd-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetQueueResult> InvokeAsync(GetQueueArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetQueueResult>("aws:connect/getQueue:getQueue", args ?? new GetQueueArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific Amazon Connect Queue.
        /// 
        /// ## Example Usage
        /// 
        /// By `name`
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
        ///     var example = Aws.Connect.GetQueue.Invoke(new()
        ///     {
        ///         InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
        ///         Name = "Example",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// By `queue_id`
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
        ///     var example = Aws.Connect.GetQueue.Invoke(new()
        ///     {
        ///         InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
        ///         QueueId = "cccccccc-bbbb-cccc-dddd-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetQueueResult> Invoke(GetQueueInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetQueueResult>("aws:connect/getQueue:getQueue", args ?? new GetQueueInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetQueueArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Reference to the hosting Amazon Connect Instance
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// Returns information on a specific Queue by name
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Returns information on a specific Queue by Queue id
        /// </summary>
        [Input("queueId")]
        public string? QueueId { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Map of tags assigned to the Queue.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetQueueArgs()
        {
        }
        public static new GetQueueArgs Empty => new GetQueueArgs();
    }

    public sealed class GetQueueInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Reference to the hosting Amazon Connect Instance
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// Returns information on a specific Queue by name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Returns information on a specific Queue by Queue id
        /// </summary>
        [Input("queueId")]
        public Input<string>? QueueId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags assigned to the Queue.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetQueueInvokeArgs()
        {
        }
        public static new GetQueueInvokeArgs Empty => new GetQueueInvokeArgs();
    }


    [OutputType]
    public sealed class GetQueueResult
    {
        /// <summary>
        /// ARN of the Queue.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// Description of the Queue.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Specifies the identifier of the Hours of Operation.
        /// </summary>
        public readonly string HoursOfOperationId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string InstanceId;
        /// <summary>
        /// Maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
        /// </summary>
        public readonly int MaxContacts;
        public readonly string Name;
        /// <summary>
        /// A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetQueueOutboundCallerConfigResult> OutboundCallerConfigs;
        /// <summary>
        /// Identifier for the Queue.
        /// </summary>
        public readonly string QueueId;
        /// <summary>
        /// Description of the Queue. Values are `ENABLED` or `DISABLED`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Map of tags assigned to the Queue.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetQueueResult(
            string arn,

            string description,

            string hoursOfOperationId,

            string id,

            string instanceId,

            int maxContacts,

            string name,

            ImmutableArray<Outputs.GetQueueOutboundCallerConfigResult> outboundCallerConfigs,

            string queueId,

            string status,

            ImmutableDictionary<string, string> tags)
        {
            Arn = arn;
            Description = description;
            HoursOfOperationId = hoursOfOperationId;
            Id = id;
            InstanceId = instanceId;
            MaxContacts = maxContacts;
            Name = name;
            OutboundCallerConfigs = outboundCallerConfigs;
            QueueId = queueId;
            Status = status;
            Tags = tags;
        }
    }
}
