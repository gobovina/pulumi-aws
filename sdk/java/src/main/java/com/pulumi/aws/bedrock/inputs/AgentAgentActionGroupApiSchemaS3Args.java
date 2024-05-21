// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bedrock.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AgentAgentActionGroupApiSchemaS3Args extends com.pulumi.resources.ResourceArgs {

    public static final AgentAgentActionGroupApiSchemaS3Args Empty = new AgentAgentActionGroupApiSchemaS3Args();

    /**
     * Name of the S3 bucket.
     * 
     */
    @Import(name="s3BucketName")
    private @Nullable Output<String> s3BucketName;

    /**
     * @return Name of the S3 bucket.
     * 
     */
    public Optional<Output<String>> s3BucketName() {
        return Optional.ofNullable(this.s3BucketName);
    }

    /**
     * S3 object key containing the resource.
     * 
     */
    @Import(name="s3ObjectKey")
    private @Nullable Output<String> s3ObjectKey;

    /**
     * @return S3 object key containing the resource.
     * 
     */
    public Optional<Output<String>> s3ObjectKey() {
        return Optional.ofNullable(this.s3ObjectKey);
    }

    private AgentAgentActionGroupApiSchemaS3Args() {}

    private AgentAgentActionGroupApiSchemaS3Args(AgentAgentActionGroupApiSchemaS3Args $) {
        this.s3BucketName = $.s3BucketName;
        this.s3ObjectKey = $.s3ObjectKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AgentAgentActionGroupApiSchemaS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AgentAgentActionGroupApiSchemaS3Args $;

        public Builder() {
            $ = new AgentAgentActionGroupApiSchemaS3Args();
        }

        public Builder(AgentAgentActionGroupApiSchemaS3Args defaults) {
            $ = new AgentAgentActionGroupApiSchemaS3Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param s3BucketName Name of the S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketName(@Nullable Output<String> s3BucketName) {
            $.s3BucketName = s3BucketName;
            return this;
        }

        /**
         * @param s3BucketName Name of the S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketName(String s3BucketName) {
            return s3BucketName(Output.of(s3BucketName));
        }

        /**
         * @param s3ObjectKey S3 object key containing the resource.
         * 
         * @return builder
         * 
         */
        public Builder s3ObjectKey(@Nullable Output<String> s3ObjectKey) {
            $.s3ObjectKey = s3ObjectKey;
            return this;
        }

        /**
         * @param s3ObjectKey S3 object key containing the resource.
         * 
         * @return builder
         * 
         */
        public Builder s3ObjectKey(String s3ObjectKey) {
            return s3ObjectKey(Output.of(s3ObjectKey));
        }

        public AgentAgentActionGroupApiSchemaS3Args build() {
            return $;
        }
    }

}
