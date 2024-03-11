// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages a Route53 Hosted Zone. For managing Domain Name System Security Extensions (DNSSEC), see the `aws.route53.KeySigningKey` and `aws.route53.HostedZoneDnsSec` resources.
 *
 * ## Example Usage
 *
 * ### Public Zone
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const primary = new aws.route53.Zone("primary", {name: "example.com"});
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Public Subdomain Zone
 *
 * For use in subdomains, note that you need to create a
 * `aws.route53.Record` of type `NS` as well as the subdomain
 * zone.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const main = new aws.route53.Zone("main", {name: "example.com"});
 * const dev = new aws.route53.Zone("dev", {
 *     name: "dev.example.com",
 *     tags: {
 *         Environment: "dev",
 *     },
 * });
 * const dev_ns = new aws.route53.Record("dev-ns", {
 *     zoneId: main.zoneId,
 *     name: "dev.example.com",
 *     type: "NS",
 *     ttl: 30,
 *     records: dev.nameServers,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Private Zone
 *
 * > **NOTE:** This provider provides both exclusive VPC associations defined in-line in this resource via `vpc` configuration blocks and a separate ` Zone VPC Association resource. At this time, you cannot use in-line VPC associations in conjunction with any  `aws.route53.ZoneAssociation`  resources with the same zone ID otherwise it will cause a perpetual difference in plan output. You can optionally use [ `ignoreChanges` ](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) to manage additional associations via the  `aws.route53.ZoneAssociation` resource.
 *
 * > **NOTE:** Private zones require at least one VPC association at all times.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const _private = new aws.route53.Zone("private", {
 *     name: "example.com",
 *     vpcs: [{
 *         vpcId: example.id,
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Route53 Zones using the zone `id`. For example:
 *
 * ```sh
 * $ pulumi import aws:route53/zone:Zone myzone Z1D633PJN98FT9
 * ```
 */
export class Zone extends pulumi.CustomResource {
    /**
     * Get an existing Zone resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZoneState, opts?: pulumi.CustomResourceOptions): Zone {
        return new Zone(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:route53/zone:Zone';

    /**
     * Returns true if the given object is an instance of Zone.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Zone {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Zone.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the Hosted Zone.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
     */
    public readonly comment!: pulumi.Output<string>;
    /**
     * The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
     */
    public readonly delegationSetId!: pulumi.Output<string | undefined>;
    /**
     * Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
     */
    public readonly forceDestroy!: pulumi.Output<boolean | undefined>;
    /**
     * This is the name of the hosted zone.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A list of name servers in associated (or default) delegation set.
     * Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
     */
    public /*out*/ readonly nameServers!: pulumi.Output<string[]>;
    /**
     * The Route 53 name server that created the SOA record.
     */
    public /*out*/ readonly primaryNameServer!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the zone. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `aws.route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
     */
    public readonly vpcs!: pulumi.Output<outputs.route53.ZoneVpc[] | undefined>;
    /**
     * The Hosted Zone ID. This can be referenced by zone records.
     */
    public /*out*/ readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a Zone resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ZoneArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZoneArgs | ZoneState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZoneState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["delegationSetId"] = state ? state.delegationSetId : undefined;
            resourceInputs["forceDestroy"] = state ? state.forceDestroy : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nameServers"] = state ? state.nameServers : undefined;
            resourceInputs["primaryNameServer"] = state ? state.primaryNameServer : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["vpcs"] = state ? state.vpcs : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ZoneArgs | undefined;
            resourceInputs["comment"] = (args ? args.comment : undefined) ?? "Managed by Pulumi";
            resourceInputs["delegationSetId"] = args ? args.delegationSetId : undefined;
            resourceInputs["forceDestroy"] = args ? args.forceDestroy : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcs"] = args ? args.vpcs : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["nameServers"] = undefined /*out*/;
            resourceInputs["primaryNameServer"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["zoneId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Zone.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Zone resources.
 */
export interface ZoneState {
    /**
     * The Amazon Resource Name (ARN) of the Hosted Zone.
     */
    arn?: pulumi.Input<string>;
    /**
     * A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
     */
    comment?: pulumi.Input<string>;
    /**
     * The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
     */
    delegationSetId?: pulumi.Input<string>;
    /**
     * Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
     */
    forceDestroy?: pulumi.Input<boolean>;
    /**
     * This is the name of the hosted zone.
     */
    name?: pulumi.Input<string>;
    /**
     * A list of name servers in associated (or default) delegation set.
     * Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
     */
    nameServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Route 53 name server that created the SOA record.
     */
    primaryNameServer?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the zone. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `aws.route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
     */
    vpcs?: pulumi.Input<pulumi.Input<inputs.route53.ZoneVpc>[]>;
    /**
     * The Hosted Zone ID. This can be referenced by zone records.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Zone resource.
 */
export interface ZoneArgs {
    /**
     * A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
     */
    comment?: pulumi.Input<string>;
    /**
     * The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
     */
    delegationSetId?: pulumi.Input<string>;
    /**
     * Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
     */
    forceDestroy?: pulumi.Input<boolean>;
    /**
     * This is the name of the hosted zone.
     */
    name?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the zone. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `aws.route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
     */
    vpcs?: pulumi.Input<pulumi.Input<inputs.route53.ZoneVpc>[]>;
}
