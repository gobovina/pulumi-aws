// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ses.ReceiptFilterArgs;
import com.pulumi.aws.ses.inputs.ReceiptFilterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an SES receipt filter resource
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
 * import com.pulumi.aws.ses.ReceiptFilter;
 * import com.pulumi.aws.ses.ReceiptFilterArgs;
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
 *         var filter = new ReceiptFilter(&#34;filter&#34;, ReceiptFilterArgs.builder()        
 *             .name(&#34;block-spammer&#34;)
 *             .cidr(&#34;10.10.10.10&#34;)
 *             .policy(&#34;Block&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SES Receipt Filter using their `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:ses/receiptFilter:ReceiptFilter test some-filter
 * ```
 * 
 */
@ResourceType(type="aws:ses/receiptFilter:ReceiptFilter")
public class ReceiptFilter extends com.pulumi.resources.CustomResource {
    /**
     * The SES receipt filter ARN.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The SES receipt filter ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The IP address or address range to filter, in CIDR notation
     * 
     */
    @Export(name="cidr", refs={String.class}, tree="[0]")
    private Output<String> cidr;

    /**
     * @return The IP address or address range to filter, in CIDR notation
     * 
     */
    public Output<String> cidr() {
        return this.cidr;
    }
    /**
     * The name of the filter
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the filter
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Block or Allow
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return Block or Allow
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReceiptFilter(String name) {
        this(name, ReceiptFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReceiptFilter(String name, ReceiptFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReceiptFilter(String name, ReceiptFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/receiptFilter:ReceiptFilter", name, args == null ? ReceiptFilterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReceiptFilter(String name, Output<String> id, @Nullable ReceiptFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/receiptFilter:ReceiptFilter", name, state, makeResourceOptions(options, id));
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
    public static ReceiptFilter get(String name, Output<String> id, @Nullable ReceiptFilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReceiptFilter(name, id, state, options);
    }
}
