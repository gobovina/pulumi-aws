// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an Amazon Connect Lambda Function Association. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html) and [Invoke AWS Lambda functions](https://docs.aws.amazon.com/connect/latest/adminguide/connect-lambda-functions.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.connect.LambdaFunctionAssociation("example", {
 *     functionArn: aws_lambda_function.example.arn,
 *     instanceId: aws_connect_instance.example.id,
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_connect_lambda_function_association` using the `instance_id` and `function_arn` separated by a comma (`,`). For example:
 *
 * ```sh
 *  $ pulumi import aws:connect/lambdaFunctionAssociation:LambdaFunctionAssociation example aaaaaaaa-bbbb-cccc-dddd-111111111111,arn:aws:lambda:us-west-2:123456789123:function:example
 * ```
 */
export class LambdaFunctionAssociation extends pulumi.CustomResource {
    /**
     * Get an existing LambdaFunctionAssociation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LambdaFunctionAssociationState, opts?: pulumi.CustomResourceOptions): LambdaFunctionAssociation {
        return new LambdaFunctionAssociation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:connect/lambdaFunctionAssociation:LambdaFunctionAssociation';

    /**
     * Returns true if the given object is an instance of LambdaFunctionAssociation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LambdaFunctionAssociation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LambdaFunctionAssociation.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
     */
    public readonly functionArn!: pulumi.Output<string>;
    /**
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */
    public readonly instanceId!: pulumi.Output<string>;

    /**
     * Create a LambdaFunctionAssociation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LambdaFunctionAssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LambdaFunctionAssociationArgs | LambdaFunctionAssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LambdaFunctionAssociationState | undefined;
            resourceInputs["functionArn"] = state ? state.functionArn : undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
        } else {
            const args = argsOrState as LambdaFunctionAssociationArgs | undefined;
            if ((!args || args.functionArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'functionArn'");
            }
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            resourceInputs["functionArn"] = args ? args.functionArn : undefined;
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LambdaFunctionAssociation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LambdaFunctionAssociation resources.
 */
export interface LambdaFunctionAssociationState {
    /**
     * Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
     */
    functionArn?: pulumi.Input<string>;
    /**
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */
    instanceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LambdaFunctionAssociation resource.
 */
export interface LambdaFunctionAssociationArgs {
    /**
     * Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
     */
    functionArn: pulumi.Input<string>;
    /**
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */
    instanceId: pulumi.Input<string>;
}
