// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codestarconnections;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.codestarconnections.HostArgs;
import com.pulumi.aws.codestarconnections.inputs.HostState;
import com.pulumi.aws.codestarconnections.outputs.HostVpcConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a CodeStar Host.
 * 
 * &gt; **NOTE:** The `aws.codestarconnections.Host` resource is created in the state `PENDING`. Authentication with the host provider must be completed in the AWS Console. For more information visit [Set up a pending host](https://docs.aws.amazon.com/dtconsole/latest/userguide/connections-host-setup.html).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.codestarconnections.Host;
 * import com.pulumi.aws.codestarconnections.HostArgs;
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
 *         var example = new Host(&#34;example&#34;, HostArgs.builder()        
 *             .providerEndpoint(&#34;https://example.com&#34;)
 *             .providerType(&#34;GitHubEnterpriseServer&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import CodeStar Host using the ARN. For example:
 * 
 * ```sh
 *  $ pulumi import aws:codestarconnections/host:Host example-host arn:aws:codestar-connections:us-west-1:0123456789:host/79d4d357-a2ee-41e4-b350-2fe39ae59448
 * ```
 * 
 */
@ResourceType(type="aws:codestarconnections/host:Host")
public class Host extends com.pulumi.resources.CustomResource {
    /**
     * The CodeStar Host ARN.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The CodeStar Host ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of the host to be created. The name must be unique in the calling AWS account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the host to be created. The name must be unique in the calling AWS account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The endpoint of the infrastructure to be represented by the host after it is created.
     * 
     */
    @Export(name="providerEndpoint", refs={String.class}, tree="[0]")
    private Output<String> providerEndpoint;

    /**
     * @return The endpoint of the infrastructure to be represented by the host after it is created.
     * 
     */
    public Output<String> providerEndpoint() {
        return this.providerEndpoint;
    }
    /**
     * The name of the external provider where your third-party code repository is configured.
     * 
     */
    @Export(name="providerType", refs={String.class}, tree="[0]")
    private Output<String> providerType;

    /**
     * @return The name of the external provider where your third-party code repository is configured.
     * 
     */
    public Output<String> providerType() {
        return this.providerType;
    }
    /**
     * The CodeStar Host status. Possible values are `PENDING`, `AVAILABLE`, `VPC_CONFIG_DELETING`, `VPC_CONFIG_INITIALIZING`, and `VPC_CONFIG_FAILED_INITIALIZATION`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The CodeStar Host status. Possible values are `PENDING`, `AVAILABLE`, `VPC_CONFIG_DELETING`, `VPC_CONFIG_INITIALIZING`, and `VPC_CONFIG_FAILED_INITIALIZATION`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     * 
     */
    @Export(name="vpcConfiguration", refs={HostVpcConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ HostVpcConfiguration> vpcConfiguration;

    /**
     * @return The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     * 
     */
    public Output<Optional<HostVpcConfiguration>> vpcConfiguration() {
        return Codegen.optional(this.vpcConfiguration);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Host(String name) {
        this(name, HostArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Host(String name, HostArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Host(String name, HostArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codestarconnections/host:Host", name, args == null ? HostArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Host(String name, Output<String> id, @Nullable HostState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codestarconnections/host:Host", name, state, makeResourceOptions(options, id));
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
    public static Host get(String name, Output<String> id, @Nullable HostState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Host(name, id, state, options);
    }
}
