// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.grafana;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.grafana.WorkspaceSamlConfigurationArgs;
import com.pulumi.aws.grafana.inputs.WorkspaceSamlConfigurationState;
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
 * Provides an Amazon Managed Grafana workspace SAML configuration resource.
 * 
 * ## Example Usage
 * 
 * ### Basic configuration
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.grafana.Workspace;
 * import com.pulumi.aws.grafana.WorkspaceArgs;
 * import com.pulumi.aws.grafana.WorkspaceSamlConfiguration;
 * import com.pulumi.aws.grafana.WorkspaceSamlConfigurationArgs;
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
 *         var assume = new Role(&#34;assume&#34;, RoleArgs.builder()        
 *             .name(&#34;grafana-assume&#34;)
 *             .assumeRolePolicy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;version&#34;, &#34;2012-10-17&#34;),
 *                     jsonProperty(&#34;statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;action&#34;, &#34;sts:AssumeRole&#34;),
 *                         jsonProperty(&#34;effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;sid&#34;, &#34;&#34;),
 *                         jsonProperty(&#34;principal&#34;, jsonObject(
 *                             jsonProperty(&#34;service&#34;, &#34;grafana.amazonaws.com&#34;)
 *                         ))
 *                     )))
 *                 )))
 *             .build());
 * 
 *         var exampleWorkspace = new Workspace(&#34;exampleWorkspace&#34;, WorkspaceArgs.builder()        
 *             .accountAccessType(&#34;CURRENT_ACCOUNT&#34;)
 *             .authenticationProviders(&#34;SAML&#34;)
 *             .permissionType(&#34;SERVICE_MANAGED&#34;)
 *             .roleArn(assume.arn())
 *             .build());
 * 
 *         var example = new WorkspaceSamlConfiguration(&#34;example&#34;, WorkspaceSamlConfigurationArgs.builder()        
 *             .editorRoleValues(&#34;editor&#34;)
 *             .idpMetadataUrl(&#34;https://my_idp_metadata.url&#34;)
 *             .workspaceId(exampleWorkspace.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Grafana Workspace SAML configuration using the workspace&#39;s `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:grafana/workspaceSamlConfiguration:WorkspaceSamlConfiguration example g-2054c75a02
 * ```
 * 
 */
@ResourceType(type="aws:grafana/workspaceSamlConfiguration:WorkspaceSamlConfiguration")
public class WorkspaceSamlConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The admin role values.
     * 
     */
    @Export(name="adminRoleValues", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> adminRoleValues;

    /**
     * @return The admin role values.
     * 
     */
    public Output<Optional<List<String>>> adminRoleValues() {
        return Codegen.optional(this.adminRoleValues);
    }
    /**
     * The allowed organizations.
     * 
     */
    @Export(name="allowedOrganizations", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> allowedOrganizations;

    /**
     * @return The allowed organizations.
     * 
     */
    public Output<Optional<List<String>>> allowedOrganizations() {
        return Codegen.optional(this.allowedOrganizations);
    }
    /**
     * The editor role values.
     * 
     */
    @Export(name="editorRoleValues", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> editorRoleValues;

    /**
     * @return The editor role values.
     * 
     */
    public Output<List<String>> editorRoleValues() {
        return this.editorRoleValues;
    }
    /**
     * The email assertion.
     * 
     */
    @Export(name="emailAssertion", refs={String.class}, tree="[0]")
    private Output<String> emailAssertion;

    /**
     * @return The email assertion.
     * 
     */
    public Output<String> emailAssertion() {
        return this.emailAssertion;
    }
    /**
     * The groups assertion.
     * 
     */
    @Export(name="groupsAssertion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> groupsAssertion;

    /**
     * @return The groups assertion.
     * 
     */
    public Output<Optional<String>> groupsAssertion() {
        return Codegen.optional(this.groupsAssertion);
    }
    /**
     * The IDP Metadata URL. Note that either `idp_metadata_url` or `idp_metadata_xml` (but not both) must be specified.
     * 
     */
    @Export(name="idpMetadataUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> idpMetadataUrl;

    /**
     * @return The IDP Metadata URL. Note that either `idp_metadata_url` or `idp_metadata_xml` (but not both) must be specified.
     * 
     */
    public Output<Optional<String>> idpMetadataUrl() {
        return Codegen.optional(this.idpMetadataUrl);
    }
    /**
     * The IDP Metadata XML. Note that either `idp_metadata_url` or `idp_metadata_xml` (but not both) must be specified.
     * 
     */
    @Export(name="idpMetadataXml", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> idpMetadataXml;

    /**
     * @return The IDP Metadata XML. Note that either `idp_metadata_url` or `idp_metadata_xml` (but not both) must be specified.
     * 
     */
    public Output<Optional<String>> idpMetadataXml() {
        return Codegen.optional(this.idpMetadataXml);
    }
    /**
     * The login assertion.
     * 
     */
    @Export(name="loginAssertion", refs={String.class}, tree="[0]")
    private Output<String> loginAssertion;

    /**
     * @return The login assertion.
     * 
     */
    public Output<String> loginAssertion() {
        return this.loginAssertion;
    }
    /**
     * The login validity duration.
     * 
     */
    @Export(name="loginValidityDuration", refs={Integer.class}, tree="[0]")
    private Output<Integer> loginValidityDuration;

    /**
     * @return The login validity duration.
     * 
     */
    public Output<Integer> loginValidityDuration() {
        return this.loginValidityDuration;
    }
    /**
     * The name assertion.
     * 
     */
    @Export(name="nameAssertion", refs={String.class}, tree="[0]")
    private Output<String> nameAssertion;

    /**
     * @return The name assertion.
     * 
     */
    public Output<String> nameAssertion() {
        return this.nameAssertion;
    }
    /**
     * The org assertion.
     * 
     */
    @Export(name="orgAssertion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgAssertion;

    /**
     * @return The org assertion.
     * 
     */
    public Output<Optional<String>> orgAssertion() {
        return Codegen.optional(this.orgAssertion);
    }
    /**
     * The role assertion.
     * 
     */
    @Export(name="roleAssertion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> roleAssertion;

    /**
     * @return The role assertion.
     * 
     */
    public Output<Optional<String>> roleAssertion() {
        return Codegen.optional(this.roleAssertion);
    }
    /**
     * The status of the SAML configuration.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the SAML configuration.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The workspace id.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="workspaceId", refs={String.class}, tree="[0]")
    private Output<String> workspaceId;

    /**
     * @return The workspace id.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkspaceSamlConfiguration(String name) {
        this(name, WorkspaceSamlConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkspaceSamlConfiguration(String name, WorkspaceSamlConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkspaceSamlConfiguration(String name, WorkspaceSamlConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:grafana/workspaceSamlConfiguration:WorkspaceSamlConfiguration", name, args == null ? WorkspaceSamlConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkspaceSamlConfiguration(String name, Output<String> id, @Nullable WorkspaceSamlConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:grafana/workspaceSamlConfiguration:WorkspaceSamlConfiguration", name, state, makeResourceOptions(options, id));
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
    public static WorkspaceSamlConfiguration get(String name, Output<String> id, @Nullable WorkspaceSamlConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkspaceSamlConfiguration(name, id, state, options);
    }
}
