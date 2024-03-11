// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.opensearch.DomainSamlOptionsArgs;
import com.pulumi.aws.opensearch.inputs.DomainSamlOptionsState;
import com.pulumi.aws.opensearch.outputs.DomainSamlOptionsSamlOptions;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages SAML authentication options for an AWS OpenSearch Domain.
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
 * import com.pulumi.aws.opensearch.Domain;
 * import com.pulumi.aws.opensearch.DomainArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainClusterConfigArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainSnapshotOptionsArgs;
 * import com.pulumi.aws.opensearch.DomainSamlOptions;
 * import com.pulumi.aws.opensearch.DomainSamlOptionsArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainSamlOptionsSamlOptionsArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainSamlOptionsSamlOptionsIdpArgs;
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
 *         var example = new Domain(&#34;example&#34;, DomainArgs.builder()        
 *             .domainName(&#34;example&#34;)
 *             .engineVersion(&#34;OpenSearch_1.1&#34;)
 *             .clusterConfig(DomainClusterConfigArgs.builder()
 *                 .instanceType(&#34;r4.large.search&#34;)
 *                 .build())
 *             .snapshotOptions(DomainSnapshotOptionsArgs.builder()
 *                 .automatedSnapshotStartHour(23)
 *                 .build())
 *             .tags(Map.of(&#34;Domain&#34;, &#34;TestDomain&#34;))
 *             .build());
 * 
 *         var exampleDomainSamlOptions = new DomainSamlOptions(&#34;exampleDomainSamlOptions&#34;, DomainSamlOptionsArgs.builder()        
 *             .domainName(example.domainName())
 *             .samlOptions(DomainSamlOptionsSamlOptionsArgs.builder()
 *                 .enabled(true)
 *                 .idp(DomainSamlOptionsSamlOptionsIdpArgs.builder()
 *                     .entityId(&#34;https://example.com&#34;)
 *                     .metadataContent(StdFunctions.file(FileArgs.builder()
 *                         .input(&#34;./saml-metadata.xml&#34;)
 *                         .build()).result())
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
 * Using `pulumi import`, import OpenSearch domains using the `domain_name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:opensearch/domainSamlOptions:DomainSamlOptions example domain_name
 * ```
 * 
 */
@ResourceType(type="aws:opensearch/domainSamlOptions:DomainSamlOptions")
public class DomainSamlOptions extends com.pulumi.resources.CustomResource {
    /**
     * Name of the domain.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output<String> domainName;

    /**
     * @return Name of the domain.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * SAML authentication options for an AWS OpenSearch Domain.
     * 
     */
    @Export(name="samlOptions", refs={DomainSamlOptionsSamlOptions.class}, tree="[0]")
    private Output</* @Nullable */ DomainSamlOptionsSamlOptions> samlOptions;

    /**
     * @return SAML authentication options for an AWS OpenSearch Domain.
     * 
     */
    public Output<Optional<DomainSamlOptionsSamlOptions>> samlOptions() {
        return Codegen.optional(this.samlOptions);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainSamlOptions(String name) {
        this(name, DomainSamlOptionsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainSamlOptions(String name, DomainSamlOptionsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainSamlOptions(String name, DomainSamlOptionsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearch/domainSamlOptions:DomainSamlOptions", name, args == null ? DomainSamlOptionsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainSamlOptions(String name, Output<String> id, @Nullable DomainSamlOptionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearch/domainSamlOptions:DomainSamlOptions", name, state, makeResourceOptions(options, id));
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
    public static DomainSamlOptions get(String name, Output<String> id, @Nullable DomainSamlOptionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DomainSamlOptions(name, id, state, options);
    }
}
