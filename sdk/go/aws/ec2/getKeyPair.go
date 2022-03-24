// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific EC2 Key Pair.
//
// ## Example Usage
//
// The following example shows how to get a EC2 Key Pair from its name.
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		example, err := ec2.LookupKeyPair(ctx, &ec2.LookupKeyPairArgs{
// 			KeyName: pulumi.StringRef("test"),
// 			Filters: []ec2.GetKeyPairFilter{
// 				ec2.GetKeyPairFilter{
// 					Name: "tag:Component",
// 					Values: []string{
// 						"web",
// 					},
// 				},
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("fingerprint", example.Fingerprint)
// 		ctx.Export("name", example.KeyName)
// 		ctx.Export("id", example.Id)
// 		return nil
// 	})
// }
// ```
func LookupKeyPair(ctx *pulumi.Context, args *LookupKeyPairArgs, opts ...pulumi.InvokeOption) (*LookupKeyPairResult, error) {
	var rv LookupKeyPairResult
	err := ctx.Invoke("aws:ec2/getKeyPair:getKeyPair", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKeyPair.
type LookupKeyPairArgs struct {
	// Custom filter block as described below.
	Filters []GetKeyPairFilter `pulumi:"filters"`
	// The Key Pair name.
	KeyName *string `pulumi:"keyName"`
	// The Key Pair ID.
	KeyPairId *string `pulumi:"keyPairId"`
	// Any tags assigned to the Key Pair.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getKeyPair.
type LookupKeyPairResult struct {
	// The ARN of the Key Pair.
	Arn     string             `pulumi:"arn"`
	Filters []GetKeyPairFilter `pulumi:"filters"`
	// The SHA-1 digest of the DER encoded private key.
	Fingerprint string `pulumi:"fingerprint"`
	// The provider-assigned unique ID for this managed resource.
	Id        string  `pulumi:"id"`
	KeyName   *string `pulumi:"keyName"`
	KeyPairId *string `pulumi:"keyPairId"`
	// Any tags assigned to the Key Pair.
	Tags map[string]string `pulumi:"tags"`
}

func LookupKeyPairOutput(ctx *pulumi.Context, args LookupKeyPairOutputArgs, opts ...pulumi.InvokeOption) LookupKeyPairResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupKeyPairResult, error) {
			args := v.(LookupKeyPairArgs)
			r, err := LookupKeyPair(ctx, &args, opts...)
			return *r, err
		}).(LookupKeyPairResultOutput)
}

// A collection of arguments for invoking getKeyPair.
type LookupKeyPairOutputArgs struct {
	// Custom filter block as described below.
	Filters GetKeyPairFilterArrayInput `pulumi:"filters"`
	// The Key Pair name.
	KeyName pulumi.StringPtrInput `pulumi:"keyName"`
	// The Key Pair ID.
	KeyPairId pulumi.StringPtrInput `pulumi:"keyPairId"`
	// Any tags assigned to the Key Pair.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupKeyPairOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKeyPairArgs)(nil)).Elem()
}

// A collection of values returned by getKeyPair.
type LookupKeyPairResultOutput struct{ *pulumi.OutputState }

func (LookupKeyPairResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKeyPairResult)(nil)).Elem()
}

func (o LookupKeyPairResultOutput) ToLookupKeyPairResultOutput() LookupKeyPairResultOutput {
	return o
}

func (o LookupKeyPairResultOutput) ToLookupKeyPairResultOutputWithContext(ctx context.Context) LookupKeyPairResultOutput {
	return o
}

// The ARN of the Key Pair.
func (o LookupKeyPairResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyPairResult) string { return v.Arn }).(pulumi.StringOutput)
}

func (o LookupKeyPairResultOutput) Filters() GetKeyPairFilterArrayOutput {
	return o.ApplyT(func(v LookupKeyPairResult) []GetKeyPairFilter { return v.Filters }).(GetKeyPairFilterArrayOutput)
}

// The SHA-1 digest of the DER encoded private key.
func (o LookupKeyPairResultOutput) Fingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyPairResult) string { return v.Fingerprint }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupKeyPairResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKeyPairResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupKeyPairResultOutput) KeyName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupKeyPairResult) *string { return v.KeyName }).(pulumi.StringPtrOutput)
}

func (o LookupKeyPairResultOutput) KeyPairId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupKeyPairResult) *string { return v.KeyPairId }).(pulumi.StringPtrOutput)
}

// Any tags assigned to the Key Pair.
func (o LookupKeyPairResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupKeyPairResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupKeyPairResultOutput{})
}
