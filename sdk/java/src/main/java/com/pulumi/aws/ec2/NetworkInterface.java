// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.NetworkInterfaceArgs;
import com.pulumi.aws.ec2.inputs.NetworkInterfaceState;
import com.pulumi.aws.ec2.outputs.NetworkInterfaceAttachment;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Elastic network interface (ENI) resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.NetworkInterface;
 * import com.pulumi.aws.ec2.NetworkInterfaceArgs;
 * import com.pulumi.aws.ec2.inputs.NetworkInterfaceAttachmentArgs;
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
 *         var test = new NetworkInterface(&#34;test&#34;, NetworkInterfaceArgs.builder()        
 *             .subnetId(publicA.id())
 *             .privateIps(&#34;10.0.0.50&#34;)
 *             .securityGroups(web.id())
 *             .attachments(NetworkInterfaceAttachmentArgs.builder()
 *                 .instance(testAwsInstance.id())
 *                 .deviceIndex(1)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Example of Managing Multiple IPs on a Network Interface
 * 
 * By default, private IPs are managed through the `private_ips` and `private_ips_count` arguments which manage IPs as a set of IPs that are configured without regard to order. For a new network interface, the same primary IP address is consistently selected from a given set of addresses, regardless of the order provided. However, modifications of the set of addresses of an existing interface will not alter the current primary IP address unless it has been removed from the set.
 * 
 * In order to manage the private IPs as a sequentially ordered list, configure `private_ip_list_enabled` to `true` and use `private_ip_list` to manage the IPs. This will disable the `private_ips` and `private_ips_count` settings, which must be removed from the config file but are still exported. Note that changing the first address of `private_ip_list`, which is the primary, always requires a new interface.
 * 
 * If you are managing a specific set or list of IPs, instead of just using `private_ips_count`, this is a potential workflow for also leveraging `private_ips_count` to have AWS automatically assign additional IP addresses:
 * 
 * 1. Comment out `private_ips`, `private_ip_list`, `private_ip_list_enabled` in your configuration
 * 2. Set the desired `private_ips_count` (count of the number of secondaries, the primary is not included)
 * 3. Apply to assign the extra IPs
 * 4. Remove `private_ips_count` and restore your settings from the first step
 * 5. Add the new IPs to your current settings
 * 6. Apply again to update the stored state
 * 
 * This process can also be used to remove IP addresses in addition to the option of manually removing them. Adding IP addresses in a manually is more difficult because it requires knowledge of which addresses are available.
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Network Interfaces using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ec2/networkInterface:NetworkInterface test eni-e5aa89a3
 * ```
 * 
 */
@ResourceType(type="aws:ec2/networkInterface:NetworkInterface")
public class NetworkInterface extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the network interface.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the network interface.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Configuration block to define the attachment of the ENI. See Attachment below for more details!
     * 
     */
    @Export(name="attachments", refs={List.class,NetworkInterfaceAttachment.class}, tree="[0,1]")
    private Output<List<NetworkInterfaceAttachment>> attachments;

    /**
     * @return Configuration block to define the attachment of the ENI. See Attachment below for more details!
     * 
     */
    public Output<List<NetworkInterfaceAttachment>> attachments() {
        return this.attachments;
    }
    /**
     * Description for the network interface.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description for the network interface.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Type of network interface to create. Set to `efa` for Elastic Fabric Adapter. Changing `interface_type` will cause the resource to be destroyed and re-created.
     * 
     */
    @Export(name="interfaceType", refs={String.class}, tree="[0]")
    private Output<String> interfaceType;

    /**
     * @return Type of network interface to create. Set to `efa` for Elastic Fabric Adapter. Changing `interface_type` will cause the resource to be destroyed and re-created.
     * 
     */
    public Output<String> interfaceType() {
        return this.interfaceType;
    }
    /**
     * Number of IPv4 prefixes that AWS automatically assigns to the network interface.
     * 
     */
    @Export(name="ipv4PrefixCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> ipv4PrefixCount;

    /**
     * @return Number of IPv4 prefixes that AWS automatically assigns to the network interface.
     * 
     */
    public Output<Integer> ipv4PrefixCount() {
        return this.ipv4PrefixCount;
    }
    /**
     * One or more IPv4 prefixes assigned to the network interface.
     * 
     */
    @Export(name="ipv4Prefixes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> ipv4Prefixes;

    /**
     * @return One or more IPv4 prefixes assigned to the network interface.
     * 
     */
    public Output<List<String>> ipv4Prefixes() {
        return this.ipv4Prefixes;
    }
    /**
     * Number of IPv6 addresses to assign to a network interface. You can&#39;t use this option if specifying specific `ipv6_addresses`. If your subnet has the AssignIpv6AddressOnCreation attribute set to `true`, you can specify `0` to override this setting.
     * 
     */
    @Export(name="ipv6AddressCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> ipv6AddressCount;

    /**
     * @return Number of IPv6 addresses to assign to a network interface. You can&#39;t use this option if specifying specific `ipv6_addresses`. If your subnet has the AssignIpv6AddressOnCreation attribute set to `true`, you can specify `0` to override this setting.
     * 
     */
    public Output<Integer> ipv6AddressCount() {
        return this.ipv6AddressCount;
    }
    /**
     * Whether `ipv6_address_list` is allowed and controls the IPs to assign to the ENI and `ipv6_addresses` and `ipv6_address_count` become read-only. Default false.
     * 
     */
    @Export(name="ipv6AddressListEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ipv6AddressListEnabled;

    /**
     * @return Whether `ipv6_address_list` is allowed and controls the IPs to assign to the ENI and `ipv6_addresses` and `ipv6_address_count` become read-only. Default false.
     * 
     */
    public Output<Optional<Boolean>> ipv6AddressListEnabled() {
        return Codegen.optional(this.ipv6AddressListEnabled);
    }
    /**
     * List of private IPs to assign to the ENI in sequential order.
     * 
     */
    @Export(name="ipv6AddressLists", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> ipv6AddressLists;

    /**
     * @return List of private IPs to assign to the ENI in sequential order.
     * 
     */
    public Output<List<String>> ipv6AddressLists() {
        return this.ipv6AddressLists;
    }
    /**
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. Addresses are assigned without regard to order. You can&#39;t use this option if you&#39;re specifying `ipv6_address_count`.
     * 
     */
    @Export(name="ipv6Addresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> ipv6Addresses;

    /**
     * @return One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. Addresses are assigned without regard to order. You can&#39;t use this option if you&#39;re specifying `ipv6_address_count`.
     * 
     */
    public Output<List<String>> ipv6Addresses() {
        return this.ipv6Addresses;
    }
    /**
     * Number of IPv6 prefixes that AWS automatically assigns to the network interface.
     * 
     */
    @Export(name="ipv6PrefixCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> ipv6PrefixCount;

    /**
     * @return Number of IPv6 prefixes that AWS automatically assigns to the network interface.
     * 
     */
    public Output<Integer> ipv6PrefixCount() {
        return this.ipv6PrefixCount;
    }
    /**
     * One or more IPv6 prefixes assigned to the network interface.
     * 
     */
    @Export(name="ipv6Prefixes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> ipv6Prefixes;

    /**
     * @return One or more IPv6 prefixes assigned to the network interface.
     * 
     */
    public Output<List<String>> ipv6Prefixes() {
        return this.ipv6Prefixes;
    }
    /**
     * MAC address of the network interface.
     * 
     */
    @Export(name="macAddress", refs={String.class}, tree="[0]")
    private Output<String> macAddress;

    /**
     * @return MAC address of the network interface.
     * 
     */
    public Output<String> macAddress() {
        return this.macAddress;
    }
    @Export(name="outpostArn", refs={String.class}, tree="[0]")
    private Output<String> outpostArn;

    public Output<String> outpostArn() {
        return this.outpostArn;
    }
    /**
     * AWS account ID of the owner of the network interface.
     * 
     */
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    /**
     * @return AWS account ID of the owner of the network interface.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * Private DNS name of the network interface (IPv4).
     * 
     */
    @Export(name="privateDnsName", refs={String.class}, tree="[0]")
    private Output<String> privateDnsName;

    /**
     * @return Private DNS name of the network interface (IPv4).
     * 
     */
    public Output<String> privateDnsName() {
        return this.privateDnsName;
    }
    @Export(name="privateIp", refs={String.class}, tree="[0]")
    private Output<String> privateIp;

    public Output<String> privateIp() {
        return this.privateIp;
    }
    /**
     * Whether `private_ip_list` is allowed and controls the IPs to assign to the ENI and `private_ips` and `private_ips_count` become read-only. Default false.
     * 
     */
    @Export(name="privateIpListEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> privateIpListEnabled;

    /**
     * @return Whether `private_ip_list` is allowed and controls the IPs to assign to the ENI and `private_ips` and `private_ips_count` become read-only. Default false.
     * 
     */
    public Output<Optional<Boolean>> privateIpListEnabled() {
        return Codegen.optional(this.privateIpListEnabled);
    }
    /**
     * List of private IPs to assign to the ENI in sequential order. Requires setting `private_ip_list_enabled` to `true`.
     * 
     */
    @Export(name="privateIpLists", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> privateIpLists;

    /**
     * @return List of private IPs to assign to the ENI in sequential order. Requires setting `private_ip_list_enabled` to `true`.
     * 
     */
    public Output<List<String>> privateIpLists() {
        return this.privateIpLists;
    }
    /**
     * List of private IPs to assign to the ENI without regard to order.
     * 
     */
    @Export(name="privateIps", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> privateIps;

    /**
     * @return List of private IPs to assign to the ENI without regard to order.
     * 
     */
    public Output<List<String>> privateIps() {
        return this.privateIps;
    }
    /**
     * Number of secondary private IPs to assign to the ENI. The total number of private IPs will be 1 + `private_ips_count`, as a primary private IP will be assiged to an ENI by default.
     * 
     */
    @Export(name="privateIpsCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> privateIpsCount;

    /**
     * @return Number of secondary private IPs to assign to the ENI. The total number of private IPs will be 1 + `private_ips_count`, as a primary private IP will be assiged to an ENI by default.
     * 
     */
    public Output<Integer> privateIpsCount() {
        return this.privateIpsCount;
    }
    /**
     * List of security group IDs to assign to the ENI.
     * 
     */
    @Export(name="securityGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityGroups;

    /**
     * @return List of security group IDs to assign to the ENI.
     * 
     */
    public Output<List<String>> securityGroups() {
        return this.securityGroups;
    }
    /**
     * Whether to enable source destination checking for the ENI. Default true.
     * 
     */
    @Export(name="sourceDestCheck", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> sourceDestCheck;

    /**
     * @return Whether to enable source destination checking for the ENI. Default true.
     * 
     */
    public Output<Optional<Boolean>> sourceDestCheck() {
        return Codegen.optional(this.sourceDestCheck);
    }
    /**
     * Subnet ID to create the ENI in.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="subnetId", refs={String.class}, tree="[0]")
    private Output<String> subnetId;

    /**
     * @return Subnet ID to create the ENI in.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
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
    public NetworkInterface(String name) {
        this(name, NetworkInterfaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkInterface(String name, NetworkInterfaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkInterface(String name, NetworkInterfaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/networkInterface:NetworkInterface", name, args == null ? NetworkInterfaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkInterface(String name, Output<String> id, @Nullable NetworkInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/networkInterface:NetworkInterface", name, state, makeResourceOptions(options, id));
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
    public static NetworkInterface get(String name, Output<String> id, @Nullable NetworkInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkInterface(name, id, state, options);
    }
}
