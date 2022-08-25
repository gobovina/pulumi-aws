// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticache.outputs;

import com.pulumi.aws.elasticache.outputs.GetClusterCacheNode;
import com.pulumi.aws.elasticache.outputs.GetClusterLogDeliveryConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClusterResult {
    private String arn;
    /**
     * @return The Availability Zone for the cache cluster.
     * 
     */
    private String availabilityZone;
    /**
     * @return List of node objects including `id`, `address`, `port` and `availability_zone`.
     * Referenceable e.g., as `${data.aws_elasticache_cluster.bar.cache_nodes.0.address}`
     * 
     */
    private List<GetClusterCacheNode> cacheNodes;
    /**
     * @return (Memcached only) The DNS name of the cache cluster without the port appended.
     * 
     */
    private String clusterAddress;
    private String clusterId;
    /**
     * @return (Memcached only) The configuration endpoint to allow host discovery.
     * 
     */
    private String configurationEndpoint;
    /**
     * @return Name of the cache engine.
     * 
     */
    private String engine;
    /**
     * @return Version number of the cache engine.
     * 
     */
    private String engineVersion;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Redis [SLOWLOG](https://redis.io/commands/slowlog) or Redis [Engine Log](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Log_Delivery.html#Log_contents-engine-log) delivery settings.
     * 
     */
    private List<GetClusterLogDeliveryConfiguration> logDeliveryConfigurations;
    /**
     * @return Specifies the weekly time range for when maintenance
     * on the cache cluster is performed.
     * 
     */
    private String maintenanceWindow;
    /**
     * @return The cluster node type.
     * 
     */
    private String nodeType;
    /**
     * @return An Amazon Resource Name (ARN) of an
     * SNS topic that ElastiCache notifications get sent to.
     * 
     */
    private String notificationTopicArn;
    /**
     * @return The number of cache nodes that the cache cluster has.
     * 
     */
    private Integer numCacheNodes;
    /**
     * @return Name of the parameter group associated with this cache cluster.
     * 
     */
    private String parameterGroupName;
    /**
     * @return The port number on which each of the cache nodes will
     * accept connections.
     * 
     */
    private Integer port;
    /**
     * @return The replication group to which this cache cluster belongs.
     * 
     */
    private String replicationGroupId;
    /**
     * @return List VPC security groups associated with the cache cluster.
     * 
     */
    private List<String> securityGroupIds;
    /**
     * @return List of security group names associated with this cache cluster.
     * 
     */
    private List<String> securityGroupNames;
    /**
     * @return The number of days for which ElastiCache will
     * retain automatic cache cluster snapshots before deleting them.
     * 
     */
    private Integer snapshotRetentionLimit;
    /**
     * @return The daily time range (in UTC) during which ElastiCache will
     * begin taking a daily snapshot of the cache cluster.
     * 
     */
    private String snapshotWindow;
    /**
     * @return Name of the subnet group associated to the cache cluster.
     * 
     */
    private String subnetGroupName;
    /**
     * @return The tags assigned to the resource
     * 
     */
    private Map<String,String> tags;

    private GetClusterResult() {}
    public String arn() {
        return this.arn;
    }
    /**
     * @return The Availability Zone for the cache cluster.
     * 
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * @return List of node objects including `id`, `address`, `port` and `availability_zone`.
     * Referenceable e.g., as `${data.aws_elasticache_cluster.bar.cache_nodes.0.address}`
     * 
     */
    public List<GetClusterCacheNode> cacheNodes() {
        return this.cacheNodes;
    }
    /**
     * @return (Memcached only) The DNS name of the cache cluster without the port appended.
     * 
     */
    public String clusterAddress() {
        return this.clusterAddress;
    }
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return (Memcached only) The configuration endpoint to allow host discovery.
     * 
     */
    public String configurationEndpoint() {
        return this.configurationEndpoint;
    }
    /**
     * @return Name of the cache engine.
     * 
     */
    public String engine() {
        return this.engine;
    }
    /**
     * @return Version number of the cache engine.
     * 
     */
    public String engineVersion() {
        return this.engineVersion;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Redis [SLOWLOG](https://redis.io/commands/slowlog) or Redis [Engine Log](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Log_Delivery.html#Log_contents-engine-log) delivery settings.
     * 
     */
    public List<GetClusterLogDeliveryConfiguration> logDeliveryConfigurations() {
        return this.logDeliveryConfigurations;
    }
    /**
     * @return Specifies the weekly time range for when maintenance
     * on the cache cluster is performed.
     * 
     */
    public String maintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * @return The cluster node type.
     * 
     */
    public String nodeType() {
        return this.nodeType;
    }
    /**
     * @return An Amazon Resource Name (ARN) of an
     * SNS topic that ElastiCache notifications get sent to.
     * 
     */
    public String notificationTopicArn() {
        return this.notificationTopicArn;
    }
    /**
     * @return The number of cache nodes that the cache cluster has.
     * 
     */
    public Integer numCacheNodes() {
        return this.numCacheNodes;
    }
    /**
     * @return Name of the parameter group associated with this cache cluster.
     * 
     */
    public String parameterGroupName() {
        return this.parameterGroupName;
    }
    /**
     * @return The port number on which each of the cache nodes will
     * accept connections.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The replication group to which this cache cluster belongs.
     * 
     */
    public String replicationGroupId() {
        return this.replicationGroupId;
    }
    /**
     * @return List VPC security groups associated with the cache cluster.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * @return List of security group names associated with this cache cluster.
     * 
     */
    public List<String> securityGroupNames() {
        return this.securityGroupNames;
    }
    /**
     * @return The number of days for which ElastiCache will
     * retain automatic cache cluster snapshots before deleting them.
     * 
     */
    public Integer snapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }
    /**
     * @return The daily time range (in UTC) during which ElastiCache will
     * begin taking a daily snapshot of the cache cluster.
     * 
     */
    public String snapshotWindow() {
        return this.snapshotWindow;
    }
    /**
     * @return Name of the subnet group associated to the cache cluster.
     * 
     */
    public String subnetGroupName() {
        return this.subnetGroupName;
    }
    /**
     * @return The tags assigned to the resource
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
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
        private String availabilityZone;
        private List<GetClusterCacheNode> cacheNodes;
        private String clusterAddress;
        private String clusterId;
        private String configurationEndpoint;
        private String engine;
        private String engineVersion;
        private String id;
        private List<GetClusterLogDeliveryConfiguration> logDeliveryConfigurations;
        private String maintenanceWindow;
        private String nodeType;
        private String notificationTopicArn;
        private Integer numCacheNodes;
        private String parameterGroupName;
        private Integer port;
        private String replicationGroupId;
        private List<String> securityGroupIds;
        private List<String> securityGroupNames;
        private Integer snapshotRetentionLimit;
        private String snapshotWindow;
        private String subnetGroupName;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.cacheNodes = defaults.cacheNodes;
    	      this.clusterAddress = defaults.clusterAddress;
    	      this.clusterId = defaults.clusterId;
    	      this.configurationEndpoint = defaults.configurationEndpoint;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.id = defaults.id;
    	      this.logDeliveryConfigurations = defaults.logDeliveryConfigurations;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.nodeType = defaults.nodeType;
    	      this.notificationTopicArn = defaults.notificationTopicArn;
    	      this.numCacheNodes = defaults.numCacheNodes;
    	      this.parameterGroupName = defaults.parameterGroupName;
    	      this.port = defaults.port;
    	      this.replicationGroupId = defaults.replicationGroupId;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.securityGroupNames = defaults.securityGroupNames;
    	      this.snapshotRetentionLimit = defaults.snapshotRetentionLimit;
    	      this.snapshotWindow = defaults.snapshotWindow;
    	      this.subnetGroupName = defaults.subnetGroupName;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        @CustomType.Setter
        public Builder cacheNodes(List<GetClusterCacheNode> cacheNodes) {
            this.cacheNodes = Objects.requireNonNull(cacheNodes);
            return this;
        }
        public Builder cacheNodes(GetClusterCacheNode... cacheNodes) {
            return cacheNodes(List.of(cacheNodes));
        }
        @CustomType.Setter
        public Builder clusterAddress(String clusterAddress) {
            this.clusterAddress = Objects.requireNonNull(clusterAddress);
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        @CustomType.Setter
        public Builder configurationEndpoint(String configurationEndpoint) {
            this.configurationEndpoint = Objects.requireNonNull(configurationEndpoint);
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
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder logDeliveryConfigurations(List<GetClusterLogDeliveryConfiguration> logDeliveryConfigurations) {
            this.logDeliveryConfigurations = Objects.requireNonNull(logDeliveryConfigurations);
            return this;
        }
        public Builder logDeliveryConfigurations(GetClusterLogDeliveryConfiguration... logDeliveryConfigurations) {
            return logDeliveryConfigurations(List.of(logDeliveryConfigurations));
        }
        @CustomType.Setter
        public Builder maintenanceWindow(String maintenanceWindow) {
            this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
            return this;
        }
        @CustomType.Setter
        public Builder nodeType(String nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }
        @CustomType.Setter
        public Builder notificationTopicArn(String notificationTopicArn) {
            this.notificationTopicArn = Objects.requireNonNull(notificationTopicArn);
            return this;
        }
        @CustomType.Setter
        public Builder numCacheNodes(Integer numCacheNodes) {
            this.numCacheNodes = Objects.requireNonNull(numCacheNodes);
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
        public Builder replicationGroupId(String replicationGroupId) {
            this.replicationGroupId = Objects.requireNonNull(replicationGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        @CustomType.Setter
        public Builder securityGroupNames(List<String> securityGroupNames) {
            this.securityGroupNames = Objects.requireNonNull(securityGroupNames);
            return this;
        }
        public Builder securityGroupNames(String... securityGroupNames) {
            return securityGroupNames(List.of(securityGroupNames));
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
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetClusterResult build() {
            final var o = new GetClusterResult();
            o.arn = arn;
            o.availabilityZone = availabilityZone;
            o.cacheNodes = cacheNodes;
            o.clusterAddress = clusterAddress;
            o.clusterId = clusterId;
            o.configurationEndpoint = configurationEndpoint;
            o.engine = engine;
            o.engineVersion = engineVersion;
            o.id = id;
            o.logDeliveryConfigurations = logDeliveryConfigurations;
            o.maintenanceWindow = maintenanceWindow;
            o.nodeType = nodeType;
            o.notificationTopicArn = notificationTopicArn;
            o.numCacheNodes = numCacheNodes;
            o.parameterGroupName = parameterGroupName;
            o.port = port;
            o.replicationGroupId = replicationGroupId;
            o.securityGroupIds = securityGroupIds;
            o.securityGroupNames = securityGroupNames;
            o.snapshotRetentionLimit = snapshotRetentionLimit;
            o.snapshotWindow = snapshotWindow;
            o.subnetGroupName = subnetGroupName;
            o.tags = tags;
            return o;
        }
    }
}
