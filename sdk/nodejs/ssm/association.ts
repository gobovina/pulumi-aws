// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Associates an SSM Document to an instance or EC2 tag.
 *
 * ## Example Usage
 * ### Create an association for a specific instance
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ssm.Association("example", {targets: [{
 *     key: "InstanceIds",
 *     values: [aws_instance.example.id],
 * }]});
 * ```
 * ### Create an association for all managed instances in an AWS account
 *
 * To target all managed instances in an AWS account, set the `key` as `"InstanceIds"` with `values` set as `["*"]`. This example also illustrates how to use an Amazon owned SSM document named `AmazonCloudWatch-ManageAgent`.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ssm.Association("example", {
 *     targets: [{
 *         key: "InstanceIds",
 *         values: ["*"],
 *     }],
 * });
 * ```
 * ### Create an association for a specific tag
 *
 * This example shows how to target all managed instances that are assigned a tag key of `Environment` and value of `Development`.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ssm.Association("example", {
 *     targets: [{
 *         key: "tag:Environment",
 *         values: ["Development"],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * SSM associations can be imported using the `association_id`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:ssm/association:Association test-association 10abcdef-0abc-1234-5678-90abcdef123456
 * ```
 */
export class Association extends pulumi.CustomResource {
    /**
     * Get an existing Association resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AssociationState, opts?: pulumi.CustomResourceOptions): Association {
        return new Association(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ssm/association:Association';

    /**
     * Returns true if the given object is an instance of Association.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Association {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Association.__pulumiType;
    }

    /**
     * By default, when you create a new or update associations, the system runs it immediately and then according to the schedule you specified. Enable this option if you do not want an association to run immediately after you create or update it. This parameter is not supported for rate expressions. Default: `false`.
     */
    public readonly applyOnlyAtCronInterval!: pulumi.Output<boolean | undefined>;
    /**
     * The ARN of the SSM association
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The ID of the SSM association.
     */
    public /*out*/ readonly associationId!: pulumi.Output<string>;
    /**
     * The descriptive name for the association.
     */
    public readonly associationName!: pulumi.Output<string | undefined>;
    /**
     * Specify the target for the association. This target is required for associations that use an `Automation` document and target resources by using rate controls. This should be set to the SSM document `parameter` that will define how your automation will branch out.
     */
    public readonly automationTargetParameterName!: pulumi.Output<string | undefined>;
    /**
     * The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
     */
    public readonly complianceSeverity!: pulumi.Output<string | undefined>;
    /**
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     */
    public readonly documentVersion!: pulumi.Output<string>;
    /**
     * The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above.
     *
     * @deprecated use 'targets' argument instead. https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_CreateAssociation.html#systemsmanager-CreateAssociation-request-InstanceId
     */
    public readonly instanceId!: pulumi.Output<string | undefined>;
    /**
     * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     */
    public readonly maxConcurrency!: pulumi.Output<string | undefined>;
    /**
     * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     */
    public readonly maxErrors!: pulumi.Output<string | undefined>;
    /**
     * The name of the SSM document to apply.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * An output location block. Output Location is documented below.
     */
    public readonly outputLocation!: pulumi.Output<outputs.ssm.AssociationOutputLocation | undefined>;
    /**
     * A block of arbitrary string parameters to pass to the SSM document.
     */
    public readonly parameters!: pulumi.Output<{[key: string]: string}>;
    /**
     * A cron expression when the association will be applied to the target(s).
     */
    public readonly scheduleExpression!: pulumi.Output<string | undefined>;
    /**
     * A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
     */
    public readonly targets!: pulumi.Output<outputs.ssm.AssociationTarget[]>;
    /**
     * The number of seconds to wait for the association status to be `Success`. If `Success` status is not reached within the given time, create opration will fail.
     */
    public readonly waitForSuccessTimeoutSeconds!: pulumi.Output<number | undefined>;

    /**
     * Create a Association resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AssociationArgs | AssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AssociationState | undefined;
            resourceInputs["applyOnlyAtCronInterval"] = state ? state.applyOnlyAtCronInterval : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["associationId"] = state ? state.associationId : undefined;
            resourceInputs["associationName"] = state ? state.associationName : undefined;
            resourceInputs["automationTargetParameterName"] = state ? state.automationTargetParameterName : undefined;
            resourceInputs["complianceSeverity"] = state ? state.complianceSeverity : undefined;
            resourceInputs["documentVersion"] = state ? state.documentVersion : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["maxConcurrency"] = state ? state.maxConcurrency : undefined;
            resourceInputs["maxErrors"] = state ? state.maxErrors : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["outputLocation"] = state ? state.outputLocation : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["scheduleExpression"] = state ? state.scheduleExpression : undefined;
            resourceInputs["targets"] = state ? state.targets : undefined;
            resourceInputs["waitForSuccessTimeoutSeconds"] = state ? state.waitForSuccessTimeoutSeconds : undefined;
        } else {
            const args = argsOrState as AssociationArgs | undefined;
            resourceInputs["applyOnlyAtCronInterval"] = args ? args.applyOnlyAtCronInterval : undefined;
            resourceInputs["associationName"] = args ? args.associationName : undefined;
            resourceInputs["automationTargetParameterName"] = args ? args.automationTargetParameterName : undefined;
            resourceInputs["complianceSeverity"] = args ? args.complianceSeverity : undefined;
            resourceInputs["documentVersion"] = args ? args.documentVersion : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["maxConcurrency"] = args ? args.maxConcurrency : undefined;
            resourceInputs["maxErrors"] = args ? args.maxErrors : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["outputLocation"] = args ? args.outputLocation : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["scheduleExpression"] = args ? args.scheduleExpression : undefined;
            resourceInputs["targets"] = args ? args.targets : undefined;
            resourceInputs["waitForSuccessTimeoutSeconds"] = args ? args.waitForSuccessTimeoutSeconds : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["associationId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Association.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Association resources.
 */
export interface AssociationState {
    /**
     * By default, when you create a new or update associations, the system runs it immediately and then according to the schedule you specified. Enable this option if you do not want an association to run immediately after you create or update it. This parameter is not supported for rate expressions. Default: `false`.
     */
    applyOnlyAtCronInterval?: pulumi.Input<boolean>;
    /**
     * The ARN of the SSM association
     */
    arn?: pulumi.Input<string>;
    /**
     * The ID of the SSM association.
     */
    associationId?: pulumi.Input<string>;
    /**
     * The descriptive name for the association.
     */
    associationName?: pulumi.Input<string>;
    /**
     * Specify the target for the association. This target is required for associations that use an `Automation` document and target resources by using rate controls. This should be set to the SSM document `parameter` that will define how your automation will branch out.
     */
    automationTargetParameterName?: pulumi.Input<string>;
    /**
     * The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
     */
    complianceSeverity?: pulumi.Input<string>;
    /**
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     */
    documentVersion?: pulumi.Input<string>;
    /**
     * The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above.
     *
     * @deprecated use 'targets' argument instead. https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_CreateAssociation.html#systemsmanager-CreateAssociation-request-InstanceId
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     */
    maxConcurrency?: pulumi.Input<string>;
    /**
     * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     */
    maxErrors?: pulumi.Input<string>;
    /**
     * The name of the SSM document to apply.
     */
    name?: pulumi.Input<string>;
    /**
     * An output location block. Output Location is documented below.
     */
    outputLocation?: pulumi.Input<inputs.ssm.AssociationOutputLocation>;
    /**
     * A block of arbitrary string parameters to pass to the SSM document.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A cron expression when the association will be applied to the target(s).
     */
    scheduleExpression?: pulumi.Input<string>;
    /**
     * A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
     */
    targets?: pulumi.Input<pulumi.Input<inputs.ssm.AssociationTarget>[]>;
    /**
     * The number of seconds to wait for the association status to be `Success`. If `Success` status is not reached within the given time, create opration will fail.
     */
    waitForSuccessTimeoutSeconds?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Association resource.
 */
export interface AssociationArgs {
    /**
     * By default, when you create a new or update associations, the system runs it immediately and then according to the schedule you specified. Enable this option if you do not want an association to run immediately after you create or update it. This parameter is not supported for rate expressions. Default: `false`.
     */
    applyOnlyAtCronInterval?: pulumi.Input<boolean>;
    /**
     * The descriptive name for the association.
     */
    associationName?: pulumi.Input<string>;
    /**
     * Specify the target for the association. This target is required for associations that use an `Automation` document and target resources by using rate controls. This should be set to the SSM document `parameter` that will define how your automation will branch out.
     */
    automationTargetParameterName?: pulumi.Input<string>;
    /**
     * The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
     */
    complianceSeverity?: pulumi.Input<string>;
    /**
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     */
    documentVersion?: pulumi.Input<string>;
    /**
     * The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above.
     *
     * @deprecated use 'targets' argument instead. https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_CreateAssociation.html#systemsmanager-CreateAssociation-request-InstanceId
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     */
    maxConcurrency?: pulumi.Input<string>;
    /**
     * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     */
    maxErrors?: pulumi.Input<string>;
    /**
     * The name of the SSM document to apply.
     */
    name?: pulumi.Input<string>;
    /**
     * An output location block. Output Location is documented below.
     */
    outputLocation?: pulumi.Input<inputs.ssm.AssociationOutputLocation>;
    /**
     * A block of arbitrary string parameters to pass to the SSM document.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A cron expression when the association will be applied to the target(s).
     */
    scheduleExpression?: pulumi.Input<string>;
    /**
     * A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
     */
    targets?: pulumi.Input<pulumi.Input<inputs.ssm.AssociationTarget>[]>;
    /**
     * The number of seconds to wait for the association status to be `Success`. If `Success` status is not reached within the given time, create opration will fail.
     */
    waitForSuccessTimeoutSeconds?: pulumi.Input<number>;
}
