// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetImagePipelinesFilter {
    /**
     * @return The name of the filter field. Valid values can be found in the [Image Builder ListImagePipelines API Reference](https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_ListImagePipelines.html).
     * 
     */
    private String name;
    /**
     * @return Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
     * 
     */
    private List<String> values;

    private GetImagePipelinesFilter() {}
    /**
     * @return The name of the filter field. Valid values can be found in the [Image Builder ListImagePipelines API Reference](https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_ListImagePipelines.html).
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagePipelinesFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private List<String> values;
        public Builder() {}
        public Builder(GetImagePipelinesFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public GetImagePipelinesFilter build() {
            final var o = new GetImagePipelinesFilter();
            o.name = name;
            o.values = values;
            return o;
        }
    }
}
