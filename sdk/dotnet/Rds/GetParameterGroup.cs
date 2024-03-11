// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Rds
{
    public static class GetParameterGroup
    {
        /// <summary>
        /// Information about a database parameter group.
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
        ///     var test = Aws.Rds.GetParameterGroup.Invoke(new()
        ///     {
        ///         Name = "default.postgres15",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetParameterGroupResult> InvokeAsync(GetParameterGroupArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetParameterGroupResult>("aws:rds/getParameterGroup:getParameterGroup", args ?? new GetParameterGroupArgs(), options.WithDefaults());

        /// <summary>
        /// Information about a database parameter group.
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
        ///     var test = Aws.Rds.GetParameterGroup.Invoke(new()
        ///     {
        ///         Name = "default.postgres15",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetParameterGroupResult> Invoke(GetParameterGroupInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetParameterGroupResult>("aws:rds/getParameterGroup:getParameterGroup", args ?? new GetParameterGroupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetParameterGroupArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// DB parameter group name.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetParameterGroupArgs()
        {
        }
        public static new GetParameterGroupArgs Empty => new GetParameterGroupArgs();
    }

    public sealed class GetParameterGroupInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// DB parameter group name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

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
        /// Family of the parameter group.
        /// </summary>
        public readonly string Family;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetParameterGroupResult(
            string arn,

            string description,

            string family,

            string id,

            string name)
        {
            Arn = arn;
            Description = description;
            Family = family;
            Id = id;
            Name = name;
        }
    }
}
