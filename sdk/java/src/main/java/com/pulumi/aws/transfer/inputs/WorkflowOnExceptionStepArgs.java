// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.inputs;

import com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCopyStepDetailsArgs;
import com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepCustomStepDetailsArgs;
import com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDecryptStepDetailsArgs;
import com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepDeleteStepDetailsArgs;
import com.pulumi.aws.transfer.inputs.WorkflowOnExceptionStepTagStepDetailsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowOnExceptionStepArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowOnExceptionStepArgs Empty = new WorkflowOnExceptionStepArgs();

    /**
     * Details for a step that performs a file copy. See Copy Step Details below.
     * 
     */
    @Import(name="copyStepDetails")
    private @Nullable Output<WorkflowOnExceptionStepCopyStepDetailsArgs> copyStepDetails;

    /**
     * @return Details for a step that performs a file copy. See Copy Step Details below.
     * 
     */
    public Optional<Output<WorkflowOnExceptionStepCopyStepDetailsArgs>> copyStepDetails() {
        return Optional.ofNullable(this.copyStepDetails);
    }

    /**
     * Details for a step that invokes a lambda function.
     * 
     */
    @Import(name="customStepDetails")
    private @Nullable Output<WorkflowOnExceptionStepCustomStepDetailsArgs> customStepDetails;

    /**
     * @return Details for a step that invokes a lambda function.
     * 
     */
    public Optional<Output<WorkflowOnExceptionStepCustomStepDetailsArgs>> customStepDetails() {
        return Optional.ofNullable(this.customStepDetails);
    }

    /**
     * Details for a step that decrypts the file.
     * 
     */
    @Import(name="decryptStepDetails")
    private @Nullable Output<WorkflowOnExceptionStepDecryptStepDetailsArgs> decryptStepDetails;

    /**
     * @return Details for a step that decrypts the file.
     * 
     */
    public Optional<Output<WorkflowOnExceptionStepDecryptStepDetailsArgs>> decryptStepDetails() {
        return Optional.ofNullable(this.decryptStepDetails);
    }

    /**
     * Details for a step that deletes the file.
     * 
     */
    @Import(name="deleteStepDetails")
    private @Nullable Output<WorkflowOnExceptionStepDeleteStepDetailsArgs> deleteStepDetails;

    /**
     * @return Details for a step that deletes the file.
     * 
     */
    public Optional<Output<WorkflowOnExceptionStepDeleteStepDetailsArgs>> deleteStepDetails() {
        return Optional.ofNullable(this.deleteStepDetails);
    }

    /**
     * Details for a step that creates one or more tags.
     * 
     */
    @Import(name="tagStepDetails")
    private @Nullable Output<WorkflowOnExceptionStepTagStepDetailsArgs> tagStepDetails;

    /**
     * @return Details for a step that creates one or more tags.
     * 
     */
    public Optional<Output<WorkflowOnExceptionStepTagStepDetailsArgs>> tagStepDetails() {
        return Optional.ofNullable(this.tagStepDetails);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private WorkflowOnExceptionStepArgs() {}

    private WorkflowOnExceptionStepArgs(WorkflowOnExceptionStepArgs $) {
        this.copyStepDetails = $.copyStepDetails;
        this.customStepDetails = $.customStepDetails;
        this.decryptStepDetails = $.decryptStepDetails;
        this.deleteStepDetails = $.deleteStepDetails;
        this.tagStepDetails = $.tagStepDetails;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowOnExceptionStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowOnExceptionStepArgs $;

        public Builder() {
            $ = new WorkflowOnExceptionStepArgs();
        }

        public Builder(WorkflowOnExceptionStepArgs defaults) {
            $ = new WorkflowOnExceptionStepArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param copyStepDetails Details for a step that performs a file copy. See Copy Step Details below.
         * 
         * @return builder
         * 
         */
        public Builder copyStepDetails(@Nullable Output<WorkflowOnExceptionStepCopyStepDetailsArgs> copyStepDetails) {
            $.copyStepDetails = copyStepDetails;
            return this;
        }

        /**
         * @param copyStepDetails Details for a step that performs a file copy. See Copy Step Details below.
         * 
         * @return builder
         * 
         */
        public Builder copyStepDetails(WorkflowOnExceptionStepCopyStepDetailsArgs copyStepDetails) {
            return copyStepDetails(Output.of(copyStepDetails));
        }

        /**
         * @param customStepDetails Details for a step that invokes a lambda function.
         * 
         * @return builder
         * 
         */
        public Builder customStepDetails(@Nullable Output<WorkflowOnExceptionStepCustomStepDetailsArgs> customStepDetails) {
            $.customStepDetails = customStepDetails;
            return this;
        }

        /**
         * @param customStepDetails Details for a step that invokes a lambda function.
         * 
         * @return builder
         * 
         */
        public Builder customStepDetails(WorkflowOnExceptionStepCustomStepDetailsArgs customStepDetails) {
            return customStepDetails(Output.of(customStepDetails));
        }

        /**
         * @param decryptStepDetails Details for a step that decrypts the file.
         * 
         * @return builder
         * 
         */
        public Builder decryptStepDetails(@Nullable Output<WorkflowOnExceptionStepDecryptStepDetailsArgs> decryptStepDetails) {
            $.decryptStepDetails = decryptStepDetails;
            return this;
        }

        /**
         * @param decryptStepDetails Details for a step that decrypts the file.
         * 
         * @return builder
         * 
         */
        public Builder decryptStepDetails(WorkflowOnExceptionStepDecryptStepDetailsArgs decryptStepDetails) {
            return decryptStepDetails(Output.of(decryptStepDetails));
        }

        /**
         * @param deleteStepDetails Details for a step that deletes the file.
         * 
         * @return builder
         * 
         */
        public Builder deleteStepDetails(@Nullable Output<WorkflowOnExceptionStepDeleteStepDetailsArgs> deleteStepDetails) {
            $.deleteStepDetails = deleteStepDetails;
            return this;
        }

        /**
         * @param deleteStepDetails Details for a step that deletes the file.
         * 
         * @return builder
         * 
         */
        public Builder deleteStepDetails(WorkflowOnExceptionStepDeleteStepDetailsArgs deleteStepDetails) {
            return deleteStepDetails(Output.of(deleteStepDetails));
        }

        /**
         * @param tagStepDetails Details for a step that creates one or more tags.
         * 
         * @return builder
         * 
         */
        public Builder tagStepDetails(@Nullable Output<WorkflowOnExceptionStepTagStepDetailsArgs> tagStepDetails) {
            $.tagStepDetails = tagStepDetails;
            return this;
        }

        /**
         * @param tagStepDetails Details for a step that creates one or more tags.
         * 
         * @return builder
         * 
         */
        public Builder tagStepDetails(WorkflowOnExceptionStepTagStepDetailsArgs tagStepDetails) {
            return tagStepDetails(Output.of(tagStepDetails));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public WorkflowOnExceptionStepArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("WorkflowOnExceptionStepArgs", "type");
            }
            return $;
        }
    }

}
