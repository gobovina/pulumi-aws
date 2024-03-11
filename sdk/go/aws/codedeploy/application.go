// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package codedeploy

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a CodeDeploy application to be used as a basis for deployments
//
// ## Example Usage
//
// ### ECS Application
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/codedeploy"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := codedeploy.NewApplication(ctx, "example", &codedeploy.ApplicationArgs{
//				ComputePlatform: pulumi.String("ECS"),
//				Name:            pulumi.String("example"),
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
// ### Lambda Application
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/codedeploy"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := codedeploy.NewApplication(ctx, "example", &codedeploy.ApplicationArgs{
//				ComputePlatform: pulumi.String("Lambda"),
//				Name:            pulumi.String("example"),
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
// ### Server Application
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/codedeploy"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := codedeploy.NewApplication(ctx, "example", &codedeploy.ApplicationArgs{
//				ComputePlatform: pulumi.String("Server"),
//				Name:            pulumi.String("example"),
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
// Using `pulumi import`, import CodeDeploy Applications using the `name`. For example:
//
// ```sh
// $ pulumi import aws:codedeploy/application:Application example my-application
// ```
type Application struct {
	pulumi.CustomResourceState

	// The application ID.
	ApplicationId pulumi.StringOutput `pulumi:"applicationId"`
	// The ARN of the CodeDeploy application.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The compute platform can either be `ECS`, `Lambda`, or `Server`. Default is `Server`.
	ComputePlatform pulumi.StringPtrOutput `pulumi:"computePlatform"`
	// The name for a connection to a GitHub account.
	GithubAccountName pulumi.StringOutput `pulumi:"githubAccountName"`
	// Whether the user has authenticated with GitHub for the specified application.
	LinkedToGithub pulumi.BoolOutput `pulumi:"linkedToGithub"`
	// The name of the application.
	Name pulumi.StringOutput `pulumi:"name"`
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewApplication registers a new resource with the given unique name, arguments, and options.
func NewApplication(ctx *pulumi.Context,
	name string, args *ApplicationArgs, opts ...pulumi.ResourceOption) (*Application, error) {
	if args == nil {
		args = &ApplicationArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Application
	err := ctx.RegisterResource("aws:codedeploy/application:Application", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplication gets an existing Application resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplication(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplicationState, opts ...pulumi.ResourceOption) (*Application, error) {
	var resource Application
	err := ctx.ReadResource("aws:codedeploy/application:Application", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Application resources.
type applicationState struct {
	// The application ID.
	ApplicationId *string `pulumi:"applicationId"`
	// The ARN of the CodeDeploy application.
	Arn *string `pulumi:"arn"`
	// The compute platform can either be `ECS`, `Lambda`, or `Server`. Default is `Server`.
	ComputePlatform *string `pulumi:"computePlatform"`
	// The name for a connection to a GitHub account.
	GithubAccountName *string `pulumi:"githubAccountName"`
	// Whether the user has authenticated with GitHub for the specified application.
	LinkedToGithub *bool `pulumi:"linkedToGithub"`
	// The name of the application.
	Name *string `pulumi:"name"`
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ApplicationState struct {
	// The application ID.
	ApplicationId pulumi.StringPtrInput
	// The ARN of the CodeDeploy application.
	Arn pulumi.StringPtrInput
	// The compute platform can either be `ECS`, `Lambda`, or `Server`. Default is `Server`.
	ComputePlatform pulumi.StringPtrInput
	// The name for a connection to a GitHub account.
	GithubAccountName pulumi.StringPtrInput
	// Whether the user has authenticated with GitHub for the specified application.
	LinkedToGithub pulumi.BoolPtrInput
	// The name of the application.
	Name pulumi.StringPtrInput
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (ApplicationState) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationState)(nil)).Elem()
}

type applicationArgs struct {
	// The compute platform can either be `ECS`, `Lambda`, or `Server`. Default is `Server`.
	ComputePlatform *string `pulumi:"computePlatform"`
	// The name of the application.
	Name *string `pulumi:"name"`
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Application resource.
type ApplicationArgs struct {
	// The compute platform can either be `ECS`, `Lambda`, or `Server`. Default is `Server`.
	ComputePlatform pulumi.StringPtrInput
	// The name of the application.
	Name pulumi.StringPtrInput
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ApplicationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationArgs)(nil)).Elem()
}

type ApplicationInput interface {
	pulumi.Input

	ToApplicationOutput() ApplicationOutput
	ToApplicationOutputWithContext(ctx context.Context) ApplicationOutput
}

func (*Application) ElementType() reflect.Type {
	return reflect.TypeOf((**Application)(nil)).Elem()
}

func (i *Application) ToApplicationOutput() ApplicationOutput {
	return i.ToApplicationOutputWithContext(context.Background())
}

func (i *Application) ToApplicationOutputWithContext(ctx context.Context) ApplicationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationOutput)
}

// ApplicationArrayInput is an input type that accepts ApplicationArray and ApplicationArrayOutput values.
// You can construct a concrete instance of `ApplicationArrayInput` via:
//
//	ApplicationArray{ ApplicationArgs{...} }
type ApplicationArrayInput interface {
	pulumi.Input

	ToApplicationArrayOutput() ApplicationArrayOutput
	ToApplicationArrayOutputWithContext(context.Context) ApplicationArrayOutput
}

type ApplicationArray []ApplicationInput

func (ApplicationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Application)(nil)).Elem()
}

