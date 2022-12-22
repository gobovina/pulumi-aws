// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Creates a grouping of protected resources so they can be handled as a collective.
 * This resource grouping improves the accuracy of detection and reduces false positives. For more information see
 * [Managing AWS Shield Advanced protection groups](https://docs.aws.amazon.com/waf/latest/developerguide/manage-protection-group.html)
 *
 * ## Example Usage
 * ### Create protection group for all resources
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.shield.ProtectionGroup("example", {
 *     aggregation: "MAX",
 *     pattern: "ALL",
 *     protectionGroupId: "example",
 * });
 * ```
 * ### Create protection group for arbitrary number of resources
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const currentRegion = aws.getRegion({});
 * const currentCallerIdentity = aws.getCallerIdentity({});
 * const exampleEip = new aws.ec2.Eip("exampleEip", {vpc: true});
 * const exampleProtection = new aws.shield.Protection("exampleProtection", {resourceArn: pulumi.all([currentRegion, currentCallerIdentity, exampleEip.id]).apply(([currentRegion, currentCallerIdentity, id]) => `arn:aws:ec2:${currentRegion.name}:${currentCallerIdentity.accountId}:eip-allocation/${id}`)});
 * const exampleProtectionGroup = new aws.shield.ProtectionGroup("exampleProtectionGroup", {
 *     protectionGroupId: "example",
 *     aggregation: "MEAN",
 *     pattern: "ARBITRARY",
 *     members: [pulumi.all([currentRegion, currentCallerIdentity, exampleEip.id]).apply(([currentRegion, currentCallerIdentity, id]) => `arn:aws:ec2:${currentRegion.name}:${currentCallerIdentity.accountId}:eip-allocation/${id}`)],
 * }, {
 *     dependsOn: [exampleProtection],
 * });
 * ```
 * ### Create protection group for a type of resource
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.shield.ProtectionGroup("example", {
 *     aggregation: "SUM",
 *     pattern: "BY_RESOURCE_TYPE",
 *     protectionGroupId: "example",
 *     resourceType: "ELASTIC_IP_ALLOCATION",
 * });
 * ```
 *
 * ## Import
 *
 * Shield protection group resources can be imported by specifying their protection group id.
 *
 * ```sh
 *  $ pulumi import aws:shield/protectionGroup:ProtectionGroup example example
 * ```
 */
export class ProtectionGroup extends pulumi.CustomResource {
    /**
     * Get an existing ProtectionGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProtectionGroupState, opts?: pulumi.CustomResourceOptions): ProtectionGroup {
        return new ProtectionGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:shield/protectionGroup:ProtectionGroup';

    /**
     * Returns true if the given object is an instance of ProtectionGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProtectionGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProtectionGroup.__pulumiType;
    }

    /**
     * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
     */
    public readonly aggregation!: pulumi.Output<string>;
    /**
     * The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
     */
    public readonly members!: pulumi.Output<string[] | undefined>;
    /**
     * The criteria to use to choose the protected resources for inclusion in the group.
     */
    public readonly pattern!: pulumi.Output<string>;
    /**
     * The ARN (Amazon Resource Name) of the protection group.
     */
    public /*out*/ readonly protectionGroupArn!: pulumi.Output<string>;
    /**
     * The name of the protection group.
     */
    public readonly protectionGroupId!: pulumi.Output<string>;
    /**
     * The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
     */
    public readonly resourceType!: pulumi.Output<string | undefined>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a ProtectionGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProtectionGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProtectionGroupArgs | ProtectionGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProtectionGroupState | undefined;
            resourceInputs["aggregation"] = state ? state.aggregation : undefined;
            resourceInputs["members"] = state ? state.members : undefined;
            resourceInputs["pattern"] = state ? state.pattern : undefined;
            resourceInputs["protectionGroupArn"] = state ? state.protectionGroupArn : undefined;
            resourceInputs["protectionGroupId"] = state ? state.protectionGroupId : undefined;
            resourceInputs["resourceType"] = state ? state.resourceType : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ProtectionGroupArgs | undefined;
            if ((!args || args.aggregation === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aggregation'");
            }
            if ((!args || args.pattern === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pattern'");
            }
            if ((!args || args.protectionGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'protectionGroupId'");
            }
            resourceInputs["aggregation"] = args ? args.aggregation : undefined;
            resourceInputs["members"] = args ? args.members : undefined;
            resourceInputs["pattern"] = args ? args.pattern : undefined;
            resourceInputs["protectionGroupId"] = args ? args.protectionGroupId : undefined;
            resourceInputs["resourceType"] = args ? args.resourceType : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["protectionGroupArn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProtectionGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProtectionGroup resources.
 */
export interface ProtectionGroupState {
    /**
     * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
     */
    aggregation?: pulumi.Input<string>;
    /**
     * The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
     */
    members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The criteria to use to choose the protected resources for inclusion in the group.
     */
    pattern?: pulumi.Input<string>;
    /**
     * The ARN (Amazon Resource Name) of the protection group.
     */
    protectionGroupArn?: pulumi.Input<string>;
    /**
     * The name of the protection group.
     */
    protectionGroupId?: pulumi.Input<string>;
    /**
     * The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
     */
    resourceType?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a ProtectionGroup resource.
 */
export interface ProtectionGroupArgs {
    /**
     * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
     */
    aggregation: pulumi.Input<string>;
    /**
     * The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
     */
    members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The criteria to use to choose the protected resources for inclusion in the group.
     */
    pattern: pulumi.Input<string>;
    /**
     * The name of the protection group.
     */
    protectionGroupId: pulumi.Input<string>;
    /**
     * The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
     */
    resourceType?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
