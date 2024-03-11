// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Amazon Kendra Index resource.
 *
 * ## Example Usage
 *
 * ### Basic
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kendra.Index("example", {
 *     name: "example",
 *     description: "example",
 *     edition: "DEVELOPER_EDITION",
 *     roleArn: _this.arn,
 *     tags: {
 *         Key1: "Value1",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### With capacity units
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kendra.Index("example", {
 *     name: "example",
 *     edition: "DEVELOPER_EDITION",
 *     roleArn: _this.arn,
 *     capacityUnits: {
 *         queryCapacityUnits: 2,
 *         storageCapacityUnits: 2,
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### With server side encryption configuration
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kendra.Index("example", {
 *     name: "example",
 *     roleArn: thisAwsIamRole.arn,
 *     serverSideEncryptionConfiguration: {
 *         kmsKeyId: _this.arn,
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### With user group resolution configuration
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kendra.Index("example", {
 *     name: "example",
 *     roleArn: _this.arn,
 *     userGroupResolutionConfiguration: {
 *         userGroupResolutionMode: "AWS_SSO",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### With Document Metadata Configuration Updates
 *
 * ### Specifying the predefined elements
 *
 * Refer to [Amazon Kendra documentation on built-in document fields](https://docs.aws.amazon.com/kendra/latest/dg/hiw-index.html#index-reserved-fields) for more information.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kendra.Index("example", {
 *     name: "example",
 *     roleArn: _this.arn,
 *     documentMetadataConfigurationUpdates: [
 *         {
 *             name: "_authors",
 *             type: "STRING_LIST_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: false,
 *             },
 *             relevance: {
 *                 importance: 1,
 *             },
 *         },
 *         {
 *             name: "_category",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_created_at",
 *             type: "DATE_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 freshness: false,
 *                 importance: 1,
 *                 duration: "25920000s",
 *                 rankOrder: "ASCENDING",
 *             },
 *         },
 *         {
 *             name: "_data_source_id",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_document_title",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: true,
 *                 facetable: false,
 *                 searchable: true,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 2,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_excerpt_page_number",
 *             type: "LONG_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: false,
 *             },
 *             relevance: {
 *                 importance: 2,
 *                 rankOrder: "ASCENDING",
 *             },
 *         },
 *         {
 *             name: "_faq_id",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_file_type",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_language_code",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_last_updated_at",
 *             type: "DATE_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 freshness: false,
 *                 importance: 1,
 *                 duration: "25920000s",
 *                 rankOrder: "ASCENDING",
 *             },
 *         },
 *         {
 *             name: "_source_uri",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: true,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: false,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_tenant_id",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_version",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_view_count",
 *             type: "LONG_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 rankOrder: "ASCENDING",
 *             },
 *         },
 *     ],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Appending additional elements
 *
 * The example below shows additional elements with names, `example-string-value`, `example-long-value`, `example-string-list-value`, `example-date-value` representing the 4 types of `STRING_VALUE`, `LONG_VALUE`, `STRING_LIST_VALUE`, `DATE_VALUE` respectively.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kendra.Index("example", {
 *     name: "example",
 *     roleArn: _this.arn,
 *     documentMetadataConfigurationUpdates: [
 *         {
 *             name: "_authors",
 *             type: "STRING_LIST_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: false,
 *             },
 *             relevance: {
 *                 importance: 1,
 *             },
 *         },
 *         {
 *             name: "_category",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_created_at",
 *             type: "DATE_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 freshness: false,
 *                 importance: 1,
 *                 duration: "25920000s",
 *                 rankOrder: "ASCENDING",
 *             },
 *         },
 *         {
 *             name: "_data_source_id",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_document_title",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: true,
 *                 facetable: false,
 *                 searchable: true,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 2,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_excerpt_page_number",
 *             type: "LONG_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: false,
 *             },
 *             relevance: {
 *                 importance: 2,
 *                 rankOrder: "ASCENDING",
 *             },
 *         },
 *         {
 *             name: "_faq_id",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_file_type",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_language_code",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_last_updated_at",
 *             type: "DATE_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 freshness: false,
 *                 importance: 1,
 *                 duration: "25920000s",
 *                 rankOrder: "ASCENDING",
 *             },
 *         },
 *         {
 *             name: "_source_uri",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: true,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: false,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_tenant_id",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_version",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "_view_count",
 *             type: "LONG_VALUE",
 *             search: {
 *                 displayable: false,
 *                 facetable: false,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 rankOrder: "ASCENDING",
 *             },
 *         },
 *         {
 *             name: "example-string-value",
 *             type: "STRING_VALUE",
 *             search: {
 *                 displayable: true,
 *                 facetable: true,
 *                 searchable: true,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 valuesImportanceMap: {},
 *             },
 *         },
 *         {
 *             name: "example-long-value",
 *             type: "LONG_VALUE",
 *             search: {
 *                 displayable: true,
 *                 facetable: true,
 *                 searchable: false,
 *                 sortable: true,
 *             },
 *             relevance: {
 *                 importance: 1,
 *                 rankOrder: "ASCENDING",
 *             },
 *         },
 *         {
 *             name: "example-string-list-value",
 *             type: "STRING_LIST_VALUE",
 *             search: {
 *                 displayable: true,
 *                 facetable: true,
 *                 searchable: true,
 *                 sortable: false,
 *             },
 *             relevance: {
 *                 importance: 1,
 *             },
 *         },
 *         {
 *             name: "example-date-value",
 *             type: "DATE_VALUE",
 *             search: {
 *                 displayable: true,
 *                 facetable: true,
 *                 searchable: false,
 *                 sortable: false,
 *             },
 *             relevance: {
 *                 freshness: false,
 *                 importance: 1,
 *                 duration: "25920000s",
 *                 rankOrder: "ASCENDING",
 *             },
 *         },
 *     ],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### With JSON token type configuration
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kendra.Index("example", {
 *     name: "example",
 *     roleArn: _this.arn,
 *     userTokenConfigurations: {
 *         jsonTokenTypeConfiguration: {
 *             groupAttributeField: "groups",
 *             userNameAttributeField: "username",
 *         },
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Amazon Kendra Indexes using its `id`. For example:
 *
 * ```sh
 * $ pulumi import aws:kendra/index:Index example 12345678-1234-5678-9123-123456789123
 * ```
 */
export class Index extends pulumi.CustomResource {
    /**
     * Get an existing Index resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IndexState, opts?: pulumi.CustomResourceOptions): Index {
        return new Index(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:kendra/index:Index';

    /**
     * Returns true if the given object is an instance of Index.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Index {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Index.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the Index.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A block that sets the number of additional document storage and query capacity units that should be used by the index. Detailed below.
     */
    public readonly capacityUnits!: pulumi.Output<outputs.kendra.IndexCapacityUnits>;
    /**
     * The Unix datetime that the index was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The description of the Index.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * One or more blocks that specify the configuration settings for any metadata applied to the documents in the index. Minimum number of 0 items. Maximum number of 500 items. If specified, you must define all elements, including those that are provided by default. These index fields are documented at [Amazon Kendra Index documentation](https://docs.aws.amazon.com/kendra/latest/dg/hiw-index.html). For an example resource that defines these default index fields, refer to the default example above. For an example resource that appends additional index fields, refer to the append example above. All arguments for each block must be specified. Note that blocks cannot be removed since index fields cannot be deleted. This argument is detailed below.
     */
    public readonly documentMetadataConfigurationUpdates!: pulumi.Output<outputs.kendra.IndexDocumentMetadataConfigurationUpdate[]>;
    /**
     * The Amazon Kendra edition to use for the index. Choose `DEVELOPER_EDITION` for indexes intended for development, testing, or proof of concept. Use `ENTERPRISE_EDITION` for your production databases. Once you set the edition for an index, it can't be changed. Defaults to `ENTERPRISE_EDITION`
     */
    public readonly edition!: pulumi.Output<string | undefined>;
    /**
     * When the Status field value is `FAILED`, this contains a message that explains why.
     */
    public /*out*/ readonly errorMessage!: pulumi.Output<string>;
    /**
     * A block that provides information about the number of FAQ questions and answers and the number of text documents indexed. Detailed below.
     */
    public /*out*/ readonly indexStatistics!: pulumi.Output<outputs.kendra.IndexIndexStatistic[]>;
    /**
     * Specifies the name of the Index.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and metrics. This is also the role you use when you call the `BatchPutDocument` API to index documents from an Amazon S3 bucket.
     */
    public readonly roleArn!: pulumi.Output<string>;
    /**
     * A block that specifies the identifier of the AWS KMS customer managed key (CMK) that's used to encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't support asymmetric CMKs. Detailed below.
     */
    public readonly serverSideEncryptionConfiguration!: pulumi.Output<outputs.kendra.IndexServerSideEncryptionConfiguration | undefined>;
    /**
     * The current status of the index. When the value is `ACTIVE`, the index is ready for use. If the Status field value is `FAILED`, the `errorMessage` field contains a message that explains why.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Tags to apply to the Index. If configured with a provider
     * `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The Unix datetime that the index was last updated.
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;
    /**
     * The user context policy. Valid values are `ATTRIBUTE_FILTER` or `USER_TOKEN`. For more information, refer to [UserContextPolicy](https://docs.aws.amazon.com/kendra/latest/APIReference/API_CreateIndex.html#kendra-CreateIndex-request-UserContextPolicy). Defaults to `ATTRIBUTE_FILTER`.
     */
    public readonly userContextPolicy!: pulumi.Output<string | undefined>;
    /**
     * A block that enables fetching access levels of groups and users from an AWS Single Sign-On identity source. To configure this, see [UserGroupResolutionConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_UserGroupResolutionConfiguration.html). Detailed below.
     */
    public readonly userGroupResolutionConfiguration!: pulumi.Output<outputs.kendra.IndexUserGroupResolutionConfiguration | undefined>;
    /**
     * A block that specifies the user token configuration. Detailed below.
     */
    public readonly userTokenConfigurations!: pulumi.Output<outputs.kendra.IndexUserTokenConfigurations | undefined>;

    /**
     * Create a Index resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IndexArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IndexArgs | IndexState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IndexState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["capacityUnits"] = state ? state.capacityUnits : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["documentMetadataConfigurationUpdates"] = state ? state.documentMetadataConfigurationUpdates : undefined;
            resourceInputs["edition"] = state ? state.edition : undefined;
            resourceInputs["errorMessage"] = state ? state.errorMessage : undefined;
            resourceInputs["indexStatistics"] = state ? state.indexStatistics : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["roleArn"] = state ? state.roleArn : undefined;
            resourceInputs["serverSideEncryptionConfiguration"] = state ? state.serverSideEncryptionConfiguration : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
            resourceInputs["userContextPolicy"] = state ? state.userContextPolicy : undefined;
            resourceInputs["userGroupResolutionConfiguration"] = state ? state.userGroupResolutionConfiguration : undefined;
            resourceInputs["userTokenConfigurations"] = state ? state.userTokenConfigurations : undefined;
        } else {
            const args = argsOrState as IndexArgs | undefined;
            if ((!args || args.roleArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleArn'");
            }
            resourceInputs["capacityUnits"] = args ? args.capacityUnits : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["documentMetadataConfigurationUpdates"] = args ? args.documentMetadataConfigurationUpdates : undefined;
            resourceInputs["edition"] = args ? args.edition : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["roleArn"] = args ? args.roleArn : undefined;
            resourceInputs["serverSideEncryptionConfiguration"] = args ? args.serverSideEncryptionConfiguration : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["userContextPolicy"] = args ? args.userContextPolicy : undefined;
            resourceInputs["userGroupResolutionConfiguration"] = args ? args.userGroupResolutionConfiguration : undefined;
            resourceInputs["userTokenConfigurations"] = args ? args.userTokenConfigurations : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["errorMessage"] = undefined /*out*/;
            resourceInputs["indexStatistics"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Index.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Index resources.
 */
export interface IndexState {
    /**
     * The Amazon Resource Name (ARN) of the Index.
     */
    arn?: pulumi.Input<string>;
    /**
     * A block that sets the number of additional document storage and query capacity units that should be used by the index. Detailed below.
     */
    capacityUnits?: pulumi.Input<inputs.kendra.IndexCapacityUnits>;
    /**
     * The Unix datetime that the index was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * The description of the Index.
     */
    description?: pulumi.Input<string>;
    /**
     * One or more blocks that specify the configuration settings for any metadata applied to the documents in the index. Minimum number of 0 items. Maximum number of 500 items. If specified, you must define all elements, including those that are provided by default. These index fields are documented at [Amazon Kendra Index documentation](https://docs.aws.amazon.com/kendra/latest/dg/hiw-index.html). For an example resource that defines these default index fields, refer to the default example above. For an example resource that appends additional index fields, refer to the append example above. All arguments for each block must be specified. Note that blocks cannot be removed since index fields cannot be deleted. This argument is detailed below.
     */
    documentMetadataConfigurationUpdates?: pulumi.Input<pulumi.Input<inputs.kendra.IndexDocumentMetadataConfigurationUpdate>[]>;
    /**
     * The Amazon Kendra edition to use for the index. Choose `DEVELOPER_EDITION` for indexes intended for development, testing, or proof of concept. Use `ENTERPRISE_EDITION` for your production databases. Once you set the edition for an index, it can't be changed. Defaults to `ENTERPRISE_EDITION`
     */
    edition?: pulumi.Input<string>;
    /**
     * When the Status field value is `FAILED`, this contains a message that explains why.
     */
    errorMessage?: pulumi.Input<string>;
    /**
     * A block that provides information about the number of FAQ questions and answers and the number of text documents indexed. Detailed below.
     */
    indexStatistics?: pulumi.Input<pulumi.Input<inputs.kendra.IndexIndexStatistic>[]>;
    /**
     * Specifies the name of the Index.
     */
    name?: pulumi.Input<string>;
    /**
     * An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and metrics. This is also the role you use when you call the `BatchPutDocument` API to index documents from an Amazon S3 bucket.
     */
    roleArn?: pulumi.Input<string>;
    /**
     * A block that specifies the identifier of the AWS KMS customer managed key (CMK) that's used to encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't support asymmetric CMKs. Detailed below.
     */
    serverSideEncryptionConfiguration?: pulumi.Input<inputs.kendra.IndexServerSideEncryptionConfiguration>;
    /**
     * The current status of the index. When the value is `ACTIVE`, the index is ready for use. If the Status field value is `FAILED`, the `errorMessage` field contains a message that explains why.
     */
    status?: pulumi.Input<string>;
    /**
     * Tags to apply to the Index. If configured with a provider
     * `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Unix datetime that the index was last updated.
     */
    updatedAt?: pulumi.Input<string>;
    /**
     * The user context policy. Valid values are `ATTRIBUTE_FILTER` or `USER_TOKEN`. For more information, refer to [UserContextPolicy](https://docs.aws.amazon.com/kendra/latest/APIReference/API_CreateIndex.html#kendra-CreateIndex-request-UserContextPolicy). Defaults to `ATTRIBUTE_FILTER`.
     */
    userContextPolicy?: pulumi.Input<string>;
    /**
     * A block that enables fetching access levels of groups and users from an AWS Single Sign-On identity source. To configure this, see [UserGroupResolutionConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_UserGroupResolutionConfiguration.html). Detailed below.
     */
    userGroupResolutionConfiguration?: pulumi.Input<inputs.kendra.IndexUserGroupResolutionConfiguration>;
    /**
     * A block that specifies the user token configuration. Detailed below.
     */
    userTokenConfigurations?: pulumi.Input<inputs.kendra.IndexUserTokenConfigurations>;
}

/**
 * The set of arguments for constructing a Index resource.
 */
export interface IndexArgs {
    /**
     * A block that sets the number of additional document storage and query capacity units that should be used by the index. Detailed below.
     */
    capacityUnits?: pulumi.Input<inputs.kendra.IndexCapacityUnits>;
    /**
     * The description of the Index.
     */
    description?: pulumi.Input<string>;
    /**
     * One or more blocks that specify the configuration settings for any metadata applied to the documents in the index. Minimum number of 0 items. Maximum number of 500 items. If specified, you must define all elements, including those that are provided by default. These index fields are documented at [Amazon Kendra Index documentation](https://docs.aws.amazon.com/kendra/latest/dg/hiw-index.html). For an example resource that defines these default index fields, refer to the default example above. For an example resource that appends additional index fields, refer to the append example above. All arguments for each block must be specified. Note that blocks cannot be removed since index fields cannot be deleted. This argument is detailed below.
     */
    documentMetadataConfigurationUpdates?: pulumi.Input<pulumi.Input<inputs.kendra.IndexDocumentMetadataConfigurationUpdate>[]>;
    /**
     * The Amazon Kendra edition to use for the index. Choose `DEVELOPER_EDITION` for indexes intended for development, testing, or proof of concept. Use `ENTERPRISE_EDITION` for your production databases. Once you set the edition for an index, it can't be changed. Defaults to `ENTERPRISE_EDITION`
     */
    edition?: pulumi.Input<string>;
    /**
     * Specifies the name of the Index.
     */
    name?: pulumi.Input<string>;
    /**
     * An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access your Amazon CloudWatch logs and metrics. This is also the role you use when you call the `BatchPutDocument` API to index documents from an Amazon S3 bucket.
     */
    roleArn: pulumi.Input<string>;
    /**
     * A block that specifies the identifier of the AWS KMS customer managed key (CMK) that's used to encrypt data indexed by Amazon Kendra. Amazon Kendra doesn't support asymmetric CMKs. Detailed below.
     */
    serverSideEncryptionConfiguration?: pulumi.Input<inputs.kendra.IndexServerSideEncryptionConfiguration>;
    /**
     * Tags to apply to the Index. If configured with a provider
     * `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The user context policy. Valid values are `ATTRIBUTE_FILTER` or `USER_TOKEN`. For more information, refer to [UserContextPolicy](https://docs.aws.amazon.com/kendra/latest/APIReference/API_CreateIndex.html#kendra-CreateIndex-request-UserContextPolicy). Defaults to `ATTRIBUTE_FILTER`.
     */
    userContextPolicy?: pulumi.Input<string>;
    /**
     * A block that enables fetching access levels of groups and users from an AWS Single Sign-On identity source. To configure this, see [UserGroupResolutionConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_UserGroupResolutionConfiguration.html). Detailed below.
     */
    userGroupResolutionConfiguration?: pulumi.Input<inputs.kendra.IndexUserGroupResolutionConfiguration>;
    /**
     * A block that specifies the user token configuration. Detailed below.
     */
    userTokenConfigurations?: pulumi.Input<inputs.kendra.IndexUserTokenConfigurations>;
}
