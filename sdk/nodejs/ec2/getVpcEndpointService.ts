// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * The VPC Endpoint Service data source details about a specific service that
 * can be specified when creating a VPC endpoint within the region configured in the provider.
 *
 * ## Example Usage
 *
 * ### AWS Service
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * // Declare the data source
 * const s3 = aws.ec2.getVpcEndpointService({
 *     service: "s3",
 *     serviceType: "Gateway",
 * });
 * // Create a VPC
 * const foo = new aws.ec2.Vpc("foo", {cidrBlock: "10.0.0.0/16"});
 * // Create a VPC endpoint
 * const ep = new aws.ec2.VpcEndpoint("ep", {
 *     vpcId: foo.id,
 *     serviceName: s3.then(s3 => s3.serviceName),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Non-AWS Service
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const custome = aws.ec2.getVpcEndpointService({
 *     serviceName: "com.amazonaws.vpce.us-west-2.vpce-svc-0e87519c997c63cd8",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Filter
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.ec2.getVpcEndpointService({
 *     filters: [{
 *         name: "service-name",
 *         values: ["some-service"],
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getVpcEndpointService(args?: GetVpcEndpointServiceArgs, opts?: pulumi.InvokeOptions): Promise<GetVpcEndpointServiceResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ec2/getVpcEndpointService:getVpcEndpointService", {
        "filters": args.filters,
        "service": args.service,
        "serviceName": args.serviceName,
        "serviceType": args.serviceType,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpcEndpointService.
 */
export interface GetVpcEndpointServiceArgs {
    /**
     * Configuration block(s) for filtering. Detailed below.
     */
    filters?: inputs.ec2.GetVpcEndpointServiceFilter[];
    /**
     * Common name of an AWS service (e.g., `s3`).
     */
    service?: string;
    /**
     * Service name that is specified when creating a VPC endpoint. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
     */
    serviceName?: string;
    /**
     * Service type, `Gateway` or `Interface`.
     */
    serviceType?: string;
    /**
     * Map of tags, each pair of which must exactly match a pair on the desired VPC Endpoint Service.
     *
     * > **NOTE:** Specifying `service` will not work for non-AWS services or AWS services that don't follow the standard `serviceName` pattern of `com.amazonaws.<region>.<service>`.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getVpcEndpointService.
 */
export interface GetVpcEndpointServiceResult {
    /**
     * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
     */
    readonly acceptanceRequired: boolean;
    /**
     * ARN of the VPC endpoint service.
     */
    readonly arn: string;
    /**
     * Availability Zones in which the service is available.
     */
    readonly availabilityZones: string[];
    /**
     * The DNS names for the service.
     */
    readonly baseEndpointDnsNames: string[];
    readonly filters?: outputs.ec2.GetVpcEndpointServiceFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Whether or not the service manages its VPC endpoints - `true` or `false`.
     */
    readonly managesVpcEndpoints: boolean;
    /**
     * AWS account ID of the service owner or `amazon`.
     */
    readonly owner: string;
    /**
     * Private DNS name for the service.
     */
    readonly privateDnsName: string;
    readonly service?: string;
    /**
     * ID of the endpoint service.
     */
    readonly serviceId: string;
    readonly serviceName: string;
    readonly serviceType: string;
    /**
     * The supported IP address types.
     */
    readonly supportedIpAddressTypes: string[];
    /**
     * Map of tags assigned to the resource.
     */
    readonly tags: {[key: string]: string};
    /**
     * Whether or not the service supports endpoint policies - `true` or `false`.
     */
    readonly vpcEndpointPolicySupported: boolean;
}
/**
 * The VPC Endpoint Service data source details about a specific service that
 * can be specified when creating a VPC endpoint within the region configured in the provider.
 *
 * ## Example Usage
 *
 * ### AWS Service
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * // Declare the data source
 * const s3 = aws.ec2.getVpcEndpointService({
 *     service: "s3",
 *     serviceType: "Gateway",
 * });
 * // Create a VPC
 * const foo = new aws.ec2.Vpc("foo", {cidrBlock: "10.0.0.0/16"});
 * // Create a VPC endpoint
 * const ep = new aws.ec2.VpcEndpoint("ep", {
 *     vpcId: foo.id,
 *     serviceName: s3.then(s3 => s3.serviceName),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Non-AWS Service
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const custome = aws.ec2.getVpcEndpointService({
 *     serviceName: "com.amazonaws.vpce.us-west-2.vpce-svc-0e87519c997c63cd8",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Filter
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.ec2.getVpcEndpointService({
 *     filters: [{
 *         name: "service-name",
 *         values: ["some-service"],
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getVpcEndpointServiceOutput(args?: GetVpcEndpointServiceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVpcEndpointServiceResult> {
    return pulumi.output(args).apply((a: any) => getVpcEndpointService(a, opts))
}

/**
 * A collection of arguments for invoking getVpcEndpointService.
 */
export interface GetVpcEndpointServiceOutputArgs {
    /**
     * Configuration block(s) for filtering. Detailed below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2.GetVpcEndpointServiceFilterArgs>[]>;
    /**
     * Common name of an AWS service (e.g., `s3`).
     */
    service?: pulumi.Input<string>;
    /**
     * Service name that is specified when creating a VPC endpoint. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
     */
    serviceName?: pulumi.Input<string>;
    /**
     * Service type, `Gateway` or `Interface`.
     */
    serviceType?: pulumi.Input<string>;
    /**
     * Map of tags, each pair of which must exactly match a pair on the desired VPC Endpoint Service.
     *
     * > **NOTE:** Specifying `service` will not work for non-AWS services or AWS services that don't follow the standard `serviceName` pattern of `com.amazonaws.<region>.<service>`.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
