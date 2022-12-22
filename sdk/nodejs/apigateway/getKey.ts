// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get the name and value of a pre-existing API Key, for
 * example to supply credentials for a dependency microservice.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const myApiKey = aws.apigateway.getKey({
 *     id: "ru3mpjgse6",
 * });
 * ```
 */
export function getKey(args: GetKeyArgs, opts?: pulumi.InvokeOptions): Promise<GetKeyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:apigateway/getKey:getKey", {
        "id": args.id,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getKey.
 */
export interface GetKeyArgs {
    /**
     * ID of the API Key to look up.
     */
    id: string;
    /**
     * Map of tags for the resource.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getKey.
 */
export interface GetKeyResult {
    /**
     * Date and time when the API Key was created.
     */
    readonly createdDate: string;
    /**
     * Description of the API Key.
     */
    readonly description: string;
    /**
     * Whether the API Key is enabled.
     */
    readonly enabled: boolean;
    /**
     * Set to the ID of the API Key.
     */
    readonly id: string;
    /**
     * Date and time when the API Key was last updated.
     */
    readonly lastUpdatedDate: string;
    /**
     * Set to the name of the API Key.
     */
    readonly name: string;
    /**
     * Map of tags for the resource.
     */
    readonly tags: {[key: string]: string};
    /**
     * Set to the value of the API Key.
     */
    readonly value: string;
}
/**
 * Use this data source to get the name and value of a pre-existing API Key, for
 * example to supply credentials for a dependency microservice.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const myApiKey = aws.apigateway.getKey({
 *     id: "ru3mpjgse6",
 * });
 * ```
 */
export function getKeyOutput(args: GetKeyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKeyResult> {
    return pulumi.output(args).apply((a: any) => getKey(a, opts))
}

/**
 * A collection of arguments for invoking getKey.
 */
export interface GetKeyOutputArgs {
    /**
     * ID of the API Key to look up.
     */
    id: pulumi.Input<string>;
    /**
     * Map of tags for the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
