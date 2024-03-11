// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ebs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ebs.SnapshotArgs;
import com.pulumi.aws.ebs.inputs.SnapshotState;
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
 * Creates a Snapshot of an EBS Volume.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ebs.Volume;
 * import com.pulumi.aws.ebs.VolumeArgs;
 * import com.pulumi.aws.ebs.Snapshot;
 * import com.pulumi.aws.ebs.SnapshotArgs;
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
 *         var example = new Volume(&#34;example&#34;, VolumeArgs.builder()        
 *             .availabilityZone(&#34;us-west-2a&#34;)
 *             .size(40)
 *             .tags(Map.of(&#34;Name&#34;, &#34;HelloWorld&#34;))
 *             .build());
 * 
 *         var exampleSnapshot = new Snapshot(&#34;exampleSnapshot&#34;, SnapshotArgs.builder()        
 *             .volumeId(example.id())
 *             .tags(Map.of(&#34;Name&#34;, &#34;HelloWorld_snap&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import EBS Snapshot using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:ebs/snapshot:Snapshot id snap-049df61146c4d7901
 * ```
 * 
 */
@ResourceType(type="aws:ebs/snapshot:Snapshot")
public class Snapshot extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the EBS Snapshot.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the EBS Snapshot.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The data encryption key identifier for the snapshot.
     * 
     */
    @Export(name="dataEncryptionKeyId", refs={String.class}, tree="[0]")
    private Output<String> dataEncryptionKeyId;

    /**
     * @return The data encryption key identifier for the snapshot.
     * 
     */
    public Output<String> dataEncryptionKeyId() {
        return this.dataEncryptionKeyId;
    }
    /**
     * A description of what the snapshot is.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of what the snapshot is.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether the snapshot is encrypted.
     * 
     */
    @Export(name="encrypted", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> encrypted;

    /**
     * @return Whether the snapshot is encrypted.
     * 
     */
    public Output<Boolean> encrypted() {
        return this.encrypted;
    }
    /**
     * The ARN for the KMS encryption key.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyId;

    /**
     * @return The ARN for the KMS encryption key.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The Amazon Resource Name (ARN) of the Outpost on which to create a local snapshot.
     * 
     */
    @Export(name="outpostArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> outpostArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Outpost on which to create a local snapshot.
     * 
     */
    public Output<Optional<String>> outpostArn() {
        return Codegen.optional(this.outpostArn);
    }
    /**
     * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
     * 
     */
    @Export(name="ownerAlias", refs={String.class}, tree="[0]")
    private Output<String> ownerAlias;

    /**
     * @return Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
     * 
     */
    public Output<String> ownerAlias() {
        return this.ownerAlias;
    }
    /**
     * The AWS account ID of the EBS snapshot owner.
     * 
     */
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    /**
     * @return The AWS account ID of the EBS snapshot owner.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * Indicates whether to permanently restore an archived snapshot.
     * 
     */
    @Export(name="permanentRestore", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> permanentRestore;

    /**
     * @return Indicates whether to permanently restore an archived snapshot.
     * 
     */
    public Output<Optional<Boolean>> permanentRestore() {
        return Codegen.optional(this.permanentRestore);
    }
    /**
     * The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     * 
     */
    @Export(name="storageTier", refs={String.class}, tree="[0]")
    private Output<String> storageTier;

    /**
     * @return The name of the storage tier. Valid values are `archive` and `standard`. Default value is `standard`.
     * 
     */
    public Output<String> storageTier() {
        return this.storageTier;
    }
    /**
     * A map of tags to assign to the snapshot. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the snapshot. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
     * 
     */
    @Export(name="temporaryRestoreDays", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> temporaryRestoreDays;

    /**
     * @return Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period.
     * 
     */
    public Output<Optional<Integer>> temporaryRestoreDays() {
        return Codegen.optional(this.temporaryRestoreDays);
    }
    /**
     * The Volume ID of which to make a snapshot.
     * 
     */
    @Export(name="volumeId", refs={String.class}, tree="[0]")
    private Output<String> volumeId;

    /**
     * @return The Volume ID of which to make a snapshot.
     * 
     */
    public Output<String> volumeId() {
        return this.volumeId;
    }
    /**
     * The size of the drive in GiBs.
     * 
     */
    @Export(name="volumeSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> volumeSize;

    /**
     * @return The size of the drive in GiBs.
     * 
     */
    public Output<Integer> volumeSize() {
        return this.volumeSize;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Snapshot(String name) {
        this(name, SnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Snapshot(String name, SnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Snapshot(String name, SnapshotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ebs/snapshot:Snapshot", name, args == null ? SnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Snapshot(String name, Output<String> id, @Nullable SnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ebs/snapshot:Snapshot", name, state, makeResourceOptions(options, id));
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
    public static Snapshot get(String name, Output<String> id, @Nullable SnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Snapshot(name, id, state, options);
    }
}
