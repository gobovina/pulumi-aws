// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS FinSpace Kx Database.
 *
 * ## Example Usage
 *
 * ### Basic Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.kms.Key("example", {
 *     description: "Example KMS Key",
 *     deletionWindowInDays: 7,
 * });
 * const exampleKxEnvironment = new aws.finspace.KxEnvironment("example", {
 *     name: "my-tf-kx-environment",
 *     kmsKeyId: example.arn,
 * });
 * const exampleKxDatabase = new aws.finspace.KxDatabase("example", {
 *     environmentId: exampleKxEnvironment.id,
 *     name: "my-tf-kx-database",
 *     description: "Example database description",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import an AWS FinSpace Kx Database using the `id` (environment ID and database name, comma-delimited). For example:
 *
 * ```sh
 * $ pulumi import aws:finspace/kxDatabase:KxDatabase example n3ceo7wqxoxcti5tujqwzs,my-tf-kx-database
 * ```
 */
export class KxDatabase extends pulumi.CustomResource {
    /**
     * Get an existing KxDatabase resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KxDatabaseState, opts?: pulumi.CustomResourceOptions): KxDatabase {
        return new KxDatabase(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:finspace/kxDatabase:KxDatabase';

    /**
     * Returns true if the given object is an instance of KxDatabase.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KxDatabase {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KxDatabase.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) identifier of the KX database.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Timestamp at which the databse is created in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
     */
    public /*out*/ readonly createdTimestamp!: pulumi.Output<string>;
    /**
     * Description of the KX database.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier for the KX environment.
     */
    public readonly environmentId!: pulumi.Output<string>;
    /**
     * Last timestamp at which the database was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
     */
    public /*out*/ readonly lastModifiedTimestamp!: pulumi.Output<string>;
    /**
     * Name of the KX database.
     *
     * The following arguments are optional:
     */
    public readonly name!: pulumi.Output<string>;
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
     * Create a KxDatabase resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KxDatabaseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KxDatabaseArgs | KxDatabaseState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KxDatabaseState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["createdTimestamp"] = state ? state.createdTimestamp : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["environmentId"] = state ? state.environmentId : undefined;
            resourceInputs["lastModifiedTimestamp"] = state ? state.lastModifiedTimestamp : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as KxDatabaseArgs | undefined;
            if ((!args || args.environmentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environmentId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["environmentId"] = args ? args.environmentId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdTimestamp"] = undefined /*out*/;
            resourceInputs["lastModifiedTimestamp"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(KxDatabase.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KxDatabase resources.
 */
export interface KxDatabaseState {
    /**
     * Amazon Resource Name (ARN) identifier of the KX database.
     */
    arn?: pulumi.Input<string>;
    /**
     * Timestamp at which the databse is created in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
     */
    createdTimestamp?: pulumi.Input<string>;
    /**
     * Description of the KX database.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier for the KX environment.
     */
    environmentId?: pulumi.Input<string>;
    /**
     * Last timestamp at which the database was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
     */
    lastModifiedTimestamp?: pulumi.Input<string>;
    /**
     * Name of the KX database.
     *
     * The following arguments are optional:
     */
    name?: pulumi.Input<string>;
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
}

/**
 * The set of arguments for constructing a KxDatabase resource.
 */
export interface KxDatabaseArgs {
    /**
     * Description of the KX database.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier for the KX environment.
     */
    environmentId: pulumi.Input<string>;
    /**
     * Name of the KX database.
     *
     * The following arguments are optional:
     */
    name?: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
