// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecatalyst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class DevEnvironmentPersistentStorageArgs extends com.pulumi.resources.ResourceArgs {

    public static final DevEnvironmentPersistentStorageArgs Empty = new DevEnvironmentPersistentStorageArgs();

    /**
     * The size of the persistent storage in gigabytes (specifically GiB). Valid values for storage are based on memory sizes in 16GB increments. Valid values are 16, 32, and 64.
     * 
     */
    @Import(name="size", required=true)
    private Output<Integer> size;

    /**
     * @return The size of the persistent storage in gigabytes (specifically GiB). Valid values for storage are based on memory sizes in 16GB increments. Valid values are 16, 32, and 64.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }

    private DevEnvironmentPersistentStorageArgs() {}

    private DevEnvironmentPersistentStorageArgs(DevEnvironmentPersistentStorageArgs $) {
        this.size = $.size;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DevEnvironmentPersistentStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DevEnvironmentPersistentStorageArgs $;

        public Builder() {
            $ = new DevEnvironmentPersistentStorageArgs();
        }

        public Builder(DevEnvironmentPersistentStorageArgs defaults) {
            $ = new DevEnvironmentPersistentStorageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param size The size of the persistent storage in gigabytes (specifically GiB). Valid values for storage are based on memory sizes in 16GB increments. Valid values are 16, 32, and 64.
         * 
         * @return builder
         * 
         */
        public Builder size(Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the persistent storage in gigabytes (specifically GiB). Valid values for storage are based on memory sizes in 16GB increments. Valid values are 16, 32, and 64.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        public DevEnvironmentPersistentStorageArgs build() {
            if ($.size == null) {
                throw new MissingRequiredPropertyException("DevEnvironmentPersistentStorageArgs", "size");
            }
            return $;
        }
    }

}
