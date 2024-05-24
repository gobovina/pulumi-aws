// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.location;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.location.GeofenceCollectionArgs;
import com.pulumi.aws.location.inputs.GeofenceCollectionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS Location Geofence Collection.
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
 * import com.pulumi.aws.location.GeofenceCollection;
 * import com.pulumi.aws.location.GeofenceCollectionArgs;
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
 *         var example = new GeofenceCollection("example", GeofenceCollectionArgs.builder()
 *             .collectionName("example")
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
 * Using `pulumi import`, import Location Geofence Collection using the `collection_name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:location/geofenceCollection:GeofenceCollection example example
 * ```
 * 
 */
@ResourceType(type="aws:location/geofenceCollection:GeofenceCollection")
public class GeofenceCollection extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a resource across all AWS.
     * 
     */
    @Export(name="collectionArn", refs={String.class}, tree="[0]")
    private Output<String> collectionArn;

    /**
     * @return The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a resource across all AWS.
     * 
     */
    public Output<String> collectionArn() {
        return this.collectionArn;
    }
    /**
     * The name of the geofence collection.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="collectionName", refs={String.class}, tree="[0]")
    private Output<String> collectionName;

    /**
     * @return The name of the geofence collection.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> collectionName() {
        return this.collectionName;
    }
    /**
     * The timestamp for when the geofence collection resource was created in ISO 8601 format.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The timestamp for when the geofence collection resource was created in ISO 8601 format.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The optional description for the geofence collection.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The optional description for the geofence collection.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A key identifier for an AWS KMS customer managed key assigned to the Amazon Location resource.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return A key identifier for an AWS KMS customer managed key assigned to the Amazon Location resource.
     * 
     */
    public Output<Optional<String>> kmsKeyId() {
        return Codegen.optional(this.kmsKeyId);
    }
    /**
     * Key-value tags for the geofence collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value tags for the geofence collection. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The timestamp for when the geofence collection resource was last updated in ISO 8601 format.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return The timestamp for when the geofence collection resource was last updated in ISO 8601 format.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GeofenceCollection(String name) {
        this(name, GeofenceCollectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GeofenceCollection(String name, GeofenceCollectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GeofenceCollection(String name, GeofenceCollectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:location/geofenceCollection:GeofenceCollection", name, args == null ? GeofenceCollectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GeofenceCollection(String name, Output<String> id, @Nullable GeofenceCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:location/geofenceCollection:GeofenceCollection", name, state, makeResourceOptions(options, id));
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
    public static GeofenceCollection get(String name, Output<String> id, @Nullable GeofenceCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GeofenceCollection(name, id, state, options);
    }
}
