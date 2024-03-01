// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.auditmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.auditmanager.inputs.GetControlArgs;
import com.pulumi.aws.auditmanager.inputs.GetControlPlainArgs;
import com.pulumi.aws.auditmanager.inputs.GetFrameworkArgs;
import com.pulumi.aws.auditmanager.inputs.GetFrameworkPlainArgs;
import com.pulumi.aws.auditmanager.outputs.GetControlResult;
import com.pulumi.aws.auditmanager.outputs.GetFrameworkResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AuditmanagerFunctions {
    /**
     * Data source for managing an AWS Audit Manager Control.
     * 
     * ## Example Usage
     * ### Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.auditmanager.AuditmanagerFunctions;
     * import com.pulumi.aws.auditmanager.inputs.GetControlArgs;
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
     *         final var example = AuditmanagerFunctions.getControl(GetControlArgs.builder()
     *             .name(&#34;1. Risk Management&#34;)
     *             .type(&#34;Standard&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### With Framework Resource
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.auditmanager.AuditmanagerFunctions;
     * import com.pulumi.aws.auditmanager.inputs.GetControlArgs;
     * import com.pulumi.aws.auditmanager.Framework;
     * import com.pulumi.aws.auditmanager.FrameworkArgs;
     * import com.pulumi.aws.auditmanager.inputs.FrameworkControlSetArgs;
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
     *         final var example = AuditmanagerFunctions.getControl(GetControlArgs.builder()
     *             .name(&#34;1. Risk Management&#34;)
     *             .type(&#34;Standard&#34;)
     *             .build());
     * 
     *         final var example2 = AuditmanagerFunctions.getControl(GetControlArgs.builder()
     *             .name(&#34;2. Personnel&#34;)
     *             .type(&#34;Standard&#34;)
     *             .build());
     * 
     *         var exampleFramework = new Framework(&#34;exampleFramework&#34;, FrameworkArgs.builder()        
     *             .name(&#34;example&#34;)
     *             .controlSets(            
     *                 FrameworkControlSetArgs.builder()
     *                     .name(&#34;example&#34;)
     *                     .controls(FrameworkControlSetControlArgs.builder()
     *                         .id(example.applyValue(getControlResult -&gt; getControlResult.id()))
     *                         .build())
     *                     .build(),
     *                 FrameworkControlSetArgs.builder()
     *                     .name(&#34;example2&#34;)
     *                     .controls(FrameworkControlSetControlArgs.builder()
     *                         .id(example2.applyValue(getControlResult -&gt; getControlResult.id()))
     *                         .build())
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetControlResult> getControl(GetControlArgs args) {
        return getControl(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS Audit Manager Control.
     * 
     * ## Example Usage
     * ### Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.auditmanager.AuditmanagerFunctions;
     * import com.pulumi.aws.auditmanager.inputs.GetControlArgs;
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
     *         final var example = AuditmanagerFunctions.getControl(GetControlArgs.builder()
     *             .name(&#34;1. Risk Management&#34;)
     *             .type(&#34;Standard&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### With Framework Resource
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.auditmanager.AuditmanagerFunctions;
     * import com.pulumi.aws.auditmanager.inputs.GetControlArgs;
     * import com.pulumi.aws.auditmanager.Framework;
     * import com.pulumi.aws.auditmanager.FrameworkArgs;
     * import com.pulumi.aws.auditmanager.inputs.FrameworkControlSetArgs;
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
     *         final var example = AuditmanagerFunctions.getControl(GetControlArgs.builder()
     *             .name(&#34;1. Risk Management&#34;)
     *             .type(&#34;Standard&#34;)
     *             .build());
     * 
     *         final var example2 = AuditmanagerFunctions.getControl(GetControlArgs.builder()
     *             .name(&#34;2. Personnel&#34;)
     *             .type(&#34;Standard&#34;)
     *             .build());
     * 
     *         var exampleFramework = new Framework(&#34;exampleFramework&#34;, FrameworkArgs.builder()        
     *             .name(&#34;example&#34;)
     *             .controlSets(            
     *                 FrameworkControlSetArgs.builder()
     *                     .name(&#34;example&#34;)
     *                     .controls(FrameworkControlSetControlArgs.builder()
     *                         .id(example.applyValue(getControlResult -&gt; getControlResult.id()))
     *                         .build())
     *                     .build(),
     *                 FrameworkControlSetArgs.builder()
     *                     .name(&#34;example2&#34;)
     *                     .controls(FrameworkControlSetControlArgs.builder()
     *                         .id(example2.applyValue(getControlResult -&gt; getControlResult.id()))
     *                         .build())
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetControlResult> getControlPlain(GetControlPlainArgs args) {
        return getControlPlain(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS Audit Manager Control.
     * 
     * ## Example Usage
     * ### Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.auditmanager.AuditmanagerFunctions;
     * import com.pulumi.aws.auditmanager.inputs.GetControlArgs;
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
     *         final var example = AuditmanagerFunctions.getControl(GetControlArgs.builder()
     *             .name(&#34;1. Risk Management&#34;)
     *             .type(&#34;Standard&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### With Framework Resource
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.auditmanager.AuditmanagerFunctions;
     * import com.pulumi.aws.auditmanager.inputs.GetControlArgs;
     * import com.pulumi.aws.auditmanager.Framework;
     * import com.pulumi.aws.auditmanager.FrameworkArgs;
     * import com.pulumi.aws.auditmanager.inputs.FrameworkControlSetArgs;
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
     *         final var example = AuditmanagerFunctions.getControl(GetControlArgs.builder()
     *             .name(&#34;1. Risk Management&#34;)
     *             .type(&#34;Standard&#34;)
     *             .build());
     * 
     *         final var example2 = AuditmanagerFunctions.getControl(GetControlArgs.builder()
     *             .name(&#34;2. Personnel&#34;)
     *             .type(&#34;Standard&#34;)
     *             .build());
     * 
     *         var exampleFramework = new Framework(&#34;exampleFramework&#34;, FrameworkArgs.builder()        
     *             .name(&#34;example&#34;)
     *             .controlSets(            
     *                 FrameworkControlSetArgs.builder()
     *                     .name(&#34;example&#34;)
     *                     .controls(FrameworkControlSetControlArgs.builder()
     *                         .id(example.applyValue(getControlResult -&gt; getControlResult.id()))
     *                         .build())
     *                     .build(),
     *                 FrameworkControlSetArgs.builder()
     *                     .name(&#34;example2&#34;)
     *                     .controls(FrameworkControlSetControlArgs.builder()
     *                         .id(example2.applyValue(getControlResult -&gt; getControlResult.id()))
     *                         .build())
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetControlResult> getControl(GetControlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:auditmanager/getControl:getControl", TypeShape.of(GetControlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for managing an AWS Audit Manager Control.
     * 
     * ## Example Usage
     * ### Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.auditmanager.AuditmanagerFunctions;
     * import com.pulumi.aws.auditmanager.inputs.GetControlArgs;
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
     *         final var example = AuditmanagerFunctions.getControl(GetControlArgs.builder()
     *             .name(&#34;1. Risk Management&#34;)
     *             .type(&#34;Standard&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### With Framework Resource
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.auditmanager.AuditmanagerFunctions;
     * import com.pulumi.aws.auditmanager.inputs.GetControlArgs;
     * import com.pulumi.aws.auditmanager.Framework;
     * import com.pulumi.aws.auditmanager.FrameworkArgs;
     * import com.pulumi.aws.auditmanager.inputs.FrameworkControlSetArgs;
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
     *         final var example = AuditmanagerFunctions.getControl(GetControlArgs.builder()
     *             .name(&#34;1. Risk Management&#34;)
     *             .type(&#34;Standard&#34;)
     *             .build());
     * 
     *         final var example2 = AuditmanagerFunctions.getControl(GetControlArgs.builder()
     *             .name(&#34;2. Personnel&#34;)
     *             .type(&#34;Standard&#34;)
     *             .build());
     * 
     *         var exampleFramework = new Framework(&#34;exampleFramework&#34;, FrameworkArgs.builder()        
     *             .name(&#34;example&#34;)
     *             .controlSets(            
     *                 FrameworkControlSetArgs.builder()
     *                     .name(&#34;example&#34;)
     *                     .controls(FrameworkControlSetControlArgs.builder()
     *                         .id(example.applyValue(getControlResult -&gt; getControlResult.id()))
     *                         .build())
     *                     .build(),
     *                 FrameworkControlSetArgs.builder()
     *                     .name(&#34;example2&#34;)
     *                     .controls(FrameworkControlSetControlArgs.builder()
     *                         .id(example2.applyValue(getControlResult -&gt; getControlResult.id()))
     *                         .build())
     *                     .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetControlResult> getControlPlain(GetControlPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:auditmanager/getControl:getControl", TypeShape.of(GetControlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for managing an AWS Audit Manager Framework.
     * 
     * ## Example Usage
     * ### Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.auditmanager.AuditmanagerFunctions;
     * import com.pulumi.aws.auditmanager.inputs.GetFrameworkArgs;
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
     *         final var example = AuditmanagerFunctions.getFramework(GetFrameworkArgs.builder()
     *             .name(&#34;Essential Eight&#34;)
     *             .frameworkType(&#34;Standard&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetFrameworkResult> getFramework(GetFrameworkArgs args) {
        return getFramework(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS Audit Manager Framework.
     * 
     * ## Example Usage
     * ### Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.auditmanager.AuditmanagerFunctions;
     * import com.pulumi.aws.auditmanager.inputs.GetFrameworkArgs;
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
     *         final var example = AuditmanagerFunctions.getFramework(GetFrameworkArgs.builder()
     *             .name(&#34;Essential Eight&#34;)
     *             .frameworkType(&#34;Standard&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFrameworkResult> getFrameworkPlain(GetFrameworkPlainArgs args) {
        return getFrameworkPlain(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS Audit Manager Framework.
     * 
     * ## Example Usage
     * ### Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.auditmanager.AuditmanagerFunctions;
     * import com.pulumi.aws.auditmanager.inputs.GetFrameworkArgs;
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
     *         final var example = AuditmanagerFunctions.getFramework(GetFrameworkArgs.builder()
     *             .name(&#34;Essential Eight&#34;)
     *             .frameworkType(&#34;Standard&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetFrameworkResult> getFramework(GetFrameworkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:auditmanager/getFramework:getFramework", TypeShape.of(GetFrameworkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for managing an AWS Audit Manager Framework.
     * 
     * ## Example Usage
     * ### Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.auditmanager.AuditmanagerFunctions;
     * import com.pulumi.aws.auditmanager.inputs.GetFrameworkArgs;
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
     *         final var example = AuditmanagerFunctions.getFramework(GetFrameworkArgs.builder()
     *             .name(&#34;Essential Eight&#34;)
     *             .frameworkType(&#34;Standard&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFrameworkResult> getFrameworkPlain(GetFrameworkPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:auditmanager/getFramework:getFramework", TypeShape.of(GetFrameworkResult.class), args, Utilities.withVersion(options));
    }
}
