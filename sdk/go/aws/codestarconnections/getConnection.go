// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package codestarconnections

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about CodeStar Connection.
//
// ## Example Usage
//
// ### By ARN
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/codestarconnections"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := codestarconnections.LookupConnection(ctx, &codestarconnections.LookupConnectionArgs{
//				Arn: pulumi.StringRef(exampleAwsCodestarconnectionsConnection.Arn),
//			}, nil)
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
// ### By Name
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/codestarconnections"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := codestarconnections.LookupConnection(ctx, &codestarconnections.LookupConnectionArgs{
//				Name: pulumi.StringRef(exampleAwsCodestarconnectionsConnection.Name),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func LookupConnection(ctx *pulumi.Context, args *LookupConnectionArgs, opts ...pulumi.InvokeOption) (*LookupConnectionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupConnectionResult
	err := ctx.Invoke("aws:codestarconnections/getConnection:getConnection", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnection.
type LookupConnectionArgs struct {
	// CodeStar Connection ARN.
	Arn *string `pulumi:"arn"`
	// CodeStar Connection name.
	//
	// > **NOTE:** When both `arn` and `name` are specified, `arn` takes precedence.
	Name *string `pulumi:"name"`
	// Map of key-value resource tags to associate with the resource.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getConnection.
type LookupConnectionResult struct {
	Arn string `pulumi:"arn"`
	// CodeStar Connection status. Possible values are `PENDING`, `AVAILABLE` and `ERROR`.
	ConnectionStatus string `pulumi:"connectionStatus"`
	// ARN of the host associated with the connection.
	HostArn string `pulumi:"hostArn"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Name of the CodeStar Connection. The name is unique in the calling AWS account.
	Name string `pulumi:"name"`
	// Name of the external provider where your third-party code repository is configured. Possible values are `Bitbucket`, `GitHub` and `GitLab`. For connections to GitHub Enterprise Server or GitLab Self-Managed instances, you must create an codestarconnections.Host resource and use `hostArn` instead.
	ProviderType string `pulumi:"providerType"`
	// Map of key-value resource tags to associate with the resource.
	Tags map[string]string `pulumi:"tags"`
}

func LookupConnectionOutput(ctx *pulumi.Context, args LookupConnectionOutputArgs, opts ...pulumi.InvokeOption) LookupConnectionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupConnectionResult, error) {
			args := v.(LookupConnectionArgs)
			r, err := LookupConnection(ctx, &args, opts...)
			var s LookupConnectionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupConnectionResultOutput)
}

// A collection of arguments for invoking getConnection.
type LookupConnectionOutputArgs struct {
	// CodeStar Connection ARN.
	Arn pulumi.StringPtrInput `pulumi:"arn"`
	// CodeStar Connection name.
	//
	// > **NOTE:** When both `arn` and `name` are specified, `arn` takes precedence.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Map of key-value resource tags to associate with the resource.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupConnectionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectionArgs)(nil)).Elem()
}

// A collection of values returned by getConnection.
type LookupConnectionResultOutput struct{ *pulumi.OutputState }

func (LookupConnectionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectionResult)(nil)).Elem()
}

func (o LookupConnectionResultOutput) ToLookupConnectionResultOutput() LookupConnectionResultOutput {
	return o
}

func (o LookupConnectionResultOutput) ToLookupConnectionResultOutputWithContext(ctx context.Context) LookupConnectionResultOutput {
	return o
}

func (o LookupConnectionResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Arn }).(pulumi.StringOutput)
}

// CodeStar Connection status. Possible values are `PENDING`, `AVAILABLE` and `ERROR`.
func (o LookupConnectionResultOutput) ConnectionStatus() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.ConnectionStatus }).(pulumi.StringOutput)
}

// ARN of the host associated with the connection.
func (o LookupConnectionResultOutput) HostArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.HostArn }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConnectionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name of the CodeStar Connection. The name is unique in the calling AWS account.
func (o LookupConnectionResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Name }).(pulumi.StringOutput)
}

// Name of the external provider where your third-party code repository is configured. Possible values are `Bitbucket`, `GitHub` and `GitLab`. For connections to GitHub Enterprise Server or GitLab Self-Managed instances, you must create an codestarconnections.Host resource and use `hostArn` instead.
func (o LookupConnectionResultOutput) ProviderType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.ProviderType }).(pulumi.StringOutput)
}

// Map of key-value resource tags to associate with the resource.
func (o LookupConnectionResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupConnectionResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConnectionResultOutput{})
}
