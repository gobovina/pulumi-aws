// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.quicksight.DashboardArgs;
import com.pulumi.aws.quicksight.inputs.DashboardState;
import com.pulumi.aws.quicksight.outputs.DashboardDashboardPublishOptions;
import com.pulumi.aws.quicksight.outputs.DashboardParameters;
import com.pulumi.aws.quicksight.outputs.DashboardPermission;
import com.pulumi.aws.quicksight.outputs.DashboardSourceEntity;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing a QuickSight Dashboard.
 * 
 * ## Example Usage
 * 
 * ### From Source Template
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.quicksight.Dashboard;
 * import com.pulumi.aws.quicksight.DashboardArgs;
 * import com.pulumi.aws.quicksight.inputs.DashboardSourceEntityArgs;
 * import com.pulumi.aws.quicksight.inputs.DashboardSourceEntitySourceTemplateArgs;
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
 *         var example = new Dashboard(&#34;example&#34;, DashboardArgs.builder()        
 *             .dashboardId(&#34;example-id&#34;)
 *             .name(&#34;example-name&#34;)
 *             .versionDescription(&#34;version&#34;)
 *             .sourceEntity(DashboardSourceEntityArgs.builder()
 *                 .sourceTemplate(DashboardSourceEntitySourceTemplateArgs.builder()
 *                     .arn(source.arn())
 *                     .dataSetReferences(DashboardSourceEntitySourceTemplateDataSetReferenceArgs.builder()
 *                         .dataSetArn(dataset.arn())
 *                         .dataSetPlaceholder(&#34;1&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### With Definition
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.quicksight.Dashboard;
 * import com.pulumi.aws.quicksight.DashboardArgs;
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
 *         var example = new Dashboard(&#34;example&#34;, DashboardArgs.builder()        
 *             .dashboardId(&#34;example-id&#34;)
 *             .name(&#34;example-name&#34;)
 *             .versionDescription(&#34;version&#34;)
 *             .definition(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import a QuickSight Dashboard using the AWS account ID and dashboard ID separated by a comma (`,`). For example:
 * 
 * ```sh
 * $ pulumi import aws:quicksight/dashboard:Dashboard example 123456789012,example-id
 * ```
 * 
 */
@ResourceType(type="aws:quicksight/dashboard:Dashboard")
public class Dashboard extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the resource.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the resource.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * AWS account ID.
     * 
     */
    @Export(name="awsAccountId", refs={String.class}, tree="[0]")
    private Output<String> awsAccountId;

    /**
     * @return AWS account ID.
     * 
     */
    public Output<String> awsAccountId() {
        return this.awsAccountId;
    }
    /**
     * The time that the dashboard was created.
     * 
     */
    @Export(name="createdTime", refs={String.class}, tree="[0]")
    private Output<String> createdTime;

    /**
     * @return The time that the dashboard was created.
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * Identifier for the dashboard.
     * 
     */
    @Export(name="dashboardId", refs={String.class}, tree="[0]")
    private Output<String> dashboardId;

    /**
     * @return Identifier for the dashboard.
     * 
     */
    public Output<String> dashboardId() {
        return this.dashboardId;
    }
    /**
     * Options for publishing the dashboard. See dashboard_publish_options.
     * 
     */
    @Export(name="dashboardPublishOptions", refs={DashboardDashboardPublishOptions.class}, tree="[0]")
    private Output<DashboardDashboardPublishOptions> dashboardPublishOptions;

    /**
     * @return Options for publishing the dashboard. See dashboard_publish_options.
     * 
     */
    public Output<DashboardDashboardPublishOptions> dashboardPublishOptions() {
        return this.dashboardPublishOptions;
    }
    @Export(name="lastPublishedTime", refs={String.class}, tree="[0]")
    private Output<String> lastPublishedTime;

    public Output<String> lastPublishedTime() {
        return this.lastPublishedTime;
    }
    /**
     * The time that the dashboard was last updated.
     * 
     */
    @Export(name="lastUpdatedTime", refs={String.class}, tree="[0]")
    private Output<String> lastUpdatedTime;

    /**
     * @return The time that the dashboard was last updated.
     * 
     */
    public Output<String> lastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * Display name for the dashboard.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Display name for the dashboard.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The parameters for the creation of the dashboard, which you want to use to override the default settings. A dashboard can have any type of parameters, and some parameters might accept multiple values. See parameters.
     * 
     */
    @Export(name="parameters", refs={DashboardParameters.class}, tree="[0]")
    private Output<DashboardParameters> parameters;

    /**
     * @return The parameters for the creation of the dashboard, which you want to use to override the default settings. A dashboard can have any type of parameters, and some parameters might accept multiple values. See parameters.
     * 
     */
    public Output<DashboardParameters> parameters() {
        return this.parameters;
    }
    /**
     * A set of resource permissions on the dashboard. Maximum of 64 items. See permissions.
     * 
     */
    @Export(name="permissions", refs={List.class,DashboardPermission.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DashboardPermission>> permissions;

    /**
     * @return A set of resource permissions on the dashboard. Maximum of 64 items. See permissions.
     * 
     */
    public Output<Optional<List<DashboardPermission>>> permissions() {
        return Codegen.optional(this.permissions);
    }
    /**
     * The entity that you are using as a source when you create the dashboard (template). Only one of `definition` or `source_entity` should be configured. See source_entity.
     * 
     */
    @Export(name="sourceEntity", refs={DashboardSourceEntity.class}, tree="[0]")
    private Output</* @Nullable */ DashboardSourceEntity> sourceEntity;

    /**
     * @return The entity that you are using as a source when you create the dashboard (template). Only one of `definition` or `source_entity` should be configured. See source_entity.
     * 
     */
    public Output<Optional<DashboardSourceEntity>> sourceEntity() {
        return Codegen.optional(this.sourceEntity);
    }
    /**
     * Amazon Resource Name (ARN) of a template that was used to create this dashboard.
     * 
     */
    @Export(name="sourceEntityArn", refs={String.class}, tree="[0]")
    private Output<String> sourceEntityArn;

    /**
     * @return Amazon Resource Name (ARN) of a template that was used to create this dashboard.
     * 
     */
    public Output<String> sourceEntityArn() {
        return this.sourceEntityArn;
    }
    /**
     * The dashboard creation status.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The dashboard creation status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. The theme ARN must exist in the same AWS account where you create the dashboard.
     * 
     */
    @Export(name="themeArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> themeArn;

    /**
     * @return The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. The theme ARN must exist in the same AWS account where you create the dashboard.
     * 
     */
    public Output<Optional<String>> themeArn() {
        return Codegen.optional(this.themeArn);
    }
    /**
     * A description of the current dashboard version being created/updated.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="versionDescription", refs={String.class}, tree="[0]")
    private Output<String> versionDescription;

    /**
     * @return A description of the current dashboard version being created/updated.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> versionDescription() {
        return this.versionDescription;
    }
    /**
     * The version number of the dashboard version.
     * 
     */
    @Export(name="versionNumber", refs={Integer.class}, tree="[0]")
    private Output<Integer> versionNumber;

    /**
     * @return The version number of the dashboard version.
     * 
     */
    public Output<Integer> versionNumber() {
        return this.versionNumber;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Dashboard(String name) {
        this(name, DashboardArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Dashboard(String name, DashboardArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Dashboard(String name, DashboardArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:quicksight/dashboard:Dashboard", name, args == null ? DashboardArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Dashboard(String name, Output<String> id, @Nullable DashboardState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:quicksight/dashboard:Dashboard", name, state, makeResourceOptions(options, id));
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
    public static Dashboard get(String name, Output<String> id, @Nullable DashboardState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Dashboard(name, id, state, options);
    }
}
