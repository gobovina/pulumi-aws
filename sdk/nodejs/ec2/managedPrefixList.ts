// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a managed prefix list resource.
 *
 * > **NOTE on Managed Prefix Lists and Managed Prefix List Entries:** The provider
 * currently provides both a standalone Managed Prefix List Entry resource (a single entry),
 * and a Managed Prefix List resource with entries defined in-line. At this time you
 * cannot use a Managed Prefix List with in-line rules in conjunction with any Managed
 * Prefix List Entry resources. Doing so will cause a conflict of entries and will overwrite entries.
 *
 * > **NOTE on `maxEntries`:** When you reference a Prefix List in a resource,
 * the maximum number of entries for the prefix lists counts as the same number of rules
 * or entries for the resource. For example, if you create a prefix list with a maximum
 * of 20 entries and you reference that prefix list in a security group rule, this counts
 * as 20 rules for the security group.
 *
 * ## Example Usage
 *
 * Basic usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ec2.ManagedPrefixList("example", {
 *     addressFamily: "IPv4",
 *     maxEntries: 5,
 *     entries: [
 *         {
 *             cidr: aws_vpc.example.cidr_block,
 *             description: "Primary",
 *         },
 *         {
 *             cidr: aws_vpc_ipv4_cidr_block_association.example.cidr_block,
 *             description: "Secondary",
 *         },
 *     ],
 *     tags: {
 *         Env: "live",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Prefix Lists using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:ec2/managedPrefixList:ManagedPrefixList default pl-0570a1d2d725c16be
 * ```
 */
export class ManagedPrefixList extends pulumi.CustomResource {
    /**
     * Get an existing ManagedPrefixList resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ManagedPrefixListState, opts?: pulumi.CustomResourceOptions): ManagedPrefixList {
        return new ManagedPrefixList(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/managedPrefixList:ManagedPrefixList';

    /**
     * Returns true if the given object is an instance of ManagedPrefixList.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ManagedPrefixList {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ManagedPrefixList.__pulumiType;
    }

    /**
     * Address family (`IPv4` or `IPv6`) of this prefix list.
     */
    public readonly addressFamily!: pulumi.Output<string>;
    /**
     * ARN of the prefix list.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Configuration block for prefix list entry. Detailed below. Different entries may have overlapping CIDR blocks, but a particular CIDR should not be duplicated.
     */
    public readonly entries!: pulumi.Output<outputs.ec2.ManagedPrefixListEntry[]>;
    /**
     * Maximum number of entries that this prefix list can contain.
     */
    public readonly maxEntries!: pulumi.Output<number>;
    /**
     * Name of this resource. The name must not start with `com.amazonaws`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * ID of the AWS account that owns this prefix list.
     */
    public /*out*/ readonly ownerId!: pulumi.Output<string>;
    /**
     * Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Latest version of this prefix list.
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a ManagedPrefixList resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ManagedPrefixListArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ManagedPrefixListArgs | ManagedPrefixListState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ManagedPrefixListState | undefined;
            resourceInputs["addressFamily"] = state ? state.addressFamily : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["entries"] = state ? state.entries : undefined;
            resourceInputs["maxEntries"] = state ? state.maxEntries : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as ManagedPrefixListArgs | undefined;
            if ((!args || args.addressFamily === undefined) && !opts.urn) {
                throw new Error("Missing required property 'addressFamily'");
            }
            if ((!args || args.maxEntries === undefined) && !opts.urn) {
                throw new Error("Missing required property 'maxEntries'");
            }
            resourceInputs["addressFamily"] = args ? args.addressFamily : undefined;
            resourceInputs["entries"] = args ? args.entries : undefined;
            resourceInputs["maxEntries"] = args ? args.maxEntries : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["ownerId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ManagedPrefixList.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ManagedPrefixList resources.
 */
export interface ManagedPrefixListState {
    /**
     * Address family (`IPv4` or `IPv6`) of this prefix list.
     */
    addressFamily?: pulumi.Input<string>;
    /**
     * ARN of the prefix list.
     */
    arn?: pulumi.Input<string>;
    /**
     * Configuration block for prefix list entry. Detailed below. Different entries may have overlapping CIDR blocks, but a particular CIDR should not be duplicated.
     */
    entries?: pulumi.Input<pulumi.Input<inputs.ec2.ManagedPrefixListEntry>[]>;
    /**
     * Maximum number of entries that this prefix list can contain.
     */
    maxEntries?: pulumi.Input<number>;
    /**
     * Name of this resource. The name must not start with `com.amazonaws`.
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the AWS account that owns this prefix list.
     */
    ownerId?: pulumi.Input<string>;
    /**
     * Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Latest version of this prefix list.
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ManagedPrefixList resource.
 */
export interface ManagedPrefixListArgs {
    /**
     * Address family (`IPv4` or `IPv6`) of this prefix list.
     */
    addressFamily: pulumi.Input<string>;
    /**
     * Configuration block for prefix list entry. Detailed below. Different entries may have overlapping CIDR blocks, but a particular CIDR should not be duplicated.
     */
    entries?: pulumi.Input<pulumi.Input<inputs.ec2.ManagedPrefixListEntry>[]>;
    /**
     * Maximum number of entries that this prefix list can contain.
     */
    maxEntries: pulumi.Input<number>;
    /**
     * Name of this resource. The name must not start with `com.amazonaws`.
     */
    name?: pulumi.Input<string>;
    /**
     * Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
