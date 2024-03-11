// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Use this data source to get the pricing information of all products in AWS.
 * This data source is only available in a us-east-1 or ap-south-1 provider.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.pricing.getProduct({
 *     serviceCode: "AmazonEC2",
 *     filters: [
 *         {
 *             field: "instanceType",
 *             value: "c5.xlarge",
 *         },
 *         {
 *             field: "operatingSystem",
 *             value: "Linux",
 *         },
 *         {
 *             field: "location",
 *             value: "US East (N. Virginia)",
 *         },
 *         {
 *             field: "preInstalledSw",
 *             value: "NA",
 *         },
 *         {
 *             field: "licenseModel",
 *             value: "No License required",
 *         },
 *         {
 *             field: "tenancy",
 *             value: "Shared",
 *         },
 *         {
 *             field: "capacitystatus",
 *             value: "Used",
 *         },
 *     ],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.pricing.getProduct({
 *     serviceCode: "AmazonRedshift",
 *     filters: [
 *         {
 *             field: "instanceType",
 *             value: "ds1.xlarge",
 *         },
 *         {
 *             field: "location",
 *             value: "US East (N. Virginia)",
 *         },
 *     ],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getProduct(args: GetProductArgs, opts?: pulumi.InvokeOptions): Promise<GetProductResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:pricing/getProduct:getProduct", {
        "filters": args.filters,
        "serviceCode": args.serviceCode,
    }, opts);
}

/**
 * A collection of arguments for invoking getProduct.
 */
export interface GetProductArgs {
    /**
     * List of filters. Passed directly to the API (see GetProducts API reference). These filters must describe a single product, this resource will fail if more than one product is returned by the API.
     */
    filters: inputs.pricing.GetProductFilter[];
    /**
     * Code of the service. Available service codes can be fetched using the DescribeServices pricing API call.
     */
    serviceCode: string;
}

/**
 * A collection of values returned by getProduct.
 */
export interface GetProductResult {
    readonly filters: outputs.pricing.GetProductFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Set to the product returned from the API.
     */
    readonly result: string;
    readonly serviceCode: string;
}
/**
 * Use this data source to get the pricing information of all products in AWS.
 * This data source is only available in a us-east-1 or ap-south-1 provider.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.pricing.getProduct({
 *     serviceCode: "AmazonEC2",
 *     filters: [
 *         {
 *             field: "instanceType",
 *             value: "c5.xlarge",
 *         },
 *         {
 *             field: "operatingSystem",
 *             value: "Linux",
 *         },
 *         {
 *             field: "location",
 *             value: "US East (N. Virginia)",
 *         },
 *         {
 *             field: "preInstalledSw",
 *             value: "NA",
 *         },
 *         {
 *             field: "licenseModel",
 *             value: "No License required",
 *         },
 *         {
 *             field: "tenancy",
 *             value: "Shared",
 *         },
 *         {
 *             field: "capacitystatus",
 *             value: "Used",
 *         },
 *     ],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.pricing.getProduct({
 *     serviceCode: "AmazonRedshift",
 *     filters: [
 *         {
 *             field: "instanceType",
 *             value: "ds1.xlarge",
 *         },
 *         {
 *             field: "location",
 *             value: "US East (N. Virginia)",
 *         },
 *     ],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getProductOutput(args: GetProductOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetProductResult> {
    return pulumi.output(args).apply((a: any) => getProduct(a, opts))
}

/**
 * A collection of arguments for invoking getProduct.
 */
export interface GetProductOutputArgs {
    /**
     * List of filters. Passed directly to the API (see GetProducts API reference). These filters must describe a single product, this resource will fail if more than one product is returned by the API.
     */
    filters: pulumi.Input<pulumi.Input<inputs.pricing.GetProductFilterArgs>[]>;
    /**
     * Code of the service. Available service codes can be fetched using the DescribeServices pricing API call.
     */
    serviceCode: pulumi.Input<string>;
}
