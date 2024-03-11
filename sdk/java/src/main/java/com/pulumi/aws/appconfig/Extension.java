// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appconfig;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appconfig.ExtensionArgs;
import com.pulumi.aws.appconfig.inputs.ExtensionState;
import com.pulumi.aws.appconfig.outputs.ExtensionActionPoint;
import com.pulumi.aws.appconfig.outputs.ExtensionParameter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an AppConfig Extension resource.
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
 * import com.pulumi.aws.sns.Topic;
 * import com.pulumi.aws.sns.TopicArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.appconfig.Extension;
 * import com.pulumi.aws.appconfig.ExtensionArgs;
 * import com.pulumi.aws.appconfig.inputs.ExtensionActionPointArgs;
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
 *         var testTopic = new Topic(&#34;testTopic&#34;, TopicArgs.builder()        
 *             .name(&#34;test&#34;)
 *             .build());
 * 
 *         final var test = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;appconfig.amazonaws.com&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var testRole = new Role(&#34;testRole&#34;, RoleArgs.builder()        
 *             .name(&#34;test&#34;)
 *             .assumeRolePolicy(test.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var testExtension = new Extension(&#34;testExtension&#34;, ExtensionArgs.builder()        
 *             .name(&#34;test&#34;)
 *             .description(&#34;test description&#34;)
 *             .actionPoints(ExtensionActionPointArgs.builder()
 *                 .point(&#34;ON_DEPLOYMENT_COMPLETE&#34;)
 *                 .actions(ExtensionActionPointActionArgs.builder()
 *                     .name(&#34;test&#34;)
 *                     .roleArn(testRole.arn())
 *                     .uri(testTopic.arn())
 *                     .build())
 *                 .build())
 *             .tags(Map.of(&#34;Type&#34;, &#34;AppConfig Extension&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import AppConfig Extensions using their extension ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:appconfig/extension:Extension example 71rxuzt
 * ```
 * 
 */
@ResourceType(type="aws:appconfig/extension:Extension")
public class Extension extends com.pulumi.resources.CustomResource {
    /**
     * The action points defined in the extension. Detailed below.
     * 
     */
    @Export(name="actionPoints", refs={List.class,ExtensionActionPoint.class}, tree="[0,1]")
    private Output<List<ExtensionActionPoint>> actionPoints;

    /**
     * @return The action points defined in the extension. Detailed below.
     * 
     */
    public Output<List<ExtensionActionPoint>> actionPoints() {
        return this.actionPoints;
    }
    /**
     * ARN of the AppConfig Extension.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the AppConfig Extension.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Information about the extension.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Information about the extension.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * A name for the extension. Each extension name in your account must be unique. Extension versions use the same name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A name for the extension. Each extension name in your account must be unique. Extension versions use the same name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The parameters accepted by the extension. You specify parameter values when you associate the extension to an AppConfig resource by using the CreateExtensionAssociation API action. For Lambda extension actions, these parameters are included in the Lambda request object. Detailed below.
     * 
     */
    @Export(name="parameters", refs={List.class,ExtensionParameter.class}, tree="[0,1]")
    private Output<List<ExtensionParameter>> parameters;

    /**
     * @return The parameters accepted by the extension. You specify parameter values when you associate the extension to an AppConfig resource by using the CreateExtensionAssociation API action. For Lambda extension actions, these parameters are included in the Lambda request object. Detailed below.
     * 
     */
    public Output<List<ExtensionParameter>> parameters() {
        return this.parameters;
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The version number for the extension.
     * 
     */
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    /**
     * @return The version number for the extension.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Extension(String name) {
        this(name, ExtensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Extension(String name, ExtensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Extension(String name, ExtensionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appconfig/extension:Extension", name, args == null ? ExtensionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Extension(String name, Output<String> id, @Nullable ExtensionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appconfig/extension:Extension", name, state, makeResourceOptions(options, id));
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
    public static Extension get(String name, Output<String> id, @Nullable ExtensionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Extension(name, id, state, options);
    }
}
