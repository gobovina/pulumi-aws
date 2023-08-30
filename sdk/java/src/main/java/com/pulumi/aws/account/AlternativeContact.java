// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.account;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.account.AlternativeContactArgs;
import com.pulumi.aws.account.inputs.AlternativeContactState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages the specified alternate contact attached to an AWS Account.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.account.AlternativeContact;
 * import com.pulumi.aws.account.AlternativeContactArgs;
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
 *         var operations = new AlternativeContact(&#34;operations&#34;, AlternativeContactArgs.builder()        
 *             .alternateContactType(&#34;OPERATIONS&#34;)
 *             .emailAddress(&#34;test@example.com&#34;)
 *             .phoneNumber(&#34;+1234567890&#34;)
 *             .title(&#34;Example&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import the Alternate Contact for the current account:
 * 
 * Import the Alternate Contact for another account using the `account_id` and `alternate_contact_type` separated by a forward slash (`/`):
 * 
 * __Using `pulumi import` to import__ the Alternate Contact for the current or another account using the `alternate_contact_type`. For example:
 * 
 * Import the Alternate Contact for the current account:
 * 
 * ```sh
 *  $ pulumi import aws:account/alternativeContact:AlternativeContact operations OPERATIONS
 * ```
 *  Import the Alternate Contact for another account using the `account_id` and `alternate_contact_type` separated by a forward slash (`/`):
 * 
 * ```sh
 *  $ pulumi import aws:account/alternativeContact:AlternativeContact operations 1234567890/OPERATIONS
 * ```
 * 
 */
@ResourceType(type="aws:account/alternativeContact:AlternativeContact")
public class AlternativeContact extends com.pulumi.resources.CustomResource {
    /**
     * ID of the target account when managing member accounts. Will manage current user&#39;s account by default if omitted.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountId;

    /**
     * @return ID of the target account when managing member accounts. Will manage current user&#39;s account by default if omitted.
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * Type of the alternate contact. Allowed values are: `BILLING`, `OPERATIONS`, `SECURITY`.
     * 
     */
    @Export(name="alternateContactType", refs={String.class}, tree="[0]")
    private Output<String> alternateContactType;

    /**
     * @return Type of the alternate contact. Allowed values are: `BILLING`, `OPERATIONS`, `SECURITY`.
     * 
     */
    public Output<String> alternateContactType() {
        return this.alternateContactType;
    }
    /**
     * An email address for the alternate contact.
     * 
     */
    @Export(name="emailAddress", refs={String.class}, tree="[0]")
    private Output<String> emailAddress;

    /**
     * @return An email address for the alternate contact.
     * 
     */
    public Output<String> emailAddress() {
        return this.emailAddress;
    }
    /**
     * Name of the alternate contact.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the alternate contact.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Phone number for the alternate contact.
     * 
     */
    @Export(name="phoneNumber", refs={String.class}, tree="[0]")
    private Output<String> phoneNumber;

    /**
     * @return Phone number for the alternate contact.
     * 
     */
    public Output<String> phoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Title for the alternate contact.
     * 
     */
    @Export(name="title", refs={String.class}, tree="[0]")
    private Output<String> title;

    /**
     * @return Title for the alternate contact.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AlternativeContact(String name) {
        this(name, AlternativeContactArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AlternativeContact(String name, AlternativeContactArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AlternativeContact(String name, AlternativeContactArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:account/alternativeContact:AlternativeContact", name, args == null ? AlternativeContactArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AlternativeContact(String name, Output<String> id, @Nullable AlternativeContactState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:account/alternativeContact:AlternativeContact", name, state, makeResourceOptions(options, id));
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
    public static AlternativeContact get(String name, Output<String> id, @Nullable AlternativeContactState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AlternativeContact(name, id, state, options);
    }
}
