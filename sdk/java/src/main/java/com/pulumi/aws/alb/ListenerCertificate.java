// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.alb.ListenerCertificateArgs;
import com.pulumi.aws.alb.inputs.ListenerCertificateState;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Load Balancer Listener Certificate resource.
 * 
 * This resource is for additional certificates and does not replace the default certificate on the listener.
 * 
 * &gt; **Note:** `aws.alb.ListenerCertificate` is known as `aws.lb.ListenerCertificate`. The functionality is identical.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.acm.Certificate;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerCertificate;
 * import com.pulumi.aws.lb.ListenerCertificateArgs;
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
 *         var exampleCertificate = new Certificate(&#34;exampleCertificate&#34;);
 * 
 *         var frontEndLoadBalancer = new LoadBalancer(&#34;frontEndLoadBalancer&#34;);
 * 
 *         var frontEndListener = new Listener(&#34;frontEndListener&#34;);
 * 
 *         var exampleListenerCertificate = new ListenerCertificate(&#34;exampleListenerCertificate&#34;, ListenerCertificateArgs.builder()        
 *             .listenerArn(frontEndListener.arn())
 *             .certificateArn(exampleCertificate.arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Listener Certificates using the listener arn and certificate arn, separated by an underscore (`_`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:alb/listenerCertificate:ListenerCertificate example arn:aws:elasticloadbalancing:us-west-2:123456789012:listener/app/test/8e4497da625e2d8a/9ab28ade35828f96/67b3d2d36dd7c26b_arn:aws:iam::123456789012:server-certificate/tf-acc-test-6453083910015726063
 * ```
 * 
 */
@ResourceType(type="aws:alb/listenerCertificate:ListenerCertificate")
public class ListenerCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the certificate to attach to the listener.
     * 
     */
    @Export(name="certificateArn", refs={String.class}, tree="[0]")
    private Output<String> certificateArn;

    /**
     * @return The ARN of the certificate to attach to the listener.
     * 
     */
    public Output<String> certificateArn() {
        return this.certificateArn;
    }
    /**
     * The ARN of the listener to which to attach the certificate.
     * 
     */
    @Export(name="listenerArn", refs={String.class}, tree="[0]")
    private Output<String> listenerArn;

    /**
     * @return The ARN of the listener to which to attach the certificate.
     * 
     */
    public Output<String> listenerArn() {
        return this.listenerArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ListenerCertificate(String name) {
        this(name, ListenerCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ListenerCertificate(String name, ListenerCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ListenerCertificate(String name, ListenerCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:alb/listenerCertificate:ListenerCertificate", name, args == null ? ListenerCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ListenerCertificate(String name, Output<String> id, @Nullable ListenerCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:alb/listenerCertificate:ListenerCertificate", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:applicationloadbalancing/listenerCertificate:ListenerCertificate").build())
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
    public static ListenerCertificate get(String name, Output<String> id, @Nullable ListenerCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ListenerCertificate(name, id, state, options);
    }
}
