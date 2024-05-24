// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.wafv2.IpSetArgs;
import com.pulumi.aws.wafv2.inputs.IpSetState;
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
 * Provides a WAFv2 IP Set Resource
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.wafv2.IpSet;
 * import com.pulumi.aws.wafv2.IpSetArgs;
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
 *         var example = new IpSet("example", IpSetArgs.builder()
 *             .name("example")
 *             .description("Example IP set")
 *             .scope("REGIONAL")
 *             .ipAddressVersion("IPV4")
 *             .addresses(            
 *                 "1.2.3.4/32",
 *                 "5.6.7.8/32")
 *             .tags(Map.ofEntries(
 *                 Map.entry("Tag1", "Value1"),
 *                 Map.entry("Tag2", "Value2")
 *             ))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import WAFv2 IP Sets using `ID/name/scope`. For example:
 * 
 * ```sh
 * $ pulumi import aws:wafv2/ipSet:IpSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc/example/REGIONAL
 * ```
 * 
 */
@ResourceType(type="aws:wafv2/ipSet:IpSet")
public class IpSet extends com.pulumi.resources.CustomResource {
    /**
     * Contains an array of strings that specifies zero or more IP addresses or blocks of IP addresses. All addresses must be specified using Classless Inter-Domain Routing (CIDR) notation. WAF supports all IPv4 and IPv6 CIDR ranges except for `/0`.
     * 
     */
    @Export(name="addresses", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> addresses;

    /**
     * @return Contains an array of strings that specifies zero or more IP addresses or blocks of IP addresses. All addresses must be specified using Classless Inter-Domain Routing (CIDR) notation. WAF supports all IPv4 and IPv6 CIDR ranges except for `/0`.
     * 
     */
    public Output<Optional<List<String>>> addresses() {
        return Codegen.optional(this.addresses);
    }
    /**
     * The Amazon Resource Name (ARN) of the IP set.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the IP set.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A friendly description of the IP set.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A friendly description of the IP set.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specify IPV4 or IPV6. Valid values are `IPV4` or `IPV6`.
     * 
     */
    @Export(name="ipAddressVersion", refs={String.class}, tree="[0]")
    private Output<String> ipAddressVersion;

    /**
     * @return Specify IPV4 or IPV6. Valid values are `IPV4` or `IPV6`.
     * 
     */
    public Output<String> ipAddressVersion() {
        return this.ipAddressVersion;
    }
    @Export(name="lockToken", refs={String.class}, tree="[0]")
    private Output<String> lockToken;

    public Output<String> lockToken() {
        return this.lockToken;
    }
    /**
     * A friendly name of the IP set.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A friendly name of the IP set.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the Region US East (N. Virginia).
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output<String> scope;

    /**
     * @return Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the Region US East (N. Virginia).
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * An array of key:value pairs to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return An array of key:value pairs to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IpSet(String name) {
        this(name, IpSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IpSet(String name, IpSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IpSet(String name, IpSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafv2/ipSet:IpSet", name, args == null ? IpSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IpSet(String name, Output<String> id, @Nullable IpSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafv2/ipSet:IpSet", name, state, makeResourceOptions(options, id));
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
    public static IpSet get(String name, Output<String> id, @Nullable IpSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IpSet(name, id, state, options);
    }
}
