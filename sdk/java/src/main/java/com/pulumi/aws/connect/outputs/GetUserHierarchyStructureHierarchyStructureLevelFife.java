// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserHierarchyStructureHierarchyStructureLevelFife {
    /**
     * @return The Amazon Resource Name (ARN) of the hierarchy level.
     * 
     */
    private String arn;
    /**
     * @return The identifier of the hierarchy level.
     * 
     */
    private String id;
    /**
     * @return The name of the user hierarchy level. Must not be more than 50 characters.
     * 
     */
    private String name;

    private GetUserHierarchyStructureHierarchyStructureLevelFife() {}
    /**
     * @return The Amazon Resource Name (ARN) of the hierarchy level.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The identifier of the hierarchy level.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the user hierarchy level. Must not be more than 50 characters.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserHierarchyStructureHierarchyStructureLevelFife defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetUserHierarchyStructureHierarchyStructureLevelFife defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetUserHierarchyStructureHierarchyStructureLevelFife build() {
            final var o = new GetUserHierarchyStructureHierarchyStructureLevelFife();
            o.arn = arn;
            o.id = id;
            o.name = name;
            return o;
        }
    }
}
