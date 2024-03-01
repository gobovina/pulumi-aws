// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Creates a new landing zone using Control Tower. For more information on usage, please see the
 * [AWS Control Tower Landing Zone User Guide](https://docs.aws.amazon.com/controltower/latest/userguide/how-control-tower-works.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * function notImplemented(message: string) {
 *     throw new Error(message);
 * }
 *
 * const example = new aws.controltower.LandingZone("example", {
 *     manifestJson: std.file({
 *         input: `${notImplemented("path.module")}/LandingZoneManifest.json`,
 *     }).then(invoke => invoke.result),
 *     version: "3.2",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import a Control Tower Landing Zone using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:controltower/landingZone:LandingZone example 1A2B3C4D5E6F7G8H
 * ```
 */
export class LandingZone extends pulumi.CustomResource {
    /**
     * Get an existing LandingZone resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LandingZoneState, opts?: pulumi.CustomResourceOptions): LandingZone {
        return new LandingZone(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:controltower/landingZone:LandingZone';

    /**
     * Returns true if the given object is an instance of LandingZone.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LandingZone {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LandingZone.__pulumiType;
    }

    /**
     * The ARN of the landing zone.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The drift status summary of the landing zone.
     */
    public /*out*/ readonly driftStatuses!: pulumi.Output<outputs.controltower.LandingZoneDriftStatus[]>;
    /**
     * The latest available version of the landing zone.
     */
    public /*out*/ readonly latestAvailableVersion!: pulumi.Output<string>;
    /**
     * The manifest JSON file is a text file that describes your AWS resources. For examples, review [Launch your landing zone](https://docs.aws.amazon.com/controltower/latest/userguide/lz-api-launch).
     */
    public readonly manifestJson!: pulumi.Output<string>;
    /**
     * Tags to apply to the landing zone. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the landing zone, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The landing zone version.
     */
    public readonly version!: pulumi.Output<string>;

    /**
     * Create a LandingZone resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LandingZoneArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LandingZoneArgs | LandingZoneState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LandingZoneState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["driftStatuses"] = state ? state.driftStatuses : undefined;
            resourceInputs["latestAvailableVersion"] = state ? state.latestAvailableVersion : undefined;
            resourceInputs["manifestJson"] = state ? state.manifestJson : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as LandingZoneArgs | undefined;
            if ((!args || args.manifestJson === undefined) && !opts.urn) {
                throw new Error("Missing required property 'manifestJson'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            resourceInputs["manifestJson"] = args ? args.manifestJson : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["driftStatuses"] = undefined /*out*/;
            resourceInputs["latestAvailableVersion"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LandingZone.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LandingZone resources.
 */
export interface LandingZoneState {
    /**
     * The ARN of the landing zone.
     */
    arn?: pulumi.Input<string>;
    /**
     * The drift status summary of the landing zone.
     */
    driftStatuses?: pulumi.Input<pulumi.Input<inputs.controltower.LandingZoneDriftStatus>[]>;
    /**
     * The latest available version of the landing zone.
     */
    latestAvailableVersion?: pulumi.Input<string>;
    /**
     * The manifest JSON file is a text file that describes your AWS resources. For examples, review [Launch your landing zone](https://docs.aws.amazon.com/controltower/latest/userguide/lz-api-launch).
     */
    manifestJson?: pulumi.Input<string>;
    /**
     * Tags to apply to the landing zone. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the landing zone, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The landing zone version.
     */
    version?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LandingZone resource.
 */
export interface LandingZoneArgs {
    /**
     * The manifest JSON file is a text file that describes your AWS resources. For examples, review [Launch your landing zone](https://docs.aws.amazon.com/controltower/latest/userguide/lz-api-launch).
     */
    manifestJson: pulumi.Input<string>;
    /**
     * Tags to apply to the landing zone. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The landing zone version.
     */
    version: pulumi.Input<string>;
}
