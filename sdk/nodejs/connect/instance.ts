// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an Amazon Connect instance resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
 *
 * !> **WARN:** Amazon Connect enforces a limit of [100 combined instance creation and deletions every 30 days](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits).  For example, if you create 80 instances and delete 20 of them, you must wait 30 days to create or delete another instance.  Use care when creating or deleting instances.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.connect.Instance("test", {
 *     identityManagementType: "CONNECT_MANAGED",
 *     inboundCallsEnabled: true,
 *     instanceAlias: "friendly-name-connect",
 *     outboundCallsEnabled: true,
 * });
 * ```
 * ### With Existing Active Directory
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.connect.Instance("test", {
 *     directoryId: aws_directory_service_directory.test.id,
 *     identityManagementType: "EXISTING_DIRECTORY",
 *     inboundCallsEnabled: true,
 *     instanceAlias: "friendly-name-connect",
 *     outboundCallsEnabled: true,
 * });
 * ```
 * ### With SAML
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.connect.Instance("test", {
 *     identityManagementType: "SAML",
 *     inboundCallsEnabled: true,
 *     instanceAlias: "friendly-name-connect",
 *     outboundCallsEnabled: true,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Connect instances using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:connect/instance:Instance example f1288a1f-6193-445a-b47e-af739b2
 * ```
 */
export class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState, opts?: pulumi.CustomResourceOptions): Instance {
        return new Instance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:connect/instance:Instance';

    /**
     * Returns true if the given object is an instance of Instance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Instance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Instance.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) of the instance.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Specifies whether auto resolve best voices is enabled. Defaults to `true`.
     */
    public readonly autoResolveBestVoicesEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies whether contact flow logs are enabled. Defaults to `false`.
     */
    public readonly contactFlowLogsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies whether contact lens is enabled. Defaults to `true`.
     */
    public readonly contactLensEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * When the instance was created.
     */
    public /*out*/ readonly createdTime!: pulumi.Output<string>;
    /**
     * The identifier for the directory if identityManagementType is `EXISTING_DIRECTORY`.
     */
    public readonly directoryId!: pulumi.Output<string | undefined>;
    /**
     * Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
     */
    public readonly earlyMediaEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
     */
    public readonly identityManagementType!: pulumi.Output<string>;
    /**
     * Specifies whether inbound calls are enabled.
     */
    public readonly inboundCallsEnabled!: pulumi.Output<boolean>;
    /**
     * Specifies the name of the instance. Required if `directoryId` not specified.
     */
    public readonly instanceAlias!: pulumi.Output<string | undefined>;
    /**
     * Specifies whether multi-party calls/conference is enabled. Defaults to `false`.
     */
    public readonly multiPartyConferenceEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies whether outbound calls are enabled.
     * <!-- * `useCustomTtsVoices` - (Optional) Whether use custom tts voices is enabled. Defaults to `false` -->
     */
    public readonly outboundCallsEnabled!: pulumi.Output<boolean>;
    /**
     * The service role of the instance.
     */
    public /*out*/ readonly serviceRole!: pulumi.Output<string>;
    /**
     * The state of the instance.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceArgs | InstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["autoResolveBestVoicesEnabled"] = state ? state.autoResolveBestVoicesEnabled : undefined;
            resourceInputs["contactFlowLogsEnabled"] = state ? state.contactFlowLogsEnabled : undefined;
            resourceInputs["contactLensEnabled"] = state ? state.contactLensEnabled : undefined;
            resourceInputs["createdTime"] = state ? state.createdTime : undefined;
            resourceInputs["directoryId"] = state ? state.directoryId : undefined;
            resourceInputs["earlyMediaEnabled"] = state ? state.earlyMediaEnabled : undefined;
            resourceInputs["identityManagementType"] = state ? state.identityManagementType : undefined;
            resourceInputs["inboundCallsEnabled"] = state ? state.inboundCallsEnabled : undefined;
            resourceInputs["instanceAlias"] = state ? state.instanceAlias : undefined;
            resourceInputs["multiPartyConferenceEnabled"] = state ? state.multiPartyConferenceEnabled : undefined;
            resourceInputs["outboundCallsEnabled"] = state ? state.outboundCallsEnabled : undefined;
            resourceInputs["serviceRole"] = state ? state.serviceRole : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            if ((!args || args.identityManagementType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identityManagementType'");
            }
            if ((!args || args.inboundCallsEnabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'inboundCallsEnabled'");
            }
            if ((!args || args.outboundCallsEnabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'outboundCallsEnabled'");
            }
            resourceInputs["autoResolveBestVoicesEnabled"] = args ? args.autoResolveBestVoicesEnabled : undefined;
            resourceInputs["contactFlowLogsEnabled"] = args ? args.contactFlowLogsEnabled : undefined;
            resourceInputs["contactLensEnabled"] = args ? args.contactLensEnabled : undefined;
            resourceInputs["directoryId"] = args ? args.directoryId : undefined;
            resourceInputs["earlyMediaEnabled"] = args ? args.earlyMediaEnabled : undefined;
            resourceInputs["identityManagementType"] = args ? args.identityManagementType : undefined;
            resourceInputs["inboundCallsEnabled"] = args ? args.inboundCallsEnabled : undefined;
            resourceInputs["instanceAlias"] = args ? args.instanceAlias : undefined;
            resourceInputs["multiPartyConferenceEnabled"] = args ? args.multiPartyConferenceEnabled : undefined;
            resourceInputs["outboundCallsEnabled"] = args ? args.outboundCallsEnabled : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdTime"] = undefined /*out*/;
            resourceInputs["serviceRole"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Instance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * Amazon Resource Name (ARN) of the instance.
     */
    arn?: pulumi.Input<string>;
    /**
     * Specifies whether auto resolve best voices is enabled. Defaults to `true`.
     */
    autoResolveBestVoicesEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies whether contact flow logs are enabled. Defaults to `false`.
     */
    contactFlowLogsEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies whether contact lens is enabled. Defaults to `true`.
     */
    contactLensEnabled?: pulumi.Input<boolean>;
    /**
     * When the instance was created.
     */
    createdTime?: pulumi.Input<string>;
    /**
     * The identifier for the directory if identityManagementType is `EXISTING_DIRECTORY`.
     */
    directoryId?: pulumi.Input<string>;
    /**
     * Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
     */
    earlyMediaEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
     */
    identityManagementType?: pulumi.Input<string>;
    /**
     * Specifies whether inbound calls are enabled.
     */
    inboundCallsEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the name of the instance. Required if `directoryId` not specified.
     */
    instanceAlias?: pulumi.Input<string>;
    /**
     * Specifies whether multi-party calls/conference is enabled. Defaults to `false`.
     */
    multiPartyConferenceEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies whether outbound calls are enabled.
     * <!-- * `useCustomTtsVoices` - (Optional) Whether use custom tts voices is enabled. Defaults to `false` -->
     */
    outboundCallsEnabled?: pulumi.Input<boolean>;
    /**
     * The service role of the instance.
     */
    serviceRole?: pulumi.Input<string>;
    /**
     * The state of the instance.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * Specifies whether auto resolve best voices is enabled. Defaults to `true`.
     */
    autoResolveBestVoicesEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies whether contact flow logs are enabled. Defaults to `false`.
     */
    contactFlowLogsEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies whether contact lens is enabled. Defaults to `true`.
     */
    contactLensEnabled?: pulumi.Input<boolean>;
    /**
     * The identifier for the directory if identityManagementType is `EXISTING_DIRECTORY`.
     */
    directoryId?: pulumi.Input<string>;
    /**
     * Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
     */
    earlyMediaEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
     */
    identityManagementType: pulumi.Input<string>;
    /**
     * Specifies whether inbound calls are enabled.
     */
    inboundCallsEnabled: pulumi.Input<boolean>;
    /**
     * Specifies the name of the instance. Required if `directoryId` not specified.
     */
    instanceAlias?: pulumi.Input<string>;
    /**
     * Specifies whether multi-party calls/conference is enabled. Defaults to `false`.
     */
    multiPartyConferenceEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies whether outbound calls are enabled.
     * <!-- * `useCustomTtsVoices` - (Optional) Whether use custom tts voices is enabled. Defaults to `false` -->
     */
    outboundCallsEnabled: pulumi.Input<boolean>;
}
