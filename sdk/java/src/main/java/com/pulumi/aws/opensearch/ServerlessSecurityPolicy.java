// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.opensearch.ServerlessSecurityPolicyArgs;
import com.pulumi.aws.opensearch.inputs.ServerlessSecurityPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS OpenSearch Serverless Security Policy. See AWS documentation for [encryption policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html#serverless-encryption-policies) and [network policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-network.html#serverless-network-policies).
 * 
 * ## Example Usage
 * 
 * ### Encryption Security Policy
 * ### Applies to a single collection
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.opensearch.ServerlessSecurityPolicy;
 * import com.pulumi.aws.opensearch.ServerlessSecurityPolicyArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var example = new ServerlessSecurityPolicy(&#34;example&#34;, ServerlessSecurityPolicyArgs.builder()        
 *             .type(&#34;encryption&#34;)
 *             .description(&#34;encryption security policy for example-collection&#34;)
 *             .policy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Rules&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Resource&#34;, jsonArray(&#34;collection/example-collection&#34;)),
 *                         jsonProperty(&#34;ResourceType&#34;, &#34;collection&#34;)
 *                     ))),
 *                     jsonProperty(&#34;AWSOwnedKey&#34;, true)
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Applies to multiple collections
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.opensearch.ServerlessSecurityPolicy;
 * import com.pulumi.aws.opensearch.ServerlessSecurityPolicyArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var example = new ServerlessSecurityPolicy(&#34;example&#34;, ServerlessSecurityPolicyArgs.builder()        
 *             .type(&#34;encryption&#34;)
 *             .description(&#34;encryption security policy for collections that begin with \&#34;example\&#34;&#34;)
 *             .policy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Rules&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Resource&#34;, jsonArray(&#34;collection/example*&#34;)),
 *                         jsonProperty(&#34;ResourceType&#34;, &#34;collection&#34;)
 *                     ))),
 *                     jsonProperty(&#34;AWSOwnedKey&#34;, true)
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Using a customer managed key
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.opensearch.ServerlessSecurityPolicy;
 * import com.pulumi.aws.opensearch.ServerlessSecurityPolicyArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var example = new ServerlessSecurityPolicy(&#34;example&#34;, ServerlessSecurityPolicyArgs.builder()        
 *             .type(&#34;encryption&#34;)
 *             .description(&#34;encryption security policy using customer KMS key&#34;)
 *             .policy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Rules&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Resource&#34;, jsonArray(&#34;collection/customer-managed-key-collection&#34;)),
 *                         jsonProperty(&#34;ResourceType&#34;, &#34;collection&#34;)
 *                     ))),
 *                     jsonProperty(&#34;AWSOwnedKey&#34;, false),
 *                     jsonProperty(&#34;KmsARN&#34;, &#34;arn:aws:kms:us-east-1:123456789012:key/93fd6da4-a317-4c17-bfe9-382b5d988b36&#34;)
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Network Security Policy
 * ### Allow public access to the collection endpoint and the Dashboards endpoint
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.opensearch.ServerlessSecurityPolicy;
 * import com.pulumi.aws.opensearch.ServerlessSecurityPolicyArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var example = new ServerlessSecurityPolicy(&#34;example&#34;, ServerlessSecurityPolicyArgs.builder()        
 *             .type(&#34;network&#34;)
 *             .description(&#34;Public access&#34;)
 *             .policy(serializeJson(
 *                 jsonArray(jsonObject(
 *                     jsonProperty(&#34;Description&#34;, &#34;Public access to collection and Dashboards endpoint for example collection&#34;),
 *                     jsonProperty(&#34;Rules&#34;, jsonArray(
 *                         jsonObject(
 *                             jsonProperty(&#34;ResourceType&#34;, &#34;collection&#34;),
 *                             jsonProperty(&#34;Resource&#34;, jsonArray(&#34;collection/example-collection&#34;))
 *                         ), 
 *                         jsonObject(
 *                             jsonProperty(&#34;ResourceType&#34;, &#34;dashboard&#34;),
 *                             jsonProperty(&#34;Resource&#34;, jsonArray(&#34;collection/example-collection&#34;))
 *                         )
 *                     )),
 *                     jsonProperty(&#34;AllowFromPublic&#34;, true)
 *                 ))))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Allow VPC access to the collection endpoint and the Dashboards endpoint
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.opensearch.ServerlessSecurityPolicy;
 * import com.pulumi.aws.opensearch.ServerlessSecurityPolicyArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var example = new ServerlessSecurityPolicy(&#34;example&#34;, ServerlessSecurityPolicyArgs.builder()        
 *             .type(&#34;network&#34;)
 *             .description(&#34;VPC access&#34;)
 *             .policy(serializeJson(
 *                 jsonArray(jsonObject(
 *                     jsonProperty(&#34;Description&#34;, &#34;VPC access to collection and Dashboards endpoint for example collection&#34;),
 *                     jsonProperty(&#34;Rules&#34;, jsonArray(
 *                         jsonObject(
 *                             jsonProperty(&#34;ResourceType&#34;, &#34;collection&#34;),
 *                             jsonProperty(&#34;Resource&#34;, jsonArray(&#34;collection/example-collection&#34;))
 *                         ), 
 *                         jsonObject(
 *                             jsonProperty(&#34;ResourceType&#34;, &#34;dashboard&#34;),
 *                             jsonProperty(&#34;Resource&#34;, jsonArray(&#34;collection/example-collection&#34;))
 *                         )
 *                     )),
 *                     jsonProperty(&#34;AllowFromPublic&#34;, false),
 *                     jsonProperty(&#34;SourceVPCEs&#34;, jsonArray(&#34;vpce-050f79086ee71ac05&#34;))
 *                 ))))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Mixed access for different collections
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.opensearch.ServerlessSecurityPolicy;
 * import com.pulumi.aws.opensearch.ServerlessSecurityPolicyArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var example = new ServerlessSecurityPolicy(&#34;example&#34;, ServerlessSecurityPolicyArgs.builder()        
 *             .type(&#34;network&#34;)
 *             .description(&#34;Mixed access for marketing and sales&#34;)
 *             .policy(serializeJson(
 *                 jsonArray(
 *                     jsonObject(
 *                         jsonProperty(&#34;Description&#34;, &#34;Marketing access&#34;),
 *                         jsonProperty(&#34;Rules&#34;, jsonArray(
 *                             jsonObject(
 *                                 jsonProperty(&#34;ResourceType&#34;, &#34;collection&#34;),
 *                                 jsonProperty(&#34;Resource&#34;, jsonArray(&#34;collection/marketing*&#34;))
 *                             ), 
 *                             jsonObject(
 *                                 jsonProperty(&#34;ResourceType&#34;, &#34;dashboard&#34;),
 *                                 jsonProperty(&#34;Resource&#34;, jsonArray(&#34;collection/marketing*&#34;))
 *                             )
 *                         )),
 *                         jsonProperty(&#34;AllowFromPublic&#34;, false),
 *                         jsonProperty(&#34;SourceVPCEs&#34;, jsonArray(&#34;vpce-050f79086ee71ac05&#34;))
 *                     ), 
 *                     jsonObject(
 *                         jsonProperty(&#34;Description&#34;, &#34;Sales access&#34;),
 *                         jsonProperty(&#34;Rules&#34;, jsonArray(jsonObject(
 *                             jsonProperty(&#34;ResourceType&#34;, &#34;collection&#34;),
 *                             jsonProperty(&#34;Resource&#34;, jsonArray(&#34;collection/finance&#34;))
 *                         ))),
 *                         jsonProperty(&#34;AllowFromPublic&#34;, true)
 *                     )
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import OpenSearchServerless Security Policy using the `name` and `type` arguments separated by a slash (`/`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:opensearch/serverlessSecurityPolicy:ServerlessSecurityPolicy example example/encryption
 * ```
 * 
 */
@ResourceType(type="aws:opensearch/serverlessSecurityPolicy:ServerlessSecurityPolicy")
public class ServerlessSecurityPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Description of the policy. Typically used to store information about the permissions defined in the policy.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the policy. Typically used to store information about the permissions defined in the policy.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the policy.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * JSON policy document to use as the content for the new policy
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return JSON policy document to use as the content for the new policy
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * Version of the policy.
     * 
     */
    @Export(name="policyVersion", refs={String.class}, tree="[0]")
    private Output<String> policyVersion;

    /**
     * @return Version of the policy.
     * 
     */
    public Output<String> policyVersion() {
        return this.policyVersion;
    }
    /**
     * Type of security policy. One of `encryption` or `network`.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of security policy. One of `encryption` or `network`.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerlessSecurityPolicy(String name) {
        this(name, ServerlessSecurityPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerlessSecurityPolicy(String name, ServerlessSecurityPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerlessSecurityPolicy(String name, ServerlessSecurityPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearch/serverlessSecurityPolicy:ServerlessSecurityPolicy", name, args == null ? ServerlessSecurityPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerlessSecurityPolicy(String name, Output<String> id, @Nullable ServerlessSecurityPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearch/serverlessSecurityPolicy:ServerlessSecurityPolicy", name, state, makeResourceOptions(options, id));
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
    public static ServerlessSecurityPolicy get(String name, Output<String> id, @Nullable ServerlessSecurityPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerlessSecurityPolicy(name, id, state, options);
    }
}
