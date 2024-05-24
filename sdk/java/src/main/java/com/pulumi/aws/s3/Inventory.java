// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3.InventoryArgs;
import com.pulumi.aws.s3.inputs.InventoryState;
import com.pulumi.aws.s3.outputs.InventoryDestination;
import com.pulumi.aws.s3.outputs.InventoryFilter;
import com.pulumi.aws.s3.outputs.InventorySchedule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a S3 bucket [inventory configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html) resource.
 * 
 * &gt; This resource cannot be used with S3 directory buckets.
 * 
 * ## Example Usage
 * 
 * ### Add inventory configuration
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.s3.Inventory;
 * import com.pulumi.aws.s3.InventoryArgs;
 * import com.pulumi.aws.s3.inputs.InventoryScheduleArgs;
 * import com.pulumi.aws.s3.inputs.InventoryDestinationArgs;
 * import com.pulumi.aws.s3.inputs.InventoryDestinationBucketArgs;
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
 *         var test = new BucketV2("test", BucketV2Args.builder()
 *             .bucket("my-tf-test-bucket")
 *             .build());
 * 
 *         var inventory = new BucketV2("inventory", BucketV2Args.builder()
 *             .bucket("my-tf-inventory-bucket")
 *             .build());
 * 
 *         var testInventory = new Inventory("testInventory", InventoryArgs.builder()
 *             .bucket(test.id())
 *             .name("EntireBucketDaily")
 *             .includedObjectVersions("All")
 *             .schedule(InventoryScheduleArgs.builder()
 *                 .frequency("Daily")
 *                 .build())
 *             .destination(InventoryDestinationArgs.builder()
 *                 .bucket(InventoryDestinationBucketArgs.builder()
 *                     .format("ORC")
 *                     .bucketArn(inventory.arn())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Add inventory configuration with S3 object prefix
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.s3.Inventory;
 * import com.pulumi.aws.s3.InventoryArgs;
 * import com.pulumi.aws.s3.inputs.InventoryScheduleArgs;
 * import com.pulumi.aws.s3.inputs.InventoryFilterArgs;
 * import com.pulumi.aws.s3.inputs.InventoryDestinationArgs;
 * import com.pulumi.aws.s3.inputs.InventoryDestinationBucketArgs;
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
 *         var test = new BucketV2("test", BucketV2Args.builder()
 *             .bucket("my-tf-test-bucket")
 *             .build());
 * 
 *         var inventory = new BucketV2("inventory", BucketV2Args.builder()
 *             .bucket("my-tf-inventory-bucket")
 *             .build());
 * 
 *         var test_prefix = new Inventory("test-prefix", InventoryArgs.builder()
 *             .bucket(test.id())
 *             .name("DocumentsWeekly")
 *             .includedObjectVersions("All")
 *             .schedule(InventoryScheduleArgs.builder()
 *                 .frequency("Daily")
 *                 .build())
 *             .filter(InventoryFilterArgs.builder()
 *                 .prefix("documents/")
 *                 .build())
 *             .destination(InventoryDestinationArgs.builder()
 *                 .bucket(InventoryDestinationBucketArgs.builder()
 *                     .format("ORC")
 *                     .bucketArn(inventory.arn())
 *                     .prefix("inventory")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import S3 bucket inventory configurations using `bucket:inventory`. For example:
 * 
 * ```sh
 * $ pulumi import aws:s3/inventory:Inventory my-bucket-entire-bucket my-bucket:EntireBucket
 * ```
 * 
 */
@ResourceType(type="aws:s3/inventory:Inventory")
public class Inventory extends com.pulumi.resources.CustomResource {
    /**
     * Name of the source bucket that inventory lists the objects for.
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output<String> bucket;

    /**
     * @return Name of the source bucket that inventory lists the objects for.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * Contains information about where to publish the inventory results (documented below).
     * 
     */
    @Export(name="destination", refs={InventoryDestination.class}, tree="[0]")
    private Output<InventoryDestination> destination;

    /**
     * @return Contains information about where to publish the inventory results (documented below).
     * 
     */
    public Output<InventoryDestination> destination() {
        return this.destination;
    }
    /**
     * Specifies whether the inventory is enabled or disabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Specifies whether the inventory is enabled or disabled.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Specifies an inventory filter. The inventory only includes objects that meet the filter&#39;s criteria (documented below).
     * 
     */
    @Export(name="filter", refs={InventoryFilter.class}, tree="[0]")
    private Output</* @Nullable */ InventoryFilter> filter;

    /**
     * @return Specifies an inventory filter. The inventory only includes objects that meet the filter&#39;s criteria (documented below).
     * 
     */
    public Output<Optional<InventoryFilter>> filter() {
        return Codegen.optional(this.filter);
    }
    /**
     * Object versions to include in the inventory list. Valid values: `All`, `Current`.
     * 
     */
    @Export(name="includedObjectVersions", refs={String.class}, tree="[0]")
    private Output<String> includedObjectVersions;

    /**
     * @return Object versions to include in the inventory list. Valid values: `All`, `Current`.
     * 
     */
    public Output<String> includedObjectVersions() {
        return this.includedObjectVersions;
    }
    /**
     * Unique identifier of the inventory configuration for the bucket.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Unique identifier of the inventory configuration for the bucket.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of optional fields that are included in the inventory results. Please refer to the S3 [documentation](https://docs.aws.amazon.com/AmazonS3/latest/API/API_InventoryConfiguration.html#AmazonS3-Type-InventoryConfiguration-OptionalFields) for more details.
     * 
     */
    @Export(name="optionalFields", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> optionalFields;

    /**
     * @return List of optional fields that are included in the inventory results. Please refer to the S3 [documentation](https://docs.aws.amazon.com/AmazonS3/latest/API/API_InventoryConfiguration.html#AmazonS3-Type-InventoryConfiguration-OptionalFields) for more details.
     * 
     */
    public Output<Optional<List<String>>> optionalFields() {
        return Codegen.optional(this.optionalFields);
    }
    /**
     * Specifies the schedule for generating inventory results (documented below).
     * 
     */
    @Export(name="schedule", refs={InventorySchedule.class}, tree="[0]")
    private Output<InventorySchedule> schedule;

    /**
     * @return Specifies the schedule for generating inventory results (documented below).
     * 
     */
    public Output<InventorySchedule> schedule() {
        return this.schedule;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Inventory(String name) {
        this(name, InventoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Inventory(String name, InventoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Inventory(String name, InventoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/inventory:Inventory", name, args == null ? InventoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Inventory(String name, Output<String> id, @Nullable InventoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/inventory:Inventory", name, state, makeResourceOptions(options, id));
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
    public static Inventory get(String name, Output<String> id, @Nullable InventoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Inventory(name, id, state, options);
    }
}
