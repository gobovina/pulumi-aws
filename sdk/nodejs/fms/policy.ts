// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a resource to create an AWS Firewall Manager policy. You need to be using AWS organizations and have enabled the Firewall Manager administrator account.
 *
 * > **NOTE:** Due to limitations with testing, we provide it as best effort. If you find it useful, and have the ability to help test or notice issues, consider reaching out to us on GitHub.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleRuleGroup = new aws.wafregional.RuleGroup("example", {
 *     metricName: "WAFRuleGroupExample",
 *     name: "WAF-Rule-Group-Example",
 * });
 * const example = new aws.fms.Policy("example", {
 *     name: "FMS-Policy-Example",
 *     excludeResourceTags: false,
 *     remediationEnabled: false,
 *     resourceType: "AWS::ElasticLoadBalancingV2::LoadBalancer",
 *     securityServicePolicyData: {
 *         type: "WAF",
 *         managedServiceData: pulumi.jsonStringify({
 *             type: "WAF",
 *             ruleGroups: [{
 *                 id: exampleRuleGroup.id,
 *                 overrideAction: {
 *                     type: "COUNT",
 *                 },
 *             }],
 *             defaultAction: {
 *                 type: "BLOCK",
 *             },
 *             overrideCustomerWebACLAssociation: false,
 *         }),
 *     },
 *     tags: {
 *         Name: "example-fms-policy",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Firewall Manager policies using the policy ID. For example:
 *
 * ```sh
 *  $ pulumi import aws:fms/policy:Policy example 5be49585-a7e3-4c49-dde1-a179fe4a619a
 * ```
 */
export class Policy extends pulumi.CustomResource {
    /**
     * Get an existing Policy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PolicyState, opts?: pulumi.CustomResourceOptions): Policy {
        return new Policy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:fms/policy:Policy';

    /**
     * Returns true if the given object is an instance of Policy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Policy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Policy.__pulumiType;
    }

    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * If true, the request will also perform a clean-up process. Defaults to `true`. More information can be found here [AWS Firewall Manager delete policy](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_DeletePolicy.html)
     */
    public readonly deleteAllPolicyResources!: pulumi.Output<boolean | undefined>;
    /**
     * If true, Firewall Manager will automatically remove protections from resources that leave the policy scope. Defaults to `false`. More information can be found here [AWS Firewall Manager policy contents](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html)
     */
    public readonly deleteUnusedFmManagedResources!: pulumi.Output<boolean | undefined>;
    /**
     * The description of the AWS Network Firewall firewall policy.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A map of lists of accounts and OU's to exclude from the policy.
     */
    public readonly excludeMap!: pulumi.Output<outputs.fms.PolicyExcludeMap | undefined>;
    /**
     * A boolean value, if true the tags that are specified in the `resourceTags` are not protected by this policy. If set to false and resourceTags are populated, resources that contain tags will be protected by this policy.
     */
    public readonly excludeResourceTags!: pulumi.Output<boolean>;
    /**
     * A map of lists of accounts and OU's to include in the policy.
     */
    public readonly includeMap!: pulumi.Output<outputs.fms.PolicyIncludeMap | undefined>;
    /**
     * The friendly name of the AWS Firewall Manager Policy.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A unique identifier for each update to the policy.
     */
    public /*out*/ readonly policyUpdateToken!: pulumi.Output<string>;
    /**
     * A boolean value, indicates if the policy should automatically applied to resources that already exist in the account.
     */
    public readonly remediationEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * A map of resource tags, that if present will filter protections on resources based on the exclude_resource_tags.
     */
    public readonly resourceTags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A resource type to protect. Conflicts with `resourceTypeList`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
     */
    public readonly resourceType!: pulumi.Output<string>;
    /**
     * A list of resource types to protect. Conflicts with `resourceType`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values. Lists with only one element are not supported, instead use `resourceType`.
     */
    public readonly resourceTypeLists!: pulumi.Output<string[]>;
    /**
     * The objects to include in Security Service Policy Data. Documented below.
     */
    public readonly securityServicePolicyData!: pulumi.Output<outputs.fms.PolicySecurityServicePolicyData>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Policy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PolicyArgs | PolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PolicyState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["deleteAllPolicyResources"] = state ? state.deleteAllPolicyResources : undefined;
            resourceInputs["deleteUnusedFmManagedResources"] = state ? state.deleteUnusedFmManagedResources : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["excludeMap"] = state ? state.excludeMap : undefined;
            resourceInputs["excludeResourceTags"] = state ? state.excludeResourceTags : undefined;
            resourceInputs["includeMap"] = state ? state.includeMap : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policyUpdateToken"] = state ? state.policyUpdateToken : undefined;
            resourceInputs["remediationEnabled"] = state ? state.remediationEnabled : undefined;
            resourceInputs["resourceTags"] = state ? state.resourceTags : undefined;
            resourceInputs["resourceType"] = state ? state.resourceType : undefined;
            resourceInputs["resourceTypeLists"] = state ? state.resourceTypeLists : undefined;
            resourceInputs["securityServicePolicyData"] = state ? state.securityServicePolicyData : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as PolicyArgs | undefined;
            if ((!args || args.excludeResourceTags === undefined) && !opts.urn) {
                throw new Error("Missing required property 'excludeResourceTags'");
            }
            if ((!args || args.securityServicePolicyData === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityServicePolicyData'");
            }
            resourceInputs["deleteAllPolicyResources"] = args ? args.deleteAllPolicyResources : undefined;
            resourceInputs["deleteUnusedFmManagedResources"] = args ? args.deleteUnusedFmManagedResources : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["excludeMap"] = args ? args.excludeMap : undefined;
            resourceInputs["excludeResourceTags"] = args ? args.excludeResourceTags : undefined;
            resourceInputs["includeMap"] = args ? args.includeMap : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["remediationEnabled"] = args ? args.remediationEnabled : undefined;
            resourceInputs["resourceTags"] = args ? args.resourceTags : undefined;
            resourceInputs["resourceType"] = args ? args.resourceType : undefined;
            resourceInputs["resourceTypeLists"] = args ? args.resourceTypeLists : undefined;
            resourceInputs["securityServicePolicyData"] = args ? args.securityServicePolicyData : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["policyUpdateToken"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Policy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Policy resources.
 */
export interface PolicyState {
    arn?: pulumi.Input<string>;
    /**
     * If true, the request will also perform a clean-up process. Defaults to `true`. More information can be found here [AWS Firewall Manager delete policy](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_DeletePolicy.html)
     */
    deleteAllPolicyResources?: pulumi.Input<boolean>;
    /**
     * If true, Firewall Manager will automatically remove protections from resources that leave the policy scope. Defaults to `false`. More information can be found here [AWS Firewall Manager policy contents](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html)
     */
    deleteUnusedFmManagedResources?: pulumi.Input<boolean>;
    /**
     * The description of the AWS Network Firewall firewall policy.
     */
    description?: pulumi.Input<string>;
    /**
     * A map of lists of accounts and OU's to exclude from the policy.
     */
    excludeMap?: pulumi.Input<inputs.fms.PolicyExcludeMap>;
    /**
     * A boolean value, if true the tags that are specified in the `resourceTags` are not protected by this policy. If set to false and resourceTags are populated, resources that contain tags will be protected by this policy.
     */
    excludeResourceTags?: pulumi.Input<boolean>;
    /**
     * A map of lists of accounts and OU's to include in the policy.
     */
    includeMap?: pulumi.Input<inputs.fms.PolicyIncludeMap>;
    /**
     * The friendly name of the AWS Firewall Manager Policy.
     */
    name?: pulumi.Input<string>;
    /**
     * A unique identifier for each update to the policy.
     */
    policyUpdateToken?: pulumi.Input<string>;
    /**
     * A boolean value, indicates if the policy should automatically applied to resources that already exist in the account.
     */
    remediationEnabled?: pulumi.Input<boolean>;
    /**
     * A map of resource tags, that if present will filter protections on resources based on the exclude_resource_tags.
     */
    resourceTags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A resource type to protect. Conflicts with `resourceTypeList`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
     */
    resourceType?: pulumi.Input<string>;
    /**
     * A list of resource types to protect. Conflicts with `resourceType`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values. Lists with only one element are not supported, instead use `resourceType`.
     */
    resourceTypeLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The objects to include in Security Service Policy Data. Documented below.
     */
    securityServicePolicyData?: pulumi.Input<inputs.fms.PolicySecurityServicePolicyData>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
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
 * The set of arguments for constructing a Policy resource.
 */
export interface PolicyArgs {
    /**
     * If true, the request will also perform a clean-up process. Defaults to `true`. More information can be found here [AWS Firewall Manager delete policy](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_DeletePolicy.html)
     */
    deleteAllPolicyResources?: pulumi.Input<boolean>;
    /**
     * If true, Firewall Manager will automatically remove protections from resources that leave the policy scope. Defaults to `false`. More information can be found here [AWS Firewall Manager policy contents](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html)
     */
    deleteUnusedFmManagedResources?: pulumi.Input<boolean>;
    /**
     * The description of the AWS Network Firewall firewall policy.
     */
    description?: pulumi.Input<string>;
    /**
     * A map of lists of accounts and OU's to exclude from the policy.
     */
    excludeMap?: pulumi.Input<inputs.fms.PolicyExcludeMap>;
    /**
     * A boolean value, if true the tags that are specified in the `resourceTags` are not protected by this policy. If set to false and resourceTags are populated, resources that contain tags will be protected by this policy.
     */
    excludeResourceTags: pulumi.Input<boolean>;
    /**
     * A map of lists of accounts and OU's to include in the policy.
     */
    includeMap?: pulumi.Input<inputs.fms.PolicyIncludeMap>;
    /**
     * The friendly name of the AWS Firewall Manager Policy.
     */
    name?: pulumi.Input<string>;
    /**
     * A boolean value, indicates if the policy should automatically applied to resources that already exist in the account.
     */
    remediationEnabled?: pulumi.Input<boolean>;
    /**
     * A map of resource tags, that if present will filter protections on resources based on the exclude_resource_tags.
     */
    resourceTags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A resource type to protect. Conflicts with `resourceTypeList`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
     */
    resourceType?: pulumi.Input<string>;
    /**
     * A list of resource types to protect. Conflicts with `resourceType`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values. Lists with only one element are not supported, instead use `resourceType`.
     */
    resourceTypeLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The objects to include in Security Service Policy Data. Documented below.
     */
    securityServicePolicyData: pulumi.Input<inputs.fms.PolicySecurityServicePolicyData>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
