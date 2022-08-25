// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterIdentityOidc {
    /**
     * @return Issuer URL for the OpenID Connect identity provider.
     * 
     */
    private @Nullable String issuer;

    private ClusterIdentityOidc() {}
    /**
     * @return Issuer URL for the OpenID Connect identity provider.
     * 
     */
    public Optional<String> issuer() {
        return Optional.ofNullable(this.issuer);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIdentityOidc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String issuer;
        public Builder() {}
        public Builder(ClusterIdentityOidc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuer = defaults.issuer;
        }

        @CustomType.Setter
        public Builder issuer(@Nullable String issuer) {
            this.issuer = issuer;
            return this;
        }
        public ClusterIdentityOidc build() {
            final var o = new ClusterIdentityOidc();
            o.issuer = issuer;
            return o;
        }
    }
}
