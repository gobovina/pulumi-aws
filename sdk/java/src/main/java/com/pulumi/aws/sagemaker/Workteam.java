// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sagemaker.WorkteamArgs;
import com.pulumi.aws.sagemaker.inputs.WorkteamState;
import com.pulumi.aws.sagemaker.outputs.WorkteamMemberDefinition;
import com.pulumi.aws.sagemaker.outputs.WorkteamNotificationConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a SageMaker Workteam resource.
 * 
 * ## Example Usage
 * ### Cognito Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sagemaker.Workteam;
 * import com.pulumi.aws.sagemaker.WorkteamArgs;
 * import com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionArgs;
 * import com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionCognitoMemberDefinitionArgs;
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
 *         var example = new Workteam(&#34;example&#34;, WorkteamArgs.builder()        
 *             .workteamName(&#34;example&#34;)
 *             .workforceName(exampleAwsSagemakerWorkforce.id())
 *             .description(&#34;example&#34;)
 *             .memberDefinitions(WorkteamMemberDefinitionArgs.builder()
 *                 .cognitoMemberDefinition(WorkteamMemberDefinitionCognitoMemberDefinitionArgs.builder()
 *                     .clientId(exampleAwsCognitoUserPoolClient.id())
 *                     .userPool(exampleAwsCognitoUserPoolDomain.userPoolId())
 *                     .userGroup(exampleAwsCognitoUserGroup.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Oidc Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sagemaker.Workteam;
 * import com.pulumi.aws.sagemaker.WorkteamArgs;
 * import com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionArgs;
 * import com.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionOidcMemberDefinitionArgs;
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
 *         var example = new Workteam(&#34;example&#34;, WorkteamArgs.builder()        
 *             .workteamName(&#34;example&#34;)
 *             .workforceName(exampleAwsSagemakerWorkforce.id())
 *             .description(&#34;example&#34;)
 *             .memberDefinitions(WorkteamMemberDefinitionArgs.builder()
 *                 .oidcMemberDefinition(WorkteamMemberDefinitionOidcMemberDefinitionArgs.builder()
 *                     .groups(&#34;example&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SageMaker Workteams using the `workteam_name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/workteam:Workteam example example
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/workteam:Workteam")
public class Workteam extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Workteam.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this Workteam.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A description of the work team.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return A description of the work team.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * A list of Member Definitions that contains objects that identify the workers that make up the work team. Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use `cognito_member_definition`. For workforces created using your own OIDC identity provider (IdP) use `oidc_member_definition`. Do not provide input for both of these parameters in a single request. see Member Definition details below.
     * 
     */
    @Export(name="memberDefinitions", refs={List.class,WorkteamMemberDefinition.class}, tree="[0,1]")
    private Output<List<WorkteamMemberDefinition>> memberDefinitions;

    /**
     * @return A list of Member Definitions that contains objects that identify the workers that make up the work team. Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use `cognito_member_definition`. For workforces created using your own OIDC identity provider (IdP) use `oidc_member_definition`. Do not provide input for both of these parameters in a single request. see Member Definition details below.
     * 
     */
    public Output<List<WorkteamMemberDefinition>> memberDefinitions() {
        return this.memberDefinitions;
    }
    /**
     * Configures notification of workers regarding available or expiring work items. see Notification Configuration details below.
     * 
     */
    @Export(name="notificationConfiguration", refs={WorkteamNotificationConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ WorkteamNotificationConfiguration> notificationConfiguration;

    /**
     * @return Configures notification of workers regarding available or expiring work items. see Notification Configuration details below.
     * 
     */
    public Output<Optional<WorkteamNotificationConfiguration>> notificationConfiguration() {
        return Codegen.optional(this.notificationConfiguration);
    }
    /**
     * The subdomain for your OIDC Identity Provider.
     * 
     */
    @Export(name="subdomain", refs={String.class}, tree="[0]")
    private Output<String> subdomain;

    /**
     * @return The subdomain for your OIDC Identity Provider.
     * 
     */
    public Output<String> subdomain() {
        return this.subdomain;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The name of the Workteam (must be unique).
     * 
     */
    @Export(name="workforceName", refs={String.class}, tree="[0]")
    private Output<String> workforceName;

    /**
     * @return The name of the Workteam (must be unique).
     * 
     */
    public Output<String> workforceName() {
        return this.workforceName;
    }
    /**
     * The name of the workforce.
     * 
     */
    @Export(name="workteamName", refs={String.class}, tree="[0]")
    private Output<String> workteamName;

    /**
     * @return The name of the workforce.
     * 
     */
    public Output<String> workteamName() {
        return this.workteamName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Workteam(String name) {
        this(name, WorkteamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workteam(String name, WorkteamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workteam(String name, WorkteamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/workteam:Workteam", name, args == null ? WorkteamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Workteam(String name, Output<String> id, @Nullable WorkteamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/workteam:Workteam", name, state, makeResourceOptions(options, id));
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
    public static Workteam get(String name, Output<String> id, @Nullable WorkteamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Workteam(name, id, state, options);
    }
}
