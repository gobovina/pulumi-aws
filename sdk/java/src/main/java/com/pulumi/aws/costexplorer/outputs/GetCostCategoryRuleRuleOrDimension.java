// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCostCategoryRuleRuleOrDimension {
    /**
     * @return Key for the tag.
     * 
     */
    private String key;
    /**
     * @return Match options that you can use to filter your results. MatchOptions is only applicable for actions related to cost category. The default values for MatchOptions is `EQUALS` and `CASE_SENSITIVE`. Valid values are: `EQUALS`,  `ABSENT`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CASE_SENSITIVE`, `CASE_INSENSITIVE`.
     * 
     */
    private List<String> matchOptions;
    /**
     * @return Parameter values.
     * 
     */
    private List<String> values;

    private GetCostCategoryRuleRuleOrDimension() {}
    /**
     * @return Key for the tag.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Match options that you can use to filter your results. MatchOptions is only applicable for actions related to cost category. The default values for MatchOptions is `EQUALS` and `CASE_SENSITIVE`. Valid values are: `EQUALS`,  `ABSENT`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CASE_SENSITIVE`, `CASE_INSENSITIVE`.
     * 
     */
    public List<String> matchOptions() {
        return this.matchOptions;
    }
    /**
     * @return Parameter values.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCostCategoryRuleRuleOrDimension defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private List<String> matchOptions;
        private List<String> values;
        public Builder() {}
        public Builder(GetCostCategoryRuleRuleOrDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.matchOptions = defaults.matchOptions;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder matchOptions(List<String> matchOptions) {
            this.matchOptions = Objects.requireNonNull(matchOptions);
            return this;
        }
        public Builder matchOptions(String... matchOptions) {
            return matchOptions(List.of(matchOptions));
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public GetCostCategoryRuleRuleOrDimension build() {
            final var o = new GetCostCategoryRuleRuleOrDimension();
            o.key = key;
            o.matchOptions = matchOptions;
            o.values = values;
            return o;
        }
    }
}
