// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MLTransformInputRecordTable {
    /**
     * @return A unique identifier for the AWS Glue Data Catalog.
     * 
     */
    private @Nullable String catalogId;
    /**
     * @return The name of the connection to the AWS Glue Data Catalog.
     * 
     */
    private @Nullable String connectionName;
    /**
     * @return A database name in the AWS Glue Data Catalog.
     * 
     */
    private String databaseName;
    /**
     * @return A table name in the AWS Glue Data Catalog.
     * 
     */
    private String tableName;

    private MLTransformInputRecordTable() {}
    /**
     * @return A unique identifier for the AWS Glue Data Catalog.
     * 
     */
    public Optional<String> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }
    /**
     * @return The name of the connection to the AWS Glue Data Catalog.
     * 
     */
    public Optional<String> connectionName() {
        return Optional.ofNullable(this.connectionName);
    }
    /**
     * @return A database name in the AWS Glue Data Catalog.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * @return A table name in the AWS Glue Data Catalog.
     * 
     */
    public String tableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MLTransformInputRecordTable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String catalogId;
        private @Nullable String connectionName;
        private String databaseName;
        private String tableName;
        public Builder() {}
        public Builder(MLTransformInputRecordTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.connectionName = defaults.connectionName;
    	      this.databaseName = defaults.databaseName;
    	      this.tableName = defaults.tableName;
        }

        @CustomType.Setter
        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        @CustomType.Setter
        public Builder connectionName(@Nullable String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        @CustomType.Setter
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public MLTransformInputRecordTable build() {
            final var o = new MLTransformInputRecordTable();
            o.catalogId = catalogId;
            o.connectionName = connectionName;
            o.databaseName = databaseName;
            o.tableName = tableName;
            return o;
        }
    }
}
