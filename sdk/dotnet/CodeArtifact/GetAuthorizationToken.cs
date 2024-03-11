// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CodeArtifact
{
    public static class GetAuthorizationToken
    {
        /// <summary>
        /// The CodeArtifact Authorization Token data source generates a temporary authentication token for accessing repositories in a CodeArtifact domain.
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
        ///     var test = Aws.CodeArtifact.GetAuthorizationToken.Invoke(new()
        ///     {
        ///         Domain = testAwsCodeartifactDomain.Domain,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetAuthorizationTokenResult> InvokeAsync(GetAuthorizationTokenArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAuthorizationTokenResult>("aws:codeartifact/getAuthorizationToken:getAuthorizationToken", args ?? new GetAuthorizationTokenArgs(), options.WithDefaults());

        /// <summary>
        /// The CodeArtifact Authorization Token data source generates a temporary authentication token for accessing repositories in a CodeArtifact domain.
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
        ///     var test = Aws.CodeArtifact.GetAuthorizationToken.Invoke(new()
        ///     {
        ///         Domain = testAwsCodeartifactDomain.Domain,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetAuthorizationTokenResult> Invoke(GetAuthorizationTokenInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAuthorizationTokenResult>("aws:codeartifact/getAuthorizationToken:getAuthorizationToken", args ?? new GetAuthorizationTokenInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAuthorizationTokenArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the domain that is in scope for the generated authorization token.
        /// </summary>
        [Input("domain", required: true)]
        public string Domain { get; set; } = null!;

        /// <summary>
        /// Account number of the AWS account that owns the domain.
        /// </summary>
        [Input("domainOwner")]
        public string? DomainOwner { get; set; }

        /// <summary>
        /// Time, in seconds, that the generated authorization token is valid. Valid values are `0` and between `900` and `43200`.
        /// </summary>
        [Input("durationSeconds")]
        public int? DurationSeconds { get; set; }

        public GetAuthorizationTokenArgs()
        {
        }
        public static new GetAuthorizationTokenArgs Empty => new GetAuthorizationTokenArgs();
    }

    public sealed class GetAuthorizationTokenInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the domain that is in scope for the generated authorization token.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        /// <summary>
        /// Account number of the AWS account that owns the domain.
        /// </summary>
        [Input("domainOwner")]
        public Input<string>? DomainOwner { get; set; }

        /// <summary>
        /// Time, in seconds, that the generated authorization token is valid. Valid values are `0` and between `900` and `43200`.
        /// </summary>
        [Input("durationSeconds")]
        public Input<int>? DurationSeconds { get; set; }

        public GetAuthorizationTokenInvokeArgs()
        {
        }
        public static new GetAuthorizationTokenInvokeArgs Empty => new GetAuthorizationTokenInvokeArgs();
    }


    [OutputType]
    public sealed class GetAuthorizationTokenResult
    {
        /// <summary>
        /// Temporary authorization token.
        /// </summary>
        public readonly string AuthorizationToken;
        public readonly string Domain;
        public readonly string DomainOwner;
        public readonly int? DurationSeconds;
        /// <summary>
        /// Time in UTC RFC3339 format when the authorization token expires.
        /// </summary>
        public readonly string Expiration;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetAuthorizationTokenResult(
            string authorizationToken,

            string domain,

            string domainOwner,

            int? durationSeconds,

            string expiration,

            string id)
        {
            AuthorizationToken = authorizationToken;
            Domain = domain;
            DomainOwner = domainOwner;
            DurationSeconds = durationSeconds;
            Expiration = expiration;
            Id = id;
        }
    }
}
