// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apprunner.VpcIngressConnectionArgs;
import com.pulumi.aws.apprunner.inputs.VpcIngressConnectionState;
import com.pulumi.aws.apprunner.outputs.VpcIngressConnectionIngressVpcConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an App Runner VPC Ingress Connection.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apprunner.VpcIngressConnection;
 * import com.pulumi.aws.apprunner.VpcIngressConnectionArgs;
 * import com.pulumi.aws.apprunner.inputs.VpcIngressConnectionIngressVpcConfigurationArgs;
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
 *         var example = new VpcIngressConnection(&#34;example&#34;, VpcIngressConnectionArgs.builder()        
 *             .serviceArn(aws_apprunner_service.example().arn())
 *             .ingressVpcConfiguration(VpcIngressConnectionIngressVpcConfigurationArgs.builder()
 *                 .vpcId(aws_default_vpc.default().id())
 *                 .vpcEndpointId(aws_vpc_endpoint.apprunner().id())
 *                 .build())
 *             .tags(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import App Runner VPC Ingress Connection using the `arn`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:apprunner/vpcIngressConnection:VpcIngressConnection example &#34;arn:aws:apprunner:us-west-2:837424938642:vpcingressconnection/example/b379f86381d74825832c2e82080342fa&#34;
 * ```
 * 
 */
@ResourceType(type="aws:apprunner/vpcIngressConnection:VpcIngressConnection")
public class VpcIngressConnection extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the VPC Ingress Connection.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the VPC Ingress Connection.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The domain name associated with the VPC Ingress Connection resource.
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output<String> domainName;

    /**
     * @return The domain name associated with the VPC Ingress Connection resource.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. See Ingress VPC Configuration below for more details.
     * 
     */
    @Export(name="ingressVpcConfiguration", refs={VpcIngressConnectionIngressVpcConfiguration.class}, tree="[0]")
    private Output<VpcIngressConnectionIngressVpcConfiguration> ingressVpcConfiguration;

    /**
     * @return Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource. See Ingress VPC Configuration below for more details.
     * 
     */
    public Output<VpcIngressConnectionIngressVpcConfiguration> ingressVpcConfiguration() {
        return this.ingressVpcConfiguration;
    }
    /**
     * A name for the VPC Ingress Connection resource. It must be unique across all the active VPC Ingress Connections in your AWS account in the AWS Region.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A name for the VPC Ingress Connection resource. It must be unique across all the active VPC Ingress Connections in your AWS account in the AWS Region.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC Ingress Connection resource.
     * 
     */
    @Export(name="serviceArn", refs={String.class}, tree="[0]")
    private Output<String> serviceArn;

    /**
     * @return The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC Ingress Connection resource.
     * 
     */
    public Output<String> serviceArn() {
        return this.serviceArn;
    }
    /**
     * The current status of the VPC Ingress Connection.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The current status of the VPC Ingress Connection.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public VpcIngressConnection(String name) {
        this(name, VpcIngressConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcIngressConnection(String name, VpcIngressConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcIngressConnection(String name, VpcIngressConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apprunner/vpcIngressConnection:VpcIngressConnection", name, args == null ? VpcIngressConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcIngressConnection(String name, Output<String> id, @Nullable VpcIngressConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apprunner/vpcIngressConnection:VpcIngressConnection", name, state, makeResourceOptions(options, id));
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
    public static VpcIngressConnection get(String name, Output<String> id, @Nullable VpcIngressConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcIngressConnection(name, id, state, options);
    }
}
