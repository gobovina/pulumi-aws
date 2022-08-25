// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.aws.connect.outputs.InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceStorageConfigStorageConfigKinesisVideoStreamConfig {
    /**
     * @return The encryption configuration. Documented below.
     * 
     */
    private InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig encryptionConfig;
    /**
     * @return The prefix of the video stream. Minimum length of `1`. Maximum length of `128`. When read from the state, the value returned is `&lt;prefix&gt;-connect-&lt;connect_instance_alias&gt;-contact-` since the API appends additional details to the `prefix`.
     * 
     */
    private String prefix;
    /**
     * @return The number of hours data is retained in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. Minimum value of `0`. Maximum value of `87600`. A value of `0`, indicates that the stream does not persist data.
     * 
     */
    private Integer retentionPeriodHours;

    private InstanceStorageConfigStorageConfigKinesisVideoStreamConfig() {}
    /**
     * @return The encryption configuration. Documented below.
     * 
     */
    public InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig encryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * @return The prefix of the video stream. Minimum length of `1`. Maximum length of `128`. When read from the state, the value returned is `&lt;prefix&gt;-connect-&lt;connect_instance_alias&gt;-contact-` since the API appends additional details to the `prefix`.
     * 
     */
    public String prefix() {
        return this.prefix;
    }
    /**
     * @return The number of hours data is retained in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. Minimum value of `0`. Maximum value of `87600`. A value of `0`, indicates that the stream does not persist data.
     * 
     */
    public Integer retentionPeriodHours() {
        return this.retentionPeriodHours;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceStorageConfigStorageConfigKinesisVideoStreamConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig encryptionConfig;
        private String prefix;
        private Integer retentionPeriodHours;
        public Builder() {}
        public Builder(InstanceStorageConfigStorageConfigKinesisVideoStreamConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.prefix = defaults.prefix;
    	      this.retentionPeriodHours = defaults.retentionPeriodHours;
        }

        @CustomType.Setter
        public Builder encryptionConfig(InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig encryptionConfig) {
            this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
            return this;
        }
        @CustomType.Setter
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        @CustomType.Setter
        public Builder retentionPeriodHours(Integer retentionPeriodHours) {
            this.retentionPeriodHours = Objects.requireNonNull(retentionPeriodHours);
            return this;
        }
        public InstanceStorageConfigStorageConfigKinesisVideoStreamConfig build() {
            final var o = new InstanceStorageConfigStorageConfigKinesisVideoStreamConfig();
            o.encryptionConfig = encryptionConfig;
            o.prefix = prefix;
            o.retentionPeriodHours = retentionPeriodHours;
            return o;
        }
    }
}
