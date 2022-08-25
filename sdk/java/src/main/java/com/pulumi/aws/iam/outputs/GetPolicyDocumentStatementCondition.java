// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPolicyDocumentStatementCondition {
    /**
     * @return Name of the [IAM condition operator](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition_operators.html) to evaluate.
     * 
     */
    private String test;
    /**
     * @return Values to evaluate the condition against. If multiple values are provided, the condition matches if at least one of them applies. That is, AWS evaluates multiple values as though using an &#34;OR&#34; boolean operation.
     * 
     */
    private List<String> values;
    /**
     * @return Name of a [Context Variable](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html#AvailableKeys) to apply the condition to. Context variables may either be standard AWS variables starting with `aws:` or service-specific variables prefixed with the service name.
     * 
     */
    private String variable;

    private GetPolicyDocumentStatementCondition() {}
    /**
     * @return Name of the [IAM condition operator](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition_operators.html) to evaluate.
     * 
     */
    public String test() {
        return this.test;
    }
    /**
     * @return Values to evaluate the condition against. If multiple values are provided, the condition matches if at least one of them applies. That is, AWS evaluates multiple values as though using an &#34;OR&#34; boolean operation.
     * 
     */
    public List<String> values() {
        return this.values;
    }
    /**
     * @return Name of a [Context Variable](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html#AvailableKeys) to apply the condition to. Context variables may either be standard AWS variables starting with `aws:` or service-specific variables prefixed with the service name.
     * 
     */
    public String variable() {
        return this.variable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyDocumentStatementCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String test;
        private List<String> values;
        private String variable;
        public Builder() {}
        public Builder(GetPolicyDocumentStatementCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.test = defaults.test;
    	      this.values = defaults.values;
    	      this.variable = defaults.variable;
        }

        @CustomType.Setter
        public Builder test(String test) {
            this.test = Objects.requireNonNull(test);
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
        @CustomType.Setter
        public Builder variable(String variable) {
            this.variable = Objects.requireNonNull(variable);
            return this;
        }
        public GetPolicyDocumentStatementCondition build() {
            final var o = new GetPolicyDocumentStatementCondition();
            o.test = test;
            o.values = values;
            o.variable = variable;
            return o;
        }
    }
}
