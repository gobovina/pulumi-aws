// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing a QuickSight Dashboard.
 *
 * ## Example Usage
 *
 * ### From Source Template
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.quicksight.Dashboard("example", {
 *     dashboardId: "example-id",
 *     name: "example-name",
 *     versionDescription: "version",
 *     sourceEntity: {
 *         sourceTemplate: {
 *             arn: source.arn,
 *             dataSetReferences: [{
 *                 dataSetArn: dataset.arn,
 *                 dataSetPlaceholder: "1",
 *             }],
 *         },
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import a QuickSight Dashboard using the AWS account ID and dashboard ID separated by a comma (`,`). For example:
 *
 * ```sh
 * $ pulumi import aws:quicksight/dashboard:Dashboard example 123456789012,example-id
 * ```
 */
export class Dashboard extends pulumi.CustomResource {
    /**
     * Get an existing Dashboard resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DashboardState, opts?: pulumi.CustomResourceOptions): Dashboard {
        return new Dashboard(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:quicksight/dashboard:Dashboard';

    /**
     * Returns true if the given object is an instance of Dashboard.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Dashboard {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Dashboard.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the resource.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * AWS account ID.
     */
    public readonly awsAccountId!: pulumi.Output<string>;
    /**
     * The time that the dashboard was created.
     */
    public /*out*/ readonly createdTime!: pulumi.Output<string>;
    /**
     * Identifier for the dashboard.
     */
    public readonly dashboardId!: pulumi.Output<string>;
    /**
     * Options for publishing the dashboard. See dashboard_publish_options.
     */
    public readonly dashboardPublishOptions!: pulumi.Output<outputs.quicksight.DashboardDashboardPublishOptions>;
    public /*out*/ readonly lastPublishedTime!: pulumi.Output<string>;
    /**
     * The time that the dashboard was last updated.
     */
    public /*out*/ readonly lastUpdatedTime!: pulumi.Output<string>;
    /**
     * Display name for the dashboard.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The parameters for the creation of the dashboard, which you want to use to override the default settings. A dashboard can have any type of parameters, and some parameters might accept multiple values. See parameters.
     */
    public readonly parameters!: pulumi.Output<outputs.quicksight.DashboardParameters>;
    /**
     * A set of resource permissions on the dashboard. Maximum of 64 items. See permissions.
     */
    public readonly permissions!: pulumi.Output<outputs.quicksight.DashboardPermission[] | undefined>;
    /**
     * The entity that you are using as a source when you create the dashboard (template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
     */
    public readonly sourceEntity!: pulumi.Output<outputs.quicksight.DashboardSourceEntity | undefined>;
    /**
     * Amazon Resource Name (ARN) of a template that was used to create this dashboard.
     */
    public /*out*/ readonly sourceEntityArn!: pulumi.Output<string>;
    /**
     * The dashboard creation status.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. The theme ARN must exist in the same AWS account where you create the dashboard.
     */
    public readonly themeArn!: pulumi.Output<string | undefined>;
    /**
     * A description of the current dashboard version being created/updated.
     *
     * The following arguments are optional:
     */
    public readonly versionDescription!: pulumi.Output<string>;
    /**
     * The version number of the dashboard version.
     */
    public /*out*/ readonly versionNumber!: pulumi.Output<number>;

    /**
     * Create a Dashboard resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DashboardArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DashboardArgs | DashboardState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DashboardState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["awsAccountId"] = state ? state.awsAccountId : undefined;
            resourceInputs["createdTime"] = state ? state.createdTime : undefined;
            resourceInputs["dashboardId"] = state ? state.dashboardId : undefined;
            resourceInputs["dashboardPublishOptions"] = state ? state.dashboardPublishOptions : undefined;
            resourceInputs["lastPublishedTime"] = state ? state.lastPublishedTime : undefined;
            resourceInputs["lastUpdatedTime"] = state ? state.lastUpdatedTime : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["permissions"] = state ? state.permissions : undefined;
            resourceInputs["sourceEntity"] = state ? state.sourceEntity : undefined;
            resourceInputs["sourceEntityArn"] = state ? state.sourceEntityArn : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["themeArn"] = state ? state.themeArn : undefined;
            resourceInputs["versionDescription"] = state ? state.versionDescription : undefined;
            resourceInputs["versionNumber"] = state ? state.versionNumber : undefined;
        } else {
            const args = argsOrState as DashboardArgs | undefined;
            if ((!args || args.dashboardId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dashboardId'");
            }
            if ((!args || args.versionDescription === undefined) && !opts.urn) {
                throw new Error("Missing required property 'versionDescription'");
            }
            resourceInputs["awsAccountId"] = args ? args.awsAccountId : undefined;
            resourceInputs["dashboardId"] = args ? args.dashboardId : undefined;
            resourceInputs["dashboardPublishOptions"] = args ? args.dashboardPublishOptions : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["permissions"] = args ? args.permissions : undefined;
            resourceInputs["sourceEntity"] = args ? args.sourceEntity : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["themeArn"] = args ? args.themeArn : undefined;
            resourceInputs["versionDescription"] = args ? args.versionDescription : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdTime"] = undefined /*out*/;
            resourceInputs["lastPublishedTime"] = undefined /*out*/;
            resourceInputs["lastUpdatedTime"] = undefined /*out*/;
            resourceInputs["sourceEntityArn"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["versionNumber"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Dashboard.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Dashboard resources.
 */
export interface DashboardState {
    /**
     * The Amazon Resource Name (ARN) of the resource.
     */
    arn?: pulumi.Input<string>;
    /**
     * AWS account ID.
     */
    awsAccountId?: pulumi.Input<string>;
    /**
     * The time that the dashboard was created.
     */
    createdTime?: pulumi.Input<string>;
    /**
     * Identifier for the dashboard.
     */
    dashboardId?: pulumi.Input<string>;
    /**
     * Options for publishing the dashboard. See dashboard_publish_options.
     */
    dashboardPublishOptions?: pulumi.Input<inputs.quicksight.DashboardDashboardPublishOptions>;
    lastPublishedTime?: pulumi.Input<string>;
    /**
     * The time that the dashboard was last updated.
     */
    lastUpdatedTime?: pulumi.Input<string>;
    /**
     * Display name for the dashboard.
     */
    name?: pulumi.Input<string>;
    /**
     * The parameters for the creation of the dashboard, which you want to use to override the default settings. A dashboard can have any type of parameters, and some parameters might accept multiple values. See parameters.
     */
    parameters?: pulumi.Input<inputs.quicksight.DashboardParameters>;
    /**
     * A set of resource permissions on the dashboard. Maximum of 64 items. See permissions.
     */
    permissions?: pulumi.Input<pulumi.Input<inputs.quicksight.DashboardPermission>[]>;
    /**
     * The entity that you are using as a source when you create the dashboard (template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
     */
    sourceEntity?: pulumi.Input<inputs.quicksight.DashboardSourceEntity>;
    /**
     * Amazon Resource Name (ARN) of a template that was used to create this dashboard.
     */
    sourceEntityArn?: pulumi.Input<string>;
    /**
     * The dashboard creation status.
     */
    status?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. The theme ARN must exist in the same AWS account where you create the dashboard.
     */
    themeArn?: pulumi.Input<string>;
    /**
     * A description of the current dashboard version being created/updated.
     *
     * The following arguments are optional:
     */
    versionDescription?: pulumi.Input<string>;
    /**
     * The version number of the dashboard version.
     */
    versionNumber?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Dashboard resource.
 */
export interface DashboardArgs {
    /**
     * AWS account ID.
     */
    awsAccountId?: pulumi.Input<string>;
    /**
     * Identifier for the dashboard.
     */
    dashboardId: pulumi.Input<string>;
    /**
     * Options for publishing the dashboard. See dashboard_publish_options.
     */
    dashboardPublishOptions?: pulumi.Input<inputs.quicksight.DashboardDashboardPublishOptions>;
    /**
     * Display name for the dashboard.
     */
    name?: pulumi.Input<string>;
    /**
     * The parameters for the creation of the dashboard, which you want to use to override the default settings. A dashboard can have any type of parameters, and some parameters might accept multiple values. See parameters.
     */
    parameters?: pulumi.Input<inputs.quicksight.DashboardParameters>;
    /**
     * A set of resource permissions on the dashboard. Maximum of 64 items. See permissions.
     */
    permissions?: pulumi.Input<pulumi.Input<inputs.quicksight.DashboardPermission>[]>;
    /**
     * The entity that you are using as a source when you create the dashboard (template). Only one of `definition` or `sourceEntity` should be configured. See source_entity.
     */
    sourceEntity?: pulumi.Input<inputs.quicksight.DashboardSourceEntity>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. The theme ARN must exist in the same AWS account where you create the dashboard.
     */
    themeArn?: pulumi.Input<string>;
    /**
     * A description of the current dashboard version being created/updated.
     *
     * The following arguments are optional:
     */
    versionDescription: pulumi.Input<string>;
}
