// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages a revision of an ECS task definition to be used in `aws.ecs.Service`.
 *
 * ## Example Usage
 *
 * ### Basic Example
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const service = new aws.ecs.TaskDefinition("service", {
 *     family: "service",
 *     containerDefinitions: JSON.stringify([
 *         {
 *             name: "first",
 *             image: "service-first",
 *             cpu: 10,
 *             memory: 512,
 *             essential: true,
 *             portMappings: [{
 *                 containerPort: 80,
 *                 hostPort: 80,
 *             }],
 *         },
 *         {
 *             name: "second",
 *             image: "service-second",
 *             cpu: 10,
 *             memory: 256,
 *             essential: true,
 *             portMappings: [{
 *                 containerPort: 443,
 *                 hostPort: 443,
 *             }],
 *         },
 *     ]),
 *     volumes: [{
 *         name: "service-storage",
 *         hostPath: "/ecs/service-storage",
 *     }],
 *     placementConstraints: [{
 *         type: "memberOf",
 *         expression: "attribute:ecs.availability-zone in [us-west-2a, us-west-2b]",
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### With AppMesh Proxy
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * const service = new aws.ecs.TaskDefinition("service", {
 *     family: "service",
 *     containerDefinitions: std.file({
 *         input: "task-definitions/service.json",
 *     }).then(invoke => invoke.result),
 *     proxyConfiguration: {
 *         type: "APPMESH",
 *         containerName: "applicationContainerName",
 *         properties: {
 *             AppPorts: "8080",
 *             EgressIgnoredIPs: "169.254.170.2,169.254.169.254",
 *             IgnoredUID: "1337",
 *             ProxyEgressPort: "15001",
 *             ProxyIngressPort: "15000",
 *         },
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Example Using `dockerVolumeConfiguration`
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * const service = new aws.ecs.TaskDefinition("service", {
 *     family: "service",
 *     containerDefinitions: std.file({
 *         input: "task-definitions/service.json",
 *     }).then(invoke => invoke.result),
 *     volumes: [{
 *         name: "service-storage",
 *         dockerVolumeConfiguration: {
 *             scope: "shared",
 *             autoprovision: true,
 *             driver: "local",
 *             driverOpts: {
 *                 type: "nfs",
 *                 device: `${fs.dnsName}:/`,
 *                 o: `addr=${fs.dnsName},rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2,noresvport`,
 *             },
 *         },
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Example Using `efsVolumeConfiguration`
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * const service = new aws.ecs.TaskDefinition("service", {
 *     family: "service",
 *     containerDefinitions: std.file({
 *         input: "task-definitions/service.json",
 *     }).then(invoke => invoke.result),
 *     volumes: [{
 *         name: "service-storage",
 *         efsVolumeConfiguration: {
 *             fileSystemId: fs.id,
 *             rootDirectory: "/opt/data",
 *             transitEncryption: "ENABLED",
 *             transitEncryptionPort: 2999,
 *             authorizationConfig: {
 *                 accessPointId: test.id,
 *                 iam: "ENABLED",
 *             },
 *         },
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Example Using `fsxWindowsFileServerVolumeConfiguration`
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * const test = new aws.secretsmanager.SecretVersion("test", {
 *     secretId: testAwsSecretsmanagerSecret.id,
 *     secretString: JSON.stringify({
 *         username: "admin",
 *         password: testAwsDirectoryServiceDirectory.password,
 *     }),
 * });
 * const service = new aws.ecs.TaskDefinition("service", {
 *     family: "service",
 *     containerDefinitions: std.file({
 *         input: "task-definitions/service.json",
 *     }).then(invoke => invoke.result),
 *     volumes: [{
 *         name: "service-storage",
 *         fsxWindowsFileServerVolumeConfiguration: {
 *             fileSystemId: testAwsFsxWindowsFileSystem.id,
 *             rootDirectory: "\\data",
 *             authorizationConfig: {
 *                 credentialsParameter: test.arn,
 *                 domain: testAwsDirectoryServiceDirectory.name,
 *             },
 *         },
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Example Using `containerDefinitions` and `inferenceAccelerator`
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.ecs.TaskDefinition("test", {
 *     family: "test",
 *     containerDefinitions: `[
 *   {
 *     "cpu": 10,
 *     "command": ["sleep", "10"],
 *     "entryPoint": ["/"],
 *     "environment": [
 *       {"name": "VARNAME", "value": "VARVAL"}
 *     ],
 *     "essential": true,
 *     "image": "jenkins",
 *     "memory": 128,
 *     "name": "jenkins",
 *     "portMappings": [
 *       {
 *         "containerPort": 80,
 *         "hostPort": 8080
 *       }
 *     ],
 *         "resourceRequirements":[
 *             {
 *                 "type":"InferenceAccelerator",
 *                 "value":"device_1"
 *             }
 *         ]
 *   }
 * ]
 * `,
 *     inferenceAccelerators: [{
 *         deviceName: "device_1",
 *         deviceType: "eia1.medium",
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Example Using `runtimePlatform` and `fargate`
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.ecs.TaskDefinition("test", {
 *     family: "test",
 *     requiresCompatibilities: ["FARGATE"],
 *     networkMode: "awsvpc",
 *     cpu: "1024",
 *     memory: "2048",
 *     containerDefinitions: `[
 *   {
 *     "name": "iis",
 *     "image": "mcr.microsoft.com/windows/servercore/iis",
 *     "cpu": 1024,
 *     "memory": 2048,
 *     "essential": true
 *   }
 * ]
 * `,
 *     runtimePlatform: {
 *         operatingSystemFamily: "WINDOWS_SERVER_2019_CORE",
 *         cpuArchitecture: "X86_64",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import ECS Task Definitions using their ARNs. For example:
 *
 * ```sh
 * $ pulumi import aws:ecs/taskDefinition:TaskDefinition example arn:aws:ecs:us-east-1:012345678910:task-definition/mytaskfamily:123
 * ```
 */
export class TaskDefinition extends pulumi.CustomResource {
    /**
     * Get an existing TaskDefinition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TaskDefinitionState, opts?: pulumi.CustomResourceOptions): TaskDefinition {
        return new TaskDefinition(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ecs/taskDefinition:TaskDefinition';

    /**
     * Returns true if the given object is an instance of TaskDefinition.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TaskDefinition {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TaskDefinition.__pulumiType;
    }

    /**
     * Full ARN of the Task Definition (including both `family` and `revision`).
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * ARN of the Task Definition with the trailing `revision` removed. This may be useful for situations where the latest task definition is always desired. If a revision isn't specified, the latest ACTIVE revision is used. See the [AWS documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_StartTask.html#ECS-StartTask-request-taskDefinition) for details.
     */
    public /*out*/ readonly arnWithoutRevision!: pulumi.Output<string>;
    /**
     * A list of valid [container definitions](http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html) provided as a single valid JSON document. Please note that you should only provide values that are part of the container definition document. For a detailed description of what parameters are available, see the [Task Definition Parameters](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html) section from the official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
     */
    public readonly containerDefinitions!: pulumi.Output<string>;
    /**
     * Number of cpu units used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
     */
    public readonly cpu!: pulumi.Output<string | undefined>;
    /**
     * The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of ephemeral storage available, beyond the default amount, for tasks hosted on AWS Fargate. See Ephemeral Storage.
     */
    public readonly ephemeralStorage!: pulumi.Output<outputs.ecs.TaskDefinitionEphemeralStorage | undefined>;
    /**
     * ARN of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
     */
    public readonly executionRoleArn!: pulumi.Output<string | undefined>;
    /**
     * A unique name for your task definition.
     *
     * The following arguments are optional:
     */
    public readonly family!: pulumi.Output<string>;
    /**
     * Configuration block(s) with Inference Accelerators settings. Detailed below.
     */
    public readonly inferenceAccelerators!: pulumi.Output<outputs.ecs.TaskDefinitionInferenceAccelerator[] | undefined>;
    /**
     * IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
     */
    public readonly ipcMode!: pulumi.Output<string | undefined>;
    /**
     * Amount (in MiB) of memory used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
     */
    public readonly memory!: pulumi.Output<string | undefined>;
    /**
     * Docker networking mode to use for the containers in the task. Valid values are `none`, `bridge`, `awsvpc`, and `host`.
     */
    public readonly networkMode!: pulumi.Output<string>;
    /**
     * Process namespace to use for the containers in the task. The valid values are `host` and `task`.
     */
    public readonly pidMode!: pulumi.Output<string | undefined>;
    /**
     * Configuration block for rules that are taken into consideration during task placement. Maximum number of `placementConstraints` is `10`. Detailed below.
     */
    public readonly placementConstraints!: pulumi.Output<outputs.ecs.TaskDefinitionPlacementConstraint[] | undefined>;
    /**
     * Configuration block for the App Mesh proxy. Detailed below.
     */
    public readonly proxyConfiguration!: pulumi.Output<outputs.ecs.TaskDefinitionProxyConfiguration | undefined>;
    /**
     * Set of launch types required by the task. The valid values are `EC2` and `FARGATE`.
     */
    public readonly requiresCompatibilities!: pulumi.Output<string[] | undefined>;
    /**
     * Revision of the task in a particular family.
     */
    public /*out*/ readonly revision!: pulumi.Output<number>;
    /**
     * Configuration block for runtimePlatform that containers in your task may use.
     */
    public readonly runtimePlatform!: pulumi.Output<outputs.ecs.TaskDefinitionRuntimePlatform | undefined>;
    /**
     * Whether to retain the old revision when the resource is destroyed or replacement is necessary. Default is `false`.
     */
    public readonly skipDestroy!: pulumi.Output<boolean | undefined>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * ARN of IAM role that allows your Amazon ECS container task to make calls to other AWS services.
     */
    public readonly taskRoleArn!: pulumi.Output<string | undefined>;
    /**
     * Whether should track latest task definition or the one created with the resource. Default is `false`.
     */
    public readonly trackLatest!: pulumi.Output<boolean | undefined>;
    /**
     * Configuration block for volumes that containers in your task may use. Detailed below.
     */
    public readonly volumes!: pulumi.Output<outputs.ecs.TaskDefinitionVolume[] | undefined>;

    /**
     * Create a TaskDefinition resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TaskDefinitionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TaskDefinitionArgs | TaskDefinitionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TaskDefinitionState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["arnWithoutRevision"] = state ? state.arnWithoutRevision : undefined;
            resourceInputs["containerDefinitions"] = state ? state.containerDefinitions : undefined;
            resourceInputs["cpu"] = state ? state.cpu : undefined;
            resourceInputs["ephemeralStorage"] = state ? state.ephemeralStorage : undefined;
            resourceInputs["executionRoleArn"] = state ? state.executionRoleArn : undefined;
            resourceInputs["family"] = state ? state.family : undefined;
            resourceInputs["inferenceAccelerators"] = state ? state.inferenceAccelerators : undefined;
            resourceInputs["ipcMode"] = state ? state.ipcMode : undefined;
            resourceInputs["memory"] = state ? state.memory : undefined;
            resourceInputs["networkMode"] = state ? state.networkMode : undefined;
            resourceInputs["pidMode"] = state ? state.pidMode : undefined;
            resourceInputs["placementConstraints"] = state ? state.placementConstraints : undefined;
            resourceInputs["proxyConfiguration"] = state ? state.proxyConfiguration : undefined;
            resourceInputs["requiresCompatibilities"] = state ? state.requiresCompatibilities : undefined;
            resourceInputs["revision"] = state ? state.revision : undefined;
            resourceInputs["runtimePlatform"] = state ? state.runtimePlatform : undefined;
            resourceInputs["skipDestroy"] = state ? state.skipDestroy : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["taskRoleArn"] = state ? state.taskRoleArn : undefined;
            resourceInputs["trackLatest"] = state ? state.trackLatest : undefined;
            resourceInputs["volumes"] = state ? state.volumes : undefined;
        } else {
            const args = argsOrState as TaskDefinitionArgs | undefined;
            if ((!args || args.containerDefinitions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'containerDefinitions'");
            }
            if ((!args || args.family === undefined) && !opts.urn) {
                throw new Error("Missing required property 'family'");
            }
            resourceInputs["containerDefinitions"] = args ? args.containerDefinitions : undefined;
            resourceInputs["cpu"] = args ? args.cpu : undefined;
            resourceInputs["ephemeralStorage"] = args ? args.ephemeralStorage : undefined;
            resourceInputs["executionRoleArn"] = args ? args.executionRoleArn : undefined;
            resourceInputs["family"] = args ? args.family : undefined;
            resourceInputs["inferenceAccelerators"] = args ? args.inferenceAccelerators : undefined;
            resourceInputs["ipcMode"] = args ? args.ipcMode : undefined;
            resourceInputs["memory"] = args ? args.memory : undefined;
            resourceInputs["networkMode"] = args ? args.networkMode : undefined;
            resourceInputs["pidMode"] = args ? args.pidMode : undefined;
            resourceInputs["placementConstraints"] = args ? args.placementConstraints : undefined;
            resourceInputs["proxyConfiguration"] = args ? args.proxyConfiguration : undefined;
            resourceInputs["requiresCompatibilities"] = args ? args.requiresCompatibilities : undefined;
            resourceInputs["runtimePlatform"] = args ? args.runtimePlatform : undefined;
            resourceInputs["skipDestroy"] = args ? args.skipDestroy : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["taskRoleArn"] = args ? args.taskRoleArn : undefined;
            resourceInputs["trackLatest"] = args ? args.trackLatest : undefined;
            resourceInputs["volumes"] = args ? args.volumes : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["arnWithoutRevision"] = undefined /*out*/;
            resourceInputs["revision"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TaskDefinition.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TaskDefinition resources.
 */
export interface TaskDefinitionState {
    /**
     * Full ARN of the Task Definition (including both `family` and `revision`).
     */
    arn?: pulumi.Input<string>;
    /**
     * ARN of the Task Definition with the trailing `revision` removed. This may be useful for situations where the latest task definition is always desired. If a revision isn't specified, the latest ACTIVE revision is used. See the [AWS documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_StartTask.html#ECS-StartTask-request-taskDefinition) for details.
     */
    arnWithoutRevision?: pulumi.Input<string>;
    /**
     * A list of valid [container definitions](http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html) provided as a single valid JSON document. Please note that you should only provide values that are part of the container definition document. For a detailed description of what parameters are available, see the [Task Definition Parameters](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html) section from the official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
     */
    containerDefinitions?: pulumi.Input<string>;
    /**
     * Number of cpu units used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
     */
    cpu?: pulumi.Input<string>;
    /**
     * The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of ephemeral storage available, beyond the default amount, for tasks hosted on AWS Fargate. See Ephemeral Storage.
     */
    ephemeralStorage?: pulumi.Input<inputs.ecs.TaskDefinitionEphemeralStorage>;
    /**
     * ARN of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
     */
    executionRoleArn?: pulumi.Input<string>;
    /**
     * A unique name for your task definition.
     *
     * The following arguments are optional:
     */
    family?: pulumi.Input<string>;
    /**
     * Configuration block(s) with Inference Accelerators settings. Detailed below.
     */
    inferenceAccelerators?: pulumi.Input<pulumi.Input<inputs.ecs.TaskDefinitionInferenceAccelerator>[]>;
    /**
     * IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
     */
    ipcMode?: pulumi.Input<string>;
    /**
     * Amount (in MiB) of memory used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
     */
    memory?: pulumi.Input<string>;
    /**
     * Docker networking mode to use for the containers in the task. Valid values are `none`, `bridge`, `awsvpc`, and `host`.
     */
    networkMode?: pulumi.Input<string>;
    /**
     * Process namespace to use for the containers in the task. The valid values are `host` and `task`.
     */
    pidMode?: pulumi.Input<string>;
    /**
     * Configuration block for rules that are taken into consideration during task placement. Maximum number of `placementConstraints` is `10`. Detailed below.
     */
    placementConstraints?: pulumi.Input<pulumi.Input<inputs.ecs.TaskDefinitionPlacementConstraint>[]>;
    /**
     * Configuration block for the App Mesh proxy. Detailed below.
     */
    proxyConfiguration?: pulumi.Input<inputs.ecs.TaskDefinitionProxyConfiguration>;
    /**
     * Set of launch types required by the task. The valid values are `EC2` and `FARGATE`.
     */
    requiresCompatibilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Revision of the task in a particular family.
     */
    revision?: pulumi.Input<number>;
    /**
     * Configuration block for runtimePlatform that containers in your task may use.
     */
    runtimePlatform?: pulumi.Input<inputs.ecs.TaskDefinitionRuntimePlatform>;
    /**
     * Whether to retain the old revision when the resource is destroyed or replacement is necessary. Default is `false`.
     */
    skipDestroy?: pulumi.Input<boolean>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * ARN of IAM role that allows your Amazon ECS container task to make calls to other AWS services.
     */
    taskRoleArn?: pulumi.Input<string>;
    /**
     * Whether should track latest task definition or the one created with the resource. Default is `false`.
     */
    trackLatest?: pulumi.Input<boolean>;
    /**
     * Configuration block for volumes that containers in your task may use. Detailed below.
     */
    volumes?: pulumi.Input<pulumi.Input<inputs.ecs.TaskDefinitionVolume>[]>;
}

/**
 * The set of arguments for constructing a TaskDefinition resource.
 */
export interface TaskDefinitionArgs {
    /**
     * A list of valid [container definitions](http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html) provided as a single valid JSON document. Please note that you should only provide values that are part of the container definition document. For a detailed description of what parameters are available, see the [Task Definition Parameters](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html) section from the official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
     */
    containerDefinitions: pulumi.Input<string>;
    /**
     * Number of cpu units used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
     */
    cpu?: pulumi.Input<string>;
    /**
     * The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of ephemeral storage available, beyond the default amount, for tasks hosted on AWS Fargate. See Ephemeral Storage.
     */
    ephemeralStorage?: pulumi.Input<inputs.ecs.TaskDefinitionEphemeralStorage>;
    /**
     * ARN of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
     */
    executionRoleArn?: pulumi.Input<string>;
    /**
     * A unique name for your task definition.
     *
     * The following arguments are optional:
     */
    family: pulumi.Input<string>;
    /**
     * Configuration block(s) with Inference Accelerators settings. Detailed below.
     */
    inferenceAccelerators?: pulumi.Input<pulumi.Input<inputs.ecs.TaskDefinitionInferenceAccelerator>[]>;
    /**
     * IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
     */
    ipcMode?: pulumi.Input<string>;
    /**
     * Amount (in MiB) of memory used by the task. If the `requiresCompatibilities` is `FARGATE` this field is required.
     */
    memory?: pulumi.Input<string>;
    /**
     * Docker networking mode to use for the containers in the task. Valid values are `none`, `bridge`, `awsvpc`, and `host`.
     */
    networkMode?: pulumi.Input<string>;
    /**
     * Process namespace to use for the containers in the task. The valid values are `host` and `task`.
     */
    pidMode?: pulumi.Input<string>;
    /**
     * Configuration block for rules that are taken into consideration during task placement. Maximum number of `placementConstraints` is `10`. Detailed below.
     */
    placementConstraints?: pulumi.Input<pulumi.Input<inputs.ecs.TaskDefinitionPlacementConstraint>[]>;
    /**
     * Configuration block for the App Mesh proxy. Detailed below.
     */
    proxyConfiguration?: pulumi.Input<inputs.ecs.TaskDefinitionProxyConfiguration>;
    /**
     * Set of launch types required by the task. The valid values are `EC2` and `FARGATE`.
     */
    requiresCompatibilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configuration block for runtimePlatform that containers in your task may use.
     */
    runtimePlatform?: pulumi.Input<inputs.ecs.TaskDefinitionRuntimePlatform>;
    /**
     * Whether to retain the old revision when the resource is destroyed or replacement is necessary. Default is `false`.
     */
    skipDestroy?: pulumi.Input<boolean>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * ARN of IAM role that allows your Amazon ECS container task to make calls to other AWS services.
     */
    taskRoleArn?: pulumi.Input<string>;
    /**
     * Whether should track latest task definition or the one created with the resource. Default is `false`.
     */
    trackLatest?: pulumi.Input<boolean>;
    /**
     * Configuration block for volumes that containers in your task may use. Detailed below.
     */
    volumes?: pulumi.Input<pulumi.Input<inputs.ecs.TaskDefinitionVolume>[]>;
}
