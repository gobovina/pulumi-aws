// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * const example = new aws.worklink.Fleet("example", {name: "example"});
 * const test = new aws.worklink.WebsiteCertificateAuthorityAssociation("test", {
 *     fleetArn: testAwsWorklinkFleet.arn,
 *     certificate: std.file({
 *         input: "certificate.pem",
 *     }).then(invoke => invoke.result),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import WorkLink Website Certificate Authority using `FLEET-ARN,WEBSITE-CA-ID`. For example:
 *
 * ```sh
 * $ pulumi import aws:worklink/websiteCertificateAuthorityAssociation:WebsiteCertificateAuthorityAssociation example arn:aws:worklink::123456789012:fleet/example,abcdefghijk
 * ```
 */
export class WebsiteCertificateAuthorityAssociation extends pulumi.CustomResource {
    /**
     * Get an existing WebsiteCertificateAuthorityAssociation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WebsiteCertificateAuthorityAssociationState, opts?: pulumi.CustomResourceOptions): WebsiteCertificateAuthorityAssociation {
        return new WebsiteCertificateAuthorityAssociation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:worklink/websiteCertificateAuthorityAssociation:WebsiteCertificateAuthorityAssociation';

    /**
     * Returns true if the given object is an instance of WebsiteCertificateAuthorityAssociation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WebsiteCertificateAuthorityAssociation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WebsiteCertificateAuthorityAssociation.__pulumiType;
    }

    /**
     * The root certificate of the Certificate Authority.
     */
    public readonly certificate!: pulumi.Output<string>;
    /**
     * The certificate name to display.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * The ARN of the fleet.
     */
    public readonly fleetArn!: pulumi.Output<string>;
    /**
     * A unique identifier for the Certificate Authority.
     */
    public /*out*/ readonly websiteCaId!: pulumi.Output<string>;

    /**
     * Create a WebsiteCertificateAuthorityAssociation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WebsiteCertificateAuthorityAssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WebsiteCertificateAuthorityAssociationArgs | WebsiteCertificateAuthorityAssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WebsiteCertificateAuthorityAssociationState | undefined;
            resourceInputs["certificate"] = state ? state.certificate : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["fleetArn"] = state ? state.fleetArn : undefined;
            resourceInputs["websiteCaId"] = state ? state.websiteCaId : undefined;
        } else {
            const args = argsOrState as WebsiteCertificateAuthorityAssociationArgs | undefined;
            if ((!args || args.certificate === undefined) && !opts.urn) {
                throw new Error("Missing required property 'certificate'");
            }
            if ((!args || args.fleetArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fleetArn'");
            }
            resourceInputs["certificate"] = args ? args.certificate : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["fleetArn"] = args ? args.fleetArn : undefined;
            resourceInputs["websiteCaId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WebsiteCertificateAuthorityAssociation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WebsiteCertificateAuthorityAssociation resources.
 */
export interface WebsiteCertificateAuthorityAssociationState {
    /**
     * The root certificate of the Certificate Authority.
     */
    certificate?: pulumi.Input<string>;
    /**
     * The certificate name to display.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The ARN of the fleet.
     */
    fleetArn?: pulumi.Input<string>;
    /**
     * A unique identifier for the Certificate Authority.
     */
    websiteCaId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WebsiteCertificateAuthorityAssociation resource.
 */
export interface WebsiteCertificateAuthorityAssociationArgs {
    /**
     * The root certificate of the Certificate Authority.
     */
    certificate: pulumi.Input<string>;
    /**
     * The certificate name to display.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The ARN of the fleet.
     */
    fleetArn: pulumi.Input<string>;
}
