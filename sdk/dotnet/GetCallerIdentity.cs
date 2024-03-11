// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws
{
    public static class GetCallerIdentity
    {
        /// <summary>
        /// Use this data source to get the access to the effective Account ID, User ID, and ARN in
        /// which this provider is authorized.
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
        ///     var current = Aws.GetCallerIdentity.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["accountId"] = current.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.AccountId),
        ///         ["callerArn"] = current.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.Arn),
        ///         ["callerUser"] = current.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.UserId),
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetCallerIdentityResult> InvokeAsync(GetCallerIdentityArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCallerIdentityResult>("aws:index/getCallerIdentity:getCallerIdentity", args ?? new GetCallerIdentityArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get the access to the effective Account ID, User ID, and ARN in
        /// which this provider is authorized.
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
        ///     var current = Aws.GetCallerIdentity.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["accountId"] = current.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.AccountId),
        ///         ["callerArn"] = current.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.Arn),
        ///         ["callerUser"] = current.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.UserId),
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetCallerIdentityResult> Invoke(GetCallerIdentityInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCallerIdentityResult>("aws:index/getCallerIdentity:getCallerIdentity", args ?? new GetCallerIdentityInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCallerIdentityArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account ID number of the account that owns or contains the calling entity.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetCallerIdentityArgs()
        {
        }
        public static new GetCallerIdentityArgs Empty => new GetCallerIdentityArgs();
    }

    public sealed class GetCallerIdentityInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Account ID number of the account that owns or contains the calling entity.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetCallerIdentityInvokeArgs()
        {
        }
        public static new GetCallerIdentityInvokeArgs Empty => new GetCallerIdentityInvokeArgs();
    }


    [OutputType]
    public sealed class GetCallerIdentityResult
    {
        /// <summary>
        /// AWS Account ID number of the account that owns or contains the calling entity.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// ARN associated with the calling entity.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// Account ID number of the account that owns or contains the calling entity.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the calling entity.
        /// </summary>
        public readonly string UserId;

        [OutputConstructor]
        private GetCallerIdentityResult(
            string accountId,

            string arn,

            string id,

            string userId)
        {
            AccountId = accountId;
            Arn = arn;
            Id = id;
            UserId = userId;
        }
    }
}
