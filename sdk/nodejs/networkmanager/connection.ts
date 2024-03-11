// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Creates a connection between two devices.
 * The devices can be a physical or virtual appliance that connects to a third-party appliance in a VPC, or a physical appliance that connects to another physical appliance in an on-premises network.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.networkmanager.Connection("example", {
 *     globalNetworkId: exampleAwsNetworkmanagerGlobalNetwork.id,
 *     deviceId: example1.id,
 *     connectedDeviceId: example2.id,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_networkmanager_connection` using the connection ARN. For example:
 *
 * ```sh
 * $ pulumi import aws:networkmanager/connection:Connection example arn:aws:networkmanager::123456789012:device/global-network-0d47f6t230mz46dy4/connection-07f6fd08867abc123
 * ```
 */
export class Connection extends pulumi.CustomResource {
    /**
     * Get an existing Connection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionState, opts?: pulumi.CustomResourceOptions): Connection {
        return new Connection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:networkmanager/connection:Connection';

    /**
     * Returns true if the given object is an instance of Connection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Connection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Connection.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the connection.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The ID of the second device in the connection.
     */
    public readonly connectedDeviceId!: pulumi.Output<string>;
    /**
     * The ID of the link for the second device.
     */
    public readonly connectedLinkId!: pulumi.Output<string | undefined>;
    /**
     * A description of the connection.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The ID of the first device in the connection.
     */
    public readonly deviceId!: pulumi.Output<string>;
    /**
     * The ID of the global network.
     */
    public readonly globalNetworkId!: pulumi.Output<string>;
    /**
     * The ID of the link for the first device.
     */
    public readonly linkId!: pulumi.Output<string | undefined>;
    /**
     * Key-value tags for the connection. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Connection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectionArgs | ConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectionState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["connectedDeviceId"] = state ? state.connectedDeviceId : undefined;
            resourceInputs["connectedLinkId"] = state ? state.connectedLinkId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["deviceId"] = state ? state.deviceId : undefined;
            resourceInputs["globalNetworkId"] = state ? state.globalNetworkId : undefined;
            resourceInputs["linkId"] = state ? state.linkId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ConnectionArgs | undefined;
            if ((!args || args.connectedDeviceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectedDeviceId'");
            }
            if ((!args || args.deviceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deviceId'");
            }
            if ((!args || args.globalNetworkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'globalNetworkId'");
            }
            resourceInputs["connectedDeviceId"] = args ? args.connectedDeviceId : undefined;
            resourceInputs["connectedLinkId"] = args ? args.connectedLinkId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["deviceId"] = args ? args.deviceId : undefined;
            resourceInputs["globalNetworkId"] = args ? args.globalNetworkId : undefined;
            resourceInputs["linkId"] = args ? args.linkId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Connection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    /**
     * The Amazon Resource Name (ARN) of the connection.
     */
    arn?: pulumi.Input<string>;
    /**
     * The ID of the second device in the connection.
     */
    connectedDeviceId?: pulumi.Input<string>;
    /**
     * The ID of the link for the second device.
     */
    connectedLinkId?: pulumi.Input<string>;
    /**
     * A description of the connection.
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the first device in the connection.
     */
    deviceId?: pulumi.Input<string>;
    /**
     * The ID of the global network.
     */
    globalNetworkId?: pulumi.Input<string>;
    /**
     * The ID of the link for the first device.
     */
    linkId?: pulumi.Input<string>;
    /**
     * Key-value tags for the connection. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    /**
     * The ID of the second device in the connection.
     */
    connectedDeviceId: pulumi.Input<string>;
    /**
     * The ID of the link for the second device.
     */
    connectedLinkId?: pulumi.Input<string>;
    /**
     * A description of the connection.
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the first device in the connection.
     */
    deviceId: pulumi.Input<string>;
    /**
     * The ID of the global network.
     */
    globalNetworkId: pulumi.Input<string>;
    /**
     * The ID of the link for the first device.
     */
    linkId?: pulumi.Input<string>;
    /**
     * Key-value tags for the connection. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
