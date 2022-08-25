// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRolesResult {
    /**
     * @return Set of ARNs of the matched IAM roles.
     * 
     */
    private List<String> arns;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String nameRegex;
    /**
     * @return Set of Names of the matched IAM roles.
     * 
     */
    private List<String> names;
    private @Nullable String pathPrefix;

    private GetRolesResult() {}
    /**
     * @return Set of ARNs of the matched IAM roles.
     * 
     */
    public List<String> arns() {
        return this.arns;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return Set of Names of the matched IAM roles.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> pathPrefix() {
        return Optional.ofNullable(this.pathPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRolesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> arns;
        private String id;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String pathPrefix;
        public Builder() {}
        public Builder(GetRolesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.id = defaults.id;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.pathPrefix = defaults.pathPrefix;
        }

        @CustomType.Setter
        public Builder arns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }
        public Builder arns(String... arns) {
            return arns(List.of(arns));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder pathPrefix(@Nullable String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }
        public GetRolesResult build() {
            final var o = new GetRolesResult();
            o.arns = arns;
            o.id = id;
            o.nameRegex = nameRegex;
            o.names = names;
            o.pathPrefix = pathPrefix;
            return o;
        }
    }
}
