// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package redshift

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Redshift Cluster IAM Roles resource.
//
// > **NOTE:** A Redshift cluster's default IAM role can be managed both by this resource's `defaultIamRoleArn` argument and the `redshift.Cluster` resource's `defaultIamRoleArn` argument. Do not configure different values for both arguments. Doing so will cause a conflict of default IAM roles.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/redshift"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := redshift.NewClusterIamRoles(ctx, "example", &redshift.ClusterIamRolesArgs{
//				ClusterIdentifier: pulumi.Any(exampleAwsRedshiftCluster.ClusterIdentifier),
//				IamRoleArns: pulumi.StringArray{
//					exampleAwsIamRole.Arn,
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import Redshift Cluster IAM Roless using the `cluster_identifier`. For example:
//
// ```sh
// $ pulumi import aws:redshift/clusterIamRoles:ClusterIamRoles examplegroup1 example
// ```
type ClusterIamRoles struct {
	pulumi.CustomResourceState

	// The name of the Redshift Cluster IAM Roles.
	ClusterIdentifier pulumi.StringOutput `pulumi:"clusterIdentifier"`
	// The Amazon Resource Name (ARN) for the IAM role that was set as default for the cluster when the cluster was created.
	DefaultIamRoleArn pulumi.StringOutput `pulumi:"defaultIamRoleArn"`
	// A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
	IamRoleArns pulumi.StringArrayOutput `pulumi:"iamRoleArns"`
}

// NewClusterIamRoles registers a new resource with the given unique name, arguments, and options.
func NewClusterIamRoles(ctx *pulumi.Context,
	name string, args *ClusterIamRolesArgs, opts ...pulumi.ResourceOption) (*ClusterIamRoles, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'ClusterIdentifier'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ClusterIamRoles
	err := ctx.RegisterResource("aws:redshift/clusterIamRoles:ClusterIamRoles", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterIamRoles gets an existing ClusterIamRoles resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterIamRoles(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterIamRolesState, opts ...pulumi.ResourceOption) (*ClusterIamRoles, error) {
	var resource ClusterIamRoles
	err := ctx.ReadResource("aws:redshift/clusterIamRoles:ClusterIamRoles", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterIamRoles resources.
type clusterIamRolesState struct {
	// The name of the Redshift Cluster IAM Roles.
	ClusterIdentifier *string `pulumi:"clusterIdentifier"`
	// The Amazon Resource Name (ARN) for the IAM role that was set as default for the cluster when the cluster was created.
	DefaultIamRoleArn *string `pulumi:"defaultIamRoleArn"`
	// A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
	IamRoleArns []string `pulumi:"iamRoleArns"`
}

type ClusterIamRolesState struct {
	// The name of the Redshift Cluster IAM Roles.
	ClusterIdentifier pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) for the IAM role that was set as default for the cluster when the cluster was created.
	DefaultIamRoleArn pulumi.StringPtrInput
	// A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
	IamRoleArns pulumi.StringArrayInput
}

func (ClusterIamRolesState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterIamRolesState)(nil)).Elem()
}

type clusterIamRolesArgs struct {
	// The name of the Redshift Cluster IAM Roles.
	ClusterIdentifier string `pulumi:"clusterIdentifier"`
	// The Amazon Resource Name (ARN) for the IAM role that was set as default for the cluster when the cluster was created.
	DefaultIamRoleArn *string `pulumi:"defaultIamRoleArn"`
	// A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
	IamRoleArns []string `pulumi:"iamRoleArns"`
}

// The set of arguments for constructing a ClusterIamRoles resource.
type ClusterIamRolesArgs struct {
	// The name of the Redshift Cluster IAM Roles.
	ClusterIdentifier pulumi.StringInput
	// The Amazon Resource Name (ARN) for the IAM role that was set as default for the cluster when the cluster was created.
	DefaultIamRoleArn pulumi.StringPtrInput
	// A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
	IamRoleArns pulumi.StringArrayInput
}

func (ClusterIamRolesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterIamRolesArgs)(nil)).Elem()
}

type ClusterIamRolesInput interface {
	pulumi.Input

	ToClusterIamRolesOutput() ClusterIamRolesOutput
	ToClusterIamRolesOutputWithContext(ctx context.Context) ClusterIamRolesOutput
}

func (*ClusterIamRoles) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterIamRoles)(nil)).Elem()
}

func (i *ClusterIamRoles) ToClusterIamRolesOutput() ClusterIamRolesOutput {
	return i.ToClusterIamRolesOutputWithContext(context.Background())
}

func (i *ClusterIamRoles) ToClusterIamRolesOutputWithContext(ctx context.Context) ClusterIamRolesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterIamRolesOutput)
}

