// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Elastic File System (EFS) access point.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.efs.AccessPoint("test", {fileSystemId: foo.id});
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import the EFS access points using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:efs/accessPoint:AccessPoint test fsap-52a643fb
 * ```
 */
export class AccessPoint extends pulumi.CustomResource {
    /**
     * Get an existing AccessPoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessPointState, opts?: pulumi.CustomResourceOptions): AccessPoint {
        return new AccessPoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:efs/accessPoint:AccessPoint';

    /**
     * Returns true if the given object is an instance of AccessPoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessPoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessPoint.__pulumiType;
    }

    /**
     * ARN of the access point.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * ARN of the file system.
     */
    public /*out*/ readonly fileSystemArn!: pulumi.Output<string>;
    /**
     * ID of the file system for which the access point is intended.
     */
    public readonly fileSystemId!: pulumi.Output<string>;
    public /*out*/ readonly ownerId!: pulumi.Output<string>;
    /**
     * Operating system user and group applied to all file system requests made using the access point. Detailed below.
     */
    public readonly posixUser!: pulumi.Output<outputs.efs.AccessPointPosixUser | undefined>;
    /**
     * Directory on the Amazon EFS file system that the access point provides access to. Detailed below.
     */
    public readonly rootDirectory!: pulumi.Output<outputs.efs.AccessPointRootDirectory>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a AccessPoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessPointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessPointArgs | AccessPointState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessPointState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["fileSystemArn"] = state ? state.fileSystemArn : undefined;
            resourceInputs["fileSystemId"] = state ? state.fileSystemId : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["posixUser"] = state ? state.posixUser : undefined;
            resourceInputs["rootDirectory"] = state ? state.rootDirectory : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as AccessPointArgs | undefined;
            if ((!args || args.fileSystemId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fileSystemId'");
            }
            resourceInputs["fileSystemId"] = args ? args.fileSystemId : undefined;
            resourceInputs["posixUser"] = args ? args.posixUser : undefined;
            resourceInputs["rootDirectory"] = args ? args.rootDirectory : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["fileSystemArn"] = undefined /*out*/;
            resourceInputs["ownerId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessPoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessPoint resources.
 */
export interface AccessPointState {
    /**
     * ARN of the access point.
     */
    arn?: pulumi.Input<string>;
    /**
     * ARN of the file system.
     */
    fileSystemArn?: pulumi.Input<string>;
    /**
     * ID of the file system for which the access point is intended.
     */
    fileSystemId?: pulumi.Input<string>;
    ownerId?: pulumi.Input<string>;
    /**
     * Operating system user and group applied to all file system requests made using the access point. Detailed below.
     */
    posixUser?: pulumi.Input<inputs.efs.AccessPointPosixUser>;
    /**
     * Directory on the Amazon EFS file system that the access point provides access to. Detailed below.
     */
    rootDirectory?: pulumi.Input<inputs.efs.AccessPointRootDirectory>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a AccessPoint resource.
 */
export interface AccessPointArgs {
    /**
     * ID of the file system for which the access point is intended.
     */
    fileSystemId: pulumi.Input<string>;
    /**
     * Operating system user and group applied to all file system requests made using the access point. Detailed below.
     */
    posixUser?: pulumi.Input<inputs.efs.AccessPointPosixUser>;
    /**
     * Directory on the Amazon EFS file system that the access point provides access to. Detailed below.
     */
    rootDirectory?: pulumi.Input<inputs.efs.AccessPointRootDirectory>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
