// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an EventBridge Schema resource.
 *
 * > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.schemas.Registry("test", {name: "my_own_registry"});
 * const testSchema = new aws.schemas.Schema("test", {
 *     name: "my_schema",
 *     registryName: test.name,
 *     type: "OpenApi3",
 *     description: "The schema definition for my event",
 *     content: JSON.stringify({
 *         openapi: "3.0.0",
 *         info: {
 *             version: "1.0.0",
 *             title: "Event",
 *         },
 *         paths: {},
 *         components: {
 *             schemas: {
 *                 Event: {
 *                     type: "object",
 *                     properties: {
 *                         name: {
 *                             type: "string",
 *                         },
 *                     },
 *                 },
 *             },
 *         },
 *     }),
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import EventBridge schema using the `name` and `registry_name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:schemas/schema:Schema test name/registry
 * ```
 */
export class Schema extends pulumi.CustomResource {
    /**
     * Get an existing Schema resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SchemaState, opts?: pulumi.CustomResourceOptions): Schema {
        return new Schema(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:schemas/schema:Schema';

    /**
     * Returns true if the given object is an instance of Schema.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Schema {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Schema.__pulumiType;
    }

    /**
     * The Amazon Resource Name (ARN) of the discoverer.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The schema specification. Must be a valid Open API 3.0 spec.
     */
    public readonly content!: pulumi.Output<string>;
    /**
     * The description of the schema. Maximum of 256 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The last modified date of the schema.
     */
    public /*out*/ readonly lastModified!: pulumi.Output<string>;
    /**
     * The name of the schema. Maximum of 385 characters consisting of lower case letters, upper case letters, ., -, _, @.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the registry in which this schema belongs.
     */
    public readonly registryName!: pulumi.Output<string>;
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
     * The type of the schema. Valid values: `OpenApi3` or `JSONSchemaDraft4`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The version of the schema.
     */
    public /*out*/ readonly version!: pulumi.Output<string>;
    /**
     * The created date of the version of the schema.
     */
    public /*out*/ readonly versionCreatedDate!: pulumi.Output<string>;

    /**
     * Create a Schema resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SchemaArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SchemaArgs | SchemaState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SchemaState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["content"] = state ? state.content : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["lastModified"] = state ? state.lastModified : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["registryName"] = state ? state.registryName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
            resourceInputs["versionCreatedDate"] = state ? state.versionCreatedDate : undefined;
        } else {
            const args = argsOrState as SchemaArgs | undefined;
            if ((!args || args.content === undefined) && !opts.urn) {
                throw new Error("Missing required property 'content'");
            }
            if ((!args || args.registryName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'registryName'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["content"] = args ? args.content : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["registryName"] = args ? args.registryName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["lastModified"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["version"] = undefined /*out*/;
            resourceInputs["versionCreatedDate"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Schema.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Schema resources.
 */
export interface SchemaState {
    /**
     * The Amazon Resource Name (ARN) of the discoverer.
     */
    arn?: pulumi.Input<string>;
    /**
     * The schema specification. Must be a valid Open API 3.0 spec.
     */
    content?: pulumi.Input<string>;
    /**
     * The description of the schema. Maximum of 256 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * The last modified date of the schema.
     */
    lastModified?: pulumi.Input<string>;
    /**
     * The name of the schema. Maximum of 385 characters consisting of lower case letters, upper case letters, ., -, _, @.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the registry in which this schema belongs.
     */
    registryName?: pulumi.Input<string>;
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
     * The type of the schema. Valid values: `OpenApi3` or `JSONSchemaDraft4`.
     */
    type?: pulumi.Input<string>;
    /**
     * The version of the schema.
     */
    version?: pulumi.Input<string>;
    /**
     * The created date of the version of the schema.
     */
    versionCreatedDate?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Schema resource.
 */
export interface SchemaArgs {
    /**
     * The schema specification. Must be a valid Open API 3.0 spec.
     */
    content: pulumi.Input<string>;
    /**
     * The description of the schema. Maximum of 256 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the schema. Maximum of 385 characters consisting of lower case letters, upper case letters, ., -, _, @.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the registry in which this schema belongs.
     */
    registryName: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The type of the schema. Valid values: `OpenApi3` or `JSONSchemaDraft4`.
     */
    type: pulumi.Input<string>;
}
