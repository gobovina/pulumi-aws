// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecr

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Elastic Container Registry Scanning Configuration. Can't be completely deleted, instead reverts to the default `BASIC` scanning configuration without rules.
//
// ## Example Usage
// ### Basic example
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ecr"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ecr.NewRegistryScanningConfiguration(ctx, "configuration", &ecr.RegistryScanningConfigurationArgs{
//				ScanType: pulumi.String("ENHANCED"),
//				Rules: ecr.RegistryScanningConfigurationRuleArray{
//					&ecr.RegistryScanningConfigurationRuleArgs{
//						ScanFrequency: pulumi.String("CONTINUOUS_SCAN"),
//						RepositoryFilters: ecr.RegistryScanningConfigurationRuleRepositoryFilterArray{
//							&ecr.RegistryScanningConfigurationRuleRepositoryFilterArgs{
//								Filter:     pulumi.String("example"),
//								FilterType: pulumi.String("WILDCARD"),
//							},
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
// ### Multiple rules
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ecr"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ecr.NewRegistryScanningConfiguration(ctx, "test", &ecr.RegistryScanningConfigurationArgs{
//				ScanType: pulumi.String("ENHANCED"),
//				Rules: ecr.RegistryScanningConfigurationRuleArray{
//					&ecr.RegistryScanningConfigurationRuleArgs{
//						ScanFrequency: pulumi.String("SCAN_ON_PUSH"),
//						RepositoryFilters: ecr.RegistryScanningConfigurationRuleRepositoryFilterArray{
//							&ecr.RegistryScanningConfigurationRuleRepositoryFilterArgs{
//								Filter:     pulumi.String("*"),
//								FilterType: pulumi.String("WILDCARD"),
//							},
//						},
//					},
//					&ecr.RegistryScanningConfigurationRuleArgs{
//						ScanFrequency: pulumi.String("CONTINUOUS_SCAN"),
//						RepositoryFilters: ecr.RegistryScanningConfigurationRuleRepositoryFilterArray{
//							&ecr.RegistryScanningConfigurationRuleRepositoryFilterArgs{
//								Filter:     pulumi.String("example"),
//								FilterType: pulumi.String("WILDCARD"),
//							},
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
//
// ## Import
//
// Using `pulumi import`, import ECR Scanning Configurations using the `registry_id`. For example:
//
// ```sh
//
//	$ pulumi import aws:ecr/registryScanningConfiguration:RegistryScanningConfiguration example 012345678901
//
// ```
type RegistryScanningConfiguration struct {
	pulumi.CustomResourceState

	// The registry ID the scanning configuration applies to.
	RegistryId pulumi.StringOutput `pulumi:"registryId"`
	// One or multiple blocks specifying scanning rules to determine which repository filters are used and at what frequency scanning will occur. See below for schema.
	Rules RegistryScanningConfigurationRuleArrayOutput `pulumi:"rules"`
	// the scanning type to set for the registry. Can be either `ENHANCED` or `BASIC`.
	ScanType pulumi.StringOutput `pulumi:"scanType"`
}

