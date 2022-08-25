// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.outputs;

import com.pulumi.aws.transfer.outputs.WorkflowOnExceptionStepTagStepDetailsTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowOnExceptionStepTagStepDetails {
    /**
     * @return The name of the step, used as an identifier.
     * 
     */
    private @Nullable String name;
    /**
     * @return Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
     * 
     */
    private @Nullable String sourceFileLocation;
    /**
     * @return Array that contains from 1 to 10 key/value pairs. See S3 Tags below.
     * 
     */
    private @Nullable List<WorkflowOnExceptionStepTagStepDetailsTag> tags;

    private WorkflowOnExceptionStepTagStepDetails() {}
    /**
     * @return The name of the step, used as an identifier.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
     * 
     */
    public Optional<String> sourceFileLocation() {
        return Optional.ofNullable(this.sourceFileLocation);
    }
    /**
     * @return Array that contains from 1 to 10 key/value pairs. See S3 Tags below.
     * 
     */
    public List<WorkflowOnExceptionStepTagStepDetailsTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowOnExceptionStepTagStepDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String sourceFileLocation;
        private @Nullable List<WorkflowOnExceptionStepTagStepDetailsTag> tags;
        public Builder() {}
        public Builder(WorkflowOnExceptionStepTagStepDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sourceFileLocation = defaults.sourceFileLocation;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder sourceFileLocation(@Nullable String sourceFileLocation) {
            this.sourceFileLocation = sourceFileLocation;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<WorkflowOnExceptionStepTagStepDetailsTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(WorkflowOnExceptionStepTagStepDetailsTag... tags) {
            return tags(List.of(tags));
        }
        public WorkflowOnExceptionStepTagStepDetails build() {
            final var o = new WorkflowOnExceptionStepTagStepDetails();
            o.name = name;
            o.sourceFileLocation = sourceFileLocation;
            o.tags = tags;
            return o;
        }
    }
}
