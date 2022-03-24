// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * This resource can be useful for getting back a list of route table ids to be referenced elsewhere.
 */
export function getRouteTables(args?: GetRouteTablesArgs, opts?: pulumi.InvokeOptions): Promise<GetRouteTablesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:ec2/getRouteTables:getRouteTables", {
        "filters": args.filters,
        "tags": args.tags,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRouteTables.
 */
export interface GetRouteTablesArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: inputs.ec2.GetRouteTablesFilter[];
    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired route tables.
     */
    tags?: {[key: string]: string};
    /**
     * The VPC ID that you want to filter from.
     */
    vpcId?: string;
}

/**
 * A collection of values returned by getRouteTables.
 */
export interface GetRouteTablesResult {
    readonly filters?: outputs.ec2.GetRouteTablesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of all the route table ids found.
     */
    readonly ids: string[];
    readonly tags: {[key: string]: string};
    readonly vpcId?: string;
}

export function getRouteTablesOutput(args?: GetRouteTablesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRouteTablesResult> {
    return pulumi.output(args).apply(a => getRouteTables(a, opts))
}

/**
 * A collection of arguments for invoking getRouteTables.
 */
export interface GetRouteTablesOutputArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2.GetRouteTablesFilterArgs>[]>;
    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired route tables.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The VPC ID that you want to filter from.
     */
    vpcId?: pulumi.Input<string>;
}
