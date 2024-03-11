// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ivs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ivs.inputs.GetStreamKeyArgs;
import com.pulumi.aws.ivs.inputs.GetStreamKeyPlainArgs;
import com.pulumi.aws.ivs.outputs.GetStreamKeyResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class IvsFunctions {
    /**
     * Data source for managing an AWS IVS (Interactive Video) Stream Key.
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
     * import com.pulumi.aws.ivs.IvsFunctions;
     * import com.pulumi.aws.ivs.inputs.GetStreamKeyArgs;
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
     *         final var example = IvsFunctions.getStreamKey(GetStreamKeyArgs.builder()
     *             .channelArn(&#34;arn:aws:ivs:us-west-2:326937407773:channel/0Y1lcs4U7jk5&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetStreamKeyResult> getStreamKey(GetStreamKeyArgs args) {
        return getStreamKey(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS IVS (Interactive Video) Stream Key.
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
     * import com.pulumi.aws.ivs.IvsFunctions;
     * import com.pulumi.aws.ivs.inputs.GetStreamKeyArgs;
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
     *         final var example = IvsFunctions.getStreamKey(GetStreamKeyArgs.builder()
     *             .channelArn(&#34;arn:aws:ivs:us-west-2:326937407773:channel/0Y1lcs4U7jk5&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetStreamKeyResult> getStreamKeyPlain(GetStreamKeyPlainArgs args) {
        return getStreamKeyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Data source for managing an AWS IVS (Interactive Video) Stream Key.
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
     * import com.pulumi.aws.ivs.IvsFunctions;
     * import com.pulumi.aws.ivs.inputs.GetStreamKeyArgs;
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
     *         final var example = IvsFunctions.getStreamKey(GetStreamKeyArgs.builder()
     *             .channelArn(&#34;arn:aws:ivs:us-west-2:326937407773:channel/0Y1lcs4U7jk5&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetStreamKeyResult> getStreamKey(GetStreamKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:ivs/getStreamKey:getStreamKey", TypeShape.of(GetStreamKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source for managing an AWS IVS (Interactive Video) Stream Key.
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
     * import com.pulumi.aws.ivs.IvsFunctions;
     * import com.pulumi.aws.ivs.inputs.GetStreamKeyArgs;
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
     *         final var example = IvsFunctions.getStreamKey(GetStreamKeyArgs.builder()
     *             .channelArn(&#34;arn:aws:ivs:us-west-2:326937407773:channel/0Y1lcs4U7jk5&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetStreamKeyResult> getStreamKeyPlain(GetStreamKeyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ivs/getStreamKey:getStreamKey", TypeShape.of(GetStreamKeyResult.class), args, Utilities.withVersion(options));
    }
}
