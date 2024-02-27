// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS Transcribe MedicalVocabulary.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleBucketV2 = new aws.s3.BucketV2("exampleBucketV2", {forceDestroy: true});
 * const object = new aws.s3.BucketObjectv2("object", {
 *     bucket: exampleBucketV2.id,
 *     key: "transcribe/test1.txt",
 *     source: new pulumi.asset.FileAsset("test.txt"),
 * });
 * const exampleMedicalVocabulary = new aws.transcribe.MedicalVocabulary("exampleMedicalVocabulary", {
 *     vocabularyName: "example",
 *     languageCode: "en-US",
 *     vocabularyFileUri: pulumi.interpolate`s3://${exampleBucketV2.id}/${object.key}`,
 *     tags: {
 *         tag1: "value1",
 *         tag2: "value3",
 *     },
 * }, {
 *     dependsOn: [object],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Transcribe MedicalVocabulary using the `vocabulary_name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:transcribe/medicalVocabulary:MedicalVocabulary example example-name
 * ```
 */
export class MedicalVocabulary extends pulumi.CustomResource {
    /**
     * Get an existing MedicalVocabulary resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MedicalVocabularyState, opts?: pulumi.CustomResourceOptions): MedicalVocabulary {
        return new MedicalVocabulary(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:transcribe/medicalVocabulary:MedicalVocabulary';

    /**
     * Returns true if the given object is an instance of MedicalVocabulary.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MedicalVocabulary {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MedicalVocabulary.__pulumiType;
    }

    /**
     * ARN of the MedicalVocabulary.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Generated download URI.
     */
    public /*out*/ readonly downloadUri!: pulumi.Output<string>;
    /**
     * The language code you selected for your medical vocabulary. US English (en-US) is the only language supported with Amazon Transcribe Medical.
     */
    public readonly languageCode!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the MedicalVocabulary. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary.
     */
    public readonly vocabularyFileUri!: pulumi.Output<string>;
    /**
     * The name of the Medical Vocabulary.
     *
     * The following arguments are optional:
     */
    public readonly vocabularyName!: pulumi.Output<string>;

    /**
     * Create a MedicalVocabulary resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MedicalVocabularyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MedicalVocabularyArgs | MedicalVocabularyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MedicalVocabularyState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["downloadUri"] = state ? state.downloadUri : undefined;
            resourceInputs["languageCode"] = state ? state.languageCode : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["vocabularyFileUri"] = state ? state.vocabularyFileUri : undefined;
            resourceInputs["vocabularyName"] = state ? state.vocabularyName : undefined;
        } else {
            const args = argsOrState as MedicalVocabularyArgs | undefined;
            if ((!args || args.languageCode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'languageCode'");
            }
            if ((!args || args.vocabularyFileUri === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vocabularyFileUri'");
            }
            if ((!args || args.vocabularyName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vocabularyName'");
            }
            resourceInputs["languageCode"] = args ? args.languageCode : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vocabularyFileUri"] = args ? args.vocabularyFileUri : undefined;
            resourceInputs["vocabularyName"] = args ? args.vocabularyName : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["downloadUri"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MedicalVocabulary.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MedicalVocabulary resources.
 */
export interface MedicalVocabularyState {
    /**
     * ARN of the MedicalVocabulary.
     */
    arn?: pulumi.Input<string>;
    /**
     * Generated download URI.
     */
    downloadUri?: pulumi.Input<string>;
    /**
     * The language code you selected for your medical vocabulary. US English (en-US) is the only language supported with Amazon Transcribe Medical.
     */
    languageCode?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the MedicalVocabulary. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary.
     */
    vocabularyFileUri?: pulumi.Input<string>;
    /**
     * The name of the Medical Vocabulary.
     *
     * The following arguments are optional:
     */
    vocabularyName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MedicalVocabulary resource.
 */
export interface MedicalVocabularyArgs {
    /**
     * The language code you selected for your medical vocabulary. US English (en-US) is the only language supported with Amazon Transcribe Medical.
     */
    languageCode: pulumi.Input<string>;
    /**
     * A map of tags to assign to the MedicalVocabulary. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary.
     */
    vocabularyFileUri: pulumi.Input<string>;
    /**
     * The name of the Medical Vocabulary.
     *
     * The following arguments are optional:
     */
    vocabularyName: pulumi.Input<string>;
}
