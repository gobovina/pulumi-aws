// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.accessanalyzer;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.accessanalyzer.AnalyzerArgs;
import com.pulumi.aws.accessanalyzer.inputs.AnalyzerState;
import com.pulumi.aws.accessanalyzer.outputs.AnalyzerConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Access Analyzer Analyzer. More information can be found in the [Access Analyzer User Guide](https://docs.aws.amazon.com/IAM/latest/UserGuide/what-is-access-analyzer.html).
 * 
 * ## Example Usage
 * 
 * ### Account Analyzer
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.accessanalyzer.Analyzer;
 * import com.pulumi.aws.accessanalyzer.AnalyzerArgs;
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
 *         var example = new Analyzer("example", AnalyzerArgs.builder()
 *             .analyzerName("example")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Organization Analyzer
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.organizations.Organization;
 * import com.pulumi.aws.organizations.OrganizationArgs;
 * import com.pulumi.aws.accessanalyzer.Analyzer;
 * import com.pulumi.aws.accessanalyzer.AnalyzerArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var example = new Organization("example", OrganizationArgs.builder()
 *             .awsServiceAccessPrincipals("access-analyzer.amazonaws.com")
 *             .build());
 * 
 *         var exampleAnalyzer = new Analyzer("exampleAnalyzer", AnalyzerArgs.builder()
 *             .analyzerName("example")
 *             .type("ORGANIZATION")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(example)
 *                 .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Access Analyzer Analyzers using the `analyzer_name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:accessanalyzer/analyzer:Analyzer example example
 * ```
 * 
 */
@ResourceType(type="aws:accessanalyzer/analyzer:Analyzer")
public class Analyzer extends com.pulumi.resources.CustomResource {
    /**
     * Name of the Analyzer.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="analyzerName", refs={String.class}, tree="[0]")
    private Output<String> analyzerName;

    /**
     * @return Name of the Analyzer.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> analyzerName() {
        return this.analyzerName;
    }
    /**
     * ARN of the Analyzer.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the Analyzer.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A block that specifies the configuration of the analyzer. Documented below
     * 
     */
    @Export(name="configuration", refs={AnalyzerConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ AnalyzerConfiguration> configuration;

    /**
     * @return A block that specifies the configuration of the analyzer. Documented below
     * 
     */
    public Output<Optional<AnalyzerConfiguration>> configuration() {
        return Codegen.optional(this.configuration);
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
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
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
     * Type of Analyzer. Valid values are `ACCOUNT`, `ORGANIZATION`, ` ACCOUNT_UNUSED_ACCESS  `, `ORGANIZATION_UNUSED_ACCESS`. Defaults to `ACCOUNT`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return Type of Analyzer. Valid values are `ACCOUNT`, `ORGANIZATION`, ` ACCOUNT_UNUSED_ACCESS  `, `ORGANIZATION_UNUSED_ACCESS`. Defaults to `ACCOUNT`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Analyzer(String name) {
        this(name, AnalyzerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Analyzer(String name, AnalyzerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Analyzer(String name, AnalyzerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:accessanalyzer/analyzer:Analyzer", name, args == null ? AnalyzerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Analyzer(String name, Output<String> id, @Nullable AnalyzerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:accessanalyzer/analyzer:Analyzer", name, state, makeResourceOptions(options, id));
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
    public static Analyzer get(String name, Output<String> id, @Nullable AnalyzerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Analyzer(name, id, state, options);
    }
}
