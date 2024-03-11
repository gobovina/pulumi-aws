// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.servicecatalog.inputs.GetConstraintArgs;
import com.pulumi.aws.servicecatalog.inputs.GetConstraintPlainArgs;
import com.pulumi.aws.servicecatalog.inputs.GetLaunchPathsArgs;
import com.pulumi.aws.servicecatalog.inputs.GetLaunchPathsPlainArgs;
import com.pulumi.aws.servicecatalog.inputs.GetPortfolioArgs;
import com.pulumi.aws.servicecatalog.inputs.GetPortfolioConstraintsArgs;
import com.pulumi.aws.servicecatalog.inputs.GetPortfolioConstraintsPlainArgs;
import com.pulumi.aws.servicecatalog.inputs.GetPortfolioPlainArgs;
import com.pulumi.aws.servicecatalog.inputs.GetProductArgs;
import com.pulumi.aws.servicecatalog.inputs.GetProductPlainArgs;
import com.pulumi.aws.servicecatalog.inputs.GetProvisioningArtifactsArgs;
import com.pulumi.aws.servicecatalog.inputs.GetProvisioningArtifactsPlainArgs;
import com.pulumi.aws.servicecatalog.outputs.GetConstraintResult;
import com.pulumi.aws.servicecatalog.outputs.GetLaunchPathsResult;
import com.pulumi.aws.servicecatalog.outputs.GetPortfolioConstraintsResult;
import com.pulumi.aws.servicecatalog.outputs.GetPortfolioResult;
import com.pulumi.aws.servicecatalog.outputs.GetProductResult;
import com.pulumi.aws.servicecatalog.outputs.GetProvisioningArtifactsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ServicecatalogFunctions {
    /**
     * Provides information on a Service Catalog Constraint.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetConstraintArgs;
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
     *         final var example = ServicecatalogFunctions.getConstraint(GetConstraintArgs.builder()
     *             .acceptLanguage(&#34;en&#34;)
     *             .id(&#34;cons-hrvy0335&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetConstraintResult> getConstraint(GetConstraintArgs args) {
        return getConstraint(args, InvokeOptions.Empty);
    }
    /**
     * Provides information on a Service Catalog Constraint.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetConstraintArgs;
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
     *         final var example = ServicecatalogFunctions.getConstraint(GetConstraintArgs.builder()
     *             .acceptLanguage(&#34;en&#34;)
     *             .id(&#34;cons-hrvy0335&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetConstraintResult> getConstraintPlain(GetConstraintPlainArgs args) {
        return getConstraintPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides information on a Service Catalog Constraint.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetConstraintArgs;
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
     *         final var example = ServicecatalogFunctions.getConstraint(GetConstraintArgs.builder()
     *             .acceptLanguage(&#34;en&#34;)
     *             .id(&#34;cons-hrvy0335&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetConstraintResult> getConstraint(GetConstraintArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:servicecatalog/getConstraint:getConstraint", TypeShape.of(GetConstraintResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information on a Service Catalog Constraint.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetConstraintArgs;
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
     *         final var example = ServicecatalogFunctions.getConstraint(GetConstraintArgs.builder()
     *             .acceptLanguage(&#34;en&#34;)
     *             .id(&#34;cons-hrvy0335&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetConstraintResult> getConstraintPlain(GetConstraintPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:servicecatalog/getConstraint:getConstraint", TypeShape.of(GetConstraintResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Lists the paths to the specified product. A path is how the user has access to a specified product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetLaunchPathsArgs;
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
     *         final var example = ServicecatalogFunctions.getLaunchPaths(GetLaunchPathsArgs.builder()
     *             .productId(&#34;prod-yakog5pdriver&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetLaunchPathsResult> getLaunchPaths(GetLaunchPathsArgs args) {
        return getLaunchPaths(args, InvokeOptions.Empty);
    }
    /**
     * Lists the paths to the specified product. A path is how the user has access to a specified product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetLaunchPathsArgs;
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
     *         final var example = ServicecatalogFunctions.getLaunchPaths(GetLaunchPathsArgs.builder()
     *             .productId(&#34;prod-yakog5pdriver&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetLaunchPathsResult> getLaunchPathsPlain(GetLaunchPathsPlainArgs args) {
        return getLaunchPathsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Lists the paths to the specified product. A path is how the user has access to a specified product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetLaunchPathsArgs;
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
     *         final var example = ServicecatalogFunctions.getLaunchPaths(GetLaunchPathsArgs.builder()
     *             .productId(&#34;prod-yakog5pdriver&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetLaunchPathsResult> getLaunchPaths(GetLaunchPathsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:servicecatalog/getLaunchPaths:getLaunchPaths", TypeShape.of(GetLaunchPathsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Lists the paths to the specified product. A path is how the user has access to a specified product, and is necessary when provisioning a product. A path also determines the constraints put on the product.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetLaunchPathsArgs;
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
     *         final var example = ServicecatalogFunctions.getLaunchPaths(GetLaunchPathsArgs.builder()
     *             .productId(&#34;prod-yakog5pdriver&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetLaunchPathsResult> getLaunchPathsPlain(GetLaunchPathsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:servicecatalog/getLaunchPaths:getLaunchPaths", TypeShape.of(GetLaunchPathsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information for a Service Catalog Portfolio.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetPortfolioArgs;
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
     *         final var portfolio = ServicecatalogFunctions.getPortfolio(GetPortfolioArgs.builder()
     *             .id(&#34;port-07052002&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetPortfolioResult> getPortfolio(GetPortfolioArgs args) {
        return getPortfolio(args, InvokeOptions.Empty);
    }
    /**
     * Provides information for a Service Catalog Portfolio.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetPortfolioArgs;
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
     *         final var portfolio = ServicecatalogFunctions.getPortfolio(GetPortfolioArgs.builder()
     *             .id(&#34;port-07052002&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetPortfolioResult> getPortfolioPlain(GetPortfolioPlainArgs args) {
        return getPortfolioPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides information for a Service Catalog Portfolio.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetPortfolioArgs;
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
     *         final var portfolio = ServicecatalogFunctions.getPortfolio(GetPortfolioArgs.builder()
     *             .id(&#34;port-07052002&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetPortfolioResult> getPortfolio(GetPortfolioArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:servicecatalog/getPortfolio:getPortfolio", TypeShape.of(GetPortfolioResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information for a Service Catalog Portfolio.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetPortfolioArgs;
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
     *         final var portfolio = ServicecatalogFunctions.getPortfolio(GetPortfolioArgs.builder()
     *             .id(&#34;port-07052002&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetPortfolioResult> getPortfolioPlain(GetPortfolioPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:servicecatalog/getPortfolio:getPortfolio", TypeShape.of(GetPortfolioResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information on Service Catalog Portfolio Constraints.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetPortfolioConstraintsArgs;
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
     *         final var example = ServicecatalogFunctions.getPortfolioConstraints(GetPortfolioConstraintsArgs.builder()
     *             .portfolioId(&#34;port-3lli3b3an&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetPortfolioConstraintsResult> getPortfolioConstraints(GetPortfolioConstraintsArgs args) {
        return getPortfolioConstraints(args, InvokeOptions.Empty);
    }
    /**
     * Provides information on Service Catalog Portfolio Constraints.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetPortfolioConstraintsArgs;
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
     *         final var example = ServicecatalogFunctions.getPortfolioConstraints(GetPortfolioConstraintsArgs.builder()
     *             .portfolioId(&#34;port-3lli3b3an&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetPortfolioConstraintsResult> getPortfolioConstraintsPlain(GetPortfolioConstraintsPlainArgs args) {
        return getPortfolioConstraintsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides information on Service Catalog Portfolio Constraints.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetPortfolioConstraintsArgs;
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
     *         final var example = ServicecatalogFunctions.getPortfolioConstraints(GetPortfolioConstraintsArgs.builder()
     *             .portfolioId(&#34;port-3lli3b3an&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetPortfolioConstraintsResult> getPortfolioConstraints(GetPortfolioConstraintsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:servicecatalog/getPortfolioConstraints:getPortfolioConstraints", TypeShape.of(GetPortfolioConstraintsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information on Service Catalog Portfolio Constraints.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetPortfolioConstraintsArgs;
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
     *         final var example = ServicecatalogFunctions.getPortfolioConstraints(GetPortfolioConstraintsArgs.builder()
     *             .portfolioId(&#34;port-3lli3b3an&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetPortfolioConstraintsResult> getPortfolioConstraintsPlain(GetPortfolioConstraintsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:servicecatalog/getPortfolioConstraints:getPortfolioConstraints", TypeShape.of(GetPortfolioConstraintsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve information about a Service Catalog product.
     * 
     * &gt; **NOTE:** A &#34;provisioning artifact&#34; is also known as a &#34;version,&#34; and a &#34;distributor&#34; is also known as a &#34;vendor.&#34;
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetProductArgs;
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
     *         final var example = ServicecatalogFunctions.getProduct(GetProductArgs.builder()
     *             .id(&#34;prod-dnigbtea24ste&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetProductResult> getProduct(GetProductArgs args) {
        return getProduct(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve information about a Service Catalog product.
     * 
     * &gt; **NOTE:** A &#34;provisioning artifact&#34; is also known as a &#34;version,&#34; and a &#34;distributor&#34; is also known as a &#34;vendor.&#34;
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetProductArgs;
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
     *         final var example = ServicecatalogFunctions.getProduct(GetProductArgs.builder()
     *             .id(&#34;prod-dnigbtea24ste&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetProductResult> getProductPlain(GetProductPlainArgs args) {
        return getProductPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve information about a Service Catalog product.
     * 
     * &gt; **NOTE:** A &#34;provisioning artifact&#34; is also known as a &#34;version,&#34; and a &#34;distributor&#34; is also known as a &#34;vendor.&#34;
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetProductArgs;
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
     *         final var example = ServicecatalogFunctions.getProduct(GetProductArgs.builder()
     *             .id(&#34;prod-dnigbtea24ste&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetProductResult> getProduct(GetProductArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:servicecatalog/getProduct:getProduct", TypeShape.of(GetProductResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve information about a Service Catalog product.
     * 
     * &gt; **NOTE:** A &#34;provisioning artifact&#34; is also known as a &#34;version,&#34; and a &#34;distributor&#34; is also known as a &#34;vendor.&#34;
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetProductArgs;
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
     *         final var example = ServicecatalogFunctions.getProduct(GetProductArgs.builder()
     *             .id(&#34;prod-dnigbtea24ste&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetProductResult> getProductPlain(GetProductPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:servicecatalog/getProduct:getProduct", TypeShape.of(GetProductResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Lists the provisioning artifacts for the specified product.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetProvisioningArtifactsArgs;
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
     *         final var example = ServicecatalogFunctions.getProvisioningArtifacts(GetProvisioningArtifactsArgs.builder()
     *             .productId(&#34;prod-yakog5pdriver&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetProvisioningArtifactsResult> getProvisioningArtifacts(GetProvisioningArtifactsArgs args) {
        return getProvisioningArtifacts(args, InvokeOptions.Empty);
    }
    /**
     * Lists the provisioning artifacts for the specified product.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetProvisioningArtifactsArgs;
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
     *         final var example = ServicecatalogFunctions.getProvisioningArtifacts(GetProvisioningArtifactsArgs.builder()
     *             .productId(&#34;prod-yakog5pdriver&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetProvisioningArtifactsResult> getProvisioningArtifactsPlain(GetProvisioningArtifactsPlainArgs args) {
        return getProvisioningArtifactsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Lists the provisioning artifacts for the specified product.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetProvisioningArtifactsArgs;
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
     *         final var example = ServicecatalogFunctions.getProvisioningArtifacts(GetProvisioningArtifactsArgs.builder()
     *             .productId(&#34;prod-yakog5pdriver&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetProvisioningArtifactsResult> getProvisioningArtifacts(GetProvisioningArtifactsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:servicecatalog/getProvisioningArtifacts:getProvisioningArtifacts", TypeShape.of(GetProvisioningArtifactsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Lists the provisioning artifacts for the specified product.
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
     * import com.pulumi.aws.servicecatalog.ServicecatalogFunctions;
     * import com.pulumi.aws.servicecatalog.inputs.GetProvisioningArtifactsArgs;
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
     *         final var example = ServicecatalogFunctions.getProvisioningArtifacts(GetProvisioningArtifactsArgs.builder()
     *             .productId(&#34;prod-yakog5pdriver&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetProvisioningArtifactsResult> getProvisioningArtifactsPlain(GetProvisioningArtifactsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:servicecatalog/getProvisioningArtifacts:getProvisioningArtifacts", TypeShape.of(GetProvisioningArtifactsResult.class), args, Utilities.withVersion(options));
    }
}
