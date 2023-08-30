// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sagemaker.FeatureGroupArgs;
import com.pulumi.aws.sagemaker.inputs.FeatureGroupState;
import com.pulumi.aws.sagemaker.outputs.FeatureGroupFeatureDefinition;
import com.pulumi.aws.sagemaker.outputs.FeatureGroupOfflineStoreConfig;
import com.pulumi.aws.sagemaker.outputs.FeatureGroupOnlineStoreConfig;
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
 * Provides a SageMaker Feature Group resource.
 * 
 * ## Example Usage
 * 
 * Basic usage:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sagemaker.FeatureGroup;
 * import com.pulumi.aws.sagemaker.FeatureGroupArgs;
 * import com.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs;
 * import com.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs;
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
 *         var example = new FeatureGroup(&#34;example&#34;, FeatureGroupArgs.builder()        
 *             .featureGroupName(&#34;example&#34;)
 *             .recordIdentifierFeatureName(&#34;example&#34;)
 *             .eventTimeFeatureName(&#34;example&#34;)
 *             .roleArn(aws_iam_role.test().arn())
 *             .featureDefinitions(FeatureGroupFeatureDefinitionArgs.builder()
 *                 .featureName(&#34;example&#34;)
 *                 .featureType(&#34;String&#34;)
 *                 .build())
 *             .onlineStoreConfig(FeatureGroupOnlineStoreConfigArgs.builder()
 *                 .enableOnlineStore(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Feature Groups using the `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/featureGroup:FeatureGroup test_feature_group feature_group-foo
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/featureGroup:FeatureGroup")
public class FeatureGroup extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this feature_group.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this feature_group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A free-form description of a Feature Group.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A free-form description of a Feature Group.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the feature that stores the EventTime of a Record in a Feature Group.
     * 
     */
    @Export(name="eventTimeFeatureName", refs={String.class}, tree="[0]")
    private Output<String> eventTimeFeatureName;

    /**
     * @return The name of the feature that stores the EventTime of a Record in a Feature Group.
     * 
     */
    public Output<String> eventTimeFeatureName() {
        return this.eventTimeFeatureName;
    }
    /**
     * A list of Feature names and types. See Feature Definition Below.
     * 
     */
    @Export(name="featureDefinitions", refs={List.class,FeatureGroupFeatureDefinition.class}, tree="[0,1]")
    private Output<List<FeatureGroupFeatureDefinition>> featureDefinitions;

    /**
     * @return A list of Feature names and types. See Feature Definition Below.
     * 
     */
    public Output<List<FeatureGroupFeatureDefinition>> featureDefinitions() {
        return this.featureDefinitions;
    }
    /**
     * The name of the Feature Group. The name must be unique within an AWS Region in an AWS account.
     * 
     */
    @Export(name="featureGroupName", refs={String.class}, tree="[0]")
    private Output<String> featureGroupName;

    /**
     * @return The name of the Feature Group. The name must be unique within an AWS Region in an AWS account.
     * 
     */
    public Output<String> featureGroupName() {
        return this.featureGroupName;
    }
    /**
     * The Offline Feature Store Configuration. See Offline Store Config Below.
     * 
     */
    @Export(name="offlineStoreConfig", refs={FeatureGroupOfflineStoreConfig.class}, tree="[0]")
    private Output</* @Nullable */ FeatureGroupOfflineStoreConfig> offlineStoreConfig;

    /**
     * @return The Offline Feature Store Configuration. See Offline Store Config Below.
     * 
     */
    public Output<Optional<FeatureGroupOfflineStoreConfig>> offlineStoreConfig() {
        return Codegen.optional(this.offlineStoreConfig);
    }
    /**
     * The Online Feature Store Configuration. See Online Store Config Below.
     * 
     */
    @Export(name="onlineStoreConfig", refs={FeatureGroupOnlineStoreConfig.class}, tree="[0]")
    private Output</* @Nullable */ FeatureGroupOnlineStoreConfig> onlineStoreConfig;

    /**
     * @return The Online Feature Store Configuration. See Online Store Config Below.
     * 
     */
    public Output<Optional<FeatureGroupOnlineStoreConfig>> onlineStoreConfig() {
        return Codegen.optional(this.onlineStoreConfig);
    }
    /**
     * The name of the Feature whose value uniquely identifies a Record defined in the Feature Store. Only the latest record per identifier value will be stored in the Online Store.
     * 
     */
    @Export(name="recordIdentifierFeatureName", refs={String.class}, tree="[0]")
    private Output<String> recordIdentifierFeatureName;

    /**
     * @return The name of the Feature whose value uniquely identifies a Record defined in the Feature Store. Only the latest record per identifier value will be stored in the Online Store.
     * 
     */
    public Output<String> recordIdentifierFeatureName() {
        return this.recordIdentifierFeatureName;
    }
    /**
     * The Amazon Resource Name (ARN) of the IAM execution role used to persist data into the Offline Store if an `offline_store_config` is provided.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM execution role used to persist data into the Offline Store if an `offline_store_config` is provided.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * Map of resource tags for the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of resource tags for the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
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
    public FeatureGroup(String name) {
        this(name, FeatureGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FeatureGroup(String name, FeatureGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FeatureGroup(String name, FeatureGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/featureGroup:FeatureGroup", name, args == null ? FeatureGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FeatureGroup(String name, Output<String> id, @Nullable FeatureGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/featureGroup:FeatureGroup", name, state, makeResourceOptions(options, id));
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
    public static FeatureGroup get(String name, Output<String> id, @Nullable FeatureGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FeatureGroup(name, id, state, options);
    }
}
