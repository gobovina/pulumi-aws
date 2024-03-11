// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ses.DomainDkimArgs;
import com.pulumi.aws.ses.inputs.DomainDkimState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an SES domain DKIM generation resource.
 * 
 * Domain ownership needs to be confirmed first using ses_domain_identity Resource
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
 * import com.pulumi.aws.ses.DomainIdentity;
 * import com.pulumi.aws.ses.DomainIdentityArgs;
 * import com.pulumi.aws.ses.DomainDkim;
 * import com.pulumi.aws.ses.DomainDkimArgs;
 * import com.pulumi.aws.route53.Record;
 * import com.pulumi.aws.route53.RecordArgs;
 * import com.pulumi.codegen.internal.KeyedValue;
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
 *         var example = new DomainIdentity(&#34;example&#34;, DomainIdentityArgs.builder()        
 *             .domain(&#34;example.com&#34;)
 *             .build());
 * 
 *         var exampleDomainDkim = new DomainDkim(&#34;exampleDomainDkim&#34;, DomainDkimArgs.builder()        
 *             .domain(example.domain())
 *             .build());
 * 
 *         for (var i = 0; i &lt; 3; i++) {
 *             new Record(&#34;exampleAmazonsesDkimRecord-&#34; + i, RecordArgs.builder()            
 *                 .zoneId(&#34;ABCDEFGHIJ123&#34;)
 *                 .name(exampleDomainDkim.dkimTokens().applyValue(dkimTokens -&gt; String.format(&#34;%s._domainkey&#34;, dkimTokens[range.value()])))
 *                 .type(&#34;CNAME&#34;)
 *                 .ttl(&#34;600&#34;)
 *                 .records(exampleDomainDkim.dkimTokens().applyValue(dkimTokens -&gt; String.format(&#34;%s.dkim.amazonses.com&#34;, dkimTokens[range.value()])))
 *                 .build());
 * 
 *         
 * }
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import DKIM tokens using the `domain` attribute. For example:
 * 
 * ```sh
 * $ pulumi import aws:ses/domainDkim:DomainDkim example example.com
 * ```
 * 
 */
@ResourceType(type="aws:ses/domainDkim:DomainDkim")
public class DomainDkim extends com.pulumi.resources.CustomResource {
    /**
     * DKIM tokens generated by SES.
     * These tokens should be used to create CNAME records used to verify SES Easy DKIM.
     * See below for an example of how this might be achieved
     * when the domain is hosted in Route 53 and managed by this provider.
     * Find out more about verifying domains in Amazon SES
     * in the [AWS SES docs](http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html).
     * 
     */
    @Export(name="dkimTokens", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> dkimTokens;

    /**
     * @return DKIM tokens generated by SES.
     * These tokens should be used to create CNAME records used to verify SES Easy DKIM.
     * See below for an example of how this might be achieved
     * when the domain is hosted in Route 53 and managed by this provider.
     * Find out more about verifying domains in Amazon SES
     * in the [AWS SES docs](http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html).
     * 
     */
    public Output<List<String>> dkimTokens() {
        return this.dkimTokens;
    }
    /**
     * Verified domain name to generate DKIM tokens for.
     * 
     */
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output<String> domain;

    /**
     * @return Verified domain name to generate DKIM tokens for.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainDkim(String name) {
        this(name, DomainDkimArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainDkim(String name, DomainDkimArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainDkim(String name, DomainDkimArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/domainDkim:DomainDkim", name, args == null ? DomainDkimArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainDkim(String name, Output<String> id, @Nullable DomainDkimState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/domainDkim:DomainDkim", name, state, makeResourceOptions(options, id));
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
    public static DomainDkim get(String name, Output<String> id, @Nullable DomainDkimState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DomainDkim(name, id, state, options);
    }
}
