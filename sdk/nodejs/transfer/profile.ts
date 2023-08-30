// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a AWS Transfer AS2 Profile resource.
 *
 * ## Example Usage
 *
 * ## Import
 *
 * Using `pulumi import`, import Transfer AS2 Profile using the `profile_id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:transfer/profile:Profile example p-4221a88afd5f4362a
 * ```
 */
export class Profile extends pulumi.CustomResource {
    /**
     * Get an existing Profile resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProfileState, opts?: pulumi.CustomResourceOptions): Profile {
        return new Profile(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:transfer/profile:Profile';

    /**
     * Returns true if the given object is an instance of Profile.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Profile {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Profile.__pulumiType;
    }

    /**
     * The As2Id is the AS2 name as defined in the RFC 4130. For inbound ttransfers this is the AS2 From Header for the AS2 messages sent from the partner. For Outbound messages this is the AS2 To Header for the AS2 messages sent to the partner. his ID cannot include spaces.
     */
    public readonly as2Id!: pulumi.Output<string>;
    /**
     * The list of certificate Ids from the imported certificate operation.
     */
    public readonly certificateIds!: pulumi.Output<string[] | undefined>;
    /**
     * The unique identifier for the AS2 profile
     */
    public /*out*/ readonly profileId!: pulumi.Output<string>;
    /**
     * The profile type should be LOCAL or PARTNER.
     */
    public readonly profileType!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Profile resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProfileArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProfileArgs | ProfileState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProfileState | undefined;
            resourceInputs["as2Id"] = state ? state.as2Id : undefined;
            resourceInputs["certificateIds"] = state ? state.certificateIds : undefined;
            resourceInputs["profileId"] = state ? state.profileId : undefined;
            resourceInputs["profileType"] = state ? state.profileType : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ProfileArgs | undefined;
            if ((!args || args.as2Id === undefined) && !opts.urn) {
                throw new Error("Missing required property 'as2Id'");
            }
            if ((!args || args.profileType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'profileType'");
            }
            resourceInputs["as2Id"] = args ? args.as2Id : undefined;
            resourceInputs["certificateIds"] = args ? args.certificateIds : undefined;
            resourceInputs["profileType"] = args ? args.profileType : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["profileId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Profile.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Profile resources.
 */
export interface ProfileState {
    /**
     * The As2Id is the AS2 name as defined in the RFC 4130. For inbound ttransfers this is the AS2 From Header for the AS2 messages sent from the partner. For Outbound messages this is the AS2 To Header for the AS2 messages sent to the partner. his ID cannot include spaces.
     */
    as2Id?: pulumi.Input<string>;
    /**
     * The list of certificate Ids from the imported certificate operation.
     */
    certificateIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The unique identifier for the AS2 profile
     */
    profileId?: pulumi.Input<string>;
    /**
     * The profile type should be LOCAL or PARTNER.
     */
    profileType?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Profile resource.
 */
export interface ProfileArgs {
    /**
     * The As2Id is the AS2 name as defined in the RFC 4130. For inbound ttransfers this is the AS2 From Header for the AS2 messages sent from the partner. For Outbound messages this is the AS2 To Header for the AS2 messages sent to the partner. his ID cannot include spaces.
     */
    as2Id: pulumi.Input<string>;
    /**
     * The list of certificate Ids from the imported certificate operation.
     */
    certificateIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The profile type should be LOCAL or PARTNER.
     */
    profileType: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
