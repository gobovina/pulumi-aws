// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a settings of an API Gateway Documentation Part.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleRestApi = new aws.apigateway.RestApi("exampleRestApi", {});
 * const exampleDocumentationPart = new aws.apigateway.DocumentationPart("exampleDocumentationPart", {
 *     location: {
 *         type: "METHOD",
 *         method: "GET",
 *         path: "/example",
 *     },
 *     properties: "{\"description\":\"Example description\"}",
 *     restApiId: exampleRestApi.id,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import API Gateway documentation_parts using `REST-API-ID/DOC-PART-ID`. For example:
 *
 * ```sh
 *  $ pulumi import aws:apigateway/documentationPart:DocumentationPart example 5i4e1ko720/3oyy3t
 * ```
 */
export class DocumentationPart extends pulumi.CustomResource {
    /**
     * Get an existing DocumentationPart resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DocumentationPartState, opts?: pulumi.CustomResourceOptions): DocumentationPart {
        return new DocumentationPart(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:apigateway/documentationPart:DocumentationPart';

    /**
     * Returns true if the given object is an instance of DocumentationPart.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DocumentationPart {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DocumentationPart.__pulumiType;
    }

    /**
     * Location of the targeted API entity of the to-be-created documentation part. See below.
     */
    public readonly location!: pulumi.Output<outputs.apigateway.DocumentationPartLocation>;
    /**
     * Content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., "{ \"description\": \"The API does ...\" }". Only Swagger-compliant key-value pairs can be exported and, hence, published.
     */
    public readonly properties!: pulumi.Output<string>;
    /**
     * ID of the associated Rest API
     */
    public readonly restApiId!: pulumi.Output<string>;

    /**
     * Create a DocumentationPart resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DocumentationPartArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DocumentationPartArgs | DocumentationPartState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DocumentationPartState | undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["properties"] = state ? state.properties : undefined;
            resourceInputs["restApiId"] = state ? state.restApiId : undefined;
        } else {
            const args = argsOrState as DocumentationPartArgs | undefined;
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            if ((!args || args.properties === undefined) && !opts.urn) {
                throw new Error("Missing required property 'properties'");
            }
            if ((!args || args.restApiId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'restApiId'");
            }
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["properties"] = args ? args.properties : undefined;
            resourceInputs["restApiId"] = args ? args.restApiId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DocumentationPart.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DocumentationPart resources.
 */
export interface DocumentationPartState {
    /**
     * Location of the targeted API entity of the to-be-created documentation part. See below.
     */
    location?: pulumi.Input<inputs.apigateway.DocumentationPartLocation>;
    /**
     * Content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., "{ \"description\": \"The API does ...\" }". Only Swagger-compliant key-value pairs can be exported and, hence, published.
     */
    properties?: pulumi.Input<string>;
    /**
     * ID of the associated Rest API
     */
    restApiId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DocumentationPart resource.
 */
export interface DocumentationPartArgs {
    /**
     * Location of the targeted API entity of the to-be-created documentation part. See below.
     */
    location: pulumi.Input<inputs.apigateway.DocumentationPartLocation>;
    /**
     * Content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., "{ \"description\": \"The API does ...\" }". Only Swagger-compliant key-value pairs can be exported and, hence, published.
     */
    properties: pulumi.Input<string>;
    /**
     * ID of the associated Rest API
     */
    restApiId: pulumi.Input<string>;
}
