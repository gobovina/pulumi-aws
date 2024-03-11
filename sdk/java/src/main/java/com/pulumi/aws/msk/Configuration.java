// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.msk.ConfigurationArgs;
import com.pulumi.aws.msk.inputs.ConfigurationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Amazon Managed Streaming for Kafka configuration. More information can be found on the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration.html).
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
 * import com.pulumi.aws.msk.Configuration;
 * import com.pulumi.aws.msk.ConfigurationArgs;
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
 *         var example = new Configuration(&#34;example&#34;, ConfigurationArgs.builder()        
 *             .kafkaVersions(&#34;2.1.0&#34;)
 *             .name(&#34;example&#34;)
 *             .serverProperties(&#34;&#34;&#34;
 * auto.create.topics.enable = true
 * delete.topic.enable = true
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import MSK configurations using the configuration ARN. For example:
 * 
 * ```sh
 * $ pulumi import aws:msk/configuration:Configuration example arn:aws:kafka:us-west-2:123456789012:configuration/example/279c0212-d057-4dba-9aa9-1c4e5a25bfc7-3
 * ```
 * 
 */
@ResourceType(type="aws:msk/configuration:Configuration")
public class Configuration extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the configuration.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the configuration.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Description of the configuration.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the configuration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * List of Apache Kafka versions which can use this configuration.
     * 
     */
    @Export(name="kafkaVersions", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> kafkaVersions;

    /**
     * @return List of Apache Kafka versions which can use this configuration.
     * 
     */
    public Output<Optional<List<String>>> kafkaVersions() {
        return Codegen.optional(this.kafkaVersions);
    }
    /**
     * Latest revision of the configuration.
     * 
     */
    @Export(name="latestRevision", refs={Integer.class}, tree="[0]")
    private Output<Integer> latestRevision;

    /**
     * @return Latest revision of the configuration.
     * 
     */
    public Output<Integer> latestRevision() {
        return this.latestRevision;
    }
    /**
     * Name of the configuration.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
     * 
     */
    @Export(name="serverProperties", refs={String.class}, tree="[0]")
    private Output<String> serverProperties;

    /**
     * @return Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
     * 
     */
    public Output<String> serverProperties() {
        return this.serverProperties;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Configuration(String name) {
        this(name, ConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Configuration(String name, ConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Configuration(String name, ConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/configuration:Configuration", name, args == null ? ConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Configuration(String name, Output<String> id, @Nullable ConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/configuration:Configuration", name, state, makeResourceOptions(options, id));
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
    public static Configuration get(String name, Output<String> id, @Nullable ConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Configuration(name, id, state, options);
    }
}
