// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package imagebuilder

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Image Builder Distribution Configuration.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/imagebuilder"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := imagebuilder.NewDistributionConfiguration(ctx, "example", &imagebuilder.DistributionConfigurationArgs{
//				Name: pulumi.String("example"),
//				Distributions: imagebuilder.DistributionConfigurationDistributionArray{
//					&imagebuilder.DistributionConfigurationDistributionArgs{
//						AmiDistributionConfiguration: &imagebuilder.DistributionConfigurationDistributionAmiDistributionConfigurationArgs{
//							AmiTags: pulumi.StringMap{
//								"CostCenter": pulumi.String("IT"),
//							},
//							Name: pulumi.String("example-{{ imagebuilder:buildDate }}"),
//							LaunchPermission: &imagebuilder.DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionArgs{
//								UserIds: pulumi.StringArray{
//									pulumi.String("123456789012"),
//								},
//							},
//						},
//						LaunchTemplateConfigurations: imagebuilder.DistributionConfigurationDistributionLaunchTemplateConfigurationArray{
//							&imagebuilder.DistributionConfigurationDistributionLaunchTemplateConfigurationArgs{
//								LaunchTemplateId: pulumi.String("lt-0aaa1bcde2ff3456"),
//							},
//						},
//						Region: pulumi.String("us-east-1"),
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
// Using `pulumi import`, import `aws_imagebuilder_distribution_configurations` resources using the Amazon Resource Name (ARN). For example:
//
// ```sh
// $ pulumi import aws:imagebuilder/distributionConfiguration:DistributionConfiguration example arn:aws:imagebuilder:us-east-1:123456789012:distribution-configuration/example
// ```
type DistributionConfiguration struct {
	pulumi.CustomResourceState

	// (Required) Amazon Resource Name (ARN) of the distribution configuration.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Date the distribution configuration was created.
	DateCreated pulumi.StringOutput `pulumi:"dateCreated"`
	// Date the distribution configuration was updated.
	DateUpdated pulumi.StringOutput `pulumi:"dateUpdated"`
	// Description of the distribution configuration.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// One or more configuration blocks with distribution settings. Detailed below.
	//
	// The following arguments are optional:
	Distributions DistributionConfigurationDistributionArrayOutput `pulumi:"distributions"`
	// Name of the distribution configuration.
	Name pulumi.StringOutput `pulumi:"name"`
	// Key-value map of resource tags for the distribution configuration. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewDistributionConfiguration registers a new resource with the given unique name, arguments, and options.
func NewDistributionConfiguration(ctx *pulumi.Context,
	name string, args *DistributionConfigurationArgs, opts ...pulumi.ResourceOption) (*DistributionConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Distributions == nil {
		return nil, errors.New("invalid value for required argument 'Distributions'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DistributionConfiguration
	err := ctx.RegisterResource("aws:imagebuilder/distributionConfiguration:DistributionConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDistributionConfiguration gets an existing DistributionConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDistributionConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DistributionConfigurationState, opts ...pulumi.ResourceOption) (*DistributionConfiguration, error) {
	var resource DistributionConfiguration
	err := ctx.ReadResource("aws:imagebuilder/distributionConfiguration:DistributionConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DistributionConfiguration resources.
type distributionConfigurationState struct {
	// (Required) Amazon Resource Name (ARN) of the distribution configuration.
	Arn *string `pulumi:"arn"`
	// Date the distribution configuration was created.
	DateCreated *string `pulumi:"dateCreated"`
	// Date the distribution configuration was updated.
	DateUpdated *string `pulumi:"dateUpdated"`
	// Description of the distribution configuration.
	Description *string `pulumi:"description"`
	// One or more configuration blocks with distribution settings. Detailed below.
	//
	// The following arguments are optional:
	Distributions []DistributionConfigurationDistribution `pulumi:"distributions"`
	// Name of the distribution configuration.
	Name *string `pulumi:"name"`
	// Key-value map of resource tags for the distribution configuration. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type DistributionConfigurationState struct {
	// (Required) Amazon Resource Name (ARN) of the distribution configuration.
	Arn pulumi.StringPtrInput
	// Date the distribution configuration was created.
	DateCreated pulumi.StringPtrInput
	// Date the distribution configuration was updated.
	DateUpdated pulumi.StringPtrInput
	// Description of the distribution configuration.
	Description pulumi.StringPtrInput
	// One or more configuration blocks with distribution settings. Detailed below.
	//
	// The following arguments are optional:
	Distributions DistributionConfigurationDistributionArrayInput
	// Name of the distribution configuration.
	Name pulumi.StringPtrInput
	// Key-value map of resource tags for the distribution configuration. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (DistributionConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*distributionConfigurationState)(nil)).Elem()
}

type distributionConfigurationArgs struct {
	// Description of the distribution configuration.
	Description *string `pulumi:"description"`
	// One or more configuration blocks with distribution settings. Detailed below.
	//
	// The following arguments are optional:
	Distributions []DistributionConfigurationDistribution `pulumi:"distributions"`
	// Name of the distribution configuration.
	Name *string `pulumi:"name"`
	// Key-value map of resource tags for the distribution configuration. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a DistributionConfiguration resource.
type DistributionConfigurationArgs struct {
	// Description of the distribution configuration.
	Description pulumi.StringPtrInput
	// One or more configuration blocks with distribution settings. Detailed below.
	//
	// The following arguments are optional:
	Distributions DistributionConfigurationDistributionArrayInput
	// Name of the distribution configuration.
	Name pulumi.StringPtrInput
	// Key-value map of resource tags for the distribution configuration. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (DistributionConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*distributionConfigurationArgs)(nil)).Elem()
}

type DistributionConfigurationInput interface {
	pulumi.Input

	ToDistributionConfigurationOutput() DistributionConfigurationOutput
	ToDistributionConfigurationOutputWithContext(ctx context.Context) DistributionConfigurationOutput
}

func (*DistributionConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**DistributionConfiguration)(nil)).Elem()
}

func (i *DistributionConfiguration) ToDistributionConfigurationOutput() DistributionConfigurationOutput {
	return i.ToDistributionConfigurationOutputWithContext(context.Background())
}

func (i *DistributionConfiguration) ToDistributionConfigurationOutputWithContext(ctx context.Context) DistributionConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DistributionConfigurationOutput)
}

// DistributionConfigurationArrayInput is an input type that accepts DistributionConfigurationArray and DistributionConfigurationArrayOutput values.
// You can construct a concrete instance of `DistributionConfigurationArrayInput` via:
//
//	DistributionConfigurationArray{ DistributionConfigurationArgs{...} }
type DistributionConfigurationArrayInput interface {
	pulumi.Input

	ToDistributionConfigurationArrayOutput() DistributionConfigurationArrayOutput
	ToDistributionConfigurationArrayOutputWithContext(context.Context) DistributionConfigurationArrayOutput
}

type DistributionConfigurationArray []DistributionConfigurationInput

func (DistributionConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DistributionConfiguration)(nil)).Elem()
}

func (i DistributionConfigurationArray) ToDistributionConfigurationArrayOutput() DistributionConfigurationArrayOutput {
	return i.ToDistributionConfigurationArrayOutputWithContext(context.Background())
}

func (i DistributionConfigurationArray) ToDistributionConfigurationArrayOutputWithContext(ctx context.Context) DistributionConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DistributionConfigurationArrayOutput)
}

