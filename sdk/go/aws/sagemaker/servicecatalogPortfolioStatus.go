// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sagemaker

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages status of Service Catalog in SageMaker. Service Catalog is used to create SageMaker projects.
//
// ## Example Usage
//
// Usage:
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sagemaker"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sagemaker.NewServicecatalogPortfolioStatus(ctx, "example", &sagemaker.ServicecatalogPortfolioStatusArgs{
//				Status: pulumi.String("Enabled"),
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
// Using `pulumi import`, import models using the `id`. For example:
//
// ```sh
// $ pulumi import aws:sagemaker/servicecatalogPortfolioStatus:ServicecatalogPortfolioStatus example us-east-1
// ```
type ServicecatalogPortfolioStatus struct {
	pulumi.CustomResourceState

	// Whether Service Catalog is enabled or disabled in SageMaker. Valid values are `Enabled` and `Disabled`.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewServicecatalogPortfolioStatus registers a new resource with the given unique name, arguments, and options.
func NewServicecatalogPortfolioStatus(ctx *pulumi.Context,
	name string, args *ServicecatalogPortfolioStatusArgs, opts ...pulumi.ResourceOption) (*ServicecatalogPortfolioStatus, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Status == nil {
		return nil, errors.New("invalid value for required argument 'Status'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServicecatalogPortfolioStatus
	err := ctx.RegisterResource("aws:sagemaker/servicecatalogPortfolioStatus:ServicecatalogPortfolioStatus", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServicecatalogPortfolioStatus gets an existing ServicecatalogPortfolioStatus resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServicecatalogPortfolioStatus(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServicecatalogPortfolioStatusState, opts ...pulumi.ResourceOption) (*ServicecatalogPortfolioStatus, error) {
	var resource ServicecatalogPortfolioStatus
	err := ctx.ReadResource("aws:sagemaker/servicecatalogPortfolioStatus:ServicecatalogPortfolioStatus", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServicecatalogPortfolioStatus resources.
type servicecatalogPortfolioStatusState struct {
	// Whether Service Catalog is enabled or disabled in SageMaker. Valid values are `Enabled` and `Disabled`.
	Status *string `pulumi:"status"`
}

type ServicecatalogPortfolioStatusState struct {
	// Whether Service Catalog is enabled or disabled in SageMaker. Valid values are `Enabled` and `Disabled`.
	Status pulumi.StringPtrInput
}

func (ServicecatalogPortfolioStatusState) ElementType() reflect.Type {
	return reflect.TypeOf((*servicecatalogPortfolioStatusState)(nil)).Elem()
}

type servicecatalogPortfolioStatusArgs struct {
	// Whether Service Catalog is enabled or disabled in SageMaker. Valid values are `Enabled` and `Disabled`.
	Status string `pulumi:"status"`
}

// The set of arguments for constructing a ServicecatalogPortfolioStatus resource.
type ServicecatalogPortfolioStatusArgs struct {
	// Whether Service Catalog is enabled or disabled in SageMaker. Valid values are `Enabled` and `Disabled`.
	Status pulumi.StringInput
}

func (ServicecatalogPortfolioStatusArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*servicecatalogPortfolioStatusArgs)(nil)).Elem()
}

type ServicecatalogPortfolioStatusInput interface {
	pulumi.Input

	ToServicecatalogPortfolioStatusOutput() ServicecatalogPortfolioStatusOutput
	ToServicecatalogPortfolioStatusOutputWithContext(ctx context.Context) ServicecatalogPortfolioStatusOutput
}

func (*ServicecatalogPortfolioStatus) ElementType() reflect.Type {
	return reflect.TypeOf((**ServicecatalogPortfolioStatus)(nil)).Elem()
}

func (i *ServicecatalogPortfolioStatus) ToServicecatalogPortfolioStatusOutput() ServicecatalogPortfolioStatusOutput {
	return i.ToServicecatalogPortfolioStatusOutputWithContext(context.Background())
}

func (i *ServicecatalogPortfolioStatus) ToServicecatalogPortfolioStatusOutputWithContext(ctx context.Context) ServicecatalogPortfolioStatusOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicecatalogPortfolioStatusOutput)
}

// ServicecatalogPortfolioStatusArrayInput is an input type that accepts ServicecatalogPortfolioStatusArray and ServicecatalogPortfolioStatusArrayOutput values.
// You can construct a concrete instance of `ServicecatalogPortfolioStatusArrayInput` via:
//
//	ServicecatalogPortfolioStatusArray{ ServicecatalogPortfolioStatusArgs{...} }
type ServicecatalogPortfolioStatusArrayInput interface {
	pulumi.Input

	ToServicecatalogPortfolioStatusArrayOutput() ServicecatalogPortfolioStatusArrayOutput
	ToServicecatalogPortfolioStatusArrayOutputWithContext(context.Context) ServicecatalogPortfolioStatusArrayOutput
}

type ServicecatalogPortfolioStatusArray []ServicecatalogPortfolioStatusInput

func (ServicecatalogPortfolioStatusArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServicecatalogPortfolioStatus)(nil)).Elem()
}

func (i ServicecatalogPortfolioStatusArray) ToServicecatalogPortfolioStatusArrayOutput() ServicecatalogPortfolioStatusArrayOutput {
	return i.ToServicecatalogPortfolioStatusArrayOutputWithContext(context.Background())
}

func (i ServicecatalogPortfolioStatusArray) ToServicecatalogPortfolioStatusArrayOutputWithContext(ctx context.Context) ServicecatalogPortfolioStatusArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicecatalogPortfolioStatusArrayOutput)
}

