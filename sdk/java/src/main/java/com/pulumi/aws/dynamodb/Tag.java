// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.dynamodb.TagArgs;
import com.pulumi.aws.dynamodb.inputs.TagState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an individual DynamoDB resource tag. This resource should only be used in cases where DynamoDB resources are created outside the provider (e.g., Table replicas in other regions).
 * 
 * &gt; **NOTE:** This tagging resource should not be combined with the resource for managing the parent resource. For example, using `aws.dynamodb.Table` and `aws.dynamodb.Tag` to manage tags of the same DynamoDB Table in the same region will cause a perpetual difference where the `aws_dynamodb_cluster` resource will try to remove the tag being added by the `aws.dynamodb.Tag` resource.
 * 
 * &gt; **NOTE:** This tagging resource does not use the provider `ignore_tags` configuration.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetRegionArgs;
 * import com.pulumi.aws.dynamodb.Table;
 * import com.pulumi.aws.dynamodb.TableArgs;
 * import com.pulumi.aws.dynamodb.inputs.TableReplicaArgs;
 * import com.pulumi.aws.dynamodb.Tag;
 * import com.pulumi.aws.dynamodb.TagArgs;
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
 *         final var replica = AwsFunctions.getRegion();
 * 
 *         final var current = AwsFunctions.getRegion();
 * 
 *         var example = new Table(&#34;example&#34;, TableArgs.builder()        
 *             .replicas(TableReplicaArgs.builder()
 *                 .regionName(replica.applyValue(getRegionResult -&gt; getRegionResult.name()))
 *                 .build())
 *             .build());
 * 
 *         var test = new Tag(&#34;test&#34;, TagArgs.builder()        
 *             .resourceArn(example.arn().applyValue(arn -&gt; StdFunctions.replace()).applyValue(invoke -&gt; invoke.result()))
 *             .key(&#34;testkey&#34;)
 *             .value(&#34;testvalue&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_dynamodb_tag` using the DynamoDB resource identifier and key, separated by a comma (`,`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:dynamodb/tag:Tag example arn:aws:dynamodb:us-east-1:123456789012:table/example,Name
 * ```
 * 
 */
@ResourceType(type="aws:dynamodb/tag:Tag")
public class Tag extends com.pulumi.resources.CustomResource {
    /**
     * Tag name.
     * 
     */
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output<String> key;

    /**
     * @return Tag name.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * Amazon Resource Name (ARN) of the DynamoDB resource to tag.
     * 
     */
    @Export(name="resourceArn", refs={String.class}, tree="[0]")
    private Output<String> resourceArn;

    /**
     * @return Amazon Resource Name (ARN) of the DynamoDB resource to tag.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }
    /**
     * Tag value.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return Tag value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Tag(String name) {
        this(name, TagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Tag(String name, TagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tag(String name, TagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dynamodb/tag:Tag", name, args == null ? TagArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Tag(String name, Output<String> id, @Nullable TagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dynamodb/tag:Tag", name, state, makeResourceOptions(options, id));
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
    public static Tag get(String name, Output<String> id, @Nullable TagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Tag(name, id, state, options);
    }
}
