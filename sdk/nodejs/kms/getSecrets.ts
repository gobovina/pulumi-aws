// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Decrypt multiple secrets from data encrypted with the AWS KMS service.
 */
export function getSecrets(args: GetSecretsArgs, opts?: pulumi.InvokeOptions): Promise<GetSecretsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:kms/getSecrets:getSecrets", {
        "secrets": args.secrets,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecrets.
 */
export interface GetSecretsArgs {
    /**
     * One or more encrypted payload definitions from the KMS service. See the Secret Definitions below.
     */
    secrets: inputs.kms.GetSecretsSecret[];
}

/**
 * A collection of values returned by getSecrets.
 */
export interface GetSecretsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Map containing each `secret` `name` as the key with its decrypted plaintext value
     */
    readonly plaintext: {[key: string]: string};
    readonly secrets: outputs.kms.GetSecretsSecret[];
}
/**
 * Decrypt multiple secrets from data encrypted with the AWS KMS service.
 */
export function getSecretsOutput(args: GetSecretsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSecretsResult> {
    return pulumi.output(args).apply((a: any) => getSecrets(a, opts))
}

/**
 * A collection of arguments for invoking getSecrets.
 */
export interface GetSecretsOutputArgs {
    /**
     * One or more encrypted payload definitions from the KMS service. See the Secret Definitions below.
     */
    secrets: pulumi.Input<pulumi.Input<inputs.kms.GetSecretsSecretArgs>[]>;
}
