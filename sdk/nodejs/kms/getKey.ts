// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Use this data source to get detailed information about
 * the specified KMS Key with flexible key id input.
 * This can be useful to reference key alias
 * without having to hard code the ARN as input.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const byAlias = aws.kms.getKey({
 *     keyId: "alias/my-key",
 * });
 * const byId = aws.kms.getKey({
 *     keyId: "1234abcd-12ab-34cd-56ef-1234567890ab",
 * });
 * const byAliasArn = aws.kms.getKey({
 *     keyId: "arn:aws:kms:us-east-1:111122223333:alias/my-key",
 * });
 * const byKeyArn = aws.kms.getKey({
 *     keyId: "arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getKey(args: GetKeyArgs, opts?: pulumi.InvokeOptions): Promise<GetKeyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:kms/getKey:getKey", {
        "grantTokens": args.grantTokens,
        "keyId": args.keyId,
    }, opts);
}

/**
 * A collection of arguments for invoking getKey.
 */
export interface GetKeyArgs {
    /**
     * List of grant tokens
     */
    grantTokens?: string[];
    /**
     * Key identifier which can be one of the following format:
     * * Key ID. E.g: `1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Key ARN. E.g.: `arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Alias name. E.g.: `alias/my-key`
     * * Alias ARN: E.g.: `arn:aws:kms:us-east-1:111122223333:alias/my-key`
     */
    keyId: string;
}

/**
 * A collection of values returned by getKey.
 */
export interface GetKeyResult {
    /**
     * The key ARN of a primary or replica key of a multi-Region key.
     */
    readonly arn: string;
    /**
     * The twelve-digit account ID of the AWS account that owns the key
     */
    readonly awsAccountId: string;
    /**
     * The cluster ID of the AWS CloudHSM cluster that contains the key material for the KMS key.
     */
    readonly cloudHsmClusterId: string;
    /**
     * The date and time when the key was created
     */
    readonly creationDate: string;
    /**
     * A unique identifier for the custom key store that contains the KMS key.
     */
    readonly customKeyStoreId: string;
    /**
     * Specifies whether the key contains a symmetric key or an asymmetric key pair and the encryption algorithms or signing algorithms that the key supports
     */
    readonly customerMasterKeySpec: string;
    /**
     * The date and time after which AWS KMS deletes the key. This value is present only when `keyState` is `PendingDeletion`, otherwise this value is 0
     */
    readonly deletionDate: string;
    /**
     * The description of the key.
     */
    readonly description: string;
    /**
     * Specifies whether the key is enabled. When `keyState` is `Enabled` this value is true, otherwise it is false
     */
    readonly enabled: boolean;
    /**
     * Specifies whether the Key's key material expires. This value is present only when `origin` is `EXTERNAL`, otherwise this value is empty
     */
    readonly expirationModel: string;
    readonly grantTokens?: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly keyId: string;
    /**
     * The key's manager
     */
    readonly keyManager: string;
    /**
     * Describes the type of key material in the KMS key.
     */
    readonly keySpec: string;
    /**
     * The state of the key
     */
    readonly keyState: string;
    /**
     * Specifies the intended use of the key
     */
    readonly keyUsage: string;
    /**
     * Indicates whether the KMS key is a multi-Region (`true`) or regional (`false`) key.
     */
    readonly multiRegion: boolean;
    /**
     * Lists the primary and replica keys in same multi-Region key. Present only when the value of `multiRegion` is `true`.
     */
    readonly multiRegionConfigurations: outputs.kms.GetKeyMultiRegionConfiguration[];
    /**
     * When this value is `AWS_KMS`, AWS KMS created the key material. When this value is `EXTERNAL`, the key material was imported from your existing key management infrastructure or the CMK lacks key material
     */
    readonly origin: string;
    /**
     * The waiting period before the primary key in a multi-Region key is deleted.
     */
    readonly pendingDeletionWindowInDays: number;
    /**
     * The time at which the imported key material expires. This value is present only when `origin` is `EXTERNAL` and whose `expirationModel` is `KEY_MATERIAL_EXPIRES`, otherwise this value is 0
     */
    readonly validTo: string;
    /**
     * Information about the external key that is associated with a KMS key in an external key store.
     */
    readonly xksKeyConfigurations: outputs.kms.GetKeyXksKeyConfiguration[];
}
/**
 * Use this data source to get detailed information about
 * the specified KMS Key with flexible key id input.
 * This can be useful to reference key alias
 * without having to hard code the ARN as input.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const byAlias = aws.kms.getKey({
 *     keyId: "alias/my-key",
 * });
 * const byId = aws.kms.getKey({
 *     keyId: "1234abcd-12ab-34cd-56ef-1234567890ab",
 * });
 * const byAliasArn = aws.kms.getKey({
 *     keyId: "arn:aws:kms:us-east-1:111122223333:alias/my-key",
 * });
 * const byKeyArn = aws.kms.getKey({
 *     keyId: "arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getKeyOutput(args: GetKeyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKeyResult> {
    return pulumi.output(args).apply((a: any) => getKey(a, opts))
}

/**
 * A collection of arguments for invoking getKey.
 */
export interface GetKeyOutputArgs {
    /**
     * List of grant tokens
     */
    grantTokens?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Key identifier which can be one of the following format:
     * * Key ID. E.g: `1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Key ARN. E.g.: `arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Alias name. E.g.: `alias/my-key`
     * * Alias ARN: E.g.: `arn:aws:kms:us-east-1:111122223333:alias/my-key`
     */
    keyId: pulumi.Input<string>;
}
