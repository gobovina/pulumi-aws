// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Creates and manages an AWS XRay Encryption Config.
 *
 * > **NOTE:** Removing this resource from the provider has no effect to the encryption configuration within X-Ray.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.xray.EncryptionConfig("example", {type: "NONE"});
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### With KMS Key
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getCallerIdentity({});
 * const example = current.then(current => aws.iam.getPolicyDocument({
 *     statements: [{
 *         sid: "Enable IAM User Permissions",
 *         effect: "Allow",
 *         principals: [{
 *             type: "AWS",
 *             identifiers: [`arn:aws:iam::${current.accountId}:root`],
 *         }],
 *         actions: ["kms:*"],
 *         resources: ["*"],
 *     }],
 * }));
 * const exampleKey = new aws.kms.Key("example", {
 *     description: "Some Key",
 *     deletionWindowInDays: 7,
 *     policy: example.then(example => example.json),
 * });
 * const exampleEncryptionConfig = new aws.xray.EncryptionConfig("example", {
 *     type: "KMS",
 *     keyId: exampleKey.arn,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import XRay Encryption Config using the region name. For example:
 *
 * ```sh
 * $ pulumi import aws:xray/encryptionConfig:EncryptionConfig example us-west-2
 * ```
 */
export class EncryptionConfig extends pulumi.CustomResource {
    /**
     * Get an existing EncryptionConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EncryptionConfigState, opts?: pulumi.CustomResourceOptions): EncryptionConfig {
        return new EncryptionConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:xray/encryptionConfig:EncryptionConfig';

    /**
     * Returns true if the given object is an instance of EncryptionConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EncryptionConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EncryptionConfig.__pulumiType;
    }

    /**
     * An AWS KMS customer master key (CMK) ARN.
     */
    public readonly keyId!: pulumi.Output<string | undefined>;
    /**
     * The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a EncryptionConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EncryptionConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EncryptionConfigArgs | EncryptionConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EncryptionConfigState | undefined;
            resourceInputs["keyId"] = state ? state.keyId : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as EncryptionConfigArgs | undefined;
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["keyId"] = args ? args.keyId : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EncryptionConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EncryptionConfig resources.
 */
export interface EncryptionConfigState {
    /**
     * An AWS KMS customer master key (CMK) ARN.
     */
    keyId?: pulumi.Input<string>;
    /**
     * The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EncryptionConfig resource.
 */
export interface EncryptionConfigArgs {
    /**
     * An AWS KMS customer master key (CMK) ARN.
     */
    keyId?: pulumi.Input<string>;
    /**
     * The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
     */
    type: pulumi.Input<string>;
}
