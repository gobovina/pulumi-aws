// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sfn
{
    public static class GetActivity
    {
        /// <summary>
        /// Provides a Step Functions Activity data source
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
        ///     var sfnActivity = Aws.Sfn.GetActivity.Invoke(new()
        ///     {
        ///         Name = "my-activity",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetActivityResult> InvokeAsync(GetActivityArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetActivityResult>("aws:sfn/getActivity:getActivity", args ?? new GetActivityArgs(), options.WithDefaults());

        /// <summary>
        /// Provides a Step Functions Activity data source
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
        ///     var sfnActivity = Aws.Sfn.GetActivity.Invoke(new()
        ///     {
        ///         Name = "my-activity",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetActivityResult> Invoke(GetActivityInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetActivityResult>("aws:sfn/getActivity:getActivity", args ?? new GetActivityInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetActivityArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ARN that identifies the activity.
        /// </summary>
        [Input("arn")]
        public string? Arn { get; set; }

        /// <summary>
        /// Name that identifies the activity.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetActivityArgs()
        {
        }
        public static new GetActivityArgs Empty => new GetActivityArgs();
    }

    public sealed class GetActivityInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ARN that identifies the activity.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Name that identifies the activity.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetActivityInvokeArgs()
        {
        }
        public static new GetActivityInvokeArgs Empty => new GetActivityInvokeArgs();
    }


    [OutputType]
    public sealed class GetActivityResult
    {
        public readonly string Arn;
        /// <summary>
        /// Date the activity was created.
        /// </summary>
        public readonly string CreationDate;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetActivityResult(
            string arn,

            string creationDate,

            string id,

            string name)
        {
            Arn = arn;
            CreationDate = creationDate;
            Id = id;
            Name = name;
        }
    }
}
