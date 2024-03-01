// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Creates a Signer Signing Profile Permission. That is, a cross-account permission for a signing profile.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const prodSp = new aws.signer.SigningProfile("prod_sp", {
 *     platformId: "AWSLambda-SHA384-ECDSA",
 *     namePrefix: "prod_sp_",
 *     signatureValidityPeriod: {
 *         value: 5,
 *         type: "YEARS",
 *     },
 *     tags: {
 *         tag1: "value1",
 *         tag2: "value2",
 *     },
 * });
 * const spPermission1 = new aws.signer.SigningProfilePermission("sp_permission_1", {
 *     profileName: prodSp.name,
 *     action: "signer:StartSigningJob",
 *     principal: awsAccount,
 * });
 * const spPermission2 = new aws.signer.SigningProfilePermission("sp_permission_2", {
 *     profileName: prodSp.name,
 *     action: "signer:GetSigningProfile",
 *     principal: awsTeamRoleArn,
 *     statementId: "ProdAccountStartSigningJob_StatementId",
 * });
 * const spPermission3 = new aws.signer.SigningProfilePermission("sp_permission_3", {
 *     profileName: prodSp.name,
 *     action: "signer:RevokeSignature",
 *     principal: "123456789012",
 *     profileVersion: prodSp.version,
 *     statementIdPrefix: "version-permission-",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Signer signing profile permission statements using profile_name/statement_id. For example:
 *
 * ```sh
 *  $ pulumi import aws:signer/signingProfilePermission:SigningProfilePermission test_signer_signing_profile_permission prod_profile_DdW3Mk1foYL88fajut4mTVFGpuwfd4ACO6ANL0D1uIj7lrn8adK/ProdAccountStartSigningJobStatementId
 * ```
 */
export class SigningProfilePermission extends pulumi.CustomResource {
    /**
     * Get an existing SigningProfilePermission resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SigningProfilePermissionState, opts?: pulumi.CustomResourceOptions): SigningProfilePermission {
        return new SigningProfilePermission(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:signer/signingProfilePermission:SigningProfilePermission';

    /**
     * Returns true if the given object is an instance of SigningProfilePermission.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SigningProfilePermission {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SigningProfilePermission.__pulumiType;
    }

    /**
     * An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, `signer:RevokeSignature`, or `signer:SignPayload`.
     */
    public readonly action!: pulumi.Output<string>;
    /**
     * The AWS principal to be granted a cross-account permission.
     */
    public readonly principal!: pulumi.Output<string>;
    /**
     * Name of the signing profile to add the cross-account permissions.
     */
    public readonly profileName!: pulumi.Output<string>;
    /**
     * The signing profile version that a permission applies to.
     */
    public readonly profileVersion!: pulumi.Output<string>;
    /**
     * A unique statement identifier. By default generated by the provider.
     */
    public readonly statementId!: pulumi.Output<string>;
    /**
     * A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statementId`.
     */
    public readonly statementIdPrefix!: pulumi.Output<string>;

    /**
     * Create a SigningProfilePermission resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SigningProfilePermissionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SigningProfilePermissionArgs | SigningProfilePermissionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SigningProfilePermissionState | undefined;
            resourceInputs["action"] = state ? state.action : undefined;
            resourceInputs["principal"] = state ? state.principal : undefined;
            resourceInputs["profileName"] = state ? state.profileName : undefined;
            resourceInputs["profileVersion"] = state ? state.profileVersion : undefined;
            resourceInputs["statementId"] = state ? state.statementId : undefined;
            resourceInputs["statementIdPrefix"] = state ? state.statementIdPrefix : undefined;
        } else {
            const args = argsOrState as SigningProfilePermissionArgs | undefined;
            if ((!args || args.action === undefined) && !opts.urn) {
                throw new Error("Missing required property 'action'");
            }
            if ((!args || args.principal === undefined) && !opts.urn) {
                throw new Error("Missing required property 'principal'");
            }
            if ((!args || args.profileName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'profileName'");
            }
            resourceInputs["action"] = args ? args.action : undefined;
            resourceInputs["principal"] = args ? args.principal : undefined;
            resourceInputs["profileName"] = args ? args.profileName : undefined;
            resourceInputs["profileVersion"] = args ? args.profileVersion : undefined;
            resourceInputs["statementId"] = args ? args.statementId : undefined;
            resourceInputs["statementIdPrefix"] = args ? args.statementIdPrefix : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SigningProfilePermission.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SigningProfilePermission resources.
 */
export interface SigningProfilePermissionState {
    /**
     * An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, `signer:RevokeSignature`, or `signer:SignPayload`.
     */
    action?: pulumi.Input<string>;
    /**
     * The AWS principal to be granted a cross-account permission.
     */
    principal?: pulumi.Input<string>;
    /**
     * Name of the signing profile to add the cross-account permissions.
     */
    profileName?: pulumi.Input<string>;
    /**
     * The signing profile version that a permission applies to.
     */
    profileVersion?: pulumi.Input<string>;
    /**
     * A unique statement identifier. By default generated by the provider.
     */
    statementId?: pulumi.Input<string>;
    /**
     * A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statementId`.
     */
    statementIdPrefix?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SigningProfilePermission resource.
 */
export interface SigningProfilePermissionArgs {
    /**
     * An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, `signer:RevokeSignature`, or `signer:SignPayload`.
     */
    action: pulumi.Input<string>;
    /**
     * The AWS principal to be granted a cross-account permission.
     */
    principal: pulumi.Input<string>;
    /**
     * Name of the signing profile to add the cross-account permissions.
     */
    profileName: pulumi.Input<string>;
    /**
     * The signing profile version that a permission applies to.
     */
    profileVersion?: pulumi.Input<string>;
    /**
     * A unique statement identifier. By default generated by the provider.
     */
    statementId?: pulumi.Input<string>;
    /**
     * A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statementId`.
     */
    statementIdPrefix?: pulumi.Input<string>;
}
