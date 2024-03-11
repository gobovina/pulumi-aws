// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ApiGateway
{
    /// <summary>
    /// Manages an API Gateway Request Validator.
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
    ///     var example = new Aws.ApiGateway.RequestValidator("example", new()
    ///     {
    ///         Name = "example",
    ///         RestApi = exampleAwsApiGatewayRestApi.Id,
    ///         ValidateRequestBody = true,
    ///         ValidateRequestParameters = true,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_api_gateway_request_validator` using `REST-API-ID/REQUEST-VALIDATOR-ID`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:apigateway/requestValidator:RequestValidator example 12345abcde/67890fghij
    /// ```
    /// </summary>
    [AwsResourceType("aws:apigateway/requestValidator:RequestValidator")]
    public partial class RequestValidator : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of the request validator
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// ID of the associated Rest API
        /// </summary>
        [Output("restApi")]
        public Output<string> RestApi { get; private set; } = null!;

        /// <summary>
        /// Boolean whether to validate request body. Defaults to `false`.
        /// </summary>
        [Output("validateRequestBody")]
        public Output<bool?> ValidateRequestBody { get; private set; } = null!;

        /// <summary>
        /// Boolean whether to validate request parameters. Defaults to `false`.
        /// </summary>
        [Output("validateRequestParameters")]
        public Output<bool?> ValidateRequestParameters { get; private set; } = null!;


        /// <summary>
        /// Create a RequestValidator resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RequestValidator(string name, RequestValidatorArgs args, CustomResourceOptions? options = null)
            : base("aws:apigateway/requestValidator:RequestValidator", name, args ?? new RequestValidatorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RequestValidator(string name, Input<string> id, RequestValidatorState? state = null, CustomResourceOptions? options = null)
            : base("aws:apigateway/requestValidator:RequestValidator", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RequestValidator resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RequestValidator Get(string name, Input<string> id, RequestValidatorState? state = null, CustomResourceOptions? options = null)
        {
            return new RequestValidator(name, id, state, options);
        }
    }

    public sealed class RequestValidatorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the request validator
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of the associated Rest API
        /// </summary>
        [Input("restApi", required: true)]
        public Input<string> RestApi { get; set; } = null!;

        /// <summary>
        /// Boolean whether to validate request body. Defaults to `false`.
        /// </summary>
        [Input("validateRequestBody")]
        public Input<bool>? ValidateRequestBody { get; set; }

        /// <summary>
        /// Boolean whether to validate request parameters. Defaults to `false`.
        /// </summary>
        [Input("validateRequestParameters")]
        public Input<bool>? ValidateRequestParameters { get; set; }

        public RequestValidatorArgs()
        {
        }
        public static new RequestValidatorArgs Empty => new RequestValidatorArgs();
    }

    public sealed class RequestValidatorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the request validator
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of the associated Rest API
        /// </summary>
        [Input("restApi")]
        public Input<string>? RestApi { get; set; }

        /// <summary>
        /// Boolean whether to validate request body. Defaults to `false`.
        /// </summary>
        [Input("validateRequestBody")]
        public Input<bool>? ValidateRequestBody { get; set; }

        /// <summary>
        /// Boolean whether to validate request parameters. Defaults to `false`.
        /// </summary>
        [Input("validateRequestParameters")]
        public Input<bool>? ValidateRequestParameters { get; set; }

        public RequestValidatorState()
        {
        }
        public static new RequestValidatorState Empty => new RequestValidatorState();
    }
}
