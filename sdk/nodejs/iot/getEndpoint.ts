// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Returns a unique endpoint specific to the AWS account making the call.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as kubernetes from "@pulumi/kubernetes";
 *
 * const example = aws.iot.getEndpoint({});
 * const agent = new kubernetes.index.Pod("agent", {
 *     metadata: [{
 *         name: "my-device",
 *     }],
 *     spec: [{
 *         container: [{
 *             image: "gcr.io/my-project/image-name",
 *             name: "image-name",
 *             env: [{
 *                 name: "IOT_ENDPOINT",
 *                 value: example.endpointAddress,
 *             }],
 *         }],
 *     }],
 * });
 * ```
 */
export function getEndpoint(args?: GetEndpointArgs, opts?: pulumi.InvokeOptions): Promise<GetEndpointResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:iot/getEndpoint:getEndpoint", {
        "endpointType": args.endpointType,
    }, opts);
}

/**
 * A collection of arguments for invoking getEndpoint.
 */
export interface GetEndpointArgs {
    /**
     * Endpoint type. Valid values: `iot:CredentialProvider`, `iot:Data`, `iot:Data-ATS`, `iot:Jobs`.
     */
    endpointType?: string;
}

/**
 * A collection of values returned by getEndpoint.
 */
export interface GetEndpointResult {
    /**
     * Endpoint based on `endpointType`:
     * * No `endpointType`: Either `iot:Data` or `iot:Data-ATS` [depending on region](https://aws.amazon.com/blogs/iot/aws-iot-core-ats-endpoints/)
     * * `iot:CredentialsProvider`: `IDENTIFIER.credentials.iot.REGION.amazonaws.com`
     * * `iot:Data`: `IDENTIFIER.iot.REGION.amazonaws.com`
     * * `iot:Data-ATS`: `IDENTIFIER-ats.iot.REGION.amazonaws.com`
     * * `iot:Jobs`: `IDENTIFIER.jobs.iot.REGION.amazonaws.com`
     */
    readonly endpointAddress: string;
    readonly endpointType?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/**
 * Returns a unique endpoint specific to the AWS account making the call.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as kubernetes from "@pulumi/kubernetes";
 *
 * const example = aws.iot.getEndpoint({});
 * const agent = new kubernetes.index.Pod("agent", {
 *     metadata: [{
 *         name: "my-device",
 *     }],
 *     spec: [{
 *         container: [{
 *             image: "gcr.io/my-project/image-name",
 *             name: "image-name",
 *             env: [{
 *                 name: "IOT_ENDPOINT",
 *                 value: example.endpointAddress,
 *             }],
 *         }],
 *     }],
 * });
 * ```
 */
export function getEndpointOutput(args?: GetEndpointOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEndpointResult> {
    return pulumi.output(args).apply((a: any) => getEndpoint(a, opts))
}

/**
 * A collection of arguments for invoking getEndpoint.
 */
export interface GetEndpointOutputArgs {
    /**
     * Endpoint type. Valid values: `iot:CredentialProvider`, `iot:Data`, `iot:Data-ATS`, `iot:Jobs`.
     */
    endpointType?: pulumi.Input<string>;
}
