// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an IAM Server Certificate resource to upload Server Certificates.
 * Certs uploaded to IAM can easily work with other AWS services such as:
 *
 * - AWS Elastic Beanstalk
 * - Elastic Load Balancing
 * - CloudFront
 * - AWS OpsWorks
 *
 * For information about server certificates in IAM, see [Managing Server
 * Certificates][2] in AWS Documentation.
 *
 * ## Example Usage
 *
 * **Using certs on file:**
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as fs from "fs";
 *
 * const testCert = new aws.iam.ServerCertificate("testCert", {
 *     certificateBody: fs.readFileSync("self-ca-cert.pem"),
 *     privateKey: fs.readFileSync("test-key.pem"),
 * });
 * ```
 *
 * **Example with cert in-line:**
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const testCertAlt = new aws.iam.ServerCertificate("testCertAlt", {
 *     certificateBody: `-----BEGIN CERTIFICATE-----
 * [......] # cert contents
 * -----END CERTIFICATE-----
 *
 * `,
 *     privateKey: `-----BEGIN RSA PRIVATE KEY-----
 * [......] # cert contents
 * -----END RSA PRIVATE KEY-----
 *
 * `,
 * });
 * ```
 *
 * **Use in combination with an AWS ELB resource:**
 *
 * Some properties of an IAM Server Certificates cannot be updated while they are
 * in use. In order for the provider to effectively manage a Certificate in this situation, it is
 * recommended you utilize the `namePrefix` attribute and enable the
 * `createBeforeDestroy`. This will allow this provider
 * to create a new, updated `aws.iam.ServerCertificate` resource and replace it in
 * dependant resources before attempting to destroy the old version.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as fs from "fs";
 *
 * const testCert = new aws.iam.ServerCertificate("testCert", {
 *     namePrefix: "example-cert",
 *     certificateBody: fs.readFileSync("self-ca-cert.pem"),
 *     privateKey: fs.readFileSync("test-key.pem"),
 * });
 * const ourapp = new aws.elb.LoadBalancer("ourapp", {
 *     availabilityZones: ["us-west-2a"],
 *     crossZoneLoadBalancing: true,
 *     listeners: [{
 *         instancePort: 8000,
 *         instanceProtocol: "http",
 *         lbPort: 443,
 *         lbProtocol: "https",
 *         sslCertificateId: testCert.arn,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import IAM Server Certificates using the `name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:iam/serverCertificate:ServerCertificate certificate example.com-certificate-until-2018
 * ```
 */
export class ServerCertificate extends pulumi.CustomResource {
    /**
     * Get an existing ServerCertificate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerCertificateState, opts?: pulumi.CustomResourceOptions): ServerCertificate {
        return new ServerCertificate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:iam/serverCertificate:ServerCertificate';

    /**
     * Returns true if the given object is an instance of ServerCertificate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServerCertificate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServerCertificate.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) specifying the server certificate.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The contents of the public key certificate in
     * PEM-encoded format.
     */
    public readonly certificateBody!: pulumi.Output<string>;
    /**
     * The contents of the certificate chain.
     * This is typically a concatenation of the PEM-encoded public key certificates
     * of the chain.
     */
    public readonly certificateChain!: pulumi.Output<string | undefined>;
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) on which the certificate is set to expire.
     */
    public /*out*/ readonly expiration!: pulumi.Output<string>;
    /**
     * The name of the Server Certificate. Do not include the
     * path in this value. If omitted, the provider will assign a random, unique name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     */
    public readonly namePrefix!: pulumi.Output<string>;
    /**
     * The IAM path for the server certificate.  If it is not
     * included, it defaults to a slash (/). If this certificate is for use with
     * AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
     * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
     */
    public readonly path!: pulumi.Output<string | undefined>;
    /**
     * The contents of the private key in PEM-encoded format.
     */
    public readonly privateKey!: pulumi.Output<string>;
    /**
     * Map of resource tags for the server certificate. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     *
     * > **NOTE:** AWS performs behind-the-scenes modifications to some certificate files if they do not adhere to a specific format. These modifications will result in this provider forever believing that it needs to update the resources since the local and AWS file contents will not match after theses modifications occur. In order to prevent this from happening you must ensure that all your PEM-encoded files use UNIX line-breaks and that `certificateBody` contains only one certificate. All other certificates should go in `certificateChain`. It is common for some Certificate Authorities to issue certificate files that have DOS line-breaks and that are actually multiple certificates concatenated together in order to form a full certificate chain.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) when the server certificate was uploaded.
     */
    public /*out*/ readonly uploadDate!: pulumi.Output<string>;

    /**
     * Create a ServerCertificate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerCertificateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerCertificateArgs | ServerCertificateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerCertificateState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["certificateBody"] = state ? state.certificateBody : undefined;
            resourceInputs["certificateChain"] = state ? state.certificateChain : undefined;
            resourceInputs["expiration"] = state ? state.expiration : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namePrefix"] = state ? state.namePrefix : undefined;
            resourceInputs["path"] = state ? state.path : undefined;
            resourceInputs["privateKey"] = state ? state.privateKey : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["uploadDate"] = state ? state.uploadDate : undefined;
        } else {
            const args = argsOrState as ServerCertificateArgs | undefined;
            if ((!args || args.certificateBody === undefined) && !opts.urn) {
                throw new Error("Missing required property 'certificateBody'");
            }
            if ((!args || args.privateKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'privateKey'");
            }
            resourceInputs["certificateBody"] = args ? args.certificateBody : undefined;
            resourceInputs["certificateChain"] = args ? args.certificateChain : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namePrefix"] = args ? args.namePrefix : undefined;
            resourceInputs["path"] = args ? args.path : undefined;
            resourceInputs["privateKey"] = args?.privateKey ? pulumi.secret(args.privateKey) : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["expiration"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["uploadDate"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["privateKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ServerCertificate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServerCertificate resources.
 */
export interface ServerCertificateState {
    /**
     * The Amazon Resource Name (ARN) specifying the server certificate.
     */
    arn?: pulumi.Input<string>;
    /**
     * The contents of the public key certificate in
     * PEM-encoded format.
     */
    certificateBody?: pulumi.Input<string>;
    /**
     * The contents of the certificate chain.
     * This is typically a concatenation of the PEM-encoded public key certificates
     * of the chain.
     */
    certificateChain?: pulumi.Input<string>;
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) on which the certificate is set to expire.
     */
    expiration?: pulumi.Input<string>;
    /**
     * The name of the Server Certificate. Do not include the
     * path in this value. If omitted, the provider will assign a random, unique name.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * The IAM path for the server certificate.  If it is not
     * included, it defaults to a slash (/). If this certificate is for use with
     * AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
     * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
     */
    path?: pulumi.Input<string>;
    /**
     * The contents of the private key in PEM-encoded format.
     */
    privateKey?: pulumi.Input<string>;
    /**
     * Map of resource tags for the server certificate. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     *
     * > **NOTE:** AWS performs behind-the-scenes modifications to some certificate files if they do not adhere to a specific format. These modifications will result in this provider forever believing that it needs to update the resources since the local and AWS file contents will not match after theses modifications occur. In order to prevent this from happening you must ensure that all your PEM-encoded files use UNIX line-breaks and that `certificateBody` contains only one certificate. All other certificates should go in `certificateChain`. It is common for some Certificate Authorities to issue certificate files that have DOS line-breaks and that are actually multiple certificates concatenated together in order to form a full certificate chain.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) when the server certificate was uploaded.
     */
    uploadDate?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServerCertificate resource.
 */
export interface ServerCertificateArgs {
    /**
     * The contents of the public key certificate in
     * PEM-encoded format.
     */
    certificateBody: pulumi.Input<string>;
    /**
     * The contents of the certificate chain.
     * This is typically a concatenation of the PEM-encoded public key certificates
     * of the chain.
     */
    certificateChain?: pulumi.Input<string>;
    /**
     * The name of the Server Certificate. Do not include the
     * path in this value. If omitted, the provider will assign a random, unique name.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * The IAM path for the server certificate.  If it is not
     * included, it defaults to a slash (/). If this certificate is for use with
     * AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
     * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
     */
    path?: pulumi.Input<string>;
    /**
     * The contents of the private key in PEM-encoded format.
     */
    privateKey: pulumi.Input<string>;
    /**
     * Map of resource tags for the server certificate. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     *
     * > **NOTE:** AWS performs behind-the-scenes modifications to some certificate files if they do not adhere to a specific format. These modifications will result in this provider forever believing that it needs to update the resources since the local and AWS file contents will not match after theses modifications occur. In order to prevent this from happening you must ensure that all your PEM-encoded files use UNIX line-breaks and that `certificateBody` contains only one certificate. All other certificates should go in `certificateChain`. It is common for some Certificate Authorities to issue certificate files that have DOS line-breaks and that are actually multiple certificates concatenated together in order to form a full certificate chain.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
