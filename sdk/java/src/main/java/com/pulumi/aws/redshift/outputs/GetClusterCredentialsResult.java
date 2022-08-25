// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterCredentialsResult {
    private @Nullable Boolean autoCreate;
    private String clusterIdentifier;
    private @Nullable List<String> dbGroups;
    private @Nullable String dbName;
    /**
     * @return A temporary password that authorizes the user name returned by `db_user` to log on to the database `db_name`.
     * 
     */
    private String dbPassword;
    private String dbUser;
    private @Nullable Integer durationSeconds;
    /**
     * @return The date and time the password in `db_password` expires.
     * 
     */
    private String expiration;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetClusterCredentialsResult() {}
    public Optional<Boolean> autoCreate() {
        return Optional.ofNullable(this.autoCreate);
    }
    public String clusterIdentifier() {
        return this.clusterIdentifier;
    }
    public List<String> dbGroups() {
        return this.dbGroups == null ? List.of() : this.dbGroups;
    }
    public Optional<String> dbName() {
        return Optional.ofNullable(this.dbName);
    }
    /**
     * @return A temporary password that authorizes the user name returned by `db_user` to log on to the database `db_name`.
     * 
     */
    public String dbPassword() {
        return this.dbPassword;
    }
    public String dbUser() {
        return this.dbUser;
    }
    public Optional<Integer> durationSeconds() {
        return Optional.ofNullable(this.durationSeconds);
    }
    /**
     * @return The date and time the password in `db_password` expires.
     * 
     */
    public String expiration() {
        return this.expiration;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterCredentialsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean autoCreate;
        private String clusterIdentifier;
        private @Nullable List<String> dbGroups;
        private @Nullable String dbName;
        private String dbPassword;
        private String dbUser;
        private @Nullable Integer durationSeconds;
        private String expiration;
        private String id;
        public Builder() {}
        public Builder(GetClusterCredentialsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreate = defaults.autoCreate;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.dbGroups = defaults.dbGroups;
    	      this.dbName = defaults.dbName;
    	      this.dbPassword = defaults.dbPassword;
    	      this.dbUser = defaults.dbUser;
    	      this.durationSeconds = defaults.durationSeconds;
    	      this.expiration = defaults.expiration;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder autoCreate(@Nullable Boolean autoCreate) {
            this.autoCreate = autoCreate;
            return this;
        }
        @CustomType.Setter
        public Builder clusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }
        @CustomType.Setter
        public Builder dbGroups(@Nullable List<String> dbGroups) {
            this.dbGroups = dbGroups;
            return this;
        }
        public Builder dbGroups(String... dbGroups) {
            return dbGroups(List.of(dbGroups));
        }
        @CustomType.Setter
        public Builder dbName(@Nullable String dbName) {
            this.dbName = dbName;
            return this;
        }
        @CustomType.Setter
        public Builder dbPassword(String dbPassword) {
            this.dbPassword = Objects.requireNonNull(dbPassword);
            return this;
        }
        @CustomType.Setter
        public Builder dbUser(String dbUser) {
            this.dbUser = Objects.requireNonNull(dbUser);
            return this;
        }
        @CustomType.Setter
        public Builder durationSeconds(@Nullable Integer durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder expiration(String expiration) {
            this.expiration = Objects.requireNonNull(expiration);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetClusterCredentialsResult build() {
            final var o = new GetClusterCredentialsResult();
            o.autoCreate = autoCreate;
            o.clusterIdentifier = clusterIdentifier;
            o.dbGroups = dbGroups;
            o.dbName = dbName;
            o.dbPassword = dbPassword;
            o.dbUser = dbUser;
            o.durationSeconds = durationSeconds;
            o.expiration = expiration;
            o.id = id;
            return o;
        }
    }
}
