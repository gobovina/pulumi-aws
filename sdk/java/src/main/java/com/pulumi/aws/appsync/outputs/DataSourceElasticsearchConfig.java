// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceElasticsearchConfig {
    /**
     * @return HTTP URL.
     * 
     */
    private String endpoint;
    /**
     * @return AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
     */
    private @Nullable String region;

    private DataSourceElasticsearchConfig() {}
    /**
     * @return HTTP URL.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceElasticsearchConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpoint;
        private @Nullable String region;
        public Builder() {}
        public Builder(DataSourceElasticsearchConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public DataSourceElasticsearchConfig build() {
            final var o = new DataSourceElasticsearchConfig();
            o.endpoint = endpoint;
            o.region = region;
            return o;
        }
    }
}
