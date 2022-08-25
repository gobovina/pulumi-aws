// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ReplicationConfigurationReplicationConfigurationRuleRepositoryFilter {
    /**
     * @return The repository filter details.
     * 
     */
    private String filter;
    /**
     * @return The repository filter type. The only supported value is `PREFIX_MATCH`, which is a repository name prefix specified with the filter parameter.
     * 
     */
    private String filterType;

    private ReplicationConfigurationReplicationConfigurationRuleRepositoryFilter() {}
    /**
     * @return The repository filter details.
     * 
     */
    public String filter() {
        return this.filter;
    }
    /**
     * @return The repository filter type. The only supported value is `PREFIX_MATCH`, which is a repository name prefix specified with the filter parameter.
     * 
     */
    public String filterType() {
        return this.filterType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationConfigurationRuleRepositoryFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String filter;
        private String filterType;
        public Builder() {}
        public Builder(ReplicationConfigurationReplicationConfigurationRuleRepositoryFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.filterType = defaults.filterType;
        }

        @CustomType.Setter
        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        @CustomType.Setter
        public Builder filterType(String filterType) {
            this.filterType = Objects.requireNonNull(filterType);
            return this;
        }
        public ReplicationConfigurationReplicationConfigurationRuleRepositoryFilter build() {
            final var o = new ReplicationConfigurationReplicationConfigurationRuleRepositoryFilter();
            o.filter = filter;
            o.filterType = filterType;
            return o;
        }
    }
}
