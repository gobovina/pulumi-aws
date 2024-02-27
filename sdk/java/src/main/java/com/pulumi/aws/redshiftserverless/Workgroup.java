// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshiftserverless;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.redshiftserverless.WorkgroupArgs;
import com.pulumi.aws.redshiftserverless.inputs.WorkgroupState;
import com.pulumi.aws.redshiftserverless.outputs.WorkgroupConfigParameter;
import com.pulumi.aws.redshiftserverless.outputs.WorkgroupEndpoint;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new Amazon Redshift Serverless Workgroup.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.redshiftserverless.Workgroup;
 * import com.pulumi.aws.redshiftserverless.WorkgroupArgs;
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
 *         var example = new Workgroup(&#34;example&#34;, WorkgroupArgs.builder()        
 *             .namespaceName(&#34;concurrency-scaling&#34;)
 *             .workgroupName(&#34;concurrency-scaling&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Redshift Serverless Workgroups using the `workgroup_name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:redshiftserverless/workgroup:Workgroup example example
 * ```
 * 
 */
@ResourceType(type="aws:redshiftserverless/workgroup:Workgroup")
public class Workgroup extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the Redshift Serverless Workgroup.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Redshift Serverless Workgroup.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
     * 
     */
    @Export(name="baseCapacity", refs={Integer.class}, tree="[0]")
    private Output<Integer> baseCapacity;

    /**
     * @return The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
     * 
     */
    public Output<Integer> baseCapacity() {
        return this.baseCapacity;
    }
    /**
     * An array of parameters to set for more control over a serverless database. See `Config Parameter` below.
     * 
     */
    @Export(name="configParameters", refs={List.class,WorkgroupConfigParameter.class}, tree="[0,1]")
    private Output<List<WorkgroupConfigParameter>> configParameters;

    /**
     * @return An array of parameters to set for more control over a serverless database. See `Config Parameter` below.
     * 
     */
    public Output<List<WorkgroupConfigParameter>> configParameters() {
        return this.configParameters;
    }
    /**
     * The endpoint that is created from the workgroup. See `Endpoint` below.
     * 
     */
    @Export(name="endpoints", refs={List.class,WorkgroupEndpoint.class}, tree="[0,1]")
    private Output<List<WorkgroupEndpoint>> endpoints;

    /**
     * @return The endpoint that is created from the workgroup. See `Endpoint` below.
     * 
     */
    public Output<List<WorkgroupEndpoint>> endpoints() {
        return this.endpoints;
    }
    /**
     * The value that specifies whether to turn on enhanced virtual private cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC instead of over the internet.
     * 
     */
    @Export(name="enhancedVpcRouting", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enhancedVpcRouting;

    /**
     * @return The value that specifies whether to turn on enhanced virtual private cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC instead of over the internet.
     * 
     */
    public Output<Optional<Boolean>> enhancedVpcRouting() {
        return Codegen.optional(this.enhancedVpcRouting);
    }
    /**
     * The name of the namespace.
     * 
     */
    @Export(name="namespaceName", refs={String.class}, tree="[0]")
    private Output<String> namespaceName;

    /**
     * @return The name of the namespace.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }
    /**
     * The port number on which the cluster accepts incoming connections.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output<Integer> port;

    /**
     * @return The port number on which the cluster accepts incoming connections.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * A value that specifies whether the workgroup can be accessed from a public network.
     * 
     */
    @Export(name="publiclyAccessible", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> publiclyAccessible;

    /**
     * @return A value that specifies whether the workgroup can be accessed from a public network.
     * 
     */
    public Output<Optional<Boolean>> publiclyAccessible() {
        return Codegen.optional(this.publiclyAccessible);
    }
    /**
     * An array of security group IDs to associate with the workgroup.
     * 
     */
    @Export(name="securityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityGroupIds;

    /**
     * @return An array of security group IDs to associate with the workgroup.
     * 
     */
    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * An array of VPC subnet IDs to associate with the workgroup. When set, must contain at least three subnets spanning three Availability Zones. A minimum number of IP addresses is required and scales with the Base Capacity. For more information, see the following [AWS document](https://docs.aws.amazon.com/redshift/latest/mgmt/serverless-known-issues.html).
     * 
     */
    @Export(name="subnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subnetIds;

    /**
     * @return An array of VPC subnet IDs to associate with the workgroup. When set, must contain at least three subnets spanning three Availability Zones. A minimum number of IP addresses is required and scales with the Base Capacity. For more information, see the following [AWS document](https://docs.aws.amazon.com/redshift/latest/mgmt/serverless-known-issues.html).
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The Redshift Workgroup ID.
     * 
     */
    @Export(name="workgroupId", refs={String.class}, tree="[0]")
    private Output<String> workgroupId;

    /**
     * @return The Redshift Workgroup ID.
     * 
     */
    public Output<String> workgroupId() {
        return this.workgroupId;
    }
    /**
     * The name of the workgroup.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="workgroupName", refs={String.class}, tree="[0]")
    private Output<String> workgroupName;

    /**
     * @return The name of the workgroup.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> workgroupName() {
        return this.workgroupName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Workgroup(String name) {
        this(name, WorkgroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workgroup(String name, WorkgroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workgroup(String name, WorkgroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshiftserverless/workgroup:Workgroup", name, args == null ? WorkgroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Workgroup(String name, Output<String> id, @Nullable WorkgroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshiftserverless/workgroup:Workgroup", name, state, makeResourceOptions(options, id));
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
    public static Workgroup get(String name, Output<String> id, @Nullable WorkgroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Workgroup(name, id, state, options);
    }
}
