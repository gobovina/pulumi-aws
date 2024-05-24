// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sns;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sns.PlatformApplicationArgs;
import com.pulumi.aws.sns.inputs.PlatformApplicationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an SNS platform application resource
 * 
 * ## Example Usage
 * 
 * ### Apple Push Notification Service (APNS) using certificate-based authentication
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sns.PlatformApplication;
 * import com.pulumi.aws.sns.PlatformApplicationArgs;
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
 *         var apnsApplication = new PlatformApplication("apnsApplication", PlatformApplicationArgs.builder()
 *             .name("apns_application")
 *             .platform("APNS")
 *             .platformCredential("<APNS PRIVATE KEY>")
 *             .platformPrincipal("<APNS CERTIFICATE>")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Apple Push Notification Service (APNS) using token-based authentication
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sns.PlatformApplication;
 * import com.pulumi.aws.sns.PlatformApplicationArgs;
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
 *         var apnsApplication = new PlatformApplication("apnsApplication", PlatformApplicationArgs.builder()
 *             .name("apns_application")
 *             .platform("APNS")
 *             .platformCredential("<APNS SIGNING KEY>")
 *             .platformPrincipal("<APNS SIGNING KEY ID>")
 *             .applePlatformTeamId("<APPLE TEAM ID>")
 *             .applePlatformBundleId("<APPLE BUNDLE ID>")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Google Cloud Messaging (GCM)
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sns.PlatformApplication;
 * import com.pulumi.aws.sns.PlatformApplicationArgs;
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
 *         var gcmApplication = new PlatformApplication("gcmApplication", PlatformApplicationArgs.builder()
 *             .name("gcm_application")
 *             .platform("GCM")
 *             .platformCredential("<GCM API KEY>")
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
 * Using `pulumi import`, import SNS platform applications using the ARN. For example:
 * 
 * ```sh
 * $ pulumi import aws:sns/platformApplication:PlatformApplication gcm_application arn:aws:sns:us-west-2:0123456789012:app/GCM/gcm_application
 * ```
 * 
 */
@ResourceType(type="aws:sns/platformApplication:PlatformApplication")
public class PlatformApplication extends com.pulumi.resources.CustomResource {
    /**
     * The bundle identifier that&#39;s assigned to your iOS app. May only include alphanumeric characters, hyphens (-), and periods (.).
     * 
     */
    @Export(name="applePlatformBundleId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> applePlatformBundleId;

    /**
     * @return The bundle identifier that&#39;s assigned to your iOS app. May only include alphanumeric characters, hyphens (-), and periods (.).
     * 
     */
    public Output<Optional<String>> applePlatformBundleId() {
        return Codegen.optional(this.applePlatformBundleId);
    }
    /**
     * The identifier that&#39;s assigned to your Apple developer account team. Must be 10 alphanumeric characters.
     * 
     */
    @Export(name="applePlatformTeamId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> applePlatformTeamId;

    /**
     * @return The identifier that&#39;s assigned to your Apple developer account team. Must be 10 alphanumeric characters.
     * 
     */
    public Output<Optional<String>> applePlatformTeamId() {
        return Codegen.optional(this.applePlatformTeamId);
    }
    /**
     * The ARN of the SNS platform application
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the SNS platform application
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ARN of the SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
     * 
     */
    @Export(name="eventDeliveryFailureTopicArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> eventDeliveryFailureTopicArn;

    /**
     * @return The ARN of the SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
     * 
     */
    public Output<Optional<String>> eventDeliveryFailureTopicArn() {
        return Codegen.optional(this.eventDeliveryFailureTopicArn);
    }
    /**
     * The ARN of the SNS Topic triggered when a new platform endpoint is added to your platform application.
     * 
     */
    @Export(name="eventEndpointCreatedTopicArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> eventEndpointCreatedTopicArn;

    /**
     * @return The ARN of the SNS Topic triggered when a new platform endpoint is added to your platform application.
     * 
     */
    public Output<Optional<String>> eventEndpointCreatedTopicArn() {
        return Codegen.optional(this.eventEndpointCreatedTopicArn);
    }
    /**
     * The ARN of the SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
     * 
     */
    @Export(name="eventEndpointDeletedTopicArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> eventEndpointDeletedTopicArn;

    /**
     * @return The ARN of the SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
     * 
     */
    public Output<Optional<String>> eventEndpointDeletedTopicArn() {
        return Codegen.optional(this.eventEndpointDeletedTopicArn);
    }
    /**
     * The ARN of the SNS Topic triggered when an existing platform endpoint is changed from your platform application.
     * 
     */
    @Export(name="eventEndpointUpdatedTopicArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> eventEndpointUpdatedTopicArn;

    /**
     * @return The ARN of the SNS Topic triggered when an existing platform endpoint is changed from your platform application.
     * 
     */
    public Output<Optional<String>> eventEndpointUpdatedTopicArn() {
        return Codegen.optional(this.eventEndpointUpdatedTopicArn);
    }
    /**
     * The IAM role ARN permitted to receive failure feedback for this application and give SNS write access to use CloudWatch logs on your behalf.
     * 
     */
    @Export(name="failureFeedbackRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> failureFeedbackRoleArn;

    /**
     * @return The IAM role ARN permitted to receive failure feedback for this application and give SNS write access to use CloudWatch logs on your behalf.
     * 
     */
    public Output<Optional<String>> failureFeedbackRoleArn() {
        return Codegen.optional(this.failureFeedbackRoleArn);
    }
    /**
     * The friendly name for the SNS platform application
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The friendly name for the SNS platform application
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The platform that the app is registered with. See [Platform](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for supported platforms.
     * 
     */
    @Export(name="platform", refs={String.class}, tree="[0]")
    private Output<String> platform;

    /**
     * @return The platform that the app is registered with. See [Platform](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for supported platforms.
     * 
     */
    public Output<String> platform() {
        return this.platform;
    }
    /**
     * Application Platform credential. See [Credential](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
     * 
     */
    @Export(name="platformCredential", refs={String.class}, tree="[0]")
    private Output<String> platformCredential;

    /**
     * @return Application Platform credential. See [Credential](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
     * 
     */
    public Output<String> platformCredential() {
        return this.platformCredential;
    }
    /**
     * Application Platform principal. See [Principal](http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformApplication.html) for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
     * 
     */
    @Export(name="platformPrincipal", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> platformPrincipal;

    /**
     * @return Application Platform principal. See [Principal](http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformApplication.html) for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
     * 
     */
    public Output<Optional<String>> platformPrincipal() {
        return Codegen.optional(this.platformPrincipal);
    }
    /**
     * The IAM role ARN permitted to receive success feedback for this application and give SNS write access to use CloudWatch logs on your behalf.
     * 
     */
    @Export(name="successFeedbackRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> successFeedbackRoleArn;

    /**
     * @return The IAM role ARN permitted to receive success feedback for this application and give SNS write access to use CloudWatch logs on your behalf.
     * 
     */
    public Output<Optional<String>> successFeedbackRoleArn() {
        return Codegen.optional(this.successFeedbackRoleArn);
    }
    /**
     * The sample rate percentage (0-100) of successfully delivered messages.
     * 
     * The following attributes are needed only when using APNS token credentials:
     * 
     */
    @Export(name="successFeedbackSampleRate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> successFeedbackSampleRate;

    /**
     * @return The sample rate percentage (0-100) of successfully delivered messages.
     * 
     * The following attributes are needed only when using APNS token credentials:
     * 
     */
    public Output<Optional<String>> successFeedbackSampleRate() {
        return Codegen.optional(this.successFeedbackSampleRate);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PlatformApplication(String name) {
        this(name, PlatformApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PlatformApplication(String name, PlatformApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PlatformApplication(String name, PlatformApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sns/platformApplication:PlatformApplication", name, args == null ? PlatformApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PlatformApplication(String name, Output<String> id, @Nullable PlatformApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sns/platformApplication:PlatformApplication", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "platformCredential",
                "platformPrincipal"
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
    public static PlatformApplication get(String name, Output<String> id, @Nullable PlatformApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PlatformApplication(name, id, state, options);
    }
}
