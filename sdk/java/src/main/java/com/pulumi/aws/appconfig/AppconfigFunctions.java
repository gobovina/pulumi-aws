// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appconfig;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appconfig.inputs.GetConfigurationProfileArgs;
import com.pulumi.aws.appconfig.inputs.GetConfigurationProfilePlainArgs;
import com.pulumi.aws.appconfig.inputs.GetConfigurationProfilesArgs;
import com.pulumi.aws.appconfig.inputs.GetConfigurationProfilesPlainArgs;
import com.pulumi.aws.appconfig.inputs.GetEnvironmentArgs;
import com.pulumi.aws.appconfig.inputs.GetEnvironmentPlainArgs;
import com.pulumi.aws.appconfig.inputs.GetEnvironmentsArgs;
import com.pulumi.aws.appconfig.inputs.GetEnvironmentsPlainArgs;
import com.pulumi.aws.appconfig.outputs.GetConfigurationProfileResult;
import com.pulumi.aws.appconfig.outputs.GetConfigurationProfilesResult;
import com.pulumi.aws.appconfig.outputs.GetEnvironmentResult;
import com.pulumi.aws.appconfig.outputs.GetEnvironmentsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AppconfigFunctions {
    /**
     * Provides access to an AppConfig Configuration Profile.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.appconfig.AppconfigFunctions;
     * import com.pulumi.aws.appconfig.inputs.GetConfigurationProfileArgs;
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
     *         final var example = AppconfigFunctions.getConfigurationProfile(GetConfigurationProfileArgs.builder()
     *             .applicationId(&#34;b5d5gpj&#34;)
     *             .configurationProfileId(&#34;qrbb1c1&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetConfigurationProfileResult> getConfigurationProfile(GetConfigurationProfileArgs args) {
        return getConfigurationProfile(args, InvokeOptions.Empty);
    }
    /**
     * Provides access to an AppConfig Configuration Profile.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.appconfig.AppconfigFunctions;
     * import com.pulumi.aws.appconfig.inputs.GetConfigurationProfileArgs;
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
     *         final var example = AppconfigFunctions.getConfigurationProfile(GetConfigurationProfileArgs.builder()
     *             .applicationId(&#34;b5d5gpj&#34;)
     *             .configurationProfileId(&#34;qrbb1c1&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetConfigurationProfileResult> getConfigurationProfilePlain(GetConfigurationProfilePlainArgs args) {
        return getConfigurationProfilePlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides access to an AppConfig Configuration Profile.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.appconfig.AppconfigFunctions;
     * import com.pulumi.aws.appconfig.inputs.GetConfigurationProfileArgs;
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
     *         final var example = AppconfigFunctions.getConfigurationProfile(GetConfigurationProfileArgs.builder()
     *             .applicationId(&#34;b5d5gpj&#34;)
     *             .configurationProfileId(&#34;qrbb1c1&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetConfigurationProfileResult> getConfigurationProfile(GetConfigurationProfileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:appconfig/getConfigurationProfile:getConfigurationProfile", TypeShape.of(GetConfigurationProfileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides access to an AppConfig Configuration Profile.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.appconfig.AppconfigFunctions;
     * import com.pulumi.aws.appconfig.inputs.GetConfigurationProfileArgs;
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
     *         final var example = AppconfigFunctions.getConfigurationProfile(GetConfigurationProfileArgs.builder()
     *             .applicationId(&#34;b5d5gpj&#34;)
     *             .configurationProfileId(&#34;qrbb1c1&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetConfigurationProfileResult> getConfigurationProfilePlain(GetConfigurationProfilePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:appconfig/getConfigurationProfile:getConfigurationProfile", TypeShape.of(GetConfigurationProfileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides access to all Configuration Properties for an AppConfig Application. This will allow you to pass Configuration
     * Profile IDs to another resource.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetConfigurationProfilesResult> getConfigurationProfiles(GetConfigurationProfilesArgs args) {
        return getConfigurationProfiles(args, InvokeOptions.Empty);
    }
    /**
     * Provides access to all Configuration Properties for an AppConfig Application. This will allow you to pass Configuration
     * Profile IDs to another resource.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetConfigurationProfilesResult> getConfigurationProfilesPlain(GetConfigurationProfilesPlainArgs args) {
        return getConfigurationProfilesPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides access to all Configuration Properties for an AppConfig Application. This will allow you to pass Configuration
     * Profile IDs to another resource.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetConfigurationProfilesResult> getConfigurationProfiles(GetConfigurationProfilesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:appconfig/getConfigurationProfiles:getConfigurationProfiles", TypeShape.of(GetConfigurationProfilesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides access to all Configuration Properties for an AppConfig Application. This will allow you to pass Configuration
     * Profile IDs to another resource.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetConfigurationProfilesResult> getConfigurationProfilesPlain(GetConfigurationProfilesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:appconfig/getConfigurationProfiles:getConfigurationProfiles", TypeShape.of(GetConfigurationProfilesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides access to an AppConfig Environment.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.appconfig.AppconfigFunctions;
     * import com.pulumi.aws.appconfig.inputs.GetEnvironmentArgs;
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
     *         final var example = AppconfigFunctions.getEnvironment(GetEnvironmentArgs.builder()
     *             .applicationId(&#34;b5d5gpj&#34;)
     *             .environmentId(&#34;qrbb1c1&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args) {
        return getEnvironment(args, InvokeOptions.Empty);
    }
    /**
     * Provides access to an AppConfig Environment.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.appconfig.AppconfigFunctions;
     * import com.pulumi.aws.appconfig.inputs.GetEnvironmentArgs;
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
     *         final var example = AppconfigFunctions.getEnvironment(GetEnvironmentArgs.builder()
     *             .applicationId(&#34;b5d5gpj&#34;)
     *             .environmentId(&#34;qrbb1c1&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironmentPlain(GetEnvironmentPlainArgs args) {
        return getEnvironmentPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides access to an AppConfig Environment.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.appconfig.AppconfigFunctions;
     * import com.pulumi.aws.appconfig.inputs.GetEnvironmentArgs;
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
     *         final var example = AppconfigFunctions.getEnvironment(GetEnvironmentArgs.builder()
     *             .applicationId(&#34;b5d5gpj&#34;)
     *             .environmentId(&#34;qrbb1c1&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:appconfig/getEnvironment:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides access to an AppConfig Environment.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.appconfig.AppconfigFunctions;
     * import com.pulumi.aws.appconfig.inputs.GetEnvironmentArgs;
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
     *         final var example = AppconfigFunctions.getEnvironment(GetEnvironmentArgs.builder()
     *             .applicationId(&#34;b5d5gpj&#34;)
     *             .environmentId(&#34;qrbb1c1&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironmentPlain(GetEnvironmentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:appconfig/getEnvironment:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides access to all Environments for an AppConfig Application. This will allow you to pass Environment IDs to another
     * resource.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.appconfig.AppconfigFunctions;
     * import com.pulumi.aws.appconfig.inputs.GetEnvironmentsArgs;
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
     *         final var example = AppconfigFunctions.getEnvironments(GetEnvironmentsArgs.builder()
     *             .applicationId(&#34;a1d3rpe&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEnvironmentsResult> getEnvironments(GetEnvironmentsArgs args) {
        return getEnvironments(args, InvokeOptions.Empty);
    }
    /**
     * Provides access to all Environments for an AppConfig Application. This will allow you to pass Environment IDs to another
     * resource.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.appconfig.AppconfigFunctions;
     * import com.pulumi.aws.appconfig.inputs.GetEnvironmentsArgs;
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
     *         final var example = AppconfigFunctions.getEnvironments(GetEnvironmentsArgs.builder()
     *             .applicationId(&#34;a1d3rpe&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEnvironmentsResult> getEnvironmentsPlain(GetEnvironmentsPlainArgs args) {
        return getEnvironmentsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides access to all Environments for an AppConfig Application. This will allow you to pass Environment IDs to another
     * resource.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.appconfig.AppconfigFunctions;
     * import com.pulumi.aws.appconfig.inputs.GetEnvironmentsArgs;
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
     *         final var example = AppconfigFunctions.getEnvironments(GetEnvironmentsArgs.builder()
     *             .applicationId(&#34;a1d3rpe&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEnvironmentsResult> getEnvironments(GetEnvironmentsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:appconfig/getEnvironments:getEnvironments", TypeShape.of(GetEnvironmentsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides access to all Environments for an AppConfig Application. This will allow you to pass Environment IDs to another
     * resource.
     * 
     * ## Example Usage
     * 
     * ### Basic Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.appconfig.AppconfigFunctions;
     * import com.pulumi.aws.appconfig.inputs.GetEnvironmentsArgs;
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
     *         final var example = AppconfigFunctions.getEnvironments(GetEnvironmentsArgs.builder()
     *             .applicationId(&#34;a1d3rpe&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEnvironmentsResult> getEnvironmentsPlain(GetEnvironmentsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:appconfig/getEnvironments:getEnvironments", TypeShape.of(GetEnvironmentsResult.class), args, Utilities.withVersion(options));
    }
}
