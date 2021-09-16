// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package applicationloadbalancing

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Note:** `alb.LoadBalancer` is known as `lb.LoadBalancer`. The functionality is identical.
//
// Provides information about a Load Balancer.
//
// This data source can prove useful when a module accepts an LB as an input
// variable and needs to, for example, determine the security groups associated
// with it, etc.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/lb"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		lbArn := ""
// 		if param := cfg.Get("lbArn"); param != "" {
// 			lbArn = param
// 		}
// 		lbName := ""
// 		if param := cfg.Get("lbName"); param != "" {
// 			lbName = param
// 		}
// 		opt0 := lbArn
// 		opt1 := lbName
// 		_, err := lb.LookupLoadBalancer(ctx, &lb.LookupLoadBalancerArgs{
// 			Arn:  &opt0,
// 			Name: &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// Deprecated: aws.applicationloadbalancing.getLoadBalancer has been deprecated in favor of aws.alb.getLoadBalancer
func LookupLoadBalancer(ctx *pulumi.Context, args *LookupLoadBalancerArgs, opts ...pulumi.InvokeOption) (*LookupLoadBalancerResult, error) {
	var rv LookupLoadBalancerResult
	err := ctx.Invoke("aws:applicationloadbalancing/getLoadBalancer:getLoadBalancer", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLoadBalancer.
type LookupLoadBalancerArgs struct {
	// The full ARN of the load balancer.
	Arn *string `pulumi:"arn"`
	// The unique name of the load balancer.
	Name *string `pulumi:"name"`
	// A mapping of tags, each pair of which must exactly match a pair on the desired load balancer.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getLoadBalancer.
type LookupLoadBalancerResult struct {
	AccessLogs               GetLoadBalancerAccessLogs `pulumi:"accessLogs"`
	Arn                      string                    `pulumi:"arn"`
	ArnSuffix                string                    `pulumi:"arnSuffix"`
	CustomerOwnedIpv4Pool    string                    `pulumi:"customerOwnedIpv4Pool"`
	DnsName                  string                    `pulumi:"dnsName"`
	DropInvalidHeaderFields  bool                      `pulumi:"dropInvalidHeaderFields"`
	EnableDeletionProtection bool                      `pulumi:"enableDeletionProtection"`
	EnableHttp2              bool                      `pulumi:"enableHttp2"`
	// The provider-assigned unique ID for this managed resource.
	Id               string                         `pulumi:"id"`
	IdleTimeout      int                            `pulumi:"idleTimeout"`
	Internal         bool                           `pulumi:"internal"`
	IpAddressType    string                         `pulumi:"ipAddressType"`
	LoadBalancerType string                         `pulumi:"loadBalancerType"`
	Name             string                         `pulumi:"name"`
	SecurityGroups   []string                       `pulumi:"securityGroups"`
	SubnetMappings   []GetLoadBalancerSubnetMapping `pulumi:"subnetMappings"`
	Subnets          []string                       `pulumi:"subnets"`
	Tags             map[string]string              `pulumi:"tags"`
	VpcId            string                         `pulumi:"vpcId"`
	ZoneId           string                         `pulumi:"zoneId"`
}

func LookupLoadBalancerOutput(ctx *pulumi.Context, args LookupLoadBalancerOutputArgs, opts ...pulumi.InvokeOption) LookupLoadBalancerResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupLoadBalancerResult, error) {
			args := v.(LookupLoadBalancerArgs)
			r, err := LookupLoadBalancer(ctx, &args, opts...)
			return *r, err
		}).(LookupLoadBalancerResultOutput)
}

// A collection of arguments for invoking getLoadBalancer.
type LookupLoadBalancerOutputArgs struct {
	// The full ARN of the load balancer.
	Arn pulumi.StringPtrInput `pulumi:"arn"`
	// The unique name of the load balancer.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// A mapping of tags, each pair of which must exactly match a pair on the desired load balancer.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupLoadBalancerOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoadBalancerArgs)(nil)).Elem()
}

// A collection of values returned by getLoadBalancer.
type LookupLoadBalancerResultOutput struct{ *pulumi.OutputState }

func (LookupLoadBalancerResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoadBalancerResult)(nil)).Elem()
}

func (o LookupLoadBalancerResultOutput) ToLookupLoadBalancerResultOutput() LookupLoadBalancerResultOutput {
	return o
}

func (o LookupLoadBalancerResultOutput) ToLookupLoadBalancerResultOutputWithContext(ctx context.Context) LookupLoadBalancerResultOutput {
	return o
}

func (o LookupLoadBalancerResultOutput) AccessLogs() GetLoadBalancerAccessLogsOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) GetLoadBalancerAccessLogs { return v.AccessLogs }).(GetLoadBalancerAccessLogsOutput)
}

func (o LookupLoadBalancerResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.Arn }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) ArnSuffix() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.ArnSuffix }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) CustomerOwnedIpv4Pool() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.CustomerOwnedIpv4Pool }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) DnsName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.DnsName }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) DropInvalidHeaderFields() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) bool { return v.DropInvalidHeaderFields }).(pulumi.BoolOutput)
}

func (o LookupLoadBalancerResultOutput) EnableDeletionProtection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) bool { return v.EnableDeletionProtection }).(pulumi.BoolOutput)
}

func (o LookupLoadBalancerResultOutput) EnableHttp2() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) bool { return v.EnableHttp2 }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupLoadBalancerResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) IdleTimeout() pulumi.IntOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) int { return v.IdleTimeout }).(pulumi.IntOutput)
}

func (o LookupLoadBalancerResultOutput) Internal() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) bool { return v.Internal }).(pulumi.BoolOutput)
}

func (o LookupLoadBalancerResultOutput) IpAddressType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.IpAddressType }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) LoadBalancerType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.LoadBalancerType }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) SecurityGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) []string { return v.SecurityGroups }).(pulumi.StringArrayOutput)
}

func (o LookupLoadBalancerResultOutput) SubnetMappings() GetLoadBalancerSubnetMappingArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) []GetLoadBalancerSubnetMapping { return v.SubnetMappings }).(GetLoadBalancerSubnetMappingArrayOutput)
}

func (o LookupLoadBalancerResultOutput) Subnets() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) []string { return v.Subnets }).(pulumi.StringArrayOutput)
}

func (o LookupLoadBalancerResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func (o LookupLoadBalancerResultOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.VpcId }).(pulumi.StringOutput)
}

func (o LookupLoadBalancerResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadBalancerResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupLoadBalancerResultOutput{})
}
