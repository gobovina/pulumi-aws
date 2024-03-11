// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.wafregional.RegexPatternSetArgs;
import com.pulumi.aws.wafregional.inputs.RegexPatternSetState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a WAF Regional Regex Pattern Set Resource
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
 * import com.pulumi.aws.wafregional.RegexPatternSet;
 * import com.pulumi.aws.wafregional.RegexPatternSetArgs;
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
 *         var example = new RegexPatternSet(&#34;example&#34;, RegexPatternSetArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .regexPatternStrings(            
 *                 &#34;one&#34;,
 *                 &#34;two&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import WAF Regional Regex Pattern Set using the id. For example:
 * 
 * ```sh
 * $ pulumi import aws:wafregional/regexPatternSet:RegexPatternSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:wafregional/regexPatternSet:RegexPatternSet")
public class RegexPatternSet extends com.pulumi.resources.CustomResource {
    /**
     * The name or description of the Regex Pattern Set.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name or description of the Regex Pattern Set.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of regular expression (regex) patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`.
     * 
     */
    @Export(name="regexPatternStrings", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> regexPatternStrings;

    /**
     * @return A list of regular expression (regex) patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`.
     * 
     */
    public Output<Optional<List<String>>> regexPatternStrings() {
        return Codegen.optional(this.regexPatternStrings);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegexPatternSet(String name) {
        this(name, RegexPatternSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegexPatternSet(String name, @Nullable RegexPatternSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegexPatternSet(String name, @Nullable RegexPatternSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/regexPatternSet:RegexPatternSet", name, args == null ? RegexPatternSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegexPatternSet(String name, Output<String> id, @Nullable RegexPatternSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/regexPatternSet:RegexPatternSet", name, state, makeResourceOptions(options, id));
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
    public static RegexPatternSet get(String name, Output<String> id, @Nullable RegexPatternSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegexPatternSet(name, id, state, options);
    }
}
