// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SigningJobSignedObjectS3Args extends com.pulumi.resources.ResourceArgs {

    public static final SigningJobSignedObjectS3Args Empty = new SigningJobSignedObjectS3Args();

    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * Key name of the object that contains your unsigned code.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Key name of the object that contains your unsigned code.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    private SigningJobSignedObjectS3Args() {}

    private SigningJobSignedObjectS3Args(SigningJobSignedObjectS3Args $) {
        this.bucket = $.bucket;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SigningJobSignedObjectS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SigningJobSignedObjectS3Args $;

        public Builder() {
            $ = new SigningJobSignedObjectS3Args();
        }

        public Builder(SigningJobSignedObjectS3Args defaults) {
            $ = new SigningJobSignedObjectS3Args(Objects.requireNonNull(defaults));
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param key Key name of the object that contains your unsigned code.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key name of the object that contains your unsigned code.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public SigningJobSignedObjectS3Args build() {
            return $;
        }
    }

}
