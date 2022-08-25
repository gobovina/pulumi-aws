// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.aws.glue.outputs.MLTransformParametersFindMatchesParameters;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MLTransformParameters {
    /**
     * @return The parameters for the find matches algorithm. see Find Matches Parameters.
     * 
     */
    private MLTransformParametersFindMatchesParameters findMatchesParameters;
    /**
     * @return The type of machine learning transform. For information about the types of machine learning transforms, see [Creating Machine Learning Transforms](http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html).
     * 
     */
    private String transformType;

    private MLTransformParameters() {}
    /**
     * @return The parameters for the find matches algorithm. see Find Matches Parameters.
     * 
     */
    public MLTransformParametersFindMatchesParameters findMatchesParameters() {
        return this.findMatchesParameters;
    }
    /**
     * @return The type of machine learning transform. For information about the types of machine learning transforms, see [Creating Machine Learning Transforms](http://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html).
     * 
     */
    public String transformType() {
        return this.transformType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MLTransformParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private MLTransformParametersFindMatchesParameters findMatchesParameters;
        private String transformType;
        public Builder() {}
        public Builder(MLTransformParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.findMatchesParameters = defaults.findMatchesParameters;
    	      this.transformType = defaults.transformType;
        }

        @CustomType.Setter
        public Builder findMatchesParameters(MLTransformParametersFindMatchesParameters findMatchesParameters) {
            this.findMatchesParameters = Objects.requireNonNull(findMatchesParameters);
            return this;
        }
        @CustomType.Setter
        public Builder transformType(String transformType) {
            this.transformType = Objects.requireNonNull(transformType);
            return this;
        }
        public MLTransformParameters build() {
            final var o = new MLTransformParameters();
            o.findMatchesParameters = findMatchesParameters;
            o.transformType = transformType;
            return o;
        }
    }
}
