// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package licensemanager

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a License Manager association.
//
// > **Note:** License configurations can also be associated with launch templates by specifying the `licenseSpecifications` block for an `ec2.LaunchTemplate`.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/licensemanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := ec2.LookupAmi(ctx, &ec2.LookupAmiArgs{
//				MostRecent: pulumi.BoolRef(true),
//				Owners: []string{
//					"amazon",
//				},
//				Filters: []ec2.GetAmiFilter{
//					{
//						Name: "name",
//						Values: []string{
//							"amzn-ami-vpc-nat*",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleInstance, err := ec2.NewInstance(ctx, "example", &ec2.InstanceArgs{
//				Ami:          *pulumi.String(example.Id),
//				InstanceType: pulumi.String("t2.micro"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleLicenseConfiguration, err := licensemanager.NewLicenseConfiguration(ctx, "example", &licensemanager.LicenseConfigurationArgs{
//				Name:                pulumi.String("Example"),
//				LicenseCountingType: pulumi.String("Instance"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = licensemanager.NewAssociation(ctx, "example", &licensemanager.AssociationArgs{
//				LicenseConfigurationArn: exampleLicenseConfiguration.Arn,
//				ResourceArn:             exampleInstance.Arn,
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
// Using `pulumi import`, import license configurations using `resource_arn,license_configuration_arn`. For example:
//
// ```sh
//
//	$ pulumi import aws:licensemanager/association:Association example arn:aws:ec2:eu-west-1:123456789012:image/ami-123456789abcdef01,arn:aws:license-manager:eu-west-1:123456789012:license-configuration:lic-0123456789abcdef0123456789abcdef
//
// ```
type Association struct {
	pulumi.CustomResourceState

	// ARN of the license configuration.
	LicenseConfigurationArn pulumi.StringOutput `pulumi:"licenseConfigurationArn"`
	// ARN of the resource associated with the license configuration.
	ResourceArn pulumi.StringOutput `pulumi:"resourceArn"`
}

// NewAssociation registers a new resource with the given unique name, arguments, and options.
func NewAssociation(ctx *pulumi.Context,
	name string, args *AssociationArgs, opts ...pulumi.ResourceOption) (*Association, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LicenseConfigurationArn == nil {
		return nil, errors.New("invalid value for required argument 'LicenseConfigurationArn'")
	}
	if args.ResourceArn == nil {
		return nil, errors.New("invalid value for required argument 'ResourceArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Association
	err := ctx.RegisterResource("aws:licensemanager/association:Association", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAssociation gets an existing Association resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AssociationState, opts ...pulumi.ResourceOption) (*Association, error) {
	var resource Association
	err := ctx.ReadResource("aws:licensemanager/association:Association", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Association resources.
type associationState struct {
	// ARN of the license configuration.
	LicenseConfigurationArn *string `pulumi:"licenseConfigurationArn"`
	// ARN of the resource associated with the license configuration.
	ResourceArn *string `pulumi:"resourceArn"`
}

type AssociationState struct {
	// ARN of the license configuration.
	LicenseConfigurationArn pulumi.StringPtrInput
	// ARN of the resource associated with the license configuration.
	ResourceArn pulumi.StringPtrInput
}

func (AssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*associationState)(nil)).Elem()
}

type associationArgs struct {
	// ARN of the license configuration.
	LicenseConfigurationArn string `pulumi:"licenseConfigurationArn"`
	// ARN of the resource associated with the license configuration.
	ResourceArn string `pulumi:"resourceArn"`
}

// The set of arguments for constructing a Association resource.
type AssociationArgs struct {
	// ARN of the license configuration.
	LicenseConfigurationArn pulumi.StringInput
	// ARN of the resource associated with the license configuration.
	ResourceArn pulumi.StringInput
}

func (AssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*associationArgs)(nil)).Elem()
}

type AssociationInput interface {
	pulumi.Input

	ToAssociationOutput() AssociationOutput
	ToAssociationOutputWithContext(ctx context.Context) AssociationOutput
}

func (*Association) ElementType() reflect.Type {
	return reflect.TypeOf((**Association)(nil)).Elem()
}

func (i *Association) ToAssociationOutput() AssociationOutput {
	return i.ToAssociationOutputWithContext(context.Background())
}

func (i *Association) ToAssociationOutputWithContext(ctx context.Context) AssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssociationOutput)
}

