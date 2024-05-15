// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class StandardsSubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final StandardsSubscriptionArgs Empty = new StandardsSubscriptionArgs();

    /**
     * The ARN of a standard - see below.
     * 
     * Currently available standards (remember to replace `${var.partition}` and `${var.region}` as appropriate):
     * 
     * | Name                                     | ARN                                                                                                          |
     * |------------------------------------------|--------------------------------------------------------------------------------------------------------------|
     * | AWS Foundational Security Best Practices | `arn:${var.partition}:securityhub:${var.region}::standards/aws-foundational-security-best-practices/v/1.0.0` |
     * | AWS Resource Tagging Standard            | `arn:${var.partition}:securityhub:${var.region}::standards/aws-resource-tagging-standard/v/1.0.0`            |
     * | CIS AWS Foundations Benchmark v1.2.0     | `arn:${var.partition}:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0`                           |
     * | CIS AWS Foundations Benchmark v1.4.0     | `arn:${var.partition}:securityhub:${var.region}::standards/cis-aws-foundations-benchmark/v/1.4.0`            |
     * | NIST SP 800-53 Rev. 5                    | `arn:${var.partition}:securityhub:${var.region}::standards/nist-800-53/v/5.0.0`                              |
     * | PCI DSS                                  | `arn:${var.partition}:securityhub:${var.region}::standards/pci-dss/v/3.2.1`                                  |
     * 
     */
    @Import(name="standardsArn", required=true)
    private Output<String> standardsArn;

    /**
     * @return The ARN of a standard - see below.
     * 
     * Currently available standards (remember to replace `${var.partition}` and `${var.region}` as appropriate):
     * 
     * | Name                                     | ARN                                                                                                          |
     * |------------------------------------------|--------------------------------------------------------------------------------------------------------------|
     * | AWS Foundational Security Best Practices | `arn:${var.partition}:securityhub:${var.region}::standards/aws-foundational-security-best-practices/v/1.0.0` |
     * | AWS Resource Tagging Standard            | `arn:${var.partition}:securityhub:${var.region}::standards/aws-resource-tagging-standard/v/1.0.0`            |
     * | CIS AWS Foundations Benchmark v1.2.0     | `arn:${var.partition}:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0`                           |
     * | CIS AWS Foundations Benchmark v1.4.0     | `arn:${var.partition}:securityhub:${var.region}::standards/cis-aws-foundations-benchmark/v/1.4.0`            |
     * | NIST SP 800-53 Rev. 5                    | `arn:${var.partition}:securityhub:${var.region}::standards/nist-800-53/v/5.0.0`                              |
     * | PCI DSS                                  | `arn:${var.partition}:securityhub:${var.region}::standards/pci-dss/v/3.2.1`                                  |
     * 
     */
    public Output<String> standardsArn() {
        return this.standardsArn;
    }

    private StandardsSubscriptionArgs() {}

    private StandardsSubscriptionArgs(StandardsSubscriptionArgs $) {
        this.standardsArn = $.standardsArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardsSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardsSubscriptionArgs $;

        public Builder() {
            $ = new StandardsSubscriptionArgs();
        }

        public Builder(StandardsSubscriptionArgs defaults) {
            $ = new StandardsSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param standardsArn The ARN of a standard - see below.
         * 
         * Currently available standards (remember to replace `${var.partition}` and `${var.region}` as appropriate):
         * 
         * | Name                                     | ARN                                                                                                          |
         * |------------------------------------------|--------------------------------------------------------------------------------------------------------------|
         * | AWS Foundational Security Best Practices | `arn:${var.partition}:securityhub:${var.region}::standards/aws-foundational-security-best-practices/v/1.0.0` |
         * | AWS Resource Tagging Standard            | `arn:${var.partition}:securityhub:${var.region}::standards/aws-resource-tagging-standard/v/1.0.0`            |
         * | CIS AWS Foundations Benchmark v1.2.0     | `arn:${var.partition}:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0`                           |
         * | CIS AWS Foundations Benchmark v1.4.0     | `arn:${var.partition}:securityhub:${var.region}::standards/cis-aws-foundations-benchmark/v/1.4.0`            |
         * | NIST SP 800-53 Rev. 5                    | `arn:${var.partition}:securityhub:${var.region}::standards/nist-800-53/v/5.0.0`                              |
         * | PCI DSS                                  | `arn:${var.partition}:securityhub:${var.region}::standards/pci-dss/v/3.2.1`                                  |
         * 
         * @return builder
         * 
         */
        public Builder standardsArn(Output<String> standardsArn) {
            $.standardsArn = standardsArn;
            return this;
        }

        /**
         * @param standardsArn The ARN of a standard - see below.
         * 
         * Currently available standards (remember to replace `${var.partition}` and `${var.region}` as appropriate):
         * 
         * | Name                                     | ARN                                                                                                          |
         * |------------------------------------------|--------------------------------------------------------------------------------------------------------------|
         * | AWS Foundational Security Best Practices | `arn:${var.partition}:securityhub:${var.region}::standards/aws-foundational-security-best-practices/v/1.0.0` |
         * | AWS Resource Tagging Standard            | `arn:${var.partition}:securityhub:${var.region}::standards/aws-resource-tagging-standard/v/1.0.0`            |
         * | CIS AWS Foundations Benchmark v1.2.0     | `arn:${var.partition}:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0`                           |
         * | CIS AWS Foundations Benchmark v1.4.0     | `arn:${var.partition}:securityhub:${var.region}::standards/cis-aws-foundations-benchmark/v/1.4.0`            |
         * | NIST SP 800-53 Rev. 5                    | `arn:${var.partition}:securityhub:${var.region}::standards/nist-800-53/v/5.0.0`                              |
         * | PCI DSS                                  | `arn:${var.partition}:securityhub:${var.region}::standards/pci-dss/v/3.2.1`                                  |
         * 
         * @return builder
         * 
         */
        public Builder standardsArn(String standardsArn) {
            return standardsArn(Output.of(standardsArn));
        }

        public StandardsSubscriptionArgs build() {
            if ($.standardsArn == null) {
                throw new MissingRequiredPropertyException("StandardsSubscriptionArgs", "standardsArn");
            }
            return $;
        }
    }

}
