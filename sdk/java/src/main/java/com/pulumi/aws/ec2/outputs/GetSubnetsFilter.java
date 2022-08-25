// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSubnetsFilter {
    /**
     * @return The name of the field to filter by, as defined by
     * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSubnets.html).
     * For example, if matching against tag `Name`, use:
     * 
     */
    private String name;
    /**
     * @return Set of values that are accepted for the given field.
     * Subnet IDs will be selected if any one of the given values match.
     * 
     */
    private List<String> values;

    private GetSubnetsFilter() {}
    /**
     * @return The name of the field to filter by, as defined by
     * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSubnets.html).
     * For example, if matching against tag `Name`, use:
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Set of values that are accepted for the given field.
     * Subnet IDs will be selected if any one of the given values match.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetsFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private List<String> values;
        public Builder() {}
        public Builder(GetSubnetsFilter defaults) {
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
        public GetSubnetsFilter build() {
            final var o = new GetSubnetsFilter();
            o.name = name;
            o.values = values;
            return o;
        }
    }
}
