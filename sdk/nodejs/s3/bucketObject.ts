// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

import {Bucket} from "./index";

/**
 * Provides an S3 object resource.
 *
 * ## Example Usage
 * ### Encrypting with KMS Key
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const examplekms = new aws.kms.Key("examplekms", {
 *     description: "KMS key 1",
 *     deletionWindowInDays: 7,
 * });
 * const examplebucket = new aws.s3.BucketV2("examplebucket", {});
 * const exampleBucketAclV2 = new aws.s3.BucketAclV2("exampleBucketAclV2", {
 *     bucket: examplebucket.id,
 *     acl: "private",
 * });
 * const exampleBucketObject = new aws.s3.BucketObject("exampleBucketObject", {
 *     key: "someobject",
 *     bucket: examplebucket.id,
 *     source: new pulumi.asset.FileAsset("index.html"),
 *     kmsKeyId: examplekms.arn,
 * });
 * ```
 * ### Server Side Encryption with S3 Default Master Key
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const examplebucket = new aws.s3.BucketV2("examplebucket", {});
 * const exampleBucketAclV2 = new aws.s3.BucketAclV2("exampleBucketAclV2", {
 *     bucket: examplebucket.id,
 *     acl: "private",
 * });
 * const exampleBucketObject = new aws.s3.BucketObject("exampleBucketObject", {
 *     key: "someobject",
 *     bucket: examplebucket.id,
 *     source: new pulumi.asset.FileAsset("index.html"),
 *     serverSideEncryption: "aws:kms",
 * });
 * ```
 * ### Server Side Encryption with AWS-Managed Key
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const examplebucket = new aws.s3.BucketV2("examplebucket", {});
 * const exampleBucketAclV2 = new aws.s3.BucketAclV2("exampleBucketAclV2", {
 *     bucket: examplebucket.id,
 *     acl: "private",
 * });
 * const exampleBucketObject = new aws.s3.BucketObject("exampleBucketObject", {
 *     key: "someobject",
 *     bucket: examplebucket.id,
 *     source: new pulumi.asset.FileAsset("index.html"),
 *     serverSideEncryption: "AES256",
 * });
 * ```
 * ### S3 Object Lock
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const examplebucket = new aws.s3.BucketV2("examplebucket", {objectLockEnabled: true});
 * const exampleBucketAclV2 = new aws.s3.BucketAclV2("exampleBucketAclV2", {
 *     bucket: examplebucket.id,
 *     acl: "private",
 * });
 * const exampleBucketVersioningV2 = new aws.s3.BucketVersioningV2("exampleBucketVersioningV2", {
 *     bucket: examplebucket.id,
 *     versioningConfiguration: {
 *         status: "Enabled",
 *     },
 * });
 * const exampleBucketObject = new aws.s3.BucketObject("exampleBucketObject", {
 *     key: "someobject",
 *     bucket: examplebucket.id,
 *     source: new pulumi.asset.FileAsset("important.txt"),
 *     objectLockLegalHoldStatus: "ON",
 *     objectLockMode: "GOVERNANCE",
 *     objectLockRetainUntilDate: "2021-12-31T23:59:60Z",
 *     forceDestroy: true,
 * }, {
 *     dependsOn: [exampleBucketVersioningV2],
 * });
 * ```
 *
 * ## Import
 *
 * Import using S3 URL syntax:
 *
 * __Using `pulumi import` to import__ objects using the `id` or S3 URL. For example:
 *
 * Import using the `id`, which is the bucket name and the key together:
 *
 * ```sh
 *  $ pulumi import aws:s3/bucketObject:BucketObject example some-bucket-name/some/key.txt
 * ```
 *  Import using S3 URL syntax:
 *
 * ```sh
 *  $ pulumi import aws:s3/bucketObject:BucketObject example s3://some-bucket-name/some/key.txt
 * ```
 */
