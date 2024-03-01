// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Cognito
{
    public static class GetUserPools
    {
        /// <summary>
        /// Use this data source to get a list of cognito user pools.
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
        ///     var selected = Aws.ApiGateway.GetRestApi.Invoke(new()
        ///     {
        ///         Name = apiGatewayName,
        ///     });
        /// 
        ///     var selectedGetUserPools = Aws.Cognito.GetUserPools.Invoke(new()
        ///     {
        ///         Name = cognitoUserPoolName,
        ///     });
        /// 
        ///     var cognito = new Aws.ApiGateway.Authorizer("cognito", new()
        ///     {
        ///         Name = "cognito",
        ///         Type = "COGNITO_USER_POOLS",
        ///         RestApi = selected.Apply(getRestApiResult =&gt; getRestApiResult.Id),
        ///         ProviderArns = selectedGetUserPools.Apply(getUserPoolsResult =&gt; getUserPoolsResult.Arns),
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetUserPoolsResult> InvokeAsync(GetUserPoolsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUserPoolsResult>("aws:cognito/getUserPools:getUserPools", args ?? new GetUserPoolsArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get a list of cognito user pools.
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
        ///     var selected = Aws.ApiGateway.GetRestApi.Invoke(new()
        ///     {
        ///         Name = apiGatewayName,
        ///     });
        /// 
        ///     var selectedGetUserPools = Aws.Cognito.GetUserPools.Invoke(new()
        ///     {
        ///         Name = cognitoUserPoolName,
        ///     });
        /// 
        ///     var cognito = new Aws.ApiGateway.Authorizer("cognito", new()
        ///     {
        ///         Name = "cognito",
        ///         Type = "COGNITO_USER_POOLS",
        ///         RestApi = selected.Apply(getRestApiResult =&gt; getRestApiResult.Id),
        ///         ProviderArns = selectedGetUserPools.Apply(getUserPoolsResult =&gt; getUserPoolsResult.Arns),
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetUserPoolsResult> Invoke(GetUserPoolsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUserPoolsResult>("aws:cognito/getUserPools:getUserPools", args ?? new GetUserPoolsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUserPoolsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the cognito user pools. Name is not a unique attribute for cognito user pool, so multiple pools might be returned with given name. If the pool name is expected to be unique, you can reference the pool id via ```tolist(data.aws_cognito_user_pools.selected.ids)[0]```
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetUserPoolsArgs()
        {
        }
        public static new GetUserPoolsArgs Empty => new GetUserPoolsArgs();
    }

    public sealed class GetUserPoolsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the cognito user pools. Name is not a unique attribute for cognito user pool, so multiple pools might be returned with given name. If the pool name is expected to be unique, you can reference the pool id via ```tolist(data.aws_cognito_user_pools.selected.ids)[0]```
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetUserPoolsInvokeArgs()
        {
        }
        public static new GetUserPoolsInvokeArgs Empty => new GetUserPoolsInvokeArgs();
    }


    [OutputType]
    public sealed class GetUserPoolsResult
    {
        /// <summary>
        /// Set of cognito user pool Amazon Resource Names (ARNs).
        /// </summary>
        public readonly ImmutableArray<string> Arns;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Set of cognito user pool ids.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string Name;

        [OutputConstructor]
        private GetUserPoolsResult(
            ImmutableArray<string> arns,

            string id,

            ImmutableArray<string> ids,

            string name)
        {
            Arns = arns;
            Id = id;
            Ids = ids;
            Name = name;
        }
    }
}
