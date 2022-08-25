// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReceiptRuleS3Action {
    /**
     * @return The name of the S3 bucket
     * 
     */
    private String bucketName;
    /**
     * @return The ARN of the KMS key
     * 
     */
    private @Nullable String kmsKeyArn;
    /**
     * @return The key prefix of the S3 bucket
     * 
     */
    private @Nullable String objectKeyPrefix;
    /**
     * @return The position of the action in the receipt rule
     * 
     */
    private Integer position;
    /**
     * @return The ARN of an SNS topic to notify
     * 
     */
    private @Nullable String topicArn;

    private ReceiptRuleS3Action() {}
    /**
     * @return The name of the S3 bucket
     * 
     */
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * @return The ARN of the KMS key
     * 
     */
    public Optional<String> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    /**
     * @return The key prefix of the S3 bucket
     * 
     */
    public Optional<String> objectKeyPrefix() {
        return Optional.ofNullable(this.objectKeyPrefix);
    }
    /**
     * @return The position of the action in the receipt rule
     * 
     */
    public Integer position() {
        return this.position;
    }
    /**
     * @return The ARN of an SNS topic to notify
     * 
     */
    public Optional<String> topicArn() {
        return Optional.ofNullable(this.topicArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleS3Action defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucketName;
        private @Nullable String kmsKeyArn;
        private @Nullable String objectKeyPrefix;
        private Integer position;
        private @Nullable String topicArn;
        public Builder() {}
        public Builder(ReceiptRuleS3Action defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.objectKeyPrefix = defaults.objectKeyPrefix;
    	      this.position = defaults.position;
    	      this.topicArn = defaults.topicArn;
        }

        @CustomType.Setter
        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        @CustomType.Setter
        public Builder objectKeyPrefix(@Nullable String objectKeyPrefix) {
            this.objectKeyPrefix = objectKeyPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder position(Integer position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }
        @CustomType.Setter
        public Builder topicArn(@Nullable String topicArn) {
            this.topicArn = topicArn;
            return this;
        }
        public ReceiptRuleS3Action build() {
            final var o = new ReceiptRuleS3Action();
            o.bucketName = bucketName;
            o.kmsKeyArn = kmsKeyArn;
            o.objectKeyPrefix = objectKeyPrefix;
            o.position = position;
            o.topicArn = topicArn;
            return o;
        }
    }
}
