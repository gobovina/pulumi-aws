// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an OpsWorks permission resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const myStackPermission = new aws.opsworks.Permission("my_stack_permission", {
 *     allowSsh: true,
 *     allowSudo: true,
 *     level: "iam_only",
 *     userArn: user.arn,
 *     stackId: stack.id,
 * });
 * ```
 */
export class Permission extends pulumi.CustomResource {
    /**
     * Get an existing Permission resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PermissionState, opts?: pulumi.CustomResourceOptions): Permission {
        return new Permission(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:opsworks/permission:Permission';

    /**
     * Returns true if the given object is an instance of Permission.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Permission {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Permission.__pulumiType;
    }

    /**
     * Whether the user is allowed to use SSH to communicate with the instance
     */
    public readonly allowSsh!: pulumi.Output<boolean>;
    /**
     * Whether the user is allowed to use sudo to elevate privileges
     */
    public readonly allowSudo!: pulumi.Output<boolean>;
    /**
     * The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iamOnly`
     */
    public readonly level!: pulumi.Output<string>;
    /**
     * The stack to set the permissions for
     */
    public readonly stackId!: pulumi.Output<string>;
    /**
     * The user's IAM ARN to set permissions for
     */
    public readonly userArn!: pulumi.Output<string>;

    /**
     * Create a Permission resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PermissionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PermissionArgs | PermissionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PermissionState | undefined;
            resourceInputs["allowSsh"] = state ? state.allowSsh : undefined;
            resourceInputs["allowSudo"] = state ? state.allowSudo : undefined;
            resourceInputs["level"] = state ? state.level : undefined;
            resourceInputs["stackId"] = state ? state.stackId : undefined;
            resourceInputs["userArn"] = state ? state.userArn : undefined;
        } else {
            const args = argsOrState as PermissionArgs | undefined;
            if ((!args || args.stackId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'stackId'");
            }
            if ((!args || args.userArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userArn'");
            }
            resourceInputs["allowSsh"] = args ? args.allowSsh : undefined;
            resourceInputs["allowSudo"] = args ? args.allowSudo : undefined;
            resourceInputs["level"] = args ? args.level : undefined;
            resourceInputs["stackId"] = args ? args.stackId : undefined;
            resourceInputs["userArn"] = args ? args.userArn : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Permission.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Permission resources.
 */
export interface PermissionState {
    /**
     * Whether the user is allowed to use SSH to communicate with the instance
     */
    allowSsh?: pulumi.Input<boolean>;
    /**
     * Whether the user is allowed to use sudo to elevate privileges
     */
    allowSudo?: pulumi.Input<boolean>;
    /**
     * The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iamOnly`
     */
    level?: pulumi.Input<string>;
    /**
     * The stack to set the permissions for
     */
    stackId?: pulumi.Input<string>;
    /**
     * The user's IAM ARN to set permissions for
     */
    userArn?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Permission resource.
 */
export interface PermissionArgs {
    /**
     * Whether the user is allowed to use SSH to communicate with the instance
     */
    allowSsh?: pulumi.Input<boolean>;
    /**
     * Whether the user is allowed to use sudo to elevate privileges
     */
    allowSudo?: pulumi.Input<boolean>;
    /**
     * The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iamOnly`
     */
    level?: pulumi.Input<string>;
    /**
     * The stack to set the permissions for
     */
    stackId: pulumi.Input<string>;
    /**
     * The user's IAM ARN to set permissions for
     */
    userArn: pulumi.Input<string>;
}
