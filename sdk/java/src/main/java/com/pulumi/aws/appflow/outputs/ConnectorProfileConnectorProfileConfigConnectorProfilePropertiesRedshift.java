// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshift {
    private String bucketName;
    private @Nullable String bucketPrefix;
    /**
     * @return The unique ID that&#39;s assigned to an Amazon Redshift cluster.
     * 
     */
    private @Nullable String clusterIdentifier;
    /**
     * @return ARN of the IAM role that permits AppFlow to access the database through Data API.
     * 
     */
    private @Nullable String dataApiRoleArn;
    /**
     * @return The name of an Amazon Redshift database.
     * 
     */
    private @Nullable String databaseName;
    /**
     * @return The JDBC URL of the Amazon Redshift cluster.
     * 
     */
    private @Nullable String databaseUrl;
    /**
     * @return ARN of the IAM role.
     * 
     */
    private String roleArn;

    private ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshift() {}
    public String bucketName() {
        return this.bucketName;
    }
    public Optional<String> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }
    /**
     * @return The unique ID that&#39;s assigned to an Amazon Redshift cluster.
     * 
     */
    public Optional<String> clusterIdentifier() {
        return Optional.ofNullable(this.clusterIdentifier);
    }
    /**
     * @return ARN of the IAM role that permits AppFlow to access the database through Data API.
     * 
     */
    public Optional<String> dataApiRoleArn() {
        return Optional.ofNullable(this.dataApiRoleArn);
    }
    /**
     * @return The name of an Amazon Redshift database.
     * 
     */
    public Optional<String> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    /**
     * @return The JDBC URL of the Amazon Redshift cluster.
     * 
     */
    public Optional<String> databaseUrl() {
        return Optional.ofNullable(this.databaseUrl);
    }
    /**
     * @return ARN of the IAM role.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshift defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucketName;
        private @Nullable String bucketPrefix;
        private @Nullable String clusterIdentifier;
        private @Nullable String dataApiRoleArn;
        private @Nullable String databaseName;
        private @Nullable String databaseUrl;
        private String roleArn;
        public Builder() {}
        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshift defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.dataApiRoleArn = defaults.dataApiRoleArn;
    	      this.databaseName = defaults.databaseName;
    	      this.databaseUrl = defaults.databaseUrl;
    	      this.roleArn = defaults.roleArn;
        }

        @CustomType.Setter
        public Builder bucketName(String bucketName) {
            if (bucketName == null) {
              throw new MissingRequiredPropertyException("ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshift", "bucketName");
            }
            this.bucketName = bucketName;
            return this;
        }
        @CustomType.Setter
        public Builder bucketPrefix(@Nullable String bucketPrefix) {

            this.bucketPrefix = bucketPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder clusterIdentifier(@Nullable String clusterIdentifier) {

            this.clusterIdentifier = clusterIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder dataApiRoleArn(@Nullable String dataApiRoleArn) {

            this.dataApiRoleArn = dataApiRoleArn;
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(@Nullable String databaseName) {

            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder databaseUrl(@Nullable String databaseUrl) {

            this.databaseUrl = databaseUrl;
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            if (roleArn == null) {
              throw new MissingRequiredPropertyException("ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshift", "roleArn");
            }
            this.roleArn = roleArn;
            return this;
        }
        public ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshift build() {
            final var _resultValue = new ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshift();
            _resultValue.bucketName = bucketName;
            _resultValue.bucketPrefix = bucketPrefix;
            _resultValue.clusterIdentifier = clusterIdentifier;
            _resultValue.dataApiRoleArn = dataApiRoleArn;
            _resultValue.databaseName = databaseName;
            _resultValue.databaseUrl = databaseUrl;
            _resultValue.roleArn = roleArn;
            return _resultValue;
        }
    }
}
