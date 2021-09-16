// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a Network Interface.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/ec2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "eni-01234567"
// 		_, err := ec2.LookupNetworkInterface(ctx, &ec2.LookupNetworkInterfaceArgs{
// 			Id: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupNetworkInterface(ctx *pulumi.Context, args *LookupNetworkInterfaceArgs, opts ...pulumi.InvokeOption) (*LookupNetworkInterfaceResult, error) {
	var rv LookupNetworkInterfaceResult
	err := ctx.Invoke("aws:ec2/getNetworkInterface:getNetworkInterface", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkInterface.
type LookupNetworkInterfaceArgs struct {
	// One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-network-interfaces](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-network-interfaces.html) in the AWS CLI reference.
	Filters []GetNetworkInterfaceFilter `pulumi:"filters"`
	// The identifier for the network interface.
	Id *string `pulumi:"id"`
	// Any tags assigned to the network interface.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getNetworkInterface.
type LookupNetworkInterfaceResult struct {
	// The association information for an Elastic IP address (IPv4) associated with the network interface. See supported fields below.
	Associations []GetNetworkInterfaceAssociation    `pulumi:"associations"`
	Attachments  []GetNetworkInterfaceAttachmentType `pulumi:"attachments"`
	// The Availability Zone.
	AvailabilityZone string `pulumi:"availabilityZone"`
	// Description of the network interface.
	Description string                      `pulumi:"description"`
	Filters     []GetNetworkInterfaceFilter `pulumi:"filters"`
	Id          string                      `pulumi:"id"`
	// The type of interface.
	InterfaceType string `pulumi:"interfaceType"`
	// List of IPv6 addresses to assign to the ENI.
	Ipv6Addresses []string `pulumi:"ipv6Addresses"`
	// The MAC address.
	MacAddress string `pulumi:"macAddress"`
	// The Amazon Resource Name (ARN) of the Outpost.
	OutpostArn string `pulumi:"outpostArn"`
	// The AWS account ID of the owner of the network interface.
	OwnerId string `pulumi:"ownerId"`
	// The private DNS name.
	PrivateDnsName string `pulumi:"privateDnsName"`
	// The private IPv4 address of the network interface within the subnet.
	PrivateIp string `pulumi:"privateIp"`
	// The private IPv4 addresses associated with the network interface.
	PrivateIps []string `pulumi:"privateIps"`
	// The ID of the entity that launched the instance on your behalf.
	RequesterId string `pulumi:"requesterId"`
	// The list of security groups for the network interface.
	SecurityGroups []string `pulumi:"securityGroups"`
	// The ID of the subnet.
	SubnetId string `pulumi:"subnetId"`
	// Any tags assigned to the network interface.
	Tags map[string]string `pulumi:"tags"`
	// The ID of the VPC.
	VpcId string `pulumi:"vpcId"`
}

func LookupNetworkInterfaceOutput(ctx *pulumi.Context, args LookupNetworkInterfaceOutputArgs, opts ...pulumi.InvokeOption) LookupNetworkInterfaceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNetworkInterfaceResult, error) {
			args := v.(LookupNetworkInterfaceArgs)
			r, err := LookupNetworkInterface(ctx, &args, opts...)
			return *r, err
		}).(LookupNetworkInterfaceResultOutput)
}

// A collection of arguments for invoking getNetworkInterface.
type LookupNetworkInterfaceOutputArgs struct {
	// One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-network-interfaces](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-network-interfaces.html) in the AWS CLI reference.
	Filters GetNetworkInterfaceFilterArrayInput `pulumi:"filters"`
	// The identifier for the network interface.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// Any tags assigned to the network interface.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupNetworkInterfaceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkInterfaceArgs)(nil)).Elem()
}

// A collection of values returned by getNetworkInterface.
type LookupNetworkInterfaceResultOutput struct{ *pulumi.OutputState }

func (LookupNetworkInterfaceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkInterfaceResult)(nil)).Elem()
}

func (o LookupNetworkInterfaceResultOutput) ToLookupNetworkInterfaceResultOutput() LookupNetworkInterfaceResultOutput {
	return o
}

func (o LookupNetworkInterfaceResultOutput) ToLookupNetworkInterfaceResultOutputWithContext(ctx context.Context) LookupNetworkInterfaceResultOutput {
	return o
}

// The association information for an Elastic IP address (IPv4) associated with the network interface. See supported fields below.
func (o LookupNetworkInterfaceResultOutput) Associations() GetNetworkInterfaceAssociationArrayOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) []GetNetworkInterfaceAssociation { return v.Associations }).(GetNetworkInterfaceAssociationArrayOutput)
}

func (o LookupNetworkInterfaceResultOutput) Attachments() GetNetworkInterfaceAttachmentTypeArrayOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) []GetNetworkInterfaceAttachmentType { return v.Attachments }).(GetNetworkInterfaceAttachmentTypeArrayOutput)
}

// The Availability Zone.
func (o LookupNetworkInterfaceResultOutput) AvailabilityZone() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) string { return v.AvailabilityZone }).(pulumi.StringOutput)
}

// Description of the network interface.
func (o LookupNetworkInterfaceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupNetworkInterfaceResultOutput) Filters() GetNetworkInterfaceFilterArrayOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) []GetNetworkInterfaceFilter { return v.Filters }).(GetNetworkInterfaceFilterArrayOutput)
}

func (o LookupNetworkInterfaceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) string { return v.Id }).(pulumi.StringOutput)
}

// The type of interface.
func (o LookupNetworkInterfaceResultOutput) InterfaceType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) string { return v.InterfaceType }).(pulumi.StringOutput)
}

// List of IPv6 addresses to assign to the ENI.
func (o LookupNetworkInterfaceResultOutput) Ipv6Addresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) []string { return v.Ipv6Addresses }).(pulumi.StringArrayOutput)
}

// The MAC address.
func (o LookupNetworkInterfaceResultOutput) MacAddress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) string { return v.MacAddress }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) of the Outpost.
func (o LookupNetworkInterfaceResultOutput) OutpostArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) string { return v.OutpostArn }).(pulumi.StringOutput)
}

// The AWS account ID of the owner of the network interface.
func (o LookupNetworkInterfaceResultOutput) OwnerId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) string { return v.OwnerId }).(pulumi.StringOutput)
}

// The private DNS name.
func (o LookupNetworkInterfaceResultOutput) PrivateDnsName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) string { return v.PrivateDnsName }).(pulumi.StringOutput)
}

// The private IPv4 address of the network interface within the subnet.
func (o LookupNetworkInterfaceResultOutput) PrivateIp() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) string { return v.PrivateIp }).(pulumi.StringOutput)
}

// The private IPv4 addresses associated with the network interface.
func (o LookupNetworkInterfaceResultOutput) PrivateIps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) []string { return v.PrivateIps }).(pulumi.StringArrayOutput)
}

// The ID of the entity that launched the instance on your behalf.
func (o LookupNetworkInterfaceResultOutput) RequesterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) string { return v.RequesterId }).(pulumi.StringOutput)
}

// The list of security groups for the network interface.
func (o LookupNetworkInterfaceResultOutput) SecurityGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) []string { return v.SecurityGroups }).(pulumi.StringArrayOutput)
}

// The ID of the subnet.
func (o LookupNetworkInterfaceResultOutput) SubnetId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) string { return v.SubnetId }).(pulumi.StringOutput)
}

// Any tags assigned to the network interface.
func (o LookupNetworkInterfaceResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// The ID of the VPC.
func (o LookupNetworkInterfaceResultOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkInterfaceResult) string { return v.VpcId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNetworkInterfaceResultOutput{})
}
