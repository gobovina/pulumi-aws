// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package elb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get the HostedZoneId of the AWS Elastic Load Balancing HostedZoneId
// in a given region for the purpose of using in an AWS Route53 Alias.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/elb"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/route53"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			main, err := elb.GetHostedZoneId(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = route53.NewRecord(ctx, "www", &route53.RecordArgs{
//				ZoneId: pulumi.Any(primary.ZoneId),
//				Name:   pulumi.String("example.com"),
//				Type:   pulumi.String("A"),
//				Aliases: route53.RecordAliasArray{
//					&route53.RecordAliasArgs{
//						Name:                 pulumi.Any(mainAwsElb.DnsName),
//						ZoneId:               *pulumi.String(main.Id),
//						EvaluateTargetHealth: pulumi.Bool(true),
//					},
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
func GetHostedZoneId(ctx *pulumi.Context, args *GetHostedZoneIdArgs, opts ...pulumi.InvokeOption) (*GetHostedZoneIdResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetHostedZoneIdResult
	err := ctx.Invoke("aws:elb/getHostedZoneId:getHostedZoneId", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHostedZoneId.
type GetHostedZoneIdArgs struct {
	// Name of the region whose AWS ELB HostedZoneId is desired.
	// Defaults to the region from the AWS provider configuration.
	Region *string `pulumi:"region"`
}

// A collection of values returned by getHostedZoneId.
type GetHostedZoneIdResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id     string  `pulumi:"id"`
	Region *string `pulumi:"region"`
}

func GetHostedZoneIdOutput(ctx *pulumi.Context, args GetHostedZoneIdOutputArgs, opts ...pulumi.InvokeOption) GetHostedZoneIdResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetHostedZoneIdResult, error) {
			args := v.(GetHostedZoneIdArgs)
			r, err := GetHostedZoneId(ctx, &args, opts...)
			var s GetHostedZoneIdResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetHostedZoneIdResultOutput)
}

// A collection of arguments for invoking getHostedZoneId.
type GetHostedZoneIdOutputArgs struct {
	// Name of the region whose AWS ELB HostedZoneId is desired.
	// Defaults to the region from the AWS provider configuration.
	Region pulumi.StringPtrInput `pulumi:"region"`
}

func (GetHostedZoneIdOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHostedZoneIdArgs)(nil)).Elem()
}

// A collection of values returned by getHostedZoneId.
type GetHostedZoneIdResultOutput struct{ *pulumi.OutputState }

func (GetHostedZoneIdResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHostedZoneIdResult)(nil)).Elem()
}

func (o GetHostedZoneIdResultOutput) ToGetHostedZoneIdResultOutput() GetHostedZoneIdResultOutput {
	return o
}

func (o GetHostedZoneIdResultOutput) ToGetHostedZoneIdResultOutputWithContext(ctx context.Context) GetHostedZoneIdResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetHostedZoneIdResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetHostedZoneIdResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetHostedZoneIdResultOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostedZoneIdResult) *string { return v.Region }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetHostedZoneIdResultOutput{})
}
