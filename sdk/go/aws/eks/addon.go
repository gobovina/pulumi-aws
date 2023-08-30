// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an EKS add-on.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/eks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := eks.NewAddon(ctx, "example", &eks.AddonArgs{
//				ClusterName: pulumi.Any(aws_eks_cluster.Example.Name),
//				AddonName:   pulumi.String("vpc-cni"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Example Update add-on usage with resolveConflictsOnUpdate and PRESERVE
//
// `resolveConflictsOnUpdate` with `PRESERVE` can be used to retain the config changes applied to the add-on with kubectl while upgrading to a newer version of the add-on.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/eks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := eks.NewAddon(ctx, "example", &eks.AddonArgs{
//				ClusterName:              pulumi.Any(aws_eks_cluster.Example.Name),
//				AddonName:                pulumi.String("coredns"),
//				AddonVersion:             pulumi.String("v1.10.1-eksbuild.1"),
//				ResolveConflictsOnUpdate: pulumi.String("PRESERVE"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Example add-on usage with custom configurationValues
//
// Custom add-on configuration can be passed using `configurationValues` as a single JSON string while creating or updating the add-on.
//
// > **Note:** `configurationValues` is a single JSON string should match the valid JSON schema for each add-on with specific version.
//
// To find the correct JSON schema for each add-on can be extracted using [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html) call.
// This below is an example for extracting the `configurationValues` schema for `coredns`.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			return nil
//		})
//	}
//
// ```
//
// Example to create a `coredns` managed addon with custom `configurationValues`.
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/eks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"replicaCount": 4,
//				"resources": map[string]interface{}{
//					"limits": map[string]interface{}{
//						"cpu":    "100m",
//						"memory": "150Mi",
//					},
//					"requests": map[string]interface{}{
//						"cpu":    "100m",
//						"memory": "150Mi",
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = eks.NewAddon(ctx, "example", &eks.AddonArgs{
//				ClusterName:              pulumi.String("mycluster"),
//				AddonName:                pulumi.String("coredns"),
//				AddonVersion:             pulumi.String("v1.10.1-eksbuild.1"),
//				ResolveConflictsOnCreate: pulumi.String("OVERWRITE"),
//				ConfigurationValues:      pulumi.String(json0),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Using `pulumi import`, import EKS add-on using the `cluster_name` and `addon_name` separated by a colon (`:`). For example:
//
// ```sh
//
//	$ pulumi import aws:eks/addon:Addon my_eks_addon my_cluster_name:my_addon_name
//
// ```
type Addon struct {
	pulumi.CustomResourceState

	// Name of the EKS add-on. The name must match one of
	// the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
	AddonName pulumi.StringOutput `pulumi:"addonName"`
	// The version of the EKS add-on. The version must
	// match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
	AddonVersion pulumi.StringOutput `pulumi:"addonVersion"`
	// Amazon Resource Name (ARN) of the EKS add-on.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
	//
	// The following arguments are optional:
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// custom configuration values for addons with single JSON string. This JSON string value must match the JSON schema derived from [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html).
	ConfigurationValues pulumi.StringOutput `pulumi:"configurationValues"`
	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
	ModifiedAt pulumi.StringOutput `pulumi:"modifiedAt"`
	// Indicates if you want to preserve the created resources when deleting the EKS add-on.
	Preserve pulumi.BoolPtrOutput `pulumi:"preserve"`
	// Define how to resolve parameter value conflicts when migrating an existing add-on to an Amazon EKS add-on or when applying version updates to the add-on. Valid values are `NONE`, `OVERWRITE` and `PRESERVE`. Note that `PRESERVE` is only valid on addon update, not for initial addon creation. If you need to set this to `PRESERVE`, use the `resolveConflictsOnCreate` and `resolveConflictsOnUpdate` attributes instead. For more details check [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
	//
	// Deprecated: The "resolve_conflicts" attribute can't be set to "PRESERVE" on initial resource creation. Use "resolve_conflicts_on_create" and/or "resolve_conflicts_on_update" instead
	ResolveConflicts pulumi.StringPtrOutput `pulumi:"resolveConflicts"`
	// How to resolve field value conflicts when migrating a self-managed add-on to an Amazon EKS add-on. Valid values are `NONE` and `OVERWRITE`. For more details see the [CreateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_CreateAddon.html) API Docs.
	ResolveConflictsOnCreate pulumi.StringPtrOutput `pulumi:"resolveConflictsOnCreate"`
	// How to resolve field value conflicts for an Amazon EKS add-on if you've changed a value from the Amazon EKS default value. Valid values are `NONE`, `OVERWRITE`, and `PRESERVE`. For more details see the [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
	ResolveConflictsOnUpdate pulumi.StringPtrOutput `pulumi:"resolveConflictsOnUpdate"`
	// The Amazon Resource Name (ARN) of an
	// existing IAM role to bind to the add-on's service account. The role must be
	// assigned the IAM permissions required by the add-on. If you don't specify
	// an existing IAM role, then the add-on uses the permissions assigned to the node
	// IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
	// in the Amazon EKS User Guide.
	//
	// > **Note:** To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC)
	// provider created for your cluster. For more information, [see Enabling IAM roles
	// for service accounts on your cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
	// in the Amazon EKS User Guide.
	ServiceAccountRoleArn pulumi.StringPtrOutput `pulumi:"serviceAccountRoleArn"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// (Optional) Key-value map of resource tags, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewAddon registers a new resource with the given unique name, arguments, and options.
func NewAddon(ctx *pulumi.Context,
	name string, args *AddonArgs, opts ...pulumi.ResourceOption) (*Addon, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AddonName == nil {
		return nil, errors.New("invalid value for required argument 'AddonName'")
	}
	if args.ClusterName == nil {
		return nil, errors.New("invalid value for required argument 'ClusterName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Addon
	err := ctx.RegisterResource("aws:eks/addon:Addon", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAddon gets an existing Addon resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAddon(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AddonState, opts ...pulumi.ResourceOption) (*Addon, error) {
	var resource Addon
	err := ctx.ReadResource("aws:eks/addon:Addon", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Addon resources.
type addonState struct {
	// Name of the EKS add-on. The name must match one of
	// the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
	AddonName *string `pulumi:"addonName"`
	// The version of the EKS add-on. The version must
	// match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
	AddonVersion *string `pulumi:"addonVersion"`
	// Amazon Resource Name (ARN) of the EKS add-on.
	Arn *string `pulumi:"arn"`
	// Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
	//
	// The following arguments are optional:
	ClusterName *string `pulumi:"clusterName"`
	// custom configuration values for addons with single JSON string. This JSON string value must match the JSON schema derived from [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html).
	ConfigurationValues *string `pulumi:"configurationValues"`
	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
	CreatedAt *string `pulumi:"createdAt"`
	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
	ModifiedAt *string `pulumi:"modifiedAt"`
	// Indicates if you want to preserve the created resources when deleting the EKS add-on.
	Preserve *bool `pulumi:"preserve"`
	// Define how to resolve parameter value conflicts when migrating an existing add-on to an Amazon EKS add-on or when applying version updates to the add-on. Valid values are `NONE`, `OVERWRITE` and `PRESERVE`. Note that `PRESERVE` is only valid on addon update, not for initial addon creation. If you need to set this to `PRESERVE`, use the `resolveConflictsOnCreate` and `resolveConflictsOnUpdate` attributes instead. For more details check [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
	//
	// Deprecated: The "resolve_conflicts" attribute can't be set to "PRESERVE" on initial resource creation. Use "resolve_conflicts_on_create" and/or "resolve_conflicts_on_update" instead
	ResolveConflicts *string `pulumi:"resolveConflicts"`
	// How to resolve field value conflicts when migrating a self-managed add-on to an Amazon EKS add-on. Valid values are `NONE` and `OVERWRITE`. For more details see the [CreateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_CreateAddon.html) API Docs.
	ResolveConflictsOnCreate *string `pulumi:"resolveConflictsOnCreate"`
	// How to resolve field value conflicts for an Amazon EKS add-on if you've changed a value from the Amazon EKS default value. Valid values are `NONE`, `OVERWRITE`, and `PRESERVE`. For more details see the [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
	ResolveConflictsOnUpdate *string `pulumi:"resolveConflictsOnUpdate"`
	// The Amazon Resource Name (ARN) of an
	// existing IAM role to bind to the add-on's service account. The role must be
	// assigned the IAM permissions required by the add-on. If you don't specify
	// an existing IAM role, then the add-on uses the permissions assigned to the node
	// IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
	// in the Amazon EKS User Guide.
	//
	// > **Note:** To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC)
	// provider created for your cluster. For more information, [see Enabling IAM roles
	// for service accounts on your cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
	// in the Amazon EKS User Guide.
	ServiceAccountRoleArn *string `pulumi:"serviceAccountRoleArn"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// (Optional) Key-value map of resource tags, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type AddonState struct {
	// Name of the EKS add-on. The name must match one of
	// the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
	AddonName pulumi.StringPtrInput
	// The version of the EKS add-on. The version must
	// match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
	AddonVersion pulumi.StringPtrInput
	// Amazon Resource Name (ARN) of the EKS add-on.
	Arn pulumi.StringPtrInput
	// Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
	//
	// The following arguments are optional:
	ClusterName pulumi.StringPtrInput
	// custom configuration values for addons with single JSON string. This JSON string value must match the JSON schema derived from [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html).
	ConfigurationValues pulumi.StringPtrInput
	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
	CreatedAt pulumi.StringPtrInput
	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
	ModifiedAt pulumi.StringPtrInput
	// Indicates if you want to preserve the created resources when deleting the EKS add-on.
	Preserve pulumi.BoolPtrInput
	// Define how to resolve parameter value conflicts when migrating an existing add-on to an Amazon EKS add-on or when applying version updates to the add-on. Valid values are `NONE`, `OVERWRITE` and `PRESERVE`. Note that `PRESERVE` is only valid on addon update, not for initial addon creation. If you need to set this to `PRESERVE`, use the `resolveConflictsOnCreate` and `resolveConflictsOnUpdate` attributes instead. For more details check [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
	//
	// Deprecated: The "resolve_conflicts" attribute can't be set to "PRESERVE" on initial resource creation. Use "resolve_conflicts_on_create" and/or "resolve_conflicts_on_update" instead
	ResolveConflicts pulumi.StringPtrInput
	// How to resolve field value conflicts when migrating a self-managed add-on to an Amazon EKS add-on. Valid values are `NONE` and `OVERWRITE`. For more details see the [CreateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_CreateAddon.html) API Docs.
	ResolveConflictsOnCreate pulumi.StringPtrInput
	// How to resolve field value conflicts for an Amazon EKS add-on if you've changed a value from the Amazon EKS default value. Valid values are `NONE`, `OVERWRITE`, and `PRESERVE`. For more details see the [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
	ResolveConflictsOnUpdate pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of an
	// existing IAM role to bind to the add-on's service account. The role must be
	// assigned the IAM permissions required by the add-on. If you don't specify
	// an existing IAM role, then the add-on uses the permissions assigned to the node
	// IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
	// in the Amazon EKS User Guide.
	//
	// > **Note:** To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC)
	// provider created for your cluster. For more information, [see Enabling IAM roles
	// for service accounts on your cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
	// in the Amazon EKS User Guide.
	ServiceAccountRoleArn pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// (Optional) Key-value map of resource tags, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (AddonState) ElementType() reflect.Type {
	return reflect.TypeOf((*addonState)(nil)).Elem()
}

type addonArgs struct {
	// Name of the EKS add-on. The name must match one of
	// the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
	AddonName string `pulumi:"addonName"`
	// The version of the EKS add-on. The version must
	// match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
	AddonVersion *string `pulumi:"addonVersion"`
	// Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
	//
	// The following arguments are optional:
	ClusterName string `pulumi:"clusterName"`
	// custom configuration values for addons with single JSON string. This JSON string value must match the JSON schema derived from [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html).
	ConfigurationValues *string `pulumi:"configurationValues"`
	// Indicates if you want to preserve the created resources when deleting the EKS add-on.
	Preserve *bool `pulumi:"preserve"`
	// Define how to resolve parameter value conflicts when migrating an existing add-on to an Amazon EKS add-on or when applying version updates to the add-on. Valid values are `NONE`, `OVERWRITE` and `PRESERVE`. Note that `PRESERVE` is only valid on addon update, not for initial addon creation. If you need to set this to `PRESERVE`, use the `resolveConflictsOnCreate` and `resolveConflictsOnUpdate` attributes instead. For more details check [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
	//
	// Deprecated: The "resolve_conflicts" attribute can't be set to "PRESERVE" on initial resource creation. Use "resolve_conflicts_on_create" and/or "resolve_conflicts_on_update" instead
	ResolveConflicts *string `pulumi:"resolveConflicts"`
	// How to resolve field value conflicts when migrating a self-managed add-on to an Amazon EKS add-on. Valid values are `NONE` and `OVERWRITE`. For more details see the [CreateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_CreateAddon.html) API Docs.
	ResolveConflictsOnCreate *string `pulumi:"resolveConflictsOnCreate"`
	// How to resolve field value conflicts for an Amazon EKS add-on if you've changed a value from the Amazon EKS default value. Valid values are `NONE`, `OVERWRITE`, and `PRESERVE`. For more details see the [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
	ResolveConflictsOnUpdate *string `pulumi:"resolveConflictsOnUpdate"`
	// The Amazon Resource Name (ARN) of an
	// existing IAM role to bind to the add-on's service account. The role must be
	// assigned the IAM permissions required by the add-on. If you don't specify
	// an existing IAM role, then the add-on uses the permissions assigned to the node
	// IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
	// in the Amazon EKS User Guide.
	//
	// > **Note:** To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC)
	// provider created for your cluster. For more information, [see Enabling IAM roles
	// for service accounts on your cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
	// in the Amazon EKS User Guide.
	ServiceAccountRoleArn *string `pulumi:"serviceAccountRoleArn"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Addon resource.
type AddonArgs struct {
	// Name of the EKS add-on. The name must match one of
	// the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
	AddonName pulumi.StringInput
	// The version of the EKS add-on. The version must
	// match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
	AddonVersion pulumi.StringPtrInput
	// Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
	//
	// The following arguments are optional:
	ClusterName pulumi.StringInput
	// custom configuration values for addons with single JSON string. This JSON string value must match the JSON schema derived from [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html).
	ConfigurationValues pulumi.StringPtrInput
	// Indicates if you want to preserve the created resources when deleting the EKS add-on.
	Preserve pulumi.BoolPtrInput
	// Define how to resolve parameter value conflicts when migrating an existing add-on to an Amazon EKS add-on or when applying version updates to the add-on. Valid values are `NONE`, `OVERWRITE` and `PRESERVE`. Note that `PRESERVE` is only valid on addon update, not for initial addon creation. If you need to set this to `PRESERVE`, use the `resolveConflictsOnCreate` and `resolveConflictsOnUpdate` attributes instead. For more details check [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
	//
	// Deprecated: The "resolve_conflicts" attribute can't be set to "PRESERVE" on initial resource creation. Use "resolve_conflicts_on_create" and/or "resolve_conflicts_on_update" instead
	ResolveConflicts pulumi.StringPtrInput
	// How to resolve field value conflicts when migrating a self-managed add-on to an Amazon EKS add-on. Valid values are `NONE` and `OVERWRITE`. For more details see the [CreateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_CreateAddon.html) API Docs.
	ResolveConflictsOnCreate pulumi.StringPtrInput
	// How to resolve field value conflicts for an Amazon EKS add-on if you've changed a value from the Amazon EKS default value. Valid values are `NONE`, `OVERWRITE`, and `PRESERVE`. For more details see the [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
	ResolveConflictsOnUpdate pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of an
	// existing IAM role to bind to the add-on's service account. The role must be
	// assigned the IAM permissions required by the add-on. If you don't specify
	// an existing IAM role, then the add-on uses the permissions assigned to the node
	// IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
	// in the Amazon EKS User Guide.
	//
	// > **Note:** To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC)
	// provider created for your cluster. For more information, [see Enabling IAM roles
	// for service accounts on your cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
	// in the Amazon EKS User Guide.
	ServiceAccountRoleArn pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (AddonArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*addonArgs)(nil)).Elem()
}

type AddonInput interface {
	pulumi.Input

	ToAddonOutput() AddonOutput
	ToAddonOutputWithContext(ctx context.Context) AddonOutput
}

func (*Addon) ElementType() reflect.Type {
	return reflect.TypeOf((**Addon)(nil)).Elem()
}

func (i *Addon) ToAddonOutput() AddonOutput {
	return i.ToAddonOutputWithContext(context.Background())
}

func (i *Addon) ToAddonOutputWithContext(ctx context.Context) AddonOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddonOutput)
}

// AddonArrayInput is an input type that accepts AddonArray and AddonArrayOutput values.
// You can construct a concrete instance of `AddonArrayInput` via:
//
//	AddonArray{ AddonArgs{...} }
type AddonArrayInput interface {
	pulumi.Input

	ToAddonArrayOutput() AddonArrayOutput
	ToAddonArrayOutputWithContext(context.Context) AddonArrayOutput
}

type AddonArray []AddonInput

func (AddonArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Addon)(nil)).Elem()
}

func (i AddonArray) ToAddonArrayOutput() AddonArrayOutput {
	return i.ToAddonArrayOutputWithContext(context.Background())
}

func (i AddonArray) ToAddonArrayOutputWithContext(ctx context.Context) AddonArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddonArrayOutput)
}

// AddonMapInput is an input type that accepts AddonMap and AddonMapOutput values.
// You can construct a concrete instance of `AddonMapInput` via:
//
//	AddonMap{ "key": AddonArgs{...} }
type AddonMapInput interface {
	pulumi.Input

	ToAddonMapOutput() AddonMapOutput
	ToAddonMapOutputWithContext(context.Context) AddonMapOutput
}

type AddonMap map[string]AddonInput

func (AddonMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Addon)(nil)).Elem()
}

func (i AddonMap) ToAddonMapOutput() AddonMapOutput {
	return i.ToAddonMapOutputWithContext(context.Background())
}

func (i AddonMap) ToAddonMapOutputWithContext(ctx context.Context) AddonMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddonMapOutput)
}

type AddonOutput struct{ *pulumi.OutputState }

func (AddonOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Addon)(nil)).Elem()
}

func (o AddonOutput) ToAddonOutput() AddonOutput {
	return o
}

func (o AddonOutput) ToAddonOutputWithContext(ctx context.Context) AddonOutput {
	return o
}

// Name of the EKS add-on. The name must match one of
// the names returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
func (o AddonOutput) AddonName() pulumi.StringOutput {
	return o.ApplyT(func(v *Addon) pulumi.StringOutput { return v.AddonName }).(pulumi.StringOutput)
}

// The version of the EKS add-on. The version must
// match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
func (o AddonOutput) AddonVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *Addon) pulumi.StringOutput { return v.AddonVersion }).(pulumi.StringOutput)
}

// Amazon Resource Name (ARN) of the EKS add-on.
func (o AddonOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Addon) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
//
// The following arguments are optional:
func (o AddonOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *Addon) pulumi.StringOutput { return v.ClusterName }).(pulumi.StringOutput)
}

// custom configuration values for addons with single JSON string. This JSON string value must match the JSON schema derived from [describe-addon-configuration](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-configuration.html).
func (o AddonOutput) ConfigurationValues() pulumi.StringOutput {
	return o.ApplyT(func(v *Addon) pulumi.StringOutput { return v.ConfigurationValues }).(pulumi.StringOutput)
}

// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
func (o AddonOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *Addon) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
func (o AddonOutput) ModifiedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *Addon) pulumi.StringOutput { return v.ModifiedAt }).(pulumi.StringOutput)
}

// Indicates if you want to preserve the created resources when deleting the EKS add-on.
func (o AddonOutput) Preserve() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Addon) pulumi.BoolPtrOutput { return v.Preserve }).(pulumi.BoolPtrOutput)
}

// Define how to resolve parameter value conflicts when migrating an existing add-on to an Amazon EKS add-on or when applying version updates to the add-on. Valid values are `NONE`, `OVERWRITE` and `PRESERVE`. Note that `PRESERVE` is only valid on addon update, not for initial addon creation. If you need to set this to `PRESERVE`, use the `resolveConflictsOnCreate` and `resolveConflictsOnUpdate` attributes instead. For more details check [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
//
// Deprecated: The "resolve_conflicts" attribute can't be set to "PRESERVE" on initial resource creation. Use "resolve_conflicts_on_create" and/or "resolve_conflicts_on_update" instead
func (o AddonOutput) ResolveConflicts() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Addon) pulumi.StringPtrOutput { return v.ResolveConflicts }).(pulumi.StringPtrOutput)
}

// How to resolve field value conflicts when migrating a self-managed add-on to an Amazon EKS add-on. Valid values are `NONE` and `OVERWRITE`. For more details see the [CreateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_CreateAddon.html) API Docs.
func (o AddonOutput) ResolveConflictsOnCreate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Addon) pulumi.StringPtrOutput { return v.ResolveConflictsOnCreate }).(pulumi.StringPtrOutput)
}

// How to resolve field value conflicts for an Amazon EKS add-on if you've changed a value from the Amazon EKS default value. Valid values are `NONE`, `OVERWRITE`, and `PRESERVE`. For more details see the [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) API Docs.
func (o AddonOutput) ResolveConflictsOnUpdate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Addon) pulumi.StringPtrOutput { return v.ResolveConflictsOnUpdate }).(pulumi.StringPtrOutput)
}

// The Amazon Resource Name (ARN) of an
// existing IAM role to bind to the add-on's service account. The role must be
// assigned the IAM permissions required by the add-on. If you don't specify
// an existing IAM role, then the add-on uses the permissions assigned to the node
// IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
// in the Amazon EKS User Guide.
//
// > **Note:** To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC)
// provider created for your cluster. For more information, [see Enabling IAM roles
// for service accounts on your cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
// in the Amazon EKS User Guide.
func (o AddonOutput) ServiceAccountRoleArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Addon) pulumi.StringPtrOutput { return v.ServiceAccountRoleArn }).(pulumi.StringPtrOutput)
}

// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o AddonOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Addon) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// (Optional) Key-value map of resource tags, including those inherited from the provider `defaultTags` configuration block.
func (o AddonOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Addon) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type AddonArrayOutput struct{ *pulumi.OutputState }

func (AddonArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Addon)(nil)).Elem()
}

func (o AddonArrayOutput) ToAddonArrayOutput() AddonArrayOutput {
	return o
}

func (o AddonArrayOutput) ToAddonArrayOutputWithContext(ctx context.Context) AddonArrayOutput {
	return o
}

func (o AddonArrayOutput) Index(i pulumi.IntInput) AddonOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Addon {
		return vs[0].([]*Addon)[vs[1].(int)]
	}).(AddonOutput)
}

type AddonMapOutput struct{ *pulumi.OutputState }

func (AddonMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Addon)(nil)).Elem()
}

func (o AddonMapOutput) ToAddonMapOutput() AddonMapOutput {
	return o
}

func (o AddonMapOutput) ToAddonMapOutputWithContext(ctx context.Context) AddonMapOutput {
	return o
}

func (o AddonMapOutput) MapIndex(k pulumi.StringInput) AddonOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Addon {
		return vs[0].(map[string]*Addon)[vs[1].(string)]
	}).(AddonOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AddonInput)(nil)).Elem(), &Addon{})
	pulumi.RegisterInputType(reflect.TypeOf((*AddonArrayInput)(nil)).Elem(), AddonArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AddonMapInput)(nil)).Elem(), AddonMap{})
	pulumi.RegisterOutputType(AddonOutput{})
	pulumi.RegisterOutputType(AddonArrayOutput{})
	pulumi.RegisterOutputType(AddonMapOutput{})
}
