// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This resource attaches a security group to an Elastic Network Interface (ENI).
 * It can be used to attach a security group to any existing ENI, be it a
 * secondary ENI or one attached as the primary interface on an instance.
 *
 * > **NOTE on instances, interfaces, and security groups:** This provider currently
 * provides the capability to assign security groups via the [`aws.ec2.Instance`][1]
 * and the [`aws.ec2.NetworkInterface`][2] resources. Using this resource in
 * conjunction with security groups provided in-line in those resources will cause
 * conflicts, and will lead to spurious diffs and undefined behavior - please use
 * one or the other.
 *
 * ## Example Usage
 *
 * The following provides a very basic example of setting up an instance (provided
 * by `instance`) in the default security group, creating a security group
 * (provided by `sg`) and then attaching the security group to the instance's
 * primary network interface via the `aws.ec2.NetworkInterfaceSecurityGroupAttachment` resource,
 * named `sgAttachment`:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const ami = aws.ec2.getAmi({
 *     mostRecent: true,
 *     filters: [{
 *         name: "name",
 *         values: ["amzn-ami-hvm-*"],
 *     }],
 *     owners: ["amazon"],
 * });
 * const instance = new aws.ec2.Instance("instance", {
 *     instanceType: "t2.micro",
 *     ami: ami.then(ami => ami.id),
 *     tags: {
 *         type: "test-instance",
 *     },
 * });
 * const sg = new aws.ec2.SecurityGroup("sg", {tags: {
 *     type: "test-security-group",
 * }});
 * const sgAttachment = new aws.ec2.NetworkInterfaceSecurityGroupAttachment("sg_attachment", {
 *     securityGroupId: sg.id,
 *     networkInterfaceId: instance.primaryNetworkInterfaceId,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * In this example, `instance` is provided by the `aws.ec2.Instance` data source,
 * fetching an external instance, possibly not managed by this provider.
 * `sgAttachment` then attaches to the output instance's `networkInterfaceId`:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const instance = aws.ec2.getInstance({
 *     instanceId: "i-1234567890abcdef0",
 * });
 * const sg = new aws.ec2.SecurityGroup("sg", {tags: {
 *     type: "test-security-group",
 * }});
 * const sgAttachment = new aws.ec2.NetworkInterfaceSecurityGroupAttachment("sg_attachment", {
 *     securityGroupId: sg.id,
 *     networkInterfaceId: instance.then(instance => instance.networkInterfaceId),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Network Interface Security Group attachments using the associated network interface ID and security group ID, separated by an underscore (`_`). For example:
 *
 * ```sh
 * $ pulumi import aws:ec2/networkInterfaceSecurityGroupAttachment:NetworkInterfaceSecurityGroupAttachment sg_attachment eni-1234567890abcdef0_sg-1234567890abcdef0
 * ```
 */
export class NetworkInterfaceSecurityGroupAttachment extends pulumi.CustomResource {
    /**
     * Get an existing NetworkInterfaceSecurityGroupAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkInterfaceSecurityGroupAttachmentState, opts?: pulumi.CustomResourceOptions): NetworkInterfaceSecurityGroupAttachment {
        return new NetworkInterfaceSecurityGroupAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/networkInterfaceSecurityGroupAttachment:NetworkInterfaceSecurityGroupAttachment';

    /**
     * Returns true if the given object is an instance of NetworkInterfaceSecurityGroupAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkInterfaceSecurityGroupAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkInterfaceSecurityGroupAttachment.__pulumiType;
    }

    /**
     * The ID of the network interface to attach to.
     */
    public readonly networkInterfaceId!: pulumi.Output<string>;
    /**
     * The ID of the security group.
     */
    public readonly securityGroupId!: pulumi.Output<string>;

    /**
     * Create a NetworkInterfaceSecurityGroupAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkInterfaceSecurityGroupAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkInterfaceSecurityGroupAttachmentArgs | NetworkInterfaceSecurityGroupAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkInterfaceSecurityGroupAttachmentState | undefined;
            resourceInputs["networkInterfaceId"] = state ? state.networkInterfaceId : undefined;
            resourceInputs["securityGroupId"] = state ? state.securityGroupId : undefined;
        } else {
            const args = argsOrState as NetworkInterfaceSecurityGroupAttachmentArgs | undefined;
            if ((!args || args.networkInterfaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkInterfaceId'");
            }
            if ((!args || args.securityGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityGroupId'");
            }
            resourceInputs["networkInterfaceId"] = args ? args.networkInterfaceId : undefined;
            resourceInputs["securityGroupId"] = args ? args.securityGroupId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkInterfaceSecurityGroupAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkInterfaceSecurityGroupAttachment resources.
 */
export interface NetworkInterfaceSecurityGroupAttachmentState {
    /**
     * The ID of the network interface to attach to.
     */
    networkInterfaceId?: pulumi.Input<string>;
    /**
     * The ID of the security group.
     */
    securityGroupId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NetworkInterfaceSecurityGroupAttachment resource.
 */
export interface NetworkInterfaceSecurityGroupAttachmentArgs {
    /**
     * The ID of the network interface to attach to.
     */
    networkInterfaceId: pulumi.Input<string>;
    /**
     * The ID of the security group.
     */
    securityGroupId: pulumi.Input<string>;
}
