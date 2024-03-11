// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * The CloudFormation Stack data source allows access to stack
 * outputs and other useful data including the template body.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const network = aws.cloudformation.getStack({
 *     name: "my-network-stack",
 * });
 * const web = new aws.ec2.Instance("web", {
 *     ami: "ami-abb07bcb",
 *     instanceType: "t2.micro",
 *     subnetId: network.then(network => network.outputs?.SubnetId),
 *     tags: {
 *         Name: "HelloWorld",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getStack(args: GetStackArgs, opts?: pulumi.InvokeOptions): Promise<GetStackResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:cloudformation/getStack:getStack", {
        "name": args.name,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getStack.
 */
export interface GetStackArgs {
    /**
     * Name of the stack
     */
    name: string;
    /**
     * Map of tags associated with this stack.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getStack.
 */
export interface GetStackResult {
    /**
     * List of capabilities
     */
    readonly capabilities: string[];
    /**
     * Description of the stack
     */
    readonly description: string;
    /**
     * Whether the rollback of the stack is disabled when stack creation fails
     */
    readonly disableRollback: boolean;
    /**
     * ARN of the IAM role used to create the stack.
     */
    readonly iamRoleArn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * List of SNS topic ARNs to publish stack related events
     */
    readonly notificationArns: string[];
    /**
     * Map of outputs from the stack.
     */
    readonly outputs: {[key: string]: string};
    /**
     * Map of parameters that specify input parameters for the stack.
     */
    readonly parameters: {[key: string]: string};
    /**
     * Map of tags associated with this stack.
     */
    readonly tags: {[key: string]: string};
    /**
     * Structure containing the template body.
     */
    readonly templateBody: string;
    /**
     * Amount of time that can pass before the stack status becomes `CREATE_FAILED`
     */
    readonly timeoutInMinutes: number;
}
/**
 * The CloudFormation Stack data source allows access to stack
 * outputs and other useful data including the template body.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const network = aws.cloudformation.getStack({
 *     name: "my-network-stack",
 * });
 * const web = new aws.ec2.Instance("web", {
 *     ami: "ami-abb07bcb",
 *     instanceType: "t2.micro",
 *     subnetId: network.then(network => network.outputs?.SubnetId),
 *     tags: {
 *         Name: "HelloWorld",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getStackOutput(args: GetStackOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetStackResult> {
    return pulumi.output(args).apply((a: any) => getStack(a, opts))
}

/**
 * A collection of arguments for invoking getStack.
 */
export interface GetStackOutputArgs {
    /**
     * Name of the stack
     */
    name: pulumi.Input<string>;
    /**
     * Map of tags associated with this stack.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
