// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.ImageBlockPublicAccessArgs;
import com.pulumi.aws.ec2.inputs.ImageBlockPublicAccessState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a regional public access block for AMIs. This prevents AMIs from being made publicly accessible.
 * If you already have public AMIs, they will remain publicly available.
 * 
 * &gt; **NOTE:** Deleting this resource does not change the block public access value, the resource in simply removed from state instead.
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
 * import com.pulumi.aws.ec2.ImageBlockPublicAccess;
 * import com.pulumi.aws.ec2.ImageBlockPublicAccessArgs;
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
 *         // Prevent making AMIs publicly accessible in the region and account for which the provider is configured
 *         var test = new ImageBlockPublicAccess("test", ImageBlockPublicAccessArgs.builder()
 *             .state("block-new-sharing")
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
 * You cannot import this resource.
 * 
 */
@ResourceType(type="aws:ec2/imageBlockPublicAccess:ImageBlockPublicAccess")
public class ImageBlockPublicAccess extends com.pulumi.resources.CustomResource {
    /**
     * The state of block public access for AMIs at the account level in the configured AWS Region. Valid values: `unblocked` and `block-new-sharing`.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of block public access for AMIs at the account level in the configured AWS Region. Valid values: `unblocked` and `block-new-sharing`.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ImageBlockPublicAccess(String name) {
        this(name, ImageBlockPublicAccessArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ImageBlockPublicAccess(String name, ImageBlockPublicAccessArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ImageBlockPublicAccess(String name, ImageBlockPublicAccessArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/imageBlockPublicAccess:ImageBlockPublicAccess", name, args == null ? ImageBlockPublicAccessArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ImageBlockPublicAccess(String name, Output<String> id, @Nullable ImageBlockPublicAccessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/imageBlockPublicAccess:ImageBlockPublicAccess", name, state, makeResourceOptions(options, id));
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
    public static ImageBlockPublicAccess get(String name, Output<String> id, @Nullable ImageBlockPublicAccessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ImageBlockPublicAccess(name, id, state, options);
    }
}
