// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package lightsail

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates a domain entry resource
//
// > **NOTE on `id`:** In an effort to simplify imports, this resource `id` field has been updated to the standard resource id separator, a comma (`,`). For backward compatibility, the previous separator (underscore `_`) can still be used to read and import existing resources. When state is refreshed, the `id` will be updated to use the new standard separator. The previous separator will be deprecated in a future major release.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lightsail"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := lightsail.NewDomain(ctx, "test", &lightsail.DomainArgs{
//				DomainName: pulumi.String("mydomain.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = lightsail.NewDomainEntry(ctx, "test", &lightsail.DomainEntryArgs{
//				DomainName: pulumi.Any(domainTest.DomainName),
//				Name:       pulumi.String("www"),
//				Type:       pulumi.String("A"),
//				Target:     pulumi.String("127.0.0.1"),
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
// Using `pulumi import`, import `aws_lightsail_domain_entry` using the id attribute. For example:
//
// ```sh
// $ pulumi import aws:lightsail/domainEntry:DomainEntry example www,mydomain.com,A,127.0.0.1
// ```
type DomainEntry struct {
	pulumi.CustomResourceState

	// The name of the Lightsail domain in which to create the entry
	DomainName pulumi.StringOutput `pulumi:"domainName"`
	// If the entry should be an alias Defaults to `false`
	IsAlias pulumi.BoolPtrOutput `pulumi:"isAlias"`
	// Name of the entry record
	Name pulumi.StringOutput `pulumi:"name"`
	// Target of the domain entry
	Target pulumi.StringOutput `pulumi:"target"`
	// Type of record
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewDomainEntry registers a new resource with the given unique name, arguments, and options.
func NewDomainEntry(ctx *pulumi.Context,
	name string, args *DomainEntryArgs, opts ...pulumi.ResourceOption) (*DomainEntry, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DomainName == nil {
		return nil, errors.New("invalid value for required argument 'DomainName'")
	}
	if args.Target == nil {
		return nil, errors.New("invalid value for required argument 'Target'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DomainEntry
	err := ctx.RegisterResource("aws:lightsail/domainEntry:DomainEntry", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDomainEntry gets an existing DomainEntry resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDomainEntry(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DomainEntryState, opts ...pulumi.ResourceOption) (*DomainEntry, error) {
	var resource DomainEntry
	err := ctx.ReadResource("aws:lightsail/domainEntry:DomainEntry", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DomainEntry resources.
type domainEntryState struct {
	// The name of the Lightsail domain in which to create the entry
	DomainName *string `pulumi:"domainName"`
	// If the entry should be an alias Defaults to `false`
	IsAlias *bool `pulumi:"isAlias"`
	// Name of the entry record
	Name *string `pulumi:"name"`
	// Target of the domain entry
	Target *string `pulumi:"target"`
	// Type of record
	Type *string `pulumi:"type"`
}

type DomainEntryState struct {
	// The name of the Lightsail domain in which to create the entry
	DomainName pulumi.StringPtrInput
	// If the entry should be an alias Defaults to `false`
	IsAlias pulumi.BoolPtrInput
	// Name of the entry record
	Name pulumi.StringPtrInput
	// Target of the domain entry
	Target pulumi.StringPtrInput
	// Type of record
	Type pulumi.StringPtrInput
}

func (DomainEntryState) ElementType() reflect.Type {
	return reflect.TypeOf((*domainEntryState)(nil)).Elem()
}

type domainEntryArgs struct {
	// The name of the Lightsail domain in which to create the entry
	DomainName string `pulumi:"domainName"`
	// If the entry should be an alias Defaults to `false`
	IsAlias *bool `pulumi:"isAlias"`
	// Name of the entry record
	Name *string `pulumi:"name"`
	// Target of the domain entry
	Target string `pulumi:"target"`
	// Type of record
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a DomainEntry resource.
type DomainEntryArgs struct {
	// The name of the Lightsail domain in which to create the entry
	DomainName pulumi.StringInput
	// If the entry should be an alias Defaults to `false`
	IsAlias pulumi.BoolPtrInput
	// Name of the entry record
	Name pulumi.StringPtrInput
	// Target of the domain entry
	Target pulumi.StringInput
	// Type of record
	Type pulumi.StringInput
}

func (DomainEntryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*domainEntryArgs)(nil)).Elem()
}

type DomainEntryInput interface {
	pulumi.Input

	ToDomainEntryOutput() DomainEntryOutput
	ToDomainEntryOutputWithContext(ctx context.Context) DomainEntryOutput
}

func (*DomainEntry) ElementType() reflect.Type {
	return reflect.TypeOf((**DomainEntry)(nil)).Elem()
}

func (i *DomainEntry) ToDomainEntryOutput() DomainEntryOutput {
	return i.ToDomainEntryOutputWithContext(context.Background())
}

func (i *DomainEntry) ToDomainEntryOutputWithContext(ctx context.Context) DomainEntryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainEntryOutput)
}

// DomainEntryArrayInput is an input type that accepts DomainEntryArray and DomainEntryArrayOutput values.
// You can construct a concrete instance of `DomainEntryArrayInput` via:
//
//	DomainEntryArray{ DomainEntryArgs{...} }
type DomainEntryArrayInput interface {
	pulumi.Input

	ToDomainEntryArrayOutput() DomainEntryArrayOutput
	ToDomainEntryArrayOutputWithContext(context.Context) DomainEntryArrayOutput
}

type DomainEntryArray []DomainEntryInput

func (DomainEntryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DomainEntry)(nil)).Elem()
}

func (i DomainEntryArray) ToDomainEntryArrayOutput() DomainEntryArrayOutput {
	return i.ToDomainEntryArrayOutputWithContext(context.Background())
}

func (i DomainEntryArray) ToDomainEntryArrayOutputWithContext(ctx context.Context) DomainEntryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainEntryArrayOutput)
}

