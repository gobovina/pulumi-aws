// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.networkmanager.ConnectPeerArgs;
import com.pulumi.aws.networkmanager.inputs.ConnectPeerState;
import com.pulumi.aws.networkmanager.outputs.ConnectPeerBgpOptions;
import com.pulumi.aws.networkmanager.outputs.ConnectPeerConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS NetworkManager Connect Peer.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_networkmanager_connect_peer` using the connect peer ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:networkmanager/connectPeer:ConnectPeer example connect-peer-061f3e96275db1acc
 * ```
 * 
 */
@ResourceType(type="aws:networkmanager/connectPeer:ConnectPeer")
public class ConnectPeer extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the attachment.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the attachment.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The Connect peer BGP options.
     * 
     */
    @Export(name="bgpOptions", refs={ConnectPeerBgpOptions.class}, tree="[0]")
    private Output</* @Nullable */ ConnectPeerBgpOptions> bgpOptions;

    /**
     * @return The Connect peer BGP options.
     * 
     */
    public Output<Optional<ConnectPeerBgpOptions>> bgpOptions() {
        return Codegen.optional(this.bgpOptions);
    }
    /**
     * The configuration of the Connect peer.
     * 
     */
    @Export(name="configurations", refs={List.class,ConnectPeerConfiguration.class}, tree="[0,1]")
    private Output<List<ConnectPeerConfiguration>> configurations;

    /**
     * @return The configuration of the Connect peer.
     * 
     */
    public Output<List<ConnectPeerConfiguration>> configurations() {
        return this.configurations;
    }
    /**
     * The ID of the connection attachment.
     * 
     */
    @Export(name="connectAttachmentId", refs={String.class}, tree="[0]")
    private Output<String> connectAttachmentId;

    /**
     * @return The ID of the connection attachment.
     * 
     */
    public Output<String> connectAttachmentId() {
        return this.connectAttachmentId;
    }
    @Export(name="connectPeerId", refs={String.class}, tree="[0]")
    private Output<String> connectPeerId;

    public Output<String> connectPeerId() {
        return this.connectPeerId;
    }
    /**
     * A Connect peer core network address.
     * 
     */
    @Export(name="coreNetworkAddress", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> coreNetworkAddress;

    /**
     * @return A Connect peer core network address.
     * 
     */
    public Output<Optional<String>> coreNetworkAddress() {
        return Codegen.optional(this.coreNetworkAddress);
    }
    /**
     * The ID of a core network.
     * 
     */
    @Export(name="coreNetworkId", refs={String.class}, tree="[0]")
    private Output<String> coreNetworkId;

    /**
     * @return The ID of a core network.
     * 
     */
    public Output<String> coreNetworkId() {
        return this.coreNetworkId;
    }
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The Region where the peer is located.
     * 
     */
    @Export(name="edgeLocation", refs={String.class}, tree="[0]")
    private Output<String> edgeLocation;

    /**
     * @return The Region where the peer is located.
     * 
     */
    public Output<String> edgeLocation() {
        return this.edgeLocation;
    }
    /**
     * The inside IP addresses used for BGP peering.
     * 
     */
    @Export(name="insideCidrBlocks", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> insideCidrBlocks;

    /**
     * @return The inside IP addresses used for BGP peering.
     * 
     */
    public Output<List<String>> insideCidrBlocks() {
        return this.insideCidrBlocks;
    }
    /**
     * The Connect peer address.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="peerAddress", refs={String.class}, tree="[0]")
    private Output<String> peerAddress;

    /**
     * @return The Connect peer address.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> peerAddress() {
        return this.peerAddress;
    }
    /**
     * The state of the Connect peer.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of the Connect peer.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectPeer(String name) {
        this(name, ConnectPeerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectPeer(String name, ConnectPeerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectPeer(String name, ConnectPeerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/connectPeer:ConnectPeer", name, args == null ? ConnectPeerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectPeer(String name, Output<String> id, @Nullable ConnectPeerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/connectPeer:ConnectPeer", name, state, makeResourceOptions(options, id));
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
    public static ConnectPeer get(String name, Output<String> id, @Nullable ConnectPeerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectPeer(name, id, state, options);
    }
}
