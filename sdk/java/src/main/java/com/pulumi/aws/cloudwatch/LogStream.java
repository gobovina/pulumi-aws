// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudwatch.LogStreamArgs;
import com.pulumi.aws.cloudwatch.inputs.LogStreamState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a CloudWatch Log Stream resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudwatch.LogGroup;
 * import com.pulumi.aws.cloudwatch.LogStream;
 * import com.pulumi.aws.cloudwatch.LogStreamArgs;
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
 *         var yada = new LogGroup(&#34;yada&#34;);
 * 
 *         var foo = new LogStream(&#34;foo&#34;, LogStreamArgs.builder()        
 *             .logGroupName(yada.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Cloudwatch Log Stream using the stream&#39;s `log_group_name` and `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/logStream:LogStream foo Yada:SampleLogStream1234
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/logStream:LogStream")
public class LogStream extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) specifying the log stream.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) specifying the log stream.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of the log group under which the log stream is to be created.
     * 
     */
    @Export(name="logGroupName", refs={String.class}, tree="[0]")
    private Output<String> logGroupName;

    /**
     * @return The name of the log group under which the log stream is to be created.
     * 
     */
    public Output<String> logGroupName() {
        return this.logGroupName;
    }
    /**
     * The name of the log stream. Must not be longer than 512 characters and must not contain `:`
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the log stream. Must not be longer than 512 characters and must not contain `:`
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogStream(String name) {
        this(name, LogStreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogStream(String name, LogStreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogStream(String name, LogStreamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logStream:LogStream", name, args == null ? LogStreamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogStream(String name, Output<String> id, @Nullable LogStreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logStream:LogStream", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LogStream get(String name, Output<String> id, @Nullable LogStreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogStream(name, id, state, options);
    }
}
