// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppSync
{
    /// <summary>
    /// Provides an AppSync Function.
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
    ///     var example = new Aws.AppSync.GraphQLApi("example", new()
    ///     {
    ///         AuthenticationType = "API_KEY",
    ///         Name = "example",
    ///         Schema = @"type Mutation {
    ///   putPost(id: ID!, title: String!): Post
    /// }
    /// 
    /// type Post {
    ///   id: ID!
    ///   title: String!
    /// }
    /// 
    /// type Query {
    ///   singlePost(id: ID!): Post
    /// }
    /// 
    /// schema {
    ///   query: Query
    ///   mutation: Mutation
    /// }
    /// ",
    ///     });
    /// 
    ///     var exampleDataSource = new Aws.AppSync.DataSource("example", new()
    ///     {
    ///         ApiId = example.Id,
    ///         Name = "example",
    ///         Type = "HTTP",
    ///         HttpConfig = new Aws.AppSync.Inputs.DataSourceHttpConfigArgs
    ///         {
    ///             Endpoint = "http://example.com",
    ///         },
    ///     });
    /// 
    ///     var exampleFunction = new Aws.AppSync.Function("example", new()
    ///     {
    ///         ApiId = example.Id,
    ///         DataSource = exampleDataSource.Name,
    ///         Name = "example",
    ///         RequestMappingTemplate = @"{
    ///     ""version"": ""2018-05-29"",
    ///     ""method"": ""GET"",
    ///     ""resourcePath"": ""/"",
    ///     ""params"":{
    ///         ""headers"": $utils.http.copyheaders($ctx.request.headers)
    ///     }
    /// }
    /// ",
    ///         ResponseMappingTemplate = @"#if($ctx.result.statusCode == 200)
    ///     $ctx.result.body
    /// #else
    ///     $utils.appendError($ctx.result.body, $ctx.result.statusCode)
    /// #end
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### With Code
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.AppSync.Function("example", new()
    ///     {
    ///         ApiId = exampleAwsAppsyncGraphqlApi.Id,
    ///         DataSource = exampleAwsAppsyncDatasource.Name,
    ///         Name = "example",
    ///         Code = Std.File.Invoke(new()
    ///         {
    ///             Input = "some-code-dir",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///         Runtime = new Aws.AppSync.Inputs.FunctionRuntimeArgs
    ///         {
    ///             Name = "APPSYNC_JS",
    ///             RuntimeVersion = "1.0.0",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_appsync_function` using the AppSync API ID and Function ID separated by `-`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:appsync/function:Function example xxxxx-yyyyy
    /// ```
    /// </summary>
    [AwsResourceType("aws:appsync/function:Function")]
    public partial class Function : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ID of the associated AppSync API.
        /// </summary>
        [Output("apiId")]
        public Output<string> ApiId { get; private set; } = null!;

        /// <summary>
        /// ARN of the Function object.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The function code that contains the request and response functions. When code is used, the runtime is required. The runtime value must be APPSYNC_JS.
        /// </summary>
        [Output("code")]
        public Output<string?> Code { get; private set; } = null!;

        /// <summary>
        /// Function data source name.
        /// </summary>
        [Output("dataSource")]
        public Output<string> DataSource { get; private set; } = null!;

        /// <summary>
        /// Function description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Unique ID representing the Function object.
        /// </summary>
        [Output("functionId")]
        public Output<string> FunctionId { get; private set; } = null!;

        /// <summary>
        /// Version of the request mapping template. Currently the supported value is `2018-05-29`. Does not apply when specifying `code`.
        /// </summary>
        [Output("functionVersion")]
        public Output<string> FunctionVersion { get; private set; } = null!;

        /// <summary>
        /// Maximum batching size for a resolver. Valid values are between `0` and `2000`.
        /// </summary>
        [Output("maxBatchSize")]
        public Output<int?> MaxBatchSize { get; private set; } = null!;

        /// <summary>
        /// Function name. The function name does not have to be unique.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
        /// </summary>
        [Output("requestMappingTemplate")]
        public Output<string?> RequestMappingTemplate { get; private set; } = null!;

        /// <summary>
        /// Function response mapping template.
        /// </summary>
        [Output("responseMappingTemplate")]
        public Output<string?> ResponseMappingTemplate { get; private set; } = null!;

        /// <summary>
        /// Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
        /// </summary>
        [Output("runtime")]
        public Output<Outputs.FunctionRuntime?> Runtime { get; private set; } = null!;

        /// <summary>
        /// Describes a Sync configuration for a resolver. See Sync Config.
        /// </summary>
        [Output("syncConfig")]
        public Output<Outputs.FunctionSyncConfig?> SyncConfig { get; private set; } = null!;


        /// <summary>
        /// Create a Function resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Function(string name, FunctionArgs args, CustomResourceOptions? options = null)
            : base("aws:appsync/function:Function", name, args ?? new FunctionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Function(string name, Input<string> id, FunctionState? state = null, CustomResourceOptions? options = null)
            : base("aws:appsync/function:Function", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Function resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Function Get(string name, Input<string> id, FunctionState? state = null, CustomResourceOptions? options = null)
        {
            return new Function(name, id, state, options);
        }
    }

    public sealed class FunctionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the associated AppSync API.
        /// </summary>
        [Input("apiId", required: true)]
        public Input<string> ApiId { get; set; } = null!;

        /// <summary>
        /// The function code that contains the request and response functions. When code is used, the runtime is required. The runtime value must be APPSYNC_JS.
        /// </summary>
        [Input("code")]
        public Input<string>? Code { get; set; }

        /// <summary>
        /// Function data source name.
        /// </summary>
        [Input("dataSource", required: true)]
        public Input<string> DataSource { get; set; } = null!;

        /// <summary>
        /// Function description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Version of the request mapping template. Currently the supported value is `2018-05-29`. Does not apply when specifying `code`.
        /// </summary>
        [Input("functionVersion")]
        public Input<string>? FunctionVersion { get; set; }

        /// <summary>
        /// Maximum batching size for a resolver. Valid values are between `0` and `2000`.
        /// </summary>
        [Input("maxBatchSize")]
        public Input<int>? MaxBatchSize { get; set; }

        /// <summary>
        /// Function name. The function name does not have to be unique.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
        /// </summary>
        [Input("requestMappingTemplate")]
        public Input<string>? RequestMappingTemplate { get; set; }

        /// <summary>
        /// Function response mapping template.
        /// </summary>
        [Input("responseMappingTemplate")]
        public Input<string>? ResponseMappingTemplate { get; set; }

        /// <summary>
        /// Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
        /// </summary>
        [Input("runtime")]
        public Input<Inputs.FunctionRuntimeArgs>? Runtime { get; set; }

        /// <summary>
        /// Describes a Sync configuration for a resolver. See Sync Config.
        /// </summary>
        [Input("syncConfig")]
        public Input<Inputs.FunctionSyncConfigArgs>? SyncConfig { get; set; }

        public FunctionArgs()
        {
        }
        public static new FunctionArgs Empty => new FunctionArgs();
    }

    public sealed class FunctionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the associated AppSync API.
        /// </summary>
        [Input("apiId")]
        public Input<string>? ApiId { get; set; }

        /// <summary>
        /// ARN of the Function object.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The function code that contains the request and response functions. When code is used, the runtime is required. The runtime value must be APPSYNC_JS.
        /// </summary>
        [Input("code")]
        public Input<string>? Code { get; set; }

        /// <summary>
        /// Function data source name.
        /// </summary>
        [Input("dataSource")]
        public Input<string>? DataSource { get; set; }

        /// <summary>
        /// Function description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique ID representing the Function object.
        /// </summary>
        [Input("functionId")]
        public Input<string>? FunctionId { get; set; }

        /// <summary>
        /// Version of the request mapping template. Currently the supported value is `2018-05-29`. Does not apply when specifying `code`.
        /// </summary>
        [Input("functionVersion")]
        public Input<string>? FunctionVersion { get; set; }

        /// <summary>
        /// Maximum batching size for a resolver. Valid values are between `0` and `2000`.
        /// </summary>
        [Input("maxBatchSize")]
        public Input<int>? MaxBatchSize { get; set; }

        /// <summary>
        /// Function name. The function name does not have to be unique.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
        /// </summary>
        [Input("requestMappingTemplate")]
        public Input<string>? RequestMappingTemplate { get; set; }

        /// <summary>
        /// Function response mapping template.
        /// </summary>
        [Input("responseMappingTemplate")]
        public Input<string>? ResponseMappingTemplate { get; set; }

        /// <summary>
        /// Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function. Specifies the name and version of the runtime to use. Note that if a runtime is specified, code must also be specified. See Runtime.
        /// </summary>
        [Input("runtime")]
        public Input<Inputs.FunctionRuntimeGetArgs>? Runtime { get; set; }

        /// <summary>
        /// Describes a Sync configuration for a resolver. See Sync Config.
        /// </summary>
        [Input("syncConfig")]
        public Input<Inputs.FunctionSyncConfigGetArgs>? SyncConfig { get; set; }

        public FunctionState()
        {
        }
        public static new FunctionState Empty => new FunctionState();
    }
}
