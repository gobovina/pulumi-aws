// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lightsail;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lightsail.BucketAccessKeyArgs;
import com.pulumi.aws.lightsail.inputs.BucketAccessKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a lightsail bucket access key. This is a set of credentials that allow API requests to be made to the lightsail bucket.
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_lightsail_bucket_access_key` using the `id` attribute. For example:
 * 
 * ```sh
 *  $ pulumi import aws:lightsail/bucketAccessKey:BucketAccessKey test example-bucket,AKIA47VOQ2KPR7LLRZ6D
 * ```
 * 
 */
@ResourceType(type="aws:lightsail/bucketAccessKey:BucketAccessKey")
public class BucketAccessKey extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the access key.
     * 
     */
    @Export(name="accessKeyId", refs={String.class}, tree="[0]")
    private Output<String> accessKeyId;

    /**
     * @return The ID of the access key.
     * 
     */
    public Output<String> accessKeyId() {
        return this.accessKeyId;
    }
    /**
     * The name of the bucket that the new access key will belong to, and grant access to.
     * 
     */
    @Export(name="bucketName", refs={String.class}, tree="[0]")
    private Output<String> bucketName;

    /**
     * @return The name of the bucket that the new access key will belong to, and grant access to.
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }
    /**
     * The timestamp when the access key was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return The timestamp when the access key was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The secret access key used to sign requests. This attribute is not available for imported resources. Note that this will be written to the state file.
     * 
     */
    @Export(name="secretAccessKey", refs={String.class}, tree="[0]")
    private Output<String> secretAccessKey;

    /**
     * @return The secret access key used to sign requests. This attribute is not available for imported resources. Note that this will be written to the state file.
     * 
     */
    public Output<String> secretAccessKey() {
        return this.secretAccessKey;
    }
    /**
     * The status of the access key.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the access key.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketAccessKey(String name) {
        this(name, BucketAccessKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketAccessKey(String name, BucketAccessKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketAccessKey(String name, BucketAccessKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/bucketAccessKey:BucketAccessKey", name, args == null ? BucketAccessKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketAccessKey(String name, Output<String> id, @Nullable BucketAccessKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/bucketAccessKey:BucketAccessKey", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static BucketAccessKey get(String name, Output<String> id, @Nullable BucketAccessKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketAccessKey(name, id, state, options);
    }
}
