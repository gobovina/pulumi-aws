// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.globalaccelerator;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.globalaccelerator.CustomRoutingEndpointGroupArgs;
import com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupState;
import com.pulumi.aws.globalaccelerator.outputs.CustomRoutingEndpointGroupDestinationConfiguration;
import com.pulumi.aws.globalaccelerator.outputs.CustomRoutingEndpointGroupEndpointConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Global Accelerator custom routing endpoint group.
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
 * import com.pulumi.aws.globalaccelerator.CustomRoutingEndpointGroup;
 * import com.pulumi.aws.globalaccelerator.CustomRoutingEndpointGroupArgs;
 * import com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupDestinationConfigurationArgs;
 * import com.pulumi.aws.globalaccelerator.inputs.CustomRoutingEndpointGroupEndpointConfigurationArgs;
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
 *         var example = new CustomRoutingEndpointGroup(&#34;example&#34;, CustomRoutingEndpointGroupArgs.builder()        
 *             .listenerArn(exampleAwsGlobalacceleratorCustomRoutingListener.id())
 *             .destinationConfigurations(CustomRoutingEndpointGroupDestinationConfigurationArgs.builder()
 *                 .fromPort(80)
 *                 .toPort(8080)
 *                 .protocols(&#34;TCP&#34;)
 *                 .build())
 *             .endpointConfigurations(CustomRoutingEndpointGroupEndpointConfigurationArgs.builder()
 *                 .endpointId(exampleAwsSubnet.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Global Accelerator custom routing endpoint groups using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:globalaccelerator/customRoutingEndpointGroup:CustomRoutingEndpointGroup example arn:aws:globalaccelerator::111111111111:accelerator/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/listener/xxxxxxx/endpoint-group/xxxxxxxx
 * ```
 * 
 */
@ResourceType(type="aws:globalaccelerator/customRoutingEndpointGroup:CustomRoutingEndpointGroup")
public class CustomRoutingEndpointGroup extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the custom routing endpoint group.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the custom routing endpoint group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The port ranges and protocols for all endpoints in a custom routing endpoint group to accept client traffic on. Fields documented below.
     * 
     */
    @Export(name="destinationConfigurations", refs={List.class,CustomRoutingEndpointGroupDestinationConfiguration.class}, tree="[0,1]")
    private Output<List<CustomRoutingEndpointGroupDestinationConfiguration>> destinationConfigurations;

    /**
     * @return The port ranges and protocols for all endpoints in a custom routing endpoint group to accept client traffic on. Fields documented below.
     * 
     */
    public Output<List<CustomRoutingEndpointGroupDestinationConfiguration>> destinationConfigurations() {
        return this.destinationConfigurations;
    }
    /**
     * The list of endpoint objects. Fields documented below.
     * 
     */
    @Export(name="endpointConfigurations", refs={List.class,CustomRoutingEndpointGroupEndpointConfiguration.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CustomRoutingEndpointGroupEndpointConfiguration>> endpointConfigurations;

    /**
     * @return The list of endpoint objects. Fields documented below.
     * 
     */
    public Output<Optional<List<CustomRoutingEndpointGroupEndpointConfiguration>>> endpointConfigurations() {
        return Codegen.optional(this.endpointConfigurations);
    }
    /**
     * The name of the AWS Region where the custom routing endpoint group is located.
     * 
     */
    @Export(name="endpointGroupRegion", refs={String.class}, tree="[0]")
    private Output<String> endpointGroupRegion;

    /**
     * @return The name of the AWS Region where the custom routing endpoint group is located.
     * 
     */
    public Output<String> endpointGroupRegion() {
        return this.endpointGroupRegion;
    }
    /**
     * The Amazon Resource Name (ARN) of the custom routing listener.
     * 
     */
    @Export(name="listenerArn", refs={String.class}, tree="[0]")
    private Output<String> listenerArn;

    /**
     * @return The Amazon Resource Name (ARN) of the custom routing listener.
     * 
     */
    public Output<String> listenerArn() {
        return this.listenerArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomRoutingEndpointGroup(String name) {
        this(name, CustomRoutingEndpointGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomRoutingEndpointGroup(String name, CustomRoutingEndpointGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomRoutingEndpointGroup(String name, CustomRoutingEndpointGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:globalaccelerator/customRoutingEndpointGroup:CustomRoutingEndpointGroup", name, args == null ? CustomRoutingEndpointGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomRoutingEndpointGroup(String name, Output<String> id, @Nullable CustomRoutingEndpointGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:globalaccelerator/customRoutingEndpointGroup:CustomRoutingEndpointGroup", name, state, makeResourceOptions(options, id));
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
    public static CustomRoutingEndpointGroup get(String name, Output<String> id, @Nullable CustomRoutingEndpointGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomRoutingEndpointGroup(name, id, state, options);
    }
}
