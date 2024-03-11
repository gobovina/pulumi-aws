// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Amazon Connect Phone Number resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
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
 * const example = new aws.connect.PhoneNumber("example", {
 *     targetArn: exampleAwsConnectInstance.arn,
 *     countryCode: "US",
 *     type: "DID",
 *     tags: {
 *         hello: "world",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Description
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.connect.PhoneNumber("example", {
 *     targetArn: exampleAwsConnectInstance.arn,
 *     countryCode: "US",
 *     type: "DID",
 *     description: "example description",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Prefix to filter phone numbers
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.connect.PhoneNumber("example", {
 *     targetArn: exampleAwsConnectInstance.arn,
 *     countryCode: "US",
 *     type: "DID",
 *     prefix: "+18005",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Amazon Connect Phone Numbers using its `id`. For example:
 *
 * ```sh
 * $ pulumi import aws:connect/phoneNumber:PhoneNumber example 12345678-abcd-1234-efgh-9876543210ab
 * ```
 */
export class PhoneNumber extends pulumi.CustomResource {
    /**
     * Get an existing PhoneNumber resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PhoneNumberState, opts?: pulumi.CustomResourceOptions): PhoneNumber {
        return new PhoneNumber(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:connect/phoneNumber:PhoneNumber';

    /**
     * Returns true if the given object is an instance of PhoneNumber.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PhoneNumber {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PhoneNumber.__pulumiType;
    }

    /**
     * The ARN of the phone number.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The ISO country code. For a list of Valid values, refer to [PhoneNumberCountryCode](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html#connect-SearchAvailablePhoneNumbers-request-PhoneNumberCountryCode).
     */
    public readonly countryCode!: pulumi.Output<string>;
    /**
     * The description of the phone number.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The phone number. Phone numbers are formatted `[+] [country code] [subscriber number including area code]`.
     */
    public /*out*/ readonly phoneNumber!: pulumi.Output<string>;
    /**
     * The prefix of the phone number that is used to filter available phone numbers. If provided, it must contain `+` as part of the country code. Do not specify this argument when importing the resource.
     */
    public readonly prefix!: pulumi.Output<string | undefined>;
    /**
     * The status of the phone number. Valid Values: `CLAIMED` | `IN_PROGRESS` | `FAILED`.
     */
    public /*out*/ readonly statuses!: pulumi.Output<outputs.connect.PhoneNumberStatus[]>;
    /**
     * Tags to apply to the Phone Number. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
     */
    public readonly targetArn!: pulumi.Output<string>;
    /**
     * The type of phone number. Valid Values: `TOLL_FREE` | `DID`.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a PhoneNumber resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PhoneNumberArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PhoneNumberArgs | PhoneNumberState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PhoneNumberState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["countryCode"] = state ? state.countryCode : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["phoneNumber"] = state ? state.phoneNumber : undefined;
            resourceInputs["prefix"] = state ? state.prefix : undefined;
            resourceInputs["statuses"] = state ? state.statuses : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["targetArn"] = state ? state.targetArn : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as PhoneNumberArgs | undefined;
            if ((!args || args.countryCode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'countryCode'");
            }
            if ((!args || args.targetArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetArn'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["countryCode"] = args ? args.countryCode : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["prefix"] = args ? args.prefix : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["targetArn"] = args ? args.targetArn : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["phoneNumber"] = undefined /*out*/;
            resourceInputs["statuses"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PhoneNumber.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PhoneNumber resources.
 */
export interface PhoneNumberState {
    /**
     * The ARN of the phone number.
     */
    arn?: pulumi.Input<string>;
    /**
     * The ISO country code. For a list of Valid values, refer to [PhoneNumberCountryCode](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html#connect-SearchAvailablePhoneNumbers-request-PhoneNumberCountryCode).
     */
    countryCode?: pulumi.Input<string>;
    /**
     * The description of the phone number.
     */
    description?: pulumi.Input<string>;
    /**
     * The phone number. Phone numbers are formatted `[+] [country code] [subscriber number including area code]`.
     */
    phoneNumber?: pulumi.Input<string>;
    /**
     * The prefix of the phone number that is used to filter available phone numbers. If provided, it must contain `+` as part of the country code. Do not specify this argument when importing the resource.
     */
    prefix?: pulumi.Input<string>;
    /**
     * The status of the phone number. Valid Values: `CLAIMED` | `IN_PROGRESS` | `FAILED`.
     */
    statuses?: pulumi.Input<pulumi.Input<inputs.connect.PhoneNumberStatus>[]>;
    /**
     * Tags to apply to the Phone Number. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
     */
    targetArn?: pulumi.Input<string>;
    /**
     * The type of phone number. Valid Values: `TOLL_FREE` | `DID`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PhoneNumber resource.
 */
export interface PhoneNumberArgs {
    /**
     * The ISO country code. For a list of Valid values, refer to [PhoneNumberCountryCode](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html#connect-SearchAvailablePhoneNumbers-request-PhoneNumberCountryCode).
     */
    countryCode: pulumi.Input<string>;
    /**
     * The description of the phone number.
     */
    description?: pulumi.Input<string>;
    /**
     * The prefix of the phone number that is used to filter available phone numbers. If provided, it must contain `+` as part of the country code. Do not specify this argument when importing the resource.
     */
    prefix?: pulumi.Input<string>;
    /**
     * Tags to apply to the Phone Number. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
     */
    targetArn: pulumi.Input<string>;
    /**
     * The type of phone number. Valid Values: `TOLL_FREE` | `DID`.
     */
    type: pulumi.Input<string>;
}
