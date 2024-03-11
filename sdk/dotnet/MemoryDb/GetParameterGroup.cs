// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MemoryDb
{
    public static class GetParameterGroup
    {
        /// <summary>
        /// Provides information about a MemoryDB Parameter Group.
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
        ///     var example = Aws.MemoryDb.GetParameterGroup.Invoke(new()
        ///     {
        ///         Name = "my-parameter-group",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetParameterGroupResult> InvokeAsync(GetParameterGroupArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetParameterGroupResult>("aws:memorydb/getParameterGroup:getParameterGroup", args ?? new GetParameterGroupArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a MemoryDB Parameter Group.
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
        ///     var example = Aws.MemoryDb.GetParameterGroup.Invoke(new()
        ///     {
        ///         Name = "my-parameter-group",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetParameterGroupResult> Invoke(GetParameterGroupInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetParameterGroupResult>("aws:memorydb/getParameterGroup:getParameterGroup", args ?? new GetParameterGroupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetParameterGroupArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the parameter group.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Map of tags assigned to the parameter group.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetParameterGroupArgs()
        {
        }
        public static new GetParameterGroupArgs Empty => new GetParameterGroupArgs();
    }

    public sealed class GetParameterGroupInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the parameter group.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags assigned to the parameter group.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetParameterGroupInvokeArgs()
        {
        }
        public static new GetParameterGroupInvokeArgs Empty => new GetParameterGroupInvokeArgs();
    }


    [OutputType]
    public sealed class GetParameterGroupResult
    {
        /// <summary>
        /// ARN of the parameter group.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// Description of the parameter group.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Engine version that the parameter group can be used with.
        /// </summary>
        public readonly string Family;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the parameter.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Set of user-defined MemoryDB parameters applied by the parameter group.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetParameterGroupParameterResult> Parameters;
        /// <summary>
        /// Map of tags assigned to the parameter group.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetParameterGroupResult(
            string arn,

            string description,

            string family,

            string id,

            string name,

            ImmutableArray<Outputs.GetParameterGroupParameterResult> parameters,

            ImmutableDictionary<string, string> tags)
        {
            Arn = arn;
            Description = description;
            Family = family;
            Id = id;
            Name = name;
            Parameters = parameters;
            Tags = tags;
        }
    }
}
