// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a resource to manage AWS Certificate Manager Private Certificate Authorities (ACM PCA Certificate Authorities).
 *
 * > **NOTE:** Creating this resource will leave the certificate authority in a `PENDING_CERTIFICATE` status, which means it cannot yet issue certificates. To complete this setup, you must fully sign the certificate authority CSR available in the `certificateSigningRequest` attribute. The `aws.acmpca.CertificateAuthorityCertificate` resource can be used for this purpose.
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
 * const example = new aws.acmpca.CertificateAuthority("example", {
 *     certificateAuthorityConfiguration: {
 *         keyAlgorithm: "RSA_4096",
 *         signingAlgorithm: "SHA512WITHRSA",
 *         subject: {
 *             commonName: "example.com",
 *         },
 *     },
 *     permanentDeletionTimeInDays: 7,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Short-lived certificate
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.acmpca.CertificateAuthority("example", {
 *     usageMode: "SHORT_LIVED_CERTIFICATE",
 *     certificateAuthorityConfiguration: {
 *         keyAlgorithm: "RSA_4096",
 *         signingAlgorithm: "SHA512WITHRSA",
 *         subject: {
 *             commonName: "example.com",
 *         },
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Enable Certificate Revocation List
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.s3.BucketV2("example", {
 *     bucket: "example",
 *     forceDestroy: true,
 * });
 * const acmpcaBucketAccess = aws.iam.getPolicyDocumentOutput({
 *     statements: [{
 *         actions: [
 *             "s3:GetBucketAcl",
 *             "s3:GetBucketLocation",
 *             "s3:PutObject",
 *             "s3:PutObjectAcl",
 *         ],
 *         resources: [
 *             example.arn,
 *             pulumi.interpolate`${example.arn}/*`,
 *         ],
 *         principals: [{
 *             identifiers: ["acm-pca.amazonaws.com"],
 *             type: "Service",
 *         }],
 *     }],
 * });
 * const exampleBucketPolicy = new aws.s3.BucketPolicy("example", {
 *     bucket: example.id,
 *     policy: acmpcaBucketAccess.apply(acmpcaBucketAccess => acmpcaBucketAccess.json),
 * });
 * const exampleCertificateAuthority = new aws.acmpca.CertificateAuthority("example", {
 *     certificateAuthorityConfiguration: {
 *         keyAlgorithm: "RSA_4096",
 *         signingAlgorithm: "SHA512WITHRSA",
 *         subject: {
 *             commonName: "example.com",
 *         },
 *     },
 *     revocationConfiguration: {
 *         crlConfiguration: {
 *             customCname: "crl.example.com",
 *             enabled: true,
 *             expirationInDays: 7,
 *             s3BucketName: example.id,
 *             s3ObjectAcl: "BUCKET_OWNER_FULL_CONTROL",
 *         },
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_acmpca_certificate_authority` using the certificate authority ARN. For example:
 *
 * ```sh
 * $ pulumi import aws:acmpca/certificateAuthority:CertificateAuthority example arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012
 * ```
 */
export class CertificateAuthority extends pulumi.CustomResource {
    /**
     * Get an existing CertificateAuthority resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CertificateAuthorityState, opts?: pulumi.CustomResourceOptions): CertificateAuthority {
        return new CertificateAuthority(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:acmpca/certificateAuthority:CertificateAuthority';

    /**
     * Returns true if the given object is an instance of CertificateAuthority.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CertificateAuthority {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CertificateAuthority.__pulumiType;
    }

    /**
     * ARN of the certificate authority.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
     */
    public /*out*/ readonly certificate!: pulumi.Output<string>;
    /**
     * Nested argument containing algorithms and certificate subject information. Defined below.
     */
    public readonly certificateAuthorityConfiguration!: pulumi.Output<outputs.acmpca.CertificateAuthorityCertificateAuthorityConfiguration>;
    /**
     * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
     */
    public /*out*/ readonly certificateChain!: pulumi.Output<string>;
    /**
     * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     */
    public /*out*/ readonly certificateSigningRequest!: pulumi.Output<string>;
    /**
     * Whether the certificate authority is enabled or disabled. Defaults to `true`. Can only be disabled if the CA is in an `ACTIVE` state.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Cryptographic key management compliance standard used for handling CA keys. Defaults to `FIPS_140_2_LEVEL_3_OR_HIGHER`. Valid values: `FIPS_140_2_LEVEL_3_OR_HIGHER` and `FIPS_140_2_LEVEL_2_OR_HIGHER`. Supported standard for each region can be found in the [Storage and security compliance of AWS Private CA private keys Documentation](https://docs.aws.amazon.com/privateca/latest/userguide/data-protection.html#private-keys).
     */
    public readonly keyStorageSecurityStandard!: pulumi.Output<string>;
    /**
     * Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     */
    public /*out*/ readonly notAfter!: pulumi.Output<string>;
    /**
     * Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     */
    public /*out*/ readonly notBefore!: pulumi.Output<string>;
    /**
     * Number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
     */
    public readonly permanentDeletionTimeInDays!: pulumi.Output<number | undefined>;
    /**
     * Nested argument containing revocation configuration. Defined below.
     */
    public readonly revocationConfiguration!: pulumi.Output<outputs.acmpca.CertificateAuthorityRevocationConfiguration | undefined>;
    /**
     * Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
     */
    public /*out*/ readonly serial!: pulumi.Output<string>;
    /**
     * Key-value map of user-defined tags that are attached to the certificate authority. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * Specifies whether the CA issues general-purpose certificates that typically require a revocation mechanism, or short-lived certificates that may optionally omit revocation because they expire quickly. Short-lived certificate validity is limited to seven days. Defaults to `GENERAL_PURPOSE`. Valid values: `GENERAL_PURPOSE` and `SHORT_LIVED_CERTIFICATE`.
     */
    public readonly usageMode!: pulumi.Output<string>;

    /**
     * Create a CertificateAuthority resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CertificateAuthorityArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CertificateAuthorityArgs | CertificateAuthorityState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CertificateAuthorityState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["certificate"] = state ? state.certificate : undefined;
            resourceInputs["certificateAuthorityConfiguration"] = state ? state.certificateAuthorityConfiguration : undefined;
            resourceInputs["certificateChain"] = state ? state.certificateChain : undefined;
            resourceInputs["certificateSigningRequest"] = state ? state.certificateSigningRequest : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["keyStorageSecurityStandard"] = state ? state.keyStorageSecurityStandard : undefined;
            resourceInputs["notAfter"] = state ? state.notAfter : undefined;
            resourceInputs["notBefore"] = state ? state.notBefore : undefined;
            resourceInputs["permanentDeletionTimeInDays"] = state ? state.permanentDeletionTimeInDays : undefined;
            resourceInputs["revocationConfiguration"] = state ? state.revocationConfiguration : undefined;
            resourceInputs["serial"] = state ? state.serial : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["usageMode"] = state ? state.usageMode : undefined;
        } else {
            const args = argsOrState as CertificateAuthorityArgs | undefined;
            if ((!args || args.certificateAuthorityConfiguration === undefined) && !opts.urn) {
                throw new Error("Missing required property 'certificateAuthorityConfiguration'");
            }
            resourceInputs["certificateAuthorityConfiguration"] = args ? args.certificateAuthorityConfiguration : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["keyStorageSecurityStandard"] = args ? args.keyStorageSecurityStandard : undefined;
            resourceInputs["permanentDeletionTimeInDays"] = args ? args.permanentDeletionTimeInDays : undefined;
            resourceInputs["revocationConfiguration"] = args ? args.revocationConfiguration : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["usageMode"] = args ? args.usageMode : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["certificate"] = undefined /*out*/;
            resourceInputs["certificateChain"] = undefined /*out*/;
            resourceInputs["certificateSigningRequest"] = undefined /*out*/;
            resourceInputs["notAfter"] = undefined /*out*/;
            resourceInputs["notBefore"] = undefined /*out*/;
            resourceInputs["serial"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CertificateAuthority.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CertificateAuthority resources.
 */
export interface CertificateAuthorityState {
    /**
     * ARN of the certificate authority.
     */
    arn?: pulumi.Input<string>;
    /**
     * Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
     */
    certificate?: pulumi.Input<string>;
    /**
     * Nested argument containing algorithms and certificate subject information. Defined below.
     */
    certificateAuthorityConfiguration?: pulumi.Input<inputs.acmpca.CertificateAuthorityCertificateAuthorityConfiguration>;
    /**
     * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
     */
    certificateChain?: pulumi.Input<string>;
    /**
     * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     */
    certificateSigningRequest?: pulumi.Input<string>;
    /**
     * Whether the certificate authority is enabled or disabled. Defaults to `true`. Can only be disabled if the CA is in an `ACTIVE` state.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Cryptographic key management compliance standard used for handling CA keys. Defaults to `FIPS_140_2_LEVEL_3_OR_HIGHER`. Valid values: `FIPS_140_2_LEVEL_3_OR_HIGHER` and `FIPS_140_2_LEVEL_2_OR_HIGHER`. Supported standard for each region can be found in the [Storage and security compliance of AWS Private CA private keys Documentation](https://docs.aws.amazon.com/privateca/latest/userguide/data-protection.html#private-keys).
     */
    keyStorageSecurityStandard?: pulumi.Input<string>;
    /**
     * Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     */
    notAfter?: pulumi.Input<string>;
    /**
     * Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     */
    notBefore?: pulumi.Input<string>;
    /**
     * Number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
     */
    permanentDeletionTimeInDays?: pulumi.Input<number>;
    /**
     * Nested argument containing revocation configuration. Defined below.
     */
    revocationConfiguration?: pulumi.Input<inputs.acmpca.CertificateAuthorityRevocationConfiguration>;
    /**
     * Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
     */
    serial?: pulumi.Input<string>;
    /**
     * Key-value map of user-defined tags that are attached to the certificate authority. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
     */
    type?: pulumi.Input<string>;
    /**
     * Specifies whether the CA issues general-purpose certificates that typically require a revocation mechanism, or short-lived certificates that may optionally omit revocation because they expire quickly. Short-lived certificate validity is limited to seven days. Defaults to `GENERAL_PURPOSE`. Valid values: `GENERAL_PURPOSE` and `SHORT_LIVED_CERTIFICATE`.
     */
    usageMode?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CertificateAuthority resource.
 */
export interface CertificateAuthorityArgs {
    /**
     * Nested argument containing algorithms and certificate subject information. Defined below.
     */
    certificateAuthorityConfiguration: pulumi.Input<inputs.acmpca.CertificateAuthorityCertificateAuthorityConfiguration>;
    /**
     * Whether the certificate authority is enabled or disabled. Defaults to `true`. Can only be disabled if the CA is in an `ACTIVE` state.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Cryptographic key management compliance standard used for handling CA keys. Defaults to `FIPS_140_2_LEVEL_3_OR_HIGHER`. Valid values: `FIPS_140_2_LEVEL_3_OR_HIGHER` and `FIPS_140_2_LEVEL_2_OR_HIGHER`. Supported standard for each region can be found in the [Storage and security compliance of AWS Private CA private keys Documentation](https://docs.aws.amazon.com/privateca/latest/userguide/data-protection.html#private-keys).
     */
    keyStorageSecurityStandard?: pulumi.Input<string>;
    /**
     * Number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
     */
    permanentDeletionTimeInDays?: pulumi.Input<number>;
    /**
     * Nested argument containing revocation configuration. Defined below.
     */
    revocationConfiguration?: pulumi.Input<inputs.acmpca.CertificateAuthorityRevocationConfiguration>;
    /**
     * Key-value map of user-defined tags that are attached to the certificate authority. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
     */
    type?: pulumi.Input<string>;
    /**
     * Specifies whether the CA issues general-purpose certificates that typically require a revocation mechanism, or short-lived certificates that may optionally omit revocation because they expire quickly. Short-lived certificate validity is limited to seven days. Defaults to `GENERAL_PURPOSE`. Valid values: `GENERAL_PURPOSE` and `SHORT_LIVED_CERTIFICATE`.
     */
    usageMode?: pulumi.Input<string>;
}
