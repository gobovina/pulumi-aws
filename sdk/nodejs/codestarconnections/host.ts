// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a CodeStar Host.
 *
 * > **NOTE:** The `aws.codestarconnections.Host` resource is created in the state `PENDING`. Authentication with the host provider must be completed in the AWS Console. For more information visit [Set up a pending host](https://docs.aws.amazon.com/dtconsole/latest/userguide/connections-host-setup.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.codestarconnections.Host("example", {
 *     providerEndpoint: "https://example.com",
 *     providerType: "GitHubEnterpriseServer",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import CodeStar Host using the ARN. For example:
 *
 * ```sh
 *  $ pulumi import aws:codestarconnections/host:Host example-host arn:aws:codestar-connections:us-west-1:0123456789:host/79d4d357-a2ee-41e4-b350-2fe39ae59448
 * ```
 */
export class Host extends pulumi.CustomResource {
    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HostState, opts?: pulumi.CustomResourceOptions): Host {
        return new Host(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:codestarconnections/host:Host';

    /**
     * Returns true if the given object is an instance of Host.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Host {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Host.__pulumiType;
    }

    /**
     * The CodeStar Host ARN.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The name of the host to be created. The name must be unique in the calling AWS account.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The endpoint of the infrastructure to be represented by the host after it is created.
     */
    public readonly providerEndpoint!: pulumi.Output<string>;
    /**
     * The name of the external provider where your third-party code repository is configured.
     */
    public readonly providerType!: pulumi.Output<string>;
    /**
     * The CodeStar Host status. Possible values are `PENDING`, `AVAILABLE`, `VPC_CONFIG_DELETING`, `VPC_CONFIG_INITIALIZING`, and `VPC_CONFIG_FAILED_INITIALIZATION`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     */
    public readonly vpcConfiguration!: pulumi.Output<outputs.codestarconnections.HostVpcConfiguration | undefined>;

    /**
     * Create a Host resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HostArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HostArgs | HostState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HostState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["providerEndpoint"] = state ? state.providerEndpoint : undefined;
            resourceInputs["providerType"] = state ? state.providerType : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["vpcConfiguration"] = state ? state.vpcConfiguration : undefined;
        } else {
            const args = argsOrState as HostArgs | undefined;
            if ((!args || args.providerEndpoint === undefined) && !opts.urn) {
                throw new Error("Missing required property 'providerEndpoint'");
            }
            if ((!args || args.providerType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'providerType'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["providerEndpoint"] = args ? args.providerEndpoint : undefined;
            resourceInputs["providerType"] = args ? args.providerType : undefined;
            resourceInputs["vpcConfiguration"] = args ? args.vpcConfiguration : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Host.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Host resources.
 */
export interface HostState {
    /**
     * The CodeStar Host ARN.
     */
    arn?: pulumi.Input<string>;
    /**
     * The name of the host to be created. The name must be unique in the calling AWS account.
     */
    name?: pulumi.Input<string>;
    /**
     * The endpoint of the infrastructure to be represented by the host after it is created.
     */
    providerEndpoint?: pulumi.Input<string>;
    /**
     * The name of the external provider where your third-party code repository is configured.
     */
    providerType?: pulumi.Input<string>;
    /**
     * The CodeStar Host status. Possible values are `PENDING`, `AVAILABLE`, `VPC_CONFIG_DELETING`, `VPC_CONFIG_INITIALIZING`, and `VPC_CONFIG_FAILED_INITIALIZATION`.
     */
    status?: pulumi.Input<string>;
    /**
     * The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     */
    vpcConfiguration?: pulumi.Input<inputs.codestarconnections.HostVpcConfiguration>;
}

/**
 * The set of arguments for constructing a Host resource.
 */
export interface HostArgs {
    /**
     * The name of the host to be created. The name must be unique in the calling AWS account.
     */
    name?: pulumi.Input<string>;
    /**
     * The endpoint of the infrastructure to be represented by the host after it is created.
     */
    providerEndpoint: pulumi.Input<string>;
    /**
     * The name of the external provider where your third-party code repository is configured.
     */
    providerType: pulumi.Input<string>;
    /**
     * The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     */
    vpcConfiguration?: pulumi.Input<inputs.codestarconnections.HostVpcConfiguration>;
}
