// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages a CloudFormation StackSet Instance. Instances are managed in the account and region of the StackSet after the target account permissions have been configured. Additional information about StackSets can be found in the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/what-is-cfnstacksets.html).
 *
 * > **NOTE:** All target accounts must have an IAM Role created that matches the name of the execution role configured in the StackSet (the `executionRoleName` argument in the `aws.cloudformation.StackSet` resource) in a trust relationship with the administrative account or administration IAM Role. The execution role must have appropriate permissions to manage resources defined in the template along with those required for StackSets to operate. See the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html) for more details.
 *
 * > **NOTE:** To retain the Stack during resource destroy, ensure `retainStack` has been set to `true` in the state first. This must be completed _before_ a deployment that would destroy the resource.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.cloudformation.StackSetInstance("example", {
 *     accountId: "123456789012",
 *     region: "us-east-1",
 *     stackSetName: aws_cloudformation_stack_set.example.name,
 * });
 * ```
 * ### Example IAM Setup in Target Account
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const aWSCloudFormationStackSetExecutionRoleAssumeRolePolicy = aws.iam.getPolicyDocument({
 *     statements: [{
 *         actions: ["sts:AssumeRole"],
 *         effect: "Allow",
 *         principals: [{
 *             identifiers: [aws_iam_role.AWSCloudFormationStackSetAdministrationRole.arn],
 *             type: "AWS",
 *         }],
 *     }],
 * });
 * const aWSCloudFormationStackSetExecutionRole = new aws.iam.Role("aWSCloudFormationStackSetExecutionRole", {assumeRolePolicy: aWSCloudFormationStackSetExecutionRoleAssumeRolePolicy.then(aWSCloudFormationStackSetExecutionRoleAssumeRolePolicy => aWSCloudFormationStackSetExecutionRoleAssumeRolePolicy.json)});
 * const aWSCloudFormationStackSetExecutionRoleMinimumExecutionPolicyPolicyDocument = aws.iam.getPolicyDocument({
 *     statements: [{
 *         actions: [
 *             "cloudformation:*",
 *             "s3:*",
 *             "sns:*",
 *         ],
 *         effect: "Allow",
 *         resources: ["*"],
 *     }],
 * });
 * const aWSCloudFormationStackSetExecutionRoleMinimumExecutionPolicyRolePolicy = new aws.iam.RolePolicy("aWSCloudFormationStackSetExecutionRoleMinimumExecutionPolicyRolePolicy", {
 *     policy: aWSCloudFormationStackSetExecutionRoleMinimumExecutionPolicyPolicyDocument.then(aWSCloudFormationStackSetExecutionRoleMinimumExecutionPolicyPolicyDocument => aWSCloudFormationStackSetExecutionRoleMinimumExecutionPolicyPolicyDocument.json),
 *     role: aWSCloudFormationStackSetExecutionRole.name,
 * });
 * ```
 * ### Example Deployment across Organizations account
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.cloudformation.StackSetInstance("example", {
 *     deploymentTargets: {
 *         organizationalUnitIds: [aws_organizations_organization.example.roots[0].id],
 *     },
 *     region: "us-east-1",
 *     stackSetName: aws_cloudformation_stack_set.example.name,
 * });
 * ```
 *
 * ## Import
 *
 * Import CloudFormation StackSet Instances that target AWS Organizational Units using the StackSet name, a slash (`/`) separated list of organizational unit IDs, and target AWS region separated by commas (`,`):
 *
 * __Using `pulumi import` to import__ CloudFormation StackSet Instances that target an AWS Account ID using the StackSet name, target AWS account ID, and target AWS region separated by commas (`,`). For example:
 *
 * ```sh
 *  $ pulumi import aws:cloudformation/stackSetInstance:StackSetInstance example example,123456789012,us-east-1
 * ```
 *  Import CloudFormation StackSet Instances that target AWS Organizational Units using the StackSet name, a slash (`/`) separated list of organizational unit IDs, and target AWS region separated by commas (`,`):
 *
 * ```sh
 *  $ pulumi import aws:cloudformation/stackSetInstance:StackSetInstance example example,ou-sdas-123123123/ou-sdas-789789789,us-east-1
 * ```
 */
export class StackSetInstance extends pulumi.CustomResource {
    /**
     * Get an existing StackSetInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StackSetInstanceState, opts?: pulumi.CustomResourceOptions): StackSetInstance {
        return new StackSetInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cloudformation/stackSetInstance:StackSetInstance';

    /**
     * Returns true if the given object is an instance of StackSetInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StackSetInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StackSetInstance.__pulumiType;
    }

    /**
     * Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
     */
    public readonly callAs!: pulumi.Output<string | undefined>;
    /**
     * The AWS Organizations accounts to which StackSets deploys. StackSets doesn't deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deploymentTargets below.
     */
    public readonly deploymentTargets!: pulumi.Output<outputs.cloudformation.StackSetInstanceDeploymentTargets | undefined>;
    /**
     * Preferences for how AWS CloudFormation performs a stack set operation.
     */
    public readonly operationPreferences!: pulumi.Output<outputs.cloudformation.StackSetInstanceOperationPreferences | undefined>;
    /**
     * Organizational unit ID in which the stack is deployed.
     */
    public /*out*/ readonly organizationalUnitId!: pulumi.Output<string>;
    /**
     * Key-value map of input parameters to override from the StackSet for this Instance.
     */
    public readonly parameterOverrides!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
     */
    public readonly retainStack!: pulumi.Output<boolean | undefined>;
    /**
     * Stack identifier.
     */
    public /*out*/ readonly stackId!: pulumi.Output<string>;
    /**
     * List of stack instances created from an organizational unit deployment target. This will only be populated when `deploymentTargets` is set. See `stackInstanceSummaries`.
     */
    public /*out*/ readonly stackInstanceSummaries!: pulumi.Output<outputs.cloudformation.StackSetInstanceStackInstanceSummary[]>;
    /**
     * Name of the StackSet.
     */
    public readonly stackSetName!: pulumi.Output<string>;

    /**
     * Create a StackSetInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StackSetInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StackSetInstanceArgs | StackSetInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StackSetInstanceState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["callAs"] = state ? state.callAs : undefined;
            resourceInputs["deploymentTargets"] = state ? state.deploymentTargets : undefined;
            resourceInputs["operationPreferences"] = state ? state.operationPreferences : undefined;
            resourceInputs["organizationalUnitId"] = state ? state.organizationalUnitId : undefined;
            resourceInputs["parameterOverrides"] = state ? state.parameterOverrides : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["retainStack"] = state ? state.retainStack : undefined;
            resourceInputs["stackId"] = state ? state.stackId : undefined;
            resourceInputs["stackInstanceSummaries"] = state ? state.stackInstanceSummaries : undefined;
            resourceInputs["stackSetName"] = state ? state.stackSetName : undefined;
        } else {
            const args = argsOrState as StackSetInstanceArgs | undefined;
            if ((!args || args.stackSetName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'stackSetName'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["callAs"] = args ? args.callAs : undefined;
            resourceInputs["deploymentTargets"] = args ? args.deploymentTargets : undefined;
            resourceInputs["operationPreferences"] = args ? args.operationPreferences : undefined;
            resourceInputs["parameterOverrides"] = args ? args.parameterOverrides : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["retainStack"] = args ? args.retainStack : undefined;
            resourceInputs["stackSetName"] = args ? args.stackSetName : undefined;
            resourceInputs["organizationalUnitId"] = undefined /*out*/;
            resourceInputs["stackId"] = undefined /*out*/;
            resourceInputs["stackInstanceSummaries"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StackSetInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StackSetInstance resources.
 */
export interface StackSetInstanceState {
    /**
     * Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
     */
    callAs?: pulumi.Input<string>;
    /**
     * The AWS Organizations accounts to which StackSets deploys. StackSets doesn't deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deploymentTargets below.
     */
    deploymentTargets?: pulumi.Input<inputs.cloudformation.StackSetInstanceDeploymentTargets>;
    /**
     * Preferences for how AWS CloudFormation performs a stack set operation.
     */
    operationPreferences?: pulumi.Input<inputs.cloudformation.StackSetInstanceOperationPreferences>;
    /**
     * Organizational unit ID in which the stack is deployed.
     */
    organizationalUnitId?: pulumi.Input<string>;
    /**
     * Key-value map of input parameters to override from the StackSet for this Instance.
     */
    parameterOverrides?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
     */
    region?: pulumi.Input<string>;
    /**
     * During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
     */
    retainStack?: pulumi.Input<boolean>;
    /**
     * Stack identifier.
     */
    stackId?: pulumi.Input<string>;
    /**
     * List of stack instances created from an organizational unit deployment target. This will only be populated when `deploymentTargets` is set. See `stackInstanceSummaries`.
     */
    stackInstanceSummaries?: pulumi.Input<pulumi.Input<inputs.cloudformation.StackSetInstanceStackInstanceSummary>[]>;
    /**
     * Name of the StackSet.
     */
    stackSetName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StackSetInstance resource.
 */
export interface StackSetInstanceArgs {
    /**
     * Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
     */
    callAs?: pulumi.Input<string>;
    /**
     * The AWS Organizations accounts to which StackSets deploys. StackSets doesn't deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deploymentTargets below.
     */
    deploymentTargets?: pulumi.Input<inputs.cloudformation.StackSetInstanceDeploymentTargets>;
    /**
     * Preferences for how AWS CloudFormation performs a stack set operation.
     */
    operationPreferences?: pulumi.Input<inputs.cloudformation.StackSetInstanceOperationPreferences>;
    /**
     * Key-value map of input parameters to override from the StackSet for this Instance.
     */
    parameterOverrides?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
     */
    region?: pulumi.Input<string>;
    /**
     * During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
     */
    retainStack?: pulumi.Input<boolean>;
    /**
     * Name of the StackSet.
     */
    stackSetName: pulumi.Input<string>;
}
