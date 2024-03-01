// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssm.MaintenanceWindowTargetArgs;
import com.pulumi.aws.ssm.inputs.MaintenanceWindowTargetState;
import com.pulumi.aws.ssm.outputs.MaintenanceWindowTargetTarget;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an SSM Maintenance Window Target resource
 * 
 * ## Example Usage
 * ### Instance Target
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ssm.MaintenanceWindow;
 * import com.pulumi.aws.ssm.MaintenanceWindowArgs;
 * import com.pulumi.aws.ssm.MaintenanceWindowTarget;
 * import com.pulumi.aws.ssm.MaintenanceWindowTargetArgs;
 * import com.pulumi.aws.ssm.inputs.MaintenanceWindowTargetTargetArgs;
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
 *         var window = new MaintenanceWindow(&#34;window&#34;, MaintenanceWindowArgs.builder()        
 *             .name(&#34;maintenance-window-webapp&#34;)
 *             .schedule(&#34;cron(0 16 ? * TUE *)&#34;)
 *             .duration(3)
 *             .cutoff(1)
 *             .build());
 * 
 *         var target1 = new MaintenanceWindowTarget(&#34;target1&#34;, MaintenanceWindowTargetArgs.builder()        
 *             .windowId(window.id())
 *             .name(&#34;maintenance-window-target&#34;)
 *             .description(&#34;This is a maintenance window target&#34;)
 *             .resourceType(&#34;INSTANCE&#34;)
 *             .targets(MaintenanceWindowTargetTargetArgs.builder()
 *                 .key(&#34;tag:Name&#34;)
 *                 .values(&#34;acceptance_test&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Resource Group Target
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ssm.MaintenanceWindow;
 * import com.pulumi.aws.ssm.MaintenanceWindowArgs;
 * import com.pulumi.aws.ssm.MaintenanceWindowTarget;
 * import com.pulumi.aws.ssm.MaintenanceWindowTargetArgs;
 * import com.pulumi.aws.ssm.inputs.MaintenanceWindowTargetTargetArgs;
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
 *         var window = new MaintenanceWindow(&#34;window&#34;, MaintenanceWindowArgs.builder()        
 *             .name(&#34;maintenance-window-webapp&#34;)
 *             .schedule(&#34;cron(0 16 ? * TUE *)&#34;)
 *             .duration(3)
 *             .cutoff(1)
 *             .build());
 * 
 *         var target1 = new MaintenanceWindowTarget(&#34;target1&#34;, MaintenanceWindowTargetArgs.builder()        
 *             .windowId(window.id())
 *             .name(&#34;maintenance-window-target&#34;)
 *             .description(&#34;This is a maintenance window target&#34;)
 *             .resourceType(&#34;RESOURCE_GROUP&#34;)
 *             .targets(MaintenanceWindowTargetTargetArgs.builder()
 *                 .key(&#34;resource-groups:ResourceTypeFilters&#34;)
 *                 .values(&#34;AWS::EC2::Instance&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SSM Maintenance Window targets using `WINDOW_ID/WINDOW_TARGET_ID`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ssm/maintenanceWindowTarget:MaintenanceWindowTarget example mw-0c50858d01EXAMPLE/23639a0b-ddbc-4bca-9e72-78d96EXAMPLE
 * ```
 * 
 */
@ResourceType(type="aws:ssm/maintenanceWindowTarget:MaintenanceWindowTarget")
public class MaintenanceWindowTarget extends com.pulumi.resources.CustomResource {
    /**
     * The description of the maintenance window target.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the maintenance window target.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the maintenance window target.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the maintenance window target.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
     * 
     */
    @Export(name="ownerInformation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ownerInformation;

    /**
     * @return User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
     * 
     */
    public Output<Optional<String>> ownerInformation() {
        return Codegen.optional(this.ownerInformation);
    }
    /**
     * The type of target being registered with the Maintenance Window. Possible values are `INSTANCE` and `RESOURCE_GROUP`.
     * 
     */
    @Export(name="resourceType", refs={String.class}, tree="[0]")
    private Output<String> resourceType;

    /**
     * @return The type of target being registered with the Maintenance Window. Possible values are `INSTANCE` and `RESOURCE_GROUP`.
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }
    /**
     * The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances. For more information about these examples formats see
     * (https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html)
     * 
     */
    @Export(name="targets", refs={List.class,MaintenanceWindowTargetTarget.class}, tree="[0,1]")
    private Output<List<MaintenanceWindowTargetTarget>> targets;

    /**
     * @return The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances. For more information about these examples formats see
     * (https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html)
     * 
     */
    public Output<List<MaintenanceWindowTargetTarget>> targets() {
        return this.targets;
    }
    /**
     * The Id of the maintenance window to register the target with.
     * 
     */
    @Export(name="windowId", refs={String.class}, tree="[0]")
    private Output<String> windowId;

    /**
     * @return The Id of the maintenance window to register the target with.
     * 
     */
    public Output<String> windowId() {
        return this.windowId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MaintenanceWindowTarget(String name) {
        this(name, MaintenanceWindowTargetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MaintenanceWindowTarget(String name, MaintenanceWindowTargetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MaintenanceWindowTarget(String name, MaintenanceWindowTargetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/maintenanceWindowTarget:MaintenanceWindowTarget", name, args == null ? MaintenanceWindowTargetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MaintenanceWindowTarget(String name, Output<String> id, @Nullable MaintenanceWindowTargetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/maintenanceWindowTarget:MaintenanceWindowTarget", name, state, makeResourceOptions(options, id));
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
    public static MaintenanceWindowTarget get(String name, Output<String> id, @Nullable MaintenanceWindowTargetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MaintenanceWindowTarget(name, id, state, options);
    }
}
