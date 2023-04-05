// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetRouteSpecHttpRouteMatchHeader;
import com.pulumi.aws.appmesh.outputs.GetRouteSpecHttpRouteMatchPath;
import com.pulumi.aws.appmesh.outputs.GetRouteSpecHttpRouteMatchQueryParameter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRouteSpecHttpRouteMatch {
    private List<GetRouteSpecHttpRouteMatchHeader> headers;
    private String method;
    private List<GetRouteSpecHttpRouteMatchPath> paths;
    private Integer port;
    private String prefix;
    private List<GetRouteSpecHttpRouteMatchQueryParameter> queryParameters;
    private String scheme;

    private GetRouteSpecHttpRouteMatch() {}
    public List<GetRouteSpecHttpRouteMatchHeader> headers() {
        return this.headers;
    }
    public String method() {
        return this.method;
    }
    public List<GetRouteSpecHttpRouteMatchPath> paths() {
        return this.paths;
    }
    public Integer port() {
        return this.port;
    }
    public String prefix() {
        return this.prefix;
    }
    public List<GetRouteSpecHttpRouteMatchQueryParameter> queryParameters() {
        return this.queryParameters;
    }
    public String scheme() {
        return this.scheme;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteSpecHttpRouteMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRouteSpecHttpRouteMatchHeader> headers;
        private String method;
        private List<GetRouteSpecHttpRouteMatchPath> paths;
        private Integer port;
        private String prefix;
        private List<GetRouteSpecHttpRouteMatchQueryParameter> queryParameters;
        private String scheme;
        public Builder() {}
        public Builder(GetRouteSpecHttpRouteMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.method = defaults.method;
    	      this.paths = defaults.paths;
    	      this.port = defaults.port;
    	      this.prefix = defaults.prefix;
    	      this.queryParameters = defaults.queryParameters;
    	      this.scheme = defaults.scheme;
        }

        @CustomType.Setter
        public Builder headers(List<GetRouteSpecHttpRouteMatchHeader> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }
        public Builder headers(GetRouteSpecHttpRouteMatchHeader... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder method(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }
        @CustomType.Setter
        public Builder paths(List<GetRouteSpecHttpRouteMatchPath> paths) {
            this.paths = Objects.requireNonNull(paths);
            return this;
        }
        public Builder paths(GetRouteSpecHttpRouteMatchPath... paths) {
            return paths(List.of(paths));
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        @CustomType.Setter
        public Builder queryParameters(List<GetRouteSpecHttpRouteMatchQueryParameter> queryParameters) {
            this.queryParameters = Objects.requireNonNull(queryParameters);
            return this;
        }
        public Builder queryParameters(GetRouteSpecHttpRouteMatchQueryParameter... queryParameters) {
            return queryParameters(List.of(queryParameters));
        }
        @CustomType.Setter
        public Builder scheme(String scheme) {
            this.scheme = Objects.requireNonNull(scheme);
            return this;
        }
        public GetRouteSpecHttpRouteMatch build() {
            final var o = new GetRouteSpecHttpRouteMatch();
            o.headers = headers;
            o.method = method;
            o.paths = paths;
            o.port = port;
            o.prefix = prefix;
            o.queryParameters = queryParameters;
            o.scheme = scheme;
            return o;
        }
    }
}
