// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.vpclattice;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.vpclattice.TargetGroupArgs;
import com.pulumi.aws.vpclattice.inputs.TargetGroupState;
import com.pulumi.aws.vpclattice.outputs.TargetGroupConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS VPC Lattice Target Group.
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
 * import com.pulumi.aws.vpclattice.TargetGroup;
 * import com.pulumi.aws.vpclattice.TargetGroupArgs;
 * import com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs;
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
 *         var example = new TargetGroup(&#34;example&#34;, TargetGroupArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .type(&#34;INSTANCE&#34;)
 *             .config(TargetGroupConfigArgs.builder()
 *                 .vpcIdentifier(exampleAwsVpc.id())
 *                 .port(443)
 *                 .protocol(&#34;HTTPS&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Basic usage with Health check
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.vpclattice.TargetGroup;
 * import com.pulumi.aws.vpclattice.TargetGroupArgs;
 * import com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs;
 * import com.pulumi.aws.vpclattice.inputs.TargetGroupConfigHealthCheckArgs;
 * import com.pulumi.aws.vpclattice.inputs.TargetGroupConfigHealthCheckMatcherArgs;
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
 *         var example = new TargetGroup(&#34;example&#34;, TargetGroupArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .type(&#34;IP&#34;)
 *             .config(TargetGroupConfigArgs.builder()
 *                 .vpcIdentifier(exampleAwsVpc.id())
 *                 .ipAddressType(&#34;IPV4&#34;)
 *                 .port(443)
 *                 .protocol(&#34;HTTPS&#34;)
 *                 .protocolVersion(&#34;HTTP1&#34;)
 *                 .healthCheck(TargetGroupConfigHealthCheckArgs.builder()
 *                     .enabled(true)
 *                     .healthCheckIntervalSeconds(20)
 *                     .healthCheckTimeoutSeconds(10)
 *                     .healthyThresholdCount(7)
 *                     .unhealthyThresholdCount(3)
 *                     .matcher(TargetGroupConfigHealthCheckMatcherArgs.builder()
 *                         .value(&#34;200-299&#34;)
 *                         .build())
 *                     .path(&#34;/instance&#34;)
 *                     .port(80)
 *                     .protocol(&#34;HTTP&#34;)
 *                     .protocolVersion(&#34;HTTP1&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### ALB
 * 
 * If the type is ALB, `health_check` block is not supported.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.vpclattice.TargetGroup;
 * import com.pulumi.aws.vpclattice.TargetGroupArgs;
 * import com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs;
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
 *         var example = new TargetGroup(&#34;example&#34;, TargetGroupArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .type(&#34;ALB&#34;)
 *             .config(TargetGroupConfigArgs.builder()
 *                 .vpcIdentifier(exampleAwsVpc.id())
 *                 .port(443)
 *                 .protocol(&#34;HTTPS&#34;)
 *                 .protocolVersion(&#34;HTTP1&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Lambda
 * 
 * If the type is Lambda, `config` block is not supported.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.vpclattice.TargetGroup;
 * import com.pulumi.aws.vpclattice.TargetGroupArgs;
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
 *         var example = new TargetGroup(&#34;example&#34;, TargetGroupArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .type(&#34;LAMBDA&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import VPC Lattice Target Group using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:vpclattice/targetGroup:TargetGroup example tg-0c11d4dc16ed96bdb
 * ```
 * 
 */
@ResourceType(type="aws:vpclattice/targetGroup:TargetGroup")
public class TargetGroup extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the target group.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the target group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The target group configuration.
     * 
     */
    @Export(name="config", refs={TargetGroupConfig.class}, tree="[0]")
    private Output</* @Nullable */ TargetGroupConfig> config;

    /**
     * @return The target group configuration.
     * 
     */
    public Output<Optional<TargetGroupConfig>> config() {
        return Codegen.optional(this.config);
    }
    /**
     * The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-). You can&#39;t use a hyphen as the first or last character, or immediately after another hyphen.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-). You can&#39;t use a hyphen as the first or last character, or immediately after another hyphen.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Status of the target group.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the target group.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The type of target group. Valid Values are `IP` | `LAMBDA` | `INSTANCE` | `ALB`
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of target group. Valid Values are `IP` | `LAMBDA` | `INSTANCE` | `ALB`
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TargetGroup(String name) {
        this(name, TargetGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TargetGroup(String name, TargetGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TargetGroup(String name, TargetGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:vpclattice/targetGroup:TargetGroup", name, args == null ? TargetGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TargetGroup(String name, Output<String> id, @Nullable TargetGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:vpclattice/targetGroup:TargetGroup", name, state, makeResourceOptions(options, id));
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
    public static TargetGroup get(String name, Output<String> id, @Nullable TargetGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TargetGroup(name, id, state, options);
    }
}
