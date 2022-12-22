// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package servicecatalog

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information on a Service Catalog Constraint.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/servicecatalog"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := servicecatalog.LookupConstraint(ctx, &servicecatalog.LookupConstraintArgs{
//				AcceptLanguage: pulumi.StringRef("en"),
//				Id:             "cons-hrvy0335",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupConstraint(ctx *pulumi.Context, args *LookupConstraintArgs, opts ...pulumi.InvokeOption) (*LookupConstraintResult, error) {
	var rv LookupConstraintResult
	err := ctx.Invoke("aws:servicecatalog/getConstraint:getConstraint", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConstraint.
type LookupConstraintArgs struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
	AcceptLanguage *string `pulumi:"acceptLanguage"`
	// Description of the constraint.
	Description *string `pulumi:"description"`
	// Constraint identifier.
	Id string `pulumi:"id"`
}

// A collection of values returned by getConstraint.
type LookupConstraintResult struct {
	AcceptLanguage *string `pulumi:"acceptLanguage"`
	// Description of the constraint.
	Description string `pulumi:"description"`
	Id          string `pulumi:"id"`
	// Owner of the constraint.
	Owner string `pulumi:"owner"`
	// Constraint parameters in JSON format.
	Parameters string `pulumi:"parameters"`
	// Portfolio identifier.
	PortfolioId string `pulumi:"portfolioId"`
	// Product identifier.
	ProductId string `pulumi:"productId"`
	// Constraint status.
	Status string `pulumi:"status"`
	// Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
	Type string `pulumi:"type"`
}

func LookupConstraintOutput(ctx *pulumi.Context, args LookupConstraintOutputArgs, opts ...pulumi.InvokeOption) LookupConstraintResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupConstraintResult, error) {
			args := v.(LookupConstraintArgs)
			r, err := LookupConstraint(ctx, &args, opts...)
			var s LookupConstraintResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupConstraintResultOutput)
}

// A collection of arguments for invoking getConstraint.
type LookupConstraintOutputArgs struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
	AcceptLanguage pulumi.StringPtrInput `pulumi:"acceptLanguage"`
	// Description of the constraint.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// Constraint identifier.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupConstraintOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConstraintArgs)(nil)).Elem()
}

// A collection of values returned by getConstraint.
type LookupConstraintResultOutput struct{ *pulumi.OutputState }

func (LookupConstraintResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConstraintResult)(nil)).Elem()
}

func (o LookupConstraintResultOutput) ToLookupConstraintResultOutput() LookupConstraintResultOutput {
	return o
}

func (o LookupConstraintResultOutput) ToLookupConstraintResultOutputWithContext(ctx context.Context) LookupConstraintResultOutput {
	return o
}

func (o LookupConstraintResultOutput) AcceptLanguage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConstraintResult) *string { return v.AcceptLanguage }).(pulumi.StringPtrOutput)
}

// Description of the constraint.
func (o LookupConstraintResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConstraintResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupConstraintResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConstraintResult) string { return v.Id }).(pulumi.StringOutput)
}

// Owner of the constraint.
func (o LookupConstraintResultOutput) Owner() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConstraintResult) string { return v.Owner }).(pulumi.StringOutput)
}

// Constraint parameters in JSON format.
func (o LookupConstraintResultOutput) Parameters() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConstraintResult) string { return v.Parameters }).(pulumi.StringOutput)
}

// Portfolio identifier.
func (o LookupConstraintResultOutput) PortfolioId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConstraintResult) string { return v.PortfolioId }).(pulumi.StringOutput)
}

// Product identifier.
func (o LookupConstraintResultOutput) ProductId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConstraintResult) string { return v.ProductId }).(pulumi.StringOutput)
}

// Constraint status.
func (o LookupConstraintResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConstraintResult) string { return v.Status }).(pulumi.StringOutput)
}

// Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
func (o LookupConstraintResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConstraintResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConstraintResultOutput{})
}
