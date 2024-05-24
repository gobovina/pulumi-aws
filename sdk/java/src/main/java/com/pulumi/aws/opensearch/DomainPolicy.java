// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.opensearch.DomainPolicyArgs;
import com.pulumi.aws.opensearch.inputs.DomainPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Allows setting policy to an OpenSearch domain while referencing domain attributes (e.g., ARN).
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.opensearch.Domain;
 * import com.pulumi.aws.opensearch.DomainArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.opensearch.DomainPolicy;
 * import com.pulumi.aws.opensearch.DomainPolicyArgs;
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
 *         var example = new Domain("example", DomainArgs.builder()
 *             .domainName("tf-test")
 *             .engineVersion("OpenSearch_1.1")
 *             .build());
 * 
 *         final var main = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect("Allow")
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type("*")
 *                     .identifiers("*")
 *                     .build())
 *                 .actions("es:*")
 *                 .resources(example.arn().applyValue(arn -> String.format("%s/*", arn)))
 *                 .conditions(GetPolicyDocumentStatementConditionArgs.builder()
 *                     .test("IpAddress")
 *                     .variable("aws:SourceIp")
 *                     .values("127.0.0.1/32")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var mainDomainPolicy = new DomainPolicy("mainDomainPolicy", DomainPolicyArgs.builder()
 *             .domainName(example.domainName())
 *             .accessPolicies(main.applyValue(getPolicyDocumentResult -> getPolicyDocumentResult).applyValue(main -> main.applyValue(getPolicyDocumentResult -> getPolicyDocumentResult.json())))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="aws:opensearch/domainPolicy:DomainPolicy")
public class DomainPolicy extends com.pulumi.resources.CustomResource {
    /**
     * IAM policy document specifying the access policies for the domain
     * 
     */
    @Export(name="accessPolicies", refs={String.class}, tree="[0]")
    private Output<String> accessPolicies;

    /**
     * @return IAM policy document specifying the access policies for the domain
     * 
     */
    public Output<String> accessPolicies() {
        return this.accessPolicies;
    }
    /**
     * Name of the domain.
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output<String> domainName;

    /**
     * @return Name of the domain.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainPolicy(String name) {
        this(name, DomainPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainPolicy(String name, DomainPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainPolicy(String name, DomainPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearch/domainPolicy:DomainPolicy", name, args == null ? DomainPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainPolicy(String name, Output<String> id, @Nullable DomainPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearch/domainPolicy:DomainPolicy", name, state, makeResourceOptions(options, id));
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
    public static DomainPolicy get(String name, Output<String> id, @Nullable DomainPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DomainPolicy(name, id, state, options);
    }
}
