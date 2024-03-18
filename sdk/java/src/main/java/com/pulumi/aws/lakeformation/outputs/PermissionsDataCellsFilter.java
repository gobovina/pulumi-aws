// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PermissionsDataCellsFilter {
    /**
     * @return The name of the database.
     * 
     */
    private String databaseName;
    /**
     * @return The name of the data cells filter.
     * 
     */
    private String name;
    /**
     * @return The ID of the Data Catalog.
     * 
     */
    private String tableCatalogId;
    /**
     * @return The name of the table.
     * 
     */
    private String tableName;

    private PermissionsDataCellsFilter() {}
    /**
     * @return The name of the database.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * @return The name of the data cells filter.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the Data Catalog.
     * 
     */
    public String tableCatalogId() {
        return this.tableCatalogId;
    }
    /**
     * @return The name of the table.
     * 
     */
    public String tableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionsDataCellsFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String databaseName;
        private String name;
        private String tableCatalogId;
        private String tableName;
        public Builder() {}
        public Builder(PermissionsDataCellsFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.name = defaults.name;
    	      this.tableCatalogId = defaults.tableCatalogId;
    	      this.tableName = defaults.tableName;
        }

        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            if (databaseName == null) {
              throw new MissingRequiredPropertyException("PermissionsDataCellsFilter", "databaseName");
            }
            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("PermissionsDataCellsFilter", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tableCatalogId(String tableCatalogId) {
            if (tableCatalogId == null) {
              throw new MissingRequiredPropertyException("PermissionsDataCellsFilter", "tableCatalogId");
            }
            this.tableCatalogId = tableCatalogId;
            return this;
        }
        @CustomType.Setter
        public Builder tableName(String tableName) {
            if (tableName == null) {
              throw new MissingRequiredPropertyException("PermissionsDataCellsFilter", "tableName");
            }
            this.tableName = tableName;
            return this;
        }
        public PermissionsDataCellsFilter build() {
            final var _resultValue = new PermissionsDataCellsFilter();
            _resultValue.databaseName = databaseName;
            _resultValue.name = name;
            _resultValue.tableCatalogId = tableCatalogId;
            _resultValue.tableName = tableName;
            return _resultValue;
        }
    }
}
