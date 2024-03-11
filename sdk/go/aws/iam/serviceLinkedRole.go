// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iam

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an [IAM service-linked role](https://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html).
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iam.NewServiceLinkedRole(ctx, "elasticbeanstalk", &iam.ServiceLinkedRoleArgs{
//				AwsServiceName: pulumi.String("elasticbeanstalk.amazonaws.com"),
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
// Using `pulumi import`, import IAM service-linked roles using role ARN. For example:
//
// ```sh
// $ pulumi import aws:iam/serviceLinkedRole:ServiceLinkedRole elasticbeanstalk arn:aws:iam::123456789012:role/aws-service-role/elasticbeanstalk.amazonaws.com/AWSServiceRoleForElasticBeanstalk
// ```
type ServiceLinkedRole struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) specifying the role.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
	AwsServiceName pulumi.StringOutput `pulumi:"awsServiceName"`
	// The creation date of the IAM role.
	CreateDate pulumi.StringOutput `pulumi:"createDate"`
	// Additional string appended to the role name. Not all AWS services support custom suffixes.
	CustomSuffix pulumi.StringPtrOutput `pulumi:"customSuffix"`
	// The description of the role.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the role.
	Name pulumi.StringOutput `pulumi:"name"`
	// The path of the role.
	Path pulumi.StringOutput `pulumi:"path"`
	// Key-value mapping of tags for the IAM role. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The stable and unique string identifying the role.
	UniqueId pulumi.StringOutput `pulumi:"uniqueId"`
}

// NewServiceLinkedRole registers a new resource with the given unique name, arguments, and options.
func NewServiceLinkedRole(ctx *pulumi.Context,
	name string, args *ServiceLinkedRoleArgs, opts ...pulumi.ResourceOption) (*ServiceLinkedRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AwsServiceName == nil {
		return nil, errors.New("invalid value for required argument 'AwsServiceName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceLinkedRole
	err := ctx.RegisterResource("aws:iam/serviceLinkedRole:ServiceLinkedRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceLinkedRole gets an existing ServiceLinkedRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceLinkedRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceLinkedRoleState, opts ...pulumi.ResourceOption) (*ServiceLinkedRole, error) {
	var resource ServiceLinkedRole
	err := ctx.ReadResource("aws:iam/serviceLinkedRole:ServiceLinkedRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceLinkedRole resources.
type serviceLinkedRoleState struct {
	// The Amazon Resource Name (ARN) specifying the role.
	Arn *string `pulumi:"arn"`
	// The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
	AwsServiceName *string `pulumi:"awsServiceName"`
	// The creation date of the IAM role.
	CreateDate *string `pulumi:"createDate"`
	// Additional string appended to the role name. Not all AWS services support custom suffixes.
	CustomSuffix *string `pulumi:"customSuffix"`
	// The description of the role.
	Description *string `pulumi:"description"`
	// The name of the role.
	Name *string `pulumi:"name"`
	// The path of the role.
	Path *string `pulumi:"path"`
	// Key-value mapping of tags for the IAM role. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The stable and unique string identifying the role.
	UniqueId *string `pulumi:"uniqueId"`
}

type ServiceLinkedRoleState struct {
	// The Amazon Resource Name (ARN) specifying the role.
	Arn pulumi.StringPtrInput
	// The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
	AwsServiceName pulumi.StringPtrInput
	// The creation date of the IAM role.
	CreateDate pulumi.StringPtrInput
	// Additional string appended to the role name. Not all AWS services support custom suffixes.
	CustomSuffix pulumi.StringPtrInput
	// The description of the role.
	Description pulumi.StringPtrInput
	// The name of the role.
	Name pulumi.StringPtrInput
	// The path of the role.
	Path pulumi.StringPtrInput
	// Key-value mapping of tags for the IAM role. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The stable and unique string identifying the role.
	UniqueId pulumi.StringPtrInput
}

func (ServiceLinkedRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceLinkedRoleState)(nil)).Elem()
}

type serviceLinkedRoleArgs struct {
	// The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
	AwsServiceName string `pulumi:"awsServiceName"`
	// Additional string appended to the role name. Not all AWS services support custom suffixes.
	CustomSuffix *string `pulumi:"customSuffix"`
	// The description of the role.
	Description *string `pulumi:"description"`
	// Key-value mapping of tags for the IAM role. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ServiceLinkedRole resource.
type ServiceLinkedRoleArgs struct {
	// The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
	AwsServiceName pulumi.StringInput
	// Additional string appended to the role name. Not all AWS services support custom suffixes.
	CustomSuffix pulumi.StringPtrInput
	// The description of the role.
	Description pulumi.StringPtrInput
	// Key-value mapping of tags for the IAM role. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ServiceLinkedRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceLinkedRoleArgs)(nil)).Elem()
}

type ServiceLinkedRoleInput interface {
	pulumi.Input

	ToServiceLinkedRoleOutput() ServiceLinkedRoleOutput
	ToServiceLinkedRoleOutputWithContext(ctx context.Context) ServiceLinkedRoleOutput
}

func (*ServiceLinkedRole) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceLinkedRole)(nil)).Elem()
}

func (i *ServiceLinkedRole) ToServiceLinkedRoleOutput() ServiceLinkedRoleOutput {
	return i.ToServiceLinkedRoleOutputWithContext(context.Background())
}

func (i *ServiceLinkedRole) ToServiceLinkedRoleOutputWithContext(ctx context.Context) ServiceLinkedRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceLinkedRoleOutput)
}

