// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Use the `awsKendraIndexBlockList` resource to manage an AWS Kendra block list used for query suggestions for an index.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kendra.QuerySuggestionsBlockList("example", {
 *     indexId: exampleAwsKendraIndex.id,
 *     name: "Example",
 *     roleArn: exampleAwsIamRole.arn,
 *     sourceS3Path: {
 *         bucket: exampleAwsS3Bucket.id,
 *         key: "example/suggestions.txt",
 *     },
 *     tags: {
 *         Name: "Example Kendra Index",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import the `aws_kendra_query_suggestions_block_list` resource using the unique identifiers of the block list and index separated by a slash (`/`). For example:
 *
 * ```sh
 *  $ pulumi import aws:kendra/querySuggestionsBlockList:QuerySuggestionsBlockList example blocklist-123456780/idx-8012925589
 * ```
 */
export class QuerySuggestionsBlockList extends pulumi.CustomResource {
    /**
     * Get an existing QuerySuggestionsBlockList resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: QuerySuggestionsBlockListState, opts?: pulumi.CustomResourceOptions): QuerySuggestionsBlockList {
        return new QuerySuggestionsBlockList(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:kendra/querySuggestionsBlockList:QuerySuggestionsBlockList';

    /**
     * Returns true if the given object is an instance of QuerySuggestionsBlockList.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is QuerySuggestionsBlockList {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === QuerySuggestionsBlockList.__pulumiType;
    }

    /**
     * ARN of the block list.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Description for a block list.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Identifier of the index for a block list.
     */
    public readonly indexId!: pulumi.Output<string>;
    /**
     * Name for the block list.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Unique identifier of the block list.
     */
    public /*out*/ readonly querySuggestionsBlockListId!: pulumi.Output<string>;
    /**
     * IAM (Identity and Access Management) role used to access the block list text file in S3.
     */
    public readonly roleArn!: pulumi.Output<string>;
    /**
     * S3 path where your block list text file is located. See details below.
     *
     * The `sourceS3Path` configuration block supports the following arguments:
     */
    public readonly sourceS3Path!: pulumi.Output<outputs.kendra.QuerySuggestionsBlockListSourceS3Path>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider's defaultTags configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a QuerySuggestionsBlockList resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: QuerySuggestionsBlockListArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: QuerySuggestionsBlockListArgs | QuerySuggestionsBlockListState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as QuerySuggestionsBlockListState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["indexId"] = state ? state.indexId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["querySuggestionsBlockListId"] = state ? state.querySuggestionsBlockListId : undefined;
            resourceInputs["roleArn"] = state ? state.roleArn : undefined;
            resourceInputs["sourceS3Path"] = state ? state.sourceS3Path : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as QuerySuggestionsBlockListArgs | undefined;
            if ((!args || args.indexId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'indexId'");
            }
            if ((!args || args.roleArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleArn'");
            }
            if ((!args || args.sourceS3Path === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceS3Path'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["indexId"] = args ? args.indexId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["roleArn"] = args ? args.roleArn : undefined;
            resourceInputs["sourceS3Path"] = args ? args.sourceS3Path : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["querySuggestionsBlockListId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(QuerySuggestionsBlockList.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering QuerySuggestionsBlockList resources.
 */
export interface QuerySuggestionsBlockListState {
    /**
     * ARN of the block list.
     */
    arn?: pulumi.Input<string>;
    /**
     * Description for a block list.
     */
    description?: pulumi.Input<string>;
    /**
     * Identifier of the index for a block list.
     */
    indexId?: pulumi.Input<string>;
    /**
     * Name for the block list.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the block list.
     */
    querySuggestionsBlockListId?: pulumi.Input<string>;
    /**
     * IAM (Identity and Access Management) role used to access the block list text file in S3.
     */
    roleArn?: pulumi.Input<string>;
    /**
     * S3 path where your block list text file is located. See details below.
     *
     * The `sourceS3Path` configuration block supports the following arguments:
     */
    sourceS3Path?: pulumi.Input<inputs.kendra.QuerySuggestionsBlockListSourceS3Path>;
    status?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider's defaultTags configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a QuerySuggestionsBlockList resource.
 */
export interface QuerySuggestionsBlockListArgs {
    /**
     * Description for a block list.
     */
    description?: pulumi.Input<string>;
    /**
     * Identifier of the index for a block list.
     */
    indexId: pulumi.Input<string>;
    /**
     * Name for the block list.
     */
    name?: pulumi.Input<string>;
    /**
     * IAM (Identity and Access Management) role used to access the block list text file in S3.
     */
    roleArn: pulumi.Input<string>;
    /**
     * S3 path where your block list text file is located. See details below.
     *
     * The `sourceS3Path` configuration block supports the following arguments:
     */
    sourceS3Path: pulumi.Input<inputs.kendra.QuerySuggestionsBlockListSourceS3Path>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
