// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndSimpleCriterion {
    /**
     * @return The operator to use in a condition. Valid combination of values are available in the [AWS Documentation](https://docs.aws.amazon.com/macie/latest/APIReference/jobs.html#jobs-model-jobcomparator)
     * 
     */
    private @Nullable String comparator;
    /**
     * @return The object property to use in the condition. Valid combination of values are available in the [AWS Documentation](https://docs.aws.amazon.com/macie/latest/APIReference/jobs.html#jobs-model-simplecriterionkeyforjob)
     * 
     */
    private @Nullable String key;
    /**
     * @return An array that lists the values to use in the condition. Valid combination of values are available in the [AWS Documentation](https://docs.aws.amazon.com/macie/latest/APIReference/jobs.html#jobs-model-simplecriterionforjob)
     * 
     */
    private @Nullable List<String> values;

    private ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndSimpleCriterion() {}
    /**
     * @return The operator to use in a condition. Valid combination of values are available in the [AWS Documentation](https://docs.aws.amazon.com/macie/latest/APIReference/jobs.html#jobs-model-jobcomparator)
     * 
     */
    public Optional<String> comparator() {
        return Optional.ofNullable(this.comparator);
    }
    /**
     * @return The object property to use in the condition. Valid combination of values are available in the [AWS Documentation](https://docs.aws.amazon.com/macie/latest/APIReference/jobs.html#jobs-model-simplecriterionkeyforjob)
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return An array that lists the values to use in the condition. Valid combination of values are available in the [AWS Documentation](https://docs.aws.amazon.com/macie/latest/APIReference/jobs.html#jobs-model-simplecriterionforjob)
     * 
     */
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndSimpleCriterion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comparator;
        private @Nullable String key;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndSimpleCriterion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparator = defaults.comparator;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder comparator(@Nullable String comparator) {
            this.comparator = comparator;
            return this;
        }
        @CustomType.Setter
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndSimpleCriterion build() {
            final var o = new ClassificationJobS3JobDefinitionBucketCriteriaExcludesAndSimpleCriterion();
            o.comparator = comparator;
            o.key = key;
            o.values = values;
            return o;
        }
    }
}
