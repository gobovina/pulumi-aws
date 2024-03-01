// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ssoadmin

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS SSO Admin Application Assignment Configuration.
//
// By default, applications will require users to have an explicit assignment in order to access an application.
// This resource can be used to adjust this default behavior if necessary.
//
// > Deleting this resource will return the assignment configuration for the application to the default AWS behavior (ie. `assignmentRequired = true`).
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ssoadmin"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ssoadmin.NewApplicationAssignmentConfiguration(ctx, "example", &ssoadmin.ApplicationAssignmentConfigurationArgs{
//				ApplicationArn:     pulumi.Any(exampleAwsSsoadminApplication.ApplicationArn),
//				AssignmentRequired: pulumi.Bool(true),
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
// Using `pulumi import`, import SSO Admin Application Assignment Configuration using the `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:ssoadmin/applicationAssignmentConfiguration:ApplicationAssignmentConfiguration example arn:aws:sso::012345678901:application/id-12345678
//
// ```
type ApplicationAssignmentConfiguration struct {
	pulumi.CustomResourceState

	// ARN of the application.
	ApplicationArn pulumi.StringOutput `pulumi:"applicationArn"`
	// Indicates whether users must have an explicit assignment to access the application. If `false`, all users have access to the application.
	AssignmentRequired pulumi.BoolOutput `pulumi:"assignmentRequired"`
}

// NewApplicationAssignmentConfiguration registers a new resource with the given unique name, arguments, and options.
func NewApplicationAssignmentConfiguration(ctx *pulumi.Context,
	name string, args *ApplicationAssignmentConfigurationArgs, opts ...pulumi.ResourceOption) (*ApplicationAssignmentConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApplicationArn == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationArn'")
	}
	if args.AssignmentRequired == nil {
		return nil, errors.New("invalid value for required argument 'AssignmentRequired'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplicationAssignmentConfiguration
	err := ctx.RegisterResource("aws:ssoadmin/applicationAssignmentConfiguration:ApplicationAssignmentConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplicationAssignmentConfiguration gets an existing ApplicationAssignmentConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplicationAssignmentConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplicationAssignmentConfigurationState, opts ...pulumi.ResourceOption) (*ApplicationAssignmentConfiguration, error) {
	var resource ApplicationAssignmentConfiguration
	err := ctx.ReadResource("aws:ssoadmin/applicationAssignmentConfiguration:ApplicationAssignmentConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplicationAssignmentConfiguration resources.
type applicationAssignmentConfigurationState struct {
	// ARN of the application.
	ApplicationArn *string `pulumi:"applicationArn"`
	// Indicates whether users must have an explicit assignment to access the application. If `false`, all users have access to the application.
	AssignmentRequired *bool `pulumi:"assignmentRequired"`
}

type ApplicationAssignmentConfigurationState struct {
	// ARN of the application.
	ApplicationArn pulumi.StringPtrInput
	// Indicates whether users must have an explicit assignment to access the application. If `false`, all users have access to the application.
	AssignmentRequired pulumi.BoolPtrInput
}

func (ApplicationAssignmentConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationAssignmentConfigurationState)(nil)).Elem()
}

type applicationAssignmentConfigurationArgs struct {
	// ARN of the application.
	ApplicationArn string `pulumi:"applicationArn"`
	// Indicates whether users must have an explicit assignment to access the application. If `false`, all users have access to the application.
	AssignmentRequired bool `pulumi:"assignmentRequired"`
}

// The set of arguments for constructing a ApplicationAssignmentConfiguration resource.
type ApplicationAssignmentConfigurationArgs struct {
	// ARN of the application.
	ApplicationArn pulumi.StringInput
	// Indicates whether users must have an explicit assignment to access the application. If `false`, all users have access to the application.
	AssignmentRequired pulumi.BoolInput
}

func (ApplicationAssignmentConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationAssignmentConfigurationArgs)(nil)).Elem()
}

type ApplicationAssignmentConfigurationInput interface {
	pulumi.Input

	ToApplicationAssignmentConfigurationOutput() ApplicationAssignmentConfigurationOutput
	ToApplicationAssignmentConfigurationOutputWithContext(ctx context.Context) ApplicationAssignmentConfigurationOutput
}

func (*ApplicationAssignmentConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationAssignmentConfiguration)(nil)).Elem()
}

func (i *ApplicationAssignmentConfiguration) ToApplicationAssignmentConfigurationOutput() ApplicationAssignmentConfigurationOutput {
	return i.ToApplicationAssignmentConfigurationOutputWithContext(context.Background())
}

func (i *ApplicationAssignmentConfiguration) ToApplicationAssignmentConfigurationOutputWithContext(ctx context.Context) ApplicationAssignmentConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationAssignmentConfigurationOutput)
}

// ApplicationAssignmentConfigurationArrayInput is an input type that accepts ApplicationAssignmentConfigurationArray and ApplicationAssignmentConfigurationArrayOutput values.
// You can construct a concrete instance of `ApplicationAssignmentConfigurationArrayInput` via:
//
//	ApplicationAssignmentConfigurationArray{ ApplicationAssignmentConfigurationArgs{...} }
type ApplicationAssignmentConfigurationArrayInput interface {
	pulumi.Input

	ToApplicationAssignmentConfigurationArrayOutput() ApplicationAssignmentConfigurationArrayOutput
	ToApplicationAssignmentConfigurationArrayOutputWithContext(context.Context) ApplicationAssignmentConfigurationArrayOutput
}

type ApplicationAssignmentConfigurationArray []ApplicationAssignmentConfigurationInput

