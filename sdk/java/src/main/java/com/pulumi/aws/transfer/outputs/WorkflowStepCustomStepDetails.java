// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowStepCustomStepDetails {
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
     * @return The ARN for the lambda function that is being called.
     * 
     */
    private @Nullable String target;
    /**
     * @return Timeout, in seconds, for the step.
     * 
     */
    private @Nullable Integer timeoutSeconds;

    private WorkflowStepCustomStepDetails() {}
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
     * @return The ARN for the lambda function that is being called.
     * 
     */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }
    /**
     * @return Timeout, in seconds, for the step.
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowStepCustomStepDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String sourceFileLocation;
        private @Nullable String target;
        private @Nullable Integer timeoutSeconds;
        public Builder() {}
        public Builder(WorkflowStepCustomStepDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sourceFileLocation = defaults.sourceFileLocation;
    	      this.target = defaults.target;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
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
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public WorkflowStepCustomStepDetails build() {
            final var o = new WorkflowStepCustomStepDetails();
            o.name = name;
            o.sourceFileLocation = sourceFileLocation;
            o.target = target;
            o.timeoutSeconds = timeoutSeconds;
            return o;
        }
    }
}
