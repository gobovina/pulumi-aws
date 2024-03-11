// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.identitystore;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.identitystore.UserArgs;
import com.pulumi.aws.identitystore.inputs.UserState;
import com.pulumi.aws.identitystore.outputs.UserAddresses;
import com.pulumi.aws.identitystore.outputs.UserEmails;
import com.pulumi.aws.identitystore.outputs.UserExternalId;
import com.pulumi.aws.identitystore.outputs.UserName;
import com.pulumi.aws.identitystore.outputs.UserPhoneNumbers;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages a User resource within an Identity Store.
 * 
 * &gt; **Note:** If you use an external identity provider or Active Directory as your identity source,
 * use this resource with caution. IAM Identity Center does not support outbound synchronization,
 * so your identity source does not automatically update with the changes that you make to
 * users using this resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Using `pulumi import`, import an Identity Store User using the combination `identity_store_id/user_id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:identitystore/user:User example d-9c6705e95c/065212b4-9061-703b-5876-13a517ae2a7c
 * ```
 * 
 */
@ResourceType(type="aws:identitystore/user:User")
public class User extends com.pulumi.resources.CustomResource {
    /**
     * Details about the user&#39;s address. At most 1 address is allowed. Detailed below.
     * 
     */
    @Export(name="addresses", refs={UserAddresses.class}, tree="[0]")
    private Output</* @Nullable */ UserAddresses> addresses;

    /**
     * @return Details about the user&#39;s address. At most 1 address is allowed. Detailed below.
     * 
     */
    public Output<Optional<UserAddresses>> addresses() {
        return Codegen.optional(this.addresses);
    }
    /**
     * The name that is typically displayed when the user is referenced.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name that is typically displayed when the user is referenced.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Details about the user&#39;s email. At most 1 email is allowed. Detailed below.
     * 
     */
    @Export(name="emails", refs={UserEmails.class}, tree="[0]")
    private Output</* @Nullable */ UserEmails> emails;

    /**
     * @return Details about the user&#39;s email. At most 1 email is allowed. Detailed below.
     * 
     */
    public Output<Optional<UserEmails>> emails() {
        return Codegen.optional(this.emails);
    }
    /**
     * A list of identifiers issued to this resource by an external identity provider.
     * 
     */
    @Export(name="externalIds", refs={List.class,UserExternalId.class}, tree="[0,1]")
    private Output<List<UserExternalId>> externalIds;

    /**
     * @return A list of identifiers issued to this resource by an external identity provider.
     * 
     */
    public Output<List<UserExternalId>> externalIds() {
        return this.externalIds;
    }
    /**
     * The globally unique identifier for the identity store that this user is in.
     * 
     */
    @Export(name="identityStoreId", refs={String.class}, tree="[0]")
    private Output<String> identityStoreId;

    /**
     * @return The globally unique identifier for the identity store that this user is in.
     * 
     */
    public Output<String> identityStoreId() {
        return this.identityStoreId;
    }
    /**
     * The user&#39;s geographical region or location.
     * 
     */
    @Export(name="locale", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> locale;

    /**
     * @return The user&#39;s geographical region or location.
     * 
     */
    public Output<Optional<String>> locale() {
        return Codegen.optional(this.locale);
    }
    /**
     * Details about the user&#39;s full name. Detailed below.
     * 
     */
    @Export(name="name", refs={UserName.class}, tree="[0]")
    private Output<UserName> name;

    /**
     * @return Details about the user&#39;s full name. Detailed below.
     * 
     */
    public Output<UserName> name() {
        return this.name;
    }
    /**
     * An alternate name for the user.
     * 
     */
    @Export(name="nickname", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> nickname;

    /**
     * @return An alternate name for the user.
     * 
     */
    public Output<Optional<String>> nickname() {
        return Codegen.optional(this.nickname);
    }
    /**
     * Details about the user&#39;s phone number. At most 1 phone number is allowed. Detailed below.
     * 
     */
    @Export(name="phoneNumbers", refs={UserPhoneNumbers.class}, tree="[0]")
    private Output</* @Nullable */ UserPhoneNumbers> phoneNumbers;

    /**
     * @return Details about the user&#39;s phone number. At most 1 phone number is allowed. Detailed below.
     * 
     */
    public Output<Optional<UserPhoneNumbers>> phoneNumbers() {
        return Codegen.optional(this.phoneNumbers);
    }
    /**
     * The preferred language of the user.
     * 
     */
    @Export(name="preferredLanguage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> preferredLanguage;

    /**
     * @return The preferred language of the user.
     * 
     */
    public Output<Optional<String>> preferredLanguage() {
        return Codegen.optional(this.preferredLanguage);
    }
    /**
     * An URL that may be associated with the user.
     * 
     */
    @Export(name="profileUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> profileUrl;

    /**
     * @return An URL that may be associated with the user.
     * 
     */
    public Output<Optional<String>> profileUrl() {
        return Codegen.optional(this.profileUrl);
    }
    /**
     * The user&#39;s time zone.
     * 
     */
    @Export(name="timezone", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> timezone;

    /**
     * @return The user&#39;s time zone.
     * 
     */
    public Output<Optional<String>> timezone() {
        return Codegen.optional(this.timezone);
    }
    /**
     * The user&#39;s title.
     * 
     */
    @Export(name="title", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> title;

    /**
     * @return The user&#39;s title.
     * 
     */
    public Output<Optional<String>> title() {
        return Codegen.optional(this.title);
    }
    /**
     * The identifier for this user in the identity store.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return The identifier for this user in the identity store.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }
    /**
     * A unique string used to identify the user. This value can consist of letters, accented characters, symbols, numbers, and punctuation. This value is specified at the time the user is created and stored as an attribute of the user object in the identity store. The limit is 128 characters.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="userName", refs={String.class}, tree="[0]")
    private Output<String> userName;

    /**
     * @return A unique string used to identify the user. This value can consist of letters, accented characters, symbols, numbers, and punctuation. This value is specified at the time the user is created and stored as an attribute of the user object in the identity store. The limit is 128 characters.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }
    /**
     * The user type.
     * 
     */
    @Export(name="userType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userType;

    /**
     * @return The user type.
     * 
     */
    public Output<Optional<String>> userType() {
        return Codegen.optional(this.userType);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(String name, UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:identitystore/user:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private User(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:identitystore/user:User", name, state, makeResourceOptions(options, id));
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
    public static User get(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}
