// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package directoryservice

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a conditional forwarder for managed Microsoft AD in AWS Directory Service.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/directoryservice"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := directoryservice.NewConditionalForwader(ctx, "example", &directoryservice.ConditionalForwaderArgs{
//				DirectoryId:      pulumi.Any(ad.Id),
//				RemoteDomainName: pulumi.String("example.com"),
//				DnsIps: pulumi.StringArray{
//					pulumi.String("8.8.8.8"),
//					pulumi.String("8.8.4.4"),
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
//
// ## Import
//
// Using `pulumi import`, import conditional forwarders using the directory id and remote_domain_name. For example:
//
// ```sh
//
//	$ pulumi import aws:directoryservice/conditionalForwader:ConditionalForwader example d-1234567890:example.com
//
// ```
type ConditionalForwader struct {
	pulumi.CustomResourceState

	// ID of directory.
	DirectoryId pulumi.StringOutput `pulumi:"directoryId"`
	// A list of forwarder IP addresses.
	DnsIps pulumi.StringArrayOutput `pulumi:"dnsIps"`
	// The fully qualified domain name of the remote domain for which forwarders will be used.
	RemoteDomainName pulumi.StringOutput `pulumi:"remoteDomainName"`
}

// NewConditionalForwader registers a new resource with the given unique name, arguments, and options.
func NewConditionalForwader(ctx *pulumi.Context,
	name string, args *ConditionalForwaderArgs, opts ...pulumi.ResourceOption) (*ConditionalForwader, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DirectoryId == nil {
		return nil, errors.New("invalid value for required argument 'DirectoryId'")
	}
	if args.DnsIps == nil {
		return nil, errors.New("invalid value for required argument 'DnsIps'")
	}
	if args.RemoteDomainName == nil {
		return nil, errors.New("invalid value for required argument 'RemoteDomainName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ConditionalForwader
	err := ctx.RegisterResource("aws:directoryservice/conditionalForwader:ConditionalForwader", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConditionalForwader gets an existing ConditionalForwader resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConditionalForwader(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConditionalForwaderState, opts ...pulumi.ResourceOption) (*ConditionalForwader, error) {
	var resource ConditionalForwader
	err := ctx.ReadResource("aws:directoryservice/conditionalForwader:ConditionalForwader", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ConditionalForwader resources.
type conditionalForwaderState struct {
	// ID of directory.
	DirectoryId *string `pulumi:"directoryId"`
	// A list of forwarder IP addresses.
	DnsIps []string `pulumi:"dnsIps"`
	// The fully qualified domain name of the remote domain for which forwarders will be used.
	RemoteDomainName *string `pulumi:"remoteDomainName"`
}

type ConditionalForwaderState struct {
	// ID of directory.
	DirectoryId pulumi.StringPtrInput
	// A list of forwarder IP addresses.
	DnsIps pulumi.StringArrayInput
	// The fully qualified domain name of the remote domain for which forwarders will be used.
	RemoteDomainName pulumi.StringPtrInput
}

func (ConditionalForwaderState) ElementType() reflect.Type {
	return reflect.TypeOf((*conditionalForwaderState)(nil)).Elem()
}

type conditionalForwaderArgs struct {
	// ID of directory.
	DirectoryId string `pulumi:"directoryId"`
	// A list of forwarder IP addresses.
	DnsIps []string `pulumi:"dnsIps"`
	// The fully qualified domain name of the remote domain for which forwarders will be used.
	RemoteDomainName string `pulumi:"remoteDomainName"`
}

// The set of arguments for constructing a ConditionalForwader resource.
type ConditionalForwaderArgs struct {
	// ID of directory.
	DirectoryId pulumi.StringInput
	// A list of forwarder IP addresses.
	DnsIps pulumi.StringArrayInput
	// The fully qualified domain name of the remote domain for which forwarders will be used.
	RemoteDomainName pulumi.StringInput
}

func (ConditionalForwaderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*conditionalForwaderArgs)(nil)).Elem()
}

type ConditionalForwaderInput interface {
	pulumi.Input

	ToConditionalForwaderOutput() ConditionalForwaderOutput
	ToConditionalForwaderOutputWithContext(ctx context.Context) ConditionalForwaderOutput
}

func (*ConditionalForwader) ElementType() reflect.Type {
	return reflect.TypeOf((**ConditionalForwader)(nil)).Elem()
}

func (i *ConditionalForwader) ToConditionalForwaderOutput() ConditionalForwaderOutput {
	return i.ToConditionalForwaderOutputWithContext(context.Background())
}

func (i *ConditionalForwader) ToConditionalForwaderOutputWithContext(ctx context.Context) ConditionalForwaderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConditionalForwaderOutput)
}

// ConditionalForwaderArrayInput is an input type that accepts ConditionalForwaderArray and ConditionalForwaderArrayOutput values.
// You can construct a concrete instance of `ConditionalForwaderArrayInput` via:
//
//	ConditionalForwaderArray{ ConditionalForwaderArgs{...} }
type ConditionalForwaderArrayInput interface {
	pulumi.Input

	ToConditionalForwaderArrayOutput() ConditionalForwaderArrayOutput
	ToConditionalForwaderArrayOutputWithContext(context.Context) ConditionalForwaderArrayOutput
}

type ConditionalForwaderArray []ConditionalForwaderInput

func (ConditionalForwaderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConditionalForwader)(nil)).Elem()
}

