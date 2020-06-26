// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a resource to manage AWS Secrets Manager secret rotation. To manage a secret, see the [`aws.secretsmanager.Secret` resource](https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret.html). To manage a secret value, see the [`aws.secretsmanager.SecretVersion` resource](https://www.terraform.io/docs/providers/aws/r/secretsmanager_secret_version.html).
 *
 * ## Example Usage
 * ### Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.secretsmanager.SecretRotation("example", {
 *     rotationLambdaArn: aws_lambda_function_example.arn,
 *     rotationRules: {
 *         automaticallyAfterDays: 30,
 *     },
 *     secretId: aws_secretsmanager_secret_example.id,
 * });
 * ```
 * ### Rotation Configuration
 *
 * To enable automatic secret rotation, the Secrets Manager service requires usage of a Lambda function. The [Rotate Secrets section in the Secrets Manager User Guide](https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotating-secrets.html) provides additional information about deploying a prebuilt Lambda functions for supported credential rotation (e.g. RDS) or deploying a custom Lambda function.
 *
 * > **NOTE:** Configuring rotation causes the secret to rotate once as soon as you enable rotation. Before you do this, you must ensure that all of your applications that use the credentials stored in the secret are updated to retrieve the secret from AWS Secrets Manager. The old credentials might no longer be usable after the initial rotation and any applications that you fail to update will break as soon as the old credentials are no longer valid.
 *
 * > **NOTE:** If you cancel a rotation that is in progress (by removing the `rotation` configuration), it can leave the VersionStage labels in an unexpected state. Depending on what step of the rotation was in progress, you might need to remove the staging label AWSPENDING from the partially created version, specified by the SecretVersionId response value. You should also evaluate the partially rotated new version to see if it should be deleted, which you can do by removing all staging labels from the new version's VersionStage field.
 */
export class SecretRotation extends pulumi.CustomResource {
    /**
     * Get an existing SecretRotation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecretRotationState, opts?: pulumi.CustomResourceOptions): SecretRotation {
        return new SecretRotation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:secretsmanager/secretRotation:SecretRotation';

    /**
     * Returns true if the given object is an instance of SecretRotation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecretRotation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecretRotation.__pulumiType;
    }

    /**
     * Specifies whether automatic rotation is enabled for this secret.
     */
    public /*out*/ readonly rotationEnabled!: pulumi.Output<boolean>;
    /**
     * Specifies the ARN of the Lambda function that can rotate the secret.
     */
    public readonly rotationLambdaArn!: pulumi.Output<string>;
    /**
     * A structure that defines the rotation configuration for this secret. Defined below.
     */
    public readonly rotationRules!: pulumi.Output<outputs.secretsmanager.SecretRotationRotationRules>;
    /**
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     */
    public readonly secretId!: pulumi.Output<string>;
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a SecretRotation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecretRotationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecretRotationArgs | SecretRotationState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as SecretRotationState | undefined;
            inputs["rotationEnabled"] = state ? state.rotationEnabled : undefined;
            inputs["rotationLambdaArn"] = state ? state.rotationLambdaArn : undefined;
            inputs["rotationRules"] = state ? state.rotationRules : undefined;
            inputs["secretId"] = state ? state.secretId : undefined;
            inputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as SecretRotationArgs | undefined;
            if (!args || args.rotationLambdaArn === undefined) {
                throw new Error("Missing required property 'rotationLambdaArn'");
            }
            if (!args || args.rotationRules === undefined) {
                throw new Error("Missing required property 'rotationRules'");
            }
            if (!args || args.secretId === undefined) {
                throw new Error("Missing required property 'secretId'");
            }
            inputs["rotationLambdaArn"] = args ? args.rotationLambdaArn : undefined;
            inputs["rotationRules"] = args ? args.rotationRules : undefined;
            inputs["secretId"] = args ? args.secretId : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["rotationEnabled"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(SecretRotation.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecretRotation resources.
 */
export interface SecretRotationState {
    /**
     * Specifies whether automatic rotation is enabled for this secret.
     */
    readonly rotationEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the ARN of the Lambda function that can rotate the secret.
     */
    readonly rotationLambdaArn?: pulumi.Input<string>;
    /**
     * A structure that defines the rotation configuration for this secret. Defined below.
     */
    readonly rotationRules?: pulumi.Input<inputs.secretsmanager.SecretRotationRotationRules>;
    /**
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     */
    readonly secretId?: pulumi.Input<string>;
    readonly tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a SecretRotation resource.
 */
export interface SecretRotationArgs {
    /**
     * Specifies the ARN of the Lambda function that can rotate the secret.
     */
    readonly rotationLambdaArn: pulumi.Input<string>;
    /**
     * A structure that defines the rotation configuration for this secret. Defined below.
     */
    readonly rotationRules: pulumi.Input<inputs.secretsmanager.SecretRotationRotationRules>;
    /**
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     */
    readonly secretId: pulumi.Input<string>;
    readonly tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
