// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClassificationJobUserPausedDetail {
    private @Nullable String jobExpiresAt;
    private @Nullable String jobImminentExpirationHealthEventArn;
    private @Nullable String jobPausedAt;

    private ClassificationJobUserPausedDetail() {}
    public Optional<String> jobExpiresAt() {
        return Optional.ofNullable(this.jobExpiresAt);
    }
    public Optional<String> jobImminentExpirationHealthEventArn() {
        return Optional.ofNullable(this.jobImminentExpirationHealthEventArn);
    }
    public Optional<String> jobPausedAt() {
        return Optional.ofNullable(this.jobPausedAt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobUserPausedDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String jobExpiresAt;
        private @Nullable String jobImminentExpirationHealthEventArn;
        private @Nullable String jobPausedAt;
        public Builder() {}
        public Builder(ClassificationJobUserPausedDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobExpiresAt = defaults.jobExpiresAt;
    	      this.jobImminentExpirationHealthEventArn = defaults.jobImminentExpirationHealthEventArn;
    	      this.jobPausedAt = defaults.jobPausedAt;
        }

        @CustomType.Setter
        public Builder jobExpiresAt(@Nullable String jobExpiresAt) {
            this.jobExpiresAt = jobExpiresAt;
            return this;
        }
        @CustomType.Setter
        public Builder jobImminentExpirationHealthEventArn(@Nullable String jobImminentExpirationHealthEventArn) {
            this.jobImminentExpirationHealthEventArn = jobImminentExpirationHealthEventArn;
            return this;
        }
        @CustomType.Setter
        public Builder jobPausedAt(@Nullable String jobPausedAt) {
            this.jobPausedAt = jobPausedAt;
            return this;
        }
        public ClassificationJobUserPausedDetail build() {
            final var o = new ClassificationJobUserPausedDetail();
            o.jobExpiresAt = jobExpiresAt;
            o.jobImminentExpirationHealthEventArn = jobImminentExpirationHealthEventArn;
            o.jobPausedAt = jobPausedAt;
            return o;
        }
    }
}
