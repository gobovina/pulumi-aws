// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.alb.ListenerRuleArgs;
import com.pulumi.aws.alb.inputs.ListenerRuleState;
import com.pulumi.aws.alb.outputs.ListenerRuleAction;
import com.pulumi.aws.alb.outputs.ListenerRuleCondition;
import com.pulumi.core.Alias;
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

/**
 * Provides a Load Balancer Listener Rule resource.
 * 
 * &gt; **Note:** `aws.alb.ListenerRule` is known as `aws.lb.ListenerRule`. The functionality is identical.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.LoadBalancer;
 * import com.pulumi.aws.lb.Listener;
 * import com.pulumi.aws.lb.ListenerRule;
 * import com.pulumi.aws.lb.ListenerRuleArgs;
 * import com.pulumi.aws.lb.inputs.ListenerRuleActionArgs;
 * import com.pulumi.aws.lb.inputs.ListenerRuleConditionArgs;
 * import com.pulumi.aws.lb.inputs.ListenerRuleConditionPathPatternArgs;
 * import com.pulumi.aws.lb.inputs.ListenerRuleConditionHostHeaderArgs;
 * import com.pulumi.aws.lb.inputs.ListenerRuleActionForwardArgs;
 * import com.pulumi.aws.lb.inputs.ListenerRuleActionForwardStickinessArgs;
 * import com.pulumi.aws.lb.inputs.ListenerRuleActionRedirectArgs;
 * import com.pulumi.aws.lb.inputs.ListenerRuleConditionHttpHeaderArgs;
 * import com.pulumi.aws.lb.inputs.ListenerRuleActionFixedResponseArgs;
 * import com.pulumi.aws.cognito.UserPool;
 * import com.pulumi.aws.cognito.UserPoolClient;
 * import com.pulumi.aws.cognito.UserPoolDomain;
 * import com.pulumi.aws.lb.inputs.ListenerRuleActionAuthenticateCognitoArgs;
 * import com.pulumi.aws.lb.inputs.ListenerRuleActionAuthenticateOidcArgs;
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
 *         var frontEnd = new LoadBalancer(&#34;frontEnd&#34;);
 * 
 *         var frontEndListener = new Listener(&#34;frontEndListener&#34;);
 * 
 *         var static_ = new ListenerRule(&#34;static&#34;, ListenerRuleArgs.builder()        
 *             .listenerArn(frontEndListener.arn())
 *             .priority(100)
 *             .actions(ListenerRuleActionArgs.builder()
 *                 .type(&#34;forward&#34;)
 *                 .targetGroupArn(staticAwsLbTargetGroup.arn())
 *                 .build())
 *             .conditions(            
 *                 ListenerRuleConditionArgs.builder()
 *                     .pathPattern(ListenerRuleConditionPathPatternArgs.builder()
 *                         .values(&#34;/static/*&#34;)
 *                         .build())
 *                     .build(),
 *                 ListenerRuleConditionArgs.builder()
 *                     .hostHeader(ListenerRuleConditionHostHeaderArgs.builder()
 *                         .values(&#34;example.com&#34;)
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *         var hostBasedWeightedRouting = new ListenerRule(&#34;hostBasedWeightedRouting&#34;, ListenerRuleArgs.builder()        
 *             .listenerArn(frontEndListener.arn())
 *             .priority(99)
 *             .actions(ListenerRuleActionArgs.builder()
 *                 .type(&#34;forward&#34;)
 *                 .targetGroupArn(staticAwsLbTargetGroup.arn())
 *                 .build())
 *             .conditions(ListenerRuleConditionArgs.builder()
 *                 .hostHeader(ListenerRuleConditionHostHeaderArgs.builder()
 *                     .values(&#34;my-service.*.mycompany.io&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var hostBasedRouting = new ListenerRule(&#34;hostBasedRouting&#34;, ListenerRuleArgs.builder()        
 *             .listenerArn(frontEndListener.arn())
 *             .priority(99)
 *             .actions(ListenerRuleActionArgs.builder()
 *                 .type(&#34;forward&#34;)
 *                 .forward(ListenerRuleActionForwardArgs.builder()
 *                     .targetGroups(                    
 *                         ListenerRuleActionForwardTargetGroupArgs.builder()
 *                             .arn(main.arn())
 *                             .weight(80)
 *                             .build(),
 *                         ListenerRuleActionForwardTargetGroupArgs.builder()
 *                             .arn(canary.arn())
 *                             .weight(20)
 *                             .build())
 *                     .stickiness(ListenerRuleActionForwardStickinessArgs.builder()
 *                         .enabled(true)
 *                         .duration(600)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .conditions(ListenerRuleConditionArgs.builder()
 *                 .hostHeader(ListenerRuleConditionHostHeaderArgs.builder()
 *                     .values(&#34;my-service.*.mycompany.io&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var redirectHttpToHttps = new ListenerRule(&#34;redirectHttpToHttps&#34;, ListenerRuleArgs.builder()        
 *             .listenerArn(frontEndListener.arn())
 *             .actions(ListenerRuleActionArgs.builder()
 *                 .type(&#34;redirect&#34;)
 *                 .redirect(ListenerRuleActionRedirectArgs.builder()
 *                     .port(&#34;443&#34;)
 *                     .protocol(&#34;HTTPS&#34;)
 *                     .statusCode(&#34;HTTP_301&#34;)
 *                     .build())
 *                 .build())
 *             .conditions(ListenerRuleConditionArgs.builder()
 *                 .httpHeader(ListenerRuleConditionHttpHeaderArgs.builder()
 *                     .httpHeaderName(&#34;X-Forwarded-For&#34;)
 *                     .values(&#34;192.168.1.*&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var healthCheck = new ListenerRule(&#34;healthCheck&#34;, ListenerRuleArgs.builder()        
 *             .listenerArn(frontEndListener.arn())
 *             .actions(ListenerRuleActionArgs.builder()
 *                 .type(&#34;fixed-response&#34;)
 *                 .fixedResponse(ListenerRuleActionFixedResponseArgs.builder()
 *                     .contentType(&#34;text/plain&#34;)
 *                     .messageBody(&#34;HEALTHY&#34;)
 *                     .statusCode(&#34;200&#34;)
 *                     .build())
 *                 .build())
 *             .conditions(ListenerRuleConditionArgs.builder()
 *                 .queryStrings(                
 *                     ListenerRuleConditionQueryStringArgs.builder()
 *                         .key(&#34;health&#34;)
 *                         .value(&#34;check&#34;)
 *                         .build(),
 *                     ListenerRuleConditionQueryStringArgs.builder()
 *                         .value(&#34;bar&#34;)
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *         var pool = new UserPool(&#34;pool&#34;);
 * 
 *         var client = new UserPoolClient(&#34;client&#34;);
 * 
 *         var domain = new UserPoolDomain(&#34;domain&#34;);
 * 
 *         var admin = new ListenerRule(&#34;admin&#34;, ListenerRuleArgs.builder()        
 *             .listenerArn(frontEndListener.arn())
 *             .actions(            
 *                 ListenerRuleActionArgs.builder()
 *                     .type(&#34;authenticate-cognito&#34;)
 *                     .authenticateCognito(ListenerRuleActionAuthenticateCognitoArgs.builder()
 *                         .userPoolArn(pool.arn())
 *                         .userPoolClientId(client.id())
 *                         .userPoolDomain(domain.domain())
 *                         .build())
 *                     .build(),
 *                 ListenerRuleActionArgs.builder()
 *                     .type(&#34;forward&#34;)
 *                     .targetGroupArn(staticAwsLbTargetGroup.arn())
 *                     .build())
 *             .build());
 * 
 *         var oidc = new ListenerRule(&#34;oidc&#34;, ListenerRuleArgs.builder()        
 *             .listenerArn(frontEndListener.arn())
 *             .actions(            
 *                 ListenerRuleActionArgs.builder()
 *                     .type(&#34;authenticate-oidc&#34;)
 *                     .authenticateOidc(ListenerRuleActionAuthenticateOidcArgs.builder()
 *                         .authorizationEndpoint(&#34;https://example.com/authorization_endpoint&#34;)
 *                         .clientId(&#34;client_id&#34;)
 *                         .clientSecret(&#34;client_secret&#34;)
 *                         .issuer(&#34;https://example.com&#34;)
 *                         .tokenEndpoint(&#34;https://example.com/token_endpoint&#34;)
 *                         .userInfoEndpoint(&#34;https://example.com/user_info_endpoint&#34;)
 *                         .build())
 *                     .build(),
 *                 ListenerRuleActionArgs.builder()
 *                     .type(&#34;forward&#34;)
 *                     .targetGroupArn(staticAwsLbTargetGroup.arn())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import rules using their ARN. For example:
 * 
 * ```sh
 *  $ pulumi import aws:alb/listenerRule:ListenerRule front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:listener-rule/app/test/8e4497da625e2d8a/9ab28ade35828f96/67b3d2d36dd7c26b
 * ```
 * 
 */
