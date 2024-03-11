// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Iam
{
    public static class GetServerCertificate
    {
        /// <summary>
        /// Use this data source to lookup information about IAM Server Certificates.
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
        ///     var my_domain = Aws.Iam.GetServerCertificate.Invoke(new()
        ///     {
        ///         NamePrefix = "my-domain.org",
        ///         Latest = true,
        ///     });
        /// 
        ///     var elb = new Aws.Elb.LoadBalancer("elb", new()
        ///     {
        ///         Name = "my-domain-elb",
        ///         Listeners = new[]
        ///         {
        ///             new Aws.Elb.Inputs.LoadBalancerListenerArgs
        ///             {
        ///                 InstancePort = 8000,
        ///                 InstanceProtocol = "https",
        ///                 LbPort = 443,
        ///                 LbProtocol = "https",
        ///                 SslCertificateId = my_domain.Apply(my_domain =&gt; my_domain.Apply(getServerCertificateResult =&gt; getServerCertificateResult.Arn)),
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetServerCertificateResult> InvokeAsync(GetServerCertificateArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServerCertificateResult>("aws:iam/getServerCertificate:getServerCertificate", args ?? new GetServerCertificateArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to lookup information about IAM Server Certificates.
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
        ///     var my_domain = Aws.Iam.GetServerCertificate.Invoke(new()
        ///     {
        ///         NamePrefix = "my-domain.org",
        ///         Latest = true,
        ///     });
        /// 
        ///     var elb = new Aws.Elb.LoadBalancer("elb", new()
        ///     {
        ///         Name = "my-domain-elb",
        ///         Listeners = new[]
        ///         {
        ///             new Aws.Elb.Inputs.LoadBalancerListenerArgs
        ///             {
        ///                 InstancePort = 8000,
        ///                 InstanceProtocol = "https",
        ///                 LbPort = 443,
        ///                 LbProtocol = "https",
        ///                 SslCertificateId = my_domain.Apply(my_domain =&gt; my_domain.Apply(getServerCertificateResult =&gt; getServerCertificateResult.Arn)),
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetServerCertificateResult> Invoke(GetServerCertificateInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServerCertificateResult>("aws:iam/getServerCertificate:getServerCertificate", args ?? new GetServerCertificateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServerCertificateArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// sort results by expiration date. returns the certificate with expiration date in furthest in the future.
        /// </summary>
        [Input("latest")]
        public bool? Latest { get; set; }

        /// <summary>
        /// exact name of the cert to lookup
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// prefix of cert to filter by
        /// </summary>
        [Input("namePrefix")]
        public string? NamePrefix { get; set; }

        /// <summary>
        /// prefix of path to filter by
        /// </summary>
        [Input("pathPrefix")]
        public string? PathPrefix { get; set; }

        public GetServerCertificateArgs()
        {
        }
        public static new GetServerCertificateArgs Empty => new GetServerCertificateArgs();
    }

    public sealed class GetServerCertificateInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// sort results by expiration date. returns the certificate with expiration date in furthest in the future.
        /// </summary>
        [Input("latest")]
        public Input<bool>? Latest { get; set; }

        /// <summary>
        /// exact name of the cert to lookup
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// prefix of cert to filter by
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// prefix of path to filter by
        /// </summary>
        [Input("pathPrefix")]
        public Input<string>? PathPrefix { get; set; }

        public GetServerCertificateInvokeArgs()
        {
        }
        public static new GetServerCertificateInvokeArgs Empty => new GetServerCertificateInvokeArgs();
    }


    [OutputType]
    public sealed class GetServerCertificateResult
    {
        /// <summary>
        /// is set to the ARN of the IAM Server Certificate
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// is the public key certificate (PEM-encoded). This is useful when [configuring back-end instance authentication](http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-create-https-ssl-load-balancer.html) policy for load balancer
        /// </summary>
        public readonly string CertificateBody;
        /// <summary>
        /// is the public key certificate chain (PEM-encoded) if exists, empty otherwise
        /// </summary>
        public readonly string CertificateChain;
        /// <summary>
        /// is set to the expiration date of the IAM Server Certificate
        /// </summary>
        public readonly string ExpirationDate;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? Latest;
        public readonly string Name;
        public readonly string? NamePrefix;
        /// <summary>
        /// is set to the path of the IAM Server Certificate
        /// </summary>
        public readonly string Path;
        public readonly string? PathPrefix;
        /// <summary>
        /// is the date when the server certificate was uploaded
        /// </summary>
        public readonly string UploadDate;

        [OutputConstructor]
        private GetServerCertificateResult(
            string arn,

            string certificateBody,

            string certificateChain,

            string expirationDate,

            string id,

            bool? latest,

            string name,

            string? namePrefix,

            string path,

            string? pathPrefix,

            string uploadDate)
        {
            Arn = arn;
            CertificateBody = certificateBody;
            CertificateChain = certificateChain;
            ExpirationDate = expirationDate;
            Id = id;
            Latest = latest;
            Name = name;
            NamePrefix = namePrefix;
            Path = path;
            PathPrefix = pathPrefix;
            UploadDate = uploadDate;
        }
    }
}
