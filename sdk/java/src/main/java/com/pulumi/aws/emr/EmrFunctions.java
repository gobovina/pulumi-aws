// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.emr.inputs.GetReleaseLabelsArgs;
import com.pulumi.aws.emr.inputs.GetReleaseLabelsPlainArgs;
import com.pulumi.aws.emr.inputs.GetSupportedInstanceTypesArgs;
import com.pulumi.aws.emr.inputs.GetSupportedInstanceTypesPlainArgs;
import com.pulumi.aws.emr.outputs.GetReleaseLabelsResult;
import com.pulumi.aws.emr.outputs.GetSupportedInstanceTypesResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class EmrFunctions {
    /**
     * Retrieve information about EMR Release Labels.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.emr.EmrFunctions;
     * import com.pulumi.aws.emr.inputs.GetReleaseLabelsArgs;
     * import com.pulumi.aws.emr.inputs.GetReleaseLabelsFiltersArgs;
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
     *         final var example = EmrFunctions.getReleaseLabels(GetReleaseLabelsArgs.builder()
     *             .filters(GetReleaseLabelsFiltersArgs.builder()
     *                 .application(&#34;spark@2.1.0&#34;)
     *                 .prefix(&#34;emr-5&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetReleaseLabelsResult> getReleaseLabels() {
        return getReleaseLabels(GetReleaseLabelsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about EMR Release Labels.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.emr.EmrFunctions;
     * import com.pulumi.aws.emr.inputs.GetReleaseLabelsArgs;
     * import com.pulumi.aws.emr.inputs.GetReleaseLabelsFiltersArgs;
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
     *         final var example = EmrFunctions.getReleaseLabels(GetReleaseLabelsArgs.builder()
     *             .filters(GetReleaseLabelsFiltersArgs.builder()
     *                 .application(&#34;spark@2.1.0&#34;)
     *                 .prefix(&#34;emr-5&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetReleaseLabelsResult> getReleaseLabelsPlain() {
        return getReleaseLabelsPlain(GetReleaseLabelsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about EMR Release Labels.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.emr.EmrFunctions;
     * import com.pulumi.aws.emr.inputs.GetReleaseLabelsArgs;
     * import com.pulumi.aws.emr.inputs.GetReleaseLabelsFiltersArgs;
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
     *         final var example = EmrFunctions.getReleaseLabels(GetReleaseLabelsArgs.builder()
     *             .filters(GetReleaseLabelsFiltersArgs.builder()
     *                 .application(&#34;spark@2.1.0&#34;)
     *                 .prefix(&#34;emr-5&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetReleaseLabelsResult> getReleaseLabels(GetReleaseLabelsArgs args) {
        return getReleaseLabels(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about EMR Release Labels.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.emr.EmrFunctions;
     * import com.pulumi.aws.emr.inputs.GetReleaseLabelsArgs;
     * import com.pulumi.aws.emr.inputs.GetReleaseLabelsFiltersArgs;
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
     *         final var example = EmrFunctions.getReleaseLabels(GetReleaseLabelsArgs.builder()
     *             .filters(GetReleaseLabelsFiltersArgs.builder()
     *                 .application(&#34;spark@2.1.0&#34;)
     *                 .prefix(&#34;emr-5&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetReleaseLabelsResult> getReleaseLabelsPlain(GetReleaseLabelsPlainArgs args) {
        return getReleaseLabelsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about EMR Release Labels.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.emr.EmrFunctions;
     * import com.pulumi.aws.emr.inputs.GetReleaseLabelsArgs;
     * import com.pulumi.aws.emr.inputs.GetReleaseLabelsFiltersArgs;
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
     *         final var example = EmrFunctions.getReleaseLabels(GetReleaseLabelsArgs.builder()
     *             .filters(GetReleaseLabelsFiltersArgs.builder()
     *                 .application(&#34;spark@2.1.0&#34;)
     *                 .prefix(&#34;emr-5&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetReleaseLabelsResult> getReleaseLabels(GetReleaseLabelsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:emr/getReleaseLabels:getReleaseLabels", TypeShape.of(GetReleaseLabelsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about EMR Release Labels.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.emr.EmrFunctions;
     * import com.pulumi.aws.emr.inputs.GetReleaseLabelsArgs;
     * import com.pulumi.aws.emr.inputs.GetReleaseLabelsFiltersArgs;
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
     *         final var example = EmrFunctions.getReleaseLabels(GetReleaseLabelsArgs.builder()
     *             .filters(GetReleaseLabelsFiltersArgs.builder()
     *                 .application(&#34;spark@2.1.0&#34;)
     *                 .prefix(&#34;emr-5&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetReleaseLabelsResult> getReleaseLabelsPlain(GetReleaseLabelsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:emr/getReleaseLabels:getReleaseLabels", TypeShape.of(GetReleaseLabelsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for managing AWS EMR Supported Instance Types.
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
     * import com.pulumi.aws.emr.EmrFunctions;
     * import com.pulumi.aws.emr.inputs.GetSupportedInstanceTypesArgs;
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
     *         final var example = EmrFunctions.getSupportedInstanceTypes(GetSupportedInstanceTypesArgs.builder()
     *             .releaseLabel(&#34;ebs-6.15.0&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     * ### With a Lifecycle Pre-Condition
     * 
     * This data source can be used with a lifecycle precondition to ensure a given instance type is supported by EMR.
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.emr.EmrFunctions;
     * import com.pulumi.aws.emr.inputs.GetSupportedInstanceTypesArgs;
     * import com.pulumi.aws.emr.Cluster;
     * import com.pulumi.aws.emr.ClusterArgs;
     * import com.pulumi.aws.emr.inputs.ClusterMasterInstanceGroupArgs;
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
     *         final var instanceType = &#34;r7g.large&#34;;
     * 
     *         final var releaseLabel = &#34;emr-6.15.0&#34;;
     * 
     *         final var test = EmrFunctions.getSupportedInstanceTypes(GetSupportedInstanceTypesArgs.builder()
     *             .releaseLabel(releaseLabel)
     *             .build());
     * 
     *         var testCluster = new Cluster(&#34;testCluster&#34;, ClusterArgs.builder()        
     *             .releaseLabel(releaseLabel)
     *             .masterInstanceGroup(ClusterMasterInstanceGroupArgs.builder()
     *                 .instanceType(instanceType)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetSupportedInstanceTypesResult> getSupportedInstanceTypes(GetSupportedInstanceTypesArgs args) {
        return getSupportedInstanceTypes(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing AWS EMR Supported Instance Types.
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
     * import com.pulumi.aws.emr.EmrFunctions;
     * import com.pulumi.aws.emr.inputs.GetSupportedInstanceTypesArgs;
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
     *         final var example = EmrFunctions.getSupportedInstanceTypes(GetSupportedInstanceTypesArgs.builder()
     *             .releaseLabel(&#34;ebs-6.15.0&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     * ### With a Lifecycle Pre-Condition
     * 
     * This data source can be used with a lifecycle precondition to ensure a given instance type is supported by EMR.
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.emr.EmrFunctions;
     * import com.pulumi.aws.emr.inputs.GetSupportedInstanceTypesArgs;
     * import com.pulumi.aws.emr.Cluster;
     * import com.pulumi.aws.emr.ClusterArgs;
     * import com.pulumi.aws.emr.inputs.ClusterMasterInstanceGroupArgs;
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
     *         final var instanceType = &#34;r7g.large&#34;;
     * 
     *         final var releaseLabel = &#34;emr-6.15.0&#34;;
     * 
     *         final var test = EmrFunctions.getSupportedInstanceTypes(GetSupportedInstanceTypesArgs.builder()
     *             .releaseLabel(releaseLabel)
     *             .build());
     * 
     *         var testCluster = new Cluster(&#34;testCluster&#34;, ClusterArgs.builder()        
     *             .releaseLabel(releaseLabel)
     *             .masterInstanceGroup(ClusterMasterInstanceGroupArgs.builder()
     *                 .instanceType(instanceType)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetSupportedInstanceTypesResult> getSupportedInstanceTypesPlain(GetSupportedInstanceTypesPlainArgs args) {
        return getSupportedInstanceTypesPlain(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing AWS EMR Supported Instance Types.
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
     * import com.pulumi.aws.emr.EmrFunctions;
     * import com.pulumi.aws.emr.inputs.GetSupportedInstanceTypesArgs;
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
     *         final var example = EmrFunctions.getSupportedInstanceTypes(GetSupportedInstanceTypesArgs.builder()
     *             .releaseLabel(&#34;ebs-6.15.0&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     * ### With a Lifecycle Pre-Condition
     * 
     * This data source can be used with a lifecycle precondition to ensure a given instance type is supported by EMR.
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.emr.EmrFunctions;
     * import com.pulumi.aws.emr.inputs.GetSupportedInstanceTypesArgs;
     * import com.pulumi.aws.emr.Cluster;
     * import com.pulumi.aws.emr.ClusterArgs;
     * import com.pulumi.aws.emr.inputs.ClusterMasterInstanceGroupArgs;
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
     *         final var instanceType = &#34;r7g.large&#34;;
     * 
     *         final var releaseLabel = &#34;emr-6.15.0&#34;;
     * 
     *         final var test = EmrFunctions.getSupportedInstanceTypes(GetSupportedInstanceTypesArgs.builder()
     *             .releaseLabel(releaseLabel)
     *             .build());
     * 
     *         var testCluster = new Cluster(&#34;testCluster&#34;, ClusterArgs.builder()        
     *             .releaseLabel(releaseLabel)
     *             .masterInstanceGroup(ClusterMasterInstanceGroupArgs.builder()
     *                 .instanceType(instanceType)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetSupportedInstanceTypesResult> getSupportedInstanceTypes(GetSupportedInstanceTypesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:emr/getSupportedInstanceTypes:getSupportedInstanceTypes", TypeShape.of(GetSupportedInstanceTypesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for managing AWS EMR Supported Instance Types.
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
     * import com.pulumi.aws.emr.EmrFunctions;
     * import com.pulumi.aws.emr.inputs.GetSupportedInstanceTypesArgs;
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
     *         final var example = EmrFunctions.getSupportedInstanceTypes(GetSupportedInstanceTypesArgs.builder()
     *             .releaseLabel(&#34;ebs-6.15.0&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     * ### With a Lifecycle Pre-Condition
     * 
     * This data source can be used with a lifecycle precondition to ensure a given instance type is supported by EMR.
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.emr.EmrFunctions;
     * import com.pulumi.aws.emr.inputs.GetSupportedInstanceTypesArgs;
     * import com.pulumi.aws.emr.Cluster;
     * import com.pulumi.aws.emr.ClusterArgs;
     * import com.pulumi.aws.emr.inputs.ClusterMasterInstanceGroupArgs;
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
     *         final var instanceType = &#34;r7g.large&#34;;
     * 
     *         final var releaseLabel = &#34;emr-6.15.0&#34;;
     * 
     *         final var test = EmrFunctions.getSupportedInstanceTypes(GetSupportedInstanceTypesArgs.builder()
     *             .releaseLabel(releaseLabel)
     *             .build());
     * 
     *         var testCluster = new Cluster(&#34;testCluster&#34;, ClusterArgs.builder()        
     *             .releaseLabel(releaseLabel)
     *             .masterInstanceGroup(ClusterMasterInstanceGroupArgs.builder()
     *                 .instanceType(instanceType)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetSupportedInstanceTypesResult> getSupportedInstanceTypesPlain(GetSupportedInstanceTypesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:emr/getSupportedInstanceTypes:getSupportedInstanceTypes", TypeShape.of(GetSupportedInstanceTypesResult.class), args, Utilities.withVersion(options));
    }
}
