// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS Transcribe VocabularyFilter.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.transcribe.VocabularyFilter("example", {
 *     languageCode: "en-US",
 *     tags: {
 *         tag1: "value1",
 *         tag2: "value3",
 *     },
 *     vocabularyFilterName: "example",
 *     words: [
 *         "cars",
 *         "bucket",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Transcribe VocabularyFilter using the `vocabulary_filter_name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:transcribe/vocabularyFilter:VocabularyFilter example example-name
 * ```
 */
export class VocabularyFilter extends pulumi.CustomResource {
    /**
     * Get an existing VocabularyFilter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VocabularyFilterState, opts?: pulumi.CustomResourceOptions): VocabularyFilter {
        return new VocabularyFilter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:transcribe/vocabularyFilter:VocabularyFilter';

    /**
     * Returns true if the given object is an instance of VocabularyFilter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VocabularyFilter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VocabularyFilter.__pulumiType;
    }

    /**
     * ARN of the VocabularyFilter.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Generated download URI.
     */
    public /*out*/ readonly downloadUri!: pulumi.Output<string>;
    /**
     * The language code you selected for your vocabulary filter. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
     */
    public readonly languageCode!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the VocabularyFilter. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The Amazon S3 location (URI) of the text file that contains your custom VocabularyFilter. Conflicts with `words` argument.
     */
    public readonly vocabularyFilterFileUri!: pulumi.Output<string | undefined>;
    /**
     * The name of the VocabularyFilter.
     *
     * The following arguments are optional:
     */
    public readonly vocabularyFilterName!: pulumi.Output<string>;
    /**
     * A list of terms to include in the vocabulary. Conflicts with `vocabularyFilterFileUri` argument.
     */
    public readonly words!: pulumi.Output<string[] | undefined>;

    /**
     * Create a VocabularyFilter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VocabularyFilterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VocabularyFilterArgs | VocabularyFilterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VocabularyFilterState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["downloadUri"] = state ? state.downloadUri : undefined;
            resourceInputs["languageCode"] = state ? state.languageCode : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["vocabularyFilterFileUri"] = state ? state.vocabularyFilterFileUri : undefined;
            resourceInputs["vocabularyFilterName"] = state ? state.vocabularyFilterName : undefined;
            resourceInputs["words"] = state ? state.words : undefined;
        } else {
            const args = argsOrState as VocabularyFilterArgs | undefined;
            if ((!args || args.languageCode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'languageCode'");
            }
            if ((!args || args.vocabularyFilterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vocabularyFilterName'");
            }
            resourceInputs["languageCode"] = args ? args.languageCode : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vocabularyFilterFileUri"] = args ? args.vocabularyFilterFileUri : undefined;
            resourceInputs["vocabularyFilterName"] = args ? args.vocabularyFilterName : undefined;
            resourceInputs["words"] = args ? args.words : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["downloadUri"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VocabularyFilter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VocabularyFilter resources.
 */
export interface VocabularyFilterState {
    /**
     * ARN of the VocabularyFilter.
     */
    arn?: pulumi.Input<string>;
    /**
     * Generated download URI.
     */
    downloadUri?: pulumi.Input<string>;
    /**
     * The language code you selected for your vocabulary filter. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
     */
    languageCode?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the VocabularyFilter. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Amazon S3 location (URI) of the text file that contains your custom VocabularyFilter. Conflicts with `words` argument.
     */
    vocabularyFilterFileUri?: pulumi.Input<string>;
    /**
     * The name of the VocabularyFilter.
     *
     * The following arguments are optional:
     */
    vocabularyFilterName?: pulumi.Input<string>;
    /**
     * A list of terms to include in the vocabulary. Conflicts with `vocabularyFilterFileUri` argument.
     */
    words?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a VocabularyFilter resource.
 */
export interface VocabularyFilterArgs {
    /**
     * The language code you selected for your vocabulary filter. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
     */
    languageCode: pulumi.Input<string>;
    /**
     * A map of tags to assign to the VocabularyFilter. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Amazon S3 location (URI) of the text file that contains your custom VocabularyFilter. Conflicts with `words` argument.
     */
    vocabularyFilterFileUri?: pulumi.Input<string>;
    /**
     * The name of the VocabularyFilter.
     *
     * The following arguments are optional:
     */
    vocabularyFilterName: pulumi.Input<string>;
    /**
     * A list of terms to include in the vocabulary. Conflicts with `vocabularyFilterFileUri` argument.
     */
    words?: pulumi.Input<pulumi.Input<string>[]>;
}
