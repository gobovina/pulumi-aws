// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssm.DefaultPatchBaselineArgs;
import com.pulumi.aws.ssm.inputs.DefaultPatchBaselineState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for registering an AWS Systems Manager Default Patch Baseline.
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
 * import com.pulumi.aws.ssm.PatchBaseline;
 * import com.pulumi.aws.ssm.PatchBaselineArgs;
 * import com.pulumi.aws.ssm.DefaultPatchBaseline;
 * import com.pulumi.aws.ssm.DefaultPatchBaselineArgs;
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
 *         var examplePatchBaseline = new PatchBaseline(&#34;examplePatchBaseline&#34;, PatchBaselineArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .approvedPatches(&#34;KB123456&#34;)
 *             .build());
 * 
 *         var example = new DefaultPatchBaseline(&#34;example&#34;, DefaultPatchBaselineArgs.builder()        
 *             .baselineId(examplePatchBaseline.id())
 *             .operatingSystem(examplePatchBaseline.operatingSystem())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using the patch baseline ARN:
 * 
 * Using the operating system value:
 * 
 * __Using `pulumi import` to import__ the Systems Manager Default Patch Baseline using the patch baseline ID, patch baseline ARN, or the operating system value. For example:
 * 
 * Using the patch baseline ID:
 * 
 * ```sh
 * $ pulumi import aws:ssm/defaultPatchBaseline:DefaultPatchBaseline example pb-1234567890abcdef1
 * ```
 * Using the patch baseline ARN:
 * 
 * ```sh
 * $ pulumi import aws:ssm/defaultPatchBaseline:DefaultPatchBaseline example arn:aws:ssm:us-west-2:123456789012:patchbaseline/pb-1234567890abcdef1
 * ```
 * Using the operating system value:
 * 
 * ```sh
 * $ pulumi import aws:ssm/defaultPatchBaseline:DefaultPatchBaseline example CENTOS
 * ```
 * 
 */
@ResourceType(type="aws:ssm/defaultPatchBaseline:DefaultPatchBaseline")
public class DefaultPatchBaseline extends com.pulumi.resources.CustomResource {
    /**
     * ID of the patch baseline.
     * Can be an ID or an ARN.
     * When specifying an AWS-provided patch baseline, must be the ARN.
     * 
     */
    @Export(name="baselineId", refs={String.class}, tree="[0]")
    private Output<String> baselineId;

    /**
     * @return ID of the patch baseline.
     * Can be an ID or an ARN.
     * When specifying an AWS-provided patch baseline, must be the ARN.
     * 
     */
    public Output<String> baselineId() {
        return this.baselineId;
    }
    /**
     * The operating system the patch baseline applies to.
     * Valid values are
     * `AMAZON_LINUX`,
     * `AMAZON_LINUX_2`,
     * `AMAZON_LINUX_2022`,
     * `CENTOS`,
     * `DEBIAN`,
     * `MACOS`,
     * `ORACLE_LINUX`,
     * `RASPBIAN`,
     * `REDHAT_ENTERPRISE_LINUX`,
     * `ROCKY_LINUX`,
     * `SUSE`,
     * `UBUNTU`, and
     * `WINDOWS`.
     * 
     */
    @Export(name="operatingSystem", refs={String.class}, tree="[0]")
    private Output<String> operatingSystem;

    /**
     * @return The operating system the patch baseline applies to.
     * Valid values are
     * `AMAZON_LINUX`,
     * `AMAZON_LINUX_2`,
     * `AMAZON_LINUX_2022`,
     * `CENTOS`,
     * `DEBIAN`,
     * `MACOS`,
     * `ORACLE_LINUX`,
     * `RASPBIAN`,
     * `REDHAT_ENTERPRISE_LINUX`,
     * `ROCKY_LINUX`,
     * `SUSE`,
     * `UBUNTU`, and
     * `WINDOWS`.
     * 
     */
    public Output<String> operatingSystem() {
        return this.operatingSystem;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DefaultPatchBaseline(String name) {
        this(name, DefaultPatchBaselineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefaultPatchBaseline(String name, DefaultPatchBaselineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultPatchBaseline(String name, DefaultPatchBaselineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/defaultPatchBaseline:DefaultPatchBaseline", name, args == null ? DefaultPatchBaselineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DefaultPatchBaseline(String name, Output<String> id, @Nullable DefaultPatchBaselineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/defaultPatchBaseline:DefaultPatchBaseline", name, state, makeResourceOptions(options, id));
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
    public static DefaultPatchBaseline get(String name, Output<String> id, @Nullable DefaultPatchBaselineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DefaultPatchBaseline(name, id, state, options);
    }
}
