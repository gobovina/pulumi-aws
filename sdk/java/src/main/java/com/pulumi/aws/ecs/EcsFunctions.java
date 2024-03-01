// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ecs.inputs.GetClusterArgs;
import com.pulumi.aws.ecs.inputs.GetClusterPlainArgs;
import com.pulumi.aws.ecs.inputs.GetContainerDefinitionArgs;
import com.pulumi.aws.ecs.inputs.GetContainerDefinitionPlainArgs;
import com.pulumi.aws.ecs.inputs.GetServiceArgs;
import com.pulumi.aws.ecs.inputs.GetServicePlainArgs;
import com.pulumi.aws.ecs.inputs.GetTaskDefinitionArgs;
import com.pulumi.aws.ecs.inputs.GetTaskDefinitionPlainArgs;
import com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs;
import com.pulumi.aws.ecs.inputs.GetTaskExecutionPlainArgs;
import com.pulumi.aws.ecs.outputs.GetClusterResult;
import com.pulumi.aws.ecs.outputs.GetContainerDefinitionResult;
import com.pulumi.aws.ecs.outputs.GetServiceResult;
import com.pulumi.aws.ecs.outputs.GetTaskDefinitionResult;
import com.pulumi.aws.ecs.outputs.GetTaskExecutionResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class EcsFunctions {
    /**
     * The ECS Cluster data source allows access to details of a specific
     * cluster within an AWS ECS service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetClusterArgs;
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
     *         final var ecs-mongo = EcsFunctions.getCluster(GetClusterArgs.builder()
     *             .clusterName(&#34;ecs-mongo-production&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    /**
     * The ECS Cluster data source allows access to details of a specific
     * cluster within an AWS ECS service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetClusterArgs;
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
     *         final var ecs-mongo = EcsFunctions.getCluster(GetClusterArgs.builder()
     *             .clusterName(&#34;ecs-mongo-production&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetClusterResult> getClusterPlain(GetClusterPlainArgs args) {
        return getClusterPlain(args, InvokeOptions.Empty);
    }
    /**
     * The ECS Cluster data source allows access to details of a specific
     * cluster within an AWS ECS service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetClusterArgs;
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
     *         final var ecs-mongo = EcsFunctions.getCluster(GetClusterArgs.builder()
     *             .clusterName(&#34;ecs-mongo-production&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:ecs/getCluster:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The ECS Cluster data source allows access to details of a specific
     * cluster within an AWS ECS service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetClusterArgs;
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
     *         final var ecs-mongo = EcsFunctions.getCluster(GetClusterArgs.builder()
     *             .clusterName(&#34;ecs-mongo-production&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetClusterResult> getClusterPlain(GetClusterPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecs/getCluster:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The ECS container definition data source allows access to details of
     * a specific container within an AWS ECS service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetContainerDefinitionArgs;
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
     *         final var ecs-mongo = EcsFunctions.getContainerDefinition(GetContainerDefinitionArgs.builder()
     *             .taskDefinition(mongo.id())
     *             .containerName(&#34;mongodb&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetContainerDefinitionResult> getContainerDefinition(GetContainerDefinitionArgs args) {
        return getContainerDefinition(args, InvokeOptions.Empty);
    }
    /**
     * The ECS container definition data source allows access to details of
     * a specific container within an AWS ECS service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetContainerDefinitionArgs;
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
     *         final var ecs-mongo = EcsFunctions.getContainerDefinition(GetContainerDefinitionArgs.builder()
     *             .taskDefinition(mongo.id())
     *             .containerName(&#34;mongodb&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetContainerDefinitionResult> getContainerDefinitionPlain(GetContainerDefinitionPlainArgs args) {
        return getContainerDefinitionPlain(args, InvokeOptions.Empty);
    }
    /**
     * The ECS container definition data source allows access to details of
     * a specific container within an AWS ECS service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetContainerDefinitionArgs;
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
     *         final var ecs-mongo = EcsFunctions.getContainerDefinition(GetContainerDefinitionArgs.builder()
     *             .taskDefinition(mongo.id())
     *             .containerName(&#34;mongodb&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetContainerDefinitionResult> getContainerDefinition(GetContainerDefinitionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:ecs/getContainerDefinition:getContainerDefinition", TypeShape.of(GetContainerDefinitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The ECS container definition data source allows access to details of
     * a specific container within an AWS ECS service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetContainerDefinitionArgs;
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
     *         final var ecs-mongo = EcsFunctions.getContainerDefinition(GetContainerDefinitionArgs.builder()
     *             .taskDefinition(mongo.id())
     *             .containerName(&#34;mongodb&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetContainerDefinitionResult> getContainerDefinitionPlain(GetContainerDefinitionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecs/getContainerDefinition:getContainerDefinition", TypeShape.of(GetContainerDefinitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The ECS Service data source allows access to details of a specific
     * Service within a AWS ECS Cluster.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetServiceArgs;
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
     *         final var example = EcsFunctions.getService(GetServiceArgs.builder()
     *             .serviceName(&#34;example&#34;)
     *             .clusterArn(exampleAwsEcsCluster.arn())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    /**
     * The ECS Service data source allows access to details of a specific
     * Service within a AWS ECS Cluster.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetServiceArgs;
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
     *         final var example = EcsFunctions.getService(GetServiceArgs.builder()
     *             .serviceName(&#34;example&#34;)
     *             .clusterArn(exampleAwsEcsCluster.arn())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args) {
        return getServicePlain(args, InvokeOptions.Empty);
    }
    /**
     * The ECS Service data source allows access to details of a specific
     * Service within a AWS ECS Cluster.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetServiceArgs;
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
     *         final var example = EcsFunctions.getService(GetServiceArgs.builder()
     *             .serviceName(&#34;example&#34;)
     *             .clusterArn(exampleAwsEcsCluster.arn())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:ecs/getService:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The ECS Service data source allows access to details of a specific
     * Service within a AWS ECS Cluster.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetServiceArgs;
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
     *         final var example = EcsFunctions.getService(GetServiceArgs.builder()
     *             .serviceName(&#34;example&#34;)
     *             .clusterArn(exampleAwsEcsCluster.arn())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecs/getService:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The ECS task definition data source allows access to details of
     * a specific AWS ECS task definition.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.TaskDefinition;
     * import com.pulumi.aws.ecs.TaskDefinitionArgs;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetTaskDefinitionArgs;
     * import com.pulumi.aws.ecs.Cluster;
     * import com.pulumi.aws.ecs.ClusterArgs;
     * import com.pulumi.aws.ecs.Service;
     * import com.pulumi.aws.ecs.ServiceArgs;
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
     *         var mongoTaskDefinition = new TaskDefinition(&#34;mongoTaskDefinition&#34;, TaskDefinitionArgs.builder()        
     *             .family(&#34;mongodb&#34;)
     *             .containerDefinitions(&#34;&#34;&#34;
     * [
     *   {
     *     &#34;cpu&#34;: 128,
     *     &#34;environment&#34;: [{
     *       &#34;name&#34;: &#34;SECRET&#34;,
     *       &#34;value&#34;: &#34;KEY&#34;
     *     }],
     *     &#34;essential&#34;: true,
     *     &#34;image&#34;: &#34;mongo:latest&#34;,
     *     &#34;memory&#34;: 128,
     *     &#34;memoryReservation&#34;: 64,
     *     &#34;name&#34;: &#34;mongodb&#34;
     *   }
     * ]
     *             &#34;&#34;&#34;)
     *             .build());
     * 
     *         final var mongo = EcsFunctions.getTaskDefinition(GetTaskDefinitionArgs.builder()
     *             .taskDefinition(mongoTaskDefinition.family())
     *             .build());
     * 
     *         var foo = new Cluster(&#34;foo&#34;, ClusterArgs.builder()        
     *             .name(&#34;foo&#34;)
     *             .build());
     * 
     *         var mongoService = new Service(&#34;mongoService&#34;, ServiceArgs.builder()        
     *             .name(&#34;mongo&#34;)
     *             .cluster(foo.id())
     *             .desiredCount(2)
     *             .taskDefinition(mongo.applyValue(getTaskDefinitionResult -&gt; getTaskDefinitionResult).applyValue(mongo -&gt; mongo.applyValue(getTaskDefinitionResult -&gt; getTaskDefinitionResult.arn())))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetTaskDefinitionResult> getTaskDefinition(GetTaskDefinitionArgs args) {
        return getTaskDefinition(args, InvokeOptions.Empty);
    }
    /**
     * The ECS task definition data source allows access to details of
     * a specific AWS ECS task definition.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.TaskDefinition;
     * import com.pulumi.aws.ecs.TaskDefinitionArgs;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetTaskDefinitionArgs;
     * import com.pulumi.aws.ecs.Cluster;
     * import com.pulumi.aws.ecs.ClusterArgs;
     * import com.pulumi.aws.ecs.Service;
     * import com.pulumi.aws.ecs.ServiceArgs;
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
     *         var mongoTaskDefinition = new TaskDefinition(&#34;mongoTaskDefinition&#34;, TaskDefinitionArgs.builder()        
     *             .family(&#34;mongodb&#34;)
     *             .containerDefinitions(&#34;&#34;&#34;
     * [
     *   {
     *     &#34;cpu&#34;: 128,
     *     &#34;environment&#34;: [{
     *       &#34;name&#34;: &#34;SECRET&#34;,
     *       &#34;value&#34;: &#34;KEY&#34;
     *     }],
     *     &#34;essential&#34;: true,
     *     &#34;image&#34;: &#34;mongo:latest&#34;,
     *     &#34;memory&#34;: 128,
     *     &#34;memoryReservation&#34;: 64,
     *     &#34;name&#34;: &#34;mongodb&#34;
     *   }
     * ]
     *             &#34;&#34;&#34;)
     *             .build());
     * 
     *         final var mongo = EcsFunctions.getTaskDefinition(GetTaskDefinitionArgs.builder()
     *             .taskDefinition(mongoTaskDefinition.family())
     *             .build());
     * 
     *         var foo = new Cluster(&#34;foo&#34;, ClusterArgs.builder()        
     *             .name(&#34;foo&#34;)
     *             .build());
     * 
     *         var mongoService = new Service(&#34;mongoService&#34;, ServiceArgs.builder()        
     *             .name(&#34;mongo&#34;)
     *             .cluster(foo.id())
     *             .desiredCount(2)
     *             .taskDefinition(mongo.applyValue(getTaskDefinitionResult -&gt; getTaskDefinitionResult).applyValue(mongo -&gt; mongo.applyValue(getTaskDefinitionResult -&gt; getTaskDefinitionResult.arn())))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTaskDefinitionResult> getTaskDefinitionPlain(GetTaskDefinitionPlainArgs args) {
        return getTaskDefinitionPlain(args, InvokeOptions.Empty);
    }
    /**
     * The ECS task definition data source allows access to details of
     * a specific AWS ECS task definition.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.TaskDefinition;
     * import com.pulumi.aws.ecs.TaskDefinitionArgs;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetTaskDefinitionArgs;
     * import com.pulumi.aws.ecs.Cluster;
     * import com.pulumi.aws.ecs.ClusterArgs;
     * import com.pulumi.aws.ecs.Service;
     * import com.pulumi.aws.ecs.ServiceArgs;
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
     *         var mongoTaskDefinition = new TaskDefinition(&#34;mongoTaskDefinition&#34;, TaskDefinitionArgs.builder()        
     *             .family(&#34;mongodb&#34;)
     *             .containerDefinitions(&#34;&#34;&#34;
     * [
     *   {
     *     &#34;cpu&#34;: 128,
     *     &#34;environment&#34;: [{
     *       &#34;name&#34;: &#34;SECRET&#34;,
     *       &#34;value&#34;: &#34;KEY&#34;
     *     }],
     *     &#34;essential&#34;: true,
     *     &#34;image&#34;: &#34;mongo:latest&#34;,
     *     &#34;memory&#34;: 128,
     *     &#34;memoryReservation&#34;: 64,
     *     &#34;name&#34;: &#34;mongodb&#34;
     *   }
     * ]
     *             &#34;&#34;&#34;)
     *             .build());
     * 
     *         final var mongo = EcsFunctions.getTaskDefinition(GetTaskDefinitionArgs.builder()
     *             .taskDefinition(mongoTaskDefinition.family())
     *             .build());
     * 
     *         var foo = new Cluster(&#34;foo&#34;, ClusterArgs.builder()        
     *             .name(&#34;foo&#34;)
     *             .build());
     * 
     *         var mongoService = new Service(&#34;mongoService&#34;, ServiceArgs.builder()        
     *             .name(&#34;mongo&#34;)
     *             .cluster(foo.id())
     *             .desiredCount(2)
     *             .taskDefinition(mongo.applyValue(getTaskDefinitionResult -&gt; getTaskDefinitionResult).applyValue(mongo -&gt; mongo.applyValue(getTaskDefinitionResult -&gt; getTaskDefinitionResult.arn())))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetTaskDefinitionResult> getTaskDefinition(GetTaskDefinitionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:ecs/getTaskDefinition:getTaskDefinition", TypeShape.of(GetTaskDefinitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The ECS task definition data source allows access to details of
     * a specific AWS ECS task definition.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.TaskDefinition;
     * import com.pulumi.aws.ecs.TaskDefinitionArgs;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetTaskDefinitionArgs;
     * import com.pulumi.aws.ecs.Cluster;
     * import com.pulumi.aws.ecs.ClusterArgs;
     * import com.pulumi.aws.ecs.Service;
     * import com.pulumi.aws.ecs.ServiceArgs;
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
     *         var mongoTaskDefinition = new TaskDefinition(&#34;mongoTaskDefinition&#34;, TaskDefinitionArgs.builder()        
     *             .family(&#34;mongodb&#34;)
     *             .containerDefinitions(&#34;&#34;&#34;
     * [
     *   {
     *     &#34;cpu&#34;: 128,
     *     &#34;environment&#34;: [{
     *       &#34;name&#34;: &#34;SECRET&#34;,
     *       &#34;value&#34;: &#34;KEY&#34;
     *     }],
     *     &#34;essential&#34;: true,
     *     &#34;image&#34;: &#34;mongo:latest&#34;,
     *     &#34;memory&#34;: 128,
     *     &#34;memoryReservation&#34;: 64,
     *     &#34;name&#34;: &#34;mongodb&#34;
     *   }
     * ]
     *             &#34;&#34;&#34;)
     *             .build());
     * 
     *         final var mongo = EcsFunctions.getTaskDefinition(GetTaskDefinitionArgs.builder()
     *             .taskDefinition(mongoTaskDefinition.family())
     *             .build());
     * 
     *         var foo = new Cluster(&#34;foo&#34;, ClusterArgs.builder()        
     *             .name(&#34;foo&#34;)
     *             .build());
     * 
     *         var mongoService = new Service(&#34;mongoService&#34;, ServiceArgs.builder()        
     *             .name(&#34;mongo&#34;)
     *             .cluster(foo.id())
     *             .desiredCount(2)
     *             .taskDefinition(mongo.applyValue(getTaskDefinitionResult -&gt; getTaskDefinitionResult).applyValue(mongo -&gt; mongo.applyValue(getTaskDefinitionResult -&gt; getTaskDefinitionResult.arn())))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTaskDefinitionResult> getTaskDefinitionPlain(GetTaskDefinitionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecs/getTaskDefinition:getTaskDefinition", TypeShape.of(GetTaskDefinitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for managing an AWS ECS (Elastic Container) Task Execution. This data source calls the [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API, allowing execution of one-time tasks that don&#39;t fit a standard resource lifecycle. See the feature request issue for additional context.
     * 
     * &gt; **NOTE on preview operations:** This data source calls the `RunTask` API on every read operation, which means new task(s) may be created from a `pulumi preview` command if all attributes are known. Placing this functionality behind a data source is an intentional trade off to enable use cases requiring a one-time task execution without relying on provisioners. Caution should be taken to ensure the data source is only executed once, or that the resulting tasks can safely run in parallel.
     * 
     * ## Example Usage
     * ### Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs;
     * import com.pulumi.aws.ecs.inputs.GetTaskExecutionNetworkConfigurationArgs;
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
     *         final var example = EcsFunctions.getTaskExecution(GetTaskExecutionArgs.builder()
     *             .cluster(exampleAwsEcsCluster.id())
     *             .taskDefinition(exampleAwsEcsTaskDefinition.arn())
     *             .desiredCount(1)
     *             .launchType(&#34;FARGATE&#34;)
     *             .networkConfiguration(GetTaskExecutionNetworkConfigurationArgs.builder()
     *                 .subnets(exampleAwsSubnet.stream().map(element -&gt; element.id()).collect(toList()))
     *                 .securityGroups(exampleAwsSecurityGroup.id())
     *                 .assignPublicIp(false)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetTaskExecutionResult> getTaskExecution(GetTaskExecutionArgs args) {
        return getTaskExecution(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS ECS (Elastic Container) Task Execution. This data source calls the [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API, allowing execution of one-time tasks that don&#39;t fit a standard resource lifecycle. See the feature request issue for additional context.
     * 
     * &gt; **NOTE on preview operations:** This data source calls the `RunTask` API on every read operation, which means new task(s) may be created from a `pulumi preview` command if all attributes are known. Placing this functionality behind a data source is an intentional trade off to enable use cases requiring a one-time task execution without relying on provisioners. Caution should be taken to ensure the data source is only executed once, or that the resulting tasks can safely run in parallel.
     * 
     * ## Example Usage
     * ### Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs;
     * import com.pulumi.aws.ecs.inputs.GetTaskExecutionNetworkConfigurationArgs;
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
     *         final var example = EcsFunctions.getTaskExecution(GetTaskExecutionArgs.builder()
     *             .cluster(exampleAwsEcsCluster.id())
     *             .taskDefinition(exampleAwsEcsTaskDefinition.arn())
     *             .desiredCount(1)
     *             .launchType(&#34;FARGATE&#34;)
     *             .networkConfiguration(GetTaskExecutionNetworkConfigurationArgs.builder()
     *                 .subnets(exampleAwsSubnet.stream().map(element -&gt; element.id()).collect(toList()))
     *                 .securityGroups(exampleAwsSecurityGroup.id())
     *                 .assignPublicIp(false)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTaskExecutionResult> getTaskExecutionPlain(GetTaskExecutionPlainArgs args) {
        return getTaskExecutionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS ECS (Elastic Container) Task Execution. This data source calls the [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API, allowing execution of one-time tasks that don&#39;t fit a standard resource lifecycle. See the feature request issue for additional context.
     * 
     * &gt; **NOTE on preview operations:** This data source calls the `RunTask` API on every read operation, which means new task(s) may be created from a `pulumi preview` command if all attributes are known. Placing this functionality behind a data source is an intentional trade off to enable use cases requiring a one-time task execution without relying on provisioners. Caution should be taken to ensure the data source is only executed once, or that the resulting tasks can safely run in parallel.
     * 
     * ## Example Usage
     * ### Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs;
     * import com.pulumi.aws.ecs.inputs.GetTaskExecutionNetworkConfigurationArgs;
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
     *         final var example = EcsFunctions.getTaskExecution(GetTaskExecutionArgs.builder()
     *             .cluster(exampleAwsEcsCluster.id())
     *             .taskDefinition(exampleAwsEcsTaskDefinition.arn())
     *             .desiredCount(1)
     *             .launchType(&#34;FARGATE&#34;)
     *             .networkConfiguration(GetTaskExecutionNetworkConfigurationArgs.builder()
     *                 .subnets(exampleAwsSubnet.stream().map(element -&gt; element.id()).collect(toList()))
     *                 .securityGroups(exampleAwsSecurityGroup.id())
     *                 .assignPublicIp(false)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetTaskExecutionResult> getTaskExecution(GetTaskExecutionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:ecs/getTaskExecution:getTaskExecution", TypeShape.of(GetTaskExecutionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for managing an AWS ECS (Elastic Container) Task Execution. This data source calls the [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API, allowing execution of one-time tasks that don&#39;t fit a standard resource lifecycle. See the feature request issue for additional context.
     * 
     * &gt; **NOTE on preview operations:** This data source calls the `RunTask` API on every read operation, which means new task(s) may be created from a `pulumi preview` command if all attributes are known. Placing this functionality behind a data source is an intentional trade off to enable use cases requiring a one-time task execution without relying on provisioners. Caution should be taken to ensure the data source is only executed once, or that the resulting tasks can safely run in parallel.
     * 
     * ## Example Usage
     * ### Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ecs.EcsFunctions;
     * import com.pulumi.aws.ecs.inputs.GetTaskExecutionArgs;
     * import com.pulumi.aws.ecs.inputs.GetTaskExecutionNetworkConfigurationArgs;
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
     *         final var example = EcsFunctions.getTaskExecution(GetTaskExecutionArgs.builder()
     *             .cluster(exampleAwsEcsCluster.id())
     *             .taskDefinition(exampleAwsEcsTaskDefinition.arn())
     *             .desiredCount(1)
     *             .launchType(&#34;FARGATE&#34;)
     *             .networkConfiguration(GetTaskExecutionNetworkConfigurationArgs.builder()
     *                 .subnets(exampleAwsSubnet.stream().map(element -&gt; element.id()).collect(toList()))
     *                 .securityGroups(exampleAwsSecurityGroup.id())
     *                 .assignPublicIp(false)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTaskExecutionResult> getTaskExecutionPlain(GetTaskExecutionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecs/getTaskExecution:getTaskExecution", TypeShape.of(GetTaskExecutionResult.class), args, Utilities.withVersion(options));
    }
}
