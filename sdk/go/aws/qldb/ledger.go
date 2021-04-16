// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package qldb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AWS Quantum Ledger Database (QLDB) resource
//
// > **NOTE:** Deletion protection is enabled by default. To successfully delete this resource via this provider, `deletionProtection = false` must be applied before attempting deletion.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/qldb"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := qldb.NewLedger(ctx, "sample_ledger", nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// QLDB Ledgers can be imported using the `name`, e.g.
//
// ```sh
//  $ pulumi import aws:qldb/ledger:Ledger sample-ledger sample-ledger
// ```
type Ledger struct {
	pulumi.CustomResourceState

	// The ARN of the QLDB Ledger
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via this provider, this value must be configured to `false` and applied first before attempting deletion.
	DeletionProtection pulumi.BoolPtrOutput `pulumi:"deletionProtection"`
	// The friendly name for the QLDB Ledger instance. This is atuo generated by default.
	Name pulumi.StringOutput `pulumi:"name"`
	// Key-value mapping of resource tags
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewLedger registers a new resource with the given unique name, arguments, and options.
func NewLedger(ctx *pulumi.Context,
	name string, args *LedgerArgs, opts ...pulumi.ResourceOption) (*Ledger, error) {
	if args == nil {
		args = &LedgerArgs{}
	}

	var resource Ledger
	err := ctx.RegisterResource("aws:qldb/ledger:Ledger", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLedger gets an existing Ledger resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLedger(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LedgerState, opts ...pulumi.ResourceOption) (*Ledger, error) {
	var resource Ledger
	err := ctx.ReadResource("aws:qldb/ledger:Ledger", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Ledger resources.
type ledgerState struct {
	// The ARN of the QLDB Ledger
	Arn *string `pulumi:"arn"`
	// The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via this provider, this value must be configured to `false` and applied first before attempting deletion.
	DeletionProtection *bool `pulumi:"deletionProtection"`
	// The friendly name for the QLDB Ledger instance. This is atuo generated by default.
	Name *string `pulumi:"name"`
	// Key-value mapping of resource tags
	Tags map[string]string `pulumi:"tags"`
}

type LedgerState struct {
	// The ARN of the QLDB Ledger
	Arn pulumi.StringPtrInput
	// The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via this provider, this value must be configured to `false` and applied first before attempting deletion.
	DeletionProtection pulumi.BoolPtrInput
	// The friendly name for the QLDB Ledger instance. This is atuo generated by default.
	Name pulumi.StringPtrInput
	// Key-value mapping of resource tags
	Tags pulumi.StringMapInput
}

func (LedgerState) ElementType() reflect.Type {
	return reflect.TypeOf((*ledgerState)(nil)).Elem()
}

type ledgerArgs struct {
	// The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via this provider, this value must be configured to `false` and applied first before attempting deletion.
	DeletionProtection *bool `pulumi:"deletionProtection"`
	// The friendly name for the QLDB Ledger instance. This is atuo generated by default.
	Name *string `pulumi:"name"`
	// Key-value mapping of resource tags
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Ledger resource.
type LedgerArgs struct {
	// The deletion protection for the QLDB Ledger instance. By default it is `true`. To delete this resource via this provider, this value must be configured to `false` and applied first before attempting deletion.
	DeletionProtection pulumi.BoolPtrInput
	// The friendly name for the QLDB Ledger instance. This is atuo generated by default.
	Name pulumi.StringPtrInput
	// Key-value mapping of resource tags
	Tags pulumi.StringMapInput
}

func (LedgerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ledgerArgs)(nil)).Elem()
}

type LedgerInput interface {
	pulumi.Input

	ToLedgerOutput() LedgerOutput
	ToLedgerOutputWithContext(ctx context.Context) LedgerOutput
}

func (*Ledger) ElementType() reflect.Type {
	return reflect.TypeOf((*Ledger)(nil))
}

func (i *Ledger) ToLedgerOutput() LedgerOutput {
	return i.ToLedgerOutputWithContext(context.Background())
}

func (i *Ledger) ToLedgerOutputWithContext(ctx context.Context) LedgerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LedgerOutput)
}

func (i *Ledger) ToLedgerPtrOutput() LedgerPtrOutput {
	return i.ToLedgerPtrOutputWithContext(context.Background())
}

func (i *Ledger) ToLedgerPtrOutputWithContext(ctx context.Context) LedgerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LedgerPtrOutput)
}

type LedgerPtrInput interface {
	pulumi.Input

	ToLedgerPtrOutput() LedgerPtrOutput
	ToLedgerPtrOutputWithContext(ctx context.Context) LedgerPtrOutput
}

