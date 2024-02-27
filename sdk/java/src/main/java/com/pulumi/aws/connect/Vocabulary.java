// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.connect.VocabularyArgs;
import com.pulumi.aws.connect.inputs.VocabularyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Connect Vocabulary resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.Vocabulary;
 * import com.pulumi.aws.connect.VocabularyArgs;
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
 *         var example = new Vocabulary(&#34;example&#34;, VocabularyArgs.builder()        
 *             .content(&#34;&#34;&#34;
 * Phrase	IPA	SoundsLike	DisplayAs
 * Los-Angeles			Los Angeles
 * F.B.I.	ɛ f b i aɪ		FBI
 * Etienne		eh-tee-en	
 *             &#34;&#34;&#34;)
 *             .instanceId(&#34;aaaaaaaa-bbbb-cccc-dddd-111111111111&#34;)
 *             .languageCode(&#34;en-US&#34;)
 *             .tags(Map.of(&#34;Key1&#34;, &#34;Value1&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Amazon Connect Vocabularies using the `instance_id` and `vocabulary_id` separated by a colon (`:`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:connect/vocabulary:Vocabulary example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
 * ```
 * 
 */
@ResourceType(type="aws:connect/vocabulary:Vocabulary")
public class Vocabulary extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the vocabulary.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the vocabulary.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The content of the custom vocabulary in plain-text format with a table of values. Each row in the table represents a word or a phrase, described with Phrase, IPA, SoundsLike, and DisplayAs fields. Separate the fields with TAB characters. For more information, see [Create a custom vocabulary using a table](https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html#create-vocabulary-table). Minimum length of `1`. Maximum length of `60000`.
     * 
     */
    @Export(name="content", refs={String.class}, tree="[0]")
    private Output<String> content;

    /**
     * @return The content of the custom vocabulary in plain-text format with a table of values. Each row in the table represents a word or a phrase, described with Phrase, IPA, SoundsLike, and DisplayAs fields. Separate the fields with TAB characters. For more information, see [Create a custom vocabulary using a table](https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html#create-vocabulary-table). Minimum length of `1`. Maximum length of `60000`.
     * 
     */
    public Output<String> content() {
        return this.content;
    }
    /**
     * The reason why the custom vocabulary was not created.
     * 
     */
    @Export(name="failureReason", refs={String.class}, tree="[0]")
    private Output<String> failureReason;

    /**
     * @return The reason why the custom vocabulary was not created.
     * 
     */
    public Output<String> failureReason() {
        return this.failureReason;
    }
    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see [What is Amazon Transcribe?](https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html). Valid Values are `ar-AE`, `de-CH`, `de-DE`, `en-AB`, `en-AU`, `en-GB`, `en-IE`, `en-IN`, `en-US`, `en-WL`, `es-ES`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `ko-KR`, `pt-BR`, `pt-PT`, `zh-CN`.
     * 
     */
    @Export(name="languageCode", refs={String.class}, tree="[0]")
    private Output<String> languageCode;

    /**
     * @return The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see [What is Amazon Transcribe?](https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html). Valid Values are `ar-AE`, `de-CH`, `de-DE`, `en-AB`, `en-AU`, `en-GB`, `en-IE`, `en-IN`, `en-US`, `en-WL`, `es-ES`, `es-US`, `fr-CA`, `fr-FR`, `hi-IN`, `it-IT`, `ja-JP`, `ko-KR`, `pt-BR`, `pt-PT`, `zh-CN`.
     * 
     */
    public Output<String> languageCode() {
        return this.languageCode;
    }
    /**
     * The timestamp when the custom vocabulary was last modified.
     * 
     */
    @Export(name="lastModifiedTime", refs={String.class}, tree="[0]")
    private Output<String> lastModifiedTime;

    /**
     * @return The timestamp when the custom vocabulary was last modified.
     * 
     */
    public Output<String> lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * A unique name of the custom vocabulary. Must not be more than 140 characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A unique name of the custom vocabulary. Must not be more than 140 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The current state of the custom vocabulary. Valid values are `CREATION_IN_PROGRESS`, `ACTIVE`, `CREATION_FAILED`, `DELETE_IN_PROGRESS`.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The current state of the custom vocabulary. Valid values are `CREATION_IN_PROGRESS`, `ACTIVE`, `CREATION_FAILED`, `DELETE_IN_PROGRESS`.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Tags to apply to the vocabulary. If configured with a provider
     * `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the vocabulary. If configured with a provider
     * `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The identifier of the custom vocabulary.
     * 
     */
    @Export(name="vocabularyId", refs={String.class}, tree="[0]")
    private Output<String> vocabularyId;

    /**
     * @return The identifier of the custom vocabulary.
     * 
     */
    public Output<String> vocabularyId() {
        return this.vocabularyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Vocabulary(String name) {
        this(name, VocabularyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Vocabulary(String name, VocabularyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Vocabulary(String name, VocabularyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/vocabulary:Vocabulary", name, args == null ? VocabularyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Vocabulary(String name, Output<String> id, @Nullable VocabularyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/vocabulary:Vocabulary", name, state, makeResourceOptions(options, id));
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
    public static Vocabulary get(String name, Output<String> id, @Nullable VocabularyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Vocabulary(name, id, state, options);
    }
}
