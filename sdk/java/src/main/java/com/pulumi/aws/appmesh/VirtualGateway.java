// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appmesh.VirtualGatewayArgs;
import com.pulumi.aws.appmesh.inputs.VirtualGatewayState;
import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpec;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an AWS App Mesh virtual gateway resource.
 * 
 * ## Example Usage
 * 
 * ### Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.appmesh.VirtualGateway;
 * import com.pulumi.aws.appmesh.VirtualGatewayArgs;
 * import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecArgs;
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
 *         var example = new VirtualGateway("example", VirtualGatewayArgs.builder()
 *             .name("example-virtual-gateway")
 *             .meshName("example-service-mesh")
 *             .spec(VirtualGatewaySpecArgs.builder()
 *                 .listeners(VirtualGatewaySpecListenerArgs.builder()
 *                     .portMapping(VirtualGatewaySpecListenerPortMappingArgs.builder()
 *                         .port(8080)
 *                         .protocol("http")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .tags(Map.of("Environment", "test"))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Access Logs and TLS
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.appmesh.VirtualGateway;
 * import com.pulumi.aws.appmesh.VirtualGatewayArgs;
 * import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecArgs;
 * import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingArgs;
 * import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogArgs;
 * import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogFileArgs;
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
 *         var example = new VirtualGateway("example", VirtualGatewayArgs.builder()
 *             .name("example-virtual-gateway")
 *             .meshName("example-service-mesh")
 *             .spec(VirtualGatewaySpecArgs.builder()
 *                 .listeners(VirtualGatewaySpecListenerArgs.builder()
 *                     .portMapping(VirtualGatewaySpecListenerPortMappingArgs.builder()
 *                         .port(8080)
 *                         .protocol("http")
 *                         .build())
 *                     .tls(VirtualGatewaySpecListenerTlsArgs.builder()
 *                         .certificate(VirtualGatewaySpecListenerTlsCertificateArgs.builder()
 *                             .acm(VirtualGatewaySpecListenerTlsCertificateAcmArgs.builder()
 *                                 .certificateArn(exampleAwsAcmCertificate.arn())
 *                                 .build())
 *                             .build())
 *                         .mode("STRICT")
 *                         .build())
 *                     .build())
 *                 .logging(VirtualGatewaySpecLoggingArgs.builder()
 *                     .accessLog(VirtualGatewaySpecLoggingAccessLogArgs.builder()
 *                         .file(VirtualGatewaySpecLoggingAccessLogFileArgs.builder()
 *                             .path("/var/log/access.log")
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import App Mesh virtual gateway using `mesh_name` together with the virtual gateway&#39;s `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:appmesh/virtualGateway:VirtualGateway example mesh/gw1
 * ```
 * 
 */
@ResourceType(type="aws:appmesh/virtualGateway:VirtualGateway")
public class VirtualGateway extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the virtual gateway.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the virtual gateway.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Creation date of the virtual gateway.
     * 
     */
    @Export(name="createdDate", refs={String.class}, tree="[0]")
    private Output<String> createdDate;

    /**
     * @return Creation date of the virtual gateway.
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * Last update date of the virtual gateway.
     * 
     */
    @Export(name="lastUpdatedDate", refs={String.class}, tree="[0]")
    private Output<String> lastUpdatedDate;

    /**
     * @return Last update date of the virtual gateway.
     * 
     */
    public Output<String> lastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * Name of the service mesh in which to create the virtual gateway. Must be between 1 and 255 characters in length.
     * 
     */
    @Export(name="meshName", refs={String.class}, tree="[0]")
    private Output<String> meshName;

    /**
     * @return Name of the service mesh in which to create the virtual gateway. Must be between 1 and 255 characters in length.
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
     * Name to use for the virtual gateway. Must be between 1 and 255 characters in length.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name to use for the virtual gateway. Must be between 1 and 255 characters in length.
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
     * Virtual gateway specification to apply.
     * 
     */
    @Export(name="spec", refs={VirtualGatewaySpec.class}, tree="[0]")
    private Output<VirtualGatewaySpec> spec;

    /**
     * @return Virtual gateway specification to apply.
     * 
     */
    public Output<VirtualGatewaySpec> spec() {
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualGateway(String name) {
        this(name, VirtualGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualGateway(String name, VirtualGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualGateway(String name, VirtualGatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appmesh/virtualGateway:VirtualGateway", name, args == null ? VirtualGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualGateway(String name, Output<String> id, @Nullable VirtualGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appmesh/virtualGateway:VirtualGateway", name, state, makeResourceOptions(options, id));
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
    public static VirtualGateway get(String name, Output<String> id, @Nullable VirtualGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualGateway(name, id, state, options);
    }
}
