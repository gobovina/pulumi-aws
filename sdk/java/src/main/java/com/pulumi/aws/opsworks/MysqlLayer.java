// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.opsworks.MysqlLayerArgs;
import com.pulumi.aws.opsworks.inputs.MysqlLayerState;
import com.pulumi.aws.opsworks.outputs.MysqlLayerCloudwatchConfiguration;
import com.pulumi.aws.opsworks.outputs.MysqlLayerEbsVolume;
import com.pulumi.aws.opsworks.outputs.MysqlLayerLoadBasedAutoScaling;
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
 * Provides an OpsWorks MySQL layer resource.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.opsworks.MysqlLayer;
 * import com.pulumi.aws.opsworks.MysqlLayerArgs;
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
 *         var db = new MysqlLayer("db", MysqlLayerArgs.builder()
 *             .stackId(main.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="aws:opsworks/mysqlLayer:MysqlLayer")
public class MysqlLayer extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name(ARN) of the layer.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name(ARN) of the layer.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Whether to automatically assign an elastic IP address to the layer&#39;s instances.
     * 
     */
    @Export(name="autoAssignElasticIps", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoAssignElasticIps;

    /**
     * @return Whether to automatically assign an elastic IP address to the layer&#39;s instances.
     * 
     */
    public Output<Optional<Boolean>> autoAssignElasticIps() {
        return Codegen.optional(this.autoAssignElasticIps);
    }
    /**
     * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer&#39;s instances.
     * 
     */
    @Export(name="autoAssignPublicIps", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoAssignPublicIps;

    /**
     * @return For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer&#39;s instances.
     * 
     */
    public Output<Optional<Boolean>> autoAssignPublicIps() {
        return Codegen.optional(this.autoAssignPublicIps);
    }
    /**
     * Whether to enable auto-healing for the layer.
     * 
     */
    @Export(name="autoHealing", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoHealing;

    /**
     * @return Whether to enable auto-healing for the layer.
     * 
     */
    public Output<Optional<Boolean>> autoHealing() {
        return Codegen.optional(this.autoHealing);
    }
    @Export(name="cloudwatchConfiguration", refs={MysqlLayerCloudwatchConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ MysqlLayerCloudwatchConfiguration> cloudwatchConfiguration;

    public Output<Optional<MysqlLayerCloudwatchConfiguration>> cloudwatchConfiguration() {
        return Codegen.optional(this.cloudwatchConfiguration);
    }
    @Export(name="customConfigureRecipes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> customConfigureRecipes;

    public Output<Optional<List<String>>> customConfigureRecipes() {
        return Codegen.optional(this.customConfigureRecipes);
    }
    @Export(name="customDeployRecipes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> customDeployRecipes;

    public Output<Optional<List<String>>> customDeployRecipes() {
        return Codegen.optional(this.customDeployRecipes);
    }
    /**
     * The ARN of an IAM profile that will be used for the layer&#39;s instances.
     * 
     */
    @Export(name="customInstanceProfileArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customInstanceProfileArn;

    /**
     * @return The ARN of an IAM profile that will be used for the layer&#39;s instances.
     * 
     */
    public Output<Optional<String>> customInstanceProfileArn() {
        return Codegen.optional(this.customInstanceProfileArn);
    }
    /**
     * Custom JSON attributes to apply to the layer.
     * 
     */
    @Export(name="customJson", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customJson;

    /**
     * @return Custom JSON attributes to apply to the layer.
     * 
     */
    public Output<Optional<String>> customJson() {
        return Codegen.optional(this.customJson);
    }
    /**
     * Ids for a set of security groups to apply to the layer&#39;s instances.
     * 
     */
    @Export(name="customSecurityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> customSecurityGroupIds;

    /**
     * @return Ids for a set of security groups to apply to the layer&#39;s instances.
     * 
     */
    public Output<Optional<List<String>>> customSecurityGroupIds() {
        return Codegen.optional(this.customSecurityGroupIds);
    }
    @Export(name="customSetupRecipes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> customSetupRecipes;

    public Output<Optional<List<String>>> customSetupRecipes() {
        return Codegen.optional(this.customSetupRecipes);
    }
    @Export(name="customShutdownRecipes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> customShutdownRecipes;

    public Output<Optional<List<String>>> customShutdownRecipes() {
        return Codegen.optional(this.customShutdownRecipes);
    }
    @Export(name="customUndeployRecipes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> customUndeployRecipes;

    public Output<Optional<List<String>>> customUndeployRecipes() {
        return Codegen.optional(this.customUndeployRecipes);
    }
    /**
     * Whether to enable Elastic Load Balancing connection draining.
     * 
     */
    @Export(name="drainElbOnShutdown", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> drainElbOnShutdown;

    /**
     * @return Whether to enable Elastic Load Balancing connection draining.
     * 
     */
    public Output<Optional<Boolean>> drainElbOnShutdown() {
        return Codegen.optional(this.drainElbOnShutdown);
    }
    /**
     * `ebs_volume` blocks, as described below, will each create an EBS volume and connect it to the layer&#39;s instances.
     * 
     */
    @Export(name="ebsVolumes", refs={List.class,MysqlLayerEbsVolume.class}, tree="[0,1]")
    private Output<List<MysqlLayerEbsVolume>> ebsVolumes;

    /**
     * @return `ebs_volume` blocks, as described below, will each create an EBS volume and connect it to the layer&#39;s instances.
     * 
     */
    public Output<List<MysqlLayerEbsVolume>> ebsVolumes() {
        return this.ebsVolumes;
    }
    /**
     * Name of an Elastic Load Balancer to attach to this layer
     * 
     */
    @Export(name="elasticLoadBalancer", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> elasticLoadBalancer;

    /**
     * @return Name of an Elastic Load Balancer to attach to this layer
     * 
     */
    public Output<Optional<String>> elasticLoadBalancer() {
        return Codegen.optional(this.elasticLoadBalancer);
    }
    /**
     * Whether to install OS and package updates on each instance when it boots.
     * 
     */
    @Export(name="installUpdatesOnBoot", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> installUpdatesOnBoot;

    /**
     * @return Whether to install OS and package updates on each instance when it boots.
     * 
     */
    public Output<Optional<Boolean>> installUpdatesOnBoot() {
        return Codegen.optional(this.installUpdatesOnBoot);
    }
    /**
     * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
     * 
     */
    @Export(name="instanceShutdownTimeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> instanceShutdownTimeout;

    /**
     * @return The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
     * 
     */
    public Output<Optional<Integer>> instanceShutdownTimeout() {
        return Codegen.optional(this.instanceShutdownTimeout);
    }
    @Export(name="loadBasedAutoScaling", refs={MysqlLayerLoadBasedAutoScaling.class}, tree="[0]")
    private Output<MysqlLayerLoadBasedAutoScaling> loadBasedAutoScaling;

    public Output<MysqlLayerLoadBasedAutoScaling> loadBasedAutoScaling() {
        return this.loadBasedAutoScaling;
    }
    /**
     * A human-readable name for the layer.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A human-readable name for the layer.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Root password to use for MySQL.
     * 
     */
    @Export(name="rootPassword", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rootPassword;

    /**
     * @return Root password to use for MySQL.
     * 
     */
    public Output<Optional<String>> rootPassword() {
        return Codegen.optional(this.rootPassword);
    }
    /**
     * Whether to set the root user password to all instances in the stack so they can access the instances in this layer.
     * 
     */
    @Export(name="rootPasswordOnAllInstances", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> rootPasswordOnAllInstances;

    /**
     * @return Whether to set the root user password to all instances in the stack so they can access the instances in this layer.
     * 
     */
    public Output<Optional<Boolean>> rootPasswordOnAllInstances() {
        return Codegen.optional(this.rootPasswordOnAllInstances);
    }
    /**
     * ID of the stack the layer will belong to.
     * 
     */
    @Export(name="stackId", refs={String.class}, tree="[0]")
    private Output<String> stackId;

    /**
     * @return ID of the stack the layer will belong to.
     * 
     */
    public Output<String> stackId() {
        return this.stackId;
    }
    /**
     * Names of a set of system packages to install on the layer&#39;s instances.
     * 
     */
    @Export(name="systemPackages", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> systemPackages;

    /**
     * @return Names of a set of system packages to install on the layer&#39;s instances.
     * 
     */
    public Output<Optional<List<String>>> systemPackages() {
        return Codegen.optional(this.systemPackages);
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     * The following extra optional arguments, all lists of Chef recipe names, allow
     * custom Chef recipes to be applied to layer instances at the five different
     * lifecycle events, if custom cookbooks are enabled on the layer&#39;s stack:
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     * The following extra optional arguments, all lists of Chef recipe names, allow
     * custom Chef recipes to be applied to layer instances at the five different
     * lifecycle events, if custom cookbooks are enabled on the layer&#39;s stack:
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
     * Whether to use EBS-optimized instances.
     * 
     */
    @Export(name="useEbsOptimizedInstances", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> useEbsOptimizedInstances;

    /**
     * @return Whether to use EBS-optimized instances.
     * 
     */
    public Output<Optional<Boolean>> useEbsOptimizedInstances() {
        return Codegen.optional(this.useEbsOptimizedInstances);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MysqlLayer(String name) {
        this(name, MysqlLayerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MysqlLayer(String name, MysqlLayerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MysqlLayer(String name, MysqlLayerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opsworks/mysqlLayer:MysqlLayer", name, args == null ? MysqlLayerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MysqlLayer(String name, Output<String> id, @Nullable MysqlLayerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:opsworks/mysqlLayer:MysqlLayer", name, state, makeResourceOptions(options, id));
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
    public static MysqlLayer get(String name, Output<String> id, @Nullable MysqlLayerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MysqlLayer(name, id, state, options);
    }
}
