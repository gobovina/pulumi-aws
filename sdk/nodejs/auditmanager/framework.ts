// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS Audit Manager Framework.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.auditmanager.Framework("test", {
 *     name: "example",
 *     controlSets: [{
 *         name: "example",
 *         controls: [{
 *             id: testAwsAuditmanagerControl.id,
 *         }],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Audit Manager Framework using the framework `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:auditmanager/framework:Framework example abc123-de45
 * ```
 */
export class Framework extends pulumi.CustomResource {
    /**
     * Get an existing Framework resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FrameworkState, opts?: pulumi.CustomResourceOptions): Framework {
        return new Framework(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:auditmanager/framework:Framework';

    /**
     * Returns true if the given object is an instance of Framework.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Framework {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Framework.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) of the framework.
     * * `control_sets[*].id` - Unique identifier for the framework control set.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Compliance type that the new custom framework supports, such as `CIS` or `HIPAA`.
     */
    public readonly complianceType!: pulumi.Output<string | undefined>;
    /**
     * Control sets that are associated with the framework. See `controlSets` below.
     *
     * The following arguments are optional:
     */
    public readonly controlSets!: pulumi.Output<outputs.auditmanager.FrameworkControlSet[] | undefined>;
    /**
     * Description of the framework.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Framework type, such as a custom framework or a standard framework.
     */
    public /*out*/ readonly frameworkType!: pulumi.Output<string>;
    /**
     * Name of the framework.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the framework. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Framework resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: FrameworkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FrameworkArgs | FrameworkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FrameworkState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["complianceType"] = state ? state.complianceType : undefined;
            resourceInputs["controlSets"] = state ? state.controlSets : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["frameworkType"] = state ? state.frameworkType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as FrameworkArgs | undefined;
            resourceInputs["complianceType"] = args ? args.complianceType : undefined;
            resourceInputs["controlSets"] = args ? args.controlSets : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["frameworkType"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Framework.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Framework resources.
 */
export interface FrameworkState {
    /**
     * Amazon Resource Name (ARN) of the framework.
     * * `control_sets[*].id` - Unique identifier for the framework control set.
     */
    arn?: pulumi.Input<string>;
    /**
     * Compliance type that the new custom framework supports, such as `CIS` or `HIPAA`.
     */
    complianceType?: pulumi.Input<string>;
    /**
     * Control sets that are associated with the framework. See `controlSets` below.
     *
     * The following arguments are optional:
     */
    controlSets?: pulumi.Input<pulumi.Input<inputs.auditmanager.FrameworkControlSet>[]>;
    /**
     * Description of the framework.
     */
    description?: pulumi.Input<string>;
    /**
     * Framework type, such as a custom framework or a standard framework.
     */
    frameworkType?: pulumi.Input<string>;
    /**
     * Name of the framework.
     */
    name?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the framework. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Framework resource.
 */
export interface FrameworkArgs {
    /**
     * Compliance type that the new custom framework supports, such as `CIS` or `HIPAA`.
     */
    complianceType?: pulumi.Input<string>;
    /**
     * Control sets that are associated with the framework. See `controlSets` below.
     *
     * The following arguments are optional:
     */
    controlSets?: pulumi.Input<pulumi.Input<inputs.auditmanager.FrameworkControlSet>[]>;
    /**
     * Description of the framework.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the framework.
     */
    name?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the framework. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
