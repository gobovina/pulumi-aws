// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ses.ActiveReceiptRuleSetArgs;
import com.pulumi.aws.ses.inputs.ActiveReceiptRuleSetState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to designate the active SES receipt rule set
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
 * import com.pulumi.aws.ses.ActiveReceiptRuleSet;
 * import com.pulumi.aws.ses.ActiveReceiptRuleSetArgs;
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
 *         var main = new ActiveReceiptRuleSet(&#34;main&#34;, ActiveReceiptRuleSetArgs.builder()        
 *             .ruleSetName(&#34;primary-rules&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import active SES receipt rule sets using the rule set name. For example:
 * 
 * ```sh
 * $ pulumi import aws:ses/activeReceiptRuleSet:ActiveReceiptRuleSet my_rule_set my_rule_set_name
 * ```
 * 
 */
@ResourceType(type="aws:ses/activeReceiptRuleSet:ActiveReceiptRuleSet")
public class ActiveReceiptRuleSet extends com.pulumi.resources.CustomResource {
    /**
     * The SES receipt rule set ARN.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The SES receipt rule set ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of the rule set
     * 
     */
    @Export(name="ruleSetName", refs={String.class}, tree="[0]")
    private Output<String> ruleSetName;

    /**
     * @return The name of the rule set
     * 
     */
    public Output<String> ruleSetName() {
        return this.ruleSetName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ActiveReceiptRuleSet(String name) {
        this(name, ActiveReceiptRuleSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ActiveReceiptRuleSet(String name, ActiveReceiptRuleSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ActiveReceiptRuleSet(String name, ActiveReceiptRuleSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/activeReceiptRuleSet:ActiveReceiptRuleSet", name, args == null ? ActiveReceiptRuleSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ActiveReceiptRuleSet(String name, Output<String> id, @Nullable ActiveReceiptRuleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/activeReceiptRuleSet:ActiveReceiptRuleSet", name, state, makeResourceOptions(options, id));
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
    public static ActiveReceiptRuleSet get(String name, Output<String> id, @Nullable ActiveReceiptRuleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ActiveReceiptRuleSet(name, id, state, options);
    }
}
