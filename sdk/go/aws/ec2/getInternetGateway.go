// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `ec2.InternetGateway` provides details about a specific Internet Gateway.
func LookupInternetGateway(ctx *pulumi.Context, args *LookupInternetGatewayArgs, opts ...pulumi.InvokeOption) (*LookupInternetGatewayResult, error) {
	var rv LookupInternetGatewayResult
	err := ctx.Invoke("aws:ec2/getInternetGateway:getInternetGateway", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInternetGateway.
type LookupInternetGatewayArgs struct {
	// Custom filter block as described below.
	Filters []GetInternetGatewayFilter `pulumi:"filters"`
	// The id of the specific Internet Gateway to retrieve.
	InternetGatewayId *string `pulumi:"internetGatewayId"`
	// A map of tags, each pair of which must exactly match
	// a pair on the desired Internet Gateway.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getInternetGateway.
type LookupInternetGatewayResult struct {
	// The ARN of the Internet Gateway.
	Arn         string                         `pulumi:"arn"`
	Attachments []GetInternetGatewayAttachment `pulumi:"attachments"`
	Filters     []GetInternetGatewayFilter     `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id                string `pulumi:"id"`
	InternetGatewayId string `pulumi:"internetGatewayId"`
	// The ID of the AWS account that owns the internet gateway.
	OwnerId string            `pulumi:"ownerId"`
	Tags    map[string]string `pulumi:"tags"`
}
