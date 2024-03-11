// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an AWS Route 53 Recovery Control Config Control Panel.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.route53recoverycontrol.ControlPanel("example", {
 *     name: "balmorhea",
 *     clusterArn: "arn:aws:route53-recovery-control::123456789012:cluster/8d47920e-d789-437d-803a-2dcc4b204393",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Route53 Recovery Control Config Control Panel using the control panel arn. For example:
 *
 * ```sh
 * $ pulumi import aws:route53recoverycontrol/controlPanel:ControlPanel mypanel arn:aws:route53-recovery-control::313517334327:controlpanel/1bfba17df8684f5dab0467b71424f7e8
 * ```
 */
export class ControlPanel extends pulumi.CustomResource {
    /**
     * Get an existing ControlPanel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ControlPanelState, opts?: pulumi.CustomResourceOptions): ControlPanel {
        return new ControlPanel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:route53recoverycontrol/controlPanel:ControlPanel';

    /**
     * Returns true if the given object is an instance of ControlPanel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ControlPanel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ControlPanel.__pulumiType;
    }

    /**
     * ARN of the control panel.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * ARN of the cluster in which this control panel will reside.
     */
    public readonly clusterArn!: pulumi.Output<string>;
    /**
     * Whether a control panel is default.
     */
    public /*out*/ readonly defaultControlPanel!: pulumi.Output<boolean>;
    /**
     * Name describing the control panel.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Number routing controls in a control panel.
     */
    public /*out*/ readonly routingControlCount!: pulumi.Output<number>;
    /**
     * Status of control panel: `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a ControlPanel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ControlPanelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ControlPanelArgs | ControlPanelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ControlPanelState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["clusterArn"] = state ? state.clusterArn : undefined;
            resourceInputs["defaultControlPanel"] = state ? state.defaultControlPanel : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["routingControlCount"] = state ? state.routingControlCount : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as ControlPanelArgs | undefined;
            if ((!args || args.clusterArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterArn'");
            }
            resourceInputs["clusterArn"] = args ? args.clusterArn : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["defaultControlPanel"] = undefined /*out*/;
            resourceInputs["routingControlCount"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ControlPanel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ControlPanel resources.
 */
export interface ControlPanelState {
    /**
     * ARN of the control panel.
     */
    arn?: pulumi.Input<string>;
    /**
     * ARN of the cluster in which this control panel will reside.
     */
    clusterArn?: pulumi.Input<string>;
    /**
     * Whether a control panel is default.
     */
    defaultControlPanel?: pulumi.Input<boolean>;
    /**
     * Name describing the control panel.
     */
    name?: pulumi.Input<string>;
    /**
     * Number routing controls in a control panel.
     */
    routingControlCount?: pulumi.Input<number>;
    /**
     * Status of control panel: `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ControlPanel resource.
 */
export interface ControlPanelArgs {
    /**
     * ARN of the cluster in which this control panel will reside.
     */
    clusterArn: pulumi.Input<string>;
    /**
     * Name describing the control panel.
     */
    name?: pulumi.Input<string>;
}