// ServiceLinkedRoleArrayInput is an input type that accepts ServiceLinkedRoleArray and ServiceLinkedRoleArrayOutput values.
// You can construct a concrete instance of `ServiceLinkedRoleArrayInput` via:
//
//	ServiceLinkedRoleArray{ ServiceLinkedRoleArgs{...} }
type ServiceLinkedRoleArrayInput interface {
	pulumi.Input

	ToServiceLinkedRoleArrayOutput() ServiceLinkedRoleArrayOutput
	ToServiceLinkedRoleArrayOutputWithContext(context.Context) ServiceLinkedRoleArrayOutput
}

type ServiceLinkedRoleArray []ServiceLinkedRoleInput

func (ServiceLinkedRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceLinkedRole)(nil)).Elem()
}

func (i ServiceLinkedRoleArray) ToServiceLinkedRoleArrayOutput() ServiceLinkedRoleArrayOutput {
	return i.ToServiceLinkedRoleArrayOutputWithContext(context.Background())
}

func (i ServiceLinkedRoleArray) ToServiceLinkedRoleArrayOutputWithContext(ctx context.Context) ServiceLinkedRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceLinkedRoleArrayOutput)
}

// ServiceLinkedRoleMapInput is an input type that accepts ServiceLinkedRoleMap and ServiceLinkedRoleMapOutput values.
// You can construct a concrete instance of `ServiceLinkedRoleMapInput` via:
//
//	ServiceLinkedRoleMap{ "key": ServiceLinkedRoleArgs{...} }
type ServiceLinkedRoleMapInput interface {
	pulumi.Input

	ToServiceLinkedRoleMapOutput() ServiceLinkedRoleMapOutput
	ToServiceLinkedRoleMapOutputWithContext(context.Context) ServiceLinkedRoleMapOutput
}

type ServiceLinkedRoleMap map[string]ServiceLinkedRoleInput

func (ServiceLinkedRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceLinkedRole)(nil)).Elem()
}

func (i ServiceLinkedRoleMap) ToServiceLinkedRoleMapOutput() ServiceLinkedRoleMapOutput {
	return i.ToServiceLinkedRoleMapOutputWithContext(context.Background())
}

func (i ServiceLinkedRoleMap) ToServiceLinkedRoleMapOutputWithContext(ctx context.Context) ServiceLinkedRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceLinkedRoleMapOutput)
}

type ServiceLinkedRoleOutput struct{ *pulumi.OutputState }

