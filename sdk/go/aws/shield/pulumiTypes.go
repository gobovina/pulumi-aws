// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package shield

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type ApplicationLayerAutomaticResponseTimeouts struct {
	// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
	Create *string `pulumi:"create"`
	// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
	Delete *string `pulumi:"delete"`
	// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
	Update *string `pulumi:"update"`
}

// ApplicationLayerAutomaticResponseTimeoutsInput is an input type that accepts ApplicationLayerAutomaticResponseTimeoutsArgs and ApplicationLayerAutomaticResponseTimeoutsOutput values.
// You can construct a concrete instance of `ApplicationLayerAutomaticResponseTimeoutsInput` via:
//
//	ApplicationLayerAutomaticResponseTimeoutsArgs{...}
type ApplicationLayerAutomaticResponseTimeoutsInput interface {
	pulumi.Input

	ToApplicationLayerAutomaticResponseTimeoutsOutput() ApplicationLayerAutomaticResponseTimeoutsOutput
	ToApplicationLayerAutomaticResponseTimeoutsOutputWithContext(context.Context) ApplicationLayerAutomaticResponseTimeoutsOutput
}

type ApplicationLayerAutomaticResponseTimeoutsArgs struct {
	// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
	Create pulumi.StringPtrInput `pulumi:"create"`
	// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
	Delete pulumi.StringPtrInput `pulumi:"delete"`
	// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
	Update pulumi.StringPtrInput `pulumi:"update"`
}

func (ApplicationLayerAutomaticResponseTimeoutsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ApplicationLayerAutomaticResponseTimeouts)(nil)).Elem()
}

func (i ApplicationLayerAutomaticResponseTimeoutsArgs) ToApplicationLayerAutomaticResponseTimeoutsOutput() ApplicationLayerAutomaticResponseTimeoutsOutput {
	return i.ToApplicationLayerAutomaticResponseTimeoutsOutputWithContext(context.Background())
}

func (i ApplicationLayerAutomaticResponseTimeoutsArgs) ToApplicationLayerAutomaticResponseTimeoutsOutputWithContext(ctx context.Context) ApplicationLayerAutomaticResponseTimeoutsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationLayerAutomaticResponseTimeoutsOutput)
}

func (i ApplicationLayerAutomaticResponseTimeoutsArgs) ToApplicationLayerAutomaticResponseTimeoutsPtrOutput() ApplicationLayerAutomaticResponseTimeoutsPtrOutput {
	return i.ToApplicationLayerAutomaticResponseTimeoutsPtrOutputWithContext(context.Background())
}

func (i ApplicationLayerAutomaticResponseTimeoutsArgs) ToApplicationLayerAutomaticResponseTimeoutsPtrOutputWithContext(ctx context.Context) ApplicationLayerAutomaticResponseTimeoutsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationLayerAutomaticResponseTimeoutsOutput).ToApplicationLayerAutomaticResponseTimeoutsPtrOutputWithContext(ctx)
}

// ApplicationLayerAutomaticResponseTimeoutsPtrInput is an input type that accepts ApplicationLayerAutomaticResponseTimeoutsArgs, ApplicationLayerAutomaticResponseTimeoutsPtr and ApplicationLayerAutomaticResponseTimeoutsPtrOutput values.
// You can construct a concrete instance of `ApplicationLayerAutomaticResponseTimeoutsPtrInput` via:
//
//	        ApplicationLayerAutomaticResponseTimeoutsArgs{...}
//
//	or:
//
//	        nil
type ApplicationLayerAutomaticResponseTimeoutsPtrInput interface {
	pulumi.Input

	ToApplicationLayerAutomaticResponseTimeoutsPtrOutput() ApplicationLayerAutomaticResponseTimeoutsPtrOutput
	ToApplicationLayerAutomaticResponseTimeoutsPtrOutputWithContext(context.Context) ApplicationLayerAutomaticResponseTimeoutsPtrOutput
}

type applicationLayerAutomaticResponseTimeoutsPtrType ApplicationLayerAutomaticResponseTimeoutsArgs

func ApplicationLayerAutomaticResponseTimeoutsPtr(v *ApplicationLayerAutomaticResponseTimeoutsArgs) ApplicationLayerAutomaticResponseTimeoutsPtrInput {
	return (*applicationLayerAutomaticResponseTimeoutsPtrType)(v)
}

func (*applicationLayerAutomaticResponseTimeoutsPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationLayerAutomaticResponseTimeouts)(nil)).Elem()
}

