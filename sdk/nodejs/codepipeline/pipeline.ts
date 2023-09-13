// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a CodePipeline.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.codestarconnections.Connection("example", {providerType: "GitHub"});
 * const codepipelineBucket = new aws.s3.BucketV2("codepipelineBucket", {});
 * const assumeRole = aws.iam.getPolicyDocument({
 *     statements: [{
 *         effect: "Allow",
 *         principals: [{
 *             type: "Service",
 *             identifiers: ["codepipeline.amazonaws.com"],
 *         }],
 *         actions: ["sts:AssumeRole"],
 *     }],
 * });
 * const codepipelineRole = new aws.iam.Role("codepipelineRole", {assumeRolePolicy: assumeRole.then(assumeRole => assumeRole.json)});
 * const s3kmskey = aws.kms.getAlias({
 *     name: "alias/myKmsKey",
 * });
 * const codepipeline = new aws.codepipeline.Pipeline("codepipeline", {
 *     roleArn: codepipelineRole.arn,
 *     artifactStores: [{
 *         location: codepipelineBucket.bucket,
 *         type: "S3",
 *         encryptionKey: {
 *             id: s3kmskey.then(s3kmskey => s3kmskey.arn),
 *             type: "KMS",
 *         },
 *     }],
 *     stages: [
 *         {
 *             name: "Source",
 *             actions: [{
 *                 name: "Source",
 *                 category: "Source",
 *                 owner: "AWS",
 *                 provider: "CodeStarSourceConnection",
 *                 version: "1",
 *                 outputArtifacts: ["source_output"],
 *                 configuration: {
 *                     ConnectionArn: example.arn,
 *                     FullRepositoryId: "my-organization/example",
 *                     BranchName: "main",
 *                 },
 *             }],
 *         },
 *         {
 *             name: "Build",
 *             actions: [{
 *                 name: "Build",
 *                 category: "Build",
 *                 owner: "AWS",
 *                 provider: "CodeBuild",
 *                 inputArtifacts: ["source_output"],
 *                 outputArtifacts: ["build_output"],
 *                 version: "1",
 *                 configuration: {
 *                     ProjectName: "test",
 *                 },
 *             }],
 *         },
 *         {
 *             name: "Deploy",
 *             actions: [{
 *                 name: "Deploy",
 *                 category: "Deploy",
 *                 owner: "AWS",
 *                 provider: "CloudFormation",
 *                 inputArtifacts: ["build_output"],
 *                 version: "1",
 *                 configuration: {
 *                     ActionMode: "REPLACE_ON_FAILURE",
 *                     Capabilities: "CAPABILITY_AUTO_EXPAND,CAPABILITY_IAM",
 *                     OutputFileName: "CreateStackOutput.json",
 *                     StackName: "MyStack",
 *                     TemplatePath: "build_output::sam-templated.yaml",
 *                 },
 *             }],
 *         },
 *     ],
 * });
 * const codepipelineBucketAcl = new aws.s3.BucketAclV2("codepipelineBucketAcl", {
 *     bucket: codepipelineBucket.id,
 *     acl: "private",
 * });
 * const codepipelinePolicyPolicyDocument = aws.iam.getPolicyDocumentOutput({
 *     statements: [
 *         {
 *             effect: "Allow",
 *             actions: [
 *                 "s3:GetObject",
 *                 "s3:GetObjectVersion",
 *                 "s3:GetBucketVersioning",
 *                 "s3:PutObjectAcl",
 *                 "s3:PutObject",
 *             ],
 *             resources: [
 *                 codepipelineBucket.arn,
 *                 pulumi.interpolate`${codepipelineBucket.arn}/*`,
 *             ],
 *         },
 *         {
 *             effect: "Allow",
 *             actions: ["codestar-connections:UseConnection"],
 *             resources: [example.arn],
 *         },
 *         {
 *             effect: "Allow",
 *             actions: [
 *                 "codebuild:BatchGetBuilds",
 *                 "codebuild:StartBuild",
 *             ],
 *             resources: ["*"],
 *         },
 *     ],
 * });
 * const codepipelinePolicyRolePolicy = new aws.iam.RolePolicy("codepipelinePolicyRolePolicy", {
 *     role: codepipelineRole.id,
 *     policy: codepipelinePolicyPolicyDocument.apply(codepipelinePolicyPolicyDocument => codepipelinePolicyPolicyDocument.json),
 * });
 * ```
 *
 * ## Import
 *
 * In TODO v1.5.0 and later, use an `import` block to import CodePipelines using the name. For exampleterraform import {
 *
 *  to = aws_codepipeline.foo
 *
 *  id = "example" } Using `TODO import`, import CodePipelines using the name. For exampleconsole % TODO import aws_codepipeline.foo example
 */
export class Pipeline extends pulumi.CustomResource {
    /**
     * Get an existing Pipeline resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PipelineState, opts?: pulumi.CustomResourceOptions): Pipeline {
        return new Pipeline(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:codepipeline/pipeline:Pipeline';

    /**
     * Returns true if the given object is an instance of Pipeline.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Pipeline {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Pipeline.__pulumiType;
    }

    /**
     * The codepipeline ARN.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * One or more artifactStore blocks. Artifact stores are documented below.
     */
    public readonly artifactStores!: pulumi.Output<outputs.codepipeline.PipelineArtifactStore[]>;
    /**
     * The name of the pipeline.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
     */
    public readonly roleArn!: pulumi.Output<string>;
    /**
     * A stage block. Stages are documented below.
     */
    public readonly stages!: pulumi.Output<outputs.codepipeline.PipelineStage[]>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Pipeline resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PipelineArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PipelineArgs | PipelineState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PipelineState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["artifactStores"] = state ? state.artifactStores : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["roleArn"] = state ? state.roleArn : undefined;
            resourceInputs["stages"] = state ? state.stages : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as PipelineArgs | undefined;
            if ((!args || args.artifactStores === undefined) && !opts.urn) {
                throw new Error("Missing required property 'artifactStores'");
            }
            if ((!args || args.roleArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleArn'");
            }
            if ((!args || args.stages === undefined) && !opts.urn) {
                throw new Error("Missing required property 'stages'");
            }
            resourceInputs["artifactStores"] = args ? args.artifactStores : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["roleArn"] = args ? args.roleArn : undefined;
            resourceInputs["stages"] = args ? args.stages : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Pipeline.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Pipeline resources.
 */
export interface PipelineState {
    /**
     * The codepipeline ARN.
     */
    arn?: pulumi.Input<string>;
    /**
     * One or more artifactStore blocks. Artifact stores are documented below.
     */
    artifactStores?: pulumi.Input<pulumi.Input<inputs.codepipeline.PipelineArtifactStore>[]>;
    /**
     * The name of the pipeline.
     */
    name?: pulumi.Input<string>;
    /**
     * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
     */
    roleArn?: pulumi.Input<string>;
    /**
     * A stage block. Stages are documented below.
     */
    stages?: pulumi.Input<pulumi.Input<inputs.codepipeline.PipelineStage>[]>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Pipeline resource.
 */
export interface PipelineArgs {
    /**
     * One or more artifactStore blocks. Artifact stores are documented below.
     */
    artifactStores: pulumi.Input<pulumi.Input<inputs.codepipeline.PipelineArtifactStore>[]>;
    /**
     * The name of the pipeline.
     */
    name?: pulumi.Input<string>;
    /**
     * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
     */
    roleArn: pulumi.Input<string>;
    /**
     * A stage block. Stages are documented below.
     */
    stages: pulumi.Input<pulumi.Input<inputs.codepipeline.PipelineStage>[]>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
