// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.kinesis.inputs.GetFirehoseDeliveryStreamArgs;
import com.pulumi.aws.kinesis.inputs.GetFirehoseDeliveryStreamPlainArgs;
import com.pulumi.aws.kinesis.inputs.GetStreamArgs;
import com.pulumi.aws.kinesis.inputs.GetStreamConsumerArgs;
import com.pulumi.aws.kinesis.inputs.GetStreamConsumerPlainArgs;
import com.pulumi.aws.kinesis.inputs.GetStreamPlainArgs;
import com.pulumi.aws.kinesis.outputs.GetFirehoseDeliveryStreamResult;
import com.pulumi.aws.kinesis.outputs.GetStreamConsumerResult;
import com.pulumi.aws.kinesis.outputs.GetStreamResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class KinesisFunctions {
    /**
     * Use this data source to get information about a Kinesis Firehose Delivery Stream for use in other resources.
     * 
     * For more details, see the [Amazon Kinesis Firehose Documentation](https://aws.amazon.com/documentation/firehose/).
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
     * import com.pulumi.aws.kinesis.KinesisFunctions;
     * import com.pulumi.aws.kinesis.inputs.GetFirehoseDeliveryStreamArgs;
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
     *         final var stream = KinesisFunctions.getFirehoseDeliveryStream(GetFirehoseDeliveryStreamArgs.builder()
     *             .name(&#34;stream-name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetFirehoseDeliveryStreamResult> getFirehoseDeliveryStream(GetFirehoseDeliveryStreamArgs args) {
        return getFirehoseDeliveryStream(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a Kinesis Firehose Delivery Stream for use in other resources.
     * 
     * For more details, see the [Amazon Kinesis Firehose Documentation](https://aws.amazon.com/documentation/firehose/).
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
     * import com.pulumi.aws.kinesis.KinesisFunctions;
     * import com.pulumi.aws.kinesis.inputs.GetFirehoseDeliveryStreamArgs;
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
     *         final var stream = KinesisFunctions.getFirehoseDeliveryStream(GetFirehoseDeliveryStreamArgs.builder()
     *             .name(&#34;stream-name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetFirehoseDeliveryStreamResult> getFirehoseDeliveryStreamPlain(GetFirehoseDeliveryStreamPlainArgs args) {
        return getFirehoseDeliveryStreamPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a Kinesis Firehose Delivery Stream for use in other resources.
     * 
     * For more details, see the [Amazon Kinesis Firehose Documentation](https://aws.amazon.com/documentation/firehose/).
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
     * import com.pulumi.aws.kinesis.KinesisFunctions;
     * import com.pulumi.aws.kinesis.inputs.GetFirehoseDeliveryStreamArgs;
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
     *         final var stream = KinesisFunctions.getFirehoseDeliveryStream(GetFirehoseDeliveryStreamArgs.builder()
     *             .name(&#34;stream-name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetFirehoseDeliveryStreamResult> getFirehoseDeliveryStream(GetFirehoseDeliveryStreamArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:kinesis/getFirehoseDeliveryStream:getFirehoseDeliveryStream", TypeShape.of(GetFirehoseDeliveryStreamResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a Kinesis Firehose Delivery Stream for use in other resources.
     * 
     * For more details, see the [Amazon Kinesis Firehose Documentation](https://aws.amazon.com/documentation/firehose/).
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
     * import com.pulumi.aws.kinesis.KinesisFunctions;
     * import com.pulumi.aws.kinesis.inputs.GetFirehoseDeliveryStreamArgs;
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
     *         final var stream = KinesisFunctions.getFirehoseDeliveryStream(GetFirehoseDeliveryStreamArgs.builder()
     *             .name(&#34;stream-name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetFirehoseDeliveryStreamResult> getFirehoseDeliveryStreamPlain(GetFirehoseDeliveryStreamPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kinesis/getFirehoseDeliveryStream:getFirehoseDeliveryStream", TypeShape.of(GetFirehoseDeliveryStreamResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a Kinesis Stream for use in other
     * resources.
     * 
     * For more details, see the [Amazon Kinesis Documentation](https://aws.amazon.com/documentation/kinesis/).
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
     * import com.pulumi.aws.kinesis.KinesisFunctions;
     * import com.pulumi.aws.kinesis.inputs.GetStreamArgs;
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
     *         final var stream = KinesisFunctions.getStream(GetStreamArgs.builder()
     *             .name(&#34;stream-name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetStreamResult> getStream(GetStreamArgs args) {
        return getStream(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a Kinesis Stream for use in other
     * resources.
     * 
     * For more details, see the [Amazon Kinesis Documentation](https://aws.amazon.com/documentation/kinesis/).
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
     * import com.pulumi.aws.kinesis.KinesisFunctions;
     * import com.pulumi.aws.kinesis.inputs.GetStreamArgs;
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
     *         final var stream = KinesisFunctions.getStream(GetStreamArgs.builder()
     *             .name(&#34;stream-name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetStreamResult> getStreamPlain(GetStreamPlainArgs args) {
        return getStreamPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get information about a Kinesis Stream for use in other
     * resources.
     * 
     * For more details, see the [Amazon Kinesis Documentation](https://aws.amazon.com/documentation/kinesis/).
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
     * import com.pulumi.aws.kinesis.KinesisFunctions;
     * import com.pulumi.aws.kinesis.inputs.GetStreamArgs;
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
     *         final var stream = KinesisFunctions.getStream(GetStreamArgs.builder()
     *             .name(&#34;stream-name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetStreamResult> getStream(GetStreamArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:kinesis/getStream:getStream", TypeShape.of(GetStreamResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get information about a Kinesis Stream for use in other
     * resources.
     * 
     * For more details, see the [Amazon Kinesis Documentation](https://aws.amazon.com/documentation/kinesis/).
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
     * import com.pulumi.aws.kinesis.KinesisFunctions;
     * import com.pulumi.aws.kinesis.inputs.GetStreamArgs;
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
     *         final var stream = KinesisFunctions.getStream(GetStreamArgs.builder()
     *             .name(&#34;stream-name&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetStreamResult> getStreamPlain(GetStreamPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kinesis/getStream:getStream", TypeShape.of(GetStreamResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a Kinesis Stream Consumer.
     * 
     * For more details, see the [Amazon Kinesis Stream Consumer Documentation](https://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-consumers.html).
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
     * import com.pulumi.aws.kinesis.KinesisFunctions;
     * import com.pulumi.aws.kinesis.inputs.GetStreamConsumerArgs;
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
     *         final var example = KinesisFunctions.getStreamConsumer(GetStreamConsumerArgs.builder()
     *             .name(&#34;example-consumer&#34;)
     *             .streamArn(exampleAwsKinesisStream.arn())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetStreamConsumerResult> getStreamConsumer(GetStreamConsumerArgs args) {
        return getStreamConsumer(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about a Kinesis Stream Consumer.
     * 
     * For more details, see the [Amazon Kinesis Stream Consumer Documentation](https://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-consumers.html).
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
     * import com.pulumi.aws.kinesis.KinesisFunctions;
     * import com.pulumi.aws.kinesis.inputs.GetStreamConsumerArgs;
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
     *         final var example = KinesisFunctions.getStreamConsumer(GetStreamConsumerArgs.builder()
     *             .name(&#34;example-consumer&#34;)
     *             .streamArn(exampleAwsKinesisStream.arn())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetStreamConsumerResult> getStreamConsumerPlain(GetStreamConsumerPlainArgs args) {
        return getStreamConsumerPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about a Kinesis Stream Consumer.
     * 
     * For more details, see the [Amazon Kinesis Stream Consumer Documentation](https://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-consumers.html).
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
     * import com.pulumi.aws.kinesis.KinesisFunctions;
     * import com.pulumi.aws.kinesis.inputs.GetStreamConsumerArgs;
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
     *         final var example = KinesisFunctions.getStreamConsumer(GetStreamConsumerArgs.builder()
     *             .name(&#34;example-consumer&#34;)
     *             .streamArn(exampleAwsKinesisStream.arn())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetStreamConsumerResult> getStreamConsumer(GetStreamConsumerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:kinesis/getStreamConsumer:getStreamConsumer", TypeShape.of(GetStreamConsumerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a Kinesis Stream Consumer.
     * 
     * For more details, see the [Amazon Kinesis Stream Consumer Documentation](https://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-consumers.html).
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
     * import com.pulumi.aws.kinesis.KinesisFunctions;
     * import com.pulumi.aws.kinesis.inputs.GetStreamConsumerArgs;
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
     *         final var example = KinesisFunctions.getStreamConsumer(GetStreamConsumerArgs.builder()
     *             .name(&#34;example-consumer&#34;)
     *             .streamArn(exampleAwsKinesisStream.arn())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetStreamConsumerResult> getStreamConsumerPlain(GetStreamConsumerPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kinesis/getStreamConsumer:getStreamConsumer", TypeShape.of(GetStreamConsumerResult.class), args, Utilities.withVersion(options));
    }
}
