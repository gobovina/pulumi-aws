// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an Athena data catalog.
 *
 * More information about Athena and Athena data catalogs can be found in the [Athena User Guide](https://docs.aws.amazon.com/athena/latest/ug/what-is.html).
 *
 * > **Tip:** for a more detailed explanation on the usage of `parameters`, see the [DataCatalog API documentation](https://docs.aws.amazon.com/athena/latest/APIReference/API_DataCatalog.html)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.athena.DataCatalog("example", {
 *     description: "Example Athena data catalog",
 *     parameters: {
 *         "function": "arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function",
 *     },
 *     tags: {
 *         Name: "example-athena-data-catalog",
 *     },
 *     type: "LAMBDA",
 * });
 * ```
 * ### Hive based Data Catalog
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.athena.DataCatalog("example", {
 *     description: "Hive based Data Catalog",
 *     parameters: {
 *         "metadata-function": "arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function",
 *     },
 *     type: "HIVE",
 * });
 * ```
 * ### Glue based Data Catalog
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.athena.DataCatalog("example", {
 *     description: "Glue based Data Catalog",
 *     parameters: {
 *         "catalog-id": "123456789012",
 *     },
 *     type: "GLUE",
 * });
 * ```
 * ### Lambda based Data Catalog
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.athena.DataCatalog("example", {
 *     description: "Lambda based Data Catalog",
 *     parameters: {
 *         "metadata-function": "arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function-1",
 *         "record-function": "arn:aws:lambda:eu-central-1:123456789012:function:not-important-lambda-function-2",
 *     },
 *     type: "LAMBDA",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import data catalogs using their `name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:athena/dataCatalog:DataCatalog example example-data-catalog
 * ```
 */
export class DataCatalog extends pulumi.CustomResource {
    /**
     * Get an existing DataCatalog resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DataCatalogState, opts?: pulumi.CustomResourceOptions): DataCatalog {
        return new DataCatalog(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:athena/dataCatalog:DataCatalog';

    /**
     * Returns true if the given object is an instance of DataCatalog.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DataCatalog {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DataCatalog.__pulumiType;
    }

    /**
     * ARN of the data catalog.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Description of the data catalog.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Key value pairs that specifies the Lambda function or functions to use for the data catalog. The mapping used depends on the catalog type.
     */
    public readonly parameters!: pulumi.Output<{[key: string]: string}>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or `HIVE` for an external hive metastore.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a DataCatalog resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DataCatalogArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DataCatalogArgs | DataCatalogState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DataCatalogState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as DataCatalogArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.parameters === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parameters'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DataCatalog.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DataCatalog resources.
 */
export interface DataCatalogState {
    /**
     * ARN of the data catalog.
     */
    arn?: pulumi.Input<string>;
    /**
     * Description of the data catalog.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     */
    name?: pulumi.Input<string>;
    /**
     * Key value pairs that specifies the Lambda function or functions to use for the data catalog. The mapping used depends on the catalog type.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or `HIVE` for an external hive metastore.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DataCatalog resource.
 */
export interface DataCatalogArgs {
    /**
     * Description of the data catalog.
     */
    description: pulumi.Input<string>;
    /**
     * Name of the data catalog. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     */
    name?: pulumi.Input<string>;
    /**
     * Key value pairs that specifies the Lambda function or functions to use for the data catalog. The mapping used depends on the catalog type.
     */
    parameters: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or `HIVE` for an external hive metastore.
     */
    type: pulumi.Input<string>;
}
