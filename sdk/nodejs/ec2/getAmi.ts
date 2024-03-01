// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Use this data source to get the ID of a registered AMI for use in other
 * resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ec2.getAmi({
 *     executableUsers: ["self"],
 *     mostRecent: true,
 *     nameRegex: "^myami-\\d{3}",
 *     owners: ["self"],
 *     filters: [
 *         {
 *             name: "name",
 *             values: ["myami-*"],
 *         },
 *         {
 *             name: "root-device-type",
 *             values: ["ebs"],
 *         },
 *         {
 *             name: "virtualization-type",
 *             values: ["hvm"],
 *         },
 *     ],
 * });
 * ```
 */
export function getAmi(args?: GetAmiArgs, opts?: pulumi.InvokeOptions): Promise<GetAmiResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ec2/getAmi:getAmi", {
        "executableUsers": args.executableUsers,
        "filters": args.filters,
        "includeDeprecated": args.includeDeprecated,
        "mostRecent": args.mostRecent,
        "nameRegex": args.nameRegex,
        "owners": args.owners,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getAmi.
 */
export interface GetAmiArgs {
    /**
     * Limit search to users with *explicit* launch permission on
     * the image. Valid items are the numeric account ID or `self`.
     */
    executableUsers?: string[];
    /**
     * One or more name/value pairs to filter off of. There are
     * several valid keys, for a full reference, check out
     * [describe-images in the AWS CLI reference][1].
     */
    filters?: inputs.ec2.GetAmiFilter[];
    /**
     * If true, all deprecated AMIs are included in the response. If false, no deprecated AMIs are included in the response. If no value is specified, the default value is false.
     */
    includeDeprecated?: boolean;
    /**
     * If more than one result is returned, use the most
     * recent AMI.
     */
    mostRecent?: boolean;
    /**
     * Regex string to apply to the AMI list returned
     * by AWS. This allows more advanced filtering not supported from the AWS API. This
     * filtering is done locally on what AWS returns, and could have a performance
     * impact if the result is large. Combine this with other
     * options to narrow down the list AWS returns.
     *
     * > **NOTE:** If more or less than a single match is returned by the search,
     * this call will fail. Ensure that your search is specific enough to return
     * a single AMI ID only, or use `mostRecent` to choose the most recent one. If
     * you want to match multiple AMIs, use the `aws.ec2.getAmiIds` data source instead.
     */
    nameRegex?: string;
    /**
     * List of AMI owners to limit search. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g., `amazon`, `aws-marketplace`, `microsoft`).
     */
    owners?: string[];
    /**
     * Any tags assigned to the image.
     * * `tags.#.key` - Key name of the tag.
     * * `tags.#.value` - Value of the tag.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getAmi.
 */
