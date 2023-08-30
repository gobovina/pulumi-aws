// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Lightsail Disk resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const available = aws.getAvailabilityZones({
 *     state: "available",
 *     filters: [{
 *         name: "opt-in-status",
 *         values: ["opt-in-not-required"],
 *     }],
 * });
 * const test = new aws.lightsail.Disk("test", {
 *     sizeInGb: 8,
 *     availabilityZone: available.then(available => available.names?.[0]),
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_lightsail_disk` using the name attribute. For example:
 *
 * ```sh
 *  $ pulumi import aws:lightsail/disk:Disk test test
 * ```
 */
export class Disk extends pulumi.CustomResource {
    /**
     * Get an existing Disk resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DiskState, opts?: pulumi.CustomResourceOptions): Disk {
        return new Disk(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:lightsail/disk:Disk';

    /**
     * Returns true if the given object is an instance of Disk.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Disk {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Disk.__pulumiType;
    }

    /**
     * The ARN of the Lightsail load balancer.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The Availability Zone in which to create your disk.
     */
    public readonly availabilityZone!: pulumi.Output<string>;
    /**
     * The timestamp when the load balancer was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The name of the Lightsail load balancer.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The instance port the load balancer will connect.
     */
    public readonly sizeInGb!: pulumi.Output<number>;
    /**
     * The support code for the disk. Include this code in your email to support when you have questions about a disk in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     */
    public /*out*/ readonly supportCode!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Disk resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DiskArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DiskArgs | DiskState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DiskState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["availabilityZone"] = state ? state.availabilityZone : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["sizeInGb"] = state ? state.sizeInGb : undefined;
            resourceInputs["supportCode"] = state ? state.supportCode : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as DiskArgs | undefined;
            if ((!args || args.availabilityZone === undefined) && !opts.urn) {
                throw new Error("Missing required property 'availabilityZone'");
            }
            if ((!args || args.sizeInGb === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sizeInGb'");
            }
            resourceInputs["availabilityZone"] = args ? args.availabilityZone : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["sizeInGb"] = args ? args.sizeInGb : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["supportCode"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Disk.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Disk resources.
 */
export interface DiskState {
    /**
     * The ARN of the Lightsail load balancer.
     */
    arn?: pulumi.Input<string>;
    /**
     * The Availability Zone in which to create your disk.
     */
    availabilityZone?: pulumi.Input<string>;
    /**
     * The timestamp when the load balancer was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * The name of the Lightsail load balancer.
     */
    name?: pulumi.Input<string>;
    /**
     * The instance port the load balancer will connect.
     */
    sizeInGb?: pulumi.Input<number>;
    /**
     * The support code for the disk. Include this code in your email to support when you have questions about a disk in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     */
    supportCode?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Disk resource.
 */
export interface DiskArgs {
    /**
     * The Availability Zone in which to create your disk.
     */
    availabilityZone: pulumi.Input<string>;
    /**
     * The name of the Lightsail load balancer.
     */
    name?: pulumi.Input<string>;
    /**
     * The instance port the load balancer will connect.
     */
    sizeInGb: pulumi.Input<number>;
    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