func (ServiceLinkedRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceLinkedRole)(nil)).Elem()
}

func (o ServiceLinkedRoleOutput) ToServiceLinkedRoleOutput() ServiceLinkedRoleOutput {
	return o
}

func (o ServiceLinkedRoleOutput) ToServiceLinkedRoleOutputWithContext(ctx context.Context) ServiceLinkedRoleOutput {
	return o
}

// The Amazon Resource Name (ARN) specifying the role.
func (o ServiceLinkedRoleOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceLinkedRole) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
func (o ServiceLinkedRoleOutput) AwsServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceLinkedRole) pulumi.StringOutput { return v.AwsServiceName }).(pulumi.StringOutput)
}

// The creation date of the IAM role.
func (o ServiceLinkedRoleOutput) CreateDate() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceLinkedRole) pulumi.StringOutput { return v.CreateDate }).(pulumi.StringOutput)
}

// Additional string appended to the role name. Not all AWS services support custom suffixes.
func (o ServiceLinkedRoleOutput) CustomSuffix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceLinkedRole) pulumi.StringPtrOutput { return v.CustomSuffix }).(pulumi.StringPtrOutput)
}

// The description of the role.
func (o ServiceLinkedRoleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceLinkedRole) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the role.
func (o ServiceLinkedRoleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceLinkedRole) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The path of the role.
func (o ServiceLinkedRoleOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceLinkedRole) pulumi.StringOutput { return v.Path }).(pulumi.StringOutput)
}

// Key-value mapping of tags for the IAM role. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ServiceLinkedRoleOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ServiceLinkedRole) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ServiceLinkedRoleOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ServiceLinkedRole) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The stable and unique string identifying the role.
func (o ServiceLinkedRoleOutput) UniqueId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceLinkedRole) pulumi.StringOutput { return v.UniqueId }).(pulumi.StringOutput)
}

type ServiceLinkedRoleArrayOutput struct{ *pulumi.OutputState }

func (ServiceLinkedRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceLinkedRole)(nil)).Elem()
}

func (o ServiceLinkedRoleArrayOutput) ToServiceLinkedRoleArrayOutput() ServiceLinkedRoleArrayOutput {
	return o
}

func (o ServiceLinkedRoleArrayOutput) ToServiceLinkedRoleArrayOutputWithContext(ctx context.Context) ServiceLinkedRoleArrayOutput {
	return o
}

func (o ServiceLinkedRoleArrayOutput) Index(i pulumi.IntInput) ServiceLinkedRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceLinkedRole {
		return vs[0].([]*ServiceLinkedRole)[vs[1].(int)]
	}).(ServiceLinkedRoleOutput)
}

type ServiceLinkedRoleMapOutput struct{ *pulumi.OutputState }

func (ServiceLinkedRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceLinkedRole)(nil)).Elem()
}

func (o ServiceLinkedRoleMapOutput) ToServiceLinkedRoleMapOutput() ServiceLinkedRoleMapOutput {
	return o
}

func (o ServiceLinkedRoleMapOutput) ToServiceLinkedRoleMapOutputWithContext(ctx context.Context) ServiceLinkedRoleMapOutput {
	return o
}

func (o ServiceLinkedRoleMapOutput) MapIndex(k pulumi.StringInput) ServiceLinkedRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceLinkedRole {
		return vs[0].(map[string]*ServiceLinkedRole)[vs[1].(string)]
	}).(ServiceLinkedRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceLinkedRoleInput)(nil)).Elem(), &ServiceLinkedRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceLinkedRoleArrayInput)(nil)).Elem(), ServiceLinkedRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceLinkedRoleMapInput)(nil)).Elem(), ServiceLinkedRoleMap{})
	pulumi.RegisterOutputType(ServiceLinkedRoleOutput{})
	pulumi.RegisterOutputType(ServiceLinkedRoleArrayOutput{})
	pulumi.RegisterOutputType(ServiceLinkedRoleMapOutput{})
}
