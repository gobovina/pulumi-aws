// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bcmdata.outputs;

import com.pulumi.aws.bcmdata.outputs.ExportExportDestinationConfigurationS3DestinationS3OutputConfiguration;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ExportExportDestinationConfigurationS3Destination {
    /**
     * @return Name of the Amazon S3 bucket used as the destination of a data export file.
     * 
     */
    private String s3Bucket;
    /**
     * @return Output configuration for the data export. See the `s3_output_configurations` argument reference below.
     * 
     */
    private @Nullable List<ExportExportDestinationConfigurationS3DestinationS3OutputConfiguration> s3OutputConfigurations;
    /**
     * @return S3 path prefix you want prepended to the name of your data export.
     * 
     */
    private String s3Prefix;
    /**
     * @return S3 bucket region.
     * 
     */
    private String s3Region;

    private ExportExportDestinationConfigurationS3Destination() {}
    /**
     * @return Name of the Amazon S3 bucket used as the destination of a data export file.
     * 
     */
    public String s3Bucket() {
        return this.s3Bucket;
    }
    /**
     * @return Output configuration for the data export. See the `s3_output_configurations` argument reference below.
     * 
     */
    public List<ExportExportDestinationConfigurationS3DestinationS3OutputConfiguration> s3OutputConfigurations() {
        return this.s3OutputConfigurations == null ? List.of() : this.s3OutputConfigurations;
    }
    /**
     * @return S3 path prefix you want prepended to the name of your data export.
     * 
     */
    public String s3Prefix() {
        return this.s3Prefix;
    }
    /**
     * @return S3 bucket region.
     * 
     */
    public String s3Region() {
        return this.s3Region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportExportDestinationConfigurationS3Destination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String s3Bucket;
        private @Nullable List<ExportExportDestinationConfigurationS3DestinationS3OutputConfiguration> s3OutputConfigurations;
        private String s3Prefix;
        private String s3Region;
        public Builder() {}
        public Builder(ExportExportDestinationConfigurationS3Destination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3OutputConfigurations = defaults.s3OutputConfigurations;
    	      this.s3Prefix = defaults.s3Prefix;
    	      this.s3Region = defaults.s3Region;
        }

        @CustomType.Setter
        public Builder s3Bucket(String s3Bucket) {
            if (s3Bucket == null) {
              throw new MissingRequiredPropertyException("ExportExportDestinationConfigurationS3Destination", "s3Bucket");
            }
            this.s3Bucket = s3Bucket;
            return this;
        }
        @CustomType.Setter
        public Builder s3OutputConfigurations(@Nullable List<ExportExportDestinationConfigurationS3DestinationS3OutputConfiguration> s3OutputConfigurations) {

            this.s3OutputConfigurations = s3OutputConfigurations;
            return this;
        }
        public Builder s3OutputConfigurations(ExportExportDestinationConfigurationS3DestinationS3OutputConfiguration... s3OutputConfigurations) {
            return s3OutputConfigurations(List.of(s3OutputConfigurations));
        }
        @CustomType.Setter
        public Builder s3Prefix(String s3Prefix) {
            if (s3Prefix == null) {
              throw new MissingRequiredPropertyException("ExportExportDestinationConfigurationS3Destination", "s3Prefix");
            }
            this.s3Prefix = s3Prefix;
            return this;
        }
        @CustomType.Setter
        public Builder s3Region(String s3Region) {
            if (s3Region == null) {
              throw new MissingRequiredPropertyException("ExportExportDestinationConfigurationS3Destination", "s3Region");
            }
            this.s3Region = s3Region;
            return this;
        }
        public ExportExportDestinationConfigurationS3Destination build() {
            final var _resultValue = new ExportExportDestinationConfigurationS3Destination();
            _resultValue.s3Bucket = s3Bucket;
            _resultValue.s3OutputConfigurations = s3OutputConfigurations;
            _resultValue.s3Prefix = s3Prefix;
            _resultValue.s3Region = s3Region;
            return _resultValue;
        }
    }
}
