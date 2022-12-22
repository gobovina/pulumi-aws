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
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
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
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCallerIdentityResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCallerIdentityResult>("aws:index/getCallerIdentity:getCallerIdentity", InvokeArgs.Empty, options.WithDefaults());
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
        /// The provider-assigned unique ID for this managed resource.
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
