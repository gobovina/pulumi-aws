// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elasticsearch.DomainArgs;
import com.pulumi.aws.elasticsearch.inputs.DomainState;
import com.pulumi.aws.elasticsearch.outputs.DomainAdvancedSecurityOptions;
import com.pulumi.aws.elasticsearch.outputs.DomainAutoTuneOptions;
import com.pulumi.aws.elasticsearch.outputs.DomainClusterConfig;
import com.pulumi.aws.elasticsearch.outputs.DomainCognitoOptions;
import com.pulumi.aws.elasticsearch.outputs.DomainDomainEndpointOptions;
import com.pulumi.aws.elasticsearch.outputs.DomainEbsOptions;
import com.pulumi.aws.elasticsearch.outputs.DomainEncryptAtRest;
import com.pulumi.aws.elasticsearch.outputs.DomainLogPublishingOption;
import com.pulumi.aws.elasticsearch.outputs.DomainNodeToNodeEncryption;
import com.pulumi.aws.elasticsearch.outputs.DomainSnapshotOptions;
import com.pulumi.aws.elasticsearch.outputs.DomainVpcOptions;
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
 * Manages an AWS Elasticsearch Domain.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.elasticsearch.Domain;
 * import com.pulumi.aws.elasticsearch.DomainArgs;
 * import com.pulumi.aws.elasticsearch.inputs.DomainClusterConfigArgs;
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
 *             .clusterConfig(DomainClusterConfigArgs.builder()
 *                 .instanceType(&#34;r4.large.elasticsearch&#34;)
 *                 .build())
 *             .elasticsearchVersion(&#34;7.10&#34;)
 *             .tags(Map.of(&#34;Domain&#34;, &#34;TestDomain&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Access Policy
 * 
 * &gt; See also: `aws.elasticsearch.DomainPolicy` resource
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetRegionArgs;
 * import com.pulumi.aws.inputs.GetCallerIdentityArgs;
 * import com.pulumi.aws.elasticsearch.Domain;
 * import com.pulumi.aws.elasticsearch.DomainArgs;
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
 *         final var currentRegion = AwsFunctions.getRegion();
 * 
 *         final var currentCallerIdentity = AwsFunctions.getCallerIdentity();
 * 
 *         var example = new Domain(&#34;example&#34;, DomainArgs.builder()        
 *             .accessPolicies(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Action&#34;: &#34;es:*&#34;,
 *       &#34;Principal&#34;: &#34;*&#34;,
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Resource&#34;: &#34;arn:aws:es:%s:%s:domain/%s/*&#34;,
 *       &#34;Condition&#34;: {
 *         &#34;IpAddress&#34;: {&#34;aws:SourceIp&#34;: [&#34;66.193.100.22/32&#34;]}
 *       }
 *     }
 *   ]
 * }
 * &#34;, currentRegion.applyValue(getRegionResult -&gt; getRegionResult.name()),currentCallerIdentity.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId()),domain))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Log Publishing to CloudWatch Logs
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudwatch.LogGroup;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.cloudwatch.LogResourcePolicy;
 * import com.pulumi.aws.cloudwatch.LogResourcePolicyArgs;
 * import com.pulumi.aws.elasticsearch.Domain;
 * import com.pulumi.aws.elasticsearch.DomainArgs;
 * import com.pulumi.aws.elasticsearch.inputs.DomainLogPublishingOptionArgs;
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
 *         var exampleLogGroup = new LogGroup(&#34;exampleLogGroup&#34;);
 * 
 *         final var examplePolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
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
 *             .policyDocument(examplePolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
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
 * ### VPC based ES
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
 * import com.pulumi.aws.elasticsearch.Domain;
 * import com.pulumi.aws.elasticsearch.DomainArgs;
 * import com.pulumi.aws.elasticsearch.inputs.DomainClusterConfigArgs;
 * import com.pulumi.aws.elasticsearch.inputs.DomainVpcOptionsArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         final var selectedVpc = Ec2Functions.getVpc(GetVpcArgs.builder()
 *             .tags(Map.of(&#34;Name&#34;, vpc))
 *             .build());
 * 
 *         final var selectedSubnets = Ec2Functions.getSubnets(GetSubnetsArgs.builder()
 *             .filters(GetSubnetsFilterArgs.builder()
 *                 .name(&#34;vpc-id&#34;)
 *                 .values(selectedVpc.applyValue(getVpcResult -&gt; getVpcResult.id()))
 *                 .build())
 *             .tags(Map.of(&#34;Tier&#34;, &#34;private&#34;))
 *             .build());
 * 
 *         final var currentRegion = AwsFunctions.getRegion();
 * 
 *         final var currentCallerIdentity = AwsFunctions.getCallerIdentity();
 * 
 *         var esSecurityGroup = new SecurityGroup(&#34;esSecurityGroup&#34;, SecurityGroupArgs.builder()        
 *             .description(&#34;Managed by Pulumi&#34;)
 *             .vpcId(selectedVpc.applyValue(getVpcResult -&gt; getVpcResult.id()))
 *             .ingress(SecurityGroupIngressArgs.builder()
 *                 .fromPort(443)
 *                 .toPort(443)
 *                 .protocol(&#34;tcp&#34;)
 *                 .cidrBlocks(selectedVpc.applyValue(getVpcResult -&gt; getVpcResult.cidrBlock()))
 *                 .build())
 *             .build());
 * 
 *         var esServiceLinkedRole = new ServiceLinkedRole(&#34;esServiceLinkedRole&#34;, ServiceLinkedRoleArgs.builder()        
 *             .awsServiceName(&#34;opensearchservice.amazonaws.com&#34;)
 *             .build());
 * 
 *         var esDomain = new Domain(&#34;esDomain&#34;, DomainArgs.builder()        
 *             .elasticsearchVersion(&#34;6.3&#34;)
 *             .clusterConfig(DomainClusterConfigArgs.builder()
 *                 .instanceType(&#34;m4.large.elasticsearch&#34;)
 *                 .zoneAwarenessEnabled(true)
 *                 .build())
 *             .vpcOptions(DomainVpcOptionsArgs.builder()
 *                 .subnetIds(                
 *                     selectedSubnets.applyValue(getSubnetsResult -&gt; getSubnetsResult.ids()[0]),
 *                     selectedSubnets.applyValue(getSubnetsResult -&gt; getSubnetsResult.ids()[1]))
 *                 .securityGroupIds(esSecurityGroup.id())
 *                 .build())
 *             .advancedOptions(Map.of(&#34;rest.action.multi.allow_explicit_index&#34;, &#34;true&#34;))
 *             .accessPolicies(&#34;&#34;&#34;
 * {
 * 	&#34;Version&#34;: &#34;2012-10-17&#34;,
 * 	&#34;Statement&#34;: [
 * 		{
 * 			&#34;Action&#34;: &#34;es:*&#34;,
 * 			&#34;Principal&#34;: &#34;*&#34;,
 * 			&#34;Effect&#34;: &#34;Allow&#34;,
 * 			&#34;Resource&#34;: &#34;arn:aws:es:%s:%s:domain/%s/*&#34;
 * 		}
 * 	]
 * }
 * &#34;, currentRegion.applyValue(getRegionResult -&gt; getRegionResult.name()),currentCallerIdentity.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId()),domain))
 *             .tags(Map.of(&#34;Domain&#34;, &#34;TestDomain&#34;))
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(esServiceLinkedRole)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Elasticsearch domains using the `domain_name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:elasticsearch/domain:Domain example domain_name
 * ```
 * 
 */
@ResourceType(type="aws:elasticsearch/domain:Domain")
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
     * Key-value string pairs to specify advanced configuration options. Note that the values for these configuration options must be strings (wrapped in quotes) or they may be wrong and cause a perpetual diff, causing the provider to want to recreate your Elasticsearch domain on every apply.
     * 
     */
    @Export(name="advancedOptions", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> advancedOptions;

    /**
     * @return Key-value string pairs to specify advanced configuration options. Note that the values for these configuration options must be strings (wrapped in quotes) or they may be wrong and cause a perpetual diff, causing the provider to want to recreate your Elasticsearch domain on every apply.
     * 
     */
    public Output<Map<String,String>> advancedOptions() {
        return this.advancedOptions;
    }
    /**
     * Configuration block for [fine-grained access control](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/fgac.html). Detailed below.
     * 
     */
    @Export(name="advancedSecurityOptions", refs={DomainAdvancedSecurityOptions.class}, tree="[0]")
    private Output<DomainAdvancedSecurityOptions> advancedSecurityOptions;

    /**
     * @return Configuration block for [fine-grained access control](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/fgac.html). Detailed below.
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
     * Configuration block for authenticating Kibana with Cognito. Detailed below.
     * 
     */
    @Export(name="cognitoOptions", refs={DomainCognitoOptions.class}, tree="[0]")
    private Output</* @Nullable */ DomainCognitoOptions> cognitoOptions;

    /**
     * @return Configuration block for authenticating Kibana with Cognito. Detailed below.
     * 
     */
    public Output<Optional<DomainCognitoOptions>> cognitoOptions() {
        return Codegen.optional(this.cognitoOptions);
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
     * Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). Detailed below.
     * 
     */
    @Export(name="ebsOptions", refs={DomainEbsOptions.class}, tree="[0]")
    private Output<DomainEbsOptions> ebsOptions;

    /**
     * @return Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). Detailed below.
     * 
     */
    public Output<DomainEbsOptions> ebsOptions() {
        return this.ebsOptions;
    }
    /**
     * Version of Elasticsearch to deploy. Defaults to `1.5`.
     * 
     */
    @Export(name="elasticsearchVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> elasticsearchVersion;

    /**
     * @return Version of Elasticsearch to deploy. Defaults to `1.5`.
     * 
     */
    public Output<Optional<String>> elasticsearchVersion() {
        return Codegen.optional(this.elasticsearchVersion);
    }
    /**
     * Configuration block for encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). Detailed below.
     * 
     */
    @Export(name="encryptAtRest", refs={DomainEncryptAtRest.class}, tree="[0]")
    private Output<DomainEncryptAtRest> encryptAtRest;

    /**
     * @return Configuration block for encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). Detailed below.
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
     * Domain-specific endpoint for kibana without https scheme.
     * 
     */
    @Export(name="kibanaEndpoint", refs={String.class}, tree="[0]")
    private Output<String> kibanaEndpoint;

    /**
     * @return Domain-specific endpoint for kibana without https scheme.
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
     * Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running Elasticsearch 5.3 and later, Amazon ES takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions of Elasticsearch, Amazon ES takes daily automated snapshots.
     * 
     */
    @Export(name="snapshotOptions", refs={DomainSnapshotOptions.class}, tree="[0]")
    private Output</* @Nullable */ DomainSnapshotOptions> snapshotOptions;

    /**
     * @return Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running Elasticsearch 5.3 and later, Amazon ES takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions of Elasticsearch, Amazon ES takes daily automated snapshots.
     * 
     */
    public Output<Optional<DomainSnapshotOptions>> snapshotOptions() {
        return Codegen.optional(this.snapshotOptions);
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
     */
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
     * Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)). Detailed below.
     * 
     */
    @Export(name="vpcOptions", refs={DomainVpcOptions.class}, tree="[0]")
    private Output</* @Nullable */ DomainVpcOptions> vpcOptions;

    /**
     * @return Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)). Detailed below.
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
        super("aws:elasticsearch/domain:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticsearch/domain:Domain", name, state, makeResourceOptions(options, id));
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