// NewRegistryScanningConfiguration registers a new resource with the given unique name, arguments, and options.
func NewRegistryScanningConfiguration(ctx *pulumi.Context,
	name string, args *RegistryScanningConfigurationArgs, opts ...pulumi.ResourceOption) (*RegistryScanningConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ScanType == nil {
		return nil, errors.New("invalid value for required argument 'ScanType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RegistryScanningConfiguration
	err := ctx.RegisterResource("aws:ecr/registryScanningConfiguration:RegistryScanningConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRegistryScanningConfiguration gets an existing RegistryScanningConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRegistryScanningConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RegistryScanningConfigurationState, opts ...pulumi.ResourceOption) (*RegistryScanningConfiguration, error) {
	var resource RegistryScanningConfiguration
	err := ctx.ReadResource("aws:ecr/registryScanningConfiguration:RegistryScanningConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RegistryScanningConfiguration resources.
type registryScanningConfigurationState struct {
	// The registry ID the scanning configuration applies to.
	RegistryId *string `pulumi:"registryId"`
	// One or multiple blocks specifying scanning rules to determine which repository filters are used and at what frequency scanning will occur. See below for schema.
	Rules []RegistryScanningConfigurationRule `pulumi:"rules"`
	// the scanning type to set for the registry. Can be either `ENHANCED` or `BASIC`.
	ScanType *string `pulumi:"scanType"`
}

type RegistryScanningConfigurationState struct {
	// The registry ID the scanning configuration applies to.
	RegistryId pulumi.StringPtrInput
	// One or multiple blocks specifying scanning rules to determine which repository filters are used and at what frequency scanning will occur. See below for schema.
	Rules RegistryScanningConfigurationRuleArrayInput
	// the scanning type to set for the registry. Can be either `ENHANCED` or `BASIC`.
	ScanType pulumi.StringPtrInput
}

func (RegistryScanningConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*registryScanningConfigurationState)(nil)).Elem()
}

type registryScanningConfigurationArgs struct {
	// One or multiple blocks specifying scanning rules to determine which repository filters are used and at what frequency scanning will occur. See below for schema.
	Rules []RegistryScanningConfigurationRule `pulumi:"rules"`
	// the scanning type to set for the registry. Can be either `ENHANCED` or `BASIC`.
	ScanType string `pulumi:"scanType"`
}

// The set of arguments for constructing a RegistryScanningConfiguration resource.
type RegistryScanningConfigurationArgs struct {
	// One or multiple blocks specifying scanning rules to determine which repository filters are used and at what frequency scanning will occur. See below for schema.
	Rules RegistryScanningConfigurationRuleArrayInput
	// the scanning type to set for the registry. Can be either `ENHANCED` or `BASIC`.
	ScanType pulumi.StringInput
}

func (RegistryScanningConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*registryScanningConfigurationArgs)(nil)).Elem()
}

type RegistryScanningConfigurationInput interface {
	pulumi.Input

	ToRegistryScanningConfigurationOutput() RegistryScanningConfigurationOutput
	ToRegistryScanningConfigurationOutputWithContext(ctx context.Context) RegistryScanningConfigurationOutput
}

func (*RegistryScanningConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**RegistryScanningConfiguration)(nil)).Elem()
}

func (i *RegistryScanningConfiguration) ToRegistryScanningConfigurationOutput() RegistryScanningConfigurationOutput {
	return i.ToRegistryScanningConfigurationOutputWithContext(context.Background())
}

func (i *RegistryScanningConfiguration) ToRegistryScanningConfigurationOutputWithContext(ctx context.Context) RegistryScanningConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryScanningConfigurationOutput)
}

// RegistryScanningConfigurationArrayInput is an input type that accepts RegistryScanningConfigurationArray and RegistryScanningConfigurationArrayOutput values.
// You can construct a concrete instance of `RegistryScanningConfigurationArrayInput` via:
//
//	RegistryScanningConfigurationArray{ RegistryScanningConfigurationArgs{...} }
type RegistryScanningConfigurationArrayInput interface {
	pulumi.Input

	ToRegistryScanningConfigurationArrayOutput() RegistryScanningConfigurationArrayOutput
	ToRegistryScanningConfigurationArrayOutputWithContext(context.Context) RegistryScanningConfigurationArrayOutput
}

type RegistryScanningConfigurationArray []RegistryScanningConfigurationInput

func (RegistryScanningConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RegistryScanningConfiguration)(nil)).Elem()
}

func (i RegistryScanningConfigurationArray) ToRegistryScanningConfigurationArrayOutput() RegistryScanningConfigurationArrayOutput {
	return i.ToRegistryScanningConfigurationArrayOutputWithContext(context.Background())
}

func (i RegistryScanningConfigurationArray) ToRegistryScanningConfigurationArrayOutputWithContext(ctx context.Context) RegistryScanningConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryScanningConfigurationArrayOutput)
}

// RegistryScanningConfigurationMapInput is an input type that accepts RegistryScanningConfigurationMap and RegistryScanningConfigurationMapOutput values.
// You can construct a concrete instance of `RegistryScanningConfigurationMapInput` via:
//
//	RegistryScanningConfigurationMap{ "key": RegistryScanningConfigurationArgs{...} }
type RegistryScanningConfigurationMapInput interface {
	pulumi.Input

	ToRegistryScanningConfigurationMapOutput() RegistryScanningConfigurationMapOutput
	ToRegistryScanningConfigurationMapOutputWithContext(context.Context) RegistryScanningConfigurationMapOutput
}

type RegistryScanningConfigurationMap map[string]RegistryScanningConfigurationInput

