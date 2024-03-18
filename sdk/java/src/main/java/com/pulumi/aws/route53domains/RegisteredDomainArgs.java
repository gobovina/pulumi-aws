// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53domains;

import com.pulumi.aws.route53domains.inputs.RegisteredDomainAdminContactArgs;
import com.pulumi.aws.route53domains.inputs.RegisteredDomainBillingContactArgs;
import com.pulumi.aws.route53domains.inputs.RegisteredDomainNameServerArgs;
import com.pulumi.aws.route53domains.inputs.RegisteredDomainRegistrantContactArgs;
import com.pulumi.aws.route53domains.inputs.RegisteredDomainTechContactArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegisteredDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegisteredDomainArgs Empty = new RegisteredDomainArgs();

    /**
     * Details about the domain administrative contact. See Contact Blocks for more details.
     * 
     */
    @Import(name="adminContact")
    private @Nullable Output<RegisteredDomainAdminContactArgs> adminContact;

    /**
     * @return Details about the domain administrative contact. See Contact Blocks for more details.
     * 
     */
    public Optional<Output<RegisteredDomainAdminContactArgs>> adminContact() {
        return Optional.ofNullable(this.adminContact);
    }

    /**
     * Whether domain administrative contact information is concealed from WHOIS queries. Default: `true`.
     * 
     */
    @Import(name="adminPrivacy")
    private @Nullable Output<Boolean> adminPrivacy;

    /**
     * @return Whether domain administrative contact information is concealed from WHOIS queries. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> adminPrivacy() {
        return Optional.ofNullable(this.adminPrivacy);
    }

    /**
     * Whether the domain registration is set to renew automatically. Default: `true`.
     * 
     */
    @Import(name="autoRenew")
    private @Nullable Output<Boolean> autoRenew;

    /**
     * @return Whether the domain registration is set to renew automatically. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> autoRenew() {
        return Optional.ofNullable(this.autoRenew);
    }

    /**
     * Details about the domain billing contact. See Contact Blocks for more details.
     * 
     */
    @Import(name="billingContact")
    private @Nullable Output<RegisteredDomainBillingContactArgs> billingContact;

    /**
     * @return Details about the domain billing contact. See Contact Blocks for more details.
     * 
     */
    public Optional<Output<RegisteredDomainBillingContactArgs>> billingContact() {
        return Optional.ofNullable(this.billingContact);
    }

    /**
     * Whether domain billing contact information is concealed from WHOIS queries. Default: `true`.
     * 
     */
    @Import(name="billingPrivacy")
    private @Nullable Output<Boolean> billingPrivacy;

    /**
     * @return Whether domain billing contact information is concealed from WHOIS queries. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> billingPrivacy() {
        return Optional.ofNullable(this.billingPrivacy);
    }

    /**
     * The name of the registered domain.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return The name of the registered domain.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * The list of nameservers for the domain. See `name_server` Blocks for more details.
     * 
     */
    @Import(name="nameServers")
    private @Nullable Output<List<RegisteredDomainNameServerArgs>> nameServers;

    /**
     * @return The list of nameservers for the domain. See `name_server` Blocks for more details.
     * 
     */
    public Optional<Output<List<RegisteredDomainNameServerArgs>>> nameServers() {
        return Optional.ofNullable(this.nameServers);
    }

    /**
     * Details about the domain registrant. See Contact Blocks for more details.
     * 
     */
    @Import(name="registrantContact")
    private @Nullable Output<RegisteredDomainRegistrantContactArgs> registrantContact;

    /**
     * @return Details about the domain registrant. See Contact Blocks for more details.
     * 
     */
    public Optional<Output<RegisteredDomainRegistrantContactArgs>> registrantContact() {
        return Optional.ofNullable(this.registrantContact);
    }

    /**
     * Whether domain registrant contact information is concealed from WHOIS queries. Default: `true`.
     * 
     */
    @Import(name="registrantPrivacy")
    private @Nullable Output<Boolean> registrantPrivacy;

    /**
     * @return Whether domain registrant contact information is concealed from WHOIS queries. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> registrantPrivacy() {
        return Optional.ofNullable(this.registrantPrivacy);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Details about the domain technical contact. See Contact Blocks for more details.
     * 
     */
    @Import(name="techContact")
    private @Nullable Output<RegisteredDomainTechContactArgs> techContact;

    /**
     * @return Details about the domain technical contact. See Contact Blocks for more details.
     * 
     */
    public Optional<Output<RegisteredDomainTechContactArgs>> techContact() {
        return Optional.ofNullable(this.techContact);
    }

    /**
     * Whether domain technical contact information is concealed from WHOIS queries. Default: `true`.
     * 
     */
    @Import(name="techPrivacy")
    private @Nullable Output<Boolean> techPrivacy;

    /**
     * @return Whether domain technical contact information is concealed from WHOIS queries. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> techPrivacy() {
        return Optional.ofNullable(this.techPrivacy);
    }

    /**
     * Whether the domain is locked for transfer. Default: `true`.
     * 
     */
    @Import(name="transferLock")
    private @Nullable Output<Boolean> transferLock;

    /**
     * @return Whether the domain is locked for transfer. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> transferLock() {
        return Optional.ofNullable(this.transferLock);
    }

    private RegisteredDomainArgs() {}

    private RegisteredDomainArgs(RegisteredDomainArgs $) {
        this.adminContact = $.adminContact;
        this.adminPrivacy = $.adminPrivacy;
        this.autoRenew = $.autoRenew;
        this.billingContact = $.billingContact;
        this.billingPrivacy = $.billingPrivacy;
        this.domainName = $.domainName;
        this.nameServers = $.nameServers;
        this.registrantContact = $.registrantContact;
        this.registrantPrivacy = $.registrantPrivacy;
        this.tags = $.tags;
        this.techContact = $.techContact;
        this.techPrivacy = $.techPrivacy;
        this.transferLock = $.transferLock;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegisteredDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegisteredDomainArgs $;

        public Builder() {
            $ = new RegisteredDomainArgs();
        }

        public Builder(RegisteredDomainArgs defaults) {
            $ = new RegisteredDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminContact Details about the domain administrative contact. See Contact Blocks for more details.
         * 
         * @return builder
         * 
         */
        public Builder adminContact(@Nullable Output<RegisteredDomainAdminContactArgs> adminContact) {
            $.adminContact = adminContact;
            return this;
        }

        /**
         * @param adminContact Details about the domain administrative contact. See Contact Blocks for more details.
         * 
         * @return builder
         * 
         */
        public Builder adminContact(RegisteredDomainAdminContactArgs adminContact) {
            return adminContact(Output.of(adminContact));
        }

        /**
         * @param adminPrivacy Whether domain administrative contact information is concealed from WHOIS queries. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder adminPrivacy(@Nullable Output<Boolean> adminPrivacy) {
            $.adminPrivacy = adminPrivacy;
            return this;
        }

        /**
         * @param adminPrivacy Whether domain administrative contact information is concealed from WHOIS queries. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder adminPrivacy(Boolean adminPrivacy) {
            return adminPrivacy(Output.of(adminPrivacy));
        }

        /**
         * @param autoRenew Whether the domain registration is set to renew automatically. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(@Nullable Output<Boolean> autoRenew) {
            $.autoRenew = autoRenew;
            return this;
        }

        /**
         * @param autoRenew Whether the domain registration is set to renew automatically. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(Boolean autoRenew) {
            return autoRenew(Output.of(autoRenew));
        }

        /**
         * @param billingContact Details about the domain billing contact. See Contact Blocks for more details.
         * 
         * @return builder
         * 
         */
        public Builder billingContact(@Nullable Output<RegisteredDomainBillingContactArgs> billingContact) {
            $.billingContact = billingContact;
            return this;
        }

        /**
         * @param billingContact Details about the domain billing contact. See Contact Blocks for more details.
         * 
         * @return builder
         * 
         */
        public Builder billingContact(RegisteredDomainBillingContactArgs billingContact) {
            return billingContact(Output.of(billingContact));
        }

        /**
         * @param billingPrivacy Whether domain billing contact information is concealed from WHOIS queries. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder billingPrivacy(@Nullable Output<Boolean> billingPrivacy) {
            $.billingPrivacy = billingPrivacy;
            return this;
        }

        /**
         * @param billingPrivacy Whether domain billing contact information is concealed from WHOIS queries. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder billingPrivacy(Boolean billingPrivacy) {
            return billingPrivacy(Output.of(billingPrivacy));
        }

        /**
         * @param domainName The name of the registered domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The name of the registered domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param nameServers The list of nameservers for the domain. See `name_server` Blocks for more details.
         * 
         * @return builder
         * 
         */
        public Builder nameServers(@Nullable Output<List<RegisteredDomainNameServerArgs>> nameServers) {
            $.nameServers = nameServers;
            return this;
        }

        /**
         * @param nameServers The list of nameservers for the domain. See `name_server` Blocks for more details.
         * 
         * @return builder
         * 
         */
        public Builder nameServers(List<RegisteredDomainNameServerArgs> nameServers) {
            return nameServers(Output.of(nameServers));
        }

        /**
         * @param nameServers The list of nameservers for the domain. See `name_server` Blocks for more details.
         * 
         * @return builder
         * 
         */
        public Builder nameServers(RegisteredDomainNameServerArgs... nameServers) {
            return nameServers(List.of(nameServers));
        }

        /**
         * @param registrantContact Details about the domain registrant. See Contact Blocks for more details.
         * 
         * @return builder
         * 
         */
        public Builder registrantContact(@Nullable Output<RegisteredDomainRegistrantContactArgs> registrantContact) {
            $.registrantContact = registrantContact;
            return this;
        }

        /**
         * @param registrantContact Details about the domain registrant. See Contact Blocks for more details.
         * 
         * @return builder
         * 
         */
        public Builder registrantContact(RegisteredDomainRegistrantContactArgs registrantContact) {
            return registrantContact(Output.of(registrantContact));
        }

        /**
         * @param registrantPrivacy Whether domain registrant contact information is concealed from WHOIS queries. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder registrantPrivacy(@Nullable Output<Boolean> registrantPrivacy) {
            $.registrantPrivacy = registrantPrivacy;
            return this;
        }

        /**
         * @param registrantPrivacy Whether domain registrant contact information is concealed from WHOIS queries. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder registrantPrivacy(Boolean registrantPrivacy) {
            return registrantPrivacy(Output.of(registrantPrivacy));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param techContact Details about the domain technical contact. See Contact Blocks for more details.
         * 
         * @return builder
         * 
         */
        public Builder techContact(@Nullable Output<RegisteredDomainTechContactArgs> techContact) {
            $.techContact = techContact;
            return this;
        }

        /**
         * @param techContact Details about the domain technical contact. See Contact Blocks for more details.
         * 
         * @return builder
         * 
         */
        public Builder techContact(RegisteredDomainTechContactArgs techContact) {
            return techContact(Output.of(techContact));
        }

        /**
         * @param techPrivacy Whether domain technical contact information is concealed from WHOIS queries. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder techPrivacy(@Nullable Output<Boolean> techPrivacy) {
            $.techPrivacy = techPrivacy;
            return this;
        }

        /**
         * @param techPrivacy Whether domain technical contact information is concealed from WHOIS queries. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder techPrivacy(Boolean techPrivacy) {
            return techPrivacy(Output.of(techPrivacy));
        }

        /**
         * @param transferLock Whether the domain is locked for transfer. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder transferLock(@Nullable Output<Boolean> transferLock) {
            $.transferLock = transferLock;
            return this;
        }

        /**
         * @param transferLock Whether the domain is locked for transfer. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder transferLock(Boolean transferLock) {
            return transferLock(Output.of(transferLock));
        }

        public RegisteredDomainArgs build() {
            if ($.domainName == null) {
                throw new MissingRequiredPropertyException("RegisteredDomainArgs", "domainName");
            }
            return $;
        }
    }

}
