// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DataPipeline
{
    public static class GetPipeline
    {
        /// <summary>
        /// Provides details about a specific DataPipeline Pipeline.
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
        ///     var example = Aws.DataPipeline.GetPipeline.Invoke(new()
        ///     {
        ///         PipelineId = "pipelineID",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetPipelineResult> InvokeAsync(GetPipelineArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPipelineResult>("aws:datapipeline/getPipeline:getPipeline", args ?? new GetPipelineArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific DataPipeline Pipeline.
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
        ///     var example = Aws.DataPipeline.GetPipeline.Invoke(new()
        ///     {
        ///         PipelineId = "pipelineID",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetPipelineResult> Invoke(GetPipelineInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPipelineResult>("aws:datapipeline/getPipeline:getPipeline", args ?? new GetPipelineInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPipelineArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the pipeline.
        /// </summary>
        [Input("pipelineId", required: true)]
        public string PipelineId { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Map of tags assigned to the resource.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetPipelineArgs()
        {
        }
        public static new GetPipelineArgs Empty => new GetPipelineArgs();
    }

    public sealed class GetPipelineInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the pipeline.
        /// </summary>
        [Input("pipelineId", required: true)]
        public Input<string> PipelineId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags assigned to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetPipelineInvokeArgs()
        {
        }
        public static new GetPipelineInvokeArgs Empty => new GetPipelineInvokeArgs();
    }


    [OutputType]
    public sealed class GetPipelineResult
    {
        /// <summary>
        /// Description of Pipeline.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of Pipeline.
        /// </summary>
        public readonly string Name;
        public readonly string PipelineId;
        /// <summary>
        /// Map of tags assigned to the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetPipelineResult(
            string description,

            string id,

            string name,

            string pipelineId,

            ImmutableDictionary<string, string> tags)
        {
            Description = description;
            Id = id;
            Name = name;
            PipelineId = pipelineId;
            Tags = tags;
        }
    }
}
