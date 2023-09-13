// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages an IoT fleet provisioning template. For more info, see the AWS documentation on [fleet provisioning](https://docs.aws.amazon.com/iot/latest/developerguide/provision-wo-cert.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const iotAssumeRolePolicy = aws.iam.getPolicyDocument({
 *     statements: [{
 *         actions: ["sts:AssumeRole"],
 *         principals: [{
 *             type: "Service",
 *             identifiers: ["iot.amazonaws.com"],
 *         }],
 *     }],
 * });
 * const iotFleetProvisioning = new aws.iam.Role("iotFleetProvisioning", {
 *     path: "/service-role/",
 *     assumeRolePolicy: iotAssumeRolePolicy.then(iotAssumeRolePolicy => iotAssumeRolePolicy.json),
 * });
 * const iotFleetProvisioningRegistration = new aws.iam.RolePolicyAttachment("iotFleetProvisioningRegistration", {
 *     role: iotFleetProvisioning.name,
 *     policyArn: "arn:aws:iam::aws:policy/service-role/AWSIoTThingsRegistration",
 * });
 * const devicePolicyPolicyDocument = aws.iam.getPolicyDocument({
 *     statements: [{
 *         actions: ["iot:Subscribe"],
 *         resources: ["*"],
 *     }],
 * });
 * const devicePolicyPolicy = new aws.iot.Policy("devicePolicyPolicy", {policy: devicePolicyPolicyDocument.then(devicePolicyPolicyDocument => devicePolicyPolicyDocument.json)});
 * const fleet = new aws.iot.ProvisioningTemplate("fleet", {
 *     description: "My provisioning template",
 *     provisioningRoleArn: iotFleetProvisioning.arn,
 *     enabled: true,
 *     templateBody: devicePolicyPolicy.name.apply(name => JSON.stringify({
 *         Parameters: {
 *             SerialNumber: {
 *                 Type: "String",
 *             },
 *         },
 *         Resources: {
 *             certificate: {
 *                 Properties: {
 *                     CertificateId: {
 *                         Ref: "AWS::IoT::Certificate::Id",
 *                     },
 *                     Status: "Active",
 *                 },
 *                 Type: "AWS::IoT::Certificate",
 *             },
 *             policy: {
 *                 Properties: {
 *                     PolicyName: name,
 *                 },
 *                 Type: "AWS::IoT::Policy",
 *             },
 *         },
 *     })),
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import IoT fleet provisioning templates using the `name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:iot/provisioningTemplate:ProvisioningTemplate fleet FleetProvisioningTemplate
 * ```
 */
export class ProvisioningTemplate extends pulumi.CustomResource {
    /**
     * Get an existing ProvisioningTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProvisioningTemplateState, opts?: pulumi.CustomResourceOptions): ProvisioningTemplate {
        return new ProvisioningTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:iot/provisioningTemplate:ProvisioningTemplate';

    /**
     * Returns true if the given object is an instance of ProvisioningTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProvisioningTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProvisioningTemplate.__pulumiType;
    }

    /**
     * The ARN that identifies the provisioning template.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The default version of the fleet provisioning template.
     */
    public /*out*/ readonly defaultVersionId!: pulumi.Output<number>;
    /**
     * The description of the fleet provisioning template.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * True to enable the fleet provisioning template, otherwise false.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the fleet provisioning template.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Creates a pre-provisioning hook template. Details below.
     */
    public readonly preProvisioningHook!: pulumi.Output<outputs.iot.ProvisioningTemplatePreProvisioningHook | undefined>;
    /**
     * The role ARN for the role associated with the fleet provisioning template. This IoT role grants permission to provision a device.
     */
    public readonly provisioningRoleArn!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The JSON formatted contents of the fleet provisioning template.
     */
    public readonly templateBody!: pulumi.Output<string>;

    /**
     * Create a ProvisioningTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProvisioningTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProvisioningTemplateArgs | ProvisioningTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProvisioningTemplateState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["defaultVersionId"] = state ? state.defaultVersionId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["preProvisioningHook"] = state ? state.preProvisioningHook : undefined;
            resourceInputs["provisioningRoleArn"] = state ? state.provisioningRoleArn : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["templateBody"] = state ? state.templateBody : undefined;
        } else {
            const args = argsOrState as ProvisioningTemplateArgs | undefined;
            if ((!args || args.provisioningRoleArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'provisioningRoleArn'");
            }
            if ((!args || args.templateBody === undefined) && !opts.urn) {
                throw new Error("Missing required property 'templateBody'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["preProvisioningHook"] = args ? args.preProvisioningHook : undefined;
            resourceInputs["provisioningRoleArn"] = args ? args.provisioningRoleArn : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["templateBody"] = args ? args.templateBody : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["defaultVersionId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProvisioningTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProvisioningTemplate resources.
 */
export interface ProvisioningTemplateState {
    /**
     * The ARN that identifies the provisioning template.
     */
    arn?: pulumi.Input<string>;
    /**
     * The default version of the fleet provisioning template.
     */
    defaultVersionId?: pulumi.Input<number>;
    /**
     * The description of the fleet provisioning template.
     */
    description?: pulumi.Input<string>;
    /**
     * True to enable the fleet provisioning template, otherwise false.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The name of the fleet provisioning template.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a pre-provisioning hook template. Details below.
     */
    preProvisioningHook?: pulumi.Input<inputs.iot.ProvisioningTemplatePreProvisioningHook>;
    /**
     * The role ARN for the role associated with the fleet provisioning template. This IoT role grants permission to provision a device.
     */
    provisioningRoleArn?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The JSON formatted contents of the fleet provisioning template.
     */
    templateBody?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ProvisioningTemplate resource.
 */
export interface ProvisioningTemplateArgs {
    /**
     * The description of the fleet provisioning template.
     */
    description?: pulumi.Input<string>;
    /**
     * True to enable the fleet provisioning template, otherwise false.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The name of the fleet provisioning template.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a pre-provisioning hook template. Details below.
     */
    preProvisioningHook?: pulumi.Input<inputs.iot.ProvisioningTemplatePreProvisioningHook>;
    /**
     * The role ARN for the role associated with the fleet provisioning template. This IoT role grants permission to provision a device.
     */
    provisioningRoleArn: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The JSON formatted contents of the fleet provisioning template.
     */
    templateBody: pulumi.Input<string>;
}
