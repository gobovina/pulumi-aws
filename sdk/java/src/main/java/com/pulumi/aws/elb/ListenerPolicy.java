// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elb.ListenerPolicyArgs;
import com.pulumi.aws.elb.inputs.ListenerPolicyState;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Attaches a load balancer policy to an ELB Listener.
 * 
 * ## Example Usage
 * 
 * ### Custom Policy
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.elb.LoadBalancer;
 * import com.pulumi.aws.elb.LoadBalancerArgs;
 * import com.pulumi.aws.elb.inputs.LoadBalancerListenerArgs;
 * import com.pulumi.aws.elb.LoadBalancerPolicy;
 * import com.pulumi.aws.elb.LoadBalancerPolicyArgs;
 * import com.pulumi.aws.elb.inputs.LoadBalancerPolicyPolicyAttributeArgs;
 * import com.pulumi.aws.elb.ListenerPolicy;
 * import com.pulumi.aws.elb.ListenerPolicyArgs;
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
 *         var wu_tang = new LoadBalancer("wu-tang", LoadBalancerArgs.builder()
 *             .name("wu-tang")
 *             .availabilityZones("us-east-1a")
 *             .listeners(LoadBalancerListenerArgs.builder()
 *                 .instancePort(443)
 *                 .instanceProtocol("http")
 *                 .lbPort(443)
 *                 .lbProtocol("https")
 *                 .sslCertificateId("arn:aws:iam::000000000000:server-certificate/wu-tang.net")
 *                 .build())
 *             .tags(Map.of("Name", "wu-tang"))
 *             .build());
 * 
 *         var wu_tang_ssl = new LoadBalancerPolicy("wu-tang-ssl", LoadBalancerPolicyArgs.builder()
 *             .loadBalancerName(wu_tang.name())
 *             .policyName("wu-tang-ssl")
 *             .policyTypeName("SSLNegotiationPolicyType")
 *             .policyAttributes(            
 *                 LoadBalancerPolicyPolicyAttributeArgs.builder()
 *                     .name("ECDHE-ECDSA-AES128-GCM-SHA256")
 *                     .value("true")
 *                     .build(),
 *                 LoadBalancerPolicyPolicyAttributeArgs.builder()
 *                     .name("Protocol-TLSv1.2")
 *                     .value("true")
 *                     .build())
 *             .build());
 * 
 *         var wu_tang_listener_policies_443 = new ListenerPolicy("wu-tang-listener-policies-443", ListenerPolicyArgs.builder()
 *             .loadBalancerName(wu_tang.name())
 *             .loadBalancerPort(443)
 *             .policyNames(wu_tang_ssl.policyName())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * This example shows how to customize the TLS settings of an HTTPS listener.
 * 
 * ### AWS Predefined Security Policy
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.elb.LoadBalancer;
 * import com.pulumi.aws.elb.LoadBalancerArgs;
 * import com.pulumi.aws.elb.inputs.LoadBalancerListenerArgs;
 * import com.pulumi.aws.elb.LoadBalancerPolicy;
 * import com.pulumi.aws.elb.LoadBalancerPolicyArgs;
 * import com.pulumi.aws.elb.inputs.LoadBalancerPolicyPolicyAttributeArgs;
 * import com.pulumi.aws.elb.ListenerPolicy;
 * import com.pulumi.aws.elb.ListenerPolicyArgs;
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
 *         var wu_tang = new LoadBalancer("wu-tang", LoadBalancerArgs.builder()
 *             .name("wu-tang")
 *             .availabilityZones("us-east-1a")
 *             .listeners(LoadBalancerListenerArgs.builder()
 *                 .instancePort(443)
 *                 .instanceProtocol("http")
 *                 .lbPort(443)
 *                 .lbProtocol("https")
 *                 .sslCertificateId("arn:aws:iam::000000000000:server-certificate/wu-tang.net")
 *                 .build())
 *             .tags(Map.of("Name", "wu-tang"))
 *             .build());
 * 
 *         var wu_tang_ssl_tls_1_1 = new LoadBalancerPolicy("wu-tang-ssl-tls-1-1", LoadBalancerPolicyArgs.builder()
 *             .loadBalancerName(wu_tang.name())
 *             .policyName("wu-tang-ssl")
 *             .policyTypeName("SSLNegotiationPolicyType")
 *             .policyAttributes(LoadBalancerPolicyPolicyAttributeArgs.builder()
 *                 .name("Reference-Security-Policy")
 *                 .value("ELBSecurityPolicy-TLS-1-1-2017-01")
 *                 .build())
 *             .build());
 * 
 *         var wu_tang_listener_policies_443 = new ListenerPolicy("wu-tang-listener-policies-443", ListenerPolicyArgs.builder()
 *             .loadBalancerName(wu_tang.name())
 *             .loadBalancerPort(443)
 *             .policyNames(wu_tang_ssl_tls_1_1.policyName())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * This example shows how to add a [Predefined Security Policy for ELBs](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-security-policy-table.html)
 * 
 */
@ResourceType(type="aws:elb/listenerPolicy:ListenerPolicy")
public class ListenerPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The load balancer to attach the policy to.
     * 
     */
    @Export(name="loadBalancerName", refs={String.class}, tree="[0]")
    private Output<String> loadBalancerName;

    /**
     * @return The load balancer to attach the policy to.
     * 
     */
    public Output<String> loadBalancerName() {
        return this.loadBalancerName;
    }
    /**
     * The load balancer listener port to apply the policy to.
     * 
     */
    @Export(name="loadBalancerPort", refs={Integer.class}, tree="[0]")
    private Output<Integer> loadBalancerPort;

    /**
     * @return The load balancer listener port to apply the policy to.
     * 
     */
    public Output<Integer> loadBalancerPort() {
        return this.loadBalancerPort;
    }
    /**
     * List of Policy Names to apply to the backend server.
     * 
     */
    @Export(name="policyNames", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> policyNames;

    /**
     * @return List of Policy Names to apply to the backend server.
     * 
     */
    public Output<Optional<List<String>>> policyNames() {
        return Codegen.optional(this.policyNames);
    }
    /**
     * Map of arbitrary keys and values that, when changed, will trigger an update.
     * 
     */
    @Export(name="triggers", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> triggers;

    /**
     * @return Map of arbitrary keys and values that, when changed, will trigger an update.
     * 
     */
    public Output<Optional<Map<String,String>>> triggers() {
        return Codegen.optional(this.triggers);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ListenerPolicy(String name) {
        this(name, ListenerPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ListenerPolicy(String name, ListenerPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ListenerPolicy(String name, ListenerPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elb/listenerPolicy:ListenerPolicy", name, args == null ? ListenerPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ListenerPolicy(String name, Output<String> id, @Nullable ListenerPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elb/listenerPolicy:ListenerPolicy", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:elasticloadbalancing/listenerPolicy:ListenerPolicy").build())
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
    public static ListenerPolicy get(String name, Output<String> id, @Nullable ListenerPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ListenerPolicy(name, id, state, options);
    }
}
