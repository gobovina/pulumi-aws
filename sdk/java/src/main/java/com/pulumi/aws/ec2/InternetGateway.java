// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.InternetGatewayArgs;
import com.pulumi.aws.ec2.inputs.InternetGatewayState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to create a VPC Internet Gateway.
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
 * import com.pulumi.aws.ec2.InternetGateway;
 * import com.pulumi.aws.ec2.InternetGatewayArgs;
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
 *         var gw = new InternetGateway("gw", InternetGatewayArgs.builder()
 *             .vpcId(main.id())
 *             .tags(Map.of("Name", "main"))
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
 * Using `pulumi import`, import Internet Gateways using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:ec2/internetGateway:InternetGateway gw igw-c0a643a9
 * ```
 * 
 */
@ResourceType(type="aws:ec2/internetGateway:InternetGateway")
public class InternetGateway extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the Internet Gateway.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the Internet Gateway.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ID of the AWS account that owns the internet gateway.
     * 
     */
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    /**
     * @return The ID of the AWS account that owns the internet gateway.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     * &gt; **Note:** It&#39;s recommended to denote that the AWS Instance or Elastic IP depends on the Internet Gateway. For example:
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ec2.InternetGateway;
     * import com.pulumi.aws.ec2.InternetGatewayArgs;
     * import com.pulumi.aws.ec2.Instance;
     * import com.pulumi.aws.ec2.InstanceArgs;
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
     *         var gw = new InternetGateway("gw", InternetGatewayArgs.builder()
     *             .vpcId(main.id())
     *             .build());
     * 
     *         var foo = new Instance("foo", InstanceArgs.Empty, CustomResourceOptions.builder()
     *             .dependsOn(gw)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     * &gt; **Note:** It&#39;s recommended to denote that the AWS Instance or Elastic IP depends on the Internet Gateway. For example:
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ec2.InternetGateway;
     * import com.pulumi.aws.ec2.InternetGatewayArgs;
     * import com.pulumi.aws.ec2.Instance;
     * import com.pulumi.aws.ec2.InstanceArgs;
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
     *         var gw = new InternetGateway("gw", InternetGatewayArgs.builder()
     *             .vpcId(main.id())
     *             .build());
     * 
     *         var foo = new Instance("foo", InstanceArgs.Empty, CustomResourceOptions.builder()
     *             .dependsOn(gw)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
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
     * The VPC ID to create in.  See the aws.ec2.InternetGatewayAttachment resource for an alternate way to attach an Internet Gateway to a VPC.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The VPC ID to create in.  See the aws.ec2.InternetGatewayAttachment resource for an alternate way to attach an Internet Gateway to a VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InternetGateway(String name) {
        this(name, InternetGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InternetGateway(String name, @Nullable InternetGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InternetGateway(String name, @Nullable InternetGatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/internetGateway:InternetGateway", name, args == null ? InternetGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InternetGateway(String name, Output<String> id, @Nullable InternetGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/internetGateway:InternetGateway", name, state, makeResourceOptions(options, id));
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
    public static InternetGateway get(String name, Output<String> id, @Nullable InternetGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InternetGateway(name, id, state, options);
    }
}
