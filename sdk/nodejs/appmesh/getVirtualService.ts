// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * The App Mesh Virtual Service data source allows details of an App Mesh Virtual Service to be retrieved by its name, mesh_name, and optionally the mesh_owner.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.appmesh.getVirtualService({
 *     meshName: "example-mesh",
 *     name: "example.mesh.local",
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getCallerIdentity({});
 * const test = current.then(current => aws.appmesh.getVirtualService({
 *     name: "example.mesh.local",
 *     meshName: "example-mesh",
 *     meshOwner: current.accountId,
 * }));
 * ```
 */
export function getVirtualService(args: GetVirtualServiceArgs, opts?: pulumi.InvokeOptions): Promise<GetVirtualServiceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:appmesh/getVirtualService:getVirtualService", {
        "meshName": args.meshName,
        "meshOwner": args.meshOwner,
        "name": args.name,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getVirtualService.
 */
export interface GetVirtualServiceArgs {
    /**
     * Name of the service mesh in which the virtual service exists.
     */
    meshName: string;
    /**
     * AWS account ID of the service mesh's owner.
     */
    meshOwner?: string;
    /**
     * Name of the virtual service.
     */
    name: string;
    /**
     * Map of tags.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getVirtualService.
 */
export interface GetVirtualServiceResult {
    /**
     * ARN of the virtual service.
     */
    readonly arn: string;
    /**
     * Creation date of the virtual service.
     */
    readonly createdDate: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Last update date of the virtual service.
     */
    readonly lastUpdatedDate: string;
    readonly meshName: string;
    readonly meshOwner: string;
    readonly name: string;
    /**
     * Resource owner's AWS account ID.
     */
    readonly resourceOwner: string;
    /**
     * Virtual service specification
     */
    readonly specs: outputs.appmesh.GetVirtualServiceSpec[];
    /**
     * Map of tags.
     */
    readonly tags?: {[key: string]: string};
}
/**
 * The App Mesh Virtual Service data source allows details of an App Mesh Virtual Service to be retrieved by its name, mesh_name, and optionally the mesh_owner.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.appmesh.getVirtualService({
 *     meshName: "example-mesh",
 *     name: "example.mesh.local",
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const current = aws.getCallerIdentity({});
 * const test = current.then(current => aws.appmesh.getVirtualService({
 *     name: "example.mesh.local",
 *     meshName: "example-mesh",
 *     meshOwner: current.accountId,
 * }));
 * ```
 */
export function getVirtualServiceOutput(args: GetVirtualServiceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVirtualServiceResult> {
    return pulumi.output(args).apply((a: any) => getVirtualService(a, opts))
}

/**
 * A collection of arguments for invoking getVirtualService.
 */
export interface GetVirtualServiceOutputArgs {
    /**
     * Name of the service mesh in which the virtual service exists.
     */
    meshName: pulumi.Input<string>;
    /**
     * AWS account ID of the service mesh's owner.
     */
    meshOwner?: pulumi.Input<string>;
    /**
     * Name of the virtual service.
     */
    name: pulumi.Input<string>;
    /**
     * Map of tags.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
