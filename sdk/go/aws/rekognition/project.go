// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rekognition

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS Rekognition Project.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/rekognition"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rekognition.NewProject(ctx, "example", &rekognition.ProjectArgs{
//				Name:       pulumi.String("example-project"),
//				AutoUpdate: pulumi.String("ENABLED"),
//				Feature:    pulumi.String("CONTENT_MODERATION"),
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
// Using `pulumi import`, import Rekognition Project using the `name`. For example:
//
// ```sh
//
//	$ pulumi import aws:rekognition/project:Project example project-id-12345678
//
// ```
type Project struct {
	pulumi.CustomResourceState

	// ARN of the Project.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Specify if automatic retraining should occur. Valid values are `ENABLED` or `DISABLED`. Defaults to `DISABLED`
	AutoUpdate pulumi.StringOutput `pulumi:"autoUpdate"`
	// Specify the feature being customized. Valid values are `CONTENT_MODERATION` or `CUSTOM_LABELS`. Defaults to `CUSTOM_LABELS`
	Feature pulumi.StringPtrOutput `pulumi:"feature"`
	// Desired name of the project
	//
	// The following arguments are optional:
	Name     pulumi.StringOutput      `pulumi:"name"`
	Timeouts ProjectTimeoutsPtrOutput `pulumi:"timeouts"`
}

// NewProject registers a new resource with the given unique name, arguments, and options.
func NewProject(ctx *pulumi.Context,
	name string, args *ProjectArgs, opts ...pulumi.ResourceOption) (*Project, error) {
	if args == nil {
		args = &ProjectArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Project
	err := ctx.RegisterResource("aws:rekognition/project:Project", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProject gets an existing Project resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectState, opts ...pulumi.ResourceOption) (*Project, error) {
	var resource Project
	err := ctx.ReadResource("aws:rekognition/project:Project", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Project resources.
type projectState struct {
	// ARN of the Project.
	Arn *string `pulumi:"arn"`
	// Specify if automatic retraining should occur. Valid values are `ENABLED` or `DISABLED`. Defaults to `DISABLED`
	AutoUpdate *string `pulumi:"autoUpdate"`
	// Specify the feature being customized. Valid values are `CONTENT_MODERATION` or `CUSTOM_LABELS`. Defaults to `CUSTOM_LABELS`
	Feature *string `pulumi:"feature"`
	// Desired name of the project
	//
	// The following arguments are optional:
	Name     *string          `pulumi:"name"`
	Timeouts *ProjectTimeouts `pulumi:"timeouts"`
}

type ProjectState struct {
	// ARN of the Project.
	Arn pulumi.StringPtrInput
	// Specify if automatic retraining should occur. Valid values are `ENABLED` or `DISABLED`. Defaults to `DISABLED`
	AutoUpdate pulumi.StringPtrInput
	// Specify the feature being customized. Valid values are `CONTENT_MODERATION` or `CUSTOM_LABELS`. Defaults to `CUSTOM_LABELS`
	Feature pulumi.StringPtrInput
	// Desired name of the project
	//
	// The following arguments are optional:
	Name     pulumi.StringPtrInput
	Timeouts ProjectTimeoutsPtrInput
}

func (ProjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectState)(nil)).Elem()
}

type projectArgs struct {
	// Specify if automatic retraining should occur. Valid values are `ENABLED` or `DISABLED`. Defaults to `DISABLED`
	AutoUpdate *string `pulumi:"autoUpdate"`
	// Specify the feature being customized. Valid values are `CONTENT_MODERATION` or `CUSTOM_LABELS`. Defaults to `CUSTOM_LABELS`
	Feature *string `pulumi:"feature"`
	// Desired name of the project
	//
	// The following arguments are optional:
	Name     *string          `pulumi:"name"`
	Timeouts *ProjectTimeouts `pulumi:"timeouts"`
}

// The set of arguments for constructing a Project resource.
type ProjectArgs struct {
	// Specify if automatic retraining should occur. Valid values are `ENABLED` or `DISABLED`. Defaults to `DISABLED`
	AutoUpdate pulumi.StringPtrInput
	// Specify the feature being customized. Valid values are `CONTENT_MODERATION` or `CUSTOM_LABELS`. Defaults to `CUSTOM_LABELS`
	Feature pulumi.StringPtrInput
	// Desired name of the project
	//
	// The following arguments are optional:
	Name     pulumi.StringPtrInput
	Timeouts ProjectTimeoutsPtrInput
}

func (ProjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectArgs)(nil)).Elem()
}

