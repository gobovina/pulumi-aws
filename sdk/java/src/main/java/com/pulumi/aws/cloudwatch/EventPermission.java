// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudwatch.EventPermissionArgs;
import com.pulumi.aws.cloudwatch.inputs.EventPermissionState;
import com.pulumi.aws.cloudwatch.outputs.EventPermissionCondition;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to create an EventBridge permission to support cross-account events in the current account default event bus.
 * 
 * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 * 
 * &gt; **Note:** The EventBridge bus policy resource  (`aws.cloudwatch.EventBusPolicy`) is incompatible with the EventBridge permission resource (`aws.cloudwatch.EventPermission`) and will overwrite permissions.
 * 
 * ## Example Usage
 * ### Account Access
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudwatch.EventPermission;
 * import com.pulumi.aws.cloudwatch.EventPermissionArgs;
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
 *         var devAccountAccess = new EventPermission(&#34;devAccountAccess&#34;, EventPermissionArgs.builder()        
 *             .principal(&#34;123456789012&#34;)
 *             .statementId(&#34;DevAccountAccess&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Organization Access
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudwatch.EventPermission;
 * import com.pulumi.aws.cloudwatch.EventPermissionArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventPermissionConditionArgs;
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
 *         var organizationAccess = new EventPermission(&#34;organizationAccess&#34;, EventPermissionArgs.builder()        
 *             .principal(&#34;*&#34;)
 *             .statementId(&#34;OrganizationAccess&#34;)
 *             .condition(EventPermissionConditionArgs.builder()
 *                 .key(&#34;aws:PrincipalOrgID&#34;)
 *                 .type(&#34;StringEquals&#34;)
 *                 .value(example.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import EventBridge permissions using the `event_bus_name/statement_id` (if you omit `event_bus_name`, the `default` event bus will be used). For example:
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/eventPermission:EventPermission DevAccountAccess example-event-bus/DevAccountAccess
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/eventPermission:EventPermission")
public class EventPermission extends com.pulumi.resources.CustomResource {
    /**
     * The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> action;

    /**
     * @return The action that you are enabling the other account to perform. Defaults to `events:PutEvents`.
     * 
     */
    public Output<Optional<String>> action() {
        return Codegen.optional(this.action);
    }
    /**
     * Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
     * 
     */
    @Export(name="condition", refs={EventPermissionCondition.class}, tree="[0]")
    private Output</* @Nullable */ EventPermissionCondition> condition;

    /**
     * @return Configuration block to limit the event bus permissions you are granting to only accounts that fulfill the condition. Specified below.
     * 
     */
    public Output<Optional<EventPermissionCondition>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * The name of the event bus to set the permissions on.
     * If you omit this, the permissions are set on the `default` event bus.
     * 
     */
    @Export(name="eventBusName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> eventBusName;

    /**
     * @return The name of the event bus to set the permissions on.
     * If you omit this, the permissions are set on the `default` event bus.
     * 
     */
    public Output<Optional<String>> eventBusName() {
        return Codegen.optional(this.eventBusName);
    }
    /**
     * The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
     * 
     */
    @Export(name="principal", refs={String.class}, tree="[0]")
    private Output<String> principal;

    /**
     * @return The 12-digit AWS account ID that you are permitting to put events to your default event bus. Specify `*` to permit any account to put events to your default event bus, optionally limited by `condition`.
     * 
     */
    public Output<String> principal() {
        return this.principal;
    }
    /**
     * An identifier string for the external account that you are granting permissions to.
     * 
     */
    @Export(name="statementId", refs={String.class}, tree="[0]")
    private Output<String> statementId;

    /**
     * @return An identifier string for the external account that you are granting permissions to.
     * 
     */
    public Output<String> statementId() {
        return this.statementId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventPermission(String name) {
        this(name, EventPermissionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventPermission(String name, EventPermissionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventPermission(String name, EventPermissionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventPermission:EventPermission", name, args == null ? EventPermissionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventPermission(String name, Output<String> id, @Nullable EventPermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventPermission:EventPermission", name, state, makeResourceOptions(options, id));
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
    public static EventPermission get(String name, Output<String> id, @Nullable EventPermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventPermission(name, id, state, options);
    }
}