// ClusterIamRolesArrayInput is an input type that accepts ClusterIamRolesArray and ClusterIamRolesArrayOutput values.
// You can construct a concrete instance of `ClusterIamRolesArrayInput` via:
//
//	ClusterIamRolesArray{ ClusterIamRolesArgs{...} }
type ClusterIamRolesArrayInput interface {
	pulumi.Input

	ToClusterIamRolesArrayOutput() ClusterIamRolesArrayOutput
	ToClusterIamRolesArrayOutputWithContext(context.Context) ClusterIamRolesArrayOutput
}

type ClusterIamRolesArray []ClusterIamRolesInput

func (ClusterIamRolesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterIamRoles)(nil)).Elem()
}

func (i ClusterIamRolesArray) ToClusterIamRolesArrayOutput() ClusterIamRolesArrayOutput {
	return i.ToClusterIamRolesArrayOutputWithContext(context.Background())
}

func (i ClusterIamRolesArray) ToClusterIamRolesArrayOutputWithContext(ctx context.Context) ClusterIamRolesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterIamRolesArrayOutput)
}

// ClusterIamRolesMapInput is an input type that accepts ClusterIamRolesMap and ClusterIamRolesMapOutput values.
// You can construct a concrete instance of `ClusterIamRolesMapInput` via:
//
//	ClusterIamRolesMap{ "key": ClusterIamRolesArgs{...} }
type ClusterIamRolesMapInput interface {
	pulumi.Input

	ToClusterIamRolesMapOutput() ClusterIamRolesMapOutput
	ToClusterIamRolesMapOutputWithContext(context.Context) ClusterIamRolesMapOutput
}

type ClusterIamRolesMap map[string]ClusterIamRolesInput

func (ClusterIamRolesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterIamRoles)(nil)).Elem()
}

func (i ClusterIamRolesMap) ToClusterIamRolesMapOutput() ClusterIamRolesMapOutput {
	return i.ToClusterIamRolesMapOutputWithContext(context.Background())
}

func (i ClusterIamRolesMap) ToClusterIamRolesMapOutputWithContext(ctx context.Context) ClusterIamRolesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterIamRolesMapOutput)
}

type ClusterIamRolesOutput struct{ *pulumi.OutputState }

func (ClusterIamRolesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterIamRoles)(nil)).Elem()
}

func (o ClusterIamRolesOutput) ToClusterIamRolesOutput() ClusterIamRolesOutput {
	return o
}

func (o ClusterIamRolesOutput) ToClusterIamRolesOutputWithContext(ctx context.Context) ClusterIamRolesOutput {
	return o
}

// The name of the Redshift Cluster IAM Roles.
func (o ClusterIamRolesOutput) ClusterIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterIamRoles) pulumi.StringOutput { return v.ClusterIdentifier }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) for the IAM role that was set as default for the cluster when the cluster was created.
func (o ClusterIamRolesOutput) DefaultIamRoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterIamRoles) pulumi.StringOutput { return v.DefaultIamRoleArn }).(pulumi.StringOutput)
}

// A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
func (o ClusterIamRolesOutput) IamRoleArns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ClusterIamRoles) pulumi.StringArrayOutput { return v.IamRoleArns }).(pulumi.StringArrayOutput)
}

type ClusterIamRolesArrayOutput struct{ *pulumi.OutputState }

func (ClusterIamRolesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterIamRoles)(nil)).Elem()
}

func (o ClusterIamRolesArrayOutput) ToClusterIamRolesArrayOutput() ClusterIamRolesArrayOutput {
	return o
}

func (o ClusterIamRolesArrayOutput) ToClusterIamRolesArrayOutputWithContext(ctx context.Context) ClusterIamRolesArrayOutput {
	return o
}

func (o ClusterIamRolesArrayOutput) Index(i pulumi.IntInput) ClusterIamRolesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterIamRoles {
		return vs[0].([]*ClusterIamRoles)[vs[1].(int)]
	}).(ClusterIamRolesOutput)
}

type ClusterIamRolesMapOutput struct{ *pulumi.OutputState }

func (ClusterIamRolesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterIamRoles)(nil)).Elem()
}

func (o ClusterIamRolesMapOutput) ToClusterIamRolesMapOutput() ClusterIamRolesMapOutput {
	return o
}

func (o ClusterIamRolesMapOutput) ToClusterIamRolesMapOutputWithContext(ctx context.Context) ClusterIamRolesMapOutput {
	return o
}

func (o ClusterIamRolesMapOutput) MapIndex(k pulumi.StringInput) ClusterIamRolesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterIamRoles {
		return vs[0].(map[string]*ClusterIamRoles)[vs[1].(string)]
	}).(ClusterIamRolesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterIamRolesInput)(nil)).Elem(), &ClusterIamRoles{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterIamRolesArrayInput)(nil)).Elem(), ClusterIamRolesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterIamRolesMapInput)(nil)).Elem(), ClusterIamRolesMap{})
	pulumi.RegisterOutputType(ClusterIamRolesOutput{})
	pulumi.RegisterOutputType(ClusterIamRolesArrayOutput{})
	pulumi.RegisterOutputType(ClusterIamRolesMapOutput{})
}
