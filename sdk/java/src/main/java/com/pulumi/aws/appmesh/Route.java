// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appmesh.RouteArgs;
import com.pulumi.aws.appmesh.inputs.RouteState;
import com.pulumi.aws.appmesh.outputs.RouteSpec;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an AWS App Mesh route resource.
 * 
 * ## Example Usage
 * ### HTTP Routing
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.appmesh.Route;
 * import com.pulumi.aws.appmesh.RouteArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteActionArgs;
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
 *         var serviceb = new Route(&#34;serviceb&#34;, RouteArgs.builder()        
 *             .name(&#34;serviceB-route&#34;)
 *             .meshName(simple.id())
 *             .virtualRouterName(servicebAwsAppmeshVirtualRouter.name())
 *             .spec(RouteSpecArgs.builder()
 *                 .httpRoute(RouteSpecHttpRouteArgs.builder()
 *                     .match(RouteSpecHttpRouteMatchArgs.builder()
 *                         .prefix(&#34;/&#34;)
 *                         .build())
 *                     .action(RouteSpecHttpRouteActionArgs.builder()
 *                         .weightedTargets(                        
 *                             RouteSpecHttpRouteActionWeightedTargetArgs.builder()
 *                                 .virtualNode(serviceb1.name())
 *                                 .weight(90)
 *                                 .build(),
 *                             RouteSpecHttpRouteActionWeightedTargetArgs.builder()
 *                                 .virtualNode(serviceb2.name())
 *                                 .weight(10)
 *                                 .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### HTTP Header Routing
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.appmesh.Route;
 * import com.pulumi.aws.appmesh.RouteArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteActionArgs;
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
 *         var serviceb = new Route(&#34;serviceb&#34;, RouteArgs.builder()        
 *             .name(&#34;serviceB-route&#34;)
 *             .meshName(simple.id())
 *             .virtualRouterName(servicebAwsAppmeshVirtualRouter.name())
 *             .spec(RouteSpecArgs.builder()
 *                 .httpRoute(RouteSpecHttpRouteArgs.builder()
 *                     .match(RouteSpecHttpRouteMatchArgs.builder()
 *                         .method(&#34;POST&#34;)
 *                         .prefix(&#34;/&#34;)
 *                         .scheme(&#34;https&#34;)
 *                         .headers(RouteSpecHttpRouteMatchHeaderArgs.builder()
 *                             .name(&#34;clientRequestId&#34;)
 *                             .match(RouteSpecHttpRouteMatchHeaderMatchArgs.builder()
 *                                 .prefix(&#34;123&#34;)
 *                                 .build())
 *                             .build())
 *                         .build())
 *                     .action(RouteSpecHttpRouteActionArgs.builder()
 *                         .weightedTargets(RouteSpecHttpRouteActionWeightedTargetArgs.builder()
 *                             .virtualNode(servicebAwsAppmeshVirtualNode.name())
 *                             .weight(100)
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Retry Policy
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.appmesh.Route;
 * import com.pulumi.aws.appmesh.RouteArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteRetryPolicyArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteRetryPolicyPerRetryTimeoutArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteActionArgs;
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
 *         var serviceb = new Route(&#34;serviceb&#34;, RouteArgs.builder()        
 *             .name(&#34;serviceB-route&#34;)
 *             .meshName(simple.id())
 *             .virtualRouterName(servicebAwsAppmeshVirtualRouter.name())
 *             .spec(RouteSpecArgs.builder()
 *                 .httpRoute(RouteSpecHttpRouteArgs.builder()
 *                     .match(RouteSpecHttpRouteMatchArgs.builder()
 *                         .prefix(&#34;/&#34;)
 *                         .build())
 *                     .retryPolicy(RouteSpecHttpRouteRetryPolicyArgs.builder()
 *                         .httpRetryEvents(&#34;server-error&#34;)
 *                         .maxRetries(1)
 *                         .perRetryTimeout(RouteSpecHttpRouteRetryPolicyPerRetryTimeoutArgs.builder()
 *                             .unit(&#34;s&#34;)
 *                             .value(15)
 *                             .build())
 *                         .build())
 *                     .action(RouteSpecHttpRouteActionArgs.builder()
 *                         .weightedTargets(RouteSpecHttpRouteActionWeightedTargetArgs.builder()
 *                             .virtualNode(servicebAwsAppmeshVirtualNode.name())
 *                             .weight(100)
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### TCP Routing
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.appmesh.Route;
 * import com.pulumi.aws.appmesh.RouteArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteArgs;
 * import com.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteActionArgs;
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
 *         var serviceb = new Route(&#34;serviceb&#34;, RouteArgs.builder()        
 *             .name(&#34;serviceB-route&#34;)
 *             .meshName(simple.id())
 *             .virtualRouterName(servicebAwsAppmeshVirtualRouter.name())
 *             .spec(RouteSpecArgs.builder()
 *                 .tcpRoute(RouteSpecTcpRouteArgs.builder()
 *                     .action(RouteSpecTcpRouteActionArgs.builder()
 *                         .weightedTargets(RouteSpecTcpRouteActionWeightedTargetArgs.builder()
 *                             .virtualNode(serviceb1.name())
 *                             .weight(100)
 *                             .build())
 *                         .build())
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
 * Using `pulumi import`, import App Mesh virtual routes using `mesh_name` and `virtual_router_name` together with the route&#39;s `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:appmesh/route:Route serviceb simpleapp/serviceB/serviceB-route
 * ```
 * 
 */
@ResourceType(type="aws:appmesh/route:Route")
public class Route extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the route.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the route.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Creation date of the route.
     * 
     */
    @Export(name="createdDate", refs={String.class}, tree="[0]")
    private Output<String> createdDate;

    /**
     * @return Creation date of the route.
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * Last update date of the route.
     * 
     */
    @Export(name="lastUpdatedDate", refs={String.class}, tree="[0]")
    private Output<String> lastUpdatedDate;

    /**
     * @return Last update date of the route.
     * 
     */
    public Output<String> lastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * Name of the service mesh in which to create the route. Must be between 1 and 255 characters in length.
     * 
     */
    @Export(name="meshName", refs={String.class}, tree="[0]")
    private Output<String> meshName;

    /**
     * @return Name of the service mesh in which to create the route. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> meshName() {
        return this.meshName;
    }
    /**
     * AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the AWS provider is currently connected to.
     * 
     */
    @Export(name="meshOwner", refs={String.class}, tree="[0]")
    private Output<String> meshOwner;

    /**
     * @return AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the AWS provider is currently connected to.
     * 
     */
    public Output<String> meshOwner() {
        return this.meshOwner;
    }
    /**
     * Name to use for the route. Must be between 1 and 255 characters in length.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name to use for the route. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Resource owner&#39;s AWS account ID.
     * 
     */
    @Export(name="resourceOwner", refs={String.class}, tree="[0]")
    private Output<String> resourceOwner;

    /**
     * @return Resource owner&#39;s AWS account ID.
     * 
     */
    public Output<String> resourceOwner() {
        return this.resourceOwner;
    }
    /**
     * Route specification to apply.
     * 
     */
    @Export(name="spec", refs={RouteSpec.class}, tree="[0]")
    private Output<RouteSpec> spec;

    /**
     * @return Route specification to apply.
     * 
     */
    public Output<RouteSpec> spec() {
        return this.spec;
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Name of the virtual router in which to create the route. Must be between 1 and 255 characters in length.
     * 
     */
    @Export(name="virtualRouterName", refs={String.class}, tree="[0]")
    private Output<String> virtualRouterName;

    /**
     * @return Name of the virtual router in which to create the route. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> virtualRouterName() {
        return this.virtualRouterName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Route(String name) {
        this(name, RouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Route(String name, RouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Route(String name, RouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appmesh/route:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Route(String name, Output<String> id, @Nullable RouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appmesh/route:Route", name, state, makeResourceOptions(options, id));
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
    public static Route get(String name, Output<String> id, @Nullable RouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Route(name, id, state, options);
    }
}
