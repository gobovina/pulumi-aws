// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Data source for managing an AWS OpenSearch Serverless Collection.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.opensearch.getServerlessCollection({
 *     name: "example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getServerlessCollection(args?: GetServerlessCollectionArgs, opts?: pulumi.InvokeOptions): Promise<GetServerlessCollectionResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:opensearch/getServerlessCollection:getServerlessCollection", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getServerlessCollection.
 */
export interface GetServerlessCollectionArgs {
    /**
     * ID of the collection. Either `id` or `name` must be provided.
     */
    id?: string;
    /**
     * Name of the collection. Either `name` or `id` must be provided.
     */
    name?: string;
}

/**
 * A collection of values returned by getServerlessCollection.
 */
export interface GetServerlessCollectionResult {
    /**
     * Amazon Resource Name (ARN) of the collection.
     */
    readonly arn: string;
    /**
     * Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless collection.
     */
    readonly collectionEndpoint: string;
    /**
     * Date the Collection was created.
     */
    readonly createdDate: string;
    /**
     * Collection-specific endpoint used to access OpenSearch Dashboards.
     */
    readonly dashboardEndpoint: string;
    /**
     * Description of the collection.
     */
    readonly description: string;
    readonly id: string;
    /**
     * The ARN of the Amazon Web Services KMS key used to encrypt the collection.
     */
    readonly kmsKeyArn: string;
    /**
     * Date the Collection was last modified.
     */
    readonly lastModifiedDate: string;
    readonly name: string;
    /**
     * Indicates whether standby replicas should be used for a collection.
     */
    readonly standbyReplicas: string;
    /**
     * A map of tags to assign to the collection.
     */
    readonly tags: {[key: string]: string};
    /**
     * Type of collection.
     */
    readonly type: string;
}
/**
 * Data source for managing an AWS OpenSearch Serverless Collection.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.opensearch.getServerlessCollection({
 *     name: "example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getServerlessCollectionOutput(args?: GetServerlessCollectionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServerlessCollectionResult> {
    return pulumi.output(args).apply((a: any) => getServerlessCollection(a, opts))
}

/**
 * A collection of arguments for invoking getServerlessCollection.
 */
export interface GetServerlessCollectionOutputArgs {
    /**
     * ID of the collection. Either `id` or `name` must be provided.
     */
    id?: pulumi.Input<string>;
    /**
     * Name of the collection. Either `name` or `id` must be provided.
     */
    name?: pulumi.Input<string>;
}
