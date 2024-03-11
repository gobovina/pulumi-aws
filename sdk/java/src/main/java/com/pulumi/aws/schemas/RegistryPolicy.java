// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.schemas;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.schemas.RegistryPolicyArgs;
import com.pulumi.aws.schemas.inputs.RegistryPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS EventBridge Schemas Registry Policy.
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
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.schemas.RegistryPolicy;
 * import com.pulumi.aws.schemas.RegistryPolicyArgs;
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
 *         final var example = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .sid(&#34;example&#34;)
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;AWS&#34;)
 *                     .identifiers(&#34;109876543210&#34;)
 *                     .build())
 *                 .actions(&#34;schemas:*&#34;)
 *                 .resources(                
 *                     &#34;arn:aws:schemas:us-east-1:012345678901:registry/example&#34;,
 *                     &#34;arn:aws:schemas:us-east-1:012345678901:schema/example*&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleRegistryPolicy = new RegistryPolicy(&#34;exampleRegistryPolicy&#34;, RegistryPolicyArgs.builder()        
 *             .registryName(&#34;example&#34;)
 *             .policy(example.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import EventBridge Schema Registry Policy using the `registry_name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:schemas/registryPolicy:RegistryPolicy example example
 * ```
 * 
 */
@ResourceType(type="aws:schemas/registryPolicy:RegistryPolicy")
public class RegistryPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Resource Policy for EventBridge Schema Registry
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return Resource Policy for EventBridge Schema Registry
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * Name of EventBridge Schema Registry
     * 
     */
    @Export(name="registryName", refs={String.class}, tree="[0]")
    private Output<String> registryName;

    /**
     * @return Name of EventBridge Schema Registry
     * 
     */
    public Output<String> registryName() {
        return this.registryName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegistryPolicy(String name) {
        this(name, RegistryPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegistryPolicy(String name, RegistryPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegistryPolicy(String name, RegistryPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:schemas/registryPolicy:RegistryPolicy", name, args == null ? RegistryPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegistryPolicy(String name, Output<String> id, @Nullable RegistryPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:schemas/registryPolicy:RegistryPolicy", name, state, makeResourceOptions(options, id));
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
    public static RegistryPolicy get(String name, Output<String> id, @Nullable RegistryPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegistryPolicy(name, id, state, options);
    }
}
