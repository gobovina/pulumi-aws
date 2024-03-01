// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package codecatalyst

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS CodeCatalyst Source Repository.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/codecatalyst"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := codecatalyst.NewSourceRepository(ctx, "example", &codecatalyst.SourceRepositoryArgs{
//				Name:        pulumi.String("example-repo"),
//				ProjectName: pulumi.String("example-project"),
//				SpaceName:   pulumi.String("example-space"),
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
// Using `pulumi import`, import CodeCatalyst Source Repository using the `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:codecatalyst/sourceRepository:SourceRepository example example-repo
//
// ```
type SourceRepository struct {
	pulumi.CustomResourceState

	// The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the source repository. For more information about name requirements, see [Quotas for source repositories](https://docs.aws.amazon.com/codecatalyst/latest/userguide/source-quotas.html).
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the project in the CodeCatalyst space.
	//
	// The following arguments are optional:
	ProjectName pulumi.StringOutput `pulumi:"projectName"`
	// The name of the CodeCatalyst space.
	SpaceName pulumi.StringOutput `pulumi:"spaceName"`
}

// NewSourceRepository registers a new resource with the given unique name, arguments, and options.
func NewSourceRepository(ctx *pulumi.Context,
	name string, args *SourceRepositoryArgs, opts ...pulumi.ResourceOption) (*SourceRepository, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectName == nil {
		return nil, errors.New("invalid value for required argument 'ProjectName'")
	}
	if args.SpaceName == nil {
		return nil, errors.New("invalid value for required argument 'SpaceName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SourceRepository
	err := ctx.RegisterResource("aws:codecatalyst/sourceRepository:SourceRepository", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSourceRepository gets an existing SourceRepository resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSourceRepository(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SourceRepositoryState, opts ...pulumi.ResourceOption) (*SourceRepository, error) {
	var resource SourceRepository
	err := ctx.ReadResource("aws:codecatalyst/sourceRepository:SourceRepository", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SourceRepository resources.
type sourceRepositoryState struct {
	// The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
	Description *string `pulumi:"description"`
	// The name of the source repository. For more information about name requirements, see [Quotas for source repositories](https://docs.aws.amazon.com/codecatalyst/latest/userguide/source-quotas.html).
	Name *string `pulumi:"name"`
	// The name of the project in the CodeCatalyst space.
	//
	// The following arguments are optional:
	ProjectName *string `pulumi:"projectName"`
	// The name of the CodeCatalyst space.
	SpaceName *string `pulumi:"spaceName"`
}

type SourceRepositoryState struct {
	// The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
	Description pulumi.StringPtrInput
	// The name of the source repository. For more information about name requirements, see [Quotas for source repositories](https://docs.aws.amazon.com/codecatalyst/latest/userguide/source-quotas.html).
	Name pulumi.StringPtrInput
	// The name of the project in the CodeCatalyst space.
	//
	// The following arguments are optional:
	ProjectName pulumi.StringPtrInput
	// The name of the CodeCatalyst space.
	SpaceName pulumi.StringPtrInput
}

func (SourceRepositoryState) ElementType() reflect.Type {
	return reflect.TypeOf((*sourceRepositoryState)(nil)).Elem()
}

type sourceRepositoryArgs struct {
	// The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
	Description *string `pulumi:"description"`
	// The name of the source repository. For more information about name requirements, see [Quotas for source repositories](https://docs.aws.amazon.com/codecatalyst/latest/userguide/source-quotas.html).
	Name *string `pulumi:"name"`
	// The name of the project in the CodeCatalyst space.
	//
	// The following arguments are optional:
	ProjectName string `pulumi:"projectName"`
	// The name of the CodeCatalyst space.
	SpaceName string `pulumi:"spaceName"`
}

// The set of arguments for constructing a SourceRepository resource.
type SourceRepositoryArgs struct {
	// The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
	Description pulumi.StringPtrInput
	// The name of the source repository. For more information about name requirements, see [Quotas for source repositories](https://docs.aws.amazon.com/codecatalyst/latest/userguide/source-quotas.html).
	Name pulumi.StringPtrInput
	// The name of the project in the CodeCatalyst space.
	//
	// The following arguments are optional:
	ProjectName pulumi.StringInput
	// The name of the CodeCatalyst space.
	SpaceName pulumi.StringInput
}

func (SourceRepositoryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sourceRepositoryArgs)(nil)).Elem()
}

type SourceRepositoryInput interface {
	pulumi.Input

	ToSourceRepositoryOutput() SourceRepositoryOutput
	ToSourceRepositoryOutputWithContext(ctx context.Context) SourceRepositoryOutput
}

func (*SourceRepository) ElementType() reflect.Type {
	return reflect.TypeOf((**SourceRepository)(nil)).Elem()
}

func (i *SourceRepository) ToSourceRepositoryOutput() SourceRepositoryOutput {
	return i.ToSourceRepositoryOutputWithContext(context.Background())
}

func (i *SourceRepository) ToSourceRepositoryOutputWithContext(ctx context.Context) SourceRepositoryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SourceRepositoryOutput)
}

// SourceRepositoryArrayInput is an input type that accepts SourceRepositoryArray and SourceRepositoryArrayOutput values.
// You can construct a concrete instance of `SourceRepositoryArrayInput` via:
//
//	SourceRepositoryArray{ SourceRepositoryArgs{...} }
type SourceRepositoryArrayInput interface {
	pulumi.Input

	ToSourceRepositoryArrayOutput() SourceRepositoryArrayOutput
	ToSourceRepositoryArrayOutputWithContext(context.Context) SourceRepositoryArrayOutput
}

type SourceRepositoryArray []SourceRepositoryInput

func (SourceRepositoryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SourceRepository)(nil)).Elem()
}

