// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages an App Runner Observability Configuration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.apprunner.ObservabilityConfiguration("example", {
 *     observabilityConfigurationName: "example",
 *     tags: {
 *         Name: "example-apprunner-observability-configuration",
 *     },
 *     traceConfiguration: {
 *         vendor: "AWSXRAY",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import App Runner Observability Configuration using the `arn`. For example:
 *
 * ```sh
 *  $ pulumi import aws:apprunner/observabilityConfiguration:ObservabilityConfiguration example arn:aws:apprunner:us-east-1:1234567890:observabilityconfiguration/example/1/d75bc7ea55b71e724fe5c23452fe22a1
 * ```
 */
export class ObservabilityConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing ObservabilityConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ObservabilityConfigurationState, opts?: pulumi.CustomResourceOptions): ObservabilityConfiguration {
        return new ObservabilityConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:apprunner/observabilityConfiguration:ObservabilityConfiguration';

    /**
     * Returns true if the given object is an instance of ObservabilityConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ObservabilityConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ObservabilityConfiguration.__pulumiType;
    }

    /**
     * ARN of this observability configuration.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Whether the observability configuration has the highest `observabilityConfigurationRevision` among all configurations that share the same `observabilityConfigurationName`.
     */
    public /*out*/ readonly latest!: pulumi.Output<boolean>;
    /**
     * Name of the observability configuration.
     */
    public readonly observabilityConfigurationName!: pulumi.Output<string>;
    /**
     * The revision of this observability configuration.
     */
    public /*out*/ readonly observabilityConfigurationRevision!: pulumi.Output<number>;
    /**
     * Current state of the observability configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Configuration of the tracing feature within this observability configuration. If you don't specify it, App Runner doesn't enable tracing. See Trace Configuration below for more details.
     */
    public readonly traceConfiguration!: pulumi.Output<outputs.apprunner.ObservabilityConfigurationTraceConfiguration | undefined>;

    /**
     * Create a ObservabilityConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ObservabilityConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ObservabilityConfigurationArgs | ObservabilityConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ObservabilityConfigurationState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["latest"] = state ? state.latest : undefined;
            resourceInputs["observabilityConfigurationName"] = state ? state.observabilityConfigurationName : undefined;
            resourceInputs["observabilityConfigurationRevision"] = state ? state.observabilityConfigurationRevision : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["traceConfiguration"] = state ? state.traceConfiguration : undefined;
        } else {
            const args = argsOrState as ObservabilityConfigurationArgs | undefined;
            if ((!args || args.observabilityConfigurationName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'observabilityConfigurationName'");
            }
            resourceInputs["observabilityConfigurationName"] = args ? args.observabilityConfigurationName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["traceConfiguration"] = args ? args.traceConfiguration : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["latest"] = undefined /*out*/;
            resourceInputs["observabilityConfigurationRevision"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ObservabilityConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ObservabilityConfiguration resources.
 */
export interface ObservabilityConfigurationState {
    /**
     * ARN of this observability configuration.
     */
    arn?: pulumi.Input<string>;
    /**
     * Whether the observability configuration has the highest `observabilityConfigurationRevision` among all configurations that share the same `observabilityConfigurationName`.
     */
    latest?: pulumi.Input<boolean>;
    /**
     * Name of the observability configuration.
     */
    observabilityConfigurationName?: pulumi.Input<string>;
    /**
     * The revision of this observability configuration.
     */
    observabilityConfigurationRevision?: pulumi.Input<number>;
    /**
     * Current state of the observability configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
     */
    status?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configuration of the tracing feature within this observability configuration. If you don't specify it, App Runner doesn't enable tracing. See Trace Configuration below for more details.
     */
    traceConfiguration?: pulumi.Input<inputs.apprunner.ObservabilityConfigurationTraceConfiguration>;
}

/**
 * The set of arguments for constructing a ObservabilityConfiguration resource.
 */
export interface ObservabilityConfigurationArgs {
    /**
     * Name of the observability configuration.
     */
    observabilityConfigurationName: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configuration of the tracing feature within this observability configuration. If you don't specify it, App Runner doesn't enable tracing. See Trace Configuration below for more details.
     */
    traceConfiguration?: pulumi.Input<inputs.apprunner.ObservabilityConfigurationTraceConfiguration>;
}
