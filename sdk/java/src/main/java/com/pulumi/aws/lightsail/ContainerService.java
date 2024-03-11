// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lightsail;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lightsail.ContainerServiceArgs;
import com.pulumi.aws.lightsail.inputs.ContainerServiceState;
import com.pulumi.aws.lightsail.outputs.ContainerServicePrivateRegistryAccess;
import com.pulumi.aws.lightsail.outputs.ContainerServicePublicDomainNames;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An Amazon Lightsail container service is a highly scalable compute and networking resource on which you can deploy, run,
 * and manage containers. For more information, see
 * [Container services in Amazon Lightsail](https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-container-services).
 * 
 * &gt; **Note:** For more information about the AWS Regions in which you can create Amazon Lightsail container services,
 * see [&#34;Regions and Availability Zones in Amazon Lightsail&#34;](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail).
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lightsail.ContainerService;
 * import com.pulumi.aws.lightsail.ContainerServiceArgs;
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
 *         var myContainerService = new ContainerService(&#34;myContainerService&#34;, ContainerServiceArgs.builder()        
 *             .name(&#34;container-service-1&#34;)
 *             .power(&#34;nano&#34;)
 *             .scale(1)
 *             .isDisabled(false)
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;foo1&#34;, &#34;bar1&#34;),
 *                 Map.entry(&#34;foo2&#34;, &#34;&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Public Domain Names
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lightsail.ContainerService;
 * import com.pulumi.aws.lightsail.ContainerServiceArgs;
 * import com.pulumi.aws.lightsail.inputs.ContainerServicePublicDomainNamesArgs;
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
 *         var myContainerService = new ContainerService(&#34;myContainerService&#34;, ContainerServiceArgs.builder()        
 *             .publicDomainNames(ContainerServicePublicDomainNamesArgs.builder()
 *                 .certificates(ContainerServicePublicDomainNamesCertificateArgs.builder()
 *                     .certificateName(&#34;example-certificate&#34;)
 *                     .domainNames(&#34;www.example.com&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Private Registry Access
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lightsail.ContainerService;
 * import com.pulumi.aws.lightsail.ContainerServiceArgs;
 * import com.pulumi.aws.lightsail.inputs.ContainerServicePrivateRegistryAccessArgs;
 * import com.pulumi.aws.lightsail.inputs.ContainerServicePrivateRegistryAccessEcrImagePullerRoleArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.ecr.RepositoryPolicy;
 * import com.pulumi.aws.ecr.RepositoryPolicyArgs;
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
 *         var defaultContainerService = new ContainerService(&#34;defaultContainerService&#34;, ContainerServiceArgs.builder()        
 *             .privateRegistryAccess(ContainerServicePrivateRegistryAccessArgs.builder()
 *                 .ecrImagePullerRole(ContainerServicePrivateRegistryAccessEcrImagePullerRoleArgs.builder()
 *                     .isActive(true)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         final var default = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;AWS&#34;)
 *                     .identifiers(defaultContainerService.privateRegistryAccess().applyValue(privateRegistryAccess -&gt; privateRegistryAccess.ecrImagePullerRole().principalArn()))
 *                     .build())
 *                 .actions(                
 *                     &#34;ecr:BatchGetImage&#34;,
 *                     &#34;ecr:GetDownloadUrlForLayer&#34;)
 *                 .build())
 *             .build());
 * 
 *         var defaultRepositoryPolicy = new RepositoryPolicy(&#34;defaultRepositoryPolicy&#34;, RepositoryPolicyArgs.builder()        
 *             .repository(defaultAwsEcrRepository.name())
 *             .policy(default_.applyValue(default_ -&gt; default_.json()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Lightsail Container Service using the `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:lightsail/containerService:ContainerService my_container_service container-service-1
 * ```
 * 
 */
@ResourceType(type="aws:lightsail/containerService:ContainerService")
public class ContainerService extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the container service.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the container service.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The Availability Zone. Follows the format us-east-2a (case-sensitive).
     * 
     */
    @Export(name="availabilityZone", refs={String.class}, tree="[0]")
    private Output<String> availabilityZone;

    /**
     * @return The Availability Zone. Follows the format us-east-2a (case-sensitive).
     * 
     */
    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * A Boolean value indicating whether the container service is disabled. Defaults to `false`.
     * 
     */
    @Export(name="isDisabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isDisabled;

    /**
     * @return A Boolean value indicating whether the container service is disabled. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> isDisabled() {
        return Codegen.optional(this.isDisabled);
    }
    /**
     * The name for the container service. Names must be of length 1 to 63, and be
     * unique within each AWS Region in your Lightsail account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the container service. Names must be of length 1 to 63, and be
     * unique within each AWS Region in your Lightsail account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The power specification for the container service. The power specifies the amount of memory,
     * the number of vCPUs, and the monthly price of each node of the container service.
     * Possible values: `nano`, `micro`, `small`, `medium`, `large`, `xlarge`.
     * 
     */
    @Export(name="power", refs={String.class}, tree="[0]")
    private Output<String> power;

    /**
     * @return The power specification for the container service. The power specifies the amount of memory,
     * the number of vCPUs, and the monthly price of each node of the container service.
     * Possible values: `nano`, `micro`, `small`, `medium`, `large`, `xlarge`.
     * 
     */
    public Output<String> power() {
        return this.power;
    }
    /**
     * The ID of the power of the container service.
     * 
     */
    @Export(name="powerId", refs={String.class}, tree="[0]")
    private Output<String> powerId;

    /**
     * @return The ID of the power of the container service.
     * 
     */
    public Output<String> powerId() {
        return this.powerId;
    }
    /**
     * The principal ARN of the container service. The principal ARN can be used to create a trust
     * relationship between your standard AWS account and your Lightsail container service. This allows you to give your
     * service permission to access resources in your standard AWS account.
     * 
     */
    @Export(name="principalArn", refs={String.class}, tree="[0]")
    private Output<String> principalArn;

    /**
     * @return The principal ARN of the container service. The principal ARN can be used to create a trust
     * relationship between your standard AWS account and your Lightsail container service. This allows you to give your
     * service permission to access resources in your standard AWS account.
     * 
     */
    public Output<String> principalArn() {
        return this.principalArn;
    }
    /**
     * The private domain name of the container service. The private domain name is accessible only
     * by other resources within the default virtual private cloud (VPC) of your Lightsail account.
     * 
     */
    @Export(name="privateDomainName", refs={String.class}, tree="[0]")
    private Output<String> privateDomainName;

    /**
     * @return The private domain name of the container service. The private domain name is accessible only
     * by other resources within the default virtual private cloud (VPC) of your Lightsail account.
     * 
     */
    public Output<String> privateDomainName() {
        return this.privateDomainName;
    }
    /**
     * An object to describe the configuration for the container service to access private container image repositories, such as Amazon Elastic Container Registry (Amazon ECR) private repositories. See Private Registry Access below for more details.
     * 
     */
    @Export(name="privateRegistryAccess", refs={ContainerServicePrivateRegistryAccess.class}, tree="[0]")
    private Output<ContainerServicePrivateRegistryAccess> privateRegistryAccess;

    /**
     * @return An object to describe the configuration for the container service to access private container image repositories, such as Amazon Elastic Container Registry (Amazon ECR) private repositories. See Private Registry Access below for more details.
     * 
     */
    public Output<ContainerServicePrivateRegistryAccess> privateRegistryAccess() {
        return this.privateRegistryAccess;
    }
    /**
     * The public domain names to use with the container service, such as example.com
     * and www.example.com. You can specify up to four public domain names for a container service. The domain names that you
     * specify are used when you create a deployment with a container configured as the public endpoint of your container
     * service. If you don&#39;t specify public domain names, then you can use the default domain of the container service.
     * Defined below.
     * 
     */
    @Export(name="publicDomainNames", refs={ContainerServicePublicDomainNames.class}, tree="[0]")
    private Output</* @Nullable */ ContainerServicePublicDomainNames> publicDomainNames;

    /**
     * @return The public domain names to use with the container service, such as example.com
     * and www.example.com. You can specify up to four public domain names for a container service. The domain names that you
     * specify are used when you create a deployment with a container configured as the public endpoint of your container
     * service. If you don&#39;t specify public domain names, then you can use the default domain of the container service.
     * Defined below.
     * 
     */
    public Output<Optional<ContainerServicePublicDomainNames>> publicDomainNames() {
        return Codegen.optional(this.publicDomainNames);
    }
    /**
     * The Lightsail resource type of the container service (i.e., ContainerService).
     * 
     */
    @Export(name="resourceType", refs={String.class}, tree="[0]")
    private Output<String> resourceType;

    /**
     * @return The Lightsail resource type of the container service (i.e., ContainerService).
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }
    /**
     * The scale specification for the container service. The scale specifies the allocated compute
     * nodes of the container service.
     * 
     */
    @Export(name="scale", refs={Integer.class}, tree="[0]")
    private Output<Integer> scale;

    /**
     * @return The scale specification for the container service. The scale specifies the allocated compute
     * nodes of the container service.
     * 
     */
    public Output<Integer> scale() {
        return this.scale;
    }
    /**
     * The current state of the container service.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The current state of the container service.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Map of container service tags. To tag at launch, specify the tags in the Launch Template. If
     * configured with a provider
     * `default_tags` configuration block
     * present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of container service tags. To tag at launch, specify the tags in the Launch Template. If
     * configured with a provider
     * `default_tags` configuration block
     * present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider
     * `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider
     * `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The publicly accessible URL of the container service. If no public endpoint is specified in the
     * currentDeployment, this URL returns a 404 response.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return The publicly accessible URL of the container service. If no public endpoint is specified in the
     * currentDeployment, this URL returns a 404 response.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContainerService(String name) {
        this(name, ContainerServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContainerService(String name, ContainerServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContainerService(String name, ContainerServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/containerService:ContainerService", name, args == null ? ContainerServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContainerService(String name, Output<String> id, @Nullable ContainerServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/containerService:ContainerService", name, state, makeResourceOptions(options, id));
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
    public static ContainerService get(String name, Output<String> id, @Nullable ContainerServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContainerService(name, id, state, options);
    }
}
