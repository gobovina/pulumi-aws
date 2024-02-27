// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Creates a AWS Batch compute environment. Compute environments contain the Amazon ECS container instances that are used to run containerized batch jobs.
 *
 * For information about AWS Batch, see [What is AWS Batch?](http://docs.aws.amazon.com/batch/latest/userguide/what-is-batch.html) .
 * For information about compute environment, see [Compute Environments](http://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) .
 *
 * > **Note:** To prevent a race condition during environment deletion, make sure to set `dependsOn` to the related `aws.iam.RolePolicyAttachment`;
 * otherwise, the policy may be destroyed too soon and the compute environment will then get stuck in the `DELETING` state, see [Troubleshooting AWS Batch](http://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html) .
 *
 * ## Example Usage
 * ### EC2 Type
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const ec2AssumeRole = aws.iam.getPolicyDocument({
 *     statements: [{
 *         effect: "Allow",
 *         principals: [{
 *             type: "Service",
 *             identifiers: ["ec2.amazonaws.com"],
 *         }],
 *         actions: ["sts:AssumeRole"],
 *     }],
 * });
 * const ecsInstanceRoleRole = new aws.iam.Role("ecsInstanceRoleRole", {assumeRolePolicy: ec2AssumeRole.then(ec2AssumeRole => ec2AssumeRole.json)});
 * const ecsInstanceRoleRolePolicyAttachment = new aws.iam.RolePolicyAttachment("ecsInstanceRoleRolePolicyAttachment", {
 *     role: ecsInstanceRoleRole.name,
 *     policyArn: "arn:aws:iam::aws:policy/service-role/AmazonEC2ContainerServiceforEC2Role",
 * });
 * const ecsInstanceRoleInstanceProfile = new aws.iam.InstanceProfile("ecsInstanceRoleInstanceProfile", {role: ecsInstanceRoleRole.name});
 * const batchAssumeRole = aws.iam.getPolicyDocument({
 *     statements: [{
 *         effect: "Allow",
 *         principals: [{
 *             type: "Service",
 *             identifiers: ["batch.amazonaws.com"],
 *         }],
 *         actions: ["sts:AssumeRole"],
 *     }],
 * });
 * const awsBatchServiceRoleRole = new aws.iam.Role("awsBatchServiceRoleRole", {assumeRolePolicy: batchAssumeRole.then(batchAssumeRole => batchAssumeRole.json)});
 * const awsBatchServiceRoleRolePolicyAttachment = new aws.iam.RolePolicyAttachment("awsBatchServiceRoleRolePolicyAttachment", {
 *     role: awsBatchServiceRoleRole.name,
 *     policyArn: "arn:aws:iam::aws:policy/service-role/AWSBatchServiceRole",
 * });
 * const sampleSecurityGroup = new aws.ec2.SecurityGroup("sampleSecurityGroup", {egress: [{
 *     fromPort: 0,
 *     toPort: 0,
 *     protocol: "-1",
 *     cidrBlocks: ["0.0.0.0/0"],
 * }]});
 * const sampleVpc = new aws.ec2.Vpc("sampleVpc", {cidrBlock: "10.1.0.0/16"});
 * const sampleSubnet = new aws.ec2.Subnet("sampleSubnet", {
 *     vpcId: sampleVpc.id,
 *     cidrBlock: "10.1.1.0/24",
 * });
 * const samplePlacementGroup = new aws.ec2.PlacementGroup("samplePlacementGroup", {strategy: "cluster"});
 * const sampleComputeEnvironment = new aws.batch.ComputeEnvironment("sampleComputeEnvironment", {
 *     computeEnvironmentName: "sample",
 *     computeResources: {
 *         instanceRole: ecsInstanceRoleInstanceProfile.arn,
 *         instanceTypes: ["c4.large"],
 *         maxVcpus: 16,
 *         minVcpus: 0,
 *         placementGroup: samplePlacementGroup.name,
 *         securityGroupIds: [sampleSecurityGroup.id],
 *         subnets: [sampleSubnet.id],
 *         type: "EC2",
 *     },
 *     serviceRole: awsBatchServiceRoleRole.arn,
 *     type: "MANAGED",
 * }, {
 *     dependsOn: [awsBatchServiceRoleRolePolicyAttachment],
 * });
 * ```
 * ### Fargate Type
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const sample = new aws.batch.ComputeEnvironment("sample", {
 *     computeEnvironmentName: "sample",
 *     computeResources: {
 *         maxVcpus: 16,
 *         securityGroupIds: [aws_security_group.sample.id],
 *         subnets: [aws_subnet.sample.id],
 *         type: "FARGATE",
 *     },
 *     serviceRole: aws_iam_role.aws_batch_service_role.arn,
 *     type: "MANAGED",
 * }, {
 *     dependsOn: [aws_iam_role_policy_attachment.aws_batch_service_role],
 * });
 * ```
 * ### Setting Update Policy
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const sample = new aws.batch.ComputeEnvironment("sample", {
 *     computeEnvironmentName: "sample",
 *     computeResources: {
 *         allocationStrategy: "BEST_FIT_PROGRESSIVE",
 *         instanceRole: aws_iam_instance_profile.ecs_instance.arn,
 *         instanceTypes: ["optimal"],
 *         maxVcpus: 4,
 *         minVcpus: 0,
 *         securityGroupIds: [aws_security_group.sample.id],
 *         subnets: [aws_subnet.sample.id],
 *         type: "EC2",
 *     },
 *     updatePolicy: {
 *         jobExecutionTimeoutMinutes: 30,
 *         terminateJobsOnUpdate: false,
 *     },
 *     type: "MANAGED",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import AWS Batch compute using the `compute_environment_name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:batch/computeEnvironment:ComputeEnvironment sample sample
 * ```
 */
export class ComputeEnvironment extends pulumi.CustomResource {
    /**
     * Get an existing ComputeEnvironment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ComputeEnvironmentState, opts?: pulumi.CustomResourceOptions): ComputeEnvironment {
        return new ComputeEnvironment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:batch/computeEnvironment:ComputeEnvironment';

    /**
     * Returns true if the given object is an instance of ComputeEnvironment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ComputeEnvironment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ComputeEnvironment.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the compute environment.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, the provider will assign a random, unique name.
     */
    public readonly computeEnvironmentName!: pulumi.Output<string>;
    /**
     * Creates a unique compute environment name beginning with the specified prefix. Conflicts with `computeEnvironmentName`.
     */
    public readonly computeEnvironmentNamePrefix!: pulumi.Output<string>;
    /**
     * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
     */
    public readonly computeResources!: pulumi.Output<outputs.batch.ComputeEnvironmentComputeResources | undefined>;
    /**
     * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
     */
    public /*out*/ readonly ecsClusterArn!: pulumi.Output<string>;
    /**
     * Details for the Amazon EKS cluster that supports the compute environment. See details below.
     */
    public readonly eksConfiguration!: pulumi.Output<outputs.batch.ComputeEnvironmentEksConfiguration | undefined>;
    /**
     * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
     */
    public readonly serviceRole!: pulumi.Output<string>;
    /**
     * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
     */
    public readonly state!: pulumi.Output<string | undefined>;
    /**
     * The current status of the compute environment (for example, CREATING or VALID).
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A short, human-readable string to provide additional details about the current status of the compute environment.
     */
    public /*out*/ readonly statusReason!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The type of the compute environment. Valid items are `MANAGED` or `UNMANAGED`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Specifies the infrastructure update policy for the compute environment. See details below.
     */
    public readonly updatePolicy!: pulumi.Output<outputs.batch.ComputeEnvironmentUpdatePolicy | undefined>;

    /**
     * Create a ComputeEnvironment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ComputeEnvironmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ComputeEnvironmentArgs | ComputeEnvironmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ComputeEnvironmentState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["computeEnvironmentName"] = state ? state.computeEnvironmentName : undefined;
            resourceInputs["computeEnvironmentNamePrefix"] = state ? state.computeEnvironmentNamePrefix : undefined;
            resourceInputs["computeResources"] = state ? state.computeResources : undefined;
            resourceInputs["ecsClusterArn"] = state ? state.ecsClusterArn : undefined;
            resourceInputs["eksConfiguration"] = state ? state.eksConfiguration : undefined;
            resourceInputs["serviceRole"] = state ? state.serviceRole : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["statusReason"] = state ? state.statusReason : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["updatePolicy"] = state ? state.updatePolicy : undefined;
        } else {
            const args = argsOrState as ComputeEnvironmentArgs | undefined;
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["computeEnvironmentName"] = args ? args.computeEnvironmentName : undefined;
            resourceInputs["computeEnvironmentNamePrefix"] = args ? args.computeEnvironmentNamePrefix : undefined;
            resourceInputs["computeResources"] = args ? args.computeResources : undefined;
            resourceInputs["eksConfiguration"] = args ? args.eksConfiguration : undefined;
            resourceInputs["serviceRole"] = args ? args.serviceRole : undefined;
            resourceInputs["state"] = args ? args.state : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["updatePolicy"] = args ? args.updatePolicy : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["ecsClusterArn"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["statusReason"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ComputeEnvironment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ComputeEnvironment resources.
 */
export interface ComputeEnvironmentState {
    /**
     * The Amazon Resource Name (ARN) of the compute environment.
     */
    arn?: pulumi.Input<string>;
    /**
     * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, the provider will assign a random, unique name.
     */
    computeEnvironmentName?: pulumi.Input<string>;
    /**
     * Creates a unique compute environment name beginning with the specified prefix. Conflicts with `computeEnvironmentName`.
     */
    computeEnvironmentNamePrefix?: pulumi.Input<string>;
    /**
     * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
     */
    computeResources?: pulumi.Input<inputs.batch.ComputeEnvironmentComputeResources>;
    /**
     * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
     */
    ecsClusterArn?: pulumi.Input<string>;
    /**
     * Details for the Amazon EKS cluster that supports the compute environment. See details below.
     */
    eksConfiguration?: pulumi.Input<inputs.batch.ComputeEnvironmentEksConfiguration>;
    /**
     * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
     */
    serviceRole?: pulumi.Input<string>;
    /**
     * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
     */
    state?: pulumi.Input<string>;
    /**
     * The current status of the compute environment (for example, CREATING or VALID).
     */
    status?: pulumi.Input<string>;
    /**
     * A short, human-readable string to provide additional details about the current status of the compute environment.
     */
    statusReason?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The type of the compute environment. Valid items are `MANAGED` or `UNMANAGED`.
     */
    type?: pulumi.Input<string>;
    /**
     * Specifies the infrastructure update policy for the compute environment. See details below.
     */
    updatePolicy?: pulumi.Input<inputs.batch.ComputeEnvironmentUpdatePolicy>;
}

/**
 * The set of arguments for constructing a ComputeEnvironment resource.
 */
export interface ComputeEnvironmentArgs {
    /**
     * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, the provider will assign a random, unique name.
     */
    computeEnvironmentName?: pulumi.Input<string>;
    /**
     * Creates a unique compute environment name beginning with the specified prefix. Conflicts with `computeEnvironmentName`.
     */
    computeEnvironmentNamePrefix?: pulumi.Input<string>;
    /**
     * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
     */
    computeResources?: pulumi.Input<inputs.batch.ComputeEnvironmentComputeResources>;
    /**
     * Details for the Amazon EKS cluster that supports the compute environment. See details below.
     */
    eksConfiguration?: pulumi.Input<inputs.batch.ComputeEnvironmentEksConfiguration>;
    /**
     * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
     */
    serviceRole?: pulumi.Input<string>;
    /**
     * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
     */
    state?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The type of the compute environment. Valid items are `MANAGED` or `UNMANAGED`.
     */
    type: pulumi.Input<string>;
    /**
     * Specifies the infrastructure update policy for the compute environment. See details below.
     */
    updatePolicy?: pulumi.Input<inputs.batch.ComputeEnvironmentUpdatePolicy>;
}
