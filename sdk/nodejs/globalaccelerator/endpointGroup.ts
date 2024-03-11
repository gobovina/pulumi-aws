// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a Global Accelerator endpoint group.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.globalaccelerator.EndpointGroup("example", {
 *     listenerArn: exampleAwsGlobalacceleratorListener.id,
 *     endpointConfigurations: [{
 *         endpointId: exampleAwsLb.arn,
 *         weight: 100,
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Global Accelerator endpoint groups using the `id`. For example:
 *
 * ```sh
 * $ pulumi import aws:globalaccelerator/endpointGroup:EndpointGroup example arn:aws:globalaccelerator::111111111111:accelerator/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/listener/xxxxxxx/endpoint-group/xxxxxxxx
 * ```
 */
export class EndpointGroup extends pulumi.CustomResource {
    /**
     * Get an existing EndpointGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EndpointGroupState, opts?: pulumi.CustomResourceOptions): EndpointGroup {
        return new EndpointGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:globalaccelerator/endpointGroup:EndpointGroup';

    /**
     * Returns true if the given object is an instance of EndpointGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EndpointGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EndpointGroup.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the endpoint group.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The list of endpoint objects. Fields documented below.
     */
    public readonly endpointConfigurations!: pulumi.Output<outputs.globalaccelerator.EndpointGroupEndpointConfiguration[] | undefined>;
    /**
     * The name of the AWS Region where the endpoint group is located.
     */
    public readonly endpointGroupRegion!: pulumi.Output<string>;
    /**
     * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
     */
    public readonly healthCheckIntervalSeconds!: pulumi.Output<number | undefined>;
    /**
     * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (`/`). the provider will only perform drift detection of its value when present in a configuration.
     */
    public readonly healthCheckPath!: pulumi.Output<string>;
    /**
     * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
     * the provider will only perform drift detection of its value when present in a configuration.
     */
    public readonly healthCheckPort!: pulumi.Output<number>;
    /**
     * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
     */
    public readonly healthCheckProtocol!: pulumi.Output<string | undefined>;
    /**
     * The Amazon Resource Name (ARN) of the listener.
     */
    public readonly listenerArn!: pulumi.Output<string>;
    /**
     * Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
     */
    public readonly portOverrides!: pulumi.Output<outputs.globalaccelerator.EndpointGroupPortOverride[] | undefined>;
    /**
     * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
     */
    public readonly thresholdCount!: pulumi.Output<number | undefined>;
    /**
     * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
     */
    public readonly trafficDialPercentage!: pulumi.Output<number | undefined>;

    /**
     * Create a EndpointGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EndpointGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EndpointGroupArgs | EndpointGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EndpointGroupState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["endpointConfigurations"] = state ? state.endpointConfigurations : undefined;
            resourceInputs["endpointGroupRegion"] = state ? state.endpointGroupRegion : undefined;
            resourceInputs["healthCheckIntervalSeconds"] = state ? state.healthCheckIntervalSeconds : undefined;
            resourceInputs["healthCheckPath"] = state ? state.healthCheckPath : undefined;
            resourceInputs["healthCheckPort"] = state ? state.healthCheckPort : undefined;
            resourceInputs["healthCheckProtocol"] = state ? state.healthCheckProtocol : undefined;
            resourceInputs["listenerArn"] = state ? state.listenerArn : undefined;
            resourceInputs["portOverrides"] = state ? state.portOverrides : undefined;
            resourceInputs["thresholdCount"] = state ? state.thresholdCount : undefined;
            resourceInputs["trafficDialPercentage"] = state ? state.trafficDialPercentage : undefined;
        } else {
            const args = argsOrState as EndpointGroupArgs | undefined;
            if ((!args || args.listenerArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'listenerArn'");
            }
            resourceInputs["endpointConfigurations"] = args ? args.endpointConfigurations : undefined;
            resourceInputs["endpointGroupRegion"] = args ? args.endpointGroupRegion : undefined;
            resourceInputs["healthCheckIntervalSeconds"] = args ? args.healthCheckIntervalSeconds : undefined;
            resourceInputs["healthCheckPath"] = args ? args.healthCheckPath : undefined;
            resourceInputs["healthCheckPort"] = args ? args.healthCheckPort : undefined;
            resourceInputs["healthCheckProtocol"] = args ? args.healthCheckProtocol : undefined;
            resourceInputs["listenerArn"] = args ? args.listenerArn : undefined;
            resourceInputs["portOverrides"] = args ? args.portOverrides : undefined;
            resourceInputs["thresholdCount"] = args ? args.thresholdCount : undefined;
            resourceInputs["trafficDialPercentage"] = args ? args.trafficDialPercentage : undefined;
            resourceInputs["arn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EndpointGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EndpointGroup resources.
 */
export interface EndpointGroupState {
    /**
     * The Amazon Resource Name (ARN) of the endpoint group.
     */
    arn?: pulumi.Input<string>;
    /**
     * The list of endpoint objects. Fields documented below.
     */
    endpointConfigurations?: pulumi.Input<pulumi.Input<inputs.globalaccelerator.EndpointGroupEndpointConfiguration>[]>;
    /**
     * The name of the AWS Region where the endpoint group is located.
     */
    endpointGroupRegion?: pulumi.Input<string>;
    /**
     * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
     */
    healthCheckIntervalSeconds?: pulumi.Input<number>;
    /**
     * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (`/`). the provider will only perform drift detection of its value when present in a configuration.
     */
    healthCheckPath?: pulumi.Input<string>;
    /**
     * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
     * the provider will only perform drift detection of its value when present in a configuration.
     */
    healthCheckPort?: pulumi.Input<number>;
    /**
     * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
     */
    healthCheckProtocol?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the listener.
     */
    listenerArn?: pulumi.Input<string>;
    /**
     * Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
     */
    portOverrides?: pulumi.Input<pulumi.Input<inputs.globalaccelerator.EndpointGroupPortOverride>[]>;
    /**
     * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
     */
    thresholdCount?: pulumi.Input<number>;
    /**
     * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
     */
    trafficDialPercentage?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a EndpointGroup resource.
 */
export interface EndpointGroupArgs {
    /**
     * The list of endpoint objects. Fields documented below.
     */
    endpointConfigurations?: pulumi.Input<pulumi.Input<inputs.globalaccelerator.EndpointGroupEndpointConfiguration>[]>;
    /**
     * The name of the AWS Region where the endpoint group is located.
     */
    endpointGroupRegion?: pulumi.Input<string>;
    /**
     * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
     */
    healthCheckIntervalSeconds?: pulumi.Input<number>;
    /**
     * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (`/`). the provider will only perform drift detection of its value when present in a configuration.
     */
    healthCheckPath?: pulumi.Input<string>;
    /**
     * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
     * the provider will only perform drift detection of its value when present in a configuration.
     */
    healthCheckPort?: pulumi.Input<number>;
    /**
     * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
     */
    healthCheckProtocol?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the listener.
     */
    listenerArn: pulumi.Input<string>;
    /**
     * Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
     */
    portOverrides?: pulumi.Input<pulumi.Input<inputs.globalaccelerator.EndpointGroupPortOverride>[]>;
    /**
     * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
     */
    thresholdCount?: pulumi.Input<number>;
    /**
     * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
     */
    trafficDialPercentage?: pulumi.Input<number>;
}
