// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Cognito
{
    public static class GetUserPoolSigningCertificate
    {
        /// <summary>
        /// Use this data source to get the signing certificate for a Cognito IdP user pool.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var sc = Aws.Cognito.GetUserPoolSigningCertificate.Invoke(new()
        ///     {
        ///         UserPoolId = myPool.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetUserPoolSigningCertificateResult> InvokeAsync(GetUserPoolSigningCertificateArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUserPoolSigningCertificateResult>("aws:cognito/getUserPoolSigningCertificate:getUserPoolSigningCertificate", args ?? new GetUserPoolSigningCertificateArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get the signing certificate for a Cognito IdP user pool.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var sc = Aws.Cognito.GetUserPoolSigningCertificate.Invoke(new()
        ///     {
        ///         UserPoolId = myPool.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetUserPoolSigningCertificateResult> Invoke(GetUserPoolSigningCertificateInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUserPoolSigningCertificateResult>("aws:cognito/getUserPoolSigningCertificate:getUserPoolSigningCertificate", args ?? new GetUserPoolSigningCertificateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUserPoolSigningCertificateArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cognito user pool ID.
        /// </summary>
        [Input("userPoolId", required: true)]
        public string UserPoolId { get; set; } = null!;

        public GetUserPoolSigningCertificateArgs()
        {
        }
        public static new GetUserPoolSigningCertificateArgs Empty => new GetUserPoolSigningCertificateArgs();
    }

    public sealed class GetUserPoolSigningCertificateInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cognito user pool ID.
        /// </summary>
        [Input("userPoolId", required: true)]
        public Input<string> UserPoolId { get; set; } = null!;

        public GetUserPoolSigningCertificateInvokeArgs()
        {
        }
        public static new GetUserPoolSigningCertificateInvokeArgs Empty => new GetUserPoolSigningCertificateInvokeArgs();
    }


    [OutputType]
    public sealed class GetUserPoolSigningCertificateResult
    {
        /// <summary>
        /// Certificate string
        /// </summary>
        public readonly string Certificate;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string UserPoolId;

        [OutputConstructor]
        private GetUserPoolSigningCertificateResult(
            string certificate,

            string id,

            string userPoolId)
        {
            Certificate = certificate;
            Id = id;
            UserPoolId = userPoolId;
        }
    }
}
