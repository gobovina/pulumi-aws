// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.autoscaling.TrafficSourceAttachmentArgs;
import com.pulumi.aws.autoscaling.inputs.TrafficSourceAttachmentState;
import com.pulumi.aws.autoscaling.outputs.TrafficSourceAttachmentTrafficSource;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Attaches a traffic source to an Auto Scaling group.
 * 
 * &gt; **NOTE on Auto Scaling Groups, Attachments and Traffic Source Attachments:** Pulumi provides standalone Attachment (for attaching Classic Load Balancers and Application Load Balancer, Gateway Load Balancer, or Network Load Balancer target groups) and Traffic Source Attachment (for attaching Load Balancers and VPC Lattice target groups) resources and an Auto Scaling Group resource with `load_balancers`, `target_group_arns` and `traffic_source` attributes. Do not use the same traffic source in more than one of these resources. Doing so will cause a conflict of attachments. A `lifecycle` configuration block can be used to suppress differences if necessary.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.autoscaling.TrafficSourceAttachment;
 * import com.pulumi.aws.autoscaling.TrafficSourceAttachmentArgs;
 * import com.pulumi.aws.autoscaling.inputs.TrafficSourceAttachmentTrafficSourceArgs;
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
 *         var example = new TrafficSourceAttachment(&#34;example&#34;, TrafficSourceAttachmentArgs.builder()        
 *             .autoscalingGroupName(exampleAwsAutoscalingGroup.id())
 *             .trafficSource(TrafficSourceAttachmentTrafficSourceArgs.builder()
 *                 .identifier(exampleAwsLbTargetGroup.arn())
 *                 .type(&#34;elbv2&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:autoscaling/trafficSourceAttachment:TrafficSourceAttachment")
public class TrafficSourceAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Auto Scaling group.
     * 
     */
    @Export(name="autoscalingGroupName", refs={String.class}, tree="[0]")
    private Output<String> autoscalingGroupName;

    /**
     * @return The name of the Auto Scaling group.
     * 
     */
    public Output<String> autoscalingGroupName() {
        return this.autoscalingGroupName;
    }
    /**
     * The unique identifiers of a traffic sources.
     * 
     */
    @Export(name="trafficSource", refs={TrafficSourceAttachmentTrafficSource.class}, tree="[0]")
    private Output</* @Nullable */ TrafficSourceAttachmentTrafficSource> trafficSource;

    /**
     * @return The unique identifiers of a traffic sources.
     * 
     */
    public Output<Optional<TrafficSourceAttachmentTrafficSource>> trafficSource() {
        return Codegen.optional(this.trafficSource);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrafficSourceAttachment(String name) {
        this(name, TrafficSourceAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrafficSourceAttachment(String name, TrafficSourceAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrafficSourceAttachment(String name, TrafficSourceAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:autoscaling/trafficSourceAttachment:TrafficSourceAttachment", name, args == null ? TrafficSourceAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TrafficSourceAttachment(String name, Output<String> id, @Nullable TrafficSourceAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:autoscaling/trafficSourceAttachment:TrafficSourceAttachment", name, state, makeResourceOptions(options, id));
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
    public static TrafficSourceAttachment get(String name, Output<String> id, @Nullable TrafficSourceAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TrafficSourceAttachment(name, id, state, options);
    }
}
