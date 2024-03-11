// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an Elastic MapReduce Studio Session Mapping.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.emr.StudioSessionMapping("example", {
 *     studioId: exampleAwsEmrStudio.id,
 *     identityType: "USER",
 *     identityId: "example",
 *     sessionPolicyArn: exampleAwsIamPolicy.arn,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import EMR studio session mappings using `studio-id:identity-type:identity-id`. For example:
 *
 * ```sh
 * $ pulumi import aws:emr/studioSessionMapping:StudioSessionMapping example es-xxxxx:USER:xxxxx-xxx-xxx
 * ```
 */
export class StudioSessionMapping extends pulumi.CustomResource {
    /**
     * Get an existing StudioSessionMapping resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StudioSessionMappingState, opts?: pulumi.CustomResourceOptions): StudioSessionMapping {
        return new StudioSessionMapping(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:emr/studioSessionMapping:StudioSessionMapping';

    /**
     * Returns true if the given object is an instance of StudioSessionMapping.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StudioSessionMapping {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StudioSessionMapping.__pulumiType;
    }

    /**
     * The globally unique identifier (GUID) of the user or group from the Amazon Web Services SSO Identity Store.
     */
    public readonly identityId!: pulumi.Output<string>;
    /**
     * The name of the user or group from the Amazon Web Services SSO Identity Store.
     */
    public readonly identityName!: pulumi.Output<string>;
    /**
     * Specifies whether the identity to map to the Amazon EMR Studio is a `USER` or a `GROUP`.
     */
    public readonly identityType!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. You should specify the ARN for the session policy that you want to apply, not the ARN of your user role.
     */
    public readonly sessionPolicyArn!: pulumi.Output<string>;
    /**
     * The ID of the Amazon EMR Studio to which the user or group will be mapped.
     */
    public readonly studioId!: pulumi.Output<string>;

    /**
     * Create a StudioSessionMapping resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StudioSessionMappingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StudioSessionMappingArgs | StudioSessionMappingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StudioSessionMappingState | undefined;
            resourceInputs["identityId"] = state ? state.identityId : undefined;
            resourceInputs["identityName"] = state ? state.identityName : undefined;
            resourceInputs["identityType"] = state ? state.identityType : undefined;
            resourceInputs["sessionPolicyArn"] = state ? state.sessionPolicyArn : undefined;
            resourceInputs["studioId"] = state ? state.studioId : undefined;
        } else {
            const args = argsOrState as StudioSessionMappingArgs | undefined;
            if ((!args || args.identityType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identityType'");
            }
            if ((!args || args.sessionPolicyArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sessionPolicyArn'");
            }
            if ((!args || args.studioId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'studioId'");
            }
            resourceInputs["identityId"] = args ? args.identityId : undefined;
            resourceInputs["identityName"] = args ? args.identityName : undefined;
            resourceInputs["identityType"] = args ? args.identityType : undefined;
            resourceInputs["sessionPolicyArn"] = args ? args.sessionPolicyArn : undefined;
            resourceInputs["studioId"] = args ? args.studioId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StudioSessionMapping.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StudioSessionMapping resources.
 */
export interface StudioSessionMappingState {
    /**
     * The globally unique identifier (GUID) of the user or group from the Amazon Web Services SSO Identity Store.
     */
    identityId?: pulumi.Input<string>;
    /**
     * The name of the user or group from the Amazon Web Services SSO Identity Store.
     */
    identityName?: pulumi.Input<string>;
    /**
     * Specifies whether the identity to map to the Amazon EMR Studio is a `USER` or a `GROUP`.
     */
    identityType?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. You should specify the ARN for the session policy that you want to apply, not the ARN of your user role.
     */
    sessionPolicyArn?: pulumi.Input<string>;
    /**
     * The ID of the Amazon EMR Studio to which the user or group will be mapped.
     */
    studioId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StudioSessionMapping resource.
 */
export interface StudioSessionMappingArgs {
    /**
     * The globally unique identifier (GUID) of the user or group from the Amazon Web Services SSO Identity Store.
     */
    identityId?: pulumi.Input<string>;
    /**
     * The name of the user or group from the Amazon Web Services SSO Identity Store.
     */
    identityName?: pulumi.Input<string>;
    /**
     * Specifies whether the identity to map to the Amazon EMR Studio is a `USER` or a `GROUP`.
     */
    identityType: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. You should specify the ARN for the session policy that you want to apply, not the ARN of your user role.
     */
    sessionPolicyArn: pulumi.Input<string>;
    /**
     * The ID of the Amazon EMR Studio to which the user or group will be mapped.
     */
    studioId: pulumi.Input<string>;
}
