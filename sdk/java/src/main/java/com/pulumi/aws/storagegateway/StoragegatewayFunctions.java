// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.storagegateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.storagegateway.inputs.GetLocalDiskArgs;
import com.pulumi.aws.storagegateway.inputs.GetLocalDiskPlainArgs;
import com.pulumi.aws.storagegateway.outputs.GetLocalDiskResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class StoragegatewayFunctions {
    /**
     * Retrieve information about a Storage Gateway local disk. The disk identifier is useful for adding the disk as a cache or upload buffer to a gateway.
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
     * import com.pulumi.aws.storagegateway.StoragegatewayFunctions;
     * import com.pulumi.aws.storagegateway.inputs.GetLocalDiskArgs;
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
     *         final var test = StoragegatewayFunctions.getLocalDisk(GetLocalDiskArgs.builder()
     *             .diskPath(testAwsVolumeAttachment.deviceName())
     *             .gatewayArn(testAwsStoragegatewayGateway.arn())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetLocalDiskResult> getLocalDisk(GetLocalDiskArgs args) {
        return getLocalDisk(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about a Storage Gateway local disk. The disk identifier is useful for adding the disk as a cache or upload buffer to a gateway.
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
     * import com.pulumi.aws.storagegateway.StoragegatewayFunctions;
     * import com.pulumi.aws.storagegateway.inputs.GetLocalDiskArgs;
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
     *         final var test = StoragegatewayFunctions.getLocalDisk(GetLocalDiskArgs.builder()
     *             .diskPath(testAwsVolumeAttachment.deviceName())
     *             .gatewayArn(testAwsStoragegatewayGateway.arn())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetLocalDiskResult> getLocalDiskPlain(GetLocalDiskPlainArgs args) {
        return getLocalDiskPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about a Storage Gateway local disk. The disk identifier is useful for adding the disk as a cache or upload buffer to a gateway.
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
     * import com.pulumi.aws.storagegateway.StoragegatewayFunctions;
     * import com.pulumi.aws.storagegateway.inputs.GetLocalDiskArgs;
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
     *         final var test = StoragegatewayFunctions.getLocalDisk(GetLocalDiskArgs.builder()
     *             .diskPath(testAwsVolumeAttachment.deviceName())
     *             .gatewayArn(testAwsStoragegatewayGateway.arn())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetLocalDiskResult> getLocalDisk(GetLocalDiskArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:storagegateway/getLocalDisk:getLocalDisk", TypeShape.of(GetLocalDiskResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about a Storage Gateway local disk. The disk identifier is useful for adding the disk as a cache or upload buffer to a gateway.
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
     * import com.pulumi.aws.storagegateway.StoragegatewayFunctions;
     * import com.pulumi.aws.storagegateway.inputs.GetLocalDiskArgs;
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
     *         final var test = StoragegatewayFunctions.getLocalDisk(GetLocalDiskArgs.builder()
     *             .diskPath(testAwsVolumeAttachment.deviceName())
     *             .gatewayArn(testAwsStoragegatewayGateway.arn())
     *             .build());
     * 
     *     }
     * }
     * ```
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetLocalDiskResult> getLocalDiskPlain(GetLocalDiskPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:storagegateway/getLocalDisk:getLocalDisk", TypeShape.of(GetLocalDiskResult.class), args, Utilities.withVersion(options));
    }
}
