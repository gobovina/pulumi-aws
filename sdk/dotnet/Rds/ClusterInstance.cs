// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Rds
{
    /// <summary>
    /// Provides an RDS Cluster Instance Resource. A Cluster Instance Resource defines
    /// attributes that are specific to a single instance in a RDS Cluster,
    /// specifically running Amazon Aurora.
    /// 
    /// Unlike other RDS resources that support replication, with Amazon Aurora you do
    /// not designate a primary and subsequent replicas. Instead, you simply add RDS
    /// Instances and Aurora manages the replication. You can use the [count][5]
    /// meta-parameter to make multiple instances and join them all to the same RDS
    /// Cluster, or you may specify different Cluster Instance resources with various
    /// `instance_class` sizes.
    /// 
    /// For more information on Amazon Aurora, see [Aurora on Amazon RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html) in the Amazon RDS User Guide.
    /// 
    /// &gt; **NOTE:** Deletion Protection from the RDS service can only be enabled at the cluster level, not for individual cluster instances. You can still add the [`protect` CustomResourceOption](https://www.pulumi.com/docs/intro/concepts/programming-model/#protect) to this resource configuration if you desire protection from accidental deletion.
    /// 
    /// &gt; **NOTE:** `aurora` is no longer a valid `engine` because of [Amazon Aurora's MySQL-Compatible Edition version 1 end of life](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.MySQL56.EOL.html).
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
    ///     var @default = new Aws.Rds.Cluster("default", new()
    ///     {
    ///         ClusterIdentifier = "aurora-cluster-demo",
    ///         AvailabilityZones = new[]
    ///         {
    ///             "us-west-2a",
    ///             "us-west-2b",
    ///             "us-west-2c",
    ///         },
    ///         DatabaseName = "mydb",
    ///         MasterUsername = "foo",
    ///         MasterPassword = "barbut8chars",
    ///     });
    /// 
    ///     var clusterInstances = new List&lt;Aws.Rds.ClusterInstance&gt;();
    ///     for (var rangeIndex = 0; rangeIndex &lt; 2; rangeIndex++)
    ///     {
    ///         var range = new { Value = rangeIndex };
    ///         clusterInstances.Add(new Aws.Rds.ClusterInstance($"clusterInstances-{range.Value}", new()
    ///         {
    ///             Identifier = $"aurora-cluster-demo-{range.Value}",
    ///             ClusterIdentifier = @default.Id,
    ///             InstanceClass = "db.r4.large",
    ///             Engine = @default.Engine,
    ///             EngineVersion = @default.EngineVersion,
    ///         }));
    ///     }
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import RDS Cluster Instances using the `identifier`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:rds/clusterInstance:ClusterInstance prod_instance_1 aurora-cluster-instance-1
    /// ```
    /// </summary>
    [AwsResourceType("aws:rds/clusterInstance:ClusterInstance")]
    public partial class ClusterInstance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies whether any database modifications are applied immediately, or during the next maintenance window. Default is`false`.
        /// </summary>
        [Output("applyImmediately")]
        public Output<bool> ApplyImmediately { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) of cluster instance
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
        /// </summary>
        [Output("autoMinorVersionUpgrade")]
        public Output<bool?> AutoMinorVersionUpgrade { get; private set; } = null!;

        /// <summary>
        /// EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) about the details.
        /// </summary>
        [Output("availabilityZone")]
        public Output<string> AvailabilityZone { get; private set; } = null!;

        /// <summary>
        /// Identifier of the CA certificate for the DB instance.
        /// </summary>
        [Output("caCertIdentifier")]
        public Output<string> CaCertIdentifier { get; private set; } = null!;

        /// <summary>
        /// Identifier of the `aws.rds.Cluster` in which to launch this instance.
        /// </summary>
        [Output("clusterIdentifier")]
        public Output<string> ClusterIdentifier { get; private set; } = null!;

        /// <summary>
        /// Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of the DB instance. Default `false`.
        /// </summary>
        [Output("copyTagsToSnapshot")]
        public Output<bool?> CopyTagsToSnapshot { get; private set; } = null!;

        /// <summary>
        /// Instance profile associated with the underlying Amazon EC2 instance of an RDS Custom DB instance.
        /// </summary>
        [Output("customIamInstanceProfile")]
        public Output<string?> CustomIamInstanceProfile { get; private set; } = null!;

        /// <summary>
        /// Name of the DB parameter group to associate with this instance.
        /// </summary>
        [Output("dbParameterGroupName")]
        public Output<string> DbParameterGroupName { get; private set; } = null!;

        /// <summary>
        /// DB subnet group to associate with this DB instance. **NOTE:** This must match the `db_subnet_group_name` of the attached `aws.rds.Cluster`.
        /// </summary>
        [Output("dbSubnetGroupName")]
        public Output<string> DbSubnetGroupName { get; private set; } = null!;

        /// <summary>
        /// Region-unique, immutable identifier for the DB instance.
        /// </summary>
        [Output("dbiResourceId")]
        public Output<string> DbiResourceId { get; private set; } = null!;

        /// <summary>
        /// DNS address for this instance. May not be writable
        /// </summary>
        [Output("endpoint")]
        public Output<string> Endpoint { get; private set; } = null!;

        /// <summary>
        /// Name of the database engine to be used for the RDS cluster instance.
        /// Valid Values: `aurora-mysql`, `aurora-postgresql`.
        /// </summary>
        [Output("engine")]
        public Output<string> Engine { get; private set; } = null!;

        /// <summary>
        /// Database engine version.
        /// </summary>
        [Output("engineVersion")]
        public Output<string> EngineVersion { get; private set; } = null!;

        /// <summary>
        /// Database engine version
        /// </summary>
        [Output("engineVersionActual")]
        public Output<string> EngineVersionActual { get; private set; } = null!;

        /// <summary>
        /// Identifier for the RDS instance, if omitted, Pulumi will assign a random, unique identifier.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
        /// </summary>
        [Output("identifierPrefix")]
        public Output<string> IdentifierPrefix { get; private set; } = null!;

        /// <summary>
        /// Instance class to use. For details on CPU and memory, see [Scaling Aurora DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html). Aurora uses `db.*` instance classes/types. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) for currently available instance classes and complete details.
        /// </summary>
        [Output("instanceClass")]
        public Output<string> InstanceClass { get; private set; } = null!;

        /// <summary>
        /// ARN for the KMS encryption key if one is set to the cluster.
        /// </summary>
        [Output("kmsKeyId")]
        public Output<string> KmsKeyId { get; private set; } = null!;

        /// <summary>
        /// Interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid Values: 0, 1, 5, 10, 15, 30, 60.
        /// </summary>
        [Output("monitoringInterval")]
        public Output<int?> MonitoringInterval { get; private set; } = null!;

        /// <summary>
        /// ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. You can find more information on the [AWS Documentation](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html) what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
        /// </summary>
        [Output("monitoringRoleArn")]
        public Output<string> MonitoringRoleArn { get; private set; } = null!;

        /// <summary>
        /// Network type of the DB instance.
        /// </summary>
        [Output("networkType")]
        public Output<string> NetworkType { get; private set; } = null!;

        /// <summary>
        /// Specifies whether Performance Insights is enabled or not.
        /// </summary>
        [Output("performanceInsightsEnabled")]
        public Output<bool> PerformanceInsightsEnabled { get; private set; } = null!;

        /// <summary>
        /// ARN for the KMS key to encrypt Performance Insights data. When specifying `performance_insights_kms_key_id`, `performance_insights_enabled` needs to be set to true.
        /// </summary>
        [Output("performanceInsightsKmsKeyId")]
        public Output<string> PerformanceInsightsKmsKeyId { get; private set; } = null!;

        /// <summary>
        /// Amount of time in days to retain Performance Insights data. Valid values are `7`, `731` (2 years) or a multiple of `31`. When specifying `performance_insights_retention_period`, `performance_insights_enabled` needs to be set to true. Defaults to '7'.
        /// </summary>
        [Output("performanceInsightsRetentionPeriod")]
        public Output<int> PerformanceInsightsRetentionPeriod { get; private set; } = null!;

        /// <summary>
        /// Database port
        /// </summary>
        [Output("port")]
        public Output<int> Port { get; private set; } = null!;

        /// <summary>
        /// Daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00". **NOTE:** If `preferred_backup_window` is set at the cluster level, this argument **must** be omitted.
        /// </summary>
        [Output("preferredBackupWindow")]
        public Output<string> PreferredBackupWindow { get; private set; } = null!;

        /// <summary>
        /// Window to perform maintenance in. Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
        /// </summary>
        [Output("preferredMaintenanceWindow")]
        public Output<string> PreferredMaintenanceWindow { get; private set; } = null!;

        /// <summary>
        /// Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoted to writer.
        /// </summary>
        [Output("promotionTier")]
        public Output<int?> PromotionTier { get; private set; } = null!;

        /// <summary>
        /// Bool to control if instance is publicly accessible. Default `false`. See the documentation on [Creating DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) for more details on controlling this property.
        /// </summary>
        [Output("publiclyAccessible")]
        public Output<bool> PubliclyAccessible { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the DB cluster is encrypted.
        /// </summary>
        [Output("storageEncrypted")]
        public Output<bool> StorageEncrypted { get; private set; } = null!;

        /// <summary>
        /// Map of tags to assign to the instance. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
        /// </summary>
        [Output("writer")]
        public Output<bool> Writer { get; private set; } = null!;


        /// <summary>
        /// Create a ClusterInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClusterInstance(string name, ClusterInstanceArgs args, CustomResourceOptions? options = null)
            : base("aws:rds/clusterInstance:ClusterInstance", name, args ?? new ClusterInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ClusterInstance(string name, Input<string> id, ClusterInstanceState? state = null, CustomResourceOptions? options = null)
            : base("aws:rds/clusterInstance:ClusterInstance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ClusterInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ClusterInstance Get(string name, Input<string> id, ClusterInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new ClusterInstance(name, id, state, options);
        }
    }

    public sealed class ClusterInstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether any database modifications are applied immediately, or during the next maintenance window. Default is`false`.
        /// </summary>
        [Input("applyImmediately")]
        public Input<bool>? ApplyImmediately { get; set; }

        /// <summary>
        /// Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
        /// </summary>
        [Input("autoMinorVersionUpgrade")]
        public Input<bool>? AutoMinorVersionUpgrade { get; set; }

        /// <summary>
        /// EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) about the details.
        /// </summary>
        [Input("availabilityZone")]
        public Input<string>? AvailabilityZone { get; set; }

        /// <summary>
        /// Identifier of the CA certificate for the DB instance.
        /// </summary>
        [Input("caCertIdentifier")]
        public Input<string>? CaCertIdentifier { get; set; }

        /// <summary>
        /// Identifier of the `aws.rds.Cluster` in which to launch this instance.
        /// </summary>
        [Input("clusterIdentifier", required: true)]
        public Input<string> ClusterIdentifier { get; set; } = null!;

        /// <summary>
        /// Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of the DB instance. Default `false`.
        /// </summary>
        [Input("copyTagsToSnapshot")]
        public Input<bool>? CopyTagsToSnapshot { get; set; }

        /// <summary>
        /// Instance profile associated with the underlying Amazon EC2 instance of an RDS Custom DB instance.
        /// </summary>
        [Input("customIamInstanceProfile")]
        public Input<string>? CustomIamInstanceProfile { get; set; }

        /// <summary>
        /// Name of the DB parameter group to associate with this instance.
        /// </summary>
        [Input("dbParameterGroupName")]
        public Input<string>? DbParameterGroupName { get; set; }

        /// <summary>
        /// DB subnet group to associate with this DB instance. **NOTE:** This must match the `db_subnet_group_name` of the attached `aws.rds.Cluster`.
        /// </summary>
        [Input("dbSubnetGroupName")]
        public Input<string>? DbSubnetGroupName { get; set; }

        /// <summary>
        /// Name of the database engine to be used for the RDS cluster instance.
        /// Valid Values: `aurora-mysql`, `aurora-postgresql`.
        /// </summary>
        [Input("engine", required: true)]
        public Input<string> Engine { get; set; } = null!;

        /// <summary>
        /// Database engine version.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// Identifier for the RDS instance, if omitted, Pulumi will assign a random, unique identifier.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
        /// </summary>
        [Input("identifierPrefix")]
        public Input<string>? IdentifierPrefix { get; set; }

        /// <summary>
        /// Instance class to use. For details on CPU and memory, see [Scaling Aurora DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html). Aurora uses `db.*` instance classes/types. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) for currently available instance classes and complete details.
        /// </summary>
        [Input("instanceClass", required: true)]
        public InputUnion<string, Pulumi.Aws.Rds.InstanceType> InstanceClass { get; set; } = null!;

        /// <summary>
        /// Interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid Values: 0, 1, 5, 10, 15, 30, 60.
        /// </summary>
        [Input("monitoringInterval")]
        public Input<int>? MonitoringInterval { get; set; }

        /// <summary>
        /// ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. You can find more information on the [AWS Documentation](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html) what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
        /// </summary>
        [Input("monitoringRoleArn")]
        public Input<string>? MonitoringRoleArn { get; set; }

        /// <summary>
        /// Specifies whether Performance Insights is enabled or not.
        /// </summary>
        [Input("performanceInsightsEnabled")]
        public Input<bool>? PerformanceInsightsEnabled { get; set; }

        /// <summary>
        /// ARN for the KMS key to encrypt Performance Insights data. When specifying `performance_insights_kms_key_id`, `performance_insights_enabled` needs to be set to true.
        /// </summary>
        [Input("performanceInsightsKmsKeyId")]
        public Input<string>? PerformanceInsightsKmsKeyId { get; set; }

        /// <summary>
        /// Amount of time in days to retain Performance Insights data. Valid values are `7`, `731` (2 years) or a multiple of `31`. When specifying `performance_insights_retention_period`, `performance_insights_enabled` needs to be set to true. Defaults to '7'.
        /// </summary>
        [Input("performanceInsightsRetentionPeriod")]
        public Input<int>? PerformanceInsightsRetentionPeriod { get; set; }

        /// <summary>
        /// Daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00". **NOTE:** If `preferred_backup_window` is set at the cluster level, this argument **must** be omitted.
        /// </summary>
        [Input("preferredBackupWindow")]
        public Input<string>? PreferredBackupWindow { get; set; }

        /// <summary>
        /// Window to perform maintenance in. Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
        /// </summary>
        [Input("preferredMaintenanceWindow")]
        public Input<string>? PreferredMaintenanceWindow { get; set; }

        /// <summary>
        /// Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoted to writer.
        /// </summary>
        [Input("promotionTier")]
        public Input<int>? PromotionTier { get; set; }

        /// <summary>
        /// Bool to control if instance is publicly accessible. Default `false`. See the documentation on [Creating DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) for more details on controlling this property.
        /// </summary>
        [Input("publiclyAccessible")]
        public Input<bool>? PubliclyAccessible { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the instance. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ClusterInstanceArgs()
        {
        }
        public static new ClusterInstanceArgs Empty => new ClusterInstanceArgs();
    }

    public sealed class ClusterInstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether any database modifications are applied immediately, or during the next maintenance window. Default is`false`.
        /// </summary>
        [Input("applyImmediately")]
        public Input<bool>? ApplyImmediately { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of cluster instance
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
        /// </summary>
        [Input("autoMinorVersionUpgrade")]
        public Input<bool>? AutoMinorVersionUpgrade { get; set; }

        /// <summary>
        /// EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) about the details.
        /// </summary>
        [Input("availabilityZone")]
        public Input<string>? AvailabilityZone { get; set; }

        /// <summary>
        /// Identifier of the CA certificate for the DB instance.
        /// </summary>
        [Input("caCertIdentifier")]
        public Input<string>? CaCertIdentifier { get; set; }

        /// <summary>
        /// Identifier of the `aws.rds.Cluster` in which to launch this instance.
        /// </summary>
        [Input("clusterIdentifier")]
        public Input<string>? ClusterIdentifier { get; set; }

        /// <summary>
        /// Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of the DB instance. Default `false`.
        /// </summary>
        [Input("copyTagsToSnapshot")]
        public Input<bool>? CopyTagsToSnapshot { get; set; }

        /// <summary>
        /// Instance profile associated with the underlying Amazon EC2 instance of an RDS Custom DB instance.
        /// </summary>
        [Input("customIamInstanceProfile")]
        public Input<string>? CustomIamInstanceProfile { get; set; }

        /// <summary>
        /// Name of the DB parameter group to associate with this instance.
        /// </summary>
        [Input("dbParameterGroupName")]
        public Input<string>? DbParameterGroupName { get; set; }

        /// <summary>
        /// DB subnet group to associate with this DB instance. **NOTE:** This must match the `db_subnet_group_name` of the attached `aws.rds.Cluster`.
        /// </summary>
        [Input("dbSubnetGroupName")]
        public Input<string>? DbSubnetGroupName { get; set; }

        /// <summary>
        /// Region-unique, immutable identifier for the DB instance.
        /// </summary>
        [Input("dbiResourceId")]
        public Input<string>? DbiResourceId { get; set; }

        /// <summary>
        /// DNS address for this instance. May not be writable
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// Name of the database engine to be used for the RDS cluster instance.
        /// Valid Values: `aurora-mysql`, `aurora-postgresql`.
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// Database engine version.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// Database engine version
        /// </summary>
        [Input("engineVersionActual")]
        public Input<string>? EngineVersionActual { get; set; }

        /// <summary>
        /// Identifier for the RDS instance, if omitted, Pulumi will assign a random, unique identifier.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
        /// </summary>
        [Input("identifierPrefix")]
        public Input<string>? IdentifierPrefix { get; set; }

        /// <summary>
        /// Instance class to use. For details on CPU and memory, see [Scaling Aurora DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html). Aurora uses `db.*` instance classes/types. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) for currently available instance classes and complete details.
        /// </summary>
        [Input("instanceClass")]
        public InputUnion<string, Pulumi.Aws.Rds.InstanceType>? InstanceClass { get; set; }

        /// <summary>
        /// ARN for the KMS encryption key if one is set to the cluster.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// Interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid Values: 0, 1, 5, 10, 15, 30, 60.
        /// </summary>
        [Input("monitoringInterval")]
        public Input<int>? MonitoringInterval { get; set; }

        /// <summary>
        /// ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. You can find more information on the [AWS Documentation](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html) what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
        /// </summary>
        [Input("monitoringRoleArn")]
        public Input<string>? MonitoringRoleArn { get; set; }

        /// <summary>
        /// Network type of the DB instance.
        /// </summary>
        [Input("networkType")]
        public Input<string>? NetworkType { get; set; }

        /// <summary>
        /// Specifies whether Performance Insights is enabled or not.
        /// </summary>
        [Input("performanceInsightsEnabled")]
        public Input<bool>? PerformanceInsightsEnabled { get; set; }

        /// <summary>
        /// ARN for the KMS key to encrypt Performance Insights data. When specifying `performance_insights_kms_key_id`, `performance_insights_enabled` needs to be set to true.
        /// </summary>
        [Input("performanceInsightsKmsKeyId")]
        public Input<string>? PerformanceInsightsKmsKeyId { get; set; }

        /// <summary>
        /// Amount of time in days to retain Performance Insights data. Valid values are `7`, `731` (2 years) or a multiple of `31`. When specifying `performance_insights_retention_period`, `performance_insights_enabled` needs to be set to true. Defaults to '7'.
        /// </summary>
        [Input("performanceInsightsRetentionPeriod")]
        public Input<int>? PerformanceInsightsRetentionPeriod { get; set; }

        /// <summary>
        /// Database port
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00". **NOTE:** If `preferred_backup_window` is set at the cluster level, this argument **must** be omitted.
        /// </summary>
        [Input("preferredBackupWindow")]
        public Input<string>? PreferredBackupWindow { get; set; }

        /// <summary>
        /// Window to perform maintenance in. Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
        /// </summary>
        [Input("preferredMaintenanceWindow")]
        public Input<string>? PreferredMaintenanceWindow { get; set; }

        /// <summary>
        /// Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoted to writer.
        /// </summary>
        [Input("promotionTier")]
        public Input<int>? PromotionTier { get; set; }

        /// <summary>
        /// Bool to control if instance is publicly accessible. Default `false`. See the documentation on [Creating DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) for more details on controlling this property.
        /// </summary>
        [Input("publiclyAccessible")]
        public Input<bool>? PubliclyAccessible { get; set; }

        /// <summary>
        /// Specifies whether the DB cluster is encrypted.
        /// </summary>
        [Input("storageEncrypted")]
        public Input<bool>? StorageEncrypted { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the instance. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
        /// </summary>
        [Input("writer")]
        public Input<bool>? Writer { get; set; }

        public ClusterInstanceState()
        {
        }
        public static new ClusterInstanceState Empty => new ClusterInstanceState();
    }
}
