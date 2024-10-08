// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.ec2.inputs.EipDomainNameTimeoutsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EipDomainNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final EipDomainNameArgs Empty = new EipDomainNameArgs();

    /**
     * The allocation ID.
     * 
     */
    @Import(name="allocationId", required=true)
    private Output<String> allocationId;

    /**
     * @return The allocation ID.
     * 
     */
    public Output<String> allocationId() {
        return this.allocationId;
    }

    /**
     * The domain name to modify for the IP address.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return The domain name to modify for the IP address.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    @Import(name="timeouts")
    private @Nullable Output<EipDomainNameTimeoutsArgs> timeouts;

    public Optional<Output<EipDomainNameTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    private EipDomainNameArgs() {}

    private EipDomainNameArgs(EipDomainNameArgs $) {
        this.allocationId = $.allocationId;
        this.domainName = $.domainName;
        this.timeouts = $.timeouts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EipDomainNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EipDomainNameArgs $;

        public Builder() {
            $ = new EipDomainNameArgs();
        }

        public Builder(EipDomainNameArgs defaults) {
            $ = new EipDomainNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocationId The allocation ID.
         * 
         * @return builder
         * 
         */
        public Builder allocationId(Output<String> allocationId) {
            $.allocationId = allocationId;
            return this;
        }

        /**
         * @param allocationId The allocation ID.
         * 
         * @return builder
         * 
         */
        public Builder allocationId(String allocationId) {
            return allocationId(Output.of(allocationId));
        }

        /**
         * @param domainName The domain name to modify for the IP address.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The domain name to modify for the IP address.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        public Builder timeouts(@Nullable Output<EipDomainNameTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(EipDomainNameTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        public EipDomainNameArgs build() {
            if ($.allocationId == null) {
                throw new MissingRequiredPropertyException("EipDomainNameArgs", "allocationId");
            }
            if ($.domainName == null) {
                throw new MissingRequiredPropertyException("EipDomainNameArgs", "domainName");
            }
            return $;
        }
    }

}
