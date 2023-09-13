// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a CodeStar Connection.
 *
 * > **NOTE:** The `aws.codestarconnections.Connection` resource is created in the state `PENDING`. Authentication with the connection provider must be completed in the AWS Console. See the [AWS documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/connections-update.html) for details.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleConnection = new aws.codestarconnections.Connection("exampleConnection", {providerType: "Bitbucket"});
 * const examplePipeline = new aws.codepipeline.Pipeline("examplePipeline", {
 *     roleArn: aws_iam_role.codepipeline_role.arn,
 *     artifactStores: [{}],
 *     stages: [
 *         {
 *             name: "Source",
 *             actions: [{
 *                 name: "Source",
 *                 category: "Source",
 *                 owner: "AWS",
 *                 provider: "CodeStarSourceConnection",
 *                 version: "1",
 *                 outputArtifacts: ["source_output"],
 *                 configuration: {
 *                     ConnectionArn: exampleConnection.arn,
 *                     FullRepositoryId: "my-organization/test",
 *                     BranchName: "main",
 *                 },
 *             }],
 *         },
 *         {
 *             name: "Build",
 *             actions: [{}],
 *         },
 *         {
 *             name: "Deploy",
 *             actions: [{}],
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * In TODO v1.5.0 and later, use an `import` block to import CodeStar connections using the ARN. For exampleterraform import {
 *
 *  to = aws_codestarconnections_connection.test-connection
 *
 *  id = "arn:aws:codestar-connections:us-west-1:0123456789:connection/79d4d357-a2ee-41e4-b350-2fe39ae59448" } Using `TODO import`, import CodeStar connections using the ARN. For exampleconsole % TODO import aws_codestarconnections_connection.test-connection arn:aws:codestar-connections:us-west-1:0123456789:connection/79d4d357-a2ee-41e4-b350-2fe39ae59448
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
    public static readonly __pulumiType = 'aws:codestarconnections/connection:Connection';

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
     * The codestar connection ARN.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The codestar connection status. Possible values are `PENDING`, `AVAILABLE` and `ERROR`.
     */
    public /*out*/ readonly connectionStatus!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) of the host associated with the connection. Conflicts with `providerType`
     */
    public readonly hostArn!: pulumi.Output<string | undefined>;
    /**
     * The name of the connection to be created. The name must be unique in the calling AWS account. Changing `name` will create a new resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the external provider where your third-party code repository is configured. Valid values are `Bitbucket`, `GitHub` or `GitHubEnterpriseServer`. Changing `providerType` will create a new resource. Conflicts with `hostArn`
     */
    public readonly providerType!: pulumi.Output<string>;
    /**
     * Map of key-value resource tags to associate with the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
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
            resourceInputs["connectionStatus"] = state ? state.connectionStatus : undefined;
            resourceInputs["hostArn"] = state ? state.hostArn : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["providerType"] = state ? state.providerType : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ConnectionArgs | undefined;
            resourceInputs["hostArn"] = args ? args.hostArn : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["providerType"] = args ? args.providerType : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["connectionStatus"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Connection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    /**
     * The codestar connection ARN.
     */
    arn?: pulumi.Input<string>;
    /**
     * The codestar connection status. Possible values are `PENDING`, `AVAILABLE` and `ERROR`.
     */
    connectionStatus?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the host associated with the connection. Conflicts with `providerType`
     */
    hostArn?: pulumi.Input<string>;
    /**
     * The name of the connection to be created. The name must be unique in the calling AWS account. Changing `name` will create a new resource.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the external provider where your third-party code repository is configured. Valid values are `Bitbucket`, `GitHub` or `GitHubEnterpriseServer`. Changing `providerType` will create a new resource. Conflicts with `hostArn`
     */
    providerType?: pulumi.Input<string>;
    /**
     * Map of key-value resource tags to associate with the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    /**
     * The Amazon Resource Name (ARN) of the host associated with the connection. Conflicts with `providerType`
     */
    hostArn?: pulumi.Input<string>;
    /**
     * The name of the connection to be created. The name must be unique in the calling AWS account. Changing `name` will create a new resource.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the external provider where your third-party code repository is configured. Valid values are `Bitbucket`, `GitHub` or `GitHubEnterpriseServer`. Changing `providerType` will create a new resource. Conflicts with `hostArn`
     */
    providerType?: pulumi.Input<string>;
    /**
     * Map of key-value resource tags to associate with the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
