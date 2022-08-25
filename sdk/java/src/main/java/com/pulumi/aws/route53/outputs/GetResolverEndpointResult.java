// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.outputs;

import com.pulumi.aws.route53.outputs.GetResolverEndpointFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetResolverEndpointResult {
    private String arn;
    private String direction;
    private @Nullable List<GetResolverEndpointFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ipAddresses;
    private String name;
    private @Nullable String resolverEndpointId;
    private String status;
    private String vpcId;

    private GetResolverEndpointResult() {}
    public String arn() {
        return this.arn;
    }
    public String direction() {
        return this.direction;
    }
    public List<GetResolverEndpointFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ipAddresses() {
        return this.ipAddresses;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> resolverEndpointId() {
        return Optional.ofNullable(this.resolverEndpointId);
    }
    public String status() {
        return this.status;
    }
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolverEndpointResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String direction;
        private @Nullable List<GetResolverEndpointFilter> filters;
        private String id;
        private List<String> ipAddresses;
        private String name;
        private @Nullable String resolverEndpointId;
        private String status;
        private String vpcId;
        public Builder() {}
        public Builder(GetResolverEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.direction = defaults.direction;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.name = defaults.name;
    	      this.resolverEndpointId = defaults.resolverEndpointId;
    	      this.status = defaults.status;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetResolverEndpointFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetResolverEndpointFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipAddresses(List<String> ipAddresses) {
            this.ipAddresses = Objects.requireNonNull(ipAddresses);
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder resolverEndpointId(@Nullable String resolverEndpointId) {
            this.resolverEndpointId = resolverEndpointId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetResolverEndpointResult build() {
            final var o = new GetResolverEndpointResult();
            o.arn = arn;
            o.direction = direction;
            o.filters = filters;
            o.id = id;
            o.ipAddresses = ipAddresses;
            o.name = name;
            o.resolverEndpointId = resolverEndpointId;
            o.status = status;
            o.vpcId = vpcId;
            return o;
        }
    }
}
