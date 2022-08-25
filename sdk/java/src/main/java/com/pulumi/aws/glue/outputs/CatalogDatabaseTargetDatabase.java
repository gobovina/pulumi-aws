// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CatalogDatabaseTargetDatabase {
    /**
     * @return ID of the Data Catalog in which the database resides.
     * 
     */
    private String catalogId;
    /**
     * @return Name of the catalog database.
     * 
     */
    private String databaseName;

    private CatalogDatabaseTargetDatabase() {}
    /**
     * @return ID of the Data Catalog in which the database resides.
     * 
     */
    public String catalogId() {
        return this.catalogId;
    }
    /**
     * @return Name of the catalog database.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogDatabaseTargetDatabase defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String catalogId;
        private String databaseName;
        public Builder() {}
        public Builder(CatalogDatabaseTargetDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
        }

        @CustomType.Setter
        public Builder catalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public CatalogDatabaseTargetDatabase build() {
            final var o = new CatalogDatabaseTargetDatabase();
            o.catalogId = catalogId;
            o.databaseName = databaseName;
            return o;
        }
    }
}
