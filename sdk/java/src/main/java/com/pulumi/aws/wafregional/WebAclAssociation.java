// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.wafregional.WebAclAssociationArgs;
import com.pulumi.aws.wafregional.inputs.WebAclAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an association with WAF Regional Web ACL.
 * 
 * &gt; **Note:** An Application Load Balancer can only be associated with one WAF Regional WebACL.
 * 
 * ## Example Usage
 * 
 * ### Application Load Balancer Association
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.wafregional.IpSet;
 * import com.pulumi.aws.wafregional.IpSetArgs;
 * import com.pulumi.aws.wafregional.inputs.IpSetIpSetDescriptorArgs;
 * import com.pulumi.aws.wafregional.Rule;
 * import com.pulumi.aws.wafregional.RuleArgs;
 * import com.pulumi.aws.wafregional.inputs.RulePredicateArgs;
 * import com.pulumi.aws.wafregional.WebAcl;
 * import com.pulumi.aws.wafregional.WebAclArgs;
 * import com.pulumi.aws.wafregional.inputs.WebAclDefaultActionArgs;
 * import com.pulumi.aws.wafregional.inputs.WebAclRuleArgs;
 * import com.pulumi.aws.wafregional.inputs.WebAclRuleActionArgs;
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetAvailabilityZonesArgs;
 * import com.pulumi.aws.ec2.Subnet;
 * import com.pulumi.aws.ec2.SubnetArgs;
 * import com.pulumi.aws.alb.LoadBalancer;
 * import com.pulumi.aws.alb.LoadBalancerArgs;
 * import com.pulumi.aws.wafregional.WebAclAssociation;
 * import com.pulumi.aws.wafregional.WebAclAssociationArgs;
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
 *         var ipset = new IpSet(&#34;ipset&#34;, IpSetArgs.builder()        
 *             .name(&#34;tfIPSet&#34;)
 *             .ipSetDescriptors(IpSetIpSetDescriptorArgs.builder()
 *                 .type(&#34;IPV4&#34;)
 *                 .value(&#34;192.0.7.0/24&#34;)
 *                 .build())
 *             .build());
 * 
 *         var foo = new Rule(&#34;foo&#34;, RuleArgs.builder()        
 *             .name(&#34;tfWAFRule&#34;)
 *             .metricName(&#34;tfWAFRule&#34;)
 *             .predicates(RulePredicateArgs.builder()
 *                 .dataId(ipset.id())
 *                 .negated(false)
 *                 .type(&#34;IPMatch&#34;)
 *                 .build())
 *             .build());
 * 
 *         var fooWebAcl = new WebAcl(&#34;fooWebAcl&#34;, WebAclArgs.builder()        
 *             .name(&#34;foo&#34;)
 *             .metricName(&#34;foo&#34;)
 *             .defaultAction(WebAclDefaultActionArgs.builder()
 *                 .type(&#34;ALLOW&#34;)
 *                 .build())
 *             .rules(WebAclRuleArgs.builder()
 *                 .action(WebAclRuleActionArgs.builder()
 *                     .type(&#34;BLOCK&#34;)
 *                     .build())
 *                 .priority(1)
 *                 .ruleId(foo.id())
 *                 .build())
 *             .build());
 * 
 *         var fooVpc = new Vpc(&#34;fooVpc&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.1.0.0/16&#34;)
 *             .build());
 * 
 *         final var available = AwsFunctions.getAvailabilityZones();
 * 
 *         var fooSubnet = new Subnet(&#34;fooSubnet&#34;, SubnetArgs.builder()        
 *             .vpcId(fooVpc.id())
 *             .cidrBlock(&#34;10.1.1.0/24&#34;)
 *             .availabilityZone(available.applyValue(getAvailabilityZonesResult -&gt; getAvailabilityZonesResult.names()[0]))
 *             .build());
 * 
 *         var bar = new Subnet(&#34;bar&#34;, SubnetArgs.builder()        
 *             .vpcId(fooVpc.id())
 *             .cidrBlock(&#34;10.1.2.0/24&#34;)
 *             .availabilityZone(available.applyValue(getAvailabilityZonesResult -&gt; getAvailabilityZonesResult.names()[1]))
 *             .build());
 * 
 *         var fooLoadBalancer = new LoadBalancer(&#34;fooLoadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .internal(true)
 *             .subnets(            
 *                 fooSubnet.id(),
 *                 bar.id())
 *             .build());
 * 
 *         var fooWebAclAssociation = new WebAclAssociation(&#34;fooWebAclAssociation&#34;, WebAclAssociationArgs.builder()        
 *             .resourceArn(fooLoadBalancer.arn())
 *             .webAclId(fooWebAcl.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### API Gateway Association
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.wafregional.IpSet;
 * import com.pulumi.aws.wafregional.IpSetArgs;
 * import com.pulumi.aws.wafregional.inputs.IpSetIpSetDescriptorArgs;
 * import com.pulumi.aws.wafregional.Rule;
 * import com.pulumi.aws.wafregional.RuleArgs;
 * import com.pulumi.aws.wafregional.inputs.RulePredicateArgs;
 * import com.pulumi.aws.wafregional.WebAcl;
 * import com.pulumi.aws.wafregional.WebAclArgs;
 * import com.pulumi.aws.wafregional.inputs.WebAclDefaultActionArgs;
 * import com.pulumi.aws.wafregional.inputs.WebAclRuleArgs;
 * import com.pulumi.aws.wafregional.inputs.WebAclRuleActionArgs;
 * import com.pulumi.aws.apigateway.RestApi;
 * import com.pulumi.aws.apigateway.RestApiArgs;
 * import com.pulumi.aws.apigateway.Deployment;
 * import com.pulumi.aws.apigateway.DeploymentArgs;
 * import com.pulumi.aws.apigateway.Stage;
 * import com.pulumi.aws.apigateway.StageArgs;
 * import com.pulumi.aws.wafregional.WebAclAssociation;
 * import com.pulumi.aws.wafregional.WebAclAssociationArgs;
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
 *         var ipset = new IpSet(&#34;ipset&#34;, IpSetArgs.builder()        
 *             .name(&#34;tfIPSet&#34;)
 *             .ipSetDescriptors(IpSetIpSetDescriptorArgs.builder()
 *                 .type(&#34;IPV4&#34;)
 *                 .value(&#34;192.0.7.0/24&#34;)
 *                 .build())
 *             .build());
 * 
 *         var foo = new Rule(&#34;foo&#34;, RuleArgs.builder()        
 *             .name(&#34;tfWAFRule&#34;)
 *             .metricName(&#34;tfWAFRule&#34;)
 *             .predicates(RulePredicateArgs.builder()
 *                 .dataId(ipset.id())
 *                 .negated(false)
 *                 .type(&#34;IPMatch&#34;)
 *                 .build())
 *             .build());
 * 
 *         var fooWebAcl = new WebAcl(&#34;fooWebAcl&#34;, WebAclArgs.builder()        
 *             .name(&#34;foo&#34;)
 *             .metricName(&#34;foo&#34;)
 *             .defaultAction(WebAclDefaultActionArgs.builder()
 *                 .type(&#34;ALLOW&#34;)
 *                 .build())
 *             .rules(WebAclRuleArgs.builder()
 *                 .action(WebAclRuleActionArgs.builder()
 *                     .type(&#34;BLOCK&#34;)
 *                     .build())
 *                 .priority(1)
 *                 .ruleId(foo.id())
 *                 .build())
 *             .build());
 * 
 *         var example = new RestApi(&#34;example&#34;, RestApiArgs.builder()        
 *             .body(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;openapi&#34;, &#34;3.0.1&#34;),
 *                     jsonProperty(&#34;info&#34;, jsonObject(
 *                         jsonProperty(&#34;title&#34;, &#34;example&#34;),
 *                         jsonProperty(&#34;version&#34;, &#34;1.0&#34;)
 *                     )),
 *                     jsonProperty(&#34;paths&#34;, jsonObject(
 *                         jsonProperty(&#34;/path1&#34;, jsonObject(
 *                             jsonProperty(&#34;get&#34;, jsonObject(
 *                                 jsonProperty(&#34;x-amazon-apigateway-integration&#34;, jsonObject(
 *                                     jsonProperty(&#34;httpMethod&#34;, &#34;GET&#34;),
 *                                     jsonProperty(&#34;payloadFormatVersion&#34;, &#34;1.0&#34;),
 *                                     jsonProperty(&#34;type&#34;, &#34;HTTP_PROXY&#34;),
 *                                     jsonProperty(&#34;uri&#34;, &#34;https://ip-ranges.amazonaws.com/ip-ranges.json&#34;)
 *                                 ))
 *                             ))
 *                         ))
 *                     ))
 *                 )))
 *             .name(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleDeployment = new Deployment(&#34;exampleDeployment&#34;, DeploymentArgs.builder()        
 *             .restApi(example.id())
 *             .triggers(Map.of(&#34;redeployment&#34;, StdFunctions.sha1().applyValue(invoke -&gt; invoke.result())))
 *             .build());
 * 
 *         var exampleStage = new Stage(&#34;exampleStage&#34;, StageArgs.builder()        
 *             .deployment(exampleDeployment.id())
 *             .restApi(example.id())
 *             .stageName(&#34;example&#34;)
 *             .build());
 * 
 *         var association = new WebAclAssociation(&#34;association&#34;, WebAclAssociationArgs.builder()        
 *             .resourceArn(exampleStage.arn())
 *             .webAclId(fooWebAcl.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import WAF Regional Web ACL Association using their `web_acl_id:resource_arn`. For example:
 * 
 * ```sh
 * $ pulumi import aws:wafregional/webAclAssociation:WebAclAssociation foo web_acl_id:resource_arn
 * ```
 * 
 */
@ResourceType(type="aws:wafregional/webAclAssociation:WebAclAssociation")
public class WebAclAssociation extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
     * 
     */
    @Export(name="resourceArn", refs={String.class}, tree="[0]")
    private Output<String> resourceArn;

    /**
     * @return ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }
    /**
     * The ID of the WAF Regional WebACL to create an association.
     * 
     */
    @Export(name="webAclId", refs={String.class}, tree="[0]")
    private Output<String> webAclId;

    /**
     * @return The ID of the WAF Regional WebACL to create an association.
     * 
     */
    public Output<String> webAclId() {
        return this.webAclId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAclAssociation(String name) {
        this(name, WebAclAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAclAssociation(String name, WebAclAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAclAssociation(String name, WebAclAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/webAclAssociation:WebAclAssociation", name, args == null ? WebAclAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAclAssociation(String name, Output<String> id, @Nullable WebAclAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/webAclAssociation:WebAclAssociation", name, state, makeResourceOptions(options, id));
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
    public static WebAclAssociation get(String name, Output<String> id, @Nullable WebAclAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAclAssociation(name, id, state, options);
    }
}
