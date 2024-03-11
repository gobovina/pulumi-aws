// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.kinesisanalyticsv2.ApplicationSnapshotArgs;
import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationSnapshotState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Kinesis Analytics v2 Application Snapshot.
 * Snapshots are the AWS implementation of [Flink Savepoints](https://ci.apache.org/projects/flink/flink-docs-release-1.11/ops/state/savepoints.html).
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
 * import com.pulumi.aws.kinesisanalyticsv2.ApplicationSnapshot;
 * import com.pulumi.aws.kinesisanalyticsv2.ApplicationSnapshotArgs;
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
 *         var example = new ApplicationSnapshot(&#34;example&#34;, ApplicationSnapshotArgs.builder()        
 *             .applicationName(exampleAwsKinesisanalyticsv2Application.name())
 *             .snapshotName(&#34;example-snapshot&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_kinesisanalyticsv2_application` using `application_name` together with `snapshot_name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:kinesisanalyticsv2/applicationSnapshot:ApplicationSnapshot example example-application/example-snapshot
 * ```
 * 
 */
@ResourceType(type="aws:kinesisanalyticsv2/applicationSnapshot:ApplicationSnapshot")
public class ApplicationSnapshot extends com.pulumi.resources.CustomResource {
    /**
     * The name of an existing  Kinesis Analytics v2 Application. Note that the application must be running for a snapshot to be created.
     * 
     */
    @Export(name="applicationName", refs={String.class}, tree="[0]")
    private Output<String> applicationName;

    /**
     * @return The name of an existing  Kinesis Analytics v2 Application. Note that the application must be running for a snapshot to be created.
     * 
     */
    public Output<String> applicationName() {
        return this.applicationName;
    }
    /**
     * The current application version ID when the snapshot was created.
     * 
     */
    @Export(name="applicationVersionId", refs={Integer.class}, tree="[0]")
    private Output<Integer> applicationVersionId;

    /**
     * @return The current application version ID when the snapshot was created.
     * 
     */
    public Output<Integer> applicationVersionId() {
        return this.applicationVersionId;
    }
    /**
     * The timestamp of the application snapshot.
     * 
     */
    @Export(name="snapshotCreationTimestamp", refs={String.class}, tree="[0]")
    private Output<String> snapshotCreationTimestamp;

    /**
     * @return The timestamp of the application snapshot.
     * 
     */
    public Output<String> snapshotCreationTimestamp() {
        return this.snapshotCreationTimestamp;
    }
    /**
     * The name of the application snapshot.
     * 
     */
    @Export(name="snapshotName", refs={String.class}, tree="[0]")
    private Output<String> snapshotName;

    /**
     * @return The name of the application snapshot.
     * 
     */
    public Output<String> snapshotName() {
        return this.snapshotName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplicationSnapshot(String name) {
        this(name, ApplicationSnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplicationSnapshot(String name, ApplicationSnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplicationSnapshot(String name, ApplicationSnapshotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesisanalyticsv2/applicationSnapshot:ApplicationSnapshot", name, args == null ? ApplicationSnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplicationSnapshot(String name, Output<String> id, @Nullable ApplicationSnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesisanalyticsv2/applicationSnapshot:ApplicationSnapshot", name, state, makeResourceOptions(options, id));
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
    public static ApplicationSnapshot get(String name, Output<String> id, @Nullable ApplicationSnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplicationSnapshot(name, id, state, options);
    }
}
