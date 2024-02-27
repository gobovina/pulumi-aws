// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssmincidents;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssmincidents.ReplicationSetArgs;
import com.pulumi.aws.ssmincidents.inputs.ReplicationSetState;
import com.pulumi.aws.ssmincidents.outputs.ReplicationSetRegion;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource for managing a replication set in AWS Systems Manager Incident Manager.
 * 
 * &gt; **NOTE:** Deleting a replication set also deletes all Incident Manager related data including response plans, incident records, contacts and escalation plans.
 * 
 * ## Example Usage
 * ### Basic Usage
 * 
 * Create a replication set.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ssmincidents.ReplicationSet;
 * import com.pulumi.aws.ssmincidents.ReplicationSetArgs;
 * import com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs;
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
 *         var replicationSetName = new ReplicationSet(&#34;replicationSetName&#34;, ReplicationSetArgs.builder()        
 *             .regions(ReplicationSetRegionArgs.builder()
 *                 .name(&#34;us-west-2&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;exampleTag&#34;, &#34;exampleValue&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Add a Region to a replication set. (You can add only one Region at a time.)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ssmincidents.ReplicationSet;
 * import com.pulumi.aws.ssmincidents.ReplicationSetArgs;
 * import com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs;
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
 *         var replicationSetName = new ReplicationSet(&#34;replicationSetName&#34;, ReplicationSetArgs.builder()        
 *             .regions(            
 *                 ReplicationSetRegionArgs.builder()
 *                     .name(&#34;us-west-2&#34;)
 *                     .build(),
 *                 ReplicationSetRegionArgs.builder()
 *                     .name(&#34;ap-southeast-2&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Delete a Region from a replication set. (You can delete only one Region at a time.)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ssmincidents.ReplicationSet;
 * import com.pulumi.aws.ssmincidents.ReplicationSetArgs;
 * import com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs;
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
 *         var replicationSetName = new ReplicationSet(&#34;replicationSetName&#34;, ReplicationSetArgs.builder()        
 *             .regions(ReplicationSetRegionArgs.builder()
 *                 .name(&#34;us-west-2&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Basic Usage with an AWS Customer Managed Key
 * 
 * Create a replication set with an AWS Key Management Service (AWS KMS) customer manager key:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.kms.Key;
 * import com.pulumi.aws.ssmincidents.ReplicationSet;
 * import com.pulumi.aws.ssmincidents.ReplicationSetArgs;
 * import com.pulumi.aws.ssmincidents.inputs.ReplicationSetRegionArgs;
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
 *         var exampleKey = new Key(&#34;exampleKey&#34;);
 * 
 *         var replicationSetName = new ReplicationSet(&#34;replicationSetName&#34;, ReplicationSetArgs.builder()        
 *             .regions(ReplicationSetRegionArgs.builder()
 *                 .name(&#34;us-west-2&#34;)
 *                 .kmsKeyArn(exampleKey.arn())
 *                 .build())
 *             .tags(Map.of(&#34;exampleTag&#34;, &#34;exampleValue&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import an Incident Manager replication. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ssmincidents/replicationSet:ReplicationSet replicationSetName import
 * ```
 * 
 */
@ResourceType(type="aws:ssmincidents/replicationSet:ReplicationSet")
public class ReplicationSet extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the replication set.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the replication set.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ARN of the user who created the replication set.
     * 
     */
    @Export(name="createdBy", refs={String.class}, tree="[0]")
    private Output<String> createdBy;

    /**
     * @return The ARN of the user who created the replication set.
     * 
     */
    public Output<String> createdBy() {
        return this.createdBy;
    }
    /**
     * If `true`, the last region in a replication set cannot be deleted.
     * 
     */
    @Export(name="deletionProtected", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> deletionProtected;

    /**
     * @return If `true`, the last region in a replication set cannot be deleted.
     * 
     */
    public Output<Boolean> deletionProtected() {
        return this.deletionProtected;
    }
    /**
     * A timestamp showing when the replication set was last modified.
     * 
     */
    @Export(name="lastModifiedBy", refs={String.class}, tree="[0]")
    private Output<String> lastModifiedBy;

    /**
     * @return A timestamp showing when the replication set was last modified.
     * 
     */
    public Output<String> lastModifiedBy() {
        return this.lastModifiedBy;
    }
    @Export(name="regions", refs={List.class,ReplicationSetRegion.class}, tree="[0,1]")
    private Output<List<ReplicationSetRegion>> regions;

    public Output<List<ReplicationSetRegion>> regions() {
        return this.regions;
    }
    /**
     * The current status of the Region.
     * * Valid Values: `ACTIVE` | `CREATING` | `UPDATING` | `DELETING` | `FAILED`
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The current status of the Region.
     * * Valid Values: `ACTIVE` | `CREATING` | `UPDATING` | `DELETING` | `FAILED`
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Tags applied to the replication set.
     * 
     * For information about the maximum allowed number of Regions and tag value constraints, see [CreateReplicationSet in the *AWS Systems Manager Incident Manager API Reference*](https://docs.aws.amazon.com/incident-manager/latest/APIReference/API_CreateReplicationSet.html).
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags applied to the replication set.
     * 
     * For information about the maximum allowed number of Regions and tag value constraints, see [CreateReplicationSet in the *AWS Systems Manager Incident Manager API Reference*](https://docs.aws.amazon.com/incident-manager/latest/APIReference/API_CreateReplicationSet.html).
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationSet(String name) {
        this(name, ReplicationSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationSet(String name, ReplicationSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationSet(String name, ReplicationSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssmincidents/replicationSet:ReplicationSet", name, args == null ? ReplicationSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReplicationSet(String name, Output<String> id, @Nullable ReplicationSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssmincidents/replicationSet:ReplicationSet", name, state, makeResourceOptions(options, id));
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
    public static ReplicationSet get(String name, Output<String> id, @Nullable ReplicationSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationSet(name, id, state, options);
    }
}
