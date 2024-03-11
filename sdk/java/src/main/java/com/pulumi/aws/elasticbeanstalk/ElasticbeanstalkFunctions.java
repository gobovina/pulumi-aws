// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticbeanstalk;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elasticbeanstalk.inputs.GetApplicationArgs;
import com.pulumi.aws.elasticbeanstalk.inputs.GetApplicationPlainArgs;
import com.pulumi.aws.elasticbeanstalk.inputs.GetHostedZoneArgs;
import com.pulumi.aws.elasticbeanstalk.inputs.GetHostedZonePlainArgs;
import com.pulumi.aws.elasticbeanstalk.inputs.GetSolutionStackArgs;
import com.pulumi.aws.elasticbeanstalk.inputs.GetSolutionStackPlainArgs;
import com.pulumi.aws.elasticbeanstalk.outputs.GetApplicationResult;
import com.pulumi.aws.elasticbeanstalk.outputs.GetHostedZoneResult;
import com.pulumi.aws.elasticbeanstalk.outputs.GetSolutionStackResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ElasticbeanstalkFunctions {
    /**
     * Retrieve information about an Elastic Beanstalk Application.
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
     * import com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions;
     * import com.pulumi.aws.elasticbeanstalk.inputs.GetApplicationArgs;
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
     *         final var example = ElasticbeanstalkFunctions.getApplication(GetApplicationArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;arn&#34;, example.applyValue(getApplicationResult -&gt; getApplicationResult.arn()));
     *         ctx.export(&#34;description&#34;, example.applyValue(getApplicationResult -&gt; getApplicationResult.description()));
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetApplicationResult> getApplication(GetApplicationArgs args) {
        return getApplication(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about an Elastic Beanstalk Application.
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
     * import com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions;
     * import com.pulumi.aws.elasticbeanstalk.inputs.GetApplicationArgs;
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
     *         final var example = ElasticbeanstalkFunctions.getApplication(GetApplicationArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;arn&#34;, example.applyValue(getApplicationResult -&gt; getApplicationResult.arn()));
     *         ctx.export(&#34;description&#34;, example.applyValue(getApplicationResult -&gt; getApplicationResult.description()));
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplicationPlain(GetApplicationPlainArgs args) {
        return getApplicationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about an Elastic Beanstalk Application.
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
     * import com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions;
     * import com.pulumi.aws.elasticbeanstalk.inputs.GetApplicationArgs;
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
     *         final var example = ElasticbeanstalkFunctions.getApplication(GetApplicationArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;arn&#34;, example.applyValue(getApplicationResult -&gt; getApplicationResult.arn()));
     *         ctx.export(&#34;description&#34;, example.applyValue(getApplicationResult -&gt; getApplicationResult.description()));
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetApplicationResult> getApplication(GetApplicationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:elasticbeanstalk/getApplication:getApplication", TypeShape.of(GetApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about an Elastic Beanstalk Application.
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
     * import com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions;
     * import com.pulumi.aws.elasticbeanstalk.inputs.GetApplicationArgs;
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
     *         final var example = ElasticbeanstalkFunctions.getApplication(GetApplicationArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;arn&#34;, example.applyValue(getApplicationResult -&gt; getApplicationResult.arn()));
     *         ctx.export(&#34;description&#34;, example.applyValue(getApplicationResult -&gt; getApplicationResult.description()));
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplicationPlain(GetApplicationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:elasticbeanstalk/getApplication:getApplication", TypeShape.of(GetApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the ID of an [elastic beanstalk hosted zone](http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region).
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
     * import com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions;
     * import com.pulumi.aws.elasticbeanstalk.inputs.GetHostedZoneArgs;
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
     *         final var current = ElasticbeanstalkFunctions.getHostedZone();
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetHostedZoneResult> getHostedZone() {
        return getHostedZone(GetHostedZoneArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the ID of an [elastic beanstalk hosted zone](http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region).
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
     * import com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions;
     * import com.pulumi.aws.elasticbeanstalk.inputs.GetHostedZoneArgs;
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
     *         final var current = ElasticbeanstalkFunctions.getHostedZone();
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetHostedZoneResult> getHostedZonePlain() {
        return getHostedZonePlain(GetHostedZonePlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the ID of an [elastic beanstalk hosted zone](http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region).
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
     * import com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions;
     * import com.pulumi.aws.elasticbeanstalk.inputs.GetHostedZoneArgs;
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
     *         final var current = ElasticbeanstalkFunctions.getHostedZone();
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetHostedZoneResult> getHostedZone(GetHostedZoneArgs args) {
        return getHostedZone(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the ID of an [elastic beanstalk hosted zone](http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region).
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
     * import com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions;
     * import com.pulumi.aws.elasticbeanstalk.inputs.GetHostedZoneArgs;
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
     *         final var current = ElasticbeanstalkFunctions.getHostedZone();
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetHostedZoneResult> getHostedZonePlain(GetHostedZonePlainArgs args) {
        return getHostedZonePlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the ID of an [elastic beanstalk hosted zone](http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region).
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
     * import com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions;
     * import com.pulumi.aws.elasticbeanstalk.inputs.GetHostedZoneArgs;
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
     *         final var current = ElasticbeanstalkFunctions.getHostedZone();
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetHostedZoneResult> getHostedZone(GetHostedZoneArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:elasticbeanstalk/getHostedZone:getHostedZone", TypeShape.of(GetHostedZoneResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the ID of an [elastic beanstalk hosted zone](http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region).
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
     * import com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions;
     * import com.pulumi.aws.elasticbeanstalk.inputs.GetHostedZoneArgs;
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
     *         final var current = ElasticbeanstalkFunctions.getHostedZone();
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetHostedZoneResult> getHostedZonePlain(GetHostedZonePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:elasticbeanstalk/getHostedZone:getHostedZone", TypeShape.of(GetHostedZoneResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the name of a elastic beanstalk solution stack.
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
     * import com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions;
     * import com.pulumi.aws.elasticbeanstalk.inputs.GetSolutionStackArgs;
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
     *         final var multiDocker = ElasticbeanstalkFunctions.getSolutionStack(GetSolutionStackArgs.builder()
     *             .mostRecent(true)
     *             .nameRegex(&#34;^64bit Amazon Linux (.*) Multi-container Docker (.*)$&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetSolutionStackResult> getSolutionStack(GetSolutionStackArgs args) {
        return getSolutionStack(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the name of a elastic beanstalk solution stack.
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
     * import com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions;
     * import com.pulumi.aws.elasticbeanstalk.inputs.GetSolutionStackArgs;
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
     *         final var multiDocker = ElasticbeanstalkFunctions.getSolutionStack(GetSolutionStackArgs.builder()
     *             .mostRecent(true)
     *             .nameRegex(&#34;^64bit Amazon Linux (.*) Multi-container Docker (.*)$&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetSolutionStackResult> getSolutionStackPlain(GetSolutionStackPlainArgs args) {
        return getSolutionStackPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the name of a elastic beanstalk solution stack.
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
     * import com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions;
     * import com.pulumi.aws.elasticbeanstalk.inputs.GetSolutionStackArgs;
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
     *         final var multiDocker = ElasticbeanstalkFunctions.getSolutionStack(GetSolutionStackArgs.builder()
     *             .mostRecent(true)
     *             .nameRegex(&#34;^64bit Amazon Linux (.*) Multi-container Docker (.*)$&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetSolutionStackResult> getSolutionStack(GetSolutionStackArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:elasticbeanstalk/getSolutionStack:getSolutionStack", TypeShape.of(GetSolutionStackResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the name of a elastic beanstalk solution stack.
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
     * import com.pulumi.aws.elasticbeanstalk.ElasticbeanstalkFunctions;
     * import com.pulumi.aws.elasticbeanstalk.inputs.GetSolutionStackArgs;
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
     *         final var multiDocker = ElasticbeanstalkFunctions.getSolutionStack(GetSolutionStackArgs.builder()
     *             .mostRecent(true)
     *             .nameRegex(&#34;^64bit Amazon Linux (.*) Multi-container Docker (.*)$&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetSolutionStackResult> getSolutionStackPlain(GetSolutionStackPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:elasticbeanstalk/getSolutionStack:getSolutionStack", TypeShape.of(GetSolutionStackResult.class), args, Utilities.withVersion(options));
    }
}
