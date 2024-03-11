// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS OpenSearch Serverless Access Policy. See AWS documentation for [data access policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html) and [supported data access policy permissions](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html#serverless-data-supported-permissions).
 *
 * ## Example Usage
 *
 * ### Grant all collection and index permissions
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getCallerIdentity({});
 * const example = new aws.opensearch.ServerlessAccessPolicy("example", {
 *     name: "example",
 *     type: "data",
 *     description: "read and write permissions",
 *     policy: JSON.stringify([{
 *         rules: [
 *             {
 *                 resourceType: "index",
 *                 resource: ["index/example-collection/*"],
 *                 permission: ["aoss:*"],
 *             },
 *             {
 *                 resourceType: "collection",
 *                 resource: ["collection/example-collection"],
 *                 permission: ["aoss:*"],
 *             },
 *         ],
 *         principal: [current.then(current => current.arn)],
 *     }]),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Grant read-only collection and index permissions
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getCallerIdentity({});
 * const example = new aws.opensearch.ServerlessAccessPolicy("example", {
 *     name: "example",
 *     type: "data",
 *     description: "read-only permissions",
 *     policy: JSON.stringify([{
 *         rules: [
 *             {
 *                 resourceType: "index",
 *                 resource: ["index/example-collection/*"],
 *                 permission: [
 *                     "aoss:DescribeIndex",
 *                     "aoss:ReadDocument",
 *                 ],
 *             },
 *             {
 *                 resourceType: "collection",
 *                 resource: ["collection/example-collection"],
 *                 permission: ["aoss:DescribeCollectionItems"],
 *             },
 *         ],
 *         principal: [current.then(current => current.arn)],
 *     }]),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Grant SAML identity permissions
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.opensearch.ServerlessAccessPolicy("example", {
 *     name: "example",
 *     type: "data",
 *     description: "saml permissions",
 *     policy: JSON.stringify([{
 *         rules: [
 *             {
 *                 resourceType: "index",
 *                 resource: ["index/example-collection/*"],
 *                 permission: ["aoss:*"],
 *             },
 *             {
 *                 resourceType: "collection",
 *                 resource: ["collection/example-collection"],
 *                 permission: ["aoss:*"],
 *             },
 *         ],
 *         principal: [
 *             "saml/123456789012/myprovider/user/Annie",
 *             "saml/123456789012/anotherprovider/group/Accounting",
 *         ],
 *     }]),
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import OpenSearchServerless Access Policy using the `name` and `type` arguments separated by a slash (`/`). For example:
 *
 * ```sh
 * $ pulumi import aws:opensearch/serverlessAccessPolicy:ServerlessAccessPolicy example example/data
 * ```
 */
export class ServerlessAccessPolicy extends pulumi.CustomResource {
    /**
     * Get an existing ServerlessAccessPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerlessAccessPolicyState, opts?: pulumi.CustomResourceOptions): ServerlessAccessPolicy {
        return new ServerlessAccessPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:opensearch/serverlessAccessPolicy:ServerlessAccessPolicy';

    /**
     * Returns true if the given object is an instance of ServerlessAccessPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServerlessAccessPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServerlessAccessPolicy.__pulumiType;
    }

    /**
     * Description of the policy. Typically used to store information about the permissions defined in the policy.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of the policy.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * JSON policy document to use as the content for the new policy
     */
    public readonly policy!: pulumi.Output<string>;
    /**
     * Version of the policy.
     */
    public /*out*/ readonly policyVersion!: pulumi.Output<string>;
    /**
     * Type of access policy. Must be `data`.
     *
     * The following arguments are optional:
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a ServerlessAccessPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerlessAccessPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerlessAccessPolicyArgs | ServerlessAccessPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerlessAccessPolicyState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policy"] = state ? state.policy : undefined;
            resourceInputs["policyVersion"] = state ? state.policyVersion : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as ServerlessAccessPolicyArgs | undefined;
            if ((!args || args.policy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policy'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["policy"] = args ? args.policy : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["policyVersion"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServerlessAccessPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServerlessAccessPolicy resources.
 */
export interface ServerlessAccessPolicyState {
    /**
     * Description of the policy. Typically used to store information about the permissions defined in the policy.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the policy.
     */
    name?: pulumi.Input<string>;
    /**
     * JSON policy document to use as the content for the new policy
     */
    policy?: pulumi.Input<string>;
    /**
     * Version of the policy.
     */
    policyVersion?: pulumi.Input<string>;
    /**
     * Type of access policy. Must be `data`.
     *
     * The following arguments are optional:
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServerlessAccessPolicy resource.
 */
export interface ServerlessAccessPolicyArgs {
    /**
     * Description of the policy. Typically used to store information about the permissions defined in the policy.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the policy.
     */
    name?: pulumi.Input<string>;
    /**
     * JSON policy document to use as the content for the new policy
     */
    policy: pulumi.Input<string>;
    /**
     * Type of access policy. Must be `data`.
     *
     * The following arguments are optional:
     */
    type: pulumi.Input<string>;
}
