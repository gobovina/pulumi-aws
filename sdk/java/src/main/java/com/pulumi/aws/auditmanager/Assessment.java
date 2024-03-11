// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.auditmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.auditmanager.AssessmentArgs;
import com.pulumi.aws.auditmanager.inputs.AssessmentState;
import com.pulumi.aws.auditmanager.outputs.AssessmentAssessmentReportsDestination;
import com.pulumi.aws.auditmanager.outputs.AssessmentRole;
import com.pulumi.aws.auditmanager.outputs.AssessmentRolesAll;
import com.pulumi.aws.auditmanager.outputs.AssessmentScope;
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
 * Resource for managing an AWS Audit Manager Assessment.
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
 * import com.pulumi.aws.auditmanager.Assessment;
 * import com.pulumi.aws.auditmanager.AssessmentArgs;
 * import com.pulumi.aws.auditmanager.inputs.AssessmentAssessmentReportsDestinationArgs;
 * import com.pulumi.aws.auditmanager.inputs.AssessmentRoleArgs;
 * import com.pulumi.aws.auditmanager.inputs.AssessmentScopeArgs;
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
 *         var test = new Assessment(&#34;test&#34;, AssessmentArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .assessmentReportsDestination(AssessmentAssessmentReportsDestinationArgs.builder()
 *                 .destination(String.format(&#34;s3://%s&#34;, testAwsS3Bucket.id()))
 *                 .destinationType(&#34;S3&#34;)
 *                 .build())
 *             .frameworkId(testAwsAuditmanagerFramework.id())
 *             .roles(AssessmentRoleArgs.builder()
 *                 .roleArn(testAwsIamRole.arn())
 *                 .roleType(&#34;PROCESS_OWNER&#34;)
 *                 .build())
 *             .scope(AssessmentScopeArgs.builder()
 *                 .awsAccounts(AssessmentScopeAwsAccountArgs.builder()
 *                     .id(current.accountId())
 *                     .build())
 *                 .awsServices(AssessmentScopeAwsServiceArgs.builder()
 *                     .serviceName(&#34;S3&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Audit Manager Assessments using the assessment `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:auditmanager/assessment:Assessment example abc123-de45
 * ```
 * 
 */
@ResourceType(type="aws:auditmanager/assessment:Assessment")
public class Assessment extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the assessment.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the assessment.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Assessment report storage destination configuration. See `assessment_reports_destination` below.
     * 
     */
    @Export(name="assessmentReportsDestination", refs={AssessmentAssessmentReportsDestination.class}, tree="[0]")
    private Output</* @Nullable */ AssessmentAssessmentReportsDestination> assessmentReportsDestination;

    /**
     * @return Assessment report storage destination configuration. See `assessment_reports_destination` below.
     * 
     */
    public Output<Optional<AssessmentAssessmentReportsDestination>> assessmentReportsDestination() {
        return Codegen.optional(this.assessmentReportsDestination);
    }
    /**
     * Description of the assessment.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the assessment.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Unique identifier of the framework the assessment will be created from.
     * 
     */
    @Export(name="frameworkId", refs={String.class}, tree="[0]")
    private Output<String> frameworkId;

    /**
     * @return Unique identifier of the framework the assessment will be created from.
     * 
     */
    public Output<String> frameworkId() {
        return this.frameworkId;
    }
    /**
     * Name of the assessment.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the assessment.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of roles for the assessment. See `roles` below.
     * 
     */
    @Export(name="roles", refs={List.class,AssessmentRole.class}, tree="[0,1]")
    private Output<List<AssessmentRole>> roles;

    /**
     * @return List of roles for the assessment. See `roles` below.
     * 
     */
    public Output<List<AssessmentRole>> roles() {
        return this.roles;
    }
    /**
     * Complete list of all roles with access to the assessment. This includes both roles explicitly configured via the `roles` block, and any roles which have access to all Audit Manager assessments by default.
     * 
     */
    @Export(name="rolesAlls", refs={List.class,AssessmentRolesAll.class}, tree="[0,1]")
    private Output<List<AssessmentRolesAll>> rolesAlls;

    /**
     * @return Complete list of all roles with access to the assessment. This includes both roles explicitly configured via the `roles` block, and any roles which have access to all Audit Manager assessments by default.
     * 
     */
    public Output<List<AssessmentRolesAll>> rolesAlls() {
        return this.rolesAlls;
    }
    /**
     * Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="scope", refs={AssessmentScope.class}, tree="[0]")
    private Output</* @Nullable */ AssessmentScope> scope;

    /**
     * @return Amazon Web Services accounts and services that are in scope for the assessment. See `scope` below.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<Optional<AssessmentScope>> scope() {
        return Codegen.optional(this.scope);
    }
    /**
     * Status of the assessment. Valid values are `ACTIVE` and `INACTIVE`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the assessment. Valid values are `ACTIVE` and `INACTIVE`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A map of tags to assign to the assessment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the assessment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Assessment(String name) {
        this(name, AssessmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Assessment(String name, AssessmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Assessment(String name, AssessmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:auditmanager/assessment:Assessment", name, args == null ? AssessmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Assessment(String name, Output<String> id, @Nullable AssessmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:auditmanager/assessment:Assessment", name, state, makeResourceOptions(options, id));
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
    public static Assessment get(String name, Output<String> id, @Nullable AssessmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Assessment(name, id, state, options);
    }
}
