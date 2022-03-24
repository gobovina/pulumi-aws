// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a global network resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.networkmanager.GlobalNetwork("example", {
 *     description: "example",
 * });
 * ```
 *
 * ## Import
 *
 * `aws_networkmanager_global_network` can be imported using the global network ID, e.g.
 *
 * ```sh
 *  $ pulumi import aws:networkmanager/globalNetwork:GlobalNetwork example global-network-0d47f6t230mz46dy4
 * ```
 */
export class GlobalNetwork extends pulumi.CustomResource {
    /**
     * Get an existing GlobalNetwork resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GlobalNetworkState, opts?: pulumi.CustomResourceOptions): GlobalNetwork {
        return new GlobalNetwork(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:networkmanager/globalNetwork:GlobalNetwork';

    /**
     * Returns true if the given object is an instance of GlobalNetwork.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GlobalNetwork {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GlobalNetwork.__pulumiType;
    }

    /**
     * Global Network Amazon Resource Name (ARN)
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Description of the Global Network.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    public readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a GlobalNetwork resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: GlobalNetworkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GlobalNetworkArgs | GlobalNetworkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GlobalNetworkState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as GlobalNetworkArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["tagsAll"] = args ? args.tagsAll : undefined;
            resourceInputs["arn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GlobalNetwork.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GlobalNetwork resources.
 */
export interface GlobalNetworkState {
    /**
     * Global Network Amazon Resource Name (ARN)
     */
    arn?: pulumi.Input<string>;
    /**
     * Description of the Global Network.
     */
    description?: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a GlobalNetwork resource.
 */
export interface GlobalNetworkArgs {
    /**
     * Description of the Global Network.
     */
    description?: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
