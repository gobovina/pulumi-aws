// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssm.PatchGroupArgs;
import com.pulumi.aws.ssm.inputs.PatchGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an SSM Patch Group resource
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
 * import com.pulumi.aws.ssm.PatchBaseline;
 * import com.pulumi.aws.ssm.PatchBaselineArgs;
 * import com.pulumi.aws.ssm.PatchGroup;
 * import com.pulumi.aws.ssm.PatchGroupArgs;
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
 *         var production = new PatchBaseline(&#34;production&#34;, PatchBaselineArgs.builder()        
 *             .name(&#34;patch-baseline&#34;)
 *             .approvedPatches(&#34;KB123456&#34;)
 *             .build());
 * 
 *         var patchgroup = new PatchGroup(&#34;patchgroup&#34;, PatchGroupArgs.builder()        
 *             .baselineId(production.id())
 *             .patchGroup(&#34;patch-group-name&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="aws:ssm/patchGroup:PatchGroup")
public class PatchGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the patch baseline to register the patch group with.
     * 
     */
    @Export(name="baselineId", refs={String.class}, tree="[0]")
    private Output<String> baselineId;

    /**
     * @return The ID of the patch baseline to register the patch group with.
     * 
     */
    public Output<String> baselineId() {
        return this.baselineId;
    }
    /**
     * The name of the patch group that should be registered with the patch baseline.
     * 
     */
    @Export(name="patchGroup", refs={String.class}, tree="[0]")
    private Output<String> patchGroup;

    /**
     * @return The name of the patch group that should be registered with the patch baseline.
     * 
     */
    public Output<String> patchGroup() {
        return this.patchGroup;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PatchGroup(String name) {
        this(name, PatchGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PatchGroup(String name, PatchGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PatchGroup(String name, PatchGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/patchGroup:PatchGroup", name, args == null ? PatchGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PatchGroup(String name, Output<String> id, @Nullable PatchGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/patchGroup:PatchGroup", name, state, makeResourceOptions(options, id));
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
    public static PatchGroup get(String name, Output<String> id, @Nullable PatchGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PatchGroup(name, id, state, options);
    }
}
