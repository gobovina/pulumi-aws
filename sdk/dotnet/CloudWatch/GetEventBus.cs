// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudWatch
{
    public static class GetEventBus
    {
        /// <summary>
        /// This data source can be used to fetch information about a specific
        /// EventBridge event bus. Use this data source to compute the ARN of
        /// an event bus, given the name of the bus.
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
        ///     var example = Aws.CloudWatch.GetEventBus.Invoke(new()
        ///     {
        ///         Name = "example-bus-name",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetEventBusResult> InvokeAsync(GetEventBusArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEventBusResult>("aws:cloudwatch/getEventBus:getEventBus", args ?? new GetEventBusArgs(), options.WithDefaults());

        /// <summary>
        /// This data source can be used to fetch information about a specific
        /// EventBridge event bus. Use this data source to compute the ARN of
        /// an event bus, given the name of the bus.
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
        ///     var example = Aws.CloudWatch.GetEventBus.Invoke(new()
        ///     {
        ///         Name = "example-bus-name",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetEventBusResult> Invoke(GetEventBusInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEventBusResult>("aws:cloudwatch/getEventBus:getEventBus", args ?? new GetEventBusInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEventBusArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Friendly EventBridge event bus name.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetEventBusArgs()
        {
        }
        public static new GetEventBusArgs Empty => new GetEventBusArgs();
    }

    public sealed class GetEventBusInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Friendly EventBridge event bus name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetEventBusInvokeArgs()
        {
        }
        public static new GetEventBusInvokeArgs Empty => new GetEventBusInvokeArgs();
    }


    [OutputType]
    public sealed class GetEventBusResult
    {
        /// <summary>
        /// ARN.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetEventBusResult(
            string arn,

            string id,

            string name)
        {
            Arn = arn;
            Id = id;
            Name = name;
        }
    }
}
