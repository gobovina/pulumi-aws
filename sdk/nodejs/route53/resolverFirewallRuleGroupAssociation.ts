// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Route 53 Resolver DNS Firewall rule group association resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.route53.ResolverFirewallRuleGroup("example", {name: "example"});
 * const exampleResolverFirewallRuleGroupAssociation = new aws.route53.ResolverFirewallRuleGroupAssociation("example", {
 *     name: "example",
 *     firewallRuleGroupId: example.id,
 *     priority: 100,
 *     vpcId: exampleAwsVpc.id,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Route 53 Resolver DNS Firewall rule group associations using the Route 53 Resolver DNS Firewall rule group association ID. For example:
 *
 * ```sh
 *  $ pulumi import aws:route53/resolverFirewallRuleGroupAssociation:ResolverFirewallRuleGroupAssociation example rslvr-frgassoc-0123456789abcdef
 * ```
 */
export class ResolverFirewallRuleGroupAssociation extends pulumi.CustomResource {
    /**
     * Get an existing ResolverFirewallRuleGroupAssociation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ResolverFirewallRuleGroupAssociationState, opts?: pulumi.CustomResourceOptions): ResolverFirewallRuleGroupAssociation {
        return new ResolverFirewallRuleGroupAssociation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:route53/resolverFirewallRuleGroupAssociation:ResolverFirewallRuleGroupAssociation';

    /**
     * Returns true if the given object is an instance of ResolverFirewallRuleGroupAssociation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ResolverFirewallRuleGroupAssociation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ResolverFirewallRuleGroupAssociation.__pulumiType;
    }

    /**
     * The ARN (Amazon Resource Name) of the firewall rule group association.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The unique identifier of the firewall rule group.
     */
    public readonly firewallRuleGroupId!: pulumi.Output<string>;
    /**
     * If enabled, this setting disallows modification or removal of the association, to help prevent against accidentally altering DNS firewall protections. Valid values: `ENABLED`, `DISABLED`.
     */
    public readonly mutationProtection!: pulumi.Output<string>;
    /**
     * A name that lets you identify the rule group association, to manage and use it.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The setting that determines the processing order of the rule group among the rule groups that you associate with the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority setting.
     */
    public readonly priority!: pulumi.Output<number>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The unique identifier of the VPC that you want to associate with the rule group.
     */
    public readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a ResolverFirewallRuleGroupAssociation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ResolverFirewallRuleGroupAssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ResolverFirewallRuleGroupAssociationArgs | ResolverFirewallRuleGroupAssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ResolverFirewallRuleGroupAssociationState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["firewallRuleGroupId"] = state ? state.firewallRuleGroupId : undefined;
            resourceInputs["mutationProtection"] = state ? state.mutationProtection : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as ResolverFirewallRuleGroupAssociationArgs | undefined;
            if ((!args || args.firewallRuleGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'firewallRuleGroupId'");
            }
            if ((!args || args.priority === undefined) && !opts.urn) {
                throw new Error("Missing required property 'priority'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["firewallRuleGroupId"] = args ? args.firewallRuleGroupId : undefined;
            resourceInputs["mutationProtection"] = args ? args.mutationProtection : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ResolverFirewallRuleGroupAssociation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ResolverFirewallRuleGroupAssociation resources.
 */
export interface ResolverFirewallRuleGroupAssociationState {
    /**
     * The ARN (Amazon Resource Name) of the firewall rule group association.
     */
    arn?: pulumi.Input<string>;
    /**
     * The unique identifier of the firewall rule group.
     */
    firewallRuleGroupId?: pulumi.Input<string>;
    /**
     * If enabled, this setting disallows modification or removal of the association, to help prevent against accidentally altering DNS firewall protections. Valid values: `ENABLED`, `DISABLED`.
     */
    mutationProtection?: pulumi.Input<string>;
    /**
     * A name that lets you identify the rule group association, to manage and use it.
     */
    name?: pulumi.Input<string>;
    /**
     * The setting that determines the processing order of the rule group among the rule groups that you associate with the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority setting.
     */
    priority?: pulumi.Input<number>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The unique identifier of the VPC that you want to associate with the rule group.
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ResolverFirewallRuleGroupAssociation resource.
 */
export interface ResolverFirewallRuleGroupAssociationArgs {
    /**
     * The unique identifier of the firewall rule group.
     */
    firewallRuleGroupId: pulumi.Input<string>;
    /**
     * If enabled, this setting disallows modification or removal of the association, to help prevent against accidentally altering DNS firewall protections. Valid values: `ENABLED`, `DISABLED`.
     */
    mutationProtection?: pulumi.Input<string>;
    /**
     * A name that lets you identify the rule group association, to manage and use it.
     */
    name?: pulumi.Input<string>;
    /**
     * The setting that determines the processing order of the rule group among the rule groups that you associate with the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority setting.
     */
    priority: pulumi.Input<number>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The unique identifier of the VPC that you want to associate with the rule group.
     */
    vpcId: pulumi.Input<string>;
}
