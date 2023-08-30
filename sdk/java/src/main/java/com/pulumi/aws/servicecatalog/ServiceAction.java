// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.servicecatalog.ServiceActionArgs;
import com.pulumi.aws.servicecatalog.inputs.ServiceActionState;
import com.pulumi.aws.servicecatalog.outputs.ServiceActionDefinition;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Service Catalog self-service action.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.servicecatalog.ServiceAction;
 * import com.pulumi.aws.servicecatalog.ServiceActionArgs;
 * import com.pulumi.aws.servicecatalog.inputs.ServiceActionDefinitionArgs;
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
 *         var example = new ServiceAction(&#34;example&#34;, ServiceActionArgs.builder()        
 *             .definition(ServiceActionDefinitionArgs.builder()
 *                 .name(&#34;AWS-RestartEC2Instance&#34;)
 *                 .build())
 *             .description(&#34;Motor generator unit&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_servicecatalog_service_action` using the service action ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:servicecatalog/serviceAction:ServiceAction example act-f1w12eperfslh
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/serviceAction:ServiceAction")
public class ServiceAction extends com.pulumi.resources.CustomResource {
    /**
     * Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
     * 
     */
    @Export(name="acceptLanguage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> acceptLanguage;

    /**
     * @return Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
     * 
     */
    public Output<Optional<String>> acceptLanguage() {
        return Codegen.optional(this.acceptLanguage);
    }
    /**
     * Self-service action definition configuration block. Detailed below.
     * 
     */
    @Export(name="definition", refs={ServiceActionDefinition.class}, tree="[0]")
    private Output<ServiceActionDefinition> definition;

    /**
     * @return Self-service action definition configuration block. Detailed below.
     * 
     */
    public Output<ServiceActionDefinition> definition() {
        return this.definition;
    }
    /**
     * Self-service action description.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Self-service action description.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Self-service action name.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Self-service action name.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceAction(String name) {
        this(name, ServiceActionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceAction(String name, ServiceActionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceAction(String name, ServiceActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/serviceAction:ServiceAction", name, args == null ? ServiceActionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceAction(String name, Output<String> id, @Nullable ServiceActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/serviceAction:ServiceAction", name, state, makeResourceOptions(options, id));
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
    public static ServiceAction get(String name, Output<String> id, @Nullable ServiceActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceAction(name, id, state, options);
    }
}