// ServicecatalogPortfolioStatusMapInput is an input type that accepts ServicecatalogPortfolioStatusMap and ServicecatalogPortfolioStatusMapOutput values.
// You can construct a concrete instance of `ServicecatalogPortfolioStatusMapInput` via:
//
//	ServicecatalogPortfolioStatusMap{ "key": ServicecatalogPortfolioStatusArgs{...} }
type ServicecatalogPortfolioStatusMapInput interface {
	pulumi.Input

	ToServicecatalogPortfolioStatusMapOutput() ServicecatalogPortfolioStatusMapOutput
	ToServicecatalogPortfolioStatusMapOutputWithContext(context.Context) ServicecatalogPortfolioStatusMapOutput
}

type ServicecatalogPortfolioStatusMap map[string]ServicecatalogPortfolioStatusInput

func (ServicecatalogPortfolioStatusMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServicecatalogPortfolioStatus)(nil)).Elem()
}

func (i ServicecatalogPortfolioStatusMap) ToServicecatalogPortfolioStatusMapOutput() ServicecatalogPortfolioStatusMapOutput {
	return i.ToServicecatalogPortfolioStatusMapOutputWithContext(context.Background())
}

func (i ServicecatalogPortfolioStatusMap) ToServicecatalogPortfolioStatusMapOutputWithContext(ctx context.Context) ServicecatalogPortfolioStatusMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicecatalogPortfolioStatusMapOutput)
}

type ServicecatalogPortfolioStatusOutput struct{ *pulumi.OutputState }

func (ServicecatalogPortfolioStatusOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServicecatalogPortfolioStatus)(nil)).Elem()
}

func (o ServicecatalogPortfolioStatusOutput) ToServicecatalogPortfolioStatusOutput() ServicecatalogPortfolioStatusOutput {
	return o
}

func (o ServicecatalogPortfolioStatusOutput) ToServicecatalogPortfolioStatusOutputWithContext(ctx context.Context) ServicecatalogPortfolioStatusOutput {
	return o
}

// Whether Service Catalog is enabled or disabled in SageMaker. Valid values are `Enabled` and `Disabled`.
func (o ServicecatalogPortfolioStatusOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ServicecatalogPortfolioStatus) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type ServicecatalogPortfolioStatusArrayOutput struct{ *pulumi.OutputState }

func (ServicecatalogPortfolioStatusArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServicecatalogPortfolioStatus)(nil)).Elem()
}

func (o ServicecatalogPortfolioStatusArrayOutput) ToServicecatalogPortfolioStatusArrayOutput() ServicecatalogPortfolioStatusArrayOutput {
	return o
}

func (o ServicecatalogPortfolioStatusArrayOutput) ToServicecatalogPortfolioStatusArrayOutputWithContext(ctx context.Context) ServicecatalogPortfolioStatusArrayOutput {
	return o
}

func (o ServicecatalogPortfolioStatusArrayOutput) Index(i pulumi.IntInput) ServicecatalogPortfolioStatusOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServicecatalogPortfolioStatus {
		return vs[0].([]*ServicecatalogPortfolioStatus)[vs[1].(int)]
	}).(ServicecatalogPortfolioStatusOutput)
}

type ServicecatalogPortfolioStatusMapOutput struct{ *pulumi.OutputState }

func (ServicecatalogPortfolioStatusMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServicecatalogPortfolioStatus)(nil)).Elem()
}

func (o ServicecatalogPortfolioStatusMapOutput) ToServicecatalogPortfolioStatusMapOutput() ServicecatalogPortfolioStatusMapOutput {
	return o
}

func (o ServicecatalogPortfolioStatusMapOutput) ToServicecatalogPortfolioStatusMapOutputWithContext(ctx context.Context) ServicecatalogPortfolioStatusMapOutput {
	return o
}

func (o ServicecatalogPortfolioStatusMapOutput) MapIndex(k pulumi.StringInput) ServicecatalogPortfolioStatusOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServicecatalogPortfolioStatus {
		return vs[0].(map[string]*ServicecatalogPortfolioStatus)[vs[1].(string)]
	}).(ServicecatalogPortfolioStatusOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServicecatalogPortfolioStatusInput)(nil)).Elem(), &ServicecatalogPortfolioStatus{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServicecatalogPortfolioStatusArrayInput)(nil)).Elem(), ServicecatalogPortfolioStatusArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServicecatalogPortfolioStatusMapInput)(nil)).Elem(), ServicecatalogPortfolioStatusMap{})
	pulumi.RegisterOutputType(ServicecatalogPortfolioStatusOutput{})
	pulumi.RegisterOutputType(ServicecatalogPortfolioStatusArrayOutput{})
	pulumi.RegisterOutputType(ServicecatalogPortfolioStatusMapOutput{})
}
