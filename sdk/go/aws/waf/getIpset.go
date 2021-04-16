// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package waf

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `waf.IpSet` Retrieves a WAF IP Set Resource Id.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/waf"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := waf.GetIpset(ctx, &waf.GetIpsetArgs{
// 			Name: "tfWAFIPSet",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetIpset(ctx *pulumi.Context, args *GetIpsetArgs, opts ...pulumi.InvokeOption) (*GetIpsetResult, error) {
	var rv GetIpsetResult
	err := ctx.Invoke("aws:waf/getIpset:getIpset", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIpset.
type GetIpsetArgs struct {
	// The name of the WAF IP set.
	Name string `pulumi:"name"`
}

// A collection of values returned by getIpset.
type GetIpsetResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
}
