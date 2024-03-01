// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudformation;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudformation.StackSetArgs;
import com.pulumi.aws.cloudformation.inputs.StackSetState;
import com.pulumi.aws.cloudformation.outputs.StackSetAutoDeployment;
import com.pulumi.aws.cloudformation.outputs.StackSetManagedExecution;
import com.pulumi.aws.cloudformation.outputs.StackSetOperationPreferences;
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
 * Manages a CloudFormation StackSet. StackSets allow CloudFormation templates to be easily deployed across multiple accounts and regions via StackSet Instances (`aws.cloudformation.StackSetInstance` resource). Additional information about StackSets can be found in the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/what-is-cfnstacksets.html).
 * 
 * &gt; **NOTE:** All template parameters, including those with a `Default`, must be configured or ignored with the `lifecycle` configuration block `ignore_changes` argument.
 * 
 * &gt; **NOTE:** All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignore_changes` argument.
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
 * import com.pulumi.aws.cloudformation.StackSet;
 * import com.pulumi.aws.cloudformation.StackSetArgs;
 * import com.pulumi.aws.iam.RolePolicy;
 * import com.pulumi.aws.iam.RolePolicyArgs;
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
 *         final var aWSCloudFormationStackSetAdministrationRoleAssumeRolePolicy = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .identifiers(&#34;cloudformation.amazonaws.com&#34;)
 *                     .type(&#34;Service&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var aWSCloudFormationStackSetAdministrationRole = new Role(&#34;aWSCloudFormationStackSetAdministrationRole&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(aWSCloudFormationStackSetAdministrationRoleAssumeRolePolicy.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .name(&#34;AWSCloudFormationStackSetAdministrationRole&#34;)
 *             .build());
 * 
 *         var example = new StackSet(&#34;example&#34;, StackSetArgs.builder()        
 *             .administrationRoleArn(aWSCloudFormationStackSetAdministrationRole.arn())
 *             .name(&#34;example&#34;)
 *             .parameters(Map.of(&#34;VPCCidr&#34;, &#34;10.0.0.0/16&#34;))
 *             .templateBody(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;parameters&#34;, jsonObject(
 *                         jsonProperty(&#34;vPCCidr&#34;, jsonObject(
 *                             jsonProperty(&#34;type&#34;, &#34;String&#34;),
 *                             jsonProperty(&#34;default&#34;, &#34;10.0.0.0/16&#34;),
 *                             jsonProperty(&#34;description&#34;, &#34;Enter the CIDR block for the VPC. Default is 10.0.0.0/16.&#34;)
 *                         ))
 *                     )),
 *                     jsonProperty(&#34;resources&#34;, jsonObject(
 *                         jsonProperty(&#34;myVpc&#34;, jsonObject(
 *                             jsonProperty(&#34;type&#34;, &#34;AWS::EC2::VPC&#34;),
 *                             jsonProperty(&#34;properties&#34;, jsonObject(
 *                                 jsonProperty(&#34;cidrBlock&#34;, jsonObject(
 *                                     jsonProperty(&#34;ref&#34;, &#34;VPCCidr&#34;)
 *                                 )),
 *                                 jsonProperty(&#34;tags&#34;, jsonArray(jsonObject(
 *                                     jsonProperty(&#34;key&#34;, &#34;Name&#34;),
 *                                     jsonProperty(&#34;value&#34;, &#34;Primary_CF_VPC&#34;)
 *                                 )))
 *                             ))
 *                         ))
 *                     ))
 *                 )))
 *             .build());
 * 
 *         final var aWSCloudFormationStackSetAdministrationRoleExecutionPolicy = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .effect(&#34;Allow&#34;)
 *                 .resources(example.executionRoleName().applyValue(executionRoleName -&gt; String.format(&#34;arn:aws:iam::*:role/%s&#34;, executionRoleName)))
 *                 .build())
 *             .build());
 * 
 *         var aWSCloudFormationStackSetAdministrationRoleExecutionPolicyRolePolicy = new RolePolicy(&#34;aWSCloudFormationStackSetAdministrationRoleExecutionPolicyRolePolicy&#34;, RolePolicyArgs.builder()        
 *             .name(&#34;ExecutionPolicy&#34;)
 *             .policy(aWSCloudFormationStackSetAdministrationRoleExecutionPolicy.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult).applyValue(aWSCloudFormationStackSetAdministrationRoleExecutionPolicy -&gt; aWSCloudFormationStackSetAdministrationRoleExecutionPolicy.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json())))
 *             .role(aWSCloudFormationStackSetAdministrationRole.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import CloudFormation StackSets when acting a delegated administrator in a member account using the `name` and `call_as` values separated by a comma (`,`). For example:
 * 
 * Using `pulumi import`, import CloudFormation StackSets using the `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:cloudformation/stackSet:StackSet example example
 * ```
 *  Using `pulumi import`, import CloudFormation StackSets when acting a delegated administrator in a member account using the `name` and `call_as` values separated by a comma (`,`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:cloudformation/stackSet:StackSet example example,DELEGATED_ADMIN
 * ```
 * 
 */
