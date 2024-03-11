// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * The ECR Image data source allows the details of an image with a particular tag or digest to be retrieved.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const serviceImage = aws.ecr.getImage({
 *     repositoryName: "my/service",
 *     imageTag: "latest",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getImage(args: GetImageArgs, opts?: pulumi.InvokeOptions): Promise<GetImageResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:ecr/getImage:getImage", {
        "imageDigest": args.imageDigest,
        "imageTag": args.imageTag,
        "mostRecent": args.mostRecent,
        "registryId": args.registryId,
        "repositoryName": args.repositoryName,
    }, opts);
}

/**
 * A collection of arguments for invoking getImage.
 */
export interface GetImageArgs {
    /**
     * Sha256 digest of the image manifest. At least one of `imageDigest`, `imageTag`, or `mostRecent` must be specified.
     */
    imageDigest?: string;
    /**
     * Tag associated with this image. At least one of `imageDigest`, `imageTag`, or `mostRecent` must be specified.
     */
    imageTag?: string;
    /**
     * Return the most recently pushed image. At least one of `imageDigest`, `imageTag`, or `mostRecent` must be specified.
     */
    mostRecent?: boolean;
    /**
     * ID of the Registry where the repository resides.
     */
    registryId?: string;
    /**
     * Name of the ECR Repository.
     */
    repositoryName: string;
}

/**
 * A collection of values returned by getImage.
 */
export interface GetImageResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly imageDigest: string;
    /**
     * Date and time, expressed as a unix timestamp, at which the current image was pushed to the repository.
     */
    readonly imagePushedAt: number;
    /**
     * Size, in bytes, of the image in the repository.
     */
    readonly imageSizeInBytes: number;
    readonly imageTag?: string;
    /**
     * List of tags associated with this image.
     */
    readonly imageTags: string[];
    /**
     * The URI for the specific image version specified by `imageTag` or `imageDigest`.
     */
    readonly imageUri: string;
    readonly mostRecent?: boolean;
    readonly registryId: string;
    readonly repositoryName: string;
}
/**
 * The ECR Image data source allows the details of an image with a particular tag or digest to be retrieved.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const serviceImage = aws.ecr.getImage({
 *     repositoryName: "my/service",
 *     imageTag: "latest",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getImageOutput(args: GetImageOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetImageResult> {
    return pulumi.output(args).apply((a: any) => getImage(a, opts))
}

/**
 * A collection of arguments for invoking getImage.
 */
export interface GetImageOutputArgs {
    /**
     * Sha256 digest of the image manifest. At least one of `imageDigest`, `imageTag`, or `mostRecent` must be specified.
     */
    imageDigest?: pulumi.Input<string>;
    /**
     * Tag associated with this image. At least one of `imageDigest`, `imageTag`, or `mostRecent` must be specified.
     */
    imageTag?: pulumi.Input<string>;
    /**
     * Return the most recently pushed image. At least one of `imageDigest`, `imageTag`, or `mostRecent` must be specified.
     */
    mostRecent?: pulumi.Input<boolean>;
    /**
     * ID of the Registry where the repository resides.
     */
    registryId?: pulumi.Input<string>;
    /**
     * Name of the ECR Repository.
     */
    repositoryName: pulumi.Input<string>;
}
