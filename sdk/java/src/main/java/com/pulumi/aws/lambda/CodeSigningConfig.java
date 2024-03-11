// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lambda.CodeSigningConfigArgs;
import com.pulumi.aws.lambda.inputs.CodeSigningConfigState;
import com.pulumi.aws.lambda.outputs.CodeSigningConfigAllowedPublishers;
import com.pulumi.aws.lambda.outputs.CodeSigningConfigPolicies;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Lambda Code Signing Config resource. A code signing configuration defines a list of allowed signing profiles and defines the code-signing validation policy (action to be taken if deployment validation checks fail).
 * 
 * For information about Lambda code signing configurations and how to use them, see [configuring code signing for Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html)
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
 * import com.pulumi.aws.lambda.CodeSigningConfig;
 * import com.pulumi.aws.lambda.CodeSigningConfigArgs;
 * import com.pulumi.aws.lambda.inputs.CodeSigningConfigAllowedPublishersArgs;
 * import com.pulumi.aws.lambda.inputs.CodeSigningConfigPoliciesArgs;
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
 *         var newCsc = new CodeSigningConfig(&#34;newCsc&#34;, CodeSigningConfigArgs.builder()        
 *             .allowedPublishers(CodeSigningConfigAllowedPublishersArgs.builder()
 *                 .signingProfileVersionArns(                
 *                     example1.arn(),
 *                     example2.arn())
 *                 .build())
 *             .policies(CodeSigningConfigPoliciesArgs.builder()
 *                 .untrustedArtifactOnDeployment(&#34;Warn&#34;)
 *                 .build())
 *             .description(&#34;My awesome code signing config.&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Code Signing Configs using their ARN. For example:
 * 
 * ```sh
 * $ pulumi import aws:lambda/codeSigningConfig:CodeSigningConfig imported_csc arn:aws:lambda:us-west-2:123456789012:code-signing-config:csc-0f6c334abcdea4d8b
 * ```
 * 
 */
@ResourceType(type="aws:lambda/codeSigningConfig:CodeSigningConfig")
public class CodeSigningConfig extends com.pulumi.resources.CustomResource {
    /**
     * A configuration block of allowed publishers as signing profiles for this code signing configuration. Detailed below.
     * 
     */
    @Export(name="allowedPublishers", refs={CodeSigningConfigAllowedPublishers.class}, tree="[0]")
    private Output<CodeSigningConfigAllowedPublishers> allowedPublishers;

    /**
     * @return A configuration block of allowed publishers as signing profiles for this code signing configuration. Detailed below.
     * 
     */
    public Output<CodeSigningConfigAllowedPublishers> allowedPublishers() {
        return this.allowedPublishers;
    }
    /**
     * The Amazon Resource Name (ARN) of the code signing configuration.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the code signing configuration.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Unique identifier for the code signing configuration.
     * 
     */
    @Export(name="configId", refs={String.class}, tree="[0]")
    private Output<String> configId;

    /**
     * @return Unique identifier for the code signing configuration.
     * 
     */
    public Output<String> configId() {
        return this.configId;
    }
    /**
     * Descriptive name for this code signing configuration.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Descriptive name for this code signing configuration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The date and time that the code signing configuration was last modified.
     * 
     */
    @Export(name="lastModified", refs={String.class}, tree="[0]")
    private Output<String> lastModified;

    /**
     * @return The date and time that the code signing configuration was last modified.
     * 
     */
    public Output<String> lastModified() {
        return this.lastModified;
    }
    /**
     * A configuration block of code signing policies that define the actions to take if the validation checks fail. Detailed below.
     * 
     */
    @Export(name="policies", refs={CodeSigningConfigPolicies.class}, tree="[0]")
    private Output<CodeSigningConfigPolicies> policies;

    /**
     * @return A configuration block of code signing policies that define the actions to take if the validation checks fail. Detailed below.
     * 
     */
    public Output<CodeSigningConfigPolicies> policies() {
        return this.policies;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CodeSigningConfig(String name) {
        this(name, CodeSigningConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CodeSigningConfig(String name, CodeSigningConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CodeSigningConfig(String name, CodeSigningConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/codeSigningConfig:CodeSigningConfig", name, args == null ? CodeSigningConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CodeSigningConfig(String name, Output<String> id, @Nullable CodeSigningConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/codeSigningConfig:CodeSigningConfig", name, state, makeResourceOptions(options, id));
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
    public static CodeSigningConfig get(String name, Output<String> id, @Nullable CodeSigningConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CodeSigningConfig(name, id, state, options);
    }
}
