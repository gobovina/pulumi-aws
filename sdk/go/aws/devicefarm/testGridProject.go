// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package devicefarm

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage AWS Device Farm Test Grid Projects.
//
// > **NOTE:** AWS currently has limited regional support for Device Farm (e.g., `us-west-2`). See [AWS Device Farm endpoints and quotas](https://docs.aws.amazon.com/general/latest/gr/devicefarm.html) for information on supported regions.
//
// ## Import
//
// Using `pulumi import`, import DeviceFarm Test Grid Projects using their ARN. For example:
//
// ```sh
//
//	$ pulumi import aws:devicefarm/testGridProject:TestGridProject example arn:aws:devicefarm:us-west-2:123456789012:testgrid-project:4fa784c7-ccb4-4dbf-ba4f-02198320daa1
//
// ```
type TestGridProject struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name of this Test Grid Project.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Human-readable description of the project.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the Selenium testing project.
	Name pulumi.StringOutput `pulumi:"name"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The VPC security groups and subnets that are attached to a project. See VPC Config below.
	VpcConfig TestGridProjectVpcConfigPtrOutput `pulumi:"vpcConfig"`
}

// NewTestGridProject registers a new resource with the given unique name, arguments, and options.
func NewTestGridProject(ctx *pulumi.Context,
	name string, args *TestGridProjectArgs, opts ...pulumi.ResourceOption) (*TestGridProject, error) {
	if args == nil {
		args = &TestGridProjectArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TestGridProject
	err := ctx.RegisterResource("aws:devicefarm/testGridProject:TestGridProject", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTestGridProject gets an existing TestGridProject resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTestGridProject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TestGridProjectState, opts ...pulumi.ResourceOption) (*TestGridProject, error) {
	var resource TestGridProject
	err := ctx.ReadResource("aws:devicefarm/testGridProject:TestGridProject", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TestGridProject resources.
type testGridProjectState struct {
	// The Amazon Resource Name of this Test Grid Project.
	Arn *string `pulumi:"arn"`
	// Human-readable description of the project.
	Description *string `pulumi:"description"`
	// The name of the Selenium testing project.
	Name *string `pulumi:"name"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The VPC security groups and subnets that are attached to a project. See VPC Config below.
	VpcConfig *TestGridProjectVpcConfig `pulumi:"vpcConfig"`
}

type TestGridProjectState struct {
	// The Amazon Resource Name of this Test Grid Project.
	Arn pulumi.StringPtrInput
	// Human-readable description of the project.
	Description pulumi.StringPtrInput
	// The name of the Selenium testing project.
	Name pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The VPC security groups and subnets that are attached to a project. See VPC Config below.
	VpcConfig TestGridProjectVpcConfigPtrInput
}

func (TestGridProjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*testGridProjectState)(nil)).Elem()
}

