// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.VerifiedAccess.Outputs
{

    [OutputType]
    public sealed class TrustProviderOidcOptions
    {
        public readonly string? AuthorizationEndpoint;
        public readonly string? ClientId;
        public readonly string ClientSecret;
        public readonly string? Issuer;
        public readonly string? Scope;
        public readonly string? TokenEndpoint;
        public readonly string? UserInfoEndpoint;

        [OutputConstructor]
        private TrustProviderOidcOptions(
            string? authorizationEndpoint,

            string? clientId,

            string clientSecret,

            string? issuer,

            string? scope,

            string? tokenEndpoint,

            string? userInfoEndpoint)
        {
            AuthorizationEndpoint = authorizationEndpoint;
            ClientId = clientId;
            ClientSecret = clientSecret;
            Issuer = issuer;
            Scope = scope;
            TokenEndpoint = tokenEndpoint;
            UserInfoEndpoint = userInfoEndpoint;
        }
    }
}