type ProjectInput interface {
	pulumi.Input

	ToProjectOutput() ProjectOutput
	ToProjectOutputWithContext(ctx context.Context) ProjectOutput
}

func (*Project) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (i *Project) ToProjectOutput() ProjectOutput {
	return i.ToProjectOutputWithContext(context.Background())
}

func (i *Project) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectOutput)
}

// ProjectArrayInput is an input type that accepts ProjectArray and ProjectArrayOutput values.
// You can construct a concrete instance of `ProjectArrayInput` via:
//
//	ProjectArray{ ProjectArgs{...} }
type ProjectArrayInput interface {
	pulumi.Input

	ToProjectArrayOutput() ProjectArrayOutput
	ToProjectArrayOutputWithContext(context.Context) ProjectArrayOutput
}

type ProjectArray []ProjectInput

func (ProjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (i ProjectArray) ToProjectArrayOutput() ProjectArrayOutput {
	return i.ToProjectArrayOutputWithContext(context.Background())
}

func (i ProjectArray) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectArrayOutput)
}

// ProjectMapInput is an input type that accepts ProjectMap and ProjectMapOutput values.
// You can construct a concrete instance of `ProjectMapInput` via:
//
//	ProjectMap{ "key": ProjectArgs{...} }
type ProjectMapInput interface {
	pulumi.Input

	ToProjectMapOutput() ProjectMapOutput
	ToProjectMapOutputWithContext(context.Context) ProjectMapOutput
}

type ProjectMap map[string]ProjectInput

func (ProjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (i ProjectMap) ToProjectMapOutput() ProjectMapOutput {
	return i.ToProjectMapOutputWithContext(context.Background())
}

func (i ProjectMap) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectMapOutput)
}

type ProjectOutput struct{ *pulumi.OutputState }

func (ProjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Project)(nil)).Elem()
}

func (o ProjectOutput) ToProjectOutput() ProjectOutput {
	return o
}

func (o ProjectOutput) ToProjectOutputWithContext(ctx context.Context) ProjectOutput {
	return o
}

// ARN of the Project.
func (o ProjectOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Specify if automatic retraining should occur. Valid values are `ENABLED` or `DISABLED`. Defaults to `DISABLED`
func (o ProjectOutput) AutoUpdate() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.AutoUpdate }).(pulumi.StringOutput)
}

// Specify the feature being customized. Valid values are `CONTENT_MODERATION` or `CUSTOM_LABELS`. Defaults to `CUSTOM_LABELS`
func (o ProjectOutput) Feature() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Project) pulumi.StringPtrOutput { return v.Feature }).(pulumi.StringPtrOutput)
}

// Desired name of the project
//
// The following arguments are optional:
func (o ProjectOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Project) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o ProjectOutput) Timeouts() ProjectTimeoutsPtrOutput {
	return o.ApplyT(func(v *Project) ProjectTimeoutsPtrOutput { return v.Timeouts }).(ProjectTimeoutsPtrOutput)
}

type ProjectArrayOutput struct{ *pulumi.OutputState }

func (ProjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Project)(nil)).Elem()
}

func (o ProjectArrayOutput) ToProjectArrayOutput() ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) ToProjectArrayOutputWithContext(ctx context.Context) ProjectArrayOutput {
	return o
}

func (o ProjectArrayOutput) Index(i pulumi.IntInput) ProjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Project {
		return vs[0].([]*Project)[vs[1].(int)]
	}).(ProjectOutput)
}

type ProjectMapOutput struct{ *pulumi.OutputState }

func (ProjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Project)(nil)).Elem()
}

func (o ProjectMapOutput) ToProjectMapOutput() ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) ToProjectMapOutputWithContext(ctx context.Context) ProjectMapOutput {
	return o
}

func (o ProjectMapOutput) MapIndex(k pulumi.StringInput) ProjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Project {
		return vs[0].(map[string]*Project)[vs[1].(string)]
	}).(ProjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectInput)(nil)).Elem(), &Project{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectArrayInput)(nil)).Elem(), ProjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectMapInput)(nil)).Elem(), ProjectMap{})
	pulumi.RegisterOutputType(ProjectOutput{})
	pulumi.RegisterOutputType(ProjectArrayOutput{})
	pulumi.RegisterOutputType(ProjectMapOutput{})
}
