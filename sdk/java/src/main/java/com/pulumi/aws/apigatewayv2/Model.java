// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigatewayv2.ModelArgs;
import com.pulumi.aws.apigatewayv2.inputs.ModelState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Amazon API Gateway Version 2 [model](https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html#models-mappings-models).
 * 
 * ## Example Usage
 * ### Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apigatewayv2.Model;
 * import com.pulumi.aws.apigatewayv2.ModelArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var example = new Model(&#34;example&#34;, ModelArgs.builder()        
 *             .apiId(exampleAwsApigatewayv2Api.id())
 *             .contentType(&#34;application/json&#34;)
 *             .name(&#34;example&#34;)
 *             .schema(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;$schema&#34;, &#34;http://json-schema.org/draft-04/schema#&#34;),
 *                     jsonProperty(&#34;title&#34;, &#34;ExampleModel&#34;),
 *                     jsonProperty(&#34;type&#34;, &#34;object&#34;),
 *                     jsonProperty(&#34;properties&#34;, jsonObject(
 *                         jsonProperty(&#34;id&#34;, jsonObject(
 *                             jsonProperty(&#34;type&#34;, &#34;string&#34;)
 *                         ))
 *                     ))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_apigatewayv2_model` using the API identifier and model identifier. For example:
 * 
 * ```sh
 *  $ pulumi import aws:apigatewayv2/model:Model example aabbccddee/1122334
 * ```
 * 
 */
@ResourceType(type="aws:apigatewayv2/model:Model")
public class Model extends com.pulumi.resources.CustomResource {
    /**
     * API identifier.
     * 
     */
    @Export(name="apiId", refs={String.class}, tree="[0]")
    private Output<String> apiId;

    /**
     * @return API identifier.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }
    /**
     * The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
     * 
     */
    @Export(name="contentType", refs={String.class}, tree="[0]")
    private Output<String> contentType;

    /**
     * @return The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }
    /**
     * Description of the model. Must be between 1 and 128 characters in length.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the model. Must be between 1 and 128 characters in length.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return Schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Model(String name) {
        this(name, ModelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Model(String name, ModelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Model(String name, ModelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/model:Model", name, args == null ? ModelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Model(String name, Output<String> id, @Nullable ModelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/model:Model", name, state, makeResourceOptions(options, id));
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
    public static Model get(String name, Output<String> id, @Nullable ModelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Model(name, id, state, options);
    }
}
