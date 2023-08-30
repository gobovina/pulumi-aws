// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an IP address pool resource for IPAM.
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
 * const exampleVpcIpam = new aws.ec2.VpcIpam("exampleVpcIpam", {operatingRegions: [{
 *     regionName: current.then(current => current.name),
 * }]});
 * const exampleVpcIpamPool = new aws.ec2.VpcIpamPool("exampleVpcIpamPool", {
 *     addressFamily: "ipv4",
 *     ipamScopeId: exampleVpcIpam.privateDefaultScopeId,
 *     locale: current.then(current => current.name),
 * });
 * ```
 *
 * Nested Pools:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getRegion({});
 * const example = new aws.ec2.VpcIpam("example", {operatingRegions: [{
 *     regionName: current.then(current => current.name),
 * }]});
 * const parent = new aws.ec2.VpcIpamPool("parent", {
 *     addressFamily: "ipv4",
 *     ipamScopeId: example.privateDefaultScopeId,
 * });
 * const parentTest = new aws.ec2.VpcIpamPoolCidr("parentTest", {
 *     ipamPoolId: parent.id,
 *     cidr: "172.2.0.0/16",
 * });
 * const child = new aws.ec2.VpcIpamPool("child", {
 *     addressFamily: "ipv4",
 *     ipamScopeId: example.privateDefaultScopeId,
 *     locale: current.then(current => current.name),
 *     sourceIpamPoolId: parent.id,
 * });
 * const childTest = new aws.ec2.VpcIpamPoolCidr("childTest", {
 *     ipamPoolId: child.id,
 *     cidr: "172.2.0.0/24",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import IPAMs using the IPAM pool `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:ec2/vpcIpamPool:VpcIpamPool example ipam-pool-0958f95207d978e1e
 * ```
 */
export class VpcIpamPool extends pulumi.CustomResource {
    /**
     * Get an existing VpcIpamPool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VpcIpamPoolState, opts?: pulumi.CustomResourceOptions): VpcIpamPool {
        return new VpcIpamPool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/vpcIpamPool:VpcIpamPool';

    /**
     * Returns true if the given object is an instance of VpcIpamPool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VpcIpamPool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VpcIpamPool.__pulumiType;
    }

    /**
     * The IP protocol assigned to this pool. You must choose either IPv4 or IPv6 protocol for a pool.
     */
    public readonly addressFamily!: pulumi.Output<string>;
    /**
     * A default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16 (unless you provide a different netmask value when you create the new allocation).
     */
    public readonly allocationDefaultNetmaskLength!: pulumi.Output<number | undefined>;
    /**
     * The maximum netmask length that will be required for CIDR allocations in this pool.
     */
    public readonly allocationMaxNetmaskLength!: pulumi.Output<number | undefined>;
    /**
     * The minimum netmask length that will be required for CIDR allocations in this pool.
     */
    public readonly allocationMinNetmaskLength!: pulumi.Output<number | undefined>;
    /**
     * Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these tags will not be allowed to allocate space from the pool. If the resources have their tags changed after they have allocated space or if the allocation tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     */
    public readonly allocationResourceTags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Amazon Resource Name (ARN) of IPAM
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * If you include this argument, IPAM automatically imports any VPCs you have in your scope that fall
     * within the CIDR range in the pool.
     */
    public readonly autoImport!: pulumi.Output<boolean | undefined>;
    /**
     * Limits which AWS service the pool can be used in. Only useable on public scopes. Valid Values: `ec2`.
     */
    public readonly awsService!: pulumi.Output<string | undefined>;
    /**
     * A description for the IPAM pool.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The ID of the scope in which you would like to create the IPAM pool.
     */
    public readonly ipamScopeId!: pulumi.Output<string>;
    public /*out*/ readonly ipamScopeType!: pulumi.Output<string>;
    /**
     * The locale in which you would like to create the IPAM pool. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC's Region. Possible values: Any AWS region, such as `us-east-1`.
     */
    public readonly locale!: pulumi.Output<string | undefined>;
    public /*out*/ readonly poolDepth!: pulumi.Output<number>;
    /**
     * The IP address source for pools in the public scope. Only used for provisioning IP address CIDRs to pools in the public scope. Valid values are `byoip` or `amazon`. Default is `byoip`.
     */
    public readonly publicIpSource!: pulumi.Output<string | undefined>;
    /**
     * Defines whether or not IPv6 pool space is publicly advertisable over the internet. This argument is required if `addressFamily = "ipv6"` and `publicIpSource = "byoip"`, default is `false`. This option is not available for IPv4 pool space or if `publicIpSource = "amazon"`.
     */
    public readonly publiclyAdvertisable!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the source IPAM pool. Use this argument to create a child pool within an existing pool.
     */
    public readonly sourceIpamPoolId!: pulumi.Output<string | undefined>;
    /**
     * The ID of the IPAM
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a VpcIpamPool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VpcIpamPoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VpcIpamPoolArgs | VpcIpamPoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VpcIpamPoolState | undefined;
            resourceInputs["addressFamily"] = state ? state.addressFamily : undefined;
            resourceInputs["allocationDefaultNetmaskLength"] = state ? state.allocationDefaultNetmaskLength : undefined;
            resourceInputs["allocationMaxNetmaskLength"] = state ? state.allocationMaxNetmaskLength : undefined;
            resourceInputs["allocationMinNetmaskLength"] = state ? state.allocationMinNetmaskLength : undefined;
            resourceInputs["allocationResourceTags"] = state ? state.allocationResourceTags : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["autoImport"] = state ? state.autoImport : undefined;
            resourceInputs["awsService"] = state ? state.awsService : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["ipamScopeId"] = state ? state.ipamScopeId : undefined;
            resourceInputs["ipamScopeType"] = state ? state.ipamScopeType : undefined;
            resourceInputs["locale"] = state ? state.locale : undefined;
            resourceInputs["poolDepth"] = state ? state.poolDepth : undefined;
            resourceInputs["publicIpSource"] = state ? state.publicIpSource : undefined;
            resourceInputs["publiclyAdvertisable"] = state ? state.publiclyAdvertisable : undefined;
            resourceInputs["sourceIpamPoolId"] = state ? state.sourceIpamPoolId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as VpcIpamPoolArgs | undefined;
            if ((!args || args.addressFamily === undefined) && !opts.urn) {
                throw new Error("Missing required property 'addressFamily'");
            }
            if ((!args || args.ipamScopeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipamScopeId'");
            }
            resourceInputs["addressFamily"] = args ? args.addressFamily : undefined;
            resourceInputs["allocationDefaultNetmaskLength"] = args ? args.allocationDefaultNetmaskLength : undefined;
            resourceInputs["allocationMaxNetmaskLength"] = args ? args.allocationMaxNetmaskLength : undefined;
            resourceInputs["allocationMinNetmaskLength"] = args ? args.allocationMinNetmaskLength : undefined;
            resourceInputs["allocationResourceTags"] = args ? args.allocationResourceTags : undefined;
            resourceInputs["autoImport"] = args ? args.autoImport : undefined;
            resourceInputs["awsService"] = args ? args.awsService : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["ipamScopeId"] = args ? args.ipamScopeId : undefined;
            resourceInputs["locale"] = args ? args.locale : undefined;
            resourceInputs["publicIpSource"] = args ? args.publicIpSource : undefined;
            resourceInputs["publiclyAdvertisable"] = args ? args.publiclyAdvertisable : undefined;
            resourceInputs["sourceIpamPoolId"] = args ? args.sourceIpamPoolId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["ipamScopeType"] = undefined /*out*/;
            resourceInputs["poolDepth"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VpcIpamPool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VpcIpamPool resources.
 */
export interface VpcIpamPoolState {
    /**
     * The IP protocol assigned to this pool. You must choose either IPv4 or IPv6 protocol for a pool.
     */
    addressFamily?: pulumi.Input<string>;
    /**
     * A default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16 (unless you provide a different netmask value when you create the new allocation).
     */
    allocationDefaultNetmaskLength?: pulumi.Input<number>;
    /**
     * The maximum netmask length that will be required for CIDR allocations in this pool.
     */
    allocationMaxNetmaskLength?: pulumi.Input<number>;
    /**
     * The minimum netmask length that will be required for CIDR allocations in this pool.
     */
    allocationMinNetmaskLength?: pulumi.Input<number>;
    /**
     * Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these tags will not be allowed to allocate space from the pool. If the resources have their tags changed after they have allocated space or if the allocation tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     */
    allocationResourceTags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Amazon Resource Name (ARN) of IPAM
     */
    arn?: pulumi.Input<string>;
    /**
     * If you include this argument, IPAM automatically imports any VPCs you have in your scope that fall
     * within the CIDR range in the pool.
     */
    autoImport?: pulumi.Input<boolean>;
    /**
     * Limits which AWS service the pool can be used in. Only useable on public scopes. Valid Values: `ec2`.
     */
    awsService?: pulumi.Input<string>;
    /**
     * A description for the IPAM pool.
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the scope in which you would like to create the IPAM pool.
     */
    ipamScopeId?: pulumi.Input<string>;
    ipamScopeType?: pulumi.Input<string>;
    /**
     * The locale in which you would like to create the IPAM pool. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC's Region. Possible values: Any AWS region, such as `us-east-1`.
     */
    locale?: pulumi.Input<string>;
    poolDepth?: pulumi.Input<number>;
    /**
     * The IP address source for pools in the public scope. Only used for provisioning IP address CIDRs to pools in the public scope. Valid values are `byoip` or `amazon`. Default is `byoip`.
     */
    publicIpSource?: pulumi.Input<string>;
    /**
     * Defines whether or not IPv6 pool space is publicly advertisable over the internet. This argument is required if `addressFamily = "ipv6"` and `publicIpSource = "byoip"`, default is `false`. This option is not available for IPv4 pool space or if `publicIpSource = "amazon"`.
     */
    publiclyAdvertisable?: pulumi.Input<boolean>;
    /**
     * The ID of the source IPAM pool. Use this argument to create a child pool within an existing pool.
     */
    sourceIpamPoolId?: pulumi.Input<string>;
    /**
     * The ID of the IPAM
     */
    state?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a VpcIpamPool resource.
 */
export interface VpcIpamPoolArgs {
    /**
     * The IP protocol assigned to this pool. You must choose either IPv4 or IPv6 protocol for a pool.
     */
    addressFamily: pulumi.Input<string>;
    /**
     * A default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16 (unless you provide a different netmask value when you create the new allocation).
     */
    allocationDefaultNetmaskLength?: pulumi.Input<number>;
    /**
     * The maximum netmask length that will be required for CIDR allocations in this pool.
     */
    allocationMaxNetmaskLength?: pulumi.Input<number>;
    /**
     * The minimum netmask length that will be required for CIDR allocations in this pool.
     */
    allocationMinNetmaskLength?: pulumi.Input<number>;
    /**
     * Tags that are required for resources that use CIDRs from this IPAM pool. Resources that do not have these tags will not be allowed to allocate space from the pool. If the resources have their tags changed after they have allocated space or if the allocation tagging requirements are changed on the pool, the resource may be marked as noncompliant.
     */
    allocationResourceTags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * If you include this argument, IPAM automatically imports any VPCs you have in your scope that fall
     * within the CIDR range in the pool.
     */
    autoImport?: pulumi.Input<boolean>;
    /**
     * Limits which AWS service the pool can be used in. Only useable on public scopes. Valid Values: `ec2`.
     */
    awsService?: pulumi.Input<string>;
    /**
     * A description for the IPAM pool.
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the scope in which you would like to create the IPAM pool.
     */
    ipamScopeId: pulumi.Input<string>;
    /**
     * The locale in which you would like to create the IPAM pool. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC's Region. Possible values: Any AWS region, such as `us-east-1`.
     */
    locale?: pulumi.Input<string>;
    /**
     * The IP address source for pools in the public scope. Only used for provisioning IP address CIDRs to pools in the public scope. Valid values are `byoip` or `amazon`. Default is `byoip`.
     */
    publicIpSource?: pulumi.Input<string>;
    /**
     * Defines whether or not IPv6 pool space is publicly advertisable over the internet. This argument is required if `addressFamily = "ipv6"` and `publicIpSource = "byoip"`, default is `false`. This option is not available for IPv4 pool space or if `publicIpSource = "amazon"`.
     */
    publiclyAdvertisable?: pulumi.Input<boolean>;
    /**
     * The ID of the source IPAM pool. Use this argument to create a child pool within an existing pool.
     */
    sourceIpamPoolId?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