func (i ConditionalForwaderArray) ToConditionalForwaderArrayOutput() ConditionalForwaderArrayOutput {
	return i.ToConditionalForwaderArrayOutputWithContext(context.Background())
}

func (i ConditionalForwaderArray) ToConditionalForwaderArrayOutputWithContext(ctx context.Context) ConditionalForwaderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConditionalForwaderArrayOutput)
}

// ConditionalForwaderMapInput is an input type that accepts ConditionalForwaderMap and ConditionalForwaderMapOutput values.
// You can construct a concrete instance of `ConditionalForwaderMapInput` via:
//
//	ConditionalForwaderMap{ "key": ConditionalForwaderArgs{...} }
type ConditionalForwaderMapInput interface {
	pulumi.Input

	ToConditionalForwaderMapOutput() ConditionalForwaderMapOutput
	ToConditionalForwaderMapOutputWithContext(context.Context) ConditionalForwaderMapOutput
}

type ConditionalForwaderMap map[string]ConditionalForwaderInput

func (ConditionalForwaderMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConditionalForwader)(nil)).Elem()
}

func (i ConditionalForwaderMap) ToConditionalForwaderMapOutput() ConditionalForwaderMapOutput {
	return i.ToConditionalForwaderMapOutputWithContext(context.Background())
}

func (i ConditionalForwaderMap) ToConditionalForwaderMapOutputWithContext(ctx context.Context) ConditionalForwaderMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConditionalForwaderMapOutput)
}

type ConditionalForwaderOutput struct{ *pulumi.OutputState }

func (ConditionalForwaderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ConditionalForwader)(nil)).Elem()
}

func (o ConditionalForwaderOutput) ToConditionalForwaderOutput() ConditionalForwaderOutput {
	return o
}

func (o ConditionalForwaderOutput) ToConditionalForwaderOutputWithContext(ctx context.Context) ConditionalForwaderOutput {
	return o
}

// ID of directory.
func (o ConditionalForwaderOutput) DirectoryId() pulumi.StringOutput {
	return o.ApplyT(func(v *ConditionalForwader) pulumi.StringOutput { return v.DirectoryId }).(pulumi.StringOutput)
}

// A list of forwarder IP addresses.
func (o ConditionalForwaderOutput) DnsIps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ConditionalForwader) pulumi.StringArrayOutput { return v.DnsIps }).(pulumi.StringArrayOutput)
}

// The fully qualified domain name of the remote domain for which forwarders will be used.
func (o ConditionalForwaderOutput) RemoteDomainName() pulumi.StringOutput {
	return o.ApplyT(func(v *ConditionalForwader) pulumi.StringOutput { return v.RemoteDomainName }).(pulumi.StringOutput)
}

type ConditionalForwaderArrayOutput struct{ *pulumi.OutputState }

func (ConditionalForwaderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConditionalForwader)(nil)).Elem()
}

func (o ConditionalForwaderArrayOutput) ToConditionalForwaderArrayOutput() ConditionalForwaderArrayOutput {
	return o
}

func (o ConditionalForwaderArrayOutput) ToConditionalForwaderArrayOutputWithContext(ctx context.Context) ConditionalForwaderArrayOutput {
	return o
}

func (o ConditionalForwaderArrayOutput) Index(i pulumi.IntInput) ConditionalForwaderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConditionalForwader {
		return vs[0].([]*ConditionalForwader)[vs[1].(int)]
	}).(ConditionalForwaderOutput)
}

type ConditionalForwaderMapOutput struct{ *pulumi.OutputState }

func (ConditionalForwaderMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConditionalForwader)(nil)).Elem()
}

func (o ConditionalForwaderMapOutput) ToConditionalForwaderMapOutput() ConditionalForwaderMapOutput {
	return o
}

func (o ConditionalForwaderMapOutput) ToConditionalForwaderMapOutputWithContext(ctx context.Context) ConditionalForwaderMapOutput {
	return o
}

func (o ConditionalForwaderMapOutput) MapIndex(k pulumi.StringInput) ConditionalForwaderOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConditionalForwader {
		return vs[0].(map[string]*ConditionalForwader)[vs[1].(string)]
	}).(ConditionalForwaderOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConditionalForwaderInput)(nil)).Elem(), &ConditionalForwader{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConditionalForwaderArrayInput)(nil)).Elem(), ConditionalForwaderArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConditionalForwaderMapInput)(nil)).Elem(), ConditionalForwaderMap{})
	pulumi.RegisterOutputType(ConditionalForwaderOutput{})
	pulumi.RegisterOutputType(ConditionalForwaderArrayOutput{})
	pulumi.RegisterOutputType(ConditionalForwaderMapOutput{})
}
