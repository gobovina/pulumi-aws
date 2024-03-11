// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS EventBridge Pipes Pipe.
 *
 * You can find out more about EventBridge Pipes in the [User Guide](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html).
 *
 * EventBridge Pipes are very configurable, and may require IAM permissions to work correctly. More information on the configuration options and IAM permissions can be found in the [User Guide](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html).
 *
 * > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const main = aws.getCallerIdentity({});
 * const example = new aws.iam.Role("example", {assumeRolePolicy: JSON.stringify({
 *     version: "2012-10-17",
 *     statement: {
 *         effect: "Allow",
 *         action: "sts:AssumeRole",
 *         principal: {
 *             service: "pipes.amazonaws.com",
 *         },
 *         condition: {
 *             stringEquals: {
 *                 "aws:SourceAccount": main.then(main => main.accountId),
 *             },
 *         },
 *     },
 * })});
 * const sourceQueue = new aws.sqs.Queue("source", {});
 * const source = new aws.iam.RolePolicy("source", {
 *     role: example.id,
 *     policy: pulumi.jsonStringify({
 *         version: "2012-10-17",
 *         statement: [{
 *             effect: "Allow",
 *             action: [
 *                 "sqs:DeleteMessage",
 *                 "sqs:GetQueueAttributes",
 *                 "sqs:ReceiveMessage",
 *             ],
 *             resource: [sourceQueue.arn],
 *         }],
 *     }),
 * });
 * const targetQueue = new aws.sqs.Queue("target", {});
 * const target = new aws.iam.RolePolicy("target", {
 *     role: example.id,
 *     policy: pulumi.jsonStringify({
 *         version: "2012-10-17",
 *         statement: [{
 *             effect: "Allow",
 *             action: ["sqs:SendMessage"],
 *             resource: [targetQueue.arn],
 *         }],
 *     }),
 * });
 * const examplePipe = new aws.pipes.Pipe("example", {
 *     name: "example-pipe",
 *     roleArn: example.arn,
 *     source: sourceQueue.arn,
 *     target: targetQueue.arn,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Enrichment Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.pipes.Pipe("example", {
 *     name: "example-pipe",
 *     roleArn: exampleAwsIamRole.arn,
 *     source: source.arn,
 *     target: target.arn,
 *     enrichment: exampleAwsCloudwatchEventApiDestination.arn,
 *     enrichmentParameters: {
 *         httpParameters: {
 *             pathParameterValues: "example-path-param",
 *             headerParameters: {
 *                 "example-header": "example-value",
 *                 "second-example-header": "second-example-value",
 *             },
 *             queryStringParameters: {
 *                 "example-query-string": "example-value",
 *                 "second-example-query-string": "second-example-value",
 *             },
 *         },
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Filter Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.pipes.Pipe("example", {
 *     name: "example-pipe",
 *     roleArn: exampleAwsIamRole.arn,
 *     source: source.arn,
 *     target: target.arn,
 *     sourceParameters: {
 *         filterCriteria: {
 *             filters: [{
 *                 pattern: JSON.stringify({
 *                     source: ["event-source"],
 *                 }),
 *             }],
 *         },
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import pipes using the `name`. For example:
 *
 * ```sh
 * $ pulumi import aws:pipes/pipe:Pipe example my-pipe
 * ```
 */
export class Pipe extends pulumi.CustomResource {
    /**
     * Get an existing Pipe resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PipeState, opts?: pulumi.CustomResourceOptions): Pipe {
        return new Pipe(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:pipes/pipe:Pipe';

    /**
     * Returns true if the given object is an instance of Pipe.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Pipe {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Pipe.__pulumiType;
    }

    /**
     * The ARN of the Amazon SQS queue specified as the target for the dead-letter queue.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A description of the pipe. At most 512 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The state the pipe should be in. One of: `RUNNING`, `STOPPED`.
     */
    public readonly desiredState!: pulumi.Output<string | undefined>;
    /**
     * Enrichment resource of the pipe (typically an ARN). Read more about enrichment in the [User Guide](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html#pipes-enrichment).
     */
    public readonly enrichment!: pulumi.Output<string | undefined>;
    /**
     * Parameters to configure enrichment for your pipe. Detailed below.
     */
    public readonly enrichmentParameters!: pulumi.Output<outputs.pipes.PipeEnrichmentParameters | undefined>;
    /**
     * Name of the pipe. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     */
    public readonly namePrefix!: pulumi.Output<string>;
    /**
     * ARN of the role that allows the pipe to send data to the target.
     */
    public readonly roleArn!: pulumi.Output<string>;
    /**
     * Source resource of the pipe (typically an ARN).
     */
    public readonly source!: pulumi.Output<string>;
    /**
     * Parameters to configure a source for the pipe. Detailed below.
     */
    public readonly sourceParameters!: pulumi.Output<outputs.pipes.PipeSourceParameters>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Target resource of the pipe (typically an ARN).
     *
     * The following arguments are optional:
     */
    public readonly target!: pulumi.Output<string>;
    /**
     * Parameters to configure a target for your pipe. Detailed below.
     */
    public readonly targetParameters!: pulumi.Output<outputs.pipes.PipeTargetParameters | undefined>;

    /**
     * Create a Pipe resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PipeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PipeArgs | PipeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PipeState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["desiredState"] = state ? state.desiredState : undefined;
            resourceInputs["enrichment"] = state ? state.enrichment : undefined;
            resourceInputs["enrichmentParameters"] = state ? state.enrichmentParameters : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namePrefix"] = state ? state.namePrefix : undefined;
            resourceInputs["roleArn"] = state ? state.roleArn : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["sourceParameters"] = state ? state.sourceParameters : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["target"] = state ? state.target : undefined;
            resourceInputs["targetParameters"] = state ? state.targetParameters : undefined;
        } else {
            const args = argsOrState as PipeArgs | undefined;
            if ((!args || args.roleArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleArn'");
            }
            if ((!args || args.source === undefined) && !opts.urn) {
                throw new Error("Missing required property 'source'");
            }
            if ((!args || args.target === undefined) && !opts.urn) {
                throw new Error("Missing required property 'target'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["desiredState"] = args ? args.desiredState : undefined;
            resourceInputs["enrichment"] = args ? args.enrichment : undefined;
            resourceInputs["enrichmentParameters"] = args ? args.enrichmentParameters : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namePrefix"] = args ? args.namePrefix : undefined;
            resourceInputs["roleArn"] = args ? args.roleArn : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["sourceParameters"] = args ? args.sourceParameters : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["target"] = args ? args.target : undefined;
            resourceInputs["targetParameters"] = args ? args.targetParameters : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Pipe.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Pipe resources.
 */
export interface PipeState {
    /**
     * The ARN of the Amazon SQS queue specified as the target for the dead-letter queue.
     */
    arn?: pulumi.Input<string>;
    /**
     * A description of the pipe. At most 512 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * The state the pipe should be in. One of: `RUNNING`, `STOPPED`.
     */
    desiredState?: pulumi.Input<string>;
    /**
     * Enrichment resource of the pipe (typically an ARN). Read more about enrichment in the [User Guide](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html#pipes-enrichment).
     */
    enrichment?: pulumi.Input<string>;
    /**
     * Parameters to configure enrichment for your pipe. Detailed below.
     */
    enrichmentParameters?: pulumi.Input<inputs.pipes.PipeEnrichmentParameters>;
    /**
     * Name of the pipe. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * ARN of the role that allows the pipe to send data to the target.
     */
    roleArn?: pulumi.Input<string>;
    /**
     * Source resource of the pipe (typically an ARN).
     */
    source?: pulumi.Input<string>;
    /**
     * Parameters to configure a source for the pipe. Detailed below.
     */
    sourceParameters?: pulumi.Input<inputs.pipes.PipeSourceParameters>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Target resource of the pipe (typically an ARN).
     *
     * The following arguments are optional:
     */
    target?: pulumi.Input<string>;
    /**
     * Parameters to configure a target for your pipe. Detailed below.
     */
    targetParameters?: pulumi.Input<inputs.pipes.PipeTargetParameters>;
}

/**
 * The set of arguments for constructing a Pipe resource.
 */
export interface PipeArgs {
    /**
     * A description of the pipe. At most 512 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * The state the pipe should be in. One of: `RUNNING`, `STOPPED`.
     */
    desiredState?: pulumi.Input<string>;
    /**
     * Enrichment resource of the pipe (typically an ARN). Read more about enrichment in the [User Guide](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes.html#pipes-enrichment).
     */
    enrichment?: pulumi.Input<string>;
    /**
     * Parameters to configure enrichment for your pipe. Detailed below.
     */
    enrichmentParameters?: pulumi.Input<inputs.pipes.PipeEnrichmentParameters>;
    /**
     * Name of the pipe. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * ARN of the role that allows the pipe to send data to the target.
     */
    roleArn: pulumi.Input<string>;
    /**
     * Source resource of the pipe (typically an ARN).
     */
    source: pulumi.Input<string>;
    /**
     * Parameters to configure a source for the pipe. Detailed below.
     */
    sourceParameters?: pulumi.Input<inputs.pipes.PipeSourceParameters>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Target resource of the pipe (typically an ARN).
     *
     * The following arguments are optional:
     */
    target: pulumi.Input<string>;
    /**
     * Parameters to configure a target for your pipe. Detailed below.
     */
    targetParameters?: pulumi.Input<inputs.pipes.PipeTargetParameters>;
}