func (i *applicationLayerAutomaticResponseTimeoutsPtrType) ToApplicationLayerAutomaticResponseTimeoutsPtrOutput() ApplicationLayerAutomaticResponseTimeoutsPtrOutput {
	return i.ToApplicationLayerAutomaticResponseTimeoutsPtrOutputWithContext(context.Background())
}

func (i *applicationLayerAutomaticResponseTimeoutsPtrType) ToApplicationLayerAutomaticResponseTimeoutsPtrOutputWithContext(ctx context.Context) ApplicationLayerAutomaticResponseTimeoutsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationLayerAutomaticResponseTimeoutsPtrOutput)
}

type ApplicationLayerAutomaticResponseTimeoutsOutput struct{ *pulumi.OutputState }

func (ApplicationLayerAutomaticResponseTimeoutsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ApplicationLayerAutomaticResponseTimeouts)(nil)).Elem()
}

func (o ApplicationLayerAutomaticResponseTimeoutsOutput) ToApplicationLayerAutomaticResponseTimeoutsOutput() ApplicationLayerAutomaticResponseTimeoutsOutput {
	return o
}

func (o ApplicationLayerAutomaticResponseTimeoutsOutput) ToApplicationLayerAutomaticResponseTimeoutsOutputWithContext(ctx context.Context) ApplicationLayerAutomaticResponseTimeoutsOutput {
	return o
}

func (o ApplicationLayerAutomaticResponseTimeoutsOutput) ToApplicationLayerAutomaticResponseTimeoutsPtrOutput() ApplicationLayerAutomaticResponseTimeoutsPtrOutput {
	return o.ToApplicationLayerAutomaticResponseTimeoutsPtrOutputWithContext(context.Background())
}

func (o ApplicationLayerAutomaticResponseTimeoutsOutput) ToApplicationLayerAutomaticResponseTimeoutsPtrOutputWithContext(ctx context.Context) ApplicationLayerAutomaticResponseTimeoutsPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ApplicationLayerAutomaticResponseTimeouts) *ApplicationLayerAutomaticResponseTimeouts {
		return &v
	}).(ApplicationLayerAutomaticResponseTimeoutsPtrOutput)
}

// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
func (o ApplicationLayerAutomaticResponseTimeoutsOutput) Create() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ApplicationLayerAutomaticResponseTimeouts) *string { return v.Create }).(pulumi.StringPtrOutput)
}

// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
func (o ApplicationLayerAutomaticResponseTimeoutsOutput) Delete() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ApplicationLayerAutomaticResponseTimeouts) *string { return v.Delete }).(pulumi.StringPtrOutput)
}

// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
func (o ApplicationLayerAutomaticResponseTimeoutsOutput) Update() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ApplicationLayerAutomaticResponseTimeouts) *string { return v.Update }).(pulumi.StringPtrOutput)
}

type ApplicationLayerAutomaticResponseTimeoutsPtrOutput struct{ *pulumi.OutputState }

func (ApplicationLayerAutomaticResponseTimeoutsPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationLayerAutomaticResponseTimeouts)(nil)).Elem()
}

func (o ApplicationLayerAutomaticResponseTimeoutsPtrOutput) ToApplicationLayerAutomaticResponseTimeoutsPtrOutput() ApplicationLayerAutomaticResponseTimeoutsPtrOutput {
	return o
}

func (o ApplicationLayerAutomaticResponseTimeoutsPtrOutput) ToApplicationLayerAutomaticResponseTimeoutsPtrOutputWithContext(ctx context.Context) ApplicationLayerAutomaticResponseTimeoutsPtrOutput {
	return o
}

func (o ApplicationLayerAutomaticResponseTimeoutsPtrOutput) Elem() ApplicationLayerAutomaticResponseTimeoutsOutput {
	return o.ApplyT(func(v *ApplicationLayerAutomaticResponseTimeouts) ApplicationLayerAutomaticResponseTimeouts {
		if v != nil {
			return *v
		}
		var ret ApplicationLayerAutomaticResponseTimeouts
		return ret
	}).(ApplicationLayerAutomaticResponseTimeoutsOutput)
}

// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
func (o ApplicationLayerAutomaticResponseTimeoutsPtrOutput) Create() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApplicationLayerAutomaticResponseTimeouts) *string {
		if v == nil {
			return nil
		}
		return v.Create
	}).(pulumi.StringPtrOutput)
}

// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
func (o ApplicationLayerAutomaticResponseTimeoutsPtrOutput) Delete() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApplicationLayerAutomaticResponseTimeouts) *string {
		if v == nil {
			return nil
		}
		return v.Delete
	}).(pulumi.StringPtrOutput)
}

// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
func (o ApplicationLayerAutomaticResponseTimeoutsPtrOutput) Update() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApplicationLayerAutomaticResponseTimeouts) *string {
		if v == nil {
			return nil
		}
		return v.Update
	}).(pulumi.StringPtrOutput)
}

type DrtAccessLogBucketAssociationTimeouts struct {
	// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
	Create *string `pulumi:"create"`
	// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
	Delete *string `pulumi:"delete"`
}

// DrtAccessLogBucketAssociationTimeoutsInput is an input type that accepts DrtAccessLogBucketAssociationTimeoutsArgs and DrtAccessLogBucketAssociationTimeoutsOutput values.
// You can construct a concrete instance of `DrtAccessLogBucketAssociationTimeoutsInput` via:
//
//	DrtAccessLogBucketAssociationTimeoutsArgs{...}
type DrtAccessLogBucketAssociationTimeoutsInput interface {
	pulumi.Input

	ToDrtAccessLogBucketAssociationTimeoutsOutput() DrtAccessLogBucketAssociationTimeoutsOutput
	ToDrtAccessLogBucketAssociationTimeoutsOutputWithContext(context.Context) DrtAccessLogBucketAssociationTimeoutsOutput
}

type DrtAccessLogBucketAssociationTimeoutsArgs struct {
	// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
	Create pulumi.StringPtrInput `pulumi:"create"`
	// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
	Delete pulumi.StringPtrInput `pulumi:"delete"`
}

func (DrtAccessLogBucketAssociationTimeoutsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*DrtAccessLogBucketAssociationTimeouts)(nil)).Elem()
}

func (i DrtAccessLogBucketAssociationTimeoutsArgs) ToDrtAccessLogBucketAssociationTimeoutsOutput() DrtAccessLogBucketAssociationTimeoutsOutput {
	return i.ToDrtAccessLogBucketAssociationTimeoutsOutputWithContext(context.Background())
}

func (i DrtAccessLogBucketAssociationTimeoutsArgs) ToDrtAccessLogBucketAssociationTimeoutsOutputWithContext(ctx context.Context) DrtAccessLogBucketAssociationTimeoutsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DrtAccessLogBucketAssociationTimeoutsOutput)
}

func (i DrtAccessLogBucketAssociationTimeoutsArgs) ToDrtAccessLogBucketAssociationTimeoutsPtrOutput() DrtAccessLogBucketAssociationTimeoutsPtrOutput {
	return i.ToDrtAccessLogBucketAssociationTimeoutsPtrOutputWithContext(context.Background())
}

func (i DrtAccessLogBucketAssociationTimeoutsArgs) ToDrtAccessLogBucketAssociationTimeoutsPtrOutputWithContext(ctx context.Context) DrtAccessLogBucketAssociationTimeoutsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DrtAccessLogBucketAssociationTimeoutsOutput).ToDrtAccessLogBucketAssociationTimeoutsPtrOutputWithContext(ctx)
}

// DrtAccessLogBucketAssociationTimeoutsPtrInput is an input type that accepts DrtAccessLogBucketAssociationTimeoutsArgs, DrtAccessLogBucketAssociationTimeoutsPtr and DrtAccessLogBucketAssociationTimeoutsPtrOutput values.
// You can construct a concrete instance of `DrtAccessLogBucketAssociationTimeoutsPtrInput` via:
//
//	        DrtAccessLogBucketAssociationTimeoutsArgs{...}
//
//	or:
//
//	        nil
type DrtAccessLogBucketAssociationTimeoutsPtrInput interface {
	pulumi.Input

	ToDrtAccessLogBucketAssociationTimeoutsPtrOutput() DrtAccessLogBucketAssociationTimeoutsPtrOutput
	ToDrtAccessLogBucketAssociationTimeoutsPtrOutputWithContext(context.Context) DrtAccessLogBucketAssociationTimeoutsPtrOutput
}

type drtAccessLogBucketAssociationTimeoutsPtrType DrtAccessLogBucketAssociationTimeoutsArgs

func DrtAccessLogBucketAssociationTimeoutsPtr(v *DrtAccessLogBucketAssociationTimeoutsArgs) DrtAccessLogBucketAssociationTimeoutsPtrInput {
	return (*drtAccessLogBucketAssociationTimeoutsPtrType)(v)
}

