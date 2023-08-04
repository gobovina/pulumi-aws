// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Route53 CIDR location resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleCidrCollection = new aws.route53.CidrCollection("exampleCidrCollection", {});
 * const exampleCidrLocation = new aws.route53.CidrLocation("exampleCidrLocation", {
 *     cidrCollectionId: exampleCidrCollection.id,
 *     cidrBlocks: [
 *         "200.5.3.0/24",
 *         "200.6.3.0/24",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * terraform import {
 *
 *  to = aws_route53_cidr_location.example
 *
 *  id = "9ac32814-3e67-0932-6048-8d779cc6f511,office" } Using `pulumi import`, import CIDR locations using their the CIDR collection ID and location name. For exampleconsole % pulumi import aws_route53_cidr_location.example 9ac32814-3e67-0932-6048-8d779cc6f511,office
 */
export class CidrLocation extends pulumi.CustomResource {
    /**
     * Get an existing CidrLocation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CidrLocationState, opts?: pulumi.CustomResourceOptions): CidrLocation {
        return new CidrLocation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:route53/cidrLocation:CidrLocation';

    /**
     * Returns true if the given object is an instance of CidrLocation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CidrLocation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CidrLocation.__pulumiType;
    }

    /**
     * CIDR blocks for the location.
     */
    public readonly cidrBlocks!: pulumi.Output<string[]>;
    /**
     * The ID of the CIDR collection to update.
     */
    public readonly cidrCollectionId!: pulumi.Output<string>;
    /**
     * Name for the CIDR location.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a CidrLocation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CidrLocationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CidrLocationArgs | CidrLocationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CidrLocationState | undefined;
            resourceInputs["cidrBlocks"] = state ? state.cidrBlocks : undefined;
            resourceInputs["cidrCollectionId"] = state ? state.cidrCollectionId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as CidrLocationArgs | undefined;
            if ((!args || args.cidrBlocks === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cidrBlocks'");
            }
            if ((!args || args.cidrCollectionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cidrCollectionId'");
            }
            resourceInputs["cidrBlocks"] = args ? args.cidrBlocks : undefined;
            resourceInputs["cidrCollectionId"] = args ? args.cidrCollectionId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CidrLocation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CidrLocation resources.
 */
export interface CidrLocationState {
    /**
     * CIDR blocks for the location.
     */
    cidrBlocks?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the CIDR collection to update.
     */
    cidrCollectionId?: pulumi.Input<string>;
    /**
     * Name for the CIDR location.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CidrLocation resource.
 */
export interface CidrLocationArgs {
    /**
     * CIDR blocks for the location.
     */
    cidrBlocks: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the CIDR collection to update.
     */
    cidrCollectionId: pulumi.Input<string>;
    /**
     * Name for the CIDR location.
     */
    name?: pulumi.Input<string>;
}
