// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.devicefarm;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.devicefarm.InstanceProfileArgs;
import com.pulumi.aws.devicefarm.inputs.InstanceProfileState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage AWS Device Farm Instance Profiles.
 * ∂
 * &gt; **NOTE:** AWS currently has limited regional support for Device Farm (e.g., `us-west-2`). See [AWS Device Farm endpoints and quotas](https://docs.aws.amazon.com/general/latest/gr/devicefarm.html) for information on supported regions.
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
 * import com.pulumi.aws.devicefarm.InstanceProfile;
 * import com.pulumi.aws.devicefarm.InstanceProfileArgs;
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
 *         var example = new InstanceProfile("example", InstanceProfileArgs.builder()
 *             .name("example")
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
 * Using `pulumi import`, import DeviceFarm Instance Profiles using their ARN. For example:
 * 
 * ```sh
 * $ pulumi import aws:devicefarm/instanceProfile:InstanceProfile example arn:aws:devicefarm:us-west-2:123456789012:instanceprofile:4fa784c7-ccb4-4dbf-ba4f-02198320daa1
 * ```
 * 
 */
@ResourceType(type="aws:devicefarm/instanceProfile:InstanceProfile")
public class InstanceProfile extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name of this instance profile.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name of this instance profile.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The description of the instance profile.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the instance profile.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
     * 
     */
    @Export(name="excludeAppPackagesFromCleanups", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> excludeAppPackagesFromCleanups;

    /**
     * @return An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
     * 
     */
    public Output<Optional<List<String>>> excludeAppPackagesFromCleanups() {
        return Codegen.optional(this.excludeAppPackagesFromCleanups);
    }
    /**
     * The name for the instance profile.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the instance profile.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
     * 
     */
    @Export(name="packageCleanup", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> packageCleanup;

    /**
     * @return When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
     * 
     */
    public Output<Optional<Boolean>> packageCleanup() {
        return Codegen.optional(this.packageCleanup);
    }
    /**
     * When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
     * 
     */
    @Export(name="rebootAfterUse", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> rebootAfterUse;

    /**
     * @return When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
     * 
     */
    public Output<Optional<Boolean>> rebootAfterUse() {
        return Codegen.optional(this.rebootAfterUse);
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public InstanceProfile(String name) {
        this(name, InstanceProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceProfile(String name, @Nullable InstanceProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceProfile(String name, @Nullable InstanceProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:devicefarm/instanceProfile:InstanceProfile", name, args == null ? InstanceProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceProfile(String name, Output<String> id, @Nullable InstanceProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:devicefarm/instanceProfile:InstanceProfile", name, state, makeResourceOptions(options, id));
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
    public static InstanceProfile get(String name, Output<String> id, @Nullable InstanceProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceProfile(name, id, state, options);
    }
}
