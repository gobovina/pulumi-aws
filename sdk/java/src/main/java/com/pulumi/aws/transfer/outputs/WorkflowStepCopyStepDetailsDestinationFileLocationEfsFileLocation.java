// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowStepCopyStepDetailsDestinationFileLocationEfsFileLocation {
    /**
     * @return The ID of the file system, assigned by Amazon EFS.
     * 
     */
    private @Nullable String fileSystemId;
    /**
     * @return The pathname for the folder being used by a workflow.
     * 
     */
    private @Nullable String path;

    private WorkflowStepCopyStepDetailsDestinationFileLocationEfsFileLocation() {}
    /**
     * @return The ID of the file system, assigned by Amazon EFS.
     * 
     */
    public Optional<String> fileSystemId() {
        return Optional.ofNullable(this.fileSystemId);
    }
    /**
     * @return The pathname for the folder being used by a workflow.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowStepCopyStepDetailsDestinationFileLocationEfsFileLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fileSystemId;
        private @Nullable String path;
        public Builder() {}
        public Builder(WorkflowStepCopyStepDetailsDestinationFileLocationEfsFileLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder fileSystemId(@Nullable String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public WorkflowStepCopyStepDetailsDestinationFileLocationEfsFileLocation build() {
            final var o = new WorkflowStepCopyStepDetailsDestinationFileLocationEfsFileLocation();
            o.fileSystemId = fileSystemId;
            o.path = path;
            return o;
        }
    }
}