func (ApplicationAssignmentConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationAssignmentConfiguration)(nil)).Elem()
}

func (i ApplicationAssignmentConfigurationArray) ToApplicationAssignmentConfigurationArrayOutput() ApplicationAssignmentConfigurationArrayOutput {
	return i.ToApplicationAssignmentConfigurationArrayOutputWithContext(context.Background())
}

func (i ApplicationAssignmentConfigurationArray) ToApplicationAssignmentConfigurationArrayOutputWithContext(ctx context.Context) ApplicationAssignmentConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationAssignmentConfigurationArrayOutput)
}

// ApplicationAssignmentConfigurationMapInput is an input type that accepts ApplicationAssignmentConfigurationMap and ApplicationAssignmentConfigurationMapOutput values.
// You can construct a concrete instance of `ApplicationAssignmentConfigurationMapInput` via:
//
//	ApplicationAssignmentConfigurationMap{ "key": ApplicationAssignmentConfigurationArgs{...} }
type ApplicationAssignmentConfigurationMapInput interface {
	pulumi.Input

	ToApplicationAssignmentConfigurationMapOutput() ApplicationAssignmentConfigurationMapOutput
	ToApplicationAssignmentConfigurationMapOutputWithContext(context.Context) ApplicationAssignmentConfigurationMapOutput
}

type ApplicationAssignmentConfigurationMap map[string]ApplicationAssignmentConfigurationInput

func (ApplicationAssignmentConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationAssignmentConfiguration)(nil)).Elem()
}

func (i ApplicationAssignmentConfigurationMap) ToApplicationAssignmentConfigurationMapOutput() ApplicationAssignmentConfigurationMapOutput {
	return i.ToApplicationAssignmentConfigurationMapOutputWithContext(context.Background())
}

func (i ApplicationAssignmentConfigurationMap) ToApplicationAssignmentConfigurationMapOutputWithContext(ctx context.Context) ApplicationAssignmentConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationAssignmentConfigurationMapOutput)
}

type ApplicationAssignmentConfigurationOutput struct{ *pulumi.OutputState }

func (ApplicationAssignmentConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationAssignmentConfiguration)(nil)).Elem()
}

func (o ApplicationAssignmentConfigurationOutput) ToApplicationAssignmentConfigurationOutput() ApplicationAssignmentConfigurationOutput {
	return o
}

func (o ApplicationAssignmentConfigurationOutput) ToApplicationAssignmentConfigurationOutputWithContext(ctx context.Context) ApplicationAssignmentConfigurationOutput {
	return o
}

// ARN of the application.
func (o ApplicationAssignmentConfigurationOutput) ApplicationArn() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationAssignmentConfiguration) pulumi.StringOutput { return v.ApplicationArn }).(pulumi.StringOutput)
}

// Indicates whether users must have an explicit assignment to access the application. If `false`, all users have access to the application.
func (o ApplicationAssignmentConfigurationOutput) AssignmentRequired() pulumi.BoolOutput {
	return o.ApplyT(func(v *ApplicationAssignmentConfiguration) pulumi.BoolOutput { return v.AssignmentRequired }).(pulumi.BoolOutput)
}

type ApplicationAssignmentConfigurationArrayOutput struct{ *pulumi.OutputState }

func (ApplicationAssignmentConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationAssignmentConfiguration)(nil)).Elem()
}

func (o ApplicationAssignmentConfigurationArrayOutput) ToApplicationAssignmentConfigurationArrayOutput() ApplicationAssignmentConfigurationArrayOutput {
	return o
}

func (o ApplicationAssignmentConfigurationArrayOutput) ToApplicationAssignmentConfigurationArrayOutputWithContext(ctx context.Context) ApplicationAssignmentConfigurationArrayOutput {
	return o
}

func (o ApplicationAssignmentConfigurationArrayOutput) Index(i pulumi.IntInput) ApplicationAssignmentConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplicationAssignmentConfiguration {
		return vs[0].([]*ApplicationAssignmentConfiguration)[vs[1].(int)]
	}).(ApplicationAssignmentConfigurationOutput)
}

type ApplicationAssignmentConfigurationMapOutput struct{ *pulumi.OutputState }

func (ApplicationAssignmentConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationAssignmentConfiguration)(nil)).Elem()
}

func (o ApplicationAssignmentConfigurationMapOutput) ToApplicationAssignmentConfigurationMapOutput() ApplicationAssignmentConfigurationMapOutput {
	return o
}

func (o ApplicationAssignmentConfigurationMapOutput) ToApplicationAssignmentConfigurationMapOutputWithContext(ctx context.Context) ApplicationAssignmentConfigurationMapOutput {
	return o
}

func (o ApplicationAssignmentConfigurationMapOutput) MapIndex(k pulumi.StringInput) ApplicationAssignmentConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplicationAssignmentConfiguration {
		return vs[0].(map[string]*ApplicationAssignmentConfiguration)[vs[1].(string)]
	}).(ApplicationAssignmentConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationAssignmentConfigurationInput)(nil)).Elem(), &ApplicationAssignmentConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationAssignmentConfigurationArrayInput)(nil)).Elem(), ApplicationAssignmentConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationAssignmentConfigurationMapInput)(nil)).Elem(), ApplicationAssignmentConfigurationMap{})
	pulumi.RegisterOutputType(ApplicationAssignmentConfigurationOutput{})
	pulumi.RegisterOutputType(ApplicationAssignmentConfigurationArrayOutput{})
	pulumi.RegisterOutputType(ApplicationAssignmentConfigurationMapOutput{})
}
