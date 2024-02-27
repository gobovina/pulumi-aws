// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a resource to manage AWS Device Farm Device Pools.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.devicefarm.DevicePool("example", {
 *     projectArn: aws_devicefarm_project.example.arn,
 *     rules: [{
 *         attribute: "OS_VERSION",
 *         operator: "EQUALS",
 *         value: "\"AVAILABLE\"",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import DeviceFarm Device Pools using their ARN. For example:
 *
 * ```sh
 *  $ pulumi import aws:devicefarm/devicePool:DevicePool example arn:aws:devicefarm:us-west-2:123456789012:devicepool:4fa784c7-ccb4-4dbf-ba4f-02198320daa1/4fa784c7-ccb4-4dbf-ba4f-02198320daa1
 * ```
 */
export class DevicePool extends pulumi.CustomResource {
    /**
     * Get an existing DevicePool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DevicePoolState, opts?: pulumi.CustomResourceOptions): DevicePool {
        return new DevicePool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:devicefarm/devicePool:DevicePool';

    /**
     * Returns true if the given object is an instance of DevicePool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DevicePool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DevicePool.__pulumiType;
    }

    /**
     * The Amazon Resource Name of this Device Pool
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The device pool's description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The number of devices that Device Farm can add to your device pool.
     */
    public readonly maxDevices!: pulumi.Output<number | undefined>;
    /**
     * The name of the Device Pool
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ARN of the project for the device pool.
     */
    public readonly projectArn!: pulumi.Output<string>;
    /**
     * The device pool's rules. See Rule.
     */
    public readonly rules!: pulumi.Output<outputs.devicefarm.DevicePoolRule[]>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    public /*out*/ readonly type!: pulumi.Output<string>;

    /**
     * Create a DevicePool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DevicePoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DevicePoolArgs | DevicePoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DevicePoolState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["maxDevices"] = state ? state.maxDevices : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["projectArn"] = state ? state.projectArn : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as DevicePoolArgs | undefined;
            if ((!args || args.projectArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectArn'");
            }
            if ((!args || args.rules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rules'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["maxDevices"] = args ? args.maxDevices : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["projectArn"] = args ? args.projectArn : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DevicePool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DevicePool resources.
 */
export interface DevicePoolState {
    /**
     * The Amazon Resource Name of this Device Pool
     */
    arn?: pulumi.Input<string>;
    /**
     * The device pool's description.
     */
    description?: pulumi.Input<string>;
    /**
     * The number of devices that Device Farm can add to your device pool.
     */
    maxDevices?: pulumi.Input<number>;
    /**
     * The name of the Device Pool
     */
    name?: pulumi.Input<string>;
    /**
     * The ARN of the project for the device pool.
     */
    projectArn?: pulumi.Input<string>;
    /**
     * The device pool's rules. See Rule.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.devicefarm.DevicePoolRule>[]>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DevicePool resource.
 */
export interface DevicePoolArgs {
    /**
     * The device pool's description.
     */
    description?: pulumi.Input<string>;
    /**
     * The number of devices that Device Farm can add to your device pool.
     */
    maxDevices?: pulumi.Input<number>;
    /**
     * The name of the Device Pool
     */
    name?: pulumi.Input<string>;
    /**
     * The ARN of the project for the device pool.
     */
    projectArn: pulumi.Input<string>;
    /**
     * The device pool's rules. See Rule.
     */
    rules: pulumi.Input<pulumi.Input<inputs.devicefarm.DevicePoolRule>[]>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
