// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pinpoint;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.pinpoint.SmsChannelArgs;
import com.pulumi.aws.pinpoint.inputs.SmsChannelState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use the `aws.pinpoint.SmsChannel` resource to manage Pinpoint SMS Channels.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.pinpoint.App;
 * import com.pulumi.aws.pinpoint.SmsChannel;
 * import com.pulumi.aws.pinpoint.SmsChannelArgs;
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
 *         var app = new App(&#34;app&#34;);
 * 
 *         var sms = new SmsChannel(&#34;sms&#34;, SmsChannelArgs.builder()        
 *             .applicationId(app.applicationId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * In TODO v1.5.0 and later, use an `import` block to import the Pinpoint SMS Channel using the `application_id`. For exampleterraform import {
 * 
 *  to = aws_pinpoint_sms_channel.sms
 * 
 *  id = &#34;application-id&#34; } Using `TODO import`, import the Pinpoint SMS Channel using the `application_id`. For exampleconsole % TODO import aws_pinpoint_sms_channel.sms application-id
 * 
 */
@ResourceType(type="aws:pinpoint/smsChannel:SmsChannel")
public class SmsChannel extends com.pulumi.resources.CustomResource {
    /**
     * ID of the application.
     * 
     */
    @Export(name="applicationId", refs={String.class}, tree="[0]")
    private Output<String> applicationId;

    /**
     * @return ID of the application.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * Whether the channel is enabled or disabled. By default, it is set to `true`.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether the channel is enabled or disabled. By default, it is set to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Maximum number of promotional messages that can be sent per second.
     * 
     */
    @Export(name="promotionalMessagesPerSecond", refs={Integer.class}, tree="[0]")
    private Output<Integer> promotionalMessagesPerSecond;

    /**
     * @return Maximum number of promotional messages that can be sent per second.
     * 
     */
    public Output<Integer> promotionalMessagesPerSecond() {
        return this.promotionalMessagesPerSecond;
    }
    /**
     * Identifier of the sender for your messages.
     * 
     */
    @Export(name="senderId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> senderId;

    /**
     * @return Identifier of the sender for your messages.
     * 
     */
    public Output<Optional<String>> senderId() {
        return Codegen.optional(this.senderId);
    }
    /**
     * Short Code registered with the phone provider.
     * 
     */
    @Export(name="shortCode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> shortCode;

    /**
     * @return Short Code registered with the phone provider.
     * 
     */
    public Output<Optional<String>> shortCode() {
        return Codegen.optional(this.shortCode);
    }
    /**
     * Maximum number of transactional messages per second that can be sent.
     * 
     */
    @Export(name="transactionalMessagesPerSecond", refs={Integer.class}, tree="[0]")
    private Output<Integer> transactionalMessagesPerSecond;

    /**
     * @return Maximum number of transactional messages per second that can be sent.
     * 
     */
    public Output<Integer> transactionalMessagesPerSecond() {
        return this.transactionalMessagesPerSecond;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SmsChannel(String name) {
        this(name, SmsChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SmsChannel(String name, SmsChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SmsChannel(String name, SmsChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:pinpoint/smsChannel:SmsChannel", name, args == null ? SmsChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SmsChannel(String name, Output<String> id, @Nullable SmsChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:pinpoint/smsChannel:SmsChannel", name, state, makeResourceOptions(options, id));
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
    public static SmsChannel get(String name, Output<String> id, @Nullable SmsChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SmsChannel(name, id, state, options);
    }
}
