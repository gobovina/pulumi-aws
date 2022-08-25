// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProvisionedProductStackSetProvisioningPreferences {
    /**
     * @return One or more AWS accounts that will have access to the provisioned product. The AWS accounts specified should be within the list of accounts in the STACKSET constraint. To get the list of accounts in the STACKSET constraint, use the `aws_servicecatalog_provisioning_parameters` data source. If no values are specified, the default value is all accounts from the STACKSET constraint.
     * 
     */
    private @Nullable List<String> accounts;
    /**
     * @return Number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn&#39;t attempt the operation in any subsequent regions. You must specify either `failure_tolerance_count` or `failure_tolerance_percentage`, but not both. The default value is 0 if no value is specified.
     * 
     */
    private @Nullable Integer failureToleranceCount;
    /**
     * @return Percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn&#39;t attempt the operation in any subsequent regions. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. You must specify either `failure_tolerance_count` or `failure_tolerance_percentage`, but not both.
     * 
     */
    private @Nullable Integer failureTolerancePercentage;
    /**
     * @return Maximum number of accounts in which to perform this operation at one time. This is dependent on the value of `failure_tolerance_count`. `max_concurrency_count` is at most one more than the `failure_tolerance_count`. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. You must specify either `max_concurrency_count` or `max_concurrency_percentage`, but not both.
     * 
     */
    private @Nullable Integer maxConcurrencyCount;
    /**
     * @return Maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, AWS Service Catalog sets the number as 1 instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. You must specify either `max_concurrency_count` or `max_concurrency_percentage`, but not both.
     * 
     */
    private @Nullable Integer maxConcurrencyPercentage;
    /**
     * @return One or more AWS Regions where the provisioned product will be available. The specified regions should be within the list of regions from the STACKSET constraint. To get the list of regions in the STACKSET constraint, use the `aws_servicecatalog_provisioning_parameters` data source. If no values are specified, the default value is all regions from the STACKSET constraint.
     * 
     */
    private @Nullable List<String> regions;

    private ProvisionedProductStackSetProvisioningPreferences() {}
    /**
     * @return One or more AWS accounts that will have access to the provisioned product. The AWS accounts specified should be within the list of accounts in the STACKSET constraint. To get the list of accounts in the STACKSET constraint, use the `aws_servicecatalog_provisioning_parameters` data source. If no values are specified, the default value is all accounts from the STACKSET constraint.
     * 
     */
    public List<String> accounts() {
        return this.accounts == null ? List.of() : this.accounts;
    }
    /**
     * @return Number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn&#39;t attempt the operation in any subsequent regions. You must specify either `failure_tolerance_count` or `failure_tolerance_percentage`, but not both. The default value is 0 if no value is specified.
     * 
     */
    public Optional<Integer> failureToleranceCount() {
        return Optional.ofNullable(this.failureToleranceCount);
    }
    /**
     * @return Percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn&#39;t attempt the operation in any subsequent regions. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. You must specify either `failure_tolerance_count` or `failure_tolerance_percentage`, but not both.
     * 
     */
    public Optional<Integer> failureTolerancePercentage() {
        return Optional.ofNullable(this.failureTolerancePercentage);
    }
    /**
     * @return Maximum number of accounts in which to perform this operation at one time. This is dependent on the value of `failure_tolerance_count`. `max_concurrency_count` is at most one more than the `failure_tolerance_count`. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. You must specify either `max_concurrency_count` or `max_concurrency_percentage`, but not both.
     * 
     */
    public Optional<Integer> maxConcurrencyCount() {
        return Optional.ofNullable(this.maxConcurrencyCount);
    }
    /**
     * @return Maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, AWS Service Catalog sets the number as 1 instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. You must specify either `max_concurrency_count` or `max_concurrency_percentage`, but not both.
     * 
     */
    public Optional<Integer> maxConcurrencyPercentage() {
        return Optional.ofNullable(this.maxConcurrencyPercentage);
    }
    /**
     * @return One or more AWS Regions where the provisioned product will be available. The specified regions should be within the list of regions from the STACKSET constraint. To get the list of regions in the STACKSET constraint, use the `aws_servicecatalog_provisioning_parameters` data source. If no values are specified, the default value is all regions from the STACKSET constraint.
     * 
     */
    public List<String> regions() {
        return this.regions == null ? List.of() : this.regions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisionedProductStackSetProvisioningPreferences defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> accounts;
        private @Nullable Integer failureToleranceCount;
        private @Nullable Integer failureTolerancePercentage;
        private @Nullable Integer maxConcurrencyCount;
        private @Nullable Integer maxConcurrencyPercentage;
        private @Nullable List<String> regions;
        public Builder() {}
        public Builder(ProvisionedProductStackSetProvisioningPreferences defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.failureToleranceCount = defaults.failureToleranceCount;
    	      this.failureTolerancePercentage = defaults.failureTolerancePercentage;
    	      this.maxConcurrencyCount = defaults.maxConcurrencyCount;
    	      this.maxConcurrencyPercentage = defaults.maxConcurrencyPercentage;
    	      this.regions = defaults.regions;
        }

        @CustomType.Setter
        public Builder accounts(@Nullable List<String> accounts) {
            this.accounts = accounts;
            return this;
        }
        public Builder accounts(String... accounts) {
            return accounts(List.of(accounts));
        }
        @CustomType.Setter
        public Builder failureToleranceCount(@Nullable Integer failureToleranceCount) {
            this.failureToleranceCount = failureToleranceCount;
            return this;
        }
        @CustomType.Setter
        public Builder failureTolerancePercentage(@Nullable Integer failureTolerancePercentage) {
            this.failureTolerancePercentage = failureTolerancePercentage;
            return this;
        }
        @CustomType.Setter
        public Builder maxConcurrencyCount(@Nullable Integer maxConcurrencyCount) {
            this.maxConcurrencyCount = maxConcurrencyCount;
            return this;
        }
        @CustomType.Setter
        public Builder maxConcurrencyPercentage(@Nullable Integer maxConcurrencyPercentage) {
            this.maxConcurrencyPercentage = maxConcurrencyPercentage;
            return this;
        }
        @CustomType.Setter
        public Builder regions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }
        public ProvisionedProductStackSetProvisioningPreferences build() {
            final var o = new ProvisionedProductStackSetProvisioningPreferences();
            o.accounts = accounts;
            o.failureToleranceCount = failureToleranceCount;
            o.failureTolerancePercentage = failureTolerancePercentage;
            o.maxConcurrencyCount = maxConcurrencyCount;
            o.maxConcurrencyPercentage = maxConcurrencyPercentage;
            o.regions = regions;
            return o;
        }
    }
}