// AssociationArrayInput is an input type that accepts AssociationArray and AssociationArrayOutput values.
// You can construct a concrete instance of `AssociationArrayInput` via:
//
//	AssociationArray{ AssociationArgs{...} }
type AssociationArrayInput interface {
	pulumi.Input

	ToAssociationArrayOutput() AssociationArrayOutput
	ToAssociationArrayOutputWithContext(context.Context) AssociationArrayOutput
}

type AssociationArray []AssociationInput

func (AssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Association)(nil)).Elem()
}

func (i AssociationArray) ToAssociationArrayOutput() AssociationArrayOutput {
	return i.ToAssociationArrayOutputWithContext(context.Background())
}

func (i AssociationArray) ToAssociationArrayOutputWithContext(ctx context.Context) AssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssociationArrayOutput)
}

// AssociationMapInput is an input type that accepts AssociationMap and AssociationMapOutput values.
// You can construct a concrete instance of `AssociationMapInput` via:
//
//	AssociationMap{ "key": AssociationArgs{...} }
type AssociationMapInput interface {
	pulumi.Input

	ToAssociationMapOutput() AssociationMapOutput
	ToAssociationMapOutputWithContext(context.Context) AssociationMapOutput
}

type AssociationMap map[string]AssociationInput

func (AssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Association)(nil)).Elem()
}

func (i AssociationMap) ToAssociationMapOutput() AssociationMapOutput {
	return i.ToAssociationMapOutputWithContext(context.Background())
}

func (i AssociationMap) ToAssociationMapOutputWithContext(ctx context.Context) AssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AssociationMapOutput)
}

type AssociationOutput struct{ *pulumi.OutputState }

func (AssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Association)(nil)).Elem()
}

func (o AssociationOutput) ToAssociationOutput() AssociationOutput {
	return o
}

func (o AssociationOutput) ToAssociationOutputWithContext(ctx context.Context) AssociationOutput {
	return o
}

// ARN of the license configuration.
func (o AssociationOutput) LicenseConfigurationArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Association) pulumi.StringOutput { return v.LicenseConfigurationArn }).(pulumi.StringOutput)
}

// ARN of the resource associated with the license configuration.
func (o AssociationOutput) ResourceArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Association) pulumi.StringOutput { return v.ResourceArn }).(pulumi.StringOutput)
}

type AssociationArrayOutput struct{ *pulumi.OutputState }

func (AssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Association)(nil)).Elem()
}

func (o AssociationArrayOutput) ToAssociationArrayOutput() AssociationArrayOutput {
	return o
}

func (o AssociationArrayOutput) ToAssociationArrayOutputWithContext(ctx context.Context) AssociationArrayOutput {
	return o
}

func (o AssociationArrayOutput) Index(i pulumi.IntInput) AssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Association {
		return vs[0].([]*Association)[vs[1].(int)]
	}).(AssociationOutput)
}

type AssociationMapOutput struct{ *pulumi.OutputState }

func (AssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Association)(nil)).Elem()
}

func (o AssociationMapOutput) ToAssociationMapOutput() AssociationMapOutput {
	return o
}

func (o AssociationMapOutput) ToAssociationMapOutputWithContext(ctx context.Context) AssociationMapOutput {
	return o
}

func (o AssociationMapOutput) MapIndex(k pulumi.StringInput) AssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Association {
		return vs[0].(map[string]*Association)[vs[1].(string)]
	}).(AssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AssociationInput)(nil)).Elem(), &Association{})
	pulumi.RegisterInputType(reflect.TypeOf((*AssociationArrayInput)(nil)).Elem(), AssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AssociationMapInput)(nil)).Elem(), AssociationMap{})
	pulumi.RegisterOutputType(AssociationOutput{})
	pulumi.RegisterOutputType(AssociationArrayOutput{})
	pulumi.RegisterOutputType(AssociationMapOutput{})
}
