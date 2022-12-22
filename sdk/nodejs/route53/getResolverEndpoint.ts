// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * `aws.route53.ResolverEndpoint` provides details about a specific Route53 Resolver Endpoint.
 *
 * This data source allows to find a list of IPaddresses associated with a specific Route53 Resolver Endpoint.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.route53.getResolverEndpoint({
 *     resolverEndpointId: "rslvr-in-1abc2345ef678g91h",
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.route53.getResolverEndpoint({
 *     filters: [{
 *         name: "NAME",
 *         values: ["MyResolverExampleName"],
 *     }],
 * });
 * ```
 */
export function getResolverEndpoint(args?: GetResolverEndpointArgs, opts?: pulumi.InvokeOptions): Promise<GetResolverEndpointResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:route53/getResolverEndpoint:getResolverEndpoint", {
        "filters": args.filters,
        "resolverEndpointId": args.resolverEndpointId,
    }, opts);
}

/**
 * A collection of arguments for invoking getResolverEndpoint.
 */
export interface GetResolverEndpointArgs {
    /**
     * One or more name/value pairs to use as filters. There are
     * several valid keys, for a full reference, check out
     * [Route53resolver Filter value in the AWS API reference][1].
     */
    filters?: inputs.route53.GetResolverEndpointFilter[];
    /**
     * ID of the Route53 Resolver Endpoint.
     */
    resolverEndpointId?: string;
}

/**
 * A collection of values returned by getResolverEndpoint.
 */
export interface GetResolverEndpointResult {
    readonly arn: string;
    readonly direction: string;
    readonly filters?: outputs.route53.GetResolverEndpointFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ipAddresses: string[];
    readonly name: string;
    readonly resolverEndpointId?: string;
    readonly status: string;
    readonly vpcId: string;
}
/**
 * `aws.route53.ResolverEndpoint` provides details about a specific Route53 Resolver Endpoint.
 *
 * This data source allows to find a list of IPaddresses associated with a specific Route53 Resolver Endpoint.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.route53.getResolverEndpoint({
 *     resolverEndpointId: "rslvr-in-1abc2345ef678g91h",
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.route53.getResolverEndpoint({
 *     filters: [{
 *         name: "NAME",
 *         values: ["MyResolverExampleName"],
 *     }],
 * });
 * ```
 */
export function getResolverEndpointOutput(args?: GetResolverEndpointOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetResolverEndpointResult> {
    return pulumi.output(args).apply((a: any) => getResolverEndpoint(a, opts))
}

/**
 * A collection of arguments for invoking getResolverEndpoint.
 */
export interface GetResolverEndpointOutputArgs {
    /**
     * One or more name/value pairs to use as filters. There are
     * several valid keys, for a full reference, check out
     * [Route53resolver Filter value in the AWS API reference][1].
     */
    filters?: pulumi.Input<pulumi.Input<inputs.route53.GetResolverEndpointFilterArgs>[]>;
    /**
     * ID of the Route53 Resolver Endpoint.
     */
    resolverEndpointId?: pulumi.Input<string>;
}