// DistributionConfigurationMapInput is an input type that accepts DistributionConfigurationMap and DistributionConfigurationMapOutput values.
// You can construct a concrete instance of `DistributionConfigurationMapInput` via:
//
//	DistributionConfigurationMap{ "key": DistributionConfigurationArgs{...} }
type DistributionConfigurationMapInput interface {
	pulumi.Input

	ToDistributionConfigurationMapOutput() DistributionConfigurationMapOutput
	ToDistributionConfigurationMapOutputWithContext(context.Context) DistributionConfigurationMapOutput
}

type DistributionConfigurationMap map[string]DistributionConfigurationInput

func (DistributionConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DistributionConfiguration)(nil)).Elem()
}

func (i DistributionConfigurationMap) ToDistributionConfigurationMapOutput() DistributionConfigurationMapOutput {
	return i.ToDistributionConfigurationMapOutputWithContext(context.Background())
}

func (i DistributionConfigurationMap) ToDistributionConfigurationMapOutputWithContext(ctx context.Context) DistributionConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DistributionConfigurationMapOutput)
}

type DistributionConfigurationOutput struct{ *pulumi.OutputState }

func (DistributionConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DistributionConfiguration)(nil)).Elem()
}

func (o DistributionConfigurationOutput) ToDistributionConfigurationOutput() DistributionConfigurationOutput {
	return o
}

