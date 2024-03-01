// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.opensearch.DomainArgs;
import com.pulumi.aws.opensearch.inputs.DomainState;
import com.pulumi.aws.opensearch.outputs.DomainAdvancedSecurityOptions;
import com.pulumi.aws.opensearch.outputs.DomainAutoTuneOptions;
import com.pulumi.aws.opensearch.outputs.DomainClusterConfig;
import com.pulumi.aws.opensearch.outputs.DomainCognitoOptions;
import com.pulumi.aws.opensearch.outputs.DomainDomainEndpointOptions;
import com.pulumi.aws.opensearch.outputs.DomainEbsOptions;
import com.pulumi.aws.opensearch.outputs.DomainEncryptAtRest;
import com.pulumi.aws.opensearch.outputs.DomainLogPublishingOption;
import com.pulumi.aws.opensearch.outputs.DomainNodeToNodeEncryption;
import com.pulumi.aws.opensearch.outputs.DomainOffPeakWindowOptions;
import com.pulumi.aws.opensearch.outputs.DomainSnapshotOptions;
import com.pulumi.aws.opensearch.outputs.DomainSoftwareUpdateOptions;
import com.pulumi.aws.opensearch.outputs.DomainVpcOptions;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Amazon OpenSearch Domain.
 * 
 * ## Elasticsearch vs. OpenSearch
 * 
 * Amazon OpenSearch Service is the successor to Amazon Elasticsearch Service and supports OpenSearch and legacy Elasticsearch OSS (up to 7.10, the final open source version of the software).
 * 
 * OpenSearch Domain configurations are similar in many ways to Elasticsearch Domain configurations. However, there are important differences including these:
 * 
 * * OpenSearch has `engine_version` while Elasticsearch has `elasticsearch_version`
 * * Versions are specified differently - _e.g._, `Elasticsearch_7.10` with OpenSearch vs. `7.10` for Elasticsearch.
 * * `instance_type` argument values end in `search` for OpenSearch vs. `elasticsearch` for Elasticsearch (_e.g._, `t2.micro.search` vs. `t2.micro.elasticsearch`).
 * * The AWS-managed service-linked role for OpenSearch is called `AWSServiceRoleForAmazonOpenSearchService` instead of `AWSServiceRoleForAmazonElasticsearchService` for Elasticsearch.
 * 
 * There are also some potentially unexpected similarities in configurations:
 * 
 * * ARNs for both are prefaced with `arn:aws:es:`.
 * * Both OpenSearch and Elasticsearch use assume role policies that refer to the `Principal` `Service` as `es.amazonaws.com`.
 * * IAM policy actions, such as those you will find in `access_policies`, are prefaced with `es:` for both.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.opensearch.Domain;
 * import com.pulumi.aws.opensearch.DomainArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainClusterConfigArgs;
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
 *         var example = new Domain(&#34;example&#34;, DomainArgs.builder()        
 *             .domainName(&#34;example&#34;)
 *             .engineVersion(&#34;Elasticsearch_7.10&#34;)
 *             .clusterConfig(DomainClusterConfigArgs.builder()
 *                 .instanceType(&#34;r4.large.search&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;Domain&#34;, &#34;TestDomain&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Access Policy
 * 
 * &gt; See also: `aws.opensearch.DomainPolicy` resource
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetRegionArgs;
 * import com.pulumi.aws.inputs.GetCallerIdentityArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.opensearch.Domain;
 * import com.pulumi.aws.opensearch.DomainArgs;
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
 *         final var config = ctx.config();
 *         final var domain = config.get(&#34;domain&#34;).orElse(&#34;tf-test&#34;);
 *         final var current = AwsFunctions.getRegion();
 * 
 *         final var currentGetCallerIdentity = AwsFunctions.getCallerIdentity();
 * 
 *         final var example = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;*&#34;)
 *                     .identifiers(&#34;*&#34;)
 *                     .build())
 *                 .actions(&#34;es:*&#34;)
 *                 .resources(String.format(&#34;arn:aws:es:%s:%s:domain/%s/*&#34;, current.applyValue(getRegionResult -&gt; getRegionResult.name()),currentGetCallerIdentity.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId()),domain))
 *                 .conditions(GetPolicyDocumentStatementConditionArgs.builder()
 *                     .test(&#34;IpAddress&#34;)
 *                     .variable(&#34;aws:SourceIp&#34;)
 *                     .values(&#34;66.193.100.22/32&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleDomain = new Domain(&#34;exampleDomain&#34;, DomainArgs.builder()        
 *             .domainName(domain)
 *             .accessPolicies(example.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Log publishing to CloudWatch Logs
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudwatch.LogGroup;
 * import com.pulumi.aws.cloudwatch.LogGroupArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.cloudwatch.LogResourcePolicy;
 * import com.pulumi.aws.cloudwatch.LogResourcePolicyArgs;
 * import com.pulumi.aws.opensearch.Domain;
 * import com.pulumi.aws.opensearch.DomainArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainLogPublishingOptionArgs;
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
 *         var exampleLogGroup = new LogGroup(&#34;exampleLogGroup&#34;, LogGroupArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .build());
 * 
 *         final var example = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;es.amazonaws.com&#34;)
 *                     .build())
 *                 .actions(                
 *                     &#34;logs:PutLogEvents&#34;,
 *                     &#34;logs:PutLogEventsBatch&#34;,
 *                     &#34;logs:CreateLogStream&#34;)
 *                 .resources(&#34;arn:aws:logs:*&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleLogResourcePolicy = new LogResourcePolicy(&#34;exampleLogResourcePolicy&#34;, LogResourcePolicyArgs.builder()        
 *             .policyName(&#34;example&#34;)
 *             .policyDocument(example.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var exampleDomain = new Domain(&#34;exampleDomain&#34;, DomainArgs.builder()        
 *             .logPublishingOptions(DomainLogPublishingOptionArgs.builder()
 *                 .cloudwatchLogGroupArn(exampleLogGroup.arn())
 *                 .logType(&#34;INDEX_SLOW_LOGS&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### VPC based OpenSearch
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.Ec2Functions;
 * import com.pulumi.aws.ec2.inputs.GetVpcArgs;
 * import com.pulumi.aws.ec2.inputs.GetSubnetsArgs;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetRegionArgs;
 * import com.pulumi.aws.inputs.GetCallerIdentityArgs;
 * import com.pulumi.aws.ec2.SecurityGroup;
 * import com.pulumi.aws.ec2.SecurityGroupArgs;
 * import com.pulumi.aws.ec2.inputs.SecurityGroupIngressArgs;
 * import com.pulumi.aws.iam.ServiceLinkedRole;
 * import com.pulumi.aws.iam.ServiceLinkedRoleArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.opensearch.Domain;
 * import com.pulumi.aws.opensearch.DomainArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainClusterConfigArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainVpcOptionsArgs;
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
 *         final var config = ctx.config();
 *         final var vpc = config.get(&#34;vpc&#34;);
 *         final var domain = config.get(&#34;domain&#34;).orElse(&#34;tf-test&#34;);
 *         final var example = Ec2Functions.getVpc(GetVpcArgs.builder()
 *             .tags(Map.of(&#34;Name&#34;, vpc))
 *             .build());
 * 
 *         final var exampleGetSubnets = Ec2Functions.getSubnets(GetSubnetsArgs.builder()
 *             .filters(GetSubnetsFilterArgs.builder()
 *                 .name(&#34;vpc-id&#34;)
 *                 .values(example.applyValue(getVpcResult -&gt; getVpcResult.id()))
 *                 .build())
 *             .tags(Map.of(&#34;Tier&#34;, &#34;private&#34;))
 *             .build());
 * 
 *         final var current = AwsFunctions.getRegion();
 * 
 *         final var currentGetCallerIdentity = AwsFunctions.getCallerIdentity();
 * 
 *         var exampleSecurityGroup = new SecurityGroup(&#34;exampleSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .name(String.format(&#34;%s-opensearch-%s&#34;, vpc,domain))
 *             .description(&#34;Managed by Pulumi&#34;)
 *             .vpcId(example.applyValue(getVpcResult -&gt; getVpcResult.id()))
 *             .ingress(SecurityGroupIngressArgs.builder()
 *                 .fromPort(443)
 *                 .toPort(443)
 *                 .protocol(&#34;tcp&#34;)
 *                 .cidrBlocks(example.applyValue(getVpcResult -&gt; getVpcResult.cidrBlock()))
 *                 .build())
 *             .build());
 * 
 *         var exampleServiceLinkedRole = new ServiceLinkedRole(&#34;exampleServiceLinkedRole&#34;, ServiceLinkedRoleArgs.builder()        
 *             .awsServiceName(&#34;opensearchservice.amazonaws.com&#34;)
 *             .build());
 * 
 *         final var exampleGetPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;*&#34;)
 *                     .identifiers(&#34;*&#34;)
 *                     .build())
 *                 .actions(&#34;es:*&#34;)
 *                 .resources(String.format(&#34;arn:aws:es:%s:%s:domain/%s/*&#34;, current.applyValue(getRegionResult -&gt; getRegionResult.name()),currentGetCallerIdentity.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId()),domain))
 *                 .build())
 *             .build());
 * 
 *         var exampleDomain = new Domain(&#34;exampleDomain&#34;, DomainArgs.builder()        
 *             .domainName(domain)
 *             .engineVersion(&#34;OpenSearch_1.0&#34;)
 *             .clusterConfig(DomainClusterConfigArgs.builder()
 *                 .instanceType(&#34;m4.large.search&#34;)
 *                 .zoneAwarenessEnabled(true)
 *                 .build())
 *             .vpcOptions(DomainVpcOptionsArgs.builder()
 *                 .subnetIds(                
 *                     exampleGetSubnets.applyValue(getSubnetsResult -&gt; getSubnetsResult.ids()[0]),
 *                     exampleGetSubnets.applyValue(getSubnetsResult -&gt; getSubnetsResult.ids()[1]))
 *                 .securityGroupIds(exampleSecurityGroup.id())
 *                 .build())
 *             .advancedOptions(Map.of(&#34;rest.action.multi.allow_explicit_index&#34;, &#34;true&#34;))
 *             .accessPolicies(exampleGetPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .tags(Map.of(&#34;Domain&#34;, &#34;TestDomain&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Enabling fine-grained access control on an existing domain
 * 
 * This example shows two configurations: one to create a domain without fine-grained access control and the second to modify the domain to enable fine-grained access control. For more information, see [Enabling fine-grained access control](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html).
 * ### First apply
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.opensearch.Domain;
 * import com.pulumi.aws.opensearch.DomainArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainClusterConfigArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainAdvancedSecurityOptionsArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainAdvancedSecurityOptionsMasterUserOptionsArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainEncryptAtRestArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainDomainEndpointOptionsArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainNodeToNodeEncryptionArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainEbsOptionsArgs;
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
 *         var example = new Domain(&#34;example&#34;, DomainArgs.builder()        
 *             .domainName(&#34;ggkitty&#34;)
 *             .engineVersion(&#34;Elasticsearch_7.1&#34;)
 *             .clusterConfig(DomainClusterConfigArgs.builder()
 *                 .instanceType(&#34;r5.large.search&#34;)
 *                 .build())
 *             .advancedSecurityOptions(DomainAdvancedSecurityOptionsArgs.builder()
 *                 .enabled(false)
 *                 .anonymousAuthEnabled(true)
 *                 .internalUserDatabaseEnabled(true)
 *                 .masterUserOptions(DomainAdvancedSecurityOptionsMasterUserOptionsArgs.builder()
 *                     .masterUserName(&#34;example&#34;)
 *                     .masterUserPassword(&#34;Barbarbarbar1!&#34;)
 *                     .build())
 *                 .build())
 *             .encryptAtRest(DomainEncryptAtRestArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .domainEndpointOptions(DomainDomainEndpointOptionsArgs.builder()
 *                 .enforceHttps(true)
 *                 .tlsSecurityPolicy(&#34;Policy-Min-TLS-1-2-2019-07&#34;)
 *                 .build())
 *             .nodeToNodeEncryption(DomainNodeToNodeEncryptionArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .ebsOptions(DomainEbsOptionsArgs.builder()
 *                 .ebsEnabled(true)
 *                 .volumeSize(10)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Second apply
 * 
 * Notice that the only change is `advanced_security_options.0.enabled` is now set to `true`.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.opensearch.Domain;
 * import com.pulumi.aws.opensearch.DomainArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainClusterConfigArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainAdvancedSecurityOptionsArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainAdvancedSecurityOptionsMasterUserOptionsArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainEncryptAtRestArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainDomainEndpointOptionsArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainNodeToNodeEncryptionArgs;
 * import com.pulumi.aws.opensearch.inputs.DomainEbsOptionsArgs;
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
 *         var example = new Domain(&#34;example&#34;, DomainArgs.builder()        
 *             .domainName(&#34;ggkitty&#34;)
 *             .engineVersion(&#34;Elasticsearch_7.1&#34;)
 *             .clusterConfig(DomainClusterConfigArgs.builder()
 *                 .instanceType(&#34;r5.large.search&#34;)
 *                 .build())
 *             .advancedSecurityOptions(DomainAdvancedSecurityOptionsArgs.builder()
 *                 .enabled(true)
 *                 .anonymousAuthEnabled(true)
 *                 .internalUserDatabaseEnabled(true)
 *                 .masterUserOptions(DomainAdvancedSecurityOptionsMasterUserOptionsArgs.builder()
 *                     .masterUserName(&#34;example&#34;)
 *                     .masterUserPassword(&#34;Barbarbarbar1!&#34;)
 *                     .build())
 *                 .build())
 *             .encryptAtRest(DomainEncryptAtRestArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .domainEndpointOptions(DomainDomainEndpointOptionsArgs.builder()
 *                 .enforceHttps(true)
 *                 .tlsSecurityPolicy(&#34;Policy-Min-TLS-1-2-2019-07&#34;)
 *                 .build())
 *             .nodeToNodeEncryption(DomainNodeToNodeEncryptionArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .ebsOptions(DomainEbsOptionsArgs.builder()
 *                 .ebsEnabled(true)
 *                 .volumeSize(10)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import OpenSearch domains using the `domain_name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:opensearch/domain:Domain example domain_name
 * ```
 * 
 */
@ResourceType(type="aws:opensearch/domain:Domain")
public class Domain extends com.pulumi.resources.CustomResource {
    /**
     * IAM policy document specifying the access policies for the domain.
     * 
     */
    @Export(name="accessPolicies", refs={String.class}, tree="[0]")
    private Output<String> accessPolicies;

    /**
     * @return IAM policy document specifying the access policies for the domain.
     * 
     */
    public Output<String> accessPolicies() {
        return this.accessPolicies;
    }
    /**
     * Key-value string pairs to specify advanced configuration options. Note that the values for these configuration options must be strings (wrapped in quotes) or they may be wrong and cause a perpetual diff, causing the provider to want to recreate your OpenSearch domain on every apply.
     * 
     */
    @Export(name="advancedOptions", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> advancedOptions;

    /**
     * @return Key-value string pairs to specify advanced configuration options. Note that the values for these configuration options must be strings (wrapped in quotes) or they may be wrong and cause a perpetual diff, causing the provider to want to recreate your OpenSearch domain on every apply.
     * 
     */
    public Output<Map<String,String>> advancedOptions() {
        return this.advancedOptions;
    }
    /**
     * Configuration block for [fine-grained access control](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html). Detailed below.
     * 
     */
    @Export(name="advancedSecurityOptions", refs={DomainAdvancedSecurityOptions.class}, tree="[0]")
    private Output<DomainAdvancedSecurityOptions> advancedSecurityOptions;

    /**
     * @return Configuration block for [fine-grained access control](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html). Detailed below.
     * 
     */
    public Output<DomainAdvancedSecurityOptions> advancedSecurityOptions() {
        return this.advancedSecurityOptions;
    }
    /**
     * ARN of the domain.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the domain.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Configuration block for the Auto-Tune options of the domain. Detailed below.
     * 
     */
    @Export(name="autoTuneOptions", refs={DomainAutoTuneOptions.class}, tree="[0]")
    private Output<DomainAutoTuneOptions> autoTuneOptions;

    /**
     * @return Configuration block for the Auto-Tune options of the domain. Detailed below.
     * 
     */
    public Output<DomainAutoTuneOptions> autoTuneOptions() {
        return this.autoTuneOptions;
    }
    /**
     * Configuration block for the cluster of the domain. Detailed below.
     * 
     */
    @Export(name="clusterConfig", refs={DomainClusterConfig.class}, tree="[0]")
    private Output<DomainClusterConfig> clusterConfig;

    /**
     * @return Configuration block for the cluster of the domain. Detailed below.
     * 
     */
    public Output<DomainClusterConfig> clusterConfig() {
        return this.clusterConfig;
    }
    /**
     * Configuration block for authenticating dashboard with Cognito. Detailed below.
     * 
     */
    @Export(name="cognitoOptions", refs={DomainCognitoOptions.class}, tree="[0]")
    private Output</* @Nullable */ DomainCognitoOptions> cognitoOptions;

    /**
     * @return Configuration block for authenticating dashboard with Cognito. Detailed below.
     * 
     */
    public Output<Optional<DomainCognitoOptions>> cognitoOptions() {
        return Codegen.optional(this.cognitoOptions);
    }
    /**
     * Domain-specific endpoint for Dashboard without https scheme.
     * 
     */
    @Export(name="dashboardEndpoint", refs={String.class}, tree="[0]")
    private Output<String> dashboardEndpoint;

    /**
     * @return Domain-specific endpoint for Dashboard without https scheme.
     * 
     */
    public Output<String> dashboardEndpoint() {
        return this.dashboardEndpoint;
    }
    /**
     * Configuration block for domain endpoint HTTP(S) related options. Detailed below.
     * 
     */
    @Export(name="domainEndpointOptions", refs={DomainDomainEndpointOptions.class}, tree="[0]")
    private Output<DomainDomainEndpointOptions> domainEndpointOptions;

    /**
     * @return Configuration block for domain endpoint HTTP(S) related options. Detailed below.
     * 
     */
    public Output<DomainDomainEndpointOptions> domainEndpointOptions() {
        return this.domainEndpointOptions;
    }
    /**
     * Unique identifier for the domain.
     * 
     */
    @Export(name="domainId", refs={String.class}, tree="[0]")
    private Output<String> domainId;

    /**
     * @return Unique identifier for the domain.
     * 
     */
    public Output<String> domainId() {
        return this.domainId;
    }
    /**
     * Name of the domain.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output<String> domainName;

    /**
     * @return Name of the domain.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/opensearch-service/pricing/). Detailed below.
     * 
     */
    @Export(name="ebsOptions", refs={DomainEbsOptions.class}, tree="[0]")
    private Output<DomainEbsOptions> ebsOptions;

    /**
     * @return Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/opensearch-service/pricing/). Detailed below.
     * 
     */
    public Output<DomainEbsOptions> ebsOptions() {
        return this.ebsOptions;
    }
    /**
     * Configuration block for encrypt at rest options. Only available for [certain instance types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html). Detailed below.
     * 
     */
    @Export(name="encryptAtRest", refs={DomainEncryptAtRest.class}, tree="[0]")
    private Output<DomainEncryptAtRest> encryptAtRest;

    /**
     * @return Configuration block for encrypt at rest options. Only available for [certain instance types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html). Detailed below.
     * 
     */
    public Output<DomainEncryptAtRest> encryptAtRest() {
        return this.encryptAtRest;
    }
    /**
     * Domain-specific endpoint used to submit index, search, and data upload requests.
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output<String> endpoint;

    /**
     * @return Domain-specific endpoint used to submit index, search, and data upload requests.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * Either `Elasticsearch_X.Y` or `OpenSearch_X.Y` to specify the engine version for the Amazon OpenSearch Service domain. For example, `OpenSearch_1.0` or `Elasticsearch_7.9`.
     * See [Creating and managing Amazon OpenSearch Service domains](http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains).
     * Defaults to the lastest version of OpenSearch.
     * 
     */
    @Export(name="engineVersion", refs={String.class}, tree="[0]")
    private Output<String> engineVersion;

    /**
     * @return Either `Elasticsearch_X.Y` or `OpenSearch_X.Y` to specify the engine version for the Amazon OpenSearch Service domain. For example, `OpenSearch_1.0` or `Elasticsearch_7.9`.
     * See [Creating and managing Amazon OpenSearch Service domains](http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains).
     * Defaults to the lastest version of OpenSearch.
     * 
     */
    public Output<String> engineVersion() {
        return this.engineVersion;
    }
    /**
     * (**Deprecated**) Domain-specific endpoint for kibana without https scheme. Use the `dashboard_endpoint` attribute instead.
     * 
     * @deprecated
     * use &#39;dashboard_endpoint&#39; attribute instead
     * 
     */
    @Deprecated /* use 'dashboard_endpoint' attribute instead */
    @Export(name="kibanaEndpoint", refs={String.class}, tree="[0]")
    private Output<String> kibanaEndpoint;

    /**
     * @return (**Deprecated**) Domain-specific endpoint for kibana without https scheme. Use the `dashboard_endpoint` attribute instead.
     * 
     */
    public Output<String> kibanaEndpoint() {
        return this.kibanaEndpoint;
    }
    /**
     * Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
     * 
     */
    @Export(name="logPublishingOptions", refs={List.class,DomainLogPublishingOption.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DomainLogPublishingOption>> logPublishingOptions;

    /**
     * @return Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
     * 
     */
    public Output<Optional<List<DomainLogPublishingOption>>> logPublishingOptions() {
        return Codegen.optional(this.logPublishingOptions);
    }
    /**
     * Configuration block for node-to-node encryption options. Detailed below.
     * 
     */
    @Export(name="nodeToNodeEncryption", refs={DomainNodeToNodeEncryption.class}, tree="[0]")
    private Output<DomainNodeToNodeEncryption> nodeToNodeEncryption;

    /**
     * @return Configuration block for node-to-node encryption options. Detailed below.
     * 
     */
    public Output<DomainNodeToNodeEncryption> nodeToNodeEncryption() {
        return this.nodeToNodeEncryption;
    }
    /**
     * Configuration to add Off Peak update options. ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/off-peak.html)). Detailed below.
     * 
     */
    @Export(name="offPeakWindowOptions", refs={DomainOffPeakWindowOptions.class}, tree="[0]")
    private Output<DomainOffPeakWindowOptions> offPeakWindowOptions;

    /**
     * @return Configuration to add Off Peak update options. ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/off-peak.html)). Detailed below.
     * 
     */
    public Output<DomainOffPeakWindowOptions> offPeakWindowOptions() {
        return this.offPeakWindowOptions;
    }
    /**
     * Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running OpenSearch 5.3 and later, Amazon OpenSearch takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions, OpenSearch takes daily automated snapshots.
     * 
     */
    @Export(name="snapshotOptions", refs={DomainSnapshotOptions.class}, tree="[0]")
    private Output</* @Nullable */ DomainSnapshotOptions> snapshotOptions;

    /**
     * @return Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running OpenSearch 5.3 and later, Amazon OpenSearch takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions, OpenSearch takes daily automated snapshots.
     * 
     */
    public Output<Optional<DomainSnapshotOptions>> snapshotOptions() {
        return Codegen.optional(this.snapshotOptions);
    }
    /**
     * Software update options for the domain. Detailed below.
     * 
     */
    @Export(name="softwareUpdateOptions", refs={DomainSoftwareUpdateOptions.class}, tree="[0]")
    private Output<DomainSoftwareUpdateOptions> softwareUpdateOptions;

    /**
     * @return Software update options for the domain. Detailed below.
     * 
     */
    public Output<DomainSoftwareUpdateOptions> softwareUpdateOptions() {
        return this.softwareUpdateOptions;
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * * `vpc_options.0.availability_zones` - If the domain was created inside a VPC, the names of the availability zones the configured `subnet_ids` were created inside.
     * * `vpc_options.0.vpc_id` - If the domain was created inside a VPC, the ID of the VPC.
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
     * * `vpc_options.0.availability_zones` - If the domain was created inside a VPC, the names of the availability zones the configured `subnet_ids` were created inside.
     * * `vpc_options.0.vpc_id` - If the domain was created inside a VPC, the ID of the VPC.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)). Detailed below.
     * 
     */
    @Export(name="vpcOptions", refs={DomainVpcOptions.class}, tree="[0]")
    private Output</* @Nullable */ DomainVpcOptions> vpcOptions;

    /**
     * @return Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)). Detailed below.
     * 
     */
    public Output<Optional<DomainVpcOptions>> vpcOptions() {
        return Codegen.optional(this.vpcOptions);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, @Nullable DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, @Nullable DomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearch/domain:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opensearch/domain:Domain", name, state, makeResourceOptions(options, id));
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
    public static Domain get(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, state, options);
    }
}
