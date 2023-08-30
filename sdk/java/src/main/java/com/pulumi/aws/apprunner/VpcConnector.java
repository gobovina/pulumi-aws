// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apprunner.VpcConnectorArgs;
import com.pulumi.aws.apprunner.inputs.VpcConnectorState;
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
 * Manages an App Runner VPC Connector.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apprunner.VpcConnector;
 * import com.pulumi.aws.apprunner.VpcConnectorArgs;
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
 *         var connector = new VpcConnector(&#34;connector&#34;, VpcConnectorArgs.builder()        
 *             .securityGroups(            
 *                 &#34;sg1&#34;,
 *                 &#34;sg2&#34;)
 *             .subnets(            
 *                 &#34;subnet1&#34;,
 *                 &#34;subnet2&#34;)
 *             .vpcConnectorName(&#34;name&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import App Runner vpc connector using the `arn`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:apprunner/vpcConnector:VpcConnector example arn:aws:apprunner:us-east-1:1234567890:vpcconnector/example/1/0a03292a89764e5882c41d8f991c82fe
 * ```
 * 
 */
@ResourceType(type="aws:apprunner/vpcConnector:VpcConnector")
public class VpcConnector extends com.pulumi.resources.CustomResource {
    /**
     * ARN of VPC connector.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of VPC connector.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * List of IDs of security groups that App Runner should use for access to AWS resources under the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default security group allows all outbound traffic.
     * 
     */
    @Export(name="securityGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityGroups;

    /**
     * @return List of IDs of security groups that App Runner should use for access to AWS resources under the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default security group allows all outbound traffic.
     * 
     */
    public Output<List<String>> securityGroups() {
        return this.securityGroups;
    }
    /**
     * Current state of the VPC connector. If the status of a connector revision is INACTIVE, it was deleted and can&#39;t be used. Inactive connector revisions are permanently removed some time after they are deleted.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Current state of the VPC connector. If the status of a connector revision is INACTIVE, it was deleted and can&#39;t be used. Inactive connector revisions are permanently removed some time after they are deleted.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * List of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
     * 
     */
    @Export(name="subnets", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subnets;

    /**
     * @return List of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.
     * 
     */
    public Output<List<String>> subnets() {
        return this.subnets;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
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
     * Name for the VPC connector.
     * 
     */
    @Export(name="vpcConnectorName", refs={String.class}, tree="[0]")
    private Output<String> vpcConnectorName;

    /**
     * @return Name for the VPC connector.
     * 
     */
    public Output<String> vpcConnectorName() {
        return this.vpcConnectorName;
    }
    /**
     * The revision of VPC connector. It&#39;s unique among all the active connectors (&#34;Status&#34;: &#34;ACTIVE&#34;) that share the same Name.
     * 
     */
    @Export(name="vpcConnectorRevision", refs={Integer.class}, tree="[0]")
    private Output<Integer> vpcConnectorRevision;

    /**
     * @return The revision of VPC connector. It&#39;s unique among all the active connectors (&#34;Status&#34;: &#34;ACTIVE&#34;) that share the same Name.
     * 
     */
    public Output<Integer> vpcConnectorRevision() {
        return this.vpcConnectorRevision;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcConnector(String name) {
        this(name, VpcConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcConnector(String name, VpcConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcConnector(String name, VpcConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apprunner/vpcConnector:VpcConnector", name, args == null ? VpcConnectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcConnector(String name, Output<String> id, @Nullable VpcConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apprunner/vpcConnector:VpcConnector", name, state, makeResourceOptions(options, id));
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
    public static VpcConnector get(String name, Output<String> id, @Nullable VpcConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcConnector(name, id, state, options);
    }
}
