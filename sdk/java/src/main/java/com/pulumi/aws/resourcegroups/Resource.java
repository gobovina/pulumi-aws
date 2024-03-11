// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.resourcegroups;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.resourcegroups.ResourceArgs;
import com.pulumi.aws.resourcegroups.inputs.ResourceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS Resource Groups Resource.
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
 * import com.pulumi.aws.ec2.DedicatedHost;
 * import com.pulumi.aws.ec2.DedicatedHostArgs;
 * import com.pulumi.aws.resourcegroups.Group;
 * import com.pulumi.aws.resourcegroups.GroupArgs;
 * import com.pulumi.aws.resourcegroups.Resource;
 * import com.pulumi.aws.resourcegroups.ResourceArgs;
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
 *         var example = new DedicatedHost(&#34;example&#34;, DedicatedHostArgs.builder()        
 *             .instanceFamily(&#34;t3&#34;)
 *             .availabilityZone(&#34;us-east-1a&#34;)
 *             .hostRecovery(&#34;off&#34;)
 *             .autoPlacement(&#34;on&#34;)
 *             .build());
 * 
 *         var exampleGroup = new Group(&#34;exampleGroup&#34;, GroupArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleResource = new Resource(&#34;exampleResource&#34;, ResourceArgs.builder()        
 *             .groupArn(exampleGroup.arn())
 *             .resourceArn(example.arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="aws:resourcegroups/resource:Resource")
public class Resource extends com.pulumi.resources.CustomResource {
    /**
     * The name or the ARN of the resource group to add resources to.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="groupArn", refs={String.class}, tree="[0]")
    private Output<String> groupArn;

    /**
     * @return The name or the ARN of the resource group to add resources to.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> groupArn() {
        return this.groupArn;
    }
    /**
     * The ARN of the resource to be added to the group.
     * 
     */
    @Export(name="resourceArn", refs={String.class}, tree="[0]")
    private Output<String> resourceArn;

    /**
     * @return The ARN of the resource to be added to the group.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }
    /**
     * The resource type of a resource, such as `AWS::EC2::Instance`.
     * 
     */
    @Export(name="resourceType", refs={String.class}, tree="[0]")
    private Output<String> resourceType;

    /**
     * @return The resource type of a resource, such as `AWS::EC2::Instance`.
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Resource(String name) {
        this(name, ResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Resource(String name, ResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Resource(String name, ResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:resourcegroups/resource:Resource", name, args == null ? ResourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Resource(String name, Output<String> id, @Nullable ResourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:resourcegroups/resource:Resource", name, state, makeResourceOptions(options, id));
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
    public static Resource get(String name, Output<String> id, @Nullable ResourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Resource(name, id, state, options);
    }
}
