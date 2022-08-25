// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketLifecycleConfigurationRuleExpiration {
    /**
     * @return Date the object is to be deleted. Should be in `YYYY-MM-DD` date format, e.g., `2020-09-30`.
     * 
     */
    private @Nullable String date;
    /**
     * @return Number of days before the object is to be deleted.
     * 
     */
    private @Nullable Integer days;
    /**
     * @return Enable to remove a delete marker with no noncurrent versions. Cannot be specified with `date` or `days`.
     * 
     */
    private @Nullable Boolean expiredObjectDeleteMarker;

    private BucketLifecycleConfigurationRuleExpiration() {}
    /**
     * @return Date the object is to be deleted. Should be in `YYYY-MM-DD` date format, e.g., `2020-09-30`.
     * 
     */
    public Optional<String> date() {
        return Optional.ofNullable(this.date);
    }
    /**
     * @return Number of days before the object is to be deleted.
     * 
     */
    public Optional<Integer> days() {
        return Optional.ofNullable(this.days);
    }
    /**
     * @return Enable to remove a delete marker with no noncurrent versions. Cannot be specified with `date` or `days`.
     * 
     */
    public Optional<Boolean> expiredObjectDeleteMarker() {
        return Optional.ofNullable(this.expiredObjectDeleteMarker);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleConfigurationRuleExpiration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String date;
        private @Nullable Integer days;
        private @Nullable Boolean expiredObjectDeleteMarker;
        public Builder() {}
        public Builder(BucketLifecycleConfigurationRuleExpiration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.date = defaults.date;
    	      this.days = defaults.days;
    	      this.expiredObjectDeleteMarker = defaults.expiredObjectDeleteMarker;
        }

        @CustomType.Setter
        public Builder date(@Nullable String date) {
            this.date = date;
            return this;
        }
        @CustomType.Setter
        public Builder days(@Nullable Integer days) {
            this.days = days;
            return this;
        }
        @CustomType.Setter
        public Builder expiredObjectDeleteMarker(@Nullable Boolean expiredObjectDeleteMarker) {
            this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
            return this;
        }
        public BucketLifecycleConfigurationRuleExpiration build() {
            final var o = new BucketLifecycleConfigurationRuleExpiration();
            o.date = date;
            o.days = days;
            o.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
            return o;
        }
    }
}
