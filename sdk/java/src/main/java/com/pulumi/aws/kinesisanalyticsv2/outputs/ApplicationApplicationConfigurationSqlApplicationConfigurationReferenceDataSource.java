// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema;
import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource {
    private @Nullable String referenceId;
    /**
     * @return Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
     * 
     */
    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema referenceSchema;
    /**
     * @return Identifies the S3 bucket and object that contains the reference data.
     * 
     */
    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource s3ReferenceDataSource;
    /**
     * @return The name of the in-application table to create.
     * 
     */
    private String tableName;

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource() {}
    public Optional<String> referenceId() {
        return Optional.ofNullable(this.referenceId);
    }
    /**
     * @return Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
     * 
     */
    public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema referenceSchema() {
        return this.referenceSchema;
    }
    /**
     * @return Identifies the S3 bucket and object that contains the reference data.
     * 
     */
    public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource s3ReferenceDataSource() {
        return this.s3ReferenceDataSource;
    }
    /**
     * @return The name of the in-application table to create.
     * 
     */
    public String tableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String referenceId;
        private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema referenceSchema;
        private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource s3ReferenceDataSource;
        private String tableName;
        public Builder() {}
        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.referenceId = defaults.referenceId;
    	      this.referenceSchema = defaults.referenceSchema;
    	      this.s3ReferenceDataSource = defaults.s3ReferenceDataSource;
    	      this.tableName = defaults.tableName;
        }

        @CustomType.Setter
        public Builder referenceId(@Nullable String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        @CustomType.Setter
        public Builder referenceSchema(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema referenceSchema) {
            this.referenceSchema = Objects.requireNonNull(referenceSchema);
            return this;
        }
        @CustomType.Setter
        public Builder s3ReferenceDataSource(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource s3ReferenceDataSource) {
            this.s3ReferenceDataSource = Objects.requireNonNull(s3ReferenceDataSource);
            return this;
        }
        @CustomType.Setter
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource build() {
            final var o = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSource();
            o.referenceId = referenceId;
            o.referenceSchema = referenceSchema;
            o.s3ReferenceDataSource = s3ReferenceDataSource;
            o.tableName = tableName;
            return o;
        }
    }
}
