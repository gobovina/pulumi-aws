// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClusterResult {
    private String arn;
    private List<String> availabilityZones;
    private Integer backtrackWindow;
    private Integer backupRetentionPeriod;
    private String clusterIdentifier;
    private List<String> clusterMembers;
    private String clusterResourceId;
    private String databaseName;
    private String dbClusterParameterGroupName;
    private String dbSubnetGroupName;
    private List<String> enabledCloudwatchLogsExports;
    private String endpoint;
    private String engine;
    private String engineVersion;
    private String finalSnapshotIdentifier;
    private String hostedZoneId;
    private Boolean iamDatabaseAuthenticationEnabled;
    private List<String> iamRoles;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String kmsKeyId;
    private String masterUsername;
    private Integer port;
    private String preferredBackupWindow;
    private String preferredMaintenanceWindow;
    private String readerEndpoint;
    private String replicationSourceIdentifier;
    private Boolean storageEncrypted;
    private Map<String,String> tags;
    private List<String> vpcSecurityGroupIds;

    private GetClusterResult() {}
    public String arn() {
        return this.arn;
    }
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }
    public Integer backtrackWindow() {
        return this.backtrackWindow;
    }
    public Integer backupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }
    public String clusterIdentifier() {
        return this.clusterIdentifier;
    }
    public List<String> clusterMembers() {
        return this.clusterMembers;
    }
    public String clusterResourceId() {
        return this.clusterResourceId;
    }
    public String databaseName() {
        return this.databaseName;
    }
    public String dbClusterParameterGroupName() {
        return this.dbClusterParameterGroupName;
    }
    public String dbSubnetGroupName() {
        return this.dbSubnetGroupName;
    }
    public List<String> enabledCloudwatchLogsExports() {
        return this.enabledCloudwatchLogsExports;
    }
    public String endpoint() {
        return this.endpoint;
    }
    public String engine() {
        return this.engine;
    }
    public String engineVersion() {
        return this.engineVersion;
    }
    public String finalSnapshotIdentifier() {
        return this.finalSnapshotIdentifier;
    }
    public String hostedZoneId() {
        return this.hostedZoneId;
    }
    public Boolean iamDatabaseAuthenticationEnabled() {
        return this.iamDatabaseAuthenticationEnabled;
    }
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
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    public String masterUsername() {
        return this.masterUsername;
    }
    public Integer port() {
        return this.port;
    }
    public String preferredBackupWindow() {
        return this.preferredBackupWindow;
    }
    public String preferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    public String readerEndpoint() {
        return this.readerEndpoint;
    }
    public String replicationSourceIdentifier() {
        return this.replicationSourceIdentifier;
    }
    public Boolean storageEncrypted() {
        return this.storageEncrypted;
    }
    public Map<String,String> tags() {
        return this.tags;
    }
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
        private String arn;
        private List<String> availabilityZones;
        private Integer backtrackWindow;
        private Integer backupRetentionPeriod;
        private String clusterIdentifier;
        private List<String> clusterMembers;
        private String clusterResourceId;
        private String databaseName;
        private String dbClusterParameterGroupName;
        private String dbSubnetGroupName;
        private List<String> enabledCloudwatchLogsExports;
        private String endpoint;
        private String engine;
        private String engineVersion;
        private String finalSnapshotIdentifier;
        private String hostedZoneId;
        private Boolean iamDatabaseAuthenticationEnabled;
        private List<String> iamRoles;
        private String id;
        private String kmsKeyId;
        private String masterUsername;
        private Integer port;
        private String preferredBackupWindow;
        private String preferredMaintenanceWindow;
        private String readerEndpoint;
        private String replicationSourceIdentifier;
        private Boolean storageEncrypted;
        private Map<String,String> tags;
        private List<String> vpcSecurityGroupIds;
        public Builder() {}
        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.backtrackWindow = defaults.backtrackWindow;
    	      this.backupRetentionPeriod = defaults.backupRetentionPeriod;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.clusterMembers = defaults.clusterMembers;
    	      this.clusterResourceId = defaults.clusterResourceId;
    	      this.databaseName = defaults.databaseName;
    	      this.dbClusterParameterGroupName = defaults.dbClusterParameterGroupName;
    	      this.dbSubnetGroupName = defaults.dbSubnetGroupName;
    	      this.enabledCloudwatchLogsExports = defaults.enabledCloudwatchLogsExports;
    	      this.endpoint = defaults.endpoint;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.finalSnapshotIdentifier = defaults.finalSnapshotIdentifier;
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.iamDatabaseAuthenticationEnabled = defaults.iamDatabaseAuthenticationEnabled;
    	      this.iamRoles = defaults.iamRoles;
    	      this.id = defaults.id;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.masterUsername = defaults.masterUsername;
    	      this.port = defaults.port;
    	      this.preferredBackupWindow = defaults.preferredBackupWindow;
    	      this.preferredMaintenanceWindow = defaults.preferredMaintenanceWindow;
    	      this.readerEndpoint = defaults.readerEndpoint;
    	      this.replicationSourceIdentifier = defaults.replicationSourceIdentifier;
    	      this.storageEncrypted = defaults.storageEncrypted;
    	      this.tags = defaults.tags;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        @CustomType.Setter
        public Builder backtrackWindow(Integer backtrackWindow) {
            this.backtrackWindow = Objects.requireNonNull(backtrackWindow);
            return this;
        }
        @CustomType.Setter
        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            this.backupRetentionPeriod = Objects.requireNonNull(backupRetentionPeriod);
            return this;
        }
        @CustomType.Setter
        public Builder clusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }
        @CustomType.Setter
        public Builder clusterMembers(List<String> clusterMembers) {
            this.clusterMembers = Objects.requireNonNull(clusterMembers);
            return this;
        }
        public Builder clusterMembers(String... clusterMembers) {
            return clusterMembers(List.of(clusterMembers));
        }
        @CustomType.Setter
        public Builder clusterResourceId(String clusterResourceId) {
            this.clusterResourceId = Objects.requireNonNull(clusterResourceId);
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        @CustomType.Setter
        public Builder dbClusterParameterGroupName(String dbClusterParameterGroupName) {
            this.dbClusterParameterGroupName = Objects.requireNonNull(dbClusterParameterGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder dbSubnetGroupName(String dbSubnetGroupName) {
            this.dbSubnetGroupName = Objects.requireNonNull(dbSubnetGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder enabledCloudwatchLogsExports(List<String> enabledCloudwatchLogsExports) {
            this.enabledCloudwatchLogsExports = Objects.requireNonNull(enabledCloudwatchLogsExports);
            return this;
        }
        public Builder enabledCloudwatchLogsExports(String... enabledCloudwatchLogsExports) {
            return enabledCloudwatchLogsExports(List.of(enabledCloudwatchLogsExports));
        }
        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        @CustomType.Setter
        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        @CustomType.Setter
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }
        @CustomType.Setter
        public Builder finalSnapshotIdentifier(String finalSnapshotIdentifier) {
            this.finalSnapshotIdentifier = Objects.requireNonNull(finalSnapshotIdentifier);
            return this;
        }
        @CustomType.Setter
        public Builder hostedZoneId(String hostedZoneId) {
            this.hostedZoneId = Objects.requireNonNull(hostedZoneId);
            return this;
        }
        @CustomType.Setter
        public Builder iamDatabaseAuthenticationEnabled(Boolean iamDatabaseAuthenticationEnabled) {
            this.iamDatabaseAuthenticationEnabled = Objects.requireNonNull(iamDatabaseAuthenticationEnabled);
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
        public Builder masterUsername(String masterUsername) {
            this.masterUsername = Objects.requireNonNull(masterUsername);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder preferredBackupWindow(String preferredBackupWindow) {
            this.preferredBackupWindow = Objects.requireNonNull(preferredBackupWindow);
            return this;
        }
        @CustomType.Setter
        public Builder preferredMaintenanceWindow(String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = Objects.requireNonNull(preferredMaintenanceWindow);
            return this;
        }
        @CustomType.Setter
        public Builder readerEndpoint(String readerEndpoint) {
            this.readerEndpoint = Objects.requireNonNull(readerEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder replicationSourceIdentifier(String replicationSourceIdentifier) {
            this.replicationSourceIdentifier = Objects.requireNonNull(replicationSourceIdentifier);
            return this;
        }
        @CustomType.Setter
        public Builder storageEncrypted(Boolean storageEncrypted) {
            this.storageEncrypted = Objects.requireNonNull(storageEncrypted);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
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
            o.arn = arn;
            o.availabilityZones = availabilityZones;
            o.backtrackWindow = backtrackWindow;
            o.backupRetentionPeriod = backupRetentionPeriod;
            o.clusterIdentifier = clusterIdentifier;
            o.clusterMembers = clusterMembers;
            o.clusterResourceId = clusterResourceId;
            o.databaseName = databaseName;
            o.dbClusterParameterGroupName = dbClusterParameterGroupName;
            o.dbSubnetGroupName = dbSubnetGroupName;
            o.enabledCloudwatchLogsExports = enabledCloudwatchLogsExports;
            o.endpoint = endpoint;
            o.engine = engine;
            o.engineVersion = engineVersion;
            o.finalSnapshotIdentifier = finalSnapshotIdentifier;
            o.hostedZoneId = hostedZoneId;
            o.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
            o.iamRoles = iamRoles;
            o.id = id;
            o.kmsKeyId = kmsKeyId;
            o.masterUsername = masterUsername;
            o.port = port;
            o.preferredBackupWindow = preferredBackupWindow;
            o.preferredMaintenanceWindow = preferredMaintenanceWindow;
            o.readerEndpoint = readerEndpoint;
            o.replicationSourceIdentifier = replicationSourceIdentifier;
            o.storageEncrypted = storageEncrypted;
            o.tags = tags;
            o.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return o;
        }
    }
}
