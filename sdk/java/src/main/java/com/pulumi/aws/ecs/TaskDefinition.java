// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ecs.TaskDefinitionArgs;
import com.pulumi.aws.ecs.inputs.TaskDefinitionState;
import com.pulumi.aws.ecs.outputs.TaskDefinitionEphemeralStorage;
import com.pulumi.aws.ecs.outputs.TaskDefinitionInferenceAccelerator;
import com.pulumi.aws.ecs.outputs.TaskDefinitionPlacementConstraint;
import com.pulumi.aws.ecs.outputs.TaskDefinitionProxyConfiguration;
import com.pulumi.aws.ecs.outputs.TaskDefinitionRuntimePlatform;
import com.pulumi.aws.ecs.outputs.TaskDefinitionVolume;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a revision of an ECS task definition to be used in `aws.ecs.Service`.
 * 
 * ## Example Usage
 * 
 * ### Basic Example
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecs.TaskDefinition;
 * import com.pulumi.aws.ecs.TaskDefinitionArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionPlacementConstraintArgs;
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
 *         var service = new TaskDefinition("service", TaskDefinitionArgs.builder()
 *             .family("service")
 *             .containerDefinitions(serializeJson(
 *                 jsonArray(
 *                     jsonObject(
 *                         jsonProperty("name", "first"),
 *                         jsonProperty("image", "service-first"),
 *                         jsonProperty("cpu", 10),
 *                         jsonProperty("memory", 512),
 *                         jsonProperty("essential", true),
 *                         jsonProperty("portMappings", jsonArray(jsonObject(
 *                             jsonProperty("containerPort", 80),
 *                             jsonProperty("hostPort", 80)
 *                         )))
 *                     ), 
 *                     jsonObject(
 *                         jsonProperty("name", "second"),
 *                         jsonProperty("image", "service-second"),
 *                         jsonProperty("cpu", 10),
 *                         jsonProperty("memory", 256),
 *                         jsonProperty("essential", true),
 *                         jsonProperty("portMappings", jsonArray(jsonObject(
 *                             jsonProperty("containerPort", 443),
 *                             jsonProperty("hostPort", 443)
 *                         )))
 *                     )
 *                 )))
 *             .volumes(TaskDefinitionVolumeArgs.builder()
 *                 .name("service-storage")
 *                 .hostPath("/ecs/service-storage")
 *                 .build())
 *             .placementConstraints(TaskDefinitionPlacementConstraintArgs.builder()
 *                 .type("memberOf")
 *                 .expression("attribute:ecs.availability-zone in [us-west-2a, us-west-2b]")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### With AppMesh Proxy
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecs.TaskDefinition;
 * import com.pulumi.aws.ecs.TaskDefinitionArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionProxyConfigurationArgs;
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
 *         var service = new TaskDefinition("service", TaskDefinitionArgs.builder()
 *             .family("service")
 *             .containerDefinitions(StdFunctions.file(FileArgs.builder()
 *                 .input("task-definitions/service.json")
 *                 .build()).result())
 *             .proxyConfiguration(TaskDefinitionProxyConfigurationArgs.builder()
 *                 .type("APPMESH")
 *                 .containerName("applicationContainerName")
 *                 .properties(Map.ofEntries(
 *                     Map.entry("AppPorts", "8080"),
 *                     Map.entry("EgressIgnoredIPs", "169.254.170.2,169.254.169.254"),
 *                     Map.entry("IgnoredUID", "1337"),
 *                     Map.entry("ProxyEgressPort", 15001),
 *                     Map.entry("ProxyIngressPort", 15000)
 *                 ))
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Using `docker_volume_configuration`
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecs.TaskDefinition;
 * import com.pulumi.aws.ecs.TaskDefinitionArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeDockerVolumeConfigurationArgs;
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
 *         var service = new TaskDefinition("service", TaskDefinitionArgs.builder()
 *             .family("service")
 *             .containerDefinitions(StdFunctions.file(FileArgs.builder()
 *                 .input("task-definitions/service.json")
 *                 .build()).result())
 *             .volumes(TaskDefinitionVolumeArgs.builder()
 *                 .name("service-storage")
 *                 .dockerVolumeConfiguration(TaskDefinitionVolumeDockerVolumeConfigurationArgs.builder()
 *                     .scope("shared")
 *                     .autoprovision(true)
 *                     .driver("local")
 *                     .driverOpts(Map.ofEntries(
 *                         Map.entry("type", "nfs"),
 *                         Map.entry("device", String.format("%s:/", fs.dnsName())),
 *                         Map.entry("o", String.format("addr=%s,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2,noresvport", fs.dnsName()))
 *                     ))
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Using `efs_volume_configuration`
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecs.TaskDefinition;
 * import com.pulumi.aws.ecs.TaskDefinitionArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs;
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
 *         var service = new TaskDefinition("service", TaskDefinitionArgs.builder()
 *             .family("service")
 *             .containerDefinitions(StdFunctions.file(FileArgs.builder()
 *                 .input("task-definitions/service.json")
 *                 .build()).result())
 *             .volumes(TaskDefinitionVolumeArgs.builder()
 *                 .name("service-storage")
 *                 .efsVolumeConfiguration(TaskDefinitionVolumeEfsVolumeConfigurationArgs.builder()
 *                     .fileSystemId(fs.id())
 *                     .rootDirectory("/opt/data")
 *                     .transitEncryption("ENABLED")
 *                     .transitEncryptionPort(2999)
 *                     .authorizationConfig(TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs.builder()
 *                         .accessPointId(test.id())
 *                         .iam("ENABLED")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Using `fsx_windows_file_server_volume_configuration`
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.secretsmanager.SecretVersion;
 * import com.pulumi.aws.secretsmanager.SecretVersionArgs;
 * import com.pulumi.aws.ecs.TaskDefinition;
 * import com.pulumi.aws.ecs.TaskDefinitionArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs;
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
 *         var test = new SecretVersion("test", SecretVersionArgs.builder()
 *             .secretId(testAwsSecretsmanagerSecret.id())
 *             .secretString(serializeJson(
 *                 jsonObject(
 *                     jsonProperty("username", "admin"),
 *                     jsonProperty("password", testAwsDirectoryServiceDirectory.password())
 *                 )))
 *             .build());
 * 
 *         var service = new TaskDefinition("service", TaskDefinitionArgs.builder()
 *             .family("service")
 *             .containerDefinitions(StdFunctions.file(FileArgs.builder()
 *                 .input("task-definitions/service.json")
 *                 .build()).result())
 *             .volumes(TaskDefinitionVolumeArgs.builder()
 *                 .name("service-storage")
 *                 .fsxWindowsFileServerVolumeConfiguration(TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationArgs.builder()
 *                     .fileSystemId(testAwsFsxWindowsFileSystem.id())
 *                     .rootDirectory("\\data")
 *                     .authorizationConfig(TaskDefinitionVolumeFsxWindowsFileServerVolumeConfigurationAuthorizationConfigArgs.builder()
 *                         .credentialsParameter(test.arn())
 *                         .domain(testAwsDirectoryServiceDirectory.name())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Using `container_definitions` and `inference_accelerator`
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecs.TaskDefinition;
 * import com.pulumi.aws.ecs.TaskDefinitionArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionInferenceAcceleratorArgs;
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
 *         var test = new TaskDefinition("test", TaskDefinitionArgs.builder()
 *             .family("test")
 *             .containerDefinitions("""
 * [
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
 *             """)
 *             .inferenceAccelerators(TaskDefinitionInferenceAcceleratorArgs.builder()
 *                 .deviceName("device_1")
 *                 .deviceType("eia1.medium")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example Using `runtime_platform` and `fargate`
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ecs.TaskDefinition;
 * import com.pulumi.aws.ecs.TaskDefinitionArgs;
 * import com.pulumi.aws.ecs.inputs.TaskDefinitionRuntimePlatformArgs;
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
 *         var test = new TaskDefinition("test", TaskDefinitionArgs.builder()
 *             .family("test")
 *             .requiresCompatibilities("FARGATE")
 *             .networkMode("awsvpc")
 *             .cpu(1024)
 *             .memory(2048)
 *             .containerDefinitions("""
 * [
 *   {
 *     "name": "iis",
 *     "image": "mcr.microsoft.com/windows/servercore/iis",
 *     "cpu": 1024,
 *     "memory": 2048,
 *     "essential": true
 *   }
 * ]
 *             """)
 *             .runtimePlatform(TaskDefinitionRuntimePlatformArgs.builder()
 *                 .operatingSystemFamily("WINDOWS_SERVER_2019_CORE")
 *                 .cpuArchitecture("X86_64")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import ECS Task Definitions using their ARNs. For example:
 * 
 * ```sh
 * $ pulumi import aws:ecs/taskDefinition:TaskDefinition example arn:aws:ecs:us-east-1:012345678910:task-definition/mytaskfamily:123
 * ```
 * 
 */
@ResourceType(type="aws:ecs/taskDefinition:TaskDefinition")
public class TaskDefinition extends com.pulumi.resources.CustomResource {
    /**
     * Full ARN of the Task Definition (including both `family` and `revision`).
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Full ARN of the Task Definition (including both `family` and `revision`).
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * ARN of the Task Definition with the trailing `revision` removed. This may be useful for situations where the latest task definition is always desired. If a revision isn&#39;t specified, the latest ACTIVE revision is used. See the [AWS documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_StartTask.html#ECS-StartTask-request-taskDefinition) for details.
     * 
     */
    @Export(name="arnWithoutRevision", refs={String.class}, tree="[0]")
    private Output<String> arnWithoutRevision;

    /**
     * @return ARN of the Task Definition with the trailing `revision` removed. This may be useful for situations where the latest task definition is always desired. If a revision isn&#39;t specified, the latest ACTIVE revision is used. See the [AWS documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_StartTask.html#ECS-StartTask-request-taskDefinition) for details.
     * 
     */
    public Output<String> arnWithoutRevision() {
        return this.arnWithoutRevision;
    }
    /**
     * A list of valid [container definitions](http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html) provided as a single valid JSON document. Please note that you should only provide values that are part of the container definition document. For a detailed description of what parameters are available, see the [Task Definition Parameters](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html) section from the official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
     * 
     */
    @Export(name="containerDefinitions", refs={String.class}, tree="[0]")
    private Output<String> containerDefinitions;

    /**
     * @return A list of valid [container definitions](http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html) provided as a single valid JSON document. Please note that you should only provide values that are part of the container definition document. For a detailed description of what parameters are available, see the [Task Definition Parameters](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html) section from the official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
     * 
     */
    public Output<String> containerDefinitions() {
        return this.containerDefinitions;
    }
    /**
     * Number of cpu units used by the task. If the `requires_compatibilities` is `FARGATE` this field is required.
     * 
     */
    @Export(name="cpu", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cpu;

    /**
     * @return Number of cpu units used by the task. If the `requires_compatibilities` is `FARGATE` this field is required.
     * 
     */
    public Output<Optional<String>> cpu() {
        return Codegen.optional(this.cpu);
    }
    /**
     * The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of ephemeral storage available, beyond the default amount, for tasks hosted on AWS Fargate. See Ephemeral Storage.
     * 
     */
    @Export(name="ephemeralStorage", refs={TaskDefinitionEphemeralStorage.class}, tree="[0]")
    private Output</* @Nullable */ TaskDefinitionEphemeralStorage> ephemeralStorage;

    /**
     * @return The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of ephemeral storage available, beyond the default amount, for tasks hosted on AWS Fargate. See Ephemeral Storage.
     * 
     */
    public Output<Optional<TaskDefinitionEphemeralStorage>> ephemeralStorage() {
        return Codegen.optional(this.ephemeralStorage);
    }
    /**
     * ARN of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
     * 
     */
    @Export(name="executionRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> executionRoleArn;

    /**
     * @return ARN of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
     * 
     */
    public Output<Optional<String>> executionRoleArn() {
        return Codegen.optional(this.executionRoleArn);
    }
    /**
     * A unique name for your task definition.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="family", refs={String.class}, tree="[0]")
    private Output<String> family;

    /**
     * @return A unique name for your task definition.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> family() {
        return this.family;
    }
    /**
     * Configuration block(s) with Inference Accelerators settings. Detailed below.
     * 
     */
    @Export(name="inferenceAccelerators", refs={List.class,TaskDefinitionInferenceAccelerator.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TaskDefinitionInferenceAccelerator>> inferenceAccelerators;

    /**
     * @return Configuration block(s) with Inference Accelerators settings. Detailed below.
     * 
     */
    public Output<Optional<List<TaskDefinitionInferenceAccelerator>>> inferenceAccelerators() {
        return Codegen.optional(this.inferenceAccelerators);
    }
    /**
     * IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
     * 
     */
    @Export(name="ipcMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipcMode;

    /**
     * @return IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
     * 
     */
    public Output<Optional<String>> ipcMode() {
        return Codegen.optional(this.ipcMode);
    }
    /**
     * Amount (in MiB) of memory used by the task. If the `requires_compatibilities` is `FARGATE` this field is required.
     * 
     */
    @Export(name="memory", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> memory;

    /**
     * @return Amount (in MiB) of memory used by the task. If the `requires_compatibilities` is `FARGATE` this field is required.
     * 
     */
    public Output<Optional<String>> memory() {
        return Codegen.optional(this.memory);
    }
    /**
     * Docker networking mode to use for the containers in the task. Valid values are `none`, `bridge`, `awsvpc`, and `host`.
     * 
     */
    @Export(name="networkMode", refs={String.class}, tree="[0]")
    private Output<String> networkMode;

    /**
     * @return Docker networking mode to use for the containers in the task. Valid values are `none`, `bridge`, `awsvpc`, and `host`.
     * 
     */
    public Output<String> networkMode() {
        return this.networkMode;
    }
    /**
     * Process namespace to use for the containers in the task. The valid values are `host` and `task`.
     * 
     */
    @Export(name="pidMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pidMode;

    /**
     * @return Process namespace to use for the containers in the task. The valid values are `host` and `task`.
     * 
     */
    public Output<Optional<String>> pidMode() {
        return Codegen.optional(this.pidMode);
    }
    /**
     * Configuration block for rules that are taken into consideration during task placement. Maximum number of `placement_constraints` is `10`. Detailed below.
     * 
     */
    @Export(name="placementConstraints", refs={List.class,TaskDefinitionPlacementConstraint.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TaskDefinitionPlacementConstraint>> placementConstraints;

    /**
     * @return Configuration block for rules that are taken into consideration during task placement. Maximum number of `placement_constraints` is `10`. Detailed below.
     * 
     */
    public Output<Optional<List<TaskDefinitionPlacementConstraint>>> placementConstraints() {
        return Codegen.optional(this.placementConstraints);
    }
    /**
     * Configuration block for the App Mesh proxy. Detailed below.
     * 
     */
    @Export(name="proxyConfiguration", refs={TaskDefinitionProxyConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ TaskDefinitionProxyConfiguration> proxyConfiguration;

    /**
     * @return Configuration block for the App Mesh proxy. Detailed below.
     * 
     */
    public Output<Optional<TaskDefinitionProxyConfiguration>> proxyConfiguration() {
        return Codegen.optional(this.proxyConfiguration);
    }
    /**
     * Set of launch types required by the task. The valid values are `EC2` and `FARGATE`.
     * 
     */
    @Export(name="requiresCompatibilities", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> requiresCompatibilities;

    /**
     * @return Set of launch types required by the task. The valid values are `EC2` and `FARGATE`.
     * 
     */
    public Output<Optional<List<String>>> requiresCompatibilities() {
        return Codegen.optional(this.requiresCompatibilities);
    }
    /**
     * Revision of the task in a particular family.
     * 
     */
    @Export(name="revision", refs={Integer.class}, tree="[0]")
    private Output<Integer> revision;

    /**
     * @return Revision of the task in a particular family.
     * 
     */
    public Output<Integer> revision() {
        return this.revision;
    }
    /**
     * Configuration block for runtime_platform that containers in your task may use.
     * 
     */
    @Export(name="runtimePlatform", refs={TaskDefinitionRuntimePlatform.class}, tree="[0]")
    private Output</* @Nullable */ TaskDefinitionRuntimePlatform> runtimePlatform;

    /**
     * @return Configuration block for runtime_platform that containers in your task may use.
     * 
     */
    public Output<Optional<TaskDefinitionRuntimePlatform>> runtimePlatform() {
        return Codegen.optional(this.runtimePlatform);
    }
    /**
     * Whether to retain the old revision when the resource is destroyed or replacement is necessary. Default is `false`.
     * 
     */
    @Export(name="skipDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipDestroy;

    /**
     * @return Whether to retain the old revision when the resource is destroyed or replacement is necessary. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> skipDestroy() {
        return Codegen.optional(this.skipDestroy);
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
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
     * ARN of IAM role that allows your Amazon ECS container task to make calls to other AWS services.
     * 
     */
    @Export(name="taskRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> taskRoleArn;

    /**
     * @return ARN of IAM role that allows your Amazon ECS container task to make calls to other AWS services.
     * 
     */
    public Output<Optional<String>> taskRoleArn() {
        return Codegen.optional(this.taskRoleArn);
    }
    /**
     * Whether should track latest task definition or the one created with the resource. Default is `false`.
     * 
     */
    @Export(name="trackLatest", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> trackLatest;

    /**
     * @return Whether should track latest task definition or the one created with the resource. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> trackLatest() {
        return Codegen.optional(this.trackLatest);
    }
    /**
     * Configuration block for volumes that containers in your task may use. Detailed below.
     * 
     */
    @Export(name="volumes", refs={List.class,TaskDefinitionVolume.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TaskDefinitionVolume>> volumes;

    /**
     * @return Configuration block for volumes that containers in your task may use. Detailed below.
     * 
     */
    public Output<Optional<List<TaskDefinitionVolume>>> volumes() {
        return Codegen.optional(this.volumes);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TaskDefinition(String name) {
        this(name, TaskDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TaskDefinition(String name, TaskDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TaskDefinition(String name, TaskDefinitionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/taskDefinition:TaskDefinition", name, args == null ? TaskDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TaskDefinition(String name, Output<String> id, @Nullable TaskDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/taskDefinition:TaskDefinition", name, state, makeResourceOptions(options, id));
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
    public static TaskDefinition get(String name, Output<String> id, @Nullable TaskDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TaskDefinition(name, id, state, options);
    }
}
