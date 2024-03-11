// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package waf

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a WAF Byte Match Set Resource
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/waf"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := waf.NewByteMatchSet(ctx, "byte_set", &waf.ByteMatchSetArgs{
//				Name: pulumi.String("my_waf_byte_match_set"),
//				ByteMatchTuples: waf.ByteMatchSetByteMatchTupleArray{
//					&waf.ByteMatchSetByteMatchTupleArgs{
//						TextTransformation:   pulumi.String("NONE"),
//						TargetString:         pulumi.String("badrefer1"),
//						PositionalConstraint: pulumi.String("CONTAINS"),
//						FieldToMatch: &waf.ByteMatchSetByteMatchTupleFieldToMatchArgs{
//							Type: pulumi.String("HEADER"),
//							Data: pulumi.String("referer"),
//						},
//					},
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import WAF Byte Match Set using the id. For example:
//
// ```sh
// $ pulumi import aws:waf/byteMatchSet:ByteMatchSet byte_set a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
// ```
type ByteMatchSet struct {
	pulumi.CustomResourceState

	// Specifies the bytes (typically a string that corresponds
	// with ASCII characters) that you want to search for in web requests,
	// the location in requests that you want to search, and other settings.
	ByteMatchTuples ByteMatchSetByteMatchTupleArrayOutput `pulumi:"byteMatchTuples"`
	// The name or description of the Byte Match Set.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewByteMatchSet registers a new resource with the given unique name, arguments, and options.
func NewByteMatchSet(ctx *pulumi.Context,
	name string, args *ByteMatchSetArgs, opts ...pulumi.ResourceOption) (*ByteMatchSet, error) {
	if args == nil {
		args = &ByteMatchSetArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ByteMatchSet
	err := ctx.RegisterResource("aws:waf/byteMatchSet:ByteMatchSet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetByteMatchSet gets an existing ByteMatchSet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetByteMatchSet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ByteMatchSetState, opts ...pulumi.ResourceOption) (*ByteMatchSet, error) {
	var resource ByteMatchSet
	err := ctx.ReadResource("aws:waf/byteMatchSet:ByteMatchSet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ByteMatchSet resources.
type byteMatchSetState struct {
	// Specifies the bytes (typically a string that corresponds
	// with ASCII characters) that you want to search for in web requests,
	// the location in requests that you want to search, and other settings.
	ByteMatchTuples []ByteMatchSetByteMatchTuple `pulumi:"byteMatchTuples"`
	// The name or description of the Byte Match Set.
	Name *string `pulumi:"name"`
}

type ByteMatchSetState struct {
	// Specifies the bytes (typically a string that corresponds
	// with ASCII characters) that you want to search for in web requests,
	// the location in requests that you want to search, and other settings.
	ByteMatchTuples ByteMatchSetByteMatchTupleArrayInput
	// The name or description of the Byte Match Set.
	Name pulumi.StringPtrInput
}

func (ByteMatchSetState) ElementType() reflect.Type {
	return reflect.TypeOf((*byteMatchSetState)(nil)).Elem()
}

type byteMatchSetArgs struct {
	// Specifies the bytes (typically a string that corresponds
	// with ASCII characters) that you want to search for in web requests,
	// the location in requests that you want to search, and other settings.
	ByteMatchTuples []ByteMatchSetByteMatchTuple `pulumi:"byteMatchTuples"`
	// The name or description of the Byte Match Set.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a ByteMatchSet resource.
type ByteMatchSetArgs struct {
	// Specifies the bytes (typically a string that corresponds
	// with ASCII characters) that you want to search for in web requests,
	// the location in requests that you want to search, and other settings.
	ByteMatchTuples ByteMatchSetByteMatchTupleArrayInput
	// The name or description of the Byte Match Set.
	Name pulumi.StringPtrInput
}

func (ByteMatchSetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*byteMatchSetArgs)(nil)).Elem()
}

type ByteMatchSetInput interface {
	pulumi.Input

	ToByteMatchSetOutput() ByteMatchSetOutput
	ToByteMatchSetOutputWithContext(ctx context.Context) ByteMatchSetOutput
}

func (*ByteMatchSet) ElementType() reflect.Type {
	return reflect.TypeOf((**ByteMatchSet)(nil)).Elem()
}

func (i *ByteMatchSet) ToByteMatchSetOutput() ByteMatchSetOutput {
	return i.ToByteMatchSetOutputWithContext(context.Background())
}

func (i *ByteMatchSet) ToByteMatchSetOutputWithContext(ctx context.Context) ByteMatchSetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ByteMatchSetOutput)
}

// ByteMatchSetArrayInput is an input type that accepts ByteMatchSetArray and ByteMatchSetArrayOutput values.
// You can construct a concrete instance of `ByteMatchSetArrayInput` via:
//
//	ByteMatchSetArray{ ByteMatchSetArgs{...} }
type ByteMatchSetArrayInput interface {
	pulumi.Input

	ToByteMatchSetArrayOutput() ByteMatchSetArrayOutput
	ToByteMatchSetArrayOutputWithContext(context.Context) ByteMatchSetArrayOutput
}

type ByteMatchSetArray []ByteMatchSetInput

func (ByteMatchSetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ByteMatchSet)(nil)).Elem()
}

