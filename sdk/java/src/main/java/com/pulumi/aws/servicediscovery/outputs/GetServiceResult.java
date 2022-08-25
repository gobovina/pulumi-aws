// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicediscovery.outputs;

import com.pulumi.aws.servicediscovery.outputs.GetServiceDnsConfig;
import com.pulumi.aws.servicediscovery.outputs.GetServiceHealthCheckConfig;
import com.pulumi.aws.servicediscovery.outputs.GetServiceHealthCheckCustomConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceResult {
    /**
     * @return The ARN of the service.
     * 
     */
    private String arn;
    /**
     * @return The description of the service.
     * 
     */
    private String description;
    /**
     * @return A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
     * 
     */
    private List<GetServiceDnsConfig> dnsConfigs;
    /**
     * @return A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
     * 
     */
    private List<GetServiceHealthCheckConfig> healthCheckConfigs;
    /**
     * @return A complex type that contains settings for ECS managed health checks.
     * 
     */
    private List<GetServiceHealthCheckCustomConfig> healthCheckCustomConfigs;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    /**
     * @return The ID of the namespace to use for DNS configuration.
     * 
     */
    private String namespaceId;
    /**
     * @return A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    private @Nullable Map<String,String> tags;
    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    private Map<String,String> tagsAll;

    private GetServiceResult() {}
    /**
     * @return The ARN of the service.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The description of the service.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
     * 
     */
    public List<GetServiceDnsConfig> dnsConfigs() {
        return this.dnsConfigs;
    }
    /**
     * @return A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
     * 
     */
    public List<GetServiceHealthCheckConfig> healthCheckConfigs() {
        return this.healthCheckConfigs;
    }
    /**
     * @return A complex type that contains settings for ECS managed health checks.
     * 
     */
    public List<GetServiceHealthCheckCustomConfig> healthCheckCustomConfigs() {
        return this.healthCheckCustomConfigs;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the namespace to use for DNS configuration.
     * 
     */
    public String namespaceId() {
        return this.namespaceId;
    }
    /**
     * @return A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Map<String,String> tagsAll() {
        return this.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String description;
        private List<GetServiceDnsConfig> dnsConfigs;
        private List<GetServiceHealthCheckConfig> healthCheckConfigs;
        private List<GetServiceHealthCheckCustomConfig> healthCheckCustomConfigs;
        private String id;
        private String name;
        private String namespaceId;
        private @Nullable Map<String,String> tags;
        private Map<String,String> tagsAll;
        public Builder() {}
        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.dnsConfigs = defaults.dnsConfigs;
    	      this.healthCheckConfigs = defaults.healthCheckConfigs;
    	      this.healthCheckCustomConfigs = defaults.healthCheckCustomConfigs;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.namespaceId = defaults.namespaceId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder dnsConfigs(List<GetServiceDnsConfig> dnsConfigs) {
            this.dnsConfigs = Objects.requireNonNull(dnsConfigs);
            return this;
        }
        public Builder dnsConfigs(GetServiceDnsConfig... dnsConfigs) {
            return dnsConfigs(List.of(dnsConfigs));
        }
        @CustomType.Setter
        public Builder healthCheckConfigs(List<GetServiceHealthCheckConfig> healthCheckConfigs) {
            this.healthCheckConfigs = Objects.requireNonNull(healthCheckConfigs);
            return this;
        }
        public Builder healthCheckConfigs(GetServiceHealthCheckConfig... healthCheckConfigs) {
            return healthCheckConfigs(List.of(healthCheckConfigs));
        }
        @CustomType.Setter
        public Builder healthCheckCustomConfigs(List<GetServiceHealthCheckCustomConfig> healthCheckCustomConfigs) {
            this.healthCheckCustomConfigs = Objects.requireNonNull(healthCheckCustomConfigs);
            return this;
        }
        public Builder healthCheckCustomConfigs(GetServiceHealthCheckCustomConfig... healthCheckCustomConfigs) {
            return healthCheckCustomConfigs(List.of(healthCheckCustomConfigs));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = Objects.requireNonNull(namespaceId);
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder tagsAll(Map<String,String> tagsAll) {
            this.tagsAll = Objects.requireNonNull(tagsAll);
            return this;
        }
        public GetServiceResult build() {
            final var o = new GetServiceResult();
            o.arn = arn;
            o.description = description;
            o.dnsConfigs = dnsConfigs;
            o.healthCheckConfigs = healthCheckConfigs;
            o.healthCheckCustomConfigs = healthCheckCustomConfigs;
            o.id = id;
            o.name = name;
            o.namespaceId = namespaceId;
            o.tags = tags;
            o.tagsAll = tagsAll;
            return o;
        }
    }
}
