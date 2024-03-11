// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.efs.ReplicationConfigurationArgs;
import com.pulumi.aws.efs.inputs.ReplicationConfigurationState;
import com.pulumi.aws.efs.outputs.ReplicationConfigurationDestination;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a replica of an existing EFS file system in the same or another region. Creating this resource causes the source EFS file system to be replicated to a new read-only destination EFS file system (unless using the `destination.file_system_id` attribute). Deleting this resource will cause the replication from source to destination to stop and the destination file system will no longer be read only.
 * 
 * &gt; **NOTE:** Deleting this resource does **not** delete the destination file system that was created.
 * 
 * ## Example Usage
 * 
 * Will create a replica using regional storage in us-west-2 that will be encrypted by the default EFS KMS key `/aws/elasticfilesystem`.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.efs.FileSystem;
 * import com.pulumi.aws.efs.ReplicationConfiguration;
 * import com.pulumi.aws.efs.ReplicationConfigurationArgs;
 * import com.pulumi.aws.efs.inputs.ReplicationConfigurationDestinationArgs;
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
 *         var example = new FileSystem(&#34;example&#34;);
 * 
 *         var exampleReplicationConfiguration = new ReplicationConfiguration(&#34;exampleReplicationConfiguration&#34;, ReplicationConfigurationArgs.builder()        
 *             .sourceFileSystemId(example.id())
 *             .destination(ReplicationConfigurationDestinationArgs.builder()
 *                 .region(&#34;us-west-2&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Replica will be created as One Zone storage in the us-west-2b Availability Zone and encrypted with the specified KMS key.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.efs.FileSystem;
 * import com.pulumi.aws.efs.ReplicationConfiguration;
 * import com.pulumi.aws.efs.ReplicationConfigurationArgs;
 * import com.pulumi.aws.efs.inputs.ReplicationConfigurationDestinationArgs;
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
 *         var example = new FileSystem(&#34;example&#34;);
 * 
 *         var exampleReplicationConfiguration = new ReplicationConfiguration(&#34;exampleReplicationConfiguration&#34;, ReplicationConfigurationArgs.builder()        
 *             .sourceFileSystemId(example.id())
 *             .destination(ReplicationConfigurationDestinationArgs.builder()
 *                 .availabilityZoneName(&#34;us-west-2b&#34;)
 *                 .kmsKeyId(&#34;1234abcd-12ab-34cd-56ef-1234567890ab&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Will create a replica and set the existing file system with id `fs-1234567890` in us-west-2 as destination.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.efs.FileSystem;
 * import com.pulumi.aws.efs.ReplicationConfiguration;
 * import com.pulumi.aws.efs.ReplicationConfigurationArgs;
 * import com.pulumi.aws.efs.inputs.ReplicationConfigurationDestinationArgs;
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
 *         var example = new FileSystem(&#34;example&#34;);
 * 
 *         var exampleReplicationConfiguration = new ReplicationConfiguration(&#34;exampleReplicationConfiguration&#34;, ReplicationConfigurationArgs.builder()        
 *             .sourceFileSystemId(example.id())
 *             .destination(ReplicationConfigurationDestinationArgs.builder()
 *                 .fileSystemId(&#34;fs-1234567890&#34;)
 *                 .region(&#34;us-west-2&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import EFS Replication Configurations using the file system ID of either the source or destination file system. When importing, the `availability_zone_name` and `kms_key_id` attributes must __not__ be set in the configuration. The AWS API does not return these values when querying the replication configuration and their presence will therefore show as a diff in a subsequent plan. For example:
 * 
 * ```sh
 * $ pulumi import aws:efs/replicationConfiguration:ReplicationConfiguration example fs-id
 * ```
 * 
 */
@ResourceType(type="aws:efs/replicationConfiguration:ReplicationConfiguration")
public class ReplicationConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * When the replication configuration was created.
     * * `destination[0].file_system_id` - The fs ID of the replica.
     * * `destination[0].status` - The status of the replication.
     * 
     */
    @Export(name="creationTime", refs={String.class}, tree="[0]")
    private Output<String> creationTime;

    /**
     * @return When the replication configuration was created.
     * * `destination[0].file_system_id` - The fs ID of the replica.
     * * `destination[0].status` - The status of the replication.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * A destination configuration block (documented below).
     * 
     */
    @Export(name="destination", refs={ReplicationConfigurationDestination.class}, tree="[0]")
    private Output<ReplicationConfigurationDestination> destination;

    /**
     * @return A destination configuration block (documented below).
     * 
     */
    public Output<ReplicationConfigurationDestination> destination() {
        return this.destination;
    }
    /**
     * The Amazon Resource Name (ARN) of the original source Amazon EFS file system in the replication configuration.
     * 
     */
    @Export(name="originalSourceFileSystemArn", refs={String.class}, tree="[0]")
    private Output<String> originalSourceFileSystemArn;

    /**
     * @return The Amazon Resource Name (ARN) of the original source Amazon EFS file system in the replication configuration.
     * 
     */
    public Output<String> originalSourceFileSystemArn() {
        return this.originalSourceFileSystemArn;
    }
    /**
     * The Amazon Resource Name (ARN) of the current source file system in the replication configuration.
     * 
     */
    @Export(name="sourceFileSystemArn", refs={String.class}, tree="[0]")
    private Output<String> sourceFileSystemArn;

    /**
     * @return The Amazon Resource Name (ARN) of the current source file system in the replication configuration.
     * 
     */
    public Output<String> sourceFileSystemArn() {
        return this.sourceFileSystemArn;
    }
    /**
     * The ID of the file system that is to be replicated.
     * 
     */
    @Export(name="sourceFileSystemId", refs={String.class}, tree="[0]")
    private Output<String> sourceFileSystemId;

    /**
     * @return The ID of the file system that is to be replicated.
     * 
     */
    public Output<String> sourceFileSystemId() {
        return this.sourceFileSystemId;
    }
    /**
     * The AWS Region in which the source Amazon EFS file system is located.
     * 
     */
    @Export(name="sourceFileSystemRegion", refs={String.class}, tree="[0]")
    private Output<String> sourceFileSystemRegion;

    /**
     * @return The AWS Region in which the source Amazon EFS file system is located.
     * 
     */
    public Output<String> sourceFileSystemRegion() {
        return this.sourceFileSystemRegion;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationConfiguration(String name) {
        this(name, ReplicationConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationConfiguration(String name, ReplicationConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationConfiguration(String name, ReplicationConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:efs/replicationConfiguration:ReplicationConfiguration", name, args == null ? ReplicationConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReplicationConfiguration(String name, Output<String> id, @Nullable ReplicationConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:efs/replicationConfiguration:ReplicationConfiguration", name, state, makeResourceOptions(options, id));
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
    public static ReplicationConfiguration get(String name, Output<String> id, @Nullable ReplicationConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationConfiguration(name, id, state, options);
    }
}