func (i ByteMatchSetArray) ToByteMatchSetArrayOutput() ByteMatchSetArrayOutput {
	return i.ToByteMatchSetArrayOutputWithContext(context.Background())
}

func (i ByteMatchSetArray) ToByteMatchSetArrayOutputWithContext(ctx context.Context) ByteMatchSetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ByteMatchSetArrayOutput)
}

// ByteMatchSetMapInput is an input type that accepts ByteMatchSetMap and ByteMatchSetMapOutput values.
// You can construct a concrete instance of `ByteMatchSetMapInput` via:
//
//	ByteMatchSetMap{ "key": ByteMatchSetArgs{...} }
type ByteMatchSetMapInput interface {
	pulumi.Input

	ToByteMatchSetMapOutput() ByteMatchSetMapOutput
	ToByteMatchSetMapOutputWithContext(context.Context) ByteMatchSetMapOutput
}

type ByteMatchSetMap map[string]ByteMatchSetInput

func (ByteMatchSetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ByteMatchSet)(nil)).Elem()
}

func (i ByteMatchSetMap) ToByteMatchSetMapOutput() ByteMatchSetMapOutput {
	return i.ToByteMatchSetMapOutputWithContext(context.Background())
}

func (i ByteMatchSetMap) ToByteMatchSetMapOutputWithContext(ctx context.Context) ByteMatchSetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ByteMatchSetMapOutput)
}

type ByteMatchSetOutput struct{ *pulumi.OutputState }

func (ByteMatchSetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ByteMatchSet)(nil)).Elem()
}

func (o ByteMatchSetOutput) ToByteMatchSetOutput() ByteMatchSetOutput {
	return o
}

func (o ByteMatchSetOutput) ToByteMatchSetOutputWithContext(ctx context.Context) ByteMatchSetOutput {
	return o
}

// Specifies the bytes (typically a string that corresponds
// with ASCII characters) that you want to search for in web requests,
// the location in requests that you want to search, and other settings.
func (o ByteMatchSetOutput) ByteMatchTuples() ByteMatchSetByteMatchTupleArrayOutput {
	return o.ApplyT(func(v *ByteMatchSet) ByteMatchSetByteMatchTupleArrayOutput { return v.ByteMatchTuples }).(ByteMatchSetByteMatchTupleArrayOutput)
}

// The name or description of the Byte Match Set.
func (o ByteMatchSetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ByteMatchSet) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type ByteMatchSetArrayOutput struct{ *pulumi.OutputState }

func (ByteMatchSetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ByteMatchSet)(nil)).Elem()
}

func (o ByteMatchSetArrayOutput) ToByteMatchSetArrayOutput() ByteMatchSetArrayOutput {
	return o
}

func (o ByteMatchSetArrayOutput) ToByteMatchSetArrayOutputWithContext(ctx context.Context) ByteMatchSetArrayOutput {
	return o
}

func (o ByteMatchSetArrayOutput) Index(i pulumi.IntInput) ByteMatchSetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ByteMatchSet {
		return vs[0].([]*ByteMatchSet)[vs[1].(int)]
	}).(ByteMatchSetOutput)
}

type ByteMatchSetMapOutput struct{ *pulumi.OutputState }

func (ByteMatchSetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ByteMatchSet)(nil)).Elem()
}

func (o ByteMatchSetMapOutput) ToByteMatchSetMapOutput() ByteMatchSetMapOutput {
	return o
}

func (o ByteMatchSetMapOutput) ToByteMatchSetMapOutputWithContext(ctx context.Context) ByteMatchSetMapOutput {
	return o
}

func (o ByteMatchSetMapOutput) MapIndex(k pulumi.StringInput) ByteMatchSetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ByteMatchSet {
		return vs[0].(map[string]*ByteMatchSet)[vs[1].(string)]
	}).(ByteMatchSetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ByteMatchSetInput)(nil)).Elem(), &ByteMatchSet{})
	pulumi.RegisterInputType(reflect.TypeOf((*ByteMatchSetArrayInput)(nil)).Elem(), ByteMatchSetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ByteMatchSetMapInput)(nil)).Elem(), ByteMatchSetMap{})
	pulumi.RegisterOutputType(ByteMatchSetOutput{})
	pulumi.RegisterOutputType(ByteMatchSetArrayOutput{})
	pulumi.RegisterOutputType(ByteMatchSetMapOutput{})
}
