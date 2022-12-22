// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package transfer

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get the ARN of an AWS Transfer Server for use in other
// resources.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/transfer"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := transfer.LookupServer(ctx, &transfer.LookupServerArgs{
//				ServerId: "s-1234567",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupServer(ctx *pulumi.Context, args *LookupServerArgs, opts ...pulumi.InvokeOption) (*LookupServerResult, error) {
	var rv LookupServerResult
	err := ctx.Invoke("aws:transfer/getServer:getServer", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServer.
type LookupServerArgs struct {
	// ID for an SFTP server.
	ServerId string `pulumi:"serverId"`
}

// A collection of values returned by getServer.
type LookupServerResult struct {
	// ARN of Transfer Server.
	Arn string `pulumi:"arn"`
	// ARN of any certificate.
	Certificate string `pulumi:"certificate"`
	// The domain of the storage system that is used for file transfers.
	Domain string `pulumi:"domain"`
	// Endpoint of the Transfer Server (e.g., `s-12345678.server.transfer.REGION.amazonaws.com`).
	Endpoint string `pulumi:"endpoint"`
	// Type of endpoint that the server is connected to.
	EndpointType string `pulumi:"endpointType"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice.
	IdentityProviderType string `pulumi:"identityProviderType"`
	// ARN of the IAM role used to authenticate the user account with an `identityProviderType` of `API_GATEWAY`.
	InvocationRole string `pulumi:"invocationRole"`
	// ARN of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
	LoggingRole string `pulumi:"loggingRole"`
	// File transfer protocol or protocols over which your file transfer protocol client can connect to your server's endpoint.
	Protocols []string `pulumi:"protocols"`
	// The name of the security policy that is attached to the server.
	SecurityPolicyName string `pulumi:"securityPolicyName"`
	ServerId           string `pulumi:"serverId"`
	// URL of the service endpoint used to authenticate users with an `identityProviderType` of `API_GATEWAY`.
	Url string `pulumi:"url"`
}

func LookupServerOutput(ctx *pulumi.Context, args LookupServerOutputArgs, opts ...pulumi.InvokeOption) LookupServerResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServerResult, error) {
			args := v.(LookupServerArgs)
			r, err := LookupServer(ctx, &args, opts...)
			var s LookupServerResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupServerResultOutput)
}

// A collection of arguments for invoking getServer.
type LookupServerOutputArgs struct {
	// ID for an SFTP server.
	ServerId pulumi.StringInput `pulumi:"serverId"`
}

func (LookupServerOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServerArgs)(nil)).Elem()
}

// A collection of values returned by getServer.
type LookupServerResultOutput struct{ *pulumi.OutputState }

func (LookupServerResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServerResult)(nil)).Elem()
}

func (o LookupServerResultOutput) ToLookupServerResultOutput() LookupServerResultOutput {
	return o
}

func (o LookupServerResultOutput) ToLookupServerResultOutputWithContext(ctx context.Context) LookupServerResultOutput {
	return o
}

// ARN of Transfer Server.
func (o LookupServerResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.Arn }).(pulumi.StringOutput)
}

// ARN of any certificate.
func (o LookupServerResultOutput) Certificate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.Certificate }).(pulumi.StringOutput)
}

// The domain of the storage system that is used for file transfers.
func (o LookupServerResultOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.Domain }).(pulumi.StringOutput)
}

// Endpoint of the Transfer Server (e.g., `s-12345678.server.transfer.REGION.amazonaws.com`).
func (o LookupServerResultOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.Endpoint }).(pulumi.StringOutput)
}

// Type of endpoint that the server is connected to.
func (o LookupServerResultOutput) EndpointType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.EndpointType }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupServerResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.Id }).(pulumi.StringOutput)
}

// The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice.
func (o LookupServerResultOutput) IdentityProviderType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.IdentityProviderType }).(pulumi.StringOutput)
}

// ARN of the IAM role used to authenticate the user account with an `identityProviderType` of `API_GATEWAY`.
func (o LookupServerResultOutput) InvocationRole() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.InvocationRole }).(pulumi.StringOutput)
}

// ARN of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
func (o LookupServerResultOutput) LoggingRole() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.LoggingRole }).(pulumi.StringOutput)
}

// File transfer protocol or protocols over which your file transfer protocol client can connect to your server's endpoint.
func (o LookupServerResultOutput) Protocols() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupServerResult) []string { return v.Protocols }).(pulumi.StringArrayOutput)
}

// The name of the security policy that is attached to the server.
func (o LookupServerResultOutput) SecurityPolicyName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.SecurityPolicyName }).(pulumi.StringOutput)
}

func (o LookupServerResultOutput) ServerId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.ServerId }).(pulumi.StringOutput)
}

// URL of the service endpoint used to authenticate users with an `identityProviderType` of `API_GATEWAY`.
func (o LookupServerResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServerResult) string { return v.Url }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServerResultOutput{})
}
