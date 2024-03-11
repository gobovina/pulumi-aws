// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an AppConfig Configuration Profile resource.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.appconfig.ConfigurationProfile("example", {
 *     applicationId: exampleAwsAppconfigApplication.id,
 *     description: "Example Configuration Profile",
 *     name: "example-configuration-profile-tf",
 *     locationUri: "hosted",
 *     validators: [{
 *         content: exampleAwsLambdaFunction.arn,
 *         type: "LAMBDA",
 *     }],
 *     tags: {
 *         Type: "AppConfig Configuration Profile",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import AppConfig Configuration Profiles using the configuration profile ID and application ID separated by a colon (`:`). For example:
 *
 * ```sh
 * $ pulumi import aws:appconfig/configurationProfile:ConfigurationProfile example 71abcde:11xxxxx
 * ```
 */
export class ConfigurationProfile extends pulumi.CustomResource {
    /**
     * Get an existing ConfigurationProfile resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConfigurationProfileState, opts?: pulumi.CustomResourceOptions): ConfigurationProfile {
        return new ConfigurationProfile(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:appconfig/configurationProfile:ConfigurationProfile';

    /**
     * Returns true if the given object is an instance of ConfigurationProfile.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConfigurationProfile {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConfigurationProfile.__pulumiType;
    }

    /**
     * Application ID. Must be between 4 and 7 characters in length.
     */
    public readonly applicationId!: pulumi.Output<string>;
    /**
     * ARN of the AppConfig Configuration Profile.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The configuration profile ID.
     */
    public /*out*/ readonly configurationProfileId!: pulumi.Output<string>;
    /**
     * Description of the configuration profile. Can be at most 1024 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The identifier for an Key Management Service key to encrypt new configuration data versions in the AppConfig hosted configuration store. This attribute is only used for hosted configuration types. The identifier can be an KMS key ID, alias, or the Amazon Resource Name (ARN) of the key ID or alias.
     */
    public readonly kmsKeyIdentifier!: pulumi.Output<string | undefined>;
    /**
     * URI to locate the configuration. You can specify the AWS AppConfig hosted configuration store, Systems Manager (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object. For the hosted configuration store, specify `hosted`. For an SSM document, specify either the document name in the format `ssm-document://<Document_name>` or the ARN. For a parameter, specify either the parameter name in the format `ssm-parameter://<Parameter_name>` or the ARN. For an Amazon S3 object, specify the URI in the following format: `s3://<bucket>/<objectKey>`.
     */
    public readonly locationUri!: pulumi.Output<string>;
    /**
     * Name for the configuration profile. Must be between 1 and 64 characters in length.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * ARN of an IAM role with permission to access the configuration at the specified `locationUri`. A retrieval role ARN is not required for configurations stored in the AWS AppConfig `hosted` configuration store. It is required for all other sources that store your configuration.
     */
    public readonly retrievalRoleArn!: pulumi.Output<string | undefined>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Type of configurations contained in the profile. Valid values: `AWS.AppConfig.FeatureFlags` and `AWS.Freeform`.  Default: `AWS.Freeform`.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * Set of methods for validating the configuration. Maximum of 2. See Validator below for more details.
     */
    public readonly validators!: pulumi.Output<outputs.appconfig.ConfigurationProfileValidator[] | undefined>;

    /**
     * Create a ConfigurationProfile resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConfigurationProfileArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConfigurationProfileArgs | ConfigurationProfileState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConfigurationProfileState | undefined;
            resourceInputs["applicationId"] = state ? state.applicationId : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["configurationProfileId"] = state ? state.configurationProfileId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["kmsKeyIdentifier"] = state ? state.kmsKeyIdentifier : undefined;
            resourceInputs["locationUri"] = state ? state.locationUri : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["retrievalRoleArn"] = state ? state.retrievalRoleArn : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["validators"] = state ? state.validators : undefined;
        } else {
            const args = argsOrState as ConfigurationProfileArgs | undefined;
            if ((!args || args.applicationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'applicationId'");
            }
            if ((!args || args.locationUri === undefined) && !opts.urn) {
                throw new Error("Missing required property 'locationUri'");
            }
            resourceInputs["applicationId"] = args ? args.applicationId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["kmsKeyIdentifier"] = args ? args.kmsKeyIdentifier : undefined;
            resourceInputs["locationUri"] = args ? args.locationUri : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["retrievalRoleArn"] = args ? args.retrievalRoleArn : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["validators"] = args ? args.validators : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["configurationProfileId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ConfigurationProfile.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ConfigurationProfile resources.
 */
export interface ConfigurationProfileState {
    /**
     * Application ID. Must be between 4 and 7 characters in length.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * ARN of the AppConfig Configuration Profile.
     */
    arn?: pulumi.Input<string>;
    /**
     * The configuration profile ID.
     */
    configurationProfileId?: pulumi.Input<string>;
    /**
     * Description of the configuration profile. Can be at most 1024 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * The identifier for an Key Management Service key to encrypt new configuration data versions in the AppConfig hosted configuration store. This attribute is only used for hosted configuration types. The identifier can be an KMS key ID, alias, or the Amazon Resource Name (ARN) of the key ID or alias.
     */
    kmsKeyIdentifier?: pulumi.Input<string>;
    /**
     * URI to locate the configuration. You can specify the AWS AppConfig hosted configuration store, Systems Manager (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object. For the hosted configuration store, specify `hosted`. For an SSM document, specify either the document name in the format `ssm-document://<Document_name>` or the ARN. For a parameter, specify either the parameter name in the format `ssm-parameter://<Parameter_name>` or the ARN. For an Amazon S3 object, specify the URI in the following format: `s3://<bucket>/<objectKey>`.
     */
    locationUri?: pulumi.Input<string>;
    /**
     * Name for the configuration profile. Must be between 1 and 64 characters in length.
     */
    name?: pulumi.Input<string>;
    /**
     * ARN of an IAM role with permission to access the configuration at the specified `locationUri`. A retrieval role ARN is not required for configurations stored in the AWS AppConfig `hosted` configuration store. It is required for all other sources that store your configuration.
     */
    retrievalRoleArn?: pulumi.Input<string>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Type of configurations contained in the profile. Valid values: `AWS.AppConfig.FeatureFlags` and `AWS.Freeform`.  Default: `AWS.Freeform`.
     */
    type?: pulumi.Input<string>;
    /**
     * Set of methods for validating the configuration. Maximum of 2. See Validator below for more details.
     */
    validators?: pulumi.Input<pulumi.Input<inputs.appconfig.ConfigurationProfileValidator>[]>;
}

/**
 * The set of arguments for constructing a ConfigurationProfile resource.
 */
export interface ConfigurationProfileArgs {
    /**
     * Application ID. Must be between 4 and 7 characters in length.
     */
    applicationId: pulumi.Input<string>;
    /**
     * Description of the configuration profile. Can be at most 1024 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * The identifier for an Key Management Service key to encrypt new configuration data versions in the AppConfig hosted configuration store. This attribute is only used for hosted configuration types. The identifier can be an KMS key ID, alias, or the Amazon Resource Name (ARN) of the key ID or alias.
     */
    kmsKeyIdentifier?: pulumi.Input<string>;
    /**
     * URI to locate the configuration. You can specify the AWS AppConfig hosted configuration store, Systems Manager (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object. For the hosted configuration store, specify `hosted`. For an SSM document, specify either the document name in the format `ssm-document://<Document_name>` or the ARN. For a parameter, specify either the parameter name in the format `ssm-parameter://<Parameter_name>` or the ARN. For an Amazon S3 object, specify the URI in the following format: `s3://<bucket>/<objectKey>`.
     */
    locationUri: pulumi.Input<string>;
    /**
     * Name for the configuration profile. Must be between 1 and 64 characters in length.
     */
    name?: pulumi.Input<string>;
    /**
     * ARN of an IAM role with permission to access the configuration at the specified `locationUri`. A retrieval role ARN is not required for configurations stored in the AWS AppConfig `hosted` configuration store. It is required for all other sources that store your configuration.
     */
    retrievalRoleArn?: pulumi.Input<string>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Type of configurations contained in the profile. Valid values: `AWS.AppConfig.FeatureFlags` and `AWS.Freeform`.  Default: `AWS.Freeform`.
     */
    type?: pulumi.Input<string>;
    /**
     * Set of methods for validating the configuration. Maximum of 2. See Validator below for more details.
     */
    validators?: pulumi.Input<pulumi.Input<inputs.appconfig.ConfigurationProfileValidator>[]>;
}
