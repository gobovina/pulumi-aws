// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a resource to manage the default customer master key (CMK) that your AWS account uses to encrypt EBS volumes.
 *
 * Your AWS account has an AWS-managed default CMK that is used for encrypting an EBS volume when no CMK is specified in the API call that creates the volume.
 * By using the `aws.ebs.DefaultKmsKey` resource, you can specify a customer-managed CMK to use in place of the AWS-managed default CMK.
 *
 * > **NOTE:** Creating an `aws.ebs.DefaultKmsKey` resource does not enable default EBS encryption. Use the `aws.ebs.EncryptionByDefault` to enable default EBS encryption.
 *
 * > **NOTE:** Destroying this resource will reset the default CMK to the account's AWS-managed default CMK for EBS.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ebs.DefaultKmsKey("example", {keyArn: aws_kms_key.example.arn});
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import the EBS default KMS CMK using the KMS key ARN. For example:
 *
 * ```sh
 *  $ pulumi import aws:ebs/defaultKmsKey:DefaultKmsKey example arn:aws:kms:us-east-1:123456789012:key/abcd-1234
 * ```
 */
export class DefaultKmsKey extends pulumi.CustomResource {
    /**
     * Get an existing DefaultKmsKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DefaultKmsKeyState, opts?: pulumi.CustomResourceOptions): DefaultKmsKey {
        return new DefaultKmsKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ebs/defaultKmsKey:DefaultKmsKey';

    /**
     * Returns true if the given object is an instance of DefaultKmsKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DefaultKmsKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DefaultKmsKey.__pulumiType;
    }

    /**
     * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
     */
    public readonly keyArn!: pulumi.Output<string>;

    /**
     * Create a DefaultKmsKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DefaultKmsKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DefaultKmsKeyArgs | DefaultKmsKeyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DefaultKmsKeyState | undefined;
            resourceInputs["keyArn"] = state ? state.keyArn : undefined;
        } else {
            const args = argsOrState as DefaultKmsKeyArgs | undefined;
            if ((!args || args.keyArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'keyArn'");
            }
            resourceInputs["keyArn"] = args ? args.keyArn : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DefaultKmsKey.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DefaultKmsKey resources.
 */
export interface DefaultKmsKeyState {
    /**
     * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
     */
    keyArn?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DefaultKmsKey resource.
 */
export interface DefaultKmsKeyArgs {
    /**
     * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
     */
    keyArn: pulumi.Input<string>;
}
