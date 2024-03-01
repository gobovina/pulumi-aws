// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS FinSpace Kx Environment.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kms.Key("example", {
 *     description: "Sample KMS Key",
 *     deletionWindowInDays: 7,
 * });
 * const exampleKxEnvironment = new aws.finspace.KxEnvironment("example", {
 *     name: "my-tf-kx-environment",
 *     kmsKeyId: example.arn,
 * });
 * ```
 * ### With Transit Gateway Configuration
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kms.Key("example", {
 *     description: "Sample KMS Key",
 *     deletionWindowInDays: 7,
 * });
 * const exampleTransitGateway = new aws.ec2transitgateway.TransitGateway("example", {description: "example"});
 * const exampleEnv = new aws.finspace.KxEnvironment("example_env", {
 *     name: "my-tf-kx-environment",
 *     description: "Environment description",
 *     kmsKeyId: example.arn,
 *     transitGatewayConfiguration: {
 *         transitGatewayId: exampleTransitGateway.id,
 *         routableCidrSpace: "100.64.0.0/26",
 *     },
 *     customDnsConfigurations: [{
 *         customDnsServerName: "example.finspace.amazonaws.com",
 *         customDnsServerIp: "10.0.0.76",
 *     }],
 * });
 * ```
 * ### With Transit Gateway Attachment Network ACL Configuration
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kms.Key("example", {
 *     description: "Sample KMS Key",
 *     deletionWindowInDays: 7,
 * });
 * const exampleTransitGateway = new aws.ec2transitgateway.TransitGateway("example", {description: "example"});
 * const exampleEnv = new aws.finspace.KxEnvironment("example_env", {
 *     name: "my-tf-kx-environment",
 *     description: "Environment description",
 *     kmsKeyId: example.arn,
 *     transitGatewayConfiguration: {
 *         transitGatewayId: exampleTransitGateway.id,
 *         routableCidrSpace: "100.64.0.0/26",
 *         attachmentNetworkAclConfigurations: [{
 *             ruleNumber: 1,
 *             protocol: "6",
 *             ruleAction: "allow",
 *             cidrBlock: "0.0.0.0/0",
 *             portRange: {
 *                 from: 53,
 *                 to: 53,
 *             },
 *             icmpTypeCode: {
 *                 type: -1,
 *                 code: -1,
 *             },
 *         }],
 *     },
 *     customDnsConfigurations: [{
 *         customDnsServerName: "example.finspace.amazonaws.com",
 *         customDnsServerIp: "10.0.0.76",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import an AWS FinSpace Kx Environment using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:finspace/kxEnvironment:KxEnvironment example n3ceo7wqxoxcti5tujqwzs
 * ```
 */
export class KxEnvironment extends pulumi.CustomResource {
    /**
     * Get an existing KxEnvironment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KxEnvironmentState, opts?: pulumi.CustomResourceOptions): KxEnvironment {
        return new KxEnvironment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:finspace/kxEnvironment:KxEnvironment';

    /**
     * Returns true if the given object is an instance of KxEnvironment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KxEnvironment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KxEnvironment.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) identifier of the KX environment.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * AWS Availability Zone IDs that this environment is available in. Important when selecting VPC subnets to use in cluster creation.
     */
    public /*out*/ readonly availabilityZones!: pulumi.Output<string[]>;
    /**
     * Timestamp at which the environment is created in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
     */
    public /*out*/ readonly createdTimestamp!: pulumi.Output<string>;
    /**
     * List of DNS server name and server IP. This is used to set up Route-53 outbound resolvers. Defined below.
     */
    public readonly customDnsConfigurations!: pulumi.Output<outputs.finspace.KxEnvironmentCustomDnsConfiguration[] | undefined>;
    /**
     * Description for the KX environment.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier for the AWS environment infrastructure account.
     */
    public /*out*/ readonly infrastructureAccountId!: pulumi.Output<string>;
    /**
     * KMS key ID to encrypt your data in the FinSpace environment.
     *
     * The following arguments are optional:
     */
    public readonly kmsKeyId!: pulumi.Output<string>;
    /**
     * Last timestamp at which the environment was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
     */
    public /*out*/ readonly lastModifiedTimestamp!: pulumi.Output<string>;
    /**
     * Name of the KX environment that you want to create.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Status of environment creation
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Transit gateway and network configuration that is used to connect the KX environment to an internal network. Defined below.
     */
    public readonly transitGatewayConfiguration!: pulumi.Output<outputs.finspace.KxEnvironmentTransitGatewayConfiguration | undefined>;

    /**
     * Create a KxEnvironment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KxEnvironmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KxEnvironmentArgs | KxEnvironmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KxEnvironmentState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["availabilityZones"] = state ? state.availabilityZones : undefined;
            resourceInputs["createdTimestamp"] = state ? state.createdTimestamp : undefined;
            resourceInputs["customDnsConfigurations"] = state ? state.customDnsConfigurations : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["infrastructureAccountId"] = state ? state.infrastructureAccountId : undefined;
            resourceInputs["kmsKeyId"] = state ? state.kmsKeyId : undefined;
            resourceInputs["lastModifiedTimestamp"] = state ? state.lastModifiedTimestamp : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["transitGatewayConfiguration"] = state ? state.transitGatewayConfiguration : undefined;
        } else {
            const args = argsOrState as KxEnvironmentArgs | undefined;
            if ((!args || args.kmsKeyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kmsKeyId'");
            }
            resourceInputs["customDnsConfigurations"] = args ? args.customDnsConfigurations : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["kmsKeyId"] = args ? args.kmsKeyId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["transitGatewayConfiguration"] = args ? args.transitGatewayConfiguration : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["availabilityZones"] = undefined /*out*/;
            resourceInputs["createdTimestamp"] = undefined /*out*/;
            resourceInputs["infrastructureAccountId"] = undefined /*out*/;
            resourceInputs["lastModifiedTimestamp"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(KxEnvironment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KxEnvironment resources.
 */
export interface KxEnvironmentState {
    /**
     * Amazon Resource Name (ARN) identifier of the KX environment.
     */
    arn?: pulumi.Input<string>;
    /**
     * AWS Availability Zone IDs that this environment is available in. Important when selecting VPC subnets to use in cluster creation.
     */
    availabilityZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Timestamp at which the environment is created in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
     */
    createdTimestamp?: pulumi.Input<string>;
    /**
     * List of DNS server name and server IP. This is used to set up Route-53 outbound resolvers. Defined below.
     */
    customDnsConfigurations?: pulumi.Input<pulumi.Input<inputs.finspace.KxEnvironmentCustomDnsConfiguration>[]>;
    /**
     * Description for the KX environment.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier for the AWS environment infrastructure account.
     */
    infrastructureAccountId?: pulumi.Input<string>;
    /**
     * KMS key ID to encrypt your data in the FinSpace environment.
     *
     * The following arguments are optional:
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * Last timestamp at which the environment was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
     */
    lastModifiedTimestamp?: pulumi.Input<string>;
    /**
     * Name of the KX environment that you want to create.
     */
    name?: pulumi.Input<string>;
    /**
     * Status of environment creation
     */
    status?: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Transit gateway and network configuration that is used to connect the KX environment to an internal network. Defined below.
     */
    transitGatewayConfiguration?: pulumi.Input<inputs.finspace.KxEnvironmentTransitGatewayConfiguration>;
}

/**
 * The set of arguments for constructing a KxEnvironment resource.
 */
export interface KxEnvironmentArgs {
    /**
     * List of DNS server name and server IP. This is used to set up Route-53 outbound resolvers. Defined below.
     */
    customDnsConfigurations?: pulumi.Input<pulumi.Input<inputs.finspace.KxEnvironmentCustomDnsConfiguration>[]>;
    /**
     * Description for the KX environment.
     */
    description?: pulumi.Input<string>;
    /**
     * KMS key ID to encrypt your data in the FinSpace environment.
     *
     * The following arguments are optional:
     */
    kmsKeyId: pulumi.Input<string>;
    /**
     * Name of the KX environment that you want to create.
     */
    name?: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Transit gateway and network configuration that is used to connect the KX environment to an internal network. Defined below.
     */
    transitGatewayConfiguration?: pulumi.Input<inputs.finspace.KxEnvironmentTransitGatewayConfiguration>;
}
