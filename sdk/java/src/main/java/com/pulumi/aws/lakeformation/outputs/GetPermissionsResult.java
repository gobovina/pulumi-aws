// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.outputs;

import com.pulumi.aws.lakeformation.outputs.GetPermissionsDataCellsFilter;
import com.pulumi.aws.lakeformation.outputs.GetPermissionsDataLocation;
import com.pulumi.aws.lakeformation.outputs.GetPermissionsDatabase;
import com.pulumi.aws.lakeformation.outputs.GetPermissionsLfTag;
import com.pulumi.aws.lakeformation.outputs.GetPermissionsLfTagPolicy;
import com.pulumi.aws.lakeformation.outputs.GetPermissionsTable;
import com.pulumi.aws.lakeformation.outputs.GetPermissionsTableWithColumns;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPermissionsResult {
    private @Nullable String catalogId;
    private @Nullable Boolean catalogResource;
    private GetPermissionsDataCellsFilter dataCellsFilter;
    private GetPermissionsDataLocation dataLocation;
    private GetPermissionsDatabase database;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private GetPermissionsLfTag lfTag;
    private GetPermissionsLfTagPolicy lfTagPolicy;
    /**
     * @return List of permissions granted to the principal. For details on permissions, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    private List<String> permissions;
    /**
     * @return Subset of `permissions` which the principal can pass.
     * 
     */
    private List<String> permissionsWithGrantOptions;
    private String principal;
    private GetPermissionsTable table;
    private GetPermissionsTableWithColumns tableWithColumns;

    private GetPermissionsResult() {}
    public Optional<String> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }
    public Optional<Boolean> catalogResource() {
        return Optional.ofNullable(this.catalogResource);
    }
    public GetPermissionsDataCellsFilter dataCellsFilter() {
        return this.dataCellsFilter;
    }
    public GetPermissionsDataLocation dataLocation() {
        return this.dataLocation;
    }
    public GetPermissionsDatabase database() {
        return this.database;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public GetPermissionsLfTag lfTag() {
        return this.lfTag;
    }
    public GetPermissionsLfTagPolicy lfTagPolicy() {
        return this.lfTagPolicy;
    }
    /**
     * @return List of permissions granted to the principal. For details on permissions, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    public List<String> permissions() {
        return this.permissions;
    }
    /**
     * @return Subset of `permissions` which the principal can pass.
     * 
     */
    public List<String> permissionsWithGrantOptions() {
        return this.permissionsWithGrantOptions;
    }
    public String principal() {
        return this.principal;
    }
    public GetPermissionsTable table() {
        return this.table;
    }
    public GetPermissionsTableWithColumns tableWithColumns() {
        return this.tableWithColumns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String catalogId;
        private @Nullable Boolean catalogResource;
        private GetPermissionsDataCellsFilter dataCellsFilter;
        private GetPermissionsDataLocation dataLocation;
        private GetPermissionsDatabase database;
        private String id;
        private GetPermissionsLfTag lfTag;
        private GetPermissionsLfTagPolicy lfTagPolicy;
        private List<String> permissions;
        private List<String> permissionsWithGrantOptions;
        private String principal;
        private GetPermissionsTable table;
        private GetPermissionsTableWithColumns tableWithColumns;
        public Builder() {}
        public Builder(GetPermissionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.catalogResource = defaults.catalogResource;
    	      this.dataCellsFilter = defaults.dataCellsFilter;
    	      this.dataLocation = defaults.dataLocation;
    	      this.database = defaults.database;
    	      this.id = defaults.id;
    	      this.lfTag = defaults.lfTag;
    	      this.lfTagPolicy = defaults.lfTagPolicy;
    	      this.permissions = defaults.permissions;
    	      this.permissionsWithGrantOptions = defaults.permissionsWithGrantOptions;
    	      this.principal = defaults.principal;
    	      this.table = defaults.table;
    	      this.tableWithColumns = defaults.tableWithColumns;
        }

        @CustomType.Setter
        public Builder catalogId(@Nullable String catalogId) {

            this.catalogId = catalogId;
            return this;
        }
        @CustomType.Setter
        public Builder catalogResource(@Nullable Boolean catalogResource) {

            this.catalogResource = catalogResource;
            return this;
        }
        @CustomType.Setter
        public Builder dataCellsFilter(GetPermissionsDataCellsFilter dataCellsFilter) {
            if (dataCellsFilter == null) {
              throw new MissingRequiredPropertyException("GetPermissionsResult", "dataCellsFilter");
            }
            this.dataCellsFilter = dataCellsFilter;
            return this;
        }
        @CustomType.Setter
        public Builder dataLocation(GetPermissionsDataLocation dataLocation) {
            if (dataLocation == null) {
              throw new MissingRequiredPropertyException("GetPermissionsResult", "dataLocation");
            }
            this.dataLocation = dataLocation;
            return this;
        }
        @CustomType.Setter
        public Builder database(GetPermissionsDatabase database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("GetPermissionsResult", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPermissionsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder lfTag(GetPermissionsLfTag lfTag) {
            if (lfTag == null) {
              throw new MissingRequiredPropertyException("GetPermissionsResult", "lfTag");
            }
            this.lfTag = lfTag;
            return this;
        }
        @CustomType.Setter
        public Builder lfTagPolicy(GetPermissionsLfTagPolicy lfTagPolicy) {
            if (lfTagPolicy == null) {
              throw new MissingRequiredPropertyException("GetPermissionsResult", "lfTagPolicy");
            }
            this.lfTagPolicy = lfTagPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder permissions(List<String> permissions) {
            if (permissions == null) {
              throw new MissingRequiredPropertyException("GetPermissionsResult", "permissions");
            }
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        @CustomType.Setter
        public Builder permissionsWithGrantOptions(List<String> permissionsWithGrantOptions) {
            if (permissionsWithGrantOptions == null) {
              throw new MissingRequiredPropertyException("GetPermissionsResult", "permissionsWithGrantOptions");
            }
            this.permissionsWithGrantOptions = permissionsWithGrantOptions;
            return this;
        }
        public Builder permissionsWithGrantOptions(String... permissionsWithGrantOptions) {
            return permissionsWithGrantOptions(List.of(permissionsWithGrantOptions));
        }
        @CustomType.Setter
        public Builder principal(String principal) {
            if (principal == null) {
              throw new MissingRequiredPropertyException("GetPermissionsResult", "principal");
            }
            this.principal = principal;
            return this;
        }
        @CustomType.Setter
        public Builder table(GetPermissionsTable table) {
            if (table == null) {
              throw new MissingRequiredPropertyException("GetPermissionsResult", "table");
            }
            this.table = table;
            return this;
        }
        @CustomType.Setter
        public Builder tableWithColumns(GetPermissionsTableWithColumns tableWithColumns) {
            if (tableWithColumns == null) {
              throw new MissingRequiredPropertyException("GetPermissionsResult", "tableWithColumns");
            }
            this.tableWithColumns = tableWithColumns;
            return this;
        }
        public GetPermissionsResult build() {
            final var _resultValue = new GetPermissionsResult();
            _resultValue.catalogId = catalogId;
            _resultValue.catalogResource = catalogResource;
            _resultValue.dataCellsFilter = dataCellsFilter;
            _resultValue.dataLocation = dataLocation;
            _resultValue.database = database;
            _resultValue.id = id;
            _resultValue.lfTag = lfTag;
            _resultValue.lfTagPolicy = lfTagPolicy;
            _resultValue.permissions = permissions;
            _resultValue.permissionsWithGrantOptions = permissionsWithGrantOptions;
            _resultValue.principal = principal;
            _resultValue.table = table;
            _resultValue.tableWithColumns = tableWithColumns;
            return _resultValue;
        }
    }
}
