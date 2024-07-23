// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersNetworkDestinationIpv6Args extends com.pulumi.resources.ResourceArgs {

    public static final InsightFiltersNetworkDestinationIpv6Args Empty = new InsightFiltersNetworkDestinationIpv6Args();

    /**
     * A finding&#39;s CIDR value.
     * 
     */
    @Import(name="cidr", required=true)
    private Output<String> cidr;

    /**
     * @return A finding&#39;s CIDR value.
     * 
     */
    public Output<String> cidr() {
        return this.cidr;
    }

    private InsightFiltersNetworkDestinationIpv6Args() {}

    private InsightFiltersNetworkDestinationIpv6Args(InsightFiltersNetworkDestinationIpv6Args $) {
        this.cidr = $.cidr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InsightFiltersNetworkDestinationIpv6Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InsightFiltersNetworkDestinationIpv6Args $;

        public Builder() {
            $ = new InsightFiltersNetworkDestinationIpv6Args();
        }

        public Builder(InsightFiltersNetworkDestinationIpv6Args defaults) {
            $ = new InsightFiltersNetworkDestinationIpv6Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr A finding&#39;s CIDR value.
         * 
         * @return builder
         * 
         */
        public Builder cidr(Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr A finding&#39;s CIDR value.
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        public InsightFiltersNetworkDestinationIpv6Args build() {
            if ($.cidr == null) {
                throw new MissingRequiredPropertyException("InsightFiltersNetworkDestinationIpv6Args", "cidr");
            }
            return $;
        }
    }

}
