// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an AWS Cognito Identity Pool.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * const _default = new aws.iam.SamlProvider("default", {
 *     name: "my-saml-provider",
 *     samlMetadataDocument: std.file({
 *         input: "saml-metadata.xml",
 *     }).then(invoke => invoke.result),
 * });
 * const main = new aws.cognito.IdentityPool("main", {
 *     identityPoolName: "identity pool",
 *     allowUnauthenticatedIdentities: false,
 *     allowClassicFlow: false,
 *     cognitoIdentityProviders: [
 *         {
 *             clientId: "6lhlkkfbfb4q5kpp90urffae",
 *             providerName: "cognito-idp.us-east-1.amazonaws.com/us-east-1_Tv0493apJ",
 *             serverSideTokenCheck: false,
 *         },
 *         {
 *             clientId: "7kodkvfqfb4qfkp39eurffae",
 *             providerName: "cognito-idp.us-east-1.amazonaws.com/eu-west-1_Zr231apJu",
 *             serverSideTokenCheck: false,
 *         },
 *     ],
 *     supportedLoginProviders: {
 *         "graph.facebook.com": "7346241598935552",
 *         "accounts.google.com": "123456789012.apps.googleusercontent.com",
 *     },
 *     samlProviderArns: [_default.arn],
 *     openidConnectProviderArns: ["arn:aws:iam::123456789012:oidc-provider/id.example.com"],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Cognito Identity Pool using its ID. For example:
 *
 * ```sh
 * $ pulumi import aws:cognito/identityPool:IdentityPool mypool us-west-2:1a234567-8901-234b-5cde-f6789g01h2i3
 * ```
 */
export class IdentityPool extends pulumi.CustomResource {
    /**
     * Get an existing IdentityPool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IdentityPoolState, opts?: pulumi.CustomResourceOptions): IdentityPool {
        return new IdentityPool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cognito/identityPool:IdentityPool';

    /**
     * Returns true if the given object is an instance of IdentityPool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IdentityPool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IdentityPool.__pulumiType;
    }

    /**
     * Enables or disables the classic / basic authentication flow. Default is `false`.
     */
    public readonly allowClassicFlow!: pulumi.Output<boolean | undefined>;
    /**
     * Whether the identity pool supports unauthenticated logins or not.
     */
    public readonly allowUnauthenticatedIdentities!: pulumi.Output<boolean | undefined>;
    /**
     * The ARN of the identity pool.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * An array of Amazon Cognito Identity user pools and their client IDs.
     */
    public readonly cognitoIdentityProviders!: pulumi.Output<outputs.cognito.IdentityPoolCognitoIdentityProvider[] | undefined>;
    /**
     * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
     * backend and the Cognito service to communicate about the developer provider.
     */
    public readonly developerProviderName!: pulumi.Output<string | undefined>;
    /**
     * The Cognito Identity Pool name.
     */
    public readonly identityPoolName!: pulumi.Output<string>;
    /**
     * Set of OpendID Connect provider ARNs.
     */
    public readonly openidConnectProviderArns!: pulumi.Output<string[] | undefined>;
    /**
     * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
     */
    public readonly samlProviderArns!: pulumi.Output<string[] | undefined>;
    /**
     * Key-Value pairs mapping provider names to provider app IDs.
     */
    public readonly supportedLoginProviders!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags to assign to the Identity Pool. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a IdentityPool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IdentityPoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IdentityPoolArgs | IdentityPoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IdentityPoolState | undefined;
            resourceInputs["allowClassicFlow"] = state ? state.allowClassicFlow : undefined;
            resourceInputs["allowUnauthenticatedIdentities"] = state ? state.allowUnauthenticatedIdentities : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["cognitoIdentityProviders"] = state ? state.cognitoIdentityProviders : undefined;
            resourceInputs["developerProviderName"] = state ? state.developerProviderName : undefined;
            resourceInputs["identityPoolName"] = state ? state.identityPoolName : undefined;
            resourceInputs["openidConnectProviderArns"] = state ? state.openidConnectProviderArns : undefined;
            resourceInputs["samlProviderArns"] = state ? state.samlProviderArns : undefined;
            resourceInputs["supportedLoginProviders"] = state ? state.supportedLoginProviders : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as IdentityPoolArgs | undefined;
            if ((!args || args.identityPoolName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identityPoolName'");
            }
            resourceInputs["allowClassicFlow"] = args ? args.allowClassicFlow : undefined;
            resourceInputs["allowUnauthenticatedIdentities"] = args ? args.allowUnauthenticatedIdentities : undefined;
            resourceInputs["cognitoIdentityProviders"] = args ? args.cognitoIdentityProviders : undefined;
            resourceInputs["developerProviderName"] = args ? args.developerProviderName : undefined;
            resourceInputs["identityPoolName"] = args ? args.identityPoolName : undefined;
            resourceInputs["openidConnectProviderArns"] = args ? args.openidConnectProviderArns : undefined;
            resourceInputs["samlProviderArns"] = args ? args.samlProviderArns : undefined;
            resourceInputs["supportedLoginProviders"] = args ? args.supportedLoginProviders : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IdentityPool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IdentityPool resources.
 */
export interface IdentityPoolState {
    /**
     * Enables or disables the classic / basic authentication flow. Default is `false`.
     */
    allowClassicFlow?: pulumi.Input<boolean>;
    /**
     * Whether the identity pool supports unauthenticated logins or not.
     */
    allowUnauthenticatedIdentities?: pulumi.Input<boolean>;
    /**
     * The ARN of the identity pool.
     */
    arn?: pulumi.Input<string>;
    /**
     * An array of Amazon Cognito Identity user pools and their client IDs.
     */
    cognitoIdentityProviders?: pulumi.Input<pulumi.Input<inputs.cognito.IdentityPoolCognitoIdentityProvider>[]>;
    /**
     * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
     * backend and the Cognito service to communicate about the developer provider.
     */
    developerProviderName?: pulumi.Input<string>;
    /**
     * The Cognito Identity Pool name.
     */
    identityPoolName?: pulumi.Input<string>;
    /**
     * Set of OpendID Connect provider ARNs.
     */
    openidConnectProviderArns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
     */
    samlProviderArns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Key-Value pairs mapping provider names to provider app IDs.
     */
    supportedLoginProviders?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags to assign to the Identity Pool. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
 * The set of arguments for constructing a IdentityPool resource.
 */
export interface IdentityPoolArgs {
    /**
     * Enables or disables the classic / basic authentication flow. Default is `false`.
     */
    allowClassicFlow?: pulumi.Input<boolean>;
    /**
     * Whether the identity pool supports unauthenticated logins or not.
     */
    allowUnauthenticatedIdentities?: pulumi.Input<boolean>;
    /**
     * An array of Amazon Cognito Identity user pools and their client IDs.
     */
    cognitoIdentityProviders?: pulumi.Input<pulumi.Input<inputs.cognito.IdentityPoolCognitoIdentityProvider>[]>;
    /**
     * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
     * backend and the Cognito service to communicate about the developer provider.
     */
    developerProviderName?: pulumi.Input<string>;
    /**
     * The Cognito Identity Pool name.
     */
    identityPoolName: pulumi.Input<string>;
    /**
     * Set of OpendID Connect provider ARNs.
     */
    openidConnectProviderArns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
     */
    samlProviderArns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Key-Value pairs mapping provider names to provider app IDs.
     */
    supportedLoginProviders?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags to assign to the Identity Pool. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
