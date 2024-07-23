// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserHierarchyStructureHierarchyStructureLevelOneArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserHierarchyStructureHierarchyStructureLevelOneArgs Empty = new UserHierarchyStructureHierarchyStructureLevelOneArgs();

    /**
     * The Amazon Resource Name (ARN) of the hierarchy level.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the hierarchy level.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The identifier of the hierarchy level.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The identifier of the hierarchy level.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the user hierarchy level. Must not be more than 50 characters.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the user hierarchy level. Must not be more than 50 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private UserHierarchyStructureHierarchyStructureLevelOneArgs() {}

    private UserHierarchyStructureHierarchyStructureLevelOneArgs(UserHierarchyStructureHierarchyStructureLevelOneArgs $) {
        this.arn = $.arn;
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserHierarchyStructureHierarchyStructureLevelOneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserHierarchyStructureHierarchyStructureLevelOneArgs $;

        public Builder() {
            $ = new UserHierarchyStructureHierarchyStructureLevelOneArgs();
        }

        public Builder(UserHierarchyStructureHierarchyStructureLevelOneArgs defaults) {
            $ = new UserHierarchyStructureHierarchyStructureLevelOneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the hierarchy level.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the hierarchy level.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param id The identifier of the hierarchy level.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The identifier of the hierarchy level.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the user hierarchy level. Must not be more than 50 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the user hierarchy level. Must not be more than 50 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public UserHierarchyStructureHierarchyStructureLevelOneArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("UserHierarchyStructureHierarchyStructureLevelOneArgs", "name");
            }
            return $;
        }
    }

}
