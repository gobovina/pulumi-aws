// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudwatch.EventConnectionArgs;
import com.pulumi.aws.cloudwatch.inputs.EventConnectionState;
import com.pulumi.aws.cloudwatch.outputs.EventConnectionAuthParameters;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an EventBridge connection resource.
 * 
 * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
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
 * import com.pulumi.aws.cloudwatch.EventConnection;
 * import com.pulumi.aws.cloudwatch.EventConnectionArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersApiKeyArgs;
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
 *         var test = new EventConnection(&#34;test&#34;, EventConnectionArgs.builder()        
 *             .name(&#34;ngrok-connection&#34;)
 *             .description(&#34;A connection description&#34;)
 *             .authorizationType(&#34;API_KEY&#34;)
 *             .authParameters(EventConnectionAuthParametersArgs.builder()
 *                 .apiKey(EventConnectionAuthParametersApiKeyArgs.builder()
 *                     .key(&#34;x-signature&#34;)
 *                     .value(&#34;1234&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Basic Authorization
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudwatch.EventConnection;
 * import com.pulumi.aws.cloudwatch.EventConnectionArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersBasicArgs;
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
 *         var test = new EventConnection(&#34;test&#34;, EventConnectionArgs.builder()        
 *             .name(&#34;ngrok-connection&#34;)
 *             .description(&#34;A connection description&#34;)
 *             .authorizationType(&#34;BASIC&#34;)
 *             .authParameters(EventConnectionAuthParametersArgs.builder()
 *                 .basic(EventConnectionAuthParametersBasicArgs.builder()
 *                     .username(&#34;user&#34;)
 *                     .password(&#34;Pass1234!&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### OAuth Authorization
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudwatch.EventConnection;
 * import com.pulumi.aws.cloudwatch.EventConnectionArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthClientParametersArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersOauthOauthHttpParametersArgs;
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
 *         var test = new EventConnection(&#34;test&#34;, EventConnectionArgs.builder()        
 *             .name(&#34;ngrok-connection&#34;)
 *             .description(&#34;A connection description&#34;)
 *             .authorizationType(&#34;OAUTH_CLIENT_CREDENTIALS&#34;)
 *             .authParameters(EventConnectionAuthParametersArgs.builder()
 *                 .oauth(EventConnectionAuthParametersOauthArgs.builder()
 *                     .authorizationEndpoint(&#34;https://auth.url.com/endpoint&#34;)
 *                     .httpMethod(&#34;GET&#34;)
 *                     .clientParameters(EventConnectionAuthParametersOauthClientParametersArgs.builder()
 *                         .clientId(&#34;1234567890&#34;)
 *                         .clientSecret(&#34;Pass1234!&#34;)
 *                         .build())
 *                     .oauthHttpParameters(EventConnectionAuthParametersOauthOauthHttpParametersArgs.builder()
 *                         .bodies(EventConnectionAuthParametersOauthOauthHttpParametersBodyArgs.builder()
 *                             .key(&#34;body-parameter-key&#34;)
 *                             .value(&#34;body-parameter-value&#34;)
 *                             .isValueSecret(false)
 *                             .build())
 *                         .headers(EventConnectionAuthParametersOauthOauthHttpParametersHeaderArgs.builder()
 *                             .key(&#34;header-parameter-key&#34;)
 *                             .value(&#34;header-parameter-value&#34;)
 *                             .isValueSecret(false)
 *                             .build())
 *                         .queryStrings(EventConnectionAuthParametersOauthOauthHttpParametersQueryStringArgs.builder()
 *                             .key(&#34;query-string-parameter-key&#34;)
 *                             .value(&#34;query-string-parameter-value&#34;)
 *                             .isValueSecret(false)
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Invocation Http Parameters
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudwatch.EventConnection;
 * import com.pulumi.aws.cloudwatch.EventConnectionArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersBasicArgs;
 * import com.pulumi.aws.cloudwatch.inputs.EventConnectionAuthParametersInvocationHttpParametersArgs;
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
 *         var test = new EventConnection(&#34;test&#34;, EventConnectionArgs.builder()        
 *             .name(&#34;ngrok-connection&#34;)
 *             .description(&#34;A connection description&#34;)
 *             .authorizationType(&#34;BASIC&#34;)
 *             .authParameters(EventConnectionAuthParametersArgs.builder()
 *                 .basic(EventConnectionAuthParametersBasicArgs.builder()
 *                     .username(&#34;user&#34;)
 *                     .password(&#34;Pass1234!&#34;)
 *                     .build())
 *                 .invocationHttpParameters(EventConnectionAuthParametersInvocationHttpParametersArgs.builder()
 *                     .bodies(                    
 *                         EventConnectionAuthParametersInvocationHttpParametersBodyArgs.builder()
 *                             .key(&#34;body-parameter-key&#34;)
 *                             .value(&#34;body-parameter-value&#34;)
 *                             .isValueSecret(false)
 *                             .build(),
 *                         EventConnectionAuthParametersInvocationHttpParametersBodyArgs.builder()
 *                             .key(&#34;body-parameter-key2&#34;)
 *                             .value(&#34;body-parameter-value2&#34;)
 *                             .isValueSecret(true)
 *                             .build())
 *                     .headers(EventConnectionAuthParametersInvocationHttpParametersHeaderArgs.builder()
 *                         .key(&#34;header-parameter-key&#34;)
 *                         .value(&#34;header-parameter-value&#34;)
 *                         .isValueSecret(false)
 *                         .build())
 *                     .queryStrings(EventConnectionAuthParametersInvocationHttpParametersQueryStringArgs.builder()
 *                         .key(&#34;query-string-parameter-key&#34;)
 *                         .value(&#34;query-string-parameter-value&#34;)
 *                         .isValueSecret(false)
 *                         .build())
 *                     .build())
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
 * Using `pulumi import`, import EventBridge EventBridge connection using the `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:cloudwatch/eventConnection:EventConnection test ngrok-connection
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/eventConnection:EventConnection")
public class EventConnection extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the connection.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the connection.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Parameters used for authorization. A maximum of 1 are allowed. Documented below.
     * 
     */
    @Export(name="authParameters", refs={EventConnectionAuthParameters.class}, tree="[0]")
    private Output<EventConnectionAuthParameters> authParameters;

    /**
     * @return Parameters used for authorization. A maximum of 1 are allowed. Documented below.
     * 
     */
    public Output<EventConnectionAuthParameters> authParameters() {
        return this.authParameters;
    }
    /**
     * Choose the type of authorization to use for the connection. One of `API_KEY`,`BASIC`,`OAUTH_CLIENT_CREDENTIALS`.
     * 
     */
    @Export(name="authorizationType", refs={String.class}, tree="[0]")
    private Output<String> authorizationType;

    /**
     * @return Choose the type of authorization to use for the connection. One of `API_KEY`,`BASIC`,`OAUTH_CLIENT_CREDENTIALS`.
     * 
     */
    public Output<String> authorizationType() {
        return this.authorizationType;
    }
    /**
     * Enter a description for the connection. Maximum of 512 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Enter a description for the connection. Maximum of 512 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the new connection. Maximum of 64 characters consisting of numbers, lower/upper case letters, .,-,_.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the new connection. Maximum of 64 characters consisting of numbers, lower/upper case letters, .,-,_.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Amazon Resource Name (ARN) of the secret created from the authorization parameters specified for the connection.
     * 
     */
    @Export(name="secretArn", refs={String.class}, tree="[0]")
    private Output<String> secretArn;

    /**
     * @return The Amazon Resource Name (ARN) of the secret created from the authorization parameters specified for the connection.
     * 
     */
    public Output<String> secretArn() {
        return this.secretArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventConnection(String name) {
        this(name, EventConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventConnection(String name, EventConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventConnection(String name, EventConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventConnection:EventConnection", name, args == null ? EventConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventConnection(String name, Output<String> id, @Nullable EventConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventConnection:EventConnection", name, state, makeResourceOptions(options, id));
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
    public static EventConnection get(String name, Output<String> id, @Nullable EventConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventConnection(name, id, state, options);
    }
}
