// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lambda
{
    /// <summary>
    /// Provides a Lambda function URL resource. A function URL is a dedicated HTTP(S) endpoint for a Lambda function.
    /// 
    /// See the [AWS Lambda documentation](https://docs.aws.amazon.com/lambda/latest/dg/lambda-urls.html) for more information.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testLatest = new Aws.Lambda.FunctionUrl("test_latest", new()
    ///     {
    ///         FunctionName = test.FunctionName,
    ///         AuthorizationType = "NONE",
    ///     });
    /// 
    ///     var testLive = new Aws.Lambda.FunctionUrl("test_live", new()
    ///     {
    ///         FunctionName = test.FunctionName,
    ///         Qualifier = "my_alias",
    ///         AuthorizationType = "AWS_IAM",
    ///         Cors = new Aws.Lambda.Inputs.FunctionUrlCorsArgs
    ///         {
    ///             AllowCredentials = true,
    ///             AllowOrigins = new[]
    ///             {
    ///                 "*",
    ///             },
    ///             AllowMethods = new[]
    ///             {
    ///                 "*",
    ///             },
    ///             AllowHeaders = new[]
    ///             {
    ///                 "date",
    ///                 "keep-alive",
    ///             },
    ///             ExposeHeaders = new[]
    ///             {
    ///                 "keep-alive",
    ///                 "date",
    ///             },
    ///             MaxAge = 86400,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Lambda function URLs using the `function_name` or `function_name/qualifier`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:lambda/functionUrl:FunctionUrl test_lambda_url my_test_lambda_function
    /// ```
    /// </summary>
    [AwsResourceType("aws:lambda/functionUrl:FunctionUrl")]
    public partial class FunctionUrl : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The type of authentication that the function URL uses. Set to `"AWS_IAM"` to restrict access to authenticated IAM users only. Set to `"NONE"` to bypass IAM authentication and create a public endpoint. See the [AWS documentation](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) for more details.
        /// </summary>
        [Output("authorizationType")]
        public Output<string> AuthorizationType { get; private set; } = null!;

        /// <summary>
        /// The [cross-origin resource sharing (CORS)](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) settings for the function URL. Documented below.
        /// </summary>
        [Output("cors")]
        public Output<Outputs.FunctionUrlCors?> Cors { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the function.
        /// </summary>
        [Output("functionArn")]
        public Output<string> FunctionArn { get; private set; } = null!;

        /// <summary>
        /// The name (or ARN) of the Lambda function.
        /// </summary>
        [Output("functionName")]
        public Output<string> FunctionName { get; private set; } = null!;

        /// <summary>
        /// The HTTP URL endpoint for the function in the format `https://&lt;url_id&gt;.lambda-url.&lt;region&gt;.on.aws/`.
        /// </summary>
        [Output("functionUrl")]
        public Output<string> FunctionUrlResult { get; private set; } = null!;

        /// <summary>
        /// Determines how the Lambda function responds to an invocation. Valid values are `BUFFERED` (default) and `RESPONSE_STREAM`. See more in [Configuring a Lambda function to stream responses](https://docs.aws.amazon.com/lambda/latest/dg/configuration-response-streaming.html).
        /// </summary>
        [Output("invokeMode")]
        public Output<string?> InvokeMode { get; private set; } = null!;

        /// <summary>
        /// The alias name or `"$LATEST"`.
        /// </summary>
        [Output("qualifier")]
        public Output<string?> Qualifier { get; private set; } = null!;

        /// <summary>
        /// A generated ID for the endpoint.
        /// </summary>
        [Output("urlId")]
        public Output<string> UrlId { get; private set; } = null!;


        /// <summary>
        /// Create a FunctionUrl resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FunctionUrl(string name, FunctionUrlArgs args, CustomResourceOptions? options = null)
            : base("aws:lambda/functionUrl:FunctionUrl", name, args ?? new FunctionUrlArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FunctionUrl(string name, Input<string> id, FunctionUrlState? state = null, CustomResourceOptions? options = null)
            : base("aws:lambda/functionUrl:FunctionUrl", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing FunctionUrl resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FunctionUrl Get(string name, Input<string> id, FunctionUrlState? state = null, CustomResourceOptions? options = null)
        {
            return new FunctionUrl(name, id, state, options);
        }
    }

    public sealed class FunctionUrlArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of authentication that the function URL uses. Set to `"AWS_IAM"` to restrict access to authenticated IAM users only. Set to `"NONE"` to bypass IAM authentication and create a public endpoint. See the [AWS documentation](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) for more details.
        /// </summary>
        [Input("authorizationType", required: true)]
        public Input<string> AuthorizationType { get; set; } = null!;

        /// <summary>
        /// The [cross-origin resource sharing (CORS)](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) settings for the function URL. Documented below.
        /// </summary>
        [Input("cors")]
        public Input<Inputs.FunctionUrlCorsArgs>? Cors { get; set; }

        /// <summary>
        /// The name (or ARN) of the Lambda function.
        /// </summary>
        [Input("functionName", required: true)]
        public Input<string> FunctionName { get; set; } = null!;

        /// <summary>
        /// Determines how the Lambda function responds to an invocation. Valid values are `BUFFERED` (default) and `RESPONSE_STREAM`. See more in [Configuring a Lambda function to stream responses](https://docs.aws.amazon.com/lambda/latest/dg/configuration-response-streaming.html).
        /// </summary>
        [Input("invokeMode")]
        public Input<string>? InvokeMode { get; set; }

        /// <summary>
        /// The alias name or `"$LATEST"`.
        /// </summary>
        [Input("qualifier")]
        public Input<string>? Qualifier { get; set; }

        public FunctionUrlArgs()
        {
        }
        public static new FunctionUrlArgs Empty => new FunctionUrlArgs();
    }

    public sealed class FunctionUrlState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of authentication that the function URL uses. Set to `"AWS_IAM"` to restrict access to authenticated IAM users only. Set to `"NONE"` to bypass IAM authentication and create a public endpoint. See the [AWS documentation](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) for more details.
        /// </summary>
        [Input("authorizationType")]
        public Input<string>? AuthorizationType { get; set; }

        /// <summary>
        /// The [cross-origin resource sharing (CORS)](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) settings for the function URL. Documented below.
        /// </summary>
        [Input("cors")]
        public Input<Inputs.FunctionUrlCorsGetArgs>? Cors { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the function.
        /// </summary>
        [Input("functionArn")]
        public Input<string>? FunctionArn { get; set; }

        /// <summary>
        /// The name (or ARN) of the Lambda function.
        /// </summary>
        [Input("functionName")]
        public Input<string>? FunctionName { get; set; }

        /// <summary>
        /// The HTTP URL endpoint for the function in the format `https://&lt;url_id&gt;.lambda-url.&lt;region&gt;.on.aws/`.
        /// </summary>
        [Input("functionUrl")]
        public Input<string>? FunctionUrlResult { get; set; }

        /// <summary>
        /// Determines how the Lambda function responds to an invocation. Valid values are `BUFFERED` (default) and `RESPONSE_STREAM`. See more in [Configuring a Lambda function to stream responses](https://docs.aws.amazon.com/lambda/latest/dg/configuration-response-streaming.html).
        /// </summary>
        [Input("invokeMode")]
        public Input<string>? InvokeMode { get; set; }

        /// <summary>
        /// The alias name or `"$LATEST"`.
        /// </summary>
        [Input("qualifier")]
        public Input<string>? Qualifier { get; set; }

        /// <summary>
        /// A generated ID for the endpoint.
        /// </summary>
        [Input("urlId")]
        public Input<string>? UrlId { get; set; }

        public FunctionUrlState()
        {
        }
        public static new FunctionUrlState Empty => new FunctionUrlState();
    }
}
