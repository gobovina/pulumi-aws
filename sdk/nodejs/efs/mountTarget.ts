// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an Elastic File System (EFS) mount target.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const foo = new aws.ec2.Vpc("foo", {cidrBlock: "10.0.0.0/16"});
 * const alphaSubnet = new aws.ec2.Subnet("alpha", {
 *     vpcId: foo.id,
 *     availabilityZone: "us-west-2a",
 *     cidrBlock: "10.0.1.0/24",
 * });
 * const alpha = new aws.efs.MountTarget("alpha", {
 *     fileSystemId: fooAwsEfsFileSystem.id,
 *     subnetId: alphaSubnet.id,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import the EFS mount targets using the `id`. For example:
 *
 * ```sh
 * $ pulumi import aws:efs/mountTarget:MountTarget alpha fsmt-52a643fb
 * ```
 */
export class MountTarget extends pulumi.CustomResource {
    /**
     * Get an existing MountTarget resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MountTargetState, opts?: pulumi.CustomResourceOptions): MountTarget {
        return new MountTarget(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:efs/mountTarget:MountTarget';

    /**
     * Returns true if the given object is an instance of MountTarget.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MountTarget {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MountTarget.__pulumiType;
    }

    /**
     * The unique and consistent identifier of the Availability Zone (AZ) that the mount target resides in.
     */
    public /*out*/ readonly availabilityZoneId!: pulumi.Output<string>;
    /**
     * The name of the Availability Zone (AZ) that the mount target resides in.
     */
    public /*out*/ readonly availabilityZoneName!: pulumi.Output<string>;
    /**
     * The DNS name for the EFS file system.
     */
    public /*out*/ readonly dnsName!: pulumi.Output<string>;
    /**
     * Amazon Resource Name of the file system.
     */
    public /*out*/ readonly fileSystemArn!: pulumi.Output<string>;
    /**
     * The ID of the file system for which the mount target is intended.
     */
    public readonly fileSystemId!: pulumi.Output<string>;
    /**
     * The address (within the address range of the specified subnet) at
     * which the file system may be mounted via the mount target.
     */
    public readonly ipAddress!: pulumi.Output<string>;
    /**
     * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
     */
    public /*out*/ readonly mountTargetDnsName!: pulumi.Output<string>;
    /**
     * The ID of the network interface that Amazon EFS created when it created the mount target.
     */
    public /*out*/ readonly networkInterfaceId!: pulumi.Output<string>;
    /**
     * AWS account ID that owns the resource.
     */
    public /*out*/ readonly ownerId!: pulumi.Output<string>;
    /**
     * A list of up to 5 VPC security group IDs (that must
     * be for the same VPC as subnet specified) in effect for the mount target.
     */
    public readonly securityGroups!: pulumi.Output<string[]>;
    /**
     * The ID of the subnet to add the mount target in.
     */
    public readonly subnetId!: pulumi.Output<string>;

    /**
     * Create a MountTarget resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MountTargetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MountTargetArgs | MountTargetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MountTargetState | undefined;
            resourceInputs["availabilityZoneId"] = state ? state.availabilityZoneId : undefined;
            resourceInputs["availabilityZoneName"] = state ? state.availabilityZoneName : undefined;
            resourceInputs["dnsName"] = state ? state.dnsName : undefined;
            resourceInputs["fileSystemArn"] = state ? state.fileSystemArn : undefined;
            resourceInputs["fileSystemId"] = state ? state.fileSystemId : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["mountTargetDnsName"] = state ? state.mountTargetDnsName : undefined;
            resourceInputs["networkInterfaceId"] = state ? state.networkInterfaceId : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["securityGroups"] = state ? state.securityGroups : undefined;
            resourceInputs["subnetId"] = state ? state.subnetId : undefined;
        } else {
            const args = argsOrState as MountTargetArgs | undefined;
            if ((!args || args.fileSystemId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fileSystemId'");
            }
            if ((!args || args.subnetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetId'");
            }
            resourceInputs["fileSystemId"] = args ? args.fileSystemId : undefined;
            resourceInputs["ipAddress"] = args ? args.ipAddress : undefined;
            resourceInputs["securityGroups"] = args ? args.securityGroups : undefined;
            resourceInputs["subnetId"] = args ? args.subnetId : undefined;
            resourceInputs["availabilityZoneId"] = undefined /*out*/;
            resourceInputs["availabilityZoneName"] = undefined /*out*/;
            resourceInputs["dnsName"] = undefined /*out*/;
            resourceInputs["fileSystemArn"] = undefined /*out*/;
            resourceInputs["mountTargetDnsName"] = undefined /*out*/;
            resourceInputs["networkInterfaceId"] = undefined /*out*/;
            resourceInputs["ownerId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MountTarget.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MountTarget resources.
 */
export interface MountTargetState {
    /**
     * The unique and consistent identifier of the Availability Zone (AZ) that the mount target resides in.
     */
    availabilityZoneId?: pulumi.Input<string>;
    /**
     * The name of the Availability Zone (AZ) that the mount target resides in.
     */
    availabilityZoneName?: pulumi.Input<string>;
    /**
     * The DNS name for the EFS file system.
     */
    dnsName?: pulumi.Input<string>;
    /**
     * Amazon Resource Name of the file system.
     */
    fileSystemArn?: pulumi.Input<string>;
    /**
     * The ID of the file system for which the mount target is intended.
     */
    fileSystemId?: pulumi.Input<string>;
    /**
     * The address (within the address range of the specified subnet) at
     * which the file system may be mounted via the mount target.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
     */
    mountTargetDnsName?: pulumi.Input<string>;
    /**
     * The ID of the network interface that Amazon EFS created when it created the mount target.
     */
    networkInterfaceId?: pulumi.Input<string>;
    /**
     * AWS account ID that owns the resource.
     */
    ownerId?: pulumi.Input<string>;
    /**
     * A list of up to 5 VPC security group IDs (that must
     * be for the same VPC as subnet specified) in effect for the mount target.
     */
    securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the subnet to add the mount target in.
     */
    subnetId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MountTarget resource.
 */
export interface MountTargetArgs {
    /**
     * The ID of the file system for which the mount target is intended.
     */
    fileSystemId: pulumi.Input<string>;
    /**
     * The address (within the address range of the specified subnet) at
     * which the file system may be mounted via the mount target.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * A list of up to 5 VPC security group IDs (that must
     * be for the same VPC as subnet specified) in effect for the mount target.
     */
    securityGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the subnet to add the mount target in.
     */
    subnetId: pulumi.Input<string>;
}
