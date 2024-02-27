// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.wafv2.WebAclArgs;
import com.pulumi.aws.wafv2.inputs.WebAclState;
import com.pulumi.aws.wafv2.outputs.WebAclAssociationConfig;
import com.pulumi.aws.wafv2.outputs.WebAclCaptchaConfig;
import com.pulumi.aws.wafv2.outputs.WebAclChallengeConfig;
import com.pulumi.aws.wafv2.outputs.WebAclCustomResponseBody;
import com.pulumi.aws.wafv2.outputs.WebAclDefaultAction;
import com.pulumi.aws.wafv2.outputs.WebAclRule;
import com.pulumi.aws.wafv2.outputs.WebAclVisibilityConfig;
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

@ResourceType(type="aws:wafv2/webAcl:WebAcl")
public class WebAcl extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies custom configurations for the associations between the web ACL and protected resources. See `association_config` below for details.
     * 
     */
    @Export(name="associationConfig", refs={WebAclAssociationConfig.class}, tree="[0]")
    private Output</* @Nullable */ WebAclAssociationConfig> associationConfig;

    /**
     * @return Specifies custom configurations for the associations between the web ACL and protected resources. See `association_config` below for details.
     * 
     */
    public Output<Optional<WebAclAssociationConfig>> associationConfig() {
        return Codegen.optional(this.associationConfig);
    }
    /**
     * Web ACL capacity units (WCUs) currently being used by this web ACL.
     * 
     */
    @Export(name="capacity", refs={Integer.class}, tree="[0]")
    private Output<Integer> capacity;

    /**
     * @return Web ACL capacity units (WCUs) currently being used by this web ACL.
     * 
     */
    public Output<Integer> capacity() {
        return this.capacity;
    }
    /**
     * Specifies how AWS WAF should handle CAPTCHA evaluations on the ACL level (used by [AWS Bot Control](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)). See `captcha_config` below for details.
     * 
     */
    @Export(name="captchaConfig", refs={WebAclCaptchaConfig.class}, tree="[0]")
    private Output</* @Nullable */ WebAclCaptchaConfig> captchaConfig;

    /**
     * @return Specifies how AWS WAF should handle CAPTCHA evaluations on the ACL level (used by [AWS Bot Control](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)). See `captcha_config` below for details.
     * 
     */
    public Output<Optional<WebAclCaptchaConfig>> captchaConfig() {
        return Codegen.optional(this.captchaConfig);
    }
    /**
     * Specifies how AWS WAF should handle Challenge evaluations on the ACL level (used by [AWS Bot Control](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)). See `challenge_config` below for details.
     * 
     */
    @Export(name="challengeConfig", refs={WebAclChallengeConfig.class}, tree="[0]")
    private Output</* @Nullable */ WebAclChallengeConfig> challengeConfig;

    /**
     * @return Specifies how AWS WAF should handle Challenge evaluations on the ACL level (used by [AWS Bot Control](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)). See `challenge_config` below for details.
     * 
     */
    public Output<Optional<WebAclChallengeConfig>> challengeConfig() {
        return Codegen.optional(this.challengeConfig);
    }
    /**
     * Defines custom response bodies that can be referenced by `custom_response` actions. See `custom_response_body` below for details.
     * 
     */
    @Export(name="customResponseBodies", refs={List.class,WebAclCustomResponseBody.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WebAclCustomResponseBody>> customResponseBodies;

    /**
     * @return Defines custom response bodies that can be referenced by `custom_response` actions. See `custom_response_body` below for details.
     * 
     */
    public Output<Optional<List<WebAclCustomResponseBody>>> customResponseBodies() {
        return Codegen.optional(this.customResponseBodies);
    }
    /**
     * Action to perform if none of the `rules` contained in the WebACL match. See `default_action` below for details.
     * 
     */
    @Export(name="defaultAction", refs={WebAclDefaultAction.class}, tree="[0]")
    private Output<WebAclDefaultAction> defaultAction;

    /**
     * @return Action to perform if none of the `rules` contained in the WebACL match. See `default_action` below for details.
     * 
     */
    public Output<WebAclDefaultAction> defaultAction() {
        return this.defaultAction;
    }
    /**
     * Friendly description of the WebACL.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Friendly description of the WebACL.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="lockToken", refs={String.class}, tree="[0]")
    private Output<String> lockToken;

    public Output<String> lockToken() {
        return this.lockToken;
    }
    /**
     * Friendly name of the WebACL.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Friendly name of the WebACL.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See `rule` below for details.
     * 
     */
    @Export(name="rules", refs={List.class,WebAclRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WebAclRule>> rules;

    /**
     * @return Rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See `rule` below for details.
     * 
     */
    public Output<Optional<List<WebAclRule>>> rules() {
        return Codegen.optional(this.rules);
    }
    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output<String> scope;

    /**
     * @return Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * Map of key-value pairs to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of key-value pairs to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Specifies the domains that AWS WAF should accept in a web request token. This enables the use of tokens across multiple protected websites. When AWS WAF provides a token, it uses the domain of the AWS resource that the web ACL is protecting. If you don&#39;t specify a list of token domains, AWS WAF accepts tokens only for the domain of the protected resource. With a token domain list, AWS WAF accepts the resource&#39;s host domain plus all domains in the token domain list, including their prefixed subdomains.
     * 
     */
    @Export(name="tokenDomains", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tokenDomains;

    /**
     * @return Specifies the domains that AWS WAF should accept in a web request token. This enables the use of tokens across multiple protected websites. When AWS WAF provides a token, it uses the domain of the AWS resource that the web ACL is protecting. If you don&#39;t specify a list of token domains, AWS WAF accepts tokens only for the domain of the protected resource. With a token domain list, AWS WAF accepts the resource&#39;s host domain plus all domains in the token domain list, including their prefixed subdomains.
     * 
     */
    public Output<Optional<List<String>>> tokenDomains() {
        return Codegen.optional(this.tokenDomains);
    }
    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See `visibility_config` below for details.
     * 
     */
    @Export(name="visibilityConfig", refs={WebAclVisibilityConfig.class}, tree="[0]")
    private Output<WebAclVisibilityConfig> visibilityConfig;

    /**
     * @return Defines and enables Amazon CloudWatch metrics and web request sample collection. See `visibility_config` below for details.
     * 
     */
    public Output<WebAclVisibilityConfig> visibilityConfig() {
        return this.visibilityConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAcl(String name) {
        this(name, WebAclArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAcl(String name, WebAclArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAcl(String name, WebAclArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafv2/webAcl:WebAcl", name, args == null ? WebAclArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAcl(String name, Output<String> id, @Nullable WebAclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafv2/webAcl:WebAcl", name, state, makeResourceOptions(options, id));
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
    public static WebAcl get(String name, Output<String> id, @Nullable WebAclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAcl(name, id, state, options);
    }
}
