// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws
{
    public static class GetDefaultTags
    {
        /// <summary>
        /// Use this data source to get the default tags configured on the provider.
        /// 
        /// With this data source, you can apply default tags to resources not _directly_ managed by a resource, such as the instances underneath an Auto Scaling group or the volumes created for an EC2 instance.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.GetDefaultTags.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Dynamically Apply Default Tags to Auto Scaling Group
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.GetDefaultTags.Invoke();
        /// 
        ///     var exampleGroup = new Aws.AutoScaling.Group("example", new()
        ///     {
        ///         Tags = ,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDefaultTagsResult> InvokeAsync(GetDefaultTagsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDefaultTagsResult>("aws:index/getDefaultTags:getDefaultTags", args ?? new GetDefaultTagsArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get the default tags configured on the provider.
        /// 
        /// With this data source, you can apply default tags to resources not _directly_ managed by a resource, such as the instances underneath an Auto Scaling group or the volumes created for an EC2 instance.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// ### Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.GetDefaultTags.Invoke();
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Dynamically Apply Default Tags to Auto Scaling Group
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.GetDefaultTags.Invoke();
        /// 
        ///     var exampleGroup = new Aws.AutoScaling.Group("example", new()
        ///     {
        ///         Tags = ,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDefaultTagsResult> Invoke(GetDefaultTagsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDefaultTagsResult>("aws:index/getDefaultTags:getDefaultTags", args ?? new GetDefaultTagsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDefaultTagsArgs : global::Pulumi.InvokeArgs
    {
        [Input("id")]
        public string? Id { get; set; }

        public GetDefaultTagsArgs()
        {
        }
        public static new GetDefaultTagsArgs Empty => new GetDefaultTagsArgs();
    }

    public sealed class GetDefaultTagsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetDefaultTagsInvokeArgs()
        {
        }
        public static new GetDefaultTagsInvokeArgs Empty => new GetDefaultTagsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDefaultTagsResult
    {
        public readonly string Id;
        /// <summary>
        /// Blocks of default tags set on the provider. See details below.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetDefaultTagsResult(
            string id,

            ImmutableDictionary<string, string> tags)
        {
            Id = id;
            Tags = tags;
        }
    }
}
