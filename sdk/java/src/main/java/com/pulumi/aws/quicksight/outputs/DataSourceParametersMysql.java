// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataSourceParametersMysql {
    /**
     * @return The database to which to connect.
     * 
     */
    private String database;
    /**
     * @return The host to which to connect.
     * 
     */
    private String host;
    /**
     * @return The port to which to connect.
     * 
     */
    private Integer port;

    private DataSourceParametersMysql() {}
    /**
     * @return The database to which to connect.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return The host to which to connect.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return The port to which to connect.
     * 
     */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersMysql defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String database;
        private String host;
        private Integer port;
        public Builder() {}
        public Builder(DataSourceParametersMysql defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        @CustomType.Setter
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public DataSourceParametersMysql build() {
            final var o = new DataSourceParametersMysql();
            o.database = database;
            o.host = host;
            o.port = port;
            return o;
        }
    }
}
