// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataLakeSettingsCreateDatabaseDefaultPermission {
    /**
     * @return List of permissions that are granted to the principal. Valid values may include `ALL`, `SELECT`, `ALTER`, `DROP`, `DELETE`, `INSERT`, and `DESCRIBE`. For more details, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    private @Nullable List<String> permissions;
    /**
     * @return Principal who is granted permissions. To enforce metadata and underlying data access control only by IAM on new databases and tables set `principal` to `IAM_ALLOWED_PRINCIPALS` and `permissions` to `[&#34;ALL&#34;]`.
     * 
     */
    private @Nullable String principal;

    private DataLakeSettingsCreateDatabaseDefaultPermission() {}
    /**
     * @return List of permissions that are granted to the principal. Valid values may include `ALL`, `SELECT`, `ALTER`, `DROP`, `DELETE`, `INSERT`, and `DESCRIBE`. For more details, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    public List<String> permissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    /**
     * @return Principal who is granted permissions. To enforce metadata and underlying data access control only by IAM on new databases and tables set `principal` to `IAM_ALLOWED_PRINCIPALS` and `permissions` to `[&#34;ALL&#34;]`.
     * 
     */
    public Optional<String> principal() {
        return Optional.ofNullable(this.principal);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeSettingsCreateDatabaseDefaultPermission defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> permissions;
        private @Nullable String principal;
        public Builder() {}
        public Builder(DataLakeSettingsCreateDatabaseDefaultPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
    	      this.principal = defaults.principal;
        }

        @CustomType.Setter
        public Builder permissions(@Nullable List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        @CustomType.Setter
        public Builder principal(@Nullable String principal) {
            this.principal = principal;
            return this;
        }
        public DataLakeSettingsCreateDatabaseDefaultPermission build() {
            final var o = new DataLakeSettingsCreateDatabaseDefaultPermission();
            o.permissions = permissions;
            o.principal = principal;
            return o;
        }
    }
}