export class BucketObject extends pulumi.CustomResource {
    /**
     * Get an existing BucketObject resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BucketObjectState, opts?: pulumi.CustomResourceOptions): BucketObject {
        return new BucketObject(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:s3/bucketObject:BucketObject';

    /**
     * Returns true if the given object is an instance of BucketObject.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BucketObject {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BucketObject.__pulumiType;
    }

    /**
     * [Canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, and `bucket-owner-full-control`. Defaults to `private`.
     */
    public readonly acl!: pulumi.Output<string | undefined>;
    /**
     * Name of the bucket to put the file in. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified.
     */
    public readonly bucket!: pulumi.Output<string>;
    /**
     * Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
     */
    public readonly bucketKeyEnabled!: pulumi.Output<boolean>;
    /**
     * Caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     */
    public readonly cacheControl!: pulumi.Output<string | undefined>;
    /**
     * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
     */
    public readonly content!: pulumi.Output<string | undefined>;
    /**
     * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
     */
    public readonly contentBase64!: pulumi.Output<string | undefined>;
    /**
     * Presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     */
    public readonly contentDisposition!: pulumi.Output<string | undefined>;
    /**
     * Content encodings that have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     */
    public readonly contentEncoding!: pulumi.Output<string | undefined>;
    /**
     * Language the content is in e.g., en-US or en-GB.
     */
    public readonly contentLanguage!: pulumi.Output<string | undefined>;
    /**
     * Standard MIME type describing the format of the object data, e.g., application/octet-stream. All Valid MIME Types are valid for this input.
     */
    public readonly contentType!: pulumi.Output<string>;
    /**
     * Triggers updates when the value changes. This attribute is not compatible with KMS encryption, `kmsKeyId` or `serverSideEncryption = "aws:kms"` (see `sourceHash` instead).
     */
    public readonly etag!: pulumi.Output<string>;
    /**
     * Whether to allow the object to be deleted by removing any legal hold on any object version. Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
     */
    public readonly forceDestroy!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the object once it is in the bucket.
     *
     * The following arguments are optional:
     */
    public readonly key!: pulumi.Output<string>;
    /**
     * ARN of the KMS Key to use for object encryption. If the S3 Bucket has server-side encryption enabled, that value will automatically be used. If referencing the `aws.kms.Key` resource, use the `arn` attribute. If referencing the `aws.kms.Alias` data source or resource, use the `targetKeyArn` attribute. The provider will only perform drift detection if a configuration value is provided.
     */
    public readonly kmsKeyId!: pulumi.Output<string>;
    /**
     * Map of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
     */
    public readonly metadata!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * [Legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds) status that you want to apply to the specified object. Valid values are `ON` and `OFF`.
     */
    public readonly objectLockLegalHoldStatus!: pulumi.Output<string | undefined>;
    /**
     * Object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) that you want to apply to this object. Valid values are `GOVERNANCE` and `COMPLIANCE`.
     */
    public readonly objectLockMode!: pulumi.Output<string | undefined>;
    /**
     * Date and time, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8), when this object's object lock will [expire](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-periods).
     */
    public readonly objectLockRetainUntilDate!: pulumi.Output<string | undefined>;
    /**
     * Server-side encryption of the object in S3. Valid values are "`AES256`" and "`aws:kms`".
     */
    public readonly serverSideEncryption!: pulumi.Output<string>;
    /**
     * Path to a file that will be read and uploaded as raw bytes for the object content.
     */
    public readonly source!: pulumi.Output<pulumi.asset.Asset | pulumi.asset.Archive | undefined>;
    /**
     * Triggers updates like `etag` but useful to address `etag` encryption limitations.
     */
    public readonly sourceHash!: pulumi.Output<string | undefined>;
    /**
     * [Storage Class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html#AmazonS3-PutObject-request-header-StorageClass) for the object. Defaults to "`STANDARD`".
     */
    public readonly storageClass!: pulumi.Output<string>;
    /**
     * Map of tags to assign to the object. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Unique version ID value for the object, if bucket versioning is enabled.
     */
    public /*out*/ readonly versionId!: pulumi.Output<string>;
    /**
     * Target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
     *
     * If no content is provided through `source`, `content` or `contentBase64`, then the object will be empty.
     */
    public readonly websiteRedirect!: pulumi.Output<string | undefined>;

