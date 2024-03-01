// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.qldb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.qldb.StreamArgs;
import com.pulumi.aws.qldb.inputs.StreamState;
import com.pulumi.aws.qldb.outputs.StreamKinesisConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an AWS Quantum Ledger Database (QLDB) Stream resource
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.qldb.Stream;
 * import com.pulumi.aws.qldb.StreamArgs;
 * import com.pulumi.aws.qldb.inputs.StreamKinesisConfigurationArgs;
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
 *         var example = new Stream(&#34;example&#34;, StreamArgs.builder()        
 *             .ledgerName(&#34;existing-ledger-name&#34;)
 *             .streamName(&#34;sample-ledger-stream&#34;)
 *             .roleArn(&#34;sample-role-arn&#34;)
 *             .inclusiveStartTime(&#34;2021-01-01T00:00:00Z&#34;)
 *             .kinesisConfiguration(StreamKinesisConfigurationArgs.builder()
 *                 .aggregationEnabled(false)
 *                 .streamArn(&#34;arn:aws:kinesis:us-east-1:xxxxxxxxxxxx:stream/example-kinesis-stream&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;example&#34;, &#34;tag&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:qldb/stream:Stream")
public class Stream extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the QLDB Stream.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the QLDB Stream.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The exclusive date and time that specifies when the stream ends. If you don&#39;t define this parameter, the stream runs indefinitely until you cancel it. It must be in ISO 8601 date and time format and in Universal Coordinated Time (UTC). For example: `&#34;2019-06-13T21:36:34Z&#34;`.
     * 
     */
    @Export(name="exclusiveEndTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> exclusiveEndTime;

    /**
     * @return The exclusive date and time that specifies when the stream ends. If you don&#39;t define this parameter, the stream runs indefinitely until you cancel it. It must be in ISO 8601 date and time format and in Universal Coordinated Time (UTC). For example: `&#34;2019-06-13T21:36:34Z&#34;`.
     * 
     */
    public Output<Optional<String>> exclusiveEndTime() {
        return Codegen.optional(this.exclusiveEndTime);
    }
    /**
     * The inclusive start date and time from which to start streaming journal data. This parameter must be in ISO 8601 date and time format and in Universal Coordinated Time (UTC). For example: `&#34;2019-06-13T21:36:34Z&#34;`.  This cannot be in the future and must be before `exclusive_end_time`.  If you provide a value that is before the ledger&#39;s `CreationDateTime`, QLDB effectively defaults it to the ledger&#39;s `CreationDateTime`.
     * 
     */
    @Export(name="inclusiveStartTime", refs={String.class}, tree="[0]")
    private Output<String> inclusiveStartTime;

    /**
     * @return The inclusive start date and time from which to start streaming journal data. This parameter must be in ISO 8601 date and time format and in Universal Coordinated Time (UTC). For example: `&#34;2019-06-13T21:36:34Z&#34;`.  This cannot be in the future and must be before `exclusive_end_time`.  If you provide a value that is before the ledger&#39;s `CreationDateTime`, QLDB effectively defaults it to the ledger&#39;s `CreationDateTime`.
     * 
     */
    public Output<String> inclusiveStartTime() {
        return this.inclusiveStartTime;
    }
    /**
     * The configuration settings of the Kinesis Data Streams destination for your stream request. Documented below.
     * 
     */
    @Export(name="kinesisConfiguration", refs={StreamKinesisConfiguration.class}, tree="[0]")
    private Output<StreamKinesisConfiguration> kinesisConfiguration;

    /**
     * @return The configuration settings of the Kinesis Data Streams destination for your stream request. Documented below.
     * 
     */
    public Output<StreamKinesisConfiguration> kinesisConfiguration() {
        return this.kinesisConfiguration;
    }
    /**
     * The name of the QLDB ledger.
     * 
     */
    @Export(name="ledgerName", refs={String.class}, tree="[0]")
    private Output<String> ledgerName;

    /**
     * @return The name of the QLDB ledger.
     * 
     */
    public Output<String> ledgerName() {
        return this.ledgerName;
    }
    /**
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write data records to a Kinesis Data Streams resource.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write data records to a Kinesis Data Streams resource.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * The name that you want to assign to the QLDB journal stream. User-defined names can help identify and indicate the purpose of a stream.  Your stream name must be unique among other active streams for a given ledger. Stream names have the same naming constraints as ledger names, as defined in the [Amazon QLDB Developer Guide](https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming).
     * 
     */
    @Export(name="streamName", refs={String.class}, tree="[0]")
    private Output<String> streamName;

    /**
     * @return The name that you want to assign to the QLDB journal stream. User-defined names can help identify and indicate the purpose of a stream.  Your stream name must be unique among other active streams for a given ledger. Stream names have the same naming constraints as ledger names, as defined in the [Amazon QLDB Developer Guide](https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming).
     * 
     */
    public Output<String> streamName() {
        return this.streamName;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Stream(String name) {
        this(name, StreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Stream(String name, StreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Stream(String name, StreamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:qldb/stream:Stream", name, args == null ? StreamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Stream(String name, Output<String> id, @Nullable StreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:qldb/stream:Stream", name, state, makeResourceOptions(options, id));
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
    public static Stream get(String name, Output<String> id, @Nullable StreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Stream(name, id, state, options);
    }
}
