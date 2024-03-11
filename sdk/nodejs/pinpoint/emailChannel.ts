// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Pinpoint Email Channel resource.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const app = new aws.pinpoint.App("app", {});
 * const assumeRole = aws.iam.getPolicyDocument({
 *     statements: [{
 *         effect: "Allow",
 *         principals: [{
 *             type: "Service",
 *             identifiers: ["pinpoint.amazonaws.com"],
 *         }],
 *         actions: ["sts:AssumeRole"],
 *     }],
 * });
 * const role = new aws.iam.Role("role", {assumeRolePolicy: assumeRole.then(assumeRole => assumeRole.json)});
 * const email = new aws.pinpoint.EmailChannel("email", {
 *     applicationId: app.applicationId,
 *     fromAddress: "user@example.com",
 *     roleArn: role.arn,
 * });
 * const identity = new aws.ses.DomainIdentity("identity", {domain: "example.com"});
 * const rolePolicy = aws.iam.getPolicyDocument({
 *     statements: [{
 *         effect: "Allow",
 *         actions: [
 *             "mobileanalytics:PutEvents",
 *             "mobileanalytics:PutItems",
 *         ],
 *         resources: ["*"],
 *     }],
 * });
 * const rolePolicyRolePolicy = new aws.iam.RolePolicy("role_policy", {
 *     name: "role_policy",
 *     role: role.id,
 *     policy: rolePolicy.then(rolePolicy => rolePolicy.json),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Pinpoint Email Channel using the `application-id`. For example:
 *
 * ```sh
 * $ pulumi import aws:pinpoint/emailChannel:EmailChannel email application-id
 * ```
 */
export class EmailChannel extends pulumi.CustomResource {
    /**
     * Get an existing EmailChannel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EmailChannelState, opts?: pulumi.CustomResourceOptions): EmailChannel {
        return new EmailChannel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:pinpoint/emailChannel:EmailChannel';

    /**
     * Returns true if the given object is an instance of EmailChannel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EmailChannel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EmailChannel.__pulumiType;
    }

    /**
     * The application ID.
     */
    public readonly applicationId!: pulumi.Output<string>;
    /**
     * The ARN of the Amazon SES configuration set that you want to apply to messages that you send through the channel.
     */
    public readonly configurationSet!: pulumi.Output<string | undefined>;
    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The email address used to send emails from. You can use email only (`user@example.com`) or friendly address (`User <user@example.com>`). This field comply with [RFC 5322](https://www.ietf.org/rfc/rfc5322.txt).
     */
    public readonly fromAddress!: pulumi.Output<string>;
    /**
     * The ARN of an identity verified with SES.
     */
    public readonly identity!: pulumi.Output<string>;
    /**
     * Messages per second that can be sent.
     */
    public /*out*/ readonly messagesPerSecond!: pulumi.Output<number>;
    /**
     * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
     */
    public readonly roleArn!: pulumi.Output<string | undefined>;

    /**
     * Create a EmailChannel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EmailChannelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EmailChannelArgs | EmailChannelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EmailChannelState | undefined;
            resourceInputs["applicationId"] = state ? state.applicationId : undefined;
            resourceInputs["configurationSet"] = state ? state.configurationSet : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["fromAddress"] = state ? state.fromAddress : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["messagesPerSecond"] = state ? state.messagesPerSecond : undefined;
            resourceInputs["roleArn"] = state ? state.roleArn : undefined;
        } else {
            const args = argsOrState as EmailChannelArgs | undefined;
            if ((!args || args.applicationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'applicationId'");
            }
            if ((!args || args.fromAddress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fromAddress'");
            }
            if ((!args || args.identity === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identity'");
            }
            resourceInputs["applicationId"] = args ? args.applicationId : undefined;
            resourceInputs["configurationSet"] = args ? args.configurationSet : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["fromAddress"] = args ? args.fromAddress : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["roleArn"] = args ? args.roleArn : undefined;
            resourceInputs["messagesPerSecond"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EmailChannel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EmailChannel resources.
 */
export interface EmailChannelState {
    /**
     * The application ID.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * The ARN of the Amazon SES configuration set that you want to apply to messages that you send through the channel.
     */
    configurationSet?: pulumi.Input<string>;
    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The email address used to send emails from. You can use email only (`user@example.com`) or friendly address (`User <user@example.com>`). This field comply with [RFC 5322](https://www.ietf.org/rfc/rfc5322.txt).
     */
    fromAddress?: pulumi.Input<string>;
    /**
     * The ARN of an identity verified with SES.
     */
    identity?: pulumi.Input<string>;
    /**
     * Messages per second that can be sent.
     */
    messagesPerSecond?: pulumi.Input<number>;
    /**
     * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
     */
    roleArn?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EmailChannel resource.
 */
export interface EmailChannelArgs {
    /**
     * The application ID.
     */
    applicationId: pulumi.Input<string>;
    /**
     * The ARN of the Amazon SES configuration set that you want to apply to messages that you send through the channel.
     */
    configurationSet?: pulumi.Input<string>;
    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The email address used to send emails from. You can use email only (`user@example.com`) or friendly address (`User <user@example.com>`). This field comply with [RFC 5322](https://www.ietf.org/rfc/rfc5322.txt).
     */
    fromAddress: pulumi.Input<string>;
    /**
     * The ARN of an identity verified with SES.
     */
    identity: pulumi.Input<string>;
    /**
     * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
     */
    roleArn?: pulumi.Input<string>;
}