    /**
     * Create a BucketObject resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BucketObjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BucketObjectArgs | BucketObjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BucketObjectState | undefined;
            resourceInputs["acl"] = state ? state.acl : undefined;
            resourceInputs["bucket"] = state ? state.bucket : undefined;
            resourceInputs["bucketKeyEnabled"] = state ? state.bucketKeyEnabled : undefined;
            resourceInputs["cacheControl"] = state ? state.cacheControl : undefined;
            resourceInputs["content"] = state ? state.content : undefined;
            resourceInputs["contentBase64"] = state ? state.contentBase64 : undefined;
            resourceInputs["contentDisposition"] = state ? state.contentDisposition : undefined;
            resourceInputs["contentEncoding"] = state ? state.contentEncoding : undefined;
            resourceInputs["contentLanguage"] = state ? state.contentLanguage : undefined;
            resourceInputs["contentType"] = state ? state.contentType : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["forceDestroy"] = state ? state.forceDestroy : undefined;
            resourceInputs["key"] = state ? state.key : undefined;
            resourceInputs["kmsKeyId"] = state ? state.kmsKeyId : undefined;
            resourceInputs["metadata"] = state ? state.metadata : undefined;
            resourceInputs["objectLockLegalHoldStatus"] = state ? state.objectLockLegalHoldStatus : undefined;
            resourceInputs["objectLockMode"] = state ? state.objectLockMode : undefined;
            resourceInputs["objectLockRetainUntilDate"] = state ? state.objectLockRetainUntilDate : undefined;
            resourceInputs["serverSideEncryption"] = state ? state.serverSideEncryption : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["sourceHash"] = state ? state.sourceHash : undefined;
            resourceInputs["storageClass"] = state ? state.storageClass : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["versionId"] = state ? state.versionId : undefined;
            resourceInputs["websiteRedirect"] = state ? state.websiteRedirect : undefined;
        } else {
            const args = argsOrState as BucketObjectArgs | undefined;
            if ((!args || args.bucket === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bucket'");
            }
            resourceInputs["acl"] = args ? args.acl : undefined;
            resourceInputs["bucket"] = args ? args.bucket : undefined;
            resourceInputs["bucketKeyEnabled"] = args ? args.bucketKeyEnabled : undefined;
            resourceInputs["cacheControl"] = args ? args.cacheControl : undefined;
            resourceInputs["content"] = args ? args.content : undefined;
            resourceInputs["contentBase64"] = args ? args.contentBase64 : undefined;
            resourceInputs["contentDisposition"] = args ? args.contentDisposition : undefined;
            resourceInputs["contentEncoding"] = args ? args.contentEncoding : undefined;
            resourceInputs["contentLanguage"] = args ? args.contentLanguage : undefined;
            resourceInputs["contentType"] = args ? args.contentType : undefined;
            resourceInputs["etag"] = args ? args.etag : undefined;
            resourceInputs["forceDestroy"] = args ? args.forceDestroy : undefined;
            resourceInputs["key"] = args ? args.key : undefined;
            resourceInputs["kmsKeyId"] = args ? args.kmsKeyId : undefined;
            resourceInputs["metadata"] = args ? args.metadata : undefined;
            resourceInputs["objectLockLegalHoldStatus"] = args ? args.objectLockLegalHoldStatus : undefined;
            resourceInputs["objectLockMode"] = args ? args.objectLockMode : undefined;
            resourceInputs["objectLockRetainUntilDate"] = args ? args.objectLockRetainUntilDate : undefined;
            resourceInputs["serverSideEncryption"] = args ? args.serverSideEncryption : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["sourceHash"] = args ? args.sourceHash : undefined;
            resourceInputs["storageClass"] = args ? args.storageClass : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["websiteRedirect"] = args ? args.websiteRedirect : undefined;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["versionId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BucketObject.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BucketObject resources.
 */
export interface BucketObjectState {
    /**
     * [Canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, and `bucket-owner-full-control`. Defaults to `private`.
     */
    acl?: pulumi.Input<string>;
    /**
     * Name of the bucket to put the file in. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified.
     */
    bucket?: pulumi.Input<string | Bucket>;
    /**
     * Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
     */
    bucketKeyEnabled?: pulumi.Input<boolean>;
    /**
     * Caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     */
    cacheControl?: pulumi.Input<string>;
    /**
     * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
     */
    content?: pulumi.Input<string>;
    /**
     * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
     */
    contentBase64?: pulumi.Input<string>;
    /**
     * Presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     */
    contentDisposition?: pulumi.Input<string>;
    /**
     * Content encodings that have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     */
    contentEncoding?: pulumi.Input<string>;
    /**
     * Language the content is in e.g., en-US or en-GB.
     */
    contentLanguage?: pulumi.Input<string>;
    /**
     * Standard MIME type describing the format of the object data, e.g., application/octet-stream. All Valid MIME Types are valid for this input.
     */
    contentType?: pulumi.Input<string>;
    /**
     * Triggers updates when the value changes. This attribute is not compatible with KMS encryption, `kmsKeyId` or `serverSideEncryption = "aws:kms"` (see `sourceHash` instead).
     */
    etag?: pulumi.Input<string>;
    /**
     * Whether to allow the object to be deleted by removing any legal hold on any object version. Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
     */
    forceDestroy?: pulumi.Input<boolean>;
    /**
     * Name of the object once it is in the bucket.
     *
     * The following arguments are optional:
     */
    key?: pulumi.Input<string>;
    /**
     * ARN of the KMS Key to use for object encryption. If the S3 Bucket has server-side encryption enabled, that value will automatically be used. If referencing the `aws.kms.Key` resource, use the `arn` attribute. If referencing the `aws.kms.Alias` data source or resource, use the `targetKeyArn` attribute. The provider will only perform drift detection if a configuration value is provided.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * Map of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
     */
    metadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * [Legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds) status that you want to apply to the specified object. Valid values are `ON` and `OFF`.
     */
    objectLockLegalHoldStatus?: pulumi.Input<string>;
    /**
     * Object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) that you want to apply to this object. Valid values are `GOVERNANCE` and `COMPLIANCE`.
     */
    objectLockMode?: pulumi.Input<string>;
    /**
     * Date and time, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8), when this object's object lock will [expire](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-periods).
     */
    objectLockRetainUntilDate?: pulumi.Input<string>;
    /**
     * Server-side encryption of the object in S3. Valid values are "`AES256`" and "`aws:kms`".
     */
    serverSideEncryption?: pulumi.Input<string>;
    /**
     * Path to a file that will be read and uploaded as raw bytes for the object content.
     */
    source?: pulumi.Input<pulumi.asset.Asset | pulumi.asset.Archive>;
    /**
     * Triggers updates like `etag` but useful to address `etag` encryption limitations.
     */
    sourceHash?: pulumi.Input<string>;
    /**
     * [Storage Class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html#AmazonS3-PutObject-request-header-StorageClass) for the object. Defaults to "`STANDARD`".
     */
    storageClass?: pulumi.Input<string>;
    /**
     * Map of tags to assign to the object. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Unique version ID value for the object, if bucket versioning is enabled.
     */
    versionId?: pulumi.Input<string>;
    /**
     * Target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
     *
     * If no content is provided through `source`, `content` or `contentBase64`, then the object will be empty.
     */
    websiteRedirect?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BucketObject resource.
 */
export interface BucketObjectArgs {
    /**
     * [Canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, and `bucket-owner-full-control`. Defaults to `private`.
     */
    acl?: pulumi.Input<string>;
    /**
     * Name of the bucket to put the file in. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified.
     */
    bucket: pulumi.Input<string | Bucket>;
    /**
     * Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
     */
    bucketKeyEnabled?: pulumi.Input<boolean>;
    /**
     * Caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     */
    cacheControl?: pulumi.Input<string>;
    /**
     * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
     */
    content?: pulumi.Input<string>;
    /**
     * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
     */
    contentBase64?: pulumi.Input<string>;
    /**
     * Presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     */
    contentDisposition?: pulumi.Input<string>;
    /**
     * Content encodings that have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     */
    contentEncoding?: pulumi.Input<string>;
    /**
     * Language the content is in e.g., en-US or en-GB.
     */
    contentLanguage?: pulumi.Input<string>;
    /**
     * Standard MIME type describing the format of the object data, e.g., application/octet-stream. All Valid MIME Types are valid for this input.
     */
    contentType?: pulumi.Input<string>;
    /**
     * Triggers updates when the value changes. This attribute is not compatible with KMS encryption, `kmsKeyId` or `serverSideEncryption = "aws:kms"` (see `sourceHash` instead).
     */
    etag?: pulumi.Input<string>;
    /**
     * Whether to allow the object to be deleted by removing any legal hold on any object version. Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
     */
    forceDestroy?: pulumi.Input<boolean>;
    /**
     * Name of the object once it is in the bucket.
     *
     * The following arguments are optional:
     */
    key?: pulumi.Input<string>;
    /**
     * ARN of the KMS Key to use for object encryption. If the S3 Bucket has server-side encryption enabled, that value will automatically be used. If referencing the `aws.kms.Key` resource, use the `arn` attribute. If referencing the `aws.kms.Alias` data source or resource, use the `targetKeyArn` attribute. The provider will only perform drift detection if a configuration value is provided.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * Map of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
     */
    metadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * [Legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds) status that you want to apply to the specified object. Valid values are `ON` and `OFF`.
     */
    objectLockLegalHoldStatus?: pulumi.Input<string>;
    /**
     * Object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) that you want to apply to this object. Valid values are `GOVERNANCE` and `COMPLIANCE`.
     */
    objectLockMode?: pulumi.Input<string>;
    /**
     * Date and time, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8), when this object's object lock will [expire](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-periods).
     */
    objectLockRetainUntilDate?: pulumi.Input<string>;
    /**
     * Server-side encryption of the object in S3. Valid values are "`AES256`" and "`aws:kms`".
     */
    serverSideEncryption?: pulumi.Input<string>;
    /**
     * Path to a file that will be read and uploaded as raw bytes for the object content.
     */
    source?: pulumi.Input<pulumi.asset.Asset | pulumi.asset.Archive>;
    /**
     * Triggers updates like `etag` but useful to address `etag` encryption limitations.
     */
    sourceHash?: pulumi.Input<string>;
    /**
     * [Storage Class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html#AmazonS3-PutObject-request-header-StorageClass) for the object. Defaults to "`STANDARD`".
     */
    storageClass?: pulumi.Input<string>;
    /**
     * Map of tags to assign to the object. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
     *
     * If no content is provided through `source`, `content` or `contentBase64`, then the object will be empty.
     */
    websiteRedirect?: pulumi.Input<string>;
}
