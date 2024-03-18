// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetPermissionsDataCellsFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetPermissionsDataCellsFilter Empty = new GetPermissionsDataCellsFilter();

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    /**
     * @return The name of the database.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * The name of the data cells filter.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the data cells filter.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The ID of the Data Catalog.
     * 
     */
    @Import(name="tableCatalogId", required=true)
    private String tableCatalogId;

    /**
     * @return The ID of the Data Catalog.
     * 
     */
    public String tableCatalogId() {
        return this.tableCatalogId;
    }

    /**
     * The name of the table.
     * 
     */
    @Import(name="tableName", required=true)
    private String tableName;

    /**
     * @return The name of the table.
     * 
     */
    public String tableName() {
        return this.tableName;
    }

    private GetPermissionsDataCellsFilter() {}

    private GetPermissionsDataCellsFilter(GetPermissionsDataCellsFilter $) {
        this.databaseName = $.databaseName;
        this.name = $.name;
        this.tableCatalogId = $.tableCatalogId;
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPermissionsDataCellsFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPermissionsDataCellsFilter $;

        public Builder() {
            $ = new GetPermissionsDataCellsFilter();
        }

        public Builder(GetPermissionsDataCellsFilter defaults) {
            $ = new GetPermissionsDataCellsFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The name of the database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param name The name of the data cells filter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tableCatalogId The ID of the Data Catalog.
         * 
         * @return builder
         * 
         */
        public Builder tableCatalogId(String tableCatalogId) {
            $.tableCatalogId = tableCatalogId;
            return this;
        }

        /**
         * @param tableName The name of the table.
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            $.tableName = tableName;
            return this;
        }

        public GetPermissionsDataCellsFilter build() {
            if ($.databaseName == null) {
                throw new MissingRequiredPropertyException("GetPermissionsDataCellsFilter", "databaseName");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetPermissionsDataCellsFilter", "name");
            }
            if ($.tableCatalogId == null) {
                throw new MissingRequiredPropertyException("GetPermissionsDataCellsFilter", "tableCatalogId");
            }
            if ($.tableName == null) {
                throw new MissingRequiredPropertyException("GetPermissionsDataCellsFilter", "tableName");
            }
            return $;
        }
    }

}
