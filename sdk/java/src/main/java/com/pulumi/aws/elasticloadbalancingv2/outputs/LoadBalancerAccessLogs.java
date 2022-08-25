// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancingv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerAccessLogs {
    /**
     * @return The S3 bucket name to store the logs in.
     * 
     */
    private String bucket;
    /**
     * @return Boolean to enable / disable `access_logs`. Defaults to `false`, even when `bucket` is specified.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The S3 bucket prefix. Logs are stored in the root if not configured.
     * 
     */
    private @Nullable String prefix;

    private LoadBalancerAccessLogs() {}
    /**
     * @return The S3 bucket name to store the logs in.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return Boolean to enable / disable `access_logs`. Defaults to `false`, even when `bucket` is specified.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The S3 bucket prefix. Logs are stored in the root if not configured.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerAccessLogs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucket;
        private @Nullable Boolean enabled;
        private @Nullable String prefix;
        public Builder() {}
        public Builder(LoadBalancerAccessLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.enabled = defaults.enabled;
    	      this.prefix = defaults.prefix;
        }

        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public LoadBalancerAccessLogs build() {
            final var o = new LoadBalancerAccessLogs();
            o.bucket = bucket;
            o.enabled = enabled;
            o.prefix = prefix;
            return o;
        }
    }
}
