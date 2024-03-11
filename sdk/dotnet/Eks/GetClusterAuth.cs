// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Eks
{
    public static class GetClusterAuth
    {
        /// <summary>
        /// Get an authentication token to communicate with an EKS cluster.
        /// 
        /// Uses IAM credentials from the AWS provider to generate a temporary token that is compatible with
        /// [AWS IAM Authenticator](https://github.com/kubernetes-sigs/aws-iam-authenticator) authentication.
        /// This can be used to authenticate to an EKS cluster or to a cluster that has the AWS IAM Authenticator
        /// server configured.
        /// 
        /// 
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
        ///     var example = Aws.Eks.GetCluster.Invoke(new()
        ///     {
        ///         Name = "example",
        ///     });
        /// 
        ///     var exampleGetClusterAuth = Aws.Eks.GetClusterAuth.Invoke(new()
        ///     {
        ///         Name = "example",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetClusterAuthResult> InvokeAsync(GetClusterAuthArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetClusterAuthResult>("aws:eks/getClusterAuth:getClusterAuth", args ?? new GetClusterAuthArgs(), options.WithDefaults());

        /// <summary>
        /// Get an authentication token to communicate with an EKS cluster.
        /// 
        /// Uses IAM credentials from the AWS provider to generate a temporary token that is compatible with
        /// [AWS IAM Authenticator](https://github.com/kubernetes-sigs/aws-iam-authenticator) authentication.
        /// This can be used to authenticate to an EKS cluster or to a cluster that has the AWS IAM Authenticator
        /// server configured.
        /// 
        /// 
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
        ///     var example = Aws.Eks.GetCluster.Invoke(new()
        ///     {
        ///         Name = "example",
        ///     });
        /// 
        ///     var exampleGetClusterAuth = Aws.Eks.GetClusterAuth.Invoke(new()
        ///     {
        ///         Name = "example",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetClusterAuthResult> Invoke(GetClusterAuthInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetClusterAuthResult>("aws:eks/getClusterAuth:getClusterAuth", args ?? new GetClusterAuthInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClusterAuthArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the cluster
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetClusterAuthArgs()
        {
        }
        public static new GetClusterAuthArgs Empty => new GetClusterAuthArgs();
    }

    public sealed class GetClusterAuthInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the cluster
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetClusterAuthInvokeArgs()
        {
        }
        public static new GetClusterAuthInvokeArgs Empty => new GetClusterAuthInvokeArgs();
    }


    [OutputType]
    public sealed class GetClusterAuthResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// Token to use to authenticate with the cluster.
        /// </summary>
        public readonly string Token;

        [OutputConstructor]
        private GetClusterAuthResult(
            string id,

            string name,

            string token)
        {
            Id = id;
            Name = name;
            Token = token;
        }
    }
}
