// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobCommandArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobCommandArgs Empty = new JobCommandArgs();

    /**
     * The name of the job command. Defaults to `glueetl`. Use `pythonshell` for Python Shell Job Type, or `gluestreaming` for Streaming Job Type. `max_capacity` needs to be set if `pythonshell` is chosen.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the job command. Defaults to `glueetl`. Use `pythonshell` for Python Shell Job Type, or `gluestreaming` for Streaming Job Type. `max_capacity` needs to be set if `pythonshell` is chosen.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Python version being used to execute a Python shell job. Allowed values are 2, 3 or 3.9. Version 3 refers to Python 3.6.
     * 
     */
    @Import(name="pythonVersion")
    private @Nullable Output<String> pythonVersion;

    /**
     * @return The Python version being used to execute a Python shell job. Allowed values are 2, 3 or 3.9. Version 3 refers to Python 3.6.
     * 
     */
    public Optional<Output<String>> pythonVersion() {
        return Optional.ofNullable(this.pythonVersion);
    }

    /**
     * Specifies the S3 path to a script that executes a job.
     * 
     */
    @Import(name="scriptLocation", required=true)
    private Output<String> scriptLocation;

    /**
     * @return Specifies the S3 path to a script that executes a job.
     * 
     */
    public Output<String> scriptLocation() {
        return this.scriptLocation;
    }

    private JobCommandArgs() {}

    private JobCommandArgs(JobCommandArgs $) {
        this.name = $.name;
        this.pythonVersion = $.pythonVersion;
        this.scriptLocation = $.scriptLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobCommandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobCommandArgs $;

        public Builder() {
            $ = new JobCommandArgs();
        }

        public Builder(JobCommandArgs defaults) {
            $ = new JobCommandArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the job command. Defaults to `glueetl`. Use `pythonshell` for Python Shell Job Type, or `gluestreaming` for Streaming Job Type. `max_capacity` needs to be set if `pythonshell` is chosen.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the job command. Defaults to `glueetl`. Use `pythonshell` for Python Shell Job Type, or `gluestreaming` for Streaming Job Type. `max_capacity` needs to be set if `pythonshell` is chosen.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pythonVersion The Python version being used to execute a Python shell job. Allowed values are 2, 3 or 3.9. Version 3 refers to Python 3.6.
         * 
         * @return builder
         * 
         */
        public Builder pythonVersion(@Nullable Output<String> pythonVersion) {
            $.pythonVersion = pythonVersion;
            return this;
        }

        /**
         * @param pythonVersion The Python version being used to execute a Python shell job. Allowed values are 2, 3 or 3.9. Version 3 refers to Python 3.6.
         * 
         * @return builder
         * 
         */
        public Builder pythonVersion(String pythonVersion) {
            return pythonVersion(Output.of(pythonVersion));
        }

        /**
         * @param scriptLocation Specifies the S3 path to a script that executes a job.
         * 
         * @return builder
         * 
         */
        public Builder scriptLocation(Output<String> scriptLocation) {
            $.scriptLocation = scriptLocation;
            return this;
        }

        /**
         * @param scriptLocation Specifies the S3 path to a script that executes a job.
         * 
         * @return builder
         * 
         */
        public Builder scriptLocation(String scriptLocation) {
            return scriptLocation(Output.of(scriptLocation));
        }

        public JobCommandArgs build() {
            $.scriptLocation = Objects.requireNonNull($.scriptLocation, "expected parameter 'scriptLocation' to be non-null");
            return $;
        }
    }

}
