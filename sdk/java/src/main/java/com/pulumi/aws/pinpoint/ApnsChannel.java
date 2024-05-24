// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pinpoint;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.pinpoint.ApnsChannelArgs;
import com.pulumi.aws.pinpoint.inputs.ApnsChannelState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Pinpoint APNs Channel resource.
 * 
 * &gt; **Note:** All arguments, including certificates and tokens, will be stored in the raw state as plain-text.
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
 * import com.pulumi.aws.pinpoint.App;
 * import com.pulumi.aws.pinpoint.ApnsChannel;
 * import com.pulumi.aws.pinpoint.ApnsChannelArgs;
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
 *         var app = new App("app");
 * 
 *         var apns = new ApnsChannel("apns", ApnsChannelArgs.builder()
 *             .applicationId(app.applicationId())
 *             .certificate(StdFunctions.file(FileArgs.builder()
 *                 .input("./certificate.pem")
 *                 .build()).result())
 *             .privateKey(StdFunctions.file(FileArgs.builder()
 *                 .input("./private_key.key")
 *                 .build()).result())
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
 * Using `pulumi import`, import Pinpoint APNs Channel using the `application-id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:pinpoint/apnsChannel:ApnsChannel apns application-id
 * ```
 * 
 */
@ResourceType(type="aws:pinpoint/apnsChannel:ApnsChannel")
public class ApnsChannel extends com.pulumi.resources.CustomResource {
    /**
     * The application ID.
     * 
     */
    @Export(name="applicationId", refs={String.class}, tree="[0]")
    private Output<String> applicationId;

    /**
     * @return The application ID.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * The ID assigned to your iOS app. To find this value, choose Certificates, IDs &amp; Profiles, choose App IDs in the Identifiers section, and choose your app.
     * 
     */
    @Export(name="bundleId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> bundleId;

    /**
     * @return The ID assigned to your iOS app. To find this value, choose Certificates, IDs &amp; Profiles, choose App IDs in the Identifiers section, and choose your app.
     * 
     */
    public Output<Optional<String>> bundleId() {
        return Codegen.optional(this.bundleId);
    }
    /**
     * The pem encoded TLS Certificate from Apple.
     * 
     */
    @Export(name="certificate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificate;

    /**
     * @return The pem encoded TLS Certificate from Apple.
     * 
     */
    public Output<Optional<String>> certificate() {
        return Codegen.optional(this.certificate);
    }
    /**
     * The default authentication method used for APNs.
     * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
     * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
     * If your default authentication type fails, Amazon Pinpoint doesn&#39;t attempt to use the other authentication type.
     * 
     * One of the following sets of credentials is also required.
     * 
     * If you choose to use __Certificate credentials__ you will have to provide:
     * 
     */
    @Export(name="defaultAuthenticationMethod", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultAuthenticationMethod;

    /**
     * @return The default authentication method used for APNs.
     * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
     * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
     * If your default authentication type fails, Amazon Pinpoint doesn&#39;t attempt to use the other authentication type.
     * 
     * One of the following sets of credentials is also required.
     * 
     * If you choose to use __Certificate credentials__ you will have to provide:
     * 
     */
    public Output<Optional<String>> defaultAuthenticationMethod() {
        return Codegen.optional(this.defaultAuthenticationMethod);
    }
    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The Certificate Private Key file (ie. `.key` file).
     * 
     * If you choose to use __Key credentials__ you will have to provide:
     * 
     */
    @Export(name="privateKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privateKey;

    /**
     * @return The Certificate Private Key file (ie. `.key` file).
     * 
     * If you choose to use __Key credentials__ you will have to provide:
     * 
     */
    public Output<Optional<String>> privateKey() {
        return Codegen.optional(this.privateKey);
    }
    /**
     * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
     * 
     */
    @Export(name="teamId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> teamId;

    /**
     * @return The ID assigned to your Apple developer account team. This value is provided on the Membership page.
     * 
     */
    public Output<Optional<String>> teamId() {
        return Codegen.optional(this.teamId);
    }
    /**
     * The `.p8` file that you download from your Apple developer account when you create an authentication key.
     * 
     */
    @Export(name="tokenKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tokenKey;

    /**
     * @return The `.p8` file that you download from your Apple developer account when you create an authentication key.
     * 
     */
    public Output<Optional<String>> tokenKey() {
        return Codegen.optional(this.tokenKey);
    }
    /**
     * The ID assigned to your signing key. To find this value, choose Certificates, IDs &amp; Profiles, and choose your key in the Keys section.
     * 
     */
    @Export(name="tokenKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tokenKeyId;

    /**
     * @return The ID assigned to your signing key. To find this value, choose Certificates, IDs &amp; Profiles, and choose your key in the Keys section.
     * 
     */
    public Output<Optional<String>> tokenKeyId() {
        return Codegen.optional(this.tokenKeyId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApnsChannel(String name) {
        this(name, ApnsChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApnsChannel(String name, ApnsChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApnsChannel(String name, ApnsChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:pinpoint/apnsChannel:ApnsChannel", name, args == null ? ApnsChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApnsChannel(String name, Output<String> id, @Nullable ApnsChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:pinpoint/apnsChannel:ApnsChannel", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "bundleId",
                "certificate",
                "privateKey",
                "teamId",
                "tokenKey",
                "tokenKeyId"
            ))
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
    public static ApnsChannel get(String name, Output<String> id, @Nullable ApnsChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApnsChannel(name, id, state, options);
    }
}
