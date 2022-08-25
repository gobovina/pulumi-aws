// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codeartifact.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RepositoryUpstream {
    /**
     * @return The name of an upstream repository.
     * 
     */
    private String repositoryName;

    private RepositoryUpstream() {}
    /**
     * @return The name of an upstream repository.
     * 
     */
    public String repositoryName() {
        return this.repositoryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryUpstream defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String repositoryName;
        public Builder() {}
        public Builder(RepositoryUpstream defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryName = defaults.repositoryName;
        }

        @CustomType.Setter
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }
        public RepositoryUpstream build() {
            final var o = new RepositoryUpstream();
            o.repositoryName = repositoryName;
            return o;
        }
    }
}
