// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskIncludes {
    /**
     * @return The type of filter rule to apply. Valid values: `SIMPLE_PATTERN`.
     * 
     */
    private @Nullable String filterType;
    /**
     * @return A single filter string that consists of the patterns to include. The patterns are delimited by &#34;|&#34; (that is, a pipe), for example: `/folder1|/folder2`
     * 
     */
    private @Nullable String value;

    private TaskIncludes() {}
    /**
     * @return The type of filter rule to apply. Valid values: `SIMPLE_PATTERN`.
     * 
     */
    public Optional<String> filterType() {
        return Optional.ofNullable(this.filterType);
    }
    /**
     * @return A single filter string that consists of the patterns to include. The patterns are delimited by &#34;|&#34; (that is, a pipe), for example: `/folder1|/folder2`
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskIncludes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String filterType;
        private @Nullable String value;
        public Builder() {}
        public Builder(TaskIncludes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterType = defaults.filterType;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder filterType(@Nullable String filterType) {
            this.filterType = filterType;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public TaskIncludes build() {
            final var o = new TaskIncludes();
            o.filterType = filterType;
            o.value = value;
            return o;
        }
    }
}
