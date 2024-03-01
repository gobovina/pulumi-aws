// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.storagegateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.storagegateway.StoredIscsiVolumeArgs;
import com.pulumi.aws.storagegateway.inputs.StoredIscsiVolumeState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an AWS Storage Gateway stored iSCSI volume.
 * 
 * &gt; **NOTE:** The gateway must have a working storage added (e.g., via the `aws.storagegateway.WorkingStorage` resource) before the volume is operational to clients, however the Storage Gateway API will allow volume creation without error in that case and return volume status as `WORKING STORAGE NOT CONFIGURED`.
 * 
 * ## Example Usage
 * ### Create Empty Stored iSCSI Volume
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.storagegateway.StoredIscsiVolume;
 * import com.pulumi.aws.storagegateway.StoredIscsiVolumeArgs;
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
 *         var example = new StoredIscsiVolume(&#34;example&#34;, StoredIscsiVolumeArgs.builder()        
 *             .gatewayArn(exampleAwsStoragegatewayCache.gatewayArn())
 *             .networkInterfaceId(exampleAwsInstance.privateIp())
 *             .targetName(&#34;example&#34;)
 *             .preserveExistingData(false)
 *             .diskId(test.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Create Stored iSCSI Volume From Snapshot
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.storagegateway.StoredIscsiVolume;
 * import com.pulumi.aws.storagegateway.StoredIscsiVolumeArgs;
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
 *         var example = new StoredIscsiVolume(&#34;example&#34;, StoredIscsiVolumeArgs.builder()        
 *             .gatewayArn(exampleAwsStoragegatewayCache.gatewayArn())
 *             .networkInterfaceId(exampleAwsInstance.privateIp())
 *             .snapshotId(exampleAwsEbsSnapshot.id())
 *             .targetName(&#34;example&#34;)
 *             .preserveExistingData(false)
 *             .diskId(test.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_storagegateway_stored_iscsi_volume` using the volume Amazon Resource Name (ARN). For example:
 * 
 * ```sh
 *  $ pulumi import aws:storagegateway/storedIscsiVolume:StoredIscsiVolume example arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678
 * ```
 * 
 */
@ResourceType(type="aws:storagegateway/storedIscsiVolume:StoredIscsiVolume")
public class StoredIscsiVolume extends com.pulumi.resources.CustomResource {
    /**
     * Volume Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Volume Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Whether mutual CHAP is enabled for the iSCSI target.
     * 
     */
    @Export(name="chapEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> chapEnabled;

    /**
     * @return Whether mutual CHAP is enabled for the iSCSI target.
     * 
     */
    public Output<Boolean> chapEnabled() {
        return this.chapEnabled;
    }
    /**
     * The unique identifier for the gateway local disk that is configured as a stored volume.
     * 
     */
    @Export(name="diskId", refs={String.class}, tree="[0]")
    private Output<String> diskId;

    /**
     * @return The unique identifier for the gateway local disk that is configured as a stored volume.
     * 
     */
    public Output<String> diskId() {
        return this.diskId;
    }
    /**
     * The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    @Export(name="gatewayArn", refs={String.class}, tree="[0]")
    private Output<String> gatewayArn;

    /**
     * @return The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    public Output<String> gatewayArn() {
        return this.gatewayArn;
    }
    /**
     * `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Optional.
     * 
     */
    @Export(name="kmsEncrypted", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> kmsEncrypted;

    /**
     * @return `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Optional.
     * 
     */
    public Output<Optional<Boolean>> kmsEncrypted() {
        return Codegen.optional(this.kmsEncrypted);
    }
    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when `kms_encrypted` is `true`.
     * 
     */
    @Export(name="kmsKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kmsKey;

    /**
     * @return The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when `kms_encrypted` is `true`.
     * 
     */
    public Output<Optional<String>> kmsKey() {
        return Codegen.optional(this.kmsKey);
    }
    /**
     * Logical disk number.
     * 
     */
    @Export(name="lunNumber", refs={Integer.class}, tree="[0]")
    private Output<Integer> lunNumber;

    /**
     * @return Logical disk number.
     * 
     */
    public Output<Integer> lunNumber() {
        return this.lunNumber;
    }
    /**
     * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
     * 
     */
    @Export(name="networkInterfaceId", refs={String.class}, tree="[0]")
    private Output<String> networkInterfaceId;

    /**
     * @return The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
     * 
     */
    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * The port used to communicate with iSCSI targets.
     * 
     */
    @Export(name="networkInterfacePort", refs={Integer.class}, tree="[0]")
    private Output<Integer> networkInterfacePort;

    /**
     * @return The port used to communicate with iSCSI targets.
     * 
     */
    public Output<Integer> networkInterfacePort() {
        return this.networkInterfacePort;
    }
    /**
     * Specify this field as `true` if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.
     * 
     */
    @Export(name="preserveExistingData", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> preserveExistingData;

    /**
     * @return Specify this field as `true` if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.
     * 
     */
    public Output<Boolean> preserveExistingData() {
        return this.preserveExistingData;
    }
    /**
     * The snapshot ID of the snapshot to restore as the new stored volumeE.g., `snap-1122aabb`.
     * 
     */
    @Export(name="snapshotId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> snapshotId;

    /**
     * @return The snapshot ID of the snapshot to restore as the new stored volumeE.g., `snap-1122aabb`.
     * 
     */
    public Output<Optional<String>> snapshotId() {
        return Codegen.optional(this.snapshotId);
    }
    /**
     * Key-value mapping of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Target Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/target/iqn.1997-05.com.amazon:TargetName`.
     * 
     */
    @Export(name="targetArn", refs={String.class}, tree="[0]")
    private Output<String> targetArn;

    /**
     * @return Target Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/target/iqn.1997-05.com.amazon:TargetName`.
     * 
     */
    public Output<String> targetArn() {
        return this.targetArn;
    }
    /**
     * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
     * 
     */
    @Export(name="targetName", refs={String.class}, tree="[0]")
    private Output<String> targetName;

    /**
     * @return The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
     * 
     */
    public Output<String> targetName() {
        return this.targetName;
    }
    /**
     * A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching from a gateway.
     * 
     */
    @Export(name="volumeAttachmentStatus", refs={String.class}, tree="[0]")
    private Output<String> volumeAttachmentStatus;

    /**
     * @return A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching from a gateway.
     * 
     */
    public Output<String> volumeAttachmentStatus() {
        return this.volumeAttachmentStatus;
    }
    /**
     * Volume ID, e.g., `vol-12345678`.
     * 
     */
    @Export(name="volumeId", refs={String.class}, tree="[0]")
    private Output<String> volumeId;

    /**
     * @return Volume ID, e.g., `vol-12345678`.
     * 
     */
    public Output<String> volumeId() {
        return this.volumeId;
    }
    /**
     * The size of the data stored on the volume in bytes.
     * 
     */
    @Export(name="volumeSizeInBytes", refs={Integer.class}, tree="[0]")
    private Output<Integer> volumeSizeInBytes;

    /**
     * @return The size of the data stored on the volume in bytes.
     * 
     */
    public Output<Integer> volumeSizeInBytes() {
        return this.volumeSizeInBytes;
    }
    /**
     * indicates the state of the storage volume.
     * 
     */
    @Export(name="volumeStatus", refs={String.class}, tree="[0]")
    private Output<String> volumeStatus;

    /**
     * @return indicates the state of the storage volume.
     * 
     */
    public Output<String> volumeStatus() {
        return this.volumeStatus;
    }
    /**
     * indicates the type of the volume.
     * 
     */
    @Export(name="volumeType", refs={String.class}, tree="[0]")
    private Output<String> volumeType;

    /**
     * @return indicates the type of the volume.
     * 
     */
    public Output<String> volumeType() {
        return this.volumeType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StoredIscsiVolume(String name) {
        this(name, StoredIscsiVolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StoredIscsiVolume(String name, StoredIscsiVolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StoredIscsiVolume(String name, StoredIscsiVolumeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:storagegateway/storedIscsiVolume:StoredIscsiVolume", name, args == null ? StoredIscsiVolumeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StoredIscsiVolume(String name, Output<String> id, @Nullable StoredIscsiVolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:storagegateway/storedIscsiVolume:StoredIscsiVolume", name, state, makeResourceOptions(options, id));
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
    public static StoredIscsiVolume get(String name, Output<String> id, @Nullable StoredIscsiVolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StoredIscsiVolume(name, id, state, options);
    }
}
