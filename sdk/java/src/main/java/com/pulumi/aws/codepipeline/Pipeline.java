// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codepipeline;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.codepipeline.PipelineArgs;
import com.pulumi.aws.codepipeline.inputs.PipelineState;
import com.pulumi.aws.codepipeline.outputs.PipelineArtifactStore;
import com.pulumi.aws.codepipeline.outputs.PipelineStage;
import com.pulumi.aws.codepipeline.outputs.PipelineVariable;
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
 * Provides a CodePipeline.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.codestarconnections.Connection;
 * import com.pulumi.aws.codestarconnections.ConnectionArgs;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.kms.KmsFunctions;
 * import com.pulumi.aws.kms.inputs.GetAliasArgs;
 * import com.pulumi.aws.codepipeline.Pipeline;
 * import com.pulumi.aws.codepipeline.PipelineArgs;
 * import com.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreArgs;
 * import com.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreEncryptionKeyArgs;
 * import com.pulumi.aws.codepipeline.inputs.PipelineStageArgs;
 * import com.pulumi.aws.s3.BucketPublicAccessBlock;
 * import com.pulumi.aws.s3.BucketPublicAccessBlockArgs;
 * import com.pulumi.aws.iam.RolePolicy;
 * import com.pulumi.aws.iam.RolePolicyArgs;
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
 *         var example = new Connection(&#34;example&#34;, ConnectionArgs.builder()        
 *             .providerType(&#34;GitHub&#34;)
 *             .build());
 * 
 *         var codepipelineBucket = new BucketV2(&#34;codepipelineBucket&#34;);
 * 
 *         final var assumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;codepipeline.amazonaws.com&#34;)
 *                     .build())
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .build())
 *             .build());
 * 
 *         var codepipelineRole = new Role(&#34;codepipelineRole&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(assumeRole.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         final var s3kmskey = KmsFunctions.getAlias(GetAliasArgs.builder()
 *             .name(&#34;alias/myKmsKey&#34;)
 *             .build());
 * 
 *         var codepipeline = new Pipeline(&#34;codepipeline&#34;, PipelineArgs.builder()        
 *             .roleArn(codepipelineRole.arn())
 *             .artifactStores(PipelineArtifactStoreArgs.builder()
 *                 .location(codepipelineBucket.bucket())
 *                 .type(&#34;S3&#34;)
 *                 .encryptionKey(PipelineArtifactStoreEncryptionKeyArgs.builder()
 *                     .id(s3kmskey.applyValue(getAliasResult -&gt; getAliasResult.arn()))
 *                     .type(&#34;KMS&#34;)
 *                     .build())
 *                 .build())
 *             .stages(            
 *                 PipelineStageArgs.builder()
 *                     .name(&#34;Source&#34;)
 *                     .actions(PipelineStageActionArgs.builder()
 *                         .name(&#34;Source&#34;)
 *                         .category(&#34;Source&#34;)
 *                         .owner(&#34;AWS&#34;)
 *                         .provider(&#34;CodeStarSourceConnection&#34;)
 *                         .version(&#34;1&#34;)
 *                         .outputArtifacts(&#34;source_output&#34;)
 *                         .configuration(Map.ofEntries(
 *                             Map.entry(&#34;ConnectionArn&#34;, example.arn()),
 *                             Map.entry(&#34;FullRepositoryId&#34;, &#34;my-organization/example&#34;),
 *                             Map.entry(&#34;BranchName&#34;, &#34;main&#34;)
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
 *                         .inputArtifacts(&#34;source_output&#34;)
 *                         .outputArtifacts(&#34;build_output&#34;)
 *                         .version(&#34;1&#34;)
 *                         .configuration(Map.of(&#34;ProjectName&#34;, &#34;test&#34;))
 *                         .build())
 *                     .build(),
 *                 PipelineStageArgs.builder()
 *                     .name(&#34;Deploy&#34;)
 *                     .actions(PipelineStageActionArgs.builder()
 *                         .name(&#34;Deploy&#34;)
 *                         .category(&#34;Deploy&#34;)
 *                         .owner(&#34;AWS&#34;)
 *                         .provider(&#34;CloudFormation&#34;)
 *                         .inputArtifacts(&#34;build_output&#34;)
 *                         .version(&#34;1&#34;)
 *                         .configuration(Map.ofEntries(
 *                             Map.entry(&#34;ActionMode&#34;, &#34;REPLACE_ON_FAILURE&#34;),
 *                             Map.entry(&#34;Capabilities&#34;, &#34;CAPABILITY_AUTO_EXPAND,CAPABILITY_IAM&#34;),
 *                             Map.entry(&#34;OutputFileName&#34;, &#34;CreateStackOutput.json&#34;),
 *                             Map.entry(&#34;StackName&#34;, &#34;MyStack&#34;),
 *                             Map.entry(&#34;TemplatePath&#34;, &#34;build_output::sam-templated.yaml&#34;)
 *                         ))
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *         var codepipelineBucketPab = new BucketPublicAccessBlock(&#34;codepipelineBucketPab&#34;, BucketPublicAccessBlockArgs.builder()        
 *             .bucket(codepipelineBucket.id())
 *             .blockPublicAcls(true)
 *             .blockPublicPolicy(true)
 *             .ignorePublicAcls(true)
 *             .restrictPublicBuckets(true)
 *             .build());
 * 
 *         final var codepipelinePolicyPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(            
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .effect(&#34;Allow&#34;)
 *                     .actions(                    
 *                         &#34;s3:GetObject&#34;,
 *                         &#34;s3:GetObjectVersion&#34;,
 *                         &#34;s3:GetBucketVersioning&#34;,
 *                         &#34;s3:PutObjectAcl&#34;,
 *                         &#34;s3:PutObject&#34;)
 *                     .resources(                    
 *                         codepipelineBucket.arn(),
 *                         codepipelineBucket.arn().applyValue(arn -&gt; String.format(&#34;%s/*&#34;, arn)))
 *                     .build(),
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .effect(&#34;Allow&#34;)
 *                     .actions(&#34;codestar-connections:UseConnection&#34;)
 *                     .resources(example.arn())
 *                     .build(),
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .effect(&#34;Allow&#34;)
 *                     .actions(                    
 *                         &#34;codebuild:BatchGetBuilds&#34;,
 *                         &#34;codebuild:StartBuild&#34;)
 *                     .resources(&#34;*&#34;)
 *                     .build())
 *             .build());
 * 
 *         var codepipelinePolicyRolePolicy = new RolePolicy(&#34;codepipelinePolicyRolePolicy&#34;, RolePolicyArgs.builder()        
 *             .role(codepipelineRole.id())
 *             .policy(codepipelinePolicyPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult).applyValue(codepipelinePolicyPolicyDocument -&gt; codepipelinePolicyPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json())))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import CodePipelines using the name. For example:
 * 
 * ```sh
 *  $ pulumi import aws:codepipeline/pipeline:Pipeline foo example
 * ```
 * 
 */
@ResourceType(type="aws:codepipeline/pipeline:Pipeline")
public class Pipeline extends com.pulumi.resources.CustomResource {
    /**
     * The codepipeline ARN.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The codepipeline ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * One or more artifact_store blocks. Artifact stores are documented below.
     * 
     */
    @Export(name="artifactStores", refs={List.class,PipelineArtifactStore.class}, tree="[0,1]")
    private Output<List<PipelineArtifactStore>> artifactStores;

    /**
     * @return One or more artifact_store blocks. Artifact stores are documented below.
     * 
     */
    public Output<List<PipelineArtifactStore>> artifactStores() {
        return this.artifactStores;
    }
    /**
     * The name of the pipeline.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the pipeline.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Type of the pipeline. Possible values are: `V1` and `V2`. Default value is `V1`.
     * 
     */
    @Export(name="pipelineType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pipelineType;

    /**
     * @return Type of the pipeline. Possible values are: `V1` and `V2`. Default value is `V1`.
     * 
     */
    public Output<Optional<String>> pipelineType() {
        return Codegen.optional(this.pipelineType);
    }
    /**
     * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output<String> roleArn;

    /**
     * @return A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * A stage block. Stages are documented below.
     * 
     */
    @Export(name="stages", refs={List.class,PipelineStage.class}, tree="[0,1]")
    private Output<List<PipelineStage>> stages;

    /**
     * @return A stage block. Stages are documented below.
     * 
     */
    public Output<List<PipelineStage>> stages() {
        return this.stages;
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
     * A pipeline-level variable block. Valid only when `pipeline_type` is `V2`. Variable are documented below.
     * 
     */
    @Export(name="variables", refs={List.class,PipelineVariable.class}, tree="[0,1]")
    private Output</* @Nullable */ List<PipelineVariable>> variables;

    /**
     * @return A pipeline-level variable block. Valid only when `pipeline_type` is `V2`. Variable are documented below.
     * 
     */
    public Output<Optional<List<PipelineVariable>>> variables() {
        return Codegen.optional(this.variables);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pipeline(String name) {
        this(name, PipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pipeline(String name, PipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pipeline(String name, PipelineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codepipeline/pipeline:Pipeline", name, args == null ? PipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pipeline(String name, Output<String> id, @Nullable PipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codepipeline/pipeline:Pipeline", name, state, makeResourceOptions(options, id));
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
    public static Pipeline get(String name, Output<String> id, @Nullable PipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Pipeline(name, id, state, options);
    }
}
