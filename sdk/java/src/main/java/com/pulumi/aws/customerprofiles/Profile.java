// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.customerprofiles;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.customerprofiles.ProfileArgs;
import com.pulumi.aws.customerprofiles.inputs.ProfileState;
import com.pulumi.aws.customerprofiles.outputs.ProfileAddress;
import com.pulumi.aws.customerprofiles.outputs.ProfileBillingAddress;
import com.pulumi.aws.customerprofiles.outputs.ProfileMailingAddress;
import com.pulumi.aws.customerprofiles.outputs.ProfileShippingAddress;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an Amazon Customer Profiles Profile.
 * See the [Create Profile](https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_CreateProfile.html) for more information.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.customerprofiles.Domain;
 * import com.pulumi.aws.customerprofiles.DomainArgs;
 * import com.pulumi.aws.customerprofiles.Profile;
 * import com.pulumi.aws.customerprofiles.ProfileArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Domain("example", DomainArgs.builder()
 *             .domainName("example")
 *             .build());
 * 
 *         var exampleProfile = new Profile("exampleProfile", ProfileArgs.builder()
 *             .domainName(example.domainName())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Amazon Customer Profiles Profile using the resource `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:customerprofiles/profile:Profile example domain-name/5f2f473dfbe841eb8d05cfc2a4c926df
 * ```
 * 
 */
@ResourceType(type="aws:customerprofiles/profile:Profile")
public class Profile extends com.pulumi.resources.CustomResource {
    /**
     * A unique account number that you have given to the customer.
     * 
     */
    @Export(name="accountNumber", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountNumber;

    /**
     * @return A unique account number that you have given to the customer.
     * 
     */
    public Output<Optional<String>> accountNumber() {
        return Codegen.optional(this.accountNumber);
    }
    /**
     * Any additional information relevant to the customer’s profile.
     * 
     */
    @Export(name="additionalInformation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> additionalInformation;

    /**
     * @return Any additional information relevant to the customer’s profile.
     * 
     */
    public Output<Optional<String>> additionalInformation() {
        return Codegen.optional(this.additionalInformation);
    }
    /**
     * A block that specifies a generic address associated with the customer that is not mailing, shipping, or billing. Documented below.
     * 
     */
    @Export(name="address", refs={ProfileAddress.class}, tree="[0]")
    private Output</* @Nullable */ ProfileAddress> address;

    /**
     * @return A block that specifies a generic address associated with the customer that is not mailing, shipping, or billing. Documented below.
     * 
     */
    public Output<Optional<ProfileAddress>> address() {
        return Codegen.optional(this.address);
    }
    /**
     * A key value pair of attributes of a customer profile.
     * 
     */
    @Export(name="attributes", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> attributes;

    /**
     * @return A key value pair of attributes of a customer profile.
     * 
     */
    public Output<Optional<Map<String,String>>> attributes() {
        return Codegen.optional(this.attributes);
    }
    /**
     * A block that specifies the customer’s billing address. Documented below.
     * 
     */
    @Export(name="billingAddress", refs={ProfileBillingAddress.class}, tree="[0]")
    private Output</* @Nullable */ ProfileBillingAddress> billingAddress;

    /**
     * @return A block that specifies the customer’s billing address. Documented below.
     * 
     */
    public Output<Optional<ProfileBillingAddress>> billingAddress() {
        return Codegen.optional(this.billingAddress);
    }
    /**
     * The customer’s birth date.
     * 
     */
    @Export(name="birthDate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> birthDate;

    /**
     * @return The customer’s birth date.
     * 
     */
    public Output<Optional<String>> birthDate() {
        return Codegen.optional(this.birthDate);
    }
    /**
     * The customer’s business email address.
     * 
     */
    @Export(name="businessEmailAddress", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> businessEmailAddress;

    /**
     * @return The customer’s business email address.
     * 
     */
    public Output<Optional<String>> businessEmailAddress() {
        return Codegen.optional(this.businessEmailAddress);
    }
    /**
     * The name of the customer’s business.
     * 
     */
    @Export(name="businessName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> businessName;

    /**
     * @return The name of the customer’s business.
     * 
     */
    public Output<Optional<String>> businessName() {
        return Codegen.optional(this.businessName);
    }
    /**
     * The customer’s business phone number.
     * 
     */
    @Export(name="businessPhoneNumber", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> businessPhoneNumber;

    /**
     * @return The customer’s business phone number.
     * 
     */
    public Output<Optional<String>> businessPhoneNumber() {
        return Codegen.optional(this.businessPhoneNumber);
    }
    /**
     * The name of your Customer Profile domain. It must be unique for your AWS account.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output<String> domainName;

    /**
     * @return The name of your Customer Profile domain. It must be unique for your AWS account.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The customer’s email address, which has not been specified as a personal or business address.
     * 
     */
    @Export(name="emailAddress", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> emailAddress;

    /**
     * @return The customer’s email address, which has not been specified as a personal or business address.
     * 
     */
    public Output<Optional<String>> emailAddress() {
        return Codegen.optional(this.emailAddress);
    }
    /**
     * The customer’s first name.
     * 
     */
    @Export(name="firstName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> firstName;

    /**
     * @return The customer’s first name.
     * 
     */
    public Output<Optional<String>> firstName() {
        return Codegen.optional(this.firstName);
    }
    /**
     * The gender with which the customer identifies.
     * 
     */
    @Export(name="genderString", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> genderString;

    /**
     * @return The gender with which the customer identifies.
     * 
     */
    public Output<Optional<String>> genderString() {
        return Codegen.optional(this.genderString);
    }
    /**
     * The customer’s home phone number.
     * 
     */
    @Export(name="homePhoneNumber", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> homePhoneNumber;

    /**
     * @return The customer’s home phone number.
     * 
     */
    public Output<Optional<String>> homePhoneNumber() {
        return Codegen.optional(this.homePhoneNumber);
    }
    /**
     * The customer’s last name.
     * 
     */
    @Export(name="lastName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lastName;

    /**
     * @return The customer’s last name.
     * 
     */
    public Output<Optional<String>> lastName() {
        return Codegen.optional(this.lastName);
    }
    /**
     * A block that specifies the customer’s mailing address. Documented below.
     * 
     */
    @Export(name="mailingAddress", refs={ProfileMailingAddress.class}, tree="[0]")
    private Output</* @Nullable */ ProfileMailingAddress> mailingAddress;

    /**
     * @return A block that specifies the customer’s mailing address. Documented below.
     * 
     */
    public Output<Optional<ProfileMailingAddress>> mailingAddress() {
        return Codegen.optional(this.mailingAddress);
    }
    /**
     * The customer’s middle name.
     * 
     */
    @Export(name="middleName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> middleName;

    /**
     * @return The customer’s middle name.
     * 
     */
    public Output<Optional<String>> middleName() {
        return Codegen.optional(this.middleName);
    }
    /**
     * The customer’s mobile phone number.
     * 
     */
    @Export(name="mobilePhoneNumber", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mobilePhoneNumber;

    /**
     * @return The customer’s mobile phone number.
     * 
     */
    public Output<Optional<String>> mobilePhoneNumber() {
        return Codegen.optional(this.mobilePhoneNumber);
    }
    /**
     * The type of profile used to describe the customer.
     * 
     */
    @Export(name="partyTypeString", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> partyTypeString;

    /**
     * @return The type of profile used to describe the customer.
     * 
     */
    public Output<Optional<String>> partyTypeString() {
        return Codegen.optional(this.partyTypeString);
    }
    /**
     * The customer’s personal email address.
     * 
     */
    @Export(name="personalEmailAddress", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> personalEmailAddress;

    /**
     * @return The customer’s personal email address.
     * 
     */
    public Output<Optional<String>> personalEmailAddress() {
        return Codegen.optional(this.personalEmailAddress);
    }
    /**
     * The customer’s phone number, which has not been specified as a mobile, home, or business number.
     * 
     */
    @Export(name="phoneNumber", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> phoneNumber;

    /**
     * @return The customer’s phone number, which has not been specified as a mobile, home, or business number.
     * 
     */
    public Output<Optional<String>> phoneNumber() {
        return Codegen.optional(this.phoneNumber);
    }
    /**
     * A block that specifies the customer’s shipping address. Documented below.
     * 
     */
    @Export(name="shippingAddress", refs={ProfileShippingAddress.class}, tree="[0]")
    private Output</* @Nullable */ ProfileShippingAddress> shippingAddress;

    /**
     * @return A block that specifies the customer’s shipping address. Documented below.
     * 
     */
    public Output<Optional<ProfileShippingAddress>> shippingAddress() {
        return Codegen.optional(this.shippingAddress);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Profile(String name) {
        this(name, ProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Profile(String name, ProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Profile(String name, ProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:customerprofiles/profile:Profile", name, args == null ? ProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Profile(String name, Output<String> id, @Nullable ProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:customerprofiles/profile:Profile", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Profile get(String name, Output<String> id, @Nullable ProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Profile(name, id, state, options);
    }
}
