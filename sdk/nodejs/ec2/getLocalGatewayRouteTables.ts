// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides information for multiple EC2 Local Gateway Route Tables, such as their identifiers.
 *
 * ## Example Usage
 *
 * The following shows outputing all Local Gateway Route Table Ids.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const fooLocalGatewayRouteTables = aws.ec2.getLocalGatewayRouteTables({});
 * export const foo = fooLocalGatewayRouteTables.then(fooLocalGatewayRouteTables => fooLocalGatewayRouteTables.ids);
 * ```
 */
export function getLocalGatewayRouteTables(args?: GetLocalGatewayRouteTablesArgs, opts?: pulumi.InvokeOptions): Promise<GetLocalGatewayRouteTablesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ec2/getLocalGatewayRouteTables:getLocalGatewayRouteTables", {
        "filters": args.filters,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getLocalGatewayRouteTables.
 */
export interface GetLocalGatewayRouteTablesArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: inputs.ec2.GetLocalGatewayRouteTablesFilter[];
    /**
     * Mapping of tags, each pair of which must exactly match
     * a pair on the desired local gateway route table.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getLocalGatewayRouteTables.
 */
export interface GetLocalGatewayRouteTablesResult {
    readonly filters?: outputs.ec2.GetLocalGatewayRouteTablesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Set of Local Gateway Route Table identifiers
     */
    readonly ids: string[];
    readonly tags: {[key: string]: string};
}
/**
 * Provides information for multiple EC2 Local Gateway Route Tables, such as their identifiers.
 *
 * ## Example Usage
 *
 * The following shows outputing all Local Gateway Route Table Ids.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const fooLocalGatewayRouteTables = aws.ec2.getLocalGatewayRouteTables({});
 * export const foo = fooLocalGatewayRouteTables.then(fooLocalGatewayRouteTables => fooLocalGatewayRouteTables.ids);
 * ```
 */
export function getLocalGatewayRouteTablesOutput(args?: GetLocalGatewayRouteTablesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLocalGatewayRouteTablesResult> {
    return pulumi.output(args).apply((a: any) => getLocalGatewayRouteTables(a, opts))
}

/**
 * A collection of arguments for invoking getLocalGatewayRouteTables.
 */
export interface GetLocalGatewayRouteTablesOutputArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2.GetLocalGatewayRouteTablesFilterArgs>[]>;
    /**
     * Mapping of tags, each pair of which must exactly match
     * a pair on the desired local gateway route table.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
