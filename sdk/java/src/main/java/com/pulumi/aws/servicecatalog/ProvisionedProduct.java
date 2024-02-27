// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.servicecatalog.ProvisionedProductArgs;
import com.pulumi.aws.servicecatalog.inputs.ProvisionedProductState;
import com.pulumi.aws.servicecatalog.outputs.ProvisionedProductOutput;
import com.pulumi.aws.servicecatalog.outputs.ProvisionedProductProvisioningParameter;
import com.pulumi.aws.servicecatalog.outputs.ProvisionedProductStackSetProvisioningPreferences;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource provisions and manages a Service Catalog provisioned product.
 * 
 * A provisioned product is a resourced instance of a product. For example, provisioning a product based on a CloudFormation template launches a CloudFormation stack and its underlying resources.
 * 
 * Like this resource, the `aws_servicecatalog_record` data source also provides information about a provisioned product. Although a Service Catalog record provides some overlapping information with this resource, a record is tied to a provisioned product event, such as provisioning, termination, and updating.
 * 
 * &gt; **Tip:** If you include conflicted keys as tags, AWS will report an error, &#34;Parameter validation failed: Missing required parameter in Tags[N]:Value&#34;.
 * 
 * &gt; **Tip:** A &#34;provisioning artifact&#34; is also referred to as a &#34;version.&#34; A &#34;distributor&#34; is also referred to as a &#34;vendor.&#34;
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.servicecatalog.ProvisionedProduct;
 * import com.pulumi.aws.servicecatalog.ProvisionedProductArgs;
 * import com.pulumi.aws.servicecatalog.inputs.ProvisionedProductProvisioningParameterArgs;
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
 *         var example = new ProvisionedProduct(&#34;example&#34;, ProvisionedProductArgs.builder()        
 *             .productName(&#34;Example product&#34;)
 *             .provisioningArtifactName(&#34;Example version&#34;)
 *             .provisioningParameters(ProvisionedProductProvisioningParameterArgs.builder()
 *                 .key(&#34;foo&#34;)
 *                 .value(&#34;bar&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_servicecatalog_provisioned_product` using the provisioned product ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:servicecatalog/provisionedProduct:ProvisionedProduct example pp-dnigbtea24ste
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/provisionedProduct:ProvisionedProduct")
public class ProvisionedProduct extends com.pulumi.resources.CustomResource {
    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Export(name="acceptLanguage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> acceptLanguage;

    /**
     * @return Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    public Output<Optional<String>> acceptLanguage() {
        return Codegen.optional(this.acceptLanguage);
    }
    /**
     * ARN of the provisioned product.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the provisioned product.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Set of CloudWatch dashboards that were created when provisioning the product.
     * 
     */
    @Export(name="cloudwatchDashboardNames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> cloudwatchDashboardNames;

    /**
     * @return Set of CloudWatch dashboards that were created when provisioning the product.
     * 
     */
    public Output<List<String>> cloudwatchDashboardNames() {
        return this.cloudwatchDashboardNames;
    }
    /**
     * Time when the provisioned product was created.
     * 
     */
    @Export(name="createdTime", refs={String.class}, tree="[0]")
    private Output<String> createdTime;

    /**
     * @return Time when the provisioned product was created.
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * _Only applies to deleting._ If set to `true`, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources. The default value is `false`.
     * 
     */
    @Export(name="ignoreErrors", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ignoreErrors;

    /**
     * @return _Only applies to deleting._ If set to `true`, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources. The default value is `false`.
     * 
     */
    public Output<Optional<Boolean>> ignoreErrors() {
        return Codegen.optional(this.ignoreErrors);
    }
    /**
     * Record identifier of the last request performed on this provisioned product of the following types: `ProvisionedProduct`, `UpdateProvisionedProduct`, `ExecuteProvisionedProductPlan`, `TerminateProvisionedProduct`.
     * 
     */
    @Export(name="lastProvisioningRecordId", refs={String.class}, tree="[0]")
    private Output<String> lastProvisioningRecordId;

    /**
     * @return Record identifier of the last request performed on this provisioned product of the following types: `ProvisionedProduct`, `UpdateProvisionedProduct`, `ExecuteProvisionedProductPlan`, `TerminateProvisionedProduct`.
     * 
     */
    public Output<String> lastProvisioningRecordId() {
        return this.lastProvisioningRecordId;
    }
    /**
     * Record identifier of the last request performed on this provisioned product.
     * 
     */
    @Export(name="lastRecordId", refs={String.class}, tree="[0]")
    private Output<String> lastRecordId;

    /**
     * @return Record identifier of the last request performed on this provisioned product.
     * 
     */
    public Output<String> lastRecordId() {
        return this.lastRecordId;
    }
    /**
     * Record identifier of the last successful request performed on this provisioned product of the following types: `ProvisionedProduct`, `UpdateProvisionedProduct`, `ExecuteProvisionedProductPlan`, `TerminateProvisionedProduct`.
     * 
     */
    @Export(name="lastSuccessfulProvisioningRecordId", refs={String.class}, tree="[0]")
    private Output<String> lastSuccessfulProvisioningRecordId;

    /**
     * @return Record identifier of the last successful request performed on this provisioned product of the following types: `ProvisionedProduct`, `UpdateProvisionedProduct`, `ExecuteProvisionedProductPlan`, `TerminateProvisionedProduct`.
     * 
     */
    public Output<String> lastSuccessfulProvisioningRecordId() {
        return this.lastSuccessfulProvisioningRecordId;
    }
    /**
     * ARN of the launch role associated with the provisioned product.
     * 
     */
    @Export(name="launchRoleArn", refs={String.class}, tree="[0]")
    private Output<String> launchRoleArn;

    /**
     * @return ARN of the launch role associated with the provisioned product.
     * 
     */
    public Output<String> launchRoleArn() {
        return this.launchRoleArn;
    }
    /**
     * User-friendly name of the provisioned product.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return User-friendly name of the provisioned product.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * 
     */
    @Export(name="notificationArns", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> notificationArns;

    /**
     * @return Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * 
     */
    public Output<Optional<List<String>>> notificationArns() {
        return Codegen.optional(this.notificationArns);
    }
    /**
     * The set of outputs for the product created.
     * 
     */
    @Export(name="outputs", refs={List.class,ProvisionedProductOutput.class}, tree="[0,1]")
    private Output<List<ProvisionedProductOutput>> outputs;

    /**
     * @return The set of outputs for the product created.
     * 
     */
    public Output<List<ProvisionedProductOutput>> outputs() {
        return this.outputs;
    }
    /**
     * Path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use `aws.servicecatalog.getLaunchPaths`. When required, you must provide `path_id` or `path_name`, but not both.
     * 
     */
    @Export(name="pathId", refs={String.class}, tree="[0]")
    private Output<String> pathId;

    /**
     * @return Path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use `aws.servicecatalog.getLaunchPaths`. When required, you must provide `path_id` or `path_name`, but not both.
     * 
     */
    public Output<String> pathId() {
        return this.pathId;
    }
    /**
     * Name of the path. You must provide `path_id` or `path_name`, but not both.
     * 
     */
    @Export(name="pathName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pathName;

    /**
     * @return Name of the path. You must provide `path_id` or `path_name`, but not both.
     * 
     */
    public Output<Optional<String>> pathName() {
        return Codegen.optional(this.pathName);
    }
    /**
     * Product identifier. For example, `prod-abcdzk7xy33qa`. You must provide `product_id` or `product_name`, but not both.
     * 
     */
    @Export(name="productId", refs={String.class}, tree="[0]")
    private Output<String> productId;

    /**
     * @return Product identifier. For example, `prod-abcdzk7xy33qa`. You must provide `product_id` or `product_name`, but not both.
     * 
     */
    public Output<String> productId() {
        return this.productId;
    }
    /**
     * Name of the product. You must provide `product_id` or `product_name`, but not both.
     * 
     */
    @Export(name="productName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> productName;

    /**
     * @return Name of the product. You must provide `product_id` or `product_name`, but not both.
     * 
     */
    public Output<Optional<String>> productName() {
        return Codegen.optional(this.productName);
    }
    /**
     * Identifier of the provisioning artifact. For example, `pa-4abcdjnxjj6ne`. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
     * 
     */
    @Export(name="provisioningArtifactId", refs={String.class}, tree="[0]")
    private Output<String> provisioningArtifactId;

    /**
     * @return Identifier of the provisioning artifact. For example, `pa-4abcdjnxjj6ne`. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
     * 
     */
    public Output<String> provisioningArtifactId() {
        return this.provisioningArtifactId;
    }
    /**
     * Name of the provisioning artifact. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
     * 
     */
    @Export(name="provisioningArtifactName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> provisioningArtifactName;

    /**
     * @return Name of the provisioning artifact. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
     * 
     */
    public Output<Optional<String>> provisioningArtifactName() {
        return Codegen.optional(this.provisioningArtifactName);
    }
    /**
     * Configuration block with parameters specified by the administrator that are required for provisioning the product. See details below.
     * 
     */
    @Export(name="provisioningParameters", refs={List.class,ProvisionedProductProvisioningParameter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ProvisionedProductProvisioningParameter>> provisioningParameters;

    /**
     * @return Configuration block with parameters specified by the administrator that are required for provisioning the product. See details below.
     * 
     */
    public Output<Optional<List<ProvisionedProductProvisioningParameter>>> provisioningParameters() {
        return Codegen.optional(this.provisioningParameters);
    }
    /**
     * _Only applies to deleting._ Whether to delete the Service Catalog provisioned product but leave the CloudFormation stack, stack set, or the underlying resources of the deleted provisioned product. The default value is `false`.
     * 
     */
    @Export(name="retainPhysicalResources", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> retainPhysicalResources;

    /**
     * @return _Only applies to deleting._ Whether to delete the Service Catalog provisioned product but leave the CloudFormation stack, stack set, or the underlying resources of the deleted provisioned product. The default value is `false`.
     * 
     */
    public Output<Optional<Boolean>> retainPhysicalResources() {
        return Codegen.optional(this.retainPhysicalResources);
    }
    /**
     * Configuration block with information about the provisioning preferences for a stack set. See details below.
     * 
     */
    @Export(name="stackSetProvisioningPreferences", refs={ProvisionedProductStackSetProvisioningPreferences.class}, tree="[0]")
    private Output</* @Nullable */ ProvisionedProductStackSetProvisioningPreferences> stackSetProvisioningPreferences;

    /**
     * @return Configuration block with information about the provisioning preferences for a stack set. See details below.
     * 
     */
    public Output<Optional<ProvisionedProductStackSetProvisioningPreferences>> stackSetProvisioningPreferences() {
        return Codegen.optional(this.stackSetProvisioningPreferences);
    }
    /**
     * Current status of the provisioned product. See meanings below.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Current status of the provisioned product. See meanings below.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Current status message of the provisioned product.
     * 
     */
    @Export(name="statusMessage", refs={String.class}, tree="[0]")
    private Output<String> statusMessage;

    /**
     * @return Current status message of the provisioned product.
     * 
     */
    public Output<String> statusMessage() {
        return this.statusMessage;
    }
    /**
     * Tags to apply to the provisioned product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the provisioned product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
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
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Type of provisioned product. Valid values are `CFN_STACK` and `CFN_STACKSET`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of provisioned product. Valid values are `CFN_STACK` and `CFN_STACKSET`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProvisionedProduct(String name) {
        this(name, ProvisionedProductArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProvisionedProduct(String name, @Nullable ProvisionedProductArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProvisionedProduct(String name, @Nullable ProvisionedProductArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/provisionedProduct:ProvisionedProduct", name, args == null ? ProvisionedProductArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProvisionedProduct(String name, Output<String> id, @Nullable ProvisionedProductState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/provisionedProduct:ProvisionedProduct", name, state, makeResourceOptions(options, id));
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
    public static ProvisionedProduct get(String name, Output<String> id, @Nullable ProvisionedProductState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProvisionedProduct(name, id, state, options);
    }
}
