// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssmcontacts;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssmcontacts.ContactChannelArgs;
import com.pulumi.aws.ssmcontacts.inputs.ContactChannelState;
import com.pulumi.aws.ssmcontacts.outputs.ContactChannelDeliveryAddress;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS SSM Contacts Contact Channel.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ssmcontacts.ContactChannel;
 * import com.pulumi.aws.ssmcontacts.ContactChannelArgs;
 * import com.pulumi.aws.ssmcontacts.inputs.ContactChannelDeliveryAddressArgs;
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
 *         var example = new ContactChannel(&#34;example&#34;, ContactChannelArgs.builder()        
 *             .contactId(&#34;arn:aws:ssm-contacts:us-west-2:123456789012:contact/contactalias&#34;)
 *             .deliveryAddress(ContactChannelDeliveryAddressArgs.builder()
 *                 .simpleAddress(&#34;email@example.com&#34;)
 *                 .build())
 *             .name(&#34;Example contact channel&#34;)
 *             .type(&#34;EMAIL&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Usage with SSM Contact
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ssmcontacts.Contact;
 * import com.pulumi.aws.ssmcontacts.ContactArgs;
 * import com.pulumi.aws.ssmcontacts.ContactChannel;
 * import com.pulumi.aws.ssmcontacts.ContactChannelArgs;
 * import com.pulumi.aws.ssmcontacts.inputs.ContactChannelDeliveryAddressArgs;
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
 *         var exampleContact = new Contact(&#34;exampleContact&#34;, ContactArgs.builder()        
 *             .alias(&#34;example_contact&#34;)
 *             .type(&#34;PERSONAL&#34;)
 *             .build());
 * 
 *         var example = new ContactChannel(&#34;example&#34;, ContactChannelArgs.builder()        
 *             .contactId(exampleContact.arn())
 *             .deliveryAddress(ContactChannelDeliveryAddressArgs.builder()
 *                 .simpleAddress(&#34;email@example.com&#34;)
 *                 .build())
 *             .name(&#34;Example contact channel&#34;)
 *             .type(&#34;EMAIL&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SSM Contact Channel using the `ARN`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ssmcontacts/contactChannel:ContactChannel example arn:aws:ssm-contacts:us-west-2:123456789012:contact-channel/example
 * ```
 * 
 */
@ResourceType(type="aws:ssmcontacts/contactChannel:ContactChannel")
public class ContactChannel extends com.pulumi.resources.CustomResource {
    /**
     * Whether the contact channel is activated. The contact channel must be activated to use it to engage the contact. One of `ACTIVATED` or `NOT_ACTIVATED`.
     * 
     */
    @Export(name="activationStatus", refs={String.class}, tree="[0]")
    private Output<String> activationStatus;

    /**
     * @return Whether the contact channel is activated. The contact channel must be activated to use it to engage the contact. One of `ACTIVATED` or `NOT_ACTIVATED`.
     * 
     */
    public Output<String> activationStatus() {
        return this.activationStatus;
    }
    /**
     * Amazon Resource Name (ARN) of the contact channel.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the contact channel.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Amazon Resource Name (ARN) of the AWS SSM Contact that the contact channel belongs to.
     * 
     */
    @Export(name="contactId", refs={String.class}, tree="[0]")
    private Output<String> contactId;

    /**
     * @return Amazon Resource Name (ARN) of the AWS SSM Contact that the contact channel belongs to.
     * 
     */
    public Output<String> contactId() {
        return this.contactId;
    }
    /**
     * Block that contains contact engagement details. See details below.
     * 
     */
    @Export(name="deliveryAddress", refs={ContactChannelDeliveryAddress.class}, tree="[0]")
    private Output<ContactChannelDeliveryAddress> deliveryAddress;

    /**
     * @return Block that contains contact engagement details. See details below.
     * 
     */
    public Output<ContactChannelDeliveryAddress> deliveryAddress() {
        return this.deliveryAddress;
    }
    /**
     * Name of the contact channel. Must be between 1 and 255 characters, and may contain alphanumerics, underscores (`_`), hyphens (`-`), periods (`.`), and spaces.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the contact channel. Must be between 1 and 255 characters, and may contain alphanumerics, underscores (`_`), hyphens (`-`), periods (`.`), and spaces.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Type of the contact channel. One of `SMS`, `VOICE` or `EMAIL`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of the contact channel. One of `SMS`, `VOICE` or `EMAIL`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContactChannel(String name) {
        this(name, ContactChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContactChannel(String name, ContactChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContactChannel(String name, ContactChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssmcontacts/contactChannel:ContactChannel", name, args == null ? ContactChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContactChannel(String name, Output<String> id, @Nullable ContactChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssmcontacts/contactChannel:ContactChannel", name, state, makeResourceOptions(options, id));
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
    public static ContactChannel get(String name, Output<String> id, @Nullable ContactChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContactChannel(name, id, state, options);
    }
}
