// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Creates a new Amazon Redshift Serverless Endpoint Access.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.redshiftserverless.EndpointAccess("example", {
 *     endpointName: "example",
 *     workgroupName: "example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Redshift Serverless Endpoint Access using the `endpoint_name`. For example:
 *
 * ```sh
 * $ pulumi import aws:redshiftserverless/endpointAccess:EndpointAccess example example
 * ```
 */
export class EndpointAccess extends pulumi.CustomResource {
    /**
     * Get an existing EndpointAccess resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EndpointAccessState, opts?: pulumi.CustomResourceOptions): EndpointAccess {
        return new EndpointAccess(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:redshiftserverless/endpointAccess:EndpointAccess';

    /**
     * Returns true if the given object is an instance of EndpointAccess.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EndpointAccess {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EndpointAccess.__pulumiType;
    }

    /**
     * The DNS address of the VPC endpoint.
     */
    public /*out*/ readonly address!: pulumi.Output<string>;
    /**
     * Amazon Resource Name (ARN) of the Redshift Serverless Endpoint Access.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The name of the endpoint.
     */
    public readonly endpointName!: pulumi.Output<string>;
    /**
     * The owner Amazon Web Services account for the Amazon Redshift Serverless workgroup.
     */
    public readonly ownerAccount!: pulumi.Output<string | undefined>;
    /**
     * The port that Amazon Redshift Serverless listens on.
     */
    public /*out*/ readonly port!: pulumi.Output<number>;
    /**
     * An array of VPC subnet IDs to associate with the endpoint.
     */
    public readonly subnetIds!: pulumi.Output<string[]>;
    /**
     * The VPC endpoint or the Redshift Serverless workgroup. See `VPC Endpoint` below.
     */
    public /*out*/ readonly vpcEndpoints!: pulumi.Output<outputs.redshiftserverless.EndpointAccessVpcEndpoint[]>;
    /**
     * An array of security group IDs to associate with the workgroup.
     */
    public readonly vpcSecurityGroupIds!: pulumi.Output<string[]>;
    /**
     * The name of the workgroup.
     */
    public readonly workgroupName!: pulumi.Output<string>;

    /**
     * Create a EndpointAccess resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EndpointAccessArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EndpointAccessArgs | EndpointAccessState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EndpointAccessState | undefined;
            resourceInputs["address"] = state ? state.address : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["endpointName"] = state ? state.endpointName : undefined;
            resourceInputs["ownerAccount"] = state ? state.ownerAccount : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["subnetIds"] = state ? state.subnetIds : undefined;
            resourceInputs["vpcEndpoints"] = state ? state.vpcEndpoints : undefined;
            resourceInputs["vpcSecurityGroupIds"] = state ? state.vpcSecurityGroupIds : undefined;
            resourceInputs["workgroupName"] = state ? state.workgroupName : undefined;
        } else {
            const args = argsOrState as EndpointAccessArgs | undefined;
            if ((!args || args.endpointName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'endpointName'");
            }
            if ((!args || args.subnetIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetIds'");
            }
            if ((!args || args.workgroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workgroupName'");
            }
            resourceInputs["endpointName"] = args ? args.endpointName : undefined;
            resourceInputs["ownerAccount"] = args ? args.ownerAccount : undefined;
            resourceInputs["subnetIds"] = args ? args.subnetIds : undefined;
            resourceInputs["vpcSecurityGroupIds"] = args ? args.vpcSecurityGroupIds : undefined;
            resourceInputs["workgroupName"] = args ? args.workgroupName : undefined;
            resourceInputs["address"] = undefined /*out*/;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["port"] = undefined /*out*/;
            resourceInputs["vpcEndpoints"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EndpointAccess.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EndpointAccess resources.
 */
export interface EndpointAccessState {
    /**
     * The DNS address of the VPC endpoint.
     */
    address?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the Redshift Serverless Endpoint Access.
     */
    arn?: pulumi.Input<string>;
    /**
     * The name of the endpoint.
     */
    endpointName?: pulumi.Input<string>;
    /**
     * The owner Amazon Web Services account for the Amazon Redshift Serverless workgroup.
     */
    ownerAccount?: pulumi.Input<string>;
    /**
     * The port that Amazon Redshift Serverless listens on.
     */
    port?: pulumi.Input<number>;
    /**
     * An array of VPC subnet IDs to associate with the endpoint.
     */
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The VPC endpoint or the Redshift Serverless workgroup. See `VPC Endpoint` below.
     */
    vpcEndpoints?: pulumi.Input<pulumi.Input<inputs.redshiftserverless.EndpointAccessVpcEndpoint>[]>;
    /**
     * An array of security group IDs to associate with the workgroup.
     */
    vpcSecurityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the workgroup.
     */
    workgroupName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EndpointAccess resource.
 */
export interface EndpointAccessArgs {
    /**
     * The name of the endpoint.
     */
    endpointName: pulumi.Input<string>;
    /**
     * The owner Amazon Web Services account for the Amazon Redshift Serverless workgroup.
     */
    ownerAccount?: pulumi.Input<string>;
    /**
     * An array of VPC subnet IDs to associate with the endpoint.
     */
    subnetIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * An array of security group IDs to associate with the workgroup.
     */
    vpcSecurityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the workgroup.
     */
    workgroupName: pulumi.Input<string>;
}
