// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecatalyst;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.codecatalyst.DevEnvironmentArgs;
import com.pulumi.aws.codecatalyst.inputs.DevEnvironmentState;
import com.pulumi.aws.codecatalyst.outputs.DevEnvironmentIdes;
import com.pulumi.aws.codecatalyst.outputs.DevEnvironmentPersistentStorage;
import com.pulumi.aws.codecatalyst.outputs.DevEnvironmentRepository;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS CodeCatalyst Dev Environment.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.codecatalyst.DevEnvironment;
 * import com.pulumi.aws.codecatalyst.DevEnvironmentArgs;
 * import com.pulumi.aws.codecatalyst.inputs.DevEnvironmentPersistentStorageArgs;
 * import com.pulumi.aws.codecatalyst.inputs.DevEnvironmentIdesArgs;
 * import com.pulumi.aws.codecatalyst.inputs.DevEnvironmentRepositoryArgs;
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
 *         var test = new DevEnvironment(&#34;test&#34;, DevEnvironmentArgs.builder()        
 *             .alias(&#34;devenv&#34;)
 *             .spaceName(&#34;myspace&#34;)
 *             .projectName(&#34;myproject&#34;)
 *             .instanceType(&#34;dev.standard1.small&#34;)
 *             .persistentStorage(DevEnvironmentPersistentStorageArgs.builder()
 *                 .size(16)
 *                 .build())
 *             .ides(DevEnvironmentIdesArgs.builder()
 *                 .name(&#34;PyCharm&#34;)
 *                 .runtime(&#34;public.ecr.aws/jetbrains/py&#34;)
 *                 .build())
 *             .inactivityTimeoutMinutes(40)
 *             .repositories(DevEnvironmentRepositoryArgs.builder()
 *                 .repositoryName(&#34;pulumi-provider-aws&#34;)
 *                 .branchName(&#34;main&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:codecatalyst/devEnvironment:DevEnvironment")
public class DevEnvironment extends com.pulumi.resources.CustomResource {
    @Export(name="alias", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> alias;

    public Output<Optional<String>> alias() {
        return Codegen.optional(this.alias);
    }
    /**
     * Information about the integrated development environment (IDE) configured for a Dev Environment.
     * 
     */
    @Export(name="ides", refs={DevEnvironmentIdes.class}, tree="[0]")
    private Output<DevEnvironmentIdes> ides;

    /**
     * @return Information about the integrated development environment (IDE) configured for a Dev Environment.
     * 
     */
    public Output<DevEnvironmentIdes> ides() {
        return this.ides;
    }
    /**
     * The amount of time the Dev Environment will run without any activity detected before stopping, in minutes. Only whole integers are allowed. Dev Environments consume compute minutes when running.
     * 
     */
    @Export(name="inactivityTimeoutMinutes", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> inactivityTimeoutMinutes;

    /**
     * @return The amount of time the Dev Environment will run without any activity detected before stopping, in minutes. Only whole integers are allowed. Dev Environments consume compute minutes when running.
     * 
     */
    public Output<Optional<Integer>> inactivityTimeoutMinutes() {
        return Codegen.optional(this.inactivityTimeoutMinutes);
    }
    /**
     * The Amazon EC2 instace type to use for the Dev Environment. Valid values include dev.standard1.small,dev.standard1.medium,dev.standard1.large,dev.standard1.xlarge
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="instanceType", refs={String.class}, tree="[0]")
    private Output<String> instanceType;

    /**
     * @return The Amazon EC2 instace type to use for the Dev Environment. Valid values include dev.standard1.small,dev.standard1.medium,dev.standard1.large,dev.standard1.xlarge
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }
    /**
     * Information about the amount of storage allocated to the Dev Environment.
     * 
     */
    @Export(name="persistentStorage", refs={DevEnvironmentPersistentStorage.class}, tree="[0]")
    private Output<DevEnvironmentPersistentStorage> persistentStorage;

    /**
     * @return Information about the amount of storage allocated to the Dev Environment.
     * 
     */
    public Output<DevEnvironmentPersistentStorage> persistentStorage() {
        return this.persistentStorage;
    }
    /**
     * The name of the project in the space.
     * 
     */
    @Export(name="projectName", refs={String.class}, tree="[0]")
    private Output<String> projectName;

    /**
     * @return The name of the project in the space.
     * 
     */
    public Output<String> projectName() {
        return this.projectName;
    }
    /**
     * The source repository that contains the branch to clone into the Dev Environment.
     * 
     */
    @Export(name="repositories", refs={List.class,DevEnvironmentRepository.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DevEnvironmentRepository>> repositories;

    /**
     * @return The source repository that contains the branch to clone into the Dev Environment.
     * 
     */
    public Output<Optional<List<DevEnvironmentRepository>>> repositories() {
        return Codegen.optional(this.repositories);
    }
    /**
     * The name of the space.
     * 
     */
    @Export(name="spaceName", refs={String.class}, tree="[0]")
    private Output<String> spaceName;

    /**
     * @return The name of the space.
     * 
     */
    public Output<String> spaceName() {
        return this.spaceName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DevEnvironment(String name) {
        this(name, DevEnvironmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DevEnvironment(String name, DevEnvironmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DevEnvironment(String name, DevEnvironmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codecatalyst/devEnvironment:DevEnvironment", name, args == null ? DevEnvironmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DevEnvironment(String name, Output<String> id, @Nullable DevEnvironmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codecatalyst/devEnvironment:DevEnvironment", name, state, makeResourceOptions(options, id));
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
    public static DevEnvironment get(String name, Output<String> id, @Nullable DevEnvironmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DevEnvironment(name, id, state, options);
    }
}
