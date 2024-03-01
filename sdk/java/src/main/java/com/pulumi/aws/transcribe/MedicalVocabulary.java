// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transcribe;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.transcribe.MedicalVocabularyArgs;
import com.pulumi.aws.transcribe.inputs.MedicalVocabularyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS Transcribe MedicalVocabulary.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.s3.BucketObjectv2;
 * import com.pulumi.aws.s3.BucketObjectv2Args;
 * import com.pulumi.aws.transcribe.MedicalVocabulary;
 * import com.pulumi.aws.transcribe.MedicalVocabularyArgs;
 * import com.pulumi.asset.FileAsset;
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
 *         var example = new BucketV2(&#34;example&#34;, BucketV2Args.builder()        
 *             .bucket(&#34;example-medical-vocab-123&#34;)
 *             .forceDestroy(true)
 *             .build());
 * 
 *         var object = new BucketObjectv2(&#34;object&#34;, BucketObjectv2Args.builder()        
 *             .bucket(example.id())
 *             .key(&#34;transcribe/test1.txt&#34;)
 *             .source(new FileAsset(&#34;test.txt&#34;))
 *             .build());
 * 
 *         var exampleMedicalVocabulary = new MedicalVocabulary(&#34;exampleMedicalVocabulary&#34;, MedicalVocabularyArgs.builder()        
 *             .vocabularyName(&#34;example&#34;)
 *             .languageCode(&#34;en-US&#34;)
 *             .vocabularyFileUri(Output.tuple(example.id(), object.key()).applyValue(values -&gt; {
 *                 var id = values.t1;
 *                 var key = values.t2;
 *                 return String.format(&#34;s3://%s/%s&#34;, id,key);
 *             }))
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
 * Using `pulumi import`, import Transcribe MedicalVocabulary using the `vocabulary_name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:transcribe/medicalVocabulary:MedicalVocabulary example example-name
 * ```
 * 
 */
@ResourceType(type="aws:transcribe/medicalVocabulary:MedicalVocabulary")
public class MedicalVocabulary extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the MedicalVocabulary.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the MedicalVocabulary.
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
     * The language code you selected for your medical vocabulary. US English (en-US) is the only language supported with Amazon Transcribe Medical.
     * 
     */
    @Export(name="languageCode", refs={String.class}, tree="[0]")
    private Output<String> languageCode;

    /**
     * @return The language code you selected for your medical vocabulary. US English (en-US) is the only language supported with Amazon Transcribe Medical.
     * 
     */
    public Output<String> languageCode() {
        return this.languageCode;
    }
    /**
     * A map of tags to assign to the MedicalVocabulary. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the MedicalVocabulary. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary.
     * 
     */
    @Export(name="vocabularyFileUri", refs={String.class}, tree="[0]")
    private Output<String> vocabularyFileUri;

    /**
     * @return The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary.
     * 
     */
    public Output<String> vocabularyFileUri() {
        return this.vocabularyFileUri;
    }
    /**
     * The name of the Medical Vocabulary.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="vocabularyName", refs={String.class}, tree="[0]")
    private Output<String> vocabularyName;

    /**
     * @return The name of the Medical Vocabulary.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> vocabularyName() {
        return this.vocabularyName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MedicalVocabulary(String name) {
        this(name, MedicalVocabularyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MedicalVocabulary(String name, MedicalVocabularyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MedicalVocabulary(String name, MedicalVocabularyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:transcribe/medicalVocabulary:MedicalVocabulary", name, args == null ? MedicalVocabularyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MedicalVocabulary(String name, Output<String> id, @Nullable MedicalVocabularyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:transcribe/medicalVocabulary:MedicalVocabulary", name, state, makeResourceOptions(options, id));
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
    public static MedicalVocabulary get(String name, Output<String> id, @Nullable MedicalVocabularyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MedicalVocabulary(name, id, state, options);
    }
}
