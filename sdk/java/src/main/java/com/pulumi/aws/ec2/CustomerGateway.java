// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.CustomerGatewayArgs;
import com.pulumi.aws.ec2.inputs.CustomerGatewayState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a customer gateway inside a VPC. These objects can be connected to VPN gateways via VPN connections, and allow you to establish tunnels between your network and the VPC.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.CustomerGateway;
 * import com.pulumi.aws.ec2.CustomerGatewayArgs;
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
 *         var main = new CustomerGateway(&#34;main&#34;, CustomerGatewayArgs.builder()        
 *             .bgpAsn(65000)
 *             .ipAddress(&#34;172.83.124.10&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;main-customer-gateway&#34;))
 *             .type(&#34;ipsec.1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Customer Gateways using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ec2/customerGateway:CustomerGateway main cgw-b4dc3961
 * ```
 * 
 */
@ResourceType(type="aws:ec2/customerGateway:CustomerGateway")
public class CustomerGateway extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the customer gateway.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the customer gateway.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The gateway&#39;s Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * 
     */
    @Export(name="bgpAsn", refs={String.class}, tree="[0]")
    private Output<String> bgpAsn;

    /**
     * @return The gateway&#39;s Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * 
     */
    public Output<String> bgpAsn() {
        return this.bgpAsn;
    }
    /**
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * 
     */
    @Export(name="certificateArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateArn;

    /**
     * @return The Amazon Resource Name (ARN) for the customer gateway certificate.
     * 
     */
    public Output<Optional<String>> certificateArn() {
        return Codegen.optional(this.certificateArn);
    }
    /**
     * A name for the customer gateway device.
     * 
     */
    @Export(name="deviceName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deviceName;

    /**
     * @return A name for the customer gateway device.
     * 
     */
    public Output<Optional<String>> deviceName() {
        return Codegen.optional(this.deviceName);
    }
    /**
     * The IPv4 address for the customer gateway device&#39;s outside interface.
     * 
     */
    @Export(name="ipAddress", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipAddress;

    /**
     * @return The IPv4 address for the customer gateway device&#39;s outside interface.
     * 
     */
    public Output<Optional<String>> ipAddress() {
        return Codegen.optional(this.ipAddress);
    }
    /**
     * Tags to apply to the gateway. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the gateway. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The type of customer gateway. The only type AWS
     * supports at this time is &#34;ipsec.1&#34;.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of customer gateway. The only type AWS
     * supports at this time is &#34;ipsec.1&#34;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomerGateway(String name) {
        this(name, CustomerGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomerGateway(String name, CustomerGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomerGateway(String name, CustomerGatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/customerGateway:CustomerGateway", name, args == null ? CustomerGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomerGateway(String name, Output<String> id, @Nullable CustomerGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/customerGateway:CustomerGateway", name, state, makeResourceOptions(options, id));
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
    public static CustomerGateway get(String name, Output<String> id, @Nullable CustomerGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomerGateway(name, id, state, options);
    }
}
