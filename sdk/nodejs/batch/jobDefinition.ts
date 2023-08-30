// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a Batch Job Definition resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.batch.JobDefinition("test", {
 *     type: "container",
 *     containerProperties: JSON.stringify({
 *         command: [
 *             "ls",
 *             "-la",
 *         ],
 *         image: "busybox",
 *         resourceRequirements: [
 *             {
 *                 type: "VCPU",
 *                 value: "0.25",
 *             },
 *             {
 *                 type: "MEMORY",
 *                 value: "512",
 *             },
 *         ],
 *         volumes: [{
 *             host: {
 *                 sourcePath: "/tmp",
 *             },
 *             name: "tmp",
 *         }],
 *         environment: [{
 *             name: "VARNAME",
 *             value: "VARVAL",
 *         }],
 *         mountPoints: [{
 *             sourceVolume: "tmp",
 *             containerPath: "/tmp",
 *             readOnly: false,
 *         }],
 *         ulimits: [{
 *             hardLimit: 1024,
 *             name: "nofile",
 *             softLimit: 1024,
 *         }],
 *     }),
 * });
 * ```
 * ### Fargate Platform Capability
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const assumeRolePolicy = aws.iam.getPolicyDocument({
 *     statements: [{
 *         actions: ["sts:AssumeRole"],
 *         principals: [{
 *             type: "Service",
 *             identifiers: ["ecs-tasks.amazonaws.com"],
 *         }],
 *     }],
 * });
 * const ecsTaskExecutionRole = new aws.iam.Role("ecsTaskExecutionRole", {assumeRolePolicy: assumeRolePolicy.then(assumeRolePolicy => assumeRolePolicy.json)});
 * const ecsTaskExecutionRolePolicy = new aws.iam.RolePolicyAttachment("ecsTaskExecutionRolePolicy", {
 *     role: ecsTaskExecutionRole.name,
 *     policyArn: "arn:aws:iam::aws:policy/service-role/AmazonECSTaskExecutionRolePolicy",
 * });
 * const test = new aws.batch.JobDefinition("test", {
 *     type: "container",
 *     platformCapabilities: ["FARGATE"],
 *     containerProperties: ecsTaskExecutionRole.arn.apply(arn => JSON.stringify({
 *         command: [
 *             "echo",
 *             "test",
 *         ],
 *         image: "busybox",
 *         jobRoleArn: "arn:aws:iam::123456789012:role/AWSBatchS3ReadOnly",
 *         fargatePlatformConfiguration: {
 *             platformVersion: "LATEST",
 *         },
 *         resourceRequirements: [
 *             {
 *                 type: "VCPU",
 *                 value: "0.25",
 *             },
 *             {
 *                 type: "MEMORY",
 *                 value: "512",
 *             },
 *         ],
 *         executionRoleArn: arn,
 *     })),
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Batch Job Definition using the `arn`. For example:
 *
 * ```sh
 *  $ pulumi import aws:batch/jobDefinition:JobDefinition test arn:aws:batch:us-east-1:123456789012:job-definition/sample
 * ```
 */
export class JobDefinition extends pulumi.CustomResource {
    /**
     * Get an existing JobDefinition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: JobDefinitionState, opts?: pulumi.CustomResourceOptions): JobDefinition {
        return new JobDefinition(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:batch/jobDefinition:JobDefinition';

    /**
     * Returns true if the given object is an instance of JobDefinition.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is JobDefinition {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === JobDefinition.__pulumiType;
    }

    /**
     * The Amazon Resource Name of the job definition.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
     * provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
     */
    public readonly containerProperties!: pulumi.Output<string | undefined>;
    /**
     * Specifies the name of the job definition.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the parameter substitution placeholders to set in the job definition.
     */
    public readonly parameters!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The platform capabilities required by the job definition. If no value is specified, it defaults to `EC2`. To run the job on Fargate resources, specify `FARGATE`.
     */
    public readonly platformCapabilities!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies whether to propagate the tags from the job definition to the corresponding Amazon ECS task. Default is `false`.
     */
    public readonly propagateTags!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
     * Maximum number of `retryStrategy` is `1`.  Defined below.
     */
    public readonly retryStrategy!: pulumi.Output<outputs.batch.JobDefinitionRetryStrategy | undefined>;
    /**
     * The revision of the job definition.
     */
    public /*out*/ readonly revision!: pulumi.Output<number>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
     */
    public readonly timeout!: pulumi.Output<outputs.batch.JobDefinitionTimeout | undefined>;
    /**
     * The type of job definition. Must be `container`.
     *
     * The following arguments are optional:
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a JobDefinition resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: JobDefinitionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: JobDefinitionArgs | JobDefinitionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as JobDefinitionState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["containerProperties"] = state ? state.containerProperties : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["platformCapabilities"] = state ? state.platformCapabilities : undefined;
            resourceInputs["propagateTags"] = state ? state.propagateTags : undefined;
            resourceInputs["retryStrategy"] = state ? state.retryStrategy : undefined;
            resourceInputs["revision"] = state ? state.revision : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["timeout"] = state ? state.timeout : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as JobDefinitionArgs | undefined;
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["containerProperties"] = args ? args.containerProperties : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["platformCapabilities"] = args ? args.platformCapabilities : undefined;
            resourceInputs["propagateTags"] = args ? args.propagateTags : undefined;
            resourceInputs["retryStrategy"] = args ? args.retryStrategy : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["timeout"] = args ? args.timeout : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["revision"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(JobDefinition.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering JobDefinition resources.
 */
export interface JobDefinitionState {
    /**
     * The Amazon Resource Name of the job definition.
     */
    arn?: pulumi.Input<string>;
    /**
     * A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
     * provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
     */
    containerProperties?: pulumi.Input<string>;
    /**
     * Specifies the name of the job definition.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the parameter substitution placeholders to set in the job definition.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The platform capabilities required by the job definition. If no value is specified, it defaults to `EC2`. To run the job on Fargate resources, specify `FARGATE`.
     */
    platformCapabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies whether to propagate the tags from the job definition to the corresponding Amazon ECS task. Default is `false`.
     */
    propagateTags?: pulumi.Input<boolean>;
    /**
     * Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
     * Maximum number of `retryStrategy` is `1`.  Defined below.
     */
    retryStrategy?: pulumi.Input<inputs.batch.JobDefinitionRetryStrategy>;
    /**
     * The revision of the job definition.
     */
    revision?: pulumi.Input<number>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
     */
    timeout?: pulumi.Input<inputs.batch.JobDefinitionTimeout>;
    /**
     * The type of job definition. Must be `container`.
     *
     * The following arguments are optional:
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a JobDefinition resource.
 */
export interface JobDefinitionArgs {
    /**
     * A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
     * provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
     */
    containerProperties?: pulumi.Input<string>;
    /**
     * Specifies the name of the job definition.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the parameter substitution placeholders to set in the job definition.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The platform capabilities required by the job definition. If no value is specified, it defaults to `EC2`. To run the job on Fargate resources, specify `FARGATE`.
     */
    platformCapabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies whether to propagate the tags from the job definition to the corresponding Amazon ECS task. Default is `false`.
     */
    propagateTags?: pulumi.Input<boolean>;
    /**
     * Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
     * Maximum number of `retryStrategy` is `1`.  Defined below.
     */
    retryStrategy?: pulumi.Input<inputs.batch.JobDefinitionRetryStrategy>;
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
     */
    timeout?: pulumi.Input<inputs.batch.JobDefinitionTimeout>;
    /**
     * The type of job definition. Must be `container`.
     *
     * The following arguments are optional:
     */
    type: pulumi.Input<string>;
}
