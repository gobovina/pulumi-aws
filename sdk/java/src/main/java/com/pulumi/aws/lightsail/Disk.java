// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lightsail;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lightsail.DiskArgs;
import com.pulumi.aws.lightsail.inputs.DiskState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Lightsail Disk resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetAvailabilityZonesArgs;
 * import com.pulumi.aws.lightsail.Disk;
 * import com.pulumi.aws.lightsail.DiskArgs;
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
 *         final var available = AwsFunctions.getAvailabilityZones(GetAvailabilityZonesArgs.builder()
 *             .state(&#34;available&#34;)
 *             .filters(GetAvailabilityZonesFilterArgs.builder()
 *                 .name(&#34;opt-in-status&#34;)
 *                 .values(&#34;opt-in-not-required&#34;)
 *                 .build())
 *             .build());
 * 
 *         var test = new Disk(&#34;test&#34;, DiskArgs.builder()        
 *             .sizeInGb(8)
 *             .availabilityZone(available.applyValue(getAvailabilityZonesResult -&gt; getAvailabilityZonesResult.names()[0]))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_lightsail_disk` using the name attribute. For example:
 * 
 * ```sh
 *  $ pulumi import aws:lightsail/disk:Disk test test
 * ```
 * 
 */
@ResourceType(type="aws:lightsail/disk:Disk")
public class Disk extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the Lightsail load balancer.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the Lightsail load balancer.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The Availability Zone in which to create your disk.
     * 
     */
    @Export(name="availabilityZone", refs={String.class}, tree="[0]")
    private Output<String> availabilityZone;

    /**
     * @return The Availability Zone in which to create your disk.
     * 
     */
    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * The timestamp when the load balancer was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return The timestamp when the load balancer was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The name of the Lightsail load balancer.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Lightsail load balancer.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The instance port the load balancer will connect.
     * 
     */
    @Export(name="sizeInGb", refs={Integer.class}, tree="[0]")
    private Output<Integer> sizeInGb;

    /**
     * @return The instance port the load balancer will connect.
     * 
     */
    public Output<Integer> sizeInGb() {
        return this.sizeInGb;
    }
    /**
     * The support code for the disk. Include this code in your email to support when you have questions about a disk in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * 
     */
    @Export(name="supportCode", refs={String.class}, tree="[0]")
    private Output<String> supportCode;

    /**
     * @return The support code for the disk. Include this code in your email to support when you have questions about a disk in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * 
     */
    public Output<String> supportCode() {
        return this.supportCode;
    }
    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
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
    public Disk(String name) {
        this(name, DiskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Disk(String name, DiskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Disk(String name, DiskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/disk:Disk", name, args == null ? DiskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Disk(String name, Output<String> id, @Nullable DiskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/disk:Disk", name, state, makeResourceOptions(options, id));
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
    public static Disk get(String name, Output<String> id, @Nullable DiskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Disk(name, id, state, options);
    }
}
