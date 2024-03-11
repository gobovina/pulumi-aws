// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.VpcLattice
{
    public static class GetListener
    {
        /// <summary>
        /// Data source for managing an AWS VPC Lattice Listener.
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
        ///     var example = Aws.VpcLattice.GetListener.Invoke();
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetListenerResult> InvokeAsync(GetListenerArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetListenerResult>("aws:vpclattice/getListener:getListener", args ?? new GetListenerArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for managing an AWS VPC Lattice Listener.
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
        ///     var example = Aws.VpcLattice.GetListener.Invoke();
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetListenerResult> Invoke(GetListenerInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetListenerResult>("aws:vpclattice/getListener:getListener", args ?? new GetListenerInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetListenerArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID or Amazon Resource Name (ARN) of the listener
        /// </summary>
        [Input("listenerIdentifier", required: true)]
        public string ListenerIdentifier { get; set; } = null!;

        /// <summary>
        /// ID or Amazon Resource Name (ARN) of the service network
        /// </summary>
        [Input("serviceIdentifier", required: true)]
        public string ServiceIdentifier { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// List of tags associated with the listener.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetListenerArgs()
        {
        }
        public static new GetListenerArgs Empty => new GetListenerArgs();
    }

    public sealed class GetListenerInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID or Amazon Resource Name (ARN) of the listener
        /// </summary>
        [Input("listenerIdentifier", required: true)]
        public Input<string> ListenerIdentifier { get; set; } = null!;

        /// <summary>
        /// ID or Amazon Resource Name (ARN) of the service network
        /// </summary>
        [Input("serviceIdentifier", required: true)]
        public Input<string> ServiceIdentifier { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// List of tags associated with the listener.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetListenerInvokeArgs()
        {
        }
        public static new GetListenerInvokeArgs Empty => new GetListenerInvokeArgs();
    }


    [OutputType]
    public sealed class GetListenerResult
    {
        /// <summary>
        /// ARN of the listener.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// The date and time that the listener was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The actions for the default listener rule.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetListenerDefaultActionResult> DefaultActions;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The date and time the listener was last updated.
        /// </summary>
        public readonly string LastUpdatedAt;
        /// <summary>
        /// The ID of the listener.
        /// </summary>
        public readonly string ListenerId;
        public readonly string ListenerIdentifier;
        /// <summary>
        /// The name of the listener.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The listener port.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// The listener protocol. Either `HTTPS` or `HTTP`.
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// The ARN of the service.
        /// </summary>
        public readonly string ServiceArn;
        /// <summary>
        /// The ID of the service.
        /// </summary>
        public readonly string ServiceId;
        public readonly string ServiceIdentifier;
        /// <summary>
        /// List of tags associated with the listener.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetListenerResult(
            string arn,

            string createdAt,

            ImmutableArray<Outputs.GetListenerDefaultActionResult> defaultActions,

            string id,

            string lastUpdatedAt,

            string listenerId,

            string listenerIdentifier,

            string name,

            int port,

            string protocol,

            string serviceArn,

            string serviceId,

            string serviceIdentifier,

            ImmutableDictionary<string, string> tags)
        {
            Arn = arn;
            CreatedAt = createdAt;
            DefaultActions = defaultActions;
            Id = id;
            LastUpdatedAt = lastUpdatedAt;
            ListenerId = listenerId;
            ListenerIdentifier = listenerIdentifier;
            Name = name;
            Port = port;
            Protocol = protocol;
            ServiceArn = serviceArn;
            ServiceId = serviceId;
            ServiceIdentifier = serviceIdentifier;
            Tags = tags;
        }
    }
}