func (i ApplicationArray) ToApplicationArrayOutput() ApplicationArrayOutput {
	return i.ToApplicationArrayOutputWithContext(context.Background())
}

func (i ApplicationArray) ToApplicationArrayOutputWithContext(ctx context.Context) ApplicationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationArrayOutput)
}

// ApplicationMapInput is an input type that accepts ApplicationMap and ApplicationMapOutput values.
// You can construct a concrete instance of `ApplicationMapInput` via:
//
//	ApplicationMap{ "key": ApplicationArgs{...} }
type ApplicationMapInput interface {
	pulumi.Input

	ToApplicationMapOutput() ApplicationMapOutput
	ToApplicationMapOutputWithContext(context.Context) ApplicationMapOutput
}

type ApplicationMap map[string]ApplicationInput

func (ApplicationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Application)(nil)).Elem()
}

func (i ApplicationMap) ToApplicationMapOutput() ApplicationMapOutput {
	return i.ToApplicationMapOutputWithContext(context.Background())
}

func (i ApplicationMap) ToApplicationMapOutputWithContext(ctx context.Context) ApplicationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationMapOutput)
}

type ApplicationOutput struct{ *pulumi.OutputState }

func (ApplicationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Application)(nil)).Elem()
}

func (o ApplicationOutput) ToApplicationOutput() ApplicationOutput {
	return o
}

func (o ApplicationOutput) ToApplicationOutputWithContext(ctx context.Context) ApplicationOutput {
	return o
}

// The application ID.
func (o ApplicationOutput) ApplicationId() pulumi.StringOutput {
	return o.ApplyT(func(v *Application) pulumi.StringOutput { return v.ApplicationId }).(pulumi.StringOutput)
}

// The ARN of the CodeDeploy application.
func (o ApplicationOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Application) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The compute platform can either be `ECS`, `Lambda`, or `Server`. Default is `Server`.
func (o ApplicationOutput) ComputePlatform() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Application) pulumi.StringPtrOutput { return v.ComputePlatform }).(pulumi.StringPtrOutput)
}

// The name for a connection to a GitHub account.
func (o ApplicationOutput) GithubAccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *Application) pulumi.StringOutput { return v.GithubAccountName }).(pulumi.StringOutput)
}

// Whether the user has authenticated with GitHub for the specified application.
func (o ApplicationOutput) LinkedToGithub() pulumi.BoolOutput {
	return o.ApplyT(func(v *Application) pulumi.BoolOutput { return v.LinkedToGithub }).(pulumi.BoolOutput)
}

// The name of the application.
func (o ApplicationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Application) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ApplicationOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Application) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ApplicationOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Application) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ApplicationArrayOutput struct{ *pulumi.OutputState }

func (ApplicationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Application)(nil)).Elem()
}

func (o ApplicationArrayOutput) ToApplicationArrayOutput() ApplicationArrayOutput {
	return o
}

func (o ApplicationArrayOutput) ToApplicationArrayOutputWithContext(ctx context.Context) ApplicationArrayOutput {
	return o
}

func (o ApplicationArrayOutput) Index(i pulumi.IntInput) ApplicationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Application {
		return vs[0].([]*Application)[vs[1].(int)]
	}).(ApplicationOutput)
}

type ApplicationMapOutput struct{ *pulumi.OutputState }

func (ApplicationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Application)(nil)).Elem()
}

func (o ApplicationMapOutput) ToApplicationMapOutput() ApplicationMapOutput {
	return o
}

func (o ApplicationMapOutput) ToApplicationMapOutputWithContext(ctx context.Context) ApplicationMapOutput {
	return o
}

func (o ApplicationMapOutput) MapIndex(k pulumi.StringInput) ApplicationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Application {
		return vs[0].(map[string]*Application)[vs[1].(string)]
	}).(ApplicationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationInput)(nil)).Elem(), &Application{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationArrayInput)(nil)).Elem(), ApplicationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationMapInput)(nil)).Elem(), ApplicationMap{})
	pulumi.RegisterOutputType(ApplicationOutput{})
	pulumi.RegisterOutputType(ApplicationArrayOutput{})
	pulumi.RegisterOutputType(ApplicationMapOutput{})
}
