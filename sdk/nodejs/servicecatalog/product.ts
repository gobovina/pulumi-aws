// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages a Service Catalog Product.
 *
 * > **NOTE:** The user or role that uses this resources must have the `cloudformation:GetTemplate` IAM policy permission. This policy permission is required when using the `templatePhysicalId` argument.
 *
 * > A "provisioning artifact" is also referred to as a "version." A "distributor" is also referred to as a "vendor."
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.servicecatalog.Product("example", {
 *     name: "example",
 *     owner: "example-owner",
 *     type: "CLOUD_FORMATION_TEMPLATE",
 *     provisioningArtifactParameters: {
 *         templateUrl: "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/temp1.json",
 *     },
 *     tags: {
 *         foo: "bar",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_servicecatalog_product` using the product ID. For example:
 *
 * ```sh
 * $ pulumi import aws:servicecatalog/product:Product example prod-dnigbtea24ste
 * ```
 */
export class Product extends pulumi.CustomResource {
    /**
     * Get an existing Product resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProductState, opts?: pulumi.CustomResourceOptions): Product {
        return new Product(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:servicecatalog/product:Product';

    /**
     * Returns true if the given object is an instance of Product.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Product {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Product.__pulumiType;
    }

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     */
    public readonly acceptLanguage!: pulumi.Output<string | undefined>;
    /**
     * ARN of the product.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Time when the product was created.
     */
    public /*out*/ readonly createdTime!: pulumi.Output<string>;
    /**
     * Description of the product.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Distributor (i.e., vendor) of the product.
     */
    public readonly distributor!: pulumi.Output<string>;
    /**
     * Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
     */
    public /*out*/ readonly hasDefaultPath!: pulumi.Output<boolean>;
    /**
     * Name of the product.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Owner of the product.
     */
    public readonly owner!: pulumi.Output<string>;
    /**
     * Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
     */
    public readonly provisioningArtifactParameters!: pulumi.Output<outputs.servicecatalog.ProductProvisioningArtifactParameters>;
    /**
     * Status of the product.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Support information about the product.
     */
    public readonly supportDescription!: pulumi.Output<string>;
    /**
     * Contact email for product support.
     */
    public readonly supportEmail!: pulumi.Output<string>;
    /**
     * Contact URL for product support.
     */
    public readonly supportUrl!: pulumi.Output<string>;
    /**
     * Tags to apply to the product. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
     *
     * The following arguments are optional:
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a Product resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProductArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProductArgs | ProductState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProductState | undefined;
            resourceInputs["acceptLanguage"] = state ? state.acceptLanguage : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["createdTime"] = state ? state.createdTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["distributor"] = state ? state.distributor : undefined;
            resourceInputs["hasDefaultPath"] = state ? state.hasDefaultPath : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["owner"] = state ? state.owner : undefined;
            resourceInputs["provisioningArtifactParameters"] = state ? state.provisioningArtifactParameters : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["supportDescription"] = state ? state.supportDescription : undefined;
            resourceInputs["supportEmail"] = state ? state.supportEmail : undefined;
            resourceInputs["supportUrl"] = state ? state.supportUrl : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as ProductArgs | undefined;
            if ((!args || args.owner === undefined) && !opts.urn) {
                throw new Error("Missing required property 'owner'");
            }
            if ((!args || args.provisioningArtifactParameters === undefined) && !opts.urn) {
                throw new Error("Missing required property 'provisioningArtifactParameters'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["acceptLanguage"] = args ? args.acceptLanguage : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["distributor"] = args ? args.distributor : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["owner"] = args ? args.owner : undefined;
            resourceInputs["provisioningArtifactParameters"] = args ? args.provisioningArtifactParameters : undefined;
            resourceInputs["supportDescription"] = args ? args.supportDescription : undefined;
            resourceInputs["supportEmail"] = args ? args.supportEmail : undefined;
            resourceInputs["supportUrl"] = args ? args.supportUrl : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdTime"] = undefined /*out*/;
            resourceInputs["hasDefaultPath"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Product.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Product resources.
 */
export interface ProductState {
    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     */
    acceptLanguage?: pulumi.Input<string>;
    /**
     * ARN of the product.
     */
    arn?: pulumi.Input<string>;
    /**
     * Time when the product was created.
     */
    createdTime?: pulumi.Input<string>;
    /**
     * Description of the product.
     */
    description?: pulumi.Input<string>;
    /**
     * Distributor (i.e., vendor) of the product.
     */
    distributor?: pulumi.Input<string>;
    /**
     * Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
     */
    hasDefaultPath?: pulumi.Input<boolean>;
    /**
     * Name of the product.
     */
    name?: pulumi.Input<string>;
    /**
     * Owner of the product.
     */
    owner?: pulumi.Input<string>;
    /**
     * Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
     */
    provisioningArtifactParameters?: pulumi.Input<inputs.servicecatalog.ProductProvisioningArtifactParameters>;
    /**
     * Status of the product.
     */
    status?: pulumi.Input<string>;
    /**
     * Support information about the product.
     */
    supportDescription?: pulumi.Input<string>;
    /**
     * Contact email for product support.
     */
    supportEmail?: pulumi.Input<string>;
    /**
     * Contact URL for product support.
     */
    supportUrl?: pulumi.Input<string>;
    /**
     * Tags to apply to the product. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
     *
     * The following arguments are optional:
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Product resource.
 */
export interface ProductArgs {
    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     */
    acceptLanguage?: pulumi.Input<string>;
    /**
     * Description of the product.
     */
    description?: pulumi.Input<string>;
    /**
     * Distributor (i.e., vendor) of the product.
     */
    distributor?: pulumi.Input<string>;
    /**
     * Name of the product.
     */
    name?: pulumi.Input<string>;
    /**
     * Owner of the product.
     */
    owner: pulumi.Input<string>;
    /**
     * Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
     */
    provisioningArtifactParameters: pulumi.Input<inputs.servicecatalog.ProductProvisioningArtifactParameters>;
    /**
     * Support information about the product.
     */
    supportDescription?: pulumi.Input<string>;
    /**
     * Contact email for product support.
     */
    supportEmail?: pulumi.Input<string>;
    /**
     * Contact URL for product support.
     */
    supportUrl?: pulumi.Input<string>;
    /**
     * Tags to apply to the product. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
     *
     * The following arguments are optional:
     */
    type: pulumi.Input<string>;
}
