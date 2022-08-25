// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.BucketLifecycleRuleExpiration;
import com.pulumi.aws.s3.outputs.BucketLifecycleRuleNoncurrentVersionExpiration;
import com.pulumi.aws.s3.outputs.BucketLifecycleRuleNoncurrentVersionTransition;
import com.pulumi.aws.s3.outputs.BucketLifecycleRuleTransition;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketLifecycleRule {
    /**
     * @return Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
     * 
     */
    private @Nullable Integer abortIncompleteMultipartUploadDays;
    /**
     * @return Specifies lifecycle rule status.
     * 
     */
    private Boolean enabled;
    /**
     * @return Specifies a period in the object&#39;s expire (documented below).
     * 
     */
    private @Nullable BucketLifecycleRuleExpiration expiration;
    /**
     * @return Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
     */
    private @Nullable String id;
    /**
     * @return Specifies when noncurrent object versions expire (documented below).
     * 
     */
    private @Nullable BucketLifecycleRuleNoncurrentVersionExpiration noncurrentVersionExpiration;
    /**
     * @return Specifies when noncurrent object versions transitions (documented below).
     * 
     */
    private @Nullable List<BucketLifecycleRuleNoncurrentVersionTransition> noncurrentVersionTransitions;
    /**
     * @return Object key prefix identifying one or more objects to which the rule applies.
     * 
     */
    private @Nullable String prefix;
    /**
     * @return Specifies object tags key and value.
     * 
     */
    private @Nullable Map<String,String> tags;
    /**
     * @return Specifies a period in the object&#39;s transitions (documented below).
     * 
     */
    private @Nullable List<BucketLifecycleRuleTransition> transitions;

    private BucketLifecycleRule() {}
    /**
     * @return Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
     * 
     */
    public Optional<Integer> abortIncompleteMultipartUploadDays() {
        return Optional.ofNullable(this.abortIncompleteMultipartUploadDays);
    }
    /**
     * @return Specifies lifecycle rule status.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Specifies a period in the object&#39;s expire (documented below).
     * 
     */
    public Optional<BucketLifecycleRuleExpiration> expiration() {
        return Optional.ofNullable(this.expiration);
    }
    /**
     * @return Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Specifies when noncurrent object versions expire (documented below).
     * 
     */
    public Optional<BucketLifecycleRuleNoncurrentVersionExpiration> noncurrentVersionExpiration() {
        return Optional.ofNullable(this.noncurrentVersionExpiration);
    }
    /**
     * @return Specifies when noncurrent object versions transitions (documented below).
     * 
     */
    public List<BucketLifecycleRuleNoncurrentVersionTransition> noncurrentVersionTransitions() {
        return this.noncurrentVersionTransitions == null ? List.of() : this.noncurrentVersionTransitions;
    }
    /**
     * @return Object key prefix identifying one or more objects to which the rule applies.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return Specifies object tags key and value.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Specifies a period in the object&#39;s transitions (documented below).
     * 
     */
    public List<BucketLifecycleRuleTransition> transitions() {
        return this.transitions == null ? List.of() : this.transitions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer abortIncompleteMultipartUploadDays;
        private Boolean enabled;
        private @Nullable BucketLifecycleRuleExpiration expiration;
        private @Nullable String id;
        private @Nullable BucketLifecycleRuleNoncurrentVersionExpiration noncurrentVersionExpiration;
        private @Nullable List<BucketLifecycleRuleNoncurrentVersionTransition> noncurrentVersionTransitions;
        private @Nullable String prefix;
        private @Nullable Map<String,String> tags;
        private @Nullable List<BucketLifecycleRuleTransition> transitions;
        public Builder() {}
        public Builder(BucketLifecycleRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortIncompleteMultipartUploadDays = defaults.abortIncompleteMultipartUploadDays;
    	      this.enabled = defaults.enabled;
    	      this.expiration = defaults.expiration;
    	      this.id = defaults.id;
    	      this.noncurrentVersionExpiration = defaults.noncurrentVersionExpiration;
    	      this.noncurrentVersionTransitions = defaults.noncurrentVersionTransitions;
    	      this.prefix = defaults.prefix;
    	      this.tags = defaults.tags;
    	      this.transitions = defaults.transitions;
        }

        @CustomType.Setter
        public Builder abortIncompleteMultipartUploadDays(@Nullable Integer abortIncompleteMultipartUploadDays) {
            this.abortIncompleteMultipartUploadDays = abortIncompleteMultipartUploadDays;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder expiration(@Nullable BucketLifecycleRuleExpiration expiration) {
            this.expiration = expiration;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder noncurrentVersionExpiration(@Nullable BucketLifecycleRuleNoncurrentVersionExpiration noncurrentVersionExpiration) {
            this.noncurrentVersionExpiration = noncurrentVersionExpiration;
            return this;
        }
        @CustomType.Setter
        public Builder noncurrentVersionTransitions(@Nullable List<BucketLifecycleRuleNoncurrentVersionTransition> noncurrentVersionTransitions) {
            this.noncurrentVersionTransitions = noncurrentVersionTransitions;
            return this;
        }
        public Builder noncurrentVersionTransitions(BucketLifecycleRuleNoncurrentVersionTransition... noncurrentVersionTransitions) {
            return noncurrentVersionTransitions(List.of(noncurrentVersionTransitions));
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder transitions(@Nullable List<BucketLifecycleRuleTransition> transitions) {
            this.transitions = transitions;
            return this;
        }
        public Builder transitions(BucketLifecycleRuleTransition... transitions) {
            return transitions(List.of(transitions));
        }
        public BucketLifecycleRule build() {
            final var o = new BucketLifecycleRule();
            o.abortIncompleteMultipartUploadDays = abortIncompleteMultipartUploadDays;
            o.enabled = enabled;
            o.expiration = expiration;
            o.id = id;
            o.noncurrentVersionExpiration = noncurrentVersionExpiration;
            o.noncurrentVersionTransitions = noncurrentVersionTransitions;
            o.prefix = prefix;
            o.tags = tags;
            o.transitions = transitions;
            return o;
        }
    }
}
