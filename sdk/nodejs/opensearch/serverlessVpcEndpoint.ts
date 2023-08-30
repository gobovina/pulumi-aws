// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS OpenSearchServerless VPC Endpoint.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.opensearch.ServerlessVpcEndpoint("example", {
 *     subnetIds: [aws_subnet.example.id],
 *     vpcId: aws_vpc.example.id,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import OpenSearchServerless Vpc Endpointa using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:opensearch/serverlessVpcEndpoint:ServerlessVpcEndpoint example vpce-8012925589
 * ```
 */
export class ServerlessVpcEndpoint extends pulumi.CustomResource {
    /**
     * Get an existing ServerlessVpcEndpoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerlessVpcEndpointState, opts?: pulumi.CustomResourceOptions): ServerlessVpcEndpoint {
        return new ServerlessVpcEndpoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:opensearch/serverlessVpcEndpoint:ServerlessVpcEndpoint';

    /**
     * Returns true if the given object is an instance of ServerlessVpcEndpoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServerlessVpcEndpoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServerlessVpcEndpoint.__pulumiType;
    }

    /**
     * Name of the interface endpoint.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * One or more security groups that define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint. Up to 5 security groups can be provided.
     */
    public readonly securityGroupIds!: pulumi.Output<string[]>;
    /**
     * One or more subnet IDs from which you'll access OpenSearch Serverless. Up to 6 subnets can be provided.
     */
    public readonly subnetIds!: pulumi.Output<string[]>;
    public readonly timeouts!: pulumi.Output<outputs.opensearch.ServerlessVpcEndpointTimeouts | undefined>;
    /**
     * ID of the VPC from which you'll access OpenSearch Serverless.
     *
     * The following arguments are optional:
     */
    public readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a ServerlessVpcEndpoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerlessVpcEndpointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerlessVpcEndpointArgs | ServerlessVpcEndpointState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerlessVpcEndpointState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["securityGroupIds"] = state ? state.securityGroupIds : undefined;
            resourceInputs["subnetIds"] = state ? state.subnetIds : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as ServerlessVpcEndpointArgs | undefined;
            if ((!args || args.subnetIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetIds'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["securityGroupIds"] = args ? args.securityGroupIds : undefined;
            resourceInputs["subnetIds"] = args ? args.subnetIds : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServerlessVpcEndpoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServerlessVpcEndpoint resources.
 */
export interface ServerlessVpcEndpointState {
    /**
     * Name of the interface endpoint.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more security groups that define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint. Up to 5 security groups can be provided.
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more subnet IDs from which you'll access OpenSearch Serverless. Up to 6 subnets can be provided.
     */
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    timeouts?: pulumi.Input<inputs.opensearch.ServerlessVpcEndpointTimeouts>;
    /**
     * ID of the VPC from which you'll access OpenSearch Serverless.
     *
     * The following arguments are optional:
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServerlessVpcEndpoint resource.
 */
export interface ServerlessVpcEndpointArgs {
    /**
     * Name of the interface endpoint.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more security groups that define the ports, protocols, and sources for inbound traffic that you are authorizing into your endpoint. Up to 5 security groups can be provided.
     */
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more subnet IDs from which you'll access OpenSearch Serverless. Up to 6 subnets can be provided.
     */
    subnetIds: pulumi.Input<pulumi.Input<string>[]>;
    timeouts?: pulumi.Input<inputs.opensearch.ServerlessVpcEndpointTimeouts>;
    /**
     * ID of the VPC from which you'll access OpenSearch Serverless.
     *
     * The following arguments are optional:
     */
    vpcId: pulumi.Input<string>;
}
