// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an AppConfig Environment resource for an `aws.appconfig.Application` resource. One or more environments can be defined for an application.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleApplication = new aws.appconfig.Application("exampleApplication", {
 *     description: "Example AppConfig Application",
 *     tags: {
 *         Type: "AppConfig Application",
 *     },
 * });
 * const exampleEnvironment = new aws.appconfig.Environment("exampleEnvironment", {
 *     description: "Example AppConfig Environment",
 *     applicationId: exampleApplication.id,
 *     monitors: [{
 *         alarmArn: aws_cloudwatch_metric_alarm.example.arn,
 *         alarmRoleArn: aws_iam_role.example.arn,
 *     }],
 *     tags: {
 *         Type: "AppConfig Environment",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import AppConfig Environments using the environment ID and application ID separated by a colon (`:`). For example:
 *
 * ```sh
 *  $ pulumi import aws:appconfig/environment:Environment example 71abcde:11xxxxx
 * ```
 */
export class Environment extends pulumi.CustomResource {
    /**
     * Get an existing Environment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EnvironmentState, opts?: pulumi.CustomResourceOptions): Environment {
        return new Environment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:appconfig/environment:Environment';

    /**
     * Returns true if the given object is an instance of Environment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Environment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Environment.__pulumiType;
    }

    /**
     * AppConfig application ID. Must be between 4 and 7 characters in length.
     */
    public readonly applicationId!: pulumi.Output<string>;
    /**
     * ARN of the AppConfig Environment.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Description of the environment. Can be at most 1024 characters.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * AppConfig environment ID.
     */
    public /*out*/ readonly environmentId!: pulumi.Output<string>;
    /**
     * Set of Amazon CloudWatch alarms to monitor during the deployment process. Maximum of 5. See Monitor below for more details.
     */
    public readonly monitors!: pulumi.Output<outputs.appconfig.EnvironmentMonitor[] | undefined>;
    /**
     * Name for the environment. Must be between 1 and 64 characters in length.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * State of the environment. Possible values are `READY_FOR_DEPLOYMENT`, `DEPLOYING`, `ROLLING_BACK`
     * or `ROLLED_BACK`.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Environment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EnvironmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EnvironmentArgs | EnvironmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EnvironmentState | undefined;
            resourceInputs["applicationId"] = state ? state.applicationId : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["environmentId"] = state ? state.environmentId : undefined;
            resourceInputs["monitors"] = state ? state.monitors : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as EnvironmentArgs | undefined;
            if ((!args || args.applicationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'applicationId'");
            }
            resourceInputs["applicationId"] = args ? args.applicationId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["monitors"] = args ? args.monitors : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["environmentId"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Environment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Environment resources.
 */
export interface EnvironmentState {
    /**
     * AppConfig application ID. Must be between 4 and 7 characters in length.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * ARN of the AppConfig Environment.
     */
    arn?: pulumi.Input<string>;
    /**
     * Description of the environment. Can be at most 1024 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * AppConfig environment ID.
     */
    environmentId?: pulumi.Input<string>;
    /**
     * Set of Amazon CloudWatch alarms to monitor during the deployment process. Maximum of 5. See Monitor below for more details.
     */
    monitors?: pulumi.Input<pulumi.Input<inputs.appconfig.EnvironmentMonitor>[]>;
    /**
     * Name for the environment. Must be between 1 and 64 characters in length.
     */
    name?: pulumi.Input<string>;
    /**
     * State of the environment. Possible values are `READY_FOR_DEPLOYMENT`, `DEPLOYING`, `ROLLING_BACK`
     * or `ROLLED_BACK`.
     */
    state?: pulumi.Input<string>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Environment resource.
 */
export interface EnvironmentArgs {
    /**
     * AppConfig application ID. Must be between 4 and 7 characters in length.
     */
    applicationId: pulumi.Input<string>;
    /**
     * Description of the environment. Can be at most 1024 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * Set of Amazon CloudWatch alarms to monitor during the deployment process. Maximum of 5. See Monitor below for more details.
     */
    monitors?: pulumi.Input<pulumi.Input<inputs.appconfig.EnvironmentMonitor>[]>;
    /**
     * Name for the environment. Must be between 1 and 64 characters in length.
     */
    name?: pulumi.Input<string>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