func (*drtAccessLogBucketAssociationTimeoutsPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**DrtAccessLogBucketAssociationTimeouts)(nil)).Elem()
}

func (i *drtAccessLogBucketAssociationTimeoutsPtrType) ToDrtAccessLogBucketAssociationTimeoutsPtrOutput() DrtAccessLogBucketAssociationTimeoutsPtrOutput {
	return i.ToDrtAccessLogBucketAssociationTimeoutsPtrOutputWithContext(context.Background())
}

func (i *drtAccessLogBucketAssociationTimeoutsPtrType) ToDrtAccessLogBucketAssociationTimeoutsPtrOutputWithContext(ctx context.Context) DrtAccessLogBucketAssociationTimeoutsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DrtAccessLogBucketAssociationTimeoutsPtrOutput)
}

type DrtAccessLogBucketAssociationTimeoutsOutput struct{ *pulumi.OutputState }

func (DrtAccessLogBucketAssociationTimeoutsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DrtAccessLogBucketAssociationTimeouts)(nil)).Elem()
}

func (o DrtAccessLogBucketAssociationTimeoutsOutput) ToDrtAccessLogBucketAssociationTimeoutsOutput() DrtAccessLogBucketAssociationTimeoutsOutput {
	return o
}

func (o DrtAccessLogBucketAssociationTimeoutsOutput) ToDrtAccessLogBucketAssociationTimeoutsOutputWithContext(ctx context.Context) DrtAccessLogBucketAssociationTimeoutsOutput {
	return o
}

func (o DrtAccessLogBucketAssociationTimeoutsOutput) ToDrtAccessLogBucketAssociationTimeoutsPtrOutput() DrtAccessLogBucketAssociationTimeoutsPtrOutput {
	return o.ToDrtAccessLogBucketAssociationTimeoutsPtrOutputWithContext(context.Background())
}

func (o DrtAccessLogBucketAssociationTimeoutsOutput) ToDrtAccessLogBucketAssociationTimeoutsPtrOutputWithContext(ctx context.Context) DrtAccessLogBucketAssociationTimeoutsPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v DrtAccessLogBucketAssociationTimeouts) *DrtAccessLogBucketAssociationTimeouts {
		return &v
	}).(DrtAccessLogBucketAssociationTimeoutsPtrOutput)
}

// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
func (o DrtAccessLogBucketAssociationTimeoutsOutput) Create() pulumi.StringPtrOutput {
	return o.ApplyT(func(v DrtAccessLogBucketAssociationTimeouts) *string { return v.Create }).(pulumi.StringPtrOutput)
}

// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
func (o DrtAccessLogBucketAssociationTimeoutsOutput) Delete() pulumi.StringPtrOutput {
	return o.ApplyT(func(v DrtAccessLogBucketAssociationTimeouts) *string { return v.Delete }).(pulumi.StringPtrOutput)
}

type DrtAccessLogBucketAssociationTimeoutsPtrOutput struct{ *pulumi.OutputState }

func (DrtAccessLogBucketAssociationTimeoutsPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DrtAccessLogBucketAssociationTimeouts)(nil)).Elem()
}

func (o DrtAccessLogBucketAssociationTimeoutsPtrOutput) ToDrtAccessLogBucketAssociationTimeoutsPtrOutput() DrtAccessLogBucketAssociationTimeoutsPtrOutput {
	return o
}

func (o DrtAccessLogBucketAssociationTimeoutsPtrOutput) ToDrtAccessLogBucketAssociationTimeoutsPtrOutputWithContext(ctx context.Context) DrtAccessLogBucketAssociationTimeoutsPtrOutput {
	return o
}

func (o DrtAccessLogBucketAssociationTimeoutsPtrOutput) Elem() DrtAccessLogBucketAssociationTimeoutsOutput {
	return o.ApplyT(func(v *DrtAccessLogBucketAssociationTimeouts) DrtAccessLogBucketAssociationTimeouts {
		if v != nil {
			return *v
		}
		var ret DrtAccessLogBucketAssociationTimeouts
		return ret
	}).(DrtAccessLogBucketAssociationTimeoutsOutput)
}

// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
func (o DrtAccessLogBucketAssociationTimeoutsPtrOutput) Create() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DrtAccessLogBucketAssociationTimeouts) *string {
		if v == nil {
			return nil
		}
		return v.Create
	}).(pulumi.StringPtrOutput)
}

// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
func (o DrtAccessLogBucketAssociationTimeoutsPtrOutput) Delete() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DrtAccessLogBucketAssociationTimeouts) *string {
		if v == nil {
			return nil
		}
		return v.Delete
	}).(pulumi.StringPtrOutput)
}

type DrtAccessRoleArnAssociationTimeouts struct {
	// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
	Create *string `pulumi:"create"`
	// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
	Delete *string `pulumi:"delete"`
	// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
	Update *string `pulumi:"update"`
}

// DrtAccessRoleArnAssociationTimeoutsInput is an input type that accepts DrtAccessRoleArnAssociationTimeoutsArgs and DrtAccessRoleArnAssociationTimeoutsOutput values.
// You can construct a concrete instance of `DrtAccessRoleArnAssociationTimeoutsInput` via:
//
//	DrtAccessRoleArnAssociationTimeoutsArgs{...}
type DrtAccessRoleArnAssociationTimeoutsInput interface {
	pulumi.Input

	ToDrtAccessRoleArnAssociationTimeoutsOutput() DrtAccessRoleArnAssociationTimeoutsOutput
	ToDrtAccessRoleArnAssociationTimeoutsOutputWithContext(context.Context) DrtAccessRoleArnAssociationTimeoutsOutput
}

type DrtAccessRoleArnAssociationTimeoutsArgs struct {
	// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
	Create pulumi.StringPtrInput `pulumi:"create"`
	// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
	Delete pulumi.StringPtrInput `pulumi:"delete"`
	// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
	Update pulumi.StringPtrInput `pulumi:"update"`
}

func (DrtAccessRoleArnAssociationTimeoutsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*DrtAccessRoleArnAssociationTimeouts)(nil)).Elem()
}

func (i DrtAccessRoleArnAssociationTimeoutsArgs) ToDrtAccessRoleArnAssociationTimeoutsOutput() DrtAccessRoleArnAssociationTimeoutsOutput {
	return i.ToDrtAccessRoleArnAssociationTimeoutsOutputWithContext(context.Background())
}

func (i DrtAccessRoleArnAssociationTimeoutsArgs) ToDrtAccessRoleArnAssociationTimeoutsOutputWithContext(ctx context.Context) DrtAccessRoleArnAssociationTimeoutsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DrtAccessRoleArnAssociationTimeoutsOutput)
}

func (i DrtAccessRoleArnAssociationTimeoutsArgs) ToDrtAccessRoleArnAssociationTimeoutsPtrOutput() DrtAccessRoleArnAssociationTimeoutsPtrOutput {
	return i.ToDrtAccessRoleArnAssociationTimeoutsPtrOutputWithContext(context.Background())
}

func (i DrtAccessRoleArnAssociationTimeoutsArgs) ToDrtAccessRoleArnAssociationTimeoutsPtrOutputWithContext(ctx context.Context) DrtAccessRoleArnAssociationTimeoutsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DrtAccessRoleArnAssociationTimeoutsOutput).ToDrtAccessRoleArnAssociationTimeoutsPtrOutputWithContext(ctx)
}

// DrtAccessRoleArnAssociationTimeoutsPtrInput is an input type that accepts DrtAccessRoleArnAssociationTimeoutsArgs, DrtAccessRoleArnAssociationTimeoutsPtr and DrtAccessRoleArnAssociationTimeoutsPtrOutput values.
// You can construct a concrete instance of `DrtAccessRoleArnAssociationTimeoutsPtrInput` via:
//
//	        DrtAccessRoleArnAssociationTimeoutsArgs{...}
//
//	or:
//
//	        nil
type DrtAccessRoleArnAssociationTimeoutsPtrInput interface {
	pulumi.Input

	ToDrtAccessRoleArnAssociationTimeoutsPtrOutput() DrtAccessRoleArnAssociationTimeoutsPtrOutput
	ToDrtAccessRoleArnAssociationTimeoutsPtrOutputWithContext(context.Context) DrtAccessRoleArnAssociationTimeoutsPtrOutput
}

type drtAccessRoleArnAssociationTimeoutsPtrType DrtAccessRoleArnAssociationTimeoutsArgs

func DrtAccessRoleArnAssociationTimeoutsPtr(v *DrtAccessRoleArnAssociationTimeoutsArgs) DrtAccessRoleArnAssociationTimeoutsPtrInput {
	return (*drtAccessRoleArnAssociationTimeoutsPtrType)(v)
}

func (*drtAccessRoleArnAssociationTimeoutsPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**DrtAccessRoleArnAssociationTimeouts)(nil)).Elem()
}

