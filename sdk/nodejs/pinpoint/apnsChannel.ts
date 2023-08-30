// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Pinpoint APNs Channel resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as fs from "fs";
 *
 * const app = new aws.pinpoint.App("app", {});
 * const apns = new aws.pinpoint.ApnsChannel("apns", {
 *     applicationId: app.applicationId,
 *     certificate: fs.readFileSync("./certificate.pem"),
 *     privateKey: fs.readFileSync("./private_key.key"),
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Pinpoint APNs Channel using the `application-id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:pinpoint/apnsChannel:ApnsChannel apns application-id
 * ```
 */
export class ApnsChannel extends pulumi.CustomResource {
    /**
     * Get an existing ApnsChannel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApnsChannelState, opts?: pulumi.CustomResourceOptions): ApnsChannel {
        return new ApnsChannel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:pinpoint/apnsChannel:ApnsChannel';

    /**
     * Returns true if the given object is an instance of ApnsChannel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApnsChannel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApnsChannel.__pulumiType;
    }

    /**
     * The application ID.
     */
    public readonly applicationId!: pulumi.Output<string>;
    /**
     * The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
     */
    public readonly bundleId!: pulumi.Output<string | undefined>;
    /**
     * The pem encoded TLS Certificate from Apple.
     */
    public readonly certificate!: pulumi.Output<string | undefined>;
    /**
     * The default authentication method used for APNs.
     * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
     * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
     * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
     *
     * One of the following sets of credentials is also required.
     *
     * If you choose to use __Certificate credentials__ you will have to provide:
     */
    public readonly defaultAuthenticationMethod!: pulumi.Output<string | undefined>;
    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The Certificate Private Key file (ie. `.key` file).
     *
     * If you choose to use __Key credentials__ you will have to provide:
     */
    public readonly privateKey!: pulumi.Output<string | undefined>;
    /**
     * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
     */
    public readonly teamId!: pulumi.Output<string | undefined>;
    /**
     * The `.p8` file that you download from your Apple developer account when you create an authentication key.
     */
    public readonly tokenKey!: pulumi.Output<string | undefined>;
    /**
     * The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
     */
    public readonly tokenKeyId!: pulumi.Output<string | undefined>;

    /**
     * Create a ApnsChannel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApnsChannelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApnsChannelArgs | ApnsChannelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApnsChannelState | undefined;
            resourceInputs["applicationId"] = state ? state.applicationId : undefined;
            resourceInputs["bundleId"] = state ? state.bundleId : undefined;
            resourceInputs["certificate"] = state ? state.certificate : undefined;
            resourceInputs["defaultAuthenticationMethod"] = state ? state.defaultAuthenticationMethod : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["privateKey"] = state ? state.privateKey : undefined;
            resourceInputs["teamId"] = state ? state.teamId : undefined;
            resourceInputs["tokenKey"] = state ? state.tokenKey : undefined;
            resourceInputs["tokenKeyId"] = state ? state.tokenKeyId : undefined;
        } else {
            const args = argsOrState as ApnsChannelArgs | undefined;
            if ((!args || args.applicationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'applicationId'");
            }
            resourceInputs["applicationId"] = args ? args.applicationId : undefined;
            resourceInputs["bundleId"] = args?.bundleId ? pulumi.secret(args.bundleId) : undefined;
            resourceInputs["certificate"] = args?.certificate ? pulumi.secret(args.certificate) : undefined;
            resourceInputs["defaultAuthenticationMethod"] = args ? args.defaultAuthenticationMethod : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["privateKey"] = args?.privateKey ? pulumi.secret(args.privateKey) : undefined;
            resourceInputs["teamId"] = args?.teamId ? pulumi.secret(args.teamId) : undefined;
            resourceInputs["tokenKey"] = args?.tokenKey ? pulumi.secret(args.tokenKey) : undefined;
            resourceInputs["tokenKeyId"] = args?.tokenKeyId ? pulumi.secret(args.tokenKeyId) : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["bundleId", "certificate", "privateKey", "teamId", "tokenKey", "tokenKeyId"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ApnsChannel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApnsChannel resources.
 */
export interface ApnsChannelState {
    /**
     * The application ID.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
     */
    bundleId?: pulumi.Input<string>;
    /**
     * The pem encoded TLS Certificate from Apple.
     */
    certificate?: pulumi.Input<string>;
    /**
     * The default authentication method used for APNs.
     * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
     * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
     * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
     *
     * One of the following sets of credentials is also required.
     *
     * If you choose to use __Certificate credentials__ you will have to provide:
     */
    defaultAuthenticationMethod?: pulumi.Input<string>;
    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The Certificate Private Key file (ie. `.key` file).
     *
     * If you choose to use __Key credentials__ you will have to provide:
     */
    privateKey?: pulumi.Input<string>;
    /**
     * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
     */
    teamId?: pulumi.Input<string>;
    /**
     * The `.p8` file that you download from your Apple developer account when you create an authentication key.
     */
    tokenKey?: pulumi.Input<string>;
    /**
     * The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
     */
    tokenKeyId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApnsChannel resource.
 */
export interface ApnsChannelArgs {
    /**
     * The application ID.
     */
    applicationId: pulumi.Input<string>;
    /**
     * The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
     */
    bundleId?: pulumi.Input<string>;
    /**
     * The pem encoded TLS Certificate from Apple.
     */
    certificate?: pulumi.Input<string>;
    /**
     * The default authentication method used for APNs.
     * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
     * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
     * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
     *
     * One of the following sets of credentials is also required.
     *
     * If you choose to use __Certificate credentials__ you will have to provide:
     */
    defaultAuthenticationMethod?: pulumi.Input<string>;
    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The Certificate Private Key file (ie. `.key` file).
     *
     * If you choose to use __Key credentials__ you will have to provide:
     */
    privateKey?: pulumi.Input<string>;
    /**
     * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
     */
    teamId?: pulumi.Input<string>;
    /**
     * The `.p8` file that you download from your Apple developer account when you create an authentication key.
     */
    tokenKey?: pulumi.Input<string>;
    /**
     * The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
     */
    tokenKeyId?: pulumi.Input<string>;
}
