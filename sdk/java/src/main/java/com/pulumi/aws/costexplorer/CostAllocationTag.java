// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.costexplorer.CostAllocationTagArgs;
import com.pulumi.aws.costexplorer.inputs.CostAllocationTagState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a CE Cost Allocation Tag.
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
 * import com.pulumi.aws.costexplorer.CostAllocationTag;
 * import com.pulumi.aws.costexplorer.CostAllocationTagArgs;
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
 *         var example = new CostAllocationTag(&#34;example&#34;, CostAllocationTagArgs.builder()        
 *             .tagKey(&#34;example&#34;)
 *             .status(&#34;Active&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_ce_cost_allocation_tag` using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:costexplorer/costAllocationTag:CostAllocationTag example key
 * ```
 * 
 */
@ResourceType(type="aws:costexplorer/costAllocationTag:CostAllocationTag")
public class CostAllocationTag extends com.pulumi.resources.CustomResource {
    /**
     * The status of a cost allocation tag. Valid values are `Active` and `Inactive`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of a cost allocation tag. Valid values are `Active` and `Inactive`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The key for the cost allocation tag.
     * 
     */
    @Export(name="tagKey", refs={String.class}, tree="[0]")
    private Output<String> tagKey;

    /**
     * @return The key for the cost allocation tag.
     * 
     */
    public Output<String> tagKey() {
        return this.tagKey;
    }
    /**
     * The type of cost allocation tag.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of cost allocation tag.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CostAllocationTag(String name) {
        this(name, CostAllocationTagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CostAllocationTag(String name, CostAllocationTagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CostAllocationTag(String name, CostAllocationTagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:costexplorer/costAllocationTag:CostAllocationTag", name, args == null ? CostAllocationTagArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CostAllocationTag(String name, Output<String> id, @Nullable CostAllocationTagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:costexplorer/costAllocationTag:CostAllocationTag", name, state, makeResourceOptions(options, id));
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
    public static CostAllocationTag get(String name, Output<String> id, @Nullable CostAllocationTagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CostAllocationTag(name, id, state, options);
    }
}
