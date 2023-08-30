// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a CodeDeploy deployment config for an application
 *
 * ## Example Usage
 * ### Server Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const fooDeploymentConfig = new aws.codedeploy.DeploymentConfig("fooDeploymentConfig", {
 *     deploymentConfigName: "test-deployment-config",
 *     minimumHealthyHosts: {
 *         type: "HOST_COUNT",
 *         value: 2,
 *     },
 * });
 * const fooDeploymentGroup = new aws.codedeploy.DeploymentGroup("fooDeploymentGroup", {
 *     appName: aws_codedeploy_app.foo_app.name,
 *     deploymentGroupName: "bar",
 *     serviceRoleArn: aws_iam_role.foo_role.arn,
 *     deploymentConfigName: fooDeploymentConfig.id,
 *     ec2TagFilters: [{
 *         key: "filterkey",
 *         type: "KEY_AND_VALUE",
 *         value: "filtervalue",
 *     }],
 *     triggerConfigurations: [{
 *         triggerEvents: ["DeploymentFailure"],
 *         triggerName: "foo-trigger",
 *         triggerTargetArn: "foo-topic-arn",
 *     }],
 *     autoRollbackConfiguration: {
 *         enabled: true,
 *         events: ["DEPLOYMENT_FAILURE"],
 *     },
 *     alarmConfiguration: {
 *         alarms: ["my-alarm-name"],
 *         enabled: true,
 *     },
 * });
 * ```
 * ### Lambda Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const fooDeploymentConfig = new aws.codedeploy.DeploymentConfig("fooDeploymentConfig", {
 *     deploymentConfigName: "test-deployment-config",
 *     computePlatform: "Lambda",
 *     trafficRoutingConfig: {
 *         type: "TimeBasedLinear",
 *         timeBasedLinear: {
 *             interval: 10,
 *             percentage: 10,
 *         },
 *     },
 * });
 * const fooDeploymentGroup = new aws.codedeploy.DeploymentGroup("fooDeploymentGroup", {
 *     appName: aws_codedeploy_app.foo_app.name,
 *     deploymentGroupName: "bar",
 *     serviceRoleArn: aws_iam_role.foo_role.arn,
 *     deploymentConfigName: fooDeploymentConfig.id,
 *     autoRollbackConfiguration: {
 *         enabled: true,
 *         events: ["DEPLOYMENT_STOP_ON_ALARM"],
 *     },
 *     alarmConfiguration: {
 *         alarms: ["my-alarm-name"],
 *         enabled: true,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import CodeDeploy Deployment Configurations using the `deployment_config_name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:codedeploy/deploymentConfig:DeploymentConfig example my-deployment-config
 * ```
 */
export class DeploymentConfig extends pulumi.CustomResource {
    /**
     * Get an existing DeploymentConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DeploymentConfigState, opts?: pulumi.CustomResourceOptions): DeploymentConfig {
        return new DeploymentConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:codedeploy/deploymentConfig:DeploymentConfig';

    /**
     * Returns true if the given object is an instance of DeploymentConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DeploymentConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DeploymentConfig.__pulumiType;
    }

    /**
     * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
     */
    public readonly computePlatform!: pulumi.Output<string | undefined>;
    /**
     * The AWS Assigned deployment config id
     */
    public /*out*/ readonly deploymentConfigId!: pulumi.Output<string>;
    /**
     * The name of the deployment config.
     */
    public readonly deploymentConfigName!: pulumi.Output<string>;
    /**
     * A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
     */
    public readonly minimumHealthyHosts!: pulumi.Output<outputs.codedeploy.DeploymentConfigMinimumHealthyHosts | undefined>;
    /**
     * A trafficRoutingConfig block. Traffic Routing Config is documented below.
     */
    public readonly trafficRoutingConfig!: pulumi.Output<outputs.codedeploy.DeploymentConfigTrafficRoutingConfig | undefined>;

    /**
     * Create a DeploymentConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: DeploymentConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DeploymentConfigArgs | DeploymentConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DeploymentConfigState | undefined;
            resourceInputs["computePlatform"] = state ? state.computePlatform : undefined;
            resourceInputs["deploymentConfigId"] = state ? state.deploymentConfigId : undefined;
            resourceInputs["deploymentConfigName"] = state ? state.deploymentConfigName : undefined;
            resourceInputs["minimumHealthyHosts"] = state ? state.minimumHealthyHosts : undefined;
            resourceInputs["trafficRoutingConfig"] = state ? state.trafficRoutingConfig : undefined;
        } else {
            const args = argsOrState as DeploymentConfigArgs | undefined;
            resourceInputs["computePlatform"] = args ? args.computePlatform : undefined;
            resourceInputs["deploymentConfigName"] = args ? args.deploymentConfigName : undefined;
            resourceInputs["minimumHealthyHosts"] = args ? args.minimumHealthyHosts : undefined;
            resourceInputs["trafficRoutingConfig"] = args ? args.trafficRoutingConfig : undefined;
            resourceInputs["deploymentConfigId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DeploymentConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DeploymentConfig resources.
 */
export interface DeploymentConfigState {
    /**
     * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
     */
    computePlatform?: pulumi.Input<string>;
    /**
     * The AWS Assigned deployment config id
     */
    deploymentConfigId?: pulumi.Input<string>;
    /**
     * The name of the deployment config.
     */
    deploymentConfigName?: pulumi.Input<string>;
    /**
     * A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
     */
    minimumHealthyHosts?: pulumi.Input<inputs.codedeploy.DeploymentConfigMinimumHealthyHosts>;
    /**
     * A trafficRoutingConfig block. Traffic Routing Config is documented below.
     */
    trafficRoutingConfig?: pulumi.Input<inputs.codedeploy.DeploymentConfigTrafficRoutingConfig>;
}

/**
 * The set of arguments for constructing a DeploymentConfig resource.
 */
export interface DeploymentConfigArgs {
    /**
     * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
     */
    computePlatform?: pulumi.Input<string>;
    /**
     * The name of the deployment config.
     */
    deploymentConfigName?: pulumi.Input<string>;
    /**
     * A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
     */
    minimumHealthyHosts?: pulumi.Input<inputs.codedeploy.DeploymentConfigMinimumHealthyHosts>;
    /**
     * A trafficRoutingConfig block. Traffic Routing Config is documented below.
     */
    trafficRoutingConfig?: pulumi.Input<inputs.codedeploy.DeploymentConfigTrafficRoutingConfig>;
}
