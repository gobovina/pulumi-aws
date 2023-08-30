// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS Transcribe LanguageModel.
 *
 * > This resource can take a significant amount of time to provision. See Language Model [FAQ](https://aws.amazon.com/transcribe/faqs/) for more details.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const examplePolicyDocument = aws.iam.getPolicyDocument({
 *     statements: [{
 *         actions: ["sts:AssumeRole"],
 *         principals: [{
 *             type: "Service",
 *             identifiers: ["transcribe.amazonaws.com"],
 *         }],
 *     }],
 * });
 * const exampleRole = new aws.iam.Role("exampleRole", {assumeRolePolicy: examplePolicyDocument.then(examplePolicyDocument => examplePolicyDocument.json)});
 * const testPolicy = new aws.iam.RolePolicy("testPolicy", {
 *     role: exampleRole.id,
 *     policy: JSON.stringify({
 *         Version: "2012-10-17",
 *         Statement: [{
 *             Action: [
 *                 "s3:GetObject",
 *                 "s3:ListBucket",
 *             ],
 *             Effect: "Allow",
 *             Resource: ["*"],
 *         }],
 *     }),
 * });
 * const exampleBucketV2 = new aws.s3.BucketV2("exampleBucketV2", {forceDestroy: true});
 * const object = new aws.s3.BucketObjectv2("object", {
 *     bucket: exampleBucketV2.id,
 *     key: "transcribe/test1.txt",
 *     source: new pulumi.asset.FileAsset("test1.txt"),
 * });
 * const exampleLanguageModel = new aws.transcribe.LanguageModel("exampleLanguageModel", {
 *     modelName: "example",
 *     baseModelName: "NarrowBand",
 *     inputDataConfig: {
 *         dataAccessRoleArn: exampleRole.arn,
 *         s3Uri: pulumi.interpolate`s3://${exampleBucketV2.id}/transcribe/`,
 *     },
 *     languageCode: "en-US",
 *     tags: {
 *         ENVIRONMENT: "development",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Transcribe LanguageModel using the `model_name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:transcribe/languageModel:LanguageModel example example-name
 * ```
 */
export class LanguageModel extends pulumi.CustomResource {
    /**
     * Get an existing LanguageModel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LanguageModelState, opts?: pulumi.CustomResourceOptions): LanguageModel {
        return new LanguageModel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:transcribe/languageModel:LanguageModel';

    /**
     * Returns true if the given object is an instance of LanguageModel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LanguageModel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LanguageModel.__pulumiType;
    }

    /**
     * ARN of the LanguageModel.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Name of reference base model.
     */
    public readonly baseModelName!: pulumi.Output<string>;
    /**
     * The input data config for the LanguageModel. See Input Data Config for more details.
     */
    public readonly inputDataConfig!: pulumi.Output<outputs.transcribe.LanguageModelInputDataConfig>;
    /**
     * The language code you selected for your language model. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
     */
    public readonly languageCode!: pulumi.Output<string>;
    /**
     * The model name.
     */
    public readonly modelName!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the LanguageModel. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a LanguageModel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LanguageModelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LanguageModelArgs | LanguageModelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LanguageModelState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["baseModelName"] = state ? state.baseModelName : undefined;
            resourceInputs["inputDataConfig"] = state ? state.inputDataConfig : undefined;
            resourceInputs["languageCode"] = state ? state.languageCode : undefined;
            resourceInputs["modelName"] = state ? state.modelName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as LanguageModelArgs | undefined;
            if ((!args || args.baseModelName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'baseModelName'");
            }
            if ((!args || args.inputDataConfig === undefined) && !opts.urn) {
                throw new Error("Missing required property 'inputDataConfig'");
            }
            if ((!args || args.languageCode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'languageCode'");
            }
            if ((!args || args.modelName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'modelName'");
            }
            resourceInputs["baseModelName"] = args ? args.baseModelName : undefined;
            resourceInputs["inputDataConfig"] = args ? args.inputDataConfig : undefined;
            resourceInputs["languageCode"] = args ? args.languageCode : undefined;
            resourceInputs["modelName"] = args ? args.modelName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LanguageModel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LanguageModel resources.
 */
export interface LanguageModelState {
    /**
     * ARN of the LanguageModel.
     */
    arn?: pulumi.Input<string>;
    /**
     * Name of reference base model.
     */
    baseModelName?: pulumi.Input<string>;
    /**
     * The input data config for the LanguageModel. See Input Data Config for more details.
     */
    inputDataConfig?: pulumi.Input<inputs.transcribe.LanguageModelInputDataConfig>;
    /**
     * The language code you selected for your language model. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
     */
    languageCode?: pulumi.Input<string>;
    /**
     * The model name.
     */
    modelName?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the LanguageModel. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a LanguageModel resource.
 */
export interface LanguageModelArgs {
    /**
     * Name of reference base model.
     */
    baseModelName: pulumi.Input<string>;
    /**
     * The input data config for the LanguageModel. See Input Data Config for more details.
     */
    inputDataConfig: pulumi.Input<inputs.transcribe.LanguageModelInputDataConfig>;
    /**
     * The language code you selected for your language model. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
     */
    languageCode: pulumi.Input<string>;
    /**
     * The model name.
     */
    modelName: pulumi.Input<string>;
    /**
     * A map of tags to assign to the LanguageModel. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
