// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elastictranscoder;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elastictranscoder.PresetArgs;
import com.pulumi.aws.elastictranscoder.inputs.PresetState;
import com.pulumi.aws.elastictranscoder.outputs.PresetAudio;
import com.pulumi.aws.elastictranscoder.outputs.PresetAudioCodecOptions;
import com.pulumi.aws.elastictranscoder.outputs.PresetThumbnails;
import com.pulumi.aws.elastictranscoder.outputs.PresetVideo;
import com.pulumi.aws.elastictranscoder.outputs.PresetVideoWatermark;
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
 * Provides an Elastic Transcoder preset resource.
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
 * import com.pulumi.aws.elastictranscoder.Preset;
 * import com.pulumi.aws.elastictranscoder.PresetArgs;
 * import com.pulumi.aws.elastictranscoder.inputs.PresetAudioArgs;
 * import com.pulumi.aws.elastictranscoder.inputs.PresetAudioCodecOptionsArgs;
 * import com.pulumi.aws.elastictranscoder.inputs.PresetVideoArgs;
 * import com.pulumi.aws.elastictranscoder.inputs.PresetVideoWatermarkArgs;
 * import com.pulumi.aws.elastictranscoder.inputs.PresetThumbnailsArgs;
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
 *         var bar = new Preset(&#34;bar&#34;, PresetArgs.builder()        
 *             .container(&#34;mp4&#34;)
 *             .description(&#34;Sample Preset&#34;)
 *             .name(&#34;sample_preset&#34;)
 *             .audio(PresetAudioArgs.builder()
 *                 .audioPackingMode(&#34;SingleTrack&#34;)
 *                 .bitRate(96)
 *                 .channels(2)
 *                 .codec(&#34;AAC&#34;)
 *                 .sampleRate(44100)
 *                 .build())
 *             .audioCodecOptions(PresetAudioCodecOptionsArgs.builder()
 *                 .profile(&#34;AAC-LC&#34;)
 *                 .build())
 *             .video(PresetVideoArgs.builder()
 *                 .bitRate(&#34;1600&#34;)
 *                 .codec(&#34;H.264&#34;)
 *                 .displayAspectRatio(&#34;16:9&#34;)
 *                 .fixedGop(&#34;false&#34;)
 *                 .frameRate(&#34;auto&#34;)
 *                 .maxFrameRate(&#34;60&#34;)
 *                 .keyframesMaxDist(240)
 *                 .maxHeight(&#34;auto&#34;)
 *                 .maxWidth(&#34;auto&#34;)
 *                 .paddingPolicy(&#34;Pad&#34;)
 *                 .sizingPolicy(&#34;Fit&#34;)
 *                 .build())
 *             .videoCodecOptions(Map.ofEntries(
 *                 Map.entry(&#34;Profile&#34;, &#34;main&#34;),
 *                 Map.entry(&#34;Level&#34;, &#34;2.2&#34;),
 *                 Map.entry(&#34;MaxReferenceFrames&#34;, 3),
 *                 Map.entry(&#34;InterlacedMode&#34;, &#34;Progressive&#34;),
 *                 Map.entry(&#34;ColorSpaceConversionMode&#34;, &#34;None&#34;)
 *             ))
 *             .videoWatermarks(PresetVideoWatermarkArgs.builder()
 *                 .id(&#34;Test&#34;)
 *                 .maxWidth(&#34;20%&#34;)
 *                 .maxHeight(&#34;20%&#34;)
 *                 .sizingPolicy(&#34;ShrinkToFit&#34;)
 *                 .horizontalAlign(&#34;Right&#34;)
 *                 .horizontalOffset(&#34;10px&#34;)
 *                 .verticalAlign(&#34;Bottom&#34;)
 *                 .verticalOffset(&#34;10px&#34;)
 *                 .opacity(&#34;55.5&#34;)
 *                 .target(&#34;Content&#34;)
 *                 .build())
 *             .thumbnails(PresetThumbnailsArgs.builder()
 *                 .format(&#34;png&#34;)
 *                 .interval(120)
 *                 .maxWidth(&#34;auto&#34;)
 *                 .maxHeight(&#34;auto&#34;)
 *                 .paddingPolicy(&#34;Pad&#34;)
 *                 .sizingPolicy(&#34;Fit&#34;)
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
 * Using `pulumi import`, import Elastic Transcoder presets using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:elastictranscoder/preset:Preset basic_preset 1407981661351-cttk8b
 * ```
 * 
 */
@ResourceType(type="aws:elastictranscoder/preset:Preset")
public class Preset extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the Elastic Transcoder Preset.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Elastic Transcoder Preset.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Audio parameters object (documented below).
     * 
     */
    @Export(name="audio", refs={PresetAudio.class}, tree="[0]")
    private Output</* @Nullable */ PresetAudio> audio;

    /**
     * @return Audio parameters object (documented below).
     * 
     */
    public Output<Optional<PresetAudio>> audio() {
        return Codegen.optional(this.audio);
    }
    /**
     * Codec options for the audio parameters (documented below)
     * 
     */
    @Export(name="audioCodecOptions", refs={PresetAudioCodecOptions.class}, tree="[0]")
    private Output<PresetAudioCodecOptions> audioCodecOptions;

    /**
     * @return Codec options for the audio parameters (documented below)
     * 
     */
    public Output<PresetAudioCodecOptions> audioCodecOptions() {
        return this.audioCodecOptions;
    }
    /**
     * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
     * 
     */
    @Export(name="container", refs={String.class}, tree="[0]")
    private Output<String> container;

    /**
     * @return The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
     * 
     */
    public Output<String> container() {
        return this.container;
    }
    /**
     * A description of the preset (maximum 255 characters)
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the preset (maximum 255 characters)
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the preset. (maximum 40 characters)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the preset. (maximum 40 characters)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Thumbnail parameters object (documented below)
     * 
     */
    @Export(name="thumbnails", refs={PresetThumbnails.class}, tree="[0]")
    private Output</* @Nullable */ PresetThumbnails> thumbnails;

    /**
     * @return Thumbnail parameters object (documented below)
     * 
     */
    public Output<Optional<PresetThumbnails>> thumbnails() {
        return Codegen.optional(this.thumbnails);
    }
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }
    /**
     * Video parameters object (documented below)
     * 
     */
    @Export(name="video", refs={PresetVideo.class}, tree="[0]")
    private Output</* @Nullable */ PresetVideo> video;

    /**
     * @return Video parameters object (documented below)
     * 
     */
    public Output<Optional<PresetVideo>> video() {
        return Codegen.optional(this.video);
    }
    /**
     * Codec options for the video parameters
     * 
     */
    @Export(name="videoCodecOptions", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> videoCodecOptions;

    /**
     * @return Codec options for the video parameters
     * 
     */
    public Output<Optional<Map<String,String>>> videoCodecOptions() {
        return Codegen.optional(this.videoCodecOptions);
    }
    /**
     * Watermark parameters for the video parameters (documented below)
     * 
     */
    @Export(name="videoWatermarks", refs={List.class,PresetVideoWatermark.class}, tree="[0,1]")
    private Output</* @Nullable */ List<PresetVideoWatermark>> videoWatermarks;

    /**
     * @return Watermark parameters for the video parameters (documented below)
     * 
     */
    public Output<Optional<List<PresetVideoWatermark>>> videoWatermarks() {
        return Codegen.optional(this.videoWatermarks);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Preset(String name) {
        this(name, PresetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Preset(String name, PresetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Preset(String name, PresetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elastictranscoder/preset:Preset", name, args == null ? PresetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Preset(String name, Output<String> id, @Nullable PresetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elastictranscoder/preset:Preset", name, state, makeResourceOptions(options, id));
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
    public static Preset get(String name, Output<String> id, @Nullable PresetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Preset(name, id, state, options);
    }
}
