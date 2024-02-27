// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing a Roles Anywhere Trust Anchor.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleCertificateAuthority = new aws.acmpca.CertificateAuthority("exampleCertificateAuthority", {
 *     permanentDeletionTimeInDays: 7,
 *     type: "ROOT",
 *     certificateAuthorityConfiguration: {
 *         keyAlgorithm: "RSA_4096",
 *         signingAlgorithm: "SHA512WITHRSA",
 *         subject: {
 *             commonName: "example.com",
 *         },
 *     },
 * });
 * const current = aws.getPartition({});
 * const testCertificate = new aws.acmpca.Certificate("testCertificate", {
 *     certificateAuthorityArn: exampleCertificateAuthority.arn,
 *     certificateSigningRequest: exampleCertificateAuthority.certificateSigningRequest,
 *     signingAlgorithm: "SHA512WITHRSA",
 *     templateArn: current.then(current => `arn:${current.partition}:acm-pca:::template/RootCACertificate/V1`),
 *     validity: {
 *         type: "YEARS",
 *         value: "1",
 *     },
 * });
 * const exampleCertificateAuthorityCertificate = new aws.acmpca.CertificateAuthorityCertificate("exampleCertificateAuthorityCertificate", {
 *     certificateAuthorityArn: exampleCertificateAuthority.arn,
 *     certificate: aws_acmpca_certificate.example.certificate,
 *     certificateChain: aws_acmpca_certificate.example.certificate_chain,
 * });
 * const testTrustAnchor = new aws.rolesanywhere.TrustAnchor("testTrustAnchor", {source: {
 *     sourceData: {
 *         acmPcaArn: exampleCertificateAuthority.arn,
 *     },
 *     sourceType: "AWS_ACM_PCA",
 * }}, {
 *     dependsOn: [exampleCertificateAuthorityCertificate],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_rolesanywhere_trust_anchor` using its `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:rolesanywhere/trustAnchor:TrustAnchor example 92b2fbbb-984d-41a3-a765-e3cbdb69ebb1
 * ```
 */
export class TrustAnchor extends pulumi.CustomResource {
    /**
     * Get an existing TrustAnchor resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TrustAnchorState, opts?: pulumi.CustomResourceOptions): TrustAnchor {
        return new TrustAnchor(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:rolesanywhere/trustAnchor:TrustAnchor';

    /**
     * Returns true if the given object is an instance of TrustAnchor.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TrustAnchor {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TrustAnchor.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) of the Trust Anchor
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Whether or not the Trust Anchor should be enabled.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * The name of the Trust Anchor.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The source of trust, documented below
     */
    public readonly source!: pulumi.Output<outputs.rolesanywhere.TrustAnchorSource>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a TrustAnchor resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TrustAnchorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TrustAnchorArgs | TrustAnchorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TrustAnchorState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as TrustAnchorArgs | undefined;
            if ((!args || args.source === undefined) && !opts.urn) {
                throw new Error("Missing required property 'source'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TrustAnchor.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TrustAnchor resources.
 */
export interface TrustAnchorState {
    /**
     * Amazon Resource Name (ARN) of the Trust Anchor
     */
    arn?: pulumi.Input<string>;
    /**
     * Whether or not the Trust Anchor should be enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The name of the Trust Anchor.
     */
    name?: pulumi.Input<string>;
    /**
     * The source of trust, documented below
     */
    source?: pulumi.Input<inputs.rolesanywhere.TrustAnchorSource>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a TrustAnchor resource.
 */
export interface TrustAnchorArgs {
    /**
     * Whether or not the Trust Anchor should be enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The name of the Trust Anchor.
     */
    name?: pulumi.Input<string>;
    /**
     * The source of trust, documented below
     */
    source: pulumi.Input<inputs.rolesanywhere.TrustAnchorSource>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
