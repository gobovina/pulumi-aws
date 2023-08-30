// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.chime;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.chime.VoiceConnectorArgs;
import com.pulumi.aws.chime.inputs.VoiceConnectorState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Enables you to connect your phone system to the telephone network at a substantial cost savings by using SIP trunking.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.chime.VoiceConnector;
 * import com.pulumi.aws.chime.VoiceConnectorArgs;
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
 *         var test = new VoiceConnector(&#34;test&#34;, VoiceConnectorArgs.builder()        
 *             .awsRegion(&#34;us-east-1&#34;)
 *             .requireEncryption(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Configuration Recorder using the name. For example:
 * 
 * ```sh
 *  $ pulumi import aws:chime/voiceConnector:VoiceConnector test example
 * ```
 * 
 */
@ResourceType(type="aws:chime/voiceConnector:VoiceConnector")
public class VoiceConnector extends com.pulumi.resources.CustomResource {
    /**
     * ARN (Amazon Resource Name) of the Amazon Chime Voice Connector.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN (Amazon Resource Name) of the Amazon Chime Voice Connector.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The AWS Region in which the Amazon Chime Voice Connector is created. Default value: `us-east-1`
     * 
     */
    @Export(name="awsRegion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> awsRegion;

    /**
     * @return The AWS Region in which the Amazon Chime Voice Connector is created. Default value: `us-east-1`
     * 
     */
    public Output<Optional<String>> awsRegion() {
        return Codegen.optional(this.awsRegion);
    }
    /**
     * The name of the Amazon Chime Voice Connector.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Amazon Chime Voice Connector.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The outbound host name for the Amazon Chime Voice Connector.
     * 
     */
    @Export(name="outboundHostName", refs={String.class}, tree="[0]")
    private Output<String> outboundHostName;

    /**
     * @return The outbound host name for the Amazon Chime Voice Connector.
     * 
     */
    public Output<String> outboundHostName() {
        return this.outboundHostName;
    }
    /**
     * When enabled, requires encryption for the Amazon Chime Voice Connector.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="requireEncryption", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> requireEncryption;

    /**
     * @return When enabled, requires encryption for the Amazon Chime Voice Connector.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<Boolean> requireEncryption() {
        return this.requireEncryption;
    }
    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VoiceConnector(String name) {
        this(name, VoiceConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VoiceConnector(String name, VoiceConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VoiceConnector(String name, VoiceConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:chime/voiceConnector:VoiceConnector", name, args == null ? VoiceConnectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VoiceConnector(String name, Output<String> id, @Nullable VoiceConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:chime/voiceConnector:VoiceConnector", name, state, makeResourceOptions(options, id));
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
    public static VoiceConnector get(String name, Output<String> id, @Nullable VoiceConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VoiceConnector(name, id, state, options);
    }
}
