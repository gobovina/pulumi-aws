// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ses.ReceiptRuleArgs;
import com.pulumi.aws.ses.inputs.ReceiptRuleState;
import com.pulumi.aws.ses.outputs.ReceiptRuleAddHeaderAction;
import com.pulumi.aws.ses.outputs.ReceiptRuleBounceAction;
import com.pulumi.aws.ses.outputs.ReceiptRuleLambdaAction;
import com.pulumi.aws.ses.outputs.ReceiptRuleS3Action;
import com.pulumi.aws.ses.outputs.ReceiptRuleSnsAction;
import com.pulumi.aws.ses.outputs.ReceiptRuleStopAction;
import com.pulumi.aws.ses.outputs.ReceiptRuleWorkmailAction;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an SES receipt rule resource
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
 * import com.pulumi.aws.ses.ReceiptRule;
 * import com.pulumi.aws.ses.ReceiptRuleArgs;
 * import com.pulumi.aws.ses.inputs.ReceiptRuleAddHeaderActionArgs;
 * import com.pulumi.aws.ses.inputs.ReceiptRuleS3ActionArgs;
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
 *         var store = new ReceiptRule(&#34;store&#34;, ReceiptRuleArgs.builder()        
 *             .name(&#34;store&#34;)
 *             .ruleSetName(&#34;default-rule-set&#34;)
 *             .recipients(&#34;karen@example.com&#34;)
 *             .enabled(true)
 *             .scanEnabled(true)
 *             .addHeaderActions(ReceiptRuleAddHeaderActionArgs.builder()
 *                 .headerName(&#34;Custom-Header&#34;)
 *                 .headerValue(&#34;Added by SES&#34;)
 *                 .position(1)
 *                 .build())
 *             .s3Actions(ReceiptRuleS3ActionArgs.builder()
 *                 .bucketName(&#34;emails&#34;)
 *                 .position(2)
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
 * Using `pulumi import`, import SES receipt rules using the ruleset name and rule name separated by `:`. For example:
 * 
 * ```sh
 * $ pulumi import aws:ses/receiptRule:ReceiptRule my_rule my_rule_set:my_rule
 * ```
 * 
 */
@ResourceType(type="aws:ses/receiptRule:ReceiptRule")
public class ReceiptRule extends com.pulumi.resources.CustomResource {
    /**
     * A list of Add Header Action blocks. Documented below.
     * 
     */
    @Export(name="addHeaderActions", refs={List.class,ReceiptRuleAddHeaderAction.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ReceiptRuleAddHeaderAction>> addHeaderActions;

    /**
     * @return A list of Add Header Action blocks. Documented below.
     * 
     */
    public Output<Optional<List<ReceiptRuleAddHeaderAction>>> addHeaderActions() {
        return Codegen.optional(this.addHeaderActions);
    }
    /**
     * The name of the rule to place this rule after
     * 
     */
    @Export(name="after", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> after;

    /**
     * @return The name of the rule to place this rule after
     * 
     */
    public Output<Optional<String>> after() {
        return Codegen.optional(this.after);
    }
    /**
     * The SES receipt rule ARN.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The SES receipt rule ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A list of Bounce Action blocks. Documented below.
     * 
     */
    @Export(name="bounceActions", refs={List.class,ReceiptRuleBounceAction.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ReceiptRuleBounceAction>> bounceActions;

    /**
     * @return A list of Bounce Action blocks. Documented below.
     * 
     */
    public Output<Optional<List<ReceiptRuleBounceAction>>> bounceActions() {
        return Codegen.optional(this.bounceActions);
    }
    /**
     * If true, the rule will be enabled
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return If true, the rule will be enabled
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * A list of Lambda Action blocks. Documented below.
     * 
     */
    @Export(name="lambdaActions", refs={List.class,ReceiptRuleLambdaAction.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ReceiptRuleLambdaAction>> lambdaActions;

    /**
     * @return A list of Lambda Action blocks. Documented below.
     * 
     */
    public Output<Optional<List<ReceiptRuleLambdaAction>>> lambdaActions() {
        return Codegen.optional(this.lambdaActions);
    }
    /**
     * The name of the rule
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the rule
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of email addresses
     * 
     */
    @Export(name="recipients", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> recipients;

    /**
     * @return A list of email addresses
     * 
     */
    public Output<Optional<List<String>>> recipients() {
        return Codegen.optional(this.recipients);
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
     * A list of S3 Action blocks. Documented below.
     * 
     */
    @Export(name="s3Actions", refs={List.class,ReceiptRuleS3Action.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ReceiptRuleS3Action>> s3Actions;

    /**
     * @return A list of S3 Action blocks. Documented below.
     * 
     */
    public Output<Optional<List<ReceiptRuleS3Action>>> s3Actions() {
        return Codegen.optional(this.s3Actions);
    }
    /**
     * If true, incoming emails will be scanned for spam and viruses
     * 
     */
    @Export(name="scanEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> scanEnabled;

    /**
     * @return If true, incoming emails will be scanned for spam and viruses
     * 
     */
    public Output<Optional<Boolean>> scanEnabled() {
        return Codegen.optional(this.scanEnabled);
    }
    /**
     * A list of SNS Action blocks. Documented below.
     * 
     */
    @Export(name="snsActions", refs={List.class,ReceiptRuleSnsAction.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ReceiptRuleSnsAction>> snsActions;

    /**
     * @return A list of SNS Action blocks. Documented below.
     * 
     */
    public Output<Optional<List<ReceiptRuleSnsAction>>> snsActions() {
        return Codegen.optional(this.snsActions);
    }
    /**
     * A list of Stop Action blocks. Documented below.
     * 
     */
    @Export(name="stopActions", refs={List.class,ReceiptRuleStopAction.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ReceiptRuleStopAction>> stopActions;

    /**
     * @return A list of Stop Action blocks. Documented below.
     * 
     */
    public Output<Optional<List<ReceiptRuleStopAction>>> stopActions() {
        return Codegen.optional(this.stopActions);
    }
    /**
     * `Require` or `Optional`
     * 
     */
    @Export(name="tlsPolicy", refs={String.class}, tree="[0]")
    private Output<String> tlsPolicy;

    /**
     * @return `Require` or `Optional`
     * 
     */
    public Output<String> tlsPolicy() {
        return this.tlsPolicy;
    }
    /**
     * A list of WorkMail Action blocks. Documented below.
     * 
     */
    @Export(name="workmailActions", refs={List.class,ReceiptRuleWorkmailAction.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ReceiptRuleWorkmailAction>> workmailActions;

    /**
     * @return A list of WorkMail Action blocks. Documented below.
     * 
     */
    public Output<Optional<List<ReceiptRuleWorkmailAction>>> workmailActions() {
        return Codegen.optional(this.workmailActions);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReceiptRule(String name) {
        this(name, ReceiptRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReceiptRule(String name, ReceiptRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReceiptRule(String name, ReceiptRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/receiptRule:ReceiptRule", name, args == null ? ReceiptRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReceiptRule(String name, Output<String> id, @Nullable ReceiptRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/receiptRule:ReceiptRule", name, state, makeResourceOptions(options, id));
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
    public static ReceiptRule get(String name, Output<String> id, @Nullable ReceiptRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReceiptRule(name, id, state, options);
    }
}
