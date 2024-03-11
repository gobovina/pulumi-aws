// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an AWS Cognito Identity Principal Mapping.
 *
 * ## Import
 *
 * Using `pulumi import`, import Cognito Identity Pool Roles Attachment using the Identity Pool ID and provider name. For example:
 *
 * ```sh
 * $ pulumi import aws:cognito/identityPoolProviderPrincipalTag:IdentityPoolProviderPrincipalTag example us-west-2_abc123:CorpAD
 * ```
 */
export class IdentityPoolProviderPrincipalTag extends pulumi.CustomResource {
    /**
     * Get an existing IdentityPoolProviderPrincipalTag resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IdentityPoolProviderPrincipalTagState, opts?: pulumi.CustomResourceOptions): IdentityPoolProviderPrincipalTag {
        return new IdentityPoolProviderPrincipalTag(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cognito/identityPoolProviderPrincipalTag:IdentityPoolProviderPrincipalTag';

    /**
     * Returns true if the given object is an instance of IdentityPoolProviderPrincipalTag.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IdentityPoolProviderPrincipalTag {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IdentityPoolProviderPrincipalTag.__pulumiType;
    }

    /**
     * An identity pool ID.
     */
    public readonly identityPoolId!: pulumi.Output<string>;
    /**
     * The name of the identity provider.
     */
    public readonly identityProviderName!: pulumi.Output<string>;
    /**
     * String to string map of variables.
     */
    public readonly principalTags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * use default (username and clientID) attribute mappings.
     */
    public readonly useDefaults!: pulumi.Output<boolean | undefined>;

    /**
     * Create a IdentityPoolProviderPrincipalTag resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IdentityPoolProviderPrincipalTagArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IdentityPoolProviderPrincipalTagArgs | IdentityPoolProviderPrincipalTagState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IdentityPoolProviderPrincipalTagState | undefined;
            resourceInputs["identityPoolId"] = state ? state.identityPoolId : undefined;
            resourceInputs["identityProviderName"] = state ? state.identityProviderName : undefined;
            resourceInputs["principalTags"] = state ? state.principalTags : undefined;
            resourceInputs["useDefaults"] = state ? state.useDefaults : undefined;
        } else {
            const args = argsOrState as IdentityPoolProviderPrincipalTagArgs | undefined;
            if ((!args || args.identityPoolId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identityPoolId'");
            }
            if ((!args || args.identityProviderName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identityProviderName'");
            }
            resourceInputs["identityPoolId"] = args ? args.identityPoolId : undefined;
            resourceInputs["identityProviderName"] = args ? args.identityProviderName : undefined;
            resourceInputs["principalTags"] = args ? args.principalTags : undefined;
            resourceInputs["useDefaults"] = args ? args.useDefaults : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IdentityPoolProviderPrincipalTag.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IdentityPoolProviderPrincipalTag resources.
 */
export interface IdentityPoolProviderPrincipalTagState {
    /**
     * An identity pool ID.
     */
    identityPoolId?: pulumi.Input<string>;
    /**
     * The name of the identity provider.
     */
    identityProviderName?: pulumi.Input<string>;
    /**
     * String to string map of variables.
     */
    principalTags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * use default (username and clientID) attribute mappings.
     */
    useDefaults?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a IdentityPoolProviderPrincipalTag resource.
 */
export interface IdentityPoolProviderPrincipalTagArgs {
    /**
     * An identity pool ID.
     */
    identityPoolId: pulumi.Input<string>;
    /**
     * The name of the identity provider.
     */
    identityProviderName: pulumi.Input<string>;
    /**
     * String to string map of variables.
     */
    principalTags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * use default (username and clientID) attribute mappings.
     */
    useDefaults?: pulumi.Input<boolean>;
}
