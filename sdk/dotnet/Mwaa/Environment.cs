// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Mwaa
{
    /// <summary>
    /// Creates a MWAA Environment resource.
    /// 
    /// ## Example Usage
    /// 
    /// A MWAA Environment requires an IAM role (`aws.iam.Role`), two subnets in the private zone (`aws.ec2.Subnet`) and a versioned S3 bucket (`aws.s3.BucketV2`).
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Mwaa.Environment("example", new()
    ///     {
    ///         DagS3Path = "dags/",
    ///         ExecutionRoleArn = exampleAwsIamRole.Arn,
    ///         Name = "example",
    ///         NetworkConfiguration = new Aws.Mwaa.Inputs.EnvironmentNetworkConfigurationArgs
    ///         {
    ///             SecurityGroupIds = new[]
    ///             {
    ///                 exampleAwsSecurityGroup.Id,
    ///             },
    ///             SubnetIds = @private.Select(__item =&gt; __item.Id).ToList(),
    ///         },
    ///         SourceBucketArn = exampleAwsS3Bucket.Arn,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example with Airflow configuration options
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Mwaa.Environment("example", new()
    ///     {
    ///         AirflowConfigurationOptions = 
    ///         {
    ///             { "core.default_task_retries", "16" },
    ///             { "core.parallelism", "1" },
    ///         },
    ///         DagS3Path = "dags/",
    ///         ExecutionRoleArn = exampleAwsIamRole.Arn,
    ///         Name = "example",
    ///         NetworkConfiguration = new Aws.Mwaa.Inputs.EnvironmentNetworkConfigurationArgs
    ///         {
    ///             SecurityGroupIds = new[]
    ///             {
    ///                 exampleAwsSecurityGroup.Id,
    ///             },
    ///             SubnetIds = @private.Select(__item =&gt; __item.Id).ToList(),
    ///         },
    ///         SourceBucketArn = exampleAwsS3Bucket.Arn,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example with logging configurations
    /// 
    /// Note that Airflow task logs are enabled by default with the `INFO` log level.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Mwaa.Environment("example", new()
    ///     {
    ///         DagS3Path = "dags/",
    ///         ExecutionRoleArn = exampleAwsIamRole.Arn,
    ///         LoggingConfiguration = new Aws.Mwaa.Inputs.EnvironmentLoggingConfigurationArgs
    ///         {
    ///             DagProcessingLogs = new Aws.Mwaa.Inputs.EnvironmentLoggingConfigurationDagProcessingLogsArgs
    ///             {
    ///                 Enabled = true,
    ///                 LogLevel = "DEBUG",
    ///             },
    ///             SchedulerLogs = new Aws.Mwaa.Inputs.EnvironmentLoggingConfigurationSchedulerLogsArgs
    ///             {
    ///                 Enabled = true,
    ///                 LogLevel = "INFO",
    ///             },
    ///             TaskLogs = new Aws.Mwaa.Inputs.EnvironmentLoggingConfigurationTaskLogsArgs
    ///             {
    ///                 Enabled = true,
    ///                 LogLevel = "WARNING",
    ///             },
    ///             WebserverLogs = new Aws.Mwaa.Inputs.EnvironmentLoggingConfigurationWebserverLogsArgs
    ///             {
    ///                 Enabled = true,
    ///                 LogLevel = "ERROR",
    ///             },
    ///             WorkerLogs = new Aws.Mwaa.Inputs.EnvironmentLoggingConfigurationWorkerLogsArgs
    ///             {
    ///                 Enabled = true,
    ///                 LogLevel = "CRITICAL",
    ///             },
    ///         },
    ///         Name = "example",
    ///         NetworkConfiguration = new Aws.Mwaa.Inputs.EnvironmentNetworkConfigurationArgs
    ///         {
    ///             SecurityGroupIds = new[]
    ///             {
    ///                 exampleAwsSecurityGroup.Id,
    ///             },
    ///             SubnetIds = @private.Select(__item =&gt; __item.Id).ToList(),
    ///         },
    ///         SourceBucketArn = exampleAwsS3Bucket.Arn,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example with tags
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Mwaa.Environment("example", new()
    ///     {
    ///         DagS3Path = "dags/",
    ///         ExecutionRoleArn = exampleAwsIamRole.Arn,
    ///         Name = "example",
    ///         NetworkConfiguration = new Aws.Mwaa.Inputs.EnvironmentNetworkConfigurationArgs
    ///         {
    ///             SecurityGroupIds = new[]
    ///             {
    ///                 exampleAwsSecurityGroup.Id,
    ///             },
    ///             SubnetIds = @private.Select(__item =&gt; __item.Id).ToList(),
    ///         },
    ///         SourceBucketArn = exampleAwsS3Bucket.Arn,
    ///         Tags = 
    ///         {
    ///             { "Name", "example" },
    ///             { "Environment", "production" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import MWAA Environment using `Name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:mwaa/environment:Environment example MyAirflowEnvironment
    /// ```
    /// </summary>
    [AwsResourceType("aws:mwaa/environment:Environment")]
    public partial class Environment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The `airflow_configuration_options` parameter specifies airflow override options. Check the [Official documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html#configuring-env-variables-reference) for all possible configuration options.
        /// </summary>
        [Output("airflowConfigurationOptions")]
        public Output<ImmutableDictionary<string, string>?> AirflowConfigurationOptions { get; private set; } = null!;

        /// <summary>
        /// Airflow version of your environment, will be set by default to the latest version that MWAA supports.
        /// </summary>
        [Output("airflowVersion")]
        public Output<string> AirflowVersion { get; private set; } = null!;

        /// <summary>
        /// The ARN of the MWAA Environment
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The Created At date of the MWAA Environment
        /// * `logging_configuration[0].&lt;LOG_CONFIGURATION_TYPE&gt;[0].cloud_watch_log_group_arn` - Provides the ARN for the CloudWatch group where the logs will be published
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// The relative path to the DAG folder on your Amazon S3 storage bucket. For example, dags. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
        /// </summary>
        [Output("dagS3Path")]
        public Output<string> DagS3Path { get; private set; } = null!;

        /// <summary>
        /// Environment class for the cluster. Possible options are `mw1.small`, `mw1.medium`, `mw1.large`. Will be set by default to `mw1.small`. Please check the [AWS Pricing](https://aws.amazon.com/de/managed-workflows-for-apache-airflow/pricing/) for more information about the environment classes.
        /// </summary>
        [Output("environmentClass")]
        public Output<string> EnvironmentClass { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the task execution role that the Amazon MWAA and its environment can assume. Check the [official AWS documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html) for the detailed role specification.
        /// </summary>
        [Output("executionRoleArn")]
        public Output<string> ExecutionRoleArn { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of your KMS key that you want to use for encryption. Will be set to the ARN of the managed KMS key `aws/airflow` by default. Please check the [Official Documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/custom-keys-certs.html) for more information.
        /// </summary>
        [Output("kmsKey")]
        public Output<string?> KmsKey { get; private set; } = null!;

        [Output("lastUpdateds")]
        public Output<ImmutableArray<Outputs.EnvironmentLastUpdated>> LastUpdateds { get; private set; } = null!;

        /// <summary>
        /// The Apache Airflow logs you want to send to Amazon CloudWatch Logs.
        /// </summary>
        [Output("loggingConfiguration")]
        public Output<Outputs.EnvironmentLoggingConfiguration> LoggingConfiguration { get; private set; } = null!;

        /// <summary>
        /// The maximum number of workers that can be automatically scaled up. Value need to be between `1` and `25`. Will be `10` by default.
        /// </summary>
        [Output("maxWorkers")]
        public Output<int> MaxWorkers { get; private set; } = null!;

        /// <summary>
        /// The minimum number of workers that you want to run in your environment. Will be `1` by default.
        /// </summary>
        [Output("minWorkers")]
        public Output<int> MinWorkers { get; private set; } = null!;

        /// <summary>
        /// The name of the Apache Airflow Environment
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the network configuration for your Apache Airflow Environment. This includes two private subnets as well as security groups for the Airflow environment. Each subnet requires internet connection, otherwise the deployment will fail. See Network configuration below for details.
        /// </summary>
        [Output("networkConfiguration")]
        public Output<Outputs.EnvironmentNetworkConfiguration> NetworkConfiguration { get; private set; } = null!;

        /// <summary>
        /// The plugins.zip file version you want to use.
        /// </summary>
        [Output("pluginsS3ObjectVersion")]
        public Output<string> PluginsS3ObjectVersion { get; private set; } = null!;

        /// <summary>
        /// The relative path to the plugins.zip file on your Amazon S3 storage bucket. For example, plugins.zip. If a relative path is provided in the request, then plugins_s3_object_version is required. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
        /// </summary>
        [Output("pluginsS3Path")]
        public Output<string?> PluginsS3Path { get; private set; } = null!;

        /// <summary>
        /// The requirements.txt file version you want to use.
        /// </summary>
        [Output("requirementsS3ObjectVersion")]
        public Output<string> RequirementsS3ObjectVersion { get; private set; } = null!;

        /// <summary>
        /// The relative path to the requirements.txt file on your Amazon S3 storage bucket. For example, requirements.txt. If a relative path is provided in the request, then requirements_s3_object_version is required. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
        /// </summary>
        [Output("requirementsS3Path")]
        public Output<string?> RequirementsS3Path { get; private set; } = null!;

        /// <summary>
        /// The number of schedulers that you want to run in your environment. v2.0.2 and above accepts `2` - `5`, default `2`. v1.10.12 accepts `1`.
        /// </summary>
        [Output("schedulers")]
        public Output<int> Schedulers { get; private set; } = null!;

        /// <summary>
        /// The Service Role ARN of the Amazon MWAA Environment
        /// </summary>
        [Output("serviceRoleArn")]
        public Output<string> ServiceRoleArn { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of your Amazon S3 storage bucket. For example, arn:aws:s3:::airflow-mybucketname.
        /// </summary>
        [Output("sourceBucketArn")]
        public Output<string> SourceBucketArn { get; private set; } = null!;

        /// <summary>
        /// The version of the startup shell script you want to use. You must specify the version ID that Amazon S3 assigns to the file every time you update the script.
        /// </summary>
        [Output("startupScriptS3ObjectVersion")]
        public Output<string> StartupScriptS3ObjectVersion { get; private set; } = null!;

        /// <summary>
        /// The relative path to the script hosted in your bucket. The script runs as your environment starts before starting the Apache Airflow process. Use this script to install dependencies, modify configuration options, and set environment variables. See [Using a startup script](https://docs.aws.amazon.com/mwaa/latest/userguide/using-startup-script.html). Supported for environment versions 2.x and later.
        /// </summary>
        [Output("startupScriptS3Path")]
        public Output<string?> StartupScriptS3Path { get; private set; } = null!;

        /// <summary>
        /// The status of the Amazon MWAA Environment
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A map of resource tags to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the webserver should be accessible over the internet or via your specified VPC. Possible options: `PRIVATE_ONLY` (default) and `PUBLIC_ONLY`.
        /// </summary>
        [Output("webserverAccessMode")]
        public Output<string> WebserverAccessMode { get; private set; } = null!;

        /// <summary>
        /// The webserver URL of the MWAA Environment
        /// </summary>
        [Output("webserverUrl")]
        public Output<string> WebserverUrl { get; private set; } = null!;

        /// <summary>
        /// Specifies the start date for the weekly maintenance window.
        /// </summary>
        [Output("weeklyMaintenanceWindowStart")]
        public Output<string> WeeklyMaintenanceWindowStart { get; private set; } = null!;


        /// <summary>
        /// Create a Environment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Environment(string name, EnvironmentArgs args, CustomResourceOptions? options = null)
            : base("aws:mwaa/environment:Environment", name, args ?? new EnvironmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Environment(string name, Input<string> id, EnvironmentState? state = null, CustomResourceOptions? options = null)
            : base("aws:mwaa/environment:Environment", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "airflowConfigurationOptions",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Environment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Environment Get(string name, Input<string> id, EnvironmentState? state = null, CustomResourceOptions? options = null)
        {
            return new Environment(name, id, state, options);
        }
    }

    public sealed class EnvironmentArgs : global::Pulumi.ResourceArgs
    {
        [Input("airflowConfigurationOptions")]
        private InputMap<string>? _airflowConfigurationOptions;

        /// <summary>
        /// The `airflow_configuration_options` parameter specifies airflow override options. Check the [Official documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html#configuring-env-variables-reference) for all possible configuration options.
        /// </summary>
        public InputMap<string> AirflowConfigurationOptions
        {
            get => _airflowConfigurationOptions ?? (_airflowConfigurationOptions = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _airflowConfigurationOptions = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Airflow version of your environment, will be set by default to the latest version that MWAA supports.
        /// </summary>
        [Input("airflowVersion")]
        public Input<string>? AirflowVersion { get; set; }

        /// <summary>
        /// The relative path to the DAG folder on your Amazon S3 storage bucket. For example, dags. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
        /// </summary>
        [Input("dagS3Path", required: true)]
        public Input<string> DagS3Path { get; set; } = null!;

        /// <summary>
        /// Environment class for the cluster. Possible options are `mw1.small`, `mw1.medium`, `mw1.large`. Will be set by default to `mw1.small`. Please check the [AWS Pricing](https://aws.amazon.com/de/managed-workflows-for-apache-airflow/pricing/) for more information about the environment classes.
        /// </summary>
        [Input("environmentClass")]
        public Input<string>? EnvironmentClass { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the task execution role that the Amazon MWAA and its environment can assume. Check the [official AWS documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html) for the detailed role specification.
        /// </summary>
        [Input("executionRoleArn", required: true)]
        public Input<string> ExecutionRoleArn { get; set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of your KMS key that you want to use for encryption. Will be set to the ARN of the managed KMS key `aws/airflow` by default. Please check the [Official Documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/custom-keys-certs.html) for more information.
        /// </summary>
        [Input("kmsKey")]
        public Input<string>? KmsKey { get; set; }

        /// <summary>
        /// The Apache Airflow logs you want to send to Amazon CloudWatch Logs.
        /// </summary>
        [Input("loggingConfiguration")]
        public Input<Inputs.EnvironmentLoggingConfigurationArgs>? LoggingConfiguration { get; set; }

        /// <summary>
        /// The maximum number of workers that can be automatically scaled up. Value need to be between `1` and `25`. Will be `10` by default.
        /// </summary>
        [Input("maxWorkers")]
        public Input<int>? MaxWorkers { get; set; }

        /// <summary>
        /// The minimum number of workers that you want to run in your environment. Will be `1` by default.
        /// </summary>
        [Input("minWorkers")]
        public Input<int>? MinWorkers { get; set; }

        /// <summary>
        /// The name of the Apache Airflow Environment
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the network configuration for your Apache Airflow Environment. This includes two private subnets as well as security groups for the Airflow environment. Each subnet requires internet connection, otherwise the deployment will fail. See Network configuration below for details.
        /// </summary>
        [Input("networkConfiguration", required: true)]
        public Input<Inputs.EnvironmentNetworkConfigurationArgs> NetworkConfiguration { get; set; } = null!;

        /// <summary>
        /// The plugins.zip file version you want to use.
        /// </summary>
        [Input("pluginsS3ObjectVersion")]
        public Input<string>? PluginsS3ObjectVersion { get; set; }

        /// <summary>
        /// The relative path to the plugins.zip file on your Amazon S3 storage bucket. For example, plugins.zip. If a relative path is provided in the request, then plugins_s3_object_version is required. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
        /// </summary>
        [Input("pluginsS3Path")]
        public Input<string>? PluginsS3Path { get; set; }

        /// <summary>
        /// The requirements.txt file version you want to use.
        /// </summary>
        [Input("requirementsS3ObjectVersion")]
        public Input<string>? RequirementsS3ObjectVersion { get; set; }

        /// <summary>
        /// The relative path to the requirements.txt file on your Amazon S3 storage bucket. For example, requirements.txt. If a relative path is provided in the request, then requirements_s3_object_version is required. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
        /// </summary>
        [Input("requirementsS3Path")]
        public Input<string>? RequirementsS3Path { get; set; }

        /// <summary>
        /// The number of schedulers that you want to run in your environment. v2.0.2 and above accepts `2` - `5`, default `2`. v1.10.12 accepts `1`.
        /// </summary>
        [Input("schedulers")]
        public Input<int>? Schedulers { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of your Amazon S3 storage bucket. For example, arn:aws:s3:::airflow-mybucketname.
        /// </summary>
        [Input("sourceBucketArn", required: true)]
        public Input<string> SourceBucketArn { get; set; } = null!;

        /// <summary>
        /// The version of the startup shell script you want to use. You must specify the version ID that Amazon S3 assigns to the file every time you update the script.
        /// </summary>
        [Input("startupScriptS3ObjectVersion")]
        public Input<string>? StartupScriptS3ObjectVersion { get; set; }

        /// <summary>
        /// The relative path to the script hosted in your bucket. The script runs as your environment starts before starting the Apache Airflow process. Use this script to install dependencies, modify configuration options, and set environment variables. See [Using a startup script](https://docs.aws.amazon.com/mwaa/latest/userguide/using-startup-script.html). Supported for environment versions 2.x and later.
        /// </summary>
        [Input("startupScriptS3Path")]
        public Input<string>? StartupScriptS3Path { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of resource tags to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Specifies whether the webserver should be accessible over the internet or via your specified VPC. Possible options: `PRIVATE_ONLY` (default) and `PUBLIC_ONLY`.
        /// </summary>
        [Input("webserverAccessMode")]
        public Input<string>? WebserverAccessMode { get; set; }

        /// <summary>
        /// Specifies the start date for the weekly maintenance window.
        /// </summary>
        [Input("weeklyMaintenanceWindowStart")]
        public Input<string>? WeeklyMaintenanceWindowStart { get; set; }

        public EnvironmentArgs()
        {
        }
        public static new EnvironmentArgs Empty => new EnvironmentArgs();
    }

    public sealed class EnvironmentState : global::Pulumi.ResourceArgs
    {
        [Input("airflowConfigurationOptions")]
        private InputMap<string>? _airflowConfigurationOptions;

        /// <summary>
        /// The `airflow_configuration_options` parameter specifies airflow override options. Check the [Official documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html#configuring-env-variables-reference) for all possible configuration options.
        /// </summary>
        public InputMap<string> AirflowConfigurationOptions
        {
            get => _airflowConfigurationOptions ?? (_airflowConfigurationOptions = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _airflowConfigurationOptions = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Airflow version of your environment, will be set by default to the latest version that MWAA supports.
        /// </summary>
        [Input("airflowVersion")]
        public Input<string>? AirflowVersion { get; set; }

        /// <summary>
        /// The ARN of the MWAA Environment
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The Created At date of the MWAA Environment
        /// * `logging_configuration[0].&lt;LOG_CONFIGURATION_TYPE&gt;[0].cloud_watch_log_group_arn` - Provides the ARN for the CloudWatch group where the logs will be published
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// The relative path to the DAG folder on your Amazon S3 storage bucket. For example, dags. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
        /// </summary>
        [Input("dagS3Path")]
        public Input<string>? DagS3Path { get; set; }

        /// <summary>
        /// Environment class for the cluster. Possible options are `mw1.small`, `mw1.medium`, `mw1.large`. Will be set by default to `mw1.small`. Please check the [AWS Pricing](https://aws.amazon.com/de/managed-workflows-for-apache-airflow/pricing/) for more information about the environment classes.
        /// </summary>
        [Input("environmentClass")]
        public Input<string>? EnvironmentClass { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the task execution role that the Amazon MWAA and its environment can assume. Check the [official AWS documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html) for the detailed role specification.
        /// </summary>
        [Input("executionRoleArn")]
        public Input<string>? ExecutionRoleArn { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of your KMS key that you want to use for encryption. Will be set to the ARN of the managed KMS key `aws/airflow` by default. Please check the [Official Documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/custom-keys-certs.html) for more information.
        /// </summary>
        [Input("kmsKey")]
        public Input<string>? KmsKey { get; set; }

        [Input("lastUpdateds")]
        private InputList<Inputs.EnvironmentLastUpdatedGetArgs>? _lastUpdateds;
        public InputList<Inputs.EnvironmentLastUpdatedGetArgs> LastUpdateds
        {
            get => _lastUpdateds ?? (_lastUpdateds = new InputList<Inputs.EnvironmentLastUpdatedGetArgs>());
            set => _lastUpdateds = value;
        }

        /// <summary>
        /// The Apache Airflow logs you want to send to Amazon CloudWatch Logs.
        /// </summary>
        [Input("loggingConfiguration")]
        public Input<Inputs.EnvironmentLoggingConfigurationGetArgs>? LoggingConfiguration { get; set; }

        /// <summary>
        /// The maximum number of workers that can be automatically scaled up. Value need to be between `1` and `25`. Will be `10` by default.
        /// </summary>
        [Input("maxWorkers")]
        public Input<int>? MaxWorkers { get; set; }

        /// <summary>
        /// The minimum number of workers that you want to run in your environment. Will be `1` by default.
        /// </summary>
        [Input("minWorkers")]
        public Input<int>? MinWorkers { get; set; }

        /// <summary>
        /// The name of the Apache Airflow Environment
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the network configuration for your Apache Airflow Environment. This includes two private subnets as well as security groups for the Airflow environment. Each subnet requires internet connection, otherwise the deployment will fail. See Network configuration below for details.
        /// </summary>
        [Input("networkConfiguration")]
        public Input<Inputs.EnvironmentNetworkConfigurationGetArgs>? NetworkConfiguration { get; set; }

        /// <summary>
        /// The plugins.zip file version you want to use.
        /// </summary>
        [Input("pluginsS3ObjectVersion")]
        public Input<string>? PluginsS3ObjectVersion { get; set; }

        /// <summary>
        /// The relative path to the plugins.zip file on your Amazon S3 storage bucket. For example, plugins.zip. If a relative path is provided in the request, then plugins_s3_object_version is required. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
        /// </summary>
        [Input("pluginsS3Path")]
        public Input<string>? PluginsS3Path { get; set; }

        /// <summary>
        /// The requirements.txt file version you want to use.
        /// </summary>
        [Input("requirementsS3ObjectVersion")]
        public Input<string>? RequirementsS3ObjectVersion { get; set; }

        /// <summary>
        /// The relative path to the requirements.txt file on your Amazon S3 storage bucket. For example, requirements.txt. If a relative path is provided in the request, then requirements_s3_object_version is required. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
        /// </summary>
        [Input("requirementsS3Path")]
        public Input<string>? RequirementsS3Path { get; set; }

        /// <summary>
        /// The number of schedulers that you want to run in your environment. v2.0.2 and above accepts `2` - `5`, default `2`. v1.10.12 accepts `1`.
        /// </summary>
        [Input("schedulers")]
        public Input<int>? Schedulers { get; set; }

        /// <summary>
        /// The Service Role ARN of the Amazon MWAA Environment
        /// </summary>
        [Input("serviceRoleArn")]
        public Input<string>? ServiceRoleArn { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of your Amazon S3 storage bucket. For example, arn:aws:s3:::airflow-mybucketname.
        /// </summary>
        [Input("sourceBucketArn")]
        public Input<string>? SourceBucketArn { get; set; }

        /// <summary>
        /// The version of the startup shell script you want to use. You must specify the version ID that Amazon S3 assigns to the file every time you update the script.
        /// </summary>
        [Input("startupScriptS3ObjectVersion")]
        public Input<string>? StartupScriptS3ObjectVersion { get; set; }

        /// <summary>
        /// The relative path to the script hosted in your bucket. The script runs as your environment starts before starting the Apache Airflow process. Use this script to install dependencies, modify configuration options, and set environment variables. See [Using a startup script](https://docs.aws.amazon.com/mwaa/latest/userguide/using-startup-script.html). Supported for environment versions 2.x and later.
        /// </summary>
        [Input("startupScriptS3Path")]
        public Input<string>? StartupScriptS3Path { get; set; }

        /// <summary>
        /// The status of the Amazon MWAA Environment
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of resource tags to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        /// Specifies whether the webserver should be accessible over the internet or via your specified VPC. Possible options: `PRIVATE_ONLY` (default) and `PUBLIC_ONLY`.
        /// </summary>
        [Input("webserverAccessMode")]
        public Input<string>? WebserverAccessMode { get; set; }

        /// <summary>
        /// The webserver URL of the MWAA Environment
        /// </summary>
        [Input("webserverUrl")]
        public Input<string>? WebserverUrl { get; set; }

        /// <summary>
        /// Specifies the start date for the weekly maintenance window.
        /// </summary>
        [Input("weeklyMaintenanceWindowStart")]
        public Input<string>? WeeklyMaintenanceWindowStart { get; set; }

        public EnvironmentState()
        {
        }
        public static new EnvironmentState Empty => new EnvironmentState();
    }
}
