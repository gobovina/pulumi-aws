// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appstream.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StackStorageConnector {
    /**
     * @return Type of storage connector. Valid values are: `HOMEFOLDERS`, `GOOGLE_DRIVE`, `ONE_DRIVE`.
     * 
     */
    private String connectorType;
    /**
     * @return Names of the domains for the account.
     * 
     */
    private @Nullable List<String> domains;
    /**
     * @return ARN of the storage connector.
     * 
     */
    private @Nullable String resourceIdentifier;

    private StackStorageConnector() {}
    /**
     * @return Type of storage connector. Valid values are: `HOMEFOLDERS`, `GOOGLE_DRIVE`, `ONE_DRIVE`.
     * 
     */
    public String connectorType() {
        return this.connectorType;
    }
    /**
     * @return Names of the domains for the account.
     * 
     */
    public List<String> domains() {
        return this.domains == null ? List.of() : this.domains;
    }
    /**
     * @return ARN of the storage connector.
     * 
     */
    public Optional<String> resourceIdentifier() {
        return Optional.ofNullable(this.resourceIdentifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackStorageConnector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String connectorType;
        private @Nullable List<String> domains;
        private @Nullable String resourceIdentifier;
        public Builder() {}
        public Builder(StackStorageConnector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorType = defaults.connectorType;
    	      this.domains = defaults.domains;
    	      this.resourceIdentifier = defaults.resourceIdentifier;
        }

        @CustomType.Setter
        public Builder connectorType(String connectorType) {
            this.connectorType = Objects.requireNonNull(connectorType);
            return this;
        }
        @CustomType.Setter
        public Builder domains(@Nullable List<String> domains) {
            this.domains = domains;
            return this;
        }
        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }
        @CustomType.Setter
        public Builder resourceIdentifier(@Nullable String resourceIdentifier) {
            this.resourceIdentifier = resourceIdentifier;
            return this;
        }
        public StackStorageConnector build() {
            final var o = new StackStorageConnector();
            o.connectorType = connectorType;
            o.domains = domains;
            o.resourceIdentifier = resourceIdentifier;
            return o;
        }
    }
}
