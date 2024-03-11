// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2clientvpn;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2clientvpn.EndpointArgs;
import com.pulumi.aws.ec2clientvpn.inputs.EndpointState;
import com.pulumi.aws.ec2clientvpn.outputs.EndpointAuthenticationOption;
import com.pulumi.aws.ec2clientvpn.outputs.EndpointClientConnectOptions;
import com.pulumi.aws.ec2clientvpn.outputs.EndpointClientLoginBannerOptions;
import com.pulumi.aws.ec2clientvpn.outputs.EndpointConnectionLogOptions;
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
 * Provides an AWS Client VPN endpoint for OpenVPN clients. For more information on usage, please see the
 * [AWS Client VPN Administrator&#39;s Guide](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/what-is.html).
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
 * import com.pulumi.aws.ec2clientvpn.Endpoint;
 * import com.pulumi.aws.ec2clientvpn.EndpointArgs;
 * import com.pulumi.aws.ec2clientvpn.inputs.EndpointAuthenticationOptionArgs;
 * import com.pulumi.aws.ec2clientvpn.inputs.EndpointConnectionLogOptionsArgs;
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
 *         var example = new Endpoint(&#34;example&#34;, EndpointArgs.builder()        
 *             .description(&#34;clientvpn-example&#34;)
 *             .serverCertificateArn(cert.arn())
 *             .clientCidrBlock(&#34;10.0.0.0/16&#34;)
 *             .authenticationOptions(EndpointAuthenticationOptionArgs.builder()
 *                 .type(&#34;certificate-authentication&#34;)
 *                 .rootCertificateChainArn(rootCert.arn())
 *                 .build())
 *             .connectionLogOptions(EndpointConnectionLogOptionsArgs.builder()
 *                 .enabled(true)
 *                 .cloudwatchLogGroup(lg.name())
 *                 .cloudwatchLogStream(ls.name())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import AWS Client VPN endpoints using the `id` value found via `aws ec2 describe-client-vpn-endpoints`. For example:
 * 
 * ```sh
 * $ pulumi import aws:ec2clientvpn/endpoint:Endpoint example cvpn-endpoint-0ac3a1abbccddd666
 * ```
 * 
 */
@ResourceType(type="aws:ec2clientvpn/endpoint:Endpoint")
public class Endpoint extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the Client VPN endpoint.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the Client VPN endpoint.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Information about the authentication method to be used to authenticate clients.
     * 
     */
    @Export(name="authenticationOptions", refs={List.class,EndpointAuthenticationOption.class}, tree="[0,1]")
    private Output<List<EndpointAuthenticationOption>> authenticationOptions;

    /**
     * @return Information about the authentication method to be used to authenticate clients.
     * 
     */
    public Output<List<EndpointAuthenticationOption>> authenticationOptions() {
        return this.authenticationOptions;
    }
    /**
     * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
     * 
     */
    @Export(name="clientCidrBlock", refs={String.class}, tree="[0]")
    private Output<String> clientCidrBlock;

    /**
     * @return The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
     * 
     */
    public Output<String> clientCidrBlock() {
        return this.clientCidrBlock;
    }
    /**
     * The options for managing connection authorization for new client connections.
     * 
     */
    @Export(name="clientConnectOptions", refs={EndpointClientConnectOptions.class}, tree="[0]")
    private Output<EndpointClientConnectOptions> clientConnectOptions;

    /**
     * @return The options for managing connection authorization for new client connections.
     * 
     */
    public Output<EndpointClientConnectOptions> clientConnectOptions() {
        return this.clientConnectOptions;
    }
    /**
     * Options for enabling a customizable text banner that will be displayed on AWS provided clients when a VPN session is established.
     * 
     */
    @Export(name="clientLoginBannerOptions", refs={EndpointClientLoginBannerOptions.class}, tree="[0]")
    private Output<EndpointClientLoginBannerOptions> clientLoginBannerOptions;

    /**
     * @return Options for enabling a customizable text banner that will be displayed on AWS provided clients when a VPN session is established.
     * 
     */
    public Output<EndpointClientLoginBannerOptions> clientLoginBannerOptions() {
        return this.clientLoginBannerOptions;
    }
    /**
     * Information about the client connection logging options.
     * 
     */
    @Export(name="connectionLogOptions", refs={EndpointConnectionLogOptions.class}, tree="[0]")
    private Output<EndpointConnectionLogOptions> connectionLogOptions;

    /**
     * @return Information about the client connection logging options.
     * 
     */
    public Output<EndpointConnectionLogOptions> connectionLogOptions() {
        return this.connectionLogOptions;
    }
    /**
     * A brief description of the Client VPN endpoint.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A brief description of the Client VPN endpoint.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The DNS name to be used by clients when establishing their VPN session.
     * 
     */
    @Export(name="dnsName", refs={String.class}, tree="[0]")
    private Output<String> dnsName;

    /**
     * @return The DNS name to be used by clients when establishing their VPN session.
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    /**
     * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address of the connecting device is used.
     * 
     */
    @Export(name="dnsServers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> dnsServers;

    /**
     * @return Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS address of the connecting device is used.
     * 
     */
    public Output<Optional<List<String>>> dnsServers() {
        return Codegen.optional(this.dnsServers);
    }
    /**
     * The IDs of one or more security groups to apply to the target network. You must also specify the ID of the VPC that contains the security groups.
     * 
     */
    @Export(name="securityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityGroupIds;

    /**
     * @return The IDs of one or more security groups to apply to the target network. You must also specify the ID of the VPC that contains the security groups.
     * 
     */
    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * Specify whether to enable the self-service portal for the Client VPN endpoint. Values can be `enabled` or `disabled`. Default value is `disabled`.
     * 
     */
    @Export(name="selfServicePortal", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> selfServicePortal;

    /**
     * @return Specify whether to enable the self-service portal for the Client VPN endpoint. Values can be `enabled` or `disabled`. Default value is `disabled`.
     * 
     */
    public Output<Optional<String>> selfServicePortal() {
        return Codegen.optional(this.selfServicePortal);
    }
    /**
     * The URL of the self-service portal.
     * 
     */
    @Export(name="selfServicePortalUrl", refs={String.class}, tree="[0]")
    private Output<String> selfServicePortalUrl;

    /**
     * @return The URL of the self-service portal.
     * 
     */
    public Output<String> selfServicePortalUrl() {
        return this.selfServicePortalUrl;
    }
    /**
     * The ARN of the ACM server certificate.
     * 
     */
    @Export(name="serverCertificateArn", refs={String.class}, tree="[0]")
    private Output<String> serverCertificateArn;

    /**
     * @return The ARN of the ACM server certificate.
     * 
     */
    public Output<String> serverCertificateArn() {
        return this.serverCertificateArn;
    }
    /**
     * The maximum session duration is a trigger by which end-users are required to re-authenticate prior to establishing a VPN session. Default value is `24` - Valid values: `8 | 10 | 12 | 24`
     * 
     */
    @Export(name="sessionTimeoutHours", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> sessionTimeoutHours;

    /**
     * @return The maximum session duration is a trigger by which end-users are required to re-authenticate prior to establishing a VPN session. Default value is `24` - Valid values: `8 | 10 | 12 | 24`
     * 
     */
    public Output<Optional<Integer>> sessionTimeoutHours() {
        return Codegen.optional(this.sessionTimeoutHours);
    }
    /**
     * Indicates whether split-tunnel is enabled on VPN endpoint. Default value is `false`.
     * 
     */
    @Export(name="splitTunnel", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> splitTunnel;

    /**
     * @return Indicates whether split-tunnel is enabled on VPN endpoint. Default value is `false`.
     * 
     */
    public Output<Optional<Boolean>> splitTunnel() {
        return Codegen.optional(this.splitTunnel);
    }
    /**
     * A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The transport protocol to be used by the VPN session. Default value is `udp`.
     * 
     */
    @Export(name="transportProtocol", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> transportProtocol;

    /**
     * @return The transport protocol to be used by the VPN session. Default value is `udp`.
     * 
     */
    public Output<Optional<String>> transportProtocol() {
        return Codegen.optional(this.transportProtocol);
    }
    /**
     * The ID of the VPC to associate with the Client VPN endpoint. If no security group IDs are specified in the request, the default security group for the VPC is applied.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC to associate with the Client VPN endpoint. If no security group IDs are specified in the request, the default security group for the VPC is applied.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The port number for the Client VPN endpoint. Valid values are `443` and `1194`. Default value is `443`.
     * 
     */
    @Export(name="vpnPort", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> vpnPort;

    /**
     * @return The port number for the Client VPN endpoint. Valid values are `443` and `1194`. Default value is `443`.
     * 
     */
    public Output<Optional<Integer>> vpnPort() {
        return Codegen.optional(this.vpnPort);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Endpoint(String name) {
        this(name, EndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Endpoint(String name, EndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Endpoint(String name, EndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2clientvpn/endpoint:Endpoint", name, args == null ? EndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Endpoint(String name, Output<String> id, @Nullable EndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2clientvpn/endpoint:Endpoint", name, state, makeResourceOptions(options, id));
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
    public static Endpoint get(String name, Output<String> id, @Nullable EndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Endpoint(name, id, state, options);
    }
}
