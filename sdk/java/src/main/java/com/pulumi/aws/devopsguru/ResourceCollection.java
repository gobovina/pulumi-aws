// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.devopsguru;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.devopsguru.ResourceCollectionArgs;
import com.pulumi.aws.devopsguru.inputs.ResourceCollectionState;
import com.pulumi.aws.devopsguru.outputs.ResourceCollectionCloudformation;
import com.pulumi.aws.devopsguru.outputs.ResourceCollectionTags;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS DevOps Guru Resource Collection.
 * 
 * &gt; Only one type of resource collection (All Account Resources, CloudFormation, or Tags) can be enabled in an account at a time. To avoid persistent differences, this resource should be defined only once.
 * 
 * ## Example Usage
 * 
 * ### All Account Resources
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.devopsguru.ResourceCollection;
 * import com.pulumi.aws.devopsguru.ResourceCollectionArgs;
 * import com.pulumi.aws.devopsguru.inputs.ResourceCollectionCloudformationArgs;
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
 *         var example = new ResourceCollection("example", ResourceCollectionArgs.builder()
 *             .type("AWS_SERVICE")
 *             .cloudformation(ResourceCollectionCloudformationArgs.builder()
 *                 .stackNames("*")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### CloudFormation Stacks
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.devopsguru.ResourceCollection;
 * import com.pulumi.aws.devopsguru.ResourceCollectionArgs;
 * import com.pulumi.aws.devopsguru.inputs.ResourceCollectionCloudformationArgs;
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
 *         var example = new ResourceCollection("example", ResourceCollectionArgs.builder()
 *             .type("AWS_CLOUD_FORMATION")
 *             .cloudformation(ResourceCollectionCloudformationArgs.builder()
 *                 .stackNames("ExampleStack")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Tags
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.devopsguru.ResourceCollection;
 * import com.pulumi.aws.devopsguru.ResourceCollectionArgs;
 * import com.pulumi.aws.devopsguru.inputs.ResourceCollectionTagsArgs;
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
 *         var example = new ResourceCollection("example", ResourceCollectionArgs.builder()
 *             .type("AWS_TAGS")
 *             .tags(ResourceCollectionTagsArgs.builder()
 *                 .appBoundaryKey("DevOps-Guru-Example")
 *                 .tagValues("Example-Value")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Tags All Resources
 * 
 * To analyze all resources with the `app_boundary_key` regardless of the corresponding tag value, set `tag_values` to `[&#34;*&#34;]`.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.devopsguru.ResourceCollection;
 * import com.pulumi.aws.devopsguru.ResourceCollectionArgs;
 * import com.pulumi.aws.devopsguru.inputs.ResourceCollectionTagsArgs;
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
 *         var example = new ResourceCollection("example", ResourceCollectionArgs.builder()
 *             .type("AWS_TAGS")
 *             .tags(ResourceCollectionTagsArgs.builder()
 *                 .appBoundaryKey("DevOps-Guru-Example")
 *                 .tagValues("*")
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
 * Using `pulumi import`, import DevOps Guru Resource Collection using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:devopsguru/resourceCollection:ResourceCollection example AWS_CLOUD_FORMATION
 * ```
 * 
 */
@ResourceType(type="aws:devopsguru/resourceCollection:ResourceCollection")
public class ResourceCollection extends com.pulumi.resources.CustomResource {
    /**
     * A collection of AWS CloudFormation stacks. See `cloudformation` below for additional details.
     * 
     */
    @Export(name="cloudformation", refs={ResourceCollectionCloudformation.class}, tree="[0]")
    private Output</* @Nullable */ ResourceCollectionCloudformation> cloudformation;

    /**
     * @return A collection of AWS CloudFormation stacks. See `cloudformation` below for additional details.
     * 
     */
    public Output<Optional<ResourceCollectionCloudformation>> cloudformation() {
        return Codegen.optional(this.cloudformation);
    }
    /**
     * AWS tags used to filter the resources in the resource collection. See `tags` below for additional details.
     * 
     */
    @Export(name="tags", refs={ResourceCollectionTags.class}, tree="[0]")
    private Output</* @Nullable */ ResourceCollectionTags> tags;

    /**
     * @return AWS tags used to filter the resources in the resource collection. See `tags` below for additional details.
     * 
     */
    public Output<Optional<ResourceCollectionTags>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Type of AWS resource collection to create. Valid values are `AWS_CLOUD_FORMATION`, `AWS_SERVICE`, and `AWS_TAGS`.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of AWS resource collection to create. Valid values are `AWS_CLOUD_FORMATION`, `AWS_SERVICE`, and `AWS_TAGS`.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceCollection(String name) {
        this(name, ResourceCollectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceCollection(String name, ResourceCollectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceCollection(String name, ResourceCollectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:devopsguru/resourceCollection:ResourceCollection", name, args == null ? ResourceCollectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceCollection(String name, Output<String> id, @Nullable ResourceCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:devopsguru/resourceCollection:ResourceCollection", name, state, makeResourceOptions(options, id));
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
    public static ResourceCollection get(String name, Output<String> id, @Nullable ResourceCollectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceCollection(name, id, state, options);
    }
}
