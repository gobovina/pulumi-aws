// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.medialive.ChannelArgs;
import com.pulumi.aws.medialive.inputs.ChannelState;
import com.pulumi.aws.medialive.outputs.ChannelCdiInputSpecification;
import com.pulumi.aws.medialive.outputs.ChannelDestination;
import com.pulumi.aws.medialive.outputs.ChannelEncoderSettings;
import com.pulumi.aws.medialive.outputs.ChannelInputAttachment;
import com.pulumi.aws.medialive.outputs.ChannelInputSpecification;
import com.pulumi.aws.medialive.outputs.ChannelMaintenance;
import com.pulumi.aws.medialive.outputs.ChannelVpc;
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
 * Resource for managing an AWS MediaLive Channel.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.medialive.Channel;
 * import com.pulumi.aws.medialive.ChannelArgs;
 * import com.pulumi.aws.medialive.inputs.ChannelInputSpecificationArgs;
 * import com.pulumi.aws.medialive.inputs.ChannelInputAttachmentArgs;
 * import com.pulumi.aws.medialive.inputs.ChannelDestinationArgs;
 * import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsArgs;
 * import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsTimecodeConfigArgs;
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
 *         var example = new Channel(&#34;example&#34;, ChannelArgs.builder()        
 *             .name(&#34;example-channel&#34;)
 *             .channelClass(&#34;STANDARD&#34;)
 *             .roleArn(exampleAwsIamRole.arn())
 *             .inputSpecification(ChannelInputSpecificationArgs.builder()
 *                 .codec(&#34;AVC&#34;)
 *                 .inputResolution(&#34;HD&#34;)
 *                 .maximumBitrate(&#34;MAX_20_MBPS&#34;)
 *                 .build())
 *             .inputAttachments(ChannelInputAttachmentArgs.builder()
 *                 .inputAttachmentName(&#34;example-input&#34;)
 *                 .inputId(exampleAwsMedialiveInput.id())
 *                 .build())
 *             .destinations(ChannelDestinationArgs.builder()
 *                 .id(&#34;destination&#34;)
 *                 .settings(                
 *                     ChannelDestinationSettingArgs.builder()
 *                         .url(String.format(&#34;s3://%s/test1&#34;, main.id()))
 *                         .build(),
 *                     ChannelDestinationSettingArgs.builder()
 *                         .url(String.format(&#34;s3://%s/test2&#34;, main2.id()))
 *                         .build())
 *                 .build())
 *             .encoderSettings(ChannelEncoderSettingsArgs.builder()
 *                 .timecodeConfig(ChannelEncoderSettingsTimecodeConfigArgs.builder()
 *                     .source(&#34;EMBEDDED&#34;)
 *                     .build())
 *                 .audioDescriptions(ChannelEncoderSettingsAudioDescriptionArgs.builder()
 *                     .audioSelectorName(&#34;example audio selector&#34;)
 *                     .name(&#34;audio-selector&#34;)
 *                     .build())
 *                 .videoDescriptions(ChannelEncoderSettingsVideoDescriptionArgs.builder()
 *                     .name(&#34;example-video&#34;)
 *                     .build())
 *                 .outputGroups(ChannelEncoderSettingsOutputGroupArgs.builder()
 *                     .outputGroupSettings(ChannelEncoderSettingsOutputGroupOutputGroupSettingsArgs.builder()
 *                         .archiveGroupSettings(ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArgs.builder()
 *                             .destination(ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingDestinationArgs.builder()
 *                                 .destinationRefId(&#34;destination&#34;)
 *                                 .build())
 *                             .build())
 *                         .build())
 *                     .outputs(ChannelEncoderSettingsOutputGroupOutputArgs.builder()
 *                         .outputName(&#34;example-name&#34;)
 *                         .videoDescriptionName(&#34;example-video&#34;)
 *                         .audioDescriptionNames(&#34;audio-selector&#34;)
 *                         .outputSettings(ChannelEncoderSettingsOutputGroupOutputOutputSettingsArgs.builder()
 *                             .archiveOutputSettings(ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsArgs.builder()
 *                                 .nameModifier(&#34;_1&#34;)
 *                                 .extension(&#34;m2ts&#34;)
 *                                 .containerSettings(ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsArgs.builder()
 *                                     .m2tsSettings(ChannelEncoderSettingsOutputGroupOutputOutputSettingsArchiveOutputSettingsContainerSettingsM2tsSettingsArgs.builder()
 *                                         .audioBufferModel(&#34;ATSC&#34;)
 *                                         .bufferModel(&#34;MULTIPLEX&#34;)
 *                                         .rateMode(&#34;CBR&#34;)
 *                                         .build())
 *                                     .build())
 *                                 .build())
 *                             .build())
 *                         .build())
 *                     .build())
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
 * Using `pulumi import`, import MediaLive Channel using the `channel_id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:medialive/channel:Channel example 1234567
 * ```
 * 
 */
@ResourceType(type="aws:medialive/channel:Channel")
public class Channel extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the Channel.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the Channel.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specification of CDI inputs for this channel. See CDI Input Specification for more details.
     * 
     */
    @Export(name="cdiInputSpecification", refs={ChannelCdiInputSpecification.class}, tree="[0]")
    private Output</* @Nullable */ ChannelCdiInputSpecification> cdiInputSpecification;

    /**
     * @return Specification of CDI inputs for this channel. See CDI Input Specification for more details.
     * 
     */
    public Output<Optional<ChannelCdiInputSpecification>> cdiInputSpecification() {
        return Codegen.optional(this.cdiInputSpecification);
    }
    /**
     * Concise argument description.
     * 
     */
    @Export(name="channelClass", refs={String.class}, tree="[0]")
    private Output<String> channelClass;

    /**
     * @return Concise argument description.
     * 
     */
    public Output<String> channelClass() {
        return this.channelClass;
    }
    /**
     * ID of the channel in MediaPackage that is the destination for this output group.
     * 
     */
    @Export(name="channelId", refs={String.class}, tree="[0]")
    private Output<String> channelId;

    /**
     * @return ID of the channel in MediaPackage that is the destination for this output group.
     * 
     */
    public Output<String> channelId() {
        return this.channelId;
    }
    /**
     * Destinations for channel. See Destinations for more details.
     * 
     */
    @Export(name="destinations", refs={List.class,ChannelDestination.class}, tree="[0,1]")
    private Output<List<ChannelDestination>> destinations;

    /**
     * @return Destinations for channel. See Destinations for more details.
     * 
     */
    public Output<List<ChannelDestination>> destinations() {
        return this.destinations;
    }
    /**
     * Encoder settings. See Encoder Settings for more details.
     * 
     */
    @Export(name="encoderSettings", refs={ChannelEncoderSettings.class}, tree="[0]")
    private Output<ChannelEncoderSettings> encoderSettings;

    /**
     * @return Encoder settings. See Encoder Settings for more details.
     * 
     */
    public Output<ChannelEncoderSettings> encoderSettings() {
        return this.encoderSettings;
    }
    /**
     * Input attachments for the channel. See Input Attachments for more details.
     * 
     */
    @Export(name="inputAttachments", refs={List.class,ChannelInputAttachment.class}, tree="[0,1]")
    private Output<List<ChannelInputAttachment>> inputAttachments;

    /**
     * @return Input attachments for the channel. See Input Attachments for more details.
     * 
     */
    public Output<List<ChannelInputAttachment>> inputAttachments() {
        return this.inputAttachments;
    }
    /**
     * Specification of network and file inputs for the channel.
     * 
     */
    @Export(name="inputSpecification", refs={ChannelInputSpecification.class}, tree="[0]")
    private Output<ChannelInputSpecification> inputSpecification;

    /**
     * @return Specification of network and file inputs for the channel.
     * 
     */
    public Output<ChannelInputSpecification> inputSpecification() {
        return this.inputSpecification;
    }
    /**
     * The log level to write to Cloudwatch logs.
     * 
     */
    @Export(name="logLevel", refs={String.class}, tree="[0]")
    private Output<String> logLevel;

    /**
     * @return The log level to write to Cloudwatch logs.
     * 
     */
    public Output<String> logLevel() {
        return this.logLevel;
    }
    /**
     * Maintenance settings for this channel. See Maintenance for more details.
     * 
     */
    @Export(name="maintenance", refs={ChannelMaintenance.class}, tree="[0]")
    private Output<ChannelMaintenance> maintenance;

    /**
     * @return Maintenance settings for this channel. See Maintenance for more details.
     * 
     */
    public Output<ChannelMaintenance> maintenance() {
        return this.maintenance;
    }
    /**
     * Name of the Channel.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Channel.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Concise argument description.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> roleArn;

    /**
     * @return Concise argument description.
     * 
     */
    public Output<Optional<String>> roleArn() {
        return Codegen.optional(this.roleArn);
    }
    /**
     * Whether to start/stop channel. Default: `false`
     * 
     */
    @Export(name="startChannel", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> startChannel;

    /**
     * @return Whether to start/stop channel. Default: `false`
     * 
     */
    public Output<Optional<Boolean>> startChannel() {
        return Codegen.optional(this.startChannel);
    }
    /**
     * A map of tags to assign to the channel. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the channel. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Settings for the VPC outputs. See VPC for more details.
     * 
     */
    @Export(name="vpc", refs={ChannelVpc.class}, tree="[0]")
    private Output</* @Nullable */ ChannelVpc> vpc;

    /**
     * @return Settings for the VPC outputs. See VPC for more details.
     * 
     */
    public Output<Optional<ChannelVpc>> vpc() {
        return Codegen.optional(this.vpc);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Channel(String name) {
        this(name, ChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Channel(String name, ChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Channel(String name, ChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:medialive/channel:Channel", name, args == null ? ChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Channel(String name, Output<String> id, @Nullable ChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:medialive/channel:Channel", name, state, makeResourceOptions(options, id));
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
    public static Channel get(String name, Output<String> id, @Nullable ChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Channel(name, id, state, options);
    }
}
