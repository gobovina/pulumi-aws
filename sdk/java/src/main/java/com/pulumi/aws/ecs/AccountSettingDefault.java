// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ecs.AccountSettingDefaultArgs;
import com.pulumi.aws.ecs.inputs.AccountSettingDefaultState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an ECS default account setting for a specific ECS Resource name within a specific region. More information can be found on the [ECS Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html).
 * 
 * &gt; **NOTE:** The AWS API does not delete this resource. When you run `destroy`, the provider will attempt to disable the setting.
 * 
 * &gt; **NOTE:** Your AWS account may not support disabling `containerInstanceLongArnFormat`, `serviceLongArnFormat`, and `taskLongArnFormat`. If your account does not support disabling these, &#34;destroying&#34; this resource will not disable the setting nor cause a provider error. However, the AWS Provider will log an AWS error: `InvalidParameterException: You can no longer disable Long Arn settings`.
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
 * import com.pulumi.aws.ecs.AccountSettingDefault;
 * import com.pulumi.aws.ecs.AccountSettingDefaultArgs;
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
 *         var test = new AccountSettingDefault("test", AccountSettingDefaultArgs.builder()
 *             .name("taskLongArnFormat")
 *             .value("enabled")
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
 * Using `pulumi import`, import ECS Account Setting defaults using the `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:ecs/accountSettingDefault:AccountSettingDefault example taskLongArnFormat
 * ```
 * 
 */
@ResourceType(type="aws:ecs/accountSettingDefault:AccountSettingDefault")
public class AccountSettingDefault extends com.pulumi.resources.CustomResource {
    /**
     * Name of the account setting to set.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the account setting to set.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="principalArn", refs={String.class}, tree="[0]")
    private Output<String> principalArn;

    public Output<String> principalArn() {
        return this.principalArn;
    }
    /**
     * State of the setting.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return State of the setting.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccountSettingDefault(String name) {
        this(name, AccountSettingDefaultArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccountSettingDefault(String name, AccountSettingDefaultArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountSettingDefault(String name, AccountSettingDefaultArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/accountSettingDefault:AccountSettingDefault", name, args == null ? AccountSettingDefaultArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccountSettingDefault(String name, Output<String> id, @Nullable AccountSettingDefaultState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/accountSettingDefault:AccountSettingDefault", name, state, makeResourceOptions(options, id));
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
    public static AccountSettingDefault get(String name, Output<String> id, @Nullable AccountSettingDefaultState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccountSettingDefault(name, id, state, options);
    }
}
