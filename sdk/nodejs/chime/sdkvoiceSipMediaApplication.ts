// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * A ChimeSDKVoice SIP Media Application is a managed object that passes values from a SIP rule to a target AWS Lambda function.
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
 * const example = new aws.chime.SdkvoiceSipMediaApplication("example", {
 *     awsRegion: "us-east-1",
 *     name: "example-sip-media-application",
 *     endpoints: {
 *         lambdaArn: test.arn,
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import a ChimeSDKVoice SIP Media Application using the `id`. For example:
 *
 * ```sh
 * $ pulumi import aws:chime/sdkvoiceSipMediaApplication:SdkvoiceSipMediaApplication example abcdef123456
 * ```
 */
export class SdkvoiceSipMediaApplication extends pulumi.CustomResource {
    /**
     * Get an existing SdkvoiceSipMediaApplication resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SdkvoiceSipMediaApplicationState, opts?: pulumi.CustomResourceOptions): SdkvoiceSipMediaApplication {
        return new SdkvoiceSipMediaApplication(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:chime/sdkvoiceSipMediaApplication:SdkvoiceSipMediaApplication';

    /**
     * Returns true if the given object is an instance of SdkvoiceSipMediaApplication.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SdkvoiceSipMediaApplication {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SdkvoiceSipMediaApplication.__pulumiType;
    }

    /**
     * ARN (Amazon Resource Name) of the AWS Chime SDK Voice Sip Media Application
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The AWS Region in which the AWS Chime SDK Voice Sip Media Application is created.
     */
    public readonly awsRegion!: pulumi.Output<string>;
    /**
     * List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
     */
    public readonly endpoints!: pulumi.Output<outputs.chime.SdkvoiceSipMediaApplicationEndpoints>;
    /**
     * The name of the AWS Chime SDK Voice Sip Media Application.
     *
     * The following arguments are optional:
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a SdkvoiceSipMediaApplication resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SdkvoiceSipMediaApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SdkvoiceSipMediaApplicationArgs | SdkvoiceSipMediaApplicationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SdkvoiceSipMediaApplicationState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["awsRegion"] = state ? state.awsRegion : undefined;
            resourceInputs["endpoints"] = state ? state.endpoints : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as SdkvoiceSipMediaApplicationArgs | undefined;
            if ((!args || args.awsRegion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'awsRegion'");
            }
            if ((!args || args.endpoints === undefined) && !opts.urn) {
                throw new Error("Missing required property 'endpoints'");
            }
            resourceInputs["awsRegion"] = args ? args.awsRegion : undefined;
            resourceInputs["endpoints"] = args ? args.endpoints : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SdkvoiceSipMediaApplication.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SdkvoiceSipMediaApplication resources.
 */
export interface SdkvoiceSipMediaApplicationState {
    /**
     * ARN (Amazon Resource Name) of the AWS Chime SDK Voice Sip Media Application
     */
    arn?: pulumi.Input<string>;
    /**
     * The AWS Region in which the AWS Chime SDK Voice Sip Media Application is created.
     */
    awsRegion?: pulumi.Input<string>;
    /**
     * List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
     */
    endpoints?: pulumi.Input<inputs.chime.SdkvoiceSipMediaApplicationEndpoints>;
    /**
     * The name of the AWS Chime SDK Voice Sip Media Application.
     *
     * The following arguments are optional:
     */
    name?: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a SdkvoiceSipMediaApplication resource.
 */
export interface SdkvoiceSipMediaApplicationArgs {
    /**
     * The AWS Region in which the AWS Chime SDK Voice Sip Media Application is created.
     */
    awsRegion: pulumi.Input<string>;
    /**
     * List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
     */
    endpoints: pulumi.Input<inputs.chime.SdkvoiceSipMediaApplicationEndpoints>;
    /**
     * The name of the AWS Chime SDK Voice Sip Media Application.
     *
     * The following arguments are optional:
     */
    name?: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
