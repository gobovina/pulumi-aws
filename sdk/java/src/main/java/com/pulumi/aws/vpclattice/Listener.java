// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.vpclattice;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.vpclattice.ListenerArgs;
import com.pulumi.aws.vpclattice.inputs.ListenerState;
import com.pulumi.aws.vpclattice.outputs.ListenerDefaultAction;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS VPC Lattice Listener.
 * 
 * ## Example Usage
 * ### Fixed response action
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.vpclattice.Service;
 * import com.pulumi.aws.vpclattice.Listener;
 * import com.pulumi.aws.vpclattice.ListenerArgs;
 * import com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs;
 * import com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionFixedResponseArgs;
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
 *         var exampleService = new Service(&#34;exampleService&#34;);
 * 
 *         var exampleListener = new Listener(&#34;exampleListener&#34;, ListenerArgs.builder()        
 *             .protocol(&#34;HTTPS&#34;)
 *             .serviceIdentifier(exampleService.id())
 *             .defaultAction(ListenerDefaultActionArgs.builder()
 *                 .fixedResponse(ListenerDefaultActionFixedResponseArgs.builder()
 *                     .statusCode(404)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Forward action
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.vpclattice.Service;
 * import com.pulumi.aws.vpclattice.TargetGroup;
 * import com.pulumi.aws.vpclattice.TargetGroupArgs;
 * import com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs;
 * import com.pulumi.aws.vpclattice.Listener;
 * import com.pulumi.aws.vpclattice.ListenerArgs;
 * import com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs;
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
 *         var exampleService = new Service(&#34;exampleService&#34;);
 * 
 *         var exampleTargetGroup = new TargetGroup(&#34;exampleTargetGroup&#34;, TargetGroupArgs.builder()        
 *             .type(&#34;INSTANCE&#34;)
 *             .config(TargetGroupConfigArgs.builder()
 *                 .port(80)
 *                 .protocol(&#34;HTTP&#34;)
 *                 .vpcIdentifier(aws_vpc.example().id())
 *                 .build())
 *             .build());
 * 
 *         var exampleListener = new Listener(&#34;exampleListener&#34;, ListenerArgs.builder()        
 *             .protocol(&#34;HTTP&#34;)
 *             .serviceIdentifier(exampleService.id())
 *             .defaultAction(ListenerDefaultActionArgs.builder()
 *                 .forwards(ListenerDefaultActionForwardArgs.builder()
 *                     .targetGroups(ListenerDefaultActionForwardTargetGroupArgs.builder()
 *                         .targetGroupIdentifier(exampleTargetGroup.id())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Forward action with weighted target groups
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.vpclattice.Service;
 * import com.pulumi.aws.vpclattice.TargetGroup;
 * import com.pulumi.aws.vpclattice.TargetGroupArgs;
 * import com.pulumi.aws.vpclattice.inputs.TargetGroupConfigArgs;
 * import com.pulumi.aws.vpclattice.Listener;
 * import com.pulumi.aws.vpclattice.ListenerArgs;
 * import com.pulumi.aws.vpclattice.inputs.ListenerDefaultActionArgs;
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
 *         var exampleService = new Service(&#34;exampleService&#34;);
 * 
 *         var example1 = new TargetGroup(&#34;example1&#34;, TargetGroupArgs.builder()        
 *             .type(&#34;INSTANCE&#34;)
 *             .config(TargetGroupConfigArgs.builder()
 *                 .port(80)
 *                 .protocol(&#34;HTTP&#34;)
 *                 .vpcIdentifier(aws_vpc.example().id())
 *                 .build())
 *             .build());
 * 
 *         var example2 = new TargetGroup(&#34;example2&#34;, TargetGroupArgs.builder()        
 *             .type(&#34;INSTANCE&#34;)
 *             .config(TargetGroupConfigArgs.builder()
 *                 .port(8080)
 *                 .protocol(&#34;HTTP&#34;)
 *                 .vpcIdentifier(aws_vpc.example().id())
 *                 .build())
 *             .build());
 * 
 *         var exampleListener = new Listener(&#34;exampleListener&#34;, ListenerArgs.builder()        
 *             .protocol(&#34;HTTP&#34;)
 *             .serviceIdentifier(exampleService.id())
 *             .defaultAction(ListenerDefaultActionArgs.builder()
 *                 .forwards(ListenerDefaultActionForwardArgs.builder()
 *                     .targetGroups(                    
 *                         ListenerDefaultActionForwardTargetGroupArgs.builder()
 *                             .targetGroupIdentifier(example1.id())
 *                             .weight(80)
 *                             .build(),
 *                         ListenerDefaultActionForwardTargetGroupArgs.builder()
 *                             .targetGroupIdentifier(example2.id())
 *                             .weight(20)
 *                             .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import VPC Lattice Listener using the `listener_id` of the listener and the `id` of the VPC Lattice service combined with a `/` character. For example:
 * 
 * ```sh
 *  $ pulumi import aws:vpclattice/listener:Listener example svc-1a2b3c4d/listener-987654321
 * ```
 * 
 */
@ResourceType(type="aws:vpclattice/listener:Listener")
public class Listener extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the listener.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the listener.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Date and time that the listener was created, specified in ISO-8601 format.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Date and time that the listener was created, specified in ISO-8601 format.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Default action block for the default listener rule. Default action blocks are defined below.
     * 
     */
    @Export(name="defaultAction", refs={ListenerDefaultAction.class}, tree="[0]")
    private Output<ListenerDefaultAction> defaultAction;

    /**
     * @return Default action block for the default listener rule. Default action blocks are defined below.
     * 
     */
    public Output<ListenerDefaultAction> defaultAction() {
        return this.defaultAction;
    }
    @Export(name="lastUpdatedAt", refs={String.class}, tree="[0]")
    private Output<String> lastUpdatedAt;

    public Output<String> lastUpdatedAt() {
        return this.lastUpdatedAt;
    }
    /**
     * Standalone ID of the listener, e.g. `listener-0a1b2c3d4e5f6g`.
     * 
     */
    @Export(name="listenerId", refs={String.class}, tree="[0]")
    private Output<String> listenerId;

    /**
     * @return Standalone ID of the listener, e.g. `listener-0a1b2c3d4e5f6g`.
     * 
     */
    public Output<String> listenerId() {
        return this.listenerId;
    }
    /**
     * Name of the listener. A listener name must be unique within a service. Valid characters are a-z, 0-9, and hyphens (-). You can&#39;t use a hyphen as the first or last character, or immediately after another hyphen.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the listener. A listener name must be unique within a service. Valid characters are a-z, 0-9, and hyphens (-). You can&#39;t use a hyphen as the first or last character, or immediately after another hyphen.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Listener port. You can specify a value from 1 to 65535. If `port` is not specified and `protocol` is HTTP, the value will default to 80. If `port` is not specified and `protocol` is HTTPS, the value will default to 443.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output<Integer> port;

    /**
     * @return Listener port. You can specify a value from 1 to 65535. If `port` is not specified and `protocol` is HTTP, the value will default to 80. If `port` is not specified and `protocol` is HTTPS, the value will default to 443.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * Protocol for the listener. Supported values are `HTTP` or `HTTPS`
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output<String> protocol;

    /**
     * @return Protocol for the listener. Supported values are `HTTP` or `HTTPS`
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * Amazon Resource Name (ARN) of the VPC Lattice service. You must include either the `service_arn` or `service_identifier` arguments.
     * 
     */
    @Export(name="serviceArn", refs={String.class}, tree="[0]")
    private Output<String> serviceArn;

    /**
     * @return Amazon Resource Name (ARN) of the VPC Lattice service. You must include either the `service_arn` or `service_identifier` arguments.
     * 
     */
    public Output<String> serviceArn() {
        return this.serviceArn;
    }
    /**
     * ID of the VPC Lattice service. You must include either the `service_arn` or `service_identifier` arguments.
     * &gt; **NOTE:** You must specify one of the following arguments: `service_arn` or `service_identifier`.
     * 
     */
    @Export(name="serviceIdentifier", refs={String.class}, tree="[0]")
    private Output<String> serviceIdentifier;

    /**
     * @return ID of the VPC Lattice service. You must include either the `service_arn` or `service_identifier` arguments.
     * &gt; **NOTE:** You must specify one of the following arguments: `service_arn` or `service_identifier`.
     * 
     */
    public Output<String> serviceIdentifier() {
        return this.serviceIdentifier;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Listener(String name) {
        this(name, ListenerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Listener(String name, ListenerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Listener(String name, ListenerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:vpclattice/listener:Listener", name, args == null ? ListenerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Listener(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:vpclattice/listener:Listener", name, state, makeResourceOptions(options, id));
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
    public static Listener get(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Listener(name, id, state, options);
    }
}
