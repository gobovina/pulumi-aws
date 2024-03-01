// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transcribe;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.transcribe.VocabularyFilterArgs;
import com.pulumi.aws.transcribe.inputs.VocabularyFilterState;
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
 * Resource for managing an AWS Transcribe VocabularyFilter.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.transcribe.VocabularyFilter;
 * import com.pulumi.aws.transcribe.VocabularyFilterArgs;
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
 *         var example = new VocabularyFilter(&#34;example&#34;, VocabularyFilterArgs.builder()        
 *             .vocabularyFilterName(&#34;example&#34;)
 *             .languageCode(&#34;en-US&#34;)
 *             .words(            
 *                 &#34;cars&#34;,
 *                 &#34;bucket&#34;)
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;tag1&#34;, &#34;value1&#34;),
 *                 Map.entry(&#34;tag2&#34;, &#34;value3&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Transcribe VocabularyFilter using the `vocabulary_filter_name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:transcribe/vocabularyFilter:VocabularyFilter example example-name
 * ```
 * 
 */
@ResourceType(type="aws:transcribe/vocabularyFilter:VocabularyFilter")
public class VocabularyFilter extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the VocabularyFilter.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the VocabularyFilter.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Generated download URI.
     * 
     */
    @Export(name="downloadUri", refs={String.class}, tree="[0]")
    private Output<String> downloadUri;

    /**
     * @return Generated download URI.
     * 
     */
    public Output<String> downloadUri() {
        return this.downloadUri;
    }
    /**
     * The language code you selected for your vocabulary filter. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
     * 
     */
    @Export(name="languageCode", refs={String.class}, tree="[0]")
    private Output<String> languageCode;

    /**
     * @return The language code you selected for your vocabulary filter. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
     * 
     */
    public Output<String> languageCode() {
        return this.languageCode;
    }
    /**
     * A map of tags to assign to the VocabularyFilter. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the VocabularyFilter. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The Amazon S3 location (URI) of the text file that contains your custom VocabularyFilter. Conflicts with `words` argument.
     * 
     */
    @Export(name="vocabularyFilterFileUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vocabularyFilterFileUri;

    /**
     * @return The Amazon S3 location (URI) of the text file that contains your custom VocabularyFilter. Conflicts with `words` argument.
     * 
     */
    public Output<Optional<String>> vocabularyFilterFileUri() {
        return Codegen.optional(this.vocabularyFilterFileUri);
    }
    /**
     * The name of the VocabularyFilter.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="vocabularyFilterName", refs={String.class}, tree="[0]")
    private Output<String> vocabularyFilterName;

    /**
     * @return The name of the VocabularyFilter.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> vocabularyFilterName() {
        return this.vocabularyFilterName;
    }
    /**
     * A list of terms to include in the vocabulary. Conflicts with `vocabulary_filter_file_uri` argument.
     * 
     */
    @Export(name="words", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> words;

    /**
     * @return A list of terms to include in the vocabulary. Conflicts with `vocabulary_filter_file_uri` argument.
     * 
     */
    public Output<Optional<List<String>>> words() {
        return Codegen.optional(this.words);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VocabularyFilter(String name) {
        this(name, VocabularyFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VocabularyFilter(String name, VocabularyFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VocabularyFilter(String name, VocabularyFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:transcribe/vocabularyFilter:VocabularyFilter", name, args == null ? VocabularyFilterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VocabularyFilter(String name, Output<String> id, @Nullable VocabularyFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:transcribe/vocabularyFilter:VocabularyFilter", name, state, makeResourceOptions(options, id));
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
    public static VocabularyFilter get(String name, Output<String> id, @Nullable VocabularyFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VocabularyFilter(name, id, state, options);
    }
}
