// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sfn
{
    /// <summary>
    /// Provides a Step Function State Machine resource
    /// 
    /// ## Example Usage
    /// ### Basic (Standard Workflow)
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // ...
    ///     var sfnStateMachine = new Aws.Sfn.StateMachine("sfn_state_machine", new()
    ///     {
    ///         Name = "my-state-machine",
    ///         RoleArn = iamForSfn.Arn,
    ///         Definition = @$"{{
    ///   ""Comment"": ""A Hello World example of the Amazon States Language using an AWS Lambda Function"",
    ///   ""StartAt"": ""HelloWorld"",
    ///   ""States"": {{
    ///     ""HelloWorld"": {{
    ///       ""Type"": ""Task"",
    ///       ""Resource"": ""{lambda.Arn}"",
    ///       ""End"": true
    ///     }}
    ///   }}
    /// }}
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Basic (Express Workflow)
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // ...
    ///     var sfnStateMachine = new Aws.Sfn.StateMachine("sfn_state_machine", new()
    ///     {
    ///         Name = "my-state-machine",
    ///         RoleArn = iamForSfn.Arn,
    ///         Type = "EXPRESS",
    ///         Definition = @$"{{
    ///   ""Comment"": ""A Hello World example of the Amazon States Language using an AWS Lambda Function"",
    ///   ""StartAt"": ""HelloWorld"",
    ///   ""States"": {{
    ///     ""HelloWorld"": {{
    ///       ""Type"": ""Task"",
    ///       ""Resource"": ""{lambda.Arn}"",
    ///       ""End"": true
    ///     }}
    ///   }}
    /// }}
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Publish (Publish SFN version)
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // ...
    ///     var sfnStateMachine = new Aws.Sfn.StateMachine("sfn_state_machine", new()
    ///     {
    ///         Name = "my-state-machine",
    ///         RoleArn = iamForSfn.Arn,
    ///         Publish = true,
    ///         Type = "EXPRESS",
    ///         Definition = @$"{{
    ///   ""Comment"": ""A Hello World example of the Amazon States Language using an AWS Lambda Function"",
    ///   ""StartAt"": ""HelloWorld"",
    ///   ""States"": {{
    ///     ""HelloWorld"": {{
    ///       ""Type"": ""Task"",
    ///       ""Resource"": ""{lambda.Arn}"",
    ///       ""End"": true
    ///     }}
    ///   }}
    /// }}
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Logging
    /// 
    /// &gt; *NOTE:* See the [AWS Step Functions Developer Guide](https://docs.aws.amazon.com/step-functions/latest/dg/welcome.html) for more information about enabling Step Function logging.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // ...
    ///     var sfnStateMachine = new Aws.Sfn.StateMachine("sfn_state_machine", new()
    ///     {
    ///         Name = "my-state-machine",
    ///         RoleArn = iamForSfn.Arn,
    ///         Definition = @$"{{
    ///   ""Comment"": ""A Hello World example of the Amazon States Language using an AWS Lambda Function"",
    ///   ""StartAt"": ""HelloWorld"",
    ///   ""States"": {{
    ///     ""HelloWorld"": {{
    ///       ""Type"": ""Task"",
    ///       ""Resource"": ""{lambda.Arn}"",
    ///       ""End"": true
    ///     }}
    ///   }}
    /// }}
    /// ",
    ///         LoggingConfiguration = new Aws.Sfn.Inputs.StateMachineLoggingConfigurationArgs
    ///         {
    ///             LogDestination = $"{logGroupForSfn.Arn}:*",
    ///             IncludeExecutionData = true,
    ///             Level = "ERROR",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import State Machines using the `arn`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:sfn/stateMachine:StateMachine foo arn:aws:states:eu-west-1:123456789098:stateMachine:bar
    /// ```
    /// </summary>
    [AwsResourceType("aws:sfn/stateMachine:StateMachine")]
    public partial class StateMachine : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the state machine.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The date the state machine was created.
        /// </summary>
        [Output("creationDate")]
        public Output<string> CreationDate { get; private set; } = null!;

        /// <summary>
        /// The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
        /// </summary>
        [Output("definition")]
        public Output<string> Definition { get; private set; } = null!;

        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Defines what execution history events are logged and where they are logged. The `logging_configuration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
        /// </summary>
        [Output("loggingConfiguration")]
        public Output<Outputs.StateMachineLoggingConfiguration> LoggingConfiguration { get; private set; } = null!;

        /// <summary>
        /// The name of the state machine. The name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`. If omitted, the provider will assign a random, unique name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        /// </summary>
        [Output("namePrefix")]
        public Output<string> NamePrefix { get; private set; } = null!;

        /// <summary>
        /// Set to true to publish a version of the state machine during creation. Default: false.
        /// </summary>
        [Output("publish")]
        public Output<bool?> Publish { get; private set; } = null!;

        [Output("revisionId")]
        public Output<string> RevisionId { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
        /// </summary>
        [Output("roleArn")]
        public Output<string> RoleArn { get; private set; } = null!;

        [Output("stateMachineVersionArn")]
        public Output<string> StateMachineVersionArn { get; private set; } = null!;

        /// <summary>
        /// The current status of the state machine. Either `ACTIVE` or `DELETING`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Selects whether AWS X-Ray tracing is enabled.
        /// </summary>
        [Output("tracingConfiguration")]
        public Output<Outputs.StateMachineTracingConfiguration> TracingConfiguration { get; private set; } = null!;

        /// <summary>
        /// Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        [Output("versionDescription")]
        public Output<string> VersionDescription { get; private set; } = null!;


        /// <summary>
        /// Create a StateMachine resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StateMachine(string name, StateMachineArgs args, CustomResourceOptions? options = null)
            : base("aws:sfn/stateMachine:StateMachine", name, args ?? new StateMachineArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StateMachine(string name, Input<string> id, StateMachineState? state = null, CustomResourceOptions? options = null)
            : base("aws:sfn/stateMachine:StateMachine", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StateMachine resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StateMachine Get(string name, Input<string> id, StateMachineState? state = null, CustomResourceOptions? options = null)
        {
            return new StateMachine(name, id, state, options);
        }
    }

    public sealed class StateMachineArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
        /// </summary>
        [Input("definition", required: true)]
        public Input<string> Definition { get; set; } = null!;

        /// <summary>
        /// Defines what execution history events are logged and where they are logged. The `logging_configuration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
        /// </summary>
        [Input("loggingConfiguration")]
        public Input<Inputs.StateMachineLoggingConfigurationArgs>? LoggingConfiguration { get; set; }

        /// <summary>
        /// The name of the state machine. The name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`. If omitted, the provider will assign a random, unique name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// Set to true to publish a version of the state machine during creation. Default: false.
        /// </summary>
        [Input("publish")]
        public Input<bool>? Publish { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
        /// </summary>
        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Selects whether AWS X-Ray tracing is enabled.
        /// </summary>
        [Input("tracingConfiguration")]
        public Input<Inputs.StateMachineTracingConfigurationArgs>? TracingConfiguration { get; set; }

        /// <summary>
        /// Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public StateMachineArgs()
        {
        }
        public static new StateMachineArgs Empty => new StateMachineArgs();
    }

    public sealed class StateMachineState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the state machine.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The date the state machine was created.
        /// </summary>
        [Input("creationDate")]
        public Input<string>? CreationDate { get; set; }

        /// <summary>
        /// The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
        /// </summary>
        [Input("definition")]
        public Input<string>? Definition { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Defines what execution history events are logged and where they are logged. The `logging_configuration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
        /// </summary>
        [Input("loggingConfiguration")]
        public Input<Inputs.StateMachineLoggingConfigurationGetArgs>? LoggingConfiguration { get; set; }

        /// <summary>
        /// The name of the state machine. The name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`. If omitted, the provider will assign a random, unique name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// Set to true to publish a version of the state machine during creation. Default: false.
        /// </summary>
        [Input("publish")]
        public Input<bool>? Publish { get; set; }

        [Input("revisionId")]
        public Input<string>? RevisionId { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        [Input("stateMachineVersionArn")]
        public Input<string>? StateMachineVersionArn { get; set; }

        /// <summary>
        /// The current status of the state machine. Either `ACTIVE` or `DELETING`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Selects whether AWS X-Ray tracing is enabled.
        /// </summary>
        [Input("tracingConfiguration")]
        public Input<Inputs.StateMachineTracingConfigurationGetArgs>? TracingConfiguration { get; set; }

        /// <summary>
        /// Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("versionDescription")]
        public Input<string>? VersionDescription { get; set; }

        public StateMachineState()
        {
        }
        public static new StateMachineState Empty => new StateMachineState();
    }
}
