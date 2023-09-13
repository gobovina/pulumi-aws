// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iam.GroupPolicyAttachmentArgs;
import com.pulumi.aws.iam.inputs.GroupPolicyAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Attaches a Managed IAM Policy to an IAM group
 * 
 * &gt; **NOTE:** The usage of this resource conflicts with the `aws.iam.PolicyAttachment` resource and will permanently show a difference if both are defined.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.Group;
 * import com.pulumi.aws.iam.Policy;
 * import com.pulumi.aws.iam.PolicyArgs;
 * import com.pulumi.aws.iam.GroupPolicyAttachment;
 * import com.pulumi.aws.iam.GroupPolicyAttachmentArgs;
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
 *         var group = new Group(&#34;group&#34;);
 * 
 *         var policy = new Policy(&#34;policy&#34;, PolicyArgs.builder()        
 *             .description(&#34;A test policy&#34;)
 *             .policy(&#34;{ ... policy JSON ... }&#34;)
 *             .build());
 * 
 *         var test_attach = new GroupPolicyAttachment(&#34;test-attach&#34;, GroupPolicyAttachmentArgs.builder()        
 *             .group(group.name())
 *             .policyArn(policy.arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * In TODO v1.5.0 and later, use an `import` block to import IAM group policy attachments using the group name and policy arn separated by `/`. For exampleterraform import {
 * 
 *  to = aws_iam_group_policy_attachment.test-attach
 * 
 *  id = &#34;test-group/arn:aws:iam::xxxxxxxxxxxx:policy/test-policy&#34; } Using `TODO import`, import IAM group policy attachments using the group name and policy arn separated by `/`. For exampleconsole % TODO import aws_iam_group_policy_attachment.test-attach test-group/arn:aws:iam::xxxxxxxxxxxx:policy/test-policy
 * 
 */
@ResourceType(type="aws:iam/groupPolicyAttachment:GroupPolicyAttachment")
public class GroupPolicyAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The group the policy should be applied to
     * 
     */
    @Export(name="group", refs={String.class}, tree="[0]")
    private Output<String> group;

    /**
     * @return The group the policy should be applied to
     * 
     */
    public Output<String> group() {
        return this.group;
    }
    /**
     * The ARN of the policy you want to apply
     * 
     */
    @Export(name="policyArn", refs={String.class}, tree="[0]")
    private Output<String> policyArn;

    /**
     * @return The ARN of the policy you want to apply
     * 
     */
    public Output<String> policyArn() {
        return this.policyArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GroupPolicyAttachment(String name) {
        this(name, GroupPolicyAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GroupPolicyAttachment(String name, GroupPolicyAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupPolicyAttachment(String name, GroupPolicyAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/groupPolicyAttachment:GroupPolicyAttachment", name, args == null ? GroupPolicyAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GroupPolicyAttachment(String name, Output<String> id, @Nullable GroupPolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/groupPolicyAttachment:GroupPolicyAttachment", name, state, makeResourceOptions(options, id));
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
    public static GroupPolicyAttachment get(String name, Output<String> id, @Nullable GroupPolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GroupPolicyAttachment(name, id, state, options);
    }
}
