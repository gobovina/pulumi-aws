// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sns;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sns.DataProtectionPolicyArgs;
import com.pulumi.aws.sns.inputs.DataProtectionPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an SNS data protection topic policy resource
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
 * import com.pulumi.aws.sns.Topic;
 * import com.pulumi.aws.sns.TopicArgs;
 * import com.pulumi.aws.sns.DataProtectionPolicy;
 * import com.pulumi.aws.sns.DataProtectionPolicyArgs;
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
 *         var example = new Topic(&#34;example&#34;, TopicArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleDataProtectionPolicy = new DataProtectionPolicy(&#34;exampleDataProtectionPolicy&#34;, DataProtectionPolicyArgs.builder()        
 *             .arn(example.arn())
 *             .policy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Description&#34;, &#34;Example data protection policy&#34;),
 *                     jsonProperty(&#34;Name&#34;, &#34;__example_data_protection_policy&#34;),
 *                     jsonProperty(&#34;Statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;DataDirection&#34;, &#34;Inbound&#34;),
 *                         jsonProperty(&#34;DataIdentifier&#34;, jsonArray(&#34;arn:aws:dataprotection::aws:data-identifier/EmailAddress&#34;)),
 *                         jsonProperty(&#34;Operation&#34;, jsonObject(
 *                             jsonProperty(&#34;Deny&#34;, jsonObject(
 * 
 *                             ))
 *                         )),
 *                         jsonProperty(&#34;Principal&#34;, jsonArray(&#34;*&#34;)),
 *                         jsonProperty(&#34;Sid&#34;, &#34;__deny_statement_11ba9d96&#34;)
 *                     ))),
 *                     jsonProperty(&#34;Version&#34;, &#34;2021-06-01&#34;)
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SNS Data Protection Topic Policy using the topic ARN. For example:
 * 
 * ```sh
 * $ pulumi import aws:sns/dataProtectionPolicy:DataProtectionPolicy example arn:aws:sns:us-west-2:0123456789012:example
 * ```
 * 
 */
@ResourceType(type="aws:sns/dataProtectionPolicy:DataProtectionPolicy")
public class DataProtectionPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the SNS topic
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the SNS topic
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataProtectionPolicy(String name) {
        this(name, DataProtectionPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataProtectionPolicy(String name, DataProtectionPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataProtectionPolicy(String name, DataProtectionPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sns/dataProtectionPolicy:DataProtectionPolicy", name, args == null ? DataProtectionPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataProtectionPolicy(String name, Output<String> id, @Nullable DataProtectionPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sns/dataProtectionPolicy:DataProtectionPolicy", name, state, makeResourceOptions(options, id));
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
    public static DataProtectionPolicy get(String name, Output<String> id, @Nullable DataProtectionPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataProtectionPolicy(name, id, state, options);
    }
}
