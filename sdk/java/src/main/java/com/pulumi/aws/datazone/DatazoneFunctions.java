// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datazone;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.datazone.inputs.GetEnvironmentBlueprintArgs;
import com.pulumi.aws.datazone.inputs.GetEnvironmentBlueprintPlainArgs;
import com.pulumi.aws.datazone.outputs.GetEnvironmentBlueprintResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DatazoneFunctions {
    /**
     * Data source for managing an AWS DataZone Environment Blueprint.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.datazone.Domain;
     * import com.pulumi.aws.datazone.DomainArgs;
     * import com.pulumi.aws.datazone.DatazoneFunctions;
     * import com.pulumi.aws.datazone.inputs.GetEnvironmentBlueprintArgs;
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
     *         var exampleDomain = new Domain("exampleDomain", DomainArgs.builder()
     *             .name("example_domain")
     *             .domainExecutionRole(domainExecutionRole.arn())
     *             .build());
     * 
     *         final var example = DatazoneFunctions.getEnvironmentBlueprint(GetEnvironmentBlueprintArgs.builder()
     *             .domainId(exampleDomain.id())
     *             .name("DefaultDataLake")
     *             .managed(true)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEnvironmentBlueprintResult> getEnvironmentBlueprint(GetEnvironmentBlueprintArgs args) {
        return getEnvironmentBlueprint(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS DataZone Environment Blueprint.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.datazone.Domain;
     * import com.pulumi.aws.datazone.DomainArgs;
     * import com.pulumi.aws.datazone.DatazoneFunctions;
     * import com.pulumi.aws.datazone.inputs.GetEnvironmentBlueprintArgs;
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
     *         var exampleDomain = new Domain("exampleDomain", DomainArgs.builder()
     *             .name("example_domain")
     *             .domainExecutionRole(domainExecutionRole.arn())
     *             .build());
     * 
     *         final var example = DatazoneFunctions.getEnvironmentBlueprint(GetEnvironmentBlueprintArgs.builder()
     *             .domainId(exampleDomain.id())
     *             .name("DefaultDataLake")
     *             .managed(true)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEnvironmentBlueprintResult> getEnvironmentBlueprintPlain(GetEnvironmentBlueprintPlainArgs args) {
        return getEnvironmentBlueprintPlain(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS DataZone Environment Blueprint.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.datazone.Domain;
     * import com.pulumi.aws.datazone.DomainArgs;
     * import com.pulumi.aws.datazone.DatazoneFunctions;
     * import com.pulumi.aws.datazone.inputs.GetEnvironmentBlueprintArgs;
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
     *         var exampleDomain = new Domain("exampleDomain", DomainArgs.builder()
     *             .name("example_domain")
     *             .domainExecutionRole(domainExecutionRole.arn())
     *             .build());
     * 
     *         final var example = DatazoneFunctions.getEnvironmentBlueprint(GetEnvironmentBlueprintArgs.builder()
     *             .domainId(exampleDomain.id())
     *             .name("DefaultDataLake")
     *             .managed(true)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEnvironmentBlueprintResult> getEnvironmentBlueprint(GetEnvironmentBlueprintArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:datazone/getEnvironmentBlueprint:getEnvironmentBlueprint", TypeShape.of(GetEnvironmentBlueprintResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for managing an AWS DataZone Environment Blueprint.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.datazone.Domain;
     * import com.pulumi.aws.datazone.DomainArgs;
     * import com.pulumi.aws.datazone.DatazoneFunctions;
     * import com.pulumi.aws.datazone.inputs.GetEnvironmentBlueprintArgs;
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
     *         var exampleDomain = new Domain("exampleDomain", DomainArgs.builder()
     *             .name("example_domain")
     *             .domainExecutionRole(domainExecutionRole.arn())
     *             .build());
     * 
     *         final var example = DatazoneFunctions.getEnvironmentBlueprint(GetEnvironmentBlueprintArgs.builder()
     *             .domainId(exampleDomain.id())
     *             .name("DefaultDataLake")
     *             .managed(true)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEnvironmentBlueprintResult> getEnvironmentBlueprintPlain(GetEnvironmentBlueprintPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:datazone/getEnvironmentBlueprint:getEnvironmentBlueprint", TypeShape.of(GetEnvironmentBlueprintResult.class), args, Utilities.withVersion(options));
    }
}
