// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appmesh.VirtualServiceArgs;
import com.pulumi.aws.appmesh.inputs.VirtualServiceState;
import com.pulumi.aws.appmesh.outputs.VirtualServiceSpec;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an AWS App Mesh virtual service resource.
 * 
 * ## Example Usage
 * ### Virtual Node Provider
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.appmesh.VirtualService;
 * import com.pulumi.aws.appmesh.VirtualServiceArgs;
 * import com.pulumi.aws.appmesh.inputs.VirtualServiceSpecArgs;
 * import com.pulumi.aws.appmesh.inputs.VirtualServiceSpecProviderArgs;
 * import com.pulumi.aws.appmesh.inputs.VirtualServiceSpecProviderVirtualNodeArgs;
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
 *         var servicea = new VirtualService(&#34;servicea&#34;, VirtualServiceArgs.builder()        
 *             .meshName(aws_appmesh_mesh.simple().id())
 *             .spec(VirtualServiceSpecArgs.builder()
 *                 .provider(VirtualServiceSpecProviderArgs.builder()
 *                     .virtualNode(VirtualServiceSpecProviderVirtualNodeArgs.builder()
 *                         .virtualNodeName(aws_appmesh_virtual_node.serviceb1().name())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Virtual Router Provider
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.appmesh.VirtualService;
 * import com.pulumi.aws.appmesh.VirtualServiceArgs;
 * import com.pulumi.aws.appmesh.inputs.VirtualServiceSpecArgs;
 * import com.pulumi.aws.appmesh.inputs.VirtualServiceSpecProviderArgs;
 * import com.pulumi.aws.appmesh.inputs.VirtualServiceSpecProviderVirtualRouterArgs;
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
 *         var servicea = new VirtualService(&#34;servicea&#34;, VirtualServiceArgs.builder()        
 *             .meshName(aws_appmesh_mesh.simple().id())
 *             .spec(VirtualServiceSpecArgs.builder()
 *                 .provider(VirtualServiceSpecProviderArgs.builder()
 *                     .virtualRouter(VirtualServiceSpecProviderVirtualRouterArgs.builder()
 *                         .virtualRouterName(aws_appmesh_virtual_router.serviceb().name())
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
 * Using `pulumi import`, import App Mesh virtual services using `mesh_name` together with the virtual service&#39;s `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:appmesh/virtualService:VirtualService servicea simpleapp/servicea.simpleapp.local
 * ```
 * 
 */
@ResourceType(type="aws:appmesh/virtualService:VirtualService")
public class VirtualService extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the virtual service.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the virtual service.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Creation date of the virtual service.
     * 
     */
    @Export(name="createdDate", refs={String.class}, tree="[0]")
    private Output<String> createdDate;

    /**
     * @return Creation date of the virtual service.
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * Last update date of the virtual service.
     * 
     */
    @Export(name="lastUpdatedDate", refs={String.class}, tree="[0]")
    private Output<String> lastUpdatedDate;

    /**
     * @return Last update date of the virtual service.
     * 
     */
    public Output<String> lastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * Name of the service mesh in which to create the virtual service. Must be between 1 and 255 characters in length.
     * 
     */
    @Export(name="meshName", refs={String.class}, tree="[0]")
    private Output<String> meshName;

    /**
     * @return Name of the service mesh in which to create the virtual service. Must be between 1 and 255 characters in length.
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
     * Name to use for the virtual service. Must be between 1 and 255 characters in length.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name to use for the virtual service. Must be between 1 and 255 characters in length.
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
     * Virtual service specification to apply.
     * 
     */
    @Export(name="spec", refs={VirtualServiceSpec.class}, tree="[0]")
    private Output<VirtualServiceSpec> spec;

    /**
     * @return Virtual service specification to apply.
     * 
     */
    public Output<VirtualServiceSpec> spec() {
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
     */
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualService(String name) {
        this(name, VirtualServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualService(String name, VirtualServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualService(String name, VirtualServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appmesh/virtualService:VirtualService", name, args == null ? VirtualServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualService(String name, Output<String> id, @Nullable VirtualServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appmesh/virtualService:VirtualService", name, state, makeResourceOptions(options, id));
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
    public static VirtualService get(String name, Output<String> id, @Nullable VirtualServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualService(name, id, state, options);
    }
}
