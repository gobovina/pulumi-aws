// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amplify;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.amplify.BranchArgs;
import com.pulumi.aws.amplify.inputs.BranchState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amplify Branch resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.amplify.App;
 * import com.pulumi.aws.amplify.Branch;
 * import com.pulumi.aws.amplify.BranchArgs;
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
 *         var example = new App(&#34;example&#34;);
 * 
 *         var master = new Branch(&#34;master&#34;, BranchArgs.builder()        
 *             .appId(example.id())
 *             .branchName(&#34;master&#34;)
 *             .framework(&#34;React&#34;)
 *             .stage(&#34;PRODUCTION&#34;)
 *             .environmentVariables(Map.of(&#34;REACT_APP_API_SERVER&#34;, &#34;https://api.example.com&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Notifications
 * 
 * Amplify Console uses EventBridge (formerly known as CloudWatch Events) and SNS for email notifications.  To implement the same functionality, you need to set `enable_notification` in a `aws.amplify.Branch` resource, as well as creating an EventBridge Rule, an SNS topic, and SNS subscriptions.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.amplify.App;
 * import com.pulumi.aws.amplify.Branch;
 * import com.pulumi.aws.amplify.BranchArgs;
 * import com.pulumi.aws.cloudwatch.EventRule;
 * import com.pulumi.aws.cloudwatch.EventRuleArgs;
 * import com.pulumi.aws.sns.Topic;
 * import com.pulumi.aws.cloudwatch.EventTarget;
 * import com.pulumi.aws.cloudwatch.EventTargetArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventTargetInputTransformerArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.sns.TopicPolicy;
 * import com.pulumi.aws.sns.TopicPolicyArgs;
 * import com.pulumi.aws.sns.TopicSubscription;
 * import com.pulumi.aws.sns.TopicSubscriptionArgs;
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
 *         var example = new App(&#34;example&#34;);
 * 
 *         var master = new Branch(&#34;master&#34;, BranchArgs.builder()        
 *             .appId(example.id())
 *             .branchName(&#34;master&#34;)
 *             .enableNotification(true)
 *             .build());
 * 
 *         var amplifyAppMasterEventRule = new EventRule(&#34;amplifyAppMasterEventRule&#34;, EventRuleArgs.builder()        
 *             .description(master.branchName().applyValue(branchName -&gt; String.format(&#34;AWS Amplify build notifications for :  App: %s Branch: %s&#34;, aws_amplify_app.app().id(),branchName)))
 *             .eventPattern(Output.tuple(example.id(), master.branchName()).applyValue(values -&gt; {
 *                 var id = values.t1;
 *                 var branchName = values.t2;
 *                 return serializeJson(
 *                     jsonObject(
 *                         jsonProperty(&#34;detail&#34;, jsonObject(
 *                             jsonProperty(&#34;appId&#34;, jsonArray(id)),
 *                             jsonProperty(&#34;branchName&#34;, jsonArray(branchName)),
 *                             jsonProperty(&#34;jobStatus&#34;, jsonArray(
 *                                 &#34;SUCCEED&#34;, 
 *                                 &#34;FAILED&#34;, 
 *                                 &#34;STARTED&#34;
 *                             ))
 *                         )),
 *                         jsonProperty(&#34;detail-type&#34;, jsonArray(&#34;Amplify Deployment Status Change&#34;)),
 *                         jsonProperty(&#34;source&#34;, jsonArray(&#34;aws.amplify&#34;))
 *                     ));
 *             }))
 *             .build());
 * 
 *         var amplifyAppMasterTopic = new Topic(&#34;amplifyAppMasterTopic&#34;);
 * 
 *         var amplifyAppMasterEventTarget = new EventTarget(&#34;amplifyAppMasterEventTarget&#34;, EventTargetArgs.builder()        
 *             .rule(amplifyAppMasterEventRule.name())
 *             .arn(amplifyAppMasterTopic.arn())
 *             .inputTransformer(EventTargetInputTransformerArgs.builder()
 *                 .inputPaths(Map.ofEntries(
 *                     Map.entry(&#34;jobId&#34;, &#34;$.detail.jobId&#34;),
 *                     Map.entry(&#34;appId&#34;, &#34;$.detail.appId&#34;),
 *                     Map.entry(&#34;region&#34;, &#34;$.region&#34;),
 *                     Map.entry(&#34;branch&#34;, &#34;$.detail.branchName&#34;),
 *                     Map.entry(&#34;status&#34;, &#34;$.detail.jobStatus&#34;)
 *                 ))
 *                 .inputTemplate(&#34;\&#34;Build notification from the AWS Amplify Console for app: https://&lt;branch&gt;.&lt;appId&gt;.amplifyapp.com/. Your build status is &lt;status&gt;. Go to https://console.aws.amazon.com/amplify/home?region=&lt;region&gt;#&lt;appId&gt;/&lt;branch&gt;/&lt;jobId&gt; to view details on your build. \&#34;&#34;)
 *                 .build())
 *             .build());
 * 
 *         final var amplifyAppMasterPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .sid(master.arn().applyValue(arn -&gt; String.format(&#34;Allow_Publish_Events %s&#34;, arn)))
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(&#34;SNS:Publish&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;events.amazonaws.com&#34;)
 *                     .build())
 *                 .resources(amplifyAppMasterTopic.arn())
 *                 .build())
 *             .build());
 * 
 *         var amplifyAppMasterTopicPolicy = new TopicPolicy(&#34;amplifyAppMasterTopicPolicy&#34;, TopicPolicyArgs.builder()        
 *             .arn(amplifyAppMasterTopic.arn())
 *             .policy(amplifyAppMasterPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult).applyValue(amplifyAppMasterPolicyDocument -&gt; amplifyAppMasterPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json())))
 *             .build());
 * 
 *         var this_ = new TopicSubscription(&#34;this&#34;, TopicSubscriptionArgs.builder()        
 *             .topic(amplifyAppMasterTopic.arn())
 *             .protocol(&#34;email&#34;)
 *             .endpoint(&#34;user@acme.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Amplify branch using `app_id` and `branch_name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:amplify/branch:Branch master d2ypk4k47z8u6/master
 * ```
 * 
 */
@ResourceType(type="aws:amplify/branch:Branch")
public class Branch extends com.pulumi.resources.CustomResource {
    /**
     * Unique ID for an Amplify app.
     * 
     */
    @Export(name="appId", refs={String.class}, tree="[0]")
    private Output<String> appId;

    /**
     * @return Unique ID for an Amplify app.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * ARN for the branch.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN for the branch.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A list of custom resources that are linked to this branch.
     * 
     */
    @Export(name="associatedResources", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> associatedResources;

    /**
     * @return A list of custom resources that are linked to this branch.
     * 
     */
    public Output<List<String>> associatedResources() {
        return this.associatedResources;
    }
    /**
     * ARN for a backend environment that is part of an Amplify app.
     * 
     */
    @Export(name="backendEnvironmentArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> backendEnvironmentArn;

    /**
     * @return ARN for a backend environment that is part of an Amplify app.
     * 
     */
    public Output<Optional<String>> backendEnvironmentArn() {
        return Codegen.optional(this.backendEnvironmentArn);
    }
    /**
     * Basic authorization credentials for the branch.
     * 
     */
    @Export(name="basicAuthCredentials", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> basicAuthCredentials;

    /**
     * @return Basic authorization credentials for the branch.
     * 
     */
    public Output<Optional<String>> basicAuthCredentials() {
        return Codegen.optional(this.basicAuthCredentials);
    }
    /**
     * Name for the branch.
     * 
     */
    @Export(name="branchName", refs={String.class}, tree="[0]")
    private Output<String> branchName;

    /**
     * @return Name for the branch.
     * 
     */
    public Output<String> branchName() {
        return this.branchName;
    }
    /**
     * Custom domains for the branch.
     * 
     */
    @Export(name="customDomains", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> customDomains;

    /**
     * @return Custom domains for the branch.
     * 
     */
    public Output<List<String>> customDomains() {
        return this.customDomains;
    }
    /**
     * Description for the branch.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description for the branch.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Destination branch if the branch is a pull request branch.
     * 
     */
    @Export(name="destinationBranch", refs={String.class}, tree="[0]")
    private Output<String> destinationBranch;

    /**
     * @return Destination branch if the branch is a pull request branch.
     * 
     */
    public Output<String> destinationBranch() {
        return this.destinationBranch;
    }
    /**
     * Display name for a branch. This is used as the default domain prefix.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return Display name for a branch. This is used as the default domain prefix.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Enables auto building for the branch.
     * 
     */
    @Export(name="enableAutoBuild", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableAutoBuild;

    /**
     * @return Enables auto building for the branch.
     * 
     */
    public Output<Optional<Boolean>> enableAutoBuild() {
        return Codegen.optional(this.enableAutoBuild);
    }
    /**
     * Enables basic authorization for the branch.
     * 
     */
    @Export(name="enableBasicAuth", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableBasicAuth;

    /**
     * @return Enables basic authorization for the branch.
     * 
     */
    public Output<Optional<Boolean>> enableBasicAuth() {
        return Codegen.optional(this.enableBasicAuth);
    }
    /**
     * Enables notifications for the branch.
     * 
     */
    @Export(name="enableNotification", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableNotification;

    /**
     * @return Enables notifications for the branch.
     * 
     */
    public Output<Optional<Boolean>> enableNotification() {
        return Codegen.optional(this.enableNotification);
    }
    /**
     * Enables performance mode for the branch.
     * 
     */
    @Export(name="enablePerformanceMode", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enablePerformanceMode;

    /**
     * @return Enables performance mode for the branch.
     * 
     */
    public Output<Optional<Boolean>> enablePerformanceMode() {
        return Codegen.optional(this.enablePerformanceMode);
    }
    /**
     * Enables pull request previews for this branch.
     * 
     */
    @Export(name="enablePullRequestPreview", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enablePullRequestPreview;

    /**
     * @return Enables pull request previews for this branch.
     * 
     */
    public Output<Optional<Boolean>> enablePullRequestPreview() {
        return Codegen.optional(this.enablePullRequestPreview);
    }
    /**
     * Environment variables for the branch.
     * 
     */
    @Export(name="environmentVariables", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> environmentVariables;

    /**
     * @return Environment variables for the branch.
     * 
     */
    public Output<Optional<Map<String,String>>> environmentVariables() {
        return Codegen.optional(this.environmentVariables);
    }
    /**
     * Framework for the branch.
     * 
     */
    @Export(name="framework", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> framework;

    /**
     * @return Framework for the branch.
     * 
     */
    public Output<Optional<String>> framework() {
        return Codegen.optional(this.framework);
    }
    /**
     * Amplify environment name for the pull request.
     * 
     */
    @Export(name="pullRequestEnvironmentName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pullRequestEnvironmentName;

    /**
     * @return Amplify environment name for the pull request.
     * 
     */
    public Output<Optional<String>> pullRequestEnvironmentName() {
        return Codegen.optional(this.pullRequestEnvironmentName);
    }
    /**
     * Source branch if the branch is a pull request branch.
     * 
     */
    @Export(name="sourceBranch", refs={String.class}, tree="[0]")
    private Output<String> sourceBranch;

    /**
     * @return Source branch if the branch is a pull request branch.
     * 
     */
    public Output<String> sourceBranch() {
        return this.sourceBranch;
    }
    /**
     * Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     * 
     */
    @Export(name="stage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> stage;

    /**
     * @return Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     * 
     */
    public Output<Optional<String>> stage() {
        return Codegen.optional(this.stage);
    }
    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Content Time To Live (TTL) for the website in seconds.
     * 
     */
    @Export(name="ttl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ttl;

    /**
     * @return Content Time To Live (TTL) for the website in seconds.
     * 
     */
    public Output<Optional<String>> ttl() {
        return Codegen.optional(this.ttl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Branch(String name) {
        this(name, BranchArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Branch(String name, BranchArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Branch(String name, BranchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:amplify/branch:Branch", name, args == null ? BranchArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Branch(String name, Output<String> id, @Nullable BranchState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:amplify/branch:Branch", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "basicAuthCredentials"
            ))
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
    public static Branch get(String name, Output<String> id, @Nullable BranchState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Branch(name, id, state, options);
    }
}
