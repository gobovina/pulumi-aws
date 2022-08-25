// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.outputs;

import com.pulumi.aws.redshift.outputs.GetClusterClusterNode;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterResult {
    /**
     * @return Whether major version upgrades can be applied during maintenance period
     * 
     */
    private Boolean allowVersionUpgrade;
    /**
     * @return The value represents how the cluster is configured to use AQUA.
     * 
     */
    private String aquaConfigurationStatus;
    /**
     * @return Amazon Resource Name (ARN) of cluster.
     * 
     */
    private String arn;
    /**
     * @return The backup retention period
     * 
     */
    private Integer automatedSnapshotRetentionPeriod;
    /**
     * @return The availability zone of the cluster
     * 
     */
    private String availabilityZone;
    /**
     * @return Indicates whether the cluster is able to be relocated to another availability zone.
     * 
     */
    private Boolean availabilityZoneRelocationEnabled;
    /**
     * @return The name of the S3 bucket where the log files are to be stored
     * 
     */
    private String bucketName;
    /**
     * @return The cluster identifier
     * 
     */
    private String clusterIdentifier;
    /**
     * @return The nodes in the cluster. Cluster node blocks are documented below
     * 
     */
    private List<GetClusterClusterNode> clusterNodes;
    /**
     * @return The name of the parameter group to be associated with this cluster
     * 
     */
    private String clusterParameterGroupName;
    /**
     * @return The public key for the cluster
     * 
     */
    private String clusterPublicKey;
    /**
     * @return The cluster revision number
     * 
     */
    private String clusterRevisionNumber;
    /**
     * @return The security groups associated with the cluster
     * 
     */
    private List<String> clusterSecurityGroups;
    /**
     * @return The name of a cluster subnet group to be associated with this cluster
     * 
     */
    private String clusterSubnetGroupName;
    /**
     * @return The cluster type
     * 
     */
    private String clusterType;
    private String clusterVersion;
    /**
     * @return The name of the default database in the cluster
     * 
     */
    private String databaseName;
    /**
     * @return ∂The Amazon Resource Name (ARN) for the IAM role that was set as default for the cluster when the cluster was created.
     * 
     */
    private String defaultIamRoleArn;
    /**
     * @return The Elastic IP of the cluster
     * 
     */
    private String elasticIp;
    /**
     * @return Whether cluster logging is enabled
     * 
     */
    private Boolean enableLogging;
    /**
     * @return Whether the cluster data is encrypted
     * 
     */
    private Boolean encrypted;
    /**
     * @return The cluster endpoint
     * 
     */
    private String endpoint;
    /**
     * @return Whether enhanced VPC routing is enabled
     * 
     */
    private Boolean enhancedVpcRouting;
    /**
     * @return The IAM roles associated to the cluster
     * 
     */
    private List<String> iamRoles;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The KMS encryption key associated to the cluster
     * 
     */
    private String kmsKeyId;
    /**
     * @return The log destination type.
     * 
     */
    private String logDestinationType;
    /**
     * @return The collection of exported log types. Log types include the connection log, user log and user activity log.
     * 
     */
    private List<String> logExports;
    /**
     * @return The name of the maintenance track for the restored cluster.
     * 
     */
    private String maintenanceTrackName;
    /**
     * @return (Optional)  The default number of days to retain a manual snapshot.
     * 
     */
    private Integer manualSnapshotRetentionPeriod;
    /**
     * @return Username for the master DB user
     * 
     */
    private String masterUsername;
    /**
     * @return The cluster node type
     * 
     */
    private String nodeType;
    /**
     * @return The number of nodes in the cluster
     * 
     */
    private Integer numberOfNodes;
    /**
     * @return The port the cluster responds on
     * 
     */
    private Integer port;
    /**
     * @return The maintenance window
     * 
     */
    private String preferredMaintenanceWindow;
    /**
     * @return Whether the cluster is publicly accessible
     * 
     */
    private Boolean publiclyAccessible;
    /**
     * @return The folder inside the S3 bucket where the log files are stored
     * 
     */
    private String s3KeyPrefix;
    /**
     * @return The tags associated to the cluster
     * 
     */
    private @Nullable Map<String,String> tags;
    /**
     * @return The VPC Id associated with the cluster
     * 
     */
    private String vpcId;
    /**
     * @return The VPC security group Ids associated with the cluster
     * 
     */
    private List<String> vpcSecurityGroupIds;

    private GetClusterResult() {}
    /**
     * @return Whether major version upgrades can be applied during maintenance period
     * 
     */
    public Boolean allowVersionUpgrade() {
        return this.allowVersionUpgrade;
    }
    /**
     * @return The value represents how the cluster is configured to use AQUA.
     * 
     */
    public String aquaConfigurationStatus() {
        return this.aquaConfigurationStatus;
    }
    /**
     * @return Amazon Resource Name (ARN) of cluster.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The backup retention period
     * 
     */
    public Integer automatedSnapshotRetentionPeriod() {
        return this.automatedSnapshotRetentionPeriod;
    }
    /**
     * @return The availability zone of the cluster
     * 
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * @return Indicates whether the cluster is able to be relocated to another availability zone.
     * 
     */
    public Boolean availabilityZoneRelocationEnabled() {
        return this.availabilityZoneRelocationEnabled;
    }
    /**
     * @return The name of the S3 bucket where the log files are to be stored
     * 
     */
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * @return The cluster identifier
     * 
     */
    public String clusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * @return The nodes in the cluster. Cluster node blocks are documented below
     * 
     */
    public List<GetClusterClusterNode> clusterNodes() {
        return this.clusterNodes;
    }
    /**
     * @return The name of the parameter group to be associated with this cluster
     * 
     */
    public String clusterParameterGroupName() {
        return this.clusterParameterGroupName;
    }
    /**
     * @return The public key for the cluster
     * 
     */
    public String clusterPublicKey() {
        return this.clusterPublicKey;
    }
    /**
     * @return The cluster revision number
     * 
     */
    public String clusterRevisionNumber() {
        return this.clusterRevisionNumber;
    }
    /**
     * @return The security groups associated with the cluster
     * 
     */
    public List<String> clusterSecurityGroups() {
        return this.clusterSecurityGroups;
    }
    /**
     * @return The name of a cluster subnet group to be associated with this cluster
     * 
     */
    public String clusterSubnetGroupName() {
        return this.clusterSubnetGroupName;
    }
    /**
     * @return The cluster type
     * 
     */
    public String clusterType() {
        return this.clusterType;
    }
    public String clusterVersion() {
        return this.clusterVersion;
    }
    /**
     * @return The name of the default database in the cluster
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * @return ∂The Amazon Resource Name (ARN) for the IAM role that was set as default for the cluster when the cluster was created.
     * 
     */
    public String defaultIamRoleArn() {
        return this.defaultIamRoleArn;
    }
    /**
     * @return The Elastic IP of the cluster
     * 
     */
    public String elasticIp() {
        return this.elasticIp;
    }
    /**
     * @return Whether cluster logging is enabled
     * 
     */
    public Boolean enableLogging() {
        return this.enableLogging;
    }
    /**
     * @return Whether the cluster data is encrypted
     * 
     */
    public Boolean encrypted() {
        return this.encrypted;
    }
    /**
     * @return The cluster endpoint
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return Whether enhanced VPC routing is enabled
     * 
     */
    public Boolean enhancedVpcRouting() {
        return this.enhancedVpcRouting;
    }
    /**
     * @return The IAM roles associated to the cluster
     * 
     */
    public List<String> iamRoles() {
        return this.iamRoles;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The KMS encryption key associated to the cluster
     * 
     */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * @return The log destination type.
     * 
     */
    public String logDestinationType() {
        return this.logDestinationType;
    }
    /**
     * @return The collection of exported log types. Log types include the connection log, user log and user activity log.
     * 
     */
    public List<String> logExports() {
        return this.logExports;
    }
    /**
     * @return The name of the maintenance track for the restored cluster.
     * 
     */
    public String maintenanceTrackName() {
        return this.maintenanceTrackName;
    }
    /**
     * @return (Optional)  The default number of days to retain a manual snapshot.
     * 
     */
    public Integer manualSnapshotRetentionPeriod() {
        return this.manualSnapshotRetentionPeriod;
    }
    /**
     * @return Username for the master DB user
     * 
     */
    public String masterUsername() {
        return this.masterUsername;
    }
    /**
     * @return The cluster node type
     * 
     */
    public String nodeType() {
        return this.nodeType;
    }
    /**
     * @return The number of nodes in the cluster
     * 
     */
    public Integer numberOfNodes() {
        return this.numberOfNodes;
    }
    /**
     * @return The port the cluster responds on
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The maintenance window
     * 
     */
    public String preferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    /**
     * @return Whether the cluster is publicly accessible
     * 
     */
    public Boolean publiclyAccessible() {
        return this.publiclyAccessible;
    }
    /**
     * @return The folder inside the S3 bucket where the log files are stored
     * 
     */
    public String s3KeyPrefix() {
        return this.s3KeyPrefix;
    }
    /**
     * @return The tags associated to the cluster
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The VPC Id associated with the cluster
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The VPC security group Ids associated with the cluster
     * 
     */
    public List<String> vpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowVersionUpgrade;
        private String aquaConfigurationStatus;
        private String arn;
        private Integer automatedSnapshotRetentionPeriod;
        private String availabilityZone;
        private Boolean availabilityZoneRelocationEnabled;
        private String bucketName;
        private String clusterIdentifier;
        private List<GetClusterClusterNode> clusterNodes;
        private String clusterParameterGroupName;
        private String clusterPublicKey;
        private String clusterRevisionNumber;
        private List<String> clusterSecurityGroups;
        private String clusterSubnetGroupName;
        private String clusterType;
        private String clusterVersion;
        private String databaseName;
        private String defaultIamRoleArn;
        private String elasticIp;
        private Boolean enableLogging;
        private Boolean encrypted;
        private String endpoint;
        private Boolean enhancedVpcRouting;
        private List<String> iamRoles;
        private String id;
        private String kmsKeyId;
        private String logDestinationType;
        private List<String> logExports;
        private String maintenanceTrackName;
        private Integer manualSnapshotRetentionPeriod;
        private String masterUsername;
        private String nodeType;
        private Integer numberOfNodes;
        private Integer port;
        private String preferredMaintenanceWindow;
        private Boolean publiclyAccessible;
        private String s3KeyPrefix;
        private @Nullable Map<String,String> tags;
        private String vpcId;
        private List<String> vpcSecurityGroupIds;
        public Builder() {}
        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowVersionUpgrade = defaults.allowVersionUpgrade;
    	      this.aquaConfigurationStatus = defaults.aquaConfigurationStatus;
    	      this.arn = defaults.arn;
    	      this.automatedSnapshotRetentionPeriod = defaults.automatedSnapshotRetentionPeriod;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.availabilityZoneRelocationEnabled = defaults.availabilityZoneRelocationEnabled;
    	      this.bucketName = defaults.bucketName;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.clusterNodes = defaults.clusterNodes;
    	      this.clusterParameterGroupName = defaults.clusterParameterGroupName;
    	      this.clusterPublicKey = defaults.clusterPublicKey;
    	      this.clusterRevisionNumber = defaults.clusterRevisionNumber;
    	      this.clusterSecurityGroups = defaults.clusterSecurityGroups;
    	      this.clusterSubnetGroupName = defaults.clusterSubnetGroupName;
    	      this.clusterType = defaults.clusterType;
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.databaseName = defaults.databaseName;
    	      this.defaultIamRoleArn = defaults.defaultIamRoleArn;
    	      this.elasticIp = defaults.elasticIp;
    	      this.enableLogging = defaults.enableLogging;
    	      this.encrypted = defaults.encrypted;
    	      this.endpoint = defaults.endpoint;
    	      this.enhancedVpcRouting = defaults.enhancedVpcRouting;
    	      this.iamRoles = defaults.iamRoles;
    	      this.id = defaults.id;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.logDestinationType = defaults.logDestinationType;
    	      this.logExports = defaults.logExports;
    	      this.maintenanceTrackName = defaults.maintenanceTrackName;
    	      this.manualSnapshotRetentionPeriod = defaults.manualSnapshotRetentionPeriod;
    	      this.masterUsername = defaults.masterUsername;
    	      this.nodeType = defaults.nodeType;
    	      this.numberOfNodes = defaults.numberOfNodes;
    	      this.port = defaults.port;
    	      this.preferredMaintenanceWindow = defaults.preferredMaintenanceWindow;
    	      this.publiclyAccessible = defaults.publiclyAccessible;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
        }

        @CustomType.Setter
        public Builder allowVersionUpgrade(Boolean allowVersionUpgrade) {
            this.allowVersionUpgrade = Objects.requireNonNull(allowVersionUpgrade);
            return this;
        }
        @CustomType.Setter
        public Builder aquaConfigurationStatus(String aquaConfigurationStatus) {
            this.aquaConfigurationStatus = Objects.requireNonNull(aquaConfigurationStatus);
            return this;
        }
        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder automatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
            this.automatedSnapshotRetentionPeriod = Objects.requireNonNull(automatedSnapshotRetentionPeriod);
            return this;
        }
        @CustomType.Setter
        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        @CustomType.Setter
        public Builder availabilityZoneRelocationEnabled(Boolean availabilityZoneRelocationEnabled) {
            this.availabilityZoneRelocationEnabled = Objects.requireNonNull(availabilityZoneRelocationEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        @CustomType.Setter
        public Builder clusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }
        @CustomType.Setter
        public Builder clusterNodes(List<GetClusterClusterNode> clusterNodes) {
            this.clusterNodes = Objects.requireNonNull(clusterNodes);
            return this;
        }
        public Builder clusterNodes(GetClusterClusterNode... clusterNodes) {
            return clusterNodes(List.of(clusterNodes));
        }
        @CustomType.Setter
        public Builder clusterParameterGroupName(String clusterParameterGroupName) {
            this.clusterParameterGroupName = Objects.requireNonNull(clusterParameterGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder clusterPublicKey(String clusterPublicKey) {
            this.clusterPublicKey = Objects.requireNonNull(clusterPublicKey);
            return this;
        }
        @CustomType.Setter
        public Builder clusterRevisionNumber(String clusterRevisionNumber) {
            this.clusterRevisionNumber = Objects.requireNonNull(clusterRevisionNumber);
            return this;
        }
        @CustomType.Setter
        public Builder clusterSecurityGroups(List<String> clusterSecurityGroups) {
            this.clusterSecurityGroups = Objects.requireNonNull(clusterSecurityGroups);
            return this;
        }
        public Builder clusterSecurityGroups(String... clusterSecurityGroups) {
            return clusterSecurityGroups(List.of(clusterSecurityGroups));
        }
        @CustomType.Setter
        public Builder clusterSubnetGroupName(String clusterSubnetGroupName) {
            this.clusterSubnetGroupName = Objects.requireNonNull(clusterSubnetGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder clusterType(String clusterType) {
            this.clusterType = Objects.requireNonNull(clusterType);
            return this;
        }
        @CustomType.Setter
        public Builder clusterVersion(String clusterVersion) {
            this.clusterVersion = Objects.requireNonNull(clusterVersion);
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        @CustomType.Setter
        public Builder defaultIamRoleArn(String defaultIamRoleArn) {
            this.defaultIamRoleArn = Objects.requireNonNull(defaultIamRoleArn);
            return this;
        }
        @CustomType.Setter
        public Builder elasticIp(String elasticIp) {
            this.elasticIp = Objects.requireNonNull(elasticIp);
            return this;
        }
        @CustomType.Setter
        public Builder enableLogging(Boolean enableLogging) {
            this.enableLogging = Objects.requireNonNull(enableLogging);
            return this;
        }
        @CustomType.Setter
        public Builder encrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        @CustomType.Setter
        public Builder enhancedVpcRouting(Boolean enhancedVpcRouting) {
            this.enhancedVpcRouting = Objects.requireNonNull(enhancedVpcRouting);
            return this;
        }
        @CustomType.Setter
        public Builder iamRoles(List<String> iamRoles) {
            this.iamRoles = Objects.requireNonNull(iamRoles);
            return this;
        }
        public Builder iamRoles(String... iamRoles) {
            return iamRoles(List.of(iamRoles));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        @CustomType.Setter
        public Builder logDestinationType(String logDestinationType) {
            this.logDestinationType = Objects.requireNonNull(logDestinationType);
            return this;
        }
        @CustomType.Setter
        public Builder logExports(List<String> logExports) {
            this.logExports = Objects.requireNonNull(logExports);
            return this;
        }
        public Builder logExports(String... logExports) {
            return logExports(List.of(logExports));
        }
        @CustomType.Setter
        public Builder maintenanceTrackName(String maintenanceTrackName) {
            this.maintenanceTrackName = Objects.requireNonNull(maintenanceTrackName);
            return this;
        }
        @CustomType.Setter
        public Builder manualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
            this.manualSnapshotRetentionPeriod = Objects.requireNonNull(manualSnapshotRetentionPeriod);
            return this;
        }
        @CustomType.Setter
        public Builder masterUsername(String masterUsername) {
            this.masterUsername = Objects.requireNonNull(masterUsername);
            return this;
        }
        @CustomType.Setter
        public Builder nodeType(String nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }
        @CustomType.Setter
        public Builder numberOfNodes(Integer numberOfNodes) {
            this.numberOfNodes = Objects.requireNonNull(numberOfNodes);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder preferredMaintenanceWindow(String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = Objects.requireNonNull(preferredMaintenanceWindow);
            return this;
        }
        @CustomType.Setter
        public Builder publiclyAccessible(Boolean publiclyAccessible) {
            this.publiclyAccessible = Objects.requireNonNull(publiclyAccessible);
            return this;
        }
        @CustomType.Setter
        public Builder s3KeyPrefix(String s3KeyPrefix) {
            this.s3KeyPrefix = Objects.requireNonNull(s3KeyPrefix);
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        @CustomType.Setter
        public Builder vpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Objects.requireNonNull(vpcSecurityGroupIds);
            return this;
        }
        public Builder vpcSecurityGroupIds(String... vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(List.of(vpcSecurityGroupIds));
        }
        public GetClusterResult build() {
            final var o = new GetClusterResult();
            o.allowVersionUpgrade = allowVersionUpgrade;
            o.aquaConfigurationStatus = aquaConfigurationStatus;
            o.arn = arn;
            o.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
            o.availabilityZone = availabilityZone;
            o.availabilityZoneRelocationEnabled = availabilityZoneRelocationEnabled;
            o.bucketName = bucketName;
            o.clusterIdentifier = clusterIdentifier;
            o.clusterNodes = clusterNodes;
            o.clusterParameterGroupName = clusterParameterGroupName;
            o.clusterPublicKey = clusterPublicKey;
            o.clusterRevisionNumber = clusterRevisionNumber;
            o.clusterSecurityGroups = clusterSecurityGroups;
            o.clusterSubnetGroupName = clusterSubnetGroupName;
            o.clusterType = clusterType;
            o.clusterVersion = clusterVersion;
            o.databaseName = databaseName;
            o.defaultIamRoleArn = defaultIamRoleArn;
            o.elasticIp = elasticIp;
            o.enableLogging = enableLogging;
            o.encrypted = encrypted;
            o.endpoint = endpoint;
            o.enhancedVpcRouting = enhancedVpcRouting;
            o.iamRoles = iamRoles;
            o.id = id;
            o.kmsKeyId = kmsKeyId;
            o.logDestinationType = logDestinationType;
            o.logExports = logExports;
            o.maintenanceTrackName = maintenanceTrackName;
            o.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
            o.masterUsername = masterUsername;
            o.nodeType = nodeType;
            o.numberOfNodes = numberOfNodes;
            o.port = port;
            o.preferredMaintenanceWindow = preferredMaintenanceWindow;
            o.publiclyAccessible = publiclyAccessible;
            o.s3KeyPrefix = s3KeyPrefix;
            o.tags = tags;
            o.vpcId = vpcId;
            o.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return o;
        }
    }
}
