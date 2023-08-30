// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an AWS Storage Gateway upload buffer.
 *
 * > **NOTE:** The Storage Gateway API provides no method to remove an upload buffer disk. Destroying this resource does not perform any Storage Gateway actions.
 *
 * ## Example Usage
 * ### Cached and VTL Gateway Type
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const testLocalDisk = aws.storagegateway.getLocalDisk({
 *     diskNode: aws_volume_attachment.test.device_name,
 *     gatewayArn: aws_storagegateway_gateway.test.arn,
 * });
 * const testUploadBuffer = new aws.storagegateway.UploadBuffer("testUploadBuffer", {
 *     diskPath: testLocalDisk.then(testLocalDisk => testLocalDisk.diskPath),
 *     gatewayArn: aws_storagegateway_gateway.test.arn,
 * });
 * ```
 * ### Stored Gateway Type
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.storagegateway.getLocalDisk({
 *     diskNode: aws_volume_attachment.test.device_name,
 *     gatewayArn: aws_storagegateway_gateway.test.arn,
 * });
 * const example = new aws.storagegateway.UploadBuffer("example", {
 *     diskId: data.aws_storagegateway_local_disk.example.id,
 *     gatewayArn: aws_storagegateway_gateway.example.arn,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_storagegateway_upload_buffer` using the gateway Amazon Resource Name (ARN) and local disk identifier separated with a colon (`:`). For example:
 *
 * ```sh
 *  $ pulumi import aws:storagegateway/uploadBuffer:UploadBuffer example arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678:pci-0000:03:00.0-scsi-0:0:0:0
 * ```
 */
export class UploadBuffer extends pulumi.CustomResource {
    /**
     * Get an existing UploadBuffer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UploadBufferState, opts?: pulumi.CustomResourceOptions): UploadBuffer {
        return new UploadBuffer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:storagegateway/uploadBuffer:UploadBuffer';

    /**
     * Returns true if the given object is an instance of UploadBuffer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UploadBuffer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UploadBuffer.__pulumiType;
    }

    /**
     * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
     */
    public readonly diskId!: pulumi.Output<string>;
    /**
     * Local disk path. For example, `/dev/nvme1n1`.
     */
    public readonly diskPath!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) of the gateway.
     */
    public readonly gatewayArn!: pulumi.Output<string>;

    /**
     * Create a UploadBuffer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UploadBufferArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UploadBufferArgs | UploadBufferState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UploadBufferState | undefined;
            resourceInputs["diskId"] = state ? state.diskId : undefined;
            resourceInputs["diskPath"] = state ? state.diskPath : undefined;
            resourceInputs["gatewayArn"] = state ? state.gatewayArn : undefined;
        } else {
            const args = argsOrState as UploadBufferArgs | undefined;
            if ((!args || args.gatewayArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'gatewayArn'");
            }
            resourceInputs["diskId"] = args ? args.diskId : undefined;
            resourceInputs["diskPath"] = args ? args.diskPath : undefined;
            resourceInputs["gatewayArn"] = args ? args.gatewayArn : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UploadBuffer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UploadBuffer resources.
 */
export interface UploadBufferState {
    /**
     * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
     */
    diskId?: pulumi.Input<string>;
    /**
     * Local disk path. For example, `/dev/nvme1n1`.
     */
    diskPath?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the gateway.
     */
    gatewayArn?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UploadBuffer resource.
 */
export interface UploadBufferArgs {
    /**
     * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
     */
    diskId?: pulumi.Input<string>;
    /**
     * Local disk path. For example, `/dev/nvme1n1`.
     */
    diskPath?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the gateway.
     */
    gatewayArn: pulumi.Input<string>;
}
