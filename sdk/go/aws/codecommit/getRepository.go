// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package codecommit

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The CodeCommit Repository data source allows the ARN, Repository ID, Repository URL for HTTP and Repository URL for SSH to be retrieved for an CodeCommit repository.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/codecommit"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := codecommit.LookupRepository(ctx, &codecommit.LookupRepositoryArgs{
// 			RepositoryName: "MyTestRepository",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupRepository(ctx *pulumi.Context, args *LookupRepositoryArgs, opts ...pulumi.InvokeOption) (*LookupRepositoryResult, error) {
	var rv LookupRepositoryResult
	err := ctx.Invoke("aws:codecommit/getRepository:getRepository", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRepository.
type LookupRepositoryArgs struct {
	// The name for the repository. This needs to be less than 100 characters.
	RepositoryName string `pulumi:"repositoryName"`
}

// A collection of values returned by getRepository.
type LookupRepositoryResult struct {
	// The ARN of the repository
	Arn string `pulumi:"arn"`
	// The URL to use for cloning the repository over HTTPS.
	CloneUrlHttp string `pulumi:"cloneUrlHttp"`
	// The URL to use for cloning the repository over SSH.
	CloneUrlSsh string `pulumi:"cloneUrlSsh"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The ID of the repository
	RepositoryId   string `pulumi:"repositoryId"`
	RepositoryName string `pulumi:"repositoryName"`
}
