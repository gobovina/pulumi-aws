// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an IPAM Resource Discovery resource. IPAM Resource Discoveries are resources meant for multi-organization customers. If you wish to use a single IPAM across multiple orgs, a resource discovery can be created and shared from a subordinate organization to the management organizations IPAM delegated admin account. For a full deployment example, see `aws.ec2.VpcIpamResourceDiscoveryAssociation` resource.
 *
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getRegion({});
 * const main = new aws.ec2.VpcIpamResourceDiscovery("main", {
 *     description: "My IPAM Resource Discovery",
 *     operatingRegions: [{
 *         regionName: current.then(current => current.name),
 *     }],
 *     tags: {
 *         Test: "Main",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import IPAMs using the IPAM resource discovery `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:ec2/vpcIpamResourceDiscovery:VpcIpamResourceDiscovery example ipam-res-disco-0178368ad2146a492
 * ```
 */
export class VpcIpamResourceDiscovery extends pulumi.CustomResource {
    /**
     * Get an existing VpcIpamResourceDiscovery resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VpcIpamResourceDiscoveryState, opts?: pulumi.CustomResourceOptions): VpcIpamResourceDiscovery {
        return new VpcIpamResourceDiscovery(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/vpcIpamResourceDiscovery:VpcIpamResourceDiscovery';

    /**
     * Returns true if the given object is an instance of VpcIpamResourceDiscovery.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VpcIpamResourceDiscovery {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VpcIpamResourceDiscovery.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) of IPAM Resource Discovery
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A description for the IPAM Resource Discovery.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The home region of the Resource Discovery
     */
    public /*out*/ readonly ipamResourceDiscoveryRegion!: pulumi.Output<string>;
    /**
     * A boolean to identify if the Resource Discovery is the accounts default resource discovery
     */
    public /*out*/ readonly isDefault!: pulumi.Output<boolean>;
    /**
     * Determines which regions the Resource Discovery will enable IPAM features for usage and monitoring. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM Resource Discovery. You can only create VPCs from a pool whose locale matches the VPC's Region. You specify a region using the regionName parameter. **You must set your provider block region as an operating_region.**
     */
    public readonly operatingRegions!: pulumi.Output<outputs.ec2.VpcIpamResourceDiscoveryOperatingRegion[]>;
    /**
     * The account ID for the account that manages the Resource Discovery
     */
    public /*out*/ readonly ownerId!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a VpcIpamResourceDiscovery resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VpcIpamResourceDiscoveryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VpcIpamResourceDiscoveryArgs | VpcIpamResourceDiscoveryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VpcIpamResourceDiscoveryState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["ipamResourceDiscoveryRegion"] = state ? state.ipamResourceDiscoveryRegion : undefined;
            resourceInputs["isDefault"] = state ? state.isDefault : undefined;
            resourceInputs["operatingRegions"] = state ? state.operatingRegions : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as VpcIpamResourceDiscoveryArgs | undefined;
            if ((!args || args.operatingRegions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'operatingRegions'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["operatingRegions"] = args ? args.operatingRegions : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["ipamResourceDiscoveryRegion"] = undefined /*out*/;
            resourceInputs["isDefault"] = undefined /*out*/;
            resourceInputs["ownerId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VpcIpamResourceDiscovery.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VpcIpamResourceDiscovery resources.
 */
export interface VpcIpamResourceDiscoveryState {
    /**
     * Amazon Resource Name (ARN) of IPAM Resource Discovery
     */
    arn?: pulumi.Input<string>;
    /**
     * A description for the IPAM Resource Discovery.
     */
    description?: pulumi.Input<string>;
    /**
     * The home region of the Resource Discovery
     */
    ipamResourceDiscoveryRegion?: pulumi.Input<string>;
    /**
     * A boolean to identify if the Resource Discovery is the accounts default resource discovery
     */
    isDefault?: pulumi.Input<boolean>;
    /**
     * Determines which regions the Resource Discovery will enable IPAM features for usage and monitoring. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM Resource Discovery. You can only create VPCs from a pool whose locale matches the VPC's Region. You specify a region using the regionName parameter. **You must set your provider block region as an operating_region.**
     */
    operatingRegions?: pulumi.Input<pulumi.Input<inputs.ec2.VpcIpamResourceDiscoveryOperatingRegion>[]>;
    /**
     * The account ID for the account that manages the Resource Discovery
     */
    ownerId?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
 * The set of arguments for constructing a VpcIpamResourceDiscovery resource.
 */
export interface VpcIpamResourceDiscoveryArgs {
    /**
     * A description for the IPAM Resource Discovery.
     */
    description?: pulumi.Input<string>;
    /**
     * Determines which regions the Resource Discovery will enable IPAM features for usage and monitoring. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM Resource Discovery. You can only create VPCs from a pool whose locale matches the VPC's Region. You specify a region using the regionName parameter. **You must set your provider block region as an operating_region.**
     */
    operatingRegions: pulumi.Input<pulumi.Input<inputs.ec2.VpcIpamResourceDiscoveryOperatingRegion>[]>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
