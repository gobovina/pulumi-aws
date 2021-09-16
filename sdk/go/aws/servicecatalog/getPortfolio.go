// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package servicecatalog

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information for a Service Catalog Portfolio.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/servicecatalog"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := servicecatalog.LookupPortfolio(ctx, &servicecatalog.LookupPortfolioArgs{
// 			Id: "port-07052002",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupPortfolio(ctx *pulumi.Context, args *LookupPortfolioArgs, opts ...pulumi.InvokeOption) (*LookupPortfolioResult, error) {
	var rv LookupPortfolioResult
	err := ctx.Invoke("aws:servicecatalog/getPortfolio:getPortfolio", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPortfolio.
type LookupPortfolioArgs struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
	AcceptLanguage *string `pulumi:"acceptLanguage"`
	// Portfolio identifier.
	Id string `pulumi:"id"`
	// Tags applied to the portfolio.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getPortfolio.
type LookupPortfolioResult struct {
	AcceptLanguage *string `pulumi:"acceptLanguage"`
	// Portfolio ARN.
	Arn string `pulumi:"arn"`
	// Time the portfolio was created.
	CreatedTime string `pulumi:"createdTime"`
	// Description of the portfolio
	Description string `pulumi:"description"`
	Id          string `pulumi:"id"`
	// Portfolio name.
	Name string `pulumi:"name"`
	// Name of the person or organization who owns the portfolio.
	ProviderName string `pulumi:"providerName"`
	// Tags applied to the portfolio.
	Tags map[string]string `pulumi:"tags"`
}

func LookupPortfolioOutput(ctx *pulumi.Context, args LookupPortfolioOutputArgs, opts ...pulumi.InvokeOption) LookupPortfolioResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPortfolioResult, error) {
			args := v.(LookupPortfolioArgs)
			r, err := LookupPortfolio(ctx, &args, opts...)
			return *r, err
		}).(LookupPortfolioResultOutput)
}

// A collection of arguments for invoking getPortfolio.
type LookupPortfolioOutputArgs struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
	AcceptLanguage pulumi.StringPtrInput `pulumi:"acceptLanguage"`
	// Portfolio identifier.
	Id pulumi.StringInput `pulumi:"id"`
	// Tags applied to the portfolio.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupPortfolioOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPortfolioArgs)(nil)).Elem()
}

// A collection of values returned by getPortfolio.
type LookupPortfolioResultOutput struct{ *pulumi.OutputState }

func (LookupPortfolioResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPortfolioResult)(nil)).Elem()
}

func (o LookupPortfolioResultOutput) ToLookupPortfolioResultOutput() LookupPortfolioResultOutput {
	return o
}

func (o LookupPortfolioResultOutput) ToLookupPortfolioResultOutputWithContext(ctx context.Context) LookupPortfolioResultOutput {
	return o
}

func (o LookupPortfolioResultOutput) AcceptLanguage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupPortfolioResult) *string { return v.AcceptLanguage }).(pulumi.StringPtrOutput)
}

// Portfolio ARN.
func (o LookupPortfolioResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPortfolioResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Time the portfolio was created.
func (o LookupPortfolioResultOutput) CreatedTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPortfolioResult) string { return v.CreatedTime }).(pulumi.StringOutput)
}

// Description of the portfolio
func (o LookupPortfolioResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPortfolioResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupPortfolioResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPortfolioResult) string { return v.Id }).(pulumi.StringOutput)
}

// Portfolio name.
func (o LookupPortfolioResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPortfolioResult) string { return v.Name }).(pulumi.StringOutput)
}

// Name of the person or organization who owns the portfolio.
func (o LookupPortfolioResultOutput) ProviderName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPortfolioResult) string { return v.ProviderName }).(pulumi.StringOutput)
}

// Tags applied to the portfolio.
func (o LookupPortfolioResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupPortfolioResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPortfolioResultOutput{})
}
