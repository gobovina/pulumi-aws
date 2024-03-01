// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudsearch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudsearch.DomainServiceAccessPolicyArgs;
import com.pulumi.aws.cloudsearch.inputs.DomainServiceAccessPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an CloudSearch domain service access policy resource.
 * 
 * The provider waits for the domain service access policy to become `Active` when applying a configuration.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudsearch.Domain;
 * import com.pulumi.aws.cloudsearch.DomainArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.cloudsearch.DomainServiceAccessPolicy;
 * import com.pulumi.aws.cloudsearch.DomainServiceAccessPolicyArgs;
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
 *         var exampleDomain = new Domain(&#34;exampleDomain&#34;, DomainArgs.builder()        
 *             .name(&#34;example-domain&#34;)
 *             .build());
 * 
 *         final var example = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .sid(&#34;search_only&#34;)
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;*&#34;)
 *                     .identifiers(&#34;*&#34;)
 *                     .build())
 *                 .actions(                
 *                     &#34;cloudsearch:search&#34;,
 *                     &#34;cloudsearch:document&#34;)
 *                 .conditions(GetPolicyDocumentStatementConditionArgs.builder()
 *                     .test(&#34;IpAddress&#34;)
 *                     .variable(&#34;aws:SourceIp&#34;)
 *                     .values(&#34;192.0.2.0/32&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleDomainServiceAccessPolicy = new DomainServiceAccessPolicy(&#34;exampleDomainServiceAccessPolicy&#34;, DomainServiceAccessPolicyArgs.builder()        
 *             .domainName(exampleDomain.id())
 *             .accessPolicy(example.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import CloudSearch domain service access policies using the domain name. For example:
 * 
 * ```sh
 *  $ pulumi import aws:cloudsearch/domainServiceAccessPolicy:DomainServiceAccessPolicy example example-domain
 * ```
 * 
 */
@ResourceType(type="aws:cloudsearch/domainServiceAccessPolicy:DomainServiceAccessPolicy")
public class DomainServiceAccessPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
     * 
     */
    @Export(name="accessPolicy", refs={String.class}, tree="[0]")
    private Output<String> accessPolicy;

    /**
     * @return The access rules you want to configure. These rules replace any existing rules. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html) for details.
     * 
     */
    public Output<String> accessPolicy() {
        return this.accessPolicy;
    }
    /**
     * The CloudSearch domain name the policy applies to.
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output<String> domainName;

    /**
     * @return The CloudSearch domain name the policy applies to.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainServiceAccessPolicy(String name) {
        this(name, DomainServiceAccessPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainServiceAccessPolicy(String name, DomainServiceAccessPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainServiceAccessPolicy(String name, DomainServiceAccessPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudsearch/domainServiceAccessPolicy:DomainServiceAccessPolicy", name, args == null ? DomainServiceAccessPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainServiceAccessPolicy(String name, Output<String> id, @Nullable DomainServiceAccessPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudsearch/domainServiceAccessPolicy:DomainServiceAccessPolicy", name, state, makeResourceOptions(options, id));
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
    public static DomainServiceAccessPolicy get(String name, Output<String> id, @Nullable DomainServiceAccessPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DomainServiceAccessPolicy(name, id, state, options);
    }
}
