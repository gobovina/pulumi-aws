// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2clientvpn;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2clientvpn.NetworkAssociationArgs;
import com.pulumi.aws.ec2clientvpn.inputs.NetworkAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides network associations for AWS Client VPN endpoints. For more information on usage, please see the
 * [AWS Client VPN Administrator&#39;s Guide](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/what-is.html).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2clientvpn.NetworkAssociation;
 * import com.pulumi.aws.ec2clientvpn.NetworkAssociationArgs;
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
 *         var example = new NetworkAssociation(&#34;example&#34;, NetworkAssociationArgs.builder()        
 *             .clientVpnEndpointId(aws_ec2_client_vpn_endpoint.example().id())
 *             .subnetId(aws_subnet.example().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import AWS Client VPN network associations using the endpoint ID and the association ID. Values are separated by a `,`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ec2clientvpn/networkAssociation:NetworkAssociation example cvpn-endpoint-0ac3a1abbccddd666,vpn-assoc-0b8db902465d069ad
 * ```
 * 
 */
@ResourceType(type="aws:ec2clientvpn/networkAssociation:NetworkAssociation")
public class NetworkAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The unique ID of the target network association.
     * 
     */
    @Export(name="associationId", refs={String.class}, tree="[0]")
    private Output<String> associationId;

    /**
     * @return The unique ID of the target network association.
     * 
     */
    public Output<String> associationId() {
        return this.associationId;
    }
    /**
     * The ID of the Client VPN endpoint.
     * 
     */
    @Export(name="clientVpnEndpointId", refs={String.class}, tree="[0]")
    private Output<String> clientVpnEndpointId;

    /**
     * @return The ID of the Client VPN endpoint.
     * 
     */
    public Output<String> clientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }
    /**
     * The ID of the subnet to associate with the Client VPN endpoint.
     * 
     */
    @Export(name="subnetId", refs={String.class}, tree="[0]")
    private Output<String> subnetId;

    /**
     * @return The ID of the subnet to associate with the Client VPN endpoint.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }
    /**
     * The ID of the VPC in which the target subnet is located.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC in which the target subnet is located.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkAssociation(String name) {
        this(name, NetworkAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkAssociation(String name, NetworkAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkAssociation(String name, NetworkAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2clientvpn/networkAssociation:NetworkAssociation", name, args == null ? NetworkAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkAssociation(String name, Output<String> id, @Nullable NetworkAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2clientvpn/networkAssociation:NetworkAssociation", name, state, makeResourceOptions(options, id));
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
    public static NetworkAssociation get(String name, Output<String> id, @Nullable NetworkAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkAssociation(name, id, state, options);
    }
}
