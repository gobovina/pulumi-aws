// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This setting defines how a user interacts with or uses a service or a feature of a service.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const testSetting = new aws.ssm.ServiceSetting("test_setting", {
 *     settingId: "arn:aws:ssm:us-east-1:123456789012:servicesetting/ssm/parameter-store/high-throughput-enabled",
 *     settingValue: "true",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import AWS SSM Service Setting using the `setting_id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:ssm/serviceSetting:ServiceSetting example arn:aws:ssm:us-east-1:123456789012:servicesetting/ssm/parameter-store/high-throughput-enabled
 * ```
 */
export class ServiceSetting extends pulumi.CustomResource {
    /**
     * Get an existing ServiceSetting resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceSettingState, opts?: pulumi.CustomResourceOptions): ServiceSetting {
        return new ServiceSetting(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ssm/serviceSetting:ServiceSetting';

    /**
     * Returns true if the given object is an instance of ServiceSetting.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceSetting {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceSetting.__pulumiType;
    }

    /**
     * ARN of the service setting.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * ID of the service setting.
     */
    public readonly settingId!: pulumi.Output<string>;
    /**
     * Value of the service setting.
     */
    public readonly settingValue!: pulumi.Output<string>;
    /**
     * Status of the service setting. Value can be `Default`, `Customized` or `PendingUpdate`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a ServiceSetting resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceSettingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceSettingArgs | ServiceSettingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceSettingState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["settingId"] = state ? state.settingId : undefined;
            resourceInputs["settingValue"] = state ? state.settingValue : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as ServiceSettingArgs | undefined;
            if ((!args || args.settingId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'settingId'");
            }
            if ((!args || args.settingValue === undefined) && !opts.urn) {
                throw new Error("Missing required property 'settingValue'");
            }
            resourceInputs["settingId"] = args ? args.settingId : undefined;
            resourceInputs["settingValue"] = args ? args.settingValue : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceSetting.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceSetting resources.
 */
export interface ServiceSettingState {
    /**
     * ARN of the service setting.
     */
    arn?: pulumi.Input<string>;
    /**
     * ID of the service setting.
     */
    settingId?: pulumi.Input<string>;
    /**
     * Value of the service setting.
     */
    settingValue?: pulumi.Input<string>;
    /**
     * Status of the service setting. Value can be `Default`, `Customized` or `PendingUpdate`.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceSetting resource.
 */
export interface ServiceSettingArgs {
    /**
     * ID of the service setting.
     */
    settingId: pulumi.Input<string>;
    /**
     * Value of the service setting.
     */
    settingValue: pulumi.Input<string>;
}
