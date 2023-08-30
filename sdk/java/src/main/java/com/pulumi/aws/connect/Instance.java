// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.connect.InstanceArgs;
import com.pulumi.aws.connect.inputs.InstanceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Connect instance resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
 * 
 * !&gt; **WARN:** Amazon Connect enforces a limit of [100 combined instance creation and deletions every 30 days](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits).  For example, if you create 80 instances and delete 20 of them, you must wait 30 days to create or delete another instance.  Use care when creating or deleting instances.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.Instance;
 * import com.pulumi.aws.connect.InstanceArgs;
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
 *         var test = new Instance(&#34;test&#34;, InstanceArgs.builder()        
 *             .identityManagementType(&#34;CONNECT_MANAGED&#34;)
 *             .inboundCallsEnabled(true)
 *             .instanceAlias(&#34;friendly-name-connect&#34;)
 *             .outboundCallsEnabled(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With Existing Active Directory
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.Instance;
 * import com.pulumi.aws.connect.InstanceArgs;
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
 *         var test = new Instance(&#34;test&#34;, InstanceArgs.builder()        
 *             .directoryId(aws_directory_service_directory.test().id())
 *             .identityManagementType(&#34;EXISTING_DIRECTORY&#34;)
 *             .inboundCallsEnabled(true)
 *             .instanceAlias(&#34;friendly-name-connect&#34;)
 *             .outboundCallsEnabled(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With SAML
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.Instance;
 * import com.pulumi.aws.connect.InstanceArgs;
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
 *         var test = new Instance(&#34;test&#34;, InstanceArgs.builder()        
 *             .identityManagementType(&#34;SAML&#34;)
 *             .inboundCallsEnabled(true)
 *             .instanceAlias(&#34;friendly-name-connect&#34;)
 *             .outboundCallsEnabled(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Connect instances using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:connect/instance:Instance example f1288a1f-6193-445a-b47e-af739b2
 * ```
 * 
 */
@ResourceType(type="aws:connect/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the instance.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the instance.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies whether auto resolve best voices is enabled. Defaults to `true`.
     * 
     */
    @Export(name="autoResolveBestVoicesEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoResolveBestVoicesEnabled;

    /**
     * @return Specifies whether auto resolve best voices is enabled. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> autoResolveBestVoicesEnabled() {
        return Codegen.optional(this.autoResolveBestVoicesEnabled);
    }
    /**
     * Specifies whether contact flow logs are enabled. Defaults to `false`.
     * 
     */
    @Export(name="contactFlowLogsEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> contactFlowLogsEnabled;

    /**
     * @return Specifies whether contact flow logs are enabled. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> contactFlowLogsEnabled() {
        return Codegen.optional(this.contactFlowLogsEnabled);
    }
    /**
     * Specifies whether contact lens is enabled. Defaults to `true`.
     * 
     */
    @Export(name="contactLensEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> contactLensEnabled;

    /**
     * @return Specifies whether contact lens is enabled. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> contactLensEnabled() {
        return Codegen.optional(this.contactLensEnabled);
    }
    /**
     * When the instance was created.
     * 
     */
    @Export(name="createdTime", refs={String.class}, tree="[0]")
    private Output<String> createdTime;

    /**
     * @return When the instance was created.
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * The identifier for the directory if identity_management_type is `EXISTING_DIRECTORY`.
     * 
     */
    @Export(name="directoryId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> directoryId;

    /**
     * @return The identifier for the directory if identity_management_type is `EXISTING_DIRECTORY`.
     * 
     */
    public Output<Optional<String>> directoryId() {
        return Codegen.optional(this.directoryId);
    }
    /**
     * Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
     * 
     */
    @Export(name="earlyMediaEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> earlyMediaEnabled;

    /**
     * @return Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
     * 
     */
    public Output<Optional<Boolean>> earlyMediaEnabled() {
        return Codegen.optional(this.earlyMediaEnabled);
    }
    /**
     * Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
     * 
     */
    @Export(name="identityManagementType", refs={String.class}, tree="[0]")
    private Output<String> identityManagementType;

    /**
     * @return Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
     * 
     */
    public Output<String> identityManagementType() {
        return this.identityManagementType;
    }
    /**
     * Specifies whether inbound calls are enabled.
     * 
     */
    @Export(name="inboundCallsEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> inboundCallsEnabled;

    /**
     * @return Specifies whether inbound calls are enabled.
     * 
     */
    public Output<Boolean> inboundCallsEnabled() {
        return this.inboundCallsEnabled;
    }
    /**
     * Specifies the name of the instance. Required if `directory_id` not specified.
     * 
     */
    @Export(name="instanceAlias", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceAlias;

    /**
     * @return Specifies the name of the instance. Required if `directory_id` not specified.
     * 
     */
    public Output<Optional<String>> instanceAlias() {
        return Codegen.optional(this.instanceAlias);
    }
    /**
     * Specifies whether multi-party calls/conference is enabled. Defaults to `false`.
     * 
     */
    @Export(name="multiPartyConferenceEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> multiPartyConferenceEnabled;

    /**
     * @return Specifies whether multi-party calls/conference is enabled. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> multiPartyConferenceEnabled() {
        return Codegen.optional(this.multiPartyConferenceEnabled);
    }
    /**
     * Specifies whether outbound calls are enabled.
     * &lt;!-- * `use_custom_tts_voices` - (Optional) Whether use custom tts voices is enabled. Defaults to `false` --&gt;
     * 
     */
    @Export(name="outboundCallsEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> outboundCallsEnabled;

    /**
     * @return Specifies whether outbound calls are enabled.
     * &lt;!-- * `use_custom_tts_voices` - (Optional) Whether use custom tts voices is enabled. Defaults to `false` --&gt;
     * 
     */
    public Output<Boolean> outboundCallsEnabled() {
        return this.outboundCallsEnabled;
    }
    /**
     * The service role of the instance.
     * 
     */
    @Export(name="serviceRole", refs={String.class}, tree="[0]")
    private Output<String> serviceRole;

    /**
     * @return The service role of the instance.
     * 
     */
    public Output<String> serviceRole() {
        return this.serviceRole;
    }
    /**
     * The state of the instance.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The state of the instance.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
