// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a Glue Connection resource.
 *
 * ## Example Usage
 *
 * ### Non-VPC Connection
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.glue.Connection("example", {
 *     connectionProperties: {
 *         JDBC_CONNECTION_URL: "jdbc:mysql://example.com/exampledatabase",
 *         PASSWORD: "examplepassword",
 *         USERNAME: "exampleusername",
 *     },
 *     name: "example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### VPC Connection
 *
 * For more information, see the [AWS Documentation](https://docs.aws.amazon.com/glue/latest/dg/populate-add-connection.html#connection-JDBC-VPC).
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.glue.Connection("example", {
 *     connectionProperties: {
 *         JDBC_CONNECTION_URL: `jdbc:mysql://${exampleAwsRdsCluster.endpoint}/exampledatabase`,
 *         PASSWORD: "examplepassword",
 *         USERNAME: "exampleusername",
 *     },
 *     name: "example",
 *     physicalConnectionRequirements: {
 *         availabilityZone: exampleAwsSubnet.availabilityZone,
 *         securityGroupIdLists: [exampleAwsSecurityGroup.id],
 *         subnetId: exampleAwsSubnet.id,
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Glue Connections using the `CATALOG-ID` (AWS account ID if not custom) and `NAME`. For example:
 *
 * ```sh
 * $ pulumi import aws:glue/connection:Connection MyConnection 123456789012:MyConnection
 * ```
 */
export class Connection extends pulumi.CustomResource {
    /**
     * Get an existing Connection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionState, opts?: pulumi.CustomResourceOptions): Connection {
        return new Connection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:glue/connection:Connection';

    /**
     * Returns true if the given object is an instance of Connection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Connection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Connection.__pulumiType;
    }

    /**
     * The ARN of the Glue Connection.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
     */
    public readonly catalogId!: pulumi.Output<string>;
    /**
     * A map of key-value pairs used as parameters for this connection.
     */
    public readonly connectionProperties!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The type of the connection. Supported are: `CUSTOM`, `JDBC`, `KAFKA`, `MARKETPLACE`, `MONGODB`, and `NETWORK`. Defaults to `JDBC`.
     */
    public readonly connectionType!: pulumi.Output<string | undefined>;
    /**
     * Description of the connection.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A list of criteria that can be used in selecting this connection.
     */
    public readonly matchCriterias!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the connection.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
     */
    public readonly physicalConnectionRequirements!: pulumi.Output<outputs.glue.ConnectionPhysicalConnectionRequirements | undefined>;
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
     * Create a Connection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectionArgs | ConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectionState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["catalogId"] = state ? state.catalogId : undefined;
            resourceInputs["connectionProperties"] = state ? state.connectionProperties : undefined;
            resourceInputs["connectionType"] = state ? state.connectionType : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["matchCriterias"] = state ? state.matchCriterias : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["physicalConnectionRequirements"] = state ? state.physicalConnectionRequirements : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ConnectionArgs | undefined;
            resourceInputs["catalogId"] = args ? args.catalogId : undefined;
            resourceInputs["connectionProperties"] = args?.connectionProperties ? pulumi.secret(args.connectionProperties) : undefined;
            resourceInputs["connectionType"] = args ? args.connectionType : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["matchCriterias"] = args ? args.matchCriterias : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["physicalConnectionRequirements"] = args ? args.physicalConnectionRequirements : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["connectionProperties"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Connection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    /**
     * The ARN of the Glue Connection.
     */
    arn?: pulumi.Input<string>;
    /**
     * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
     */
    catalogId?: pulumi.Input<string>;
    /**
     * A map of key-value pairs used as parameters for this connection.
     */
    connectionProperties?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The type of the connection. Supported are: `CUSTOM`, `JDBC`, `KAFKA`, `MARKETPLACE`, `MONGODB`, and `NETWORK`. Defaults to `JDBC`.
     */
    connectionType?: pulumi.Input<string>;
    /**
     * Description of the connection.
     */
    description?: pulumi.Input<string>;
    /**
     * A list of criteria that can be used in selecting this connection.
     */
    matchCriterias?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the connection.
     */
    name?: pulumi.Input<string>;
    /**
     * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
     */
    physicalConnectionRequirements?: pulumi.Input<inputs.glue.ConnectionPhysicalConnectionRequirements>;
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
}

/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    /**
     * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
     */
    catalogId?: pulumi.Input<string>;
    /**
     * A map of key-value pairs used as parameters for this connection.
     */
    connectionProperties?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The type of the connection. Supported are: `CUSTOM`, `JDBC`, `KAFKA`, `MARKETPLACE`, `MONGODB`, and `NETWORK`. Defaults to `JDBC`.
     */
    connectionType?: pulumi.Input<string>;
    /**
     * Description of the connection.
     */
    description?: pulumi.Input<string>;
    /**
     * A list of criteria that can be used in selecting this connection.
     */
    matchCriterias?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the connection.
     */
    name?: pulumi.Input<string>;
    /**
     * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
     */
    physicalConnectionRequirements?: pulumi.Input<inputs.glue.ConnectionPhysicalConnectionRequirements>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
