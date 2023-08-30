// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a resource-based access control mechanism for a KMS customer master key.
 *
 * ## Import
 *
 * Using `pulumi import`, import KMS Grants using the Key ID and Grant ID separated by a colon (`:`). For example:
 *
 * ```sh
 *  $ pulumi import aws:kms/grant:Grant test 1234abcd-12ab-34cd-56ef-1234567890ab:abcde1237f76e4ba7987489ac329fbfba6ad343d6f7075dbd1ef191f0120514
 * ```
 */
export class Grant extends pulumi.CustomResource {
    /**
     * Get an existing Grant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GrantState, opts?: pulumi.CustomResourceOptions): Grant {
        return new Grant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:kms/grant:Grant';

    /**
     * Returns true if the given object is an instance of Grant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Grant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Grant.__pulumiType;
    }

    /**
     * A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
     */
    public readonly constraints!: pulumi.Output<outputs.kms.GrantConstraint[] | undefined>;
    /**
     * A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
     */
    public readonly grantCreationTokens!: pulumi.Output<string[] | undefined>;
    /**
     * The unique identifier for the grant.
     */
    public /*out*/ readonly grantId!: pulumi.Output<string>;
    /**
     * The grant token for the created grant. For more information, see [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token).
     */
    public /*out*/ readonly grantToken!: pulumi.Output<string>;
    /**
     * The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
     */
    public readonly granteePrincipal!: pulumi.Output<string>;
    /**
     * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
     */
    public readonly keyId!: pulumi.Output<string>;
    /**
     * A friendly name for identifying the grant.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A list of operations that the grant permits. The permitted values are: `Decrypt`, `Encrypt`, `GenerateDataKey`, `GenerateDataKeyWithoutPlaintext`, `ReEncryptFrom`, `ReEncryptTo`, `Sign`, `Verify`, `GetPublicKey`, `CreateGrant`, `RetireGrant`, `DescribeKey`, `GenerateDataKeyPair`, or `GenerateDataKeyPairWithoutPlaintext`.
     */
    public readonly operations!: pulumi.Output<string[]>;
    /**
     * If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
     * See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
     */
    public readonly retireOnDelete!: pulumi.Output<boolean | undefined>;
    /**
     * The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
     */
    public readonly retiringPrincipal!: pulumi.Output<string | undefined>;

    /**
     * Create a Grant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GrantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GrantArgs | GrantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GrantState | undefined;
            resourceInputs["constraints"] = state ? state.constraints : undefined;
            resourceInputs["grantCreationTokens"] = state ? state.grantCreationTokens : undefined;
            resourceInputs["grantId"] = state ? state.grantId : undefined;
            resourceInputs["grantToken"] = state ? state.grantToken : undefined;
            resourceInputs["granteePrincipal"] = state ? state.granteePrincipal : undefined;
            resourceInputs["keyId"] = state ? state.keyId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["operations"] = state ? state.operations : undefined;
            resourceInputs["retireOnDelete"] = state ? state.retireOnDelete : undefined;
            resourceInputs["retiringPrincipal"] = state ? state.retiringPrincipal : undefined;
        } else {
            const args = argsOrState as GrantArgs | undefined;
            if ((!args || args.granteePrincipal === undefined) && !opts.urn) {
                throw new Error("Missing required property 'granteePrincipal'");
            }
            if ((!args || args.keyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'keyId'");
            }
            if ((!args || args.operations === undefined) && !opts.urn) {
                throw new Error("Missing required property 'operations'");
            }
            resourceInputs["constraints"] = args ? args.constraints : undefined;
            resourceInputs["grantCreationTokens"] = args ? args.grantCreationTokens : undefined;
            resourceInputs["granteePrincipal"] = args ? args.granteePrincipal : undefined;
            resourceInputs["keyId"] = args ? args.keyId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["operations"] = args ? args.operations : undefined;
            resourceInputs["retireOnDelete"] = args ? args.retireOnDelete : undefined;
            resourceInputs["retiringPrincipal"] = args ? args.retiringPrincipal : undefined;
            resourceInputs["grantId"] = undefined /*out*/;
            resourceInputs["grantToken"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Grant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Grant resources.
 */
export interface GrantState {
    /**
     * A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
     */
    constraints?: pulumi.Input<pulumi.Input<inputs.kms.GrantConstraint>[]>;
    /**
     * A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
     */
    grantCreationTokens?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The unique identifier for the grant.
     */
    grantId?: pulumi.Input<string>;
    /**
     * The grant token for the created grant. For more information, see [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token).
     */
    grantToken?: pulumi.Input<string>;
    /**
     * The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
     */
    granteePrincipal?: pulumi.Input<string>;
    /**
     * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
     */
    keyId?: pulumi.Input<string>;
    /**
     * A friendly name for identifying the grant.
     */
    name?: pulumi.Input<string>;
    /**
     * A list of operations that the grant permits. The permitted values are: `Decrypt`, `Encrypt`, `GenerateDataKey`, `GenerateDataKeyWithoutPlaintext`, `ReEncryptFrom`, `ReEncryptTo`, `Sign`, `Verify`, `GetPublicKey`, `CreateGrant`, `RetireGrant`, `DescribeKey`, `GenerateDataKeyPair`, or `GenerateDataKeyPairWithoutPlaintext`.
     */
    operations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
     * See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
     */
    retireOnDelete?: pulumi.Input<boolean>;
    /**
     * The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
     */
    retiringPrincipal?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Grant resource.
 */
export interface GrantArgs {
    /**
     * A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
     */
    constraints?: pulumi.Input<pulumi.Input<inputs.kms.GrantConstraint>[]>;
    /**
     * A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
     */
    grantCreationTokens?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
     */
    granteePrincipal: pulumi.Input<string>;
    /**
     * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
     */
    keyId: pulumi.Input<string>;
    /**
     * A friendly name for identifying the grant.
     */
    name?: pulumi.Input<string>;
    /**
     * A list of operations that the grant permits. The permitted values are: `Decrypt`, `Encrypt`, `GenerateDataKey`, `GenerateDataKeyWithoutPlaintext`, `ReEncryptFrom`, `ReEncryptTo`, `Sign`, `Verify`, `GetPublicKey`, `CreateGrant`, `RetireGrant`, `DescribeKey`, `GenerateDataKeyPair`, or `GenerateDataKeyPairWithoutPlaintext`.
     */
    operations: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
     * See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
     */
    retireOnDelete?: pulumi.Input<boolean>;
    /**
     * The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
     */
    retiringPrincipal?: pulumi.Input<string>;
}
