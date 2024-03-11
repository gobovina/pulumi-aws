// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sesv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sesv2.inputs.GetConfigurationSetArgs;
import com.pulumi.aws.sesv2.inputs.GetConfigurationSetPlainArgs;
import com.pulumi.aws.sesv2.inputs.GetDedicatedIpPoolArgs;
import com.pulumi.aws.sesv2.inputs.GetDedicatedIpPoolPlainArgs;
import com.pulumi.aws.sesv2.inputs.GetEmailIdentityArgs;
import com.pulumi.aws.sesv2.inputs.GetEmailIdentityMailFromAttributesArgs;
import com.pulumi.aws.sesv2.inputs.GetEmailIdentityMailFromAttributesPlainArgs;
import com.pulumi.aws.sesv2.inputs.GetEmailIdentityPlainArgs;
import com.pulumi.aws.sesv2.outputs.GetConfigurationSetResult;
import com.pulumi.aws.sesv2.outputs.GetDedicatedIpPoolResult;
import com.pulumi.aws.sesv2.outputs.GetEmailIdentityMailFromAttributesResult;
import com.pulumi.aws.sesv2.outputs.GetEmailIdentityResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class Sesv2Functions {
    /**
     * Data source for managing an AWS SESv2 (Simple Email V2) Configuration Set.
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
     * import com.pulumi.aws.sesv2.Sesv2Functions;
     * import com.pulumi.aws.sesv2.inputs.GetConfigurationSetArgs;
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
     *         final var example = Sesv2Functions.getConfigurationSet(GetConfigurationSetArgs.builder()
     *             .configurationSetName(&#34;example&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetConfigurationSetResult> getConfigurationSet(GetConfigurationSetArgs args) {
        return getConfigurationSet(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS SESv2 (Simple Email V2) Configuration Set.
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
     * import com.pulumi.aws.sesv2.Sesv2Functions;
     * import com.pulumi.aws.sesv2.inputs.GetConfigurationSetArgs;
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
     *         final var example = Sesv2Functions.getConfigurationSet(GetConfigurationSetArgs.builder()
     *             .configurationSetName(&#34;example&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetConfigurationSetResult> getConfigurationSetPlain(GetConfigurationSetPlainArgs args) {
        return getConfigurationSetPlain(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS SESv2 (Simple Email V2) Configuration Set.
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
     * import com.pulumi.aws.sesv2.Sesv2Functions;
     * import com.pulumi.aws.sesv2.inputs.GetConfigurationSetArgs;
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
     *         final var example = Sesv2Functions.getConfigurationSet(GetConfigurationSetArgs.builder()
     *             .configurationSetName(&#34;example&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetConfigurationSetResult> getConfigurationSet(GetConfigurationSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:sesv2/getConfigurationSet:getConfigurationSet", TypeShape.of(GetConfigurationSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for managing an AWS SESv2 (Simple Email V2) Configuration Set.
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
     * import com.pulumi.aws.sesv2.Sesv2Functions;
     * import com.pulumi.aws.sesv2.inputs.GetConfigurationSetArgs;
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
     *         final var example = Sesv2Functions.getConfigurationSet(GetConfigurationSetArgs.builder()
     *             .configurationSetName(&#34;example&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetConfigurationSetResult> getConfigurationSetPlain(GetConfigurationSetPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:sesv2/getConfigurationSet:getConfigurationSet", TypeShape.of(GetConfigurationSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for managing an AWS SESv2 (Simple Email V2) Dedicated IP Pool.
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
     * import com.pulumi.aws.sesv2.Sesv2Functions;
     * import com.pulumi.aws.sesv2.inputs.GetDedicatedIpPoolArgs;
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
     *         final var example = Sesv2Functions.getDedicatedIpPool(GetDedicatedIpPoolArgs.builder()
     *             .poolName(&#34;my-pool&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetDedicatedIpPoolResult> getDedicatedIpPool(GetDedicatedIpPoolArgs args) {
        return getDedicatedIpPool(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS SESv2 (Simple Email V2) Dedicated IP Pool.
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
     * import com.pulumi.aws.sesv2.Sesv2Functions;
     * import com.pulumi.aws.sesv2.inputs.GetDedicatedIpPoolArgs;
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
     *         final var example = Sesv2Functions.getDedicatedIpPool(GetDedicatedIpPoolArgs.builder()
     *             .poolName(&#34;my-pool&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetDedicatedIpPoolResult> getDedicatedIpPoolPlain(GetDedicatedIpPoolPlainArgs args) {
        return getDedicatedIpPoolPlain(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS SESv2 (Simple Email V2) Dedicated IP Pool.
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
     * import com.pulumi.aws.sesv2.Sesv2Functions;
     * import com.pulumi.aws.sesv2.inputs.GetDedicatedIpPoolArgs;
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
     *         final var example = Sesv2Functions.getDedicatedIpPool(GetDedicatedIpPoolArgs.builder()
     *             .poolName(&#34;my-pool&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetDedicatedIpPoolResult> getDedicatedIpPool(GetDedicatedIpPoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:sesv2/getDedicatedIpPool:getDedicatedIpPool", TypeShape.of(GetDedicatedIpPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for managing an AWS SESv2 (Simple Email V2) Dedicated IP Pool.
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
     * import com.pulumi.aws.sesv2.Sesv2Functions;
     * import com.pulumi.aws.sesv2.inputs.GetDedicatedIpPoolArgs;
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
     *         final var example = Sesv2Functions.getDedicatedIpPool(GetDedicatedIpPoolArgs.builder()
     *             .poolName(&#34;my-pool&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetDedicatedIpPoolResult> getDedicatedIpPoolPlain(GetDedicatedIpPoolPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:sesv2/getDedicatedIpPool:getDedicatedIpPool", TypeShape.of(GetDedicatedIpPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for managing an AWS SESv2 (Simple Email V2) Email Identity.
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
     * import com.pulumi.aws.sesv2.Sesv2Functions;
     * import com.pulumi.aws.sesv2.inputs.GetEmailIdentityArgs;
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
     *         final var example = Sesv2Functions.getEmailIdentity(GetEmailIdentityArgs.builder()
     *             .emailIdentity(&#34;example.com&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEmailIdentityResult> getEmailIdentity(GetEmailIdentityArgs args) {
        return getEmailIdentity(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS SESv2 (Simple Email V2) Email Identity.
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
     * import com.pulumi.aws.sesv2.Sesv2Functions;
     * import com.pulumi.aws.sesv2.inputs.GetEmailIdentityArgs;
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
     *         final var example = Sesv2Functions.getEmailIdentity(GetEmailIdentityArgs.builder()
     *             .emailIdentity(&#34;example.com&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEmailIdentityResult> getEmailIdentityPlain(GetEmailIdentityPlainArgs args) {
        return getEmailIdentityPlain(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS SESv2 (Simple Email V2) Email Identity.
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
     * import com.pulumi.aws.sesv2.Sesv2Functions;
     * import com.pulumi.aws.sesv2.inputs.GetEmailIdentityArgs;
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
     *         final var example = Sesv2Functions.getEmailIdentity(GetEmailIdentityArgs.builder()
     *             .emailIdentity(&#34;example.com&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEmailIdentityResult> getEmailIdentity(GetEmailIdentityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:sesv2/getEmailIdentity:getEmailIdentity", TypeShape.of(GetEmailIdentityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for managing an AWS SESv2 (Simple Email V2) Email Identity.
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
     * import com.pulumi.aws.sesv2.Sesv2Functions;
     * import com.pulumi.aws.sesv2.inputs.GetEmailIdentityArgs;
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
     *         final var example = Sesv2Functions.getEmailIdentity(GetEmailIdentityArgs.builder()
     *             .emailIdentity(&#34;example.com&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEmailIdentityResult> getEmailIdentityPlain(GetEmailIdentityPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:sesv2/getEmailIdentity:getEmailIdentity", TypeShape.of(GetEmailIdentityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for managing an AWS SESv2 (Simple Email V2) Email Identity Mail From Attributes.
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
     * import com.pulumi.aws.sesv2.Sesv2Functions;
     * import com.pulumi.aws.sesv2.inputs.GetEmailIdentityArgs;
     * import com.pulumi.aws.sesv2.inputs.GetEmailIdentityMailFromAttributesArgs;
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
     *         final var example = Sesv2Functions.getEmailIdentity(GetEmailIdentityArgs.builder()
     *             .emailIdentity(&#34;example.com&#34;)
     *             .build());
     * 
     *         final var exampleGetEmailIdentityMailFromAttributes = Sesv2Functions.getEmailIdentityMailFromAttributes(GetEmailIdentityMailFromAttributesArgs.builder()
     *             .emailIdentity(example.applyValue(getEmailIdentityResult -&gt; getEmailIdentityResult.emailIdentity()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEmailIdentityMailFromAttributesResult> getEmailIdentityMailFromAttributes(GetEmailIdentityMailFromAttributesArgs args) {
        return getEmailIdentityMailFromAttributes(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS SESv2 (Simple Email V2) Email Identity Mail From Attributes.
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
     * import com.pulumi.aws.sesv2.Sesv2Functions;
     * import com.pulumi.aws.sesv2.inputs.GetEmailIdentityArgs;
     * import com.pulumi.aws.sesv2.inputs.GetEmailIdentityMailFromAttributesArgs;
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
     *         final var example = Sesv2Functions.getEmailIdentity(GetEmailIdentityArgs.builder()
     *             .emailIdentity(&#34;example.com&#34;)
     *             .build());
     * 
     *         final var exampleGetEmailIdentityMailFromAttributes = Sesv2Functions.getEmailIdentityMailFromAttributes(GetEmailIdentityMailFromAttributesArgs.builder()
     *             .emailIdentity(example.applyValue(getEmailIdentityResult -&gt; getEmailIdentityResult.emailIdentity()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEmailIdentityMailFromAttributesResult> getEmailIdentityMailFromAttributesPlain(GetEmailIdentityMailFromAttributesPlainArgs args) {
        return getEmailIdentityMailFromAttributesPlain(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS SESv2 (Simple Email V2) Email Identity Mail From Attributes.
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
     * import com.pulumi.aws.sesv2.Sesv2Functions;
     * import com.pulumi.aws.sesv2.inputs.GetEmailIdentityArgs;
     * import com.pulumi.aws.sesv2.inputs.GetEmailIdentityMailFromAttributesArgs;
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
     *         final var example = Sesv2Functions.getEmailIdentity(GetEmailIdentityArgs.builder()
     *             .emailIdentity(&#34;example.com&#34;)
     *             .build());
     * 
     *         final var exampleGetEmailIdentityMailFromAttributes = Sesv2Functions.getEmailIdentityMailFromAttributes(GetEmailIdentityMailFromAttributesArgs.builder()
     *             .emailIdentity(example.applyValue(getEmailIdentityResult -&gt; getEmailIdentityResult.emailIdentity()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetEmailIdentityMailFromAttributesResult> getEmailIdentityMailFromAttributes(GetEmailIdentityMailFromAttributesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:sesv2/getEmailIdentityMailFromAttributes:getEmailIdentityMailFromAttributes", TypeShape.of(GetEmailIdentityMailFromAttributesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for managing an AWS SESv2 (Simple Email V2) Email Identity Mail From Attributes.
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
     * import com.pulumi.aws.sesv2.Sesv2Functions;
     * import com.pulumi.aws.sesv2.inputs.GetEmailIdentityArgs;
     * import com.pulumi.aws.sesv2.inputs.GetEmailIdentityMailFromAttributesArgs;
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
     *         final var example = Sesv2Functions.getEmailIdentity(GetEmailIdentityArgs.builder()
     *             .emailIdentity(&#34;example.com&#34;)
     *             .build());
     * 
     *         final var exampleGetEmailIdentityMailFromAttributes = Sesv2Functions.getEmailIdentityMailFromAttributes(GetEmailIdentityMailFromAttributesArgs.builder()
     *             .emailIdentity(example.applyValue(getEmailIdentityResult -&gt; getEmailIdentityResult.emailIdentity()))
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetEmailIdentityMailFromAttributesResult> getEmailIdentityMailFromAttributesPlain(GetEmailIdentityMailFromAttributesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:sesv2/getEmailIdentityMailFromAttributes:getEmailIdentityMailFromAttributes", TypeShape.of(GetEmailIdentityMailFromAttributesResult.class), args, Utilities.withVersion(options));
    }
}
