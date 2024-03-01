// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.asset.AssetOrArchive;
import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3.BucketObjectv2Args;
import com.pulumi.aws.s3.inputs.BucketObjectv2State;
import com.pulumi.aws.s3.outputs.BucketObjectv2OverrideProvider;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an S3 object resource.
 * 
 * ## Example Usage
 * ### Uploading a file to a bucket
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketObjectv2;
 * import com.pulumi.aws.s3.BucketObjectv2Args;
 * import com.pulumi.asset.FileAsset;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var object = new BucketObjectv2(&#34;object&#34;, BucketObjectv2Args.builder()        
 *             .bucket(&#34;your_bucket_name&#34;)
 *             .key(&#34;new_object_key&#34;)
 *             .source(new FileAsset(&#34;path/to/file&#34;))
 *             .etag(StdFunctions.filemd5(Filemd5Args.builder()
 *                 .input(&#34;path/to/file&#34;)
 *                 .build()).result())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Encrypting with KMS Key
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.kms.Key;
 * import com.pulumi.aws.kms.KeyArgs;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.s3.BucketAclV2;
 * import com.pulumi.aws.s3.BucketAclV2Args;
 * import com.pulumi.aws.s3.BucketObjectv2;
 * import com.pulumi.aws.s3.BucketObjectv2Args;
 * import com.pulumi.asset.FileAsset;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var examplekms = new Key(&#34;examplekms&#34;, KeyArgs.builder()        
 *             .description(&#34;KMS key 1&#34;)
 *             .deletionWindowInDays(7)
 *             .build());
 * 
 *         var examplebucket = new BucketV2(&#34;examplebucket&#34;, BucketV2Args.builder()        
 *             .bucket(&#34;examplebuckettftest&#34;)
 *             .build());
 * 
 *         var example = new BucketAclV2(&#34;example&#34;, BucketAclV2Args.builder()        
 *             .bucket(examplebucket.id())
 *             .acl(&#34;private&#34;)
 *             .build());
 * 
 *         var exampleBucketObjectv2 = new BucketObjectv2(&#34;exampleBucketObjectv2&#34;, BucketObjectv2Args.builder()        
 *             .key(&#34;someobject&#34;)
 *             .bucket(examplebucket.id())
 *             .source(new FileAsset(&#34;index.html&#34;))
 *             .kmsKeyId(examplekms.arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Server Side Encryption with S3 Default Master Key
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.s3.BucketAclV2;
 * import com.pulumi.aws.s3.BucketAclV2Args;
 * import com.pulumi.aws.s3.BucketObjectv2;
 * import com.pulumi.aws.s3.BucketObjectv2Args;
 * import com.pulumi.asset.FileAsset;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var examplebucket = new BucketV2(&#34;examplebucket&#34;, BucketV2Args.builder()        
 *             .bucket(&#34;examplebuckettftest&#34;)
 *             .build());
 * 
 *         var example = new BucketAclV2(&#34;example&#34;, BucketAclV2Args.builder()        
 *             .bucket(examplebucket.id())
 *             .acl(&#34;private&#34;)
 *             .build());
 * 
 *         var exampleBucketObjectv2 = new BucketObjectv2(&#34;exampleBucketObjectv2&#34;, BucketObjectv2Args.builder()        
 *             .key(&#34;someobject&#34;)
 *             .bucket(examplebucket.id())
 *             .source(new FileAsset(&#34;index.html&#34;))
 *             .serverSideEncryption(&#34;aws:kms&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Server Side Encryption with AWS-Managed Key
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.s3.BucketAclV2;
 * import com.pulumi.aws.s3.BucketAclV2Args;
 * import com.pulumi.aws.s3.BucketObjectv2;
 * import com.pulumi.aws.s3.BucketObjectv2Args;
 * import com.pulumi.asset.FileAsset;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var examplebucket = new BucketV2(&#34;examplebucket&#34;, BucketV2Args.builder()        
 *             .bucket(&#34;examplebuckettftest&#34;)
 *             .build());
 * 
 *         var example = new BucketAclV2(&#34;example&#34;, BucketAclV2Args.builder()        
 *             .bucket(examplebucket.id())
 *             .acl(&#34;private&#34;)
 *             .build());
 * 
 *         var exampleBucketObjectv2 = new BucketObjectv2(&#34;exampleBucketObjectv2&#34;, BucketObjectv2Args.builder()        
 *             .key(&#34;someobject&#34;)
 *             .bucket(examplebucket.id())
 *             .source(new FileAsset(&#34;index.html&#34;))
 *             .serverSideEncryption(&#34;AES256&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### S3 Object Lock
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.s3.BucketAclV2;
 * import com.pulumi.aws.s3.BucketAclV2Args;
 * import com.pulumi.aws.s3.BucketVersioningV2;
 * import com.pulumi.aws.s3.BucketVersioningV2Args;
 * import com.pulumi.aws.s3.inputs.BucketVersioningV2VersioningConfigurationArgs;
 * import com.pulumi.aws.s3.BucketObjectv2;
 * import com.pulumi.aws.s3.BucketObjectv2Args;
 * import com.pulumi.asset.FileAsset;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var examplebucket = new BucketV2(&#34;examplebucket&#34;, BucketV2Args.builder()        
 *             .bucket(&#34;examplebuckettftest&#34;)
 *             .objectLockEnabled(true)
 *             .build());
 * 
 *         var example = new BucketAclV2(&#34;example&#34;, BucketAclV2Args.builder()        
 *             .bucket(examplebucket.id())
 *             .acl(&#34;private&#34;)
 *             .build());
 * 
 *         var exampleBucketVersioningV2 = new BucketVersioningV2(&#34;exampleBucketVersioningV2&#34;, BucketVersioningV2Args.builder()        
 *             .bucket(examplebucket.id())
 *             .versioningConfiguration(BucketVersioningV2VersioningConfigurationArgs.builder()
 *                 .status(&#34;Enabled&#34;)
 *                 .build())
 *             .build());
 * 
 *         var examplebucketObject = new BucketObjectv2(&#34;examplebucketObject&#34;, BucketObjectv2Args.builder()        
 *             .key(&#34;someobject&#34;)
 *             .bucket(examplebucket.id())
 *             .source(new FileAsset(&#34;important.txt&#34;))
 *             .objectLockLegalHoldStatus(&#34;ON&#34;)
 *             .objectLockMode(&#34;GOVERNANCE&#34;)
 *             .objectLockRetainUntilDate(&#34;2021-12-31T23:59:60Z&#34;)
 *             .forceDestroy(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Ignoring Provider `default_tags`
 * 
 * S3 objects support a [maximum of 10 tags](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-tagging.html).
 * If the resource&#39;s own `tags` and the provider-level `default_tags` would together lead to more than 10 tags on an S3 object, use the `override_provider` configuration block to suppress any provider-level `default_tags`.
 * 
 * &gt; S3 objects stored in Amazon S3 Express directory buckets do not support tags, so any provider-level `default_tags` must be suppressed.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.s3.BucketObjectv2;
 * import com.pulumi.aws.s3.BucketObjectv2Args;
 * import com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderArgs;
 * import com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderDefaultTagsArgs;
 * import com.pulumi.asset.FileAsset;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var examplebucket = new BucketV2(&#34;examplebucket&#34;, BucketV2Args.builder()        
 *             .bucket(&#34;examplebuckettftest&#34;)
 *             .build());
 * 
 *         var examplebucketObject = new BucketObjectv2(&#34;examplebucketObject&#34;, BucketObjectv2Args.builder()        
 *             .key(&#34;someobject&#34;)
 *             .bucket(examplebucket.id())
 *             .source(new FileAsset(&#34;important.txt&#34;))
 *             .tags(Map.of(&#34;Env&#34;, &#34;test&#34;))
 *             .overrideProvider(BucketObjectv2OverrideProviderArgs.builder()
 *                 .defaultTags(BucketObjectv2OverrideProviderDefaultTagsArgs.builder()
 *                     .tags()
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
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
 *  $ pulumi import aws:s3/bucketObjectv2:BucketObjectv2 example some-bucket-name/some/key.txt
 * ```
 *  Import using S3 URL syntax:
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketObjectv2:BucketObjectv2 example s3://some-bucket-name/some/key.txt
 * ```
 * 
 */
@ResourceType(type="aws:s3/bucketObjectv2:BucketObjectv2")
public class BucketObjectv2 extends com.pulumi.resources.CustomResource {
    /**
     * [Canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, and `bucket-owner-full-control`.
     * 
     */
    @Export(name="acl", refs={String.class}, tree="[0]")
    private Output<String> acl;

    /**
     * @return [Canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, and `bucket-owner-full-control`.
     * 
     */
    public Output<String> acl() {
        return this.acl;
    }
    /**
     * Name of the bucket to put the file in. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified.
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output<String> bucket;

    /**
     * @return Name of the bucket to put the file in. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
     * 
     */
    @Export(name="bucketKeyEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> bucketKeyEnabled;

    /**
     * @return Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
     * 
     */
    public Output<Boolean> bucketKeyEnabled() {
        return this.bucketKeyEnabled;
    }
    /**
     * Caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     * 
     */
    @Export(name="cacheControl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cacheControl;

    /**
     * @return Caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     * 
     */
    public Output<Optional<String>> cacheControl() {
        return Codegen.optional(this.cacheControl);
    }
    /**
     * Indicates the algorithm used to create the checksum for the object. If a value is specified and the object is encrypted with KMS, you must have permission to use the `kms:Decrypt` action. Valid values: `CRC32`, `CRC32C`, `SHA1`, `SHA256`.
     * 
     */
    @Export(name="checksumAlgorithm", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> checksumAlgorithm;

    /**
     * @return Indicates the algorithm used to create the checksum for the object. If a value is specified and the object is encrypted with KMS, you must have permission to use the `kms:Decrypt` action. Valid values: `CRC32`, `CRC32C`, `SHA1`, `SHA256`.
     * 
     */
    public Output<Optional<String>> checksumAlgorithm() {
        return Codegen.optional(this.checksumAlgorithm);
    }
    /**
     * The base64-encoded, 32-bit CRC32 checksum of the object.
     * 
     */
    @Export(name="checksumCrc32", refs={String.class}, tree="[0]")
    private Output<String> checksumCrc32;

    /**
     * @return The base64-encoded, 32-bit CRC32 checksum of the object.
     * 
     */
    public Output<String> checksumCrc32() {
        return this.checksumCrc32;
    }
    /**
     * The base64-encoded, 32-bit CRC32C checksum of the object.
     * 
     */
    @Export(name="checksumCrc32c", refs={String.class}, tree="[0]")
    private Output<String> checksumCrc32c;

    /**
     * @return The base64-encoded, 32-bit CRC32C checksum of the object.
     * 
     */
    public Output<String> checksumCrc32c() {
        return this.checksumCrc32c;
    }
    /**
     * The base64-encoded, 160-bit SHA-1 digest of the object.
     * 
     */
    @Export(name="checksumSha1", refs={String.class}, tree="[0]")
    private Output<String> checksumSha1;

    /**
     * @return The base64-encoded, 160-bit SHA-1 digest of the object.
     * 
     */
    public Output<String> checksumSha1() {
        return this.checksumSha1;
    }
    /**
     * The base64-encoded, 256-bit SHA-256 digest of the object.
     * 
     */
    @Export(name="checksumSha256", refs={String.class}, tree="[0]")
    private Output<String> checksumSha256;

    /**
     * @return The base64-encoded, 256-bit SHA-256 digest of the object.
     * 
     */
    public Output<String> checksumSha256() {
        return this.checksumSha256;
    }
    /**
     * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
     * 
     */
    @Export(name="content", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> content;

    /**
     * @return Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
     * 
     */
    public Output<Optional<String>> content() {
        return Codegen.optional(this.content);
    }
    /**
     * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
     * 
     */
    @Export(name="contentBase64", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> contentBase64;

    /**
     * @return Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
     * 
     */
    public Output<Optional<String>> contentBase64() {
        return Codegen.optional(this.contentBase64);
    }
    /**
     * Presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     * 
     */
    @Export(name="contentDisposition", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> contentDisposition;

    /**
     * @return Presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     * 
     */
    public Output<Optional<String>> contentDisposition() {
        return Codegen.optional(this.contentDisposition);
    }
    /**
     * Content encodings that have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     * 
     */
    @Export(name="contentEncoding", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> contentEncoding;

    /**
     * @return Content encodings that have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     * 
     */
    public Output<Optional<String>> contentEncoding() {
        return Codegen.optional(this.contentEncoding);
    }
    /**
     * Language the content is in e.g., en-US or en-GB.
     * 
     */
    @Export(name="contentLanguage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> contentLanguage;

    /**
     * @return Language the content is in e.g., en-US or en-GB.
     * 
     */
    public Output<Optional<String>> contentLanguage() {
        return Codegen.optional(this.contentLanguage);
    }
    /**
     * Standard MIME type describing the format of the object data, e.g., application/octet-stream. All Valid MIME Types are valid for this input.
     * 
     */
    @Export(name="contentType", refs={String.class}, tree="[0]")
    private Output<String> contentType;

    /**
     * @return Standard MIME type describing the format of the object data, e.g., application/octet-stream. All Valid MIME Types are valid for this input.
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }
    /**
     * Triggers updates when the value changes. This attribute is not compatible with KMS encryption, `kms_key_id` or `server_side_encryption = &#34;aws:kms&#34;`, also if an object is larger than 16 MB, the AWS Management Console will upload or copy that object as a Multipart Upload, and therefore the ETag will not be an MD5 digest (see `source_hash` instead).
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return Triggers updates when the value changes. This attribute is not compatible with KMS encryption, `kms_key_id` or `server_side_encryption = &#34;aws:kms&#34;`, also if an object is larger than 16 MB, the AWS Management Console will upload or copy that object as a Multipart Upload, and therefore the ETag will not be an MD5 digest (see `source_hash` instead).
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Whether to allow the object to be deleted by removing any legal hold on any object version. Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
     * 
     */
    @Export(name="forceDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Whether to allow the object to be deleted by removing any legal hold on any object version. Default is `false`. This value should be set to `true` only if the bucket has S3 object lock enabled.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * Name of the object once it is in the bucket.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output<String> key;

    /**
     * @return Name of the object once it is in the bucket.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * ARN of the KMS Key to use for object encryption. If the S3 Bucket has server-side encryption enabled, that value will automatically be used. If referencing the `aws.kms.Key` resource, use the `arn` attribute. If referencing the `aws.kms.Alias` data source or resource, use the `target_key_arn` attribute. The provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyId;

    /**
     * @return ARN of the KMS Key to use for object encryption. If the S3 Bucket has server-side encryption enabled, that value will automatically be used. If referencing the `aws.kms.Key` resource, use the `arn` attribute. If referencing the `aws.kms.Alias` data source or resource, use the `target_key_arn` attribute. The provider will only perform drift detection if a configuration value is provided.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * Map of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
     * 
     */
    @Export(name="metadata", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return Map of keys/values to provision metadata (will be automatically prefixed by `x-amz-meta-`, note that only lowercase label are currently supported by the AWS Go API).
     * 
     */
    public Output<Optional<Map<String,String>>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * [Legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds) status that you want to apply to the specified object. Valid values are `ON` and `OFF`.
     * 
     */
    @Export(name="objectLockLegalHoldStatus", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> objectLockLegalHoldStatus;

    /**
     * @return [Legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds) status that you want to apply to the specified object. Valid values are `ON` and `OFF`.
     * 
     */
    public Output<Optional<String>> objectLockLegalHoldStatus() {
        return Codegen.optional(this.objectLockLegalHoldStatus);
    }
    /**
     * Object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) that you want to apply to this object. Valid values are `GOVERNANCE` and `COMPLIANCE`.
     * 
     */
    @Export(name="objectLockMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> objectLockMode;

    /**
     * @return Object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) that you want to apply to this object. Valid values are `GOVERNANCE` and `COMPLIANCE`.
     * 
     */
    public Output<Optional<String>> objectLockMode() {
        return Codegen.optional(this.objectLockMode);
    }
    /**
     * Date and time, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8), when this object&#39;s object lock will [expire](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-periods).
     * 
     */
    @Export(name="objectLockRetainUntilDate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> objectLockRetainUntilDate;

    /**
     * @return Date and time, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8), when this object&#39;s object lock will [expire](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-periods).
     * 
     */
    public Output<Optional<String>> objectLockRetainUntilDate() {
        return Codegen.optional(this.objectLockRetainUntilDate);
    }
    /**
     * Override provider-level configuration options. See Override Provider below for more details.
     * 
     */
    @Export(name="overrideProvider", refs={BucketObjectv2OverrideProvider.class}, tree="[0]")
    private Output</* @Nullable */ BucketObjectv2OverrideProvider> overrideProvider;

    /**
     * @return Override provider-level configuration options. See Override Provider below for more details.
     * 
     */
    public Output<Optional<BucketObjectv2OverrideProvider>> overrideProvider() {
        return Codegen.optional(this.overrideProvider);
    }
    /**
     * Server-side encryption of the object in S3. Valid values are &#34;`AES256`&#34; and &#34;`aws:kms`&#34;.
     * 
     */
    @Export(name="serverSideEncryption", refs={String.class}, tree="[0]")
    private Output<String> serverSideEncryption;

    /**
     * @return Server-side encryption of the object in S3. Valid values are &#34;`AES256`&#34; and &#34;`aws:kms`&#34;.
     * 
     */
    public Output<String> serverSideEncryption() {
        return this.serverSideEncryption;
    }
    /**
     * Path to a file that will be read and uploaded as raw bytes for the object content.
     * 
     */
    @Export(name="source", refs={AssetOrArchive.class}, tree="[0]")
    private Output</* @Nullable */ AssetOrArchive> source;

    /**
     * @return Path to a file that will be read and uploaded as raw bytes for the object content.
     * 
     */
    public Output<Optional<AssetOrArchive>> source() {
        return Codegen.optional(this.source);
    }
    /**
     * Triggers updates like `etag` but useful to address `etag` encryption limitations. (The value is only stored in state and not saved by AWS.)
     * 
     */
    @Export(name="sourceHash", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceHash;

    /**
     * @return Triggers updates like `etag` but useful to address `etag` encryption limitations. (The value is only stored in state and not saved by AWS.)
     * 
     */
    public Output<Optional<String>> sourceHash() {
        return Codegen.optional(this.sourceHash);
    }
    /**
     * [Storage Class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html#AmazonS3-PutObject-request-header-StorageClass) for the object. Defaults to &#34;`STANDARD`&#34;.
     * 
     */
    @Export(name="storageClass", refs={String.class}, tree="[0]")
    private Output<String> storageClass;

    /**
     * @return [Storage Class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html#AmazonS3-PutObject-request-header-StorageClass) for the object. Defaults to &#34;`STANDARD`&#34;.
     * 
     */
    public Output<String> storageClass() {
        return this.storageClass;
    }
    /**
     * Map of tags to assign to the object. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the object. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Unique version ID value for the object, if bucket versioning is enabled.
     * 
     */
    @Export(name="versionId", refs={String.class}, tree="[0]")
    private Output<String> versionId;

    /**
     * @return Unique version ID value for the object, if bucket versioning is enabled.
     * 
     */
    public Output<String> versionId() {
        return this.versionId;
    }
    /**
     * Target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
     * 
     * If no content is provided through `source`, `content` or `content_base64`, then the object will be empty.
     * 
     * &gt; **Note:** The provider ignores all leading `/`s in the object&#39;s `key` and treats multiple `/`s in the rest of the object&#39;s `key` as a single `/`, so values of `/index.html` and `index.html` correspond to the same S3 object as do `first//second///third//` and `first/second/third/`.
     * 
     */
    @Export(name="websiteRedirect", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> websiteRedirect;

    /**
     * @return Target URL for [website redirect](http://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html).
     * 
     * If no content is provided through `source`, `content` or `content_base64`, then the object will be empty.
     * 
     * &gt; **Note:** The provider ignores all leading `/`s in the object&#39;s `key` and treats multiple `/`s in the rest of the object&#39;s `key` as a single `/`, so values of `/index.html` and `index.html` correspond to the same S3 object as do `first//second///third//` and `first/second/third/`.
     * 
     */
    public Output<Optional<String>> websiteRedirect() {
        return Codegen.optional(this.websiteRedirect);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketObjectv2(String name) {
        this(name, BucketObjectv2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketObjectv2(String name, BucketObjectv2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketObjectv2(String name, BucketObjectv2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketObjectv2:BucketObjectv2", name, args == null ? BucketObjectv2Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketObjectv2(String name, Output<String> id, @Nullable BucketObjectv2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketObjectv2:BucketObjectv2", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:s3/BucketObject:BucketObject").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BucketObjectv2 get(String name, Output<String> id, @Nullable BucketObjectv2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketObjectv2(name, id, state, options);
    }
}
