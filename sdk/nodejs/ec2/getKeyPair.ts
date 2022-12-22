// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Use this data source to get information about a specific EC2 Key Pair.
 *
 * ## Example Usage
 *
 * The following example shows how to get a EC2 Key Pair including the public key material from its name.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ec2.getKeyPair({
 *     keyName: "test",
 *     includePublicKey: true,
 *     filters: [{
 *         name: "tag:Component",
 *         values: ["web"],
 *     }],
 * });
 * export const fingerprint = example.then(example => example.fingerprint);
 * export const name = example.then(example => example.keyName);
 * export const id = example.then(example => example.id);
 * ```
 */
export function getKeyPair(args?: GetKeyPairArgs, opts?: pulumi.InvokeOptions): Promise<GetKeyPairResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ec2/getKeyPair:getKeyPair", {
        "filters": args.filters,
        "includePublicKey": args.includePublicKey,
        "keyName": args.keyName,
        "keyPairId": args.keyPairId,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getKeyPair.
 */
export interface GetKeyPairArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: inputs.ec2.GetKeyPairFilter[];
    /**
     * Whether to include the public key material in the response.
     */
    includePublicKey?: boolean;
    /**
     * Key Pair name.
     */
    keyName?: string;
    /**
     * Key Pair ID.
     */
    keyPairId?: string;
    /**
     * Any tags assigned to the Key Pair.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getKeyPair.
 */
export interface GetKeyPairResult {
    /**
     * ARN of the Key Pair.
     */
    readonly arn: string;
    /**
     * Timestamp for when the key pair was created in ISO 8601 format.
     */
    readonly createTime: string;
    readonly filters?: outputs.ec2.GetKeyPairFilter[];
    /**
     * SHA-1 digest of the DER encoded private key.
     */
    readonly fingerprint: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly includePublicKey?: boolean;
    readonly keyName?: string;
    readonly keyPairId?: string;
    /**
     * Type of key pair.
     */
    readonly keyType: string;
    /**
     * Public key material.
     */
    readonly publicKey: string;
    /**
     * Any tags assigned to the Key Pair.
     */
    readonly tags: {[key: string]: string};
}
/**
 * Use this data source to get information about a specific EC2 Key Pair.
 *
 * ## Example Usage
 *
 * The following example shows how to get a EC2 Key Pair including the public key material from its name.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ec2.getKeyPair({
 *     keyName: "test",
 *     includePublicKey: true,
 *     filters: [{
 *         name: "tag:Component",
 *         values: ["web"],
 *     }],
 * });
 * export const fingerprint = example.then(example => example.fingerprint);
 * export const name = example.then(example => example.keyName);
 * export const id = example.then(example => example.id);
 * ```
 */
export function getKeyPairOutput(args?: GetKeyPairOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKeyPairResult> {
    return pulumi.output(args).apply((a: any) => getKeyPair(a, opts))
}

/**
 * A collection of arguments for invoking getKeyPair.
 */
export interface GetKeyPairOutputArgs {
    /**
     * Custom filter block as described below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2.GetKeyPairFilterArgs>[]>;
    /**
     * Whether to include the public key material in the response.
     */
    includePublicKey?: pulumi.Input<boolean>;
    /**
     * Key Pair name.
     */
    keyName?: pulumi.Input<string>;
    /**
     * Key Pair ID.
     */
    keyPairId?: pulumi.Input<string>;
    /**
     * Any tags assigned to the Key Pair.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