type ledgerPtrType LedgerArgs

func (*ledgerPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Ledger)(nil))
}

func (i *ledgerPtrType) ToLedgerPtrOutput() LedgerPtrOutput {
	return i.ToLedgerPtrOutputWithContext(context.Background())
}

func (i *ledgerPtrType) ToLedgerPtrOutputWithContext(ctx context.Context) LedgerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LedgerPtrOutput)
}

// LedgerArrayInput is an input type that accepts LedgerArray and LedgerArrayOutput values.
// You can construct a concrete instance of `LedgerArrayInput` via:
//
//          LedgerArray{ LedgerArgs{...} }
type LedgerArrayInput interface {
	pulumi.Input

	ToLedgerArrayOutput() LedgerArrayOutput
	ToLedgerArrayOutputWithContext(context.Context) LedgerArrayOutput
}

type LedgerArray []LedgerInput

func (LedgerArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Ledger)(nil))
}

func (i LedgerArray) ToLedgerArrayOutput() LedgerArrayOutput {
	return i.ToLedgerArrayOutputWithContext(context.Background())
}

func (i LedgerArray) ToLedgerArrayOutputWithContext(ctx context.Context) LedgerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LedgerArrayOutput)
}

// LedgerMapInput is an input type that accepts LedgerMap and LedgerMapOutput values.
// You can construct a concrete instance of `LedgerMapInput` via:
//
//          LedgerMap{ "key": LedgerArgs{...} }
type LedgerMapInput interface {
	pulumi.Input

	ToLedgerMapOutput() LedgerMapOutput
	ToLedgerMapOutputWithContext(context.Context) LedgerMapOutput
}

type LedgerMap map[string]LedgerInput

func (LedgerMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Ledger)(nil))
}

func (i LedgerMap) ToLedgerMapOutput() LedgerMapOutput {
	return i.ToLedgerMapOutputWithContext(context.Background())
}

func (i LedgerMap) ToLedgerMapOutputWithContext(ctx context.Context) LedgerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LedgerMapOutput)
}

type LedgerOutput struct {
	*pulumi.OutputState
}

func (LedgerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Ledger)(nil))
}

func (o LedgerOutput) ToLedgerOutput() LedgerOutput {
	return o
}

func (o LedgerOutput) ToLedgerOutputWithContext(ctx context.Context) LedgerOutput {
	return o
}

func (o LedgerOutput) ToLedgerPtrOutput() LedgerPtrOutput {
	return o.ToLedgerPtrOutputWithContext(context.Background())
}

func (o LedgerOutput) ToLedgerPtrOutputWithContext(ctx context.Context) LedgerPtrOutput {
	return o.ApplyT(func(v Ledger) *Ledger {
		return &v
	}).(LedgerPtrOutput)
}

type LedgerPtrOutput struct {
	*pulumi.OutputState
}

func (LedgerPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Ledger)(nil))
}

func (o LedgerPtrOutput) ToLedgerPtrOutput() LedgerPtrOutput {
	return o
}

func (o LedgerPtrOutput) ToLedgerPtrOutputWithContext(ctx context.Context) LedgerPtrOutput {
	return o
}

type LedgerArrayOutput struct{ *pulumi.OutputState }

func (LedgerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Ledger)(nil))
}

func (o LedgerArrayOutput) ToLedgerArrayOutput() LedgerArrayOutput {
	return o
}

func (o LedgerArrayOutput) ToLedgerArrayOutputWithContext(ctx context.Context) LedgerArrayOutput {
	return o
}

func (o LedgerArrayOutput) Index(i pulumi.IntInput) LedgerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Ledger {
		return vs[0].([]Ledger)[vs[1].(int)]
	}).(LedgerOutput)
}

type LedgerMapOutput struct{ *pulumi.OutputState }

func (LedgerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Ledger)(nil))
}

func (o LedgerMapOutput) ToLedgerMapOutput() LedgerMapOutput {
	return o
}

func (o LedgerMapOutput) ToLedgerMapOutputWithContext(ctx context.Context) LedgerMapOutput {
	return o
}

func (o LedgerMapOutput) MapIndex(k pulumi.StringInput) LedgerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Ledger {
		return vs[0].(map[string]Ledger)[vs[1].(string)]
	}).(LedgerOutput)
}

func init() {
	pulumi.RegisterOutputType(LedgerOutput{})
	pulumi.RegisterOutputType(LedgerPtrOutput{})
	pulumi.RegisterOutputType(LedgerArrayOutput{})
	pulumi.RegisterOutputType(LedgerMapOutput{})
}
