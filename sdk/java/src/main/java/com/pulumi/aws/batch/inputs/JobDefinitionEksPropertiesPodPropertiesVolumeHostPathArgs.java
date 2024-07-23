// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs Empty = new JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs();

    /**
     * The path of the file or directory on the host to mount into containers on the pod.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The path of the file or directory on the host to mount into containers on the pod.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    private JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs() {}

    private JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs(JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs $) {
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs $;

        public Builder() {
            $ = new JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs();
        }

        public Builder(JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs defaults) {
            $ = new JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path The path of the file or directory on the host to mount into containers on the pod.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path of the file or directory on the host to mount into containers on the pod.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs build() {
            if ($.path == null) {
                throw new MissingRequiredPropertyException("JobDefinitionEksPropertiesPodPropertiesVolumeHostPathArgs", "path");
            }
            return $;
        }
    }

}
