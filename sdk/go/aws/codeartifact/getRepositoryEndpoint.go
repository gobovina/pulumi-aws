// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package codeartifact

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The CodeArtifact Repository Endpoint data source returns the endpoint of a repository for a specific package format.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/codeartifact"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := codeartifact.GetRepositoryEndpoint(ctx, &codeartifact.GetRepositoryEndpointArgs{
// 			Domain:     aws_codeartifact_domain.Test.Domain,
// 			Repository: aws_codeartifact_repository.Test.Repository,
// 			Format:     "npm",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetRepositoryEndpoint(ctx *pulumi.Context, args *GetRepositoryEndpointArgs, opts ...pulumi.InvokeOption) (*GetRepositoryEndpointResult, error) {
	var rv GetRepositoryEndpointResult
	err := ctx.Invoke("aws:codeartifact/getRepositoryEndpoint:getRepositoryEndpoint", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRepositoryEndpoint.
type GetRepositoryEndpointArgs struct {
	// The name of the domain that contains the repository.
	Domain string `pulumi:"domain"`
	// The account number of the AWS account that owns the domain.
	DomainOwner *string `pulumi:"domainOwner"`
	// Which endpoint of a repository to return. A repository has one endpoint for each package format: `npm`, `pypi`, `maven`, and `nuget`.
	Format string `pulumi:"format"`
	// The name of the repository.
	Repository string `pulumi:"repository"`
}

// A collection of values returned by getRepositoryEndpoint.
type GetRepositoryEndpointResult struct {
	Domain      string `pulumi:"domain"`
	DomainOwner string `pulumi:"domainOwner"`
	Format      string `pulumi:"format"`
	// The provider-assigned unique ID for this managed resource.
	Id         string `pulumi:"id"`
	Repository string `pulumi:"repository"`
	// The URL of the returned endpoint.
	RepositoryEndpoint string `pulumi:"repositoryEndpoint"`
}

func GetRepositoryEndpointOutput(ctx *pulumi.Context, args GetRepositoryEndpointOutputArgs, opts ...pulumi.InvokeOption) GetRepositoryEndpointResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetRepositoryEndpointResult, error) {
			args := v.(GetRepositoryEndpointArgs)
			r, err := GetRepositoryEndpoint(ctx, &args, opts...)
			return *r, err
		}).(GetRepositoryEndpointResultOutput)
}

// A collection of arguments for invoking getRepositoryEndpoint.
type GetRepositoryEndpointOutputArgs struct {
	// The name of the domain that contains the repository.
	Domain pulumi.StringInput `pulumi:"domain"`
	// The account number of the AWS account that owns the domain.
	DomainOwner pulumi.StringPtrInput `pulumi:"domainOwner"`
	// Which endpoint of a repository to return. A repository has one endpoint for each package format: `npm`, `pypi`, `maven`, and `nuget`.
	Format pulumi.StringInput `pulumi:"format"`
	// The name of the repository.
	Repository pulumi.StringInput `pulumi:"repository"`
}

func (GetRepositoryEndpointOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRepositoryEndpointArgs)(nil)).Elem()
}

// A collection of values returned by getRepositoryEndpoint.
type GetRepositoryEndpointResultOutput struct{ *pulumi.OutputState }

func (GetRepositoryEndpointResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRepositoryEndpointResult)(nil)).Elem()
}

func (o GetRepositoryEndpointResultOutput) ToGetRepositoryEndpointResultOutput() GetRepositoryEndpointResultOutput {
	return o
}

func (o GetRepositoryEndpointResultOutput) ToGetRepositoryEndpointResultOutputWithContext(ctx context.Context) GetRepositoryEndpointResultOutput {
	return o
}

func (o GetRepositoryEndpointResultOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v GetRepositoryEndpointResult) string { return v.Domain }).(pulumi.StringOutput)
}

func (o GetRepositoryEndpointResultOutput) DomainOwner() pulumi.StringOutput {
	return o.ApplyT(func(v GetRepositoryEndpointResult) string { return v.DomainOwner }).(pulumi.StringOutput)
}

func (o GetRepositoryEndpointResultOutput) Format() pulumi.StringOutput {
	return o.ApplyT(func(v GetRepositoryEndpointResult) string { return v.Format }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRepositoryEndpointResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRepositoryEndpointResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetRepositoryEndpointResultOutput) Repository() pulumi.StringOutput {
	return o.ApplyT(func(v GetRepositoryEndpointResult) string { return v.Repository }).(pulumi.StringOutput)
}

// The URL of the returned endpoint.
func (o GetRepositoryEndpointResultOutput) RepositoryEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v GetRepositoryEndpointResult) string { return v.RepositoryEndpoint }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRepositoryEndpointResultOutput{})
}