func (i *drtAccessRoleArnAssociationTimeoutsPtrType) ToDrtAccessRoleArnAssociationTimeoutsPtrOutput() DrtAccessRoleArnAssociationTimeoutsPtrOutput {
	return i.ToDrtAccessRoleArnAssociationTimeoutsPtrOutputWithContext(context.Background())
}

func (i *drtAccessRoleArnAssociationTimeoutsPtrType) ToDrtAccessRoleArnAssociationTimeoutsPtrOutputWithContext(ctx context.Context) DrtAccessRoleArnAssociationTimeoutsPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DrtAccessRoleArnAssociationTimeoutsPtrOutput)
}

type DrtAccessRoleArnAssociationTimeoutsOutput struct{ *pulumi.OutputState }

func (DrtAccessRoleArnAssociationTimeoutsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DrtAccessRoleArnAssociationTimeouts)(nil)).Elem()
}

func (o DrtAccessRoleArnAssociationTimeoutsOutput) ToDrtAccessRoleArnAssociationTimeoutsOutput() DrtAccessRoleArnAssociationTimeoutsOutput {
	return o
}

func (o DrtAccessRoleArnAssociationTimeoutsOutput) ToDrtAccessRoleArnAssociationTimeoutsOutputWithContext(ctx context.Context) DrtAccessRoleArnAssociationTimeoutsOutput {
	return o
}

func (o DrtAccessRoleArnAssociationTimeoutsOutput) ToDrtAccessRoleArnAssociationTimeoutsPtrOutput() DrtAccessRoleArnAssociationTimeoutsPtrOutput {
	return o.ToDrtAccessRoleArnAssociationTimeoutsPtrOutputWithContext(context.Background())
}

func (o DrtAccessRoleArnAssociationTimeoutsOutput) ToDrtAccessRoleArnAssociationTimeoutsPtrOutputWithContext(ctx context.Context) DrtAccessRoleArnAssociationTimeoutsPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v DrtAccessRoleArnAssociationTimeouts) *DrtAccessRoleArnAssociationTimeouts {
		return &v
	}).(DrtAccessRoleArnAssociationTimeoutsPtrOutput)
}

// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
func (o DrtAccessRoleArnAssociationTimeoutsOutput) Create() pulumi.StringPtrOutput {
	return o.ApplyT(func(v DrtAccessRoleArnAssociationTimeouts) *string { return v.Create }).(pulumi.StringPtrOutput)
}

// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
func (o DrtAccessRoleArnAssociationTimeoutsOutput) Delete() pulumi.StringPtrOutput {
	return o.ApplyT(func(v DrtAccessRoleArnAssociationTimeouts) *string { return v.Delete }).(pulumi.StringPtrOutput)
}

// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
func (o DrtAccessRoleArnAssociationTimeoutsOutput) Update() pulumi.StringPtrOutput {
	return o.ApplyT(func(v DrtAccessRoleArnAssociationTimeouts) *string { return v.Update }).(pulumi.StringPtrOutput)
}

type DrtAccessRoleArnAssociationTimeoutsPtrOutput struct{ *pulumi.OutputState }

func (DrtAccessRoleArnAssociationTimeoutsPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DrtAccessRoleArnAssociationTimeouts)(nil)).Elem()
}

func (o DrtAccessRoleArnAssociationTimeoutsPtrOutput) ToDrtAccessRoleArnAssociationTimeoutsPtrOutput() DrtAccessRoleArnAssociationTimeoutsPtrOutput {
	return o
}

func (o DrtAccessRoleArnAssociationTimeoutsPtrOutput) ToDrtAccessRoleArnAssociationTimeoutsPtrOutputWithContext(ctx context.Context) DrtAccessRoleArnAssociationTimeoutsPtrOutput {
	return o
}

func (o DrtAccessRoleArnAssociationTimeoutsPtrOutput) Elem() DrtAccessRoleArnAssociationTimeoutsOutput {
	return o.ApplyT(func(v *DrtAccessRoleArnAssociationTimeouts) DrtAccessRoleArnAssociationTimeouts {
		if v != nil {
			return *v
		}
		var ret DrtAccessRoleArnAssociationTimeouts
		return ret
	}).(DrtAccessRoleArnAssociationTimeoutsOutput)
}

// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
func (o DrtAccessRoleArnAssociationTimeoutsPtrOutput) Create() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DrtAccessRoleArnAssociationTimeouts) *string {
		if v == nil {
			return nil
		}
		return v.Create
	}).(pulumi.StringPtrOutput)
}

// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours). Setting a timeout for a Delete operation is only applicable if changes are saved into state before the destroy operation occurs.
func (o DrtAccessRoleArnAssociationTimeoutsPtrOutput) Delete() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DrtAccessRoleArnAssociationTimeouts) *string {
		if v == nil {
			return nil
		}
		return v.Delete
	}).(pulumi.StringPtrOutput)
}

// A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as "30s" or "2h45m". Valid time units are "s" (seconds), "m" (minutes), "h" (hours).
func (o DrtAccessRoleArnAssociationTimeoutsPtrOutput) Update() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DrtAccessRoleArnAssociationTimeouts) *string {
		if v == nil {
			return nil
		}
		return v.Update
	}).(pulumi.StringPtrOutput)
}

type ProactiveEngagementEmergencyContact struct {
	// Additional notes regarding the contact.
	ContactNotes *string `pulumi:"contactNotes"`
	// A valid email address that will be used for this contact.
	EmailAddress string `pulumi:"emailAddress"`
	// A phone number, starting with `+` and up to 15 digits that will be used for this contact.
	PhoneNumber *string `pulumi:"phoneNumber"`
}

// ProactiveEngagementEmergencyContactInput is an input type that accepts ProactiveEngagementEmergencyContactArgs and ProactiveEngagementEmergencyContactOutput values.
// You can construct a concrete instance of `ProactiveEngagementEmergencyContactInput` via:
//
//	ProactiveEngagementEmergencyContactArgs{...}
type ProactiveEngagementEmergencyContactInput interface {
	pulumi.Input

	ToProactiveEngagementEmergencyContactOutput() ProactiveEngagementEmergencyContactOutput
	ToProactiveEngagementEmergencyContactOutputWithContext(context.Context) ProactiveEngagementEmergencyContactOutput
}

type ProactiveEngagementEmergencyContactArgs struct {
	// Additional notes regarding the contact.
	ContactNotes pulumi.StringPtrInput `pulumi:"contactNotes"`
	// A valid email address that will be used for this contact.
	EmailAddress pulumi.StringInput `pulumi:"emailAddress"`
	// A phone number, starting with `+` and up to 15 digits that will be used for this contact.
	PhoneNumber pulumi.StringPtrInput `pulumi:"phoneNumber"`
}

func (ProactiveEngagementEmergencyContactArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ProactiveEngagementEmergencyContact)(nil)).Elem()
}

func (i ProactiveEngagementEmergencyContactArgs) ToProactiveEngagementEmergencyContactOutput() ProactiveEngagementEmergencyContactOutput {
	return i.ToProactiveEngagementEmergencyContactOutputWithContext(context.Background())
}

func (i ProactiveEngagementEmergencyContactArgs) ToProactiveEngagementEmergencyContactOutputWithContext(ctx context.Context) ProactiveEngagementEmergencyContactOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProactiveEngagementEmergencyContactOutput)
}

// ProactiveEngagementEmergencyContactArrayInput is an input type that accepts ProactiveEngagementEmergencyContactArray and ProactiveEngagementEmergencyContactArrayOutput values.
// You can construct a concrete instance of `ProactiveEngagementEmergencyContactArrayInput` via:
//
//	ProactiveEngagementEmergencyContactArray{ ProactiveEngagementEmergencyContactArgs{...} }
type ProactiveEngagementEmergencyContactArrayInput interface {
	pulumi.Input

	ToProactiveEngagementEmergencyContactArrayOutput() ProactiveEngagementEmergencyContactArrayOutput
	ToProactiveEngagementEmergencyContactArrayOutputWithContext(context.Context) ProactiveEngagementEmergencyContactArrayOutput
}

type ProactiveEngagementEmergencyContactArray []ProactiveEngagementEmergencyContactInput

func (ProactiveEngagementEmergencyContactArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ProactiveEngagementEmergencyContact)(nil)).Elem()
}

func (i ProactiveEngagementEmergencyContactArray) ToProactiveEngagementEmergencyContactArrayOutput() ProactiveEngagementEmergencyContactArrayOutput {
	return i.ToProactiveEngagementEmergencyContactArrayOutputWithContext(context.Background())
}

func (i ProactiveEngagementEmergencyContactArray) ToProactiveEngagementEmergencyContactArrayOutputWithContext(ctx context.Context) ProactiveEngagementEmergencyContactArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProactiveEngagementEmergencyContactArrayOutput)
}

