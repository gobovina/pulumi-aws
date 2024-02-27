// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.finspace;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.finspace.KxVolumeArgs;
import com.pulumi.aws.finspace.inputs.KxVolumeState;
import com.pulumi.aws.finspace.outputs.KxVolumeAttachedCluster;
import com.pulumi.aws.finspace.outputs.KxVolumeNas1Configuration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS FinSpace Kx Volume.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.finspace.KxVolume;
 * import com.pulumi.aws.finspace.KxVolumeArgs;
 * import com.pulumi.aws.finspace.inputs.KxVolumeNas1ConfigurationArgs;
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
 *         var example = new KxVolume(&#34;example&#34;, KxVolumeArgs.builder()        
 *             .environmentId(aws_finspace_kx_environment.example().id())
 *             .availabilityZones(&#34;use1-az2&#34;)
 *             .azMode(&#34;SINGLE&#34;)
 *             .type(&#34;NAS_1&#34;)
 *             .nas1Configurations(KxVolumeNas1ConfigurationArgs.builder()
 *                 .size(1200)
 *                 .type(&#34;SSD_250&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import an AWS FinSpace Kx Volume using the `id` (environment ID and volume name, comma-delimited). For example:
 * 
 * ```sh
 *  $ pulumi import aws:finspace/kxVolume:KxVolume example n3ceo7wqxoxcti5tujqwzs,my-tf-kx-volume
 * ```
 * 
 */
@ResourceType(type="aws:finspace/kxVolume:KxVolume")
public class KxVolume extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) identifier of the KX volume.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) identifier of the KX volume.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="attachedClusters", refs={List.class,KxVolumeAttachedCluster.class}, tree="[0,1]")
    private Output<List<KxVolumeAttachedCluster>> attachedClusters;

    public Output<List<KxVolumeAttachedCluster>> attachedClusters() {
        return this.attachedClusters;
    }
    /**
     * The identifier of the AWS Availability Zone IDs.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="availabilityZones", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> availabilityZones;

    /**
     * @return The identifier of the AWS Availability Zone IDs.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<List<String>> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * The number of availability zones you want to assign per volume. Currently, Finspace only support SINGLE for volumes.
     * 
     */
    @Export(name="azMode", refs={String.class}, tree="[0]")
    private Output<String> azMode;

    /**
     * @return The number of availability zones you want to assign per volume. Currently, Finspace only support SINGLE for volumes.
     * 
     */
    public Output<String> azMode() {
        return this.azMode;
    }
    /**
     * The timestamp at which the volume was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * 
     */
    @Export(name="createdTimestamp", refs={String.class}, tree="[0]")
    private Output<String> createdTimestamp;

    /**
     * @return The timestamp at which the volume was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * 
     */
    public Output<String> createdTimestamp() {
        return this.createdTimestamp;
    }
    /**
     * Description of the volume.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the volume.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * 
     */
    @Export(name="environmentId", refs={String.class}, tree="[0]")
    private Output<String> environmentId;

    /**
     * @return A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * 
     */
    public Output<String> environmentId() {
        return this.environmentId;
    }
    /**
     * Last timestamp at which the volume was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
     * 
     */
    @Export(name="lastModifiedTimestamp", refs={String.class}, tree="[0]")
    private Output<String> lastModifiedTimestamp;

    /**
     * @return Last timestamp at which the volume was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
     * 
     */
    public Output<String> lastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }
    /**
     * Unique name for the volumr that you want to create.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Unique name for the volumr that you want to create.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the configuration for the Network attached storage (`NAS_1`) file system volume. This parameter is required when `volume_type` is `NAS_1`. See `nas1_configuration` Argument Reference below.
     * 
     */
    @Export(name="nas1Configurations", refs={List.class,KxVolumeNas1Configuration.class}, tree="[0,1]")
    private Output</* @Nullable */ List<KxVolumeNas1Configuration>> nas1Configurations;

    /**
     * @return Specifies the configuration for the Network attached storage (`NAS_1`) file system volume. This parameter is required when `volume_type` is `NAS_1`. See `nas1_configuration` Argument Reference below.
     * 
     */
    public Output<Optional<List<KxVolumeNas1Configuration>>> nas1Configurations() {
        return Codegen.optional(this.nas1Configurations);
    }
    /**
     * The status of volume creation.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of volume creation.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The error message when a failed state occurs.
     * 
     */
    @Export(name="statusReason", refs={String.class}, tree="[0]")
    private Output<String> statusReason;

    /**
     * @return The error message when a failed state occurs.
     * 
     */
    public Output<String> statusReason() {
        return this.statusReason;
    }
    /**
     * A list of key-value pairs to label the volume. You can add up to 50 tags to a volume
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A list of key-value pairs to label the volume. You can add up to 50 tags to a volume
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The type of file system volume. Currently, FinSpace only supports the `NAS_1` volume type. When you select the `NAS_1` volume type, you must also provide `nas1_configuration`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of file system volume. Currently, FinSpace only supports the `NAS_1` volume type. When you select the `NAS_1` volume type, you must also provide `nas1_configuration`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KxVolume(String name) {
        this(name, KxVolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KxVolume(String name, KxVolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KxVolume(String name, KxVolumeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:finspace/kxVolume:KxVolume", name, args == null ? KxVolumeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KxVolume(String name, Output<String> id, @Nullable KxVolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:finspace/kxVolume:KxVolume", name, state, makeResourceOptions(options, id));
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
    public static KxVolume get(String name, Output<String> id, @Nullable KxVolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KxVolume(name, id, state, options);
    }
}
