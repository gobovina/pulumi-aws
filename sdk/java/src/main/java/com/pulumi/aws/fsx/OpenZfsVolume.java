// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.fsx.OpenZfsVolumeArgs;
import com.pulumi.aws.fsx.inputs.OpenZfsVolumeState;
import com.pulumi.aws.fsx.outputs.OpenZfsVolumeNfsExports;
import com.pulumi.aws.fsx.outputs.OpenZfsVolumeOriginSnapshot;
import com.pulumi.aws.fsx.outputs.OpenZfsVolumeUserAndGroupQuota;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Amazon FSx for OpenZFS volume.
 * See the [FSx OpenZFS User Guide](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/what-is-fsx.html) for more information.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.fsx.OpenZfsVolume;
 * import com.pulumi.aws.fsx.OpenZfsVolumeArgs;
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
 *         var test = new OpenZfsVolume(&#34;test&#34;, OpenZfsVolumeArgs.builder()        
 *             .parentVolumeId(aws_fsx_openzfs_file_system.test().root_volume_id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import FSx Volumes using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:fsx/openZfsVolume:OpenZfsVolume example fsvol-543ab12b1ca672f33
 * ```
 * 
 */
@ResourceType(type="aws:fsx/openZfsVolume:OpenZfsVolume")
public class OpenZfsVolume extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name of the file system.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name of the file system.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
     * 
     */
    @Export(name="copyTagsToSnapshots", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> copyTagsToSnapshots;

    /**
     * @return A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
     * 
     */
    public Output<Optional<Boolean>> copyTagsToSnapshots() {
        return Codegen.optional(this.copyTagsToSnapshots);
    }
    /**
     * Method used to compress the data on the volume. Valid values are `NONE` or `ZSTD`. Child volumes that don&#39;t specify compression option will inherit from parent volume. This option on file system applies to the root volume.
     * 
     */
    @Export(name="dataCompressionType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dataCompressionType;

    /**
     * @return Method used to compress the data on the volume. Valid values are `NONE` or `ZSTD`. Child volumes that don&#39;t specify compression option will inherit from parent volume. This option on file system applies to the root volume.
     * 
     */
    public Output<Optional<String>> dataCompressionType() {
        return Codegen.optional(this.dataCompressionType);
    }
    /**
     * Whether to delete all child volumes and snapshots. Valid values: `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS`. This configuration must be applied separately before attempting to delete the resource to have the desired behavior..
     * 
     */
    @Export(name="deleteVolumeOptions", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deleteVolumeOptions;

    /**
     * @return Whether to delete all child volumes and snapshots. Valid values: `DELETE_CHILD_VOLUMES_AND_SNAPSHOTS`. This configuration must be applied separately before attempting to delete the resource to have the desired behavior..
     * 
     */
    public Output<Optional<String>> deleteVolumeOptions() {
        return Codegen.optional(this.deleteVolumeOptions);
    }
    /**
     * The name of the Volume. You can use a maximum of 203 alphanumeric characters, plus the underscore (_) special character.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Volume. You can use a maximum of 203 alphanumeric characters, plus the underscore (_) special character.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * NFS export configuration for the root volume. Exactly 1 item. See NFS Exports Below.
     * 
     */
    @Export(name="nfsExports", refs={OpenZfsVolumeNfsExports.class}, tree="[0]")
    private Output</* @Nullable */ OpenZfsVolumeNfsExports> nfsExports;

    /**
     * @return NFS export configuration for the root volume. Exactly 1 item. See NFS Exports Below.
     * 
     */
    public Output<Optional<OpenZfsVolumeNfsExports>> nfsExports() {
        return Codegen.optional(this.nfsExports);
    }
    /**
     * The ARN of the source snapshot to create the volume from.
     * 
     */
    @Export(name="originSnapshot", refs={OpenZfsVolumeOriginSnapshot.class}, tree="[0]")
    private Output</* @Nullable */ OpenZfsVolumeOriginSnapshot> originSnapshot;

    /**
     * @return The ARN of the source snapshot to create the volume from.
     * 
     */
    public Output<Optional<OpenZfsVolumeOriginSnapshot>> originSnapshot() {
        return Codegen.optional(this.originSnapshot);
    }
    /**
     * The volume id of volume that will be the parent volume for the volume being created, this could be the root volume created from the `aws.fsx.OpenZfsFileSystem` resource with the `root_volume_id` or the `id` property of another `aws.fsx.OpenZfsVolume`.
     * 
     */
    @Export(name="parentVolumeId", refs={String.class}, tree="[0]")
    private Output<String> parentVolumeId;

    /**
     * @return The volume id of volume that will be the parent volume for the volume being created, this could be the root volume created from the `aws.fsx.OpenZfsFileSystem` resource with the `root_volume_id` or the `id` property of another `aws.fsx.OpenZfsVolume`.
     * 
     */
    public Output<String> parentVolumeId() {
        return this.parentVolumeId;
    }
    /**
     * specifies whether the volume is read-only. Default is false.
     * 
     */
    @Export(name="readOnly", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> readOnly;

    /**
     * @return specifies whether the volume is read-only. Default is false.
     * 
     */
    public Output<Boolean> readOnly() {
        return this.readOnly;
    }
    /**
     * The record size of an OpenZFS volume, in kibibytes (KiB). Valid values are `4`, `8`, `16`, `32`, `64`, `128`, `256`, `512`, or `1024` KiB. The default is `128` KiB.
     * 
     */
    @Export(name="recordSizeKib", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> recordSizeKib;

    /**
     * @return The record size of an OpenZFS volume, in kibibytes (KiB). Valid values are `4`, `8`, `16`, `32`, `64`, `128`, `256`, `512`, or `1024` KiB. The default is `128` KiB.
     * 
     */
    public Output<Optional<Integer>> recordSizeKib() {
        return Codegen.optional(this.recordSizeKib);
    }
    /**
     * The maximum amount of storage in gibibytes (GiB) that the volume can use from its parent.
     * 
     */
    @Export(name="storageCapacityQuotaGib", refs={Integer.class}, tree="[0]")
    private Output<Integer> storageCapacityQuotaGib;

    /**
     * @return The maximum amount of storage in gibibytes (GiB) that the volume can use from its parent.
     * 
     */
    public Output<Integer> storageCapacityQuotaGib() {
        return this.storageCapacityQuotaGib;
    }
    /**
     * The amount of storage in gibibytes (GiB) to reserve from the parent volume.
     * 
     */
    @Export(name="storageCapacityReservationGib", refs={Integer.class}, tree="[0]")
    private Output<Integer> storageCapacityReservationGib;

    /**
     * @return The amount of storage in gibibytes (GiB) to reserve from the parent volume.
     * 
     */
    public Output<Integer> storageCapacityReservationGib() {
        return this.storageCapacityReservationGib;
    }
    /**
     * A map of tags to assign to the file system. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the file system. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Specify how much storage users or groups can use on the volume. Maximum of 100 items. See User and Group Quotas Below.
     * 
     */
    @Export(name="userAndGroupQuotas", refs={List.class,OpenZfsVolumeUserAndGroupQuota.class}, tree="[0,1]")
    private Output<List<OpenZfsVolumeUserAndGroupQuota>> userAndGroupQuotas;

    /**
     * @return Specify how much storage users or groups can use on the volume. Maximum of 100 items. See User and Group Quotas Below.
     * 
     */
    public Output<List<OpenZfsVolumeUserAndGroupQuota>> userAndGroupQuotas() {
        return this.userAndGroupQuotas;
    }
    @Export(name="volumeType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> volumeType;

    public Output<Optional<String>> volumeType() {
        return Codegen.optional(this.volumeType);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OpenZfsVolume(String name) {
        this(name, OpenZfsVolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OpenZfsVolume(String name, OpenZfsVolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OpenZfsVolume(String name, OpenZfsVolumeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/openZfsVolume:OpenZfsVolume", name, args == null ? OpenZfsVolumeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OpenZfsVolume(String name, Output<String> id, @Nullable OpenZfsVolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/openZfsVolume:OpenZfsVolume", name, state, makeResourceOptions(options, id));
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
    public static OpenZfsVolume get(String name, Output<String> id, @Nullable OpenZfsVolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OpenZfsVolume(name, id, state, options);
    }
}
