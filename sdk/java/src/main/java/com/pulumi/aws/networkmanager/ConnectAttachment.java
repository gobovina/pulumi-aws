// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.networkmanager.ConnectAttachmentArgs;
import com.pulumi.aws.networkmanager.inputs.ConnectAttachmentState;
import com.pulumi.aws.networkmanager.outputs.ConnectAttachmentOptions;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS Network Manager ConnectAttachment.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkmanager.VpcAttachment;
 * import com.pulumi.aws.networkmanager.VpcAttachmentArgs;
 * import com.pulumi.aws.networkmanager.ConnectAttachment;
 * import com.pulumi.aws.networkmanager.ConnectAttachmentArgs;
 * import com.pulumi.aws.networkmanager.inputs.ConnectAttachmentOptionsArgs;
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
 *         var example = new VpcAttachment(&#34;example&#34;, VpcAttachmentArgs.builder()        
 *             .subnetArns(exampleAwsSubnet.stream().map(element -&gt; element.arn()).collect(toList()))
 *             .coreNetworkId(exampleAwsccNetworkmanagerCoreNetwork.id())
 *             .vpcArn(exampleAwsVpc.arn())
 *             .build());
 * 
 *         var exampleConnectAttachment = new ConnectAttachment(&#34;exampleConnectAttachment&#34;, ConnectAttachmentArgs.builder()        
 *             .coreNetworkId(exampleAwsccNetworkmanagerCoreNetwork.id())
 *             .transportAttachmentId(example.id())
 *             .edgeLocation(example.edgeLocation())
 *             .options(ConnectAttachmentOptionsArgs.builder()
 *                 .protocol(&#34;GRE&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Usage with attachment accepter
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkmanager.VpcAttachment;
 * import com.pulumi.aws.networkmanager.VpcAttachmentArgs;
 * import com.pulumi.aws.networkmanager.AttachmentAccepter;
 * import com.pulumi.aws.networkmanager.AttachmentAccepterArgs;
 * import com.pulumi.aws.networkmanager.ConnectAttachment;
 * import com.pulumi.aws.networkmanager.ConnectAttachmentArgs;
 * import com.pulumi.aws.networkmanager.inputs.ConnectAttachmentOptionsArgs;
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
 *         var example = new VpcAttachment(&#34;example&#34;, VpcAttachmentArgs.builder()        
 *             .subnetArns(exampleAwsSubnet.stream().map(element -&gt; element.arn()).collect(toList()))
 *             .coreNetworkId(exampleAwsccNetworkmanagerCoreNetwork.id())
 *             .vpcArn(exampleAwsVpc.arn())
 *             .build());
 * 
 *         var exampleAttachmentAccepter = new AttachmentAccepter(&#34;exampleAttachmentAccepter&#34;, AttachmentAccepterArgs.builder()        
 *             .attachmentId(example.id())
 *             .attachmentType(example.attachmentType())
 *             .build());
 * 
 *         var exampleConnectAttachment = new ConnectAttachment(&#34;exampleConnectAttachment&#34;, ConnectAttachmentArgs.builder()        
 *             .coreNetworkId(exampleAwsccNetworkmanagerCoreNetwork.id())
 *             .transportAttachmentId(example.id())
 *             .edgeLocation(example.edgeLocation())
 *             .options(ConnectAttachmentOptionsArgs.builder()
 *                 .protocol(&#34;GRE&#34;)
 *                 .build())
 *             .build());
 * 
 *         var example2 = new AttachmentAccepter(&#34;example2&#34;, AttachmentAccepterArgs.builder()        
 *             .attachmentId(exampleConnectAttachment.id())
 *             .attachmentType(exampleConnectAttachment.attachmentType())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_networkmanager_connect_attachment` using the attachment ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:networkmanager/connectAttachment:ConnectAttachment example attachment-0f8fa60d2238d1bd8
 * ```
 * 
 */
@ResourceType(type="aws:networkmanager/connectAttachment:ConnectAttachment")
public class ConnectAttachment extends com.pulumi.resources.CustomResource {
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
    @Export(name="attachmentId", refs={String.class}, tree="[0]")
    private Output<String> attachmentId;

    public Output<String> attachmentId() {
        return this.attachmentId;
    }
    /**
     * The policy rule number associated with the attachment.
     * 
     */
    @Export(name="attachmentPolicyRuleNumber", refs={Integer.class}, tree="[0]")
    private Output<Integer> attachmentPolicyRuleNumber;

    /**
     * @return The policy rule number associated with the attachment.
     * 
     */
    public Output<Integer> attachmentPolicyRuleNumber() {
        return this.attachmentPolicyRuleNumber;
    }
    /**
     * The type of attachment.
     * 
     */
    @Export(name="attachmentType", refs={String.class}, tree="[0]")
    private Output<String> attachmentType;

    /**
     * @return The type of attachment.
     * 
     */
    public Output<String> attachmentType() {
        return this.attachmentType;
    }
    /**
     * The ARN of a core network.
     * 
     */
    @Export(name="coreNetworkArn", refs={String.class}, tree="[0]")
    private Output<String> coreNetworkArn;

    /**
     * @return The ARN of a core network.
     * 
     */
    public Output<String> coreNetworkArn() {
        return this.coreNetworkArn;
    }
    /**
     * The ID of a core network where you want to create the attachment.
     * 
     */
    @Export(name="coreNetworkId", refs={String.class}, tree="[0]")
    private Output<String> coreNetworkId;

    /**
     * @return The ID of a core network where you want to create the attachment.
     * 
     */
    public Output<String> coreNetworkId() {
        return this.coreNetworkId;
    }
    /**
     * The Region where the edge is located.
     * 
     */
    @Export(name="edgeLocation", refs={String.class}, tree="[0]")
    private Output<String> edgeLocation;

    /**
     * @return The Region where the edge is located.
     * 
     */
    public Output<String> edgeLocation() {
        return this.edgeLocation;
    }
    /**
     * Options block. See options for more information.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="options", refs={ConnectAttachmentOptions.class}, tree="[0]")
    private Output<ConnectAttachmentOptions> options;

    /**
     * @return Options block. See options for more information.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<ConnectAttachmentOptions> options() {
        return this.options;
    }
    /**
     * The ID of the attachment account owner.
     * 
     */
    @Export(name="ownerAccountId", refs={String.class}, tree="[0]")
    private Output<String> ownerAccountId;

    /**
     * @return The ID of the attachment account owner.
     * 
     */
    public Output<String> ownerAccountId() {
        return this.ownerAccountId;
    }
    /**
     * The attachment resource ARN.
     * 
     */
    @Export(name="resourceArn", refs={String.class}, tree="[0]")
    private Output<String> resourceArn;

    /**
     * @return The attachment resource ARN.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }
    /**
     * The name of the segment attachment.
     * 
     */
    @Export(name="segmentName", refs={String.class}, tree="[0]")
    private Output<String> segmentName;

    /**
     * @return The name of the segment attachment.
     * 
     */
    public Output<String> segmentName() {
        return this.segmentName;
    }
    /**
     * The state of the attachment.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of the attachment.
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
     * The ID of the attachment between the two connections.
     * 
     */
    @Export(name="transportAttachmentId", refs={String.class}, tree="[0]")
    private Output<String> transportAttachmentId;

    /**
     * @return The ID of the attachment between the two connections.
     * 
     */
    public Output<String> transportAttachmentId() {
        return this.transportAttachmentId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectAttachment(String name) {
        this(name, ConnectAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectAttachment(String name, ConnectAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectAttachment(String name, ConnectAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/connectAttachment:ConnectAttachment", name, args == null ? ConnectAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectAttachment(String name, Output<String> id, @Nullable ConnectAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/connectAttachment:ConnectAttachment", name, state, makeResourceOptions(options, id));
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
    public static ConnectAttachment get(String name, Output<String> id, @Nullable ConnectAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectAttachment(name, id, state, options);
    }
}
