// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ssm
{
    /// <summary>
    /// Provides an SSM Maintenance Window Task resource
    /// 
    /// ## Example Usage
    /// ### Automation Tasks
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ssm.MaintenanceWindowTask("example", new()
    ///     {
    ///         MaxConcurrency = "2",
    ///         MaxErrors = "1",
    ///         Priority = 1,
    ///         TaskArn = "AWS-RestartEC2Instance",
    ///         TaskType = "AUTOMATION",
    ///         WindowId = exampleAwsSsmMaintenanceWindow.Id,
    ///         Targets = new[]
    ///         {
    ///             new Aws.Ssm.Inputs.MaintenanceWindowTaskTargetArgs
    ///             {
    ///                 Key = "InstanceIds",
    ///                 Values = new[]
    ///                 {
    ///                     exampleAwsInstance.Id,
    ///                 },
    ///             },
    ///         },
    ///         TaskInvocationParameters = new Aws.Ssm.Inputs.MaintenanceWindowTaskTaskInvocationParametersArgs
    ///         {
    ///             AutomationParameters = new Aws.Ssm.Inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersArgs
    ///             {
    ///                 DocumentVersion = "$LATEST",
    ///                 Parameters = new[]
    ///                 {
    ///                     new Aws.Ssm.Inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameterArgs
    ///                     {
    ///                         Name = "InstanceId",
    ///                         Values = new[]
    ///                         {
    ///                             exampleAwsInstance.Id,
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Lambda Tasks
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ssm.MaintenanceWindowTask("example", new()
    ///     {
    ///         MaxConcurrency = "2",
    ///         MaxErrors = "1",
    ///         Priority = 1,
    ///         TaskArn = exampleAwsLambdaFunction.Arn,
    ///         TaskType = "LAMBDA",
    ///         WindowId = exampleAwsSsmMaintenanceWindow.Id,
    ///         Targets = new[]
    ///         {
    ///             new Aws.Ssm.Inputs.MaintenanceWindowTaskTargetArgs
    ///             {
    ///                 Key = "InstanceIds",
    ///                 Values = new[]
    ///                 {
    ///                     exampleAwsInstance.Id,
    ///                 },
    ///             },
    ///         },
    ///         TaskInvocationParameters = new Aws.Ssm.Inputs.MaintenanceWindowTaskTaskInvocationParametersArgs
    ///         {
    ///             LambdaParameters = new Aws.Ssm.Inputs.MaintenanceWindowTaskTaskInvocationParametersLambdaParametersArgs
    ///             {
    ///                 ClientContext = Std.Base64encode.Invoke(new()
    ///                 {
    ///                     Input = "{\"key1\":\"value1\"}",
    ///                 }).Apply(invoke =&gt; invoke.Result),
    ///                 Payload = "{\"key1\":\"value1\"}",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Run Command Tasks
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ssm.MaintenanceWindowTask("example", new()
    ///     {
    ///         MaxConcurrency = "2",
    ///         MaxErrors = "1",
    ///         Priority = 1,
    ///         TaskArn = "AWS-RunShellScript",
    ///         TaskType = "RUN_COMMAND",
    ///         WindowId = exampleAwsSsmMaintenanceWindow.Id,
    ///         Targets = new[]
    ///         {
    ///             new Aws.Ssm.Inputs.MaintenanceWindowTaskTargetArgs
    ///             {
    ///                 Key = "InstanceIds",
    ///                 Values = new[]
    ///                 {
    ///                     exampleAwsInstance.Id,
    ///                 },
    ///             },
    ///         },
    ///         TaskInvocationParameters = new Aws.Ssm.Inputs.MaintenanceWindowTaskTaskInvocationParametersArgs
    ///         {
    ///             RunCommandParameters = new Aws.Ssm.Inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersArgs
    ///             {
    ///                 OutputS3Bucket = exampleAwsS3Bucket.Id,
    ///                 OutputS3KeyPrefix = "output",
    ///                 ServiceRoleArn = exampleAwsIamRole.Arn,
    ///                 TimeoutSeconds = 600,
    ///                 NotificationConfig = new Aws.Ssm.Inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigArgs
    ///                 {
    ///                     NotificationArn = exampleAwsSnsTopic.Arn,
    ///                     NotificationEvents = new[]
    ///                     {
    ///                         "All",
    ///                     },
    ///                     NotificationType = "Command",
    ///                 },
    ///                 Parameters = new[]
    ///                 {
    ///                     new Aws.Ssm.Inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameterArgs
    ///                     {
    ///                         Name = "commands",
    ///                         Values = new[]
    ///                         {
    ///                             "date",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Step Function Tasks
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Ssm.MaintenanceWindowTask("example", new()
    ///     {
    ///         MaxConcurrency = "2",
    ///         MaxErrors = "1",
    ///         Priority = 1,
    ///         TaskArn = exampleAwsSfnActivity.Id,
    ///         TaskType = "STEP_FUNCTIONS",
    ///         WindowId = exampleAwsSsmMaintenanceWindow.Id,
    ///         Targets = new[]
    ///         {
    ///             new Aws.Ssm.Inputs.MaintenanceWindowTaskTargetArgs
    ///             {
    ///                 Key = "InstanceIds",
    ///                 Values = new[]
    ///                 {
    ///                     exampleAwsInstance.Id,
    ///                 },
    ///             },
    ///         },
    ///         TaskInvocationParameters = new Aws.Ssm.Inputs.MaintenanceWindowTaskTaskInvocationParametersArgs
    ///         {
    ///             StepFunctionsParameters = new Aws.Ssm.Inputs.MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersArgs
    ///             {
    ///                 Input = "{\"key1\":\"value1\"}",
    ///                 Name = "example",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import AWS Maintenance Window Task using the `window_id` and `window_task_id` separated by `/`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ssm/maintenanceWindowTask:MaintenanceWindowTask task &lt;window_id&gt;/&lt;window_task_id&gt;
    /// ```
    /// </summary>
    [AwsResourceType("aws:ssm/maintenanceWindowTask:MaintenanceWindowTask")]
    public partial class MaintenanceWindowTask : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the maintenance window task.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Indicates whether tasks should continue to run after the cutoff time specified in the maintenance windows is reached. Valid values are `CONTINUE_TASK` and `CANCEL_TASK`.
        /// </summary>
        [Output("cutoffBehavior")]
        public Output<string?> CutoffBehavior { get; private set; } = null!;

        /// <summary>
        /// The description of the maintenance window task.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The maximum number of targets this task can be run for in parallel.
        /// </summary>
        [Output("maxConcurrency")]
        public Output<string> MaxConcurrency { get; private set; } = null!;

        /// <summary>
        /// The maximum number of errors allowed before this task stops being scheduled.
        /// </summary>
        [Output("maxErrors")]
        public Output<string> MaxErrors { get; private set; } = null!;

        /// <summary>
        /// The name of the maintenance window task.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
        /// </summary>
        [Output("priority")]
        public Output<int?> Priority { get; private set; } = null!;

        /// <summary>
        /// The role that should be assumed when executing the task. If a role is not provided, Systems Manager uses your account's service-linked role. If no service-linked role for Systems Manager exists in your account, it is created for you.
        /// </summary>
        [Output("serviceRoleArn")]
        public Output<string> ServiceRoleArn { get; private set; } = null!;

        /// <summary>
        /// The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
        /// </summary>
        [Output("targets")]
        public Output<ImmutableArray<Outputs.MaintenanceWindowTaskTarget>> Targets { get; private set; } = null!;

        /// <summary>
        /// The ARN of the task to execute.
        /// </summary>
        [Output("taskArn")]
        public Output<string> TaskArn { get; private set; } = null!;

        /// <summary>
        /// Configuration block with parameters for task execution.
        /// </summary>
        [Output("taskInvocationParameters")]
        public Output<Outputs.MaintenanceWindowTaskTaskInvocationParameters?> TaskInvocationParameters { get; private set; } = null!;

        /// <summary>
        /// The type of task being registered. Valid values: `AUTOMATION`, `LAMBDA`, `RUN_COMMAND` or `STEP_FUNCTIONS`.
        /// </summary>
        [Output("taskType")]
        public Output<string> TaskType { get; private set; } = null!;

        /// <summary>
        /// The Id of the maintenance window to register the task with.
        /// </summary>
        [Output("windowId")]
        public Output<string> WindowId { get; private set; } = null!;

        /// <summary>
        /// The ID of the maintenance window task.
        /// </summary>
        [Output("windowTaskId")]
        public Output<string> WindowTaskId { get; private set; } = null!;


        /// <summary>
        /// Create a MaintenanceWindowTask resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MaintenanceWindowTask(string name, MaintenanceWindowTaskArgs args, CustomResourceOptions? options = null)
            : base("aws:ssm/maintenanceWindowTask:MaintenanceWindowTask", name, args ?? new MaintenanceWindowTaskArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MaintenanceWindowTask(string name, Input<string> id, MaintenanceWindowTaskState? state = null, CustomResourceOptions? options = null)
            : base("aws:ssm/maintenanceWindowTask:MaintenanceWindowTask", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MaintenanceWindowTask resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MaintenanceWindowTask Get(string name, Input<string> id, MaintenanceWindowTaskState? state = null, CustomResourceOptions? options = null)
        {
            return new MaintenanceWindowTask(name, id, state, options);
        }
    }

    public sealed class MaintenanceWindowTaskArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether tasks should continue to run after the cutoff time specified in the maintenance windows is reached. Valid values are `CONTINUE_TASK` and `CANCEL_TASK`.
        /// </summary>
        [Input("cutoffBehavior")]
        public Input<string>? CutoffBehavior { get; set; }

        /// <summary>
        /// The description of the maintenance window task.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The maximum number of targets this task can be run for in parallel.
        /// </summary>
        [Input("maxConcurrency")]
        public Input<string>? MaxConcurrency { get; set; }

        /// <summary>
        /// The maximum number of errors allowed before this task stops being scheduled.
        /// </summary>
        [Input("maxErrors")]
        public Input<string>? MaxErrors { get; set; }

        /// <summary>
        /// The name of the maintenance window task.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The role that should be assumed when executing the task. If a role is not provided, Systems Manager uses your account's service-linked role. If no service-linked role for Systems Manager exists in your account, it is created for you.
        /// </summary>
        [Input("serviceRoleArn")]
        public Input<string>? ServiceRoleArn { get; set; }

        [Input("targets")]
        private InputList<Inputs.MaintenanceWindowTaskTargetArgs>? _targets;

        /// <summary>
        /// The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
        /// </summary>
        public InputList<Inputs.MaintenanceWindowTaskTargetArgs> Targets
        {
            get => _targets ?? (_targets = new InputList<Inputs.MaintenanceWindowTaskTargetArgs>());
            set => _targets = value;
        }

        /// <summary>
        /// The ARN of the task to execute.
        /// </summary>
        [Input("taskArn", required: true)]
        public Input<string> TaskArn { get; set; } = null!;

        /// <summary>
        /// Configuration block with parameters for task execution.
        /// </summary>
        [Input("taskInvocationParameters")]
        public Input<Inputs.MaintenanceWindowTaskTaskInvocationParametersArgs>? TaskInvocationParameters { get; set; }

        /// <summary>
        /// The type of task being registered. Valid values: `AUTOMATION`, `LAMBDA`, `RUN_COMMAND` or `STEP_FUNCTIONS`.
        /// </summary>
        [Input("taskType", required: true)]
        public Input<string> TaskType { get; set; } = null!;

        /// <summary>
        /// The Id of the maintenance window to register the task with.
        /// </summary>
        [Input("windowId", required: true)]
        public Input<string> WindowId { get; set; } = null!;

        public MaintenanceWindowTaskArgs()
        {
        }
        public static new MaintenanceWindowTaskArgs Empty => new MaintenanceWindowTaskArgs();
    }

    public sealed class MaintenanceWindowTaskState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the maintenance window task.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Indicates whether tasks should continue to run after the cutoff time specified in the maintenance windows is reached. Valid values are `CONTINUE_TASK` and `CANCEL_TASK`.
        /// </summary>
        [Input("cutoffBehavior")]
        public Input<string>? CutoffBehavior { get; set; }

        /// <summary>
        /// The description of the maintenance window task.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The maximum number of targets this task can be run for in parallel.
        /// </summary>
        [Input("maxConcurrency")]
        public Input<string>? MaxConcurrency { get; set; }

        /// <summary>
        /// The maximum number of errors allowed before this task stops being scheduled.
        /// </summary>
        [Input("maxErrors")]
        public Input<string>? MaxErrors { get; set; }

        /// <summary>
        /// The name of the maintenance window task.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The role that should be assumed when executing the task. If a role is not provided, Systems Manager uses your account's service-linked role. If no service-linked role for Systems Manager exists in your account, it is created for you.
        /// </summary>
        [Input("serviceRoleArn")]
        public Input<string>? ServiceRoleArn { get; set; }

        [Input("targets")]
        private InputList<Inputs.MaintenanceWindowTaskTargetGetArgs>? _targets;

        /// <summary>
        /// The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
        /// </summary>
        public InputList<Inputs.MaintenanceWindowTaskTargetGetArgs> Targets
        {
            get => _targets ?? (_targets = new InputList<Inputs.MaintenanceWindowTaskTargetGetArgs>());
            set => _targets = value;
        }

        /// <summary>
        /// The ARN of the task to execute.
        /// </summary>
        [Input("taskArn")]
        public Input<string>? TaskArn { get; set; }

        /// <summary>
        /// Configuration block with parameters for task execution.
        /// </summary>
        [Input("taskInvocationParameters")]
        public Input<Inputs.MaintenanceWindowTaskTaskInvocationParametersGetArgs>? TaskInvocationParameters { get; set; }

        /// <summary>
        /// The type of task being registered. Valid values: `AUTOMATION`, `LAMBDA`, `RUN_COMMAND` or `STEP_FUNCTIONS`.
        /// </summary>
        [Input("taskType")]
        public Input<string>? TaskType { get; set; }

        /// <summary>
        /// The Id of the maintenance window to register the task with.
        /// </summary>
        [Input("windowId")]
        public Input<string>? WindowId { get; set; }

        /// <summary>
        /// The ID of the maintenance window task.
        /// </summary>
        [Input("windowTaskId")]
        public Input<string>? WindowTaskId { get; set; }

        public MaintenanceWindowTaskState()
        {
        }
        public static new MaintenanceWindowTaskState Empty => new MaintenanceWindowTaskState();
    }
}
