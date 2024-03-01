// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a Keyspaces Table.
 *
 * More information about Keyspaces tables can be found in the [Keyspaces Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/working-with-tables.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.keyspaces.Table("example", {
 *     keyspaceName: exampleAwsKeyspacesKeyspace.name,
 *     tableName: "my_table",
 *     schemaDefinition: {
 *         columns: [{
 *             name: "Message",
 *             type: "ASCII",
 *         }],
 *         partitionKeys: [{
 *             name: "Message",
 *         }],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import a table using the `keyspace_name` and `table_name` separated by `/`. For example:
 *
 * ```sh
 *  $ pulumi import aws:keyspaces/table:Table example my_keyspace/my_table
 * ```
 */
export class Table extends pulumi.CustomResource {
    /**
     * Get an existing Table resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TableState, opts?: pulumi.CustomResourceOptions): Table {
        return new Table(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:keyspaces/table:Table';

    /**
     * Returns true if the given object is an instance of Table.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Table {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Table.__pulumiType;
    }

    /**
     * The ARN of the table.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Specifies the read/write throughput capacity mode for the table.
     */
    public readonly capacitySpecification!: pulumi.Output<outputs.keyspaces.TableCapacitySpecification>;
    /**
     * Enables client-side timestamps for the table. By default, the setting is disabled.
     */
    public readonly clientSideTimestamps!: pulumi.Output<outputs.keyspaces.TableClientSideTimestamps | undefined>;
    /**
     * A description of the table.
     */
    public readonly comment!: pulumi.Output<outputs.keyspaces.TableComment>;
    /**
     * The default Time to Live setting in seconds for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl).
     */
    public readonly defaultTimeToLive!: pulumi.Output<number | undefined>;
    /**
     * Specifies how the encryption key for encryption at rest is managed for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html).
     */
    public readonly encryptionSpecification!: pulumi.Output<outputs.keyspaces.TableEncryptionSpecification>;
    /**
     * The name of the keyspace that the table is going to be created in.
     */
    public readonly keyspaceName!: pulumi.Output<string>;
    /**
     * Specifies if point-in-time recovery is enabled or disabled for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html).
     */
    public readonly pointInTimeRecovery!: pulumi.Output<outputs.keyspaces.TablePointInTimeRecovery>;
    /**
     * Describes the schema of the table.
     */
    public readonly schemaDefinition!: pulumi.Output<outputs.keyspaces.TableSchemaDefinition>;
    /**
     * The name of the table.
     *
     * The following arguments are optional:
     */
    public readonly tableName!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Enables Time to Live custom settings for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html).
     */
    public readonly ttl!: pulumi.Output<outputs.keyspaces.TableTtl | undefined>;

    /**
     * Create a Table resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TableArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TableArgs | TableState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TableState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["capacitySpecification"] = state ? state.capacitySpecification : undefined;
            resourceInputs["clientSideTimestamps"] = state ? state.clientSideTimestamps : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["defaultTimeToLive"] = state ? state.defaultTimeToLive : undefined;
            resourceInputs["encryptionSpecification"] = state ? state.encryptionSpecification : undefined;
            resourceInputs["keyspaceName"] = state ? state.keyspaceName : undefined;
            resourceInputs["pointInTimeRecovery"] = state ? state.pointInTimeRecovery : undefined;
            resourceInputs["schemaDefinition"] = state ? state.schemaDefinition : undefined;
            resourceInputs["tableName"] = state ? state.tableName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["ttl"] = state ? state.ttl : undefined;
        } else {
            const args = argsOrState as TableArgs | undefined;
            if ((!args || args.keyspaceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'keyspaceName'");
            }
            if ((!args || args.schemaDefinition === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schemaDefinition'");
            }
            if ((!args || args.tableName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tableName'");
            }
            resourceInputs["capacitySpecification"] = args ? args.capacitySpecification : undefined;
            resourceInputs["clientSideTimestamps"] = args ? args.clientSideTimestamps : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["defaultTimeToLive"] = args ? args.defaultTimeToLive : undefined;
            resourceInputs["encryptionSpecification"] = args ? args.encryptionSpecification : undefined;
            resourceInputs["keyspaceName"] = args ? args.keyspaceName : undefined;
            resourceInputs["pointInTimeRecovery"] = args ? args.pointInTimeRecovery : undefined;
            resourceInputs["schemaDefinition"] = args ? args.schemaDefinition : undefined;
            resourceInputs["tableName"] = args ? args.tableName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["ttl"] = args ? args.ttl : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Table.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Table resources.
 */
export interface TableState {
    /**
     * The ARN of the table.
     */
    arn?: pulumi.Input<string>;
    /**
     * Specifies the read/write throughput capacity mode for the table.
     */
    capacitySpecification?: pulumi.Input<inputs.keyspaces.TableCapacitySpecification>;
    /**
     * Enables client-side timestamps for the table. By default, the setting is disabled.
     */
    clientSideTimestamps?: pulumi.Input<inputs.keyspaces.TableClientSideTimestamps>;
    /**
     * A description of the table.
     */
    comment?: pulumi.Input<inputs.keyspaces.TableComment>;
    /**
     * The default Time to Live setting in seconds for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl).
     */
    defaultTimeToLive?: pulumi.Input<number>;
    /**
     * Specifies how the encryption key for encryption at rest is managed for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html).
     */
    encryptionSpecification?: pulumi.Input<inputs.keyspaces.TableEncryptionSpecification>;
    /**
     * The name of the keyspace that the table is going to be created in.
     */
    keyspaceName?: pulumi.Input<string>;
    /**
     * Specifies if point-in-time recovery is enabled or disabled for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html).
     */
    pointInTimeRecovery?: pulumi.Input<inputs.keyspaces.TablePointInTimeRecovery>;
    /**
     * Describes the schema of the table.
     */
    schemaDefinition?: pulumi.Input<inputs.keyspaces.TableSchemaDefinition>;
    /**
     * The name of the table.
     *
     * The following arguments are optional:
     */
    tableName?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Enables Time to Live custom settings for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html).
     */
    ttl?: pulumi.Input<inputs.keyspaces.TableTtl>;
}

/**
 * The set of arguments for constructing a Table resource.
 */
export interface TableArgs {
    /**
     * Specifies the read/write throughput capacity mode for the table.
     */
    capacitySpecification?: pulumi.Input<inputs.keyspaces.TableCapacitySpecification>;
    /**
     * Enables client-side timestamps for the table. By default, the setting is disabled.
     */
    clientSideTimestamps?: pulumi.Input<inputs.keyspaces.TableClientSideTimestamps>;
    /**
     * A description of the table.
     */
    comment?: pulumi.Input<inputs.keyspaces.TableComment>;
    /**
     * The default Time to Live setting in seconds for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl).
     */
    defaultTimeToLive?: pulumi.Input<number>;
    /**
     * Specifies how the encryption key for encryption at rest is managed for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html).
     */
    encryptionSpecification?: pulumi.Input<inputs.keyspaces.TableEncryptionSpecification>;
    /**
     * The name of the keyspace that the table is going to be created in.
     */
    keyspaceName: pulumi.Input<string>;
    /**
     * Specifies if point-in-time recovery is enabled or disabled for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html).
     */
    pointInTimeRecovery?: pulumi.Input<inputs.keyspaces.TablePointInTimeRecovery>;
    /**
     * Describes the schema of the table.
     */
    schemaDefinition: pulumi.Input<inputs.keyspaces.TableSchemaDefinition>;
    /**
     * The name of the table.
     *
     * The following arguments are optional:
     */
    tableName: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Enables Time to Live custom settings for the table. More information can be found in the [Developer Guide](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html).
     */
    ttl?: pulumi.Input<inputs.keyspaces.TableTtl>;
}
