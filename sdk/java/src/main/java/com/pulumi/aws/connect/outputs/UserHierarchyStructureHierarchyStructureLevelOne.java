// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserHierarchyStructureHierarchyStructureLevelOne {
    /**
     * @return The Amazon Resource Name (ARN) of the hierarchy level.
     * 
     */
    private @Nullable String arn;
    /**
     * @return The identifier of the hierarchy level.
     * 
     */
    private @Nullable String id;
    /**
     * @return The name of the user hierarchy level. Must not be more than 50 characters.
     * 
     */
    private String name;

    private UserHierarchyStructureHierarchyStructureLevelOne() {}
    /**
     * @return The Amazon Resource Name (ARN) of the hierarchy level.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return The identifier of the hierarchy level.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
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

    public static Builder builder(UserHierarchyStructureHierarchyStructureLevelOne defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String id;
        private String name;
        public Builder() {}
        public Builder(UserHierarchyStructureHierarchyStructureLevelOne defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder arn(@Nullable String arn) {

            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("UserHierarchyStructureHierarchyStructureLevelOne", "name");
            }
            this.name = name;
            return this;
        }
        public UserHierarchyStructureHierarchyStructureLevelOne build() {
            final var _resultValue = new UserHierarchyStructureHierarchyStructureLevelOne();
            _resultValue.arn = arn;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
