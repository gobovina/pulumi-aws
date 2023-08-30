// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.transfer.TagArgs;
import com.pulumi.aws.transfer.inputs.TagState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an individual Transfer Family resource tag. This resource should only be used in cases where Transfer Family resources are created outside the provider (e.g., Servers without AWS Management Console) or the tag key has the `aws:` prefix.
 * 
 * &gt; **NOTE:** This tagging resource should not be combined with the resource for managing the parent resource. For example, using `aws.transfer.Server` and `aws.transfer.Tag` to manage tags of the same server will cause a perpetual difference where the `aws.transfer.Server` resource will try to remove the tag being added by the `aws.transfer.Tag` resource.
 * 
 * &gt; **NOTE:** This tagging resource does not use the provider `ignore_tags` configuration.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.transfer.Server;
 * import com.pulumi.aws.transfer.ServerArgs;
 * import com.pulumi.aws.transfer.Tag;
 * import com.pulumi.aws.transfer.TagArgs;
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
 *         var example = new Server(&#34;example&#34;, ServerArgs.builder()        
 *             .identityProviderType(&#34;SERVICE_MANAGED&#34;)
 *             .build());
 * 
 *         var zoneId = new Tag(&#34;zoneId&#34;, TagArgs.builder()        
 *             .resourceArn(example.arn())
 *             .key(&#34;aws:transfer:route53HostedZoneId&#34;)
 *             .value(&#34;/hostedzone/MyHostedZoneId&#34;)
 *             .build());
 * 
 *         var hostname = new Tag(&#34;hostname&#34;, TagArgs.builder()        
 *             .resourceArn(example.arn())
 *             .key(&#34;aws:transfer:customHostname&#34;)
 *             .value(&#34;example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_transfer_tag` using the Transfer Family resource identifier and key, separated by a comma (`,`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:transfer/tag:Tag example arn:aws:transfer:us-east-1:123456789012:server/s-1234567890abcdef0,Name
 * ```
 * 
 */
@ResourceType(type="aws:transfer/tag:Tag")
public class Tag extends com.pulumi.resources.CustomResource {
    /**
     * Tag name.
     * 
     */
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output<String> key;

    /**
     * @return Tag name.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * Amazon Resource Name (ARN) of the Transfer Family resource to tag.
     * 
     */
    @Export(name="resourceArn", refs={String.class}, tree="[0]")
    private Output<String> resourceArn;

    /**
     * @return Amazon Resource Name (ARN) of the Transfer Family resource to tag.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }
    /**
     * Tag value.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return Tag value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Tag(String name) {
        this(name, TagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Tag(String name, TagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tag(String name, TagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:transfer/tag:Tag", name, args == null ? TagArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Tag(String name, Output<String> id, @Nullable TagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:transfer/tag:Tag", name, state, makeResourceOptions(options, id));
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
    public static Tag get(String name, Output<String> id, @Nullable TagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Tag(name, id, state, options);
    }
}
