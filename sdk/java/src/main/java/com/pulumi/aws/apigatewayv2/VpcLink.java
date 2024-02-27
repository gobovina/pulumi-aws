// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigatewayv2.VpcLinkArgs;
import com.pulumi.aws.apigatewayv2.inputs.VpcLinkState;
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
 * Manages an Amazon API Gateway Version 2 VPC Link.
 * 
 * &gt; **Note:** Amazon API Gateway Version 2 VPC Links enable private integrations that connect HTTP APIs to private resources in a VPC.
 * To enable private integration for REST APIs, use the Amazon API Gateway Version 1 VPC Link resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apigatewayv2.VpcLink;
 * import com.pulumi.aws.apigatewayv2.VpcLinkArgs;
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
 *         var example = new VpcLink(&#34;example&#34;, VpcLinkArgs.builder()        
 *             .securityGroupIds(data.aws_security_group().example().id())
 *             .subnetIds(data.aws_subnets().example().ids())
 *             .tags(Map.of(&#34;Usage&#34;, &#34;example&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_apigatewayv2_vpc_link` using the VPC Link identifier. For example:
 * 
 * ```sh
 *  $ pulumi import aws:apigatewayv2/vpcLink:VpcLink example aabbccddee
 * ```
 * 
 */
@ResourceType(type="aws:apigatewayv2/vpcLink:VpcLink")
public class VpcLink extends com.pulumi.resources.CustomResource {
    /**
     * VPC Link ARN.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return VPC Link ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Name of the VPC Link. Must be between 1 and 128 characters in length.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the VPC Link. Must be between 1 and 128 characters in length.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Security group IDs for the VPC Link.
     * 
     */
    @Export(name="securityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityGroupIds;

    /**
     * @return Security group IDs for the VPC Link.
     * 
     */
    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * Subnet IDs for the VPC Link.
     * 
     */
    @Export(name="subnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subnetIds;

    /**
     * @return Subnet IDs for the VPC Link.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    /**
     * Map of tags to assign to the VPC Link. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the VPC Link. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public VpcLink(String name) {
        this(name, VpcLinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcLink(String name, VpcLinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcLink(String name, VpcLinkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/vpcLink:VpcLink", name, args == null ? VpcLinkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcLink(String name, Output<String> id, @Nullable VpcLinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/vpcLink:VpcLink", name, state, makeResourceOptions(options, id));
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
    public static VpcLink get(String name, Output<String> id, @Nullable VpcLinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcLink(name, id, state, options);
    }
}
