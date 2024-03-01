// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieve information about a Secrets Manager secret version, including its secret value. To retrieve secret metadata, see the `aws.secretsmanager.Secret` data source.
 *
 * ## Example Usage
 * ### Retrieve Current Secret Version
 *
 * By default, this data sources retrieves information based on the `AWSCURRENT` staging label.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const secret-version = aws.secretsmanager.getSecretVersion({
 *     secretId: example.id,
 * });
 * ```
 * ### Retrieve Specific Secret Version
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const by-version-stage = aws.secretsmanager.getSecretVersion({
 *     secretId: example.id,
 *     versionStage: "example",
 * });
 * ```
 * ### Handling Key-Value Secret Strings in JSON
 *
 * Reading key-value pairs from JSON back into a native map
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 *
 * function notImplemented(message: string) {
 *     throw new Error(message);
 * }
 *
 * export const example = notImplemented("jsondecode(data.aws_secretsmanager_secret_version.example.secret_string)").key1;
 * ```
 */
export function getSecretVersion(args: GetSecretVersionArgs, opts?: pulumi.InvokeOptions): Promise<GetSecretVersionResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:secretsmanager/getSecretVersion:getSecretVersion", {
        "secretId": args.secretId,
        "versionId": args.versionId,
        "versionStage": args.versionStage,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecretVersion.
 */
export interface GetSecretVersionArgs {
    /**
     * Specifies the secret containing the version that you want to retrieve. You can specify either the ARN or the friendly name of the secret.
     */
    secretId: string;
    /**
     * Specifies the unique identifier of the version of the secret that you want to retrieve. Overrides `versionStage`.
     */
    versionId?: string;
    /**
     * Specifies the secret version that you want to retrieve by the staging label attached to the version. Defaults to `AWSCURRENT`.
     */
    versionStage?: string;
}

/**
 * A collection of values returned by getSecretVersion.
 */
export interface GetSecretVersionResult {
    /**
     * ARN of the secret.
     */
    readonly arn: string;
    /**
     * Created date of the secret in UTC.
     */
    readonly createdDate: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Decrypted part of the protected secret information that was originally provided as a binary.
     */
    readonly secretBinary: string;
    readonly secretId: string;
    /**
     * Decrypted part of the protected secret information that was originally provided as a string.
     */
    readonly secretString: string;
    /**
     * Unique identifier of this version of the secret.
     */
    readonly versionId: string;
    readonly versionStage?: string;
    readonly versionStages: string[];
}
/**
 * Retrieve information about a Secrets Manager secret version, including its secret value. To retrieve secret metadata, see the `aws.secretsmanager.Secret` data source.
 *
 * ## Example Usage
 * ### Retrieve Current Secret Version
 *
 * By default, this data sources retrieves information based on the `AWSCURRENT` staging label.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const secret-version = aws.secretsmanager.getSecretVersion({
 *     secretId: example.id,
 * });
 * ```
 * ### Retrieve Specific Secret Version
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const by-version-stage = aws.secretsmanager.getSecretVersion({
 *     secretId: example.id,
 *     versionStage: "example",
 * });
 * ```
 * ### Handling Key-Value Secret Strings in JSON
 *
 * Reading key-value pairs from JSON back into a native map
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 *
 * function notImplemented(message: string) {
 *     throw new Error(message);
 * }
 *
 * export const example = notImplemented("jsondecode(data.aws_secretsmanager_secret_version.example.secret_string)").key1;
 * ```
 */
export function getSecretVersionOutput(args: GetSecretVersionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSecretVersionResult> {
    return pulumi.output(args).apply((a: any) => getSecretVersion(a, opts))
}

/**
 * A collection of arguments for invoking getSecretVersion.
 */
export interface GetSecretVersionOutputArgs {
    /**
     * Specifies the secret containing the version that you want to retrieve. You can specify either the ARN or the friendly name of the secret.
     */
    secretId: pulumi.Input<string>;
    /**
     * Specifies the unique identifier of the version of the secret that you want to retrieve. Overrides `versionStage`.
     */
    versionId?: pulumi.Input<string>;
    /**
     * Specifies the secret version that you want to retrieve by the staging label attached to the version. Defaults to `AWSCURRENT`.
     */
    versionStage?: pulumi.Input<string>;
}
