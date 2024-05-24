// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lb.ListenerArgs;
import com.pulumi.aws.lb.inputs.ListenerState;
import com.pulumi.aws.lb.outputs.ListenerDefaultAction;
import com.pulumi.aws.lb.outputs.ListenerMutualAuthentication;
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
 * Provides a Load Balancer Listener resource.
 * 
 * &gt; **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
 * 
 * ## Example Usage
 * 
 * ### Forward Action
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
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
 *         var frontEnd = new LoadBalancer("frontEnd");
 * 
 *         var frontEndTargetGroup = new TargetGroup("frontEndTargetGroup");
 * 
 *         var frontEndListener = new Listener("frontEndListener", ListenerArgs.builder()
 *             .loadBalancerArn(frontEnd.arn())
 *             .port("443")
 *             .protocol("HTTPS")
 *             .sslPolicy("ELBSecurityPolicy-2016-08")
 *             .certificateArn("arn:aws:iam::187416307283:server-certificate/test_cert_rab3wuqwgja25ct3n4jdj2tzu4")
 *             .defaultActions(ListenerDefaultActionArgs.builder()
 *                 .type("forward")
 *                 .targetGroupArn(frontEndTargetGroup.arn())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * To a NLB:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
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
 *         var frontEnd = new Listener("frontEnd", ListenerArgs.builder()
 *             .loadBalancerArn(frontEndAwsLb.arn())
 *             .port("443")
 *             .protocol("TLS")
 *             .certificateArn("arn:aws:iam::187416307283:server-certificate/test_cert_rab3wuqwgja25ct3n4jdj2tzu4")
 *             .alpnPolicy("HTTP2Preferred")
 *             .defaultActions(ListenerDefaultActionArgs.builder()
 *                 .type("forward")
 *                 .targetGroupArn(frontEndAwsLbTargetGroup.arn())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Redirect Action
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionRedirectArgs;
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
 *         var frontEnd = new LoadBalancer("frontEnd");
 * 
 *         var frontEndListener = new Listener("frontEndListener", ListenerArgs.builder()
 *             .loadBalancerArn(frontEnd.arn())
 *             .port("80")
 *             .protocol("HTTP")
 *             .defaultActions(ListenerDefaultActionArgs.builder()
 *                 .type("redirect")
 *                 .redirect(ListenerDefaultActionRedirectArgs.builder()
 *                     .port("443")
 *                     .protocol("HTTPS")
 *                     .statusCode("HTTP_301")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Fixed-response Action
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionFixedResponseArgs;
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
 *         var frontEnd = new LoadBalancer("frontEnd");
 * 
 *         var frontEndListener = new Listener("frontEndListener", ListenerArgs.builder()
 *             .loadBalancerArn(frontEnd.arn())
 *             .port("80")
 *             .protocol("HTTP")
 *             .defaultActions(ListenerDefaultActionArgs.builder()
 *                 .type("fixed-response")
 *                 .fixedResponse(ListenerDefaultActionFixedResponseArgs.builder()
 *                     .contentType("text/plain")
 *                     .messageBody("Fixed response content")
 *                     .statusCode("200")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Authenticate-cognito Action
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.cognito.UserPool;
 * import com.pulumi.aws.cognito.UserPoolClient;
 * import com.pulumi.aws.cognito.UserPoolDomain;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionAuthenticateCognitoArgs;
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
 *         var frontEnd = new LoadBalancer("frontEnd");
 * 
 *         var frontEndTargetGroup = new TargetGroup("frontEndTargetGroup");
 * 
 *         var pool = new UserPool("pool");
 * 
 *         var client = new UserPoolClient("client");
 * 
 *         var domain = new UserPoolDomain("domain");
 * 
 *         var frontEndListener = new Listener("frontEndListener", ListenerArgs.builder()
 *             .loadBalancerArn(frontEnd.arn())
 *             .port("80")
 *             .protocol("HTTP")
 *             .defaultActions(            
 *                 ListenerDefaultActionArgs.builder()
 *                     .type("authenticate-cognito")
 *                     .authenticateCognito(ListenerDefaultActionAuthenticateCognitoArgs.builder()
 *                         .userPoolArn(pool.arn())
 *                         .userPoolClientId(client.id())
 *                         .userPoolDomain(domain.domain())
 *                         .build())
 *                     .build(),
 *                 ListenerDefaultActionArgs.builder()
 *                     .type("forward")
 *                     .targetGroupArn(frontEndTargetGroup.arn())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Authenticate-OIDC Action
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionAuthenticateOidcArgs;
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
 *         var frontEnd = new LoadBalancer("frontEnd");
 * 
 *         var frontEndTargetGroup = new TargetGroup("frontEndTargetGroup");
 * 
 *         var frontEndListener = new Listener("frontEndListener", ListenerArgs.builder()
 *             .loadBalancerArn(frontEnd.arn())
 *             .port("80")
 *             .protocol("HTTP")
 *             .defaultActions(            
 *                 ListenerDefaultActionArgs.builder()
 *                     .type("authenticate-oidc")
 *                     .authenticateOidc(ListenerDefaultActionAuthenticateOidcArgs.builder()
 *                         .authorizationEndpoint("https://example.com/authorization_endpoint")
 *                         .clientId("client_id")
 *                         .clientSecret("client_secret")
 *                         .issuer("https://example.com")
 *                         .tokenEndpoint("https://example.com/token_endpoint")
 *                         .userInfoEndpoint("https://example.com/user_info_endpoint")
 *                         .build())
 *                     .build(),
 *                 ListenerDefaultActionArgs.builder()
 *                     .type("forward")
 *                     .targetGroupArn(frontEndTargetGroup.arn())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Gateway Load Balancer Listener
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.LoadBalancerArgs;
 * import com.pulumi.aws.lb.inputs.LoadBalancerSubnetMappingArgs;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.lb.TargetGroupArgs;
 * import com.pulumi.aws.lb.inputs.TargetGroupHealthCheckArgs;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
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
 *         var example = new LoadBalancer("example", LoadBalancerArgs.builder()
 *             .loadBalancerType("gateway")
 *             .name("example")
 *             .subnetMappings(LoadBalancerSubnetMappingArgs.builder()
 *                 .subnetId(exampleAwsSubnet.id())
 *                 .build())
 *             .build());
 * 
 *         var exampleTargetGroup = new TargetGroup("exampleTargetGroup", TargetGroupArgs.builder()
 *             .name("example")
 *             .port(6081)
 *             .protocol("GENEVE")
 *             .vpcId(exampleAwsVpc.id())
 *             .healthCheck(TargetGroupHealthCheckArgs.builder()
 *                 .port(80)
 *                 .protocol("HTTP")
 *                 .build())
 *             .build());
 * 
 *         var exampleListener = new Listener("exampleListener", ListenerArgs.builder()
 *             .loadBalancerArn(example.id())
 *             .defaultActions(ListenerDefaultActionArgs.builder()
 *                 .targetGroupArn(exampleTargetGroup.id())
 *                 .type("forward")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Mutual TLS Authentication
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.LoadBalancerArgs;
 * import com.pulumi.aws.lb.TargetGroup;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerArgs;
 * import com.pulumi.aws.lb.inputs.ListenerDefaultActionArgs;
 * import com.pulumi.aws.lb.inputs.ListenerMutualAuthenticationArgs;
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
 *         var example = new LoadBalancer("example", LoadBalancerArgs.builder()
 *             .loadBalancerType("application")
 *             .build());
 * 
 *         var exampleTargetGroup = new TargetGroup("exampleTargetGroup");
 * 
 *         var exampleListener = new Listener("exampleListener", ListenerArgs.builder()
 *             .loadBalancerArn(example.id())
 *             .defaultActions(ListenerDefaultActionArgs.builder()
 *                 .targetGroupArn(exampleTargetGroup.id())
 *                 .type("forward")
 *                 .build())
 *             .mutualAuthentication(ListenerMutualAuthenticationArgs.builder()
 *                 .mode("verify")
 *                 .trustStoreArn("...")
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
 * Using `pulumi import`, import listeners using their ARN. For example:
 * 
 * ```sh
 * $ pulumi import aws:lb/listener:Listener front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:listener/app/front-end-alb/8e4497da625e2d8a/9ab28ade35828f96
 * ```
 * 
 */
@ResourceType(type="aws:lb/listener:Listener")
public class Listener extends com.pulumi.resources.CustomResource {
    /**
     * Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     * 
     */
    @Export(name="alpnPolicy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> alpnPolicy;

    /**
     * @return Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     * 
     */
    public Output<Optional<String>> alpnPolicy() {
        return Codegen.optional(this.alpnPolicy);
    }
    /**
     * ARN of the listener (matches `id`).
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the listener (matches `id`).
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     * 
     */
    @Export(name="certificateArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateArn;

    /**
     * @return ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     * 
     */
    public Output<Optional<String>> certificateArn() {
        return Codegen.optional(this.certificateArn);
    }
    /**
     * Configuration block for default actions. Detailed below.
     * 
     */
    @Export(name="defaultActions", refs={List.class,ListenerDefaultAction.class}, tree="[0,1]")
    private Output<List<ListenerDefaultAction>> defaultActions;

    /**
     * @return Configuration block for default actions. Detailed below.
     * 
     */
    public Output<List<ListenerDefaultAction>> defaultActions() {
        return this.defaultActions;
    }
    /**
     * ARN of the load balancer.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="loadBalancerArn", refs={String.class}, tree="[0]")
    private Output<String> loadBalancerArn;

    /**
     * @return ARN of the load balancer.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> loadBalancerArn() {
        return this.loadBalancerArn;
    }
    /**
     * The mutual authentication configuration information. Detailed below.
     * 
     */
    @Export(name="mutualAuthentication", refs={ListenerMutualAuthentication.class}, tree="[0]")
    private Output<ListenerMutualAuthentication> mutualAuthentication;

    /**
     * @return The mutual authentication configuration information. Detailed below.
     * 
     */
    public Output<ListenerMutualAuthentication> mutualAuthentication() {
        return this.mutualAuthentication;
    }
    /**
     * Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> port;

    /**
     * @return Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output<String> protocol;

    /**
     * @return Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     * 
     */
    @Export(name="sslPolicy", refs={String.class}, tree="[0]")
    private Output<String> sslPolicy;

    /**
     * @return Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     * 
     */
    public Output<String> sslPolicy() {
        return this.sslPolicy;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     * &gt; **NOTE::** Please note that listeners that are attached to Application Load Balancers must use either `HTTP` or `HTTPS` protocols while listeners that are attached to Network Load Balancers must use the `TCP` protocol.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     * &gt; **NOTE::** Please note that listeners that are attached to Application Load Balancers must use either `HTTP` or `HTTPS` protocols while listeners that are attached to Network Load Balancers must use the `TCP` protocol.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
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
    public Listener(String name) {
        this(name, ListenerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Listener(String name, ListenerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Listener(String name, ListenerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lb/listener:Listener", name, args == null ? ListenerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Listener(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lb/listener:Listener", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:elasticloadbalancingv2/listener:Listener").build())
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
    public static Listener get(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Listener(name, id, state, options);
    }
}
