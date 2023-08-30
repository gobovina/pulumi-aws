// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.EipArgs;
import com.pulumi.aws.ec2.inputs.EipState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Elastic IP resource.
 * 
 * &gt; **Note:** EIP may require IGW to exist prior to association. Use `depends_on` to set an explicit dependency on the IGW.
 * 
 * &gt; **Note:** Do not use `network_interface` to associate the EIP to `aws.lb.LoadBalancer` or `aws.ec2.NatGateway` resources. Instead use the `allocation_id` available in those resources to allow AWS to manage the association, otherwise you will see `AuthFailure` errors.
 * 
 * ## Example Usage
 * ### Single EIP associated with an instance
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.Eip;
 * import com.pulumi.aws.ec2.EipArgs;
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
 *         var lb = new Eip(&#34;lb&#34;, EipArgs.builder()        
 *             .instance(aws_instance.web().id())
 *             .domain(&#34;vpc&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Multiple EIPs associated with a single network interface
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.NetworkInterface;
 * import com.pulumi.aws.ec2.NetworkInterfaceArgs;
 * import com.pulumi.aws.ec2.Eip;
 * import com.pulumi.aws.ec2.EipArgs;
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
 *         var multi_ip = new NetworkInterface(&#34;multi-ip&#34;, NetworkInterfaceArgs.builder()        
 *             .subnetId(aws_subnet.main().id())
 *             .privateIps(            
 *                 &#34;10.0.0.10&#34;,
 *                 &#34;10.0.0.11&#34;)
 *             .build());
 * 
 *         var one = new Eip(&#34;one&#34;, EipArgs.builder()        
 *             .domain(&#34;vpc&#34;)
 *             .networkInterface(multi_ip.id())
 *             .associateWithPrivateIp(&#34;10.0.0.10&#34;)
 *             .build());
 * 
 *         var two = new Eip(&#34;two&#34;, EipArgs.builder()        
 *             .domain(&#34;vpc&#34;)
 *             .networkInterface(multi_ip.id())
 *             .associateWithPrivateIp(&#34;10.0.0.11&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Attaching an EIP to an Instance with a pre-assigned private ip (VPC Only)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.ec2.InternetGateway;
 * import com.pulumi.aws.ec2.InternetGatewayArgs;
 * import com.pulumi.aws.ec2.Subnet;
 * import com.pulumi.aws.ec2.SubnetArgs;
 * import com.pulumi.aws.ec2.Instance;
 * import com.pulumi.aws.ec2.InstanceArgs;
 * import com.pulumi.aws.ec2.Eip;
 * import com.pulumi.aws.ec2.EipArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var default_ = new Vpc(&#34;default&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .enableDnsHostnames(true)
 *             .build());
 * 
 *         var gw = new InternetGateway(&#34;gw&#34;, InternetGatewayArgs.builder()        
 *             .vpcId(default_.id())
 *             .build());
 * 
 *         var myTestSubnet = new Subnet(&#34;myTestSubnet&#34;, SubnetArgs.builder()        
 *             .vpcId(default_.id())
 *             .cidrBlock(&#34;10.0.0.0/24&#34;)
 *             .mapPublicIpOnLaunch(true)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(gw)
 *                 .build());
 * 
 *         var foo = new Instance(&#34;foo&#34;, InstanceArgs.builder()        
 *             .ami(&#34;ami-5189a661&#34;)
 *             .instanceType(&#34;t2.micro&#34;)
 *             .privateIp(&#34;10.0.0.12&#34;)
 *             .subnetId(myTestSubnet.id())
 *             .build());
 * 
 *         var bar = new Eip(&#34;bar&#34;, EipArgs.builder()        
 *             .domain(&#34;vpc&#34;)
 *             .instance(foo.id())
 *             .associateWithPrivateIp(&#34;10.0.0.12&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(gw)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Allocating EIP from the BYOIP pool
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.Eip;
 * import com.pulumi.aws.ec2.EipArgs;
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
 *         var byoip_ip = new Eip(&#34;byoip-ip&#34;, EipArgs.builder()        
 *             .domain(&#34;vpc&#34;)
 *             .publicIpv4Pool(&#34;ipv4pool-ec2-012345&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import EIPs in a VPC using their Allocation ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ec2/eip:Eip bar eipalloc-00a10e96
 * ```
 * 
 */
@ResourceType(type="aws:ec2/eip:Eip")
public class Eip extends com.pulumi.resources.CustomResource {
    /**
     * IP address from an EC2 BYOIP pool. This option is only available for VPC EIPs.
     * 
     */
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> address;

    /**
     * @return IP address from an EC2 BYOIP pool. This option is only available for VPC EIPs.
     * 
     */
    public Output<Optional<String>> address() {
        return Codegen.optional(this.address);
    }
    /**
     * ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in a VPC.
     * 
     */
    @Export(name="allocationId", refs={String.class}, tree="[0]")
    private Output<String> allocationId;

    /**
     * @return ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in a VPC.
     * 
     */
    public Output<String> allocationId() {
        return this.allocationId;
    }
    /**
     * User-specified primary or secondary private IP address to associate with the Elastic IP address. If no private IP address is specified, the Elastic IP address is associated with the primary private IP address.
     * 
     */
    @Export(name="associateWithPrivateIp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> associateWithPrivateIp;

    /**
     * @return User-specified primary or secondary private IP address to associate with the Elastic IP address. If no private IP address is specified, the Elastic IP address is associated with the primary private IP address.
     * 
     */
    public Output<Optional<String>> associateWithPrivateIp() {
        return Codegen.optional(this.associateWithPrivateIp);
    }
    /**
     * ID representing the association of the address with an instance in a VPC.
     * 
     */
    @Export(name="associationId", refs={String.class}, tree="[0]")
    private Output<String> associationId;

    /**
     * @return ID representing the association of the address with an instance in a VPC.
     * 
     */
    public Output<String> associationId() {
        return this.associationId;
    }
    /**
     * Carrier IP address.
     * 
     */
    @Export(name="carrierIp", refs={String.class}, tree="[0]")
    private Output<String> carrierIp;

    /**
     * @return Carrier IP address.
     * 
     */
    public Output<String> carrierIp() {
        return this.carrierIp;
    }
    /**
     * Customer owned IP.
     * 
     */
    @Export(name="customerOwnedIp", refs={String.class}, tree="[0]")
    private Output<String> customerOwnedIp;

    /**
     * @return Customer owned IP.
     * 
     */
    public Output<String> customerOwnedIp() {
        return this.customerOwnedIp;
    }
    /**
     * ID  of a customer-owned address pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing).
     * 
     */
    @Export(name="customerOwnedIpv4Pool", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customerOwnedIpv4Pool;

    /**
     * @return ID  of a customer-owned address pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing).
     * 
     */
    public Output<Optional<String>> customerOwnedIpv4Pool() {
        return Codegen.optional(this.customerOwnedIpv4Pool);
    }
    /**
     * Indicates if this EIP is for use in VPC (`vpc`).
     * 
     */
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output<String> domain;

    /**
     * @return Indicates if this EIP is for use in VPC (`vpc`).
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * EC2 instance ID.
     * 
     */
    @Export(name="instance", refs={String.class}, tree="[0]")
    private Output<String> instance;

    /**
     * @return EC2 instance ID.
     * 
     */
    public Output<String> instance() {
        return this.instance;
    }
    /**
     * Location from which the IP address is advertised. Use this parameter to limit the address to this location.
     * 
     */
    @Export(name="networkBorderGroup", refs={String.class}, tree="[0]")
    private Output<String> networkBorderGroup;

    /**
     * @return Location from which the IP address is advertised. Use this parameter to limit the address to this location.
     * 
     */
    public Output<String> networkBorderGroup() {
        return this.networkBorderGroup;
    }
    /**
     * Network interface ID to associate with.
     * 
     */
    @Export(name="networkInterface", refs={String.class}, tree="[0]")
    private Output<String> networkInterface;

    /**
     * @return Network interface ID to associate with.
     * 
     */
    public Output<String> networkInterface() {
        return this.networkInterface;
    }
    /**
     * The Private DNS associated with the Elastic IP address (if in VPC).
     * 
     */
    @Export(name="privateDns", refs={String.class}, tree="[0]")
    private Output<String> privateDns;

    /**
     * @return The Private DNS associated with the Elastic IP address (if in VPC).
     * 
     */
    public Output<String> privateDns() {
        return this.privateDns;
    }
    /**
     * Contains the private IP address (if in VPC).
     * 
     */
    @Export(name="privateIp", refs={String.class}, tree="[0]")
    private Output<String> privateIp;

    /**
     * @return Contains the private IP address (if in VPC).
     * 
     */
    public Output<String> privateIp() {
        return this.privateIp;
    }
    /**
     * Public DNS associated with the Elastic IP address.
     * 
     */
    @Export(name="publicDns", refs={String.class}, tree="[0]")
    private Output<String> publicDns;

    /**
     * @return Public DNS associated with the Elastic IP address.
     * 
     */
    public Output<String> publicDns() {
        return this.publicDns;
    }
    /**
     * Contains the public IP address.
     * 
     */
    @Export(name="publicIp", refs={String.class}, tree="[0]")
    private Output<String> publicIp;

    /**
     * @return Contains the public IP address.
     * 
     */
    public Output<String> publicIp() {
        return this.publicIp;
    }
    /**
     * EC2 IPv4 address pool identifier or `amazon`.
     * This option is only available for VPC EIPs.
     * 
     */
    @Export(name="publicIpv4Pool", refs={String.class}, tree="[0]")
    private Output<String> publicIpv4Pool;

    /**
     * @return EC2 IPv4 address pool identifier or `amazon`.
     * This option is only available for VPC EIPs.
     * 
     */
    public Output<String> publicIpv4Pool() {
        return this.publicIpv4Pool;
    }
    /**
     * Map of tags to assign to the resource. Tags can only be applied to EIPs in a VPC. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. Tags can only be applied to EIPs in a VPC. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
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
     * Boolean if the EIP is in a VPC or not. Use `domain` instead.
     * Defaults to `true` unless the region supports EC2-Classic.
     * 
     * &gt; **NOTE:** You can specify either the `instance` ID or the `network_interface` ID, but not both. Including both will **not** return an error from the AWS API, but will have undefined behavior. See the relevant [AssociateAddress API Call][1] for more information.
     * 
     * &gt; **NOTE:** Specifying both `public_ipv4_pool` and `address` won&#39;t cause an error but `address` will be used in the
     * case both options are defined as the api only requires one or the other.
     * 
     * @deprecated
     * use domain attribute instead
     * 
     */
    @Deprecated /* use domain attribute instead */
    @Export(name="vpc", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> vpc;

    /**
     * @return Boolean if the EIP is in a VPC or not. Use `domain` instead.
     * Defaults to `true` unless the region supports EC2-Classic.
     * 
     * &gt; **NOTE:** You can specify either the `instance` ID or the `network_interface` ID, but not both. Including both will **not** return an error from the AWS API, but will have undefined behavior. See the relevant [AssociateAddress API Call][1] for more information.
     * 
     * &gt; **NOTE:** Specifying both `public_ipv4_pool` and `address` won&#39;t cause an error but `address` will be used in the
     * case both options are defined as the api only requires one or the other.
     * 
     */
    public Output<Boolean> vpc() {
        return this.vpc;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Eip(String name) {
        this(name, EipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Eip(String name, @Nullable EipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Eip(String name, @Nullable EipArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/eip:Eip", name, args == null ? EipArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Eip(String name, Output<String> id, @Nullable EipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/eip:Eip", name, state, makeResourceOptions(options, id));
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
    public static Eip get(String name, Output<String> id, @Nullable EipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Eip(name, id, state, options);
    }
}
