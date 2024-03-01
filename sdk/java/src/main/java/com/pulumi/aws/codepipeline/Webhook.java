// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codepipeline;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.codepipeline.WebhookArgs;
import com.pulumi.aws.codepipeline.inputs.WebhookState;
import com.pulumi.aws.codepipeline.outputs.WebhookAuthenticationConfiguration;
import com.pulumi.aws.codepipeline.outputs.WebhookFilter;
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
 * Provides a CodePipeline Webhook.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.codepipeline.Pipeline;
 * import com.pulumi.aws.codepipeline.PipelineArgs;
 * import com.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreArgs;
 * import com.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreEncryptionKeyArgs;
 * import com.pulumi.aws.codepipeline.inputs.PipelineStageArgs;
 * import com.pulumi.aws.codepipeline.Webhook;
 * import com.pulumi.aws.codepipeline.WebhookArgs;
 * import com.pulumi.aws.codepipeline.inputs.WebhookAuthenticationConfigurationArgs;
 * import com.pulumi.aws.codepipeline.inputs.WebhookFilterArgs;
 * import com.pulumi.github.RepositoryWebhook;
 * import com.pulumi.github.RepositoryWebhookArgs;
 * import com.pulumi.github.inputs.RepositoryWebhookConfigurationArgs;
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
 *         var bar = new Pipeline(&#34;bar&#34;, PipelineArgs.builder()        
 *             .name(&#34;tf-test-pipeline&#34;)
 *             .roleArn(barAwsIamRole.arn())
 *             .artifactStores(PipelineArtifactStoreArgs.builder()
 *                 .location(barAwsS3Bucket.bucket())
 *                 .type(&#34;S3&#34;)
 *                 .encryptionKey(PipelineArtifactStoreEncryptionKeyArgs.builder()
 *                     .id(s3kmskey.arn())
 *                     .type(&#34;KMS&#34;)
 *                     .build())
 *                 .build())
 *             .stages(            
 *                 PipelineStageArgs.builder()
 *                     .name(&#34;Source&#34;)
 *                     .actions(PipelineStageActionArgs.builder()
 *                         .name(&#34;Source&#34;)
 *                         .category(&#34;Source&#34;)
 *                         .owner(&#34;ThirdParty&#34;)
 *                         .provider(&#34;GitHub&#34;)
 *                         .version(&#34;1&#34;)
 *                         .outputArtifacts(&#34;test&#34;)
 *                         .configuration(Map.ofEntries(
 *                             Map.entry(&#34;Owner&#34;, &#34;my-organization&#34;),
 *                             Map.entry(&#34;Repo&#34;, &#34;test&#34;),
 *                             Map.entry(&#34;Branch&#34;, &#34;master&#34;)
 *                         ))
 *                         .build())
 *                     .build(),
 *                 PipelineStageArgs.builder()
 *                     .name(&#34;Build&#34;)
 *                     .actions(PipelineStageActionArgs.builder()
 *                         .name(&#34;Build&#34;)
 *                         .category(&#34;Build&#34;)
 *                         .owner(&#34;AWS&#34;)
 *                         .provider(&#34;CodeBuild&#34;)
 *                         .inputArtifacts(&#34;test&#34;)
 *                         .version(&#34;1&#34;)
 *                         .configuration(Map.of(&#34;ProjectName&#34;, &#34;test&#34;))
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *         final var webhookSecret = &#34;super-secret&#34;;
 * 
 *         var barWebhook = new Webhook(&#34;barWebhook&#34;, WebhookArgs.builder()        
 *             .name(&#34;test-webhook-github-bar&#34;)
 *             .authentication(&#34;GITHUB_HMAC&#34;)
 *             .targetAction(&#34;Source&#34;)
 *             .targetPipeline(bar.name())
 *             .authenticationConfiguration(WebhookAuthenticationConfigurationArgs.builder()
 *                 .secretToken(webhookSecret)
 *                 .build())
 *             .filters(WebhookFilterArgs.builder()
 *                 .jsonPath(&#34;$.ref&#34;)
 *                 .matchEquals(&#34;refs/heads/{Branch}&#34;)
 *                 .build())
 *             .build());
 * 
 *         var barRepositoryWebhook = new RepositoryWebhook(&#34;barRepositoryWebhook&#34;, RepositoryWebhookArgs.builder()        
 *             .repository(repo.name())
 *             .name(&#34;web&#34;)
 *             .configuration(RepositoryWebhookConfigurationArgs.builder()
 *                 .url(barWebhook.url())
 *                 .contentType(&#34;json&#34;)
 *                 .insecureSsl(true)
 *                 .secret(webhookSecret)
 *                 .build())
 *             .events(&#34;push&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import CodePipeline Webhooks using their ARN. For example:
 * 
 * ```sh
 *  $ pulumi import aws:codepipeline/webhook:Webhook example arn:aws:codepipeline:us-west-2:123456789012:webhook:example
 * ```
 * 
 */
@ResourceType(type="aws:codepipeline/webhook:Webhook")
public class Webhook extends com.pulumi.resources.CustomResource {
    /**
     * The CodePipeline webhook&#39;s ARN.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The CodePipeline webhook&#39;s ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
     * 
     */
    @Export(name="authentication", refs={String.class}, tree="[0]")
    private Output<String> authentication;

    /**
     * @return The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
     * 
     */
    public Output<String> authentication() {
        return this.authentication;
    }
    /**
     * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
     * 
     */
    @Export(name="authenticationConfiguration", refs={WebhookAuthenticationConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ WebhookAuthenticationConfiguration> authenticationConfiguration;

    /**
     * @return An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
     * 
     */
    public Output<Optional<WebhookAuthenticationConfiguration>> authenticationConfiguration() {
        return Codegen.optional(this.authenticationConfiguration);
    }
    /**
     * One or more `filter` blocks. Filter blocks are documented below.
     * 
     */
    @Export(name="filters", refs={List.class,WebhookFilter.class}, tree="[0,1]")
    private Output<List<WebhookFilter>> filters;

    /**
     * @return One or more `filter` blocks. Filter blocks are documented below.
     * 
     */
    public Output<List<WebhookFilter>> filters() {
        return this.filters;
    }
    /**
     * The name of the webhook.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the webhook.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
     * 
     */
    @Export(name="targetAction", refs={String.class}, tree="[0]")
    private Output<String> targetAction;

    /**
     * @return The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
     * 
     */
    public Output<String> targetAction() {
        return this.targetAction;
    }
    /**
     * The name of the pipeline.
     * 
     */
    @Export(name="targetPipeline", refs={String.class}, tree="[0]")
    private Output<String> targetPipeline;

    /**
     * @return The name of the pipeline.
     * 
     */
    public Output<String> targetPipeline() {
        return this.targetPipeline;
    }
    /**
     * The CodePipeline webhook&#39;s URL. POST events to this endpoint to trigger the target.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return The CodePipeline webhook&#39;s URL. POST events to this endpoint to trigger the target.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Webhook(String name) {
        this(name, WebhookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Webhook(String name, WebhookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Webhook(String name, WebhookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codepipeline/webhook:Webhook", name, args == null ? WebhookArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Webhook(String name, Output<String> id, @Nullable WebhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codepipeline/webhook:Webhook", name, state, makeResourceOptions(options, id));
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
    public static Webhook get(String name, Output<String> id, @Nullable WebhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Webhook(name, id, state, options);
    }
}