func (i SourceRepositoryArray) ToSourceRepositoryArrayOutput() SourceRepositoryArrayOutput {
	return i.ToSourceRepositoryArrayOutputWithContext(context.Background())
}

func (i SourceRepositoryArray) ToSourceRepositoryArrayOutputWithContext(ctx context.Context) SourceRepositoryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SourceRepositoryArrayOutput)
}

// SourceRepositoryMapInput is an input type that accepts SourceRepositoryMap and SourceRepositoryMapOutput values.
// You can construct a concrete instance of `SourceRepositoryMapInput` via:
//
//	SourceRepositoryMap{ "key": SourceRepositoryArgs{...} }
type SourceRepositoryMapInput interface {
	pulumi.Input

	ToSourceRepositoryMapOutput() SourceRepositoryMapOutput
	ToSourceRepositoryMapOutputWithContext(context.Context) SourceRepositoryMapOutput
}

type SourceRepositoryMap map[string]SourceRepositoryInput

func (SourceRepositoryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SourceRepository)(nil)).Elem()
}

func (i SourceRepositoryMap) ToSourceRepositoryMapOutput() SourceRepositoryMapOutput {
	return i.ToSourceRepositoryMapOutputWithContext(context.Background())
}

func (i SourceRepositoryMap) ToSourceRepositoryMapOutputWithContext(ctx context.Context) SourceRepositoryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SourceRepositoryMapOutput)
}

type SourceRepositoryOutput struct{ *pulumi.OutputState }

func (SourceRepositoryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SourceRepository)(nil)).Elem()
}

func (o SourceRepositoryOutput) ToSourceRepositoryOutput() SourceRepositoryOutput {
	return o
}

func (o SourceRepositoryOutput) ToSourceRepositoryOutputWithContext(ctx context.Context) SourceRepositoryOutput {
	return o
}

// The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
func (o SourceRepositoryOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SourceRepository) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the source repository. For more information about name requirements, see [Quotas for source repositories](https://docs.aws.amazon.com/codecatalyst/latest/userguide/source-quotas.html).
func (o SourceRepositoryOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SourceRepository) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the project in the CodeCatalyst space.
//
// The following arguments are optional:
func (o SourceRepositoryOutput) ProjectName() pulumi.StringOutput {
	return o.ApplyT(func(v *SourceRepository) pulumi.StringOutput { return v.ProjectName }).(pulumi.StringOutput)
}

// The name of the CodeCatalyst space.
func (o SourceRepositoryOutput) SpaceName() pulumi.StringOutput {
	return o.ApplyT(func(v *SourceRepository) pulumi.StringOutput { return v.SpaceName }).(pulumi.StringOutput)
}

type SourceRepositoryArrayOutput struct{ *pulumi.OutputState }

func (SourceRepositoryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SourceRepository)(nil)).Elem()
}

func (o SourceRepositoryArrayOutput) ToSourceRepositoryArrayOutput() SourceRepositoryArrayOutput {
	return o
}

func (o SourceRepositoryArrayOutput) ToSourceRepositoryArrayOutputWithContext(ctx context.Context) SourceRepositoryArrayOutput {
	return o
}

func (o SourceRepositoryArrayOutput) Index(i pulumi.IntInput) SourceRepositoryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SourceRepository {
		return vs[0].([]*SourceRepository)[vs[1].(int)]
	}).(SourceRepositoryOutput)
}

type SourceRepositoryMapOutput struct{ *pulumi.OutputState }

func (SourceRepositoryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SourceRepository)(nil)).Elem()
}

func (o SourceRepositoryMapOutput) ToSourceRepositoryMapOutput() SourceRepositoryMapOutput {
	return o
}

func (o SourceRepositoryMapOutput) ToSourceRepositoryMapOutputWithContext(ctx context.Context) SourceRepositoryMapOutput {
	return o
}

func (o SourceRepositoryMapOutput) MapIndex(k pulumi.StringInput) SourceRepositoryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SourceRepository {
		return vs[0].(map[string]*SourceRepository)[vs[1].(string)]
	}).(SourceRepositoryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SourceRepositoryInput)(nil)).Elem(), &SourceRepository{})
	pulumi.RegisterInputType(reflect.TypeOf((*SourceRepositoryArrayInput)(nil)).Elem(), SourceRepositoryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SourceRepositoryMapInput)(nil)).Elem(), SourceRepositoryMap{})
	pulumi.RegisterOutputType(SourceRepositoryOutput{})
	pulumi.RegisterOutputType(SourceRepositoryArrayOutput{})
	pulumi.RegisterOutputType(SourceRepositoryMapOutput{})
}
