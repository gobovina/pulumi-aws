// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a resource to manage AWS Secrets Manager secret version including its secret value. To manage secret metadata, see the `aws.secretsmanager.Secret` resource.
 *
 * > **NOTE:** If the `AWSCURRENT` staging label is present on this version during resource deletion, that label cannot be removed and will be skipped to prevent errors when fully deleting the secret. That label will leave this secret version active even after the resource is deleted from this provider unless the secret itself is deleted. Move the `AWSCURRENT` staging label before or after deleting this resource from this provider to fully trigger version deprecation if necessary.
 *
 * ## Example Usage
 *
 * ### Simple String Value
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.secretsmanager.SecretVersion("example", {
 *     secretId: exampleAwsSecretsmanagerSecret.id,
 *     secretString: "example-string-to-protect",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Key-Value Pairs
 *
 * Secrets Manager also accepts key-value pairs in JSON.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const config = new pulumi.Config();
 * const example = config.getObject<Record<string, string>>("example") || {
 *     key1: "value1",
 *     key2: "value2",
 * };
 * const exampleSecretVersion = new aws.secretsmanager.SecretVersion("example", {
 *     secretId: exampleAwsSecretsmanagerSecret.id,
 *     secretString: JSON.stringify(example),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * Reading key-value pairs from JSON back into a native map
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_secretsmanager_secret_version` using the secret ID and version ID. For example:
 *
 * ```sh
 * $ pulumi import aws:secretsmanager/secretVersion:SecretVersion example 'arn:aws:secretsmanager:us-east-1:123456789012:secret:example-123456|xxxxx-xxxxxxx-xxxxxxx-xxxxx'
 * ```
 */
export class SecretVersion extends pulumi.CustomResource {
    /**
     * Get an existing SecretVersion resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecretVersionState, opts?: pulumi.CustomResourceOptions): SecretVersion {
        return new SecretVersion(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:secretsmanager/secretVersion:SecretVersion';

    /**
     * Returns true if the given object is an instance of SecretVersion.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecretVersion {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecretVersion.__pulumiType;
    }

    /**
     * The ARN of the secret.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secretString is not set. Needs to be encoded to base64.
     */
    public readonly secretBinary!: pulumi.Output<string | undefined>;
    /**
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     */
    public readonly secretId!: pulumi.Output<string>;
    /**
     * Specifies text data that you want to encrypt and store in this version of the secret. This is required if secretBinary is not set.
     */
    public readonly secretString!: pulumi.Output<string | undefined>;
    /**
     * The unique identifier of the version of the secret.
     */
    public /*out*/ readonly versionId!: pulumi.Output<string>;
    /**
     * Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
     *
     * > **NOTE:** If `versionStages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
     */
    public readonly versionStages!: pulumi.Output<string[]>;

    /**
     * Create a SecretVersion resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecretVersionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecretVersionArgs | SecretVersionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecretVersionState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["secretBinary"] = state ? state.secretBinary : undefined;
            resourceInputs["secretId"] = state ? state.secretId : undefined;
            resourceInputs["secretString"] = state ? state.secretString : undefined;
            resourceInputs["versionId"] = state ? state.versionId : undefined;
            resourceInputs["versionStages"] = state ? state.versionStages : undefined;
        } else {
            const args = argsOrState as SecretVersionArgs | undefined;
            if ((!args || args.secretId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'secretId'");
            }
            resourceInputs["secretBinary"] = args?.secretBinary ? pulumi.secret(args.secretBinary) : undefined;
            resourceInputs["secretId"] = args ? args.secretId : undefined;
            resourceInputs["secretString"] = args?.secretString ? pulumi.secret(args.secretString) : undefined;
            resourceInputs["versionStages"] = args ? args.versionStages : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["versionId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["secretBinary", "secretString"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SecretVersion.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecretVersion resources.
 */
export interface SecretVersionState {
    /**
     * The ARN of the secret.
     */
    arn?: pulumi.Input<string>;
    /**
     * Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secretString is not set. Needs to be encoded to base64.
     */
    secretBinary?: pulumi.Input<string>;
    /**
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     */
    secretId?: pulumi.Input<string>;
    /**
     * Specifies text data that you want to encrypt and store in this version of the secret. This is required if secretBinary is not set.
     */
    secretString?: pulumi.Input<string>;
    /**
     * The unique identifier of the version of the secret.
     */
    versionId?: pulumi.Input<string>;
    /**
     * Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
     *
     * > **NOTE:** If `versionStages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
     */
    versionStages?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a SecretVersion resource.
 */
export interface SecretVersionArgs {
    /**
     * Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secretString is not set. Needs to be encoded to base64.
     */
    secretBinary?: pulumi.Input<string>;
    /**
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     */
    secretId: pulumi.Input<string>;
    /**
     * Specifies text data that you want to encrypt and store in this version of the secret. This is required if secretBinary is not set.
     */
    secretString?: pulumi.Input<string>;
    /**
     * Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
     *
     * > **NOTE:** If `versionStages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
     */
    versionStages?: pulumi.Input<pulumi.Input<string>[]>;
}
