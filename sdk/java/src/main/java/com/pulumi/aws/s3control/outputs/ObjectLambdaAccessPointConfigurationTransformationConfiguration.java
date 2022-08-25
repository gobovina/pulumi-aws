// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.outputs;

import com.pulumi.aws.s3control.outputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ObjectLambdaAccessPointConfigurationTransformationConfiguration {
    /**
     * @return The actions of an Object Lambda Access Point configuration. Valid values: `GetObject`.
     * 
     */
    private List<String> actions;
    /**
     * @return The content transformation of an Object Lambda Access Point configuration. See Content Transformation below for more details.
     * 
     */
    private ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation contentTransformation;

    private ObjectLambdaAccessPointConfigurationTransformationConfiguration() {}
    /**
     * @return The actions of an Object Lambda Access Point configuration. Valid values: `GetObject`.
     * 
     */
    public List<String> actions() {
        return this.actions;
    }
    /**
     * @return The content transformation of an Object Lambda Access Point configuration. See Content Transformation below for more details.
     * 
     */
    public ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation contentTransformation() {
        return this.contentTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectLambdaAccessPointConfigurationTransformationConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> actions;
        private ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation contentTransformation;
        public Builder() {}
        public Builder(ObjectLambdaAccessPointConfigurationTransformationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.contentTransformation = defaults.contentTransformation;
        }

        @CustomType.Setter
        public Builder actions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder contentTransformation(ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation contentTransformation) {
            this.contentTransformation = Objects.requireNonNull(contentTransformation);
            return this;
        }
        public ObjectLambdaAccessPointConfigurationTransformationConfiguration build() {
            final var o = new ObjectLambdaAccessPointConfigurationTransformationConfiguration();
            o.actions = actions;
            o.contentTransformation = contentTransformation;
            return o;
        }
    }
}
