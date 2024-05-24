// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.SnapshotCreateVolumePermissionArgs;
import com.pulumi.aws.ec2.inputs.SnapshotCreateVolumePermissionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Adds permission to create volumes off of a given EBS Snapshot.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ebs.Volume;
 * import com.pulumi.aws.ebs.VolumeArgs;
 * import com.pulumi.aws.ebs.Snapshot;
 * import com.pulumi.aws.ebs.SnapshotArgs;
 * import com.pulumi.aws.ec2.SnapshotCreateVolumePermission;
 * import com.pulumi.aws.ec2.SnapshotCreateVolumePermissionArgs;
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
 *         var example = new Volume("example", VolumeArgs.builder()
 *             .availabilityZone("us-west-2a")
 *             .size(40)
 *             .build());
 * 
 *         var exampleSnapshot = new Snapshot("exampleSnapshot", SnapshotArgs.builder()
 *             .volumeId(example.id())
 *             .build());
 * 
 *         var examplePerm = new SnapshotCreateVolumePermission("examplePerm", SnapshotCreateVolumePermissionArgs.builder()
 *             .snapshotId(exampleSnapshot.id())
 *             .accountId("12345678")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="aws:ec2/snapshotCreateVolumePermission:SnapshotCreateVolumePermission")
public class SnapshotCreateVolumePermission extends com.pulumi.resources.CustomResource {
    /**
     * An AWS Account ID to add create volume permissions. The AWS Account cannot be the snapshot&#39;s owner
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return An AWS Account ID to add create volume permissions. The AWS Account cannot be the snapshot&#39;s owner
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * A snapshot ID
     * 
     */
    @Export(name="snapshotId", refs={String.class}, tree="[0]")
    private Output<String> snapshotId;

    /**
     * @return A snapshot ID
     * 
     */
    public Output<String> snapshotId() {
        return this.snapshotId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SnapshotCreateVolumePermission(String name) {
        this(name, SnapshotCreateVolumePermissionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SnapshotCreateVolumePermission(String name, SnapshotCreateVolumePermissionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SnapshotCreateVolumePermission(String name, SnapshotCreateVolumePermissionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/snapshotCreateVolumePermission:SnapshotCreateVolumePermission", name, args == null ? SnapshotCreateVolumePermissionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SnapshotCreateVolumePermission(String name, Output<String> id, @Nullable SnapshotCreateVolumePermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/snapshotCreateVolumePermission:SnapshotCreateVolumePermission", name, state, makeResourceOptions(options, id));
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
    public static SnapshotCreateVolumePermission get(String name, Output<String> id, @Nullable SnapshotCreateVolumePermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SnapshotCreateVolumePermission(name, id, state, options);
    }
}
