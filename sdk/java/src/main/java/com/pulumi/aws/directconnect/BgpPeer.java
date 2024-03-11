// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.directconnect.BgpPeerArgs;
import com.pulumi.aws.directconnect.inputs.BgpPeerState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Direct Connect BGP peer resource.
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
 * import com.pulumi.aws.directconnect.BgpPeer;
 * import com.pulumi.aws.directconnect.BgpPeerArgs;
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
 *         var peer = new BgpPeer(&#34;peer&#34;, BgpPeerArgs.builder()        
 *             .virtualInterfaceId(foo.id())
 *             .addressFamily(&#34;ipv6&#34;)
 *             .bgpAsn(65351)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="aws:directconnect/bgpPeer:BgpPeer")
public class BgpPeer extends com.pulumi.resources.CustomResource {
    /**
     * The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    @Export(name="addressFamily", refs={String.class}, tree="[0]")
    private Output<String> addressFamily;

    /**
     * @return The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    public Output<String> addressFamily() {
        return this.addressFamily;
    }
    /**
     * The IPv4 CIDR address to use to send traffic to Amazon.
     * Required for IPv4 BGP peers on public virtual interfaces.
     * 
     */
    @Export(name="amazonAddress", refs={String.class}, tree="[0]")
    private Output<String> amazonAddress;

    /**
     * @return The IPv4 CIDR address to use to send traffic to Amazon.
     * Required for IPv4 BGP peers on public virtual interfaces.
     * 
     */
    public Output<String> amazonAddress() {
        return this.amazonAddress;
    }
    /**
     * The Direct Connect endpoint on which the BGP peer terminates.
     * 
     */
    @Export(name="awsDevice", refs={String.class}, tree="[0]")
    private Output<String> awsDevice;

    /**
     * @return The Direct Connect endpoint on which the BGP peer terminates.
     * 
     */
    public Output<String> awsDevice() {
        return this.awsDevice;
    }
    /**
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    @Export(name="bgpAsn", refs={Integer.class}, tree="[0]")
    private Output<Integer> bgpAsn;

    /**
     * @return The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    public Output<Integer> bgpAsn() {
        return this.bgpAsn;
    }
    /**
     * The authentication key for BGP configuration.
     * 
     */
    @Export(name="bgpAuthKey", refs={String.class}, tree="[0]")
    private Output<String> bgpAuthKey;

    /**
     * @return The authentication key for BGP configuration.
     * 
     */
    public Output<String> bgpAuthKey() {
        return this.bgpAuthKey;
    }
    /**
     * The ID of the BGP peer.
     * 
     */
    @Export(name="bgpPeerId", refs={String.class}, tree="[0]")
    private Output<String> bgpPeerId;

    /**
     * @return The ID of the BGP peer.
     * 
     */
    public Output<String> bgpPeerId() {
        return this.bgpPeerId;
    }
    /**
     * The Up/Down state of the BGP peer.
     * 
     */
    @Export(name="bgpStatus", refs={String.class}, tree="[0]")
    private Output<String> bgpStatus;

    /**
     * @return The Up/Down state of the BGP peer.
     * 
     */
    public Output<String> bgpStatus() {
        return this.bgpStatus;
    }
    /**
     * The IPv4 CIDR destination address to which Amazon should send traffic.
     * Required for IPv4 BGP peers on public virtual interfaces.
     * 
     */
    @Export(name="customerAddress", refs={String.class}, tree="[0]")
    private Output<String> customerAddress;

    /**
     * @return The IPv4 CIDR destination address to which Amazon should send traffic.
     * Required for IPv4 BGP peers on public virtual interfaces.
     * 
     */
    public Output<String> customerAddress() {
        return this.customerAddress;
    }
    /**
     * The ID of the Direct Connect virtual interface on which to create the BGP peer.
     * 
     */
    @Export(name="virtualInterfaceId", refs={String.class}, tree="[0]")
    private Output<String> virtualInterfaceId;

    /**
     * @return The ID of the Direct Connect virtual interface on which to create the BGP peer.
     * 
     */
    public Output<String> virtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BgpPeer(String name) {
        this(name, BgpPeerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BgpPeer(String name, BgpPeerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BgpPeer(String name, BgpPeerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/bgpPeer:BgpPeer", name, args == null ? BgpPeerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BgpPeer(String name, Output<String> id, @Nullable BgpPeerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/bgpPeer:BgpPeer", name, state, makeResourceOptions(options, id));
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
    public static BgpPeer get(String name, Output<String> id, @Nullable BgpPeerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BgpPeer(name, id, state, options);
    }
}
