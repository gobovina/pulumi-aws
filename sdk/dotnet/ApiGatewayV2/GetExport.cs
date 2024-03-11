// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ApiGatewayV2
{
    public static class GetExport
    {
        /// <summary>
        /// Exports a definition of an API in a particular output format and specification.
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
        ///     var test = Aws.ApiGatewayV2.GetExport.Invoke(new()
        ///     {
        ///         ApiId = testAwsApigatewayv2Route.ApiId,
        ///         Specification = "OAS30",
        ///         OutputType = "JSON",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetExportResult> InvokeAsync(GetExportArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetExportResult>("aws:apigatewayv2/getExport:getExport", args ?? new GetExportArgs(), options.WithDefaults());

        /// <summary>
        /// Exports a definition of an API in a particular output format and specification.
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
        ///     var test = Aws.ApiGatewayV2.GetExport.Invoke(new()
        ///     {
        ///         ApiId = testAwsApigatewayv2Route.ApiId,
        ///         Specification = "OAS30",
        ///         OutputType = "JSON",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetExportResult> Invoke(GetExportInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetExportResult>("aws:apigatewayv2/getExport:getExport", args ?? new GetExportInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetExportArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// API identifier.
        /// </summary>
        [Input("apiId", required: true)]
        public string ApiId { get; set; } = null!;

        /// <summary>
        /// Version of the API Gateway export algorithm. API Gateway uses the latest version by default. Currently, the only supported version is `1.0`.
        /// </summary>
        [Input("exportVersion")]
        public string? ExportVersion { get; set; }

        /// <summary>
        /// Whether to include API Gateway extensions in the exported API definition. API Gateway extensions are included by default.
        /// </summary>
        [Input("includeExtensions")]
        public bool? IncludeExtensions { get; set; }

        /// <summary>
        /// Output type of the exported definition file. Valid values are `JSON` and `YAML`.
        /// </summary>
        [Input("outputType", required: true)]
        public string OutputType { get; set; } = null!;

        /// <summary>
        /// Version of the API specification to use. `OAS30`, for OpenAPI 3.0, is the only supported value.
        /// </summary>
        [Input("specification", required: true)]
        public string Specification { get; set; } = null!;

        /// <summary>
        /// Name of the API stage to export. If you don't specify this property, a representation of the latest API configuration is exported.
        /// </summary>
        [Input("stageName")]
        public string? StageName { get; set; }

        public GetExportArgs()
        {
        }
        public static new GetExportArgs Empty => new GetExportArgs();
    }

    public sealed class GetExportInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// API identifier.
        /// </summary>
        [Input("apiId", required: true)]
        public Input<string> ApiId { get; set; } = null!;

        /// <summary>
        /// Version of the API Gateway export algorithm. API Gateway uses the latest version by default. Currently, the only supported version is `1.0`.
        /// </summary>
        [Input("exportVersion")]
        public Input<string>? ExportVersion { get; set; }

        /// <summary>
        /// Whether to include API Gateway extensions in the exported API definition. API Gateway extensions are included by default.
        /// </summary>
        [Input("includeExtensions")]
        public Input<bool>? IncludeExtensions { get; set; }

        /// <summary>
        /// Output type of the exported definition file. Valid values are `JSON` and `YAML`.
        /// </summary>
        [Input("outputType", required: true)]
        public Input<string> OutputType { get; set; } = null!;

        /// <summary>
        /// Version of the API specification to use. `OAS30`, for OpenAPI 3.0, is the only supported value.
        /// </summary>
        [Input("specification", required: true)]
        public Input<string> Specification { get; set; } = null!;

        /// <summary>
        /// Name of the API stage to export. If you don't specify this property, a representation of the latest API configuration is exported.
        /// </summary>
        [Input("stageName")]
        public Input<string>? StageName { get; set; }

        public GetExportInvokeArgs()
        {
        }
        public static new GetExportInvokeArgs Empty => new GetExportInvokeArgs();
    }


    [OutputType]
    public sealed class GetExportResult
    {
        public readonly string ApiId;
        /// <summary>
        /// ID of the API.
        /// </summary>
        public readonly string Body;
        public readonly string? ExportVersion;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? IncludeExtensions;
        public readonly string OutputType;
        public readonly string Specification;
        public readonly string? StageName;

        [OutputConstructor]
        private GetExportResult(
            string apiId,

            string body,

            string? exportVersion,

            string id,

            bool? includeExtensions,

            string outputType,

            string specification,

            string? stageName)
        {
            ApiId = apiId;
            Body = body;
            ExportVersion = exportVersion;
            Id = id;
            IncludeExtensions = includeExtensions;
            OutputType = outputType;
            Specification = specification;
            StageName = stageName;
        }
    }
}
