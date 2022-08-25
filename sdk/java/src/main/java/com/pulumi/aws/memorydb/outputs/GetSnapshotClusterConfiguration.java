// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.memorydb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSnapshotClusterConfiguration {
    /**
     * @return Description for the cluster.
     * 
     */
    private String description;
    /**
     * @return Version number of the Redis engine used by the cluster.
     * 
     */
    private String engineVersion;
    /**
     * @return The weekly time range during which maintenance on the cluster is performed.
     * 
     */
    private String maintenanceWindow;
    /**
     * @return Name of the snapshot.
     * 
     */
    private String name;
    /**
     * @return Compute and memory capacity of the nodes in the cluster.
     * 
     */
    private String nodeType;
    /**
     * @return Number of shards in the cluster.
     * 
     */
    private Integer numShards;
    /**
     * @return Name of the parameter group associated with the cluster.
     * 
     */
    private String parameterGroupName;
    /**
     * @return Port number on which the cluster accepts connections.
     * 
     */
    private Integer port;
    /**
     * @return Number of days for which MemoryDB retains automatic snapshots before deleting them.
     * 
     */
    private Integer snapshotRetentionLimit;
    /**
     * @return The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of the shard.
     * 
     */
    private String snapshotWindow;
    /**
     * @return Name of the subnet group used by the cluster.
     * 
     */
    private String subnetGroupName;
    /**
     * @return ARN of the SNS topic to which cluster notifications are sent.
     * 
     */
    private String topicArn;
    /**
     * @return The VPC in which the cluster exists.
     * 
     */
    private String vpcId;

    private GetSnapshotClusterConfiguration() {}
    /**
     * @return Description for the cluster.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Version number of the Redis engine used by the cluster.
     * 
     */
    public String engineVersion() {
        return this.engineVersion;
    }
    /**
     * @return The weekly time range during which maintenance on the cluster is performed.
     * 
     */
    public String maintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * @return Name of the snapshot.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Compute and memory capacity of the nodes in the cluster.
     * 
     */
    public String nodeType() {
        return this.nodeType;
    }
    /**
     * @return Number of shards in the cluster.
     * 
     */
    public Integer numShards() {
        return this.numShards;
    }
    /**
     * @return Name of the parameter group associated with the cluster.
     * 
     */
    public String parameterGroupName() {
        return this.parameterGroupName;
    }
    /**
     * @return Port number on which the cluster accepts connections.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Number of days for which MemoryDB retains automatic snapshots before deleting them.
     * 
     */
    public Integer snapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }
    /**
     * @return The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of the shard.
     * 
     */
    public String snapshotWindow() {
        return this.snapshotWindow;
    }
    /**
     * @return Name of the subnet group used by the cluster.
     * 
     */
    public String subnetGroupName() {
        return this.subnetGroupName;
    }
    /**
     * @return ARN of the SNS topic to which cluster notifications are sent.
     * 
     */
    public String topicArn() {
        return this.topicArn;
    }
    /**
     * @return The VPC in which the cluster exists.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotClusterConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String engineVersion;
        private String maintenanceWindow;
        private String name;
        private String nodeType;
        private Integer numShards;
        private String parameterGroupName;
        private Integer port;
        private Integer snapshotRetentionLimit;
        private String snapshotWindow;
        private String subnetGroupName;
        private String topicArn;
        private String vpcId;
        public Builder() {}
        public Builder(GetSnapshotClusterConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.engineVersion = defaults.engineVersion;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.name = defaults.name;
    	      this.nodeType = defaults.nodeType;
    	      this.numShards = defaults.numShards;
    	      this.parameterGroupName = defaults.parameterGroupName;
    	      this.port = defaults.port;
    	      this.snapshotRetentionLimit = defaults.snapshotRetentionLimit;
    	      this.snapshotWindow = defaults.snapshotWindow;
    	      this.subnetGroupName = defaults.subnetGroupName;
    	      this.topicArn = defaults.topicArn;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }
        @CustomType.Setter
        public Builder maintenanceWindow(String maintenanceWindow) {
            this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nodeType(String nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }
        @CustomType.Setter
        public Builder numShards(Integer numShards) {
            this.numShards = Objects.requireNonNull(numShards);
            return this;
        }
        @CustomType.Setter
        public Builder parameterGroupName(String parameterGroupName) {
            this.parameterGroupName = Objects.requireNonNull(parameterGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotRetentionLimit(Integer snapshotRetentionLimit) {
            this.snapshotRetentionLimit = Objects.requireNonNull(snapshotRetentionLimit);
            return this;
        }
        @CustomType.Setter
        public Builder snapshotWindow(String snapshotWindow) {
            this.snapshotWindow = Objects.requireNonNull(snapshotWindow);
            return this;
        }
        @CustomType.Setter
        public Builder subnetGroupName(String subnetGroupName) {
            this.subnetGroupName = Objects.requireNonNull(subnetGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder topicArn(String topicArn) {
            this.topicArn = Objects.requireNonNull(topicArn);
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetSnapshotClusterConfiguration build() {
            final var o = new GetSnapshotClusterConfiguration();
            o.description = description;
            o.engineVersion = engineVersion;
            o.maintenanceWindow = maintenanceWindow;
            o.name = name;
            o.nodeType = nodeType;
            o.numShards = numShards;
            o.parameterGroupName = parameterGroupName;
            o.port = port;
            o.snapshotRetentionLimit = snapshotRetentionLimit;
            o.snapshotWindow = snapshotWindow;
            o.subnetGroupName = subnetGroupName;
            o.topicArn = topicArn;
            o.vpcId = vpcId;
            return o;
        }
    }
}
