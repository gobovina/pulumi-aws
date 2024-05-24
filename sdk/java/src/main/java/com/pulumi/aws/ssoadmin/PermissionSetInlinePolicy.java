// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssoadmin;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssoadmin.PermissionSetInlinePolicyArgs;
import com.pulumi.aws.ssoadmin.inputs.PermissionSetInlinePolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ssoadmin.SsoadminFunctions;
 * import com.pulumi.aws.ssoadmin.PermissionSet;
 * import com.pulumi.aws.ssoadmin.PermissionSetArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.ssoadmin.PermissionSetInlinePolicy;
 * import com.pulumi.aws.ssoadmin.PermissionSetInlinePolicyArgs;
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
 *         final var example = SsoadminFunctions.getInstances();
 * 
 *         var examplePermissionSet = new PermissionSet("examplePermissionSet", PermissionSetArgs.builder()
 *             .name("Example")
 *             .instanceArn(example.applyValue(getInstancesResult -> getInstancesResult.arns()[0]))
 *             .build());
 * 
 *         final var exampleGetPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .sid("1")
 *                 .actions(                
 *                     "s3:ListAllMyBuckets",
 *                     "s3:GetBucketLocation")
 *                 .resources("arn:aws:s3:::*")
 *                 .build())
 *             .build());
 * 
 *         var examplePermissionSetInlinePolicy = new PermissionSetInlinePolicy("examplePermissionSetInlinePolicy", PermissionSetInlinePolicyArgs.builder()
 *             .inlinePolicy(exampleGetPolicyDocument.applyValue(getPolicyDocumentResult -> getPolicyDocumentResult.json()))
 *             .instanceArn(example.applyValue(getInstancesResult -> getInstancesResult.arns()[0]))
 *             .permissionSetArn(examplePermissionSet.arn())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SSO Permission Set Inline Policies using the `permission_set_arn` and `instance_arn` separated by a comma (`,`). For example:
 * 
 * ```sh
 * $ pulumi import aws:ssoadmin/permissionSetInlinePolicy:PermissionSetInlinePolicy example arn:aws:sso:::permissionSet/ssoins-2938j0x8920sbj72/ps-80383020jr9302rk,arn:aws:sso:::instance/ssoins-2938j0x8920sbj72
 * ```
 * 
 */
@ResourceType(type="aws:ssoadmin/permissionSetInlinePolicy:PermissionSetInlinePolicy")
public class PermissionSetInlinePolicy extends com.pulumi.resources.CustomResource {
    /**
     * The IAM inline policy to attach to a Permission Set.
     * 
     */
    @Export(name="inlinePolicy", refs={String.class}, tree="[0]")
    private Output<String> inlinePolicy;

    /**
     * @return The IAM inline policy to attach to a Permission Set.
     * 
     */
    public Output<String> inlinePolicy() {
        return this.inlinePolicy;
    }
    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    @Export(name="instanceArn", refs={String.class}, tree="[0]")
    private Output<String> instanceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    public Output<String> instanceArn() {
        return this.instanceArn;
    }
    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    @Export(name="permissionSetArn", refs={String.class}, tree="[0]")
    private Output<String> permissionSetArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    public Output<String> permissionSetArn() {
        return this.permissionSetArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PermissionSetInlinePolicy(String name) {
        this(name, PermissionSetInlinePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PermissionSetInlinePolicy(String name, PermissionSetInlinePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PermissionSetInlinePolicy(String name, PermissionSetInlinePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssoadmin/permissionSetInlinePolicy:PermissionSetInlinePolicy", name, args == null ? PermissionSetInlinePolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PermissionSetInlinePolicy(String name, Output<String> id, @Nullable PermissionSetInlinePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssoadmin/permissionSetInlinePolicy:PermissionSetInlinePolicy", name, state, makeResourceOptions(options, id));
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
    public static PermissionSetInlinePolicy get(String name, Output<String> id, @Nullable PermissionSetInlinePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PermissionSetInlinePolicy(name, id, state, options);
    }
}
