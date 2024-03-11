// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages a CloudFormation StackSet. StackSets allow CloudFormation templates to be easily deployed across multiple accounts and regions via StackSet Instances (`aws.cloudformation.StackSetInstance` resource). Additional information about StackSets can be found in the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/what-is-cfnstacksets.html).
 *
 * > **NOTE:** All template parameters, including those with a `Default`, must be configured or ignored with the `lifecycle` configuration block `ignoreChanges` argument.
 *
 * > **NOTE:** All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignoreChanges` argument.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const aWSCloudFormationStackSetAdministrationRoleAssumeRolePolicy = aws.iam.getPolicyDocument({
 *     statements: [{
 *         actions: ["sts:AssumeRole"],
 *         effect: "Allow",
 *         principals: [{
 *             identifiers: ["cloudformation.amazonaws.com"],
 *             type: "Service",
 *         }],
 *     }],
 * });
 * const aWSCloudFormationStackSetAdministrationRole = new aws.iam.Role("AWSCloudFormationStackSetAdministrationRole", {
 *     assumeRolePolicy: aWSCloudFormationStackSetAdministrationRoleAssumeRolePolicy.then(aWSCloudFormationStackSetAdministrationRoleAssumeRolePolicy => aWSCloudFormationStackSetAdministrationRoleAssumeRolePolicy.json),
 *     name: "AWSCloudFormationStackSetAdministrationRole",
 * });
 * const example = new aws.cloudformation.StackSet("example", {
 *     administrationRoleArn: aWSCloudFormationStackSetAdministrationRole.arn,
 *     name: "example",
 *     parameters: {
 *         VPCCidr: "10.0.0.0/16",
 *     },
 *     templateBody: JSON.stringify({
 *         parameters: {
 *             vPCCidr: {
 *                 type: "String",
 *                 "default": "10.0.0.0/16",
 *                 description: "Enter the CIDR block for the VPC. Default is 10.0.0.0/16.",
 *             },
 *         },
 *         resources: {
 *             myVpc: {
 *                 type: "AWS::EC2::VPC",
 *                 properties: {
 *                     cidrBlock: {
 *                         ref: "VPCCidr",
 *                     },
 *                     tags: [{
 *                         key: "Name",
 *                         value: "Primary_CF_VPC",
 *                     }],
 *                 },
 *             },
 *         },
 *     }),
 * });
 * const aWSCloudFormationStackSetAdministrationRoleExecutionPolicy = aws.iam.getPolicyDocumentOutput({
 *     statements: [{
 *         actions: ["sts:AssumeRole"],
 *         effect: "Allow",
 *         resources: [pulumi.interpolate`arn:aws:iam::*:role/${example.executionRoleName}`],
 *     }],
 * });
 * const aWSCloudFormationStackSetAdministrationRoleExecutionPolicyRolePolicy = new aws.iam.RolePolicy("AWSCloudFormationStackSetAdministrationRole_ExecutionPolicy", {
 *     name: "ExecutionPolicy",
 *     policy: aWSCloudFormationStackSetAdministrationRoleExecutionPolicy.apply(aWSCloudFormationStackSetAdministrationRoleExecutionPolicy => aWSCloudFormationStackSetAdministrationRoleExecutionPolicy.json),
 *     role: aWSCloudFormationStackSetAdministrationRole.name,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Import CloudFormation StackSets when acting a delegated administrator in a member account using the `name` and `call_as` values separated by a comma (`,`). For example:
 *
 * Using `pulumi import`, import CloudFormation StackSets using the `name`. For example:
 *
 * ```sh
 * $ pulumi import aws:cloudformation/stackSet:StackSet example example
 * ```
 * Using `pulumi import`, import CloudFormation StackSets when acting a delegated administrator in a member account using the `name` and `call_as` values separated by a comma (`,`). For example:
 *
 * ```sh
 * $ pulumi import aws:cloudformation/stackSet:StackSet example example,DELEGATED_ADMIN
 * ```
 */
export class StackSet extends pulumi.CustomResource {
    /**
     * Get an existing StackSet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StackSetState, opts?: pulumi.CustomResourceOptions): StackSet {
        return new StackSet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:cloudformation/stackSet:StackSet';

    /**
     * Returns true if the given object is an instance of StackSet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StackSet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StackSet.__pulumiType;
    }

    /**
     * Amazon Resource Number (ARN) of the IAM Role in the administrator account. This must be defined when using the `SELF_MANAGED` permission model.
     */
    public readonly administrationRoleArn!: pulumi.Output<string | undefined>;
    /**
     * Amazon Resource Name (ARN) of the StackSet.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Configuration block containing the auto-deployment model for your StackSet. This can only be defined when using the `SERVICE_MANAGED` permission model.
     */
    public readonly autoDeployment!: pulumi.Output<outputs.cloudformation.StackSetAutoDeployment | undefined>;
    /**
     * Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
     */
    public readonly callAs!: pulumi.Output<string | undefined>;
    /**
     * A list of capabilities. Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_AUTO_EXPAND`.
     */
    public readonly capabilities!: pulumi.Output<string[] | undefined>;
    /**
     * Description of the StackSet.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of the IAM Role in all target accounts for StackSet operations. Defaults to `AWSCloudFormationStackSetExecutionRole` when using the `SELF_MANAGED` permission model. This should not be defined when using the `SERVICE_MANAGED` permission model.
     */
    public readonly executionRoleName!: pulumi.Output<string>;
    /**
     * Configuration block to allow StackSets to perform non-conflicting operations concurrently and queues conflicting operations.
     */
    public readonly managedExecution!: pulumi.Output<outputs.cloudformation.StackSetManagedExecution | undefined>;
    /**
     * Name of the StackSet. The name must be unique in the region where you create your StackSet. The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an alphabetic character and cannot be longer than 128 characters.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Preferences for how AWS CloudFormation performs a stack set update.
     */
    public readonly operationPreferences!: pulumi.Output<outputs.cloudformation.StackSetOperationPreferences | undefined>;
    /**
     * Key-value map of input parameters for the StackSet template. All template parameters, including those with a `Default`, must be configured or ignored with `lifecycle` configuration block `ignoreChanges` argument. All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignoreChanges` argument.
     */
    public readonly parameters!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Describes how the IAM roles required for your StackSet are created. Valid values: `SELF_MANAGED` (default), `SERVICE_MANAGED`.
     */
    public readonly permissionModel!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the StackSet.
     */
    public /*out*/ readonly stackSetId!: pulumi.Output<string>;
    /**
     * Key-value map of tags to associate with this StackSet and the Stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the Stacks. A maximum number of 50 tags can be specified. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * String containing the CloudFormation template body. Maximum size: 51,200 bytes. Conflicts with `templateUrl`.
     */
    public readonly templateBody!: pulumi.Output<string>;
    /**
     * String containing the location of a file containing the CloudFormation template body. The URL must point to a template that is located in an Amazon S3 bucket. Maximum location file size: 460,800 bytes. Conflicts with `templateBody`.
     */
    public readonly templateUrl!: pulumi.Output<string | undefined>;

    /**
     * Create a StackSet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: StackSetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StackSetArgs | StackSetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StackSetState | undefined;
            resourceInputs["administrationRoleArn"] = state ? state.administrationRoleArn : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["autoDeployment"] = state ? state.autoDeployment : undefined;
            resourceInputs["callAs"] = state ? state.callAs : undefined;
            resourceInputs["capabilities"] = state ? state.capabilities : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["executionRoleName"] = state ? state.executionRoleName : undefined;
            resourceInputs["managedExecution"] = state ? state.managedExecution : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["operationPreferences"] = state ? state.operationPreferences : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["permissionModel"] = state ? state.permissionModel : undefined;
            resourceInputs["stackSetId"] = state ? state.stackSetId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["templateBody"] = state ? state.templateBody : undefined;
            resourceInputs["templateUrl"] = state ? state.templateUrl : undefined;
        } else {
            const args = argsOrState as StackSetArgs | undefined;
            resourceInputs["administrationRoleArn"] = args ? args.administrationRoleArn : undefined;
            resourceInputs["autoDeployment"] = args ? args.autoDeployment : undefined;
            resourceInputs["callAs"] = args ? args.callAs : undefined;
            resourceInputs["capabilities"] = args ? args.capabilities : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["executionRoleName"] = args ? args.executionRoleName : undefined;
            resourceInputs["managedExecution"] = args ? args.managedExecution : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["operationPreferences"] = args ? args.operationPreferences : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["permissionModel"] = args ? args.permissionModel : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["templateBody"] = args ? args.templateBody : undefined;
            resourceInputs["templateUrl"] = args ? args.templateUrl : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["stackSetId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StackSet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StackSet resources.
 */