func (RegistryScanningConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RegistryScanningConfiguration)(nil)).Elem()
}

func (i RegistryScanningConfigurationMap) ToRegistryScanningConfigurationMapOutput() RegistryScanningConfigurationMapOutput {
	return i.ToRegistryScanningConfigurationMapOutputWithContext(context.Background())
}

func (i RegistryScanningConfigurationMap) ToRegistryScanningConfigurationMapOutputWithContext(ctx context.Context) RegistryScanningConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryScanningConfigurationMapOutput)
}

type RegistryScanningConfigurationOutput struct{ *pulumi.OutputState }

func (RegistryScanningConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RegistryScanningConfiguration)(nil)).Elem()
}

func (o RegistryScanningConfigurationOutput) ToRegistryScanningConfigurationOutput() RegistryScanningConfigurationOutput {
	return o
}

func (o RegistryScanningConfigurationOutput) ToRegistryScanningConfigurationOutputWithContext(ctx context.Context) RegistryScanningConfigurationOutput {
	return o
}

// The registry ID the scanning configuration applies to.
func (o RegistryScanningConfigurationOutput) RegistryId() pulumi.StringOutput {
	return o.ApplyT(func(v *RegistryScanningConfiguration) pulumi.StringOutput { return v.RegistryId }).(pulumi.StringOutput)
}

// One or multiple blocks specifying scanning rules to determine which repository filters are used and at what frequency scanning will occur. See below for schema.
func (o RegistryScanningConfigurationOutput) Rules() RegistryScanningConfigurationRuleArrayOutput {
	return o.ApplyT(func(v *RegistryScanningConfiguration) RegistryScanningConfigurationRuleArrayOutput { return v.Rules }).(RegistryScanningConfigurationRuleArrayOutput)
}

// the scanning type to set for the registry. Can be either `ENHANCED` or `BASIC`.
func (o RegistryScanningConfigurationOutput) ScanType() pulumi.StringOutput {
	return o.ApplyT(func(v *RegistryScanningConfiguration) pulumi.StringOutput { return v.ScanType }).(pulumi.StringOutput)
}

type RegistryScanningConfigurationArrayOutput struct{ *pulumi.OutputState }

func (RegistryScanningConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RegistryScanningConfiguration)(nil)).Elem()
}

func (o RegistryScanningConfigurationArrayOutput) ToRegistryScanningConfigurationArrayOutput() RegistryScanningConfigurationArrayOutput {
	return o
}

func (o RegistryScanningConfigurationArrayOutput) ToRegistryScanningConfigurationArrayOutputWithContext(ctx context.Context) RegistryScanningConfigurationArrayOutput {
	return o
}

func (o RegistryScanningConfigurationArrayOutput) Index(i pulumi.IntInput) RegistryScanningConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RegistryScanningConfiguration {
		return vs[0].([]*RegistryScanningConfiguration)[vs[1].(int)]
	}).(RegistryScanningConfigurationOutput)
}

type RegistryScanningConfigurationMapOutput struct{ *pulumi.OutputState }

func (RegistryScanningConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RegistryScanningConfiguration)(nil)).Elem()
}

func (o RegistryScanningConfigurationMapOutput) ToRegistryScanningConfigurationMapOutput() RegistryScanningConfigurationMapOutput {
	return o
}

func (o RegistryScanningConfigurationMapOutput) ToRegistryScanningConfigurationMapOutputWithContext(ctx context.Context) RegistryScanningConfigurationMapOutput {
	return o
}

func (o RegistryScanningConfigurationMapOutput) MapIndex(k pulumi.StringInput) RegistryScanningConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RegistryScanningConfiguration {
		return vs[0].(map[string]*RegistryScanningConfiguration)[vs[1].(string)]
	}).(RegistryScanningConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RegistryScanningConfigurationInput)(nil)).Elem(), &RegistryScanningConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*RegistryScanningConfigurationArrayInput)(nil)).Elem(), RegistryScanningConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RegistryScanningConfigurationMapInput)(nil)).Elem(), RegistryScanningConfigurationMap{})
	pulumi.RegisterOutputType(RegistryScanningConfigurationOutput{})
	pulumi.RegisterOutputType(RegistryScanningConfigurationArrayOutput{})
	pulumi.RegisterOutputType(RegistryScanningConfigurationMapOutput{})
}
