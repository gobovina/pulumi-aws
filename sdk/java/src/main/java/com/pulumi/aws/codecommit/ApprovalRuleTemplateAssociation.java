// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecommit;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.codecommit.ApprovalRuleTemplateAssociationArgs;
import com.pulumi.aws.codecommit.inputs.ApprovalRuleTemplateAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Associates a CodeCommit Approval Rule Template with a Repository.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.codecommit.ApprovalRuleTemplateAssociation;
 * import com.pulumi.aws.codecommit.ApprovalRuleTemplateAssociationArgs;
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
 *         var example = new ApprovalRuleTemplateAssociation(&#34;example&#34;, ApprovalRuleTemplateAssociationArgs.builder()        
 *             .approvalRuleTemplateName(aws_codecommit_approval_rule_template.example().name())
 *             .repositoryName(aws_codecommit_repository.example().repository_name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import CodeCommit approval rule template associations using the `approval_rule_template_name` and `repository_name` separated by a comma (`,`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:codecommit/approvalRuleTemplateAssociation:ApprovalRuleTemplateAssociation example approver-rule-for-example,MyExampleRepo
 * ```
 * 
 */
@ResourceType(type="aws:codecommit/approvalRuleTemplateAssociation:ApprovalRuleTemplateAssociation")
public class ApprovalRuleTemplateAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The name for the approval rule template.
     * 
     */
    @Export(name="approvalRuleTemplateName", refs={String.class}, tree="[0]")
    private Output<String> approvalRuleTemplateName;

    /**
     * @return The name for the approval rule template.
     * 
     */
    public Output<String> approvalRuleTemplateName() {
        return this.approvalRuleTemplateName;
    }
    /**
     * The name of the repository that you want to associate with the template.
     * 
     */
    @Export(name="repositoryName", refs={String.class}, tree="[0]")
    private Output<String> repositoryName;

    /**
     * @return The name of the repository that you want to associate with the template.
     * 
     */
    public Output<String> repositoryName() {
        return this.repositoryName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApprovalRuleTemplateAssociation(String name) {
        this(name, ApprovalRuleTemplateAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApprovalRuleTemplateAssociation(String name, ApprovalRuleTemplateAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApprovalRuleTemplateAssociation(String name, ApprovalRuleTemplateAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codecommit/approvalRuleTemplateAssociation:ApprovalRuleTemplateAssociation", name, args == null ? ApprovalRuleTemplateAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApprovalRuleTemplateAssociation(String name, Output<String> id, @Nullable ApprovalRuleTemplateAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codecommit/approvalRuleTemplateAssociation:ApprovalRuleTemplateAssociation", name, state, makeResourceOptions(options, id));
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
    public static ApprovalRuleTemplateAssociation get(String name, Output<String> id, @Nullable ApprovalRuleTemplateAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApprovalRuleTemplateAssociation(name, id, state, options);
    }
}
