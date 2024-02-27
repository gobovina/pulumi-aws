// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.fsx.OntapVolumeArgs;
import com.pulumi.aws.fsx.inputs.OntapVolumeState;
import com.pulumi.aws.fsx.outputs.OntapVolumeSnaplockConfiguration;
import com.pulumi.aws.fsx.outputs.OntapVolumeTieringPolicy;
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
 * Manages a FSx ONTAP Volume.
 * See the [FSx ONTAP User Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html) for more information.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.fsx.OntapVolume;
 * import com.pulumi.aws.fsx.OntapVolumeArgs;
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
 *         var test = new OntapVolume(&#34;test&#34;, OntapVolumeArgs.builder()        
 *             .junctionPath(&#34;/test&#34;)
 *             .sizeInMegabytes(1024)
 *             .storageEfficiencyEnabled(true)
 *             .storageVirtualMachineId(aws_fsx_ontap_storage_virtual_machine.test().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Using Tiering Policy
 * 
 * Additional information on tiering policy with ONTAP Volumes can be found in the [FSx ONTAP Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html).
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.fsx.OntapVolume;
 * import com.pulumi.aws.fsx.OntapVolumeArgs;
 * import com.pulumi.aws.fsx.inputs.OntapVolumeTieringPolicyArgs;
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
 *         var test = new OntapVolume(&#34;test&#34;, OntapVolumeArgs.builder()        
 *             .junctionPath(&#34;/test&#34;)
 *             .sizeInMegabytes(1024)
 *             .storageEfficiencyEnabled(true)
 *             .storageVirtualMachineId(aws_fsx_ontap_storage_virtual_machine.test().id())
 *             .tieringPolicy(OntapVolumeTieringPolicyArgs.builder()
 *                 .name(&#34;AUTO&#34;)
 *                 .coolingPeriod(31)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import FSx ONTAP volume using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:fsx/ontapVolume:OntapVolume example fsvol-12345678abcdef123
 * ```
 * 
 */
@ResourceType(type="aws:fsx/ontapVolume:OntapVolume")
public class OntapVolume extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name of the volune.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name of the volune.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Setting this to `true` allows a SnapLock administrator to delete an FSx for ONTAP SnapLock Enterprise volume with unexpired write once, read many (WORM) files. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
     * 
     */
    @Export(name="bypassSnaplockEnterpriseRetention", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> bypassSnaplockEnterpriseRetention;

    /**
     * @return Setting this to `true` allows a SnapLock administrator to delete an FSx for ONTAP SnapLock Enterprise volume with unexpired write once, read many (WORM) files. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> bypassSnaplockEnterpriseRetention() {
        return Codegen.optional(this.bypassSnaplockEnterpriseRetention);
    }
    /**
     * A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to `false`.
     * 
     */
    @Export(name="copyTagsToBackups", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> copyTagsToBackups;

    /**
     * @return A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> copyTagsToBackups() {
        return Codegen.optional(this.copyTagsToBackups);
    }
    /**
     * Describes the file system for the volume, e.g. `fs-12345679`
     * 
     */
    @Export(name="fileSystemId", refs={String.class}, tree="[0]")
    private Output<String> fileSystemId;

    /**
     * @return Describes the file system for the volume, e.g. `fs-12345679`
     * 
     */
    public Output<String> fileSystemId() {
        return this.fileSystemId;
    }
    /**
     * Specifies the FlexCache endpoint type of the volume, Valid values are `NONE`, `ORIGIN`, `CACHE`. Default value is `NONE`. These can be set by the ONTAP CLI or API and are use with FlexCache feature.
     * 
     */
    @Export(name="flexcacheEndpointType", refs={String.class}, tree="[0]")
    private Output<String> flexcacheEndpointType;

    /**
     * @return Specifies the FlexCache endpoint type of the volume, Valid values are `NONE`, `ORIGIN`, `CACHE`. Default value is `NONE`. These can be set by the ONTAP CLI or API and are use with FlexCache feature.
     * 
     */
    public Output<String> flexcacheEndpointType() {
        return this.flexcacheEndpointType;
    }
    /**
     * Specifies the location in the storage virtual machine&#39;s namespace where the volume is mounted. The junction_path must have a leading forward slash, such as `/vol3`
     * 
     */
    @Export(name="junctionPath", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> junctionPath;

    /**
     * @return Specifies the location in the storage virtual machine&#39;s namespace where the volume is mounted. The junction_path must have a leading forward slash, such as `/vol3`
     * 
     */
    public Output<Optional<String>> junctionPath() {
        return Codegen.optional(this.junctionPath);
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
     * Specifies the type of volume, valid values are `RW`, `DP`. Default value is `RW`. These can be set by the ONTAP CLI or API. This setting is used as part of migration and replication [Migrating to Amazon FSx for NetApp ONTAP](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/migrating-fsx-ontap.html)
     * 
     */
    @Export(name="ontapVolumeType", refs={String.class}, tree="[0]")
    private Output<String> ontapVolumeType;

    /**
     * @return Specifies the type of volume, valid values are `RW`, `DP`. Default value is `RW`. These can be set by the ONTAP CLI or API. This setting is used as part of migration and replication [Migrating to Amazon FSx for NetApp ONTAP](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/migrating-fsx-ontap.html)
     * 
     */
    public Output<String> ontapVolumeType() {
        return this.ontapVolumeType;
    }
    /**
     * Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`.
     * 
     */
    @Export(name="securityStyle", refs={String.class}, tree="[0]")
    private Output<String> securityStyle;

    /**
     * @return Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`.
     * 
     */
    public Output<String> securityStyle() {
        return this.securityStyle;
    }
    /**
     * Specifies the size of the volume, in megabytes (MB), that you are creating.
     * 
     */
    @Export(name="sizeInMegabytes", refs={Integer.class}, tree="[0]")
    private Output<Integer> sizeInMegabytes;

    /**
     * @return Specifies the size of the volume, in megabytes (MB), that you are creating.
     * 
     */
    public Output<Integer> sizeInMegabytes() {
        return this.sizeInMegabytes;
    }
    /**
     * When enabled, will skip the default final backup taken when the volume is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
     * 
     */
    @Export(name="skipFinalBackup", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipFinalBackup;

    /**
     * @return When enabled, will skip the default final backup taken when the volume is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> skipFinalBackup() {
        return Codegen.optional(this.skipFinalBackup);
    }
    /**
     * The SnapLock configuration for an FSx for ONTAP volume. See SnapLock Configuration below.
     * 
     */
    @Export(name="snaplockConfiguration", refs={OntapVolumeSnaplockConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ OntapVolumeSnaplockConfiguration> snaplockConfiguration;

    /**
     * @return The SnapLock configuration for an FSx for ONTAP volume. See SnapLock Configuration below.
     * 
     */
    public Output<Optional<OntapVolumeSnaplockConfiguration>> snaplockConfiguration() {
        return Codegen.optional(this.snaplockConfiguration);
    }
    /**
     * Specifies the snapshot policy for the volume. See [snapshot policies](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies) in the Amazon FSx ONTAP User Guide
     * 
     */
    @Export(name="snapshotPolicy", refs={String.class}, tree="[0]")
    private Output<String> snapshotPolicy;

    /**
     * @return Specifies the snapshot policy for the volume. See [snapshot policies](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies) in the Amazon FSx ONTAP User Guide
     * 
     */
    public Output<String> snapshotPolicy() {
        return this.snapshotPolicy;
    }
    /**
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
     * 
     */
    @Export(name="storageEfficiencyEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> storageEfficiencyEnabled;

    /**
     * @return Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
     * 
     */
    public Output<Optional<Boolean>> storageEfficiencyEnabled() {
        return Codegen.optional(this.storageEfficiencyEnabled);
    }
    /**
     * Specifies the storage virtual machine in which to create the volume.
     * 
     */
    @Export(name="storageVirtualMachineId", refs={String.class}, tree="[0]")
    private Output<String> storageVirtualMachineId;

    /**
     * @return Specifies the storage virtual machine in which to create the volume.
     * 
     */
    public Output<String> storageVirtualMachineId() {
        return this.storageVirtualMachineId;
    }
    /**
     * A map of tags to assign to the volume. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the volume. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The data tiering policy for an FSx for ONTAP volume. See Tiering Policy below.
     * 
     */
    @Export(name="tieringPolicy", refs={OntapVolumeTieringPolicy.class}, tree="[0]")
    private Output</* @Nullable */ OntapVolumeTieringPolicy> tieringPolicy;

    /**
     * @return The data tiering policy for an FSx for ONTAP volume. See Tiering Policy below.
     * 
     */
    public Output<Optional<OntapVolumeTieringPolicy>> tieringPolicy() {
        return Codegen.optional(this.tieringPolicy);
    }
    /**
     * The Volume&#39;s UUID (universally unique identifier).
     * 
     */
    @Export(name="uuid", refs={String.class}, tree="[0]")
    private Output<String> uuid;

    /**
     * @return The Volume&#39;s UUID (universally unique identifier).
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }
    /**
     * The type of volume, currently the only valid value is `ONTAP`.
     * 
     */
    @Export(name="volumeType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> volumeType;

    /**
     * @return The type of volume, currently the only valid value is `ONTAP`.
     * 
     */
    public Output<Optional<String>> volumeType() {
        return Codegen.optional(this.volumeType);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OntapVolume(String name) {
        this(name, OntapVolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OntapVolume(String name, OntapVolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OntapVolume(String name, OntapVolumeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/ontapVolume:OntapVolume", name, args == null ? OntapVolumeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OntapVolume(String name, Output<String> id, @Nullable OntapVolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/ontapVolume:OntapVolume", name, state, makeResourceOptions(options, id));
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
    public static OntapVolume get(String name, Output<String> id, @Nullable OntapVolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OntapVolume(name, id, state, options);
    }
}
