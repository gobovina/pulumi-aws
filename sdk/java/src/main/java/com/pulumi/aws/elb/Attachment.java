// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elb.AttachmentArgs;
import com.pulumi.aws.elb.inputs.AttachmentState;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Attaches an EC2 instance to an Elastic Load Balancer (ELB). For attaching resources with Application Load Balancer (ALB) or Network Load Balancer (NLB), see the `aws.lb.TargetGroupAttachment` resource.
 * 
 * &gt; **NOTE on ELB Instances and ELB Attachments:** This provider currently provides
 * both a standalone ELB Attachment resource (describing an instance attached to
 * an ELB), and an Elastic Load Balancer resource with
 * `instances` defined in-line. At this time you cannot use an ELB with in-line
 * instances in conjunction with an ELB Attachment resource. Doing so will cause a
 * conflict and will overwrite attachments.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.elb.Attachment;
 * import com.pulumi.aws.elb.AttachmentArgs;
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
 *         var baz = new Attachment(&#34;baz&#34;, AttachmentArgs.builder()        
 *             .elb(bar.id())
 *             .instance(foo.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:elb/attachment:Attachment")
public class Attachment extends com.pulumi.resources.CustomResource {
    /**
     * The name of the ELB.
     * 
     */
    @Export(name="elb", refs={String.class}, tree="[0]")
    private Output<String> elb;

    /**
     * @return The name of the ELB.
     * 
     */
    public Output<String> elb() {
        return this.elb;
    }
    /**
     * Instance ID to place in the ELB pool.
     * 
     */
    @Export(name="instance", refs={String.class}, tree="[0]")
    private Output<String> instance;

    /**
     * @return Instance ID to place in the ELB pool.
     * 
     */
    public Output<String> instance() {
        return this.instance;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Attachment(String name) {
        this(name, AttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Attachment(String name, AttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Attachment(String name, AttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elb/attachment:Attachment", name, args == null ? AttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Attachment(String name, Output<String> id, @Nullable AttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elb/attachment:Attachment", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:elasticloadbalancing/attachment:Attachment").build())
            ))
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
    public static Attachment get(String name, Output<String> id, @Nullable AttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Attachment(name, id, state, options);
    }
}