type ProactiveEngagementEmergencyContactOutput struct{ *pulumi.OutputState }

func (ProactiveEngagementEmergencyContactOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProactiveEngagementEmergencyContact)(nil)).Elem()
}

func (o ProactiveEngagementEmergencyContactOutput) ToProactiveEngagementEmergencyContactOutput() ProactiveEngagementEmergencyContactOutput {
	return o
}

func (o ProactiveEngagementEmergencyContactOutput) ToProactiveEngagementEmergencyContactOutputWithContext(ctx context.Context) ProactiveEngagementEmergencyContactOutput {
	return o
}

// Additional notes regarding the contact.
func (o ProactiveEngagementEmergencyContactOutput) ContactNotes() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProactiveEngagementEmergencyContact) *string { return v.ContactNotes }).(pulumi.StringPtrOutput)
}

// A valid email address that will be used for this contact.
func (o ProactiveEngagementEmergencyContactOutput) EmailAddress() pulumi.StringOutput {
	return o.ApplyT(func(v ProactiveEngagementEmergencyContact) string { return v.EmailAddress }).(pulumi.StringOutput)
}

// A phone number, starting with `+` and up to 15 digits that will be used for this contact.
func (o ProactiveEngagementEmergencyContactOutput) PhoneNumber() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProactiveEngagementEmergencyContact) *string { return v.PhoneNumber }).(pulumi.StringPtrOutput)
}

type ProactiveEngagementEmergencyContactArrayOutput struct{ *pulumi.OutputState }

func (ProactiveEngagementEmergencyContactArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ProactiveEngagementEmergencyContact)(nil)).Elem()
}

func (o ProactiveEngagementEmergencyContactArrayOutput) ToProactiveEngagementEmergencyContactArrayOutput() ProactiveEngagementEmergencyContactArrayOutput {
	return o
}

func (o ProactiveEngagementEmergencyContactArrayOutput) ToProactiveEngagementEmergencyContactArrayOutputWithContext(ctx context.Context) ProactiveEngagementEmergencyContactArrayOutput {
	return o
}

func (o ProactiveEngagementEmergencyContactArrayOutput) Index(i pulumi.IntInput) ProactiveEngagementEmergencyContactOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ProactiveEngagementEmergencyContact {
		return vs[0].([]ProactiveEngagementEmergencyContact)[vs[1].(int)]
	}).(ProactiveEngagementEmergencyContactOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationLayerAutomaticResponseTimeoutsInput)(nil)).Elem(), ApplicationLayerAutomaticResponseTimeoutsArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationLayerAutomaticResponseTimeoutsPtrInput)(nil)).Elem(), ApplicationLayerAutomaticResponseTimeoutsArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*DrtAccessLogBucketAssociationTimeoutsInput)(nil)).Elem(), DrtAccessLogBucketAssociationTimeoutsArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*DrtAccessLogBucketAssociationTimeoutsPtrInput)(nil)).Elem(), DrtAccessLogBucketAssociationTimeoutsArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*DrtAccessRoleArnAssociationTimeoutsInput)(nil)).Elem(), DrtAccessRoleArnAssociationTimeoutsArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*DrtAccessRoleArnAssociationTimeoutsPtrInput)(nil)).Elem(), DrtAccessRoleArnAssociationTimeoutsArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProactiveEngagementEmergencyContactInput)(nil)).Elem(), ProactiveEngagementEmergencyContactArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProactiveEngagementEmergencyContactArrayInput)(nil)).Elem(), ProactiveEngagementEmergencyContactArray{})
	pulumi.RegisterOutputType(ApplicationLayerAutomaticResponseTimeoutsOutput{})
	pulumi.RegisterOutputType(ApplicationLayerAutomaticResponseTimeoutsPtrOutput{})
	pulumi.RegisterOutputType(DrtAccessLogBucketAssociationTimeoutsOutput{})
	pulumi.RegisterOutputType(DrtAccessLogBucketAssociationTimeoutsPtrOutput{})
	pulumi.RegisterOutputType(DrtAccessRoleArnAssociationTimeoutsOutput{})
	pulumi.RegisterOutputType(DrtAccessRoleArnAssociationTimeoutsPtrOutput{})
	pulumi.RegisterOutputType(ProactiveEngagementEmergencyContactOutput{})
	pulumi.RegisterOutputType(ProactiveEngagementEmergencyContactArrayOutput{})
}
