// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.directconnect.HostedTransitVirtualInterfaceAcceptorArgs;
import com.pulumi.aws.directconnect.inputs.HostedTransitVirtualInterfaceAcceptorState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage the accepter&#39;s side of a Direct Connect hosted transit virtual interface.
 * This resource accepts ownership of a transit virtual interface created by another AWS account.
 * 
 * &gt; **NOTE:** AWS allows a Direct Connect hosted transit virtual interface to be deleted from either the allocator&#39;s or accepter&#39;s side. However, this provider only allows the Direct Connect hosted transit virtual interface to be deleted from the allocator&#39;s side by removing the corresponding `aws.directconnect.HostedTransitVirtualInterface` resource from your configuration. Removing a `aws.directconnect.HostedTransitVirtualInterfaceAcceptor` resource from your configuration will remove it from your statefile and management, **but will not delete the Direct Connect virtual interface.**
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetCallerIdentityArgs;
 * import com.pulumi.aws.directconnect.HostedTransitVirtualInterface;
 * import com.pulumi.aws.directconnect.HostedTransitVirtualInterfaceArgs;
 * import com.pulumi.aws.directconnect.Gateway;
 * import com.pulumi.aws.directconnect.GatewayArgs;
 * import com.pulumi.aws.directconnect.HostedTransitVirtualInterfaceAcceptor;
 * import com.pulumi.aws.directconnect.HostedTransitVirtualInterfaceAcceptorArgs;
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
 *         final var accepter = AwsFunctions.getCallerIdentity();
 * 
 *         var creator = new HostedTransitVirtualInterface(&#34;creator&#34;, HostedTransitVirtualInterfaceArgs.builder()        
 *             .connectionId(&#34;dxcon-zzzzzzzz&#34;)
 *             .ownerAccountId(accepter.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId()))
 *             .name(&#34;tf-transit-vif-example&#34;)
 *             .vlan(4094)
 *             .addressFamily(&#34;ipv4&#34;)
 *             .bgpAsn(65352)
 *             .build());
 * 
 *         var example = new Gateway(&#34;example&#34;, GatewayArgs.builder()        
 *             .name(&#34;tf-dxg-example&#34;)
 *             .amazonSideAsn(64512)
 *             .build());
 * 
 *         var accepterHostedTransitVirtualInterfaceAcceptor = new HostedTransitVirtualInterfaceAcceptor(&#34;accepterHostedTransitVirtualInterfaceAcceptor&#34;, HostedTransitVirtualInterfaceAcceptorArgs.builder()        
 *             .virtualInterfaceId(creator.id())
 *             .dxGatewayId(example.id())
 *             .tags(Map.of(&#34;Side&#34;, &#34;Accepter&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Direct Connect hosted transit virtual interfaces using the VIF `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:directconnect/hostedTransitVirtualInterfaceAcceptor:HostedTransitVirtualInterfaceAcceptor test dxvif-33cc44dd
 * ```
 * 
 */
@ResourceType(type="aws:directconnect/hostedTransitVirtualInterfaceAcceptor:HostedTransitVirtualInterfaceAcceptor")
public class HostedTransitVirtualInterfaceAcceptor extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the virtual interface.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the virtual interface.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ID of the Direct Connect gateway to which to connect the virtual interface.
     * 
     */
    @Export(name="dxGatewayId", refs={String.class}, tree="[0]")
    private Output<String> dxGatewayId;

    /**
     * @return The ID of the Direct Connect gateway to which to connect the virtual interface.
     * 
     */
    public Output<String> dxGatewayId() {
        return this.dxGatewayId;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The ID of the Direct Connect virtual interface to accept.
     * 
     */
    @Export(name="virtualInterfaceId", refs={String.class}, tree="[0]")
    private Output<String> virtualInterfaceId;

    /**
     * @return The ID of the Direct Connect virtual interface to accept.
     * 
     */
    public Output<String> virtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HostedTransitVirtualInterfaceAcceptor(String name) {
        this(name, HostedTransitVirtualInterfaceAcceptorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostedTransitVirtualInterfaceAcceptor(String name, HostedTransitVirtualInterfaceAcceptorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostedTransitVirtualInterfaceAcceptor(String name, HostedTransitVirtualInterfaceAcceptorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/hostedTransitVirtualInterfaceAcceptor:HostedTransitVirtualInterfaceAcceptor", name, args == null ? HostedTransitVirtualInterfaceAcceptorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HostedTransitVirtualInterfaceAcceptor(String name, Output<String> id, @Nullable HostedTransitVirtualInterfaceAcceptorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/hostedTransitVirtualInterfaceAcceptor:HostedTransitVirtualInterfaceAcceptor", name, state, makeResourceOptions(options, id));
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
    public static HostedTransitVirtualInterfaceAcceptor get(String name, Output<String> id, @Nullable HostedTransitVirtualInterfaceAcceptorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HostedTransitVirtualInterfaceAcceptor(name, id, state, options);
    }
}
