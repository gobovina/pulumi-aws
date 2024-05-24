// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.worklink;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.worklink.FleetArgs;
import com.pulumi.aws.worklink.inputs.FleetState;
import com.pulumi.aws.worklink.outputs.FleetIdentityProvider;
import com.pulumi.aws.worklink.outputs.FleetNetwork;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * Basic usage:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.worklink.Fleet;
 * import com.pulumi.aws.worklink.FleetArgs;
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
 *         var example = new Fleet("example", FleetArgs.builder()
 *             .name("example")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Network Configuration Usage:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.worklink.Fleet;
 * import com.pulumi.aws.worklink.FleetArgs;
 * import com.pulumi.aws.worklink.inputs.FleetNetworkArgs;
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
 *         var example = new Fleet("example", FleetArgs.builder()
 *             .name("example")
 *             .network(FleetNetworkArgs.builder()
 *                 .vpcId(testAwsVpc.id())
 *                 .subnetIds(testAwsSubnet.stream().map(element -> element.id()).collect(toList()))
 *                 .securityGroupIds(test.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Identity Provider Configuration Usage:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.worklink.Fleet;
 * import com.pulumi.aws.worklink.FleetArgs;
 * import com.pulumi.aws.worklink.inputs.FleetIdentityProviderArgs;
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
 *         var test = new Fleet("test", FleetArgs.builder()
 *             .name("tf-worklink-fleet")
 *             .identityProvider(FleetIdentityProviderArgs.builder()
 *                 .type("SAML")
 *                 .samlMetadata(StdFunctions.file(FileArgs.builder()
 *                     .input("saml-metadata.xml")
 *                     .build()).result())
 *                 .build())
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
 * Using `pulumi import`, import WorkLink using the ARN. For example:
 * 
 * ```sh
 * $ pulumi import aws:worklink/fleet:Fleet test arn:aws:worklink::123456789012:fleet/example
 * ```
 * 
 */
@ResourceType(type="aws:worklink/fleet:Fleet")
public class Fleet extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the created WorkLink Fleet.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the created WorkLink Fleet.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `&#34;AmazonWorkLink-&#34;`.
     * 
     */
    @Export(name="auditStreamArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> auditStreamArn;

    /**
     * @return The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `&#34;AmazonWorkLink-&#34;`.
     * 
     */
    public Output<Optional<String>> auditStreamArn() {
        return Codegen.optional(this.auditStreamArn);
    }
    /**
     * The identifier used by users to sign in to the Amazon WorkLink app.
     * 
     */
    @Export(name="companyCode", refs={String.class}, tree="[0]")
    private Output<String> companyCode;

    /**
     * @return The identifier used by users to sign in to the Amazon WorkLink app.
     * 
     */
    public Output<String> companyCode() {
        return this.companyCode;
    }
    /**
     * The time that the fleet was created.
     * 
     */
    @Export(name="createdTime", refs={String.class}, tree="[0]")
    private Output<String> createdTime;

    /**
     * @return The time that the fleet was created.
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
     * 
     */
    @Export(name="deviceCaCertificate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deviceCaCertificate;

    /**
     * @return The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
     * 
     */
    public Output<Optional<String>> deviceCaCertificate() {
        return Codegen.optional(this.deviceCaCertificate);
    }
    /**
     * The name of the fleet.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The name of the fleet.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
     * 
     */
    @Export(name="identityProvider", refs={FleetIdentityProvider.class}, tree="[0]")
    private Output</* @Nullable */ FleetIdentityProvider> identityProvider;

    /**
     * @return Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
     * 
     */
    public Output<Optional<FleetIdentityProvider>> identityProvider() {
        return Codegen.optional(this.identityProvider);
    }
    /**
     * The time that the fleet was last updated.
     * 
     */
    @Export(name="lastUpdatedTime", refs={String.class}, tree="[0]")
    private Output<String> lastUpdatedTime;

    /**
     * @return The time that the fleet was last updated.
     * 
     */
    public Output<String> lastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * A region-unique name for the AMI.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A region-unique name for the AMI.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Provide this to allow manage the company network configuration for the fleet. Fields documented below.
     * 
     */
    @Export(name="network", refs={FleetNetwork.class}, tree="[0]")
    private Output</* @Nullable */ FleetNetwork> network;

    /**
     * @return Provide this to allow manage the company network configuration for the fleet. Fields documented below.
     * 
     */
    public Output<Optional<FleetNetwork>> network() {
        return Codegen.optional(this.network);
    }
    /**
     * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
     * 
     * **network** requires the following:
     * 
     * &gt; **NOTE:** `network` is cannot removed without force recreating.
     * 
     */
    @Export(name="optimizeForEndUserLocation", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> optimizeForEndUserLocation;

    /**
     * @return The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
     * 
     * **network** requires the following:
     * 
     * &gt; **NOTE:** `network` is cannot removed without force recreating.
     * 
     */
    public Output<Optional<Boolean>> optimizeForEndUserLocation() {
        return Codegen.optional(this.optimizeForEndUserLocation);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Fleet(String name) {
        this(name, FleetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Fleet(String name, @Nullable FleetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Fleet(String name, @Nullable FleetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:worklink/fleet:Fleet", name, args == null ? FleetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Fleet(String name, Output<String> id, @Nullable FleetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:worklink/fleet:Fleet", name, state, makeResourceOptions(options, id));
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
    public static Fleet get(String name, Output<String> id, @Nullable FleetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Fleet(name, id, state, options);
    }
}
