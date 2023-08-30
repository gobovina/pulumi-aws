// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.directconnect.HostedPrivateVirtualInterfaceArgs;
import com.pulumi.aws.directconnect.inputs.HostedPrivateVirtualInterfaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Direct Connect hosted private virtual interface resource. This resource represents the allocator&#39;s side of the hosted virtual interface.
 * A hosted virtual interface is a virtual interface that is owned by another AWS account.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.directconnect.HostedPrivateVirtualInterface;
 * import com.pulumi.aws.directconnect.HostedPrivateVirtualInterfaceArgs;
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
 *         var foo = new HostedPrivateVirtualInterface(&#34;foo&#34;, HostedPrivateVirtualInterfaceArgs.builder()        
 *             .addressFamily(&#34;ipv4&#34;)
 *             .bgpAsn(65352)
 *             .connectionId(&#34;dxcon-zzzzzzzz&#34;)
 *             .vlan(4094)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Direct Connect hosted private virtual interfaces using the VIF `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:directconnect/hostedPrivateVirtualInterface:HostedPrivateVirtualInterface test dxvif-33cc44dd
 * ```
 * 
 */
@ResourceType(type="aws:directconnect/hostedPrivateVirtualInterface:HostedPrivateVirtualInterface")
public class HostedPrivateVirtualInterface extends com.pulumi.resources.CustomResource {
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
     * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
     * 
     */
    @Export(name="amazonAddress", refs={String.class}, tree="[0]")
    private Output<String> amazonAddress;

    /**
     * @return The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
     * 
     */
    public Output<String> amazonAddress() {
        return this.amazonAddress;
    }
    @Export(name="amazonSideAsn", refs={String.class}, tree="[0]")
    private Output<String> amazonSideAsn;

    public Output<String> amazonSideAsn() {
        return this.amazonSideAsn;
    }
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
     * The Direct Connect endpoint on which the virtual interface terminates.
     * 
     */
    @Export(name="awsDevice", refs={String.class}, tree="[0]")
    private Output<String> awsDevice;

    /**
     * @return The Direct Connect endpoint on which the virtual interface terminates.
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
     * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
     * 
     */
    @Export(name="connectionId", refs={String.class}, tree="[0]")
    private Output<String> connectionId;

    /**
     * @return The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }
    /**
     * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
     * 
     */
    @Export(name="customerAddress", refs={String.class}, tree="[0]")
    private Output<String> customerAddress;

    /**
     * @return The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
     * 
     */
    public Output<String> customerAddress() {
        return this.customerAddress;
    }
    /**
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * 
     */
    @Export(name="jumboFrameCapable", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> jumboFrameCapable;

    /**
     * @return Indicates whether jumbo frames (9001 MTU) are supported.
     * 
     */
    public Output<Boolean> jumboFrameCapable() {
        return this.jumboFrameCapable;
    }
    /**
     * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
     * 
     */
    @Export(name="mtu", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> mtu;

    /**
     * @return The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
     * 
     */
    public Output<Optional<Integer>> mtu() {
        return Codegen.optional(this.mtu);
    }
    /**
     * The name for the virtual interface.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the virtual interface.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The AWS account that will own the new virtual interface.
     * 
     */
    @Export(name="ownerAccountId", refs={String.class}, tree="[0]")
    private Output<String> ownerAccountId;

    /**
     * @return The AWS account that will own the new virtual interface.
     * 
     */
    public Output<String> ownerAccountId() {
        return this.ownerAccountId;
    }
    /**
     * The VLAN ID.
     * 
     */
    @Export(name="vlan", refs={Integer.class}, tree="[0]")
    private Output<Integer> vlan;

    /**
     * @return The VLAN ID.
     * 
     */
    public Output<Integer> vlan() {
        return this.vlan;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HostedPrivateVirtualInterface(String name) {
        this(name, HostedPrivateVirtualInterfaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostedPrivateVirtualInterface(String name, HostedPrivateVirtualInterfaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostedPrivateVirtualInterface(String name, HostedPrivateVirtualInterfaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/hostedPrivateVirtualInterface:HostedPrivateVirtualInterface", name, args == null ? HostedPrivateVirtualInterfaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HostedPrivateVirtualInterface(String name, Output<String> id, @Nullable HostedPrivateVirtualInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/hostedPrivateVirtualInterface:HostedPrivateVirtualInterface", name, state, makeResourceOptions(options, id));
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
    public static HostedPrivateVirtualInterface get(String name, Output<String> id, @Nullable HostedPrivateVirtualInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HostedPrivateVirtualInterface(name, id, state, options);
    }
}
