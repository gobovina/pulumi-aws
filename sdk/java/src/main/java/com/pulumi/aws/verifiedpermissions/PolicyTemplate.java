// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.verifiedpermissions;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.verifiedpermissions.PolicyTemplateArgs;
import com.pulumi.aws.verifiedpermissions.inputs.PolicyTemplateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS Verified Permissions Policy Template.
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
 * import com.pulumi.aws.verifiedpermissions.PolicyTemplate;
 * import com.pulumi.aws.verifiedpermissions.PolicyTemplateArgs;
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
 *         var example = new PolicyTemplate(&#34;example&#34;, PolicyTemplateArgs.builder()        
 *             .policyStoreId(exampleAwsVerifiedpermissionsPolicyStore.id())
 *             .statement(&#34;permit (principal in ?principal, action in PhotoFlash::Action::\&#34;FullPhotoAccess\&#34;, resource == ?resource) unless { resource.IsPrivate };&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Verified Permissions Policy Store using the `policy_store_id:policy_template_id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:verifiedpermissions/policyTemplate:PolicyTemplate example policyStoreId:policyTemplateId
 * ```
 * 
 */
@ResourceType(type="aws:verifiedpermissions/policyTemplate:PolicyTemplate")
public class PolicyTemplate extends com.pulumi.resources.CustomResource {
    /**
     * The date the Policy Store was created.
     * 
     */
    @Export(name="createdDate", refs={String.class}, tree="[0]")
    private Output<String> createdDate;

    /**
     * @return The date the Policy Store was created.
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * Provides a description for the policy template.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Provides a description for the policy template.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the Policy Store.
     * 
     */
    @Export(name="policyStoreId", refs={String.class}, tree="[0]")
    private Output<String> policyStoreId;

    /**
     * @return The ID of the Policy Store.
     * 
     */
    public Output<String> policyStoreId() {
        return this.policyStoreId;
    }
    /**
     * The ID of the Policy Store.
     * 
     */
    @Export(name="policyTemplateId", refs={String.class}, tree="[0]")
    private Output<String> policyTemplateId;

    /**
     * @return The ID of the Policy Store.
     * 
     */
    public Output<String> policyTemplateId() {
        return this.policyTemplateId;
    }
    /**
     * Defines the content of the statement, written in Cedar policy language.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="statement", refs={String.class}, tree="[0]")
    private Output<String> statement;

    /**
     * @return Defines the content of the statement, written in Cedar policy language.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> statement() {
        return this.statement;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyTemplate(String name) {
        this(name, PolicyTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyTemplate(String name, PolicyTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyTemplate(String name, PolicyTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:verifiedpermissions/policyTemplate:PolicyTemplate", name, args == null ? PolicyTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PolicyTemplate(String name, Output<String> id, @Nullable PolicyTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:verifiedpermissions/policyTemplate:PolicyTemplate", name, state, makeResourceOptions(options, id));
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
    public static PolicyTemplate get(String name, Output<String> id, @Nullable PolicyTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PolicyTemplate(name, id, state, options);
    }
}
