// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CostCategoryRuleRuleNotDimension {
    /**
     * @return Key for the tag.
     * 
     */
    private @Nullable String key;
    /**
     * @return Match options that you can use to filter your results. MatchOptions is only applicable for actions related to cost category. The default values for MatchOptions is `EQUALS` and `CASE_SENSITIVE`. Valid values are: `EQUALS`,  `ABSENT`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CASE_SENSITIVE`, `CASE_INSENSITIVE`.
     * 
     */
    private @Nullable List<String> matchOptions;
    /**
     * @return Parameter values.
     * 
     */
    private @Nullable List<String> values;

    private CostCategoryRuleRuleNotDimension() {}
    /**
     * @return Key for the tag.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return Match options that you can use to filter your results. MatchOptions is only applicable for actions related to cost category. The default values for MatchOptions is `EQUALS` and `CASE_SENSITIVE`. Valid values are: `EQUALS`,  `ABSENT`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CASE_SENSITIVE`, `CASE_INSENSITIVE`.
     * 
     */
    public List<String> matchOptions() {
        return this.matchOptions == null ? List.of() : this.matchOptions;
    }
    /**
     * @return Parameter values.
     * 
     */
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CostCategoryRuleRuleNotDimension defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        private @Nullable List<String> matchOptions;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(CostCategoryRuleRuleNotDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.matchOptions = defaults.matchOptions;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder matchOptions(@Nullable List<String> matchOptions) {
            this.matchOptions = matchOptions;
            return this;
        }
        public Builder matchOptions(String... matchOptions) {
            return matchOptions(List.of(matchOptions));
        }
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public CostCategoryRuleRuleNotDimension build() {
            final var o = new CostCategoryRuleRuleNotDimension();
            o.key = key;
            o.matchOptions = matchOptions;
            o.values = values;
            return o;
        }
    }
}