func (o DistributionConfigurationOutput) ToDistributionConfigurationOutputWithContext(ctx context.Context) DistributionConfigurationOutput {
	return o
}

// (Required) Amazon Resource Name (ARN) of the distribution configuration.
func (o DistributionConfigurationOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *DistributionConfiguration) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Date the distribution configuration was created.
func (o DistributionConfigurationOutput) DateCreated() pulumi.StringOutput {
	return o.ApplyT(func(v *DistributionConfiguration) pulumi.StringOutput { return v.DateCreated }).(pulumi.StringOutput)
}

// Date the distribution configuration was updated.
func (o DistributionConfigurationOutput) DateUpdated() pulumi.StringOutput {
	return o.ApplyT(func(v *DistributionConfiguration) pulumi.StringOutput { return v.DateUpdated }).(pulumi.StringOutput)
}

// Description of the distribution configuration.
func (o DistributionConfigurationOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DistributionConfiguration) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// One or more configuration blocks with distribution settings. Detailed below.
//
// The following arguments are optional:
func (o DistributionConfigurationOutput) Distributions() DistributionConfigurationDistributionArrayOutput {
	return o.ApplyT(func(v *DistributionConfiguration) DistributionConfigurationDistributionArrayOutput {
		return v.Distributions
	}).(DistributionConfigurationDistributionArrayOutput)
}

// Name of the distribution configuration.
func (o DistributionConfigurationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DistributionConfiguration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Key-value map of resource tags for the distribution configuration. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o DistributionConfigurationOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *DistributionConfiguration) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o DistributionConfigurationOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *DistributionConfiguration) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type DistributionConfigurationArrayOutput struct{ *pulumi.OutputState }

func (DistributionConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DistributionConfiguration)(nil)).Elem()
}

func (o DistributionConfigurationArrayOutput) ToDistributionConfigurationArrayOutput() DistributionConfigurationArrayOutput {
	return o
}

func (o DistributionConfigurationArrayOutput) ToDistributionConfigurationArrayOutputWithContext(ctx context.Context) DistributionConfigurationArrayOutput {
	return o
}

func (o DistributionConfigurationArrayOutput) Index(i pulumi.IntInput) DistributionConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DistributionConfiguration {
		return vs[0].([]*DistributionConfiguration)[vs[1].(int)]
	}).(DistributionConfigurationOutput)
}

type DistributionConfigurationMapOutput struct{ *pulumi.OutputState }

func (DistributionConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DistributionConfiguration)(nil)).Elem()
}

func (o DistributionConfigurationMapOutput) ToDistributionConfigurationMapOutput() DistributionConfigurationMapOutput {
	return o
}

func (o DistributionConfigurationMapOutput) ToDistributionConfigurationMapOutputWithContext(ctx context.Context) DistributionConfigurationMapOutput {
	return o
}

func (o DistributionConfigurationMapOutput) MapIndex(k pulumi.StringInput) DistributionConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DistributionConfiguration {
		return vs[0].(map[string]*DistributionConfiguration)[vs[1].(string)]
	}).(DistributionConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DistributionConfigurationInput)(nil)).Elem(), &DistributionConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*DistributionConfigurationArrayInput)(nil)).Elem(), DistributionConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DistributionConfigurationMapInput)(nil)).Elem(), DistributionConfigurationMap{})
	pulumi.RegisterOutputType(DistributionConfigurationOutput{})
	pulumi.RegisterOutputType(DistributionConfigurationArrayOutput{})
	pulumi.RegisterOutputType(DistributionConfigurationMapOutput{})
}
