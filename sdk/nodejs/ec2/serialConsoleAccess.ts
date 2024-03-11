// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a resource to manage whether serial console access is enabled for your AWS account in the current AWS region.
 *
 * > **NOTE:** Removing this resource disables serial console access.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ec2.SerialConsoleAccess("example", {enabled: true});
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import serial console access state. For example:
 *
 * ```sh
 * $ pulumi import aws:ec2/serialConsoleAccess:SerialConsoleAccess example default
 * ```
 */
export class SerialConsoleAccess extends pulumi.CustomResource {
    /**
     * Get an existing SerialConsoleAccess resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SerialConsoleAccessState, opts?: pulumi.CustomResourceOptions): SerialConsoleAccess {
        return new SerialConsoleAccess(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/serialConsoleAccess:SerialConsoleAccess';

    /**
     * Returns true if the given object is an instance of SerialConsoleAccess.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SerialConsoleAccess {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SerialConsoleAccess.__pulumiType;
    }

    /**
     * Whether or not serial console access is enabled. Valid values are `true` or `false`. Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;

    /**
     * Create a SerialConsoleAccess resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SerialConsoleAccessArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SerialConsoleAccessArgs | SerialConsoleAccessState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SerialConsoleAccessState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
        } else {
            const args = argsOrState as SerialConsoleAccessArgs | undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SerialConsoleAccess.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SerialConsoleAccess resources.
 */
export interface SerialConsoleAccessState {
    /**
     * Whether or not serial console access is enabled. Valid values are `true` or `false`. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a SerialConsoleAccess resource.
 */
export interface SerialConsoleAccessArgs {
    /**
     * Whether or not serial console access is enabled. Valid values are `true` or `false`. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
}
