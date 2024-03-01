// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Elastic Container Registry Scanning Configuration. Can't be completely deleted, instead reverts to the default `BASIC` scanning configuration without rules.
 *
 * ## Example Usage
 * ### Basic example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const configuration = new aws.ecr.RegistryScanningConfiguration("configuration", {
 *     scanType: "ENHANCED",
 *     rules: [{
 *         scanFrequency: "CONTINUOUS_SCAN",
 *         repositoryFilters: [{
 *             filter: "example",
 *             filterType: "WILDCARD",
 *         }],
 *     }],
 * });
 * ```
 * ### Multiple rules
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.ecr.RegistryScanningConfiguration("test", {
 *     scanType: "ENHANCED",
 *     rules: [
 *         {
 *             scanFrequency: "SCAN_ON_PUSH",
 *             repositoryFilters: [{
 *                 filter: "*",
 *                 filterType: "WILDCARD",
 *             }],
 *         },
 *         {
 *             scanFrequency: "CONTINUOUS_SCAN",
 *             repositoryFilters: [{
 *                 filter: "example",
 *                 filterType: "WILDCARD",
 *             }],
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import ECR Scanning Configurations using the `registry_id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:ecr/registryScanningConfiguration:RegistryScanningConfiguration example 012345678901
 * ```
 */
export class RegistryScanningConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing RegistryScanningConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegistryScanningConfigurationState, opts?: pulumi.CustomResourceOptions): RegistryScanningConfiguration {
        return new RegistryScanningConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ecr/registryScanningConfiguration:RegistryScanningConfiguration';

    /**
     * Returns true if the given object is an instance of RegistryScanningConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RegistryScanningConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RegistryScanningConfiguration.__pulumiType;
    }

    /**
     * The registry ID the scanning configuration applies to.
     */
    public /*out*/ readonly registryId!: pulumi.Output<string>;
    /**
     * One or multiple blocks specifying scanning rules to determine which repository filters are used and at what frequency scanning will occur. See below for schema.
     */
    public readonly rules!: pulumi.Output<outputs.ecr.RegistryScanningConfigurationRule[] | undefined>;
    /**
     * the scanning type to set for the registry. Can be either `ENHANCED` or `BASIC`.
     */
    public readonly scanType!: pulumi.Output<string>;

    /**
     * Create a RegistryScanningConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RegistryScanningConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RegistryScanningConfigurationArgs | RegistryScanningConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RegistryScanningConfigurationState | undefined;
            resourceInputs["registryId"] = state ? state.registryId : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
            resourceInputs["scanType"] = state ? state.scanType : undefined;
        } else {
            const args = argsOrState as RegistryScanningConfigurationArgs | undefined;
            if ((!args || args.scanType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scanType'");
            }
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["scanType"] = args ? args.scanType : undefined;
            resourceInputs["registryId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RegistryScanningConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RegistryScanningConfiguration resources.
 */
export interface RegistryScanningConfigurationState {
    /**
     * The registry ID the scanning configuration applies to.
     */
    registryId?: pulumi.Input<string>;
    /**
     * One or multiple blocks specifying scanning rules to determine which repository filters are used and at what frequency scanning will occur. See below for schema.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.ecr.RegistryScanningConfigurationRule>[]>;
    /**
     * the scanning type to set for the registry. Can be either `ENHANCED` or `BASIC`.
     */
    scanType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RegistryScanningConfiguration resource.
 */
export interface RegistryScanningConfigurationArgs {
    /**
     * One or multiple blocks specifying scanning rules to determine which repository filters are used and at what frequency scanning will occur. See below for schema.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.ecr.RegistryScanningConfigurationRule>[]>;
    /**
     * the scanning type to set for the registry. Can be either `ENHANCED` or `BASIC`.
     */
    scanType: pulumi.Input<string>;
}
