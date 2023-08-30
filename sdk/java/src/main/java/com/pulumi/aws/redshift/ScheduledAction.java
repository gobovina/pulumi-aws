// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.redshift.ScheduledActionArgs;
import com.pulumi.aws.redshift.inputs.ScheduledActionState;
import com.pulumi.aws.redshift.outputs.ScheduledActionTargetAction;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Pause Cluster Action
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
 * import com.pulumi.aws.iam.Policy;
 * import com.pulumi.aws.iam.PolicyArgs;
 * import com.pulumi.aws.iam.RolePolicyAttachment;
 * import com.pulumi.aws.iam.RolePolicyAttachmentArgs;
 * import com.pulumi.aws.redshift.ScheduledAction;
 * import com.pulumi.aws.redshift.ScheduledActionArgs;
 * import com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs;
 * import com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionPauseClusterArgs;
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
 *                     .identifiers(&#34;scheduler.redshift.amazonaws.com&#34;)
 *                     .build())
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleRole = new Role(&#34;exampleRole&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(assumeRole.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         final var examplePolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(                
 *                     &#34;redshift:PauseCluster&#34;,
 *                     &#34;redshift:ResumeCluster&#34;,
 *                     &#34;redshift:ResizeCluster&#34;)
 *                 .resources(&#34;*&#34;)
 *                 .build())
 *             .build());
 * 
 *         var examplePolicy = new Policy(&#34;examplePolicy&#34;, PolicyArgs.builder()        
 *             .policy(examplePolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var exampleRolePolicyAttachment = new RolePolicyAttachment(&#34;exampleRolePolicyAttachment&#34;, RolePolicyAttachmentArgs.builder()        
 *             .policyArn(examplePolicy.arn())
 *             .role(exampleRole.name())
 *             .build());
 * 
 *         var exampleScheduledAction = new ScheduledAction(&#34;exampleScheduledAction&#34;, ScheduledActionArgs.builder()        
 *             .schedule(&#34;cron(00 23 * * ? *)&#34;)
 *             .iamRole(exampleRole.arn())
 *             .targetAction(ScheduledActionTargetActionArgs.builder()
 *                 .pauseCluster(ScheduledActionTargetActionPauseClusterArgs.builder()
 *                     .clusterIdentifier(&#34;tf-redshift001&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Resize Cluster Action
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.redshift.ScheduledAction;
 * import com.pulumi.aws.redshift.ScheduledActionArgs;
 * import com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs;
 * import com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionResizeClusterArgs;
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
 *         var example = new ScheduledAction(&#34;example&#34;, ScheduledActionArgs.builder()        
 *             .schedule(&#34;cron(00 23 * * ? *)&#34;)
 *             .iamRole(aws_iam_role.example().arn())
 *             .targetAction(ScheduledActionTargetActionArgs.builder()
 *                 .resizeCluster(ScheduledActionTargetActionResizeClusterArgs.builder()
 *                     .clusterIdentifier(&#34;tf-redshift001&#34;)
 *                     .clusterType(&#34;multi-node&#34;)
 *                     .nodeType(&#34;dc1.large&#34;)
 *                     .numberOfNodes(2)
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
 * Using `pulumi import`, import Redshift Scheduled Action using the `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:redshift/scheduledAction:ScheduledAction example tf-redshift-scheduled-action
 * ```
 * 
 */
@ResourceType(type="aws:redshift/scheduledAction:ScheduledAction")
public class ScheduledAction extends com.pulumi.resources.CustomResource {
    /**
     * The description of the scheduled action.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the scheduled action.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether to enable the scheduled action. Default is `true` .
     * 
     */
    @Export(name="enable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enable;

    /**
     * @return Whether to enable the scheduled action. Default is `true` .
     * 
     */
    public Output<Optional<Boolean>> enable() {
        return Codegen.optional(this.enable);
    }
    /**
     * The end time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     * 
     */
    @Export(name="endTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> endTime;

    /**
     * @return The end time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     * 
     */
    public Output<Optional<String>> endTime() {
        return Codegen.optional(this.endTime);
    }
    /**
     * The IAM role to assume to run the scheduled action.
     * 
     */
    @Export(name="iamRole", refs={String.class}, tree="[0]")
    private Output<String> iamRole;

    /**
     * @return The IAM role to assume to run the scheduled action.
     * 
     */
    public Output<String> iamRole() {
        return this.iamRole;
    }
    /**
     * The scheduled action name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The scheduled action name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The schedule of action. The schedule is defined format of &#34;at expression&#34; or &#34;cron expression&#34;, for example `at(2016-03-04T17:27:00)` or `cron(0 10 ? * MON *)`. See [Scheduled Action](https://docs.aws.amazon.com/redshift/latest/APIReference/API_ScheduledAction.html) for more information.
     * 
     */
    @Export(name="schedule", refs={String.class}, tree="[0]")
    private Output<String> schedule;

    /**
     * @return The schedule of action. The schedule is defined format of &#34;at expression&#34; or &#34;cron expression&#34;, for example `at(2016-03-04T17:27:00)` or `cron(0 10 ? * MON *)`. See [Scheduled Action](https://docs.aws.amazon.com/redshift/latest/APIReference/API_ScheduledAction.html) for more information.
     * 
     */
    public Output<String> schedule() {
        return this.schedule;
    }
    /**
     * The start time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     * 
     */
    @Export(name="startTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> startTime;

    /**
     * @return The start time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     * 
     */
    public Output<Optional<String>> startTime() {
        return Codegen.optional(this.startTime);
    }
    /**
     * Target action. Documented below.
     * 
     */
    @Export(name="targetAction", refs={ScheduledActionTargetAction.class}, tree="[0]")
    private Output<ScheduledActionTargetAction> targetAction;

    /**
     * @return Target action. Documented below.
     * 
     */
    public Output<ScheduledActionTargetAction> targetAction() {
        return this.targetAction;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScheduledAction(String name) {
        this(name, ScheduledActionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScheduledAction(String name, ScheduledActionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScheduledAction(String name, ScheduledActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/scheduledAction:ScheduledAction", name, args == null ? ScheduledActionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScheduledAction(String name, Output<String> id, @Nullable ScheduledActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/scheduledAction:ScheduledAction", name, state, makeResourceOptions(options, id));
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
    public static ScheduledAction get(String name, Output<String> id, @Nullable ScheduledActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ScheduledAction(name, id, state, options);
    }
}
