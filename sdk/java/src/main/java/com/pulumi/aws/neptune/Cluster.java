// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.neptune;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.neptune.ClusterArgs;
import com.pulumi.aws.neptune.inputs.ClusterState;
import com.pulumi.aws.neptune.outputs.ClusterServerlessV2ScalingConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Neptune Cluster Resource. A Cluster Resource defines attributes that are
 * applied to the entire cluster of Neptune Cluster Instances.
 * 
 * Changes to a Neptune Cluster can occur when you manually change a
 * parameter, such as `backup_retention_period`, and are reflected in the next maintenance
 * window. Because of this, this provider may report a difference in its planning
 * phase because a modification has not yet taken place. You can use the
 * `apply_immediately` flag to instruct the service to apply the change immediately
 * (see documentation below).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.neptune.Cluster;
 * import com.pulumi.aws.neptune.ClusterArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var default_ = new Cluster(&#34;default&#34;, ClusterArgs.builder()        
 *             .clusterIdentifier(&#34;neptune-cluster-demo&#34;)
 *             .engine(&#34;neptune&#34;)
 *             .backupRetentionPeriod(5)
 *             .preferredBackupWindow(&#34;07:00-09:00&#34;)
 *             .skipFinalSnapshot(true)
 *             .iamDatabaseAuthenticationEnabled(true)
 *             .applyImmediately(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * &gt; **Note:** AWS Neptune does not support user name/password–based access control.
 * See the AWS [Docs](https://docs.aws.amazon.com/neptune/latest/userguide/limits.html) for more information.
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_neptune_cluster` using the cluster identifier. For example:
 * 
 * ```sh
 *  $ pulumi import aws:neptune/cluster:Cluster example my-cluster
 * ```
 * 
 */
@ResourceType(type="aws:neptune/cluster:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether upgrades between different major versions are allowed. You must set it to `true` when providing an `engine_version` parameter that uses a different major version than the DB cluster&#39;s current version. Default is `false`.
     * 
     */
    @Export(name="allowMajorVersionUpgrade", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> allowMajorVersionUpgrade;

    /**
     * @return Specifies whether upgrades between different major versions are allowed. You must set it to `true` when providing an `engine_version` parameter that uses a different major version than the DB cluster&#39;s current version. Default is `false`.
     * 
     */
    public Output<Boolean> allowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
    }
    /**
     * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
     * 
     */
    @Export(name="applyImmediately", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> applyImmediately;

    /**
     * @return Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
     * 
     */
    public Output<Boolean> applyImmediately() {
        return this.applyImmediately;
    }
    /**
     * The Neptune Cluster Amazon Resource Name (ARN)
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Neptune Cluster Amazon Resource Name (ARN)
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
     * 
     */
    @Export(name="availabilityZones", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> availabilityZones;

    /**
     * @return A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
     * 
     */
    public Output<List<String>> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * The days to retain backups for. Default `1`
     * 
     */
    @Export(name="backupRetentionPeriod", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> backupRetentionPeriod;

    /**
     * @return The days to retain backups for. Default `1`
     * 
     */
    public Output<Optional<Integer>> backupRetentionPeriod() {
        return Codegen.optional(this.backupRetentionPeriod);
    }
    /**
     * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    @Export(name="clusterIdentifier", refs={String.class}, tree="[0]")
    private Output<String> clusterIdentifier;

    /**
     * @return The cluster identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    public Output<String> clusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifier`.
     * 
     */
    @Export(name="clusterIdentifierPrefix", refs={String.class}, tree="[0]")
    private Output<String> clusterIdentifierPrefix;

    /**
     * @return Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifier`.
     * 
     */
    public Output<String> clusterIdentifierPrefix() {
        return this.clusterIdentifierPrefix;
    }
    /**
     * List of Neptune Instances that are a part of this cluster
     * 
     */
    @Export(name="clusterMembers", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> clusterMembers;

    /**
     * @return List of Neptune Instances that are a part of this cluster
     * 
     */
    public Output<List<String>> clusterMembers() {
        return this.clusterMembers;
    }
    /**
     * The Neptune Cluster Resource ID
     * 
     */
    @Export(name="clusterResourceId", refs={String.class}, tree="[0]")
    private Output<String> clusterResourceId;

    /**
     * @return The Neptune Cluster Resource ID
     * 
     */
    public Output<String> clusterResourceId() {
        return this.clusterResourceId;
    }
    /**
     * If set to true, tags are copied to any snapshot of the DB cluster that is created.
     * 
     */
    @Export(name="copyTagsToSnapshot", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> copyTagsToSnapshot;

    /**
     * @return If set to true, tags are copied to any snapshot of the DB cluster that is created.
     * 
     */
    public Output<Optional<Boolean>> copyTagsToSnapshot() {
        return Codegen.optional(this.copyTagsToSnapshot);
    }
    /**
     * A value that indicates whether the DB cluster has deletion protection enabled.The database can&#39;t be deleted when deletion protection is enabled. By default, deletion protection is disabled.
     * 
     */
    @Export(name="deletionProtection", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deletionProtection;

    /**
     * @return A value that indicates whether the DB cluster has deletion protection enabled.The database can&#39;t be deleted when deletion protection is enabled. By default, deletion protection is disabled.
     * 
     */
    public Output<Optional<Boolean>> deletionProtection() {
        return Codegen.optional(this.deletionProtection);
    }
    /**
     * A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit` and `slowquery`.
     * 
     */
    @Export(name="enableCloudwatchLogsExports", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> enableCloudwatchLogsExports;

    /**
     * @return A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit` and `slowquery`.
     * 
     */
    public Output<Optional<List<String>>> enableCloudwatchLogsExports() {
        return Codegen.optional(this.enableCloudwatchLogsExports);
    }
    /**
     * The DNS address of the Neptune instance
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output<String> endpoint;

    /**
     * @return The DNS address of the Neptune instance
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
     * 
     */
    @Export(name="engine", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> engine;

    /**
     * @return The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
     * 
     */
    public Output<Optional<String>> engine() {
        return Codegen.optional(this.engine);
    }
    /**
     * The database engine version.
     * 
     */
    @Export(name="engineVersion", refs={String.class}, tree="[0]")
    private Output<String> engineVersion;

    /**
     * @return The database engine version.
     * 
     */
    public Output<String> engineVersion() {
        return this.engineVersion;
    }
    /**
     * The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
     * 
     */
    @Export(name="finalSnapshotIdentifier", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> finalSnapshotIdentifier;

    /**
     * @return The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
     * 
     */
    public Output<Optional<String>> finalSnapshotIdentifier() {
        return Codegen.optional(this.finalSnapshotIdentifier);
    }
    /**
     * The global cluster identifier specified on `aws.neptune.GlobalCluster`.
     * 
     */
    @Export(name="globalClusterIdentifier", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> globalClusterIdentifier;

    /**
     * @return The global cluster identifier specified on `aws.neptune.GlobalCluster`.
     * 
     */
    public Output<Optional<String>> globalClusterIdentifier() {
        return Codegen.optional(this.globalClusterIdentifier);
    }
    /**
     * The Route53 Hosted Zone ID of the endpoint
     * 
     */
    @Export(name="hostedZoneId", refs={String.class}, tree="[0]")
    private Output<String> hostedZoneId;

    /**
     * @return The Route53 Hosted Zone ID of the endpoint
     * 
     */
    public Output<String> hostedZoneId() {
        return this.hostedZoneId;
    }
    /**
     * Specifies whether or not mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     * 
     */
    @Export(name="iamDatabaseAuthenticationEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> iamDatabaseAuthenticationEnabled;

    /**
     * @return Specifies whether or not mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     * 
     */
    public Output<Optional<Boolean>> iamDatabaseAuthenticationEnabled() {
        return Codegen.optional(this.iamDatabaseAuthenticationEnabled);
    }
    /**
     * A List of ARNs for the IAM roles to associate to the Neptune Cluster.
     * 
     */
    @Export(name="iamRoles", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> iamRoles;

    /**
     * @return A List of ARNs for the IAM roles to associate to the Neptune Cluster.
     * 
     */
    public Output<Optional<List<String>>> iamRoles() {
        return Codegen.optional(this.iamRoles);
    }
    /**
     * The ARN for the KMS encryption key. When specifying `kms_key_arn`, `storage_encrypted` needs to be set to true.
     * 
     */
    @Export(name="kmsKeyArn", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyArn;

    /**
     * @return The ARN for the KMS encryption key. When specifying `kms_key_arn`, `storage_encrypted` needs to be set to true.
     * 
     */
    public Output<String> kmsKeyArn() {
        return this.kmsKeyArn;
    }
    /**
     * A cluster parameter group to associate with the cluster.
     * 
     */
    @Export(name="neptuneClusterParameterGroupName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> neptuneClusterParameterGroupName;

    /**
     * @return A cluster parameter group to associate with the cluster.
     * 
     */
    public Output<Optional<String>> neptuneClusterParameterGroupName() {
        return Codegen.optional(this.neptuneClusterParameterGroupName);
    }
    /**
     * The name of the DB parameter group to apply to all instances of the DB cluster.
     * 
     */
    @Export(name="neptuneInstanceParameterGroupName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> neptuneInstanceParameterGroupName;

    /**
     * @return The name of the DB parameter group to apply to all instances of the DB cluster.
     * 
     */
    public Output<Optional<String>> neptuneInstanceParameterGroupName() {
        return Codegen.optional(this.neptuneInstanceParameterGroupName);
    }
    /**
     * A Neptune subnet group to associate with this Neptune instance.
     * 
     */
    @Export(name="neptuneSubnetGroupName", refs={String.class}, tree="[0]")
    private Output<String> neptuneSubnetGroupName;

    /**
     * @return A Neptune subnet group to associate with this Neptune instance.
     * 
     */
    public Output<String> neptuneSubnetGroupName() {
        return this.neptuneSubnetGroupName;
    }
    /**
     * The port on which the Neptune accepts connections. Default is `8182`.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The port on which the Neptune accepts connections. Default is `8182`.
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
     * 
     */
    @Export(name="preferredBackupWindow", refs={String.class}, tree="[0]")
    private Output<String> preferredBackupWindow;

    /**
     * @return The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
     * 
     */
    public Output<String> preferredBackupWindow() {
        return this.preferredBackupWindow;
    }
    /**
     * The weekly time range during which system maintenance can occur, in (UTC) e.g., wed:04:00-wed:04:30
     * 
     */
    @Export(name="preferredMaintenanceWindow", refs={String.class}, tree="[0]")
    private Output<String> preferredMaintenanceWindow;

    /**
     * @return The weekly time range during which system maintenance can occur, in (UTC) e.g., wed:04:00-wed:04:30
     * 
     */
    public Output<String> preferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    /**
     * A read-only endpoint for the Neptune cluster, automatically load-balanced across replicas
     * 
     */
    @Export(name="readerEndpoint", refs={String.class}, tree="[0]")
    private Output<String> readerEndpoint;

    /**
     * @return A read-only endpoint for the Neptune cluster, automatically load-balanced across replicas
     * 
     */
    public Output<String> readerEndpoint() {
        return this.readerEndpoint;
    }
    /**
     * ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
     * 
     */
    @Export(name="replicationSourceIdentifier", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> replicationSourceIdentifier;

    /**
     * @return ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
     * 
     */
    public Output<Optional<String>> replicationSourceIdentifier() {
        return Codegen.optional(this.replicationSourceIdentifier);
    }
    /**
     * If set, create the Neptune cluster as a serverless one. See Serverless for example block attributes.
     * 
     */
    @Export(name="serverlessV2ScalingConfiguration", refs={ClusterServerlessV2ScalingConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ ClusterServerlessV2ScalingConfiguration> serverlessV2ScalingConfiguration;

    /**
     * @return If set, create the Neptune cluster as a serverless one. See Serverless for example block attributes.
     * 
     */
    public Output<Optional<ClusterServerlessV2ScalingConfiguration>> serverlessV2ScalingConfiguration() {
        return Codegen.optional(this.serverlessV2ScalingConfiguration);
    }
    /**
     * Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
     * 
     */
    @Export(name="skipFinalSnapshot", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipFinalSnapshot;

    /**
     * @return Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> skipFinalSnapshot() {
        return Codegen.optional(this.skipFinalSnapshot);
    }
    /**
     * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot. Automated snapshots **should not** be used for this attribute, unless from a different cluster. Automated snapshots are deleted as part of cluster destruction when the resource is replaced.
     * 
     */
    @Export(name="snapshotIdentifier", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> snapshotIdentifier;

    /**
     * @return Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot. Automated snapshots **should not** be used for this attribute, unless from a different cluster. Automated snapshots are deleted as part of cluster destruction when the resource is replaced.
     * 
     */
    public Output<Optional<String>> snapshotIdentifier() {
        return Codegen.optional(this.snapshotIdentifier);
    }
    /**
     * Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
     * 
     */
    @Export(name="storageEncrypted", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> storageEncrypted;

    /**
     * @return Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
     * 
     */
    public Output<Optional<Boolean>> storageEncrypted() {
        return Codegen.optional(this.storageEncrypted);
    }
    /**
     * Storage type associated with the cluster `standard/iopt1`. Default: `standard`
     * 
     */
    @Export(name="storageType", refs={String.class}, tree="[0]")
    private Output<String> storageType;

    /**
     * @return Storage type associated with the cluster `standard/iopt1`. Default: `standard`
     * 
     */
    public Output<String> storageType() {
        return this.storageType;
    }
    /**
     * A map of tags to assign to the Neptune cluster. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the Neptune cluster. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * List of VPC security groups to associate with the Cluster
     * 
     */
    @Export(name="vpcSecurityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> vpcSecurityGroupIds;

    /**
     * @return List of VPC security groups to associate with the Cluster
     * 
     */
    public Output<List<String>> vpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, @Nullable ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, @Nullable ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:neptune/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:neptune/cluster:Cluster", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
