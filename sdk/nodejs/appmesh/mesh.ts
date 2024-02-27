// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an AWS App Mesh service mesh resource.
 *
 * ## Example Usage
 * ### Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const simple = new aws.appmesh.Mesh("simple", {});
 * ```
 * ### Egress Filter
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const simple = new aws.appmesh.Mesh("simple", {spec: {
 *     egressFilter: {
 *         type: "ALLOW_ALL",
 *     },
 * }});
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import App Mesh service meshes using the `name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:appmesh/mesh:Mesh simple simpleapp
 * ```
 */
export class Mesh extends pulumi.CustomResource {
    /**
     * Get an existing Mesh resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MeshState, opts?: pulumi.CustomResourceOptions): Mesh {
        return new Mesh(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:appmesh/mesh:Mesh';

    /**
     * Returns true if the given object is an instance of Mesh.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Mesh {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Mesh.__pulumiType;
    }

    /**
     * ARN of the service mesh.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Creation date of the service mesh.
     */
    public /*out*/ readonly createdDate!: pulumi.Output<string>;
    /**
     * Last update date of the service mesh.
     */
    public /*out*/ readonly lastUpdatedDate!: pulumi.Output<string>;
    /**
     * AWS account ID of the service mesh's owner.
     */
    public /*out*/ readonly meshOwner!: pulumi.Output<string>;
    /**
     * Name to use for the service mesh. Must be between 1 and 255 characters in length.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Resource owner's AWS account ID.
     */
    public /*out*/ readonly resourceOwner!: pulumi.Output<string>;
    /**
     * Service mesh specification to apply.
     */
    public readonly spec!: pulumi.Output<outputs.appmesh.MeshSpec | undefined>;
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
     * Create a Mesh resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: MeshArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MeshArgs | MeshState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MeshState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["createdDate"] = state ? state.createdDate : undefined;
            resourceInputs["lastUpdatedDate"] = state ? state.lastUpdatedDate : undefined;
            resourceInputs["meshOwner"] = state ? state.meshOwner : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceOwner"] = state ? state.resourceOwner : undefined;
            resourceInputs["spec"] = state ? state.spec : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as MeshArgs | undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["spec"] = args ? args.spec : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdDate"] = undefined /*out*/;
            resourceInputs["lastUpdatedDate"] = undefined /*out*/;
            resourceInputs["meshOwner"] = undefined /*out*/;
            resourceInputs["resourceOwner"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Mesh.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Mesh resources.
 */
export interface MeshState {
    /**
     * ARN of the service mesh.
     */
    arn?: pulumi.Input<string>;
    /**
     * Creation date of the service mesh.
     */
    createdDate?: pulumi.Input<string>;
    /**
     * Last update date of the service mesh.
     */
    lastUpdatedDate?: pulumi.Input<string>;
    /**
     * AWS account ID of the service mesh's owner.
     */
    meshOwner?: pulumi.Input<string>;
    /**
     * Name to use for the service mesh. Must be between 1 and 255 characters in length.
     */
    name?: pulumi.Input<string>;
    /**
     * Resource owner's AWS account ID.
     */
    resourceOwner?: pulumi.Input<string>;
    /**
     * Service mesh specification to apply.
     */
    spec?: pulumi.Input<inputs.appmesh.MeshSpec>;
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
}

/**
 * The set of arguments for constructing a Mesh resource.
 */
export interface MeshArgs {
    /**
     * Name to use for the service mesh. Must be between 1 and 255 characters in length.
     */
    name?: pulumi.Input<string>;
    /**
     * Service mesh specification to apply.
     */
    spec?: pulumi.Input<inputs.appmesh.MeshSpec>;
    /**
     * Map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
