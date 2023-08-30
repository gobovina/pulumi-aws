// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages an AWS Config Configuration Aggregator
 *
 * ## Example Usage
 * ### Account Based Aggregation
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const account = new aws.cfg.ConfigurationAggregator("account", {accountAggregationSource: {
 *     accountIds: ["123456789012"],
 *     regions: ["us-west-2"],
 * }});
 * ```
 * ### Organization Based Aggregation
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const assumeRole = aws.iam.getPolicyDocument({
 *     statements: [{
 *         effect: "Allow",
 *         principals: [{
 *             type: "Service",
 *             identifiers: ["config.amazonaws.com"],
 *         }],
 *         actions: ["sts:AssumeRole"],
 *     }],
 * });
 * const organizationRole = new aws.iam.Role("organizationRole", {assumeRolePolicy: assumeRole.then(assumeRole => assumeRole.json)});
 * const organizationRolePolicyAttachment = new aws.iam.RolePolicyAttachment("organizationRolePolicyAttachment", {
 *     role: organizationRole.name,
 *     policyArn: "arn:aws:iam::aws:policy/service-role/AWSConfigRoleForOrganizations",
 * });
 * const organizationConfigurationAggregator = new aws.cfg.ConfigurationAggregator("organizationConfigurationAggregator", {organizationAggregationSource: {
 *     allRegions: true,
 *     roleArn: organizationRole.arn,
 * }}, {
 *     dependsOn: [organizationRolePolicyAttachment],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Configuration Aggregators using the name. For example:
 *
 * ```sh
 *  $ pulumi import aws:cfg/configurationAggregator:ConfigurationAggregator example foo
 * ```
 */
export class ConfigurationAggregator extends pulumi.CustomResource {
    /**
     * Get an existing ConfigurationAggregator resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConfigurationAggregatorState, opts?: pulumi.CustomResourceOptions): ConfigurationAggregator {
        return new ConfigurationAggregator(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cfg/configurationAggregator:ConfigurationAggregator';

    /**
     * Returns true if the given object is an instance of ConfigurationAggregator.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConfigurationAggregator {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConfigurationAggregator.__pulumiType;
    }

    /**
     * The account(s) to aggregate config data from as documented below.
     */
    public readonly accountAggregationSource!: pulumi.Output<outputs.cfg.ConfigurationAggregatorAccountAggregationSource | undefined>;
    /**
     * The ARN of the aggregator
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The name of the configuration aggregator.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The organization to aggregate config data from as documented below.
     */
    public readonly organizationAggregationSource!: pulumi.Output<outputs.cfg.ConfigurationAggregatorOrganizationAggregationSource | undefined>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     *
     * Either `accountAggregationSource` or `organizationAggregationSource` must be specified.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a ConfigurationAggregator resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ConfigurationAggregatorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConfigurationAggregatorArgs | ConfigurationAggregatorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConfigurationAggregatorState | undefined;
            resourceInputs["accountAggregationSource"] = state ? state.accountAggregationSource : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["organizationAggregationSource"] = state ? state.organizationAggregationSource : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ConfigurationAggregatorArgs | undefined;
            resourceInputs["accountAggregationSource"] = args ? args.accountAggregationSource : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["organizationAggregationSource"] = args ? args.organizationAggregationSource : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ConfigurationAggregator.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ConfigurationAggregator resources.
 */
export interface ConfigurationAggregatorState {
    /**
     * The account(s) to aggregate config data from as documented below.
     */
    accountAggregationSource?: pulumi.Input<inputs.cfg.ConfigurationAggregatorAccountAggregationSource>;
    /**
     * The ARN of the aggregator
     */
    arn?: pulumi.Input<string>;
    /**
     * The name of the configuration aggregator.
     */
    name?: pulumi.Input<string>;
    /**
     * The organization to aggregate config data from as documented below.
     */
    organizationAggregationSource?: pulumi.Input<inputs.cfg.ConfigurationAggregatorOrganizationAggregationSource>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     *
     * Either `accountAggregationSource` or `organizationAggregationSource` must be specified.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a ConfigurationAggregator resource.
 */
export interface ConfigurationAggregatorArgs {
    /**
     * The account(s) to aggregate config data from as documented below.
     */
    accountAggregationSource?: pulumi.Input<inputs.cfg.ConfigurationAggregatorAccountAggregationSource>;
    /**
     * The name of the configuration aggregator.
     */
    name?: pulumi.Input<string>;
    /**
     * The organization to aggregate config data from as documented below.
     */
    organizationAggregationSource?: pulumi.Input<inputs.cfg.ConfigurationAggregatorOrganizationAggregationSource>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     *
     * Either `accountAggregationSource` or `organizationAggregationSource` must be specified.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
