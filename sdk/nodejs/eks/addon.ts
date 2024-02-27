// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an EKS add-on.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.eks.Addon("example", {
 *     clusterName: aws_eks_cluster.example.name,
 *     addonName: "vpc-cni",
 * });
 * ```
 * ## Example Update add-on usage with resolveConflictsOnUpdate and PRESERVE
 *
 * `resolveConflictsOnUpdate` with `PRESERVE` can be used to retain the config changes applied to the add-on with kubectl while upgrading to a newer version of the add-on.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.eks.Addon("example", {
 *     clusterName: aws_eks_cluster.example.name,
 *     addonName: "coredns",
 *     addonVersion: "v1.10.1-eksbuild.1",
 *     resolveConflictsOnUpdate: "PRESERVE",
 * });
 * ```
 *
 * ## Example add-on usage with custom configurationValues
 *
 * Custom add-on configuration can be passed using `configurationValues` as a single JSON string while creating or updating the add-on.
 *
 * > **Note:** `configurationValues` is a single JSON string should match the valid JSON schema for each add-on with specific version.
 *
 * To find the correct JSON schema for each add-on can be extracted using [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html) call.
 * This below is an example for extracting the `configurationValues` schema for `coredns`.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 *
 * Example to create a `coredns` managed addon with custom `configurationValues`.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.eks.Addon("example", {
 *     clusterName: "mycluster",
 *     addonName: "coredns",
 *     addonVersion: "v1.10.1-eksbuild.1",
 *     resolveConflictsOnCreate: "OVERWRITE",
 *     configurationValues: JSON.stringify({
 *         replicaCount: 4,
 *         resources: {
 *             limits: {
 *                 cpu: "100m",
 *                 memory: "150Mi",
 *             },
 *             requests: {
 *                 cpu: "100m",
 *                 memory: "150Mi",
 *             },
 *         },
 *     }),
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import EKS add-on using the `cluster_name` and `addon_name` separated by a colon (`:`). For example:
 *
 * ```sh
 *  $ pulumi import aws:eks/addon:Addon my_eks_addon my_cluster_name:my_addon_name
 * ```
 */
export class Addon extends pulumi.CustomResource {
    /**
     * Get an existing Addon resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AddonState, opts?: pulumi.CustomResourceOptions): Addon {
        return new Addon(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:eks/addon:Addon';

    /**
     * Returns true if the given object is an instance of Addon.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Addon {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Addon.__pulumiType;
    }

    /**
     * Name of the EKS add-on. The name must match one of
     * the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     */
    public readonly addonName!: pulumi.Output<string>;
    /**
     * The version of the EKS add-on. The version must
     * match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     */
    public readonly addonVersion!: pulumi.Output<string>;
    /**
     * Amazon Resource Name (ARN) of the EKS add-on.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     *
     * The following arguments are optional:
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * custom configuration values for addons with single JSON string. This JSON string value must match the JSON schema derived from [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html).
     */
    public readonly configurationValues!: pulumi.Output<string>;
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
     */
    public /*out*/ readonly modifiedAt!: pulumi.Output<string>;
    /**
     * Indicates if you want to preserve the created resources when deleting the EKS add-on.
     */
    public readonly preserve!: pulumi.Output<boolean | undefined>;
    /**
     * Define how to resolve parameter value conflicts when migrating an existing add-on to an Amazon EKS add-on or when applying version updates to the add-on. Valid values are `NONE`, `OVERWRITE` and `PRESERVE`. Note that `PRESERVE` is only valid on addon update, not for initial addon creation. If you need to set this to `PRESERVE`, use the `resolveConflictsOnCreate` and `resolveConflictsOnUpdate` attributes instead. For more details check [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
     *
     * @deprecated The "resolve_conflicts" attribute can't be set to "PRESERVE" on initial resource creation. Use "resolve_conflicts_on_create" and/or "resolve_conflicts_on_update" instead
     */
    public readonly resolveConflicts!: pulumi.Output<string | undefined>;
    /**
     * How to resolve field value conflicts when migrating a self-managed add-on to an Amazon EKS add-on. Valid values are `NONE` and `OVERWRITE`. For more details see the [CreateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_CreateAddon.html) API Docs.
     */
    public readonly resolveConflictsOnCreate!: pulumi.Output<string | undefined>;
    /**
     * How to resolve field value conflicts for an Amazon EKS add-on if you've changed a value from the Amazon EKS default value. Valid values are `NONE`, `OVERWRITE`, and `PRESERVE`. For more details see the [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
     */
    public readonly resolveConflictsOnUpdate!: pulumi.Output<string | undefined>;
    /**
     * The Amazon Resource Name (ARN) of an
     * existing IAM role to bind to the add-on's service account. The role must be
     * assigned the IAM permissions required by the add-on. If you don't specify
     * an existing IAM role, then the add-on uses the permissions assigned to the node
     * IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
     * in the Amazon EKS User Guide.
     *
     * > **Note:** To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC)
     * provider created for your cluster. For more information, [see Enabling IAM roles
     * for service accounts on your cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
     * in the Amazon EKS User Guide.
     */
    public readonly serviceAccountRoleArn!: pulumi.Output<string | undefined>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * (Optional) Key-value map of resource tags, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Addon resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AddonArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AddonArgs | AddonState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AddonState | undefined;
            resourceInputs["addonName"] = state ? state.addonName : undefined;
            resourceInputs["addonVersion"] = state ? state.addonVersion : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["configurationValues"] = state ? state.configurationValues : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["modifiedAt"] = state ? state.modifiedAt : undefined;
            resourceInputs["preserve"] = state ? state.preserve : undefined;
            resourceInputs["resolveConflicts"] = state ? state.resolveConflicts : undefined;
            resourceInputs["resolveConflictsOnCreate"] = state ? state.resolveConflictsOnCreate : undefined;
            resourceInputs["resolveConflictsOnUpdate"] = state ? state.resolveConflictsOnUpdate : undefined;
            resourceInputs["serviceAccountRoleArn"] = state ? state.serviceAccountRoleArn : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as AddonArgs | undefined;
            if ((!args || args.addonName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'addonName'");
            }
            if ((!args || args.clusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterName'");
            }
            resourceInputs["addonName"] = args ? args.addonName : undefined;
            resourceInputs["addonVersion"] = args ? args.addonVersion : undefined;
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["configurationValues"] = args ? args.configurationValues : undefined;
            resourceInputs["preserve"] = args ? args.preserve : undefined;
            resourceInputs["resolveConflicts"] = args ? args.resolveConflicts : undefined;
            resourceInputs["resolveConflictsOnCreate"] = args ? args.resolveConflictsOnCreate : undefined;
            resourceInputs["resolveConflictsOnUpdate"] = args ? args.resolveConflictsOnUpdate : undefined;
            resourceInputs["serviceAccountRoleArn"] = args ? args.serviceAccountRoleArn : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["modifiedAt"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Addon.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Addon resources.
 */
export interface AddonState {
    /**
     * Name of the EKS add-on. The name must match one of
     * the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     */
    addonName?: pulumi.Input<string>;
    /**
     * The version of the EKS add-on. The version must
     * match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     */
    addonVersion?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the EKS add-on.
     */
    arn?: pulumi.Input<string>;
    /**
     * Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     *
     * The following arguments are optional:
     */
    clusterName?: pulumi.Input<string>;
    /**
     * custom configuration values for addons with single JSON string. This JSON string value must match the JSON schema derived from [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html).
     */
    configurationValues?: pulumi.Input<string>;
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
     */
    modifiedAt?: pulumi.Input<string>;
    /**
     * Indicates if you want to preserve the created resources when deleting the EKS add-on.
     */
    preserve?: pulumi.Input<boolean>;
    /**
     * Define how to resolve parameter value conflicts when migrating an existing add-on to an Amazon EKS add-on or when applying version updates to the add-on. Valid values are `NONE`, `OVERWRITE` and `PRESERVE`. Note that `PRESERVE` is only valid on addon update, not for initial addon creation. If you need to set this to `PRESERVE`, use the `resolveConflictsOnCreate` and `resolveConflictsOnUpdate` attributes instead. For more details check [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
     *
     * @deprecated The "resolve_conflicts" attribute can't be set to "PRESERVE" on initial resource creation. Use "resolve_conflicts_on_create" and/or "resolve_conflicts_on_update" instead
     */
    resolveConflicts?: pulumi.Input<string>;
    /**
     * How to resolve field value conflicts when migrating a self-managed add-on to an Amazon EKS add-on. Valid values are `NONE` and `OVERWRITE`. For more details see the [CreateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_CreateAddon.html) API Docs.
     */
    resolveConflictsOnCreate?: pulumi.Input<string>;
    /**
     * How to resolve field value conflicts for an Amazon EKS add-on if you've changed a value from the Amazon EKS default value. Valid values are `NONE`, `OVERWRITE`, and `PRESERVE`. For more details see the [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
     */
    resolveConflictsOnUpdate?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of an
     * existing IAM role to bind to the add-on's service account. The role must be
     * assigned the IAM permissions required by the add-on. If you don't specify
     * an existing IAM role, then the add-on uses the permissions assigned to the node
     * IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
     * in the Amazon EKS User Guide.
     *
     * > **Note:** To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC)
     * provider created for your cluster. For more information, [see Enabling IAM roles
     * for service accounts on your cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
     * in the Amazon EKS User Guide.
     */
    serviceAccountRoleArn?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * (Optional) Key-value map of resource tags, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Addon resource.
 */
export interface AddonArgs {
    /**
     * Name of the EKS add-on. The name must match one of
     * the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     */
    addonName: pulumi.Input<string>;
    /**
     * The version of the EKS add-on. The version must
     * match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     */
    addonVersion?: pulumi.Input<string>;
    /**
     * Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     *
     * The following arguments are optional:
     */
    clusterName: pulumi.Input<string>;
    /**
     * custom configuration values for addons with single JSON string. This JSON string value must match the JSON schema derived from [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html).
     */
    configurationValues?: pulumi.Input<string>;
    /**
     * Indicates if you want to preserve the created resources when deleting the EKS add-on.
     */
    preserve?: pulumi.Input<boolean>;
    /**
     * Define how to resolve parameter value conflicts when migrating an existing add-on to an Amazon EKS add-on or when applying version updates to the add-on. Valid values are `NONE`, `OVERWRITE` and `PRESERVE`. Note that `PRESERVE` is only valid on addon update, not for initial addon creation. If you need to set this to `PRESERVE`, use the `resolveConflictsOnCreate` and `resolveConflictsOnUpdate` attributes instead. For more details check [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
     *
     * @deprecated The "resolve_conflicts" attribute can't be set to "PRESERVE" on initial resource creation. Use "resolve_conflicts_on_create" and/or "resolve_conflicts_on_update" instead
     */
    resolveConflicts?: pulumi.Input<string>;
    /**
     * How to resolve field value conflicts when migrating a self-managed add-on to an Amazon EKS add-on. Valid values are `NONE` and `OVERWRITE`. For more details see the [CreateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_CreateAddon.html) API Docs.
     */
    resolveConflictsOnCreate?: pulumi.Input<string>;
    /**
     * How to resolve field value conflicts for an Amazon EKS add-on if you've changed a value from the Amazon EKS default value. Valid values are `NONE`, `OVERWRITE`, and `PRESERVE`. For more details see the [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
     */
    resolveConflictsOnUpdate?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of an
     * existing IAM role to bind to the add-on's service account. The role must be
     * assigned the IAM permissions required by the add-on. If you don't specify
     * an existing IAM role, then the add-on uses the permissions assigned to the node
     * IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
     * in the Amazon EKS User Guide.
     *
     * > **Note:** To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC)
     * provider created for your cluster. For more information, [see Enabling IAM roles
     * for service accounts on your cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
     * in the Amazon EKS User Guide.
     */
    serviceAccountRoleArn?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
