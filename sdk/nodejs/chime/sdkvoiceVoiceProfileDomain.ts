// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS Chime SDK Voice Profile Domain.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleKey = new aws.kms.Key("exampleKey", {
 *     description: "KMS Key for Voice Profile Domain",
 *     deletionWindowInDays: 7,
 * });
 * const exampleSdkvoiceVoiceProfileDomain = new aws.chime.SdkvoiceVoiceProfileDomain("exampleSdkvoiceVoiceProfileDomain", {
 *     serverSideEncryptionConfiguration: {
 *         kmsKeyArn: exampleKey.arn,
 *     },
 *     description: "My Voice Profile Domain",
 *     tags: {
 *         key1: "value1",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import AWS Chime SDK Voice Profile Domain using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:chime/sdkvoiceVoiceProfileDomain:SdkvoiceVoiceProfileDomain example abcdef123456
 * ```
 */
export class SdkvoiceVoiceProfileDomain extends pulumi.CustomResource {
    /**
     * Get an existing SdkvoiceVoiceProfileDomain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SdkvoiceVoiceProfileDomainState, opts?: pulumi.CustomResourceOptions): SdkvoiceVoiceProfileDomain {
        return new SdkvoiceVoiceProfileDomain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:chime/sdkvoiceVoiceProfileDomain:SdkvoiceVoiceProfileDomain';

    /**
     * Returns true if the given object is an instance of SdkvoiceVoiceProfileDomain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SdkvoiceVoiceProfileDomain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SdkvoiceVoiceProfileDomain.__pulumiType;
    }

    /**
     * ARN of the Voice Profile Domain.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Description of Voice Profile Domain.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of Voice Profile Domain.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Configuration for server side encryption.
     */
    public readonly serverSideEncryptionConfiguration!: pulumi.Output<outputs.chime.SdkvoiceVoiceProfileDomainServerSideEncryptionConfiguration>;
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a SdkvoiceVoiceProfileDomain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SdkvoiceVoiceProfileDomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SdkvoiceVoiceProfileDomainArgs | SdkvoiceVoiceProfileDomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SdkvoiceVoiceProfileDomainState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["serverSideEncryptionConfiguration"] = state ? state.serverSideEncryptionConfiguration : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as SdkvoiceVoiceProfileDomainArgs | undefined;
            if ((!args || args.serverSideEncryptionConfiguration === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverSideEncryptionConfiguration'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["serverSideEncryptionConfiguration"] = args ? args.serverSideEncryptionConfiguration : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SdkvoiceVoiceProfileDomain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SdkvoiceVoiceProfileDomain resources.
 */
export interface SdkvoiceVoiceProfileDomainState {
    /**
     * ARN of the Voice Profile Domain.
     */
    arn?: pulumi.Input<string>;
    /**
     * Description of Voice Profile Domain.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of Voice Profile Domain.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration for server side encryption.
     */
    serverSideEncryptionConfiguration?: pulumi.Input<inputs.chime.SdkvoiceVoiceProfileDomainServerSideEncryptionConfiguration>;
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a SdkvoiceVoiceProfileDomain resource.
 */
export interface SdkvoiceVoiceProfileDomainArgs {
    /**
     * Description of Voice Profile Domain.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of Voice Profile Domain.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration for server side encryption.
     */
    serverSideEncryptionConfiguration: pulumi.Input<inputs.chime.SdkvoiceVoiceProfileDomainServerSideEncryptionConfiguration>;
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
