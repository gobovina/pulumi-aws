// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pipes.inputs;

import com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesContainerOverrideArgs;
import com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesEphemeralStorageArgs;
import com.pulumi.aws.pipes.inputs.PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipeTargetParametersEcsTaskParametersOverridesArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipeTargetParametersEcsTaskParametersOverridesArgs Empty = new PipeTargetParametersEcsTaskParametersOverridesArgs();

    /**
     * One or more container overrides that are sent to a task. Detailed below.
     * 
     */
    @Import(name="containerOverrides")
    private @Nullable Output<List<PipeTargetParametersEcsTaskParametersOverridesContainerOverrideArgs>> containerOverrides;

    /**
     * @return One or more container overrides that are sent to a task. Detailed below.
     * 
     */
    public Optional<Output<List<PipeTargetParametersEcsTaskParametersOverridesContainerOverrideArgs>>> containerOverrides() {
        return Optional.ofNullable(this.containerOverrides);
    }

    /**
     * The number of cpu units reserved for the container, instead of the default value from the task definition. You must also specify a container name.
     * 
     */
    @Import(name="cpu")
    private @Nullable Output<String> cpu;

    /**
     * @return The number of cpu units reserved for the container, instead of the default value from the task definition. You must also specify a container name.
     * 
     */
    public Optional<Output<String>> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * The ephemeral storage setting override for the task.  Detailed below.
     * 
     */
    @Import(name="ephemeralStorage")
    private @Nullable Output<PipeTargetParametersEcsTaskParametersOverridesEphemeralStorageArgs> ephemeralStorage;

    /**
     * @return The ephemeral storage setting override for the task.  Detailed below.
     * 
     */
    public Optional<Output<PipeTargetParametersEcsTaskParametersOverridesEphemeralStorageArgs>> ephemeralStorage() {
        return Optional.ofNullable(this.ephemeralStorage);
    }

    /**
     * The Amazon Resource Name (ARN) of the task execution IAM role override for the task.
     * 
     */
    @Import(name="executionRoleArn")
    private @Nullable Output<String> executionRoleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the task execution IAM role override for the task.
     * 
     */
    public Optional<Output<String>> executionRoleArn() {
        return Optional.ofNullable(this.executionRoleArn);
    }

    /**
     * List of Elastic Inference accelerator overrides for the task. Detailed below.
     * 
     */
    @Import(name="inferenceAcceleratorOverrides")
    private @Nullable Output<List<PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs>> inferenceAcceleratorOverrides;

    /**
     * @return List of Elastic Inference accelerator overrides for the task. Detailed below.
     * 
     */
    public Optional<Output<List<PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs>>> inferenceAcceleratorOverrides() {
        return Optional.ofNullable(this.inferenceAcceleratorOverrides);
    }

    /**
     * The hard limit (in MiB) of memory to present to the container, instead of the default value from the task definition. If your container attempts to exceed the memory specified here, the container is killed. You must also specify a container name.
     * 
     */
    @Import(name="memory")
    private @Nullable Output<String> memory;

    /**
     * @return The hard limit (in MiB) of memory to present to the container, instead of the default value from the task definition. If your container attempts to exceed the memory specified here, the container is killed. You must also specify a container name.
     * 
     */
    public Optional<Output<String>> memory() {
        return Optional.ofNullable(this.memory);
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this task are granted the permissions that are specified in this role.
     * 
     */
    @Import(name="taskRoleArn")
    private @Nullable Output<String> taskRoleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this task are granted the permissions that are specified in this role.
     * 
     */
    public Optional<Output<String>> taskRoleArn() {
        return Optional.ofNullable(this.taskRoleArn);
    }

    private PipeTargetParametersEcsTaskParametersOverridesArgs() {}

    private PipeTargetParametersEcsTaskParametersOverridesArgs(PipeTargetParametersEcsTaskParametersOverridesArgs $) {
        this.containerOverrides = $.containerOverrides;
        this.cpu = $.cpu;
        this.ephemeralStorage = $.ephemeralStorage;
        this.executionRoleArn = $.executionRoleArn;
        this.inferenceAcceleratorOverrides = $.inferenceAcceleratorOverrides;
        this.memory = $.memory;
        this.taskRoleArn = $.taskRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipeTargetParametersEcsTaskParametersOverridesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipeTargetParametersEcsTaskParametersOverridesArgs $;

        public Builder() {
            $ = new PipeTargetParametersEcsTaskParametersOverridesArgs();
        }

        public Builder(PipeTargetParametersEcsTaskParametersOverridesArgs defaults) {
            $ = new PipeTargetParametersEcsTaskParametersOverridesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerOverrides One or more container overrides that are sent to a task. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder containerOverrides(@Nullable Output<List<PipeTargetParametersEcsTaskParametersOverridesContainerOverrideArgs>> containerOverrides) {
            $.containerOverrides = containerOverrides;
            return this;
        }

        /**
         * @param containerOverrides One or more container overrides that are sent to a task. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder containerOverrides(List<PipeTargetParametersEcsTaskParametersOverridesContainerOverrideArgs> containerOverrides) {
            return containerOverrides(Output.of(containerOverrides));
        }

        /**
         * @param containerOverrides One or more container overrides that are sent to a task. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder containerOverrides(PipeTargetParametersEcsTaskParametersOverridesContainerOverrideArgs... containerOverrides) {
            return containerOverrides(List.of(containerOverrides));
        }

        /**
         * @param cpu The number of cpu units reserved for the container, instead of the default value from the task definition. You must also specify a container name.
         * 
         * @return builder
         * 
         */
        public Builder cpu(@Nullable Output<String> cpu) {
            $.cpu = cpu;
            return this;
        }

        /**
         * @param cpu The number of cpu units reserved for the container, instead of the default value from the task definition. You must also specify a container name.
         * 
         * @return builder
         * 
         */
        public Builder cpu(String cpu) {
            return cpu(Output.of(cpu));
        }

        /**
         * @param ephemeralStorage The ephemeral storage setting override for the task.  Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder ephemeralStorage(@Nullable Output<PipeTargetParametersEcsTaskParametersOverridesEphemeralStorageArgs> ephemeralStorage) {
            $.ephemeralStorage = ephemeralStorage;
            return this;
        }

        /**
         * @param ephemeralStorage The ephemeral storage setting override for the task.  Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder ephemeralStorage(PipeTargetParametersEcsTaskParametersOverridesEphemeralStorageArgs ephemeralStorage) {
            return ephemeralStorage(Output.of(ephemeralStorage));
        }

        /**
         * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution IAM role override for the task.
         * 
         * @return builder
         * 
         */
        public Builder executionRoleArn(@Nullable Output<String> executionRoleArn) {
            $.executionRoleArn = executionRoleArn;
            return this;
        }

        /**
         * @param executionRoleArn The Amazon Resource Name (ARN) of the task execution IAM role override for the task.
         * 
         * @return builder
         * 
         */
        public Builder executionRoleArn(String executionRoleArn) {
            return executionRoleArn(Output.of(executionRoleArn));
        }

        /**
         * @param inferenceAcceleratorOverrides List of Elastic Inference accelerator overrides for the task. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder inferenceAcceleratorOverrides(@Nullable Output<List<PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs>> inferenceAcceleratorOverrides) {
            $.inferenceAcceleratorOverrides = inferenceAcceleratorOverrides;
            return this;
        }

        /**
         * @param inferenceAcceleratorOverrides List of Elastic Inference accelerator overrides for the task. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder inferenceAcceleratorOverrides(List<PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs> inferenceAcceleratorOverrides) {
            return inferenceAcceleratorOverrides(Output.of(inferenceAcceleratorOverrides));
        }

        /**
         * @param inferenceAcceleratorOverrides List of Elastic Inference accelerator overrides for the task. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder inferenceAcceleratorOverrides(PipeTargetParametersEcsTaskParametersOverridesInferenceAcceleratorOverrideArgs... inferenceAcceleratorOverrides) {
            return inferenceAcceleratorOverrides(List.of(inferenceAcceleratorOverrides));
        }

        /**
         * @param memory The hard limit (in MiB) of memory to present to the container, instead of the default value from the task definition. If your container attempts to exceed the memory specified here, the container is killed. You must also specify a container name.
         * 
         * @return builder
         * 
         */
        public Builder memory(@Nullable Output<String> memory) {
            $.memory = memory;
            return this;
        }

        /**
         * @param memory The hard limit (in MiB) of memory to present to the container, instead of the default value from the task definition. If your container attempts to exceed the memory specified here, the container is killed. You must also specify a container name.
         * 
         * @return builder
         * 
         */
        public Builder memory(String memory) {
            return memory(Output.of(memory));
        }

        /**
         * @param taskRoleArn The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this task are granted the permissions that are specified in this role.
         * 
         * @return builder
         * 
         */
        public Builder taskRoleArn(@Nullable Output<String> taskRoleArn) {
            $.taskRoleArn = taskRoleArn;
            return this;
        }

        /**
         * @param taskRoleArn The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this task are granted the permissions that are specified in this role.
         * 
         * @return builder
         * 
         */
        public Builder taskRoleArn(String taskRoleArn) {
            return taskRoleArn(Output.of(taskRoleArn));
        }

        public PipeTargetParametersEcsTaskParametersOverridesArgs build() {
            return $;
        }
    }

}
