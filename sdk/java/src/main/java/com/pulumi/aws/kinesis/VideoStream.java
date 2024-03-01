// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.kinesis.VideoStreamArgs;
import com.pulumi.aws.kinesis.inputs.VideoStreamState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Kinesis Video Stream resource. Amazon Kinesis Video Streams makes it easy to securely stream video from connected devices to AWS for analytics, machine learning (ML), playback, and other processing.
 * 
 * For more details, see the [Amazon Kinesis Documentation](https://aws.amazon.com/documentation/kinesis/).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.kinesis.VideoStream;
 * import com.pulumi.aws.kinesis.VideoStreamArgs;
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
 *         var default_ = new VideoStream(&#34;default&#34;, VideoStreamArgs.builder()        
 *             .name(&#34;kinesis-video-stream&#34;)
 *             .dataRetentionInHours(1)
 *             .deviceName(&#34;kinesis-video-device-name&#34;)
 *             .mediaType(&#34;video/h264&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;kinesis-video-stream&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Kinesis Streams using the `arn`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:kinesis/videoStream:VideoStream test_stream arn:aws:kinesisvideo:us-west-2:123456789012:stream/pulumi-kinesis-test/1554978910975
 * ```
 * 
 */
@ResourceType(type="aws:kinesis/videoStream:VideoStream")
public class VideoStream extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) specifying the Stream (same as `id`)
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) specifying the Stream (same as `id`)
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A time stamp that indicates when the stream was created.
     * 
     */
    @Export(name="creationTime", refs={String.class}, tree="[0]")
    private Output<String> creationTime;

    /**
     * @return A time stamp that indicates when the stream was created.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is `0`, indicating that the stream does not persist data.
     * 
     */
    @Export(name="dataRetentionInHours", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> dataRetentionInHours;

    /**
     * @return The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is `0`, indicating that the stream does not persist data.
     * 
     */
    public Output<Optional<Integer>> dataRetentionInHours() {
        return Codegen.optional(this.dataRetentionInHours);
    }
    /**
     * The name of the device that is writing to the stream. **In the current implementation, Kinesis Video Streams does not use this name.**
     * 
     */
    @Export(name="deviceName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deviceName;

    /**
     * @return The name of the device that is writing to the stream. **In the current implementation, Kinesis Video Streams does not use this name.**
     * 
     */
    public Output<Optional<String>> deviceName() {
        return Codegen.optional(this.deviceName);
    }
    /**
     * The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt stream data. If no key ID is specified, the default, Kinesis Video-managed key (`aws/kinesisvideo`) is used.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyId;

    /**
     * @return The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt stream data. If no key ID is specified, the default, Kinesis Video-managed key (`aws/kinesisvideo`) is used.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see [Media Types](http://www.iana.org/assignments/media-types/media-types.xhtml). If you choose to specify the MediaType, see [Naming Requirements](https://tools.ietf.org/html/rfc6838#section-4.2) for guidelines.
     * 
     */
    @Export(name="mediaType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mediaType;

    /**
     * @return The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see [Media Types](http://www.iana.org/assignments/media-types/media-types.xhtml). If you choose to specify the MediaType, see [Naming Requirements](https://tools.ietf.org/html/rfc6838#section-4.2) for guidelines.
     * 
     */
    public Output<Optional<String>> mediaType() {
        return Codegen.optional(this.mediaType);
    }
    /**
     * A name to identify the stream. This is unique to the
     * AWS account and region the Stream is created in.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A name to identify the stream. This is unique to the
     * AWS account and region the Stream is created in.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The version of the stream.
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output<String> version;

    /**
     * @return The version of the stream.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VideoStream(String name) {
        this(name, VideoStreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VideoStream(String name, @Nullable VideoStreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VideoStream(String name, @Nullable VideoStreamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesis/videoStream:VideoStream", name, args == null ? VideoStreamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VideoStream(String name, Output<String> id, @Nullable VideoStreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesis/videoStream:VideoStream", name, state, makeResourceOptions(options, id));
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
    public static VideoStream get(String name, Output<String> id, @Nullable VideoStreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VideoStream(name, id, state, options);
    }
}
