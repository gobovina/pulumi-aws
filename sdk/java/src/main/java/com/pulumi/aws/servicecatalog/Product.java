// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.servicecatalog.ProductArgs;
import com.pulumi.aws.servicecatalog.inputs.ProductState;
import com.pulumi.aws.servicecatalog.outputs.ProductProvisioningArtifactParameters;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Service Catalog Product.
 * 
 * &gt; **NOTE:** The user or role that uses this resources must have the `cloudformation:GetTemplate` IAM policy permission. This policy permission is required when using the `template_physical_id` argument.
 * 
 * &gt; A &#34;provisioning artifact&#34; is also referred to as a &#34;version.&#34; A &#34;distributor&#34; is also referred to as a &#34;vendor.&#34;
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.servicecatalog.Product;
 * import com.pulumi.aws.servicecatalog.ProductArgs;
 * import com.pulumi.aws.servicecatalog.inputs.ProductProvisioningArtifactParametersArgs;
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
 *         var example = new Product(&#34;example&#34;, ProductArgs.builder()        
 *             .owner(&#34;example-owner&#34;)
 *             .provisioningArtifactParameters(ProductProvisioningArtifactParametersArgs.builder()
 *                 .templateUrl(&#34;https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/temp1.json&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .type(&#34;CLOUD_FORMATION_TEMPLATE&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_servicecatalog_product` using the product ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:servicecatalog/product:Product example prod-dnigbtea24ste
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/product:Product")
public class Product extends com.pulumi.resources.CustomResource {
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
     * ARN of the product.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the product.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Time when the product was created.
     * 
     */
    @Export(name="createdTime", refs={String.class}, tree="[0]")
    private Output<String> createdTime;

    /**
     * @return Time when the product was created.
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * Description of the product.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Description of the product.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Distributor (i.e., vendor) of the product.
     * 
     */
    @Export(name="distributor", refs={String.class}, tree="[0]")
    private Output<String> distributor;

    /**
     * @return Distributor (i.e., vendor) of the product.
     * 
     */
    public Output<String> distributor() {
        return this.distributor;
    }
    /**
     * Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
     * 
     */
    @Export(name="hasDefaultPath", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> hasDefaultPath;

    /**
     * @return Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
     * 
     */
    public Output<Boolean> hasDefaultPath() {
        return this.hasDefaultPath;
    }
    /**
     * Name of the product.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the product.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Owner of the product.
     * 
     */
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output<String> owner;

    /**
     * @return Owner of the product.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
     * 
     */
    @Export(name="provisioningArtifactParameters", refs={ProductProvisioningArtifactParameters.class}, tree="[0]")
    private Output<ProductProvisioningArtifactParameters> provisioningArtifactParameters;

    /**
     * @return Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
     * 
     */
    public Output<ProductProvisioningArtifactParameters> provisioningArtifactParameters() {
        return this.provisioningArtifactParameters;
    }
    /**
     * Status of the product.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the product.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Support information about the product.
     * 
     */
    @Export(name="supportDescription", refs={String.class}, tree="[0]")
    private Output<String> supportDescription;

    /**
     * @return Support information about the product.
     * 
     */
    public Output<String> supportDescription() {
        return this.supportDescription;
    }
    /**
     * Contact email for product support.
     * 
     */
    @Export(name="supportEmail", refs={String.class}, tree="[0]")
    private Output<String> supportEmail;

    /**
     * @return Contact email for product support.
     * 
     */
    public Output<String> supportEmail() {
        return this.supportEmail;
    }
    /**
     * Contact URL for product support.
     * 
     */
    @Export(name="supportUrl", refs={String.class}, tree="[0]")
    private Output<String> supportUrl;

    /**
     * @return Contact URL for product support.
     * 
     */
    public Output<String> supportUrl() {
        return this.supportUrl;
    }
    /**
     * Tags to apply to the product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Product(String name) {
        this(name, ProductArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Product(String name, ProductArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Product(String name, ProductArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/product:Product", name, args == null ? ProductArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Product(String name, Output<String> id, @Nullable ProductState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/product:Product", name, state, makeResourceOptions(options, id));
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
    public static Product get(String name, Output<String> id, @Nullable ProductState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Product(name, id, state, options);
    }
}
