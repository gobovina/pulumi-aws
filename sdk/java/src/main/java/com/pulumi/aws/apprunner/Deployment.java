// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apprunner.DeploymentArgs;
import com.pulumi.aws.apprunner.inputs.DeploymentState;
import com.pulumi.aws.apprunner.outputs.DeploymentTimeouts;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an App Runner Deployment Operation.
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
 * import com.pulumi.aws.apprunner.Deployment;
 * import com.pulumi.aws.apprunner.DeploymentArgs;
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
 *         var example = new Deployment(&#34;example&#34;, DeploymentArgs.builder()        
 *             .serviceArn(exampleAwsApprunnerService.arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="aws:apprunner/deployment:Deployment")
public class Deployment extends com.pulumi.resources.CustomResource {
    /**
     * The unique ID of the operation associated with deployment.
     * 
     */
    @Export(name="operationId", refs={String.class}, tree="[0]")
    private Output<String> operationId;

    /**
     * @return The unique ID of the operation associated with deployment.
     * 
     */
    public Output<String> operationId() {
        return this.operationId;
    }
    /**
     * The Amazon Resource Name (ARN) of the App Runner service to start the deployment for.
     * 
     */
    @Export(name="serviceArn", refs={String.class}, tree="[0]")
    private Output<String> serviceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the App Runner service to start the deployment for.
     * 
     */
    public Output<String> serviceArn() {
        return this.serviceArn;
    }
    /**
     * The current status of the App Runner service deployment.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The current status of the App Runner service deployment.
     * 
     */
    public Output<String> status() {
        return this.status;
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
        super("aws:apprunner/deployment:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Deployment(String name, Output<String> id, @Nullable DeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apprunner/deployment:Deployment", name, state, makeResourceOptions(options, id));
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
