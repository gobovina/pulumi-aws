// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Get information on an EC2 Transit Gateway VPC Attachment.
 *
 * ## Example Usage
 * ### By Filter
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ec2transitgateway.getVpcAttachment({
 *     filters: [{
 *         name: "vpc-id",
 *         values: ["vpc-12345678"],
 *     }],
 * });
 * ```
 * ### By Identifier
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ec2transitgateway.getVpcAttachment({
 *     id: "tgw-attach-12345678",
 * });
 * ```
 */
export function getVpcAttachment(args?: GetVpcAttachmentArgs, opts?: pulumi.InvokeOptions): Promise<GetVpcAttachmentResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ec2transitgateway/getVpcAttachment:getVpcAttachment", {
        "filters": args.filters,
        "id": args.id,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpcAttachment.
 */
export interface GetVpcAttachmentArgs {
    /**
     * One or more configuration blocks containing name-values filters. Detailed below.
     */
    filters?: inputs.ec2transitgateway.GetVpcAttachmentFilter[];
    /**
     * Identifier of the EC2 Transit Gateway VPC Attachment.
     */
    id?: string;
    /**
     * Key-value tags for the EC2 Transit Gateway VPC Attachment
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getVpcAttachment.
 */
export interface GetVpcAttachmentResult {
    /**
     * Whether Appliance Mode support is enabled.
     */
    readonly applianceModeSupport: string;
    /**
     * Whether DNS support is enabled.
     */
    readonly dnsSupport: string;
    readonly filters?: outputs.ec2transitgateway.GetVpcAttachmentFilter[];
    /**
     * EC2 Transit Gateway VPC Attachment identifier
     */
    readonly id: string;
    /**
     * Whether IPv6 support is enabled.
     */
    readonly ipv6Support: string;
    /**
     * Identifiers of EC2 Subnets.
     */
    readonly subnetIds: string[];
    /**
     * Key-value tags for the EC2 Transit Gateway VPC Attachment
     */
    readonly tags: {[key: string]: string};
    /**
     * EC2 Transit Gateway identifier
     */
    readonly transitGatewayId: string;
    /**
     * Identifier of EC2 VPC.
     */
    readonly vpcId: string;
    /**
     * Identifier of the AWS account that owns the EC2 VPC.
     */
    readonly vpcOwnerId: string;
}
/**
 * Get information on an EC2 Transit Gateway VPC Attachment.
 *
 * ## Example Usage
 * ### By Filter
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ec2transitgateway.getVpcAttachment({
 *     filters: [{
 *         name: "vpc-id",
 *         values: ["vpc-12345678"],
 *     }],
 * });
 * ```
 * ### By Identifier
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ec2transitgateway.getVpcAttachment({
 *     id: "tgw-attach-12345678",
 * });
 * ```
 */
export function getVpcAttachmentOutput(args?: GetVpcAttachmentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVpcAttachmentResult> {
    return pulumi.output(args).apply((a: any) => getVpcAttachment(a, opts))
}

/**
 * A collection of arguments for invoking getVpcAttachment.
 */
export interface GetVpcAttachmentOutputArgs {
    /**
     * One or more configuration blocks containing name-values filters. Detailed below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2transitgateway.GetVpcAttachmentFilterArgs>[]>;
    /**
     * Identifier of the EC2 Transit Gateway VPC Attachment.
     */
    id?: pulumi.Input<string>;
    /**
     * Key-value tags for the EC2 Transit Gateway VPC Attachment
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