@ResourceType(type="aws:cloudformation/stackSet:StackSet")
public class StackSet extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Number (ARN) of the IAM Role in the administrator account. This must be defined when using the `SELF_MANAGED` permission model.
     * 
     */
    @Export(name="administrationRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> administrationRoleArn;

    /**
     * @return Amazon Resource Number (ARN) of the IAM Role in the administrator account. This must be defined when using the `SELF_MANAGED` permission model.
     * 
     */
    public Output<Optional<String>> administrationRoleArn() {
        return Codegen.optional(this.administrationRoleArn);
    }
    /**
     * Amazon Resource Name (ARN) of the StackSet.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the StackSet.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Configuration block containing the auto-deployment model for your StackSet. This can only be defined when using the `SERVICE_MANAGED` permission model.
     * 
     */
    @Export(name="autoDeployment", refs={StackSetAutoDeployment.class}, tree="[0]")
    private Output</* @Nullable */ StackSetAutoDeployment> autoDeployment;

    /**
     * @return Configuration block containing the auto-deployment model for your StackSet. This can only be defined when using the `SERVICE_MANAGED` permission model.
     * 
     */
    public Output<Optional<StackSetAutoDeployment>> autoDeployment() {
        return Codegen.optional(this.autoDeployment);
    }
    /**
     * Specifies whether you are acting as an account administrator in the organization&#39;s management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
     * 
     */
    @Export(name="callAs", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> callAs;

    /**
     * @return Specifies whether you are acting as an account administrator in the organization&#39;s management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
     * 
     */
    public Output<Optional<String>> callAs() {
        return Codegen.optional(this.callAs);
    }
    /**
     * A list of capabilities. Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_AUTO_EXPAND`.
     * 
     */
    @Export(name="capabilities", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> capabilities;

    /**
     * @return A list of capabilities. Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_AUTO_EXPAND`.
     * 
     */
    public Output<Optional<List<String>>> capabilities() {
        return Codegen.optional(this.capabilities);
    }
    /**
     * Description of the StackSet.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the StackSet.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the IAM Role in all target accounts for StackSet operations. Defaults to `AWSCloudFormationStackSetExecutionRole` when using the `SELF_MANAGED` permission model. This should not be defined when using the `SERVICE_MANAGED` permission model.
     * 
     */
    @Export(name="executionRoleName", refs={String.class}, tree="[0]")
    private Output<String> executionRoleName;

    /**
     * @return Name of the IAM Role in all target accounts for StackSet operations. Defaults to `AWSCloudFormationStackSetExecutionRole` when using the `SELF_MANAGED` permission model. This should not be defined when using the `SERVICE_MANAGED` permission model.
     * 
     */
    public Output<String> executionRoleName() {
        return this.executionRoleName;
    }
    /**
     * Configuration block to allow StackSets to perform non-conflicting operations concurrently and queues conflicting operations.
     * 
     */
    @Export(name="managedExecution", refs={StackSetManagedExecution.class}, tree="[0]")
    private Output</* @Nullable */ StackSetManagedExecution> managedExecution;

    /**
     * @return Configuration block to allow StackSets to perform non-conflicting operations concurrently and queues conflicting operations.
     * 
     */
    public Output<Optional<StackSetManagedExecution>> managedExecution() {
        return Codegen.optional(this.managedExecution);
    }
    /**
     * Name of the StackSet. The name must be unique in the region where you create your StackSet. The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an alphabetic character and cannot be longer than 128 characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the StackSet. The name must be unique in the region where you create your StackSet. The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an alphabetic character and cannot be longer than 128 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Preferences for how AWS CloudFormation performs a stack set update.
     * 
     */
    @Export(name="operationPreferences", refs={StackSetOperationPreferences.class}, tree="[0]")
    private Output</* @Nullable */ StackSetOperationPreferences> operationPreferences;

    /**
     * @return Preferences for how AWS CloudFormation performs a stack set update.
     * 
     */
    public Output<Optional<StackSetOperationPreferences>> operationPreferences() {
        return Codegen.optional(this.operationPreferences);
    }
    /**
     * Key-value map of input parameters for the StackSet template. All template parameters, including those with a `Default`, must be configured or ignored with `lifecycle` configuration block `ignore_changes` argument. All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignore_changes` argument.
     * 
     */
    @Export(name="parameters", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return Key-value map of input parameters for the StackSet template. All template parameters, including those with a `Default`, must be configured or ignored with `lifecycle` configuration block `ignore_changes` argument. All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignore_changes` argument.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * Describes how the IAM roles required for your StackSet are created. Valid values: `SELF_MANAGED` (default), `SERVICE_MANAGED`.
     * 
     */
    @Export(name="permissionModel", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> permissionModel;

    /**
     * @return Describes how the IAM roles required for your StackSet are created. Valid values: `SELF_MANAGED` (default), `SERVICE_MANAGED`.
     * 
     */
    public Output<Optional<String>> permissionModel() {
        return Codegen.optional(this.permissionModel);
    }
    /**
     * Unique identifier of the StackSet.
     * 
     */
    @Export(name="stackSetId", refs={String.class}, tree="[0]")
    private Output<String> stackSetId;

    /**
     * @return Unique identifier of the StackSet.
     * 
     */
    public Output<String> stackSetId() {
        return this.stackSetId;
    }
    /**
     * Key-value map of tags to associate with this StackSet and the Stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the Stacks. A maximum number of 50 tags can be specified. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of tags to associate with this StackSet and the Stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the Stacks. A maximum number of 50 tags can be specified. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * String containing the CloudFormation template body. Maximum size: 51,200 bytes. Conflicts with `template_url`.
     * 
     */
    @Export(name="templateBody", refs={String.class}, tree="[0]")
    private Output<String> templateBody;

    /**
     * @return String containing the CloudFormation template body. Maximum size: 51,200 bytes. Conflicts with `template_url`.
     * 
     */
    public Output<String> templateBody() {
        return this.templateBody;
    }
    /**
     * String containing the location of a file containing the CloudFormation template body. The URL must point to a template that is located in an Amazon S3 bucket. Maximum location file size: 460,800 bytes. Conflicts with `template_body`.
     * 
     */
    @Export(name="templateUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> templateUrl;

    /**
     * @return String containing the location of a file containing the CloudFormation template body. The URL must point to a template that is located in an Amazon S3 bucket. Maximum location file size: 460,800 bytes. Conflicts with `template_body`.
     * 
     */
    public Output<Optional<String>> templateUrl() {
        return Codegen.optional(this.templateUrl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StackSet(String name) {
        this(name, StackSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StackSet(String name, @Nullable StackSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StackSet(String name, @Nullable StackSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudformation/stackSet:StackSet", name, args == null ? StackSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StackSet(String name, Output<String> id, @Nullable StackSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudformation/stackSet:StackSet", name, state, makeResourceOptions(options, id));
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
    public static StackSet get(String name, Output<String> id, @Nullable StackSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StackSet(name, id, state, options);
    }
}