export interface StackSetState {
    /**
     * Amazon Resource Number (ARN) of the IAM Role in the administrator account. This must be defined when using the `SELF_MANAGED` permission model.
     */
    administrationRoleArn?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the StackSet.
     */
    arn?: pulumi.Input<string>;
    /**
     * Configuration block containing the auto-deployment model for your StackSet. This can only be defined when using the `SERVICE_MANAGED` permission model.
     */
    autoDeployment?: pulumi.Input<inputs.cloudformation.StackSetAutoDeployment>;
    /**
     * Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
     */
    callAs?: pulumi.Input<string>;
    /**
     * A list of capabilities. Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_AUTO_EXPAND`.
     */
    capabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the StackSet.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the IAM Role in all target accounts for StackSet operations. Defaults to `AWSCloudFormationStackSetExecutionRole` when using the `SELF_MANAGED` permission model. This should not be defined when using the `SERVICE_MANAGED` permission model.
     */
    executionRoleName?: pulumi.Input<string>;
    /**
     * Configuration block to allow StackSets to perform non-conflicting operations concurrently and queues conflicting operations.
     */
    managedExecution?: pulumi.Input<inputs.cloudformation.StackSetManagedExecution>;
    /**
     * Name of the StackSet. The name must be unique in the region where you create your StackSet. The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an alphabetic character and cannot be longer than 128 characters.
     */
    name?: pulumi.Input<string>;
    /**
     * Preferences for how AWS CloudFormation performs a stack set update.
     */
    operationPreferences?: pulumi.Input<inputs.cloudformation.StackSetOperationPreferences>;
    /**
     * Key-value map of input parameters for the StackSet template. All template parameters, including those with a `Default`, must be configured or ignored with `lifecycle` configuration block `ignoreChanges` argument. All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignoreChanges` argument.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Describes how the IAM roles required for your StackSet are created. Valid values: `SELF_MANAGED` (default), `SERVICE_MANAGED`.
     */
    permissionModel?: pulumi.Input<string>;
    /**
     * Unique identifier of the StackSet.
     */
    stackSetId?: pulumi.Input<string>;
    /**
     * Key-value map of tags to associate with this StackSet and the Stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the Stacks. A maximum number of 50 tags can be specified. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * String containing the CloudFormation template body. Maximum size: 51,200 bytes. Conflicts with `templateUrl`.
     */
    templateBody?: pulumi.Input<string>;
    /**
     * String containing the location of a file containing the CloudFormation template body. The URL must point to a template that is located in an Amazon S3 bucket. Maximum location file size: 460,800 bytes. Conflicts with `templateBody`.
     */
    templateUrl?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StackSet resource.
 */
export interface StackSetArgs {
    /**
     * Amazon Resource Number (ARN) of the IAM Role in the administrator account. This must be defined when using the `SELF_MANAGED` permission model.
     */
    administrationRoleArn?: pulumi.Input<string>;
    /**
     * Configuration block containing the auto-deployment model for your StackSet. This can only be defined when using the `SERVICE_MANAGED` permission model.
     */
    autoDeployment?: pulumi.Input<inputs.cloudformation.StackSetAutoDeployment>;
    /**
     * Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. Valid values: `SELF` (default), `DELEGATED_ADMIN`.
     */
    callAs?: pulumi.Input<string>;
    /**
     * A list of capabilities. Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_AUTO_EXPAND`.
     */
    capabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the StackSet.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the IAM Role in all target accounts for StackSet operations. Defaults to `AWSCloudFormationStackSetExecutionRole` when using the `SELF_MANAGED` permission model. This should not be defined when using the `SERVICE_MANAGED` permission model.
     */
    executionRoleName?: pulumi.Input<string>;
    /**
     * Configuration block to allow StackSets to perform non-conflicting operations concurrently and queues conflicting operations.
     */
    managedExecution?: pulumi.Input<inputs.cloudformation.StackSetManagedExecution>;
    /**
     * Name of the StackSet. The name must be unique in the region where you create your StackSet. The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an alphabetic character and cannot be longer than 128 characters.
     */
    name?: pulumi.Input<string>;
    /**
     * Preferences for how AWS CloudFormation performs a stack set update.
     */
    operationPreferences?: pulumi.Input<inputs.cloudformation.StackSetOperationPreferences>;
    /**
     * Key-value map of input parameters for the StackSet template. All template parameters, including those with a `Default`, must be configured or ignored with `lifecycle` configuration block `ignoreChanges` argument. All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignoreChanges` argument.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Describes how the IAM roles required for your StackSet are created. Valid values: `SELF_MANAGED` (default), `SERVICE_MANAGED`.
     */
    permissionModel?: pulumi.Input<string>;
    /**
     * Key-value map of tags to associate with this StackSet and the Stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the Stacks. A maximum number of 50 tags can be specified. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * String containing the CloudFormation template body. Maximum size: 51,200 bytes. Conflicts with `templateUrl`.
     */
    templateBody?: pulumi.Input<string>;
    /**
     * String containing the location of a file containing the CloudFormation template body. The URL must point to a template that is located in an Amazon S3 bucket. Maximum location file size: 460,800 bytes. Conflicts with `templateBody`.
     */
    templateUrl?: pulumi.Input<string>;
}
