// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig {
    /**
     * @return The type of encryption. Valid Values: `KMS`.
     * 
     */
    private String encryptionType;
    /**
     * @return The full ARN of the encryption key. Be sure to provide the full ARN of the encryption key, not just the ID.
     * 
     */
    private String keyId;

    private InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig() {}
    /**
     * @return The type of encryption. Valid Values: `KMS`.
     * 
     */
    public String encryptionType() {
        return this.encryptionType;
    }
    /**
     * @return The full ARN of the encryption key. Be sure to provide the full ARN of the encryption key, not just the ID.
     * 
     */
    public String keyId() {
        return this.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String encryptionType;
        private String keyId;
        public Builder() {}
        public Builder(InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionType = defaults.encryptionType;
    	      this.keyId = defaults.keyId;
        }

        @CustomType.Setter
        public Builder encryptionType(String encryptionType) {
            this.encryptionType = Objects.requireNonNull(encryptionType);
            return this;
        }
        @CustomType.Setter
        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig build() {
            final var o = new InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig();
            o.encryptionType = encryptionType;
            o.keyId = keyId;
            return o;
        }
    }
}
