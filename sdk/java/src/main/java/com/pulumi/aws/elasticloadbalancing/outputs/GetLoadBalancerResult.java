// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancing.outputs;

import com.pulumi.aws.elasticloadbalancing.outputs.GetLoadBalancerAccessLogs;
import com.pulumi.aws.elasticloadbalancing.outputs.GetLoadBalancerHealthCheck;
import com.pulumi.aws.elasticloadbalancing.outputs.GetLoadBalancerListener;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerResult {
    private GetLoadBalancerAccessLogs accessLogs;
    private String arn;
    private List<String> availabilityZones;
    private Boolean connectionDraining;
    private Integer connectionDrainingTimeout;
    private Boolean crossZoneLoadBalancing;
    private String desyncMitigationMode;
    private String dnsName;
    private GetLoadBalancerHealthCheck healthCheck;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Integer idleTimeout;
    private List<String> instances;
    private Boolean internal;
    private List<GetLoadBalancerListener> listeners;
    private String name;
    private List<String> securityGroups;
    private String sourceSecurityGroup;
    private String sourceSecurityGroupId;
    private List<String> subnets;
    private Map<String,String> tags;
    private String zoneId;

    private GetLoadBalancerResult() {}
    public GetLoadBalancerAccessLogs accessLogs() {
        return this.accessLogs;
    }
    public String arn() {
        return this.arn;
    }
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }
    public Boolean connectionDraining() {
        return this.connectionDraining;
    }
    public Integer connectionDrainingTimeout() {
        return this.connectionDrainingTimeout;
    }
    public Boolean crossZoneLoadBalancing() {
        return this.crossZoneLoadBalancing;
    }
    public String desyncMitigationMode() {
        return this.desyncMitigationMode;
    }
    public String dnsName() {
        return this.dnsName;
    }
    public GetLoadBalancerHealthCheck healthCheck() {
        return this.healthCheck;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Integer idleTimeout() {
        return this.idleTimeout;
    }
    public List<String> instances() {
        return this.instances;
    }
    public Boolean internal() {
        return this.internal;
    }
    public List<GetLoadBalancerListener> listeners() {
        return this.listeners;
    }
    public String name() {
        return this.name;
    }
    public List<String> securityGroups() {
        return this.securityGroups;
    }
    public String sourceSecurityGroup() {
        return this.sourceSecurityGroup;
    }
    public String sourceSecurityGroupId() {
        return this.sourceSecurityGroupId;
    }
    public List<String> subnets() {
        return this.subnets;
    }
    public Map<String,String> tags() {
        return this.tags;
    }
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetLoadBalancerAccessLogs accessLogs;
        private String arn;
        private List<String> availabilityZones;
        private Boolean connectionDraining;
        private Integer connectionDrainingTimeout;
        private Boolean crossZoneLoadBalancing;
        private String desyncMitigationMode;
        private String dnsName;
        private GetLoadBalancerHealthCheck healthCheck;
        private String id;
        private Integer idleTimeout;
        private List<String> instances;
        private Boolean internal;
        private List<GetLoadBalancerListener> listeners;
        private String name;
        private List<String> securityGroups;
        private String sourceSecurityGroup;
        private String sourceSecurityGroupId;
        private List<String> subnets;
        private Map<String,String> tags;
        private String zoneId;
        public Builder() {}
        public Builder(GetLoadBalancerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogs = defaults.accessLogs;
    	      this.arn = defaults.arn;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.connectionDraining = defaults.connectionDraining;
    	      this.connectionDrainingTimeout = defaults.connectionDrainingTimeout;
    	      this.crossZoneLoadBalancing = defaults.crossZoneLoadBalancing;
    	      this.desyncMitigationMode = defaults.desyncMitigationMode;
    	      this.dnsName = defaults.dnsName;
    	      this.healthCheck = defaults.healthCheck;
    	      this.id = defaults.id;
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.instances = defaults.instances;
    	      this.internal = defaults.internal;
    	      this.listeners = defaults.listeners;
    	      this.name = defaults.name;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sourceSecurityGroup = defaults.sourceSecurityGroup;
    	      this.sourceSecurityGroupId = defaults.sourceSecurityGroupId;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder accessLogs(GetLoadBalancerAccessLogs accessLogs) {
            this.accessLogs = Objects.requireNonNull(accessLogs);
            return this;
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
        public Builder connectionDraining(Boolean connectionDraining) {
            this.connectionDraining = Objects.requireNonNull(connectionDraining);
            return this;
        }
        @CustomType.Setter
        public Builder connectionDrainingTimeout(Integer connectionDrainingTimeout) {
            this.connectionDrainingTimeout = Objects.requireNonNull(connectionDrainingTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder crossZoneLoadBalancing(Boolean crossZoneLoadBalancing) {
            this.crossZoneLoadBalancing = Objects.requireNonNull(crossZoneLoadBalancing);
            return this;
        }
        @CustomType.Setter
        public Builder desyncMitigationMode(String desyncMitigationMode) {
            this.desyncMitigationMode = Objects.requireNonNull(desyncMitigationMode);
            return this;
        }
        @CustomType.Setter
        public Builder dnsName(String dnsName) {
            this.dnsName = Objects.requireNonNull(dnsName);
            return this;
        }
        @CustomType.Setter
        public Builder healthCheck(GetLoadBalancerHealthCheck healthCheck) {
            this.healthCheck = Objects.requireNonNull(healthCheck);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = Objects.requireNonNull(idleTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder instances(List<String> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }
        @CustomType.Setter
        public Builder internal(Boolean internal) {
            this.internal = Objects.requireNonNull(internal);
            return this;
        }
        @CustomType.Setter
        public Builder listeners(List<GetLoadBalancerListener> listeners) {
            this.listeners = Objects.requireNonNull(listeners);
            return this;
        }
        public Builder listeners(GetLoadBalancerListener... listeners) {
            return listeners(List.of(listeners));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder securityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        @CustomType.Setter
        public Builder sourceSecurityGroup(String sourceSecurityGroup) {
            this.sourceSecurityGroup = Objects.requireNonNull(sourceSecurityGroup);
            return this;
        }
        @CustomType.Setter
        public Builder sourceSecurityGroupId(String sourceSecurityGroupId) {
            this.sourceSecurityGroupId = Objects.requireNonNull(sourceSecurityGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder subnets(List<String> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }
        public GetLoadBalancerResult build() {
            final var o = new GetLoadBalancerResult();
            o.accessLogs = accessLogs;
            o.arn = arn;
            o.availabilityZones = availabilityZones;
            o.connectionDraining = connectionDraining;
            o.connectionDrainingTimeout = connectionDrainingTimeout;
            o.crossZoneLoadBalancing = crossZoneLoadBalancing;
            o.desyncMitigationMode = desyncMitigationMode;
            o.dnsName = dnsName;
            o.healthCheck = healthCheck;
            o.id = id;
            o.idleTimeout = idleTimeout;
            o.instances = instances;
            o.internal = internal;
            o.listeners = listeners;
            o.name = name;
            o.securityGroups = securityGroups;
            o.sourceSecurityGroup = sourceSecurityGroup;
            o.sourceSecurityGroupId = sourceSecurityGroupId;
            o.subnets = subnets;
            o.tags = tags;
            o.zoneId = zoneId;
            return o;
        }
    }
}
