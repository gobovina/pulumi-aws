// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an AWS Cognito Identity Pool Roles Attachment.
 *
 * ## Import
 *
 * Using `pulumi import`, import Cognito Identity Pool Roles Attachment using the Identity Pool ID. For example:
 *
 * ```sh
 * $ pulumi import aws:cognito/identityPoolRoleAttachment:IdentityPoolRoleAttachment example us-west-2:b64805ad-cb56-40ba-9ffc-f5d8207e6d42
 * ```
 */
export class IdentityPoolRoleAttachment extends pulumi.CustomResource {
    /**
     * Get an existing IdentityPoolRoleAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IdentityPoolRoleAttachmentState, opts?: pulumi.CustomResourceOptions): IdentityPoolRoleAttachment {
        return new IdentityPoolRoleAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cognito/identityPoolRoleAttachment:IdentityPoolRoleAttachment';

    /**
     * Returns true if the given object is an instance of IdentityPoolRoleAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IdentityPoolRoleAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IdentityPoolRoleAttachment.__pulumiType;
    }

    /**
     * An identity pool ID in the format `REGION_GUID`.
     */
    public readonly identityPoolId!: pulumi.Output<string>;
    /**
     * A List of Role Mapping.
     */
    public readonly roleMappings!: pulumi.Output<outputs.cognito.IdentityPoolRoleAttachmentRoleMapping[] | undefined>;
    /**
     * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
     */
    public readonly roles!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a IdentityPoolRoleAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IdentityPoolRoleAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IdentityPoolRoleAttachmentArgs | IdentityPoolRoleAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IdentityPoolRoleAttachmentState | undefined;
            resourceInputs["identityPoolId"] = state ? state.identityPoolId : undefined;
            resourceInputs["roleMappings"] = state ? state.roleMappings : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
        } else {
            const args = argsOrState as IdentityPoolRoleAttachmentArgs | undefined;
            if ((!args || args.identityPoolId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identityPoolId'");
            }
            if ((!args || args.roles === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roles'");
            }
            resourceInputs["identityPoolId"] = args ? args.identityPoolId : undefined;
            resourceInputs["roleMappings"] = args ? args.roleMappings : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IdentityPoolRoleAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IdentityPoolRoleAttachment resources.
 */
export interface IdentityPoolRoleAttachmentState {
    /**
     * An identity pool ID in the format `REGION_GUID`.
     */
    identityPoolId?: pulumi.Input<string>;
    /**
     * A List of Role Mapping.
     */
    roleMappings?: pulumi.Input<pulumi.Input<inputs.cognito.IdentityPoolRoleAttachmentRoleMapping>[]>;
    /**
     * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
     */
    roles?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a IdentityPoolRoleAttachment resource.
 */
export interface IdentityPoolRoleAttachmentArgs {
    /**
     * An identity pool ID in the format `REGION_GUID`.
     */
    identityPoolId: pulumi.Input<string>;
    /**
     * A List of Role Mapping.
     */
    roleMappings?: pulumi.Input<pulumi.Input<inputs.cognito.IdentityPoolRoleAttachmentRoleMapping>[]>;
    /**
     * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
     */
    roles: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
