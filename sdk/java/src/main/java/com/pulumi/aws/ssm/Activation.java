// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssm.ActivationArgs;
import com.pulumi.aws.ssm.inputs.ActivationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Registers an on-premises server or virtual machine with Amazon EC2 so that it can be managed using Run Command.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.iam.RolePolicyAttachment;
 * import com.pulumi.aws.iam.RolePolicyAttachmentArgs;
 * import com.pulumi.aws.ssm.Activation;
 * import com.pulumi.aws.ssm.ActivationArgs;
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
 *         final var assumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;ssm.amazonaws.com&#34;)
 *                     .build())
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .build())
 *             .build());
 * 
 *         var testRole = new Role(&#34;testRole&#34;, RoleArgs.builder()        
 *             .name(&#34;test_role&#34;)
 *             .assumeRolePolicy(assumeRole.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var testAttach = new RolePolicyAttachment(&#34;testAttach&#34;, RolePolicyAttachmentArgs.builder()        
 *             .role(testRole.name())
 *             .policyArn(&#34;arn:aws:iam::aws:policy/AmazonSSMManagedInstanceCore&#34;)
 *             .build());
 * 
 *         var foo = new Activation(&#34;foo&#34;, ActivationArgs.builder()        
 *             .name(&#34;test_ssm_activation&#34;)
 *             .description(&#34;Test&#34;)
 *             .iamRole(testRole.id())
 *             .registrationLimit(&#34;5&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import AWS SSM Activation using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ssm/activation:Activation example e488f2f6-e686-4afb-8a04-ef6dfEXAMPLE
 * ```
 *  -&gt; __Note:__ The `activation_code` attribute cannot be imported.
 * 
 */
@ResourceType(type="aws:ssm/activation:Activation")
public class Activation extends com.pulumi.resources.CustomResource {
    /**
     * The code the system generates when it processes the activation.
     * 
     */
    @Export(name="activationCode", refs={String.class}, tree="[0]")
    private Output<String> activationCode;

    /**
     * @return The code the system generates when it processes the activation.
     * 
     */
    public Output<String> activationCode() {
        return this.activationCode;
    }
    /**
     * The description of the resource that you want to register.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the resource that you want to register.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * UTC timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Export(name="expirationDate", refs={String.class}, tree="[0]")
    private Output<String> expirationDate;

    /**
     * @return UTC timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    public Output<String> expirationDate() {
        return this.expirationDate;
    }
    /**
     * If the current activation has expired.
     * 
     */
    @Export(name="expired", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> expired;

    /**
     * @return If the current activation has expired.
     * 
     */
    public Output<Boolean> expired() {
        return this.expired;
    }
    /**
     * The IAM Role to attach to the managed instance.
     * 
     */
    @Export(name="iamRole", refs={String.class}, tree="[0]")
    private Output<String> iamRole;

    /**
     * @return The IAM Role to attach to the managed instance.
     * 
     */
    public Output<String> iamRole() {
        return this.iamRole;
    }
    /**
     * The default name of the registered managed instance.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The default name of the registered managed instance.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The number of managed instances that are currently registered using this activation.
     * 
     */
    @Export(name="registrationCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> registrationCount;

    /**
     * @return The number of managed instances that are currently registered using this activation.
     * 
     */
    public Output<Integer> registrationCount() {
        return this.registrationCount;
    }
    /**
     * The maximum number of managed instances you want to register. The default value is 1 instance.
     * 
     */
    @Export(name="registrationLimit", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> registrationLimit;

    /**
     * @return The maximum number of managed instances you want to register. The default value is 1 instance.
     * 
     */
    public Output<Optional<Integer>> registrationLimit() {
        return Codegen.optional(this.registrationLimit);
    }
    /**
     * A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Activation(String name) {
        this(name, ActivationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Activation(String name, ActivationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Activation(String name, ActivationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/activation:Activation", name, args == null ? ActivationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Activation(String name, Output<String> id, @Nullable ActivationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/activation:Activation", name, state, makeResourceOptions(options, id));
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
    public static Activation get(String name, Output<String> id, @Nullable ActivationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Activation(name, id, state, options);
    }
}
