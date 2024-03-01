// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Data source for managing an AWS SFN (Step Functions) State Machine Alias.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.sfn.getAlias({
 *     name: "my_sfn_alias",
 *     statemachineArn: sfnTest.arn,
 * });
 * ```
 */
export function getAlias(args: GetAliasArgs, opts?: pulumi.InvokeOptions): Promise<GetAliasResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:sfn/getAlias:getAlias", {
        "description": args.description,
        "name": args.name,
        "statemachineArn": args.statemachineArn,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlias.
 */
export interface GetAliasArgs {
    /**
     * Description of state machine alias.
     */
    description?: string;
    /**
     * Name of the State Machine alias.
     */
    name: string;
    /**
     * ARN of the State Machine.
     */
    statemachineArn: string;
}

/**
 * A collection of values returned by getAlias.
 */
export interface GetAliasResult {
    /**
     * ARN identifying the State Machine alias.
     */
    readonly arn: string;
    /**
     * Date the state machine Alias was created.
     */
    readonly creationDate: string;
    /**
     * Description of state machine alias.
     */
    readonly description?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * Routing Configuration of state machine alias
     */
    readonly routingConfigurations: outputs.sfn.GetAliasRoutingConfiguration[];
    readonly statemachineArn: string;
}
/**
 * Data source for managing an AWS SFN (Step Functions) State Machine Alias.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.sfn.getAlias({
 *     name: "my_sfn_alias",
 *     statemachineArn: sfnTest.arn,
 * });
 * ```
 */
export function getAliasOutput(args: GetAliasOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAliasResult> {
    return pulumi.output(args).apply((a: any) => getAlias(a, opts))
}

/**
 * A collection of arguments for invoking getAlias.
 */
export interface GetAliasOutputArgs {
    /**
     * Description of state machine alias.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the State Machine alias.
     */
    name: pulumi.Input<string>;
    /**
     * ARN of the State Machine.
     */
    statemachineArn: pulumi.Input<string>;
}
