// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appconfig;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appconfig.ExtensionAssociationArgs;
import com.pulumi.aws.appconfig.inputs.ExtensionAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Associates an AppConfig Extension with a Resource.
 * 
 * ## Example Usage
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
 * import com.pulumi.aws.appconfig.Application;
 * import com.pulumi.aws.appconfig.ApplicationArgs;
 * import com.pulumi.aws.appconfig.ExtensionAssociation;
 * import com.pulumi.aws.appconfig.ExtensionAssociationArgs;
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
 *         var testApplication = new Application(&#34;testApplication&#34;, ApplicationArgs.builder()        
 *             .name(&#34;test&#34;)
 *             .build());
 * 
 *         var testExtensionAssociation = new ExtensionAssociation(&#34;testExtensionAssociation&#34;, ExtensionAssociationArgs.builder()        
 *             .extensionArn(testExtension.arn())
 *             .resourceArn(testApplication.arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import AppConfig Extension Associations using their extension association ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:appconfig/extensionAssociation:ExtensionAssociation example 71rxuzt
 * ```
 * 
 */
@ResourceType(type="aws:appconfig/extensionAssociation:ExtensionAssociation")
public class ExtensionAssociation extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the AppConfig Extension Association.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the AppConfig Extension Association.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ARN of the extension defined in the association.
     * 
     */
    @Export(name="extensionArn", refs={String.class}, tree="[0]")
    private Output<String> extensionArn;

    /**
     * @return The ARN of the extension defined in the association.
     * 
     */
    public Output<String> extensionArn() {
        return this.extensionArn;
    }
    /**
     * The version number for the extension defined in the association.
     * 
     */
    @Export(name="extensionVersion", refs={Integer.class}, tree="[0]")
    private Output<Integer> extensionVersion;

    /**
     * @return The version number for the extension defined in the association.
     * 
     */
    public Output<Integer> extensionVersion() {
        return this.extensionVersion;
    }
    /**
     * The parameter names and values defined for the association.
     * 
     */
    @Export(name="parameters", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return The parameter names and values defined for the association.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * The ARN of the application, configuration profile, or environment to associate with the extension.
     * 
     */
    @Export(name="resourceArn", refs={String.class}, tree="[0]")
    private Output<String> resourceArn;

    /**
     * @return The ARN of the application, configuration profile, or environment to associate with the extension.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExtensionAssociation(String name) {
        this(name, ExtensionAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExtensionAssociation(String name, ExtensionAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExtensionAssociation(String name, ExtensionAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appconfig/extensionAssociation:ExtensionAssociation", name, args == null ? ExtensionAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExtensionAssociation(String name, Output<String> id, @Nullable ExtensionAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appconfig/extensionAssociation:ExtensionAssociation", name, state, makeResourceOptions(options, id));
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
    public static ExtensionAssociation get(String name, Output<String> id, @Nullable ExtensionAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExtensionAssociation(name, id, state, options);
    }
}