type testGridProjectArgs struct {
	// Human-readable description of the project.
	Description *string `pulumi:"description"`
	// The name of the Selenium testing project.
	Name *string `pulumi:"name"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The VPC security groups and subnets that are attached to a project. See VPC Config below.
	VpcConfig *TestGridProjectVpcConfig `pulumi:"vpcConfig"`
}

// The set of arguments for constructing a TestGridProject resource.
type TestGridProjectArgs struct {
	// Human-readable description of the project.
	Description pulumi.StringPtrInput
	// The name of the Selenium testing project.
	Name pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The VPC security groups and subnets that are attached to a project. See VPC Config below.
	VpcConfig TestGridProjectVpcConfigPtrInput
}

func (TestGridProjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*testGridProjectArgs)(nil)).Elem()
}

type TestGridProjectInput interface {
	pulumi.Input

	ToTestGridProjectOutput() TestGridProjectOutput
	ToTestGridProjectOutputWithContext(ctx context.Context) TestGridProjectOutput
}

func (*TestGridProject) ElementType() reflect.Type {
	return reflect.TypeOf((**TestGridProject)(nil)).Elem()
}

func (i *TestGridProject) ToTestGridProjectOutput() TestGridProjectOutput {
	return i.ToTestGridProjectOutputWithContext(context.Background())
}

func (i *TestGridProject) ToTestGridProjectOutputWithContext(ctx context.Context) TestGridProjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TestGridProjectOutput)
}

// TestGridProjectArrayInput is an input type that accepts TestGridProjectArray and TestGridProjectArrayOutput values.
// You can construct a concrete instance of `TestGridProjectArrayInput` via:
//
//	TestGridProjectArray{ TestGridProjectArgs{...} }
type TestGridProjectArrayInput interface {
	pulumi.Input

	ToTestGridProjectArrayOutput() TestGridProjectArrayOutput
	ToTestGridProjectArrayOutputWithContext(context.Context) TestGridProjectArrayOutput
}

type TestGridProjectArray []TestGridProjectInput

func (TestGridProjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TestGridProject)(nil)).Elem()
}

func (i TestGridProjectArray) ToTestGridProjectArrayOutput() TestGridProjectArrayOutput {
	return i.ToTestGridProjectArrayOutputWithContext(context.Background())
}

func (i TestGridProjectArray) ToTestGridProjectArrayOutputWithContext(ctx context.Context) TestGridProjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TestGridProjectArrayOutput)
}

// TestGridProjectMapInput is an input type that accepts TestGridProjectMap and TestGridProjectMapOutput values.
// You can construct a concrete instance of `TestGridProjectMapInput` via:
//
//	TestGridProjectMap{ "key": TestGridProjectArgs{...} }
type TestGridProjectMapInput interface {
	pulumi.Input

	ToTestGridProjectMapOutput() TestGridProjectMapOutput
	ToTestGridProjectMapOutputWithContext(context.Context) TestGridProjectMapOutput
}

type TestGridProjectMap map[string]TestGridProjectInput

func (TestGridProjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TestGridProject)(nil)).Elem()
}

func (i TestGridProjectMap) ToTestGridProjectMapOutput() TestGridProjectMapOutput {
	return i.ToTestGridProjectMapOutputWithContext(context.Background())
}

func (i TestGridProjectMap) ToTestGridProjectMapOutputWithContext(ctx context.Context) TestGridProjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TestGridProjectMapOutput)
}

type TestGridProjectOutput struct{ *pulumi.OutputState }

func (TestGridProjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TestGridProject)(nil)).Elem()
}

func (o TestGridProjectOutput) ToTestGridProjectOutput() TestGridProjectOutput {
	return o
}

func (o TestGridProjectOutput) ToTestGridProjectOutputWithContext(ctx context.Context) TestGridProjectOutput {
	return o
}

// The Amazon Resource Name of this Test Grid Project.
func (o TestGridProjectOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *TestGridProject) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Human-readable description of the project.
func (o TestGridProjectOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TestGridProject) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the Selenium testing project.
func (o TestGridProjectOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TestGridProject) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o TestGridProjectOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *TestGridProject) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o TestGridProjectOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *TestGridProject) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The VPC security groups and subnets that are attached to a project. See VPC Config below.
func (o TestGridProjectOutput) VpcConfig() TestGridProjectVpcConfigPtrOutput {
	return o.ApplyT(func(v *TestGridProject) TestGridProjectVpcConfigPtrOutput { return v.VpcConfig }).(TestGridProjectVpcConfigPtrOutput)
}

type TestGridProjectArrayOutput struct{ *pulumi.OutputState }

func (TestGridProjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TestGridProject)(nil)).Elem()
}

func (o TestGridProjectArrayOutput) ToTestGridProjectArrayOutput() TestGridProjectArrayOutput {
	return o
}

func (o TestGridProjectArrayOutput) ToTestGridProjectArrayOutputWithContext(ctx context.Context) TestGridProjectArrayOutput {
	return o
}

func (o TestGridProjectArrayOutput) Index(i pulumi.IntInput) TestGridProjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TestGridProject {
		return vs[0].([]*TestGridProject)[vs[1].(int)]
	}).(TestGridProjectOutput)
}

type TestGridProjectMapOutput struct{ *pulumi.OutputState }

func (TestGridProjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TestGridProject)(nil)).Elem()
}

func (o TestGridProjectMapOutput) ToTestGridProjectMapOutput() TestGridProjectMapOutput {
	return o
}

func (o TestGridProjectMapOutput) ToTestGridProjectMapOutputWithContext(ctx context.Context) TestGridProjectMapOutput {
	return o
}

func (o TestGridProjectMapOutput) MapIndex(k pulumi.StringInput) TestGridProjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TestGridProject {
		return vs[0].(map[string]*TestGridProject)[vs[1].(string)]
	}).(TestGridProjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TestGridProjectInput)(nil)).Elem(), &TestGridProject{})
	pulumi.RegisterInputType(reflect.TypeOf((*TestGridProjectArrayInput)(nil)).Elem(), TestGridProjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TestGridProjectMapInput)(nil)).Elem(), TestGridProjectMap{})
	pulumi.RegisterOutputType(TestGridProjectOutput{})
	pulumi.RegisterOutputType(TestGridProjectArrayOutput{})
	pulumi.RegisterOutputType(TestGridProjectMapOutput{})
}
