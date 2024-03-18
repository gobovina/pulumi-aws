// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticache.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServerlessCacheCacheUsageLimitsDataStorage {
    /**
     * @return The upper limit for data storage the cache is set to use. Must be between 1 and 5,000.
     * 
     */
    private Integer maximum;
    /**
     * @return The unit that the storage is measured in, in GB.
     * 
     */
    private String unit;

    private ServerlessCacheCacheUsageLimitsDataStorage() {}
    /**
     * @return The upper limit for data storage the cache is set to use. Must be between 1 and 5,000.
     * 
     */
    public Integer maximum() {
        return this.maximum;
    }
    /**
     * @return The unit that the storage is measured in, in GB.
     * 
     */
    public String unit() {
        return this.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerlessCacheCacheUsageLimitsDataStorage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maximum;
        private String unit;
        public Builder() {}
        public Builder(ServerlessCacheCacheUsageLimitsDataStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximum = defaults.maximum;
    	      this.unit = defaults.unit;
        }

        @CustomType.Setter
        public Builder maximum(Integer maximum) {
            if (maximum == null) {
              throw new MissingRequiredPropertyException("ServerlessCacheCacheUsageLimitsDataStorage", "maximum");
            }
            this.maximum = maximum;
            return this;
        }
        @CustomType.Setter
        public Builder unit(String unit) {
            if (unit == null) {
              throw new MissingRequiredPropertyException("ServerlessCacheCacheUsageLimitsDataStorage", "unit");
            }
            this.unit = unit;
            return this;
        }
        public ServerlessCacheCacheUsageLimitsDataStorage build() {
            final var _resultValue = new ServerlessCacheCacheUsageLimitsDataStorage();
            _resultValue.maximum = maximum;
            _resultValue.unit = unit;
            return _resultValue;
        }
    }
}
