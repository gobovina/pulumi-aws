// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ApiGatewayV2
{
    /// <summary>
    /// Manages an Amazon API Gateway Version 2 integration.
    /// More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
    /// 
    /// ## Example Usage
    /// ### Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.ApiGatewayV2.Integration("example", new()
    ///     {
    ///         ApiId = exampleAwsApigatewayv2Api.Id,
    ///         IntegrationType = "MOCK",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Lambda Integration
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Lambda.Function("example", new()
    ///     {
    ///         Code = new FileArchive("example.zip"),
    ///         Name = "Example",
    ///         Role = exampleAwsIamRole.Arn,
    ///         Handler = "index.handler",
    ///         Runtime = "nodejs16.x",
    ///     });
    /// 
    ///     var exampleIntegration = new Aws.ApiGatewayV2.Integration("example", new()
    ///     {
    ///         ApiId = exampleAwsApigatewayv2Api.Id,
    ///         IntegrationType = "AWS_PROXY",
    ///         ConnectionType = "INTERNET",
    ///         ContentHandlingStrategy = "CONVERT_TO_TEXT",
    ///         Description = "Lambda example",
    ///         IntegrationMethod = "POST",
    ///         IntegrationUri = example.InvokeArn,
    ///         PassthroughBehavior = "WHEN_NO_MATCH",
    ///     });
    /// 
    /// });
    /// ```
    /// ### AWS Service Integration
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.ApiGatewayV2.Integration("example", new()
    ///     {
    ///         ApiId = exampleAwsApigatewayv2Api.Id,
    ///         CredentialsArn = exampleAwsIamRole.Arn,
    ///         Description = "SQS example",
    ///         IntegrationType = "AWS_PROXY",
    ///         IntegrationSubtype = "SQS-SendMessage",
    ///         RequestParameters = 
    ///         {
    ///             { "QueueUrl", "$request.header.queueUrl" },
    ///             { "MessageBody", "$request.body.message" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Private Integration
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.ApiGatewayV2.Integration("example", new()
    ///     {
    ///         ApiId = exampleAwsApigatewayv2Api.Id,
    ///         CredentialsArn = exampleAwsIamRole.Arn,
    ///         Description = "Example with a load balancer",
    ///         IntegrationType = "HTTP_PROXY",
    ///         IntegrationUri = exampleAwsLbListener.Arn,
    ///         IntegrationMethod = "ANY",
    ///         ConnectionType = "VPC_LINK",
    ///         ConnectionId = exampleAwsApigatewayv2VpcLink.Id,
    ///         TlsConfig = new Aws.ApiGatewayV2.Inputs.IntegrationTlsConfigArgs
    ///         {
    ///             ServerNameToVerify = "example.com",
    ///         },
    ///         RequestParameters = 
    ///         {
    ///             { "append:header.authforintegration", "$context.authorizer.authorizerResponse" },
    ///             { "overwrite:path", "staticValueForIntegration" },
    ///         },
    ///         ResponseParameters = new[]
    ///         {
    ///             new Aws.ApiGatewayV2.Inputs.IntegrationResponseParameterArgs
    ///             {
    ///                 StatusCode = "403",
    ///                 Mappings = 
    ///                 {
    ///                     { "append:header.auth", "$context.authorizer.authorizerResponse" },
    ///                 },
    ///             },
    ///             new Aws.ApiGatewayV2.Inputs.IntegrationResponseParameterArgs
    ///             {
    ///                 StatusCode = "200",
    ///                 Mappings = 
    ///                 {
    ///                     { "overwrite:statuscode", "204" },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_apigatewayv2_integration` using the API identifier and integration identifier. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:apigatewayv2/integration:Integration example aabbccddee/1122334
    /// ```
    ///  -&gt; __Note:__ The API Gateway managed integration created as part of [_quick_create_](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-basic-concept.html#apigateway-definition-quick-create) cannot be imported.
    /// </summary>
    [AwsResourceType("aws:apigatewayv2/integration:Integration")]
    public partial class Integration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// API identifier.
        /// </summary>
        [Output("apiId")]
        public Output<string> ApiId { get; private set; } = null!;

        /// <summary>
        /// ID of the VPC link for a private integration. Supported only for HTTP APIs. Must be between 1 and 1024 characters in length.
        /// </summary>
        [Output("connectionId")]
        public Output<string?> ConnectionId { get; private set; } = null!;

        /// <summary>
        /// Type of the network connection to the integration endpoint. Valid values: `INTERNET`, `VPC_LINK`. Default is `INTERNET`.
        /// </summary>
        [Output("connectionType")]
        public Output<string?> ConnectionType { get; private set; } = null!;

        /// <summary>
        /// How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`. Supported only for WebSocket APIs.
        /// </summary>
        [Output("contentHandlingStrategy")]
        public Output<string?> ContentHandlingStrategy { get; private set; } = null!;

        /// <summary>
        /// Credentials required for the integration, if any.
        /// </summary>
        [Output("credentialsArn")]
        public Output<string?> CredentialsArn { get; private set; } = null!;

        /// <summary>
        /// Description of the integration.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Integration's HTTP method. Must be specified if `integration_type` is not `MOCK`.
        /// </summary>
        [Output("integrationMethod")]
        public Output<string?> IntegrationMethod { get; private set; } = null!;

        /// <summary>
        /// The [integration response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions) for the integration.
        /// </summary>
        [Output("integrationResponseSelectionExpression")]
        public Output<string> IntegrationResponseSelectionExpression { get; private set; } = null!;

        /// <summary>
        /// AWS service action to invoke. Supported only for HTTP APIs when `integration_type` is `AWS_PROXY`. See the [AWS service integration reference](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html) documentation for supported values. Must be between 1 and 128 characters in length.
        /// </summary>
        [Output("integrationSubtype")]
        public Output<string?> IntegrationSubtype { get; private set; } = null!;

        /// <summary>
        /// Integration type of an integration.
        /// Valid values: `AWS` (supported only for WebSocket APIs), `AWS_PROXY`, `HTTP` (supported only for WebSocket APIs), `HTTP_PROXY`, `MOCK` (supported only for WebSocket APIs). For an HTTP API private integration, use `HTTP_PROXY`.
        /// </summary>
        [Output("integrationType")]
        public Output<string> IntegrationType { get; private set; } = null!;

        /// <summary>
        /// URI of the Lambda function for a Lambda proxy integration, when `integration_type` is `AWS_PROXY`.
        /// For an `HTTP` integration, specify a fully-qualified URL. For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network Load Balancer listener, or AWS Cloud Map service.
        /// </summary>
        [Output("integrationUri")]
        public Output<string?> IntegrationUri { get; private set; } = null!;

        /// <summary>
        /// Pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the `request_templates` attribute.
        /// Valid values: `WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`. Default is `WHEN_NO_MATCH`. Supported only for WebSocket APIs.
        /// </summary>
        [Output("passthroughBehavior")]
        public Output<string?> PassthroughBehavior { get; private set; } = null!;

        /// <summary>
        /// The [format of the payload](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html#http-api-develop-integrations-lambda.proxy-format) sent to an integration. Valid values: `1.0`, `2.0`. Default is `1.0`.
        /// </summary>
        [Output("payloadFormatVersion")]
        public Output<string?> PayloadFormatVersion { get; private set; } = null!;

        /// <summary>
        /// For WebSocket APIs, a key-value map specifying request parameters that are passed from the method request to the backend.
        /// For HTTP APIs with a specified `integration_subtype`, a key-value map specifying parameters that are passed to `AWS_PROXY` integrations.
        /// For HTTP APIs without a specified `integration_subtype`, a key-value map specifying how to transform HTTP requests before sending them to the backend.
        /// See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html) for details.
        /// </summary>
        [Output("requestParameters")]
        public Output<ImmutableDictionary<string, string>?> RequestParameters { get; private set; } = null!;

        /// <summary>
        /// Map of [Velocity](https://velocity.apache.org/) templates that are applied on the request payload based on the value of the Content-Type header sent by the client. Supported only for WebSocket APIs.
        /// </summary>
        [Output("requestTemplates")]
        public Output<ImmutableDictionary<string, string>?> RequestTemplates { get; private set; } = null!;

        /// <summary>
        /// Mappings to transform the HTTP response from a backend integration before returning the response to clients. Supported only for HTTP APIs.
        /// </summary>
        [Output("responseParameters")]
        public Output<ImmutableArray<Outputs.IntegrationResponseParameter>> ResponseParameters { get; private set; } = null!;

        /// <summary>
        /// The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration.
        /// </summary>
        [Output("templateSelectionExpression")]
        public Output<string?> TemplateSelectionExpression { get; private set; } = null!;

        /// <summary>
        /// Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000 milliseconds for HTTP APIs.
        /// The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
        /// this provider will only perform drift detection of its value when present in a configuration.
        /// </summary>
        [Output("timeoutMilliseconds")]
        public Output<int> TimeoutMilliseconds { get; private set; } = null!;

        /// <summary>
        /// TLS configuration for a private integration. Supported only for HTTP APIs.
        /// </summary>
        [Output("tlsConfig")]
        public Output<Outputs.IntegrationTlsConfig?> TlsConfig { get; private set; } = null!;


        /// <summary>
        /// Create a Integration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Integration(string name, IntegrationArgs args, CustomResourceOptions? options = null)
            : base("aws:apigatewayv2/integration:Integration", name, args ?? new IntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Integration(string name, Input<string> id, IntegrationState? state = null, CustomResourceOptions? options = null)
            : base("aws:apigatewayv2/integration:Integration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Integration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Integration Get(string name, Input<string> id, IntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new Integration(name, id, state, options);
        }
    }

    public sealed class IntegrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// API identifier.
        /// </summary>
        [Input("apiId", required: true)]
        public Input<string> ApiId { get; set; } = null!;

        /// <summary>
        /// ID of the VPC link for a private integration. Supported only for HTTP APIs. Must be between 1 and 1024 characters in length.
        /// </summary>
        [Input("connectionId")]
        public Input<string>? ConnectionId { get; set; }

        /// <summary>
        /// Type of the network connection to the integration endpoint. Valid values: `INTERNET`, `VPC_LINK`. Default is `INTERNET`.
        /// </summary>
        [Input("connectionType")]
        public Input<string>? ConnectionType { get; set; }

        /// <summary>
        /// How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`. Supported only for WebSocket APIs.
        /// </summary>
        [Input("contentHandlingStrategy")]
        public Input<string>? ContentHandlingStrategy { get; set; }

        /// <summary>
        /// Credentials required for the integration, if any.
        /// </summary>
        [Input("credentialsArn")]
        public Input<string>? CredentialsArn { get; set; }

        /// <summary>
        /// Description of the integration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Integration's HTTP method. Must be specified if `integration_type` is not `MOCK`.
        /// </summary>
        [Input("integrationMethod")]
        public Input<string>? IntegrationMethod { get; set; }

        /// <summary>
        /// AWS service action to invoke. Supported only for HTTP APIs when `integration_type` is `AWS_PROXY`. See the [AWS service integration reference](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html) documentation for supported values. Must be between 1 and 128 characters in length.
        /// </summary>
        [Input("integrationSubtype")]
        public Input<string>? IntegrationSubtype { get; set; }

        /// <summary>
        /// Integration type of an integration.
        /// Valid values: `AWS` (supported only for WebSocket APIs), `AWS_PROXY`, `HTTP` (supported only for WebSocket APIs), `HTTP_PROXY`, `MOCK` (supported only for WebSocket APIs). For an HTTP API private integration, use `HTTP_PROXY`.
        /// </summary>
        [Input("integrationType", required: true)]
        public Input<string> IntegrationType { get; set; } = null!;

        /// <summary>
        /// URI of the Lambda function for a Lambda proxy integration, when `integration_type` is `AWS_PROXY`.
        /// For an `HTTP` integration, specify a fully-qualified URL. For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network Load Balancer listener, or AWS Cloud Map service.
        /// </summary>
        [Input("integrationUri")]
        public Input<string>? IntegrationUri { get; set; }

        /// <summary>
        /// Pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the `request_templates` attribute.
        /// Valid values: `WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`. Default is `WHEN_NO_MATCH`. Supported only for WebSocket APIs.
        /// </summary>
        [Input("passthroughBehavior")]
        public Input<string>? PassthroughBehavior { get; set; }

        /// <summary>
        /// The [format of the payload](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html#http-api-develop-integrations-lambda.proxy-format) sent to an integration. Valid values: `1.0`, `2.0`. Default is `1.0`.
        /// </summary>
        [Input("payloadFormatVersion")]
        public Input<string>? PayloadFormatVersion { get; set; }

        [Input("requestParameters")]
        private InputMap<string>? _requestParameters;

        /// <summary>
        /// For WebSocket APIs, a key-value map specifying request parameters that are passed from the method request to the backend.
        /// For HTTP APIs with a specified `integration_subtype`, a key-value map specifying parameters that are passed to `AWS_PROXY` integrations.
        /// For HTTP APIs without a specified `integration_subtype`, a key-value map specifying how to transform HTTP requests before sending them to the backend.
        /// See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html) for details.
        /// </summary>
        public InputMap<string> RequestParameters
        {
            get => _requestParameters ?? (_requestParameters = new InputMap<string>());
            set => _requestParameters = value;
        }

        [Input("requestTemplates")]
        private InputMap<string>? _requestTemplates;

        /// <summary>
        /// Map of [Velocity](https://velocity.apache.org/) templates that are applied on the request payload based on the value of the Content-Type header sent by the client. Supported only for WebSocket APIs.
        /// </summary>
        public InputMap<string> RequestTemplates
        {
            get => _requestTemplates ?? (_requestTemplates = new InputMap<string>());
            set => _requestTemplates = value;
        }

        [Input("responseParameters")]
        private InputList<Inputs.IntegrationResponseParameterArgs>? _responseParameters;

        /// <summary>
        /// Mappings to transform the HTTP response from a backend integration before returning the response to clients. Supported only for HTTP APIs.
        /// </summary>
        public InputList<Inputs.IntegrationResponseParameterArgs> ResponseParameters
        {
            get => _responseParameters ?? (_responseParameters = new InputList<Inputs.IntegrationResponseParameterArgs>());
            set => _responseParameters = value;
        }

        /// <summary>
        /// The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration.
        /// </summary>
        [Input("templateSelectionExpression")]
        public Input<string>? TemplateSelectionExpression { get; set; }

        /// <summary>
        /// Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000 milliseconds for HTTP APIs.
        /// The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
        /// this provider will only perform drift detection of its value when present in a configuration.
        /// </summary>
        [Input("timeoutMilliseconds")]
        public Input<int>? TimeoutMilliseconds { get; set; }

        /// <summary>
        /// TLS configuration for a private integration. Supported only for HTTP APIs.
        /// </summary>
        [Input("tlsConfig")]
        public Input<Inputs.IntegrationTlsConfigArgs>? TlsConfig { get; set; }

        public IntegrationArgs()
        {
        }
        public static new IntegrationArgs Empty => new IntegrationArgs();
    }

    public sealed class IntegrationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// API identifier.
        /// </summary>
        [Input("apiId")]
        public Input<string>? ApiId { get; set; }

        /// <summary>
        /// ID of the VPC link for a private integration. Supported only for HTTP APIs. Must be between 1 and 1024 characters in length.
        /// </summary>
        [Input("connectionId")]
        public Input<string>? ConnectionId { get; set; }

        /// <summary>
        /// Type of the network connection to the integration endpoint. Valid values: `INTERNET`, `VPC_LINK`. Default is `INTERNET`.
        /// </summary>
        [Input("connectionType")]
        public Input<string>? ConnectionType { get; set; }

        /// <summary>
        /// How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`. Supported only for WebSocket APIs.
        /// </summary>
        [Input("contentHandlingStrategy")]
        public Input<string>? ContentHandlingStrategy { get; set; }

        /// <summary>
        /// Credentials required for the integration, if any.
        /// </summary>
        [Input("credentialsArn")]
        public Input<string>? CredentialsArn { get; set; }

        /// <summary>
        /// Description of the integration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Integration's HTTP method. Must be specified if `integration_type` is not `MOCK`.
        /// </summary>
        [Input("integrationMethod")]
        public Input<string>? IntegrationMethod { get; set; }

        /// <summary>
        /// The [integration response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions) for the integration.
        /// </summary>
        [Input("integrationResponseSelectionExpression")]
        public Input<string>? IntegrationResponseSelectionExpression { get; set; }

        /// <summary>
        /// AWS service action to invoke. Supported only for HTTP APIs when `integration_type` is `AWS_PROXY`. See the [AWS service integration reference](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html) documentation for supported values. Must be between 1 and 128 characters in length.
        /// </summary>
        [Input("integrationSubtype")]
        public Input<string>? IntegrationSubtype { get; set; }

        /// <summary>
        /// Integration type of an integration.
        /// Valid values: `AWS` (supported only for WebSocket APIs), `AWS_PROXY`, `HTTP` (supported only for WebSocket APIs), `HTTP_PROXY`, `MOCK` (supported only for WebSocket APIs). For an HTTP API private integration, use `HTTP_PROXY`.
        /// </summary>
        [Input("integrationType")]
        public Input<string>? IntegrationType { get; set; }

        /// <summary>
        /// URI of the Lambda function for a Lambda proxy integration, when `integration_type` is `AWS_PROXY`.
        /// For an `HTTP` integration, specify a fully-qualified URL. For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network Load Balancer listener, or AWS Cloud Map service.
        /// </summary>
        [Input("integrationUri")]
        public Input<string>? IntegrationUri { get; set; }

        /// <summary>
        /// Pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the `request_templates` attribute.
        /// Valid values: `WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`. Default is `WHEN_NO_MATCH`. Supported only for WebSocket APIs.
        /// </summary>
        [Input("passthroughBehavior")]
        public Input<string>? PassthroughBehavior { get; set; }

        /// <summary>
        /// The [format of the payload](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html#http-api-develop-integrations-lambda.proxy-format) sent to an integration. Valid values: `1.0`, `2.0`. Default is `1.0`.
        /// </summary>
        [Input("payloadFormatVersion")]
        public Input<string>? PayloadFormatVersion { get; set; }

        [Input("requestParameters")]
        private InputMap<string>? _requestParameters;

        /// <summary>
        /// For WebSocket APIs, a key-value map specifying request parameters that are passed from the method request to the backend.
        /// For HTTP APIs with a specified `integration_subtype`, a key-value map specifying parameters that are passed to `AWS_PROXY` integrations.
        /// For HTTP APIs without a specified `integration_subtype`, a key-value map specifying how to transform HTTP requests before sending them to the backend.
        /// See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html) for details.
        /// </summary>
        public InputMap<string> RequestParameters
        {
            get => _requestParameters ?? (_requestParameters = new InputMap<string>());
            set => _requestParameters = value;
        }

        [Input("requestTemplates")]
        private InputMap<string>? _requestTemplates;

        /// <summary>
        /// Map of [Velocity](https://velocity.apache.org/) templates that are applied on the request payload based on the value of the Content-Type header sent by the client. Supported only for WebSocket APIs.
        /// </summary>
        public InputMap<string> RequestTemplates
        {
            get => _requestTemplates ?? (_requestTemplates = new InputMap<string>());
            set => _requestTemplates = value;
        }

        [Input("responseParameters")]
        private InputList<Inputs.IntegrationResponseParameterGetArgs>? _responseParameters;

        /// <summary>
        /// Mappings to transform the HTTP response from a backend integration before returning the response to clients. Supported only for HTTP APIs.
        /// </summary>
        public InputList<Inputs.IntegrationResponseParameterGetArgs> ResponseParameters
        {
            get => _responseParameters ?? (_responseParameters = new InputList<Inputs.IntegrationResponseParameterGetArgs>());
            set => _responseParameters = value;
        }

        /// <summary>
        /// The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration.
        /// </summary>
        [Input("templateSelectionExpression")]
        public Input<string>? TemplateSelectionExpression { get; set; }

        /// <summary>
        /// Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000 milliseconds for HTTP APIs.
        /// The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
        /// this provider will only perform drift detection of its value when present in a configuration.
        /// </summary>
        [Input("timeoutMilliseconds")]
        public Input<int>? TimeoutMilliseconds { get; set; }

        /// <summary>
        /// TLS configuration for a private integration. Supported only for HTTP APIs.
        /// </summary>
        [Input("tlsConfig")]
        public Input<Inputs.IntegrationTlsConfigGetArgs>? TlsConfig { get; set; }

        public IntegrationState()
        {
        }
        public static new IntegrationState Empty => new IntegrationState();
    }
}
