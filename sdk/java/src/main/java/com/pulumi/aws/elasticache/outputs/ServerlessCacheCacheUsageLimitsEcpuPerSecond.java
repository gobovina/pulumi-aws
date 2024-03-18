// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticache.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ServerlessCacheCacheUsageLimitsEcpuPerSecond {
    /**
     * @return The upper limit for data storage the cache is set to use. Must be between 1 and 5,000.
     * 
     */
    private Integer maximum;

    private ServerlessCacheCacheUsageLimitsEcpuPerSecond() {}
    /**
     * @return The upper limit for data storage the cache is set to use. Must be between 1 and 5,000.
     * 
     */
    public Integer maximum() {
        return this.maximum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerlessCacheCacheUsageLimitsEcpuPerSecond defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maximum;
        public Builder() {}
        public Builder(ServerlessCacheCacheUsageLimitsEcpuPerSecond defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximum = defaults.maximum;
        }

        @CustomType.Setter
        public Builder maximum(Integer maximum) {
            if (maximum == null) {
              throw new MissingRequiredPropertyException("ServerlessCacheCacheUsageLimitsEcpuPerSecond", "maximum");
            }
            this.maximum = maximum;
            return this;
        }
        public ServerlessCacheCacheUsageLimitsEcpuPerSecond build() {
            final var _resultValue = new ServerlessCacheCacheUsageLimitsEcpuPerSecond();
            _resultValue.maximum = maximum;
            return _resultValue;
        }
    }
}
