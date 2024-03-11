// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing a AWS Shield Proactive Engagement.
 * Proactive engagement authorizes the Shield Response Team (SRT) to use email and phone to notify contacts about escalations to the SRT and to initiate proactive customer support.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.iam.Role("example", {
 *     name: awsShieldDrtAccessRoleArn,
 *     assumeRolePolicy: JSON.stringify({
 *         version: "2012-10-17",
 *         statement: [{
 *             Sid: "",
 *             Effect: "Allow",
 *             Principal: {
 *                 Service: "drt.shield.amazonaws.com",
 *             },
 *             Action: "sts:AssumeRole",
 *         }],
 *     }),
 * });
 * const exampleRolePolicyAttachment = new aws.iam.RolePolicyAttachment("example", {
 *     role: example.name,
 *     policyArn: "arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy",
 * });
 * const exampleDrtAccessRoleArnAssociation = new aws.shield.DrtAccessRoleArnAssociation("example", {roleArn: example.arn});
 * const test = new aws.shield.ProtectionGroup("test", {
 *     protectionGroupId: "example",
 *     aggregation: "MAX",
 *     pattern: "ALL",
 * });
 * const testProactiveEngagement = new aws.shield.ProactiveEngagement("test", {
 *     enabled: true,
 *     emergencyContacts: [
 *         {
 *             contactNotes: "Notes",
 *             emailAddress: "test@company.com",
 *             phoneNumber: "+12358132134",
 *         },
 *         {
 *             contactNotes: "Notes 2",
 *             emailAddress: "test2@company.com",
 *             phoneNumber: "+12358132134",
 *         },
 *     ],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Shield proactive engagement using the AWS account ID. For example:
 *
 * ```sh
 * $ pulumi import aws:shield/proactiveEngagement:ProactiveEngagement example 123456789012
 * ```
 */
export class ProactiveEngagement extends pulumi.CustomResource {
    /**
     * Get an existing ProactiveEngagement resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProactiveEngagementState, opts?: pulumi.CustomResourceOptions): ProactiveEngagement {
        return new ProactiveEngagement(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:shield/proactiveEngagement:ProactiveEngagement';

    /**
     * Returns true if the given object is an instance of ProactiveEngagement.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProactiveEngagement {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProactiveEngagement.__pulumiType;
    }

    /**
     * One or more emergency contacts. You must provide at least one phone number in the emergency contact list. See `emergencyContacts`.
     */
    public readonly emergencyContacts!: pulumi.Output<outputs.shield.ProactiveEngagementEmergencyContact[] | undefined>;
    /**
     * Boolean value indicating if Proactive Engagement should be enabled or not.
     */
    public readonly enabled!: pulumi.Output<boolean>;

    /**
     * Create a ProactiveEngagement resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProactiveEngagementArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProactiveEngagementArgs | ProactiveEngagementState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProactiveEngagementState | undefined;
            resourceInputs["emergencyContacts"] = state ? state.emergencyContacts : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
        } else {
            const args = argsOrState as ProactiveEngagementArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            resourceInputs["emergencyContacts"] = args ? args.emergencyContacts : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProactiveEngagement.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProactiveEngagement resources.
 */
export interface ProactiveEngagementState {
    /**
     * One or more emergency contacts. You must provide at least one phone number in the emergency contact list. See `emergencyContacts`.
     */
    emergencyContacts?: pulumi.Input<pulumi.Input<inputs.shield.ProactiveEngagementEmergencyContact>[]>;
    /**
     * Boolean value indicating if Proactive Engagement should be enabled or not.
     */
    enabled?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ProactiveEngagement resource.
 */
export interface ProactiveEngagementArgs {
    /**
     * One or more emergency contacts. You must provide at least one phone number in the emergency contact list. See `emergencyContacts`.
     */
    emergencyContacts?: pulumi.Input<pulumi.Input<inputs.shield.ProactiveEngagementEmergencyContact>[]>;
    /**
     * Boolean value indicating if Proactive Engagement should be enabled or not.
     */
    enabled: pulumi.Input<boolean>;
}