export interface GetAmiResult {
    /**
     * OS architecture of the AMI (ie: `i386` or `x8664`).
     */
    readonly architecture: string;
    /**
     * ARN of the AMI.
     */
    readonly arn: string;
    /**
     * Set of objects with block device mappings of the AMI.
     */
    readonly blockDeviceMappings: outputs.ec2.GetAmiBlockDeviceMapping[];
    /**
     * Boot mode of the image.
     */
    readonly bootMode: string;
    /**
     * Date and time the image was created.
     */
    readonly creationDate: string;
    /**
     * Date and time when the image will be deprecated.
     */
    readonly deprecationTime: string;
    /**
     * Description of the AMI that was provided during image
     * creation.
     */
    readonly description: string;
    /**
     * Whether enhanced networking with ENA is enabled.
     */
    readonly enaSupport: boolean;
    readonly executableUsers?: string[];
    readonly filters?: outputs.ec2.GetAmiFilter[];
    /**
     * Hypervisor type of the image.
     */
    readonly hypervisor: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * ID of the AMI. Should be the same as the resource `id`.
     */
    readonly imageId: string;
    /**
     * Location of the AMI.
     */
    readonly imageLocation: string;
    /**
     * AWS account alias (for example, `amazon`, `self`) or
     * the AWS account ID of the AMI owner.
     */
    readonly imageOwnerAlias: string;
    /**
     * Type of image.
     */
    readonly imageType: string;
    /**
     * Instance Metadata Service (IMDS) support mode for the image. Set to `v2.0` if instances ran from this image enforce IMDSv2.
     */
    readonly imdsSupport: string;
    readonly includeDeprecated?: boolean;
    /**
     * Kernel associated with the image, if any. Only applicable
     * for machine images.
     */
    readonly kernelId: string;
    readonly mostRecent?: boolean;
    /**
     * Name of the AMI that was provided during image creation.
     */
    readonly name: string;
    readonly nameRegex?: string;
    /**
     * AWS account ID of the image owner.
     */
    readonly ownerId: string;
    readonly owners?: string[];
    /**
     * Value is Windows for `Windows` AMIs; otherwise blank.
     */
    readonly platform: string;
    /**
     * Platform details associated with the billing code of the AMI.
     */
    readonly platformDetails: string;
    /**
     * Any product codes associated with the AMI.
     * * `product_codes.#.product_code_id` - The product code.
     * * `product_codes.#.product_code_type` - The type of product code.
     */
    readonly productCodes: outputs.ec2.GetAmiProductCode[];
    /**
     * `true` if the image has public launch permissions.
     */
    readonly public: boolean;
    /**
     * RAM disk associated with the image, if any. Only applicable
     * for machine images.
     */
    readonly ramdiskId: string;
    /**
     * Device name of the root device.
     */
    readonly rootDeviceName: string;
    /**
     * Type of root device (ie: `ebs` or `instance-store`).
     */
    readonly rootDeviceType: string;
    /**
     * Snapshot id associated with the root device, if any
     * (only applies to `ebs` root devices).
     */
    readonly rootSnapshotId: string;
    /**
     * Whether enhanced networking is enabled.
     */
    readonly sriovNetSupport: string;
    /**
     * Current state of the AMI. If the state is `available`, the image
     * is successfully registered and can be used to launch an instance.
     */
    readonly state: string;
    /**
     * Describes a state change. Fields are `UNSET` if not available.
     * * `state_reason.code` - The reason code for the state change.
     * * `state_reason.message` - The message for the state change.
     */
    readonly stateReason: {[key: string]: string};
    /**
     * Any tags assigned to the image.
     * * `tags.#.key` - Key name of the tag.
     * * `tags.#.value` - Value of the tag.
     */
    readonly tags: {[key: string]: string};
    /**
     * If the image is configured for NitroTPM support, the value is `v2.0`.
     */
    readonly tpmSupport: string;
    /**
     * Operation of the Amazon EC2 instance and the billing code that is associated with the AMI.
     */
    readonly usageOperation: string;
    /**
     * Type of virtualization of the AMI (ie: `hvm` or
     * `paravirtual`).
     */
    readonly virtualizationType: string;
}
/**
 * Use this data source to get the ID of a registered AMI for use in other
 * resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ec2.getAmi({
 *     executableUsers: ["self"],
 *     mostRecent: true,
 *     nameRegex: "^myami-\\d{3}",
 *     owners: ["self"],
 *     filters: [
 *         {
 *             name: "name",
 *             values: ["myami-*"],
 *         },
 *         {
 *             name: "root-device-type",
 *             values: ["ebs"],
 *         },
 *         {
 *             name: "virtualization-type",
 *             values: ["hvm"],
 *         },
 *     ],
 * });
 * ```
 */
export function getAmiOutput(args?: GetAmiOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAmiResult> {
    return pulumi.output(args).apply((a: any) => getAmi(a, opts))
}

/**
 * A collection of arguments for invoking getAmi.
 */
export interface GetAmiOutputArgs {
    /**
     * Limit search to users with *explicit* launch permission on
     * the image. Valid items are the numeric account ID or `self`.
     */
    executableUsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more name/value pairs to filter off of. There are
     * several valid keys, for a full reference, check out
     * [describe-images in the AWS CLI reference][1].
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2.GetAmiFilterArgs>[]>;
    /**
     * If true, all deprecated AMIs are included in the response. If false, no deprecated AMIs are included in the response. If no value is specified, the default value is false.
     */
    includeDeprecated?: pulumi.Input<boolean>;
    /**
     * If more than one result is returned, use the most
     * recent AMI.
     */
    mostRecent?: pulumi.Input<boolean>;
    /**
     * Regex string to apply to the AMI list returned
     * by AWS. This allows more advanced filtering not supported from the AWS API. This
     * filtering is done locally on what AWS returns, and could have a performance
     * impact if the result is large. Combine this with other
     * options to narrow down the list AWS returns.
     *
     * > **NOTE:** If more or less than a single match is returned by the search,
     * this call will fail. Ensure that your search is specific enough to return
     * a single AMI ID only, or use `mostRecent` to choose the most recent one. If
     * you want to match multiple AMIs, use the `aws.ec2.getAmiIds` data source instead.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * List of AMI owners to limit search. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g., `amazon`, `aws-marketplace`, `microsoft`).
     */
    owners?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Any tags assigned to the image.
     * * `tags.#.key` - Key name of the tag.
     * * `tags.#.value` - Value of the tag.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
