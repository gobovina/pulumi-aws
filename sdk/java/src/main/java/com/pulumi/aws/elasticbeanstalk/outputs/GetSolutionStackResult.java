// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticbeanstalk.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSolutionStackResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable Boolean mostRecent;
    /**
     * @return The name of the solution stack.
     * 
     */
    private String name;
    private String nameRegex;

    private GetSolutionStackResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    /**
     * @return The name of the solution stack.
     * 
     */
    public String name() {
        return this.name;
    }
    public String nameRegex() {
        return this.nameRegex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSolutionStackResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable Boolean mostRecent;
        private String name;
        private String nameRegex;
        public Builder() {}
        public Builder(GetSolutionStackResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.mostRecent = defaults.mostRecent;
    	      this.name = defaults.name;
    	      this.nameRegex = defaults.nameRegex;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(String nameRegex) {
            this.nameRegex = Objects.requireNonNull(nameRegex);
            return this;
        }
        public GetSolutionStackResult build() {
            final var o = new GetSolutionStackResult();
            o.id = id;
            o.mostRecent = mostRecent;
            o.name = name;
            o.nameRegex = nameRegex;
            return o;
        }
    }
}
