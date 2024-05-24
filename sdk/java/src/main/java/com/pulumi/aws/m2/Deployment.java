// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.m2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.m2.DeploymentArgs;
import com.pulumi.aws.m2.inputs.DeploymentState;
import com.pulumi.aws.m2.outputs.DeploymentTimeouts;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an [AWS Mainframe Modernization Deployment.](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-deploy.html)
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.m2.Deployment;
 * import com.pulumi.aws.m2.DeploymentArgs;
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
 *         var test = new Deployment("test", DeploymentArgs.builder()
 *             .environmentId("01234567890abcdef012345678")
 *             .applicationId("34567890abcdef012345678012")
 *             .applicationVersion(1)
 *             .start(true)
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
 * Using `pulumi import`, import Mainframe Modernization Deployment using the `APPLICATION-ID,DEPLOYMENT-ID`. For example:
 * 
 * ```sh
 * $ pulumi import aws:m2/deployment:Deployment example APPLICATION-ID,DEPLOYMENT-ID
 * ```
 * 
 */
@ResourceType(type="aws:m2/deployment:Deployment")
public class Deployment extends com.pulumi.resources.CustomResource {
    /**
     * Application to deploy.
     * 
     */
    @Export(name="applicationId", refs={String.class}, tree="[0]")
    private Output<String> applicationId;

    /**
     * @return Application to deploy.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * Version to application to deploy
     * 
     */
    @Export(name="applicationVersion", refs={Integer.class}, tree="[0]")
    private Output<Integer> applicationVersion;

    /**
     * @return Version to application to deploy
     * 
     */
    public Output<Integer> applicationVersion() {
        return this.applicationVersion;
    }
    @Export(name="deploymentId", refs={String.class}, tree="[0]")
    private Output<String> deploymentId;

    public Output<String> deploymentId() {
        return this.deploymentId;
    }
    /**
     * Environment to deploy application to.
     * 
     */
    @Export(name="environmentId", refs={String.class}, tree="[0]")
    private Output<String> environmentId;

    /**
     * @return Environment to deploy application to.
     * 
     */
    public Output<String> environmentId() {
        return this.environmentId;
    }
    @Export(name="forceStop", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceStop;

    public Output<Optional<Boolean>> forceStop() {
        return Codegen.optional(this.forceStop);
    }
    /**
     * Start the application once deployed.
     * 
     */
    @Export(name="start", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> start;

    /**
     * @return Start the application once deployed.
     * 
     */
    public Output<Boolean> start() {
        return this.start;
    }
    @Export(name="timeouts", refs={DeploymentTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ DeploymentTimeouts> timeouts;

    public Output<Optional<DeploymentTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Deployment(String name) {
        this(name, DeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Deployment(String name, DeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Deployment(String name, DeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:m2/deployment:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Deployment(String name, Output<String> id, @Nullable DeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:m2/deployment:Deployment", name, state, makeResourceOptions(options, id));
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
    public static Deployment get(String name, Output<String> id, @Nullable DeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, state, options);
    }
}
