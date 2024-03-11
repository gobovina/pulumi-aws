// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.storagegateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.storagegateway.CachesIscsiVolumeArgs;
import com.pulumi.aws.storagegateway.inputs.CachesIscsiVolumeState;
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
 * Manages an AWS Storage Gateway cached iSCSI volume.
 * 
 * &gt; **NOTE:** The gateway must have cache added (e.g., via the `aws.storagegateway.Cache` resource) before creating volumes otherwise the Storage Gateway API will return an error.
 * 
 * &gt; **NOTE:** The gateway must have an upload buffer added (e.g., via the `aws.storagegateway.UploadBuffer` resource) before the volume is operational to clients, however the Storage Gateway API will allow volume creation without error in that case and return volume status as `UPLOAD BUFFER NOT CONFIGURED`.
 * 
 * ## Example Usage
 * 
 * &gt; **NOTE:** These examples are referencing the `aws.storagegateway.Cache` resource `gateway_arn` attribute to ensure this provider properly adds cache before creating the volume. If you are not using this method, you may need to declare an expicit dependency (e.g. via `depends_on = [aws_storagegateway_cache.example]`) to ensure proper ordering.
 * 
 * ### Create Empty Cached iSCSI Volume
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.storagegateway.CachesIscsiVolume;
 * import com.pulumi.aws.storagegateway.CachesIscsiVolumeArgs;
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
 *         var example = new CachesIscsiVolume(&#34;example&#34;, CachesIscsiVolumeArgs.builder()        
 *             .gatewayArn(exampleAwsStoragegatewayCache.gatewayArn())
 *             .networkInterfaceId(exampleAwsInstance.privateIp())
 *             .targetName(&#34;example&#34;)
 *             .volumeSizeInBytes(5368709120)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Create Cached iSCSI Volume From Snapshot
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.storagegateway.CachesIscsiVolume;
 * import com.pulumi.aws.storagegateway.CachesIscsiVolumeArgs;
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
 *         var example = new CachesIscsiVolume(&#34;example&#34;, CachesIscsiVolumeArgs.builder()        
 *             .gatewayArn(exampleAwsStoragegatewayCache.gatewayArn())
 *             .networkInterfaceId(exampleAwsInstance.privateIp())
 *             .snapshotId(exampleAwsEbsSnapshot.id())
 *             .targetName(&#34;example&#34;)
 *             .volumeSizeInBytes(exampleAwsEbsSnapshot.volumeSize() * 1024 * 1024 * 1024)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Create Cached iSCSI Volume From Source Volume
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.storagegateway.CachesIscsiVolume;
 * import com.pulumi.aws.storagegateway.CachesIscsiVolumeArgs;
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
 *         var example = new CachesIscsiVolume(&#34;example&#34;, CachesIscsiVolumeArgs.builder()        
 *             .gatewayArn(exampleAwsStoragegatewayCache.gatewayArn())
 *             .networkInterfaceId(exampleAwsInstance.privateIp())
 *             .sourceVolumeArn(existing.arn())
 *             .targetName(&#34;example&#34;)
 *             .volumeSizeInBytes(existing.volumeSizeInBytes())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_storagegateway_cached_iscsi_volume` using the volume Amazon Resource Name (ARN). For example:
 * 
 * ```sh
 * $ pulumi import aws:storagegateway/cachesIscsiVolume:CachesIscsiVolume example arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678
 * ```
 * 
 */
@ResourceType(type="aws:storagegateway/cachesIscsiVolume:CachesIscsiVolume")
public class CachesIscsiVolume extends com.pulumi.resources.CustomResource {
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
     * Set to `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3.
     * 
     */
    @Export(name="kmsEncrypted", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> kmsEncrypted;

    /**
     * @return Set to `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3.
     * 
     */
    public Output<Optional<Boolean>> kmsEncrypted() {
        return Codegen.optional(this.kmsEncrypted);
    }
    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. Is required when `kms_encrypted` is set.
     * 
     */
    @Export(name="kmsKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kmsKey;

    /**
     * @return The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. Is required when `kms_encrypted` is set.
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
     * The snapshot ID of the snapshot to restore as the new cached volumeE.g., `snap-1122aabb`.
     * 
     */
    @Export(name="snapshotId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> snapshotId;

    /**
     * @return The snapshot ID of the snapshot to restore as the new cached volumeE.g., `snap-1122aabb`.
     * 
     */
    public Output<Optional<String>> snapshotId() {
        return Codegen.optional(this.snapshotId);
    }
    /**
     * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume&#39;s latest recovery point. The `volume_size_in_bytes` value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
     * 
     */
    @Export(name="sourceVolumeArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceVolumeArn;

    /**
     * @return The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume&#39;s latest recovery point. The `volume_size_in_bytes` value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
     * 
     */
    public Output<Optional<String>> sourceVolumeArn() {
        return Codegen.optional(this.sourceVolumeArn);
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Volume Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
     * 
     */
    @Export(name="volumeArn", refs={String.class}, tree="[0]")
    private Output<String> volumeArn;

    /**
     * @return Volume Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
     * 
     */
    public Output<String> volumeArn() {
        return this.volumeArn;
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
     * The size of the volume in bytes.
     * 
     */
    @Export(name="volumeSizeInBytes", refs={Integer.class}, tree="[0]")
    private Output<Integer> volumeSizeInBytes;

    /**
     * @return The size of the volume in bytes.
     * 
     */
    public Output<Integer> volumeSizeInBytes() {
        return this.volumeSizeInBytes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CachesIscsiVolume(String name) {
        this(name, CachesIscsiVolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CachesIscsiVolume(String name, CachesIscsiVolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CachesIscsiVolume(String name, CachesIscsiVolumeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:storagegateway/cachesIscsiVolume:CachesIscsiVolume", name, args == null ? CachesIscsiVolumeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CachesIscsiVolume(String name, Output<String> id, @Nullable CachesIscsiVolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:storagegateway/cachesIscsiVolume:CachesIscsiVolume", name, state, makeResourceOptions(options, id));
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
    public static CachesIscsiVolume get(String name, Output<String> id, @Nullable CachesIscsiVolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CachesIscsiVolume(name, id, state, options);
    }
}