@ResourceType(type="aws:alb/listenerRule:ListenerRule")
public class ListenerRule extends com.pulumi.resources.CustomResource {
    /**
     * An Action block. Action blocks are documented below.
     * 
     */
    @Export(name="actions", refs={List.class,ListenerRuleAction.class}, tree="[0,1]")
    private Output<List<ListenerRuleAction>> actions;

    /**
     * @return An Action block. Action blocks are documented below.
     * 
     */
    public Output<List<ListenerRuleAction>> actions() {
        return this.actions;
    }
    /**
     * The Amazon Resource Name (ARN) of the target group.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the target group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
     * 
     */
    @Export(name="conditions", refs={List.class,ListenerRuleCondition.class}, tree="[0,1]")
    private Output<List<ListenerRuleCondition>> conditions;

    /**
     * @return A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
     * 
     */
    public Output<List<ListenerRuleCondition>> conditions() {
        return this.conditions;
    }
    /**
     * The ARN of the listener to which to attach the rule.
     * 
     */
    @Export(name="listenerArn", refs={String.class}, tree="[0]")
    private Output<String> listenerArn;

    /**
     * @return The ARN of the listener to which to attach the rule.
     * 
     */
    public Output<String> listenerArn() {
        return this.listenerArn;
    }
    /**
     * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can&#39;t have multiple rules with the same priority.
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output<Integer> priority;

    /**
     * @return The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can&#39;t have multiple rules with the same priority.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ListenerRule(String name) {
        this(name, ListenerRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ListenerRule(String name, ListenerRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ListenerRule(String name, ListenerRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:alb/listenerRule:ListenerRule", name, args == null ? ListenerRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ListenerRule(String name, Output<String> id, @Nullable ListenerRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:alb/listenerRule:ListenerRule", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:applicationloadbalancing/listenerRule:ListenerRule").build())
            ))
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
    public static ListenerRule get(String name, Output<String> id, @Nullable ListenerRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ListenerRule(name, id, state, options);
    }
}
