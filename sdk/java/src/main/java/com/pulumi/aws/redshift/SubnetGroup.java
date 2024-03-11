// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.redshift.SubnetGroupArgs;
import com.pulumi.aws.redshift.inputs.SubnetGroupState;
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
 * Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing Amazon Virtual Private Cloud (Amazon VPC) when creating Amazon Redshift subnet group.
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
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.ec2.Subnet;
 * import com.pulumi.aws.ec2.SubnetArgs;
 * import com.pulumi.aws.redshift.SubnetGroup;
 * import com.pulumi.aws.redshift.SubnetGroupArgs;
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
 *         var foo = new Vpc(&#34;foo&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.1.0.0/16&#34;)
 *             .build());
 * 
 *         var fooSubnet = new Subnet(&#34;fooSubnet&#34;, SubnetArgs.builder()        
 *             .cidrBlock(&#34;10.1.1.0/24&#34;)
 *             .availabilityZone(&#34;us-west-2a&#34;)
 *             .vpcId(foo.id())
 *             .tags(Map.of(&#34;Name&#34;, &#34;tf-dbsubnet-test-1&#34;))
 *             .build());
 * 
 *         var bar = new Subnet(&#34;bar&#34;, SubnetArgs.builder()        
 *             .cidrBlock(&#34;10.1.2.0/24&#34;)
 *             .availabilityZone(&#34;us-west-2b&#34;)
 *             .vpcId(foo.id())
 *             .tags(Map.of(&#34;Name&#34;, &#34;tf-dbsubnet-test-2&#34;))
 *             .build());
 * 
 *         var fooSubnetGroup = new SubnetGroup(&#34;fooSubnetGroup&#34;, SubnetGroupArgs.builder()        
 *             .name(&#34;foo&#34;)
 *             .subnetIds(            
 *                 fooSubnet.id(),
 *                 bar.id())
 *             .tags(Map.of(&#34;environment&#34;, &#34;Production&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Redshift subnet groups using the `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:redshift/subnetGroup:SubnetGroup testgroup1 test-cluster-subnet-group
 * ```
 * 
 */
@ResourceType(type="aws:redshift/subnetGroup:SubnetGroup")
public class SubnetGroup extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the Redshift Subnet group name
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Redshift Subnet group name
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The description of the Redshift Subnet group. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return The description of the Redshift Subnet group. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The name of the Redshift Subnet group.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Redshift Subnet group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * An array of VPC subnet IDs.
     * 
     */
    @Export(name="subnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subnetIds;

    /**
     * @return An array of VPC subnet IDs.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
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
    public SubnetGroup(String name) {
        this(name, SubnetGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SubnetGroup(String name, SubnetGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SubnetGroup(String name, SubnetGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/subnetGroup:SubnetGroup", name, args == null ? SubnetGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SubnetGroup(String name, Output<String> id, @Nullable SubnetGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/subnetGroup:SubnetGroup", name, state, makeResourceOptions(options, id));
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
    public static SubnetGroup get(String name, Output<String> id, @Nullable SubnetGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SubnetGroup(name, id, state, options);
    }
}