// DomainEntryMapInput is an input type that accepts DomainEntryMap and DomainEntryMapOutput values.
// You can construct a concrete instance of `DomainEntryMapInput` via:
//
//	DomainEntryMap{ "key": DomainEntryArgs{...} }
type DomainEntryMapInput interface {
	pulumi.Input

	ToDomainEntryMapOutput() DomainEntryMapOutput
	ToDomainEntryMapOutputWithContext(context.Context) DomainEntryMapOutput
}

type DomainEntryMap map[string]DomainEntryInput

func (DomainEntryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DomainEntry)(nil)).Elem()
}

func (i DomainEntryMap) ToDomainEntryMapOutput() DomainEntryMapOutput {
	return i.ToDomainEntryMapOutputWithContext(context.Background())
}

func (i DomainEntryMap) ToDomainEntryMapOutputWithContext(ctx context.Context) DomainEntryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainEntryMapOutput)
}

type DomainEntryOutput struct{ *pulumi.OutputState }

func (DomainEntryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DomainEntry)(nil)).Elem()
}

func (o DomainEntryOutput) ToDomainEntryOutput() DomainEntryOutput {
	return o
}

func (o DomainEntryOutput) ToDomainEntryOutputWithContext(ctx context.Context) DomainEntryOutput {
	return o
}

// The name of the Lightsail domain in which to create the entry
func (o DomainEntryOutput) DomainName() pulumi.StringOutput {
	return o.ApplyT(func(v *DomainEntry) pulumi.StringOutput { return v.DomainName }).(pulumi.StringOutput)
}

// If the entry should be an alias Defaults to `false`
func (o DomainEntryOutput) IsAlias() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *DomainEntry) pulumi.BoolPtrOutput { return v.IsAlias }).(pulumi.BoolPtrOutput)
}

// Name of the entry record
func (o DomainEntryOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DomainEntry) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Target of the domain entry
func (o DomainEntryOutput) Target() pulumi.StringOutput {
	return o.ApplyT(func(v *DomainEntry) pulumi.StringOutput { return v.Target }).(pulumi.StringOutput)
}

// Type of record
func (o DomainEntryOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *DomainEntry) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type DomainEntryArrayOutput struct{ *pulumi.OutputState }

func (DomainEntryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DomainEntry)(nil)).Elem()
}

func (o DomainEntryArrayOutput) ToDomainEntryArrayOutput() DomainEntryArrayOutput {
	return o
}

func (o DomainEntryArrayOutput) ToDomainEntryArrayOutputWithContext(ctx context.Context) DomainEntryArrayOutput {
	return o
}

func (o DomainEntryArrayOutput) Index(i pulumi.IntInput) DomainEntryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DomainEntry {
		return vs[0].([]*DomainEntry)[vs[1].(int)]
	}).(DomainEntryOutput)
}

type DomainEntryMapOutput struct{ *pulumi.OutputState }

func (DomainEntryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DomainEntry)(nil)).Elem()
}

func (o DomainEntryMapOutput) ToDomainEntryMapOutput() DomainEntryMapOutput {
	return o
}

func (o DomainEntryMapOutput) ToDomainEntryMapOutputWithContext(ctx context.Context) DomainEntryMapOutput {
	return o
}

func (o DomainEntryMapOutput) MapIndex(k pulumi.StringInput) DomainEntryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DomainEntry {
		return vs[0].(map[string]*DomainEntry)[vs[1].(string)]
	}).(DomainEntryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DomainEntryInput)(nil)).Elem(), &DomainEntry{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainEntryArrayInput)(nil)).Elem(), DomainEntryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainEntryMapInput)(nil)).Elem(), DomainEntryMap{})
	pulumi.RegisterOutputType(DomainEntryOutput{})
	pulumi.RegisterOutputType(DomainEntryArrayOutput{})
	pulumi.RegisterOutputType(DomainEntryMapOutput{})
}
