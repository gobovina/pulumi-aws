// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an SES domain MAIL FROM resource.
 *
 * > **NOTE:** For the MAIL FROM domain to be fully usable, this resource should be paired with the aws.ses.DomainIdentity resource. To validate the MAIL FROM domain, a DNS MX record is required. To pass SPF checks, a DNS TXT record may also be required. See the [Amazon SES MAIL FROM documentation](https://docs.aws.amazon.com/ses/latest/dg/mail-from.html) for more information.
 *
 * ## Example Usage
 * ### Domain Identity MAIL FROM
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * // Example SES Domain Identity
 * const exampleDomainIdentity = new aws.ses.DomainIdentity("exampleDomainIdentity", {domain: "example.com"});
 * const exampleMailFrom = new aws.ses.MailFrom("exampleMailFrom", {
 *     domain: exampleDomainIdentity.domain,
 *     mailFromDomain: pulumi.interpolate`bounce.${exampleDomainIdentity.domain}`,
 * });
 * // Example Route53 MX record
 * const exampleSesDomainMailFromMx = new aws.route53.Record("exampleSesDomainMailFromMx", {
 *     zoneId: aws_route53_zone.example.id,
 *     name: exampleMailFrom.mailFromDomain,
 *     type: "MX",
 *     ttl: "600",
 *     records: ["10 feedback-smtp.us-east-1.amazonses.com"],
 * });
 * // Change to the region in which `aws_ses_domain_identity.example` is created
 * // Example Route53 TXT record for SPF
 * const exampleSesDomainMailFromTxt = new aws.route53.Record("exampleSesDomainMailFromTxt", {
 *     zoneId: aws_route53_zone.example.id,
 *     name: exampleMailFrom.mailFromDomain,
 *     type: "TXT",
 *     ttl: "600",
 *     records: ["v=spf1 include:amazonses.com -all"],
 * });
 * ```
 * ### Email Identity MAIL FROM
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * // Example SES Email Identity
 * const exampleEmailIdentity = new aws.ses.EmailIdentity("exampleEmailIdentity", {email: "user@example.com"});
 * const exampleMailFrom = new aws.ses.MailFrom("exampleMailFrom", {
 *     domain: exampleEmailIdentity.email,
 *     mailFromDomain: "mail.example.com",
 * });
 * ```
 *
 * ## Import
 *
 * MAIL FROM domain can be imported using the `domain` attribute, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:ses/mailFrom:MailFrom example example.com
 * ```
 */
export class MailFrom extends pulumi.CustomResource {
    /**
     * Get an existing MailFrom resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MailFromState, opts?: pulumi.CustomResourceOptions): MailFrom {
        return new MailFrom(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ses/mailFrom:MailFrom';

    /**
     * Returns true if the given object is an instance of MailFrom.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MailFrom {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MailFrom.__pulumiType;
    }

    /**
     * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
     */
    public readonly behaviorOnMxFailure!: pulumi.Output<string | undefined>;
    /**
     * Verified domain name or email identity to generate DKIM tokens for.
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
     */
    public readonly mailFromDomain!: pulumi.Output<string>;

    /**
     * Create a MailFrom resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MailFromArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MailFromArgs | MailFromState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MailFromState | undefined;
            resourceInputs["behaviorOnMxFailure"] = state ? state.behaviorOnMxFailure : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["mailFromDomain"] = state ? state.mailFromDomain : undefined;
        } else {
            const args = argsOrState as MailFromArgs | undefined;
            if ((!args || args.domain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domain'");
            }
            if ((!args || args.mailFromDomain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mailFromDomain'");
            }
            resourceInputs["behaviorOnMxFailure"] = args ? args.behaviorOnMxFailure : undefined;
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["mailFromDomain"] = args ? args.mailFromDomain : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MailFrom.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MailFrom resources.
 */
export interface MailFromState {
    /**
     * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
     */
    behaviorOnMxFailure?: pulumi.Input<string>;
    /**
     * Verified domain name or email identity to generate DKIM tokens for.
     */
    domain?: pulumi.Input<string>;
    /**
     * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
     */
    mailFromDomain?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MailFrom resource.
 */
export interface MailFromArgs {
    /**
     * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
     */
    behaviorOnMxFailure?: pulumi.Input<string>;
    /**
     * Verified domain name or email identity to generate DKIM tokens for.
     */
    domain: pulumi.Input<string>;
    /**
     * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
     */
    mailFromDomain: pulumi.Input<string>;
}
